package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzqj extends android.media.AudioDeviceCallback {
    final /* synthetic */ com.google.android.gms.internal.ads.zzqn zza;

    /* synthetic */ zzqj(com.google.android.gms.internal.ads.zzqn zzqnVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzqnVar);
        this.zza = zzqnVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(android.media.AudioDeviceInfo[] audioDeviceInfoArr) {
        this.zza.zzi();
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(android.media.AudioDeviceInfo[] audioDeviceInfoArr) {
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        int length = audioDeviceInfoArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            com.google.android.gms.internal.ads.zzqn zzqnVar = this.zza;
            if (java.util.Objects.equals(audioDeviceInfoArr[i], zzqnVar.zzj())) {
                zzqnVar.zzk(null);
                break;
            }
            i++;
        }
        this.zza.zzi();
    }
}
