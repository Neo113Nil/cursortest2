package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes4.dex */
final class zzhg extends com.google.android.gms.internal.auth.zzhi {
    zzhg(sun.misc.Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final double zza(java.lang.Object obj, long j) {
        return java.lang.Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final float zzb(java.lang.Object obj, long j) {
        return java.lang.Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final void zzc(java.lang.Object obj, long j, boolean z) {
        if (com.google.android.gms.internal.auth.zzhj.zza) {
            com.google.android.gms.internal.auth.zzhj.zzi(obj, j, z);
        } else {
            com.google.android.gms.internal.auth.zzhj.zzj(obj, j, z);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final void zzd(java.lang.Object obj, long j, double d) {
        this.zza.putLong(obj, j, java.lang.Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final void zze(java.lang.Object obj, long j, float f) {
        this.zza.putInt(obj, j, java.lang.Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final boolean zzf(java.lang.Object obj, long j) {
        return com.google.android.gms.internal.auth.zzhj.zza ? com.google.android.gms.internal.auth.zzhj.zzq(obj, j) : com.google.android.gms.internal.auth.zzhj.zzr(obj, j);
    }
}
