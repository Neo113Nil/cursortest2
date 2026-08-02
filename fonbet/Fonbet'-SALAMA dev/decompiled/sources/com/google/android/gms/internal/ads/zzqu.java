package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* loaded from: classes.dex */
final class zzqu extends AudioTrack$StreamEventCallback {
    final /* synthetic */ zzqv zza;

    public zzqu(zzqv zzqvVar) {
        this.zza = zzqvVar;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i7) {
        AudioTrack audioTrack2;
        audioTrack2 = this.zza.zza.zzs;
        audioTrack.equals(audioTrack2);
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        AudioTrack audioTrack2;
        audioTrack2 = this.zza.zza.zzs;
        if (audioTrack.equals(audioTrack2)) {
            this.zza.zza.zzP = true;
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        AudioTrack audioTrack2;
        audioTrack2 = this.zza.zza.zzs;
        audioTrack.equals(audioTrack2);
    }
}
