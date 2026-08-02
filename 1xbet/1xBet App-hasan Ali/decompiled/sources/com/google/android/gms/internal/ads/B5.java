package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class B5 extends MB {
    private static final B5 zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private String zzd = "";
    private String zze = "";
    private long zzf;
    private long zzg;
    private long zzh;

    static {
        B5 b5 = new B5();
        zza = b5;
        MB.k(B5.class, b5);
    }

    public static B5 A() {
        return zza;
    }

    public static B5 B(C1733wB c1733wB) {
        B5 b5 = zza;
        GB gb = GB.f9177a;
        C1285mC c1285mC = C1285mC.f14484c;
        MB o5 = MB.o(b5, c1733wB, GB.f9178b);
        MB.t(o5);
        return (B5) o5;
    }

    public static B5 C(C1733wB c1733wB, GB gb) {
        return (B5) MB.o(zza, c1733wB, gb);
    }

    public static /* synthetic */ void F(B5 b5, String str) {
        str.getClass();
        b5.zzc |= 2;
        b5.zze = str;
    }

    public static /* synthetic */ void G(B5 b5, long j5) {
        b5.zzc |= 8;
        b5.zzg = j5;
    }

    public static /* synthetic */ void H(B5 b5, long j5) {
        b5.zzc |= 4;
        b5.zzf = j5;
    }

    public static /* synthetic */ void I(B5 b5, long j5) {
        b5.zzc |= 16;
        b5.zzh = j5;
    }

    public static /* synthetic */ void J(B5 b5, String str) {
        str.getClass();
        b5.zzc |= 1;
        b5.zzd = str;
    }

    public static A5 z() {
        return (A5) zza.g();
    }

    public final String D() {
        return this.zze;
    }

    public final String E() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zza, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (b3 == 3) {
            return new B5();
        }
        if (b3 == 4) {
            return new A5(zza);
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
        synchronized (B5.class) {
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

    public final long w() {
        return this.zzg;
    }

    public final long x() {
        return this.zzf;
    }

    public final long y() {
        return this.zzh;
    }
}
