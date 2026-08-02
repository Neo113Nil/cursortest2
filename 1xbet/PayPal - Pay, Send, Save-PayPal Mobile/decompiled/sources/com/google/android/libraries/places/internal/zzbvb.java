package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbvb extends com.google.android.libraries.places.internal.zzbmu {
    final com.google.android.libraries.places.internal.zzbuz zza;
    final com.google.android.libraries.places.internal.zzbmy zzb;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbvr zzc;

    zzbvb(com.google.android.libraries.places.internal.zzbvr zzbvrVar, com.google.android.libraries.places.internal.zzbuz zzbuzVar, com.google.android.libraries.places.internal.zzbmy zzbmyVar) {
        java.util.Objects.requireNonNull(zzbvrVar);
        this.zzc = zzbvrVar;
        this.zza = (com.google.android.libraries.places.internal.zzbuz) com.google.common.base.Preconditions.checkNotNull(zzbuzVar, "helperImpl");
        this.zzb = (com.google.android.libraries.places.internal.zzbmy) com.google.common.base.Preconditions.checkNotNull(zzbmyVar, "resolver");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final void zzb(com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        java.util.logging.Logger logger = com.google.android.libraries.places.internal.zzbvr.zza;
        java.util.logging.Level level = java.util.logging.Level.WARNING;
        com.google.android.libraries.places.internal.zzbvr zzbvrVar = this.zzc;
        logger.logp(level, "io.grpc.internal.ManagedChannelImpl$NameResolverListener", "handleErrorInSyncContext", "[{0}] Failed to resolve name. status={1}", new java.lang.Object[]{zzbvrVar.zzc(), zzbnpVar});
        zzbvrVar.zzY().zzd();
        if (zzbvrVar.zzal() != 3) {
            zzbvrVar.zzW().zzb(3, "Failed to resolve name: {0}", zzbnpVar);
            zzbvrVar.zzam(3);
        }
        com.google.android.libraries.places.internal.zzbuz zzbuzVar = this.zza;
        if (zzbuzVar != zzbvrVar.zzF()) {
            return;
        }
        zzbuzVar.zza.zzc().zzb(zzbnpVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbmu
    public final com.google.android.libraries.places.internal.zzbnp zza(com.google.android.libraries.places.internal.zzbmw zzbmwVar) {
        com.google.android.libraries.places.internal.zzbwb zzbwbVar;
        com.google.android.libraries.places.internal.zzbwb zzbwbVar2;
        com.google.android.libraries.places.internal.zzbvr zzbvrVar = this.zzc;
        com.google.android.libraries.places.internal.zzbnx zzbnxVar = zzbvrVar.zze;
        zzbnxVar.zzc();
        if (zzbvrVar.zzE() != this.zzb) {
            return com.google.android.libraries.places.internal.zzbnp.zza;
        }
        com.google.android.libraries.places.internal.zzbnr zzb = zzbmwVar.zzb();
        if (!zzb.zzc()) {
            zzb(zzb.zze());
            return zzb.zze();
        }
        java.util.List list = (java.util.List) zzb.zzd();
        zzbvrVar.zzW().zzb(1, "Resolved address: {0}, config={1}", list, zzbmwVar.zzc());
        if (zzbvrVar.zzal() != 2) {
            zzbvrVar.zzW().zzb(2, "Address resolved: {0}", list);
            zzbvrVar.zzam(2);
        }
        com.google.android.libraries.places.internal.zzbms zzd = zzbmwVar.zzd();
        com.google.android.libraries.places.internal.zzbkq zzbkqVar = (com.google.android.libraries.places.internal.zzbkq) zzbmwVar.zzc().zza(com.google.android.libraries.places.internal.zzbkq.zza);
        com.google.android.libraries.places.internal.zzbwb zzbwbVar3 = (zzd == null || zzd.zzc() == null) ? null : (com.google.android.libraries.places.internal.zzbwb) zzd.zzc();
        com.google.android.libraries.places.internal.zzbnp zzd2 = zzd != null ? zzd.zzd() : null;
        if (zzbvrVar.zzad()) {
            if (zzbwbVar3 != null) {
                if (zzbkqVar != null) {
                    zzbvrVar.zzY().zzc(zzbkqVar);
                    if (zzbwbVar3.zzb() != null) {
                        zzbvrVar.zzW().zza(1, "Method configs in service config will be discarded due to presence ofconfig-selector");
                    }
                } else {
                    zzbvrVar.zzY().zzc(zzbwbVar3.zzb());
                }
            } else if (zzd2 == null) {
                zzbvrVar.zzY().zzc(null);
                zzbwbVar3 = com.google.android.libraries.places.internal.zzbvr.zzg;
            } else {
                if (!zzbvrVar.zzab()) {
                    zzbvrVar.zzW().zza(2, "Fallback to error due to invalid first service config without default config");
                    com.google.android.libraries.places.internal.zzbnp zzd3 = zzd.zzd();
                    com.google.common.base.Preconditions.checkArgument(!zzd3.zzj(), "the error status must not be OK");
                    zzbnxVar.zzb(new com.google.android.libraries.places.internal.zzbva(this, zzd3));
                    zzbnxVar.zza();
                    return zzd.zzd();
                }
                zzbwbVar3 = zzbvrVar.zzZ();
            }
            if (!zzbwbVar3.equals(zzbvrVar.zzZ())) {
                zzbwbVar2 = com.google.android.libraries.places.internal.zzbvr.zzg;
                zzbvrVar.zzW().zzb(2, "Service config changed{0}", zzbwbVar3 == zzbwbVar2 ? " to empty" : "");
                zzbvrVar.zzaa(zzbwbVar3);
                zzbvrVar.zzai().zza = zzbwbVar3.zzd();
            }
            try {
                zzbvrVar.zzac(true);
            } catch (java.lang.RuntimeException e) {
                com.google.android.libraries.places.internal.zzbvr zzbvrVar2 = this.zzc;
                java.util.logging.Logger logger = com.google.android.libraries.places.internal.zzbvr.zza;
                java.util.logging.Level level = java.util.logging.Level.WARNING;
                java.lang.String valueOf = java.lang.String.valueOf(zzbvrVar2.zzc());
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 51);
                sb.append("[");
                sb.append(valueOf);
                sb.append("] Unexpected exception from parsing service config");
                logger.logp(level, "io.grpc.internal.ManagedChannelImpl$NameResolverListener", "onResult2", sb.toString(), (java.lang.Throwable) e);
            }
            zzbwbVar = zzbwbVar3;
        } else {
            if (zzbwbVar3 != null) {
                zzbvrVar.zzW().zza(2, "Service config from name resolver discarded by channel settings");
            }
            if (zzbkqVar != null) {
                zzbvrVar.zzW().zza(2, "Config selector from name resolver discarded by channel settings");
            }
            com.google.android.libraries.places.internal.zzbvl zzY = zzbvrVar.zzY();
            zzbwbVar = com.google.android.libraries.places.internal.zzbvr.zzg;
            zzY.zzc(zzbwbVar.zzb());
        }
        com.google.android.libraries.places.internal.zzbio zzc = zzbmwVar.zzc();
        com.google.android.libraries.places.internal.zzbuz zzbuzVar = this.zza;
        if (zzbuzVar != this.zzc.zzF()) {
            return com.google.android.libraries.places.internal.zzbnp.zza;
        }
        com.google.android.libraries.places.internal.zzbim zzc2 = zzc.zzc();
        zzc2.zzb(com.google.android.libraries.places.internal.zzbkq.zza);
        java.util.Map zza = zzbwbVar.zza();
        if (zza != null) {
            zzc2.zza(com.google.android.libraries.places.internal.zzblp.zza, zza);
            zzc2.zzc();
        }
        com.google.android.libraries.places.internal.zzbio zzc3 = zzc2.zzc();
        com.google.android.libraries.places.internal.zzblk zza2 = com.google.android.libraries.places.internal.zzbll.zza();
        zza2.zza((java.util.List) zzb.zzd());
        zza2.zzb(zzc3);
        zza2.zzc(zzbwbVar.zzc());
        return zzbuzVar.zza.zza(zza2.zzd());
    }
}
