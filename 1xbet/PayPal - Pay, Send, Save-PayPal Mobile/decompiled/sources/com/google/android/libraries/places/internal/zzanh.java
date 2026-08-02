package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzanh extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzanh zzn;
    private static volatile com.google.android.libraries.places.internal.zzbff zzo;
    private int zzb;
    private int zze;
    private int zzf;
    private com.google.android.libraries.places.internal.zzbdy zzg = zzbD();
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private int zzk;
    private int zzl;
    private com.google.android.libraries.places.internal.zzapa zzm;

    static {
        com.google.android.libraries.places.internal.zzanh zzanhVar = new com.google.android.libraries.places.internal.zzanh();
        zzn = zzanhVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzanh.class, zzanhVar);
    }

    private zzanh() {
    }

    public static com.google.android.libraries.places.internal.zzamx zza() {
        return (com.google.android.libraries.places.internal.zzamx) zzn.zzbv();
    }

    final /* synthetic */ void zzc(com.google.android.libraries.places.internal.zzane zzaneVar) {
        this.zzf = zzaneVar.zza();
        this.zzb |= 2;
    }

    final /* synthetic */ void zzd(java.lang.Iterable iterable) {
        com.google.android.libraries.places.internal.zzbdy zzbdyVar = this.zzg;
        if (!zzbdyVar.zza()) {
            this.zzg = com.google.android.libraries.places.internal.zzbdq.zzbE(zzbdyVar);
        }
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.zzg.zzh(((com.google.android.libraries.places.internal.zzanb) it.next()).zza());
        }
    }

    final /* synthetic */ void zze(com.google.android.libraries.places.internal.zzang zzangVar) {
        this.zzh = zzangVar.zza();
        this.zzb |= 4;
    }

    final /* synthetic */ void zzh(com.google.android.libraries.places.internal.zzamz zzamzVar) {
        this.zzk = zzamzVar.zza();
        this.zzb |= 32;
    }

    final /* synthetic */ void zzi(com.google.android.libraries.places.internal.zzanj zzanjVar) {
        this.zzl = zzanjVar.zza();
        this.zzb |= 64;
    }

    final /* synthetic */ void zzj(com.google.android.libraries.places.internal.zzapa zzapaVar) {
        this.zzm = zzapaVar;
        this.zzb |= 128;
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzn, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ࠬ\u0004᠌\u0002\u0005ဇ\u0003\u0006ဇ\u0004\u0007᠌\u0005\b᠌\u0006\tဉ\u0007", new java.lang.Object[]{"zzb", "zze", com.google.android.libraries.places.internal.zzanc.zza, "zzf", com.google.android.libraries.places.internal.zzand.zza, "zzg", com.google.android.libraries.places.internal.zzana.zza, "zzh", com.google.android.libraries.places.internal.zzanf.zza, "zzi", "zzj", "zzk", com.google.android.libraries.places.internal.zzamy.zza, "zzl", com.google.android.libraries.places.internal.zzani.zza, "zzm"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzanh();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzamx(bArr);
        }
        if (i2 == 5) {
            return zzn;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzo;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzanh.class) {
            zzbffVar = zzo;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzn);
                zzo = zzbffVar;
            }
        }
        return zzbffVar;
    }

    final /* synthetic */ void zzl(int i) {
        this.zze = i - 1;
        this.zzb |= 1;
    }

    final /* synthetic */ void zzg(boolean z) {
        this.zzb |= 16;
        this.zzj = z;
    }

    final /* synthetic */ void zzf(boolean z) {
        this.zzb |= 8;
        this.zzi = z;
    }
}
