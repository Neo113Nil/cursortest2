package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import com.google.android.gms.common.d;
import com.google.android.gms.common.g;

/* loaded from: classes.dex */
public final class zzadn {
    private static Boolean zza;

    public static boolean zza(Context context) {
        if (zza == null) {
            int d7 = d.f11217b.d(context, g.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            zza = Boolean.valueOf(d7 == 0 || d7 == 2);
        }
        return zza.booleanValue();
    }
}
