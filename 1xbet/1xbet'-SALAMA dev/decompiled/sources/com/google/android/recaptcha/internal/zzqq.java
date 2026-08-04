package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
public final class zzqq extends zzks implements zzly {
    private static final zzqq zzb;
    private int zzd = 0;
    private Object zze;

    static {
        zzqq zzqqVar = new zzqq();
        zzb = zzqqVar;
        zzks.zzF(zzqq.class, zzqqVar);
    }

    private zzqq() {
    }

    public static zzqq zzg() {
        return zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzks.zzC(zzb, "\u0000&\u0001\u0000\u0001&&\u0000\u0000\u0000\u0001?\u0000\u0002?\u0000\u0003?\u0000\u0004?\u0000\u0005?\u0000\u0006?\u0000\u0007?\u0000\b?\u0000\t?\u0000\n?\u0000\u000b?\u0000\f?\u0000\r?\u0000\u000e?\u0000\u000f?\u0000\u0010?\u0000\u0011?\u0000\u0012?\u0000\u0013?\u0000\u0014?\u0000\u0015?\u0000\u0016?\u0000\u0017?\u0000\u0018?\u0000\u0019?\u0000\u001a?\u0000\u001b?\u0000\u001c?\u0000\u001d?\u0000\u001e?\u0000\u001f?\u0000 ?\u0000!?\u0000\"?\u0000#?\u0000$?\u0000%?\u0000&?\u0000", new Object[]{"zze", "zzd"});
        }
        if (i8 == 3) {
            return new zzqq();
        }
        zzqo zzqoVar = null;
        if (i8 == 4) {
            return new zzqp(zzqoVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
