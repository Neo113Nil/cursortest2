package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzbaf extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzbaf zzi;
    private static volatile com.google.android.libraries.places.internal.zzbff zzj;
    private int zzb;
    private com.google.android.libraries.places.internal.zzbhv zze;
    private com.google.android.libraries.places.internal.zzbhv zzg;
    private java.lang.String zzf = "";
    private java.lang.String zzh = "";

    static {
        com.google.android.libraries.places.internal.zzbaf zzbafVar = new com.google.android.libraries.places.internal.zzbaf();
        zzi = zzbafVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzbaf.class, zzbafVar);
    }

    private zzbaf() {
    }

    public final com.google.android.libraries.places.internal.zzbhv zza() {
        com.google.android.libraries.places.internal.zzbhv zzbhvVar = this.zze;
        return zzbhvVar == null ? com.google.android.libraries.places.internal.zzbhv.zzf() : zzbhvVar;
    }

    public final com.google.android.libraries.places.internal.zzbhv zzd() {
        com.google.android.libraries.places.internal.zzbhv zzbhvVar = this.zzg;
        return zzbhvVar == null ? com.google.android.libraries.places.internal.zzbhv.zzf() : zzbhvVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzi, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003ဉ\u0001\u0004Ȉ", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzbaf();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzbae(bArr);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzj;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzbaf.class) {
            zzbffVar = zzj;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzi);
                zzj = zzbffVar;
            }
        }
        return zzbffVar;
    }

    public final java.lang.String zze() {
        return this.zzh;
    }

    public final java.lang.String zzc() {
        return this.zzf;
    }

    public static com.google.android.libraries.places.internal.zzbaf zzf() {
        return zzi;
    }
}
