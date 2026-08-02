package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzayg extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzayg zzh;
    private static volatile com.google.android.libraries.places.internal.zzbff zzi;
    private java.lang.String zzb = "";
    private int zze;
    private int zzf;
    private boolean zzg;

    static {
        com.google.android.libraries.places.internal.zzayg zzaygVar = new com.google.android.libraries.places.internal.zzayg();
        zzh = zzaygVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzayg.class, zzaygVar);
    }

    private zzayg() {
    }

    public static com.google.android.libraries.places.internal.zzayf zza() {
        return (com.google.android.libraries.places.internal.zzayf) zzh.zzbv();
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzh, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u0007", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzayg();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzayf(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzayg.class) {
            zzbffVar = zzi;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzh);
                zzi = zzbffVar;
            }
        }
        return zzbffVar;
    }

    final /* synthetic */ void zzg(boolean z) {
        this.zzg = true;
    }

    final /* synthetic */ void zzf(int i) {
        this.zzf = i;
    }

    final /* synthetic */ void zze(int i) {
        this.zze = i;
    }

    final /* synthetic */ void zzd(java.lang.String str) {
        this.zzb = str;
    }

    public static com.google.android.libraries.places.internal.zzayg zzc() {
        return zzh;
    }
}
