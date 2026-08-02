package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzaqe extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzaqe zzg;
    private static volatile com.google.android.libraries.places.internal.zzbff zzh;
    private int zzb;
    private double zze;
    private com.google.android.libraries.places.internal.zzbdy zzf = zzbD();

    static {
        com.google.android.libraries.places.internal.zzaqe zzaqeVar = new com.google.android.libraries.places.internal.zzaqe();
        zzg = zzaqeVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzaqe.class, zzaqeVar);
    }

    private zzaqe() {
    }

    public static com.google.android.libraries.places.internal.zzaqd zza() {
        return (com.google.android.libraries.places.internal.zzaqd) zzg.zzbv();
    }

    final /* synthetic */ void zzd(java.lang.Iterable iterable) {
        com.google.android.libraries.places.internal.zzbdy zzbdyVar = this.zzf;
        if (!zzbdyVar.zza()) {
            this.zzf = com.google.android.libraries.places.internal.zzbdq.zzbE(zzbdyVar);
        }
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.zzf.zzh(((com.google.android.libraries.places.internal.zzala) it.next()).zza());
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
            return zzbA(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001က\u0000\u0002ࠬ", new java.lang.Object[]{"zzb", "zze", "zzf", com.google.android.libraries.places.internal.zzakz.zza});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzaqe();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzaqd(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzaqe.class) {
            zzbffVar = zzh;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzg);
                zzh = zzbffVar;
            }
        }
        return zzbffVar;
    }

    final /* synthetic */ void zzc(double d) {
        this.zzb |= 1;
        this.zze = d;
    }
}
