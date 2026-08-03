package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzjc extends com.google.android.gms.measurement.internal.zzfz {
    private final com.google.android.gms.measurement.internal.zzpf zza;
    private java.lang.Boolean zzb;
    private java.lang.String zzc;

    public zzjc(com.google.android.gms.measurement.internal.zzpf zzpfVar, java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzpfVar);
        this.zza = zzpfVar;
        this.zzc = null;
    }

    private final void zzM(com.google.android.gms.measurement.internal.zzbg zzbgVar, com.google.android.gms.measurement.internal.zzr zzrVar) {
        com.google.android.gms.measurement.internal.zzpf zzpfVar = this.zza;
        zzpfVar.zzY();
        zzpfVar.zzF(zzbgVar, zzrVar);
    }

    private final void zzN(com.google.android.gms.measurement.internal.zzr zzrVar, boolean z) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar);
        java.lang.String str = zzrVar.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzO(str, false);
        this.zza.zzt().zzA(zzrVar.zzb);
    }

    private final void zzO(java.lang.String str, boolean z) {
        boolean z2;
        if (android.text.TextUtils.isEmpty(str)) {
            this.zza.zzaV().zzb().zza("Measurement Service called without app package");
            throw new java.lang.SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.zzb == null) {
                    if (!"com.google.android.gms".equals(this.zzc)) {
                        com.google.android.gms.measurement.internal.zzpf zzpfVar = this.zza;
                        if (!com.google.android.gms.common.util.UidVerifier.isGooglePlayServicesUid(zzpfVar.zzaY(), android.os.Binder.getCallingUid()) && !com.google.android.gms.common.GoogleSignatureVerifier.getInstance(zzpfVar.zzaY()).isUidGoogleSigned(android.os.Binder.getCallingUid())) {
                            z2 = false;
                            this.zzb = java.lang.Boolean.valueOf(z2);
                        }
                    }
                    z2 = true;
                    this.zzb = java.lang.Boolean.valueOf(z2);
                }
                if (this.zzb.booleanValue()) {
                    return;
                }
            } catch (java.lang.SecurityException e) {
                this.zza.zzaV().zzb().zzb("Measurement Service called with invalid calling package. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str));
                throw e;
            }
        }
        if (this.zzc == null && com.google.android.gms.common.GooglePlayServicesUtilLight.uidHasPackageName(this.zza.zzaY(), android.os.Binder.getCallingUid(), str)) {
            this.zzc = str;
        }
        if (str.equals(this.zzc)) {
        } else {
            throw new java.lang.SecurityException(java.lang.String.format("Unknown calling package name '%s'.", str));
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final void zzA(com.google.android.gms.measurement.internal.zzr zzrVar) {
        zzN(zzrVar, false);
        zzd(new com.google.android.gms.measurement.internal.zzie(this, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final void zzB(com.google.android.gms.measurement.internal.zzr zzrVar, final com.google.android.gms.measurement.internal.zzon zzonVar, final com.google.android.gms.measurement.internal.zzgg zzggVar) {
        zzN(zzrVar, false);
        final java.lang.String str = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar.zza);
        this.zza.zzaW().zzj(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zziy
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.measurement.internal.zzjc.this.zzI(str, zzonVar, zzggVar);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final void zzC(final com.google.android.gms.measurement.internal.zzr zzrVar, final com.google.android.gms.measurement.internal.zzaf zzafVar) {
        zzN(zzrVar, false);
        zzd(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zziz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.measurement.internal.zzjc.this.zzJ(zzrVar, zzafVar);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final void zzD(final com.google.android.gms.measurement.internal.zzr zzrVar, final android.os.Bundle bundle, final com.google.android.gms.measurement.internal.zzgd zzgdVar) {
        zzN(zzrVar, false);
        final java.lang.String str = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar.zza);
        this.zza.zzaW().zzj(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zzix
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.measurement.internal.zzjc.this.zzH(zzrVar, bundle, zzgdVar, str);
            }
        });
    }

    final void zzE(java.lang.Runnable runnable) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(runnable);
        com.google.android.gms.measurement.internal.zzpf zzpfVar = this.zza;
        if (zzpfVar.zzaW().zze()) {
            runnable.run();
        } else {
            zzpfVar.zzaW().zzl(runnable);
        }
    }

    final /* synthetic */ void zzF(com.google.android.gms.measurement.internal.zzr zzrVar) {
        com.google.android.gms.measurement.internal.zzpf zzpfVar = this.zza;
        zzpfVar.zzY();
        zzpfVar.zzv(zzrVar);
    }

    final /* synthetic */ void zzG(com.google.android.gms.measurement.internal.zzr zzrVar) {
        com.google.android.gms.measurement.internal.zzpf zzpfVar = this.zza;
        zzpfVar.zzY();
        zzpfVar.zzw(zzrVar);
    }

    final /* synthetic */ void zzH(com.google.android.gms.measurement.internal.zzr zzrVar, android.os.Bundle bundle, com.google.android.gms.measurement.internal.zzgd zzgdVar, java.lang.String str) {
        com.google.android.gms.measurement.internal.zzpf zzpfVar = this.zza;
        zzpfVar.zzY();
        try {
            zzgdVar.zze(zzpfVar.zzap(zzrVar, bundle));
        } catch (android.os.RemoteException e) {
            this.zza.zzaV().zzb().zzc("Failed to return trigger URIs for app", str, e);
        }
    }

    final /* synthetic */ void zzI(java.lang.String str, com.google.android.gms.measurement.internal.zzon zzonVar, com.google.android.gms.measurement.internal.zzgg zzggVar) {
        com.google.android.gms.measurement.internal.zzpf zzpfVar = this.zza;
        zzpfVar.zzY();
        zzpfVar.zzaW().zzg();
        zzpfVar.zzu();
        java.util.List<com.google.android.gms.measurement.internal.zzpi> zzC = zzpfVar.zzj().zzC(str, zzonVar, ((java.lang.Integer) com.google.android.gms.measurement.internal.zzfx.zzA.zzb(null)).intValue());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.google.android.gms.measurement.internal.zzpi zzpiVar : zzC) {
            if (zzpfVar.zzO(str, zzpiVar.zze())) {
                int zzi = zzpiVar.zzi();
                if (zzi > 0) {
                    if (zzi <= ((java.lang.Integer) com.google.android.gms.measurement.internal.zzfx.zzy.zzb(null)).intValue()) {
                        if (zzpfVar.zzaZ().currentTimeMillis() >= zzpiVar.zzh() + java.lang.Math.min(((java.lang.Long) com.google.android.gms.measurement.internal.zzfx.zzw.zzb(null)).longValue() * (1 << (zzi - 1)), ((java.lang.Long) com.google.android.gms.measurement.internal.zzfx.zzx.zzb(null)).longValue())) {
                        }
                    }
                    zzpfVar.zzaV().zzk().zzd("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str, java.lang.Long.valueOf(zzpiVar.zzc()), java.lang.Long.valueOf(zzpiVar.zzh()));
                }
                com.google.android.gms.measurement.internal.zzol zzb = zzpiVar.zzb();
                try {
                    com.google.android.gms.internal.measurement.zzhz zzhzVar = (com.google.android.gms.internal.measurement.zzhz) com.google.android.gms.measurement.internal.zzpj.zzw(com.google.android.gms.internal.measurement.zzib.zzh(), zzb.zzb);
                    for (int i = 0; i < zzhzVar.zzb(); i++) {
                        com.google.android.gms.internal.measurement.zzic zzicVar = (com.google.android.gms.internal.measurement.zzic) zzhzVar.zzc(i).zzcl();
                        zzicVar.zzs(zzpfVar.zzaZ().currentTimeMillis());
                        zzhzVar.zzd(i, zzicVar);
                    }
                    zzb.zzb = ((com.google.android.gms.internal.measurement.zzib) zzhzVar.zzbc()).zzcc();
                    if (android.util.Log.isLoggable(zzpfVar.zzaV().zzn(), 2)) {
                        zzb.zzg = zzpfVar.zzp().zzi((com.google.android.gms.internal.measurement.zzib) zzhzVar.zzbc());
                    }
                    arrayList.add(zzb);
                } catch (com.google.android.gms.internal.measurement.zzmq unused) {
                    zzpfVar.zzaV().zze().zzb("Failed to parse queued batch. appId", str);
                }
            } else {
                zzpfVar.zzaV().zzk().zzd("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str, java.lang.Long.valueOf(zzpiVar.zzc()), zzpiVar.zze());
            }
        }
        com.google.android.gms.measurement.internal.zzop zzopVar = new com.google.android.gms.measurement.internal.zzop(arrayList);
        try {
            zzggVar.zze(zzopVar);
            this.zza.zzaV().zzk().zzc("[sgtm] Sending queued upload batches to client. appId, count", str, java.lang.Integer.valueOf(zzopVar.zza.size()));
        } catch (android.os.RemoteException e) {
            this.zza.zzaV().zzb().zzc("[sgtm] Failed to return upload batches for app", str, e);
        }
    }

    final /* synthetic */ void zzJ(com.google.android.gms.measurement.internal.zzr zzrVar, com.google.android.gms.measurement.internal.zzaf zzafVar) {
        com.google.android.gms.measurement.internal.zzpf zzpfVar = this.zza;
        zzpfVar.zzY();
        zzpfVar.zzaq((java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar.zza), zzafVar);
    }

    final /* synthetic */ void zzK(android.os.Bundle bundle, java.lang.String str, com.google.android.gms.measurement.internal.zzr zzrVar) {
        com.google.android.gms.measurement.internal.zzpf zzpfVar = this.zza;
        boolean zzp = zzpfVar.zzd().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzaV);
        if (bundle.isEmpty() && zzp) {
            com.google.android.gms.measurement.internal.zzav zzj = this.zza.zzj();
            zzj.zzg();
            zzj.zzay();
            try {
                zzj.zze().execSQL("delete from default_event_params where app_id=?", new java.lang.String[]{str});
                return;
            } catch (android.database.sqlite.SQLiteException e) {
                zzj.zzu.zzaV().zzb().zzb("Error clearing default event params", e);
                return;
            }
        }
        com.google.android.gms.measurement.internal.zzav zzj2 = zzpfVar.zzj();
        zzj2.zzg();
        zzj2.zzay();
        byte[] zzcc = zzj2.zzg.zzp().zzh(new com.google.android.gms.measurement.internal.zzbb(zzj2.zzu, "", str, "dep", 0L, 0L, bundle)).zzcc();
        com.google.android.gms.measurement.internal.zzib zzibVar = zzj2.zzu;
        zzibVar.zzaV().zzk().zzc("Saving default event parameters, appId, data size", str, java.lang.Integer.valueOf(zzcc.length));
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", zzcc);
        try {
            if (zzj2.zze().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                zzibVar.zzaV().zzb().zzb("Failed to insert default event parameters (got -1). appId", com.google.android.gms.measurement.internal.zzgt.zzl(str));
            }
        } catch (android.database.sqlite.SQLiteException e2) {
            zzj2.zzu.zzaV().zzb().zzc("Error storing default event parameters. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str), e2);
        }
        com.google.android.gms.measurement.internal.zzpf zzpfVar2 = this.zza;
        com.google.android.gms.measurement.internal.zzav zzj3 = zzpfVar2.zzj();
        long j = zzrVar.zzD;
        if (zzj3.zzX(str, j)) {
            zzpfVar2.zzj().zzY(str, java.lang.Long.valueOf(j), null, bundle);
        }
    }

    final /* synthetic */ com.google.android.gms.measurement.internal.zzpf zzL() {
        return this.zza;
    }

    final void zzb(com.google.android.gms.measurement.internal.zzbg zzbgVar, com.google.android.gms.measurement.internal.zzr zzrVar) {
        com.google.android.gms.measurement.internal.zzpf zzpfVar = this.zza;
        com.google.android.gms.measurement.internal.zzhs zzh = zzpfVar.zzh();
        java.lang.String str = zzrVar.zza;
        com.google.android.gms.internal.measurement.zzc zzcVar = android.text.TextUtils.isEmpty(str) ? null : (com.google.android.gms.internal.measurement.zzc) zzh.zzd.get(str);
        if (zzcVar == null) {
            this.zza.zzaV().zzk().zzb("EES not loaded for", zzrVar.zza);
            zzM(zzbgVar, zzrVar);
            return;
        }
        try {
            java.util.Map zzz = zzpfVar.zzp().zzz(zzbgVar.zzb.zzf(), true);
            java.lang.String str2 = zzbgVar.zza;
            java.lang.String zza = com.google.android.gms.measurement.internal.zzjl.zza(str2);
            if (zza != null) {
                str2 = zza;
            }
            if (zzcVar.zzb(new com.google.android.gms.internal.measurement.zzaa(str2, zzbgVar.zzd, zzz))) {
                if (zzcVar.zzc()) {
                    com.google.android.gms.measurement.internal.zzpf zzpfVar2 = this.zza;
                    zzpfVar2.zzaV().zzk().zzb("EES edited event", zzbgVar.zza);
                    zzM(zzpfVar2.zzp().zzA(zzcVar.zze().zzc()), zzrVar);
                } else {
                    zzM(zzbgVar, zzrVar);
                }
                if (zzcVar.zzd()) {
                    for (com.google.android.gms.internal.measurement.zzaa zzaaVar : zzcVar.zze().zzf()) {
                        com.google.android.gms.measurement.internal.zzpf zzpfVar3 = this.zza;
                        zzpfVar3.zzaV().zzk().zzb("EES logging created event", zzaaVar.zzb());
                        zzM(zzpfVar3.zzp().zzA(zzaaVar), zzrVar);
                    }
                    return;
                }
                return;
            }
        } catch (com.google.android.gms.internal.measurement.zzd unused) {
            this.zza.zzaV().zzb().zzc("EES error. appId, eventName", zzrVar.zzb, zzbgVar.zza);
        }
        this.zza.zzaV().zzk().zzb("EES was not applied to event", zzbgVar.zza);
        zzM(zzbgVar, zzrVar);
    }

    final com.google.android.gms.measurement.internal.zzbg zzc(com.google.android.gms.measurement.internal.zzbg zzbgVar, com.google.android.gms.measurement.internal.zzr zzrVar) {
        com.google.android.gms.measurement.internal.zzbe zzbeVar;
        if (com.google.firebase.messaging.Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(zzbgVar.zza) && (zzbeVar = zzbgVar.zzb) != null && zzbeVar.zze() != 0) {
            java.lang.String zzd = zzbeVar.zzd("_cis");
            if ("referrer broadcast".equals(zzd) || "referrer API".equals(zzd)) {
                this.zza.zzaV().zzi().zzb("Event has been filtered ", zzbgVar.toString());
                return new com.google.android.gms.measurement.internal.zzbg("_cmpx", zzbeVar, zzbgVar.zzc, zzbgVar.zzd);
            }
        }
        return zzbgVar;
    }

    final void zzd(java.lang.Runnable runnable) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(runnable);
        com.google.android.gms.measurement.internal.zzpf zzpfVar = this.zza;
        if (zzpfVar.zzaW().zze()) {
            runnable.run();
        } else {
            zzpfVar.zzaW().zzj(runnable);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final void zze(com.google.android.gms.measurement.internal.zzbg zzbgVar, com.google.android.gms.measurement.internal.zzr zzrVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzbgVar);
        zzN(zzrVar, false);
        zzd(new com.google.android.gms.measurement.internal.zziq(this, zzbgVar, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final void zzf(com.google.android.gms.measurement.internal.zzpk zzpkVar, com.google.android.gms.measurement.internal.zzr zzrVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzpkVar);
        zzN(zzrVar, false);
        zzd(new com.google.android.gms.measurement.internal.zzit(this, zzpkVar, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final void zzg(com.google.android.gms.measurement.internal.zzr zzrVar) {
        zzN(zzrVar, false);
        zzd(new com.google.android.gms.measurement.internal.zzid(this, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final void zzh(com.google.android.gms.measurement.internal.zzbg zzbgVar, java.lang.String str, java.lang.String str2) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzbgVar);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzO(str, true);
        zzd(new com.google.android.gms.measurement.internal.zzir(this, zzbgVar, str));
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final void zzi(com.google.android.gms.measurement.internal.zzr zzrVar) {
        zzN(zzrVar, false);
        zzd(new com.google.android.gms.measurement.internal.zzim(this, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final java.util.List zzj(com.google.android.gms.measurement.internal.zzr zzrVar, boolean z) {
        zzN(zzrVar, false);
        java.lang.String str = zzrVar.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        try {
            java.util.List<com.google.android.gms.measurement.internal.zzpm> list = (java.util.List) this.zza.zzaW().zzh(new com.google.android.gms.measurement.internal.zzic(this, str)).get();
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            for (com.google.android.gms.measurement.internal.zzpm zzpmVar : list) {
                if (z || !com.google.android.gms.measurement.internal.zzpo.zzZ(zzpmVar.zzc)) {
                    arrayList.add(new com.google.android.gms.measurement.internal.zzpk(zzpmVar));
                }
            }
            return arrayList;
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            this.zza.zzaV().zzb().zzc("Failed to get user properties. appId", com.google.android.gms.measurement.internal.zzgt.zzl(zzrVar.zza), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final byte[] zzk(com.google.android.gms.measurement.internal.zzbg zzbgVar, java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzbgVar);
        zzO(str, true);
        com.google.android.gms.measurement.internal.zzpf zzpfVar = this.zza;
        com.google.android.gms.measurement.internal.zzgr zzj = zzpfVar.zzaV().zzj();
        com.google.android.gms.measurement.internal.zzgm zzs = zzpfVar.zzs();
        java.lang.String str2 = zzbgVar.zza;
        zzj.zzb("Log and bundle. event", zzs.zza(str2));
        long nanoTime = zzpfVar.zzaZ().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) zzpfVar.zzaW().zzi(new com.google.android.gms.measurement.internal.zzis(this, zzbgVar, str)).get();
            if (bArr == null) {
                zzpfVar.zzaV().zzb().zzb("Log and bundle returned null. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str));
                bArr = new byte[0];
            }
            zzpfVar.zzaV().zzj().zzd("Log and bundle processed. event, size, time_ms", zzpfVar.zzs().zza(str2), java.lang.Integer.valueOf(bArr.length), java.lang.Long.valueOf((zzpfVar.zzaZ().nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            com.google.android.gms.measurement.internal.zzpf zzpfVar2 = this.zza;
            zzpfVar2.zzaV().zzb().zzd("Failed to log and bundle. appId, event, error", com.google.android.gms.measurement.internal.zzgt.zzl(str), zzpfVar2.zzs().zza(zzbgVar.zza), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final void zzl(long j, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        zzd(new com.google.android.gms.measurement.internal.zzif(this, str2, str3, str, j));
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final java.lang.String zzm(com.google.android.gms.measurement.internal.zzr zzrVar) {
        zzN(zzrVar, false);
        return this.zza.zzao(zzrVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final void zzn(com.google.android.gms.measurement.internal.zzah zzahVar, com.google.android.gms.measurement.internal.zzr zzrVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzahVar);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzahVar.zzc);
        zzN(zzrVar, false);
        com.google.android.gms.measurement.internal.zzah zzahVar2 = new com.google.android.gms.measurement.internal.zzah(zzahVar);
        zzahVar2.zza = zzrVar.zza;
        zzd(new com.google.android.gms.measurement.internal.zzig(this, zzahVar2, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final void zzo(com.google.android.gms.measurement.internal.zzah zzahVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzahVar);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzahVar.zzc);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(zzahVar.zza);
        zzO(zzahVar.zza, true);
        zzd(new com.google.android.gms.measurement.internal.zzih(this, new com.google.android.gms.measurement.internal.zzah(zzahVar)));
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final java.util.List zzp(java.lang.String str, java.lang.String str2, boolean z, com.google.android.gms.measurement.internal.zzr zzrVar) {
        zzN(zzrVar, false);
        java.lang.String str3 = zzrVar.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str3);
        try {
            java.util.List<com.google.android.gms.measurement.internal.zzpm> list = (java.util.List) this.zza.zzaW().zzh(new com.google.android.gms.measurement.internal.zzii(this, str3, str, str2)).get();
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            for (com.google.android.gms.measurement.internal.zzpm zzpmVar : list) {
                if (z || !com.google.android.gms.measurement.internal.zzpo.zzZ(zzpmVar.zzc)) {
                    arrayList.add(new com.google.android.gms.measurement.internal.zzpk(zzpmVar));
                }
            }
            return arrayList;
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            this.zza.zzaV().zzb().zzc("Failed to query user properties. appId", com.google.android.gms.measurement.internal.zzgt.zzl(zzrVar.zza), e);
            return java.util.Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final java.util.List zzq(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        zzO(str, true);
        try {
            java.util.List<com.google.android.gms.measurement.internal.zzpm> list = (java.util.List) this.zza.zzaW().zzh(new com.google.android.gms.measurement.internal.zzij(this, str, str2, str3)).get();
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            for (com.google.android.gms.measurement.internal.zzpm zzpmVar : list) {
                if (z || !com.google.android.gms.measurement.internal.zzpo.zzZ(zzpmVar.zzc)) {
                    arrayList.add(new com.google.android.gms.measurement.internal.zzpk(zzpmVar));
                }
            }
            return arrayList;
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            this.zza.zzaV().zzb().zzc("Failed to get user properties as. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str), e);
            return java.util.Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final java.util.List zzr(java.lang.String str, java.lang.String str2, com.google.android.gms.measurement.internal.zzr zzrVar) {
        zzN(zzrVar, false);
        java.lang.String str3 = zzrVar.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str3);
        try {
            return (java.util.List) this.zza.zzaW().zzh(new com.google.android.gms.measurement.internal.zzik(this, str3, str, str2)).get();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            this.zza.zzaV().zzb().zzb("Failed to get conditional user properties", e);
            return java.util.Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final java.util.List zzs(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        zzO(str, true);
        try {
            return (java.util.List) this.zza.zzaW().zzh(new com.google.android.gms.measurement.internal.zzil(this, str, str2, str3)).get();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            this.zza.zzaV().zzb().zzb("Failed to get conditional user properties as", e);
            return java.util.Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final void zzt(com.google.android.gms.measurement.internal.zzr zzrVar) {
        java.lang.String str = zzrVar.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzO(str, false);
        zzd(new com.google.android.gms.measurement.internal.zzin(this, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final void zzu(final android.os.Bundle bundle, final com.google.android.gms.measurement.internal.zzr zzrVar) {
        zzN(zzrVar, false);
        final java.lang.String str = zzrVar.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        zzd(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zzja
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.measurement.internal.zzjc.this.zzK(bundle, str, zzrVar);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final void zzv(com.google.android.gms.measurement.internal.zzr zzrVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(zzrVar.zza);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar.zzs);
        zzE(new com.google.android.gms.measurement.internal.zzio(this, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final com.google.android.gms.measurement.internal.zzao zzw(com.google.android.gms.measurement.internal.zzr zzrVar) {
        zzN(zzrVar, false);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(zzrVar.zza);
        try {
            return (com.google.android.gms.measurement.internal.zzao) this.zza.zzaW().zzi(new com.google.android.gms.measurement.internal.zzip(this, zzrVar)).get(10000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException e) {
            this.zza.zzaV().zzb().zzc("Failed to get consent. appId", com.google.android.gms.measurement.internal.zzgt.zzl(zzrVar.zza), e);
            return new com.google.android.gms.measurement.internal.zzao(null);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final java.util.List zzx(com.google.android.gms.measurement.internal.zzr zzrVar, android.os.Bundle bundle) {
        zzN(zzrVar, false);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar.zza);
        com.google.android.gms.measurement.internal.zzpf zzpfVar = this.zza;
        if (!zzpfVar.zzd().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzaY)) {
            try {
                return (java.util.List) this.zza.zzaW().zzh(new com.google.android.gms.measurement.internal.zziv(this, zzrVar, bundle)).get();
            } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
                this.zza.zzaV().zzb().zzc("Failed to get trigger URIs. appId", com.google.android.gms.measurement.internal.zzgt.zzl(zzrVar.zza), e);
                return java.util.Collections.emptyList();
            }
        }
        try {
            return (java.util.List) zzpfVar.zzaW().zzi(new com.google.android.gms.measurement.internal.zziu(this, zzrVar, bundle)).get(10000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException e2) {
            this.zza.zzaV().zzb().zzc("Failed to get trigger URIs. appId", com.google.android.gms.measurement.internal.zzgt.zzl(zzrVar.zza), e2);
            return java.util.Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final void zzy(final com.google.android.gms.measurement.internal.zzr zzrVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(zzrVar.zza);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar.zzs);
        zzE(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zzjb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.measurement.internal.zzjc.this.zzF(zzrVar);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzga
    public final void zzz(final com.google.android.gms.measurement.internal.zzr zzrVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(zzrVar.zza);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar.zzs);
        zzE(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zziw
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.measurement.internal.zzjc.this.zzG(zzrVar);
            }
        });
    }
}
