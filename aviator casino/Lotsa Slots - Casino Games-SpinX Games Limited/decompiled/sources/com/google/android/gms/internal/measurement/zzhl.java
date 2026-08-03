package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzhl extends com.google.android.gms.internal.measurement.zzme implements com.google.android.gms.internal.measurement.zznm {
    private static final com.google.android.gms.internal.measurement.zzhl zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        com.google.android.gms.internal.measurement.zzhl zzhlVar = new com.google.android.gms.internal.measurement.zzhl();
        zzf = zzhlVar;
        com.google.android.gms.internal.measurement.zzme.zzcp(com.google.android.gms.internal.measurement.zzhl.class, zzhlVar);
    }

    private zzhl() {
    }

    public static com.google.android.gms.internal.measurement.zzhk zza() {
        return (com.google.android.gms.internal.measurement.zzhk) zzf.zzck();
    }

    public final int zzc() {
        int zza = com.google.android.gms.internal.measurement.zzhj.zza(this.zzd);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzd() {
        int zza = com.google.android.gms.internal.measurement.zzhn.zza(this.zze);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    final /* synthetic */ void zze(int i) {
        this.zzd = i - 1;
        this.zzb |= 1;
    }

    final /* synthetic */ void zzf(int i) {
        this.zze = i - 1;
        this.zzb |= 2;
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new java.lang.Object[]{"zzb", "zzd", com.google.android.gms.internal.measurement.zzhi.zza, "zze", com.google.android.gms.internal.measurement.zzhm.zza});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzhl();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzhk(bArr);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }
}
