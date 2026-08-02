package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.y4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1816y4 extends MB {
    private static final C1816y4 zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private UB zzd = C1330nC.f14598o;
    private AbstractC1823yB zze = AbstractC1823yB.f16414l;
    private int zzf = 1;
    private int zzg = 1;

    static {
        C1816y4 c1816y4 = new C1816y4();
        zza = c1816y4;
        MB.k(C1816y4.class, c1816y4);
    }

    public static /* synthetic */ void A(C1816y4 c1816y4) {
        c1816y4.zzf = 4;
        c1816y4.zzc |= 2;
    }

    public static C1771x4 w() {
        return (C1771x4) zza.g();
    }

    public static void x(C1816y4 c1816y4, C1733wB c1733wB) {
        UB ub = c1816y4.zzd;
        if (!((AbstractC1508rB) ub).f15276k) {
            int size = ub.size();
            c1816y4.zzd = ub.b(size + size);
        }
        c1816y4.zzd.add(c1733wB);
    }

    public static /* synthetic */ void y(C1816y4 c1816y4, C1733wB c1733wB) {
        c1816y4.zzc |= 1;
        c1816y4.zze = c1733wB;
    }

    public static /* synthetic */ void z(C1816y4 c1816y4, int i) {
        c1816y4.zzg = i - 1;
        c1816y4.zzc |= 4;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zzc", "zzd", "zze", "zzf", W3.f12003k, "zzg", W3.i});
        }
        if (b3 == 3) {
            return new C1816y4();
        }
        if (b3 == 4) {
            return new C1771x4(zza);
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
        synchronized (C1816y4.class) {
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
