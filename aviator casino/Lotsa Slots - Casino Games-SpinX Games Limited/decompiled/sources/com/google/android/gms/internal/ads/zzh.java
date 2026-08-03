package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzh {
    private int zza;
    private int zzb;
    private int zzc;
    private byte[] zzd;
    private int zze;
    private int zzf;

    public zzh() {
        this.zza = -1;
        this.zzb = -1;
        this.zzc = -1;
        this.zze = -1;
        this.zzf = -1;
    }

    /* synthetic */ zzh(com.google.android.gms.internal.ads.zzi zziVar, byte[] bArr) {
        this.zza = zziVar.zzb;
        this.zzb = zziVar.zzc;
        this.zzc = zziVar.zzd;
        this.zzd = zziVar.zze;
        this.zze = zziVar.zzf;
        this.zzf = zziVar.zzg;
    }

    public final com.google.android.gms.internal.ads.zzh zza(int i) {
        this.zza = i;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzh zzb(int i) {
        this.zzb = i;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzh zzc(int i) {
        this.zzc = i;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzh zzd(byte[] bArr) {
        this.zzd = bArr;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzh zze(int i) {
        this.zze = i;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzh zzf(int i) {
        this.zzf = i;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzi zzg() {
        return new com.google.android.gms.internal.ads.zzi(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, null);
    }
}
