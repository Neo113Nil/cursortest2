package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.eB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0926eB extends MB {
    private static final C0926eB zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private AbstractC1823yB zzd = AbstractC1823yB.f16414l;

    static {
        C0926eB c0926eB = new C0926eB();
        zza = c0926eB;
        MB.k(C0926eB.class, c0926eB);
    }

    public static InterfaceC1195kC A() {
        return zza.h();
    }

    public static C0882dB x() {
        return (C0882dB) zza.g();
    }

    public static C0926eB y(AbstractC1823yB abstractC1823yB, GB gb) {
        return (C0926eB) MB.o(zza, abstractC1823yB, gb);
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
            return new C0926eB();
        }
        if (b3 == 4) {
            return new C0882dB(zza);
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
        synchronized (C0926eB.class) {
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
