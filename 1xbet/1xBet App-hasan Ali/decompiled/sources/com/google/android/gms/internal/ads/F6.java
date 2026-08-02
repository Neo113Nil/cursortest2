package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;
import java.util.ArrayList;
import java.util.RandomAccess;
import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class F6 extends MB {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    public static final int zzi = 9;
    public static final int zzj = 10;
    public static final int zzk = 11;
    public static final int zzl = 12;
    public static final int zzm = 13;
    private static final SB zzn = new C1543s1(26);
    private static final F6 zzo;
    private static volatile InterfaceC1195kC zzp;
    private C6 zzA;
    private int zzB;
    private int zzC;
    private int zzD;
    private int zzE;
    private int zzF;
    private int zzG;
    private long zzH;
    private int zzu;
    private long zzv;
    private int zzw;
    private long zzx;
    private long zzy;
    private QB zzz = NB.f10781o;

    static {
        F6 f6 = new F6();
        zzo = f6;
        MB.k(F6.class, f6);
    }

    public static void A(F6 f6, H6 h6) {
        f6.getClass();
        f6.zzG = h6.f9332k;
        f6.zzu |= 1024;
    }

    public static void B(F6 f6, C6 c6) {
        f6.getClass();
        f6.zzA = c6;
        f6.zzu |= 16;
    }

    public static void C(F6 f6, int i) {
        f6.getClass();
        f6.zzF = AbstractC0467k.r(i);
        f6.zzu |= 512;
    }

    public static void D(F6 f6, long j5) {
        f6.zzu |= 8;
        f6.zzy = j5;
    }

    public static void E(F6 f6, long j5) {
        f6.zzu |= 4;
        f6.zzx = j5;
    }

    public static void F(F6 f6, int i) {
        f6.getClass();
        f6.zzw = AbstractC0467k.r(i);
        f6.zzu |= 2;
    }

    public static void G(F6 f6, long j5) {
        f6.zzu |= 1;
        f6.zzv = j5;
    }

    public static void H(F6 f6, long j5) {
        f6.zzu |= 2048;
        f6.zzH = j5;
    }

    public static void I(F6 f6, int i) {
        f6.getClass();
        f6.zzB = AbstractC0467k.r(i);
        f6.zzu |= 32;
    }

    public static E6 L() {
        return (E6) zzo.g();
    }

    public static F6 M(byte[] bArr) {
        F6 f6 = zzo;
        int length = bArr.length;
        GB gb = GB.f9177a;
        C1285mC c1285mC = C1285mC.f14484c;
        MB u5 = MB.u(f6, bArr, length, GB.f9178b);
        MB.t(u5);
        return (F6) u5;
    }

    public static void w(F6 f6, ArrayList arrayList) {
        RandomAccess randomAccess = f6.zzz;
        if (!((AbstractC1508rB) randomAccess).f15276k) {
            NB nb = (NB) randomAccess;
            int i = nb.f10783m;
            f6.zzz = nb.b(i + i);
        }
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            ((NB) f6.zzz).f(((EnumC1145j7) obj).f14086k);
        }
    }

    public static void x(F6 f6, int i) {
        f6.getClass();
        f6.zzC = AbstractC0467k.r(i);
        f6.zzu |= 64;
    }

    public static void y(F6 f6, int i) {
        f6.getClass();
        f6.zzD = AbstractC0467k.r(i);
        f6.zzu |= 128;
    }

    public static void z(F6 f6, int i) {
        f6.zzu |= 256;
        f6.zzE = i;
    }

    public final long J() {
        return this.zzv;
    }

    public final int K() {
        int i = this.zzw;
        int i5 = i != 0 ? i != 1 ? i != 1000 ? 0 : 3 : 2 : 1;
        if (i5 == 0) {
            return 1;
        }
        return i5;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            W3 w32 = W3.f12012t;
            return new C1375oC(zzo, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000b᠌\t\f᠌\n\rဂ\u000b", new Object[]{"zzu", "zzv", "zzw", w32, "zzx", "zzy", "zzz", W3.f12010r, "zzA", "zzB", w32, "zzC", w32, "zzD", w32, "zzE", "zzF", w32, "zzG", W3.f12007o, "zzH"});
        }
        if (b3 == 3) {
            return new F6();
        }
        if (b3 == 4) {
            return new E6(zzo);
        }
        if (b3 == 5) {
            return zzo;
        }
        if (b3 != 6) {
            throw null;
        }
        InterfaceC1195kC interfaceC1195kC2 = zzp;
        if (interfaceC1195kC2 != null) {
            return interfaceC1195kC2;
        }
        synchronized (F6.class) {
            try {
                interfaceC1195kC = zzp;
                if (interfaceC1195kC == null) {
                    interfaceC1195kC = new LB();
                    zzp = interfaceC1195kC;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1195kC;
    }
}
