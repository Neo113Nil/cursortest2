package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzadi {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzadu zzb;
    private com.google.android.gms.internal.ads.zzbs zzc;
    private boolean zzd;
    private boolean zzf;
    private long zzg = 15000;
    private final com.google.android.gms.internal.ads.zzadv zzh = new com.google.android.gms.internal.ads.zzadv(1.0f);
    private com.google.android.gms.internal.ads.zzdo zze = com.google.android.gms.internal.ads.zzdo.zza;

    public zzadi(android.content.Context context, com.google.android.gms.internal.ads.zzadu zzaduVar) {
        this.zza = context.getApplicationContext();
        this.zzb = zzaduVar;
    }

    public final com.google.android.gms.internal.ads.zzadi zza(boolean z) {
        this.zzd = true;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzadi zzb(com.google.android.gms.internal.ads.zzdo zzdoVar) {
        this.zze = zzdoVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzadi zzc(long j) {
        this.zzg = j;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzadq zzd() {
        com.google.android.gms.internal.ads.zzgtj.zzi(!this.zzf);
        if (this.zzc == null) {
            this.zzc = new com.google.android.gms.internal.ads.zzado(false);
        }
        com.google.android.gms.internal.ads.zzadq zzadqVar = new com.google.android.gms.internal.ads.zzadq(this, null);
        this.zzf = true;
        return zzadqVar;
    }

    final /* synthetic */ android.content.Context zze() {
        return this.zza;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzadu zzf() {
        return this.zzb;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzbs zzg() {
        return this.zzc;
    }

    final /* synthetic */ boolean zzh() {
        return this.zzd;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzdo zzi() {
        return this.zze;
    }

    final /* synthetic */ long zzj() {
        return this.zzg;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzadv zzk() {
        return this.zzh;
    }
}
