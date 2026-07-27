package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0195i0 extends AbstractC0181d1 {
    @Override // com.google.android.gms.internal.play_billing.AbstractC0181d1
    public final boolean D(AbstractC0210n0 abstractC0210n0, Object obj, Object obj2) {
        synchronized (abstractC0210n0) {
            try {
                if (abstractC0210n0.f2782a != obj) {
                    return false;
                }
                abstractC0210n0.f2782a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0181d1
    public final boolean F(AbstractC0210n0 abstractC0210n0, C0207m0 c0207m0, C0207m0 c0207m02) {
        synchronized (abstractC0210n0) {
            try {
                if (abstractC0210n0.f2784c != c0207m0) {
                    return false;
                }
                abstractC0210n0.f2784c = c0207m02;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0181d1
    public final C0186f0 d(AbstractC0210n0 abstractC0210n0) {
        C0186f0 c0186f0;
        C0186f0 c0186f02 = C0186f0.f2747d;
        synchronized (abstractC0210n0) {
            c0186f0 = abstractC0210n0.f2783b;
            if (c0186f0 != c0186f02) {
                abstractC0210n0.f2783b = c0186f02;
            }
        }
        return c0186f0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0181d1
    public final C0207m0 o(AbstractC0210n0 abstractC0210n0) {
        C0207m0 c0207m0;
        C0207m0 c0207m02 = C0207m0.f2775c;
        synchronized (abstractC0210n0) {
            c0207m0 = abstractC0210n0.f2784c;
            if (c0207m0 != c0207m02) {
                abstractC0210n0.f2784c = c0207m02;
            }
        }
        return c0207m0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0181d1
    public final void s(C0207m0 c0207m0, C0207m0 c0207m02) {
        c0207m0.f2777b = c0207m02;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0181d1
    public final void u(C0207m0 c0207m0, Thread thread) {
        c0207m0.f2776a = thread;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0181d1
    public final boolean z(AbstractC0210n0 abstractC0210n0, C0186f0 c0186f0, C0186f0 c0186f02) {
        synchronized (abstractC0210n0) {
            try {
                if (abstractC0210n0.f2783b != c0186f0) {
                    return false;
                }
                abstractC0210n0.f2783b = c0186f02;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
