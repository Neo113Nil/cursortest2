package sg.bigo.ads.h;

import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class U0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f12856a = false;
    public final /* synthetic */ Y0 b;

    public U0(Y0 y0) {
        this.b = y0;
    }

    public final boolean a() {
        Y0 y0 = this.b;
        if (y0.m && !this.f12856a) {
            this.f12856a = true;
            Runnable runnable = y0.F;
            if (runnable != null) {
                y0.E = null;
                y0.F = null;
                AbstractC5446j.a(2, null, runnable, 0L);
                return true;
            }
        }
        return false;
    }

    public final boolean a(Runnable runnable) {
        D0 d0;
        Y0 y0 = this.b;
        if (y0.m && !this.f12856a) {
            this.f12856a = true;
            Runnable runnable2 = y0.F;
            if (runnable2 == null && (d0 = y0.E) != null) {
                AbstractC5446j.a(d0);
                Y0 y02 = this.b;
                runnable2 = y02.E;
                y02.F = runnable2;
            }
            if (runnable2 != null) {
                Y0 y03 = this.b;
                y03.G = runnable;
                y03.E = null;
                y03.F = null;
                AbstractC5446j.a(2, null, runnable2, 0L);
                return true;
            }
        }
        return false;
    }
}
