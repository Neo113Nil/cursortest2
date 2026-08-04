package com.google.android.gms.internal.ads;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzou extends AudioDeviceCallback {
    final /* synthetic */ zzoy zza;

    public /* synthetic */ zzou(zzoy zzoyVar, zzox zzoxVar) {
        this.zza = zzoyVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        zzoy zzoyVar = this.zza;
        this.zza.zzj(zzot.zzc(zzoyVar.zza, zzoyVar.zzh, zzoyVar.zzg));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        zzoz zzozVar = this.zza.zzg;
        int i7 = zzen.zza;
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            if (Objects.equals(audioDeviceInfo, zzozVar)) {
                this.zza.zzg = null;
                break;
            }
        }
        zzoy zzoyVar = this.zza;
        zzoyVar.zzj(zzot.zzc(zzoyVar.zza, zzoyVar.zzh, zzoyVar.zzg));
    }
}
