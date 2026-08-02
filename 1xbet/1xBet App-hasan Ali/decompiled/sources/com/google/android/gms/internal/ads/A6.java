package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class A6 extends MB {
    public static final int zza = 7;
    public static final int zzb = 8;
    public static final int zzc = 9;
    public static final int zzd = 10;
    public static final int zze = 11;
    public static final int zzf = 12;
    public static final int zzg = 13;
    public static final int zzh = 14;
    public static final int zzi = 15;
    public static final int zzj = 16;
    public static final int zzk = 17;
    private static final A6 zzl;
    private static volatile InterfaceC1195kC zzm;
    private C1729w7 zzA;
    private C1774x7 zzB;
    private UB zzC;
    private int zzn;
    private int zzo;
    private int zzp = 1000;
    private C1235l7 zzu;
    private C1325n7 zzv;
    private UB zzw;
    private C1370o7 zzx;
    private J6 zzy;
    private D6 zzz;

    static {
        A6 a6 = new A6();
        zzl = a6;
        MB.k(A6.class, a6);
    }

    public A6() {
        C1330nC c1330nC = C1330nC.f14598o;
        this.zzw = c1330nC;
        this.zzC = c1330nC;
    }

    public static void w(A6 a6, EnumC1818y6 enumC1818y6) {
        a6.getClass();
        a6.zzo = enumC1818y6.f16410k;
        a6.zzn |= 1;
    }

    public static void x(A6 a6, C1325n7 c1325n7) {
        a6.getClass();
        a6.zzv = c1325n7;
        a6.zzn |= 8;
    }

    public static A6 z() {
        return zzl;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zzl, "\u0004\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007᠌\u0000\b᠌\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzn", "zzo", W3.f12004l, "zzp", W3.f12012t, "zzu", "zzv", "zzw", C1190k7.class, "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", Q6.class});
        }
        if (b3 == 3) {
            return new A6();
        }
        if (b3 == 4) {
            return new C1863z6(zzl);
        }
        if (b3 == 5) {
            return zzl;
        }
        if (b3 != 6) {
            throw null;
        }
        InterfaceC1195kC interfaceC1195kC2 = zzm;
        if (interfaceC1195kC2 != null) {
            return interfaceC1195kC2;
        }
        synchronized (A6.class) {
            try {
                interfaceC1195kC = zzm;
                if (interfaceC1195kC == null) {
                    interfaceC1195kC = new LB();
                    zzm = interfaceC1195kC;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1195kC;
    }

    public final C1325n7 y() {
        C1325n7 c1325n7 = this.zzv;
        return c1325n7 == null ? C1325n7.x() : c1325n7;
    }
}
