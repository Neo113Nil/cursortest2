package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbwl implements com.google.android.libraries.places.internal.zzbsq {
    private final com.google.android.libraries.places.internal.zzbwk zza;
    private com.google.android.libraries.places.internal.zzcam zzc;
    private int zzd;
    private final com.google.android.libraries.places.internal.zzcan zzh;
    private final com.google.android.libraries.places.internal.zzcaa zzi;
    private boolean zzj;
    private int zzk;
    private long zzm;
    private int zzb = -1;
    private com.google.android.libraries.places.internal.zzbjj zze = com.google.android.libraries.places.internal.zzbjh.zza;
    private final com.google.android.libraries.places.internal.zzbwj zzf = new com.google.android.libraries.places.internal.zzbwj(this, null);
    private final java.nio.ByteBuffer zzg = java.nio.ByteBuffer.allocate(5);
    private int zzl = -1;

    public zzbwl(com.google.android.libraries.places.internal.zzbwk zzbwkVar, com.google.android.libraries.places.internal.zzcan zzcanVar, com.google.android.libraries.places.internal.zzcaa zzcaaVar) {
        this.zza = (com.google.android.libraries.places.internal.zzbwk) com.google.common.base.Preconditions.checkNotNull(zzbwkVar, "sink");
        this.zzh = (com.google.android.libraries.places.internal.zzcan) com.google.common.base.Preconditions.checkNotNull(zzcanVar, "bufferAllocator");
        this.zzi = (com.google.android.libraries.places.internal.zzcaa) com.google.common.base.Preconditions.checkNotNull(zzcaaVar, "statsTraceCtx");
    }

    private final void zzi(com.google.android.libraries.places.internal.zzbwi zzbwiVar, boolean z) {
        int zza = zzbwiVar.zza();
        int i = this.zzb;
        if (i >= 0 && zza > i) {
            throw new com.google.android.libraries.places.internal.zzbns(com.google.android.libraries.places.internal.zzbnp.zzf.zze(java.lang.String.format(java.util.Locale.US, "message too large %d > %d", java.lang.Integer.valueOf(zza), java.lang.Integer.valueOf(this.zzb))), null);
        }
        java.nio.ByteBuffer byteBuffer = this.zzg;
        byteBuffer.clear();
        byteBuffer.put(z ? (byte) 1 : (byte) 0).putInt(zza);
        com.google.android.libraries.places.internal.zzcam zza2 = this.zzh.zza(5);
        zza2.zza(byteBuffer.array(), 0, byteBuffer.position());
        if (zza == 0) {
            this.zzc = zza2;
            return;
        }
        com.google.android.libraries.places.internal.zzbwk zzbwkVar = this.zza;
        zzbwkVar.zzj(zza2, false, false, this.zzk - 1);
        this.zzk = 1;
        java.util.List zzb = zzbwiVar.zzb();
        for (int i2 = 0; i2 < zzb.size() - 1; i2++) {
            zzbwkVar.zzj((com.google.android.libraries.places.internal.zzcam) zzb.get(i2), false, false, 0);
        }
        this.zzc = (com.google.android.libraries.places.internal.zzcam) zzb.get(zzb.size() - 1);
        this.zzm = zza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int zzj(java.io.InputStream inputStream, java.io.OutputStream outputStream) throws java.io.IOException {
        return ((com.google.android.libraries.places.internal.zzbjz) inputStream).zza(outputStream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzk, reason: merged with bridge method [inline-methods] */
    public final void zzg(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            com.google.android.libraries.places.internal.zzcam zzcamVar = this.zzc;
            if (zzcamVar != null && zzcamVar.zzc() == 0) {
                zzl(false, false);
            }
            if (this.zzc == null) {
                com.google.common.base.Preconditions.checkState(this.zzd > 0, "knownLengthPendingAllocation reached 0");
                com.google.android.libraries.places.internal.zzcam zza = this.zzh.zza(this.zzd);
                this.zzc = zza;
                int i3 = this.zzd;
                this.zzd = i3 - java.lang.Math.min(i3, zza.zzc());
            }
            int min = java.lang.Math.min(i2, this.zzc.zzc());
            this.zzc.zza(bArr, i, min);
            i += min;
            i2 -= min;
        }
    }

    private final void zzl(boolean z, boolean z2) {
        com.google.android.libraries.places.internal.zzcam zzcamVar = this.zzc;
        this.zzc = null;
        this.zza.zzj(zzcamVar, z, z2, this.zzk);
        this.zzk = 0;
    }

    @Override // com.google.android.libraries.places.internal.zzbsq
    public final void zza(java.io.InputStream inputStream) {
        int zzj;
        if (this.zzj) {
            throw new java.lang.IllegalStateException("Framer already closed");
        }
        this.zzk++;
        int i = this.zzl + 1;
        this.zzl = i;
        this.zzm = 0L;
        this.zzi.zzf(i);
        com.google.android.libraries.places.internal.zzbjj zzbjjVar = this.zze;
        com.google.android.libraries.places.internal.zzbji zzbjiVar = com.google.android.libraries.places.internal.zzbjh.zza;
        try {
            int available = inputStream.available();
            if (available != 0 && zzbjjVar != zzbjiVar) {
                com.google.android.libraries.places.internal.zzbwi zzbwiVar = new com.google.android.libraries.places.internal.zzbwi(this, null);
                java.io.OutputStream zzb = this.zze.zzb(zzbwiVar);
                try {
                    zzj = zzj(inputStream, zzb);
                    zzb.close();
                    int i2 = this.zzb;
                    if (i2 >= 0 && zzj > i2) {
                        throw new com.google.android.libraries.places.internal.zzbns(com.google.android.libraries.places.internal.zzbnp.zzf.zze(java.lang.String.format(java.util.Locale.US, "message too large %d > %d", java.lang.Integer.valueOf(zzj), java.lang.Integer.valueOf(this.zzb))), null);
                    }
                    zzi(zzbwiVar, true);
                } catch (java.lang.Throwable th) {
                    zzb.close();
                    throw th;
                }
            } else if (available != -1) {
                this.zzm = available;
                int i3 = this.zzb;
                if (i3 >= 0 && available > i3) {
                    throw new com.google.android.libraries.places.internal.zzbns(com.google.android.libraries.places.internal.zzbnp.zzf.zze(java.lang.String.format(java.util.Locale.US, "message too large %d > %d", java.lang.Integer.valueOf(available), java.lang.Integer.valueOf(this.zzb))), null);
                }
                java.nio.ByteBuffer byteBuffer = this.zzg;
                byteBuffer.clear();
                byteBuffer.put((byte) 0).putInt(available);
                this.zzd = available + 5;
                zzg(byteBuffer.array(), 0, byteBuffer.position());
                zzj = zzj(inputStream, this.zzf);
            } else {
                com.google.android.libraries.places.internal.zzbwi zzbwiVar2 = new com.google.android.libraries.places.internal.zzbwi(this, null);
                zzj = zzj(inputStream, zzbwiVar2);
                zzi(zzbwiVar2, false);
            }
            if (available != -1 && zzj != available) {
                throw new com.google.android.libraries.places.internal.zzbns(com.google.android.libraries.places.internal.zzbnp.zzh.zze(java.lang.String.format("Message length inaccurate %s != %s", java.lang.Integer.valueOf(zzj), java.lang.Integer.valueOf(available))), null);
            }
            com.google.android.libraries.places.internal.zzcaa zzcaaVar = this.zzi;
            long j = zzj;
            zzcaaVar.zzj(j);
            zzcaaVar.zzk(this.zzm);
            zzcaaVar.zzh(this.zzl, this.zzm, j);
        } catch (com.google.android.libraries.places.internal.zzbns e) {
            throw e;
        } catch (java.io.IOException e2) {
            throw new com.google.android.libraries.places.internal.zzbns(com.google.android.libraries.places.internal.zzbnp.zzh.zze("Failed to frame message").zzd(e2), null);
        } catch (java.lang.RuntimeException e3) {
            throw new com.google.android.libraries.places.internal.zzbns(com.google.android.libraries.places.internal.zzbnp.zzh.zze("Failed to frame message").zzd(e3), null);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbsq
    public final void zzb() {
        com.google.android.libraries.places.internal.zzcam zzcamVar = this.zzc;
        if (zzcamVar == null || zzcamVar.zzd() <= 0) {
            return;
        }
        zzl(false, true);
    }

    @Override // com.google.android.libraries.places.internal.zzbsq
    public final void zzd() {
        if (this.zzj) {
            return;
        }
        this.zzj = true;
        com.google.android.libraries.places.internal.zzcam zzcamVar = this.zzc;
        if (zzcamVar != null && zzcamVar.zzd() == 0) {
            this.zzc = null;
        }
        zzl(true, true);
    }

    @Override // com.google.android.libraries.places.internal.zzbsq
    public final /* synthetic */ com.google.android.libraries.places.internal.zzbsq zze(com.google.android.libraries.places.internal.zzbjj zzbjjVar) {
        this.zze = (com.google.android.libraries.places.internal.zzbjj) com.google.common.base.Preconditions.checkNotNull(zzbjjVar, "Can't pass an empty compressor");
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzbsq
    public final void zzf(int i) {
        com.google.common.base.Preconditions.checkState(this.zzb == -1, "max size already set");
        this.zzb = i;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzcan zzh() {
        return this.zzh;
    }

    @Override // com.google.android.libraries.places.internal.zzbsq
    public final boolean zzc() {
        return this.zzj;
    }
}
