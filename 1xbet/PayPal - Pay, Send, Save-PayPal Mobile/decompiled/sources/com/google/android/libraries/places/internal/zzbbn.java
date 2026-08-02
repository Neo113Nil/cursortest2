package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzbbn extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzbbn zzg;
    private static volatile com.google.android.libraries.places.internal.zzbff zzh;
    private double zzb;
    private com.google.android.libraries.places.internal.zzbdy zze = zzbD();
    private com.google.android.libraries.places.internal.zzbea zzf = com.google.android.libraries.places.internal.zzbdq.zzbG();

    static {
        com.google.android.libraries.places.internal.zzbbn zzbbnVar = new com.google.android.libraries.places.internal.zzbbn();
        zzg = zzbbnVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzbbn.class, zzbbnVar);
    }

    private zzbbn() {
    }

    public static com.google.android.libraries.places.internal.zzbbm zza() {
        return (com.google.android.libraries.places.internal.zzbbm) zzg.zzbv();
    }

    final /* synthetic */ void zzd(java.lang.Iterable iterable) {
        com.google.android.libraries.places.internal.zzbdy zzbdyVar = this.zze;
        if (!zzbdyVar.zza()) {
            this.zze = com.google.android.libraries.places.internal.zzbdq.zzbE(zzbdyVar);
        }
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.zze.zzh(((com.google.android.libraries.places.internal.zzaxz) it.next()).zza());
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u0000\u0002,\u0003Ț", new java.lang.Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzbbn();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzbbm(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzbbn.class) {
            zzbffVar = zzh;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzg);
                zzh = zzbffVar;
            }
        }
        return zzbffVar;
    }

    final /* synthetic */ void zzc(double d) {
        this.zzb = d;
    }
}
