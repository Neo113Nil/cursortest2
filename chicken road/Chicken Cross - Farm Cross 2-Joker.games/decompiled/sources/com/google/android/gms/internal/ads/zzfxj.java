package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfxj {
    private static int zza = 2;

    public static void zza(Context context) {
        context.registerReceiver(new zzfxi(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }

    public static int zzb() {
        if (zzfxf.zzb() != zzfvs.CTV) {
            return 2;
        }
        return zza;
    }
}
