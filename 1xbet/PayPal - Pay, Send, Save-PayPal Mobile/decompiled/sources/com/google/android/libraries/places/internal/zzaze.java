package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzaze extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzaze zzh;
    private static volatile com.google.android.libraries.places.internal.zzbff zzi;
    private int zzb;
    private com.google.android.libraries.places.internal.zzazd zzf;
    private java.lang.String zze = "";
    private java.lang.String zzg = "";

    static {
        com.google.android.libraries.places.internal.zzaze zzazeVar = new com.google.android.libraries.places.internal.zzaze();
        zzh = zzazeVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzaze.class, zzazeVar);
    }

    private zzaze() {
    }

    public final com.google.android.libraries.places.internal.zzazd zzd() {
        com.google.android.libraries.places.internal.zzazd zzazdVar = this.zzf;
        return zzazdVar == null ? com.google.android.libraries.places.internal.zzazd.zze() : zzazdVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzh, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzaze();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzayz(bArr);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzi;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzaze.class) {
            zzbffVar = zzi;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzh);
                zzi = zzbffVar;
            }
        }
        return zzbffVar;
    }

    public final java.lang.String zze() {
        return this.zzg;
    }

    public final boolean zzc() {
        return (this.zzb & 1) != 0;
    }

    public final java.lang.String zza() {
        return this.zze;
    }

    public static com.google.android.libraries.places.internal.zzaze zzf() {
        return zzh;
    }
}
