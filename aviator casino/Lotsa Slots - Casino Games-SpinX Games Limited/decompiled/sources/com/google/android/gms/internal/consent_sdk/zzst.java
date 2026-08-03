package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
final class zzst extends com.google.android.gms.internal.consent_sdk.zzsv {
    zzst(sun.misc.Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsv
    public final double zza(java.lang.Object obj, long j) {
        return java.lang.Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsv
    public final float zzb(java.lang.Object obj, long j) {
        return java.lang.Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsv
    public final void zzc(java.lang.Object obj, long j, boolean z) {
        if (com.google.android.gms.internal.consent_sdk.zzsw.zzb) {
            com.google.android.gms.internal.consent_sdk.zzsw.zzD(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            com.google.android.gms.internal.consent_sdk.zzsw.zzE(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsv
    public final void zzd(java.lang.Object obj, long j, byte b) {
        if (com.google.android.gms.internal.consent_sdk.zzsw.zzb) {
            com.google.android.gms.internal.consent_sdk.zzsw.zzD(obj, j, b);
        } else {
            com.google.android.gms.internal.consent_sdk.zzsw.zzE(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsv
    public final void zze(java.lang.Object obj, long j, double d) {
        this.zza.putLong(obj, j, java.lang.Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsv
    public final void zzf(java.lang.Object obj, long j, float f) {
        this.zza.putInt(obj, j, java.lang.Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsv
    public final boolean zzg(java.lang.Object obj, long j) {
        return com.google.android.gms.internal.consent_sdk.zzsw.zzb ? com.google.android.gms.internal.consent_sdk.zzsw.zzt(obj, j) : com.google.android.gms.internal.consent_sdk.zzsw.zzu(obj, j);
    }
}
