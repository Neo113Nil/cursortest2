package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzgl extends com.google.android.gms.internal.measurement.zzme implements com.google.android.gms.internal.measurement.zznm {
    private static final com.google.android.gms.internal.measurement.zzgl zzu;
    private int zzb;
    private long zzd;
    private int zzf;
    private boolean zzk;
    private com.google.android.gms.internal.measurement.zzgf zzp;
    private com.google.android.gms.internal.measurement.zzgp zzq;
    private com.google.android.gms.internal.measurement.zzgv zzr;
    private com.google.android.gms.internal.measurement.zzgr zzs;
    private com.google.android.gms.internal.measurement.zzgn zzt;
    private java.lang.String zze = "";
    private com.google.android.gms.internal.measurement.zzmn zzg = zzcv();
    private com.google.android.gms.internal.measurement.zzmn zzh = zzcv();
    private com.google.android.gms.internal.measurement.zzmn zzi = zzcv();
    private java.lang.String zzj = "";
    private com.google.android.gms.internal.measurement.zzmn zzl = zzcv();
    private com.google.android.gms.internal.measurement.zzmn zzm = zzcv();
    private java.lang.String zzn = "";
    private java.lang.String zzo = "";

    static {
        com.google.android.gms.internal.measurement.zzgl zzglVar = new com.google.android.gms.internal.measurement.zzgl();
        zzu = zzglVar;
        com.google.android.gms.internal.measurement.zzme.zzcp(com.google.android.gms.internal.measurement.zzgl.class, zzglVar);
    }

    private zzgl() {
    }

    public static com.google.android.gms.internal.measurement.zzgk zzr() {
        return (com.google.android.gms.internal.measurement.zzgk) zzu.zzck();
    }

    public static com.google.android.gms.internal.measurement.zzgl zzs() {
        return zzu;
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final long zzb() {
        return this.zzd;
    }

    public final boolean zzc() {
        return (this.zzb & 2) != 0;
    }

    public final java.lang.String zzd() {
        return this.zze;
    }

    public final java.util.List zze() {
        return this.zzg;
    }

    public final int zzf() {
        return this.zzh.size();
    }

    public final com.google.android.gms.internal.measurement.zzgj zzg(int i) {
        return (com.google.android.gms.internal.measurement.zzgj) this.zzh.get(i);
    }

    public final java.util.List zzh() {
        return this.zzi;
    }

    public final java.util.List zzi() {
        return this.zzl;
    }

    public final int zzj() {
        return this.zzl.size();
    }

    public final java.util.List zzk() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzu, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new java.lang.Object[]{"zzb", "zzd", "zze", "zzf", "zzg", com.google.android.gms.internal.measurement.zzgt.class, "zzh", com.google.android.gms.internal.measurement.zzgj.class, "zzi", com.google.android.gms.internal.measurement.zzfd.class, "zzj", "zzk", "zzl", com.google.android.gms.internal.measurement.zzja.class, "zzm", com.google.android.gms.internal.measurement.zzgh.class, "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzgl();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzgk(bArr);
        }
        if (i2 == 5) {
            return zzu;
        }
        throw null;
    }

    public final java.lang.String zzm() {
        return this.zzn;
    }

    public final boolean zzn() {
        return (this.zzb & 128) != 0;
    }

    public final com.google.android.gms.internal.measurement.zzgf zzo() {
        com.google.android.gms.internal.measurement.zzgf zzgfVar = this.zzp;
        return zzgfVar == null ? com.google.android.gms.internal.measurement.zzgf.zzg() : zzgfVar;
    }

    public final boolean zzp() {
        return (this.zzb & 512) != 0;
    }

    public final com.google.android.gms.internal.measurement.zzgv zzq() {
        com.google.android.gms.internal.measurement.zzgv zzgvVar = this.zzr;
        return zzgvVar == null ? com.google.android.gms.internal.measurement.zzgv.zze() : zzgvVar;
    }

    final /* synthetic */ void zzt(int i, com.google.android.gms.internal.measurement.zzgj zzgjVar) {
        zzgjVar.getClass();
        com.google.android.gms.internal.measurement.zzmn zzmnVar = this.zzh;
        if (!zzmnVar.zza()) {
            this.zzh = com.google.android.gms.internal.measurement.zzme.zzcw(zzmnVar);
        }
        this.zzh.set(i, zzgjVar);
    }

    final /* synthetic */ void zzu() {
        this.zzi = zzcv();
    }

    final /* synthetic */ void zzv() {
        this.zzl = zzcv();
    }
}
