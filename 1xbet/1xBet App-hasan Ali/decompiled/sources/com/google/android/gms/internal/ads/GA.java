package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class GA extends MB {
    private static final GA zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private UB zzd = C1330nC.f14598o;

    static {
        GA ga = new GA();
        zza = ga;
        MB.k(GA.class, ga);
    }

    public static GA A(ByteArrayInputStream byteArrayInputStream, GB gb) {
        MB p5 = MB.p(zza, new BB(byteArrayInputStream), gb);
        MB.t(p5);
        return (GA) p5;
    }

    public static void C(GA ga, FA fa) {
        UB ub = ga.zzd;
        if (!((AbstractC1508rB) ub).f15276k) {
            int size = ub.size();
            ga.zzd = ub.b(size + size);
        }
        ga.zzd.add(fa);
    }

    public static DA y() {
        return (DA) zza.g();
    }

    public final UB B() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzc", "zzd", FA.class});
        }
        if (b3 == 3) {
            return new GA();
        }
        if (b3 == 4) {
            return new DA(zza);
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
        synchronized (GA.class) {
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
        return this.zzd.size();
    }

    public final int x() {
        return this.zzc;
    }

    public final FA z(int i) {
        return (FA) this.zzd.get(i);
    }
}
