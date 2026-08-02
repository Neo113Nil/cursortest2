package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzpu extends zzks implements zzly {
    private static final zzpu zzb;
    private int zzd;
    private String zze = "";

    static {
        zzpu zzpuVar = new zzpu();
        zzb = zzpuVar;
        zzks.zzF(zzpu.class, zzpuVar);
    }

    private zzpu() {
    }

    public static zzpt zzf() {
        return (zzpt) zzb.zzp();
    }

    public static /* synthetic */ void zzi(zzpu zzpuVar, String str) {
        zzpuVar.zzd |= 1;
        zzpuVar.zze = str;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzks.zzC(zzb, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i8 == 3) {
            return new zzpu();
        }
        zzpk zzpkVar = null;
        if (i8 == 4) {
            return new zzpt(zzpkVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
