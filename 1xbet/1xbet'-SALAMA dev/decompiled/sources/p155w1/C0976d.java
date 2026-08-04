package p155w1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: w1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0976d extends AbstractRunnableC0978d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f17667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f17668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f17670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f17671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f17672f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ HashMap f17673x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f17674y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ long f17675z;

    public C0976d(String str, String str2, int i7, double d7, String str3, String str4, HashMap map, long j, long j3) {
        this.f17667a = str;
        this.f17668b = str2;
        this.f17669c = i7;
        this.f17670d = d7;
        this.f17671e = str3;
        this.f17672f = str4;
        this.f17673x = map;
        this.f17674y = j;
        this.f17675z = j3;
    }

    @Override // p155w1.AbstractRunnableC0978d1
    public final void a() {
        String str = this.f17667a;
        String str2 = this.f17668b;
        int i7 = this.f17669c;
        double d7 = this.f17670d;
        String str3 = this.f17671e;
        String str4 = this.f17672f;
        HashMap map = this.f17673x;
        long j = this.f17674y;
        long j3 = this.f17675z;
        AtomicInteger atomicInteger = Y1.f17619e;
        HashMap map2 = new HashMap();
        if (map.size() > 10) {
            map2.put("fl.parameter.limit.exceeded", String.valueOf(map.size()));
            map.clear();
        }
        try {
            map2.put("fl.ProductName", str);
            map2.put("fl.ProductID", str2);
            map2.put("fl.Quantity", String.valueOf(i7));
            map2.put("fl.Price", String.format(Locale.ENGLISH, "%1$.2f", Double.valueOf(d7)));
            map2.put("fl.Currency", str3);
            map2.put("fl.TransactionIdentifier", str4);
            C1050x1.z().A(new Y1(new Z1("Flurry.purchase", Y1.f17619e.incrementAndGet(), 3, map, map2, new ArrayList(), false, false, (String) null, j, j3)));
        } catch (Throwable th) {
            AbstractC0997i0.r("Failed to log event: Flurry.purchase", th);
        }
        synchronized (AbstractC0997i0.class) {
        }
    }
}
