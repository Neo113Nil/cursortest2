package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.d4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0875d4 extends MB {
    public static final /* synthetic */ int zza = 0;
    private static final C0875d4 zzb;
    private static volatile InterfaceC1195kC zzc;
    private int zzd;
    private boolean zzf;
    private boolean zzg;
    private long zze = 100;
    private long zzh = 300;
    private long zzi = 1000;

    static {
        C0875d4 c0875d4 = new C0875d4();
        zzb = c0875d4;
        MB.k(C0875d4.class, c0875d4);
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (b3 == 3) {
            return new C0875d4();
        }
        if (b3 == 4) {
            return new Y3(zzb);
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
        synchronized (C0875d4.class) {
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
