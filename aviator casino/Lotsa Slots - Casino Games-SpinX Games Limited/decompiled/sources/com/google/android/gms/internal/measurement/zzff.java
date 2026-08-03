package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzff extends com.google.android.gms.internal.measurement.zzme implements com.google.android.gms.internal.measurement.zznm {
    private static final com.google.android.gms.internal.measurement.zzff zzl;
    private int zzb;
    private int zzd;
    private java.lang.String zze = "";
    private com.google.android.gms.internal.measurement.zzmn zzf = zzcv();
    private boolean zzg;
    private com.google.android.gms.internal.measurement.zzfl zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        com.google.android.gms.internal.measurement.zzff zzffVar = new com.google.android.gms.internal.measurement.zzff();
        zzl = zzffVar;
        com.google.android.gms.internal.measurement.zzme.zzcp(com.google.android.gms.internal.measurement.zzff.class, zzffVar);
    }

    private zzff() {
    }

    public static com.google.android.gms.internal.measurement.zzfe zzn() {
        return (com.google.android.gms.internal.measurement.zzfe) zzl.zzck();
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

    public final java.util.List zzd() {
        return this.zzf;
    }

    public final int zze() {
        return this.zzf.size();
    }

    public final com.google.android.gms.internal.measurement.zzfh zzf(int i) {
        return (com.google.android.gms.internal.measurement.zzfh) this.zzf.get(i);
    }

    public final boolean zzg() {
        return (this.zzb & 8) != 0;
    }

    public final com.google.android.gms.internal.measurement.zzfl zzh() {
        com.google.android.gms.internal.measurement.zzfl zzflVar = this.zzh;
        return zzflVar == null ? com.google.android.gms.internal.measurement.zzfl.zzj() : zzflVar;
    }

    public final boolean zzi() {
        return this.zzi;
    }

    public final boolean zzj() {
        return this.zzj;
    }

    public final boolean zzk() {
        return (this.zzb & 64) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzl, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new java.lang.Object[]{"zzb", "zzd", "zze", "zzf", com.google.android.gms.internal.measurement.zzfh.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzff();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzfe(bArr);
        }
        if (i2 == 5) {
            return zzl;
        }
        throw null;
    }

    public final boolean zzm() {
        return this.zzk;
    }

    final /* synthetic */ void zzo(java.lang.String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    final /* synthetic */ void zzp(int i, com.google.android.gms.internal.measurement.zzfh zzfhVar) {
        zzfhVar.getClass();
        com.google.android.gms.internal.measurement.zzmn zzmnVar = this.zzf;
        if (!zzmnVar.zza()) {
            this.zzf = com.google.android.gms.internal.measurement.zzme.zzcw(zzmnVar);
        }
        this.zzf.set(i, zzfhVar);
    }
}
