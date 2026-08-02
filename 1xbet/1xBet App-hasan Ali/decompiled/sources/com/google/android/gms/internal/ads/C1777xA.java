package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.xA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1777xA extends MB {
    private static final C1777xA zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private int zzd;

    static {
        C1777xA c1777xA = new C1777xA();
        zza = c1777xA;
        MB.k(C1777xA.class, c1777xA);
    }

    public static C1732wA y() {
        return (C1732wA) zza.g();
    }

    public static C1777xA z() {
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
            return new C1375oC(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzc", "zzd"});
        }
        if (b3 == 3) {
            return new C1777xA();
        }
        if (b3 == 4) {
            return new C1732wA(zza);
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
        synchronized (C1777xA.class) {
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

    public final EnumC1507rA x() {
        int i = this.zzc;
        EnumC1507rA enumC1507rA = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? null : EnumC1507rA.f15272q : EnumC1507rA.f15271p : EnumC1507rA.f15270o : EnumC1507rA.f15269n : EnumC1507rA.f15268m : EnumC1507rA.f15267l;
        return enumC1507rA == null ? EnumC1507rA.f15273r : enumC1507rA;
    }
}
