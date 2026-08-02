package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioRouting$OnRoutingChangedListener;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes3.dex */
final class zzrh {
    private final AudioTrack zza;
    private final zzpo zzb;
    private AudioRouting$OnRoutingChangedListener zzc = new AudioRouting$OnRoutingChangedListener() { // from class: com.google.android.gms.internal.ads.zzrg
        public final void onRoutingChanged(AudioRouting audioRouting) {
            zzrh.zza(zzrh.this, audioRouting);
        }
    };

    public zzrh(AudioTrack audioTrack, zzpo zzpoVar) {
        this.zza = audioTrack;
        this.zzb = zzpoVar;
        audioTrack.addOnRoutingChangedListener(this.zzc, new Handler(Looper.myLooper()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0005, code lost:
    
        r2 = r2.getRoutedDevice();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void zza(zzrh zzrhVar, AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice;
        if (zzrhVar.zzc == null || routedDevice == null) {
            return;
        }
        zzrhVar.zzb.zzi(routedDevice);
    }

    public final void zzb() {
        AudioRouting$OnRoutingChangedListener audioRouting$OnRoutingChangedListener = this.zzc;
        audioRouting$OnRoutingChangedListener.getClass();
        this.zza.removeOnRoutingChangedListener(zzel$$ExternalSyntheticApiModelOutline1.m315m((Object) audioRouting$OnRoutingChangedListener));
        this.zzc = null;
    }
}
