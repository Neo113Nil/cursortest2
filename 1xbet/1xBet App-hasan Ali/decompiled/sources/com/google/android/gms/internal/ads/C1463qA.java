package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.qA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1463qA extends MB {
    private static final C1463qA zza;
    private static volatile InterfaceC1195kC zzb;

    static {
        C1463qA c1463qA = new C1463qA();
        zza = c1463qA;
        MB.k(C1463qA.class, c1463qA);
    }

    public static C1463qA w() {
        return zza;
    }

    public static void x(AbstractC1823yB abstractC1823yB, GB gb) {
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zza, "\u0000\u0000", null);
        }
        if (b3 == 3) {
            return new C1463qA();
        }
        if (b3 == 4) {
            return new C1504r7(zza);
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
        synchronized (C1463qA.class) {
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
}
