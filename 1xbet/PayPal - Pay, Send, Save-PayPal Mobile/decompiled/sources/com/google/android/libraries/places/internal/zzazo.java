package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzazo extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzazo zzi;
    private static volatile com.google.android.libraries.places.internal.zzbff zzj;
    private int zzb;
    private com.google.android.libraries.places.internal.zzaxe zze;
    private com.google.android.libraries.places.internal.zzaxe zzf;
    private java.lang.String zzg = "";
    private com.google.android.libraries.places.internal.zzbhv zzh;

    static {
        com.google.android.libraries.places.internal.zzazo zzazoVar = new com.google.android.libraries.places.internal.zzazo();
        zzi = zzazoVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzazo.class, zzazoVar);
    }

    private zzazo() {
    }

    public final com.google.android.libraries.places.internal.zzaxe zzc() {
        com.google.android.libraries.places.internal.zzaxe zzaxeVar = this.zze;
        return zzaxeVar == null ? com.google.android.libraries.places.internal.zzaxe.zzd() : zzaxeVar;
    }

    public final com.google.android.libraries.places.internal.zzaxe zze() {
        com.google.android.libraries.places.internal.zzaxe zzaxeVar = this.zzf;
        return zzaxeVar == null ? com.google.android.libraries.places.internal.zzaxe.zzd() : zzaxeVar;
    }

    public final com.google.android.libraries.places.internal.zzbhv zzg() {
        com.google.android.libraries.places.internal.zzbhv zzbhvVar = this.zzh;
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
            return zzbA(zzi, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004ဉ\u0002", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzazo();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzazn(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzazo.class) {
            zzbffVar = zzj;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzi);
                zzj = zzbffVar;
            }
        }
        return zzbffVar;
    }

    public final java.lang.String zzf() {
        return this.zzg;
    }

    public final boolean zzd() {
        return (this.zzb & 2) != 0;
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public static com.google.android.libraries.places.internal.zzazo zzh() {
        return zzi;
    }
}
