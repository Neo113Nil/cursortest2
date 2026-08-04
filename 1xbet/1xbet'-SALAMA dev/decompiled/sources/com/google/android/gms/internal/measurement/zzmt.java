package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class zzmt extends zzmu {
    public zzmt(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final double zza(Object obj, long j) {
        return Double.longBitsToDouble(zzk(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final float zzb(Object obj, long j) {
        return Float.intBitsToFloat(zzj(obj, j));
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.measurement.zzmv.zzi(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.measurement.zzmv.zzj(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 boolean)' in method call: com.google.android.gms.internal.measurement.zzmv.zzi(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 boolean)' in method call: com.google.android.gms.internal.measurement.zzmv.zzj(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.measurement.zzmu
    public final void zzc(Object obj, long j, boolean z4) {
        if (zzmv.zzb) {
            zzmv.zzi(obj, j, z4);
        } else {
            zzmv.zzj(obj, j, z4);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final void zzd(Object obj, long j, byte b7) {
        if (zzmv.zzb) {
            zzmv.zzD(obj, j, b7);
        } else {
            zzmv.zzE(obj, j, b7);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final void zze(Object obj, long j, double d7) {
        zzo(obj, j, Double.doubleToLongBits(d7));
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final void zzf(Object obj, long j, float f7) {
        zzn(obj, j, Float.floatToIntBits(f7));
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final boolean zzg(Object obj, long j) {
        return zzmv.zzb ? zzmv.zzt(obj, j) : zzmv.zzu(obj, j);
    }
}
