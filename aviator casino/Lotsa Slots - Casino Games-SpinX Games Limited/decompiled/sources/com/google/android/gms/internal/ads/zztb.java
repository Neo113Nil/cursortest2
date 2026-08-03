package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zztb {
    private final android.content.Context zza;
    private com.google.android.gms.internal.ads.zztj zzb;
    private com.google.android.gms.internal.ads.zzqh zzc;
    private com.google.android.gms.internal.ads.zzth zzd;

    public zztb(android.content.Context context) {
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzb = com.google.android.gms.internal.ads.zztj.zza;
        if (context == null) {
            this.zzc = com.google.android.gms.internal.ads.zzqh.zza;
        }
    }

    public final com.google.android.gms.internal.ads.zztb zza(com.google.android.gms.internal.ads.zztj zztjVar) {
        this.zzb = zztjVar;
        return this;
    }

    final com.google.android.gms.internal.ads.zztb zzb(com.google.android.gms.internal.ads.zzqh zzqhVar) {
        if (this.zza == null) {
            this.zzc = zzqhVar;
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.zztd zzc() {
        if (this.zzd == null) {
            this.zzd = new com.google.android.gms.internal.ads.zzth(this.zza);
        }
        return new com.google.android.gms.internal.ads.zztd(this, null);
    }

    final /* synthetic */ android.content.Context zzd() {
        return this.zza;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzqh zze() {
        return this.zzc;
    }

    public final com.google.android.gms.internal.ads.zztb zzf(com.google.android.gms.internal.ads.zzth zzthVar) {
        this.zzd = zzthVar;
        return this;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzth zzg() {
        return this.zzd;
    }
}
