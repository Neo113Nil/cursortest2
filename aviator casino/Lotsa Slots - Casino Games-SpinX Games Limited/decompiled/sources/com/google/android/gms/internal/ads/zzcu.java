package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcu implements com.google.android.gms.internal.ads.zzco {
    private int zzb;
    private float zzc = 1.0f;
    private float zzd = 1.0f;
    private com.google.android.gms.internal.ads.zzcl zze;
    private com.google.android.gms.internal.ads.zzcl zzf;
    private com.google.android.gms.internal.ads.zzcl zzg;
    private com.google.android.gms.internal.ads.zzcl zzh;
    private boolean zzi;
    private com.google.android.gms.internal.ads.zzct zzj;
    private java.nio.ByteBuffer zzk;
    private java.nio.ByteBuffer zzl;
    private long zzm;
    private long zzn;
    private boolean zzo;

    public zzcu() {
        com.google.android.gms.internal.ads.zzcl zzclVar = com.google.android.gms.internal.ads.zzcl.zza;
        this.zze = zzclVar;
        this.zzf = zzclVar;
        this.zzg = zzclVar;
        this.zzh = zzclVar;
        java.nio.ByteBuffer byteBuffer = zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer;
        this.zzb = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final long zza(long j) {
        if (this.zzn < 1024) {
            return (long) (j / this.zzc);
        }
        long j2 = this.zzm;
        this.zzj.getClass();
        long zza = j2 - r3.zza();
        int i = this.zzh.zzb;
        int i2 = this.zzg.zzb;
        return i == i2 ? com.google.android.gms.internal.ads.zzfl.zzv(j, this.zzn, zza, java.math.RoundingMode.DOWN) : com.google.android.gms.internal.ads.zzfl.zzv(j, this.zzn * i2, zza * i, java.math.RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final com.google.android.gms.internal.ads.zzcl zzb(com.google.android.gms.internal.ads.zzcl zzclVar) throws com.google.android.gms.internal.ads.zzcn {
        int i = zzclVar.zzd;
        if (i != 2 && i != 4) {
            throw new com.google.android.gms.internal.ads.zzcn("Unhandled input format:", zzclVar);
        }
        int i2 = this.zzb;
        if (i2 == -1) {
            i2 = zzclVar.zzb;
        }
        this.zze = zzclVar;
        com.google.android.gms.internal.ads.zzcl zzclVar2 = new com.google.android.gms.internal.ads.zzcl(i2, zzclVar.zzc, i);
        this.zzf = zzclVar2;
        this.zzi = true;
        return zzclVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final boolean zzc() {
        if (this.zzf.zzb != -1) {
            return java.lang.Math.abs(this.zzc + (-1.0f)) >= 1.0E-4f || java.lang.Math.abs(this.zzd + (-1.0f)) >= 1.0E-4f || this.zzf.zzb != this.zze.zzb;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzd(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            com.google.android.gms.internal.ads.zzct zzctVar = this.zzj;
            zzctVar.getClass();
            this.zzm += byteBuffer.remaining();
            zzctVar.zzb(byteBuffer);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zze() {
        com.google.android.gms.internal.ads.zzct zzctVar = this.zzj;
        if (zzctVar != null) {
            zzctVar.zzd();
        }
        this.zzo = true;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final java.nio.ByteBuffer zzf() {
        int zzf;
        com.google.android.gms.internal.ads.zzct zzctVar = this.zzj;
        if (zzctVar != null && (zzf = zzctVar.zzf()) > 0) {
            if (this.zzk.capacity() < zzf) {
                this.zzk = java.nio.ByteBuffer.allocateDirect(zzf).order(java.nio.ByteOrder.nativeOrder());
            } else {
                this.zzk.clear();
            }
            zzctVar.zzc(this.zzk);
            this.zzk.flip();
            this.zzn += zzf;
            this.zzl = this.zzk;
        }
        java.nio.ByteBuffer byteBuffer = this.zzl;
        this.zzl = zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final boolean zzg() {
        if (!this.zzo) {
            return false;
        }
        com.google.android.gms.internal.ads.zzct zzctVar = this.zzj;
        return zzctVar == null || zzctVar.zzf() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public /* synthetic */ void zzh() {
        com.google.android.gms.internal.ads.zzco.CC.$default$zzh(this);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzi(com.google.android.gms.internal.ads.zzcm zzcmVar) {
        if (zzc()) {
            com.google.android.gms.internal.ads.zzcl zzclVar = this.zze;
            this.zzg = zzclVar;
            this.zzh = this.zzf;
            if (this.zzi) {
                this.zzj = new com.google.android.gms.internal.ads.zzct(zzclVar.zzb, zzclVar.zzc, this.zzc, this.zzd, this.zzh.zzb, zzclVar.zzd == 4);
            } else {
                com.google.android.gms.internal.ads.zzct zzctVar = this.zzj;
                if (zzctVar != null) {
                    zzctVar.zze();
                }
            }
        }
        this.zzl = zza;
        this.zzm = 0L;
        this.zzn = 0L;
        this.zzo = false;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzj() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        com.google.android.gms.internal.ads.zzcl zzclVar = com.google.android.gms.internal.ads.zzcl.zza;
        this.zze = zzclVar;
        this.zzf = zzclVar;
        this.zzg = zzclVar;
        this.zzh = zzclVar;
        java.nio.ByteBuffer byteBuffer = zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer;
        this.zzb = -1;
        this.zzi = false;
        this.zzj = null;
        this.zzm = 0L;
        this.zzn = 0L;
        this.zzo = false;
    }

    public final void zzk(float f) {
        com.google.android.gms.internal.ads.zzgtj.zza(f > 0.0f);
        if (this.zzc != f) {
            this.zzc = f;
            this.zzi = true;
        }
    }

    public final void zzl(float f) {
        com.google.android.gms.internal.ads.zzgtj.zza(f > 0.0f);
        if (this.zzd != f) {
            this.zzd = f;
            this.zzi = true;
        }
    }

    public final long zzm(long j) {
        if (this.zzn < 1024) {
            return (long) (this.zzc * j);
        }
        long j2 = this.zzm;
        this.zzj.getClass();
        long zza = j2 - r3.zza();
        int i = this.zzh.zzb;
        int i2 = this.zzg.zzb;
        return i == i2 ? com.google.android.gms.internal.ads.zzfl.zzv(j, zza, this.zzn, java.math.RoundingMode.DOWN) : com.google.android.gms.internal.ads.zzfl.zzv(j, zza * i, this.zzn * i2, java.math.RoundingMode.DOWN);
    }
}
