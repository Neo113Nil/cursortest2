package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbob {
    private final com.google.android.gms.ads.formats.zze zza;
    private final com.google.android.gms.ads.formats.zzd zzb;
    private com.google.android.gms.internal.ads.zzbmw zzc;

    public zzbob(com.google.android.gms.ads.formats.zze zzeVar, com.google.android.gms.ads.formats.zzd zzdVar) {
        this.zza = zzeVar;
        this.zzb = zzdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final synchronized com.google.android.gms.internal.ads.zzbmw zze(com.google.android.gms.internal.ads.zzbmv zzbmvVar) {
        com.google.android.gms.internal.ads.zzbmw zzbmwVar = this.zzc;
        if (zzbmwVar != null) {
            return zzbmwVar;
        }
        com.google.android.gms.internal.ads.zzbmw zzbmwVar2 = new com.google.android.gms.internal.ads.zzbmw(zzbmvVar);
        this.zzc = zzbmwVar2;
        return zzbmwVar2;
    }

    public final com.google.android.gms.internal.ads.zzbni zza() {
        return new com.google.android.gms.internal.ads.zzboa(this, null);
    }

    public final com.google.android.gms.internal.ads.zzbnf zzb() {
        if (this.zzb == null) {
            return null;
        }
        return new com.google.android.gms.internal.ads.zzbnz(this, null);
    }

    final /* synthetic */ com.google.android.gms.ads.formats.zze zzc() {
        return this.zza;
    }

    final /* synthetic */ com.google.android.gms.ads.formats.zzd zzd() {
        return this.zzb;
    }
}
