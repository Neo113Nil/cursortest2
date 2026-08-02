package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzamm extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzamm zzm;
    private static volatile com.google.android.libraries.places.internal.zzbff zzn;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private com.google.android.libraries.places.internal.zzbdy zzh = zzbD();
    private int zzi;
    private int zzj;
    private boolean zzk;
    private com.google.android.libraries.places.internal.zzapa zzl;

    static {
        com.google.android.libraries.places.internal.zzamm zzammVar = new com.google.android.libraries.places.internal.zzamm();
        zzm = zzammVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzamm.class, zzammVar);
    }

    private zzamm() {
    }

    public static com.google.android.libraries.places.internal.zzamd zza() {
        return (com.google.android.libraries.places.internal.zzamd) zzm.zzbv();
    }

    final /* synthetic */ void zzc(com.google.android.libraries.places.internal.zzaml zzamlVar) {
        this.zzf = zzamlVar.zza();
        this.zzb |= 2;
    }

    final /* synthetic */ void zzd(com.google.android.libraries.places.internal.zzamj zzamjVar) {
        this.zzg = zzamjVar.zza();
        this.zzb |= 4;
    }

    final /* synthetic */ void zze(java.lang.Iterable iterable) {
        com.google.android.libraries.places.internal.zzbdy zzbdyVar = this.zzh;
        if (!zzbdyVar.zza()) {
            this.zzh = com.google.android.libraries.places.internal.zzbdq.zzbE(zzbdyVar);
        }
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.zzh.zzh(((com.google.android.libraries.places.internal.zzamg) it.next()).zza());
        }
    }

    final /* synthetic */ void zzg(com.google.android.libraries.places.internal.zzapa zzapaVar) {
        this.zzl = zzapaVar;
        this.zzb |= 64;
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ࠬ\u0005᠌\u0003\u0006င\u0004\u0007ဇ\u0005\bဉ\u0006", new java.lang.Object[]{"zzb", "zze", com.google.android.libraries.places.internal.zzamh.zza, "zzf", com.google.android.libraries.places.internal.zzamk.zza, "zzg", com.google.android.libraries.places.internal.zzami.zza, "zzh", com.google.android.libraries.places.internal.zzamf.zza, "zzi", com.google.android.libraries.places.internal.zzame.zza, "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzamm();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzamd(bArr);
        }
        if (i2 == 5) {
            return zzm;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzn;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzamm.class) {
            zzbffVar = zzn;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzm);
                zzn = zzbffVar;
            }
        }
        return zzbffVar;
    }

    final /* synthetic */ void zzj(int i) {
        this.zzi = i - 1;
        this.zzb |= 8;
    }

    final /* synthetic */ void zzi(int i) {
        this.zze = i - 1;
        this.zzb |= 1;
    }

    final /* synthetic */ void zzf(int i) {
        this.zzb |= 16;
        this.zzj = i;
    }
}
