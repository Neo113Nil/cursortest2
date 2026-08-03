package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzik extends com.google.android.gms.internal.measurement.zzme implements com.google.android.gms.internal.measurement.zznm {
    private static final com.google.android.gms.internal.measurement.zzik zzf;
    private int zzb;
    private int zzd;
    private com.google.android.gms.internal.measurement.zzmm zze = zzct();

    static {
        com.google.android.gms.internal.measurement.zzik zzikVar = new com.google.android.gms.internal.measurement.zzik();
        zzf = zzikVar;
        com.google.android.gms.internal.measurement.zzme.zzcp(com.google.android.gms.internal.measurement.zzik.class, zzikVar);
    }

    private zzik() {
    }

    public static com.google.android.gms.internal.measurement.zzij zzf() {
        return (com.google.android.gms.internal.measurement.zzij) zzf.zzck();
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final java.util.List zzc() {
        return this.zze;
    }

    public final int zzd() {
        return this.zze.size();
    }

    public final long zze(int i) {
        return this.zze.zzc(i);
    }

    final /* synthetic */ void zzg(int i) {
        this.zzb |= 1;
        this.zzd = i;
    }

    final /* synthetic */ void zzh(java.lang.Iterable iterable) {
        com.google.android.gms.internal.measurement.zzmm zzmmVar = this.zze;
        if (!zzmmVar.zza()) {
            this.zze = com.google.android.gms.internal.measurement.zzme.zzcu(zzmmVar);
        }
        com.google.android.gms.internal.measurement.zzkr.zzce(iterable, this.zze);
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new java.lang.Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzik();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzij(bArr);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }
}
