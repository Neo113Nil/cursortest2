package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class D6 extends MB {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final D6 zzc;
    private static volatile InterfaceC1195kC zzd;
    private int zze;
    private int zzf;
    private N6 zzg;

    static {
        D6 d6 = new D6();
        zzc = d6;
        MB.k(D6.class, d6);
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", W3.f12012t, "zzg"});
        }
        if (b3 == 3) {
            return new D6();
        }
        if (b3 == 4) {
            return new Y3(zzc);
        }
        if (b3 == 5) {
            return zzc;
        }
        if (b3 != 6) {
            throw null;
        }
        InterfaceC1195kC interfaceC1195kC2 = zzd;
        if (interfaceC1195kC2 != null) {
            return interfaceC1195kC2;
        }
        synchronized (D6.class) {
            try {
                interfaceC1195kC = zzd;
                if (interfaceC1195kC == null) {
                    interfaceC1195kC = new LB();
                    zzd = interfaceC1195kC;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1195kC;
    }
}
