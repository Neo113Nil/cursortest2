package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class IE extends AbstractC1111iG {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9534c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final Object f9535d;

    public IE(AbstractC0715Xa abstractC0715Xa) {
        super(abstractC0715Xa);
        this.f9535d = new C0603Ha();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1111iG, com.google.android.gms.internal.ads.AbstractC0715Xa
    public C1785xa d(int i, C1785xa c1785xa, boolean z3) {
        switch (this.f9534c) {
            case 0:
                AbstractC0715Xa abstractC0715Xa = this.f13928b;
                C1785xa d5 = abstractC0715Xa.d(i, c1785xa, z3);
                if (abstractC0715Xa.e(d5.f16290c, (C0603Ha) this.f9535d, 0L).b()) {
                    Integer num = c1785xa.f16288a;
                    Object obj = c1785xa.f16289b;
                    int i5 = c1785xa.f16290c;
                    long j5 = c1785xa.f16291d;
                    C0832c6 c0832c6 = C0832c6.f12972b;
                    d5.b(num, obj, i5, j5, true);
                } else {
                    d5.f16292e = true;
                }
                return d5;
            default:
                return super.d(i, c1785xa, z3);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1111iG, com.google.android.gms.internal.ads.AbstractC0715Xa
    public C0603Ha e(int i, C0603Ha c0603Ha, long j5) {
        switch (this.f9534c) {
            case 1:
                this.f13928b.e(i, c0603Ha, j5);
                Q3 q32 = (Q3) this.f9535d;
                c0603Ha.f9398b = q32;
                C1859z2 c1859z2 = q32.f11161b;
                return c0603Ha;
            default:
                return super.e(i, c0603Ha, j5);
        }
    }

    public IE(AbstractC0715Xa abstractC0715Xa, Q3 q32) {
        super(abstractC0715Xa);
        this.f9535d = q32;
    }
}
