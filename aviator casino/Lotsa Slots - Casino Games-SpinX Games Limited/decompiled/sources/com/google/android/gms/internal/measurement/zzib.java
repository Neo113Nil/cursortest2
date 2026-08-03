package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzib extends com.google.android.gms.internal.measurement.zzme implements com.google.android.gms.internal.measurement.zznm {
    private static final com.google.android.gms.internal.measurement.zzib zzh;
    private int zzb;
    private com.google.android.gms.internal.measurement.zzmn zzd = zzcv();
    private java.lang.String zze = "";
    private java.lang.String zzf = "";
    private int zzg;

    static {
        com.google.android.gms.internal.measurement.zzib zzibVar = new com.google.android.gms.internal.measurement.zzib();
        zzh = zzibVar;
        com.google.android.gms.internal.measurement.zzme.zzcp(com.google.android.gms.internal.measurement.zzib.class, zzibVar);
    }

    private zzib() {
    }

    public static com.google.android.gms.internal.measurement.zzhz zzh() {
        return (com.google.android.gms.internal.measurement.zzhz) zzh.zzck();
    }

    public static com.google.android.gms.internal.measurement.zzhz zzi(com.google.android.gms.internal.measurement.zzib zzibVar) {
        com.google.android.gms.internal.measurement.zzma zzck = zzh.zzck();
        zzck.zzbd(zzibVar);
        return (com.google.android.gms.internal.measurement.zzhz) zzck;
    }

    private final void zzr() {
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

    public final com.google.android.gms.internal.measurement.zzid zzc(int i) {
        return (com.google.android.gms.internal.measurement.zzid) this.zzd.get(i);
    }

    public final boolean zzd() {
        return (this.zzb & 1) != 0;
    }

    public final java.lang.String zze() {
        return this.zze;
    }

    public final boolean zzf() {
        return (this.zzb & 2) != 0;
    }

    public final java.lang.String zzg() {
        return this.zzf;
    }

    final /* synthetic */ void zzj(int i, com.google.android.gms.internal.measurement.zzid zzidVar) {
        zzidVar.getClass();
        zzr();
        this.zzd.set(i, zzidVar);
    }

    final /* synthetic */ void zzk(com.google.android.gms.internal.measurement.zzid zzidVar) {
        zzidVar.getClass();
        zzr();
        this.zzd.add(zzidVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzh, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new java.lang.Object[]{"zzb", "zzd", com.google.android.gms.internal.measurement.zzid.class, "zze", "zzf", "zzg", com.google.android.gms.internal.measurement.zzia.zza});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzib();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzhz(bArr);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }

    final /* synthetic */ void zzm(java.lang.Iterable iterable) {
        zzr();
        com.google.android.gms.internal.measurement.zzkr.zzce(iterable, this.zzd);
    }

    final /* synthetic */ void zzn() {
        this.zzd = zzcv();
    }

    final /* synthetic */ void zzo(java.lang.String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    final /* synthetic */ void zzp(java.lang.String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }
}
