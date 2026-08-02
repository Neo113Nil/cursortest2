package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class S6 extends MB {
    public static final int zza = 1;
    private static final S6 zzb;
    private static volatile InterfaceC1195kC zzc;
    private int zzd;
    private int zze;

    static {
        S6 s6 = new S6();
        zzb = s6;
        MB.k(S6.class, s6);
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", W3.f12008p});
        }
        if (b3 == 3) {
            return new S6();
        }
        if (b3 == 4) {
            return new Y3(zzb);
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
        synchronized (S6.class) {
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
