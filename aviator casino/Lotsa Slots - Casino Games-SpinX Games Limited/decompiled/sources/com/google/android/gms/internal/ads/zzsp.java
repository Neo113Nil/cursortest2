package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzsp {
    private final android.media.AudioTrack zza;
    private final android.os.Handler zzb;
    private android.media.AudioRouting.OnRoutingChangedListener zzc;
    private final com.google.android.gms.internal.ads.zztc zzd;

    /* synthetic */ zzsp(android.media.AudioTrack audioTrack, com.google.android.gms.internal.ads.zztc zztcVar, byte[] bArr) {
        this.zza = audioTrack;
        this.zzd = zztcVar;
        android.os.Handler zzd = com.google.android.gms.internal.ads.zzfl.zzd(null);
        this.zzb = zzd;
        android.media.AudioRouting.OnRoutingChangedListener onRoutingChangedListener = new android.media.AudioRouting.OnRoutingChangedListener() { // from class: com.google.android.gms.internal.ads.zzso
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final /* synthetic */ void onRoutingChanged(android.media.AudioRouting audioRouting) {
                com.google.android.gms.internal.ads.zzsp.this.zza(audioRouting);
            }
        };
        this.zzc = onRoutingChangedListener;
        audioTrack.addOnRoutingChangedListener(onRoutingChangedListener, zzd);
    }

    final /* synthetic */ void zza(final android.media.AudioRouting audioRouting) {
        if (this.zzc == null) {
            return;
        }
        com.google.android.gms.internal.ads.zzdh.zza().execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzsm
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzsp.this.zzb(audioRouting);
            }
        });
    }

    final /* synthetic */ void zzb(android.media.AudioRouting audioRouting) {
        final android.media.AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
        if (routedDevice != null) {
            this.zzb.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzsn
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzsp.this.zzc(routedDevice);
                }
            });
        }
    }

    final /* synthetic */ void zzc(android.media.AudioDeviceInfo audioDeviceInfo) {
        if (this.zzc == null) {
            return;
        }
        com.google.android.gms.internal.ads.zztd zztdVar = this.zzd.zza;
        if (zztdVar.zzj() != null) {
            zztdVar.zzj().zzc(audioDeviceInfo);
        }
    }

    final /* synthetic */ void zzd() {
        android.media.AudioRouting.OnRoutingChangedListener onRoutingChangedListener = this.zzc;
        onRoutingChangedListener.getClass();
        this.zza.removeOnRoutingChangedListener(onRoutingChangedListener);
        this.zzc = null;
    }
}
