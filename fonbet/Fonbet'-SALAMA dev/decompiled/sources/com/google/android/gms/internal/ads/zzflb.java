package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public final class zzflb {
    private static int zza = 2;

    public static void zza(Context context) {
        context.registerReceiver(new zzfla(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }

    public static int zzb() {
        if (zzfkx.zza() != zzfjn.CTV) {
            return 2;
        }
        return zza;
    }
}
