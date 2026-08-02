package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class BA extends MB {
    private static final BA zza;
    private static volatile InterfaceC1195kC zzb;
    private String zzc = "";
    private AbstractC1823yB zzd = AbstractC1823yB.f16414l;
    private int zze;

    static {
        BA ba = new BA();
        zza = ba;
        MB.k(BA.class, ba);
    }

    public static /* synthetic */ void D(BA ba, String str) {
        str.getClass();
        ba.zzc = str;
    }

    public static /* synthetic */ void E(BA ba, AbstractC1823yB abstractC1823yB) {
        abstractC1823yB.getClass();
        ba.zzd = abstractC1823yB;
    }

    public static AA w() {
        return (AA) zza.g();
    }

    public static BA x() {
        return zza;
    }

    public static BA y(byte[] bArr, GB gb) {
        MB u5 = MB.u(zza, bArr, bArr.length, gb);
        MB.t(u5);
        return (BA) u5;
    }

    public final AbstractC1823yB A() {
        return this.zzd;
    }

    public final String B() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzc", "zzd", "zze"});
        }
        if (b3 == 3) {
            return new BA();
        }
        if (b3 == 4) {
            return new AA(zza);
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
        synchronized (BA.class) {
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

    public final UA z() {
        UA b3 = UA.b(this.zze);
        return b3 == null ? UA.f11747q : b3;
    }
}
