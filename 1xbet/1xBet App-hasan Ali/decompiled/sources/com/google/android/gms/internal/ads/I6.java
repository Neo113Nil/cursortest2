package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.ArrayList;
import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class I6 extends MB {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    private static final I6 zzi;
    private static volatile InterfaceC1195kC zzj;
    private int zzk;
    private int zzm;
    private int zzn;
    private long zzo;
    private long zzv;
    private int zzw;
    private UB zzl = C1330nC.f14598o;
    private String zzp = "";
    private String zzu = "";

    static {
        I6 i6 = new I6();
        zzi = i6;
        MB.k(I6.class, i6);
    }

    public static void A(I6 i6, int i) {
        i6.zzk |= 1;
        i6.zzm = i;
    }

    public static void B(I6 i6, long j5) {
        i6.zzk |= 32;
        i6.zzv = j5;
    }

    public static void C(I6 i6, int i) {
        i6.zzk |= 2;
        i6.zzn = i;
    }

    public static void D(I6 i6, long j5) {
        i6.zzk |= 4;
        i6.zzo = j5;
    }

    public static G6 E() {
        return (G6) zzi.g();
    }

    public static void w(I6 i6, ArrayList arrayList) {
        UB ub = i6.zzl;
        if (!((AbstractC1508rB) ub).f15276k) {
            int size = ub.size();
            i6.zzl = ub.b(size + size);
        }
        AbstractC1464qB.c(arrayList, i6.zzl);
    }

    public static void x(I6 i6, String str) {
        i6.getClass();
        str.getClass();
        i6.zzk |= 8;
        i6.zzp = str;
    }

    public static void y(I6 i6, int i) {
        i6.zzk |= 64;
        i6.zzw = i;
    }

    public static void z(I6 i6) {
        String str = Build.MODEL;
        i6.getClass();
        str.getClass();
        i6.zzk |= 16;
        i6.zzu = str;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zzi, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzk", "zzl", F6.class, "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw"});
        }
        if (b3 == 3) {
            return new I6();
        }
        if (b3 == 4) {
            return new G6(zzi);
        }
        if (b3 == 5) {
            return zzi;
        }
        if (b3 != 6) {
            throw null;
        }
        InterfaceC1195kC interfaceC1195kC2 = zzj;
        if (interfaceC1195kC2 != null) {
            return interfaceC1195kC2;
        }
        synchronized (I6.class) {
            try {
                interfaceC1195kC = zzj;
                if (interfaceC1195kC == null) {
                    interfaceC1195kC = new LB();
                    zzj = interfaceC1195kC;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1195kC;
    }
}
