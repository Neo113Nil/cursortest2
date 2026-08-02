package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.a7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0744a7 extends MB {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final C0744a7 zzd;
    private static volatile InterfaceC1195kC zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    static {
        C0744a7 c0744a7 = new C0744a7();
        zzd = c0744a7;
        MB.k(C0744a7.class, c0744a7);
    }

    public static void w(C0744a7 c0744a7, boolean z3) {
        c0744a7.zzf |= 1;
        c0744a7.zzg = z3;
    }

    public static void x(C0744a7 c0744a7, boolean z3) {
        c0744a7.zzf |= 2;
        c0744a7.zzh = z3;
    }

    public static void y(C0744a7 c0744a7, int i) {
        c0744a7.zzf |= 4;
        c0744a7.zzi = i;
    }

    public static Z6 z() {
        return (Z6) zzd.g();
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi"});
        }
        if (b3 == 3) {
            return new C0744a7();
        }
        if (b3 == 4) {
            return new Z6(zzd);
        }
        if (b3 == 5) {
            return zzd;
        }
        if (b3 != 6) {
            throw null;
        }
        InterfaceC1195kC interfaceC1195kC2 = zze;
        if (interfaceC1195kC2 != null) {
            return interfaceC1195kC2;
        }
        synchronized (C0744a7.class) {
            try {
                interfaceC1195kC = zze;
                if (interfaceC1195kC == null) {
                    interfaceC1195kC = new LB();
                    zze = interfaceC1195kC;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1195kC;
    }
}
