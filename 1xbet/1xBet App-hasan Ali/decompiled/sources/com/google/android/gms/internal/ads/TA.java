package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class TA extends MB {
    private static final TA zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private String zzd = "";
    private BA zze;

    static {
        TA ta = new TA();
        zza = ta;
        MB.k(TA.class, ta);
    }

    public static /* synthetic */ void B(TA ta, BA ba) {
        ba.getClass();
        ta.zze = ba;
        ta.zzc |= 1;
    }

    public static /* synthetic */ void C(TA ta, String str) {
        str.getClass();
        ta.zzd = str;
    }

    public static SA x() {
        return (SA) zza.g();
    }

    public static TA y() {
        return zza;
    }

    public static TA z(AbstractC1823yB abstractC1823yB, GB gb) {
        return (TA) MB.o(zza, abstractC1823yB, gb);
    }

    public final String A() {
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
            return new C1375oC(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
        }
        if (b3 == 3) {
            return new TA();
        }
        if (b3 == 4) {
            return new SA(zza);
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
        synchronized (TA.class) {
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

    public final BA w() {
        BA ba = this.zze;
        return ba == null ? BA.x() : ba;
    }
}
