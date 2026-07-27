package com.google.android.play.core.hsdp.service;

import android.app.Activity;

/* compiled from: com.google.android.play:hsdp@@2.0.1 */
/* loaded from: classes8.dex */
final class zza {
    public static int zza(Activity activity, int i) {
        return (int) ((i * activity.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int zzb(Activity activity) {
        return zza(activity, activity.getResources().getConfiguration().screenHeightDp);
    }

    public static int zzc(Activity activity) {
        return zza(activity, activity.getResources().getConfiguration().screenWidthDp);
    }
}
