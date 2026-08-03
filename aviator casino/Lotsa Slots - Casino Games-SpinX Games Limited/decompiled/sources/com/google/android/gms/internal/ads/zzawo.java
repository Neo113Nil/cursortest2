package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzawo extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzawo zzj;
    private static volatile com.google.android.gms.internal.ads.zzifx zzk;
    private int zza;
    private int zzb;
    private boolean zze;
    private com.google.android.gms.internal.ads.zzaxf zzg;
    private com.google.android.gms.internal.ads.zzaxl zzh;
    private boolean zzi;
    private boolean zzc = true;
    private java.lang.String zzd = "unknown_host";
    private boolean zzf = true;

    static {
        com.google.android.gms.internal.ads.zzawo zzawoVar = new com.google.android.gms.internal.ads.zzawo();
        zzj = zzawoVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzawo.class, zzawoVar);
    }

    private zzawo() {
    }

    public static com.google.android.gms.internal.ads.zzawn zze() {
        return (com.google.android.gms.internal.ads.zzawn) zzj.zzbn();
    }

    public final java.lang.String zza() {
        return this.zzd;
    }

    @java.lang.Deprecated
    public final boolean zzb() {
        return this.zze;
    }

    public final com.google.android.gms.internal.ads.zzaxf zzc() {
        com.google.android.gms.internal.ads.zzaxf zzaxfVar = this.zzg;
        return zzaxfVar == null ? com.google.android.gms.internal.ads.zzaxf.zzd() : zzaxfVar;
    }

    public final com.google.android.gms.internal.ads.zzaxl zzd() {
        com.google.android.gms.internal.ads.zzaxl zzaxlVar = this.zzh;
        return zzaxlVar == null ? com.google.android.gms.internal.ads.zzaxl.zza() : zzaxlVar;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzj, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဇ\u0007", new java.lang.Object[]{"zza", "zzb", com.google.android.gms.internal.ads.zzawr.zza, "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzawo();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzawn(bArr);
        }
        if (ordinal == 5) {
            return zzj;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzk;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzawo.class) {
                zzifxVar = zzk;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzj);
                    zzk = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }

    final /* synthetic */ void zzg(java.lang.String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    final /* synthetic */ void zzh(boolean z) {
        this.zza |= 8;
        this.zze = z;
    }
}
