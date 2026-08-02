package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class Ot extends Nt {
    public static Ot i;

    public static final Ot g(Context context) {
        Ot ot;
        synchronized (Ot.class) {
            try {
                if (i == null) {
                    i = new Ot(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
                }
                ot = i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ot;
    }

    public final E4.a f(long j5, boolean z3) {
        E4.a a5;
        synchronized (Ot.class) {
            a5 = a(null, null, j5, z3);
        }
        return a5;
    }

    public final void h() {
        synchronized (Ot.class) {
            d(false);
        }
    }
}
