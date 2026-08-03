package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzis extends com.google.android.gms.internal.measurement.zzme implements com.google.android.gms.internal.measurement.zznm {
    private static final com.google.android.gms.internal.measurement.zzis zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        com.google.android.gms.internal.measurement.zzis zzisVar = new com.google.android.gms.internal.measurement.zzis();
        zzg = zzisVar;
        com.google.android.gms.internal.measurement.zzme.zzcp(com.google.android.gms.internal.measurement.zzis.class, zzisVar);
    }

    private zzis() {
    }

    public static com.google.android.gms.internal.measurement.zzil zzb() {
        return (com.google.android.gms.internal.measurement.zzil) zzg.zzck();
    }

    public static com.google.android.gms.internal.measurement.zzis zzc() {
        return zzg;
    }

    public final com.google.android.gms.internal.measurement.zzin zza() {
        com.google.android.gms.internal.measurement.zzin zzb = com.google.android.gms.internal.measurement.zzin.zzb(this.zze);
        return zzb == null ? com.google.android.gms.internal.measurement.zzin.CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN : zzb;
    }

    final /* synthetic */ void zzd(com.google.android.gms.internal.measurement.zzin zzinVar) {
        this.zze = zzinVar.zza();
        this.zzb |= 2;
    }

    public final int zzf() {
        int zza = com.google.android.gms.internal.measurement.zzir.zza(this.zzd);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzg() {
        int zza = com.google.android.gms.internal.measurement.zzip.zza(this.zzf);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    final /* synthetic */ void zzh(int i) {
        this.zzd = i - 1;
        this.zzb |= 1;
    }

    final /* synthetic */ void zzi(int i) {
        this.zzf = i - 1;
        this.zzb |= 4;
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new java.lang.Object[]{"zzb", "zzd", com.google.android.gms.internal.measurement.zziq.zza, "zze", com.google.android.gms.internal.measurement.zzim.zza, "zzf", com.google.android.gms.internal.measurement.zzio.zza});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzis();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzil(bArr);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }
}
