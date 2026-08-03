package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzgn extends com.google.android.gms.internal.measurement.zzme implements com.google.android.gms.internal.measurement.zznm {
    private static final com.google.android.gms.internal.measurement.zzgn zzd;
    private com.google.android.gms.internal.measurement.zzmn zzb = com.google.android.gms.internal.measurement.zzme.zzcv();

    static {
        com.google.android.gms.internal.measurement.zzgn zzgnVar = new com.google.android.gms.internal.measurement.zzgn();
        zzd = zzgnVar;
        com.google.android.gms.internal.measurement.zzme.zzcp(com.google.android.gms.internal.measurement.zzgn.class, zzgnVar);
    }

    private zzgn() {
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new java.lang.Object[]{"zzb"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzgn();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzgm(bArr);
        }
        if (i2 == 5) {
            return zzd;
        }
        throw null;
    }
}
