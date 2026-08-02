package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zzhaa extends zzhac {
    public zzhaa(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final byte zza(long j) {
        return Memory.peekByte((int) j);
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final double zzb(Object obj, long j) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final float zzc(Object obj, long j) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final void zzd(long j, byte[] bArr, long j3, long j7) {
        Memory.peekByteArray((int) j, bArr, (int) j3, (int) j7);
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final void zze(Object obj, long j, boolean z4) {
        if (zzhad.zzb) {
            zzhad.zzG(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzhad.zzH(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final void zzf(Object obj, long j, byte b7) {
        if (zzhad.zzb) {
            zzhad.zzG(obj, j, b7);
        } else {
            zzhad.zzH(obj, j, b7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final void zzg(Object obj, long j, double d7) {
        this.zza.putLong(obj, j, Double.doubleToLongBits(d7));
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final void zzh(Object obj, long j, float f7) {
        this.zza.putInt(obj, j, Float.floatToIntBits(f7));
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final boolean zzi(Object obj, long j) {
        return zzhad.zzb ? zzhad.zzw(obj, j) : zzhad.zzx(obj, j);
    }
}
