package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class VA extends MB {
    public static final /* synthetic */ int zza = 0;
    private static final VA zzb;
    private static volatile InterfaceC1195kC zzc;
    private String zzd = "";
    private UB zze = C1330nC.f14598o;

    static {
        VA va = new VA();
        zzb = va;
        MB.k(VA.class, va);
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzd", "zze", CA.class});
        }
        if (b3 == 3) {
            return new VA();
        }
        if (b3 == 4) {
            return new C1504r7(zzb);
        }
        if (b3 == 5) {
            return zzb;
        }
        if (b3 != 6) {
            throw null;
        }
        InterfaceC1195kC interfaceC1195kC2 = zzc;
        if (interfaceC1195kC2 != null) {
            return interfaceC1195kC2;
        }
        synchronized (VA.class) {
            try {
                interfaceC1195kC = zzc;
                if (interfaceC1195kC == null) {
                    interfaceC1195kC = new LB();
                    zzc = interfaceC1195kC;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1195kC;
    }
}
