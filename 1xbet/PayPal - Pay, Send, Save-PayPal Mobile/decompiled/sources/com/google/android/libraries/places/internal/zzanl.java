package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzanl extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzanl zzl;
    private static volatile com.google.android.libraries.places.internal.zzbff zzm;
    private int zzb;
    private com.google.android.libraries.places.internal.zzadg zzf;
    private byte zzk = 2;
    private java.lang.String zze = "";
    private java.lang.String zzg = "";
    private com.google.android.libraries.places.internal.zzbea zzh = com.google.android.libraries.places.internal.zzbdq.zzbG();
    private java.lang.String zzi = "";
    private java.lang.String zzj = "";

    static {
        com.google.android.libraries.places.internal.zzanl zzanlVar = new com.google.android.libraries.places.internal.zzanl();
        zzl = zzanlVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzanl.class, zzanlVar);
    }

    private zzanl() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.zzk);
        }
        if (i2 == 2) {
            return zzbA(zzl, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002\u0004\u001a\u0005ဈ\u0003\u0006ဈ\u0004", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzanl();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzank(bArr);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            this.zzk = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzm;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzanl.class) {
            zzbffVar = zzm;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzl);
                zzm = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
