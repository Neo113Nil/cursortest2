package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzbay extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzbay zzi;
    private static volatile com.google.android.libraries.places.internal.zzbff zzj;
    private int zzb;
    private com.google.android.libraries.places.internal.zzbht zze;
    private int zzf;
    private com.google.android.libraries.places.internal.zzbaw zzg;
    private int zzh;

    static {
        com.google.android.libraries.places.internal.zzbay zzbayVar = new com.google.android.libraries.places.internal.zzbay();
        zzi = zzbayVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzbay.class, zzbayVar);
    }

    private zzbay() {
    }

    public static com.google.android.libraries.places.internal.zzbax zza() {
        return (com.google.android.libraries.places.internal.zzbax) zzi.zzbv();
    }

    final /* synthetic */ void zzc(com.google.android.libraries.places.internal.zzbht zzbhtVar) {
        this.zze = zzbhtVar;
        this.zzb |= 1;
    }

    final /* synthetic */ void zzd(com.google.android.libraries.places.internal.zzbaw zzbawVar) {
        this.zzg = zzbawVar;
        this.zzb |= 2;
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzi, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003ဉ\u0001\u0004\f", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzbay();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzbax(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzbay.class) {
            zzbffVar = zzj;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzi);
                zzj = zzbffVar;
            }
        }
        return zzbffVar;
    }

    final /* synthetic */ void zzg(int i) {
        this.zzh = i - 2;
    }

    final /* synthetic */ void zzf(int i) {
        this.zzf = i - 2;
    }
}
