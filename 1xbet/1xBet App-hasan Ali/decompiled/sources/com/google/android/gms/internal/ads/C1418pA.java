package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.pA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1418pA extends MB {
    private static final C1418pA zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private AbstractC1823yB zzd = AbstractC1823yB.f16414l;

    static {
        C1418pA c1418pA = new C1418pA();
        zza = c1418pA;
        MB.k(C1418pA.class, c1418pA);
    }

    public static InterfaceC1195kC A() {
        return zza.h();
    }

    public static C1373oA x() {
        return (C1373oA) zza.g();
    }

    public static C1418pA y(AbstractC1823yB abstractC1823yB, GB gb) {
        return (C1418pA) MB.o(zza, abstractC1823yB, gb);
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzc", "zzd"});
        }
        if (b3 == 3) {
            return new C1418pA();
        }
        if (b3 == 4) {
            return new C1373oA(zza);
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
        synchronized (C1418pA.class) {
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
        return this.zzc;
    }

    public final AbstractC1823yB z() {
        return this.zzd;
    }
}
