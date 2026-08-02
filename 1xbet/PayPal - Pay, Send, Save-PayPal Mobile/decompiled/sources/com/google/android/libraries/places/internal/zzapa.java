package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzapa extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzapa zzj;
    private static volatile com.google.android.libraries.places.internal.zzbff zzk;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    private zzapa() {
    }

    public static com.google.android.libraries.places.internal.zzaoz zzg() {
        return (com.google.android.libraries.places.internal.zzaoz) zzj.zzbv();
    }

    final /* synthetic */ void zzl(boolean z) {
        this.zzb |= 16;
        this.zzi = z;
    }

    final /* synthetic */ void zzk(boolean z) {
        this.zzb |= 8;
        this.zzh = z;
    }

    final /* synthetic */ void zzj(boolean z) {
        this.zzb |= 4;
        this.zzg = z;
    }

    final /* synthetic */ void zzi(boolean z) {
        this.zzb |= 2;
        this.zzf = z;
    }

    final /* synthetic */ void zzh(boolean z) {
        this.zzb |= 1;
        this.zze = z;
    }

    public final boolean zzf() {
        return this.zzi;
    }

    public final boolean zze() {
        return this.zzh;
    }

    public final boolean zzd() {
        return this.zzg;
    }

    public final boolean zzc() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzapa();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzaoz(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzapa.class) {
            zzbffVar = zzk;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzj);
                zzk = zzbffVar;
            }
        }
        return zzbffVar;
    }

    public final boolean zza() {
        return this.zze;
    }

    static {
        com.google.android.libraries.places.internal.zzapa zzapaVar = new com.google.android.libraries.places.internal.zzapa();
        zzj = zzapaVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzapa.class, zzapaVar);
    }
}
