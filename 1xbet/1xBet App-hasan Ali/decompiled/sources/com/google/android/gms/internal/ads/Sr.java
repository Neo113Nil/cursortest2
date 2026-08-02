package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class Sr extends MB {
    private static final Sr zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private Pr zzd;

    static {
        Sr sr = new Sr();
        zza = sr;
        MB.k(Sr.class, sr);
    }

    public static Rr w() {
        return (Rr) zza.g();
    }

    public static /* synthetic */ void x(Sr sr, Pr pr) {
        sr.zzd = pr;
        sr.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zza, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zzc", "zzd"});
        }
        if (b3 == 3) {
            return new Sr();
        }
        if (b3 == 4) {
            return new Rr(zza);
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
        synchronized (Sr.class) {
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
