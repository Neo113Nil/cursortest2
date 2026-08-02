package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.jA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1148jA extends MB {
    private static final C1148jA zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private int zzd;

    static {
        C1148jA c1148jA = new C1148jA();
        zza = c1148jA;
        MB.k(C1148jA.class, c1148jA);
    }

    public static C1105iA y() {
        return (C1105iA) zza.g();
    }

    public static C1148jA z(AbstractC1823yB abstractC1823yB, GB gb) {
        return (C1148jA) MB.o(zza, abstractC1823yB, gb);
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zza, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzc", "zzd"});
        }
        if (b3 == 3) {
            return new C1148jA();
        }
        if (b3 == 4) {
            return new C1105iA(zza);
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
        synchronized (C1148jA.class) {
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

    public final int x() {
        return this.zzd;
    }
}
