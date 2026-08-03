package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzhu extends com.google.android.gms.internal.measurement.zzme implements com.google.android.gms.internal.measurement.zznm {
    private static final com.google.android.gms.internal.measurement.zzhu zzf;
    private int zzb;
    private java.lang.String zzd = "";
    private long zze;

    static {
        com.google.android.gms.internal.measurement.zzhu zzhuVar = new com.google.android.gms.internal.measurement.zzhu();
        zzf = zzhuVar;
        com.google.android.gms.internal.measurement.zzme.zzcp(com.google.android.gms.internal.measurement.zzhu.class, zzhuVar);
    }

    private zzhu() {
    }

    public static com.google.android.gms.internal.measurement.zzht zza() {
        return (com.google.android.gms.internal.measurement.zzht) zzf.zzck();
    }

    final /* synthetic */ void zzb(java.lang.String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }

    final /* synthetic */ void zzc(long j) {
        this.zzb |= 2;
        this.zze = j;
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new java.lang.Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzhu();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzht(bArr);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }
}
