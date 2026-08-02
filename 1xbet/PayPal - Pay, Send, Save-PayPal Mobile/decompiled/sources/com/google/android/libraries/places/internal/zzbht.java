package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzbht extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzbht zzf;
    private static volatile com.google.android.libraries.places.internal.zzbff zzg;
    private double zzb;
    private double zze;

    static {
        com.google.android.libraries.places.internal.zzbht zzbhtVar = new com.google.android.libraries.places.internal.zzbht();
        zzf = zzbhtVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzbht.class, zzbhtVar);
    }

    private zzbht() {
    }

    public static com.google.android.libraries.places.internal.zzbhs zzf() {
        return (com.google.android.libraries.places.internal.zzbhs) zzf.zzbv();
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new java.lang.Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzbht();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzbhs(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzbht.class) {
            zzbffVar = zzg;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzf);
                zzg = zzbffVar;
            }
        }
        return zzbffVar;
    }

    final /* synthetic */ void zzi(double d) {
        this.zze = d;
    }

    final /* synthetic */ void zzh(double d) {
        this.zzb = d;
    }

    public final double zze() {
        return this.zze;
    }

    public final double zzc() {
        return this.zzb;
    }

    public static com.google.android.libraries.places.internal.zzbht zzg() {
        return zzf;
    }
}
