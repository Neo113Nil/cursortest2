package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzha extends com.google.android.gms.internal.measurement.zzme implements com.google.android.gms.internal.measurement.zznm {
    private static final com.google.android.gms.internal.measurement.zzha zzn;
    private int zzb;
    private long zzg;
    private long zzk;
    private com.google.android.gms.internal.measurement.zznf zzl = com.google.android.gms.internal.measurement.zznf.zza();
    private com.google.android.gms.internal.measurement.zznf zzm = com.google.android.gms.internal.measurement.zznf.zza();
    private java.lang.String zzd = "";
    private java.lang.String zze = "";
    private java.lang.String zzf = "";
    private java.lang.String zzh = "";
    private java.lang.String zzi = "";
    private java.lang.String zzj = "";

    static {
        com.google.android.gms.internal.measurement.zzha zzhaVar = new com.google.android.gms.internal.measurement.zzha();
        zzn = zzhaVar;
        com.google.android.gms.internal.measurement.zzme.zzcp(com.google.android.gms.internal.measurement.zzha.class, zzhaVar);
    }

    private zzha() {
    }

    public static com.google.android.gms.internal.measurement.zzgx zzr() {
        return (com.google.android.gms.internal.measurement.zzgx) zzn.zzck();
    }

    public static com.google.android.gms.internal.measurement.zzha zzs() {
        return zzn;
    }

    final /* synthetic */ void zzA(java.lang.String str) {
        this.zzb |= 16;
        this.zzh = str;
    }

    final /* synthetic */ void zzB() {
        this.zzb &= -17;
        this.zzh = zzn.zzh;
    }

    final /* synthetic */ void zzC(java.lang.String str) {
        this.zzb |= 32;
        this.zzi = str;
    }

    final /* synthetic */ void zzD() {
        this.zzb &= -33;
        this.zzi = zzn.zzi;
    }

    final /* synthetic */ void zzE(java.lang.String str) {
        this.zzb |= 64;
        this.zzj = str;
    }

    final /* synthetic */ void zzF() {
        this.zzb &= -65;
        this.zzj = zzn.zzj;
    }

    final /* synthetic */ void zzG(long j) {
        this.zzb |= 128;
        this.zzk = j;
    }

    final /* synthetic */ java.util.Map zzH() {
        if (!this.zzl.zze()) {
            this.zzl = this.zzl.zzc();
        }
        return this.zzl;
    }

    final /* synthetic */ java.util.Map zzI() {
        if (!this.zzm.zze()) {
            this.zzm = this.zzm.zzc();
        }
        return this.zzm;
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

    public final java.lang.String zzf() {
        return this.zzf;
    }

    public final boolean zzg() {
        return (this.zzb & 8) != 0;
    }

    public final long zzh() {
        return this.zzg;
    }

    public final boolean zzi() {
        return (this.zzb & 16) != 0;
    }

    public final java.lang.String zzj() {
        return this.zzh;
    }

    public final boolean zzk() {
        return (this.zzb & 32) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzn, "\u0004\n\u0000\u0001\u0001\n\n\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\t2\n2", new java.lang.Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", com.google.android.gms.internal.measurement.zzgy.zza, "zzm", com.google.android.gms.internal.measurement.zzgz.zza});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzha();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzgx(bArr);
        }
        if (i2 == 5) {
            return zzn;
        }
        throw null;
    }

    public final java.lang.String zzm() {
        return this.zzi;
    }

    public final boolean zzn() {
        return (this.zzb & 64) != 0;
    }

    public final java.lang.String zzo() {
        return this.zzj;
    }

    public final boolean zzp() {
        return (this.zzb & 128) != 0;
    }

    public final long zzq() {
        return this.zzk;
    }

    final /* synthetic */ void zzt(java.lang.String str) {
        this.zzb |= 1;
        this.zzd = str;
    }

    final /* synthetic */ void zzu() {
        this.zzb &= -2;
        this.zzd = zzn.zzd;
    }

    final /* synthetic */ void zzv(java.lang.String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    final /* synthetic */ void zzw() {
        this.zzb &= -3;
        this.zze = zzn.zze;
    }

    final /* synthetic */ void zzx(java.lang.String str) {
        this.zzb |= 4;
        this.zzf = str;
    }

    final /* synthetic */ void zzy() {
        this.zzb &= -5;
        this.zzf = zzn.zzf;
    }

    final /* synthetic */ void zzz(long j) {
        this.zzb |= 8;
        this.zzg = j;
    }
}
