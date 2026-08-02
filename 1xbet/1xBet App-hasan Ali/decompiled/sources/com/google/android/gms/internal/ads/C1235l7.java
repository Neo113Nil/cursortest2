package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.l7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1235l7 extends MB {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final C1235l7 zzd;
    private static volatile InterfaceC1195kC zze;
    private int zzf;
    private String zzg = "";
    private UB zzh = C1330nC.f14598o;
    private int zzi;

    static {
        C1235l7 c1235l7 = new C1235l7();
        zzd = c1235l7;
        MB.k(C1235l7.class, c1235l7);
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001", new Object[]{"zzf", "zzg", "zzh", C1190k7.class, "zzi", W3.f12012t});
        }
        if (b3 == 3) {
            return new C1235l7();
        }
        if (b3 == 4) {
            return new Y3(zzd);
        }
        if (b3 == 5) {
            return zzd;
        }
        if (b3 != 6) {
            throw null;
        }
        InterfaceC1195kC interfaceC1195kC2 = zze;
        if (interfaceC1195kC2 != null) {
            return interfaceC1195kC2;
        }
        synchronized (C1235l7.class) {
            try {
                interfaceC1195kC = zze;
                if (interfaceC1195kC == null) {
                    interfaceC1195kC = new LB();
                    zze = interfaceC1195kC;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1195kC;
    }
}
