package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.l4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1232l4 extends MB {
    private static final C1232l4 zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private long zzw;
    private long zzx;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private int zzj = 1000;
    private long zzk = -1;
    private long zzl = -1;
    private long zzm = -1;
    private int zzn = 1000;
    private long zzo = -1;
    private long zzp = -1;
    private long zzu = -1;
    private long zzv = -1;
    private long zzy = -1;
    private long zzz = -1;
    private long zzA = -1;
    private long zzB = -1;

    static {
        C1232l4 c1232l4 = new C1232l4();
        zza = c1232l4;
        MB.k(C1232l4.class, c1232l4);
    }

    public static /* synthetic */ void A(C1232l4 c1232l4, long j5) {
        c1232l4.zzc |= 4096;
        c1232l4.zzp = j5;
    }

    public static /* synthetic */ void B(C1232l4 c1232l4, long j5) {
        c1232l4.zzc |= 512;
        c1232l4.zzm = j5;
    }

    public static /* synthetic */ void C(C1232l4 c1232l4, long j5) {
        c1232l4.zzc |= 2048;
        c1232l4.zzo = j5;
    }

    public static /* synthetic */ void D(C1232l4 c1232l4, long j5) {
        c1232l4.zzc |= 4;
        c1232l4.zzf = j5;
    }

    public static /* synthetic */ void E(C1232l4 c1232l4, long j5) {
        c1232l4.zzc |= 16;
        c1232l4.zzh = j5;
    }

    public static /* synthetic */ void F(C1232l4 c1232l4, long j5) {
        c1232l4.zzc |= 128;
        c1232l4.zzk = j5;
    }

    public static /* synthetic */ void G(C1232l4 c1232l4, long j5) {
        c1232l4.zzc |= 131072;
        c1232l4.zzy = j5;
    }

    public static /* synthetic */ void H(C1232l4 c1232l4, long j5) {
        c1232l4.zzc |= 1;
        c1232l4.zzd = j5;
    }

    public static /* synthetic */ void I(C1232l4 c1232l4, long j5) {
        c1232l4.zzc |= 262144;
        c1232l4.zzz = j5;
    }

    public static /* synthetic */ void J(C1232l4 c1232l4, long j5) {
        c1232l4.zzc |= 2;
        c1232l4.zze = j5;
    }

    public static /* synthetic */ void K(C1232l4 c1232l4, long j5) {
        c1232l4.zzc |= 256;
        c1232l4.zzl = j5;
    }

    public static /* synthetic */ void L(C1232l4 c1232l4, long j5) {
        c1232l4.zzc |= 32768;
        c1232l4.zzw = j5;
    }

    public static /* synthetic */ void M(C1232l4 c1232l4, long j5) {
        c1232l4.zzc |= 65536;
        c1232l4.zzx = j5;
    }

    public static /* synthetic */ void N(C1232l4 c1232l4, long j5) {
        c1232l4.zzc |= 8192;
        c1232l4.zzu = j5;
    }

    public static /* synthetic */ void O(C1232l4 c1232l4, long j5) {
        c1232l4.zzc |= 16384;
        c1232l4.zzv = j5;
    }

    public static /* synthetic */ void P(C1232l4 c1232l4, int i) {
        c1232l4.zzn = i - 1;
        c1232l4.zzc |= 1024;
    }

    public static /* synthetic */ void Q(C1232l4 c1232l4, int i) {
        c1232l4.zzj = i - 1;
        c1232l4.zzc |= 64;
    }

    public static C1187k4 w() {
        return (C1187k4) zza.g();
    }

    public static /* synthetic */ void x(C1232l4 c1232l4) {
        c1232l4.zzc &= -9;
        c1232l4.zzg = -1L;
    }

    public static /* synthetic */ void y(C1232l4 c1232l4, long j5) {
        c1232l4.zzc |= 8;
        c1232l4.zzg = j5;
    }

    public static /* synthetic */ void z(C1232l4 c1232l4, long j5) {
        c1232l4.zzc |= 32;
        c1232l4.zzi = j5;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            W3 w32 = W3.f12002j;
            return new C1375oC(zza, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", w32, "zzk", "zzl", "zzm", "zzn", w32, "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB"});
        }
        if (b3 == 3) {
            return new C1232l4();
        }
        if (b3 == 4) {
            return new C1187k4(zza);
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
        synchronized (C1232l4.class) {
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
