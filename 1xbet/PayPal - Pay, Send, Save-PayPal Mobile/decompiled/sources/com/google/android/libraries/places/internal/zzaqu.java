package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzaqu extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzaqu zzh;
    private static volatile com.google.android.libraries.places.internal.zzbff zzi;
    private int zzb;
    private int zze;
    private com.google.android.libraries.places.internal.zzaqs zzf;
    private int zzg;

    static {
        com.google.android.libraries.places.internal.zzaqu zzaquVar = new com.google.android.libraries.places.internal.zzaqu();
        zzh = zzaquVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzaqu.class, zzaquVar);
    }

    private zzaqu() {
    }

    public static com.google.android.libraries.places.internal.zzaqt zza() {
        return (com.google.android.libraries.places.internal.zzaqt) zzh.zzbv();
    }

    final /* synthetic */ void zzc(com.google.android.libraries.places.internal.zzaqs zzaqsVar) {
        this.zzf = zzaqsVar;
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
            return zzbA(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003᠌\u0002", new java.lang.Object[]{"zzb", "zze", com.google.android.libraries.places.internal.zzarl.zza, "zzf", "zzg", com.google.android.libraries.places.internal.zzaqv.zza});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzaqu();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzaqt(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzaqu.class) {
            zzbffVar = zzi;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzh);
                zzi = zzbffVar;
            }
        }
        return zzbffVar;
    }

    final /* synthetic */ void zzf(int i) {
        this.zzg = i - 1;
        this.zzb |= 4;
    }

    final /* synthetic */ void zze(int i) {
        this.zze = i - 1;
        this.zzb |= 1;
    }
}
