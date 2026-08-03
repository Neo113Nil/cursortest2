package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public class zzdmd {
    private final com.google.android.gms.internal.ads.zzdno zza;
    private final com.google.android.gms.internal.ads.zzcku zzb;

    public zzdmd(com.google.android.gms.internal.ads.zzdno zzdnoVar, com.google.android.gms.internal.ads.zzcku zzckuVar) {
        this.zza = zzdnoVar;
        this.zzb = zzckuVar;
    }

    public final com.google.android.gms.internal.ads.zzdno zza() {
        return this.zza;
    }

    public final com.google.android.gms.internal.ads.zzcku zzb() {
        return this.zzb;
    }

    public final android.view.View zzc() {
        com.google.android.gms.internal.ads.zzcku zzckuVar = this.zzb;
        if (zzckuVar != null) {
            return zzckuVar.zzD();
        }
        return null;
    }

    public final android.view.View zzd() {
        com.google.android.gms.internal.ads.zzcku zzckuVar = this.zzb;
        if (zzckuVar == null) {
            return null;
        }
        return zzckuVar.zzD();
    }

    public java.util.Set zze(com.google.android.gms.internal.ads.zzdbk zzdbkVar) {
        return java.util.Collections.singleton(new com.google.android.gms.internal.ads.zzdkq(zzdbkVar, com.google.android.gms.internal.ads.zzcfr.zzh));
    }

    public java.util.Set zzf(com.google.android.gms.internal.ads.zzdbk zzdbkVar) {
        return java.util.Collections.singleton(new com.google.android.gms.internal.ads.zzdkq(zzdbkVar, com.google.android.gms.internal.ads.zzcfr.zzh));
    }

    public final com.google.android.gms.internal.ads.zzdkq zzg(java.util.concurrent.Executor executor) {
        final com.google.android.gms.internal.ads.zzcku zzckuVar = this.zzb;
        return new com.google.android.gms.internal.ads.zzdkq(new com.google.android.gms.internal.ads.zzdho() { // from class: com.google.android.gms.internal.ads.zzdmb
            @Override // com.google.android.gms.internal.ads.zzdho
            public final /* synthetic */ void zza() {
                com.google.android.gms.ads.internal.overlay.zzm zzL;
                com.google.android.gms.internal.ads.zzcku zzckuVar2 = com.google.android.gms.internal.ads.zzcku.this;
                if (zzckuVar2 == null || (zzL = zzckuVar2.zzL()) == null) {
                    return;
                }
                zzL.zzb();
            }
        }, executor);
    }
}
