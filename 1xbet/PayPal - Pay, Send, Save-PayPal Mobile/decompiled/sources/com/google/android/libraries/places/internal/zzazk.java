package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzazk extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzazk zzk;
    private static volatile com.google.android.libraries.places.internal.zzbff zzl;
    private int zzb;
    private com.google.android.libraries.places.internal.zzbhv zze;
    private com.google.android.libraries.places.internal.zzbhv zzg;
    private com.google.android.libraries.places.internal.zzbas zzi;
    private com.google.android.libraries.places.internal.zzbhv zzj;
    private java.lang.String zzf = "";
    private java.lang.String zzh = "";

    static {
        com.google.android.libraries.places.internal.zzazk zzazkVar = new com.google.android.libraries.places.internal.zzazk();
        zzk = zzazkVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzazk.class, zzazkVar);
    }

    private zzazk() {
    }

    public final com.google.android.libraries.places.internal.zzbhv zzc() {
        com.google.android.libraries.places.internal.zzbhv zzbhvVar = this.zze;
        return zzbhvVar == null ? com.google.android.libraries.places.internal.zzbhv.zzf() : zzbhvVar;
    }

    public final com.google.android.libraries.places.internal.zzbhv zzf() {
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
            return zzbA(zzk, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004Ȉ\u0005Ȉ\u0006ဉ\u0003", new java.lang.Object[]{"zzb", "zze", "zzg", "zzi", "zzf", "zzh", "zzj"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzazk();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzazj(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzazk.class) {
            zzbffVar = zzl;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzk);
                zzl = zzbffVar;
            }
        }
        return zzbffVar;
    }

    public final boolean zze() {
        return (this.zzb & 8) != 0;
    }

    public final java.lang.String zzd() {
        return this.zzf;
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public static com.google.android.libraries.places.internal.zzazk zzg() {
        return zzk;
    }
}
