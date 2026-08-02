package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.nt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1355nt extends MB {
    private static final C1355nt zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private C1265lt zzg;

    static {
        C1355nt c1355nt = new C1355nt();
        zza = c1355nt;
        MB.k(C1355nt.class, c1355nt);
    }

    public static C1310mt w() {
        return (C1310mt) zza.g();
    }

    public static /* synthetic */ void x(C1355nt c1355nt, String str) {
        str.getClass();
        c1355nt.zzc |= 2;
        c1355nt.zze = str;
    }

    public static /* synthetic */ void y(C1355nt c1355nt, C1265lt c1265lt) {
        c1355nt.zzg = c1265lt;
        c1355nt.zzc |= 8;
    }

    public static /* synthetic */ void z(C1355nt c1355nt) {
        c1355nt.zzd = 1;
        c1355nt.zzc = 1 | c1355nt.zzc;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzc", "zzd", W3.f12014v, "zze", "zzf", "zzg"});
        }
        if (b3 == 3) {
            return new C1355nt();
        }
        if (b3 == 4) {
            return new C1310mt(zza);
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
        synchronized (C1355nt.class) {
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
