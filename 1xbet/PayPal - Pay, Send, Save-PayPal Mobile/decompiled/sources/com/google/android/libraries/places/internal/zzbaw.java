package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzbaw extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzbaw zzh;
    private static volatile com.google.android.libraries.places.internal.zzbff zzi;
    private boolean zzb;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;

    static {
        com.google.android.libraries.places.internal.zzbaw zzbawVar = new com.google.android.libraries.places.internal.zzbaw();
        zzh = zzbawVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzbaw.class, zzbawVar);
    }

    private zzbaw() {
    }

    public static com.google.android.libraries.places.internal.zzbav zza() {
        return (com.google.android.libraries.places.internal.zzbav) zzh.zzbv();
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzh, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzbaw();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzbav(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzbaw.class) {
            zzbffVar = zzi;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzh);
                zzi = zzbffVar;
            }
        }
        return zzbffVar;
    }

    final /* synthetic */ void zzf(boolean z) {
        this.zzg = z;
    }

    final /* synthetic */ void zze(boolean z) {
        this.zzf = z;
    }

    final /* synthetic */ void zzd(boolean z) {
        this.zze = z;
    }

    final /* synthetic */ void zzc(boolean z) {
        this.zzb = z;
    }
}
