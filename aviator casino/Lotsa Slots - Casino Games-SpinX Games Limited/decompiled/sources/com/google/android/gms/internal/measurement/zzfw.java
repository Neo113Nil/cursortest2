package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzfw extends com.google.android.gms.internal.measurement.zzme implements com.google.android.gms.internal.measurement.zznm {
    private static final com.google.android.gms.internal.measurement.zzfw zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        com.google.android.gms.internal.measurement.zzfw zzfwVar = new com.google.android.gms.internal.measurement.zzfw();
        zzf = zzfwVar;
        com.google.android.gms.internal.measurement.zzme.zzcp(com.google.android.gms.internal.measurement.zzfw.class, zzfwVar);
    }

    private zzfw() {
    }

    public final int zzb() {
        int zza = com.google.android.gms.internal.measurement.zzga.zza(this.zzd);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzc() {
        int zza = com.google.android.gms.internal.measurement.zzga.zza(this.zze);
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
            com.google.android.gms.internal.measurement.zzmj zzmjVar = com.google.android.gms.internal.measurement.zzfz.zza;
            return zzcq(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new java.lang.Object[]{"zzb", "zzd", zzmjVar, "zze", zzmjVar});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzfw();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzfv(bArr);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }
}
