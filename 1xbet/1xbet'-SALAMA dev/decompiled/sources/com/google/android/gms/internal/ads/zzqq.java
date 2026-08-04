package com.google.android.gms.internal.ads;

import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
final class zzqq {
    private final AudioTrack zza;
    private final zzoy zzb;
    private AudioRouting.OnRoutingChangedListener zzc = new AudioRouting.OnRoutingChangedListener() { // from class: com.google.android.gms.internal.ads.zzqp
        @Override // android.media.AudioRouting.OnRoutingChangedListener
        public final void onRoutingChanged(AudioRouting audioRouting) {
            zzqq.zza(this.zza, audioRouting);
        }
    };

    public zzqq(AudioTrack audioTrack, zzoy zzoyVar) {
        this.zza = audioTrack;
        this.zzb = zzoyVar;
        audioTrack.addOnRoutingChangedListener(this.zzc, new Handler(Looper.myLooper()));
    }

    public static /* synthetic */ void zza(zzqq zzqqVar, AudioRouting audioRouting) {
        if (zzqqVar.zzc == null || audioRouting.getRoutedDevice() == null) {
            return;
        }
        zzqqVar.zzb.zzh(audioRouting.getRoutedDevice());
    }

    public final void zzb() {
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = this.zzc;
        onRoutingChangedListener.getClass();
        this.zza.removeOnRoutingChangedListener(onRoutingChangedListener);
        this.zzc = null;
    }
}
