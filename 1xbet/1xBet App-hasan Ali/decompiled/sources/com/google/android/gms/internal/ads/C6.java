package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class C6 extends MB {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C6 zzc;
    private static volatile InterfaceC1195kC zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C6 c6 = new C6();
        zzc = c6;
        MB.k(C6.class, c6);
    }

    public static B6 w() {
        return (B6) zzc.g();
    }

    public static void x(C6 c6, int i) {
        c6.getClass();
        int i5 = 1;
        if (i == 1) {
            i5 = 0;
        } else if (i != 2) {
            if (i != 3) {
                i5 = 4;
                if (i != 4) {
                    throw null;
                }
            } else {
                i5 = 2;
            }
        }
        c6.zzg = i5;
        c6.zze |= 2;
    }

    public static void y(C6 c6, int i) {
        c6.getClass();
        c6.zzf = AbstractC2462i.b(i);
        c6.zze |= 1;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", W3.f12006n, "zzg", W3.f12005m});
        }
        if (b3 == 3) {
            return new C6();
        }
        if (b3 == 4) {
            return new B6(zzc);
        }
        if (b3 == 5) {
            return zzc;
        }
        if (b3 != 6) {
            throw null;
        }
        InterfaceC1195kC interfaceC1195kC2 = zzd;
        if (interfaceC1195kC2 != null) {
            return interfaceC1195kC2;
        }
        synchronized (C6.class) {
            try {
                interfaceC1195kC = zzd;
                if (interfaceC1195kC == null) {
                    interfaceC1195kC = new LB();
                    zzd = interfaceC1195kC;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1195kC;
    }
}
