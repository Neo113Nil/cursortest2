package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.aA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0747aA extends MB {
    private static final C0747aA zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private int zzd;
    private C0970fA zze;
    private AbstractC1823yB zzf = AbstractC1823yB.f16414l;

    static {
        C0747aA c0747aA = new C0747aA();
        zza = c0747aA;
        MB.k(C0747aA.class, c0747aA);
    }

    public static InterfaceC1195kC B() {
        return zza.h();
    }

    public static /* synthetic */ void D(C0747aA c0747aA, C0970fA c0970fA) {
        c0747aA.zze = c0970fA;
        c0747aA.zzc |= 1;
    }

    public static Zz x() {
        return (Zz) zza.g();
    }

    public static C0747aA y(AbstractC1823yB abstractC1823yB, GB gb) {
        return (C0747aA) MB.o(zza, abstractC1823yB, gb);
    }

    public final AbstractC1823yB A() {
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
            return new C0747aA();
        }
        if (b3 == 4) {
            return new Zz(zza);
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
        synchronized (C0747aA.class) {
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

    public final C0970fA z() {
        C0970fA c0970fA = this.zze;
        return c0970fA == null ? C0970fA.y() : c0970fA;
    }
}
