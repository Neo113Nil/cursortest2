package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzbbu extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzbbu zzx;
    private static volatile com.google.android.libraries.places.internal.zzbff zzy;
    private int zzb;
    private int zzh;
    private boolean zzj;
    private double zzk;
    private int zzl;
    private int zzm;
    private boolean zzp;
    private com.google.android.libraries.places.internal.zzbbp zzq;
    private com.google.android.libraries.places.internal.zzbbr zzr;
    private com.google.android.libraries.places.internal.zzbbn zzs;
    private com.google.android.libraries.places.internal.zzbay zzt;
    private com.google.android.libraries.places.internal.zzbbt zzu;
    private boolean zzv;
    private boolean zzw;
    private java.lang.String zze = "";
    private java.lang.String zzf = "";
    private java.lang.String zzg = "";
    private java.lang.String zzi = "";
    private java.lang.String zzn = "";
    private com.google.android.libraries.places.internal.zzbdy zzo = zzbD();

    static {
        com.google.android.libraries.places.internal.zzbbu zzbbuVar = new com.google.android.libraries.places.internal.zzbbu();
        zzx = zzbbuVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzbbu.class, zzbbuVar);
    }

    private zzbbu() {
    }

    public static com.google.android.libraries.places.internal.zzbbl zza() {
        return (com.google.android.libraries.places.internal.zzbbl) zzx.zzbv();
    }

    final /* synthetic */ void zzd(java.lang.String str) {
        this.zze = str;
    }

    final /* synthetic */ void zze(java.lang.String str) {
        this.zzf = str;
    }

    final /* synthetic */ void zzl(java.lang.Iterable iterable) {
        com.google.android.libraries.places.internal.zzbdy zzbdyVar = this.zzo;
        if (!zzbdyVar.zza()) {
            this.zzo = com.google.android.libraries.places.internal.zzbdq.zzbE(zzbdyVar);
        }
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.zzo.zzh(((com.google.android.libraries.places.internal.zzbao) it.next()).zza());
        }
    }

    final /* synthetic */ void zzn(com.google.android.libraries.places.internal.zzbbp zzbbpVar) {
        this.zzq = zzbbpVar;
        this.zzb |= 1;
    }

    final /* synthetic */ void zzo(com.google.android.libraries.places.internal.zzbbr zzbbrVar) {
        this.zzr = zzbbrVar;
        this.zzb |= 2;
    }

    final /* synthetic */ void zzp(com.google.android.libraries.places.internal.zzbbn zzbbnVar) {
        this.zzs = zzbbnVar;
        this.zzb |= 4;
    }

    final /* synthetic */ void zzq(com.google.android.libraries.places.internal.zzbay zzbayVar) {
        this.zzt = zzbayVar;
        this.zzb |= 8;
    }

    final /* synthetic */ void zzr(com.google.android.libraries.places.internal.zzbbt zzbbtVar) {
        this.zzu = zzbbtVar;
        this.zzb |= 16;
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzx, "\u0000\u0013\u0000\u0001\u0001\u0015\u0013\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0006Ȉ\u0007\u0007\t\u0000\n\u0004\u000b,\f\u0007\rဉ\u0000\u000eဉ\u0001\u000fဉ\u0002\u0010ဉ\u0003\u0011ဉ\u0004\u0012\u0004\u0013Ȉ\u0014\u0007\u0015\u0007", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzm", "zzn", "zzv", "zzw"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzbbu();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzbbl(bArr);
        }
        if (i2 == 5) {
            return zzx;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzy;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzbbu.class) {
            zzbffVar = zzy;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzx);
                zzy = zzbffVar;
            }
        }
        return zzbffVar;
    }

    final /* synthetic */ void zzu(int i) {
        this.zzh = i - 2;
    }

    final /* synthetic */ void zzs(boolean z) {
        this.zzv = true;
    }

    final /* synthetic */ void zzm(boolean z) {
        this.zzp = z;
    }

    final /* synthetic */ void zzk(java.lang.String str) {
        this.zzn = str;
    }

    final /* synthetic */ void zzj(int i) {
        this.zzl = i;
    }

    final /* synthetic */ void zzi(double d) {
        this.zzk = d;
    }

    final /* synthetic */ void zzh(boolean z) {
        this.zzj = z;
    }

    final /* synthetic */ void zzg(java.lang.String str) {
        this.zzi = str;
    }

    final /* synthetic */ void zzf(java.lang.String str) {
        this.zzg = str;
    }

    public static com.google.android.libraries.places.internal.zzbbu zzc() {
        return zzx;
    }
}
