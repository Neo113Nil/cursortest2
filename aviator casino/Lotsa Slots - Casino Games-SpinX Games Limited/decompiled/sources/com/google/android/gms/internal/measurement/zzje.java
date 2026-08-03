package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzje extends com.google.android.gms.internal.measurement.zzme implements com.google.android.gms.internal.measurement.zznm {
    private static final com.google.android.gms.internal.measurement.zzje zzj;
    private int zzb;
    private int zzd;
    private com.google.android.gms.internal.measurement.zzmn zze = zzcv();
    private java.lang.String zzf = "";
    private java.lang.String zzg = "";
    private boolean zzh;
    private double zzi;

    static {
        com.google.android.gms.internal.measurement.zzje zzjeVar = new com.google.android.gms.internal.measurement.zzje();
        zzj = zzjeVar;
        com.google.android.gms.internal.measurement.zzme.zzcp(com.google.android.gms.internal.measurement.zzje.class, zzjeVar);
    }

    private zzje() {
    }

    public final java.util.List zza() {
        return this.zze;
    }

    public final java.lang.String zzb() {
        return this.zzf;
    }

    public final boolean zzc() {
        return (this.zzb & 4) != 0;
    }

    public final java.lang.String zzd() {
        return this.zzg;
    }

    public final boolean zze() {
        return (this.zzb & 8) != 0;
    }

    public final boolean zzf() {
        return this.zzh;
    }

    public final boolean zzg() {
        return (this.zzb & 16) != 0;
    }

    public final double zzh() {
        return this.zzi;
    }

    public final int zzj() {
        int zza = com.google.android.gms.internal.measurement.zzjd.zza(this.zzd);
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
            return zzcq(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new java.lang.Object[]{"zzb", "zzd", com.google.android.gms.internal.measurement.zzjc.zza, "zze", com.google.android.gms.internal.measurement.zzje.class, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzje();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzjb(bArr);
        }
        if (i2 == 5) {
            return zzj;
        }
        throw null;
    }
}
