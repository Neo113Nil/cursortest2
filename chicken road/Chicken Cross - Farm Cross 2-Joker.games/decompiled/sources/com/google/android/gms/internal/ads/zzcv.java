package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzcv implements zzcp {
    private int zzb;
    private float zzc = 1.0f;
    private float zzd = 1.0f;
    private zzcl zze;
    private zzcl zzf;
    private zzcl zzg;
    private zzcl zzh;
    private boolean zzi;
    private zzcu zzj;
    private ByteBuffer zzk;
    private ByteBuffer zzl;
    private long zzm;
    private long zzn;
    private boolean zzo;

    public zzcv() {
        zzcl zzclVar = zzcl.zza;
        this.zze = zzclVar;
        this.zzf = zzclVar;
        this.zzg = zzclVar;
        this.zzh = zzclVar;
        ByteBuffer byteBuffer = zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer;
        this.zzb = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final long zza(long j) {
        if (this.zzn < 1024) {
            return (long) (j / this.zzc);
        }
        long j2 = this.zzm;
        this.zzj.getClass();
        long zza = j2 - r3.zza();
        int i = this.zzh.zzb;
        int i2 = this.zzg.zzb;
        return i == i2 ? zzfm.zzw(j, this.zzn, zza, RoundingMode.DOWN) : zzfm.zzw(j, this.zzn * i2, zza * i, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final zzcl zzb(zzcl zzclVar) throws zzco {
        int i = zzclVar.zzd;
        if (i != 2 && i != 4) {
            throw new zzco("Unhandled input format:", zzclVar);
        }
        int i2 = this.zzb;
        if (i2 == -1) {
            i2 = zzclVar.zzb;
        }
        this.zze = zzclVar;
        zzcl zzclVar2 = new zzcl(i2, zzclVar.zzc, i);
        this.zzf = zzclVar2;
        this.zzi = true;
        return zzclVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final boolean zzc() {
        if (this.zzf.zzb != -1) {
            return Math.abs(this.zzc + (-1.0f)) >= 1.0E-4f || Math.abs(this.zzd + (-1.0f)) >= 1.0E-4f || this.zzf.zzb != this.zze.zzb;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzd(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            zzcu zzcuVar = this.zzj;
            zzcuVar.getClass();
            this.zzm += byteBuffer.remaining();
            zzcuVar.zzb(byteBuffer);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zze() {
        zzcu zzcuVar = this.zzj;
        if (zzcuVar != null) {
            zzcuVar.zzd();
        }
        this.zzo = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final ByteBuffer zzf() {
        int zzf;
        zzcu zzcuVar = this.zzj;
        if (zzcuVar != null && (zzf = zzcuVar.zzf()) > 0) {
            if (this.zzk.capacity() < zzf) {
                this.zzk = ByteBuffer.allocateDirect(zzf).order(ByteOrder.nativeOrder());
            } else {
                this.zzk.clear();
            }
            zzcuVar.zzc(this.zzk);
            this.zzk.flip();
            this.zzn += zzf;
            this.zzl = this.zzk;
        }
        ByteBuffer byteBuffer = this.zzl;
        this.zzl = zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final boolean zzg() {
        if (!this.zzo) {
            return false;
        }
        zzcu zzcuVar = this.zzj;
        return zzcuVar == null || zzcuVar.zzf() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzi(zzcn zzcnVar) {
        if (zzc()) {
            this.zzg = this.zze;
            this.zzh = this.zzf;
            if (this.zzi) {
                zzcl zzclVar = this.zzg;
                this.zzj = new zzcu(zzclVar.zzb, zzclVar.zzc, this.zzc, this.zzd, this.zzh.zzb, zzclVar.zzd == 4);
            } else {
                zzcu zzcuVar = this.zzj;
                if (zzcuVar != null) {
                    zzcuVar.zze();
                }
            }
        }
        this.zzl = zza;
        this.zzm = 0L;
        this.zzn = 0L;
        this.zzo = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzj() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        zzcl zzclVar = zzcl.zza;
        this.zze = zzclVar;
        this.zzf = zzclVar;
        this.zzg = zzclVar;
        this.zzh = zzclVar;
        ByteBuffer byteBuffer = zza;
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
        zzguk.zza(f > 0.0f);
        if (this.zzc != f) {
            this.zzc = f;
            this.zzi = true;
        }
    }

    public final void zzl(float f) {
        zzguk.zza(f > 0.0f);
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
        return i == i2 ? zzfm.zzw(j, zza, this.zzn, RoundingMode.DOWN) : zzfm.zzw(j, zza * i, this.zzn * i2, RoundingMode.DOWN);
    }
}
