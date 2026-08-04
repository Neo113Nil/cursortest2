package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
final class zzhj extends BroadcastReceiver {
    private final zzdj zza;

    public zzhj(zzhl zzhlVar, zzdj zzdjVar, zzhk zzhkVar) {
        this.zza = zzdjVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.zza.zzh(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzhi
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }
}
