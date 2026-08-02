package com.google.android.gms.internal.ads;

import java.util.RandomAccess;
import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.lt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1265lt extends MB {
    private static final C1265lt zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private QB zzd = NB.f10781o;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        C1265lt c1265lt = new C1265lt();
        zza = c1265lt;
        MB.k(C1265lt.class, c1265lt);
    }

    public static C1220kt w() {
        return (C1220kt) zza.g();
    }

    public static /* synthetic */ void x(C1265lt c1265lt, String str) {
        str.getClass();
        c1265lt.zzc |= 1;
        c1265lt.zze = str;
    }

    public static void y(C1265lt c1265lt) {
        RandomAccess randomAccess = c1265lt.zzd;
        if (!((AbstractC1508rB) randomAccess).f15276k) {
            NB nb = (NB) randomAccess;
            int i = nb.f10783m;
            c1265lt.zzd = nb.b(i + i);
        }
        ((NB) c1265lt.zzd).f(2);
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzc", "zzd", W3.f12013u, "zze", "zzf", "zzg"});
        }
        if (b3 == 3) {
            return new C1265lt();
        }
        if (b3 == 4) {
            return new C1220kt(zza);
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
        synchronized (C1265lt.class) {
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
