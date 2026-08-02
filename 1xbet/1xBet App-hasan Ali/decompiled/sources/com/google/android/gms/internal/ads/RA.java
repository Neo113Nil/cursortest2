package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class RA extends MB {
    private static final RA zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private int zzd;
    private TA zze;

    static {
        RA ra = new RA();
        zza = ra;
        MB.k(RA.class, ra);
    }

    public static InterfaceC1195kC A() {
        return zza.h();
    }

    public static /* synthetic */ void B(RA ra, TA ta) {
        ra.zze = ta;
        ra.zzc |= 1;
    }

    public static QA x() {
        return (QA) zza.g();
    }

    public static RA y(AbstractC1823yB abstractC1823yB, GB gb) {
        return (RA) MB.o(zza, abstractC1823yB, gb);
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
        }
        if (b3 == 3) {
            return new RA();
        }
        if (b3 == 4) {
            return new QA(zza);
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
        synchronized (RA.class) {
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

    public final TA z() {
        TA ta = this.zze;
        return ta == null ? TA.y() : ta;
    }
}
