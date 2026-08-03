package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzgr extends com.google.android.gms.internal.measurement.zzme implements com.google.android.gms.internal.measurement.zznm {
    private static final com.google.android.gms.internal.measurement.zzgr zzf;
    private int zzb;
    private java.lang.String zzd = "";
    private java.lang.String zze = "";

    static {
        com.google.android.gms.internal.measurement.zzgr zzgrVar = new com.google.android.gms.internal.measurement.zzgr();
        zzf = zzgrVar;
        com.google.android.gms.internal.measurement.zzme.zzcp(com.google.android.gms.internal.measurement.zzgr.class, zzgrVar);
    }

    private zzgr() {
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new java.lang.Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzgr();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzgq(bArr);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }
}
