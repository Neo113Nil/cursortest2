package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class ZA extends MB {
    private static final ZA zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private int zzd;
    private C0837cB zze;

    static {
        ZA za = new ZA();
        zza = za;
        MB.k(ZA.class, za);
    }

    public static /* synthetic */ void A(ZA za, C0837cB c0837cB) {
        za.zze = c0837cB;
        za.zzc |= 1;
    }

    public static YA x() {
        return (YA) zza.g();
    }

    public static ZA y(AbstractC1823yB abstractC1823yB, GB gb) {
        return (ZA) MB.o(zza, abstractC1823yB, gb);
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zza, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
        }
        if (b3 == 3) {
            return new ZA();
        }
        if (b3 == 4) {
            return new YA(zza);
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
        synchronized (ZA.class) {
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

    public final C0837cB z() {
        C0837cB c0837cB = this.zze;
        return c0837cB == null ? C0837cB.y() : c0837cB;
    }
}
