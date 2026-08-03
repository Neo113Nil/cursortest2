package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzawq extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzawq zzu;
    private static volatile com.google.android.gms.internal.ads.zzifx zzv;
    private int zza;
    private long zzc;
    private int zzg;
    private long zzi;
    private long zzl;
    private long zzm;
    private int zzo;
    private int zzp;
    private com.google.android.gms.internal.ads.zzieq zzb = zzbM();
    private java.lang.String zzd = "";
    private java.lang.String zze = "";
    private java.lang.String zzf = "";
    private java.lang.String zzh = "";
    private java.lang.String zzj = "";
    private java.lang.String zzk = "";
    private com.google.android.gms.internal.ads.zziem zzn = zzbC();

    static {
        com.google.android.gms.internal.ads.zzawq zzawqVar = new com.google.android.gms.internal.ads.zzawq();
        zzu = zzawqVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzawq.class, zzawqVar);
    }

    private zzawq() {
    }

    public static com.google.android.gms.internal.ads.zzawp zza() {
        return (com.google.android.gms.internal.ads.zzawp) zzu.zzbn();
    }

    final /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzaxi zzaxiVar) {
        zzaxiVar.getClass();
        com.google.android.gms.internal.ads.zzieq zzieqVar = this.zzb;
        if (!zzieqVar.zza()) {
            this.zzb = com.google.android.gms.internal.ads.zziee.zzbN(zzieqVar);
        }
        this.zzb.add(zzaxiVar);
    }

    final /* synthetic */ void zzc() {
        this.zzb = zzbM();
    }

    final /* synthetic */ void zzd(long j) {
        this.zza |= 1;
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzu, "\u0004\u000f\u0000\u0001\bB\u000f\u0000\u0002\u0000\b\u001b\u0015ဂ\u0000\u0016ဈ\u0001\u0017ဈ\u0002\u0018ဈ\u0003\u0019᠌\u0004(ဈ\u0005)ဂ\u0006<ဈ\u0007=ဈ\b>ဂ\t?ဂ\n@'Aဌ\u000bBဌ\f", new java.lang.Object[]{"zza", "zzb", com.google.android.gms.internal.ads.zzaxi.class, "zzc", "zzd", "zze", "zzf", "zzg", com.google.android.gms.internal.ads.zzaxg.zza, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzawq();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzawp(bArr);
        }
        if (ordinal == 5) {
            return zzu;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzv;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzawq.class) {
                zzifxVar = zzv;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzu);
                    zzv = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }

    final /* synthetic */ void zze(java.lang.String str) {
        str.getClass();
        this.zza |= 2;
        this.zzd = str;
    }

    final /* synthetic */ void zzg(java.lang.String str) {
        str.getClass();
        this.zza |= 4;
        this.zze = str;
    }

    final /* synthetic */ void zzh(java.lang.String str) {
        str.getClass();
        this.zza |= 8;
        this.zzf = str;
    }

    final /* synthetic */ void zzi(java.lang.String str) {
        str.getClass();
        this.zza |= 32;
        this.zzh = str;
    }

    final /* synthetic */ void zzj(long j) {
        this.zza |= 64;
        this.zzi = j;
    }

    final /* synthetic */ void zzk(java.lang.String str) {
        str.getClass();
        this.zza |= 128;
        this.zzj = str;
    }

    final /* synthetic */ void zzl(java.lang.String str) {
        str.getClass();
        this.zza |= 256;
        this.zzk = str;
    }

    final /* synthetic */ void zzm(long j) {
        this.zza |= 512;
        this.zzl = j;
    }

    final /* synthetic */ void zzn(long j) {
        this.zza |= 1024;
        this.zzm = j;
    }

    final /* synthetic */ void zzo(java.lang.Iterable iterable) {
        com.google.android.gms.internal.ads.zziem zziemVar = this.zzn;
        if (!zziemVar.zza()) {
            this.zzn = com.google.android.gms.internal.ads.zziee.zzbD(zziemVar);
        }
        com.google.android.gms.internal.ads.zzicj.zzaW(iterable, this.zzn);
    }

    final /* synthetic */ void zzq(int i) {
        this.zzg = i - 1;
        this.zza |= 16;
    }

    final /* synthetic */ void zzr(int i) {
        this.zzo = com.google.android.gms.internal.ads.zzbdv.zza(i);
        this.zza |= 2048;
    }

    final /* synthetic */ void zzs(int i) {
        this.zzp = 1;
        this.zza |= 4096;
    }
}
