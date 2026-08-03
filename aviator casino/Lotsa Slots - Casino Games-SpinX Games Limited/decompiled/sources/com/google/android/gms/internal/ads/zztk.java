package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zztk {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzqh zzb;
    private boolean zzc;
    private com.google.android.gms.internal.ads.zztj zzd;
    private com.google.android.gms.internal.ads.zzrf zze;
    private com.google.android.gms.internal.ads.zztm zzf;
    private com.google.android.gms.internal.ads.zzth zzg;

    @java.lang.Deprecated
    public zztk() {
        this.zza = null;
        this.zzb = com.google.android.gms.internal.ads.zzqh.zza;
    }

    public final com.google.android.gms.internal.ads.zztr zza() {
        com.google.android.gms.internal.ads.zzgtj.zzi(!this.zzc);
        this.zzc = true;
        if (this.zzf == null) {
            this.zzf = new com.google.android.gms.internal.ads.zztm(new com.google.android.gms.internal.ads.zzco[0]);
        }
        if (this.zze == null) {
            if (this.zzg == null) {
                this.zzg = new com.google.android.gms.internal.ads.zzth(this.zza);
            }
            if (this.zzd == null) {
                this.zzd = com.google.android.gms.internal.ads.zztj.zza;
            }
            android.content.Context context = this.zza;
            com.google.android.gms.internal.ads.zztb zztbVar = new com.google.android.gms.internal.ads.zztb(context);
            zztbVar.zzb(context != null ? null : this.zzb);
            zztbVar.zzf(this.zzg);
            zztbVar.zza(this.zzd);
            this.zze = zztbVar.zzc();
        } else {
            com.google.android.gms.internal.ads.zzgtj.zzi(this.zzg == null);
            com.google.android.gms.internal.ads.zzgtj.zzi(this.zzd == null);
        }
        return new com.google.android.gms.internal.ads.zztr(this, null);
    }

    final /* synthetic */ android.content.Context zzb() {
        return this.zza;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzrf zzc() {
        return this.zze;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zztm zzd() {
        return this.zzf;
    }

    public zztk(android.content.Context context) {
        this.zza = context;
        this.zzb = com.google.android.gms.internal.ads.zzqh.zza;
    }
}
