package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfwh {
    private static int zza = 2;

    public static void zza(android.content.Context context) {
        context.registerReceiver(new com.google.android.gms.internal.ads.zzfwg(), new android.content.IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }

    public static int zzb() {
        if (com.google.android.gms.internal.ads.zzfwd.zzb() != com.google.android.gms.internal.ads.zzfuq.CTV) {
            return 2;
        }
        return zza;
    }
}
