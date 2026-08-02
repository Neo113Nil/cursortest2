package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.oG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1379oG extends AbstractC0715Xa {

    /* renamed from: b, reason: collision with root package name */
    public final Q3 f14798b;

    public C1379oG(Q3 q32) {
        this.f14798b = q32;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0715Xa
    public final int a(Object obj) {
        return obj == C1289mG.f14491e ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0715Xa
    public final int b() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0715Xa
    public final int c() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0715Xa
    public final C1785xa d(int i, C1785xa c1785xa, boolean z3) {
        Integer num = z3 ? 0 : null;
        Object obj = z3 ? C1289mG.f14491e : null;
        C0832c6 c0832c6 = C0832c6.f12972b;
        c1785xa.b(num, obj, 0, -9223372036854775807L, true);
        return c1785xa;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0715Xa
    public final C0603Ha e(int i, C0603Ha c0603Ha, long j5) {
        Object obj = C0603Ha.f9395m;
        c0603Ha.a(this.f14798b, false, true, null, -9223372036854775807L);
        c0603Ha.i = true;
        return c0603Ha;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0715Xa
    public final Object f(int i) {
        return C1289mG.f14491e;
    }
}
