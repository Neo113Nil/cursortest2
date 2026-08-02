package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.nD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1331nD extends MB {
    private static final C1331nD zza;
    private static volatile InterfaceC1195kC zzb;
    private UB zzA;
    private UB zzB;
    private C1241lD zzC;
    private UB zzD;
    private PC zzE;
    private String zzF;
    private KC zzG;
    private UB zzH;
    private C0750aD zzI;
    private int zzJ;
    private UB zzK;
    private UB zzL;
    private long zzM;
    private C1286mD zzN;
    private C0884dD zzO;
    private String zzP;
    private int zzc;
    private int zzd;
    private int zze;
    private NC zzi;
    private UB zzj;
    private UB zzk;
    private String zzl;
    private C1018gD zzm;
    private boolean zzn;
    private UB zzo;
    private String zzp;
    private boolean zzu;
    private boolean zzv;
    private AbstractC1823yB zzw;
    private C1196kD zzx;
    private boolean zzy;
    private String zzz;
    private byte zzQ = 2;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        C1331nD c1331nD = new C1331nD();
        zza = c1331nD;
        MB.k(C1331nD.class, c1331nD);
    }

    public C1331nD() {
        C1330nC c1330nC = C1330nC.f14598o;
        this.zzj = c1330nC;
        this.zzk = c1330nC;
        this.zzl = "";
        this.zzo = c1330nC;
        this.zzp = "";
        this.zzw = AbstractC1823yB.f16414l;
        this.zzz = "";
        this.zzA = c1330nC;
        this.zzB = c1330nC;
        this.zzD = c1330nC;
        this.zzF = "";
        this.zzH = c1330nC;
        this.zzK = c1330nC;
        this.zzL = c1330nC;
        this.zzP = "";
    }

    public static void A(C1331nD c1331nD, ArrayList arrayList) {
        UB ub = c1331nD.zzA;
        if (!((AbstractC1508rB) ub).f15276k) {
            int size = ub.size();
            c1331nD.zzA = ub.b(size + size);
        }
        AbstractC1464qB.c(arrayList, c1331nD.zzA);
    }

    public static void B(C1331nD c1331nD, ArrayList arrayList) {
        UB ub = c1331nD.zzB;
        if (!((AbstractC1508rB) ub).f15276k) {
            int size = ub.size();
            c1331nD.zzB = ub.b(size + size);
        }
        AbstractC1464qB.c(arrayList, c1331nD.zzB);
    }

    public static void C(C1331nD c1331nD, C1108iD c1108iD) {
        UB ub = c1331nD.zzj;
        if (!((AbstractC1508rB) ub).f15276k) {
            int size = ub.size();
            c1331nD.zzj = ub.b(size + size);
        }
        c1331nD.zzj.add(c1108iD);
    }

    public static /* synthetic */ void D(C1331nD c1331nD) {
        c1331nD.zzc &= -65;
        c1331nD.zzl = zza.zzl;
    }

    public static /* synthetic */ void E(C1331nD c1331nD, String str) {
        c1331nD.zzc |= 64;
        c1331nD.zzl = str;
    }

    public static /* synthetic */ void F(C1331nD c1331nD, C1196kD c1196kD) {
        c1331nD.zzx = c1196kD;
        c1331nD.zzc |= 8192;
    }

    public static /* synthetic */ void G(C1331nD c1331nD, NC nc) {
        c1331nD.zzi = nc;
        c1331nD.zzc |= 32;
    }

    public static /* synthetic */ void H(C1331nD c1331nD, String str) {
        str.getClass();
        c1331nD.zzc |= 8;
        c1331nD.zzg = str;
    }

    public static /* synthetic */ void I(C1331nD c1331nD, C1018gD c1018gD) {
        c1331nD.zzm = c1018gD;
        c1331nD.zzc |= 128;
    }

    public static /* synthetic */ void J(C1331nD c1331nD, String str) {
        str.getClass();
        c1331nD.zzc |= 4;
        c1331nD.zzf = str;
    }

    public static /* synthetic */ void K(C1331nD c1331nD, int i) {
        c1331nD.zzd = i - 1;
        c1331nD.zzc |= 1;
    }

    public static LC w() {
        return (LC) zza.g();
    }

    @Override // com.google.android.gms.internal.ads.MB
    public final Object s(int i, MB mb) {
        InterfaceC1195kC interfaceC1195kC;
        switch (AbstractC2462i.b(i)) {
            case 0:
                return Byte.valueOf(this.zzQ);
            case 1:
                this.zzQ = mb == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new C1375oC(zza, "\u0001#\u0000\u0001\u0001##\u0000\t\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001d᠌\u0015\u001e\u001b\u001f\u001b ဂ\u0016!ဉ\u0017\"ဉ\u0018#ဈ\u0019", new Object[]{"zzc", "zzf", "zzg", "zzh", "zzj", C1108iD.class, "zzn", "zzo", "zzp", "zzu", "zzv", "zzd", C0795bD.f12783e, "zze", W3.f11992B, "zzi", "zzl", "zzm", "zzw", "zzk", C1466qD.class, "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", C1555sD.class, "zzE", "zzF", "zzG", "zzH", QC.class, "zzI", "zzJ", C0795bD.f12785h, "zzK", C0839cD.class, "zzL", C0928eD.class, "zzM", "zzN", "zzO", "zzP"});
            case 3:
                return new C1331nD();
            case 4:
                return new LC(zza);
            case 5:
                return zza;
            case 6:
                InterfaceC1195kC interfaceC1195kC2 = zzb;
                if (interfaceC1195kC2 != null) {
                    return interfaceC1195kC2;
                }
                synchronized (C1331nD.class) {
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
            default:
                throw null;
        }
    }

    public final String x() {
        return this.zzl;
    }

    public final String y() {
        return this.zzf;
    }

    public final UB z() {
        return this.zzj;
    }
}
