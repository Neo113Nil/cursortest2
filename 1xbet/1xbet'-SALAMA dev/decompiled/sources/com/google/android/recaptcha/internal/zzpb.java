package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
public final class zzpb extends zzks implements zzly {
    private static final zzpb zzb;
    private int zzd;
    private zzog zzf;
    private zzoa zzg;
    private zzoj zzh;
    private String zze = "";
    private String zzi = "";
    private String zzj = "";

    static {
        zzpb zzpbVar = new zzpb();
        zzb = zzpbVar;
        zzks.zzF(zzpb.class, zzpbVar);
    }

    private zzpb() {
    }

    public static /* synthetic */ void zzJ(zzpb zzpbVar, zzoa zzoaVar) {
        zzoaVar.getClass();
        zzpbVar.zzg = zzoaVar;
        zzpbVar.zzd |= 2;
    }

    public static zzpa zzf() {
        return (zzpa) zzb.zzp();
    }

    public static /* synthetic */ void zzi(zzpb zzpbVar, String str) {
        str.getClass();
        zzpbVar.zze = str;
    }

    public static /* synthetic */ void zzj(zzpb zzpbVar, String str) {
        str.getClass();
        zzpbVar.zzi = str;
    }

    public static /* synthetic */ void zzk(zzpb zzpbVar, String str) {
        str.getClass();
        zzpbVar.zzj = str;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzks.zzC(zzb, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005Ȉ\u0006Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i8 == 3) {
            return new zzpb();
        }
        zzoz zzozVar = null;
        if (i8 == 4) {
            return new zzpa(zzozVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
