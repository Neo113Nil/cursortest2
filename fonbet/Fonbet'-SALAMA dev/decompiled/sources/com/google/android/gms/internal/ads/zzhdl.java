package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzhdl extends zzgxg implements zzgys {
    private static final zzhdl zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private boolean zzj;
    private double zzk;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzu;
    private String zzd = "";
    private String zze = "";
    private int zzf = 4;
    private zzgxs zzg = zzgxg.zzbK();
    private String zzh = "";
    private String zzi = "";
    private zzgxs zzl = zzgxg.zzbK();

    static {
        zzhdl zzhdlVar = new zzhdl();
        zza = zzhdlVar;
        zzgxg.zzbZ(zzhdl.class, zzhdlVar);
    }

    private zzhdl() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zzc", "zzd", "zzf", zzhdk.zza, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zzhdj.class, "zze", "zzm", zzhdh.zza, "zzn", "zzo", "zzp", "zzu"});
        }
        if (ordinal == 3) {
            return new zzhdl();
        }
        zzhdm zzhdmVar = null;
        if (ordinal == 4) {
            return new zzhdg(zzhdmVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzhdl.class) {
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
