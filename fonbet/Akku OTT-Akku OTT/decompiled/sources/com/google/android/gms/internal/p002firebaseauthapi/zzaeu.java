package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0856f;

/* loaded from: classes4.dex */
public final class zzaeu {

    @Nullable
    private static Boolean zza;

    public static boolean zza(Context context) {
        if (zza == null) {
            int c = C0856f.b.c(context, 12451000);
            zza = Boolean.valueOf(c == 0 || c == 2);
        }
        return zza.booleanValue();
    }
}
