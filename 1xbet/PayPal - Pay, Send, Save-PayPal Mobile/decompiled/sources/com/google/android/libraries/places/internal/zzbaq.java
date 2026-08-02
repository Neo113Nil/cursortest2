package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzbaq extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzbaq zzg;
    private static volatile com.google.android.libraries.places.internal.zzbff zzh;
    private int zzb;
    private com.google.android.libraries.places.internal.zzbhx zze;
    private com.google.android.libraries.places.internal.zzbhx zzf;

    static {
        com.google.android.libraries.places.internal.zzbaq zzbaqVar = new com.google.android.libraries.places.internal.zzbaq();
        zzg = zzbaqVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzbaq.class, zzbaqVar);
    }

    private zzbaq() {
    }

    public final com.google.android.libraries.places.internal.zzbhx zzc() {
        com.google.android.libraries.places.internal.zzbhx zzbhxVar = this.zze;
        return zzbhxVar == null ? com.google.android.libraries.places.internal.zzbhx.zzg() : zzbhxVar;
    }

    public final com.google.android.libraries.places.internal.zzbhx zze() {
        com.google.android.libraries.places.internal.zzbhx zzbhxVar = this.zzf;
        return zzbhxVar == null ? com.google.android.libraries.places.internal.zzbhx.zzg() : zzbhxVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzg, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new java.lang.Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzbaq();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzbap(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzbaq.class) {
            zzbffVar = zzh;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzg);
                zzh = zzbffVar;
            }
        }
        return zzbffVar;
    }

    public final boolean zzd() {
        return (this.zzb & 2) != 0;
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public static com.google.android.libraries.places.internal.zzbaq zzf() {
        return zzg;
    }
}
