package s4;

import p4.C2268h;

/* loaded from: classes.dex */
public final class z implements p4.E {

    /* renamed from: k, reason: collision with root package name */
    public final B f19317k;

    /* renamed from: l, reason: collision with root package name */
    public final long f19318l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f19319m;

    /* renamed from: n, reason: collision with root package name */
    public final C2268h f19320n;

    public z(B b3, long j5, Object obj, C2268h c2268h) {
        this.f19317k = b3;
        this.f19318l = j5;
        this.f19319m = obj;
        this.f19320n = c2268h;
    }

    @Override // p4.E
    public final void a() {
        B b3 = this.f19317k;
        synchronized (b3) {
            if (this.f19318l < b3.o()) {
                return;
            }
            Object[] objArr = b3.f19217r;
            kotlin.jvm.internal.l.c(objArr);
            long j5 = this.f19318l;
            if (objArr[((int) j5) & (objArr.length - 1)] != this) {
                return;
            }
            C.d(objArr, j5, C.f19222a);
            b3.j();
        }
    }
}
