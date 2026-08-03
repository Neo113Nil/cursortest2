package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzigy extends com.google.android.gms.internal.ads.zzigz {
    zzigy(sun.misc.Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.zzigz
    public final void zza(java.lang.Object obj, long j, byte b) {
        if (com.google.android.gms.internal.ads.zziha.zzb) {
            com.google.android.gms.internal.ads.zziha.zzE(obj, j, b);
        } else {
            com.google.android.gms.internal.ads.zziha.zzF(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigz
    public final boolean zzb(java.lang.Object obj, long j) {
        return com.google.android.gms.internal.ads.zziha.zzb ? com.google.android.gms.internal.ads.zziha.zzv(obj, j) : com.google.android.gms.internal.ads.zziha.zzw(obj, j);
    }

    @Override // com.google.android.gms.internal.ads.zzigz
    public final void zzc(java.lang.Object obj, long j, boolean z) {
        if (com.google.android.gms.internal.ads.zziha.zzb) {
            com.google.android.gms.internal.ads.zziha.zzE(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            com.google.android.gms.internal.ads.zziha.zzF(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigz
    public final float zzd(java.lang.Object obj, long j) {
        return java.lang.Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.ads.zzigz
    public final void zze(java.lang.Object obj, long j, float f) {
        this.zza.putInt(obj, j, java.lang.Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.ads.zzigz
    public final double zzf(java.lang.Object obj, long j) {
        return java.lang.Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.ads.zzigz
    public final void zzg(java.lang.Object obj, long j, double d) {
        this.zza.putLong(obj, j, java.lang.Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.ads.zzigz
    public final byte zzh(long j) {
        return libcore.io.Memory.peekByte(j);
    }
}
