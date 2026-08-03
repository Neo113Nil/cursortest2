package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* loaded from: classes4.dex */
final class zzom extends com.google.android.gms.internal.measurement.zzon {
    zzom(sun.misc.Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.zzon
    public final void zza(java.lang.Object obj, long j, byte b) {
        if (com.google.android.gms.internal.measurement.zzoo.zzb) {
            com.google.android.gms.internal.measurement.zzoo.zzD(obj, j, b);
        } else {
            com.google.android.gms.internal.measurement.zzoo.zzE(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzon
    public final boolean zzb(java.lang.Object obj, long j) {
        return com.google.android.gms.internal.measurement.zzoo.zzb ? com.google.android.gms.internal.measurement.zzoo.zzu(obj, j) : com.google.android.gms.internal.measurement.zzoo.zzv(obj, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzon
    public final void zzc(java.lang.Object obj, long j, boolean z) {
        if (com.google.android.gms.internal.measurement.zzoo.zzb) {
            com.google.android.gms.internal.measurement.zzoo.zzD(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            com.google.android.gms.internal.measurement.zzoo.zzE(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzon
    public final float zzd(java.lang.Object obj, long j) {
        return java.lang.Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.zzon
    public final void zze(java.lang.Object obj, long j, float f) {
        this.zza.putInt(obj, j, java.lang.Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.measurement.zzon
    public final double zzf(java.lang.Object obj, long j) {
        return java.lang.Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.zzon
    public final void zzg(java.lang.Object obj, long j, double d) {
        this.zza.putLong(obj, j, java.lang.Double.doubleToLongBits(d));
    }
}
