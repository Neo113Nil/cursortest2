package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzii extends com.google.android.gms.internal.measurement.zzme implements com.google.android.gms.internal.measurement.zznm {
    private static final com.google.android.gms.internal.measurement.zzii zzg;
    private com.google.android.gms.internal.measurement.zzmm zzb = zzct();
    private com.google.android.gms.internal.measurement.zzmm zzd = zzct();
    private com.google.android.gms.internal.measurement.zzmn zze = zzcv();
    private com.google.android.gms.internal.measurement.zzmn zzf = zzcv();

    static {
        com.google.android.gms.internal.measurement.zzii zziiVar = new com.google.android.gms.internal.measurement.zzii();
        zzg = zziiVar;
        com.google.android.gms.internal.measurement.zzme.zzcp(com.google.android.gms.internal.measurement.zzii.class, zziiVar);
    }

    private zzii() {
    }

    public static com.google.android.gms.internal.measurement.zzih zzi() {
        return (com.google.android.gms.internal.measurement.zzih) zzg.zzck();
    }

    public static com.google.android.gms.internal.measurement.zzii zzj() {
        return zzg;
    }

    public final java.util.List zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzb.size();
    }

    public final java.util.List zzc() {
        return this.zzd;
    }

    public final int zzd() {
        return this.zzd.size();
    }

    public final java.util.List zze() {
        return this.zze;
    }

    public final int zzf() {
        return this.zze.size();
    }

    public final java.util.List zzg() {
        return this.zzf;
    }

    public final int zzh() {
        return this.zzf.size();
    }

    final /* synthetic */ void zzk(java.lang.Iterable iterable) {
        com.google.android.gms.internal.measurement.zzmm zzmmVar = this.zzb;
        if (!zzmmVar.zza()) {
            this.zzb = com.google.android.gms.internal.measurement.zzme.zzcu(zzmmVar);
        }
        com.google.android.gms.internal.measurement.zzkr.zzce(iterable, this.zzb);
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzg, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new java.lang.Object[]{"zzb", "zzd", "zze", com.google.android.gms.internal.measurement.zzhq.class, "zzf", com.google.android.gms.internal.measurement.zzik.class});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzii();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzih(bArr);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }

    final /* synthetic */ void zzm() {
        this.zzb = zzct();
    }

    final /* synthetic */ void zzn(java.lang.Iterable iterable) {
        com.google.android.gms.internal.measurement.zzmm zzmmVar = this.zzd;
        if (!zzmmVar.zza()) {
            this.zzd = com.google.android.gms.internal.measurement.zzme.zzcu(zzmmVar);
        }
        com.google.android.gms.internal.measurement.zzkr.zzce(iterable, this.zzd);
    }

    final /* synthetic */ void zzo() {
        this.zzd = zzct();
    }

    final /* synthetic */ void zzp(java.lang.Iterable iterable) {
        com.google.android.gms.internal.measurement.zzmn zzmnVar = this.zze;
        if (!zzmnVar.zza()) {
            this.zze = com.google.android.gms.internal.measurement.zzme.zzcw(zzmnVar);
        }
        com.google.android.gms.internal.measurement.zzkr.zzce(iterable, this.zze);
    }

    final /* synthetic */ void zzq() {
        this.zze = zzcv();
    }

    final /* synthetic */ void zzr(java.lang.Iterable iterable) {
        com.google.android.gms.internal.measurement.zzmn zzmnVar = this.zzf;
        if (!zzmnVar.zza()) {
            this.zzf = com.google.android.gms.internal.measurement.zzme.zzcw(zzmnVar);
        }
        com.google.android.gms.internal.measurement.zzkr.zzce(iterable, this.zzf);
    }

    final /* synthetic */ void zzs() {
        this.zzf = zzcv();
    }
}
