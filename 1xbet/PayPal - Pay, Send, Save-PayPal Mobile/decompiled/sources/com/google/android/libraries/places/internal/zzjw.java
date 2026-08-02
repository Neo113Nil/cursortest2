package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzjw {
    java.lang.String zza;
    java.lang.Long zzb;
    com.google.android.libraries.places.internal.zzbgs zzc;
    private final android.content.Context zzd;
    private final com.google.android.libraries.places.internal.zzjp zze;
    private final com.google.android.libraries.places.internal.zzbgv zzf;
    private final com.google.android.libraries.places.internal.zzjc zzg;
    private boolean zzh = false;
    private final com.google.android.libraries.places.internal.zzmp zzi;

    zzjw(android.content.Context context, com.google.android.libraries.places.internal.zzblw zzblwVar, com.google.android.libraries.places.internal.zzmp zzmpVar, com.google.android.libraries.places.internal.zzjc zzjcVar, com.google.android.libraries.places.internal.zzjp zzjpVar) {
        this.zzd = context;
        this.zzf = com.google.android.libraries.places.internal.zzbgw.zzc(zzblwVar);
        this.zzg = zzjcVar;
        this.zzi = zzmpVar;
        this.zze = zzjpVar;
    }

    public final com.google.common.util.concurrent.ListenableFuture zza(final com.google.android.libraries.places.internal.zzbgs zzbgsVar) {
        if (zzbgsVar == com.google.android.libraries.places.internal.zzbgs.PLACE_AUTOCOMPLETE) {
            throw new java.lang.IllegalArgumentException("Autocomplete widget should call getOrRefreshToken()");
        }
        if (this.zza != null && zze()) {
            throw new java.lang.IllegalStateException("Token is expired");
        }
        com.google.android.libraries.places.internal.zzbgs zzbgsVar2 = this.zzc;
        if (zzbgsVar2 != null && zzbgsVar2 != zzbgsVar) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Token type %s does not match requested type %s", zzbgsVar2.name(), zzbgsVar.name()));
        }
        java.lang.String str = this.zza;
        return str != null ? com.google.common.util.concurrent.Futures.immediateFuture(str) : com.google.common.util.concurrent.FluentFuture.from(this.zze.zza()).transformAsync(new com.google.common.util.concurrent.AsyncFunction() { // from class: com.google.android.libraries.places.internal.zzjv
            @Override // com.google.common.util.concurrent.AsyncFunction
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture apply(java.lang.Object obj) {
                return com.google.android.libraries.places.internal.zzjw.this.zzd((java.lang.String) obj, zzbgsVar);
            }
        }, com.google.common.util.concurrent.MoreExecutors.directExecutor()).transform(com.google.android.libraries.places.internal.zzjt.zza, com.google.common.util.concurrent.MoreExecutors.directExecutor());
    }

    public final com.google.common.util.concurrent.ListenableFuture zzb(final com.google.android.libraries.places.internal.zzbgs zzbgsVar) {
        java.lang.String str;
        if (zzbgsVar != com.google.android.libraries.places.internal.zzbgs.PLACE_AUTOCOMPLETE) {
            throw new java.lang.IllegalArgumentException("Only Autocomplete widget should call getOrRefreshToken()");
        }
        com.google.android.libraries.places.internal.zzbgs zzbgsVar2 = this.zzc;
        if (zzbgsVar2 == null || zzbgsVar2 == zzbgsVar) {
            return (zze() || (str = this.zza) == null) ? com.google.common.util.concurrent.FluentFuture.from(this.zze.zza()).transformAsync(new com.google.common.util.concurrent.AsyncFunction() { // from class: com.google.android.libraries.places.internal.zzju
                @Override // com.google.common.util.concurrent.AsyncFunction
                public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture apply(java.lang.Object obj) {
                    return com.google.android.libraries.places.internal.zzjw.this.zzd((java.lang.String) obj, zzbgsVar);
                }
            }, com.google.common.util.concurrent.MoreExecutors.directExecutor()).transform(com.google.android.libraries.places.internal.zzjs.zza, com.google.common.util.concurrent.MoreExecutors.directExecutor()) : com.google.common.util.concurrent.Futures.immediateFuture(str);
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Token type %s does not match requested type %s", zzbgsVar2.name(), zzbgsVar.name()));
    }

    final com.google.common.util.concurrent.ListenableFuture zzd(java.lang.String str, com.google.android.libraries.places.internal.zzbgs zzbgsVar) {
        if (this.zzh) {
            throw new java.lang.IllegalStateException("Too many concurrent requests");
        }
        this.zzh = true;
        com.google.android.libraries.places.internal.zzbgr zzc = com.google.android.libraries.places.internal.zzbgt.zzc();
        zzc.zza(zzbgsVar);
        zzc.zzb(str);
        zzc.zzc(this.zzd.getPackageName());
        zzc.zzd(4);
        com.google.android.libraries.places.internal.zzbgt zzbgtVar = (com.google.android.libraries.places.internal.zzbgt) zzc.zzG();
        com.google.android.libraries.places.internal.zzbgv zzbgvVar = (com.google.android.libraries.places.internal.zzbgv) this.zzf.zze(com.google.android.libraries.places.internal.zzcei.zza(this.zzg.zza(this.zzi.zze(), "")));
        com.google.common.util.concurrent.ListenableFuture zzb = com.google.android.libraries.places.internal.zzcef.zzb(zzbgvVar.zzc().zza(com.google.android.libraries.places.internal.zzbgw.zzb(), zzbgvVar.zzd()), zzbgtVar);
        com.google.common.util.concurrent.Futures.addCallback(zzb, new com.google.android.libraries.places.internal.zzjr(this, zzbgsVar), com.google.common.util.concurrent.MoreExecutors.directExecutor());
        return zzb;
    }

    final boolean zze() {
        java.lang.Long l = this.zzb;
        if (l == null) {
            return true;
        }
        return java.time.Instant.ofEpochSecond(l.longValue()).isBefore(java.time.Instant.now());
    }

    final /* synthetic */ void zzf(boolean z) {
        this.zzh = false;
    }

    public final void zzc() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }
}
