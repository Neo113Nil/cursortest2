package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzhs extends com.google.android.gms.internal.measurement.zzme implements com.google.android.gms.internal.measurement.zznm {
    private static final com.google.android.gms.internal.measurement.zzhs zzi;
    private int zzb;
    private com.google.android.gms.internal.measurement.zzmn zzd = zzcv();
    private java.lang.String zze = "";
    private long zzf;
    private long zzg;
    private int zzh;

    static {
        com.google.android.gms.internal.measurement.zzhs zzhsVar = new com.google.android.gms.internal.measurement.zzhs();
        zzi = zzhsVar;
        com.google.android.gms.internal.measurement.zzme.zzcp(com.google.android.gms.internal.measurement.zzhs.class, zzhsVar);
    }

    private zzhs() {
    }

    public static com.google.android.gms.internal.measurement.zzhr zzk() {
        return (com.google.android.gms.internal.measurement.zzhr) zzi.zzck();
    }

    private final void zzv() {
        com.google.android.gms.internal.measurement.zzmn zzmnVar = this.zzd;
        if (zzmnVar.zza()) {
            return;
        }
        this.zzd = com.google.android.gms.internal.measurement.zzme.zzcw(zzmnVar);
    }

    public final java.util.List zza() {
        return this.zzd;
    }

    public final int zzb() {
        return this.zzd.size();
    }

    public final com.google.android.gms.internal.measurement.zzhw zzc(int i) {
        return (com.google.android.gms.internal.measurement.zzhw) this.zzd.get(i);
    }

    public final java.lang.String zzd() {
        return this.zze;
    }

    public final boolean zze() {
        return (this.zzb & 2) != 0;
    }

    public final long zzf() {
        return this.zzf;
    }

    public final boolean zzg() {
        return (this.zzb & 4) != 0;
    }

    public final long zzh() {
        return this.zzg;
    }

    public final boolean zzi() {
        return (this.zzb & 8) != 0;
    }

    public final int zzj() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new java.lang.Object[]{"zzb", "zzd", com.google.android.gms.internal.measurement.zzhw.class, "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzhs();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzhr(bArr);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }

    final /* synthetic */ void zzm(int i, com.google.android.gms.internal.measurement.zzhw zzhwVar) {
        zzhwVar.getClass();
        zzv();
        this.zzd.set(i, zzhwVar);
    }

    final /* synthetic */ void zzn(com.google.android.gms.internal.measurement.zzhw zzhwVar) {
        zzhwVar.getClass();
        zzv();
        this.zzd.add(zzhwVar);
    }

    final /* synthetic */ void zzo(java.lang.Iterable iterable) {
        zzv();
        com.google.android.gms.internal.measurement.zzkr.zzce(iterable, this.zzd);
    }

    final /* synthetic */ void zzp() {
        this.zzd = zzcv();
    }

    final /* synthetic */ void zzq(int i) {
        zzv();
        this.zzd.remove(i);
    }

    final /* synthetic */ void zzr(java.lang.String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    final /* synthetic */ void zzs(long j) {
        this.zzb |= 2;
        this.zzf = j;
    }

    final /* synthetic */ void zzt(long j) {
        this.zzb |= 4;
        this.zzg = j;
    }
}
