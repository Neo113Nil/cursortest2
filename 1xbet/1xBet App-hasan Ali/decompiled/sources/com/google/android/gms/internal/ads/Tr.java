package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class Tr extends MB {
    private static final Tr zza;
    private static volatile InterfaceC1195kC zzb;
    private UB zzc = C1330nC.f14598o;

    static {
        Tr tr = new Tr();
        zza = tr;
        MB.k(Tr.class, tr);
    }

    public static Qr x() {
        return (Qr) zza.g();
    }

    public static void y(Tr tr, Sr sr) {
        UB ub = tr.zzc;
        if (!((AbstractC1508rB) ub).f15276k) {
            int size = ub.size();
            tr.zzc = ub.b(size + size);
        }
        tr.zzc.add(sr);
    }

    public static void z(Tr tr) {
        tr.zzc = C1330nC.f14598o;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zza, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", Sr.class});
        }
        if (b3 == 3) {
            return new Tr();
        }
        if (b3 == 4) {
            return new Qr(zza);
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
        synchronized (Tr.class) {
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
        return this.zzc.size();
    }
}
