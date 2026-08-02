package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzpj extends zzks implements zzly {
    private static final zzpj zzb;
    private int zzd;
    private zzph zze;
    private zzph zzf;

    static {
        zzpj zzpjVar = new zzpj();
        zzb = zzpjVar;
        zzks.zzF(zzpj.class, zzpjVar);
    }

    private zzpj() {
    }

    public static zzpj zzj(byte[] bArr) {
        return (zzpj) zzks.zzv(zzb, bArr);
    }

    public final zzph zzf() {
        zzph zzphVar = this.zze;
        return zzphVar == null ? zzph.zzg() : zzphVar;
    }

    public final zzph zzg() {
        zzph zzphVar = this.zzf;
        return zzphVar == null ? zzph.zzg() : zzphVar;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzks.zzC(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i8 == 3) {
            return new zzpj();
        }
        zzpf zzpfVar = null;
        if (i8 == 4) {
            return new zzpi(zzpfVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
