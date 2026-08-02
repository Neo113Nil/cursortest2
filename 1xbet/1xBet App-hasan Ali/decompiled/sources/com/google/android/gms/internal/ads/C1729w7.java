package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.w7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1729w7 extends MB {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C1729w7 zzc;
    private static volatile InterfaceC1195kC zzd;
    private int zze;
    private int zzf;
    private QB zzg = NB.f10781o;

    static {
        C1729w7 c1729w7 = new C1729w7();
        zzc = c1729w7;
        MB.k(C1729w7.class, c1729w7);
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u0016", new Object[]{"zze", "zzf", W3.f12012t, "zzg"});
        }
        if (b3 == 3) {
            return new C1729w7();
        }
        if (b3 == 4) {
            return new C1504r7(zzc);
        }
        if (b3 == 5) {
            return zzc;
        }
        if (b3 != 6) {
            throw null;
        }
        InterfaceC1195kC interfaceC1195kC2 = zzd;
        if (interfaceC1195kC2 != null) {
            return interfaceC1195kC2;
        }
        synchronized (C1729w7.class) {
            try {
                interfaceC1195kC = zzd;
                if (interfaceC1195kC == null) {
                    interfaceC1195kC = new LB();
                    zzd = interfaceC1195kC;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1195kC;
    }
}
