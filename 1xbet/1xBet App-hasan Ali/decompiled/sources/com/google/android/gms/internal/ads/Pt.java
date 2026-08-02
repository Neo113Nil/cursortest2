package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class Pt extends Nt {
    public static Pt i;

    public static final Pt g(Context context) {
        Pt pt;
        synchronized (Pt.class) {
            try {
                if (i == null) {
                    i = new Pt(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
                }
                pt = i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return pt;
    }

    public final E4.a f(long j5, boolean z3) {
        synchronized (Pt.class) {
            try {
                if (this.f10862g.E()) {
                    return a(null, null, j5, z3);
                }
                return new E4.a(7);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        synchronized (Pt.class) {
            try {
                if (((SharedPreferences) this.f.f15915m).contains(this.f10857a)) {
                    d(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
