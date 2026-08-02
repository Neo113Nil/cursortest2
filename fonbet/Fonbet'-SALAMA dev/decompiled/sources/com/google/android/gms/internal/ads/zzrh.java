package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class zzrh extends zzch {
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;
    private byte[] zzh = zzen.zzc;
    private int zzi;
    private long zzj;

    @Override // com.google.android.gms.internal.ads.zzch, com.google.android.gms.internal.ads.zzcg
    public final ByteBuffer zzb() {
        int i7;
        if (super.zzh() && (i7 = this.zzi) > 0) {
            zzj(i7).put(this.zzh, 0, this.zzi).flip();
            this.zzi = 0;
        }
        return super.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zze(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i7 = limit - position;
        if (i7 == 0) {
            return;
        }
        int min = Math.min(i7, this.zzg);
        this.zzj += min / this.zzb.zze;
        this.zzg -= min;
        byteBuffer.position(position + min);
        if (this.zzg <= 0) {
            int i8 = i7 - min;
            int length = (this.zzi + i8) - this.zzh.length;
            ByteBuffer zzj = zzj(length);
            int i9 = this.zzi;
            int i10 = zzen.zza;
            int max = Math.max(0, Math.min(length, i9));
            zzj.put(this.zzh, 0, max);
            int max2 = Math.max(0, Math.min(length - max, i8));
            byteBuffer.limit(byteBuffer.position() + max2);
            zzj.put(byteBuffer);
            byteBuffer.limit(limit);
            int i11 = i8 - max2;
            int i12 = this.zzi - max;
            this.zzi = i12;
            byte[] bArr = this.zzh;
            System.arraycopy(bArr, max, bArr, 0, i12);
            byteBuffer.get(this.zzh, this.zzi, i11);
            this.zzi += i11;
            zzj.flip();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzch, com.google.android.gms.internal.ads.zzcg
    public final boolean zzh() {
        return super.zzh() && this.zzi == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final zzce zzi(zzce zzceVar) {
        if (zzceVar.zzd != 2) {
            throw new zzcf("Unhandled input format:", zzceVar);
        }
        this.zzf = true;
        return (this.zzd == 0 && this.zze == 0) ? zzce.zza : zzceVar;
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final void zzk() {
        if (this.zzf) {
            this.zzf = false;
            int i7 = this.zze;
            int i8 = this.zzb.zze;
            this.zzh = new byte[i7 * i8];
            this.zzg = this.zzd * i8;
        }
        this.zzi = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final void zzl() {
        if (this.zzf) {
            if (this.zzi > 0) {
                this.zzj += r0 / this.zzb.zze;
            }
            this.zzi = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final void zzm() {
        this.zzh = zzen.zzc;
    }

    public final long zzo() {
        return this.zzj;
    }

    public final void zzp() {
        this.zzj = 0L;
    }

    public final void zzq(int i7, int i8) {
        this.zzd = i7;
        this.zze = i8;
    }
}
