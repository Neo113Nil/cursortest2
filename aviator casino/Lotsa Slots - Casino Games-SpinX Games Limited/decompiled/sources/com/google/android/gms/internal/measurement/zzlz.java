package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* loaded from: classes4.dex */
final class zzlz implements com.google.android.gms.internal.measurement.zznj {
    private static final com.google.android.gms.internal.measurement.zzlz zza = new com.google.android.gms.internal.measurement.zzlz();

    private zzlz() {
    }

    public static com.google.android.gms.internal.measurement.zzlz zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final boolean zzb(java.lang.Class cls) {
        return com.google.android.gms.internal.measurement.zzme.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final com.google.android.gms.internal.measurement.zzni zzc(java.lang.Class cls) {
        if (!com.google.android.gms.internal.measurement.zzme.class.isAssignableFrom(cls)) {
            java.lang.String name = cls.getName();
            java.lang.String.valueOf(name);
            throw new java.lang.IllegalArgumentException("Unsupported message type: ".concat(java.lang.String.valueOf(name)));
        }
        try {
            return (com.google.android.gms.internal.measurement.zzni) com.google.android.gms.internal.measurement.zzme.zzco(cls.asSubclass(com.google.android.gms.internal.measurement.zzme.class)).zzl(3, null, null);
        } catch (java.lang.Exception e) {
            java.lang.String name2 = cls.getName();
            java.lang.String.valueOf(name2);
            throw new java.lang.RuntimeException("Unable to get message info for ".concat(java.lang.String.valueOf(name2)), e);
        }
    }
}
