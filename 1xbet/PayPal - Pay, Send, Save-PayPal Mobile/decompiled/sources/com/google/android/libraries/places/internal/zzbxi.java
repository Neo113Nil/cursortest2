package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbxi extends com.google.android.libraries.places.internal.zzblp {
    private final com.google.android.libraries.places.internal.zzblg zzf;
    private com.google.android.libraries.places.internal.zzblm zzg;
    private com.google.android.libraries.places.internal.zzbjn zzh = com.google.android.libraries.places.internal.zzbjn.IDLE;

    zzbxi(com.google.android.libraries.places.internal.zzblg zzblgVar) {
        this.zzf = (com.google.android.libraries.places.internal.zzblg) com.google.common.base.Preconditions.checkNotNull(zzblgVar, "helper");
    }

    private final void zzg(com.google.android.libraries.places.internal.zzbjn zzbjnVar, com.google.android.libraries.places.internal.zzbln zzblnVar) {
        this.zzh = zzbjnVar;
        this.zzf.zzb(zzbjnVar, zzblnVar);
    }

    @Override // com.google.android.libraries.places.internal.zzblp
    public final com.google.android.libraries.places.internal.zzbnp zza(com.google.android.libraries.places.internal.zzbll zzbllVar) {
        com.google.android.libraries.places.internal.zzbxe zzbxeVar;
        java.lang.Boolean bool;
        java.util.List zzc = zzbllVar.zzc();
        if (zzc.isEmpty()) {
            com.google.android.libraries.places.internal.zzbnp zzbnpVar = com.google.android.libraries.places.internal.zzbnp.zzi;
            java.lang.String valueOf = java.lang.String.valueOf(zzbllVar.zzc());
            java.lang.String valueOf2 = java.lang.String.valueOf(zzbllVar.zzd());
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 55 + java.lang.String.valueOf(valueOf2).length());
            sb.append("NameResolver returned no usable address. addrs=");
            sb.append(valueOf);
            sb.append(", attrs=");
            sb.append(valueOf2);
            com.google.android.libraries.places.internal.zzbnp zze = zzbnpVar.zze(sb.toString());
            zzb(zze);
            return zze;
        }
        if ((zzbllVar.zze() instanceof com.google.android.libraries.places.internal.zzbxe) && (bool = (zzbxeVar = (com.google.android.libraries.places.internal.zzbxe) zzbllVar.zze()).zza) != null && bool.booleanValue()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(zzc);
            java.lang.Long l = zzbxeVar.zzb;
            java.util.Collections.shuffle(arrayList, new java.util.Random());
            zzc = arrayList;
        }
        com.google.android.libraries.places.internal.zzblm zzblmVar = this.zzg;
        if (zzblmVar == null) {
            com.google.android.libraries.places.internal.zzblg zzblgVar = this.zzf;
            com.google.android.libraries.places.internal.zzblb zzd = com.google.android.libraries.places.internal.zzbld.zzd();
            zzd.zzb(zzc);
            com.google.android.libraries.places.internal.zzblm zza = zzblgVar.zza(zzd.zzc());
            zza.zza(new com.google.android.libraries.places.internal.zzbxd(this, zza));
            this.zzg = zza;
            zzg(com.google.android.libraries.places.internal.zzbjn.CONNECTING, new com.google.android.libraries.places.internal.zzbxf(com.google.android.libraries.places.internal.zzbli.zza(zza, null)));
            zza.zzc();
        } else {
            zzblmVar.zzd(zzc);
        }
        return com.google.android.libraries.places.internal.zzbnp.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzblp
    public final void zzb(com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        com.google.android.libraries.places.internal.zzblm zzblmVar = this.zzg;
        if (zzblmVar != null) {
            zzblmVar.zzb();
            this.zzg = null;
        }
        zzg(com.google.android.libraries.places.internal.zzbjn.TRANSIENT_FAILURE, new com.google.android.libraries.places.internal.zzbxf(com.google.android.libraries.places.internal.zzbli.zzb(zzbnpVar)));
    }

    @Override // com.google.android.libraries.places.internal.zzblp
    public final void zzc() {
        com.google.android.libraries.places.internal.zzblm zzblmVar = this.zzg;
        if (zzblmVar != null) {
            zzblmVar.zzb();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzblp
    public final void zzd() {
        com.google.android.libraries.places.internal.zzblm zzblmVar = this.zzg;
        if (zzblmVar != null) {
            zzblmVar.zzc();
        }
    }

    final /* synthetic */ void zze(com.google.android.libraries.places.internal.zzblm zzblmVar, com.google.android.libraries.places.internal.zzbjo zzbjoVar) {
        com.google.android.libraries.places.internal.zzbln zzbxfVar;
        com.google.android.libraries.places.internal.zzbxf zzbxfVar2;
        com.google.android.libraries.places.internal.zzbjn zzc = zzbjoVar.zzc();
        if (zzc != com.google.android.libraries.places.internal.zzbjn.SHUTDOWN) {
            com.google.android.libraries.places.internal.zzbjn zzbjnVar = com.google.android.libraries.places.internal.zzbjn.TRANSIENT_FAILURE;
            if (zzc == zzbjnVar || zzc == com.google.android.libraries.places.internal.zzbjn.IDLE) {
                this.zzf.zzc();
            }
            if (this.zzh == zzbjnVar) {
                if (zzc == com.google.android.libraries.places.internal.zzbjn.CONNECTING) {
                    return;
                }
                if (zzc == com.google.android.libraries.places.internal.zzbjn.IDLE) {
                    zzd();
                    return;
                }
            }
            int ordinal = zzc.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    zzbxfVar2 = new com.google.android.libraries.places.internal.zzbxf(com.google.android.libraries.places.internal.zzbli.zza(zzblmVar, null));
                } else if (ordinal == 2) {
                    zzbxfVar2 = new com.google.android.libraries.places.internal.zzbxf(com.google.android.libraries.places.internal.zzbli.zzb(zzbjoVar.zzd()));
                } else {
                    if (ordinal != 3) {
                        throw new java.lang.IllegalArgumentException("Unsupported state:".concat(java.lang.String.valueOf(java.lang.String.valueOf(zzc))));
                    }
                    zzbxfVar = new com.google.android.libraries.places.internal.zzbxh(this, null);
                }
                zzbxfVar = zzbxfVar2;
            } else {
                zzbxfVar = new com.google.android.libraries.places.internal.zzbxf(com.google.android.libraries.places.internal.zzbli.zzd());
            }
            zzg(zzc, zzbxfVar);
        }
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzblg zzf() {
        return this.zzf;
    }
}
