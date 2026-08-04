package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0252s;
import I2.J;
import J2.d;
import J2.j;
import W5.AbstractC0486a1;
import android.content.Context;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzfbx {
    public static void zza(Context context, boolean z4) {
        if (z4) {
            int i7 = J.f3546b;
            j.f("This request is sent from a test device.");
        } else {
            d dVar = C0252s.f2717f.f2718a;
            String strH = AbstractC0486a1.h("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"", d.q(context), "\")) to get test ads on this device.");
            int i8 = J.f3546b;
            j.f(strH);
        }
    }

    public static void zzb(int i7, Throwable th, String str) {
        String strD = k.d(i7, "Ad failed to load : ");
        int i8 = J.f3546b;
        j.f(strD);
        J.l(str, th);
        if (i7 == 3) {
            return;
        }
        o.f1952C.f1961g.zzv(th, str);
    }
}
