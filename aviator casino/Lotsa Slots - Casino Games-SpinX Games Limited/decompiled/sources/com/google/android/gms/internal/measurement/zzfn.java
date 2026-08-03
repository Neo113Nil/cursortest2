package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzfn extends com.google.android.gms.internal.measurement.zzme implements com.google.android.gms.internal.measurement.zznm {
    private static final com.google.android.gms.internal.measurement.zzfn zzj;
    private int zzb;
    private int zzd;
    private java.lang.String zze = "";
    private com.google.android.gms.internal.measurement.zzfh zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        com.google.android.gms.internal.measurement.zzfn zzfnVar = new com.google.android.gms.internal.measurement.zzfn();
        zzj = zzfnVar;
        com.google.android.gms.internal.measurement.zzme.zzcp(com.google.android.gms.internal.measurement.zzfn.class, zzfnVar);
    }

    private zzfn() {
    }

    public static com.google.android.gms.internal.measurement.zzfm zzi() {
        return (com.google.android.gms.internal.measurement.zzfm) zzj.zzck();
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final java.lang.String zzc() {
        return this.zze;
    }

    public final com.google.android.gms.internal.measurement.zzfh zzd() {
        com.google.android.gms.internal.measurement.zzfh zzfhVar = this.zzf;
        return zzfhVar == null ? com.google.android.gms.internal.measurement.zzfh.zzi() : zzfhVar;
    }

    public final boolean zze() {
        return this.zzg;
    }

    public final boolean zzf() {
        return this.zzh;
    }

    public final boolean zzg() {
        return (this.zzb & 32) != 0;
    }

    public final boolean zzh() {
        return this.zzi;
    }

    final /* synthetic */ void zzj(java.lang.String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new java.lang.Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzfn();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzfm(bArr);
        }
        if (i2 == 5) {
            return zzj;
        }
        throw null;
    }
}
