package com.google.android.gms.internal.ads;

import E2.o;
import android.os.SystemClock;

@Deprecated
/* loaded from: classes.dex */
public final class zzbcf {
    public static boolean zza(zzbcn zzbcnVar, zzbck zzbckVar, String... strArr) {
        if (zzbckVar == null) {
            return false;
        }
        o.f1952C.j.getClass();
        zzbcnVar.zze(zzbckVar, SystemClock.elapsedRealtime(), strArr);
        return true;
    }
}
