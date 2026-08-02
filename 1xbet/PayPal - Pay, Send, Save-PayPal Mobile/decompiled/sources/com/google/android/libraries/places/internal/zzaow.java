package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzaow extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzaow zzi;
    private static volatile com.google.android.libraries.places.internal.zzbff zzj;
    private int zzb;
    private com.google.android.libraries.places.internal.zzamo zze;
    private int zzf;
    private int zzg;
    private com.google.android.libraries.places.internal.zzapp zzh;

    static {
        com.google.android.libraries.places.internal.zzaow zzaowVar = new com.google.android.libraries.places.internal.zzaow();
        zzi = zzaowVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzaow.class, zzaowVar);
    }

    private zzaow() {
    }

    public static com.google.android.libraries.places.internal.zzaou zza() {
        return (com.google.android.libraries.places.internal.zzaou) zzi.zzbv();
    }

    final /* synthetic */ void zzd(com.google.android.libraries.places.internal.zzapp zzappVar) {
        this.zzh = zzappVar;
        this.zzb |= 8;
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003င\u0002\u0004ဉ\u0003", new java.lang.Object[]{"zzb", "zze", "zzf", com.google.android.libraries.places.internal.zzaov.zza, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzaow();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzaou(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzaow.class) {
            zzbffVar = zzj;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzi);
                zzj = zzbffVar;
            }
        }
        return zzbffVar;
    }

    final /* synthetic */ void zzf(int i) {
        this.zzf = i - 1;
        this.zzb |= 2;
    }

    final /* synthetic */ void zzc(int i) {
        this.zzb |= 4;
        this.zzg = i;
    }
}
