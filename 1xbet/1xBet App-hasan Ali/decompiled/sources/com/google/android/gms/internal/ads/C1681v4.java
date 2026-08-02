package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.v4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1681v4 extends MB {
    private static final C1681v4 zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private long zzd;
    private String zze = "";
    private AbstractC1823yB zzf = AbstractC1823yB.f16414l;

    static {
        C1681v4 c1681v4 = new C1681v4();
        zza = c1681v4;
        MB.k(C1681v4.class, c1681v4);
    }

    public static C1681v4 x() {
        return zza;
    }

    public final boolean A() {
        return (this.zzc & 1) != 0;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zza, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (b3 == 3) {
            return new C1681v4();
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
        synchronized (C1681v4.class) {
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

    public final long w() {
        return this.zzd;
    }

    public final AbstractC1823yB y() {
        return this.zzf;
    }

    public final String z() {
        return this.zze;
    }
}
