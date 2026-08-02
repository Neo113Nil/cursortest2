package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzarh extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzarh zzk;
    private static volatile com.google.android.libraries.places.internal.zzbff zzl;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private java.lang.String zzh = "";
    private boolean zzi;
    private int zzj;

    static {
        com.google.android.libraries.places.internal.zzarh zzarhVar = new com.google.android.libraries.places.internal.zzarh();
        zzk = zzarhVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzarh.class, zzarhVar);
    }

    private zzarh() {
    }

    public static com.google.android.libraries.places.internal.zzarg zza() {
        return (com.google.android.libraries.places.internal.zzarg) zzk.zzbv();
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006င\u0005", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzarh();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzarg(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzarh.class) {
            zzbffVar = zzl;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzk);
                zzl = zzbffVar;
            }
        }
        return zzbffVar;
    }

    final /* synthetic */ void zzg(int i) {
        this.zzb |= 32;
        this.zzj = i;
    }

    final /* synthetic */ void zzf(boolean z) {
        this.zzb |= 16;
        this.zzi = z;
    }

    final /* synthetic */ void zze(int i) {
        this.zzb |= 4;
        this.zzg = i;
    }

    final /* synthetic */ void zzd(int i) {
        this.zzb |= 2;
        this.zzf = i;
    }

    final /* synthetic */ void zzc(int i) {
        this.zzb |= 1;
        this.zze = i;
    }
}
