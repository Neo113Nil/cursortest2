package w1;

import java.util.Collections;
import java.util.HashMap;

/* renamed from: w1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1689e extends AbstractRunnableC1687d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f17684a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f17685b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f17686c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f17687d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Throwable f17688e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ HashMap f17689f;

    public C1689e(String str, long j, String str2, String str3, Throwable th, HashMap hashMap) {
        this.f17684a = str;
        this.f17685b = j;
        this.f17686c = str2;
        this.f17687d = str3;
        this.f17688e = th;
        this.f17689f = hashMap;
    }

    @Override // w1.AbstractRunnableC1687d1
    public final void a() {
        C1745t c1745t = H2.a().f17402f;
        String str = this.f17684a;
        long j = this.f17685b;
        String str2 = this.f17686c;
        String str3 = this.f17687d;
        Throwable th = this.f17688e;
        HashMap hashMap = this.f17689f;
        c1745t.getClass();
        c1745t.h(new C1742s(str, j, str2, str3, th, null, hashMap, Collections.emptyList()));
        if (this.f17689f.isEmpty()) {
            synchronized (AbstractC1706i0.class) {
            }
        }
    }
}
