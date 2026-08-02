package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzazi extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzazi zzk;
    private static volatile com.google.android.libraries.places.internal.zzbff zzl;
    private int zzb;
    private com.google.android.libraries.places.internal.zzaxe zze;
    private com.google.android.libraries.places.internal.zzaxe zzf;
    private com.google.android.libraries.places.internal.zzaxe zzg;
    private com.google.android.libraries.places.internal.zzaxe zzh;
    private java.lang.String zzi = "";
    private com.google.android.libraries.places.internal.zzbhv zzj;

    static {
        com.google.android.libraries.places.internal.zzazi zzaziVar = new com.google.android.libraries.places.internal.zzazi();
        zzk = zzaziVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzazi.class, zzaziVar);
    }

    private zzazi() {
    }

    public final com.google.android.libraries.places.internal.zzaxe zza() {
        com.google.android.libraries.places.internal.zzaxe zzaxeVar = this.zze;
        return zzaxeVar == null ? com.google.android.libraries.places.internal.zzaxe.zzd() : zzaxeVar;
    }

    public final com.google.android.libraries.places.internal.zzaxe zzd() {
        com.google.android.libraries.places.internal.zzaxe zzaxeVar = this.zzf;
        return zzaxeVar == null ? com.google.android.libraries.places.internal.zzaxe.zzd() : zzaxeVar;
    }

    public final com.google.android.libraries.places.internal.zzaxe zzf() {
        com.google.android.libraries.places.internal.zzaxe zzaxeVar = this.zzg;
        return zzaxeVar == null ? com.google.android.libraries.places.internal.zzaxe.zzd() : zzaxeVar;
    }

    public final com.google.android.libraries.places.internal.zzaxe zzh() {
        com.google.android.libraries.places.internal.zzaxe zzaxeVar = this.zzh;
        return zzaxeVar == null ? com.google.android.libraries.places.internal.zzaxe.zzd() : zzaxeVar;
    }

    public final com.google.android.libraries.places.internal.zzbhv zzj() {
        com.google.android.libraries.places.internal.zzbhv zzbhvVar = this.zzj;
        return zzbhvVar == null ? com.google.android.libraries.places.internal.zzbhv.zzf() : zzbhvVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzk, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005Ȉ\u0006ဉ\u0004", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzazi();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzazh(bArr);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzl;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzazi.class) {
            zzbffVar = zzl;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzk);
                zzl = zzbffVar;
            }
        }
        return zzbffVar;
    }

    public final java.lang.String zzi() {
        return this.zzi;
    }

    public final boolean zzg() {
        return (this.zzb & 8) != 0;
    }

    public final boolean zze() {
        return (this.zzb & 4) != 0;
    }

    public final boolean zzc() {
        return (this.zzb & 2) != 0;
    }

    public static com.google.android.libraries.places.internal.zzazi zzk() {
        return zzk;
    }
}
