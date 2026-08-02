package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class V3 extends MB {
    private static final V3 zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private int zzd;
    private boolean zzg;
    private C0786b4 zzi;
    private C0875d4 zzj;
    private boolean zzk;
    private boolean zze = true;
    private String zzf = "unknown_host";
    private boolean zzh = true;

    static {
        V3 v32 = new V3();
        zza = v32;
        MB.k(V3.class, v32);
    }

    public static /* synthetic */ void A(V3 v32, boolean z3) {
        v32.zzc |= 8;
        v32.zzg = z3;
    }

    public static /* synthetic */ void B(V3 v32, String str) {
        str.getClass();
        v32.zzc |= 4;
        v32.zzf = str;
    }

    public static U3 w() {
        return (U3) zza.g();
    }

    public final boolean C() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zza, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဇ\u0007", new Object[]{"zzc", "zzd", W3.f11996b, "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (b3 == 3) {
            return new V3();
        }
        if (b3 == 4) {
            return new U3(zza);
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
        synchronized (V3.class) {
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

    public final C0786b4 x() {
        C0786b4 c0786b4 = this.zzi;
        return c0786b4 == null ? C0786b4.x() : c0786b4;
    }

    public final void y() {
        if (this.zzj == null) {
            int i = C0875d4.zza;
        }
    }

    public final String z() {
        return this.zzf;
    }
}
