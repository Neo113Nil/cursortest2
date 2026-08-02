package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.RandomAccess;
import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.u7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1639u7 extends MB {
    public static final int zza = 9;
    public static final int zzb = 10;
    public static final int zzc = 11;
    public static final int zzd = 12;
    public static final int zze = 13;
    public static final int zzf = 14;
    public static final int zzg = 15;
    public static final int zzh = 16;
    public static final int zzi = 17;
    public static final int zzj = 18;
    public static final int zzk = 19;
    public static final int zzl = 20;
    public static final int zzm = 21;
    private static final C1639u7 zzn;
    private static volatile InterfaceC1195kC zzo;
    private C1460q7 zzA;
    private C1549s7 zzB;
    private C6 zzC;
    private A6 zzD;
    private I6 zzE;
    private C1102i7 zzF;
    private C0789b7 zzG;
    private int zzp;
    private int zzu;
    private int zzw;
    private P6 zzy;
    private String zzv = "";
    private int zzx = 1000;
    private TB zzz = C0794bC.f12777o;

    static {
        C1639u7 c1639u7 = new C1639u7();
        zzn = c1639u7;
        MB.k(C1639u7.class, c1639u7);
    }

    public static void A(C1639u7 c1639u7, C1460q7 c1460q7) {
        c1639u7.getClass();
        c1639u7.zzA = c1460q7;
        c1639u7.zzp |= 32;
    }

    public static void B(C1639u7 c1639u7, I6 i6) {
        c1639u7.getClass();
        c1639u7.zzE = i6;
        c1639u7.zzp |= 512;
    }

    public static void C(C1639u7 c1639u7, C1102i7 c1102i7) {
        c1639u7.getClass();
        c1639u7.zzF = c1102i7;
        c1639u7.zzp |= 1024;
    }

    public static void D(C1639u7 c1639u7, String str) {
        c1639u7.getClass();
        str.getClass();
        c1639u7.zzp |= 2;
        c1639u7.zzv = str;
    }

    public static C1594t7 H() {
        return (C1594t7) zzn.g();
    }

    public static void w(C1639u7 c1639u7, ArrayList arrayList) {
        RandomAccess randomAccess = c1639u7.zzz;
        if (!((AbstractC1508rB) randomAccess).f15276k) {
            C0794bC c0794bC = (C0794bC) randomAccess;
            int i = c0794bC.f12779m;
            c1639u7.zzz = c0794bC.b(i + i);
        }
        AbstractC1464qB.c(arrayList, c1639u7.zzz);
    }

    public static void x(C1639u7 c1639u7) {
        c1639u7.getClass();
        c1639u7.zzz = C0794bC.f12777o;
    }

    public static void y(C1639u7 c1639u7, A6 a6) {
        c1639u7.getClass();
        c1639u7.zzD = a6;
        c1639u7.zzp |= 256;
    }

    public static void z(C1639u7 c1639u7, C0789b7 c0789b7) {
        c1639u7.getClass();
        c1639u7.zzG = c0789b7;
        c1639u7.zzp |= 2048;
    }

    public final String E() {
        return this.zzv;
    }

    public final A6 F() {
        A6 a6 = this.zzD;
        return a6 == null ? A6.z() : a6;
    }

    public final C1460q7 G() {
        C1460q7 c1460q7 = this.zzA;
        return c1460q7 == null ? C1460q7.y() : c1460q7;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zzn, "\u0004\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\f᠌\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzp", "zzu", "zzv", "zzw", "zzx", W3.f12012t, "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG"});
        }
        if (b3 == 3) {
            return new C1639u7();
        }
        if (b3 == 4) {
            return new C1594t7(zzn);
        }
        if (b3 == 5) {
            return zzn;
        }
        if (b3 != 6) {
            throw null;
        }
        InterfaceC1195kC interfaceC1195kC2 = zzo;
        if (interfaceC1195kC2 != null) {
            return interfaceC1195kC2;
        }
        synchronized (C1639u7.class) {
            try {
                interfaceC1195kC = zzo;
                if (interfaceC1195kC == null) {
                    interfaceC1195kC = new LB();
                    zzo = interfaceC1195kC;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1195kC;
    }
}
