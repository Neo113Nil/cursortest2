package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzbfw extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzbfw zzf;
    private static volatile com.google.android.libraries.places.internal.zzbff zzg;
    private long zzb;
    private int zze;

    static {
        com.google.android.libraries.places.internal.zzbfw zzbfwVar = new com.google.android.libraries.places.internal.zzbfw();
        zzf = zzbfwVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzbfw.class, zzbfwVar);
    }

    private zzbfw() {
    }

    public static com.google.android.libraries.places.internal.zzbfv zzf() {
        return (com.google.android.libraries.places.internal.zzbfv) zzf.zzbv();
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new com.google.android.libraries.places.internal.zzbfj(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new java.lang.Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzbfw();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzbfv(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzbfw.class) {
            zzbffVar = zzg;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzf);
                zzg = zzbffVar;
            }
        }
        return zzbffVar;
    }

    final /* synthetic */ void zzi(int i) {
        this.zze = i;
    }

    final /* synthetic */ void zzh(long j) {
        this.zzb = j;
    }

    public final int zze() {
        return this.zze;
    }

    public final long zzc() {
        return this.zzb;
    }

    public static com.google.android.libraries.places.internal.zzbfw zzg() {
        return zzf;
    }
}
