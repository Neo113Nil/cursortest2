package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzaqj extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzaqj zzn;
    private static volatile com.google.android.libraries.places.internal.zzbff zzo;
    private int zzb;
    private int zze;
    private com.google.android.libraries.places.internal.zzbea zzf = com.google.android.libraries.places.internal.zzbdq.zzbG();
    private com.google.android.libraries.places.internal.zzbea zzg = com.google.android.libraries.places.internal.zzbdq.zzbG();
    private com.google.android.libraries.places.internal.zzbea zzh = com.google.android.libraries.places.internal.zzbdq.zzbG();
    private com.google.android.libraries.places.internal.zzbea zzi = com.google.android.libraries.places.internal.zzbdq.zzbG();
    private int zzj;
    private com.google.android.libraries.places.internal.zzapp zzk;
    private com.google.android.libraries.places.internal.zzaqu zzl;
    private boolean zzm;

    static {
        com.google.android.libraries.places.internal.zzaqj zzaqjVar = new com.google.android.libraries.places.internal.zzaqj();
        zzn = zzaqjVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzaqj.class, zzaqjVar);
    }

    private zzaqj() {
    }

    public static com.google.android.libraries.places.internal.zzaqh zza() {
        return (com.google.android.libraries.places.internal.zzaqh) zzn.zzbv();
    }

    final /* synthetic */ void zzc(java.lang.Iterable iterable) {
        com.google.android.libraries.places.internal.zzbea zzbeaVar = this.zzf;
        if (!zzbeaVar.zza()) {
            this.zzf = com.google.android.libraries.places.internal.zzbdq.zzbH(zzbeaVar);
        }
        com.google.android.libraries.places.internal.zzbby.zzbo(iterable, this.zzf);
    }

    final /* synthetic */ void zzd(java.lang.Iterable iterable) {
        com.google.android.libraries.places.internal.zzbea zzbeaVar = this.zzg;
        if (!zzbeaVar.zza()) {
            this.zzg = com.google.android.libraries.places.internal.zzbdq.zzbH(zzbeaVar);
        }
        com.google.android.libraries.places.internal.zzbby.zzbo(iterable, this.zzg);
    }

    final /* synthetic */ void zze(java.lang.Iterable iterable) {
        com.google.android.libraries.places.internal.zzbea zzbeaVar = this.zzh;
        if (!zzbeaVar.zza()) {
            this.zzh = com.google.android.libraries.places.internal.zzbdq.zzbH(zzbeaVar);
        }
        com.google.android.libraries.places.internal.zzbby.zzbo(iterable, this.zzh);
    }

    final /* synthetic */ void zzf(java.lang.Iterable iterable) {
        com.google.android.libraries.places.internal.zzbea zzbeaVar = this.zzi;
        if (!zzbeaVar.zza()) {
            this.zzi = com.google.android.libraries.places.internal.zzbdq.zzbH(zzbeaVar);
        }
        com.google.android.libraries.places.internal.zzbby.zzbo(iterable, this.zzi);
    }

    final /* synthetic */ void zzh(com.google.android.libraries.places.internal.zzapp zzappVar) {
        this.zzk = zzappVar;
        this.zzb |= 4;
    }

    final /* synthetic */ void zzi(com.google.android.libraries.places.internal.zzaqu zzaquVar) {
        this.zzl = zzaquVar;
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
            return zzbA(zzn, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0004\u0000\u0001᠌\u0000\u0002\u001a\u0003\u001a\u0004\u001a\u0005\u001a\u0006င\u0001\u0007ဉ\u0002\bဉ\u0003\tဇ\u0004", new java.lang.Object[]{"zzb", "zze", com.google.android.libraries.places.internal.zzaqi.zza, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzaqj();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzaqh(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzaqj.class) {
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

    final /* synthetic */ void zzj(boolean z) {
        this.zzb |= 16;
        this.zzm = z;
    }

    final /* synthetic */ void zzg(int i) {
        this.zzb |= 2;
        this.zzj = i;
    }
}
