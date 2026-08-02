package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.fA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0970fA extends MB {
    private static final C0970fA zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;

    static {
        C0970fA c0970fA = new C0970fA();
        zza = c0970fA;
        MB.k(C0970fA.class, c0970fA);
    }

    public static C0925eA x() {
        return (C0925eA) zza.g();
    }

    public static C0970fA y() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzc"});
        }
        if (b3 == 3) {
            return new C0970fA();
        }
        if (b3 == 4) {
            return new C0925eA(zza);
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
        synchronized (C0970fA.class) {
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
}
