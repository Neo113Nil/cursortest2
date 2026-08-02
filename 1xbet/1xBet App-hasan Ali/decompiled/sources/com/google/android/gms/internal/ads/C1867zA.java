package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.zA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1867zA extends MB {
    private static final C1867zA zza;
    private static volatile InterfaceC1195kC zzb;
    private String zzc = "";
    private AbstractC1823yB zzd = AbstractC1823yB.f16414l;
    private int zze;

    static {
        C1867zA c1867zA = new C1867zA();
        zza = c1867zA;
        MB.k(C1867zA.class, c1867zA);
    }

    public static void B(C1867zA c1867zA, int i) {
        int i5;
        if (i == 6) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        switch (i) {
            case 1:
                i5 = 0;
                break;
            case 2:
                i5 = 1;
                break;
            case 3:
                i5 = 2;
                break;
            case 4:
                i5 = 3;
                break;
            case 5:
                i5 = 4;
                break;
            case 6:
                i5 = -1;
                break;
            default:
                throw null;
        }
        c1867zA.zze = i5;
    }

    public static /* synthetic */ void C(C1867zA c1867zA, String str) {
        str.getClass();
        c1867zA.zzc = str;
    }

    public static /* synthetic */ void D(C1867zA c1867zA, AbstractC1823yB abstractC1823yB) {
        abstractC1823yB.getClass();
        c1867zA.zzd = abstractC1823yB;
    }

    public static C1822yA w() {
        return (C1822yA) zza.g();
    }

    public static C1867zA y() {
        return zza;
    }

    public final String A() {
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
            return new C1867zA();
        }
        if (b3 == 4) {
            return new C1822yA(zza);
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
        synchronized (C1867zA.class) {
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

    public final int x() {
        int i = this.zze;
        int i5 = 1;
        if (i != 0) {
            int i6 = 2;
            if (i != 1) {
                i5 = 3;
                if (i != 2) {
                    i6 = 4;
                    if (i != 3) {
                        i5 = i != 4 ? 0 : 5;
                    }
                }
            }
            i5 = i6;
        }
        if (i5 == 0) {
            return 6;
        }
        return i5;
    }

    public final AbstractC1823yB z() {
        return this.zzd;
    }
}
