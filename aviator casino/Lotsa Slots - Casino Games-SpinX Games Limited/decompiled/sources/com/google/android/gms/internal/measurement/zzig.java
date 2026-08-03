package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzig extends com.google.android.gms.internal.measurement.zzme implements com.google.android.gms.internal.measurement.zznm {
    private static final com.google.android.gms.internal.measurement.zzig zzf;
    private int zzb;
    private int zzd = 1;
    private com.google.android.gms.internal.measurement.zzmn zze = zzcv();

    static {
        com.google.android.gms.internal.measurement.zzig zzigVar = new com.google.android.gms.internal.measurement.zzig();
        zzf = zzigVar;
        com.google.android.gms.internal.measurement.zzme.zzcp(com.google.android.gms.internal.measurement.zzig.class, zzigVar);
    }

    private zzig() {
    }

    public static com.google.android.gms.internal.measurement.zzie zza() {
        return (com.google.android.gms.internal.measurement.zzie) zzf.zzck();
    }

    final /* synthetic */ void zzb(com.google.android.gms.internal.measurement.zzhu zzhuVar) {
        zzhuVar.getClass();
        com.google.android.gms.internal.measurement.zzmn zzmnVar = this.zze;
        if (!zzmnVar.zza()) {
            this.zze = com.google.android.gms.internal.measurement.zzme.zzcw(zzmnVar);
        }
        this.zze.add(zzhuVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new java.lang.Object[]{"zzb", "zzd", com.google.android.gms.internal.measurement.zzif.zza, "zze", com.google.android.gms.internal.measurement.zzhu.class});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzig();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzie(bArr);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }
}
