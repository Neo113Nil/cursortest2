package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzfr extends com.google.android.gms.internal.measurement.zzme implements com.google.android.gms.internal.measurement.zznm {
    private static final com.google.android.gms.internal.measurement.zzfr zzh;
    private int zzb;
    private int zzd;
    private boolean zzf;
    private java.lang.String zze = "";
    private com.google.android.gms.internal.measurement.zzmn zzg = com.google.android.gms.internal.measurement.zzme.zzcv();

    static {
        com.google.android.gms.internal.measurement.zzfr zzfrVar = new com.google.android.gms.internal.measurement.zzfr();
        zzh = zzfrVar;
        com.google.android.gms.internal.measurement.zzme.zzcp(com.google.android.gms.internal.measurement.zzfr.class, zzfrVar);
    }

    private zzfr() {
    }

    public static com.google.android.gms.internal.measurement.zzfr zzh() {
        return zzh;
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final boolean zzb() {
        return (this.zzb & 2) != 0;
    }

    public final java.lang.String zzc() {
        return this.zze;
    }

    public final boolean zzd() {
        return (this.zzb & 4) != 0;
    }

    public final boolean zze() {
        return this.zzf;
    }

    public final java.util.List zzf() {
        return this.zzg;
    }

    public final int zzg() {
        return this.zzg.size();
    }

    public final int zzj() {
        int zza = com.google.android.gms.internal.measurement.zzfq.zza(this.zzd);
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
            return zzcq(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new java.lang.Object[]{"zzb", "zzd", com.google.android.gms.internal.measurement.zzfp.zza, "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzfr();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzfo(bArr);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }
}
