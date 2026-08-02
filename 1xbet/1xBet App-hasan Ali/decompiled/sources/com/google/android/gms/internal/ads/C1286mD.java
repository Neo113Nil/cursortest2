package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.mD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1286mD extends MB {
    private static final C1286mD zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private int zzd;
    private String zze = "";

    static {
        C1286mD c1286mD = new C1286mD();
        zza = c1286mD;
        MB.k(C1286mD.class, c1286mD);
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", C0795bD.i, "zze"});
        }
        if (b3 == 3) {
            return new C1286mD();
        }
        if (b3 == 4) {
            return new C1504r7(zza);
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
        synchronized (C1286mD.class) {
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
}
