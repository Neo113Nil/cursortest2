package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import com.google.android.gms.common.d;

/* JADX INFO: loaded from: classes.dex */
public final class zzadn {
    private static Boolean zza;

    public static boolean zza(Context context) {
        if (zza == null) {
            int iD = d.f11217b.d(context, 12451000);
            zza = Boolean.valueOf(iD == 0 || iD == 2);
        }
        return zza.booleanValue();
    }
}
