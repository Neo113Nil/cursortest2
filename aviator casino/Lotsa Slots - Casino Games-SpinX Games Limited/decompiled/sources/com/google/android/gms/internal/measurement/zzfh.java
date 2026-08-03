package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzfh extends com.google.android.gms.internal.measurement.zzme implements com.google.android.gms.internal.measurement.zznm {
    private static final com.google.android.gms.internal.measurement.zzfh zzh;
    private int zzb;
    private com.google.android.gms.internal.measurement.zzfr zzd;
    private com.google.android.gms.internal.measurement.zzfl zze;
    private boolean zzf;
    private java.lang.String zzg = "";

    static {
        com.google.android.gms.internal.measurement.zzfh zzfhVar = new com.google.android.gms.internal.measurement.zzfh();
        zzh = zzfhVar;
        com.google.android.gms.internal.measurement.zzme.zzcp(com.google.android.gms.internal.measurement.zzfh.class, zzfhVar);
    }

    private zzfh() {
    }

    public static com.google.android.gms.internal.measurement.zzfh zzi() {
        return zzh;
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final com.google.android.gms.internal.measurement.zzfr zzb() {
        com.google.android.gms.internal.measurement.zzfr zzfrVar = this.zzd;
        return zzfrVar == null ? com.google.android.gms.internal.measurement.zzfr.zzh() : zzfrVar;
    }

    public final boolean zzc() {
        return (this.zzb & 2) != 0;
    }

    public final com.google.android.gms.internal.measurement.zzfl zzd() {
        com.google.android.gms.internal.measurement.zzfl zzflVar = this.zze;
        return zzflVar == null ? com.google.android.gms.internal.measurement.zzfl.zzj() : zzflVar;
    }

    public final boolean zze() {
        return (this.zzb & 4) != 0;
    }

    public final boolean zzf() {
        return this.zzf;
    }

    public final boolean zzg() {
        return (this.zzb & 8) != 0;
    }

    public final java.lang.String zzh() {
        return this.zzg;
    }

    final /* synthetic */ void zzj(java.lang.String str) {
        this.zzb |= 8;
        this.zzg = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new java.lang.Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzfh();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzfg(bArr);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }
}
