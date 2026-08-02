package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzrl extends zzks implements zzly {
    private static final zzrl zzb;
    private int zzd = 0;
    private Object zze;

    static {
        zzrl zzrlVar = new zzrl();
        zzb = zzrlVar;
        zzks.zzF(zzrl.class, zzrlVar);
    }

    private zzrl() {
    }

    public static /* synthetic */ void zzJ(zzrl zzrlVar, double d7) {
        zzrlVar.zzd = 10;
        zzrlVar.zze = Double.valueOf(d7);
    }

    public static /* synthetic */ void zzK(zzrl zzrlVar, String str) {
        str.getClass();
        zzrlVar.zzd = 11;
        zzrlVar.zze = str;
    }

    public static /* synthetic */ void zzL(zzrl zzrlVar, boolean z4) {
        zzrlVar.zzd = 1;
        zzrlVar.zze = Boolean.valueOf(z4);
    }

    public static /* synthetic */ void zzM(zzrl zzrlVar, zziv zzivVar) {
        zzrlVar.zzd = 2;
        zzrlVar.zze = zzivVar;
    }

    public static /* synthetic */ void zzN(zzrl zzrlVar, String str) {
        str.getClass();
        zzrlVar.zzd = 3;
        zzrlVar.zze = str;
    }

    public static /* synthetic */ void zzO(zzrl zzrlVar, int i7) {
        zzrlVar.zzd = 4;
        zzrlVar.zze = Integer.valueOf(i7);
    }

    public static zzrk zzf() {
        return (zzrk) zzb.zzp();
    }

    public static /* synthetic */ void zzi(zzrl zzrlVar, int i7) {
        zzrlVar.zzd = 5;
        zzrlVar.zze = Integer.valueOf(i7);
    }

    public static /* synthetic */ void zzj(zzrl zzrlVar, long j) {
        zzrlVar.zzd = 7;
        zzrlVar.zze = Long.valueOf(j);
    }

    public static /* synthetic */ void zzk(zzrl zzrlVar, float f7) {
        zzrlVar.zzd = 9;
        zzrlVar.zze = Float.valueOf(f7);
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzks.zzC(zzb, "\u0000\u000b\u0001\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001:\u0000\u0002=\u0000\u0003Ȼ\u0000\u0004B\u0000\u0005B\u0000\u0006>\u0000\u0007C\u0000\b6\u0000\t4\u0000\n3\u0000\u000bȻ\u0000", new Object[]{"zze", "zzd"});
        }
        if (i8 == 3) {
            return new zzrl();
        }
        zzqr zzqrVar = null;
        if (i8 == 4) {
            return new zzrk(zzqrVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
