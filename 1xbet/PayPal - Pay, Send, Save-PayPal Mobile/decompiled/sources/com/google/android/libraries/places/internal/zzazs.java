package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzazs extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzazs zzj;
    private static volatile com.google.android.libraries.places.internal.zzbff zzk;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private com.google.android.libraries.places.internal.zzbhr zzh;
    private boolean zzi;

    static {
        com.google.android.libraries.places.internal.zzazs zzazsVar = new com.google.android.libraries.places.internal.zzazs();
        zzj = zzazsVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzazs.class, zzazsVar);
    }

    private zzazs() {
    }

    public final com.google.android.libraries.places.internal.zzbhr zzf() {
        com.google.android.libraries.places.internal.zzbhr zzbhrVar = this.zzh;
        return zzbhrVar == null ? com.google.android.libraries.places.internal.zzbhr.zzg() : zzbhrVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzj, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0005\u0007\u0006ဉ\u0003", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzi", "zzh"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzazs();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzazr(bArr);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzk;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzazs.class) {
            zzbffVar = zzk;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzj);
                zzk = zzbffVar;
            }
        }
        return zzbffVar;
    }

    public final boolean zzg() {
        return this.zzi;
    }

    public final boolean zze() {
        return (this.zzb & 8) != 0;
    }

    public final int zzd() {
        return this.zzg;
    }

    public final int zzc() {
        return this.zzf;
    }

    public final int zza() {
        return this.zze;
    }

    public static com.google.android.libraries.places.internal.zzazs zzh() {
        return zzj;
    }
}
