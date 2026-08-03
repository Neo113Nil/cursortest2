package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzho extends com.google.android.gms.internal.measurement.zzme implements com.google.android.gms.internal.measurement.zznm {
    private static final com.google.android.gms.internal.measurement.zzho zzd;
    private com.google.android.gms.internal.measurement.zzmn zzb = zzcv();

    static {
        com.google.android.gms.internal.measurement.zzho zzhoVar = new com.google.android.gms.internal.measurement.zzho();
        zzd = zzhoVar;
        com.google.android.gms.internal.measurement.zzme.zzcp(com.google.android.gms.internal.measurement.zzho.class, zzhoVar);
    }

    private zzho() {
    }

    public static com.google.android.gms.internal.measurement.zzhh zzb() {
        return (com.google.android.gms.internal.measurement.zzhh) zzd.zzck();
    }

    public static com.google.android.gms.internal.measurement.zzho zzc() {
        return zzd;
    }

    public final java.util.List zza() {
        return this.zzb;
    }

    final /* synthetic */ void zzd(java.lang.Iterable iterable) {
        com.google.android.gms.internal.measurement.zzmn zzmnVar = this.zzb;
        if (!zzmnVar.zza()) {
            this.zzb = com.google.android.gms.internal.measurement.zzme.zzcw(zzmnVar);
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
            return zzcq(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"zzb", com.google.android.gms.internal.measurement.zzhl.class});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzho();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzhh(bArr);
        }
        if (i2 == 5) {
            return zzd;
        }
        throw null;
    }
}
