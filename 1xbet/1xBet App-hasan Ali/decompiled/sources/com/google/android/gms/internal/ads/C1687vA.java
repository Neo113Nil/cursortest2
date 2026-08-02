package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.vA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1687vA extends MB {
    private static final C1687vA zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private C1777xA zzd;
    private int zze;
    private int zzf;

    static {
        C1687vA c1687vA = new C1687vA();
        zza = c1687vA;
        MB.k(C1687vA.class, c1687vA);
    }

    public static C1687vA A(AbstractC1823yB abstractC1823yB, GB gb) {
        return (C1687vA) MB.o(zza, abstractC1823yB, gb);
    }

    public static /* synthetic */ void D(C1687vA c1687vA, C1777xA c1777xA) {
        c1687vA.zzd = c1777xA;
        c1687vA.zzc |= 1;
    }

    public static C1642uA y() {
        return (C1642uA) zza.g();
    }

    public static C1687vA z() {
        return zza;
    }

    public final C1777xA B() {
        C1777xA c1777xA = this.zzd;
        return c1777xA == null ? C1777xA.z() : c1777xA;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (b3 == 3) {
            return new C1687vA();
        }
        if (b3 == 4) {
            return new C1642uA(zza);
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
        synchronized (C1687vA.class) {
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

    public final int x() {
        return this.zzf;
    }
}
