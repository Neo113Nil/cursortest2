package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zziy extends com.google.android.gms.internal.measurement.zzme implements com.google.android.gms.internal.measurement.zznm {
    private static final com.google.android.gms.internal.measurement.zziy zzf;
    private int zzb;
    private java.lang.String zzd = "";
    private com.google.android.gms.internal.measurement.zzmn zze = zzcv();

    static {
        com.google.android.gms.internal.measurement.zziy zziyVar = new com.google.android.gms.internal.measurement.zziy();
        zzf = zziyVar;
        com.google.android.gms.internal.measurement.zzme.zzcp(com.google.android.gms.internal.measurement.zziy.class, zziyVar);
    }

    private zziy() {
    }

    public final java.lang.String zza() {
        return this.zzd;
    }

    public final java.util.List zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new java.lang.Object[]{"zzb", "zzd", "zze", com.google.android.gms.internal.measurement.zzje.class});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zziy();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzix(bArr);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }
}
