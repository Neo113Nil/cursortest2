package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzcbn implements java.lang.Runnable, com.google.android.libraries.places.internal.zzccw {
    final com.google.android.libraries.places.internal.zzccx zza;
    boolean zzb;
    final /* synthetic */ com.google.android.libraries.places.internal.zzcbp zzc;
    private final com.google.android.libraries.places.internal.zzcbs zzd;

    zzcbn(com.google.android.libraries.places.internal.zzcbp zzcbpVar, com.google.android.libraries.places.internal.zzccx zzccxVar) {
        java.util.Objects.requireNonNull(zzcbpVar);
        this.zzc = zzcbpVar;
        this.zzd = new com.google.android.libraries.places.internal.zzcbs(java.util.logging.Level.FINE, com.google.android.libraries.places.internal.zzcbp.class);
        this.zzb = true;
        this.zza = zzccxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.logging.Logger logger;
        java.util.logging.Logger logger2;
        com.google.android.libraries.places.internal.zzbnp zzP;
        java.lang.String name2 = java.lang.Thread.currentThread().getName();
        java.lang.Thread.currentThread().setName("OkHttpClientTransport");
        while (this.zza.zza(this)) {
            try {
                com.google.android.libraries.places.internal.zzcbp zzcbpVar = this.zzc;
                if (zzcbpVar.zzY() != null) {
                    zzcbpVar.zzY().zza();
                }
            } catch (java.lang.Throwable th) {
                try {
                    this.zzc.zzu(0, com.google.android.libraries.places.internal.zzccv.PROTOCOL_ERROR, com.google.android.libraries.places.internal.zzbnp.zzh.zze("error in frame handler").zzd(th));
                } catch (java.lang.Throwable th2) {
                    try {
                        this.zza.close();
                    } catch (java.io.IOException e) {
                        logger = com.google.android.libraries.places.internal.zzcbp.zzf;
                        logger.logp(java.util.logging.Level.INFO, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "run", "Exception closing frame reader", (java.lang.Throwable) e);
                    } catch (java.lang.RuntimeException e2) {
                        if (!"bio == null".equals(e2.getMessage())) {
                            throw e2;
                        }
                    }
                    this.zzc.zzD().zze();
                    java.lang.Thread.currentThread().setName(name2);
                    throw th2;
                }
            }
        }
        com.google.android.libraries.places.internal.zzcbp zzcbpVar2 = this.zzc;
        synchronized (zzcbpVar2.zzG()) {
            zzP = zzcbpVar2.zzP();
        }
        if (zzP == null) {
            zzP = com.google.android.libraries.places.internal.zzbnp.zzi.zze("End of stream or IOException");
        }
        this.zzc.zzu(0, com.google.android.libraries.places.internal.zzccv.INTERNAL_ERROR, zzP);
        try {
            this.zza.close();
        } catch (java.io.IOException e3) {
            logger2 = com.google.android.libraries.places.internal.zzcbp.zzf;
            logger2.logp(java.util.logging.Level.INFO, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "run", "Exception closing frame reader", (java.lang.Throwable) e3);
        } catch (java.lang.RuntimeException e4) {
            if (!"bio == null".equals(e4.getMessage())) {
                throw e4;
            }
        }
        this.zzc.zzD().zze();
        java.lang.Thread.currentThread().setName(name2);
    }

    @Override // com.google.android.libraries.places.internal.zzccw
    public final void zza(boolean z, int i, com.google.android.libraries.places.internal.zzcfh zzcfhVar, int i2, int i3) throws java.io.IOException {
        this.zzd.zza(1, i, zzcfhVar.zze(), i2, z);
        com.google.android.libraries.places.internal.zzcbp zzcbpVar = this.zzc;
        com.google.android.libraries.places.internal.zzcbg zzp = zzcbpVar.zzp(i);
        if (zzp != null) {
            long j = i2;
            zzcfhVar.zzg(j);
            com.google.android.libraries.places.internal.zzcff zzcffVar = new com.google.android.libraries.places.internal.zzcff();
            zzcffVar.zzc(zzcfhVar.zze(), j);
            zzp.zzy().zzI();
            synchronized (this.zzc.zzG()) {
                zzp.zzy().zzH(zzcffVar, z, i3 - i2);
            }
        } else {
            if (!zzcbpVar.zzo(i)) {
                com.google.android.libraries.places.internal.zzcbp zzcbpVar2 = this.zzc;
                com.google.android.libraries.places.internal.zzccv zzccvVar = com.google.android.libraries.places.internal.zzccv.PROTOCOL_ERROR;
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 34);
                sb.append("Received data for unknown stream: ");
                sb.append(i);
                zzcbpVar2.zzt(zzccvVar, sb.toString());
                return;
            }
            synchronized (zzcbpVar.zzG()) {
                zzcbpVar.zzE().zzb(i, com.google.android.libraries.places.internal.zzccv.STREAM_CLOSED);
            }
            zzcfhVar.zzt(i2);
        }
        com.google.android.libraries.places.internal.zzcbp zzcbpVar3 = this.zzc;
        zzcbpVar3.zzK(zzcbpVar3.zzJ() + i3);
        if (zzcbpVar3.zzJ() >= zzcbpVar3.zzB() * 0.5f) {
            synchronized (zzcbpVar3.zzG()) {
                zzcbpVar3.zzE().zzk(0, zzcbpVar3.zzJ());
            }
            this.zzc.zzK(0);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzccw
    public final void zzb(int i, com.google.android.libraries.places.internal.zzccv zzccvVar) {
        boolean z = true;
        this.zzd.zzc(1, i, zzccvVar);
        com.google.android.libraries.places.internal.zzbnp zzf = com.google.android.libraries.places.internal.zzcbp.zzq(zzccvVar).zzf("Rst Stream");
        if (zzf.zzg() != com.google.android.libraries.places.internal.zzbnm.CANCELLED && zzf.zzg() != com.google.android.libraries.places.internal.zzbnm.DEADLINE_EXCEEDED) {
            z = false;
        }
        boolean z2 = z;
        com.google.android.libraries.places.internal.zzcbp zzcbpVar = this.zzc;
        synchronized (zzcbpVar.zzG()) {
            com.google.android.libraries.places.internal.zzcbg zzcbgVar = (com.google.android.libraries.places.internal.zzcbg) zzcbpVar.zzH().get(java.lang.Integer.valueOf(i));
            if (zzcbgVar != null) {
                zzcbgVar.zzy().zzI();
                zzcbpVar.zzn(i, zzf, zzccvVar == com.google.android.libraries.places.internal.zzccv.REFUSED_STREAM ? com.google.android.libraries.places.internal.zzbpm.REFUSED : com.google.android.libraries.places.internal.zzbpm.PROCESSED, z2, null, null);
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzccw
    public final void zzc(boolean z, com.google.android.libraries.places.internal.zzcdk zzcdkVar) {
        boolean z2;
        this.zzd.zze(1, zzcdkVar);
        com.google.android.libraries.places.internal.zzcbp zzcbpVar = this.zzc;
        synchronized (zzcbpVar.zzG()) {
            if (zzcdkVar.zzb(4)) {
                zzcbpVar.zzW(zzcdkVar.zzc(4));
            }
            if (zzcdkVar.zzb(7)) {
                z2 = zzcbpVar.zzF().zza(zzcdkVar.zzc(7));
            } else {
                z2 = false;
            }
            if (this.zzb) {
                com.google.android.libraries.places.internal.zzbwc zzD = zzcbpVar.zzD();
                com.google.android.libraries.places.internal.zzbio zzN = zzcbpVar.zzN();
                zzD.zza(zzN);
                zzcbpVar.zzO(zzN);
                zzcbpVar.zzD().zzb();
                this.zzb = false;
            }
            zzcbpVar.zzE().zza(zzcdkVar);
            if (z2) {
                zzcbpVar.zzF().zzf();
            }
            zzcbpVar.zzr();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzccw
    public final void zzd(boolean z, int i, int i2) {
        com.google.android.libraries.places.internal.zzbtd zzbtdVar;
        java.util.logging.Logger logger;
        java.util.logging.Logger logger2;
        long j = (i << 32) | (i2 & 4294967295L);
        this.zzd.zzf(1, j);
        if (!z) {
            com.google.android.libraries.places.internal.zzcbp zzcbpVar = this.zzc;
            synchronized (zzcbpVar.zzG()) {
                zzcbpVar.zzE().zzc(true, i, i2);
            }
            return;
        }
        com.google.android.libraries.places.internal.zzcbp zzcbpVar2 = this.zzc;
        synchronized (zzcbpVar2.zzG()) {
            zzbtdVar = null;
            if (zzcbpVar2.zzQ() == null) {
                logger = com.google.android.libraries.places.internal.zzcbp.zzf;
                logger.logp(java.util.logging.Level.WARNING, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "ping", "Received unexpected ping ack. No ping outstanding");
            } else if (zzcbpVar2.zzQ().zza() == j) {
                com.google.android.libraries.places.internal.zzbtd zzQ = zzcbpVar2.zzQ();
                zzcbpVar2.zzR(null);
                zzbtdVar = zzQ;
            } else {
                logger2 = com.google.android.libraries.places.internal.zzcbp.zzf;
                logger2.logp(java.util.logging.Level.WARNING, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "ping", java.lang.String.format(java.util.Locale.US, "Received unexpected ping ack. Expecting %d, got %d", java.lang.Long.valueOf(zzcbpVar2.zzQ().zza()), java.lang.Long.valueOf(j)));
            }
        }
        if (zzbtdVar != null) {
            zzbtdVar.zzb();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzccw
    public final void zze(int i, com.google.android.libraries.places.internal.zzccv zzccvVar, com.google.android.libraries.places.internal.zzcfj zzcfjVar) {
        java.util.logging.Logger logger;
        this.zzd.zzi(1, i, zzccvVar, zzcfjVar);
        if (zzccvVar == com.google.android.libraries.places.internal.zzccv.ENHANCE_YOUR_CALM) {
            java.lang.String zze = zzcfjVar.zze();
            java.util.logging.Level level = java.util.logging.Level.WARNING;
            java.lang.String format = java.lang.String.format("%s: Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: %s", this, zze);
            logger = com.google.android.libraries.places.internal.zzcbp.zzf;
            logger.logp(level, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "goAway", format);
            if ("too_many_pings".equals(zze)) {
                this.zzc.zzZ().run();
            }
        }
        com.google.android.libraries.places.internal.zzbnp zzf = com.google.android.libraries.places.internal.zzbsx.zza(zzccvVar.zzs).zzf("Received Goaway");
        if (zzcfjVar.zzj() > 0) {
            zzf = zzf.zzf(zzcfjVar.zze());
        }
        this.zzc.zzu(i, null, zzf);
    }

    @Override // com.google.android.libraries.places.internal.zzccw
    public final void zzf(int i, int i2, java.util.List list) throws java.io.IOException {
        this.zzd.zzh(1, i, i2, list);
        com.google.android.libraries.places.internal.zzcbp zzcbpVar = this.zzc;
        synchronized (zzcbpVar.zzG()) {
            zzcbpVar.zzE().zzb(i, com.google.android.libraries.places.internal.zzccv.PROTOCOL_ERROR);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (r0.zzo(r6) == false) goto L15;
     */
    @Override // com.google.android.libraries.places.internal.zzccw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzg(int i, long j) {
        boolean z = true;
        this.zzd.zzj(1, i, j);
        com.google.android.libraries.places.internal.zzcbp zzcbpVar = this.zzc;
        synchronized (zzcbpVar.zzG()) {
            if (i == 0) {
                zzcbpVar.zzF().zzb(null, (int) j);
                return;
            }
            com.google.android.libraries.places.internal.zzcbg zzcbgVar = (com.google.android.libraries.places.internal.zzcbg) zzcbpVar.zzH().get(java.lang.Integer.valueOf(i));
            if (zzcbgVar != null) {
                zzcbpVar.zzF().zzb(zzcbgVar.zzy().zzK(), (int) j);
            }
            z = false;
            if (z) {
                com.google.android.libraries.places.internal.zzcbp zzcbpVar2 = this.zzc;
                com.google.android.libraries.places.internal.zzccv zzccvVar = com.google.android.libraries.places.internal.zzccv.PROTOCOL_ERROR;
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 43);
                sb.append("Received window_update for unknown stream: ");
                sb.append(i);
                zzcbpVar2.zzt(zzccvVar, sb.toString());
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzccw
    public final void zzh(boolean z, boolean z2, int i, int i2, java.util.List list, int i3) {
        boolean z3 = true;
        this.zzd.zzb(1, i, list, z2);
        com.google.android.libraries.places.internal.zzcbp zzcbpVar = this.zzc;
        com.google.android.libraries.places.internal.zzbnp zzbnpVar = null;
        if (zzcbpVar.zzaa() != Integer.MAX_VALUE) {
            long j = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                com.google.android.libraries.places.internal.zzccz zzcczVar = (com.google.android.libraries.places.internal.zzccz) list.get(i4);
                j += zzcczVar.zzf.zzj() + 32 + zzcczVar.zzg.zzj();
            }
            int min = (int) java.lang.Math.min(j, androidx.collection.SieveCacheKt.NodeLinkMask);
            if (min > zzcbpVar.zzaa()) {
                zzbnpVar = com.google.android.libraries.places.internal.zzbnp.zzf.zze(java.lang.String.format(java.util.Locale.US, "Response %s metadata larger than %d: %d", true != z2 ? com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER : "trailer", java.lang.Integer.valueOf(zzcbpVar.zzaa()), java.lang.Integer.valueOf(min)));
            }
        }
        synchronized (zzcbpVar.zzG()) {
            com.google.android.libraries.places.internal.zzcbg zzcbgVar = (com.google.android.libraries.places.internal.zzcbg) zzcbpVar.zzH().get(java.lang.Integer.valueOf(i));
            if (zzcbgVar == null) {
                if (zzcbpVar.zzo(i)) {
                    zzcbpVar.zzE().zzb(i, com.google.android.libraries.places.internal.zzccv.STREAM_CLOSED);
                }
            } else if (zzbnpVar == null) {
                zzcbgVar.zzy().zzI();
                zzcbgVar.zzy().zzG(list, z2);
            } else {
                if (!z2) {
                    zzcbpVar.zzE().zzb(i, com.google.android.libraries.places.internal.zzccv.CANCEL);
                }
                zzcbgVar.zzy().zzg(zzbnpVar, com.google.android.libraries.places.internal.zzbpm.PROCESSED, false, new com.google.android.libraries.places.internal.zzbmg());
            }
            z3 = false;
        }
        if (z3) {
            com.google.android.libraries.places.internal.zzcbp zzcbpVar2 = this.zzc;
            com.google.android.libraries.places.internal.zzccv zzccvVar = com.google.android.libraries.places.internal.zzccv.PROTOCOL_ERROR;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 36);
            sb.append("Received header for unknown stream: ");
            sb.append(i);
            zzcbpVar2.zzt(zzccvVar, sb.toString());
        }
    }
}
