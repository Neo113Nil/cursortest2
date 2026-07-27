package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class p2 extends AbstractC0181d1 {
    @Override // com.google.android.gms.internal.play_billing.AbstractC0181d1
    public final boolean A(r2 r2Var, q2 q2Var, q2 q2Var2) {
        synchronized (r2Var) {
            try {
                if (r2Var.f2813c != q2Var) {
                    return false;
                }
                r2Var.f2813c = q2Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0181d1
    public final void i(q2 q2Var, q2 q2Var2) {
        q2Var.f2802b = q2Var2;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0181d1
    public final void r(q2 q2Var, Thread thread) {
        q2Var.f2801a = thread;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0181d1
    public final boolean t(r2 r2Var, F1 f12, F1 f13) {
        synchronized (r2Var) {
            try {
                if (r2Var.f2812b != f12) {
                    return false;
                }
                r2Var.f2812b = f13;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0181d1
    public final boolean v(r2 r2Var, Object obj, Object obj2) {
        synchronized (r2Var) {
            try {
                if (r2Var.f2811a != obj) {
                    return false;
                }
                r2Var.f2811a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
