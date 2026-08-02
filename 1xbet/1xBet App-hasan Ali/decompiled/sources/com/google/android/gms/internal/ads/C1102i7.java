package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.i7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1102i7 extends MB {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C1102i7 zzc;
    private static volatile InterfaceC1195kC zzd;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        C1102i7 c1102i7 = new C1102i7();
        zzc = c1102i7;
        MB.k(C1102i7.class, c1102i7);
    }

    public static C1057h7 w() {
        return (C1057h7) zzc.g();
    }

    public static void y(C1102i7 c1102i7, boolean z3) {
        c1102i7.zze |= 1;
        c1102i7.zzf = z3;
    }

    public static void z(C1102i7 c1102i7, int i) {
        c1102i7.zze |= 2;
        c1102i7.zzg = i;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (b3 == 3) {
            return new C1102i7();
        }
        if (b3 == 4) {
            return new C1057h7(zzc);
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
        synchronized (C1102i7.class) {
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

    public final boolean x() {
        return this.zzf;
    }
}
