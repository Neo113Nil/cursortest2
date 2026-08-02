package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class Y6 extends MB {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final Y6 zzc;
    private static volatile InterfaceC1195kC zzd;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        Y6 y6 = new Y6();
        zzc = y6;
        MB.k(Y6.class, y6);
    }

    public static X6 w() {
        return (X6) zzc.g();
    }

    public static Y6 x() {
        return zzc;
    }

    public static void y(Y6 y6, boolean z3) {
        y6.zze |= 1;
        y6.zzf = z3;
    }

    public static void z(Y6 y6, int i) {
        y6.zze |= 2;
        y6.zzg = i;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (b3 == 3) {
            return new Y6();
        }
        if (b3 == 4) {
            return new X6(zzc);
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
        synchronized (Y6.class) {
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
