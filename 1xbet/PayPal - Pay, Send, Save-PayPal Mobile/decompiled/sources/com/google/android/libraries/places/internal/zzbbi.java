package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzbbi extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzbbi zzt;
    private static volatile com.google.android.libraries.places.internal.zzbff zzu;
    private int zzb;
    private int zzk;
    private com.google.android.libraries.places.internal.zzbbh zzl;
    private int zzm;
    private com.google.android.libraries.places.internal.zzbay zzn;
    private boolean zzo;
    private double zzp;
    private boolean zzr;
    private boolean zzs;
    private java.lang.String zze = "";
    private java.lang.String zzf = "";
    private com.google.android.libraries.places.internal.zzbea zzg = com.google.android.libraries.places.internal.zzbdq.zzbG();
    private com.google.android.libraries.places.internal.zzbea zzh = com.google.android.libraries.places.internal.zzbdq.zzbG();
    private com.google.android.libraries.places.internal.zzbea zzi = com.google.android.libraries.places.internal.zzbdq.zzbG();
    private com.google.android.libraries.places.internal.zzbea zzj = com.google.android.libraries.places.internal.zzbdq.zzbG();
    private com.google.android.libraries.places.internal.zzbdy zzq = zzbD();

    static {
        com.google.android.libraries.places.internal.zzbbi zzbbiVar = new com.google.android.libraries.places.internal.zzbbi();
        zzt = zzbbiVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzbbi.class, zzbbiVar);
    }

    private zzbbi() {
    }

    public static com.google.android.libraries.places.internal.zzbbd zza() {
        return (com.google.android.libraries.places.internal.zzbbd) zzt.zzbv();
    }

    final /* synthetic */ void zzd(java.lang.String str) {
        this.zze = str;
    }

    final /* synthetic */ void zzf(java.lang.Iterable iterable) {
        com.google.android.libraries.places.internal.zzbea zzbeaVar = this.zzg;
        if (!zzbeaVar.zza()) {
            this.zzg = com.google.android.libraries.places.internal.zzbdq.zzbH(zzbeaVar);
        }
        com.google.android.libraries.places.internal.zzbby.zzbo(iterable, this.zzg);
    }

    final /* synthetic */ void zzg(java.lang.Iterable iterable) {
        com.google.android.libraries.places.internal.zzbea zzbeaVar = this.zzh;
        if (!zzbeaVar.zza()) {
            this.zzh = com.google.android.libraries.places.internal.zzbdq.zzbH(zzbeaVar);
        }
        com.google.android.libraries.places.internal.zzbby.zzbo(iterable, this.zzh);
    }

    final /* synthetic */ void zzh(java.lang.Iterable iterable) {
        com.google.android.libraries.places.internal.zzbea zzbeaVar = this.zzi;
        if (!zzbeaVar.zza()) {
            this.zzi = com.google.android.libraries.places.internal.zzbdq.zzbH(zzbeaVar);
        }
        com.google.android.libraries.places.internal.zzbby.zzbo(iterable, this.zzi);
    }

    final /* synthetic */ void zzi(java.lang.Iterable iterable) {
        com.google.android.libraries.places.internal.zzbea zzbeaVar = this.zzj;
        if (!zzbeaVar.zza()) {
            this.zzj = com.google.android.libraries.places.internal.zzbdq.zzbH(zzbeaVar);
        }
        com.google.android.libraries.places.internal.zzbby.zzbo(iterable, this.zzj);
    }

    final /* synthetic */ void zzk(com.google.android.libraries.places.internal.zzbbh zzbbhVar) {
        this.zzl = zzbbhVar;
        this.zzb |= 1;
    }

    final /* synthetic */ void zzl(com.google.android.libraries.places.internal.zzbay zzbayVar) {
        this.zzn = zzbayVar;
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
            return zzbA(zzt, "\u0000\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0005\u0000\u0001Ȉ\u0002Ȉ\u0003Ț\u0004Ț\u0005Ț\u0006Ț\u0007\u0004\bဉ\u0000\t\f\nဉ\u0001\u000b\u0007\f\u0000\r,\u000e\u0007\u000f\u0007", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzbbi();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzbbd(bArr);
        }
        if (i2 == 5) {
            return zzt;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzu;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzbbi.class) {
            zzbffVar = zzu;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzt);
                zzu = zzbffVar;
            }
        }
        return zzbffVar;
    }

    final /* synthetic */ void zzn(int i) {
        this.zzm = i - 2;
    }

    final /* synthetic */ void zzj(int i) {
        this.zzk = i;
    }

    final /* synthetic */ void zze(java.lang.String str) {
        this.zzf = str;
    }

    public static com.google.android.libraries.places.internal.zzbbi zzc() {
        return zzt;
    }
}
