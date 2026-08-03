package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzhw extends com.google.android.gms.internal.measurement.zzme implements com.google.android.gms.internal.measurement.zznm {
    private static final com.google.android.gms.internal.measurement.zzhw zzj;
    private int zzb;
    private long zzf;
    private float zzg;
    private double zzh;
    private java.lang.String zzd = "";
    private java.lang.String zze = "";
    private com.google.android.gms.internal.measurement.zzmn zzi = zzcv();

    static {
        com.google.android.gms.internal.measurement.zzhw zzhwVar = new com.google.android.gms.internal.measurement.zzhw();
        zzj = zzhwVar;
        com.google.android.gms.internal.measurement.zzme.zzcp(com.google.android.gms.internal.measurement.zzhw.class, zzhwVar);
    }

    private zzhw() {
    }

    public static com.google.android.gms.internal.measurement.zzhv zzn() {
        return (com.google.android.gms.internal.measurement.zzhv) zzj.zzck();
    }

    private final void zzz() {
        com.google.android.gms.internal.measurement.zzmn zzmnVar = this.zzi;
        if (zzmnVar.zza()) {
            return;
        }
        this.zzi = com.google.android.gms.internal.measurement.zzme.zzcw(zzmnVar);
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final java.lang.String zzb() {
        return this.zzd;
    }

    public final boolean zzc() {
        return (this.zzb & 2) != 0;
    }

    public final java.lang.String zzd() {
        return this.zze;
    }

    public final boolean zze() {
        return (this.zzb & 4) != 0;
    }

    public final long zzf() {
        return this.zzf;
    }

    public final boolean zzg() {
        return (this.zzb & 8) != 0;
    }

    public final float zzh() {
        return this.zzg;
    }

    public final boolean zzi() {
        return (this.zzb & 16) != 0;
    }

    public final double zzj() {
        return this.zzh;
    }

    public final java.util.List zzk() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new java.lang.Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", com.google.android.gms.internal.measurement.zzhw.class});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzhw();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzhv(bArr);
        }
        if (i2 == 5) {
            return zzj;
        }
        throw null;
    }

    public final int zzm() {
        return this.zzi.size();
    }

    final /* synthetic */ void zzo(java.lang.String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }

    final /* synthetic */ void zzp(java.lang.String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }

    final /* synthetic */ void zzq() {
        this.zzb &= -3;
        this.zze = zzj.zze;
    }

    final /* synthetic */ void zzr(long j) {
        this.zzb |= 4;
        this.zzf = j;
    }

    final /* synthetic */ void zzs() {
        this.zzb &= -5;
        this.zzf = 0L;
    }

    final /* synthetic */ void zzt(double d) {
        this.zzb |= 16;
        this.zzh = d;
    }

    final /* synthetic */ void zzu() {
        this.zzb &= -17;
        this.zzh = 0.0d;
    }

    final /* synthetic */ void zzv(com.google.android.gms.internal.measurement.zzhw zzhwVar) {
        zzhwVar.getClass();
        zzz();
        this.zzi.add(zzhwVar);
    }

    final /* synthetic */ void zzw(java.lang.Iterable iterable) {
        zzz();
        com.google.android.gms.internal.measurement.zzkr.zzce(iterable, this.zzi);
    }

    final /* synthetic */ void zzx() {
        this.zzi = zzcv();
    }
}
