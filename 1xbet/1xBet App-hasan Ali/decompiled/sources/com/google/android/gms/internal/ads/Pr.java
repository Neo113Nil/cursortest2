package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.AbstractCollection;
import java.util.RandomAccess;
import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class Pr extends MB {
    private static final Pr zza;
    private static volatile InterfaceC1195kC zzb;
    private int zzA;
    private int zzE;
    private int zzF;
    private int zzG;
    private long zzH;
    private int zzI;
    private int zzP;
    private int zzQ;
    private int zzS;
    private long zzab;
    private int zzad;
    private int zzae;
    private int zzaf;
    private C0773as zzag;
    private int zzah;
    private Zr zzai;
    private Ur zzaj;
    private Wr zzak;
    private Vr zzal;
    private int zzc;
    private int zzd;
    private int zze;
    private long zzg;
    private long zzh;
    private long zzi;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private String zzf = "";
    private QB zzj = NB.f10781o;
    private String zzu = "";
    private String zzv = "";
    private String zzw = "";
    private String zzx = "";
    private String zzy = "";
    private String zzz = "";
    private String zzB = "";
    private String zzC = "";
    private TB zzD = C0794bC.f12777o;
    private String zzJ = "";
    private String zzK = "";
    private String zzL = "";
    private String zzM = "";
    private String zzN = "";
    private String zzO = "";
    private String zzR = "";
    private String zzT = "";
    private String zzU = "";
    private String zzV = "";
    private String zzW = "";
    private String zzX = "";
    private String zzY = "";
    private String zzZ = "";
    private String zzaa = "";
    private String zzac = "";

    static {
        Pr pr = new Pr();
        zza = pr;
        MB.k(Pr.class, pr);
    }

    public static /* synthetic */ void A(Pr pr, String str) {
        str.getClass();
        pr.zzaa = str;
    }

    public static /* synthetic */ void C(Pr pr, String str) {
        str.getClass();
        pr.zzK = str;
    }

    public static /* synthetic */ void E(Pr pr, String str) {
        str.getClass();
        pr.zzV = str;
    }

    public static /* synthetic */ void H(Pr pr) {
        String str = Build.VERSION.RELEASE;
        str.getClass();
        pr.zzz = str;
    }

    public static /* synthetic */ void I(Pr pr, String str) {
        str.getClass();
        pr.zzX = str;
    }

    public static void J(Pr pr, int i) {
        if (i == 11) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        int i5 = -1;
        switch (i) {
            case 1:
                i5 = 0;
                break;
            case 2:
            case 11:
                break;
            case 3:
                i5 = 1;
                break;
            case 4:
                i5 = 2;
                break;
            case 5:
                i5 = 3;
                break;
            case 6:
                i5 = 4;
                break;
            case 7:
                i5 = 5;
                break;
            case 8:
                i5 = 6;
                break;
            case 9:
                i5 = 7;
                break;
            case 10:
                i5 = 8;
                break;
            default:
                throw null;
        }
        pr.zzah = i5;
    }

    public static /* synthetic */ void K(Pr pr, String str) {
        str.getClass();
        pr.zzu = str;
    }

    public static /* synthetic */ void P(Pr pr, String str) {
        str.getClass();
        pr.zzY = str;
    }

    public static /* synthetic */ void Q(Pr pr, int i) {
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        pr.zzI = i - 2;
    }

    public static /* synthetic */ void S(Pr pr, int i) {
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        pr.zzE = i - 2;
    }

    public static Or w() {
        return (Or) zza.g();
    }

    public static void x(Pr pr, AbstractCollection abstractCollection) {
        RandomAccess randomAccess = pr.zzD;
        if (!((AbstractC1508rB) randomAccess).f15276k) {
            C0794bC c0794bC = (C0794bC) randomAccess;
            int i = c0794bC.f12779m;
            pr.zzD = c0794bC.b(i + i);
        }
        AbstractC1464qB.c(abstractCollection, pr.zzD);
    }

    public static /* synthetic */ void y(Pr pr, String str) {
        str.getClass();
        pr.zzx = str;
    }

    public static /* synthetic */ void z(Pr pr, String str) {
        str.getClass();
        pr.zzJ = str;
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        int b3 = AbstractC2462i.b(i);
        if (b3 == 0) {
            return (byte) 1;
        }
        if (b3 == 2) {
            return new C1375oC(zza, "\u00049\u0000\u0001\u000199\u0000\u0002\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015Ȉ\u0016Ȉ\u0017Ȉ\u0018Ȉ\u0019%\u001aȈ\u001bȈ\u001cȈ\u001d\u0002\u001eȈ\u001f\u0002 \u0002!\u0002\"\u0002#\u0002$\u0002%,&\f'\f(\f)ဉ\u0001*ဉ\u0002+\u0004,Ȉ-Ȉ.Ȉ/\f0\u00041\u00042Ȉ3Ȉ4ဉ\u00035\f6ဉ\u00047Ȉ8\u00049ဉ\u0000", new Object[]{"zzc", "zzd", "zzk", "zzl", "zzp", "zzu", "zzx", "zzz", "zzA", "zzE", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzV", "zzW", "zzX", "zzY", "zzZ", "zzaa", "zzv", "zzw", "zzB", "zzC", "zzD", "zzL", "zzM", "zzU", "zzab", "zzf", "zzg", "zzh", "zzi", "zzm", "zzn", "zzo", "zzj", "zzae", "zzaf", "zze", "zzai", "zzaj", "zzP", "zzR", "zzO", "zzN", "zzah", "zzQ", "zzS", "zzT", "zzy", "zzak", "zzF", "zzal", "zzac", "zzad", "zzag"});
        }
        if (b3 == 3) {
            return new Pr();
        }
        if (b3 == 4) {
            return new Or(zza);
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
        synchronized (Pr.class) {
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
