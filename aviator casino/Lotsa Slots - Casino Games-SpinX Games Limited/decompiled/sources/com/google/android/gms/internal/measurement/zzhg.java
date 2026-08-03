package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzhg extends com.google.android.gms.internal.measurement.zzme implements com.google.android.gms.internal.measurement.zznm {
    private static final com.google.android.gms.internal.measurement.zzhg zzh;
    private int zzb;
    private int zzd;
    private com.google.android.gms.internal.measurement.zzii zze;
    private com.google.android.gms.internal.measurement.zzii zzf;
    private boolean zzg;

    static {
        com.google.android.gms.internal.measurement.zzhg zzhgVar = new com.google.android.gms.internal.measurement.zzhg();
        zzh = zzhgVar;
        com.google.android.gms.internal.measurement.zzme.zzcp(com.google.android.gms.internal.measurement.zzhg.class, zzhgVar);
    }

    private zzhg() {
    }

    public static com.google.android.gms.internal.measurement.zzhf zzh() {
        return (com.google.android.gms.internal.measurement.zzhf) zzh.zzck();
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final com.google.android.gms.internal.measurement.zzii zzc() {
        com.google.android.gms.internal.measurement.zzii zziiVar = this.zze;
        return zziiVar == null ? com.google.android.gms.internal.measurement.zzii.zzj() : zziiVar;
    }

    public final boolean zzd() {
        return (this.zzb & 4) != 0;
    }

    public final com.google.android.gms.internal.measurement.zzii zze() {
        com.google.android.gms.internal.measurement.zzii zziiVar = this.zzf;
        return zziiVar == null ? com.google.android.gms.internal.measurement.zzii.zzj() : zziiVar;
    }

    public final boolean zzf() {
        return (this.zzb & 8) != 0;
    }

    public final boolean zzg() {
        return this.zzg;
    }

    final /* synthetic */ void zzi(int i) {
        this.zzb |= 1;
        this.zzd = i;
    }

    final /* synthetic */ void zzj(com.google.android.gms.internal.measurement.zzii zziiVar) {
        zziiVar.getClass();
        this.zze = zziiVar;
        this.zzb |= 2;
    }

    final /* synthetic */ void zzk(com.google.android.gms.internal.measurement.zzii zziiVar) {
        this.zzf = zziiVar;
        this.zzb |= 4;
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new java.lang.Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzhg();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzhf(bArr);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }

    final /* synthetic */ void zzm(boolean z) {
        this.zzb |= 8;
        this.zzg = z;
    }
}
