package com.google.android.recaptcha.internal;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zznf extends zznh {
    public zznf(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.recaptcha.internal.zznh
    public final double zza(Object obj, long j) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    @Override // com.google.android.recaptcha.internal.zznh
    public final float zzb(Object obj, long j) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    @Override // com.google.android.recaptcha.internal.zznh
    public final void zzc(Object obj, long j, boolean z4) {
        if (zzni.zzb) {
            zzni.zzD(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzni.zzE(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.recaptcha.internal.zznh
    public final void zzd(Object obj, long j, byte b7) {
        if (zzni.zzb) {
            zzni.zzD(obj, j, b7);
        } else {
            zzni.zzE(obj, j, b7);
        }
    }

    @Override // com.google.android.recaptcha.internal.zznh
    public final void zze(Object obj, long j, double d7) {
        this.zza.putLong(obj, j, Double.doubleToLongBits(d7));
    }

    @Override // com.google.android.recaptcha.internal.zznh
    public final void zzf(Object obj, long j, float f7) {
        this.zza.putInt(obj, j, Float.floatToIntBits(f7));
    }

    @Override // com.google.android.recaptcha.internal.zznh
    public final boolean zzg(Object obj, long j) {
        return zzni.zzb ? zzni.zzt(obj, j) : zzni.zzu(obj, j);
    }
}
