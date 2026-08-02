package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzbhx extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzbhx zzg;
    private static volatile com.google.android.libraries.places.internal.zzbff zzh;
    private java.lang.String zzb = "";
    private long zze;
    private int zzf;

    static {
        com.google.android.libraries.places.internal.zzbhx zzbhxVar = new com.google.android.libraries.places.internal.zzbhx();
        zzg = zzbhxVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzbhx.class, zzbhxVar);
    }

    private zzbhx() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0004", new java.lang.Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzbhx();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzbhw(bArr);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzh;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzbhx.class) {
            zzbffVar = zzh;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzg);
                zzh = zzbffVar;
            }
        }
        return zzbffVar;
    }

    public final int zzf() {
        return this.zzf;
    }

    public final long zze() {
        return this.zze;
    }

    public final java.lang.String zzc() {
        return this.zzb;
    }

    public static com.google.android.libraries.places.internal.zzbhx zzg() {
        return zzg;
    }
}
