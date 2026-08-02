package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbhe extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzbhe zzf;
    private static volatile com.google.android.libraries.places.internal.zzbff zzg;
    private int zzb;
    private java.lang.String zze = "";

    static {
        com.google.android.libraries.places.internal.zzbhe zzbheVar = new com.google.android.libraries.places.internal.zzbhe();
        zzf = zzbheVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzbhe.class, zzbheVar);
    }

    private zzbhe() {
    }

    public static com.google.android.libraries.places.internal.zzbhd zzc() {
        return (com.google.android.libraries.places.internal.zzbhd) zzf.zzbv();
    }

    final /* synthetic */ void zzf(java.lang.String str) {
        this.zzb |= 1;
        this.zze = str;
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzf, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new java.lang.Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzbhe();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzbhd(bArr);
        }
        if (i2 == 5) {
            return zzf;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzg;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzbhe.class) {
            zzbffVar = zzg;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzf);
                zzg = zzbffVar;
            }
        }
        return zzbffVar;
    }

    public static com.google.android.libraries.places.internal.zzbhe zze() {
        return zzf;
    }
}
