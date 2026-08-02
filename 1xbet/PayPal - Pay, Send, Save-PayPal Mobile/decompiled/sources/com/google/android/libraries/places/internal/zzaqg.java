package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzaqg extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzaqg zzs;
    private static volatile com.google.android.libraries.places.internal.zzbff zzt;
    private int zzb;
    private int zze;
    private boolean zzg;
    private double zzh;
    private int zzi;
    private boolean zzk;
    private com.google.android.libraries.places.internal.zzapp zzl;
    private com.google.android.libraries.places.internal.zzaqe zzm;
    private com.google.android.libraries.places.internal.zzaqu zzn;
    private boolean zzo;
    private boolean zzq;
    private boolean zzr;
    private java.lang.String zzf = "";
    private com.google.android.libraries.places.internal.zzbdy zzj = zzbD();
    private java.lang.String zzp = "";

    static {
        com.google.android.libraries.places.internal.zzaqg zzaqgVar = new com.google.android.libraries.places.internal.zzaqg();
        zzs = zzaqgVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzaqg.class, zzaqgVar);
    }

    private zzaqg() {
    }

    public static com.google.android.libraries.places.internal.zzaqc zza() {
        return (com.google.android.libraries.places.internal.zzaqc) zzs.zzbv();
    }

    final /* synthetic */ void zzg(java.lang.Iterable iterable) {
        com.google.android.libraries.places.internal.zzbdy zzbdyVar = this.zzj;
        if (!zzbdyVar.zza()) {
            this.zzj = com.google.android.libraries.places.internal.zzbdq.zzbE(zzbdyVar);
        }
        com.google.android.libraries.places.internal.zzbby.zzbo(iterable, this.zzj);
    }

    final /* synthetic */ void zzi(com.google.android.libraries.places.internal.zzapp zzappVar) {
        this.zzl = zzappVar;
        this.zzb |= 64;
    }

    final /* synthetic */ void zzj(com.google.android.libraries.places.internal.zzaqe zzaqeVar) {
        this.zzm = zzaqeVar;
        this.zzb |= 128;
    }

    final /* synthetic */ void zzk(com.google.android.libraries.places.internal.zzaqu zzaquVar) {
        this.zzn = zzaquVar;
        this.zzb |= 256;
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzs, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004က\u0003\u0005င\u0004\u0006'\u0007ဇ\u0005\bဉ\u0006\tဉ\u0007\nဉ\b\u000bဇ\t\fဈ\n\rဇ\u000b\u000eဇ\f", new java.lang.Object[]{"zzb", "zze", com.google.android.libraries.places.internal.zzaqf.zza, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzaqg();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzaqc(bArr);
        }
        if (i2 == 5) {
            return zzs;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzt;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzaqg.class) {
            zzbffVar = zzt;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzs);
                zzt = zzbffVar;
            }
        }
        return zzbffVar;
    }

    final /* synthetic */ void zzp(int i) {
        this.zze = i - 1;
        this.zzb |= 1;
    }

    final /* synthetic */ void zzn(boolean z) {
        this.zzb |= 4096;
        this.zzr = z;
    }

    final /* synthetic */ void zzm(boolean z) {
        this.zzb |= 2048;
        this.zzq = z;
    }

    final /* synthetic */ void zzl(boolean z) {
        this.zzb |= 512;
        this.zzo = z;
    }

    final /* synthetic */ void zzh(boolean z) {
        this.zzb |= 32;
        this.zzk = z;
    }

    final /* synthetic */ void zzf(int i) {
        this.zzb |= 16;
        this.zzi = i;
    }

    final /* synthetic */ void zze(double d) {
        this.zzb |= 8;
        this.zzh = d;
    }

    final /* synthetic */ void zzd(boolean z) {
        this.zzb |= 4;
        this.zzg = z;
    }

    final /* synthetic */ void zzc(java.lang.String str) {
        this.zzb |= 2;
        this.zzf = str;
    }
}
