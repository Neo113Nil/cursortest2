package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.a4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0741a4 extends MB {
    private static final C0741a4 zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private long zze;
    private long zzi;
    private long zzj;
    private long zzl;
    private int zzp;
    private String zzd = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzk = "";
    private String zzm = "";
    private String zzn = "";
    private UB zzo = C1330nC.f14598o;

    static {
        C0741a4 c0741a4 = new C0741a4();
        zza = c0741a4;
        MB.k(C0741a4.class, c0741a4);
    }

    public static /* synthetic */ void A(C0741a4 c0741a4, String str) {
        c0741a4.zzc |= 8;
        c0741a4.zzg = str;
    }

    public static /* synthetic */ void B(C0741a4 c0741a4, long j5) {
        c0741a4.zzc |= 2;
        c0741a4.zze = j5;
    }

    public static /* synthetic */ void C(C0741a4 c0741a4, String str) {
        str.getClass();
        c0741a4.zzc |= 4;
        c0741a4.zzf = str;
    }

    public static /* synthetic */ void D(C0741a4 c0741a4, int i) {
        c0741a4.zzp = i - 1;
        c0741a4.zzc |= 2048;
    }

    public static X3 w() {
        return (X3) zza.g();
    }

    public static /* synthetic */ void x(C0741a4 c0741a4, String str) {
        str.getClass();
        c0741a4.zzc |= 1;
        c0741a4.zzd = str;
    }

    public static /* synthetic */ void y(C0741a4 c0741a4, String str) {
        c0741a4.zzc |= 16;
        c0741a4.zzh = str;
    }

    public static /* synthetic */ void z(C0741a4 c0741a4, String str) {
        c0741a4.zzc |= 1024;
        c0741a4.zzn = str;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zza, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", Z3.class, "zzp", W3.f11997c});
        }
        if (b3 == 3) {
            return new C0741a4();
        }
        if (b3 == 4) {
            return new X3(zza);
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
        synchronized (C0741a4.class) {
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
