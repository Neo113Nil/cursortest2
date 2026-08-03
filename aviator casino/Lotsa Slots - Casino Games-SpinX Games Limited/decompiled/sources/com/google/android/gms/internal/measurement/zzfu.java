package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzfu extends com.google.android.gms.internal.measurement.zzme implements com.google.android.gms.internal.measurement.zznm {
    private static final com.google.android.gms.internal.measurement.zzfu zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        com.google.android.gms.internal.measurement.zzfu zzfuVar = new com.google.android.gms.internal.measurement.zzfu();
        zzg = zzfuVar;
        com.google.android.gms.internal.measurement.zzme.zzcp(com.google.android.gms.internal.measurement.zzfu.class, zzfuVar);
    }

    private zzfu() {
    }

    public final int zzb() {
        int zza = com.google.android.gms.internal.measurement.zzga.zza(this.zzd);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzc() {
        int zza = com.google.android.gms.internal.measurement.zzfy.zza(this.zze);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzd() {
        int zza = com.google.android.gms.internal.measurement.zzge.zza(this.zzf);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new java.lang.Object[]{"zzb", "zzd", com.google.android.gms.internal.measurement.zzfz.zza, "zze", com.google.android.gms.internal.measurement.zzfx.zza, "zzf", com.google.android.gms.internal.measurement.zzgd.zza});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzfu();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzft(bArr);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }
}
