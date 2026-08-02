package com.google.android.gms.internal.ads;

import J2.j;
import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class zzbbr {
    public static final SharedPreferences zza(Context context) {
        try {
            return context.getSharedPreferences("google_ads_flags", 0);
        } catch (IllegalStateException e7) {
            j.h("", e7);
            return null;
        }
    }
}
