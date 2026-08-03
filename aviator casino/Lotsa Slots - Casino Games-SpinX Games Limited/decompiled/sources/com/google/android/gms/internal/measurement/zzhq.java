package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzhq extends com.google.android.gms.internal.measurement.zzme implements com.google.android.gms.internal.measurement.zznm {
    private static final com.google.android.gms.internal.measurement.zzhq zzf;
    private int zzb;
    private int zzd;
    private long zze;

    static {
        com.google.android.gms.internal.measurement.zzhq zzhqVar = new com.google.android.gms.internal.measurement.zzhq();
        zzf = zzhqVar;
        com.google.android.gms.internal.measurement.zzme.zzcp(com.google.android.gms.internal.measurement.zzhq.class, zzhqVar);
    }

    private zzhq() {
    }

    public static com.google.android.gms.internal.measurement.zzhp zze() {
        return (com.google.android.gms.internal.measurement.zzhp) zzf.zzck();
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final boolean zzc() {
        return (this.zzb & 2) != 0;
    }

    public final long zzd() {
        return this.zze;
    }

    final /* synthetic */ void zzf(int i) {
        this.zzb |= 1;
        this.zzd = i;
    }

    final /* synthetic */ void zzg(long j) {
        this.zzb |= 2;
        this.zze = j;
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new java.lang.Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzhq();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzhp(bArr);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }
}
