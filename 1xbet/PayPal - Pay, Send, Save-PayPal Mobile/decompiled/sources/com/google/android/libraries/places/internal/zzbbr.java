package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzbbr extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzbbr zzf;
    private static volatile com.google.android.libraries.places.internal.zzbff zzg;
    private int zzb = 0;
    private java.lang.Object zze;

    static {
        com.google.android.libraries.places.internal.zzbbr zzbbrVar = new com.google.android.libraries.places.internal.zzbbr();
        zzf = zzbbrVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzbbr.class, zzbbrVar);
    }

    private zzbbr() {
    }

    public static com.google.android.libraries.places.internal.zzbbq zza() {
        return (com.google.android.libraries.places.internal.zzbbq) zzf.zzbv();
    }

    final /* synthetic */ void zzc(com.google.android.libraries.places.internal.zzaua zzauaVar) {
        this.zze = zzauaVar;
        this.zzb = 1;
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzf, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new java.lang.Object[]{"zze", "zzb", com.google.android.libraries.places.internal.zzaua.class});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzbbr();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzbbq(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzbbr.class) {
            zzbffVar = zzg;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzf);
                zzg = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
