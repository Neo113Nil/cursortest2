package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzou extends AudioDeviceCallback {
    final /* synthetic */ zzoy zza;

    public /* synthetic */ zzou(zzoy zzoyVar, zzox zzoxVar) {
        this.zza = zzoyVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        Context context;
        zze zzeVar;
        zzoz zzozVar;
        zzoy zzoyVar = this.zza;
        context = zzoyVar.zza;
        zzeVar = zzoyVar.zzh;
        zzozVar = zzoyVar.zzg;
        this.zza.zzj(zzot.zzc(context, zzeVar, zzozVar));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        zzoz zzozVar;
        Context context;
        zze zzeVar;
        zzoz zzozVar2;
        zzozVar = this.zza.zzg;
        int i7 = zzen.zza;
        int length = audioDeviceInfoArr.length;
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                break;
            }
            if (Objects.equals(audioDeviceInfoArr[i8], zzozVar)) {
                this.zza.zzg = null;
                break;
            }
            i8++;
        }
        zzoy zzoyVar = this.zza;
        context = zzoyVar.zza;
        zzeVar = zzoyVar.zzh;
        zzozVar2 = zzoyVar.zzg;
        zzoyVar.zzj(zzot.zzc(context, zzeVar, zzozVar2));
    }
}
