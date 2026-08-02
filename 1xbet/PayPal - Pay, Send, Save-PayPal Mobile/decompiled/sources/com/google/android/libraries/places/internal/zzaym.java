package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzaym extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzaym zzj;
    private static volatile com.google.android.libraries.places.internal.zzbff zzk;
    private int zze;
    private int zzf;
    private java.lang.String zzb = "";
    private com.google.android.libraries.places.internal.zzbea zzg = zzbG();
    private java.lang.String zzh = "";
    private java.lang.String zzi = "";

    static {
        com.google.android.libraries.places.internal.zzaym zzaymVar = new com.google.android.libraries.places.internal.zzaym();
        zzj = zzaymVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzaym.class, zzaymVar);
    }

    private zzaym() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzj, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u001b\u0005Ȉ\u0006Ȉ", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", com.google.android.libraries.places.internal.zzawg.class, "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzaym();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzayl(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzaym.class) {
            zzbffVar = zzk;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzj);
                zzk = zzbffVar;
            }
        }
        return zzbffVar;
    }

    public final java.lang.String zzf() {
        return this.zzh;
    }

    public final java.util.List zze() {
        return this.zzg;
    }

    public final int zzd() {
        return this.zzf;
    }

    public final int zzc() {
        return this.zze;
    }

    public final java.lang.String zza() {
        return this.zzb;
    }
}
