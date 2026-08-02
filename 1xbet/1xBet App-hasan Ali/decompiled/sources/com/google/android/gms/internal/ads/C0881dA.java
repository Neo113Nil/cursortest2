package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.dA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0881dA extends MB {
    private static final C0881dA zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private C0970fA zzd;
    private int zze;

    static {
        C0881dA c0881dA = new C0881dA();
        zza = c0881dA;
        MB.k(C0881dA.class, c0881dA);
    }

    public static /* synthetic */ void B(C0881dA c0881dA, C0970fA c0970fA) {
        c0881dA.zzd = c0970fA;
        c0881dA.zzc |= 1;
    }

    public static C0836cA x() {
        return (C0836cA) zza.g();
    }

    public static C0881dA y(AbstractC1823yB abstractC1823yB, GB gb) {
        return (C0881dA) MB.o(zza, abstractC1823yB, gb);
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzc", "zzd", "zze"});
        }
        if (b3 == 3) {
            return new C0881dA();
        }
        if (b3 == 4) {
            return new C0836cA(zza);
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
        synchronized (C0881dA.class) {
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
        return this.zze;
    }

    public final C0970fA z() {
        C0970fA c0970fA = this.zzd;
        return c0970fA == null ? C0970fA.y() : c0970fA;
    }
}
