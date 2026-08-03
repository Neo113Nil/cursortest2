package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzgv extends com.google.android.gms.internal.measurement.zzme implements com.google.android.gms.internal.measurement.zznm {
    private static final com.google.android.gms.internal.measurement.zzgv zzi;
    private int zzb;
    private int zzg;
    private java.lang.String zzd = "";
    private java.lang.String zze = "";
    private java.lang.String zzf = "";
    private java.lang.String zzh = "";

    static {
        com.google.android.gms.internal.measurement.zzgv zzgvVar = new com.google.android.gms.internal.measurement.zzgv();
        zzi = zzgvVar;
        com.google.android.gms.internal.measurement.zzme.zzcp(com.google.android.gms.internal.measurement.zzgv.class, zzgvVar);
    }

    private zzgv() {
    }

    public static com.google.android.gms.internal.measurement.zzgv zze() {
        return zzi;
    }

    public final java.lang.String zza() {
        return this.zzd;
    }

    public final java.lang.String zzb() {
        return this.zze;
    }

    public final int zzc() {
        return this.zzg;
    }

    public final java.lang.String zzd() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004", new java.lang.Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzgv();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzgu(bArr);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }
}
