package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class Q6 extends MB {
    public static final int zza = 5;
    public static final int zzb = 6;
    public static final int zzc = 7;
    public static final int zzd = 8;
    public static final int zze = 9;
    public static final int zzf = 10;
    public static final int zzg = 11;
    public static final int zzh = 12;
    public static final int zzi = 13;
    public static final int zzj = 14;
    public static final int zzk = 15;
    public static final int zzl = 16;
    public static final int zzm = 17;
    public static final int zzn = 18;
    public static final int zzo = 19;
    public static final int zzp = 20;
    private static final Q6 zzu;
    private static volatile InterfaceC1195kC zzv;
    private C1012g7 zzA;
    private R6 zzB;
    private C0878d7 zzC;
    private T6 zzD;
    private int zzE;
    private int zzF;
    private N6 zzG;
    private int zzH;
    private int zzI;
    private int zzJ;
    private int zzK;
    private int zzL;
    private long zzM;
    private int zzw;
    private C0833c7 zzx;
    private C0922e7 zzy;
    private C0967f7 zzz;

    static {
        Q6 q6 = new Q6();
        zzu = q6;
        MB.k(Q6.class, q6);
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zzu, "\u0004\u0010\u0000\u0001\u0005\u0014\u0010\u0000\u0000\u0000\u0005ဉ\u0000\u0006ဉ\u0001\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005\u000bဉ\u0006\fင\u0007\rင\b\u000eဉ\t\u000fင\n\u0010င\u000b\u0011င\f\u0012င\r\u0013င\u000e\u0014ဃ\u000f", new Object[]{"zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM"});
        }
        if (b3 == 3) {
            return new Q6();
        }
        if (b3 == 4) {
            return new Y3(zzu);
        }
        if (b3 == 5) {
            return zzu;
        }
        if (b3 != 6) {
            throw null;
        }
        InterfaceC1195kC interfaceC1195kC2 = zzv;
        if (interfaceC1195kC2 != null) {
            return interfaceC1195kC2;
        }
        synchronized (Q6.class) {
            try {
                interfaceC1195kC = zzv;
                if (interfaceC1195kC == null) {
                    interfaceC1195kC = new LB();
                    zzv = interfaceC1195kC;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1195kC;
    }
}
