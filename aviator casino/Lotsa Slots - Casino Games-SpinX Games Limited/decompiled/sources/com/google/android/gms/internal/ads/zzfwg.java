package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfwg extends android.content.BroadcastReceiver {
    zzfwg() {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
            int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
            if (intExtra == 0) {
                com.google.android.gms.internal.ads.zzfwh.zza = 1;
            } else if (intExtra == 1) {
                com.google.android.gms.internal.ads.zzfwh.zza = 2;
            }
        }
    }
}
