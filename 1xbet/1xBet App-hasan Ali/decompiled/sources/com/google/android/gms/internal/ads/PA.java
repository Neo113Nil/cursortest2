package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class PA extends MB {
    private static final PA zza;
    private static volatile InterfaceC1195kC zzb;
    private String zzc = "";

    static {
        PA pa = new PA();
        zza = pa;
        MB.k(PA.class, pa);
    }

    public static /* synthetic */ void A(PA pa, String str) {
        str.getClass();
        pa.zzc = str;
    }

    public static OA w() {
        return (OA) zza.g();
    }

    public static PA x() {
        return zza;
    }

    public static PA y(AbstractC1823yB abstractC1823yB, GB gb) {
        return (PA) MB.o(zza, abstractC1823yB, gb);
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzc"});
        }
        if (b3 == 3) {
            return new PA();
        }
        if (b3 == 4) {
            return new OA(zza);
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
        synchronized (PA.class) {
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

    public final String z() {
        return this.zzc;
    }
}
