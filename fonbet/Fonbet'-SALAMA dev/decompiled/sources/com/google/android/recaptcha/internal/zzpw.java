package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzpw extends zzks implements zzly {
    private static final zzpw zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private zzqa zzj;
    private zzpu zzk;
    private zzpy zzl;
    private zzpm zzm;

    static {
        zzpw zzpwVar = new zzpw();
        zzb = zzpwVar;
        zzks.zzF(zzpw.class, zzpwVar);
    }

    private zzpw() {
    }

    public static /* synthetic */ void zzL(zzpw zzpwVar, String str) {
        str.getClass();
        zzpwVar.zzd |= 1;
        zzpwVar.zze = str;
    }

    public static /* synthetic */ void zzM(zzpw zzpwVar, zzqa zzqaVar) {
        zzqaVar.getClass();
        zzpwVar.zzj = zzqaVar;
        zzpwVar.zzd |= 32;
    }

    public static /* synthetic */ void zzN(zzpw zzpwVar, zzpu zzpuVar) {
        zzpuVar.getClass();
        zzpwVar.zzk = zzpuVar;
        zzpwVar.zzd |= 64;
    }

    public static /* synthetic */ void zzO(zzpw zzpwVar, zzpy zzpyVar) {
        zzpyVar.getClass();
        zzpwVar.zzl = zzpyVar;
        zzpwVar.zzd |= 128;
    }

    public static zzpv zzf() {
        return (zzpv) zzb.zzp();
    }

    public static zzpw zzi(byte[] bArr) {
        return (zzpw) zzks.zzv(zzb, bArr);
    }

    @Deprecated
    public final String zzJ() {
        return this.zzf;
    }

    @Deprecated
    public final String zzK() {
        return this.zzg;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzks.zzC(zzb, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i8 == 3) {
            return new zzpw();
        }
        zzpk zzpkVar = null;
        if (i8 == 4) {
            return new zzpv(zzpkVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    @Deprecated
    public final String zzj() {
        return this.zzh;
    }

    public final String zzk() {
        return this.zze;
    }
}
