package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzqx {
    private final com.google.android.gms.internal.ads.zzv zza;
    private android.media.AudioDeviceInfo zzc;
    private com.google.android.gms.internal.ads.zzd zzb = com.google.android.gms.internal.ads.zzd.zza;
    private int zzd = 0;
    private int zze = -1;
    private int zzf = -1;

    public zzqx(com.google.android.gms.internal.ads.zzv zzvVar) {
        this.zza = zzvVar;
    }

    public final com.google.android.gms.internal.ads.zzqx zza(com.google.android.gms.internal.ads.zzd zzdVar) {
        this.zzb = zzdVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzqx zzb(android.media.AudioDeviceInfo audioDeviceInfo) {
        this.zzc = audioDeviceInfo;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzqx zzc(int i) {
        this.zzd = i;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzqx zzd(int i) {
        this.zze = i;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzqx zze(int i) {
        this.zzf = -1;
        return this;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzv zzf() {
        return this.zza;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzd zzg() {
        return this.zzb;
    }

    final /* synthetic */ android.media.AudioDeviceInfo zzh() {
        return this.zzc;
    }

    final /* synthetic */ int zzi() {
        return this.zzd;
    }

    final /* synthetic */ int zzj() {
        return this.zze;
    }

    final /* synthetic */ int zzk() {
        return this.zzf;
    }
}
