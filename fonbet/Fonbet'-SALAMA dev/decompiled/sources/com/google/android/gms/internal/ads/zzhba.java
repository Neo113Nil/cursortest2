package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzhba extends zzgxg implements zzgys {
    private static final zzhba zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private int zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private boolean zzv;
    private long zzw;
    private boolean zzy;
    private String zzf = "";
    private zzgxs zzg = zzgxg.zzbK();
    private String zzl = "";
    private zzgxs zzu = zzgxg.zzbK();
    private zzgxo zzx = zzgxg.zzbG();
    private zzgxo zzz = zzgxg.zzbG();

    static {
        zzhba zzhbaVar = new zzhba();
        zza = zzhbaVar;
        zzgxg.zzbZ(zzhba.class, zzhbaVar);
    }

    private zzhba() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005᠌\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000bင\t\fင\n\rဇ\u000b\u000e\u001b\u000fဇ\f\u0010ဂ\r\u0011ࠬ\u0012ဇ\u000e\u0013ࠬ", new Object[]{"zzc", "zzd", zzhaz.zza, "zze", "zzf", "zzg", "zzh", zzhax.zza, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", zzhaw.class, "zzv", "zzw", "zzx", zzhan.zza(), "zzy", "zzz", zzhay.zza});
        }
        if (ordinal == 3) {
            return new zzhba();
        }
        zzhdm zzhdmVar = null;
        if (ordinal == 4) {
            return new zzhat(zzhdmVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzhba.class) {
                try {
                    zzgyzVar = zzb;
                    if (zzgyzVar == null) {
                        zzgyzVar = new zzgxb(zza);
                        zzb = zzgyzVar;
                    }
                } finally {
                }
            }
        }
        return zzgyzVar;
    }
}
