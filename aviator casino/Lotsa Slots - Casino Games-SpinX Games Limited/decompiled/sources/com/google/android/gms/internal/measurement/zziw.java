package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zziw extends com.google.android.gms.internal.measurement.zzme implements com.google.android.gms.internal.measurement.zznm {
    private static final com.google.android.gms.internal.measurement.zziw zzd;
    private com.google.android.gms.internal.measurement.zzmn zzb = zzcv();

    static {
        com.google.android.gms.internal.measurement.zziw zziwVar = new com.google.android.gms.internal.measurement.zziw();
        zzd = zziwVar;
        com.google.android.gms.internal.measurement.zzme.zzcp(com.google.android.gms.internal.measurement.zziw.class, zziwVar);
    }

    private zziw() {
    }

    public static com.google.android.gms.internal.measurement.zziw zzc() {
        return zzd;
    }

    public final java.util.List zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzb.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"zzb", com.google.android.gms.internal.measurement.zziy.class});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zziw();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zziv(bArr);
        }
        if (i2 == 5) {
            return zzd;
        }
        throw null;
    }
}
