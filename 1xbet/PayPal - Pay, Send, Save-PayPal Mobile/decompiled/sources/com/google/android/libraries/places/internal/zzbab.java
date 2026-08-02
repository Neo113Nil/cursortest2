package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzbab extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzbab zzi;
    private static volatile com.google.android.libraries.places.internal.zzbff zzj;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;

    static {
        com.google.android.libraries.places.internal.zzbab zzbabVar = new com.google.android.libraries.places.internal.zzbab();
        zzi = zzbabVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzbab.class, zzbabVar);
    }

    private zzbab() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzi, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzbab();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzbaa(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzbab.class) {
            zzbffVar = zzj;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzi);
                zzj = zzbffVar;
            }
        }
        return zzbffVar;
    }

    public final boolean zzi() {
        return this.zzh;
    }

    public final boolean zzh() {
        return (this.zzb & 8) != 0;
    }

    public final boolean zzg() {
        return this.zzg;
    }

    public final boolean zzf() {
        return (this.zzb & 4) != 0;
    }

    public final boolean zze() {
        return this.zzf;
    }

    public final boolean zzd() {
        return (this.zzb & 2) != 0;
    }

    public final boolean zzc() {
        return this.zze;
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public static com.google.android.libraries.places.internal.zzbab zzj() {
        return zzi;
    }
}
