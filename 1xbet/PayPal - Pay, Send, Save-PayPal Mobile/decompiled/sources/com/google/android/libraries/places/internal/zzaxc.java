package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzaxc extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzaxc zzg;
    private static volatile com.google.android.libraries.places.internal.zzbff zzh;
    private int zzb;
    private com.google.android.libraries.places.internal.zzbht zze;
    private double zzf;

    static {
        com.google.android.libraries.places.internal.zzaxc zzaxcVar = new com.google.android.libraries.places.internal.zzaxc();
        zzg = zzaxcVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzaxc.class, zzaxcVar);
    }

    private zzaxc() {
    }

    public static com.google.android.libraries.places.internal.zzaxb zza() {
        return (com.google.android.libraries.places.internal.zzaxb) zzg.zzbv();
    }

    final /* synthetic */ void zzc(com.google.android.libraries.places.internal.zzbht zzbhtVar) {
        this.zze = zzbhtVar;
        this.zzb |= 1;
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzg, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0000", new java.lang.Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzaxc();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzaxb(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzaxc.class) {
            zzbffVar = zzh;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzg);
                zzh = zzbffVar;
            }
        }
        return zzbffVar;
    }

    final /* synthetic */ void zzd(double d) {
        this.zzf = d;
    }
}
