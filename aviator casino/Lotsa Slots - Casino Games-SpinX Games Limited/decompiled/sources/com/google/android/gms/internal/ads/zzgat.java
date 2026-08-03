package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgat extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzgat zzn;
    private static volatile com.google.android.gms.internal.ads.zzifx zzo;
    private int zza;
    private long zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private java.lang.String zzb = "";
    private com.google.android.gms.internal.ads.zziep zzk = zzbE();
    private com.google.android.gms.internal.ads.zziep zzl = zzbE();
    private com.google.android.gms.internal.ads.zziep zzm = zzbE();

    static {
        com.google.android.gms.internal.ads.zzgat zzgatVar = new com.google.android.gms.internal.ads.zzgat();
        zzn = zzgatVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzgat.class, zzgatVar);
    }

    private zzgat() {
    }

    public static com.google.android.gms.internal.ads.zzgat zzp() {
        return zzn;
    }

    final /* synthetic */ void zzA(long j) {
        com.google.android.gms.internal.ads.zziep zziepVar = this.zzl;
        if (!zziepVar.zza()) {
            this.zzl = com.google.android.gms.internal.ads.zziee.zzbF(zziepVar);
        }
        this.zzl.zzd(j);
    }

    final /* synthetic */ void zzB(long j) {
        com.google.android.gms.internal.ads.zziep zziepVar = this.zzm;
        if (!zziepVar.zza()) {
            this.zzm = com.google.android.gms.internal.ads.zziee.zzbF(zziepVar);
        }
        this.zzm.zzd(j);
    }

    final /* synthetic */ void zzC() {
        this.zzm = zzbE();
    }

    public final java.lang.String zza() {
        return this.zzb;
    }

    public final long zzb() {
        return this.zzc;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final boolean zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzn, "\u0004\f\u0000\u0001\u0001\f\f\u0000\u0003\u0000\u0001Ȉ\u0002ဂ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဂ\u0004\u0007\u0002\bဂ\u0005\tဂ\u0006\n%\u000b%\f%", new java.lang.Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzgat();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzgas(bArr);
        }
        if (ordinal == 5) {
            return zzn;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzo;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzgat.class) {
                zzifxVar = zzo;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzn);
                    zzo = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }

    public final boolean zze() {
        return this.zzf;
    }

    public final long zzg() {
        return this.zzg;
    }

    public final long zzh() {
        return this.zzh;
    }

    public final long zzi() {
        return this.zzi;
    }

    public final boolean zzj() {
        return (this.zza & 64) != 0;
    }

    public final java.util.List zzk() {
        return this.zzk;
    }

    public final int zzl() {
        return this.zzk.size();
    }

    public final int zzm() {
        return this.zzl.size();
    }

    public final java.util.List zzn() {
        return this.zzm;
    }

    public final int zzo() {
        return this.zzm.size();
    }

    final /* synthetic */ void zzq(java.lang.String str) {
        str.getClass();
        this.zzb = str;
    }

    final /* synthetic */ void zzr(long j) {
        this.zza |= 1;
        this.zzc = j;
    }

    final /* synthetic */ void zzs(int i) {
        this.zza |= 2;
        this.zzd = i;
    }

    final /* synthetic */ void zzt(boolean z) {
        this.zza |= 4;
        this.zze = true;
    }

    final /* synthetic */ void zzu(boolean z) {
        this.zza |= 8;
        this.zzf = true;
    }

    final /* synthetic */ void zzv(long j) {
        this.zza |= 16;
        this.zzg = j;
    }

    final /* synthetic */ void zzw(long j) {
        this.zzh = j;
    }

    final /* synthetic */ void zzx(long j) {
        this.zza |= 32;
        this.zzi = j;
    }

    final /* synthetic */ void zzy(long j) {
        this.zza |= 64;
        this.zzj = j;
    }

    final /* synthetic */ void zzz(long j) {
        com.google.android.gms.internal.ads.zziep zziepVar = this.zzk;
        if (!zziepVar.zza()) {
            this.zzk = com.google.android.gms.internal.ads.zziee.zzbF(zziepVar);
        }
        this.zzk.zzd(j);
    }
}
