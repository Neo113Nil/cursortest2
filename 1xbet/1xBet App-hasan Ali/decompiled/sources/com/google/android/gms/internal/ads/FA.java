package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class FA extends MB {
    private static final FA zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private C1867zA zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        FA fa = new FA();
        zza = fa;
        MB.k(FA.class, fa);
    }

    public static /* synthetic */ void A(FA fa, C1867zA c1867zA) {
        fa.zzd = c1867zA;
        fa.zzc |= 1;
    }

    public static void F(FA fa, int i) {
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        fa.zze = i - 2;
    }

    public static EA y() {
        return (EA) zza.g();
    }

    public final boolean D() {
        return (this.zzc & 1) != 0;
    }

    public final int E() {
        int i = this.zze;
        int i5 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i5 == 0) {
            return 1;
        }
        return i5;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zza, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (b3 == 3) {
            return new FA();
        }
        if (b3 == 4) {
            return new EA(zza);
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
        synchronized (FA.class) {
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
        return this.zzf;
    }

    public final C1867zA x() {
        C1867zA c1867zA = this.zzd;
        return c1867zA == null ? C1867zA.y() : c1867zA;
    }

    public final UA z() {
        UA b3 = UA.b(this.zzg);
        return b3 == null ? UA.f11747q : b3;
    }
}
