package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzaqm extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzaqm zzk;
    private static volatile com.google.android.libraries.places.internal.zzbff zzl;
    private int zzb;
    private com.google.android.libraries.places.internal.zzadi zze;
    private int zzf;
    private int zzg;
    private int zzi;
    private byte zzj = 2;
    private java.lang.String zzh = "";

    static {
        com.google.android.libraries.places.internal.zzaqm zzaqmVar = new com.google.android.libraries.places.internal.zzaqm();
        zzk = zzaqmVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzaqm.class, zzaqmVar);
    }

    private zzaqm() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.zzj);
        }
        if (i2 == 2) {
            return zzbA(zzk, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001\u0003င\u0002\u0004ဈ\u0003\u0005᠌\u0004", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", com.google.android.libraries.places.internal.zzaql.zza});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzaqm();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzaqk(bArr);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            this.zzj = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzl;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzaqm.class) {
            zzbffVar = zzl;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzk);
                zzl = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
