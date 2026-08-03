package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzud extends com.google.android.gms.internal.ads.zzcp {
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;
    private byte[] zzh = com.google.android.gms.internal.ads.zzfl.zzb;
    private int zzi;
    private long zzj;

    @Override // com.google.android.gms.internal.ads.zzcp, com.google.android.gms.internal.ads.zzco
    public final long zza(long j) {
        return java.lang.Math.max(0L, j - com.google.android.gms.internal.ads.zzfl.zzt(this.zze + this.zzd, this.zzb.zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzd(java.nio.ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i == 0) {
            return;
        }
        int min = java.lang.Math.min(i, this.zzg);
        this.zzj += min / this.zzb.zze;
        this.zzg -= min;
        byteBuffer.position(position + min);
        if (this.zzg <= 0) {
            int i2 = i - min;
            int length = (this.zzi + i2) - this.zzh.length;
            java.nio.ByteBuffer zzk = zzk(length);
            int i3 = this.zzi;
            java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
            int max = java.lang.Math.max(0, java.lang.Math.min(length, i3));
            zzk.put(this.zzh, 0, max);
            int max2 = java.lang.Math.max(0, java.lang.Math.min(length - max, i2));
            byteBuffer.limit(byteBuffer.position() + max2);
            zzk.put(byteBuffer);
            byteBuffer.limit(limit);
            int i4 = i2 - max2;
            int i5 = this.zzi - max;
            this.zzi = i5;
            byte[] bArr = this.zzh;
            java.lang.System.arraycopy(bArr, max, bArr, 0, i5);
            byteBuffer.get(this.zzh, this.zzi, i4);
            this.zzi += i4;
            zzk.flip();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcp, com.google.android.gms.internal.ads.zzco
    public final java.nio.ByteBuffer zzf() {
        int i;
        if (super.zzg() && (i = this.zzi) > 0) {
            zzk(i).put(this.zzh, 0, this.zzi).flip();
            this.zzi = 0;
        }
        return super.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcp, com.google.android.gms.internal.ads.zzco
    public final boolean zzg() {
        return super.zzg() && this.zzi == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final com.google.android.gms.internal.ads.zzcl zzm(com.google.android.gms.internal.ads.zzcl zzclVar) throws com.google.android.gms.internal.ads.zzcn {
        if (!com.google.android.gms.internal.ads.zzfl.zzD(zzclVar.zzd)) {
            throw new com.google.android.gms.internal.ads.zzcn("Unhandled input format:", zzclVar);
        }
        this.zzf = true;
        return (this.zzd == 0 && this.zze == 0) ? com.google.android.gms.internal.ads.zzcl.zza : zzclVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    protected final void zzn() {
        if (this.zzf) {
            if (this.zzi > 0) {
                this.zzj += r0 / this.zzb.zze;
            }
            this.zzi = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    protected final void zzo(com.google.android.gms.internal.ads.zzcm zzcmVar) {
        if (this.zzf) {
            this.zzf = false;
            int i = this.zze;
            int i2 = this.zzb.zze;
            this.zzh = new byte[i * i2];
            this.zzg = this.zzd * i2;
        }
        this.zzi = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    protected final void zzp() {
        this.zzh = com.google.android.gms.internal.ads.zzfl.zzb;
    }

    public final void zzq(int i, int i2) {
        this.zzd = i;
        this.zze = i2;
    }

    public final void zzr() {
        this.zzj = 0L;
    }

    public final long zzs() {
        return this.zzj;
    }
}
