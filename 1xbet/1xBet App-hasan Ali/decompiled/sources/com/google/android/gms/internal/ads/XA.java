package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class XA extends MB {
    private static final XA zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private int zzd;
    private C0837cB zze;
    private AbstractC1823yB zzf = AbstractC1823yB.f16414l;

    static {
        XA xa = new XA();
        zza = xa;
        MB.k(XA.class, xa);
    }

    public static /* synthetic */ void C(XA xa, C0837cB c0837cB) {
        xa.zze = c0837cB;
        xa.zzc |= 1;
    }

    public static WA x() {
        return (WA) zza.g();
    }

    public static XA y(AbstractC1823yB abstractC1823yB, GB gb) {
        return (XA) MB.o(zza, abstractC1823yB, gb);
    }

    public final AbstractC1823yB A() {
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
            return new C1375oC(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (b3 == 3) {
            return new XA();
        }
        if (b3 == 4) {
            return new WA(zza);
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
        synchronized (XA.class) {
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
