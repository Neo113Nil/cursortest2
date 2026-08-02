package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzaws extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzaws zzk;
    private static volatile com.google.android.libraries.places.internal.zzbff zzl;
    private int zzb;
    private com.google.android.libraries.places.internal.zzawq zzg;
    private com.google.android.libraries.places.internal.zzawy zzh;
    private int zzj;
    private java.lang.String zze = "";
    private java.lang.String zzf = "";
    private com.google.android.libraries.places.internal.zzbea zzi = com.google.android.libraries.places.internal.zzbdq.zzbG();

    static {
        com.google.android.libraries.places.internal.zzaws zzawsVar = new com.google.android.libraries.places.internal.zzaws();
        zzk = zzawsVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzaws.class, zzawsVar);
    }

    private zzaws() {
    }

    public final com.google.android.libraries.places.internal.zzawq zzc() {
        com.google.android.libraries.places.internal.zzawq zzawqVar = this.zzg;
        return zzawqVar == null ? com.google.android.libraries.places.internal.zzawq.zzd() : zzawqVar;
    }

    public final com.google.android.libraries.places.internal.zzawy zzd() {
        com.google.android.libraries.places.internal.zzawy zzawyVar = this.zzh;
        return zzawyVar == null ? com.google.android.libraries.places.internal.zzawy.zzd() : zzawyVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzk, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004ဉ\u0001\u0005Ț\u0006\u0004", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzaws();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzawr(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzaws.class) {
            zzbffVar = zzl;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzk);
                zzl = zzbffVar;
            }
        }
        return zzbffVar;
    }

    public final int zzf() {
        return this.zzj;
    }

    public final java.util.List zze() {
        return this.zzi;
    }

    public final java.lang.String zza() {
        return this.zzf;
    }

    public static com.google.android.libraries.places.internal.zzaws zzg() {
        return zzk;
    }
}
