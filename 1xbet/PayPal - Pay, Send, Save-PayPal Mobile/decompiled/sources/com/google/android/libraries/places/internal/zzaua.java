package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzaua extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzaua zzg;
    private static volatile com.google.android.libraries.places.internal.zzbff zzh;
    private int zzb;
    private com.google.android.libraries.places.internal.zzbht zze;
    private com.google.android.libraries.places.internal.zzbht zzf;

    static {
        com.google.android.libraries.places.internal.zzaua zzauaVar = new com.google.android.libraries.places.internal.zzaua();
        zzg = zzauaVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzaua.class, zzauaVar);
    }

    private zzaua() {
    }

    public static com.google.android.libraries.places.internal.zzatz zzd() {
        return (com.google.android.libraries.places.internal.zzatz) zzg.zzbv();
    }

    public final com.google.android.libraries.places.internal.zzbht zza() {
        com.google.android.libraries.places.internal.zzbht zzbhtVar = this.zze;
        return zzbhtVar == null ? com.google.android.libraries.places.internal.zzbht.zzg() : zzbhtVar;
    }

    public final com.google.android.libraries.places.internal.zzbht zzc() {
        com.google.android.libraries.places.internal.zzbht zzbhtVar = this.zzf;
        return zzbhtVar == null ? com.google.android.libraries.places.internal.zzbht.zzg() : zzbhtVar;
    }

    final /* synthetic */ void zzf(com.google.android.libraries.places.internal.zzbht zzbhtVar) {
        this.zze = zzbhtVar;
        this.zzb |= 1;
    }

    final /* synthetic */ void zzg(com.google.android.libraries.places.internal.zzbht zzbhtVar) {
        this.zzf = zzbhtVar;
        this.zzb |= 2;
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzg, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new java.lang.Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzaua();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzatz(bArr);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzh;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzaua.class) {
            zzbffVar = zzh;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzg);
                zzh = zzbffVar;
            }
        }
        return zzbffVar;
    }

    public static com.google.android.libraries.places.internal.zzaua zze() {
        return zzg;
    }
}
