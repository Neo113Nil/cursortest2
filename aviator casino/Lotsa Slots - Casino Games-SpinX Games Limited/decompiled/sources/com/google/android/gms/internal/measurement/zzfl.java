package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzfl extends com.google.android.gms.internal.measurement.zzme implements com.google.android.gms.internal.measurement.zznm {
    private static final com.google.android.gms.internal.measurement.zzfl zzi;
    private int zzb;
    private int zzd;
    private boolean zze;
    private java.lang.String zzf = "";
    private java.lang.String zzg = "";
    private java.lang.String zzh = "";

    static {
        com.google.android.gms.internal.measurement.zzfl zzflVar = new com.google.android.gms.internal.measurement.zzfl();
        zzi = zzflVar;
        com.google.android.gms.internal.measurement.zzme.zzcp(com.google.android.gms.internal.measurement.zzfl.class, zzflVar);
    }

    private zzfl() {
    }

    public static com.google.android.gms.internal.measurement.zzfl zzj() {
        return zzi;
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final boolean zzb() {
        return (this.zzb & 2) != 0;
    }

    public final boolean zzc() {
        return this.zze;
    }

    public final boolean zzd() {
        return (this.zzb & 4) != 0;
    }

    public final java.lang.String zze() {
        return this.zzf;
    }

    public final boolean zzf() {
        return (this.zzb & 8) != 0;
    }

    public final java.lang.String zzg() {
        return this.zzg;
    }

    public final boolean zzh() {
        return (this.zzb & 16) != 0;
    }

    public final java.lang.String zzi() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new java.lang.Object[]{"zzb", "zzd", com.google.android.gms.internal.measurement.zzfj.zza, "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzfl();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzfi(bArr);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }

    public final int zzm() {
        int zza = com.google.android.gms.internal.measurement.zzfk.zza(this.zzd);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }
}
