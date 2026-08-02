package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.z5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1862z5 extends MB {
    private static final C1862z5 zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private B5 zzd;
    private AbstractC1823yB zze;
    private AbstractC1823yB zzf;

    static {
        C1862z5 c1862z5 = new C1862z5();
        zza = c1862z5;
        MB.k(C1862z5.class, c1862z5);
    }

    public C1862z5() {
        C1733wB c1733wB = AbstractC1823yB.f16414l;
        this.zze = c1733wB;
        this.zzf = c1733wB;
    }

    public static C1862z5 w(C1733wB c1733wB, GB gb) {
        return (C1862z5) MB.o(zza, c1733wB, gb);
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zza, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (b3 == 3) {
            return new C1862z5();
        }
        if (b3 == 4) {
            return new Y3(zza);
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
        synchronized (C1862z5.class) {
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

    public final B5 x() {
        B5 b5 = this.zzd;
        return b5 == null ? B5.A() : b5;
    }

    public final AbstractC1823yB y() {
        return this.zzf;
    }

    public final AbstractC1823yB z() {
        return this.zze;
    }
}
