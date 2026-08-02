package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.lA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1238lA extends MB {
    private static final C1238lA zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private AbstractC1823yB zzd = AbstractC1823yB.f16414l;

    static {
        C1238lA c1238lA = new C1238lA();
        zza = c1238lA;
        MB.k(C1238lA.class, c1238lA);
    }

    public static InterfaceC1195kC A() {
        return zza.h();
    }

    public static C1193kA x() {
        return (C1193kA) zza.g();
    }

    public static C1238lA y(AbstractC1823yB abstractC1823yB, GB gb) {
        return (C1238lA) MB.o(zza, abstractC1823yB, gb);
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zza, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzc", "zzd"});
        }
        if (b3 == 3) {
            return new C1238lA();
        }
        if (b3 == 4) {
            return new C1193kA(zza);
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
        synchronized (C1238lA.class) {
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
