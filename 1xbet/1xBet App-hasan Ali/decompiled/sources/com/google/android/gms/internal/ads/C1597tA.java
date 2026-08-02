package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.tA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1597tA extends MB {
    private static final C1597tA zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private int zzd;
    private C1777xA zze;
    private AbstractC1823yB zzf = AbstractC1823yB.f16414l;

    static {
        C1597tA c1597tA = new C1597tA();
        zza = c1597tA;
        MB.k(C1597tA.class, c1597tA);
    }

    public static InterfaceC1195kC C() {
        return zza.h();
    }

    public static /* synthetic */ void E(C1597tA c1597tA, C1777xA c1777xA) {
        c1597tA.zze = c1777xA;
        c1597tA.zzc |= 1;
    }

    public static C1552sA x() {
        return (C1552sA) zza.g();
    }

    public static C1597tA y() {
        return zza;
    }

    public static C1597tA z(AbstractC1823yB abstractC1823yB, GB gb) {
        return (C1597tA) MB.o(zza, abstractC1823yB, gb);
    }

    public final C1777xA A() {
        C1777xA c1777xA = this.zze;
        return c1777xA == null ? C1777xA.z() : c1777xA;
    }

    public final AbstractC1823yB B() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (b3 == 3) {
            return new C1597tA();
        }
        if (b3 == 4) {
            return new C1552sA(zza);
        }
        if (b3 == 5) {
            return zza;
        }
        if (b3 != 6) {
            throw null;
        }
        InterfaceC1195kC interfaceC1195kC2 = zzb;
        if (interfaceC1195kC2 != null) {
            return interfaceC1195kC2;
        }
        synchronized (C1597tA.class) {
            try {
                interfaceC1195kC = zzb;
                if (interfaceC1195kC == null) {
                    interfaceC1195kC = new LB();
                    zzb = interfaceC1195kC;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1195kC;
    }

    public final int w() {
        return this.zzd;
    }
}
