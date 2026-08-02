package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbgc extends com.google.android.libraries.places.internal.zzbge {
    zzbgc(sun.misc.Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.libraries.places.internal.zzbge
    public final void zza(java.lang.Object obj, long j, byte b) {
        if (com.google.android.libraries.places.internal.zzbgf.zzb) {
            com.google.android.libraries.places.internal.zzbgf.zzD(obj, j, b);
        } else {
            com.google.android.libraries.places.internal.zzbgf.zzE(obj, j, b);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbge
    public final boolean zzb(java.lang.Object obj, long j) {
        return com.google.android.libraries.places.internal.zzbgf.zzb ? com.google.android.libraries.places.internal.zzbgf.zzu(obj, j) : com.google.android.libraries.places.internal.zzbgf.zzv(obj, j);
    }

    @Override // com.google.android.libraries.places.internal.zzbge
    public final void zzc(java.lang.Object obj, long j, boolean z) {
        if (com.google.android.libraries.places.internal.zzbgf.zzb) {
            com.google.android.libraries.places.internal.zzbgf.zzD(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            com.google.android.libraries.places.internal.zzbgf.zzE(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbge
    public final float zzd(java.lang.Object obj, long j) {
        return java.lang.Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    @Override // com.google.android.libraries.places.internal.zzbge
    public final void zze(java.lang.Object obj, long j, float f) {
        this.zza.putInt(obj, j, java.lang.Float.floatToIntBits(f));
    }

    @Override // com.google.android.libraries.places.internal.zzbge
    public final double zzf(java.lang.Object obj, long j) {
        return java.lang.Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    @Override // com.google.android.libraries.places.internal.zzbge
    public final void zzg(java.lang.Object obj, long j, double d) {
        this.zza.putLong(obj, j, java.lang.Double.doubleToLongBits(d));
    }
}
