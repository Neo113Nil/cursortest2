package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.b4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0786b4 extends MB {
    private static final C0786b4 zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private boolean zzd;
    private int zze = 5000;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;

    static {
        C0786b4 c0786b4 = new C0786b4();
        zza = c0786b4;
        MB.k(C0786b4.class, c0786b4);
    }

    public static C0786b4 x() {
        return zza;
    }

    public final boolean A() {
        return this.zzf;
    }

    public final boolean B() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zza, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (b3 == 3) {
            return new C0786b4();
        }
        if (b3 == 4) {
            return new Y3(zza);
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
        synchronized (C0786b4.class) {
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
        return this.zze;
    }

    public final boolean y() {
        return this.zzd;
    }

    public final boolean z() {
        return this.zzg;
    }
}
