package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzavr extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzavr zzh;
    private static volatile com.google.android.libraries.places.internal.zzbff zzi;
    private java.lang.String zzb = "";
    private java.lang.String zze = "";
    private com.google.android.libraries.places.internal.zzbea zzf = com.google.android.libraries.places.internal.zzbdq.zzbG();
    private java.lang.String zzg = "";

    static {
        com.google.android.libraries.places.internal.zzavr zzavrVar = new com.google.android.libraries.places.internal.zzavr();
        zzh = zzavrVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzavr.class, zzavrVar);
    }

    private zzavr() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzh, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ț\u0004Ȉ", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzavr();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzavq(bArr);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzi;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzavr.class) {
            zzbffVar = zzi;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzh);
                zzi = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
