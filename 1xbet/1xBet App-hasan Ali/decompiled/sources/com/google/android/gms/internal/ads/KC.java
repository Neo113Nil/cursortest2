package com.google.android.gms.internal.ads;

import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class KC extends MB {
    private static final KC zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private String zzf = "";
    private UB zzg;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private String zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private UB zzu;
    private boolean zzv;
    private long zzw;
    private QB zzx;
    private boolean zzy;
    private QB zzz;

    static {
        KC kc = new KC();
        zza = kc;
        MB.k(KC.class, kc);
    }

    public KC() {
        C1330nC c1330nC = C1330nC.f14598o;
        this.zzg = c1330nC;
        this.zzl = "";
        this.zzu = c1330nC;
        NB nb = NB.f10781o;
        this.zzx = nb;
        this.zzz = nb;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zza, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005᠌\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000bင\t\fင\n\rဇ\u000b\u000e\u001b\u000fဇ\f\u0010ဂ\r\u0011ࠬ\u0012ဇ\u000e\u0013ࠬ", new Object[]{"zzc", "zzd", W3.f11991A, "zze", "zzf", "zzg", "zzh", W3.f12017y, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", JC.class, "zzv", "zzw", "zzx", W3.f12015w, "zzy", "zzz", W3.f12018z});
        }
        if (b3 == 3) {
            return new KC();
        }
        if (b3 == 4) {
            return new C1504r7(zza);
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
        synchronized (KC.class) {
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
