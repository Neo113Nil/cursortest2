package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzgf extends com.google.android.gms.internal.measurement.zzme implements com.google.android.gms.internal.measurement.zznm {
    private static final com.google.android.gms.internal.measurement.zzgf zzi;
    private int zzb;
    private boolean zzg;
    private com.google.android.gms.internal.measurement.zzmn zzd = zzcv();
    private com.google.android.gms.internal.measurement.zzmn zze = zzcv();
    private com.google.android.gms.internal.measurement.zzmn zzf = zzcv();
    private com.google.android.gms.internal.measurement.zzmn zzh = zzcv();

    static {
        com.google.android.gms.internal.measurement.zzgf zzgfVar = new com.google.android.gms.internal.measurement.zzgf();
        zzi = zzgfVar;
        com.google.android.gms.internal.measurement.zzme.zzcp(com.google.android.gms.internal.measurement.zzgf.class, zzgfVar);
    }

    private zzgf() {
    }

    public static com.google.android.gms.internal.measurement.zzgf zzg() {
        return zzi;
    }

    public final java.util.List zza() {
        return this.zzd;
    }

    public final java.util.List zzb() {
        return this.zze;
    }

    public final java.util.List zzc() {
        return this.zzf;
    }

    public final boolean zzd() {
        return (this.zzb & 1) != 0;
    }

    public final boolean zze() {
        return this.zzg;
    }

    public final java.util.List zzf() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new java.lang.Object[]{"zzb", "zzd", com.google.android.gms.internal.measurement.zzfu.class, "zze", com.google.android.gms.internal.measurement.zzfw.class, "zzf", com.google.android.gms.internal.measurement.zzgc.class, "zzg", "zzh", com.google.android.gms.internal.measurement.zzfu.class});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzgf();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzfs(bArr);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }
}
