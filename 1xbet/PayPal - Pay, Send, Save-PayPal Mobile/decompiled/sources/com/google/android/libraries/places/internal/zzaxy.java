package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzaxy extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzaxy zzg;
    private static volatile com.google.android.libraries.places.internal.zzbff zzh;
    private int zzb;
    private com.google.android.libraries.places.internal.zzbea zze = zzbG();
    private com.google.android.libraries.places.internal.zzbea zzf = zzbG();

    static {
        com.google.android.libraries.places.internal.zzaxy zzaxyVar = new com.google.android.libraries.places.internal.zzaxy();
        zzg = zzaxyVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzaxy.class, zzaxyVar);
    }

    private zzaxy() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u0004\u0002\u001b\u0003\u001b", new java.lang.Object[]{"zzb", "zze", com.google.android.libraries.places.internal.zzaxv.class, "zzf", com.google.android.libraries.places.internal.zzaxx.class});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzaxy();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzaxt(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzaxy.class) {
            zzbffVar = zzh;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzg);
                zzh = zzbffVar;
            }
        }
        return zzbffVar;
    }

    public final java.util.List zzc() {
        return this.zze;
    }

    public final int zza() {
        return this.zzb;
    }

    public static com.google.android.libraries.places.internal.zzaxy zzd() {
        return zzg;
    }
}
