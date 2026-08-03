package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzggv {
    private final com.google.android.gms.internal.ads.zzhcg zza;
    private final com.google.android.gms.internal.ads.zzgha zzb;
    private final java.util.Set zzc;
    private final java.lang.String zzd;
    private final com.google.android.gms.internal.ads.zzaxm zze;
    private final com.google.android.gms.internal.ads.zzght zzf;
    private final com.google.android.gms.internal.ads.zzgqh zzg;

    zzggv(com.google.android.gms.internal.ads.zzhcg zzhcgVar, com.google.android.gms.internal.ads.zzgha zzghaVar, com.google.android.gms.internal.ads.zzght zzghtVar, com.google.android.gms.internal.ads.zzgec zzgecVar, java.lang.String str, com.google.android.gms.internal.ads.zzaxm zzaxmVar, com.google.android.gms.internal.ads.zzinj zzinjVar, com.google.android.gms.internal.ads.zzinj zzinjVar2, com.google.android.gms.internal.ads.zzinj zzinjVar3, com.google.android.gms.internal.ads.zzgqh zzgqhVar) {
        this.zza = zzhcgVar;
        this.zzb = zzghaVar;
        this.zzd = str;
        this.zzf = zzghtVar;
        this.zze = zzaxmVar;
        this.zzg = zzgqhVar;
        int ordinal = zzgecVar.ordinal();
        if (ordinal == 0) {
            this.zzc = ((com.google.android.gms.internal.ads.zzing) zzinjVar).zzb();
        } else if (ordinal == 1) {
            this.zzc = ((com.google.android.gms.internal.ads.zzing) zzinjVar2).zzb();
        } else {
            if (ordinal != 2) {
                throw new java.lang.IllegalStateException();
            }
            this.zzc = ((com.google.android.gms.internal.ads.zzing) zzinjVar3).zzb();
        }
    }

    final com.google.common.util.concurrent.ListenableFuture zza() {
        if (!this.zzb.zzc()) {
            return com.google.android.gms.internal.ads.zzhbw.zza(java.lang.Integer.toString(7));
        }
        if (!this.zzf.zzb()) {
            return com.google.android.gms.internal.ads.zzhbw.zzd(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzggu
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ java.lang.Object call() {
                    return com.google.android.gms.internal.ads.zzggv.this.zzb();
                }
            }, this.zza);
        }
        java.util.Set set = this.zzc;
        java.util.ArrayList arrayList = new java.util.ArrayList(set.size());
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(this.zza.zzc((com.google.android.gms.internal.ads.zzgiw) it.next()));
        }
        return com.google.android.gms.internal.ads.zzhbw.zzn(arrayList).zza(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzggs
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzggv.this.zzc();
            }
        }, com.google.android.gms.internal.ads.zzhcn.zza());
    }

    final /* synthetic */ java.lang.String zzb() {
        return this.zzb.zzg(16384, this.zzd);
    }

    final /* synthetic */ java.lang.String zzc() {
        java.util.concurrent.Callable callable = new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzggt
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzggv.this.zzd();
            }
        };
        com.google.android.gms.internal.ads.zzgqf zza = this.zzg.zza(101);
        try {
            zza.zza();
            java.lang.Object call = callable.call();
            zza.zzc();
            return (java.lang.String) call;
        } finally {
        }
    }

    final /* synthetic */ java.lang.String zzd() {
        com.google.android.gms.internal.ads.zzaym zzaymVar = (com.google.android.gms.internal.ads.zzaym) this.zze.zzbu();
        java.lang.String str = this.zzd;
        com.google.android.gms.internal.ads.zzgha zzghaVar = this.zzb;
        try {
            return android.util.Base64.encodeToString(((com.google.android.gms.internal.ads.zzazf) zzghaVar.zzf(zzaymVar.zzaN(), str).zzbu()).zzaN(), 11);
        } catch (java.lang.IllegalArgumentException unused) {
            return zzghaVar.zzg(4096, str);
        }
    }
}
