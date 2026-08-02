package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzazz extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzazz zzl;
    private static volatile com.google.android.libraries.places.internal.zzbff zzm;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        com.google.android.libraries.places.internal.zzazz zzazzVar = new com.google.android.libraries.places.internal.zzazz();
        zzl = zzazzVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzazz.class, zzazzVar);
    }

    private zzazz() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzl, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzazz();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzazy(bArr);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzm;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzazz.class) {
            zzbffVar = zzm;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzl);
                zzm = zzbffVar;
            }
        }
        return zzbffVar;
    }

    public final boolean zzo() {
        return this.zzk;
    }

    public final boolean zzn() {
        return (this.zzb & 64) != 0;
    }

    public final boolean zzm() {
        return this.zzj;
    }

    public final boolean zzl() {
        return (this.zzb & 32) != 0;
    }

    public final boolean zzk() {
        return this.zzi;
    }

    public final boolean zzj() {
        return (this.zzb & 16) != 0;
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

    public static com.google.android.libraries.places.internal.zzazz zzp() {
        return zzl;
    }
}
