package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzja extends com.google.android.gms.internal.measurement.zzme implements com.google.android.gms.internal.measurement.zznm {
    private static final com.google.android.gms.internal.measurement.zzja zzf;
    private int zzb;
    private com.google.android.gms.internal.measurement.zzmn zzd = zzcv();
    private com.google.android.gms.internal.measurement.zziw zze;

    static {
        com.google.android.gms.internal.measurement.zzja zzjaVar = new com.google.android.gms.internal.measurement.zzja();
        zzf = zzjaVar;
        com.google.android.gms.internal.measurement.zzme.zzcp(com.google.android.gms.internal.measurement.zzja.class, zzjaVar);
    }

    private zzja() {
    }

    public final java.util.List zza() {
        return this.zzd;
    }

    public final com.google.android.gms.internal.measurement.zziw zzb() {
        com.google.android.gms.internal.measurement.zziw zziwVar = this.zze;
        return zziwVar == null ? com.google.android.gms.internal.measurement.zziw.zzc() : zziwVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new java.lang.Object[]{"zzb", "zzd", com.google.android.gms.internal.measurement.zzje.class, "zze"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzja();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zziz(bArr);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }
}
