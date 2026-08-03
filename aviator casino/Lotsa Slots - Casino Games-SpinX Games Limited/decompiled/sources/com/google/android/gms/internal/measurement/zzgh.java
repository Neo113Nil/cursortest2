package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzgh extends com.google.android.gms.internal.measurement.zzme implements com.google.android.gms.internal.measurement.zznm {
    private static final com.google.android.gms.internal.measurement.zzgh zzg;
    private int zzb;
    private java.lang.String zzd = "";
    private com.google.android.gms.internal.measurement.zzmn zze = zzcv();
    private boolean zzf;

    static {
        com.google.android.gms.internal.measurement.zzgh zzghVar = new com.google.android.gms.internal.measurement.zzgh();
        zzg = zzghVar;
        com.google.android.gms.internal.measurement.zzme.zzcp(com.google.android.gms.internal.measurement.zzgh.class, zzghVar);
    }

    private zzgh() {
    }

    public final java.lang.String zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new java.lang.Object[]{"zzb", "zzd", "zze", com.google.android.gms.internal.measurement.zzgr.class, "zzf"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzgh();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzgg(bArr);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }
}
