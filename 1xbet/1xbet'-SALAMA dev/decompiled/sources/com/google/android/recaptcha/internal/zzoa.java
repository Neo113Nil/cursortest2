package com.google.android.recaptcha.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class zzoa extends zzks implements zzly {
    private static final zzoa zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private zzkx zzj = zzks.zzw();

    static {
        zzoa zzoaVar = new zzoa();
        zzb = zzoaVar;
        zzks.zzF(zzoa.class, zzoaVar);
    }

    private zzoa() {
    }

    public static /* synthetic */ void zzJ(zzoa zzoaVar, Iterable iterable) {
        zzkx zzkxVar = zzoaVar.zzj;
        if (!zzkxVar.zzc()) {
            zzoaVar.zzj = zzks.zzx(zzkxVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzoaVar.zzj.zzh(((zznz) it.next()).zza());
        }
    }

    public static /* synthetic */ void zzK(zzoa zzoaVar, String str) {
        str.getClass();
        zzoaVar.zze = str;
    }

    public static /* synthetic */ void zzM(zzoa zzoaVar, String str) {
        str.getClass();
        zzoaVar.zzg = str;
    }

    public static zzny zzf() {
        return (zzny) zzb.zzp();
    }

    public static /* synthetic */ void zzj(zzoa zzoaVar, String str) {
        str.getClass();
        zzoaVar.zzh = str;
    }

    public static /* synthetic */ void zzk(zzoa zzoaVar, String str) {
        str.getClass();
        zzoaVar.zzi = str;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzks.zzC(zzb, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007,", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i8 == 3) {
            return new zzoa();
        }
        zznx zznxVar = null;
        if (i8 == 4) {
            return new zzny(zznxVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
