package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.b7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0789b7 extends MB {
    public static final int zza = 1;
    private static final C0789b7 zzb;
    private static volatile InterfaceC1195kC zzc;
    private UB zzd = C1330nC.f14598o;

    static {
        C0789b7 c0789b7 = new C0789b7();
        zzb = c0789b7;
        MB.k(C0789b7.class, c0789b7);
    }

    public static W6 w() {
        return (W6) zzb.g();
    }

    public static void x(C0789b7 c0789b7, V6 v6) {
        c0789b7.getClass();
        UB ub = c0789b7.zzd;
        if (!((AbstractC1508rB) ub).f15276k) {
            int size = ub.size();
            c0789b7.zzd = ub.b(size + size);
        }
        c0789b7.zzd.add(v6);
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", V6.class});
        }
        if (b3 == 3) {
            return new C0789b7();
        }
        if (b3 == 4) {
            return new W6(zzb);
        }
        if (b3 == 5) {
            return zzb;
        }
        if (b3 != 6) {
            throw null;
        }
        InterfaceC1195kC interfaceC1195kC2 = zzc;
        if (interfaceC1195kC2 != null) {
            return interfaceC1195kC2;
        }
        synchronized (C0789b7.class) {
            try {
                interfaceC1195kC = zzc;
                if (interfaceC1195kC == null) {
                    interfaceC1195kC = new LB();
                    zzc = interfaceC1195kC;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1195kC;
    }
}
