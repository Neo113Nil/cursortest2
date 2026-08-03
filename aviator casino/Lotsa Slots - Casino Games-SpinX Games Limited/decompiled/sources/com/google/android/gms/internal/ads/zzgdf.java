package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgdf extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzgdf zzD;
    private static volatile com.google.android.gms.internal.ads.zzifx zzE;
    private boolean zzC;
    private int zza;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private int zzh;
    private com.google.android.gms.internal.ads.zzgdx zzj;
    private boolean zzk;
    private com.google.android.gms.internal.ads.zzgdz zzn;
    private int zzc = 1;
    private boolean zzd = true;
    private java.lang.String zzg = "unknown_host";
    private boolean zzi = true;
    private long zzl = 100;
    private long zzm = 2000;
    private long zzo = 10;
    private long zzp = 100;
    private long zzu = 20000;
    private java.lang.String zzv = "";
    private java.lang.String zzw = "";
    private long zzx = 500;
    private long zzy = 3000;
    private boolean zzz = true;
    private boolean zzA = true;
    private boolean zzB = true;

    static {
        com.google.android.gms.internal.ads.zzgdf zzgdfVar = new com.google.android.gms.internal.ads.zzgdf();
        zzD = zzgdfVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzgdf.class, zzgdfVar);
    }

    private zzgdf() {
    }

    public static com.google.android.gms.internal.ads.zzgdd zzw() {
        return (com.google.android.gms.internal.ads.zzgdd) zzD.zzbn();
    }

    final /* synthetic */ void zzA(long j) {
        this.zza |= 1024;
        this.zzl = j;
    }

    final /* synthetic */ void zzB(long j) {
        this.zza |= 2048;
        this.zzm = j;
    }

    final /* synthetic */ void zzC(com.google.android.gms.internal.ads.zzgdz zzgdzVar) {
        zzgdzVar.getClass();
        this.zzn = zzgdzVar;
        this.zza |= 4096;
    }

    final /* synthetic */ void zzD(long j) {
        this.zza |= 524288;
        this.zzy = j;
    }

    final /* synthetic */ void zzE(boolean z) {
        this.zza |= 1048576;
        this.zzz = z;
    }

    public final int zzG() {
        int zza = com.google.android.gms.internal.ads.zzgdh.zza(this.zzb);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzH() {
        int zza = com.google.android.gms.internal.ads.zzgdh.zza(this.zzc);
        if (zza == 0) {
            return 2;
        }
        return zza;
    }

    public final int zzI() {
        int i = this.zzh;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    final /* synthetic */ void zzJ(int i) {
        this.zzb = i - 1;
        this.zza |= 1;
    }

    final /* synthetic */ void zzK(int i) {
        this.zzh = com.google.android.gms.internal.ads.zzgde.zza(3);
        this.zza |= 64;
    }

    public final boolean zza() {
        return this.zzd;
    }

    public final boolean zzb() {
        return this.zze;
    }

    public final boolean zzc() {
        return this.zzf;
    }

    public final java.lang.String zzd() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            com.google.android.gms.internal.ads.zziek zziekVar = com.google.android.gms.internal.ads.zzgdg.zza;
            return zzbv(zzD, "\u0004\u0018\u0000\u0001\u0001\u0019\u0018\u0000\u0000\u0000\u0001᠌\u0000\u0003ဈ\u0005\u0004ဇ\u0007\u0005ဉ\b\u0006ဇ\t\u0007ဂ\u000b\bဉ\f\tဇ\u0002\nဂ\r\u000bဂ\u000e\fဂ\u000f\rဈ\u0010\u000eဈ\u0011\u000fဂ\u0012\u0010ဂ\u0013\u0011ဇ\u0014\u0012ဂ\n\u0013ဇ\u0015\u0014ဇ\u0016\u0015ဇ\u0017\u0016᠌\u0001\u0017ဇ\u0003\u0018ဇ\u0004\u0019ဌ\u0006", new java.lang.Object[]{"zza", "zzb", zziekVar, "zzg", "zzi", "zzj", "zzk", "zzm", "zzn", "zzd", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzl", "zzA", "zzB", "zzC", "zzc", zziekVar, "zze", "zzf", "zzh"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzgdf();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzgdd(bArr);
        }
        if (ordinal == 5) {
            return zzD;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzE;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzgdf.class) {
                zzifxVar = zzE;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzD);
                    zzE = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }

    public final boolean zze() {
        return this.zzi;
    }

    public final com.google.android.gms.internal.ads.zzgdx zzg() {
        com.google.android.gms.internal.ads.zzgdx zzgdxVar = this.zzj;
        return zzgdxVar == null ? com.google.android.gms.internal.ads.zzgdx.zzg() : zzgdxVar;
    }

    public final boolean zzh() {
        return this.zzk;
    }

    public final long zzi() {
        return this.zzl;
    }

    public final long zzj() {
        return this.zzm;
    }

    public final com.google.android.gms.internal.ads.zzgdz zzk() {
        com.google.android.gms.internal.ads.zzgdz zzgdzVar = this.zzn;
        return zzgdzVar == null ? com.google.android.gms.internal.ads.zzgdz.zzj() : zzgdzVar;
    }

    public final long zzl() {
        return this.zzo;
    }

    public final long zzm() {
        return this.zzp;
    }

    public final long zzn() {
        return this.zzu;
    }

    public final java.lang.String zzo() {
        return this.zzv;
    }

    public final java.lang.String zzp() {
        return this.zzw;
    }

    public final long zzq() {
        return this.zzx;
    }

    public final long zzr() {
        return this.zzy;
    }

    public final boolean zzs() {
        return this.zzz;
    }

    public final boolean zzt() {
        return this.zzA;
    }

    public final boolean zzu() {
        return this.zzB;
    }

    public final boolean zzv() {
        return this.zzC;
    }

    final /* synthetic */ void zzx(boolean z) {
        this.zza |= 4;
        this.zzd = z;
    }

    final /* synthetic */ void zzy(java.lang.String str) {
        str.getClass();
        this.zza |= 32;
        this.zzg = str;
    }

    final /* synthetic */ void zzz(com.google.android.gms.internal.ads.zzgdx zzgdxVar) {
        zzgdxVar.getClass();
        this.zzj = zzgdxVar;
        this.zza |= 256;
    }
}
