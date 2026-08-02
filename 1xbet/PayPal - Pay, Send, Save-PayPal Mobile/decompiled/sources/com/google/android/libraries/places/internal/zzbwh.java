package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbwh implements java.io.Closeable, com.google.android.libraries.places.internal.zzbqe {
    private com.google.android.libraries.places.internal.zzbwe zza;
    private int zzb;
    private final com.google.android.libraries.places.internal.zzcaa zzc;
    private final com.google.android.libraries.places.internal.zzcal zzd;
    private com.google.android.libraries.places.internal.zzbjw zze;
    private boolean zzg;
    private com.google.android.libraries.places.internal.zzbpy zzh;
    private long zzj;
    private int zzm;
    private int zzp = 1;
    private int zzf = 5;
    private com.google.android.libraries.places.internal.zzbpy zzi = new com.google.android.libraries.places.internal.zzbpy();
    private boolean zzk = false;
    private int zzl = -1;
    private boolean zzn = false;
    private volatile boolean zzo = false;

    public zzbwh(com.google.android.libraries.places.internal.zzbwe zzbweVar, com.google.android.libraries.places.internal.zzbjw zzbjwVar, int i, com.google.android.libraries.places.internal.zzcaa zzcaaVar, com.google.android.libraries.places.internal.zzcal zzcalVar) {
        this.zza = (com.google.android.libraries.places.internal.zzbwe) com.google.common.base.Preconditions.checkNotNull(zzbweVar, "sink");
        this.zze = (com.google.android.libraries.places.internal.zzbjw) com.google.common.base.Preconditions.checkNotNull(zzbjwVar, "decompressor");
        this.zzb = i;
        this.zzc = (com.google.android.libraries.places.internal.zzcaa) com.google.common.base.Preconditions.checkNotNull(zzcaaVar, "statsTraceCtx");
        this.zzd = (com.google.android.libraries.places.internal.zzcal) com.google.common.base.Preconditions.checkNotNull(zzcalVar, "transportTracer");
    }

    private final boolean zzh() {
        return this.zzi.zzf() == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x01b7, code lost:
    
        if (r12.zzn == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01bd, code lost:
    
        if (zzh() == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01bf, code lost:
    
        close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01c4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0060, code lost:
    
        if (r3 <= 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0062, code lost:
    
        r12.zza.zzD(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0069, code lost:
    
        if (r12.zzp != 2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006b, code lost:
    
        r12.zzc.zzm(r3);
        r12.zzm += r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0076, code lost:
    
        r3 = r12.zzp;
        r4 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007b, code lost:
    
        if (r3 == 0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007d, code lost:
    
        if (r4 == 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0118, code lost:
    
        r3 = r12.zzh.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0120, code lost:
    
        if ((r3 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE) != 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0124, code lost:
    
        if (1 == (r3 & 1)) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0126, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0129, code lost:
    
        r12.zzg = r3;
        r3 = r12.zzh;
        r3.zzd(4);
        r3 = r3.zzg() | (((r3.zzg() << 24) | (r3.zzg() << 16)) | (r3.zzg() << 8));
        r12.zzf = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x014c, code lost:
    
        if (r3 < 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0150, code lost:
    
        if (r3 > r12.zzb) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0152, code lost:
    
        r3 = r12.zzl + 1;
        r12.zzl = r3;
        r12.zzc.zzg(r3);
        r12.zzd.zzd();
        r12.zzp = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x018a, code lost:
    
        throw new com.google.android.libraries.places.internal.zzbns(com.google.android.libraries.places.internal.zzbnp.zzf.zze(java.lang.String.format(java.util.Locale.US, "gRPC message exceeds maximum size %d: %d", java.lang.Integer.valueOf(r12.zzb), java.lang.Integer.valueOf(r12.zzf))), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0128, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0198, code lost:
    
        throw new com.google.android.libraries.places.internal.zzbns(com.google.android.libraries.places.internal.zzbnp.zzh.zze("gRPC frame header malformed: reserved bits not zero"), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x007f, code lost:
    
        if (r4 == 1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00a5, code lost:
    
        r2 = r12.zzc;
        r7 = r12.zzl;
        r8 = r12.zzm;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ae, code lost:
    
        if (true == r12.zzg) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b0, code lost:
    
        r10 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b5, code lost:
    
        r2.zzi(r7, r8, r10);
        r12.zzm = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00bd, code lost:
    
        if (r12.zzg == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00bf, code lost:
    
        r3 = r12.zze;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c3, code lost:
    
        if (r3 == com.google.android.libraries.places.internal.zzbjh.zza) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c5, code lost:
    
        r4 = new com.google.android.libraries.places.internal.zzbwg(r3.zzc(new com.google.android.libraries.places.internal.zzbxp(r12.zzh)), r12.zzb, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00fe, code lost:
    
        r12.zzh = null;
        r12.zza.zzn(new com.google.android.libraries.places.internal.zzbwf(r4, null));
        r12.zzp = 1;
        r12.zzf = 5;
        r12.zzj--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00d8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00de, code lost:
    
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00ec, code lost:
    
        throw new com.google.android.libraries.places.internal.zzbns(com.google.android.libraries.places.internal.zzbnp.zzh.zze("Can't decode compressed gRPC message as compression not configured"), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00ed, code lost:
    
        r2.zzl(r12.zzh.zzf());
        r4 = new com.google.android.libraries.places.internal.zzbxp(r12.zzh);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00b2, code lost:
    
        r10 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0083, code lost:
    
        if (r3 == 1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0085, code lost:
    
        r0 = "BODY";
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x008a, code lost:
    
        r4 = new java.lang.StringBuilder(r0.length() + 15);
        r4.append("Invalid state: ");
        r4.append(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00a4, code lost:
    
        throw new java.lang.AssertionError(r4.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0088, code lost:
    
        r0 = "HEADER";
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0199, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzi() {
        int i;
        if (this.zzk) {
            return;
        }
        this.zzk = true;
        while (true) {
            try {
                if (this.zzj <= 0) {
                    break;
                }
                try {
                    if (this.zzh == null) {
                        this.zzh = new com.google.android.libraries.places.internal.zzbpy();
                    }
                    i = 0;
                    while (true) {
                        try {
                            int zzf = this.zzf - this.zzh.zzf();
                            if (zzf <= 0) {
                                break;
                            }
                            if (this.zzi.zzf() != 0) {
                                int min = java.lang.Math.min(zzf, this.zzi.zzf());
                                i += min;
                                this.zzh.zze(this.zzi.zzl(min));
                            } else if (i > 0) {
                                this.zza.zzD(i);
                                if (this.zzp == 2) {
                                    this.zzc.zzm(i);
                                    this.zzm += i;
                                }
                            }
                        } catch (java.lang.Throwable th) {
                            th = th;
                            if (i > 0) {
                                this.zza.zzD(i);
                                if (this.zzp == 2) {
                                    this.zzc.zzm(i);
                                    this.zzm += i;
                                }
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    i = 0;
                }
            } finally {
                this.zzk = false;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, com.google.android.libraries.places.internal.zzbqe
    public final void close() {
        if (zzg()) {
            return;
        }
        com.google.android.libraries.places.internal.zzbpy zzbpyVar = this.zzh;
        boolean z = false;
        if (zzbpyVar != null && zzbpyVar.zzf() > 0) {
            z = true;
        }
        try {
            com.google.android.libraries.places.internal.zzbpy zzbpyVar2 = this.zzi;
            if (zzbpyVar2 != null) {
                zzbpyVar2.close();
            }
            com.google.android.libraries.places.internal.zzbpy zzbpyVar3 = this.zzh;
            if (zzbpyVar3 != null) {
                zzbpyVar3.close();
            }
            this.zzi = null;
            this.zzh = null;
            this.zza.zzb(z);
        } catch (java.lang.Throwable th) {
            this.zzi = null;
            this.zzh = null;
            throw th;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbqe
    public final void zzb(com.google.android.libraries.places.internal.zzbjw zzbjwVar) {
        com.google.common.base.Preconditions.checkState(true, "Already set full stream decompressor");
        this.zze = (com.google.android.libraries.places.internal.zzbjw) com.google.common.base.Preconditions.checkNotNull(zzbjwVar, "Can't pass an empty decompressor");
    }

    @Override // com.google.android.libraries.places.internal.zzbqe
    public final void zzc(int i) {
        com.google.common.base.Preconditions.checkArgument(true, "numMessages must be > 0");
        if (zzg()) {
            return;
        }
        this.zzj += i;
        zzi();
    }

    @Override // com.google.android.libraries.places.internal.zzbqe
    public final void zzd(com.google.android.libraries.places.internal.zzbxo zzbxoVar) {
        boolean z;
        com.google.common.base.Preconditions.checkNotNull(zzbxoVar, com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        try {
            if (!zzg() && !this.zzn) {
                this.zzi.zze(zzbxoVar);
                try {
                    zzi();
                    return;
                } catch (java.lang.Throwable th) {
                    th = th;
                    z = false;
                    if (z) {
                        zzbxoVar.close();
                    }
                    throw th;
                }
            }
            zzbxoVar.close();
        } catch (java.lang.Throwable th2) {
            th = th2;
            z = true;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbqe
    public final void zze() {
        if (zzg()) {
            return;
        }
        if (zzh()) {
            close();
        } else {
            this.zzn = true;
        }
    }

    public final boolean zzg() {
        return this.zzi == null;
    }

    final void zzf(com.google.android.libraries.places.internal.zzbwe zzbweVar) {
        this.zza = zzbweVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbqe
    public final void zza(int i) {
        this.zzb = i;
    }
}
