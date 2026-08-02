package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzbau extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzbau zzo;
    private static volatile com.google.android.libraries.places.internal.zzbff zzp;
    private int zzb;
    private com.google.android.libraries.places.internal.zzbhv zzg;
    private com.google.android.libraries.places.internal.zzbhv zzh;
    private double zzi;
    private com.google.android.libraries.places.internal.zzawg zzj;
    private com.google.android.libraries.places.internal.zzbfw zzk;
    private com.google.android.libraries.places.internal.zzbhr zzn;
    private java.lang.String zze = "";
    private java.lang.String zzf = "";
    private java.lang.String zzl = "";
    private java.lang.String zzm = "";

    static {
        com.google.android.libraries.places.internal.zzbau zzbauVar = new com.google.android.libraries.places.internal.zzbau();
        zzo = zzbauVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzbau.class, zzbauVar);
    }

    private zzbau() {
    }

    public final com.google.android.libraries.places.internal.zzbhv zzd() {
        com.google.android.libraries.places.internal.zzbhv zzbhvVar = this.zzg;
        return zzbhvVar == null ? com.google.android.libraries.places.internal.zzbhv.zzf() : zzbhvVar;
    }

    public final com.google.android.libraries.places.internal.zzbhv zzf() {
        com.google.android.libraries.places.internal.zzbhv zzbhvVar = this.zzh;
        return zzbhvVar == null ? com.google.android.libraries.places.internal.zzbhv.zzf() : zzbhvVar;
    }

    public final com.google.android.libraries.places.internal.zzawg zzi() {
        com.google.android.libraries.places.internal.zzawg zzawgVar = this.zzj;
        return zzawgVar == null ? com.google.android.libraries.places.internal.zzawg.zze() : zzawgVar;
    }

    public final com.google.android.libraries.places.internal.zzbfw zzk() {
        com.google.android.libraries.places.internal.zzbfw zzbfwVar = this.zzk;
        return zzbfwVar == null ? com.google.android.libraries.places.internal.zzbfw.zzg() : zzbfwVar;
    }

    public final com.google.android.libraries.places.internal.zzbhr zzn() {
        com.google.android.libraries.places.internal.zzbhr zzbhrVar = this.zzn;
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
            return zzbA(zzo, "\u0000\n\u0000\u0001\u0001\u0011\n\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0007\u0000\tဉ\u0000\fဉ\u0001\rဉ\u0002\u000eဉ\u0003\u000fȈ\u0010Ȉ\u0011ဉ\u0004", new java.lang.Object[]{"zzb", "zze", "zzf", "zzi", "zzg", "zzh", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzbau();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzbat(bArr);
        }
        if (i2 == 5) {
            return zzo;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzp;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzbau.class) {
            zzbffVar = zzp;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzo);
                zzp = zzbffVar;
            }
        }
        return zzbffVar;
    }

    public final boolean zzm() {
        return (this.zzb & 16) != 0;
    }

    public final java.lang.String zzl() {
        return this.zzl;
    }

    public final boolean zzj() {
        return (this.zzb & 8) != 0;
    }

    public final boolean zzh() {
        return (this.zzb & 4) != 0;
    }

    public final double zzg() {
        return this.zzi;
    }

    public final boolean zze() {
        return (this.zzb & 2) != 0;
    }

    public final boolean zzc() {
        return (this.zzb & 1) != 0;
    }

    public final java.lang.String zza() {
        return this.zzf;
    }
}
