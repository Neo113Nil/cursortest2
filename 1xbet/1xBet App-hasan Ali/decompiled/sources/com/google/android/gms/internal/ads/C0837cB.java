package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.cB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0837cB extends MB {
    private static final C0837cB zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;

    static {
        C0837cB c0837cB = new C0837cB();
        zza = c0837cB;
        MB.k(C0837cB.class, c0837cB);
    }

    public static C0748aB x() {
        return (C0748aB) zza.g();
    }

    public static C0837cB y() {
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
            return new C1375oC(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzc"});
        }
        if (b3 == 3) {
            return new C0837cB();
        }
        if (b3 == 4) {
            return new C0748aB(zza);
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
        synchronized (C0837cB.class) {
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
        return this.zzc;
    }
}
