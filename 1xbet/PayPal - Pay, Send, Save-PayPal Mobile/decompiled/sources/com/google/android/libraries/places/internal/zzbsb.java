package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbsb implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbse zza;
    private final com.google.android.libraries.places.internal.zzbmu zzb;

    zzbsb(com.google.android.libraries.places.internal.zzbse zzbseVar, com.google.android.libraries.places.internal.zzbmu zzbmuVar) {
        java.util.Objects.requireNonNull(zzbseVar);
        this.zza = zzbseVar;
        this.zzb = (com.google.android.libraries.places.internal.zzbmu) com.google.common.base.Preconditions.checkNotNull(zzbmuVar, "savedListener");
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.logging.Logger logger;
        java.util.logging.Logger logger2;
        java.util.logging.Logger logger3;
        java.util.logging.Logger logger4;
        logger = com.google.android.libraries.places.internal.zzbse.zzh;
        if (logger.isLoggable(java.util.logging.Level.FINER)) {
            com.google.android.libraries.places.internal.zzbse zzbseVar = this.zza;
            java.util.logging.Level level = java.util.logging.Level.FINER;
            java.lang.String concat = "Attempting DNS resolution of ".concat(java.lang.String.valueOf(zzbseVar.zzh()));
            logger4 = com.google.android.libraries.places.internal.zzbse.zzh;
            logger4.logp(level, "io.grpc.internal.DnsNameResolver$Resolve", "run", concat);
        }
        final com.google.android.libraries.places.internal.zzbrv zzbrvVar = null;
        try {
            try {
                com.google.android.libraries.places.internal.zzbse zzbseVar2 = this.zza;
                com.google.android.libraries.places.internal.zzbka zzf = zzbseVar2.zzf();
                final com.google.android.libraries.places.internal.zzbmv zza = com.google.android.libraries.places.internal.zzbmw.zza();
                if (zzf != null) {
                    logger2 = com.google.android.libraries.places.internal.zzbse.zzh;
                    if (logger2.isLoggable(java.util.logging.Level.FINER)) {
                        logger3 = com.google.android.libraries.places.internal.zzbse.zzh;
                        java.util.logging.Level level2 = java.util.logging.Level.FINER;
                        java.lang.String obj = zzf.toString();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 20);
                        sb.append("Using proxy address ");
                        sb.append(obj);
                        logger3.logp(level2, "io.grpc.internal.DnsNameResolver$Resolve", "run", sb.toString());
                    }
                    zza.zza(com.google.android.libraries.places.internal.zzbnr.zza(java.util.Collections.singletonList(zzf)));
                } else {
                    zzbrvVar = zzbseVar2.zze(false);
                    if (zzbrvVar.zza() != null) {
                        com.google.android.libraries.places.internal.zzbnx zzj = zzbseVar2.zzj();
                        zzj.zzb(new java.lang.Runnable() { // from class: com.google.android.libraries.places.internal.zzbrz
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                com.google.android.libraries.places.internal.zzbsb.this.zzc(zzbrvVar);
                            }
                        });
                        zzj.zza();
                        r0 = zzbrvVar.zza() == null;
                        com.google.android.libraries.places.internal.zzbnx zzj2 = zzbseVar2.zzj();
                        zzj2.zzb(new com.google.android.libraries.places.internal.zzbrx(this, r0));
                        zzj2.zza();
                        return;
                    }
                    if (zzbrvVar.zzc() != null) {
                        zza.zza(com.google.android.libraries.places.internal.zzbnr.zza(zzbrvVar.zzc()));
                    }
                    if (zzbrvVar.zze() != null) {
                        zza.zzb(zzbrvVar.zze());
                    }
                }
                com.google.android.libraries.places.internal.zzbnx zzj3 = zzbseVar2.zzj();
                zzj3.zzb(new java.lang.Runnable() { // from class: com.google.android.libraries.places.internal.zzbry
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.libraries.places.internal.zzbsb.this.zzb(zza);
                    }
                });
                zzj3.zza();
            } catch (java.io.IOException e) {
                com.google.android.libraries.places.internal.zzbnx zzj4 = this.zza.zzj();
                zzj4.zzb(new java.lang.Runnable() { // from class: com.google.android.libraries.places.internal.zzbsa
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.libraries.places.internal.zzbsb.this.zza(e);
                    }
                });
                zzj4.zza();
            }
        } finally {
            r0 = 0 != 0 && zzbrvVar.zza() == null;
            com.google.android.libraries.places.internal.zzbse zzbseVar3 = this.zza;
            com.google.android.libraries.places.internal.zzbrx zzbrxVar = new com.google.android.libraries.places.internal.zzbrx(this, r0);
            com.google.android.libraries.places.internal.zzbnx zzj5 = zzbseVar3.zzj();
            zzj5.zzb(zzbrxVar);
            zzj5.zza();
        }
    }

    final /* synthetic */ void zza(java.io.IOException iOException) {
        java.lang.String zzh = this.zza.zzh();
        com.google.android.libraries.places.internal.zzbmv zza = com.google.android.libraries.places.internal.zzbmw.zza();
        zza.zza(com.google.android.libraries.places.internal.zzbnr.zzb(com.google.android.libraries.places.internal.zzbnp.zzi.zze("Unable to resolve host ".concat(java.lang.String.valueOf(zzh))).zzd(iOException)));
        this.zzb.zza(zza.zzc());
    }

    final /* synthetic */ void zzb(com.google.android.libraries.places.internal.zzbmv zzbmvVar) {
        this.zzb.zza(zzbmvVar.zzc());
    }

    final /* synthetic */ void zzc(com.google.android.libraries.places.internal.zzbrv zzbrvVar) {
        com.google.android.libraries.places.internal.zzbnp zza = zzbrvVar.zza();
        com.google.android.libraries.places.internal.zzbmv zza2 = com.google.android.libraries.places.internal.zzbmw.zza();
        zza2.zza(com.google.android.libraries.places.internal.zzbnr.zzb(zza));
        this.zzb.zza(zza2.zzc());
    }
}
