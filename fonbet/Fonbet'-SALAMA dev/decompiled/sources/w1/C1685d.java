package w1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: w1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1685d extends AbstractRunnableC1687d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f17661a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f17662b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17663c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f17664d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f17665e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f17666f;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ HashMap f17667x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f17668y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ long f17669z;

    public C1685d(String str, String str2, int i7, double d7, String str3, String str4, HashMap hashMap, long j, long j3) {
        this.f17661a = str;
        this.f17662b = str2;
        this.f17663c = i7;
        this.f17664d = d7;
        this.f17665e = str3;
        this.f17666f = str4;
        this.f17667x = hashMap;
        this.f17668y = j;
        this.f17669z = j3;
    }

    @Override // w1.AbstractRunnableC1687d1
    public final void a() {
        String str = this.f17661a;
        String str2 = this.f17662b;
        int i7 = this.f17663c;
        double d7 = this.f17664d;
        String str3 = this.f17665e;
        String str4 = this.f17666f;
        HashMap hashMap = this.f17667x;
        long j = this.f17668y;
        long j3 = this.f17669z;
        AtomicInteger atomicInteger = Y1.f17613e;
        HashMap hashMap2 = new HashMap();
        if (hashMap.size() > 10) {
            hashMap2.put("fl.parameter.limit.exceeded", String.valueOf(hashMap.size()));
            hashMap.clear();
        }
        try {
            hashMap2.put("fl.ProductName", str);
            hashMap2.put("fl.ProductID", str2);
            hashMap2.put("fl.Quantity", String.valueOf(i7));
            hashMap2.put("fl.Price", String.format(Locale.ENGLISH, "%1$.2f", Double.valueOf(d7)));
            hashMap2.put("fl.Currency", str3);
            hashMap2.put("fl.TransactionIdentifier", str4);
            C1759x1.z().A(new Y1(new Z1("Flurry.purchase", Y1.f17613e.incrementAndGet(), 3, hashMap, hashMap2, new ArrayList(), false, false, (String) null, j, j3)));
        } catch (Throwable th) {
            AbstractC1706i0.r("Failed to log event: Flurry.purchase", th);
        }
        synchronized (AbstractC1706i0.class) {
        }
    }
}
