package com.google.android.recaptcha.internal;

import com.google.android.gms.internal.ads.zzbbd;

/* JADX INFO: loaded from: classes.dex */
public final class zzop extends zzks implements zzly {
    private static final zzop zzb;
    private int zzd;
    private Object zzf;
    private int zzg;
    private long zzl;
    private zzka zzm;
    private int zzn;
    private zzod zzo;
    private zzpb zzp;
    private zzmz zzr;
    private zzka zzs;
    private int zzu;
    private int zze = 0;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzq = "";
    private zzkx zzt = zzks.zzw();

    static {
        zzop zzopVar = new zzop();
        zzb = zzopVar;
        zzks.zzF(zzop.class, zzopVar);
    }

    private zzop() {
    }

    public static zzop zzJ(byte[] bArr) {
        return (zzop) zzks.zzv(zzb, bArr);
    }

    public static /* synthetic */ void zzO(zzop zzopVar, zzod zzodVar) {
        zzopVar.zzo = zzodVar;
        zzopVar.zzd |= 2;
    }

    public static /* synthetic */ void zzP(zzop zzopVar, zzpb zzpbVar) {
        zzpbVar.getClass();
        zzopVar.zzp = zzpbVar;
        zzopVar.zzd |= 4;
    }

    public static /* synthetic */ void zzR(zzop zzopVar, int i7) {
        zzkx zzkxVar = zzopVar.zzt;
        if (!zzkxVar.zzc()) {
            zzopVar.zzt = zzks.zzx(zzkxVar);
        }
        zzopVar.zzt.zzh(0);
    }

    public static /* synthetic */ void zzS(zzop zzopVar, int i7) {
        zzopVar.zzd |= 32;
        zzopVar.zzu = i7;
    }

    public static /* synthetic */ void zzT(zzop zzopVar, String str) {
        str.getClass();
        zzopVar.zzh = str;
    }

    public static /* synthetic */ void zzU(zzop zzopVar, String str) {
        str.getClass();
        zzopVar.zzi = str;
    }

    public static zzoo zzi() {
        return (zzoo) zzb.zzp();
    }

    public static zzop zzk() {
        return zzb;
    }

    public final String zzK() {
        return this.zzi;
    }

    public final String zzL() {
        return this.zzj;
    }

    public final boolean zzV() {
        return (this.zzd & 2) != 0;
    }

    public final int zzW() {
        int i7;
        switch (this.zzg) {
            case 0:
                i7 = 2;
                break;
            case 1:
                i7 = 3;
                break;
            case 2:
                i7 = 4;
                break;
            case 3:
                i7 = 5;
                break;
            case 4:
                i7 = 6;
                break;
            case 5:
                i7 = 7;
                break;
            case 6:
                i7 = 8;
                break;
            case 7:
                i7 = 9;
                break;
            case 8:
                i7 = 10;
                break;
            case 9:
                i7 = 11;
                break;
            case 10:
                i7 = 12;
                break;
            case 11:
                i7 = 13;
                break;
            case 12:
                i7 = 14;
                break;
            case 13:
                i7 = 15;
                break;
            case 14:
                i7 = 16;
                break;
            case 15:
                i7 = 17;
                break;
            case 16:
                i7 = 18;
                break;
            case 17:
                i7 = 19;
                break;
            case 18:
                i7 = 20;
                break;
            case 19:
                i7 = 21;
                break;
            case 20:
                i7 = 22;
                break;
            case zzbbd.zzt.zzm /* 21 */:
                i7 = 23;
                break;
            case 22:
                i7 = 24;
                break;
            case 23:
                i7 = 25;
                break;
            case 24:
                i7 = 26;
                break;
            case 25:
                i7 = 27;
                break;
            case 26:
                i7 = 28;
                break;
            case 27:
                i7 = 29;
                break;
            case 28:
                i7 = 30;
                break;
            case 29:
                i7 = 31;
                break;
            case 30:
                i7 = 32;
                break;
            case 31:
                i7 = 33;
                break;
            case 32:
                i7 = 34;
                break;
            case 33:
                i7 = 35;
                break;
            case 34:
                i7 = 36;
                break;
            case 35:
                i7 = 37;
                break;
            case 36:
                i7 = 38;
                break;
            case 37:
                i7 = 39;
                break;
            case 38:
                i7 = 40;
                break;
            default:
                i7 = 0;
                break;
        }
        if (i7 == 0) {
            return 1;
        }
        return i7;
    }

    public final int zzX() {
        int i7 = this.zzn;
        int i8 = 2;
        if (i7 != 0) {
            if (i7 != 1) {
                i8 = i7 != 2 ? 0 : 4;
            } else {
                i8 = 3;
            }
        }
        if (i8 == 0) {
            return 1;
        }
        return i8;
    }

    @Deprecated
    public final long zzf() {
        return this.zzl;
    }

    public final zzod zzg() {
        zzod zzodVar = this.zzo;
        return zzodVar == null ? zzod.zzj() : zzodVar;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzks.zzC(zzb, "\u0000\u0010\u0001\u0001\u0001\u0012\u0010\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003\u0003\u0004\f\u0005ဉ\u0001\u0006ဉ\u0002\u0007Ȉ\bȈ\tȈ\nဉ\u0000\u000bဉ\u0003\rဉ\u0004\u000eȈ\u000f<\u0000\u0011'\u0012င\u0005", new Object[]{"zzf", "zze", "zzd", "zzg", "zzi", "zzl", "zzn", "zzo", "zzp", "zzq", "zzj", "zzk", "zzm", "zzr", "zzs", "zzh", zznw.class, "zzt", "zzu"});
        }
        if (i8 == 3) {
            return new zzop();
        }
        zzon zzonVar = null;
        if (i8 == 4) {
            return new zzoo(zzonVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}
