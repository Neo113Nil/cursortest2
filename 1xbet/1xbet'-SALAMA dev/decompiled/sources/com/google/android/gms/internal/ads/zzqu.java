package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* JADX INFO: loaded from: classes.dex */
final class zzqu extends AudioTrack$StreamEventCallback {
    final /* synthetic */ zzqv zza;

    public zzqu(zzqv zzqvVar) {
        this.zza = zzqvVar;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i7) {
        audioTrack.equals(this.zza.zza.zzs);
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (audioTrack.equals(this.zza.zza.zzs)) {
            this.zza.zza.zzP = true;
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        audioTrack.equals(this.zza.zza.zzs);
    }
}
