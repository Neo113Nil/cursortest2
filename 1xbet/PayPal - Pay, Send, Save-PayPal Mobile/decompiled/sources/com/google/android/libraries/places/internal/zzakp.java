package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzakp extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzakp zzk;
    private static volatile com.google.android.libraries.places.internal.zzbff zzl;
    private int zzb;
    private int zze;
    private com.google.android.libraries.places.internal.zzakm zzf;
    private com.google.android.libraries.places.internal.zzakm zzg;
    private int zzh;
    private com.google.android.libraries.places.internal.zzakr zzi;
    private com.google.android.libraries.places.internal.zzajj zzj;

    static {
        com.google.android.libraries.places.internal.zzakp zzakpVar = new com.google.android.libraries.places.internal.zzakp();
        zzk = zzakpVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzakp.class, zzakpVar);
    }

    private zzakp() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004᠌\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new java.lang.Object[]{"zzb", "zze", com.google.android.libraries.places.internal.zzakn.zza, "zzf", "zzg", "zzh", com.google.android.libraries.places.internal.zzako.zza, "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzakp();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzakj(bArr);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzl;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzakp.class) {
            zzbffVar = zzl;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzk);
                zzl = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
