package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class zzcj implements zzcg {
    private int zzb;
    private float zzc = 1.0f;
    private float zzd = 1.0f;
    private zzce zze;
    private zzce zzf;
    private zzce zzg;
    private zzce zzh;
    private boolean zzi;
    private zzci zzj;
    private ByteBuffer zzk;
    private ShortBuffer zzl;
    private ByteBuffer zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;

    public zzcj() {
        zzce zzceVar = zzce.zza;
        this.zze = zzceVar;
        this.zzf = zzceVar;
        this.zzg = zzceVar;
        this.zzh = zzceVar;
        ByteBuffer byteBuffer = zzcg.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = byteBuffer;
        this.zzb = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final zzce zza(zzce zzceVar) throws zzcf {
        if (zzceVar.zzd != 2) {
            throw new zzcf("Unhandled input format:", zzceVar);
        }
        int i7 = this.zzb;
        if (i7 == -1) {
            i7 = zzceVar.zzb;
        }
        this.zze = zzceVar;
        zzce zzceVar2 = new zzce(i7, zzceVar.zzc, 2);
        this.zzf = zzceVar2;
        this.zzi = true;
        return zzceVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final ByteBuffer zzb() {
        int iZza;
        zzci zzciVar = this.zzj;
        if (zzciVar != null && (iZza = zzciVar.zza()) > 0) {
            if (this.zzk.capacity() < iZza) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iZza).order(ByteOrder.nativeOrder());
                this.zzk = byteBufferOrder;
                this.zzl = byteBufferOrder.asShortBuffer();
            } else {
                this.zzk.clear();
                this.zzl.clear();
            }
            zzciVar.zzd(this.zzl);
            this.zzo += (long) iZza;
            this.zzk.limit(iZza);
            this.zzm = this.zzk;
        }
        ByteBuffer byteBuffer = this.zzm;
        this.zzm = zzcg.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zzc() {
        if (zzg()) {
            zzce zzceVar = this.zze;
            this.zzg = zzceVar;
            zzce zzceVar2 = this.zzf;
            this.zzh = zzceVar2;
            if (this.zzi) {
                this.zzj = new zzci(zzceVar.zzb, zzceVar.zzc, this.zzc, this.zzd, zzceVar2.zzb);
            } else {
                zzci zzciVar = this.zzj;
                if (zzciVar != null) {
                    zzciVar.zzc();
                }
            }
        }
        this.zzm = zzcg.zza;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zzd() {
        zzci zzciVar = this.zzj;
        if (zzciVar != null) {
            zzciVar.zze();
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zze(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            zzci zzciVar = this.zzj;
            zzciVar.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.zzn += (long) iRemaining;
            zzciVar.zzf(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zzf() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        zzce zzceVar = zzce.zza;
        this.zze = zzceVar;
        this.zzf = zzceVar;
        this.zzg = zzceVar;
        this.zzh = zzceVar;
        ByteBuffer byteBuffer = zzcg.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = byteBuffer;
        this.zzb = -1;
        this.zzi = false;
        this.zzj = null;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final boolean zzg() {
        if (this.zzf.zzb != -1) {
            return Math.abs(this.zzc + (-1.0f)) >= 1.0E-4f || Math.abs(this.zzd + (-1.0f)) >= 1.0E-4f || this.zzf.zzb != this.zze.zzb;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final boolean zzh() {
        if (!this.zzp) {
            return false;
        }
        zzci zzciVar = this.zzj;
        return zzciVar == null || zzciVar.zza() == 0;
    }

    public final long zzi(long j) {
        long j3 = this.zzo;
        if (j3 < 1024) {
            return (long) (((double) this.zzc) * j);
        }
        long j7 = this.zzn;
        zzci zzciVar = this.zzj;
        zzciVar.getClass();
        long jZzb = j7 - ((long) zzciVar.zzb());
        int i7 = this.zzh.zzb;
        int i8 = this.zzg.zzb;
        return i7 == i8 ? zzen.zzu(j, jZzb, j3, RoundingMode.DOWN) : zzen.zzu(j, jZzb * ((long) i7), j3 * ((long) i8), RoundingMode.DOWN);
    }

    public final void zzj(float f7) {
        zzcv.zzd(f7 > 0.0f);
        if (this.zzd != f7) {
            this.zzd = f7;
            this.zzi = true;
        }
    }

    public final void zzk(float f7) {
        zzcv.zzd(f7 > 0.0f);
        if (this.zzc != f7) {
            this.zzc = f7;
            this.zzi = true;
        }
    }
}
