package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.s4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1546s4 extends MB {
    private static final C1546s4 zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private AbstractC1823yB zzd;
    private AbstractC1823yB zze;
    private AbstractC1823yB zzf;
    private AbstractC1823yB zzg;

    static {
        C1546s4 c1546s4 = new C1546s4();
        zza = c1546s4;
        MB.k(C1546s4.class, c1546s4);
    }

    public C1546s4() {
        C1733wB c1733wB = AbstractC1823yB.f16414l;
        this.zzd = c1733wB;
        this.zze = c1733wB;
        this.zzf = c1733wB;
        this.zzg = c1733wB;
    }

    public static /* synthetic */ void C(C1546s4 c1546s4, C1733wB c1733wB) {
        c1546s4.zzc |= 1;
        c1546s4.zzd = c1733wB;
    }

    public static /* synthetic */ void D(C1546s4 c1546s4, C1733wB c1733wB) {
        c1546s4.zzc |= 2;
        c1546s4.zze = c1733wB;
    }

    public static /* synthetic */ void E(C1546s4 c1546s4, C1733wB c1733wB) {
        c1546s4.zzc |= 8;
        c1546s4.zzg = c1733wB;
    }

    public static /* synthetic */ void F(C1546s4 c1546s4, C1733wB c1733wB) {
        c1546s4.zzc |= 4;
        c1546s4.zzf = c1733wB;
    }

    public static C1501r4 w() {
        return (C1501r4) zza.g();
    }

    public static C1546s4 x(byte[] bArr, GB gb) {
        MB u5 = MB.u(zza, bArr, bArr.length, gb);
        MB.t(u5);
        return (C1546s4) u5;
    }

    public final AbstractC1823yB A() {
        return this.zzg;
    }

    public final AbstractC1823yB B() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (b3 == 3) {
            return new C1546s4();
        }
        if (b3 == 4) {
            return new C1501r4(zza);
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
        synchronized (C1546s4.class) {
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

    public final AbstractC1823yB y() {
        return this.zzd;
    }

    public final AbstractC1823yB z() {
        return this.zze;
    }
}
