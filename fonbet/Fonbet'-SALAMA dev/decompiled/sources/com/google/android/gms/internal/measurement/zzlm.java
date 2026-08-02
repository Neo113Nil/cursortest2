package com.google.android.gms.internal.measurement;

import W5.AbstractC0486a1;
import com.google.android.gms.internal.ads.zzbbd;
import e1.k;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zzlm<T> implements zzlu<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzmv.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzlj zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzkx zzm;
    private final zzml zzn;
    private final zzjp zzo;
    private final zzlo zzp;
    private final zzle zzq;

    private zzlm(int[] iArr, Object[] objArr, int i7, int i8, zzlj zzljVar, boolean z4, boolean z7, int[] iArr2, int i9, int i10, zzlo zzloVar, zzkx zzkxVar, zzml zzmlVar, zzjp zzjpVar, zzle zzleVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i7;
        this.zzf = i8;
        this.zzi = z4;
        boolean z8 = false;
        if (zzjpVar != null && zzjpVar.zzc(zzljVar)) {
            z8 = true;
        }
        this.zzh = z8;
        this.zzj = iArr2;
        this.zzk = i9;
        this.zzl = i10;
        this.zzp = zzloVar;
        this.zzm = zzkxVar;
        this.zzn = zzmlVar;
        this.zzo = zzjpVar;
        this.zzg = zzljVar;
        this.zzq = zzleVar;
    }

    private static int zzA(int i7) {
        return (i7 >>> 20) & 255;
    }

    private final int zzB(int i7) {
        return this.zzc[i7 + 1];
    }

    private static long zzC(Object obj, long j) {
        return ((Long) zzmv.zzf(obj, j)).longValue();
    }

    private final zzkg zzD(int i7) {
        int i8 = i7 / 3;
        return (zzkg) this.zzd[i8 + i8 + 1];
    }

    private final zzlu zzE(int i7) {
        int i8 = i7 / 3;
        int i9 = i8 + i8;
        zzlu zzluVar = (zzlu) this.zzd[i9];
        if (zzluVar != null) {
            return zzluVar;
        }
        zzlu zzb2 = zzlr.zza().zzb((Class) this.zzd[i9 + 1]);
        this.zzd[i9] = zzb2;
        return zzb2;
    }

    private final Object zzF(int i7) {
        int i8 = i7 / 3;
        return this.zzd[i8 + i8];
    }

    private static Field zzG(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder l7 = k.l("Field ", str, " for ", name, " not found. Known fields are ");
            l7.append(arrays);
            throw new RuntimeException(l7.toString());
        }
    }

    private final void zzH(Object obj, Object obj2, int i7) {
        long zzB = zzB(i7) & 1048575;
        if (zzO(obj2, i7)) {
            Object zzf = zzmv.zzf(obj, zzB);
            Object zzf2 = zzmv.zzf(obj2, zzB);
            if (zzf != null && zzf2 != null) {
                zzmv.zzs(obj, zzB, zzkk.zzg(zzf, zzf2));
                zzJ(obj, i7);
            } else if (zzf2 != null) {
                zzmv.zzs(obj, zzB, zzf2);
                zzJ(obj, i7);
            }
        }
    }

    private final void zzI(Object obj, Object obj2, int i7) {
        int zzB = zzB(i7);
        int i8 = this.zzc[i7];
        long j = zzB & 1048575;
        if (zzR(obj2, i8, i7)) {
            Object zzf = zzR(obj, i8, i7) ? zzmv.zzf(obj, j) : null;
            Object zzf2 = zzmv.zzf(obj2, j);
            if (zzf != null && zzf2 != null) {
                zzmv.zzs(obj, j, zzkk.zzg(zzf, zzf2));
                zzK(obj, i8, i7);
            } else if (zzf2 != null) {
                zzmv.zzs(obj, j, zzf2);
                zzK(obj, i8, i7);
            }
        }
    }

    private final void zzJ(Object obj, int i7) {
        int zzy = zzy(i7);
        long j = 1048575 & zzy;
        if (j == 1048575) {
            return;
        }
        zzmv.zzq(obj, j, (1 << (zzy >>> 20)) | zzmv.zzc(obj, j));
    }

    private final void zzK(Object obj, int i7, int i8) {
        zzmv.zzq(obj, zzy(i8) & 1048575, i7);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void zzL(Object obj, zznd zzndVar) {
        int i7;
        boolean z4;
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        Unsafe unsafe = zzb;
        int i8 = 1048575;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int zzB = zzB(i10);
            int[] iArr = this.zzc;
            int i12 = iArr[i10];
            int zzA = zzA(zzB);
            if (zzA <= 17) {
                int i13 = iArr[i10 + 2];
                int i14 = i13 & i8;
                if (i14 != i9) {
                    i11 = unsafe.getInt(obj, i14);
                    i9 = i14;
                }
                i7 = 1 << (i13 >>> 20);
            } else {
                i7 = 0;
            }
            long j = zzB & i8;
            switch (zzA) {
                case 0:
                    if ((i11 & i7) == 0) {
                        break;
                    } else {
                        zzndVar.zzf(i12, zzmv.zza(obj, j));
                        break;
                    }
                case 1:
                    if ((i11 & i7) == 0) {
                        break;
                    } else {
                        zzndVar.zzo(i12, zzmv.zzb(obj, j));
                        break;
                    }
                case 2:
                    if ((i11 & i7) == 0) {
                        break;
                    } else {
                        zzndVar.zzt(i12, unsafe.getLong(obj, j));
                        break;
                    }
                case 3:
                    if ((i11 & i7) == 0) {
                        break;
                    } else {
                        zzndVar.zzJ(i12, unsafe.getLong(obj, j));
                        break;
                    }
                case 4:
                    if ((i11 & i7) == 0) {
                        break;
                    } else {
                        zzndVar.zzr(i12, unsafe.getInt(obj, j));
                        break;
                    }
                case 5:
                    if ((i11 & i7) == 0) {
                        break;
                    } else {
                        zzndVar.zzm(i12, unsafe.getLong(obj, j));
                        break;
                    }
                case 6:
                    if ((i11 & i7) == 0) {
                        break;
                    } else {
                        zzndVar.zzk(i12, unsafe.getInt(obj, j));
                        break;
                    }
                case 7:
                    if ((i11 & i7) == 0) {
                        break;
                    } else {
                        zzndVar.zzb(i12, zzmv.zzw(obj, j));
                        break;
                    }
                case 8:
                    if ((i11 & i7) == 0) {
                        break;
                    } else {
                        zzT(i12, unsafe.getObject(obj, j), zzndVar);
                        break;
                    }
                case 9:
                    if ((i11 & i7) == 0) {
                        break;
                    } else {
                        zzndVar.zzv(i12, unsafe.getObject(obj, j), zzE(i10));
                        break;
                    }
                case 10:
                    if ((i11 & i7) == 0) {
                        break;
                    } else {
                        zzndVar.zzd(i12, (zzjb) unsafe.getObject(obj, j));
                        break;
                    }
                case 11:
                    if ((i11 & i7) == 0) {
                        break;
                    } else {
                        zzndVar.zzH(i12, unsafe.getInt(obj, j));
                        break;
                    }
                case 12:
                    if ((i11 & i7) == 0) {
                        break;
                    } else {
                        zzndVar.zzi(i12, unsafe.getInt(obj, j));
                        break;
                    }
                case 13:
                    if ((i11 & i7) == 0) {
                        break;
                    } else {
                        zzndVar.zzw(i12, unsafe.getInt(obj, j));
                        break;
                    }
                case 14:
                    if ((i11 & i7) == 0) {
                        break;
                    } else {
                        zzndVar.zzy(i12, unsafe.getLong(obj, j));
                        break;
                    }
                case 15:
                    if ((i11 & i7) == 0) {
                        break;
                    } else {
                        zzndVar.zzA(i12, unsafe.getInt(obj, j));
                        break;
                    }
                case 16:
                    if ((i11 & i7) == 0) {
                        break;
                    } else {
                        zzndVar.zzC(i12, unsafe.getLong(obj, j));
                        break;
                    }
                case 17:
                    if ((i11 & i7) == 0) {
                        break;
                    } else {
                        zzndVar.zzq(i12, unsafe.getObject(obj, j), zzE(i10));
                        break;
                    }
                case 18:
                    zzlw.zzJ(this.zzc[i10], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 19:
                    zzlw.zzN(this.zzc[i10], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 20:
                    zzlw.zzQ(this.zzc[i10], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case zzbbd.zzt.zzm /* 21 */:
                    zzlw.zzY(this.zzc[i10], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 22:
                    zzlw.zzP(this.zzc[i10], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 23:
                    zzlw.zzM(this.zzc[i10], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 24:
                    zzlw.zzL(this.zzc[i10], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 25:
                    zzlw.zzH(this.zzc[i10], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 26:
                    zzlw.zzW(this.zzc[i10], (List) unsafe.getObject(obj, j), zzndVar);
                    break;
                case 27:
                    zzlw.zzR(this.zzc[i10], (List) unsafe.getObject(obj, j), zzndVar, zzE(i10));
                    break;
                case 28:
                    zzlw.zzI(this.zzc[i10], (List) unsafe.getObject(obj, j), zzndVar);
                    break;
                case 29:
                    z4 = false;
                    zzlw.zzX(this.zzc[i10], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 30:
                    z4 = false;
                    zzlw.zzK(this.zzc[i10], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 31:
                    z4 = false;
                    zzlw.zzS(this.zzc[i10], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 32:
                    z4 = false;
                    zzlw.zzT(this.zzc[i10], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 33:
                    z4 = false;
                    zzlw.zzU(this.zzc[i10], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 34:
                    z4 = false;
                    zzlw.zzV(this.zzc[i10], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 35:
                    zzlw.zzJ(this.zzc[i10], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 36:
                    zzlw.zzN(this.zzc[i10], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 37:
                    zzlw.zzQ(this.zzc[i10], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 38:
                    zzlw.zzY(this.zzc[i10], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 39:
                    zzlw.zzP(this.zzc[i10], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 40:
                    zzlw.zzM(this.zzc[i10], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 41:
                    zzlw.zzL(this.zzc[i10], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 42:
                    zzlw.zzH(this.zzc[i10], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 43:
                    zzlw.zzX(this.zzc[i10], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 44:
                    zzlw.zzK(this.zzc[i10], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 45:
                    zzlw.zzS(this.zzc[i10], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 46:
                    zzlw.zzT(this.zzc[i10], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 47:
                    zzlw.zzU(this.zzc[i10], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 48:
                    zzlw.zzV(this.zzc[i10], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 49:
                    zzlw.zzO(this.zzc[i10], (List) unsafe.getObject(obj, j), zzndVar, zzE(i10));
                    break;
                case 50:
                    zzM(zzndVar, i12, unsafe.getObject(obj, j), i10);
                    break;
                case 51:
                    if (zzR(obj, i12, i10)) {
                        zzndVar.zzf(i12, zzn(obj, j));
                    }
                    break;
                case 52:
                    if (zzR(obj, i12, i10)) {
                        zzndVar.zzo(i12, zzo(obj, j));
                    }
                    break;
                case 53:
                    if (zzR(obj, i12, i10)) {
                        zzndVar.zzt(i12, zzC(obj, j));
                    }
                    break;
                case 54:
                    if (zzR(obj, i12, i10)) {
                        zzndVar.zzJ(i12, zzC(obj, j));
                    }
                    break;
                case 55:
                    if (zzR(obj, i12, i10)) {
                        zzndVar.zzr(i12, zzr(obj, j));
                    }
                    break;
                case 56:
                    if (zzR(obj, i12, i10)) {
                        zzndVar.zzm(i12, zzC(obj, j));
                    }
                    break;
                case 57:
                    if (zzR(obj, i12, i10)) {
                        zzndVar.zzk(i12, zzr(obj, j));
                    }
                    break;
                case 58:
                    if (zzR(obj, i12, i10)) {
                        zzndVar.zzb(i12, zzS(obj, j));
                    }
                    break;
                case 59:
                    if (zzR(obj, i12, i10)) {
                        zzT(i12, unsafe.getObject(obj, j), zzndVar);
                    }
                    break;
                case 60:
                    if (zzR(obj, i12, i10)) {
                        zzndVar.zzv(i12, unsafe.getObject(obj, j), zzE(i10));
                    }
                    break;
                case 61:
                    if (zzR(obj, i12, i10)) {
                        zzndVar.zzd(i12, (zzjb) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (zzR(obj, i12, i10)) {
                        zzndVar.zzH(i12, zzr(obj, j));
                    }
                    break;
                case 63:
                    if (zzR(obj, i12, i10)) {
                        zzndVar.zzi(i12, zzr(obj, j));
                    }
                    break;
                case 64:
                    if (zzR(obj, i12, i10)) {
                        zzndVar.zzw(i12, zzr(obj, j));
                    }
                    break;
                case 65:
                    if (zzR(obj, i12, i10)) {
                        zzndVar.zzy(i12, zzC(obj, j));
                    }
                    break;
                case 66:
                    if (zzR(obj, i12, i10)) {
                        zzndVar.zzA(i12, zzr(obj, j));
                    }
                    break;
                case 67:
                    if (zzR(obj, i12, i10)) {
                        zzndVar.zzC(i12, zzC(obj, j));
                    }
                    break;
                case 68:
                    if (zzR(obj, i12, i10)) {
                        zzndVar.zzq(i12, unsafe.getObject(obj, j), zzE(i10));
                    }
                    break;
            }
            i10 += 3;
            i8 = 1048575;
        }
        zzml zzmlVar = this.zzn;
        zzmlVar.zzi(zzmlVar.zzc(obj), zzndVar);
    }

    private final void zzM(zznd zzndVar, int i7, Object obj, int i8) {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private final boolean zzN(Object obj, Object obj2, int i7) {
        return zzO(obj, i7) == zzO(obj2, i7);
    }

    private final boolean zzO(Object obj, int i7) {
        int zzy = zzy(i7);
        long j = zzy & 1048575;
        if (j != 1048575) {
            return (zzmv.zzc(obj, j) & (1 << (zzy >>> 20))) != 0;
        }
        int zzB = zzB(i7);
        long j3 = zzB & 1048575;
        switch (zzA(zzB)) {
            case 0:
                return Double.doubleToRawLongBits(zzmv.zza(obj, j3)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzmv.zzb(obj, j3)) != 0;
            case 2:
                return zzmv.zzd(obj, j3) != 0;
            case 3:
                return zzmv.zzd(obj, j3) != 0;
            case 4:
                return zzmv.zzc(obj, j3) != 0;
            case 5:
                return zzmv.zzd(obj, j3) != 0;
            case 6:
                return zzmv.zzc(obj, j3) != 0;
            case 7:
                return zzmv.zzw(obj, j3);
            case 8:
                Object zzf = zzmv.zzf(obj, j3);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzjb) {
                    return !zzjb.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzmv.zzf(obj, j3) != null;
            case 10:
                return !zzjb.zzb.equals(zzmv.zzf(obj, j3));
            case 11:
                return zzmv.zzc(obj, j3) != 0;
            case 12:
                return zzmv.zzc(obj, j3) != 0;
            case 13:
                return zzmv.zzc(obj, j3) != 0;
            case 14:
                return zzmv.zzd(obj, j3) != 0;
            case 15:
                return zzmv.zzc(obj, j3) != 0;
            case 16:
                return zzmv.zzd(obj, j3) != 0;
            case 17:
                return zzmv.zzf(obj, j3) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzP(Object obj, int i7, int i8, int i9, int i10) {
        return i8 == 1048575 ? zzO(obj, i7) : (i9 & i10) != 0;
    }

    private static boolean zzQ(Object obj, int i7, zzlu zzluVar) {
        return zzluVar.zzk(zzmv.zzf(obj, i7 & 1048575));
    }

    private final boolean zzR(Object obj, int i7, int i8) {
        return zzmv.zzc(obj, (long) (zzy(i8) & 1048575)) == i7;
    }

    private static boolean zzS(Object obj, long j) {
        return ((Boolean) zzmv.zzf(obj, j)).booleanValue();
    }

    private static final void zzT(int i7, Object obj, zznd zzndVar) {
        if (obj instanceof String) {
            zzndVar.zzF(i7, (String) obj);
        } else {
            zzndVar.zzd(i7, (zzjb) obj);
        }
    }

    public static zzmm zzd(Object obj) {
        zzkc zzkcVar = (zzkc) obj;
        zzmm zzmmVar = zzkcVar.zzc;
        if (zzmmVar != zzmm.zzc()) {
            return zzmmVar;
        }
        zzmm zze = zzmm.zze();
        zzkcVar.zzc = zze;
        return zze;
    }

    public static zzlm zzl(Class cls, zzlg zzlgVar, zzlo zzloVar, zzkx zzkxVar, zzml zzmlVar, zzjp zzjpVar, zzle zzleVar) {
        if (zzlgVar instanceof zzlt) {
            return zzm((zzlt) zzlgVar, zzloVar, zzkxVar, zzmlVar, zzjpVar, zzleVar);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0265  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzlm zzm(zzlt zzltVar, zzlo zzloVar, zzkx zzkxVar, zzml zzmlVar, zzjp zzjpVar, zzle zzleVar) {
        int i7;
        int charAt;
        int charAt2;
        int charAt3;
        int[] iArr;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        char charAt4;
        int i13;
        char charAt5;
        int i14;
        char charAt6;
        int i15;
        char charAt7;
        int i16;
        char charAt8;
        int i17;
        char charAt9;
        int i18;
        char charAt10;
        int i19;
        char charAt11;
        int i20;
        int i21;
        int i22;
        int[] iArr2;
        int i23;
        int i24;
        int i25;
        int objectFieldOffset;
        int i26;
        Object[] objArr;
        int i27;
        int i28;
        int i29;
        Field zzG;
        char charAt12;
        int i30;
        int i31;
        int i32;
        Object obj;
        Field zzG2;
        Object obj2;
        Field zzG3;
        int i33;
        char charAt13;
        int i34;
        char charAt14;
        int i35;
        char charAt15;
        int i36;
        char charAt16;
        boolean z4 = zzltVar.zzc() == 2;
        String zzd = zzltVar.zzd();
        int length = zzd.length();
        char c3 = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i37 = 1;
            while (true) {
                i7 = i37 + 1;
                if (zzd.charAt(i37) < 55296) {
                    break;
                }
                i37 = i7;
            }
        } else {
            i7 = 1;
        }
        int i38 = i7 + 1;
        int charAt17 = zzd.charAt(i7);
        if (charAt17 >= 55296) {
            int i39 = charAt17 & 8191;
            int i40 = 13;
            while (true) {
                i36 = i38 + 1;
                charAt16 = zzd.charAt(i38);
                if (charAt16 < 55296) {
                    break;
                }
                i39 |= (charAt16 & 8191) << i40;
                i40 += 13;
                i38 = i36;
            }
            charAt17 = i39 | (charAt16 << i40);
            i38 = i36;
        }
        if (charAt17 == 0) {
            charAt = 0;
            i11 = 0;
            charAt2 = 0;
            i10 = 0;
            charAt3 = 0;
            i8 = 0;
            iArr = zza;
            i9 = 0;
        } else {
            int i41 = i38 + 1;
            int charAt18 = zzd.charAt(i38);
            if (charAt18 >= 55296) {
                int i42 = charAt18 & 8191;
                int i43 = 13;
                while (true) {
                    i19 = i41 + 1;
                    charAt11 = zzd.charAt(i41);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i42 |= (charAt11 & 8191) << i43;
                    i43 += 13;
                    i41 = i19;
                }
                charAt18 = i42 | (charAt11 << i43);
                i41 = i19;
            }
            int i44 = i41 + 1;
            int charAt19 = zzd.charAt(i41);
            if (charAt19 >= 55296) {
                int i45 = charAt19 & 8191;
                int i46 = 13;
                while (true) {
                    i18 = i44 + 1;
                    charAt10 = zzd.charAt(i44);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i45 |= (charAt10 & 8191) << i46;
                    i46 += 13;
                    i44 = i18;
                }
                charAt19 = i45 | (charAt10 << i46);
                i44 = i18;
            }
            int i47 = i44 + 1;
            charAt = zzd.charAt(i44);
            if (charAt >= 55296) {
                int i48 = charAt & 8191;
                int i49 = 13;
                while (true) {
                    i17 = i47 + 1;
                    charAt9 = zzd.charAt(i47);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i48 |= (charAt9 & 8191) << i49;
                    i49 += 13;
                    i47 = i17;
                }
                charAt = i48 | (charAt9 << i49);
                i47 = i17;
            }
            int i50 = i47 + 1;
            int charAt20 = zzd.charAt(i47);
            if (charAt20 >= 55296) {
                int i51 = charAt20 & 8191;
                int i52 = 13;
                while (true) {
                    i16 = i50 + 1;
                    charAt8 = zzd.charAt(i50);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i51 |= (charAt8 & 8191) << i52;
                    i52 += 13;
                    i50 = i16;
                }
                charAt20 = i51 | (charAt8 << i52);
                i50 = i16;
            }
            int i53 = i50 + 1;
            charAt2 = zzd.charAt(i50);
            if (charAt2 >= 55296) {
                int i54 = charAt2 & 8191;
                int i55 = 13;
                while (true) {
                    i15 = i53 + 1;
                    charAt7 = zzd.charAt(i53);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i54 |= (charAt7 & 8191) << i55;
                    i55 += 13;
                    i53 = i15;
                }
                charAt2 = i54 | (charAt7 << i55);
                i53 = i15;
            }
            int i56 = i53 + 1;
            int charAt21 = zzd.charAt(i53);
            if (charAt21 >= 55296) {
                int i57 = charAt21 & 8191;
                int i58 = 13;
                while (true) {
                    i14 = i56 + 1;
                    charAt6 = zzd.charAt(i56);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i57 |= (charAt6 & 8191) << i58;
                    i58 += 13;
                    i56 = i14;
                }
                charAt21 = i57 | (charAt6 << i58);
                i56 = i14;
            }
            int i59 = i56 + 1;
            int charAt22 = zzd.charAt(i56);
            if (charAt22 >= 55296) {
                int i60 = charAt22 & 8191;
                int i61 = 13;
                while (true) {
                    i13 = i59 + 1;
                    charAt5 = zzd.charAt(i59);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i60 |= (charAt5 & 8191) << i61;
                    i61 += 13;
                    i59 = i13;
                }
                charAt22 = i60 | (charAt5 << i61);
                i59 = i13;
            }
            int i62 = i59 + 1;
            charAt3 = zzd.charAt(i59);
            if (charAt3 >= 55296) {
                int i63 = charAt3 & 8191;
                int i64 = 13;
                while (true) {
                    i12 = i62 + 1;
                    charAt4 = zzd.charAt(i62);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i63 |= (charAt4 & 8191) << i64;
                    i64 += 13;
                    i62 = i12;
                }
                charAt3 = i63 | (charAt4 << i64);
                i62 = i12;
            }
            iArr = new int[charAt3 + charAt21 + charAt22];
            i8 = charAt18 + charAt18 + charAt19;
            i9 = charAt18;
            i38 = i62;
            int i65 = charAt21;
            i10 = charAt20;
            i11 = i65;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzltVar.zze();
        Class<?> cls = zzltVar.zza().getClass();
        int[] iArr3 = new int[charAt2 * 3];
        Object[] objArr2 = new Object[charAt2 + charAt2];
        int i66 = charAt3 + i11;
        int i67 = charAt3;
        int i68 = i66;
        int i69 = 0;
        int i70 = 0;
        while (i38 < length) {
            int i71 = i38 + 1;
            int charAt23 = zzd.charAt(i38);
            if (charAt23 >= c3) {
                int i72 = charAt23 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i35 = i73 + 1;
                    charAt15 = zzd.charAt(i73);
                    if (charAt15 < c3) {
                        break;
                    }
                    i72 |= (charAt15 & 8191) << i74;
                    i74 += 13;
                    i73 = i35;
                }
                charAt23 = i72 | (charAt15 << i74);
                i20 = i35;
            } else {
                i20 = i71;
            }
            int i75 = i20 + 1;
            int charAt24 = zzd.charAt(i20);
            if (charAt24 >= c3) {
                int i76 = charAt24 & 8191;
                int i77 = i75;
                int i78 = 13;
                while (true) {
                    i34 = i77 + 1;
                    charAt14 = zzd.charAt(i77);
                    i21 = length;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i76 |= (charAt14 & 8191) << i78;
                    i78 += 13;
                    i77 = i34;
                    length = i21;
                }
                charAt24 = i76 | (charAt14 << i78);
                i22 = i34;
            } else {
                i21 = length;
                i22 = i75;
            }
            int i79 = charAt24 & 255;
            int i80 = charAt3;
            if ((charAt24 & 1024) != 0) {
                iArr[i70] = i69;
                i70++;
            }
            if (i79 >= 51) {
                int i81 = i22 + 1;
                int charAt25 = zzd.charAt(i22);
                if (charAt25 >= 55296) {
                    int i82 = charAt25 & 8191;
                    int i83 = i81;
                    int i84 = 13;
                    while (true) {
                        i33 = i83 + 1;
                        charAt13 = zzd.charAt(i83);
                        i24 = i10;
                        if (charAt13 < 55296) {
                            break;
                        }
                        i82 |= (charAt13 & 8191) << i84;
                        i84 += 13;
                        i83 = i33;
                        i10 = i24;
                    }
                    charAt25 = i82 | (charAt13 << i84);
                    i31 = i33;
                } else {
                    i24 = i10;
                    i31 = i81;
                }
                int i85 = i79 - 51;
                int i86 = i31;
                if (i85 == 9 || i85 == 17) {
                    int i87 = i69 / 3;
                    i32 = i8 + 1;
                    objArr2[i87 + i87 + 1] = zze[i8];
                } else {
                    if (i85 == 12 && !z4) {
                        int i88 = i69 / 3;
                        i32 = i8 + 1;
                        objArr2[i88 + i88 + 1] = zze[i8];
                    }
                    int i89 = charAt25 + charAt25;
                    obj = zze[i89];
                    if (obj instanceof Field) {
                        zzG2 = zzG(cls, (String) obj);
                        zze[i89] = zzG2;
                    } else {
                        zzG2 = (Field) obj;
                    }
                    iArr2 = iArr3;
                    i23 = charAt;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzG2);
                    int i90 = i89 + 1;
                    obj2 = zze[i90];
                    if (obj2 instanceof Field) {
                        zzG3 = zzG(cls, (String) obj2);
                        zze[i90] = zzG3;
                    } else {
                        zzG3 = (Field) obj2;
                    }
                    objArr = objArr2;
                    i27 = i8;
                    i28 = i86;
                    i26 = (int) unsafe.objectFieldOffset(zzG3);
                    objectFieldOffset = objectFieldOffset2;
                    i29 = 0;
                }
                i8 = i32;
                int i892 = charAt25 + charAt25;
                obj = zze[i892];
                if (obj instanceof Field) {
                }
                iArr2 = iArr3;
                i23 = charAt;
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zzG2);
                int i902 = i892 + 1;
                obj2 = zze[i902];
                if (obj2 instanceof Field) {
                }
                objArr = objArr2;
                i27 = i8;
                i28 = i86;
                i26 = (int) unsafe.objectFieldOffset(zzG3);
                objectFieldOffset = objectFieldOffset22;
                i29 = 0;
            } else {
                iArr2 = iArr3;
                i23 = charAt;
                i24 = i10;
                int i91 = i8 + 1;
                Field zzG4 = zzG(cls, (String) zze[i8]);
                if (i79 == 9 || i79 == 17) {
                    int i92 = i69 / 3;
                    objArr2[i92 + i92 + 1] = zzG4.getType();
                } else {
                    if (i79 == 27 || i79 == 49) {
                        int i93 = i69 / 3;
                        i30 = i8 + 2;
                        objArr2[i93 + i93 + 1] = zze[i91];
                    } else if (i79 == 12 || i79 == 30 || i79 == 44) {
                        if (!z4) {
                            int i94 = i69 / 3;
                            i30 = i8 + 2;
                            objArr2[i94 + i94 + 1] = zze[i91];
                        }
                    } else if (i79 == 50) {
                        int i95 = i67 + 1;
                        iArr[i67] = i69;
                        int i96 = i69 / 3;
                        int i97 = i96 + i96;
                        int i98 = i8 + 2;
                        objArr2[i97] = zze[i91];
                        if ((charAt24 & 2048) != 0) {
                            i91 = i8 + 3;
                            objArr2[i97 + 1] = zze[i98];
                            i67 = i95;
                        } else {
                            i67 = i95;
                            i25 = i98;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzG4);
                            i26 = 1048575;
                            objArr = objArr2;
                            if ((charAt24 & 4096) == 4096 || i79 > 17) {
                                i27 = i25;
                                i28 = i22;
                                i29 = 0;
                            } else {
                                int i99 = i22 + 1;
                                int charAt26 = zzd.charAt(i22);
                                if (charAt26 >= 55296) {
                                    int i100 = charAt26 & 8191;
                                    int i101 = 13;
                                    while (true) {
                                        i28 = i99 + 1;
                                        charAt12 = zzd.charAt(i99);
                                        if (charAt12 < 55296) {
                                            break;
                                        }
                                        i100 |= (charAt12 & 8191) << i101;
                                        i101 += 13;
                                        i99 = i28;
                                    }
                                    charAt26 = i100 | (charAt12 << i101);
                                } else {
                                    i28 = i99;
                                }
                                int i102 = (charAt26 / 32) + i9 + i9;
                                Object obj3 = zze[i102];
                                if (obj3 instanceof Field) {
                                    zzG = (Field) obj3;
                                } else {
                                    zzG = zzG(cls, (String) obj3);
                                    zze[i102] = zzG;
                                }
                                i27 = i25;
                                i29 = charAt26 % 32;
                                i26 = (int) unsafe.objectFieldOffset(zzG);
                            }
                            if (i79 >= 18 && i79 <= 49) {
                                iArr[i68] = objectFieldOffset;
                                i68++;
                            }
                        }
                    }
                    i25 = i30;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzG4);
                    i26 = 1048575;
                    objArr = objArr2;
                    if ((charAt24 & 4096) == 4096) {
                    }
                    i27 = i25;
                    i28 = i22;
                    i29 = 0;
                    if (i79 >= 18) {
                        iArr[i68] = objectFieldOffset;
                        i68++;
                    }
                }
                i25 = i91;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzG4);
                i26 = 1048575;
                objArr = objArr2;
                if ((charAt24 & 4096) == 4096) {
                }
                i27 = i25;
                i28 = i22;
                i29 = 0;
                if (i79 >= 18) {
                }
            }
            int i103 = i69 + 1;
            iArr2[i69] = charAt23;
            int i104 = i69 + 2;
            iArr2[i103] = ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | (i79 << 20) | objectFieldOffset;
            i69 += 3;
            iArr2[i104] = (i29 << 20) | i26;
            charAt = i23;
            charAt3 = i80;
            i38 = i28;
            length = i21;
            objArr2 = objArr;
            i8 = i27;
            iArr3 = iArr2;
            i10 = i24;
            c3 = 55296;
        }
        return new zzlm(iArr3, objArr2, charAt, i10, zzltVar.zza(), z4, false, iArr, charAt3, i66, zzloVar, zzkxVar, zzmlVar, zzjpVar, zzleVar, null);
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzmv.zzf(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzmv.zzf(obj, j)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zzp(Object obj) {
        int i7;
        int zzA;
        int zzB;
        int i8;
        int zzA2;
        int zzv;
        int zzo;
        int zzu;
        boolean z4;
        int zzd;
        int zzA3;
        int zzB2;
        int i9;
        int zzA4;
        int zzv2;
        Unsafe unsafe = zzb;
        int i10 = 1048575;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < this.zzc.length) {
            int zzB3 = zzB(i12);
            int[] iArr = this.zzc;
            int i15 = iArr[i12];
            int zzA5 = zzA(zzB3);
            if (zzA5 <= 17) {
                int i16 = iArr[i12 + 2];
                int i17 = i16 & i10;
                i7 = 1 << (i16 >>> 20);
                if (i17 != i11) {
                    i14 = unsafe.getInt(obj, i17);
                    i11 = i17;
                }
            } else {
                i7 = 0;
            }
            long j = zzB3 & i10;
            switch (zzA5) {
                case 0:
                    if ((i14 & i7) == 0) {
                        break;
                    } else {
                        i13 = AbstractC0486a1.p(i15 << 3, 8, i13);
                        break;
                    }
                case 1:
                    if ((i14 & i7) == 0) {
                        break;
                    } else {
                        i13 = AbstractC0486a1.p(i15 << 3, 4, i13);
                        break;
                    }
                case 2:
                    if ((i14 & i7) == 0) {
                        break;
                    } else {
                        long j3 = unsafe.getLong(obj, j);
                        zzA = zzjj.zzA(i15 << 3);
                        zzB = zzjj.zzB(j3);
                        i8 = zzB + zzA;
                        i13 += i8;
                        break;
                    }
                case 3:
                    if ((i14 & i7) == 0) {
                        break;
                    } else {
                        long j7 = unsafe.getLong(obj, j);
                        zzA = zzjj.zzA(i15 << 3);
                        zzB = zzjj.zzB(j7);
                        i8 = zzB + zzA;
                        i13 += i8;
                        break;
                    }
                case 4:
                    if ((i14 & i7) == 0) {
                        break;
                    } else {
                        int i18 = unsafe.getInt(obj, j);
                        zzA2 = zzjj.zzA(i15 << 3);
                        zzv = zzjj.zzv(i18);
                        i8 = zzv + zzA2;
                        i13 += i8;
                        break;
                    }
                case 5:
                    if ((i14 & i7) == 0) {
                        break;
                    } else {
                        i13 = AbstractC0486a1.p(i15 << 3, 8, i13);
                        break;
                    }
                case 6:
                    if ((i14 & i7) == 0) {
                        break;
                    } else {
                        i13 = AbstractC0486a1.p(i15 << 3, 4, i13);
                        break;
                    }
                case 7:
                    if ((i14 & i7) == 0) {
                        break;
                    } else {
                        i13 = AbstractC0486a1.p(i15 << 3, 1, i13);
                        break;
                    }
                case 8:
                    if ((i14 & i7) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j);
                        if (!(object instanceof zzjb)) {
                            zzA2 = zzjj.zzA(i15 << 3);
                            zzv = zzjj.zzy((String) object);
                            i8 = zzv + zzA2;
                            i13 += i8;
                            break;
                        } else {
                            int zzA6 = zzjj.zzA(i15 << 3);
                            int zzd2 = ((zzjb) object).zzd();
                            i13 = AbstractC0486a1.s(zzd2, zzd2, zzA6, i13);
                            break;
                        }
                    }
                case 9:
                    if ((i14 & i7) == 0) {
                        break;
                    } else {
                        zzo = zzlw.zzo(i15, unsafe.getObject(obj, j), zzE(i12));
                        i13 += zzo;
                        break;
                    }
                case 10:
                    if ((i14 & i7) == 0) {
                        break;
                    } else {
                        zzjb zzjbVar = (zzjb) unsafe.getObject(obj, j);
                        int zzA7 = zzjj.zzA(i15 << 3);
                        int zzd3 = zzjbVar.zzd();
                        i13 = AbstractC0486a1.s(zzd3, zzd3, zzA7, i13);
                        break;
                    }
                case 11:
                    if ((i14 & i7) == 0) {
                        break;
                    } else {
                        i13 = AbstractC0486a1.p(unsafe.getInt(obj, j), zzjj.zzA(i15 << 3), i13);
                        break;
                    }
                case 12:
                    if ((i14 & i7) == 0) {
                        break;
                    } else {
                        int i19 = unsafe.getInt(obj, j);
                        zzA2 = zzjj.zzA(i15 << 3);
                        zzv = zzjj.zzv(i19);
                        i8 = zzv + zzA2;
                        i13 += i8;
                        break;
                    }
                case 13:
                    if ((i14 & i7) == 0) {
                        break;
                    } else {
                        i13 = AbstractC0486a1.p(i15 << 3, 4, i13);
                        break;
                    }
                case 14:
                    if ((i14 & i7) == 0) {
                        break;
                    } else {
                        i13 = AbstractC0486a1.p(i15 << 3, 8, i13);
                        break;
                    }
                case 15:
                    if ((i14 & i7) == 0) {
                        break;
                    } else {
                        int i20 = unsafe.getInt(obj, j);
                        i13 = AbstractC0486a1.p((i20 >> 31) ^ (i20 + i20), zzjj.zzA(i15 << 3), i13);
                        break;
                    }
                case 16:
                    if ((i7 & i14) == 0) {
                        break;
                    } else {
                        long j8 = unsafe.getLong(obj, j);
                        i8 = zzjj.zzB((j8 >> 63) ^ (j8 + j8)) + zzjj.zzA(i15 << 3);
                        i13 += i8;
                        break;
                    }
                case 17:
                    if ((i14 & i7) == 0) {
                        break;
                    } else {
                        i8 = zzjj.zzu(i15, (zzlj) unsafe.getObject(obj, j), zzE(i12));
                        i13 += i8;
                        break;
                    }
                case 18:
                    zzo = zzlw.zzh(i15, (List) unsafe.getObject(obj, j), false);
                    i13 += zzo;
                    break;
                case 19:
                    zzo = zzlw.zzf(i15, (List) unsafe.getObject(obj, j), false);
                    i13 += zzo;
                    break;
                case 20:
                    zzo = zzlw.zzm(i15, (List) unsafe.getObject(obj, j), false);
                    i13 += zzo;
                    break;
                case zzbbd.zzt.zzm /* 21 */:
                    zzo = zzlw.zzx(i15, (List) unsafe.getObject(obj, j), false);
                    i13 += zzo;
                    break;
                case 22:
                    zzo = zzlw.zzk(i15, (List) unsafe.getObject(obj, j), false);
                    i13 += zzo;
                    break;
                case 23:
                    zzo = zzlw.zzh(i15, (List) unsafe.getObject(obj, j), false);
                    i13 += zzo;
                    break;
                case 24:
                    zzo = zzlw.zzf(i15, (List) unsafe.getObject(obj, j), false);
                    i13 += zzo;
                    break;
                case 25:
                    zzo = zzlw.zza(i15, (List) unsafe.getObject(obj, j), false);
                    i13 += zzo;
                    break;
                case 26:
                    zzu = zzlw.zzu(i15, (List) unsafe.getObject(obj, j));
                    i13 += zzu;
                    break;
                case 27:
                    zzu = zzlw.zzp(i15, (List) unsafe.getObject(obj, j), zzE(i12));
                    i13 += zzu;
                    break;
                case 28:
                    zzu = zzlw.zzc(i15, (List) unsafe.getObject(obj, j));
                    i13 += zzu;
                    break;
                case 29:
                    zzu = zzlw.zzv(i15, (List) unsafe.getObject(obj, j), false);
                    i13 += zzu;
                    break;
                case 30:
                    z4 = false;
                    zzd = zzlw.zzd(i15, (List) unsafe.getObject(obj, j), false);
                    i13 += zzd;
                    break;
                case 31:
                    z4 = false;
                    zzd = zzlw.zzf(i15, (List) unsafe.getObject(obj, j), false);
                    i13 += zzd;
                    break;
                case 32:
                    z4 = false;
                    zzd = zzlw.zzh(i15, (List) unsafe.getObject(obj, j), false);
                    i13 += zzd;
                    break;
                case 33:
                    z4 = false;
                    zzd = zzlw.zzq(i15, (List) unsafe.getObject(obj, j), false);
                    i13 += zzd;
                    break;
                case 34:
                    z4 = false;
                    zzd = zzlw.zzs(i15, (List) unsafe.getObject(obj, j), false);
                    i13 += zzd;
                    break;
                case 35:
                    int zzi = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        i13 = AbstractC0486a1.s(zzi, zzjj.zzz(i15), zzi, i13);
                    }
                    break;
                case 36:
                    int zzg = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (zzg > 0) {
                        i13 = AbstractC0486a1.s(zzg, zzjj.zzz(i15), zzg, i13);
                    }
                    break;
                case 37:
                    int zzn = zzlw.zzn((List) unsafe.getObject(obj, j));
                    if (zzn > 0) {
                        i13 = AbstractC0486a1.s(zzn, zzjj.zzz(i15), zzn, i13);
                    }
                    break;
                case 38:
                    int zzy = zzlw.zzy((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        i13 = AbstractC0486a1.s(zzy, zzjj.zzz(i15), zzy, i13);
                    }
                    break;
                case 39:
                    int zzl = zzlw.zzl((List) unsafe.getObject(obj, j));
                    if (zzl > 0) {
                        i13 = AbstractC0486a1.s(zzl, zzjj.zzz(i15), zzl, i13);
                    }
                    break;
                case 40:
                    int zzi2 = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (zzi2 > 0) {
                        i13 = AbstractC0486a1.s(zzi2, zzjj.zzz(i15), zzi2, i13);
                    }
                    break;
                case 41:
                    int zzg2 = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (zzg2 > 0) {
                        i13 = AbstractC0486a1.s(zzg2, zzjj.zzz(i15), zzg2, i13);
                    }
                    break;
                case 42:
                    int zzb2 = zzlw.zzb((List) unsafe.getObject(obj, j));
                    if (zzb2 > 0) {
                        i13 = AbstractC0486a1.s(zzb2, zzjj.zzz(i15), zzb2, i13);
                    }
                    break;
                case 43:
                    int zzw = zzlw.zzw((List) unsafe.getObject(obj, j));
                    if (zzw > 0) {
                        i13 = AbstractC0486a1.s(zzw, zzjj.zzz(i15), zzw, i13);
                    }
                    break;
                case 44:
                    int zze = zzlw.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        i13 = AbstractC0486a1.s(zze, zzjj.zzz(i15), zze, i13);
                    }
                    break;
                case 45:
                    int zzg3 = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (zzg3 > 0) {
                        i13 = AbstractC0486a1.s(zzg3, zzjj.zzz(i15), zzg3, i13);
                    }
                    break;
                case 46:
                    int zzi3 = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (zzi3 > 0) {
                        i13 = AbstractC0486a1.s(zzi3, zzjj.zzz(i15), zzi3, i13);
                    }
                    break;
                case 47:
                    int zzr = zzlw.zzr((List) unsafe.getObject(obj, j));
                    if (zzr > 0) {
                        i13 = AbstractC0486a1.s(zzr, zzjj.zzz(i15), zzr, i13);
                    }
                    break;
                case 48:
                    int zzt = zzlw.zzt((List) unsafe.getObject(obj, j));
                    if (zzt > 0) {
                        i13 = AbstractC0486a1.s(zzt, zzjj.zzz(i15), zzt, i13);
                    }
                    break;
                case 49:
                    zzu = zzlw.zzj(i15, (List) unsafe.getObject(obj, j), zzE(i12));
                    i13 += zzu;
                    break;
                case 50:
                    zzle.zza(i15, unsafe.getObject(obj, j), zzF(i12));
                    break;
                case 51:
                    if (zzR(obj, i15, i12)) {
                        i13 = AbstractC0486a1.p(i15 << 3, 8, i13);
                    }
                    break;
                case 52:
                    if (zzR(obj, i15, i12)) {
                        i13 = AbstractC0486a1.p(i15 << 3, 4, i13);
                    }
                    break;
                case 53:
                    if (zzR(obj, i15, i12)) {
                        long zzC = zzC(obj, j);
                        zzA3 = zzjj.zzA(i15 << 3);
                        zzB2 = zzjj.zzB(zzC);
                        i9 = zzB2 + zzA3;
                        i13 += i9;
                    }
                    break;
                case 54:
                    if (zzR(obj, i15, i12)) {
                        long zzC2 = zzC(obj, j);
                        zzA3 = zzjj.zzA(i15 << 3);
                        zzB2 = zzjj.zzB(zzC2);
                        i9 = zzB2 + zzA3;
                        i13 += i9;
                    }
                    break;
                case 55:
                    if (zzR(obj, i15, i12)) {
                        int zzr2 = zzr(obj, j);
                        zzA4 = zzjj.zzA(i15 << 3);
                        zzv2 = zzjj.zzv(zzr2);
                        i9 = zzv2 + zzA4;
                        i13 += i9;
                    }
                    break;
                case 56:
                    if (zzR(obj, i15, i12)) {
                        i13 = AbstractC0486a1.p(i15 << 3, 8, i13);
                    }
                    break;
                case 57:
                    if (zzR(obj, i15, i12)) {
                        i13 = AbstractC0486a1.p(i15 << 3, 4, i13);
                    }
                    break;
                case 58:
                    if (zzR(obj, i15, i12)) {
                        i13 = AbstractC0486a1.p(i15 << 3, 1, i13);
                    }
                    break;
                case 59:
                    if (zzR(obj, i15, i12)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzjb) {
                            int zzA8 = zzjj.zzA(i15 << 3);
                            int zzd4 = ((zzjb) object2).zzd();
                            i13 = AbstractC0486a1.s(zzd4, zzd4, zzA8, i13);
                        } else {
                            zzA4 = zzjj.zzA(i15 << 3);
                            zzv2 = zzjj.zzy((String) object2);
                            i9 = zzv2 + zzA4;
                            i13 += i9;
                        }
                    }
                    break;
                case 60:
                    if (zzR(obj, i15, i12)) {
                        zzu = zzlw.zzo(i15, unsafe.getObject(obj, j), zzE(i12));
                        i13 += zzu;
                    }
                    break;
                case 61:
                    if (zzR(obj, i15, i12)) {
                        zzjb zzjbVar2 = (zzjb) unsafe.getObject(obj, j);
                        int zzA9 = zzjj.zzA(i15 << 3);
                        int zzd5 = zzjbVar2.zzd();
                        i13 = AbstractC0486a1.s(zzd5, zzd5, zzA9, i13);
                    }
                    break;
                case 62:
                    if (zzR(obj, i15, i12)) {
                        i13 = AbstractC0486a1.p(zzr(obj, j), zzjj.zzA(i15 << 3), i13);
                    }
                    break;
                case 63:
                    if (zzR(obj, i15, i12)) {
                        int zzr3 = zzr(obj, j);
                        zzA4 = zzjj.zzA(i15 << 3);
                        zzv2 = zzjj.zzv(zzr3);
                        i9 = zzv2 + zzA4;
                        i13 += i9;
                    }
                    break;
                case 64:
                    if (zzR(obj, i15, i12)) {
                        i13 = AbstractC0486a1.p(i15 << 3, 4, i13);
                    }
                    break;
                case 65:
                    if (zzR(obj, i15, i12)) {
                        i13 = AbstractC0486a1.p(i15 << 3, 8, i13);
                    }
                    break;
                case 66:
                    if (zzR(obj, i15, i12)) {
                        int zzr4 = zzr(obj, j);
                        i13 = AbstractC0486a1.p((zzr4 >> 31) ^ (zzr4 + zzr4), zzjj.zzA(i15 << 3), i13);
                    }
                    break;
                case 67:
                    if (zzR(obj, i15, i12)) {
                        long zzC3 = zzC(obj, j);
                        i9 = zzjj.zzB((zzC3 >> 63) ^ (zzC3 + zzC3)) + zzjj.zzA(i15 << 3);
                        i13 += i9;
                    }
                    break;
                case 68:
                    if (zzR(obj, i15, i12)) {
                        i9 = zzjj.zzu(i15, (zzlj) unsafe.getObject(obj, j), zzE(i12));
                        i13 += i9;
                    }
                    break;
            }
            i12 += 3;
            i10 = 1048575;
        }
        zzml zzmlVar = this.zzn;
        int zza2 = i13 + zzmlVar.zza(zzmlVar.zzc(obj));
        if (!this.zzh) {
            return zza2;
        }
        this.zzo.zza(obj);
        throw null;
    }

    private final int zzq(Object obj) {
        int zzA;
        int zzB;
        int zzA2;
        int zzv;
        int zzo;
        int zzu;
        Unsafe unsafe = zzb;
        int i7 = 0;
        for (int i8 = 0; i8 < this.zzc.length; i8 += 3) {
            int zzB2 = zzB(i8);
            int zzA3 = zzA(zzB2);
            int i9 = this.zzc[i8];
            long j = zzB2 & 1048575;
            if (zzA3 >= zzju.zzJ.zza() && zzA3 <= zzju.zzW.zza()) {
                int i10 = this.zzc[i8 + 2];
            }
            switch (zzA3) {
                case 0:
                    if (zzO(obj, i8)) {
                        i7 = AbstractC0486a1.p(i9 << 3, 8, i7);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(obj, i8)) {
                        i7 = AbstractC0486a1.p(i9 << 3, 4, i7);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(obj, i8)) {
                        long zzd = zzmv.zzd(obj, j);
                        zzA = zzjj.zzA(i9 << 3);
                        zzB = zzjj.zzB(zzd);
                        zzu = zzB + zzA;
                        i7 += zzu;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(obj, i8)) {
                        long zzd2 = zzmv.zzd(obj, j);
                        zzA = zzjj.zzA(i9 << 3);
                        zzB = zzjj.zzB(zzd2);
                        zzu = zzB + zzA;
                        i7 += zzu;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(obj, i8)) {
                        int zzc = zzmv.zzc(obj, j);
                        zzA2 = zzjj.zzA(i9 << 3);
                        zzv = zzjj.zzv(zzc);
                        zzu = zzv + zzA2;
                        i7 += zzu;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(obj, i8)) {
                        i7 = AbstractC0486a1.p(i9 << 3, 8, i7);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(obj, i8)) {
                        i7 = AbstractC0486a1.p(i9 << 3, 4, i7);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(obj, i8)) {
                        i7 = AbstractC0486a1.p(i9 << 3, 1, i7);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzO(obj, i8)) {
                        Object zzf = zzmv.zzf(obj, j);
                        if (zzf instanceof zzjb) {
                            int zzA4 = zzjj.zzA(i9 << 3);
                            int zzd3 = ((zzjb) zzf).zzd();
                            i7 = AbstractC0486a1.s(zzd3, zzd3, zzA4, i7);
                            break;
                        } else {
                            zzA2 = zzjj.zzA(i9 << 3);
                            zzv = zzjj.zzy((String) zzf);
                            zzu = zzv + zzA2;
                            i7 += zzu;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (zzO(obj, i8)) {
                        zzo = zzlw.zzo(i9, zzmv.zzf(obj, j), zzE(i8));
                        i7 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzO(obj, i8)) {
                        zzjb zzjbVar = (zzjb) zzmv.zzf(obj, j);
                        int zzA5 = zzjj.zzA(i9 << 3);
                        int zzd4 = zzjbVar.zzd();
                        i7 = AbstractC0486a1.s(zzd4, zzd4, zzA5, i7);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(obj, i8)) {
                        i7 = AbstractC0486a1.p(zzmv.zzc(obj, j), zzjj.zzA(i9 << 3), i7);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzO(obj, i8)) {
                        int zzc2 = zzmv.zzc(obj, j);
                        zzA2 = zzjj.zzA(i9 << 3);
                        zzv = zzjj.zzv(zzc2);
                        zzu = zzv + zzA2;
                        i7 += zzu;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(obj, i8)) {
                        i7 = AbstractC0486a1.p(i9 << 3, 4, i7);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(obj, i8)) {
                        i7 = AbstractC0486a1.p(i9 << 3, 8, i7);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(obj, i8)) {
                        int zzc3 = zzmv.zzc(obj, j);
                        i7 = AbstractC0486a1.p((zzc3 >> 31) ^ (zzc3 + zzc3), zzjj.zzA(i9 << 3), i7);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzO(obj, i8)) {
                        long zzd5 = zzmv.zzd(obj, j);
                        zzA = zzjj.zzA(i9 << 3);
                        zzB = zzjj.zzB((zzd5 >> 63) ^ (zzd5 + zzd5));
                        zzu = zzB + zzA;
                        i7 += zzu;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzO(obj, i8)) {
                        zzu = zzjj.zzu(i9, (zzlj) zzmv.zzf(obj, j), zzE(i8));
                        i7 += zzu;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzo = zzlw.zzh(i9, (List) zzmv.zzf(obj, j), false);
                    i7 += zzo;
                    break;
                case 19:
                    zzo = zzlw.zzf(i9, (List) zzmv.zzf(obj, j), false);
                    i7 += zzo;
                    break;
                case 20:
                    zzo = zzlw.zzm(i9, (List) zzmv.zzf(obj, j), false);
                    i7 += zzo;
                    break;
                case zzbbd.zzt.zzm /* 21 */:
                    zzo = zzlw.zzx(i9, (List) zzmv.zzf(obj, j), false);
                    i7 += zzo;
                    break;
                case 22:
                    zzo = zzlw.zzk(i9, (List) zzmv.zzf(obj, j), false);
                    i7 += zzo;
                    break;
                case 23:
                    zzo = zzlw.zzh(i9, (List) zzmv.zzf(obj, j), false);
                    i7 += zzo;
                    break;
                case 24:
                    zzo = zzlw.zzf(i9, (List) zzmv.zzf(obj, j), false);
                    i7 += zzo;
                    break;
                case 25:
                    zzo = zzlw.zza(i9, (List) zzmv.zzf(obj, j), false);
                    i7 += zzo;
                    break;
                case 26:
                    zzo = zzlw.zzu(i9, (List) zzmv.zzf(obj, j));
                    i7 += zzo;
                    break;
                case 27:
                    zzo = zzlw.zzp(i9, (List) zzmv.zzf(obj, j), zzE(i8));
                    i7 += zzo;
                    break;
                case 28:
                    zzo = zzlw.zzc(i9, (List) zzmv.zzf(obj, j));
                    i7 += zzo;
                    break;
                case 29:
                    zzo = zzlw.zzv(i9, (List) zzmv.zzf(obj, j), false);
                    i7 += zzo;
                    break;
                case 30:
                    zzo = zzlw.zzd(i9, (List) zzmv.zzf(obj, j), false);
                    i7 += zzo;
                    break;
                case 31:
                    zzo = zzlw.zzf(i9, (List) zzmv.zzf(obj, j), false);
                    i7 += zzo;
                    break;
                case 32:
                    zzo = zzlw.zzh(i9, (List) zzmv.zzf(obj, j), false);
                    i7 += zzo;
                    break;
                case 33:
                    zzo = zzlw.zzq(i9, (List) zzmv.zzf(obj, j), false);
                    i7 += zzo;
                    break;
                case 34:
                    zzo = zzlw.zzs(i9, (List) zzmv.zzf(obj, j), false);
                    i7 += zzo;
                    break;
                case 35:
                    int zzi = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        i7 = AbstractC0486a1.s(zzi, zzjj.zzz(i9), zzi, i7);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int zzg = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (zzg > 0) {
                        i7 = AbstractC0486a1.s(zzg, zzjj.zzz(i9), zzg, i7);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int zzn = zzlw.zzn((List) unsafe.getObject(obj, j));
                    if (zzn > 0) {
                        i7 = AbstractC0486a1.s(zzn, zzjj.zzz(i9), zzn, i7);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int zzy = zzlw.zzy((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        i7 = AbstractC0486a1.s(zzy, zzjj.zzz(i9), zzy, i7);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int zzl = zzlw.zzl((List) unsafe.getObject(obj, j));
                    if (zzl > 0) {
                        i7 = AbstractC0486a1.s(zzl, zzjj.zzz(i9), zzl, i7);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int zzi2 = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (zzi2 > 0) {
                        i7 = AbstractC0486a1.s(zzi2, zzjj.zzz(i9), zzi2, i7);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int zzg2 = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (zzg2 > 0) {
                        i7 = AbstractC0486a1.s(zzg2, zzjj.zzz(i9), zzg2, i7);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    int zzb2 = zzlw.zzb((List) unsafe.getObject(obj, j));
                    if (zzb2 > 0) {
                        i7 = AbstractC0486a1.s(zzb2, zzjj.zzz(i9), zzb2, i7);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int zzw = zzlw.zzw((List) unsafe.getObject(obj, j));
                    if (zzw > 0) {
                        i7 = AbstractC0486a1.s(zzw, zzjj.zzz(i9), zzw, i7);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int zze = zzlw.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        i7 = AbstractC0486a1.s(zze, zzjj.zzz(i9), zze, i7);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    int zzg3 = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (zzg3 > 0) {
                        i7 = AbstractC0486a1.s(zzg3, zzjj.zzz(i9), zzg3, i7);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int zzi3 = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (zzi3 > 0) {
                        i7 = AbstractC0486a1.s(zzi3, zzjj.zzz(i9), zzi3, i7);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int zzr = zzlw.zzr((List) unsafe.getObject(obj, j));
                    if (zzr > 0) {
                        i7 = AbstractC0486a1.s(zzr, zzjj.zzz(i9), zzr, i7);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int zzt = zzlw.zzt((List) unsafe.getObject(obj, j));
                    if (zzt > 0) {
                        i7 = AbstractC0486a1.s(zzt, zzjj.zzz(i9), zzt, i7);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    zzo = zzlw.zzj(i9, (List) zzmv.zzf(obj, j), zzE(i8));
                    i7 += zzo;
                    break;
                case 50:
                    zzle.zza(i9, zzmv.zzf(obj, j), zzF(i8));
                    break;
                case 51:
                    if (zzR(obj, i9, i8)) {
                        i7 = AbstractC0486a1.p(i9 << 3, 8, i7);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i9, i8)) {
                        i7 = AbstractC0486a1.p(i9 << 3, 4, i7);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i9, i8)) {
                        long zzC = zzC(obj, j);
                        zzA = zzjj.zzA(i9 << 3);
                        zzB = zzjj.zzB(zzC);
                        zzu = zzB + zzA;
                        i7 += zzu;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i9, i8)) {
                        long zzC2 = zzC(obj, j);
                        zzA = zzjj.zzA(i9 << 3);
                        zzB = zzjj.zzB(zzC2);
                        zzu = zzB + zzA;
                        i7 += zzu;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i9, i8)) {
                        int zzr2 = zzr(obj, j);
                        zzA2 = zzjj.zzA(i9 << 3);
                        zzv = zzjj.zzv(zzr2);
                        zzu = zzv + zzA2;
                        i7 += zzu;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i9, i8)) {
                        i7 = AbstractC0486a1.p(i9 << 3, 8, i7);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i9, i8)) {
                        i7 = AbstractC0486a1.p(i9 << 3, 4, i7);
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i9, i8)) {
                        i7 = AbstractC0486a1.p(i9 << 3, 1, i7);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i9, i8)) {
                        Object zzf2 = zzmv.zzf(obj, j);
                        if (zzf2 instanceof zzjb) {
                            int zzA6 = zzjj.zzA(i9 << 3);
                            int zzd6 = ((zzjb) zzf2).zzd();
                            i7 = AbstractC0486a1.s(zzd6, zzd6, zzA6, i7);
                            break;
                        } else {
                            zzA2 = zzjj.zzA(i9 << 3);
                            zzv = zzjj.zzy((String) zzf2);
                            zzu = zzv + zzA2;
                            i7 += zzu;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i9, i8)) {
                        zzo = zzlw.zzo(i9, zzmv.zzf(obj, j), zzE(i8));
                        i7 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i9, i8)) {
                        zzjb zzjbVar2 = (zzjb) zzmv.zzf(obj, j);
                        int zzA7 = zzjj.zzA(i9 << 3);
                        int zzd7 = zzjbVar2.zzd();
                        i7 = AbstractC0486a1.s(zzd7, zzd7, zzA7, i7);
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i9, i8)) {
                        i7 = AbstractC0486a1.p(zzr(obj, j), zzjj.zzA(i9 << 3), i7);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i9, i8)) {
                        int zzr3 = zzr(obj, j);
                        zzA2 = zzjj.zzA(i9 << 3);
                        zzv = zzjj.zzv(zzr3);
                        zzu = zzv + zzA2;
                        i7 += zzu;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i9, i8)) {
                        i7 = AbstractC0486a1.p(i9 << 3, 4, i7);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i9, i8)) {
                        i7 = AbstractC0486a1.p(i9 << 3, 8, i7);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i9, i8)) {
                        int zzr4 = zzr(obj, j);
                        i7 = AbstractC0486a1.p((zzr4 >> 31) ^ (zzr4 + zzr4), zzjj.zzA(i9 << 3), i7);
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i9, i8)) {
                        long zzC3 = zzC(obj, j);
                        zzA = zzjj.zzA(i9 << 3);
                        zzB = zzjj.zzB((zzC3 >> 63) ^ (zzC3 + zzC3));
                        zzu = zzB + zzA;
                        i7 += zzu;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i9, i8)) {
                        zzu = zzjj.zzu(i9, (zzlj) zzmv.zzf(obj, j), zzE(i8));
                        i7 += zzu;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzml zzmlVar = this.zzn;
        return i7 + zzmlVar.zza(zzmlVar.zzc(obj));
    }

    private static int zzr(Object obj, long j) {
        return ((Integer) zzmv.zzf(obj, j)).intValue();
    }

    private final int zzs(Object obj, byte[] bArr, int i7, int i8, int i9, long j, zzio zzioVar) {
        Unsafe unsafe = zzb;
        Object zzF = zzF(i9);
        Object object = unsafe.getObject(obj, j);
        if (!((zzld) object).zze()) {
            zzld zzb2 = zzld.zza().zzb();
            zzle.zzb(zzb2, object);
            unsafe.putObject(obj, j, zzb2);
        }
        throw null;
    }

    private final int zzt(Object obj, byte[] bArr, int i7, int i8, int i9, int i10, int i11, int i12, int i13, long j, int i14, zzio zzioVar) {
        Unsafe unsafe = zzb;
        long j3 = this.zzc[i14 + 2] & 1048575;
        switch (i13) {
            case 51:
                if (i11 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzip.zzn(bArr, i7))));
                    unsafe.putInt(obj, j3, i10);
                    return i7 + 8;
                }
                break;
            case 52:
                if (i11 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzip.zzb(bArr, i7))));
                    unsafe.putInt(obj, j3, i10);
                    return i7 + 4;
                }
                break;
            case 53:
            case 54:
                if (i11 == 0) {
                    int zzm = zzip.zzm(bArr, i7, zzioVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzioVar.zzb));
                    unsafe.putInt(obj, j3, i10);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i11 == 0) {
                    int zzj = zzip.zzj(bArr, i7, zzioVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzioVar.zza));
                    unsafe.putInt(obj, j3, i10);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i11 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(zzip.zzn(bArr, i7)));
                    unsafe.putInt(obj, j3, i10);
                    return i7 + 8;
                }
                break;
            case 57:
            case 64:
                if (i11 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(zzip.zzb(bArr, i7)));
                    unsafe.putInt(obj, j3, i10);
                    return i7 + 4;
                }
                break;
            case 58:
                if (i11 == 0) {
                    int zzm2 = zzip.zzm(bArr, i7, zzioVar);
                    unsafe.putObject(obj, j, Boolean.valueOf(zzioVar.zzb != 0));
                    unsafe.putInt(obj, j3, i10);
                    return zzm2;
                }
                break;
            case 59:
                if (i11 == 2) {
                    int zzj2 = zzip.zzj(bArr, i7, zzioVar);
                    int i15 = zzioVar.zza;
                    if (i15 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else {
                        if ((i12 & 536870912) != 0 && !zzna.zzf(bArr, zzj2, zzj2 + i15)) {
                            throw zzkm.zzc();
                        }
                        unsafe.putObject(obj, j, new String(bArr, zzj2, i15, zzkk.zzb));
                        zzj2 += i15;
                    }
                    unsafe.putInt(obj, j3, i10);
                    return zzj2;
                }
                break;
            case 60:
                if (i11 == 2) {
                    int zzd = zzip.zzd(zzE(i14), bArr, i7, i8, zzioVar);
                    Object object = unsafe.getInt(obj, j3) == i10 ? unsafe.getObject(obj, j) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j, zzioVar.zzc);
                    } else {
                        unsafe.putObject(obj, j, zzkk.zzg(object, zzioVar.zzc));
                    }
                    unsafe.putInt(obj, j3, i10);
                    return zzd;
                }
                break;
            case 61:
                if (i11 == 2) {
                    int zza2 = zzip.zza(bArr, i7, zzioVar);
                    unsafe.putObject(obj, j, zzioVar.zzc);
                    unsafe.putInt(obj, j3, i10);
                    return zza2;
                }
                break;
            case 63:
                if (i11 == 0) {
                    int zzj3 = zzip.zzj(bArr, i7, zzioVar);
                    int i16 = zzioVar.zza;
                    zzkg zzD = zzD(i14);
                    if (zzD == null || zzD.zza(i16)) {
                        unsafe.putObject(obj, j, Integer.valueOf(i16));
                        unsafe.putInt(obj, j3, i10);
                    } else {
                        zzd(obj).zzh(i9, Long.valueOf(i16));
                    }
                    return zzj3;
                }
                break;
            case 66:
                if (i11 == 0) {
                    int zzj4 = zzip.zzj(bArr, i7, zzioVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzjf.zzb(zzioVar.zza)));
                    unsafe.putInt(obj, j3, i10);
                    return zzj4;
                }
                break;
            case 67:
                if (i11 == 0) {
                    int zzm3 = zzip.zzm(bArr, i7, zzioVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzjf.zzc(zzioVar.zzb)));
                    unsafe.putInt(obj, j3, i10);
                    return zzm3;
                }
                break;
            case 68:
                if (i11 == 3) {
                    int zzc = zzip.zzc(zzE(i14), bArr, i7, i8, (i9 & (-8)) | 4, zzioVar);
                    Object object2 = unsafe.getInt(obj, j3) == i10 ? unsafe.getObject(obj, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j, zzioVar.zzc);
                    } else {
                        unsafe.putObject(obj, j, zzkk.zzg(object2, zzioVar.zzc));
                    }
                    unsafe.putInt(obj, j3, i10);
                    return zzc;
                }
                break;
        }
        return i7;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:68:0x0081. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v22, types: [int] */
    private final int zzu(Object obj, byte[] bArr, int i7, int i8, zzio zzioVar) {
        byte b7;
        int i9;
        int i10;
        int i11;
        int i12;
        Unsafe unsafe;
        int i13;
        int i14;
        int i15;
        int i16;
        int zzm;
        int zzd;
        int i17;
        int i18;
        int i19;
        zzlm<T> zzlmVar = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i20 = i8;
        zzio zzioVar2 = zzioVar;
        Unsafe unsafe2 = zzb;
        int i21 = 1048575;
        int i22 = -1;
        int i23 = i7;
        int i24 = -1;
        int i25 = 1048575;
        int i26 = 0;
        int i27 = 0;
        while (i23 < i20) {
            int i28 = i23 + 1;
            byte b8 = bArr2[i23];
            if (b8 < 0) {
                i9 = zzip.zzk(b8, bArr2, i28, zzioVar2);
                b7 = zzioVar2.zza;
            } else {
                b7 = b8;
                i9 = i28;
            }
            int i29 = b7 >>> 3;
            int i30 = b7 & 7;
            int zzx = i29 > i24 ? zzlmVar.zzx(i29, i26 / 3) : zzlmVar.zzw(i29);
            if (zzx == i22) {
                i10 = i9;
                i11 = i29;
                i12 = i22;
                unsafe = unsafe2;
                i13 = 0;
            } else {
                int[] iArr = zzlmVar.zzc;
                int i31 = iArr[zzx + 1];
                int zzA = zzA(i31);
                long j = i31 & i21;
                if (zzA <= 17) {
                    int i32 = iArr[zzx + 2];
                    int i33 = 1 << (i32 >>> 20);
                    int i34 = i32 & 1048575;
                    if (i34 != i25) {
                        if (i25 != 1048575) {
                            unsafe2.putInt(obj2, i25, i27);
                        }
                        if (i34 != 1048575) {
                            i27 = unsafe2.getInt(obj2, i34);
                        }
                        i25 = i34;
                    }
                    switch (zzA) {
                        case 0:
                            zzioVar2 = zzioVar;
                            i14 = zzx;
                            i15 = i9;
                            i16 = 1048575;
                            i11 = i29;
                            if (i30 != 1) {
                                i10 = i15;
                                unsafe = unsafe2;
                                i13 = i14;
                                i12 = -1;
                                break;
                            } else {
                                zzmv.zzo(obj2, j, Double.longBitsToDouble(zzip.zzn(bArr2, i15)));
                                i23 = i15 + 8;
                                i27 |= i33;
                                i26 = i14;
                                i24 = i11;
                                i21 = i16;
                                i22 = -1;
                                break;
                            }
                        case 1:
                            zzioVar2 = zzioVar;
                            i14 = zzx;
                            i15 = i9;
                            i16 = 1048575;
                            i11 = i29;
                            if (i30 != 5) {
                                i10 = i15;
                                unsafe = unsafe2;
                                i13 = i14;
                                i12 = -1;
                                break;
                            } else {
                                zzmv.zzp(obj2, j, Float.intBitsToFloat(zzip.zzb(bArr2, i15)));
                                i23 = i15 + 4;
                                i27 |= i33;
                                i26 = i14;
                                i24 = i11;
                                i21 = i16;
                                i22 = -1;
                                break;
                            }
                        case 2:
                        case 3:
                            zzioVar2 = zzioVar;
                            i14 = zzx;
                            i15 = i9;
                            i16 = 1048575;
                            i11 = i29;
                            if (i30 != 0) {
                                i10 = i15;
                                unsafe = unsafe2;
                                i13 = i14;
                                i12 = -1;
                                break;
                            } else {
                                zzm = zzip.zzm(bArr2, i15, zzioVar2);
                                unsafe2.putLong(obj, j, zzioVar2.zzb);
                                i27 |= i33;
                                i23 = zzm;
                                i26 = i14;
                                i24 = i11;
                                i21 = i16;
                                i22 = -1;
                                break;
                            }
                        case 4:
                        case 11:
                            zzioVar2 = zzioVar;
                            i14 = zzx;
                            i15 = i9;
                            i16 = 1048575;
                            i11 = i29;
                            if (i30 != 0) {
                                i10 = i15;
                                unsafe = unsafe2;
                                i13 = i14;
                                i12 = -1;
                                break;
                            } else {
                                i23 = zzip.zzj(bArr2, i15, zzioVar2);
                                unsafe2.putInt(obj2, j, zzioVar2.zza);
                                i27 |= i33;
                                i26 = i14;
                                i24 = i11;
                                i21 = i16;
                                i22 = -1;
                                break;
                            }
                        case 5:
                        case 14:
                            zzioVar2 = zzioVar;
                            i14 = zzx;
                            i16 = 1048575;
                            i11 = i29;
                            if (i30 != 1) {
                                i15 = i9;
                                i10 = i15;
                                unsafe = unsafe2;
                                i13 = i14;
                                i12 = -1;
                                break;
                            } else {
                                i15 = i9;
                                unsafe2.putLong(obj, j, zzip.zzn(bArr2, i9));
                                i23 = i15 + 8;
                                i27 |= i33;
                                i26 = i14;
                                i24 = i11;
                                i21 = i16;
                                i22 = -1;
                                break;
                            }
                        case 6:
                        case 13:
                            zzioVar2 = zzioVar;
                            i14 = zzx;
                            i16 = 1048575;
                            i11 = i29;
                            if (i30 != 5) {
                                i15 = i9;
                                i10 = i15;
                                unsafe = unsafe2;
                                i13 = i14;
                                i12 = -1;
                                break;
                            } else {
                                unsafe2.putInt(obj2, j, zzip.zzb(bArr2, i9));
                                i23 = i9 + 4;
                                i27 |= i33;
                                i26 = i14;
                                i24 = i11;
                                i21 = i16;
                                i22 = -1;
                                break;
                            }
                        case 7:
                            zzioVar2 = zzioVar;
                            i14 = zzx;
                            i16 = 1048575;
                            i11 = i29;
                            if (i30 != 0) {
                                i15 = i9;
                                i10 = i15;
                                unsafe = unsafe2;
                                i13 = i14;
                                i12 = -1;
                                break;
                            } else {
                                i23 = zzip.zzm(bArr2, i9, zzioVar2);
                                zzmv.zzm(obj2, j, zzioVar2.zzb != 0);
                                i27 |= i33;
                                i26 = i14;
                                i24 = i11;
                                i21 = i16;
                                i22 = -1;
                                break;
                            }
                        case 8:
                            zzioVar2 = zzioVar;
                            i14 = zzx;
                            i16 = 1048575;
                            i11 = i29;
                            if (i30 != 2) {
                                i15 = i9;
                                i10 = i15;
                                unsafe = unsafe2;
                                i13 = i14;
                                i12 = -1;
                                break;
                            } else {
                                i23 = (536870912 & i31) == 0 ? zzip.zzg(bArr2, i9, zzioVar2) : zzip.zzh(bArr2, i9, zzioVar2);
                                unsafe2.putObject(obj2, j, zzioVar2.zzc);
                                i27 |= i33;
                                i26 = i14;
                                i24 = i11;
                                i21 = i16;
                                i22 = -1;
                                break;
                            }
                        case 9:
                            zzioVar2 = zzioVar;
                            i14 = zzx;
                            i16 = 1048575;
                            i11 = i29;
                            if (i30 != 2) {
                                i15 = i9;
                                i10 = i15;
                                unsafe = unsafe2;
                                i13 = i14;
                                i12 = -1;
                                break;
                            } else {
                                zzd = zzip.zzd(zzlmVar.zzE(i14), bArr2, i9, i20, zzioVar2);
                                Object object = unsafe2.getObject(obj2, j);
                                if (object == null) {
                                    unsafe2.putObject(obj2, j, zzioVar2.zzc);
                                } else {
                                    unsafe2.putObject(obj2, j, zzkk.zzg(object, zzioVar2.zzc));
                                }
                                i27 |= i33;
                                i23 = zzd;
                                i26 = i14;
                                i24 = i11;
                                i21 = i16;
                                i22 = -1;
                                break;
                            }
                        case 10:
                            zzioVar2 = zzioVar;
                            i14 = zzx;
                            i16 = 1048575;
                            i11 = i29;
                            if (i30 != 2) {
                                i15 = i9;
                                i10 = i15;
                                unsafe = unsafe2;
                                i13 = i14;
                                i12 = -1;
                                break;
                            } else {
                                zzd = zzip.zza(bArr2, i9, zzioVar2);
                                unsafe2.putObject(obj2, j, zzioVar2.zzc);
                                i27 |= i33;
                                i23 = zzd;
                                i26 = i14;
                                i24 = i11;
                                i21 = i16;
                                i22 = -1;
                                break;
                            }
                        case 12:
                            zzioVar2 = zzioVar;
                            i14 = zzx;
                            i16 = 1048575;
                            i11 = i29;
                            if (i30 != 0) {
                                i15 = i9;
                                i10 = i15;
                                unsafe = unsafe2;
                                i13 = i14;
                                i12 = -1;
                                break;
                            } else {
                                zzd = zzip.zzj(bArr2, i9, zzioVar2);
                                unsafe2.putInt(obj2, j, zzioVar2.zza);
                                i27 |= i33;
                                i23 = zzd;
                                i26 = i14;
                                i24 = i11;
                                i21 = i16;
                                i22 = -1;
                                break;
                            }
                        case 15:
                            zzioVar2 = zzioVar;
                            i14 = zzx;
                            i16 = 1048575;
                            i11 = i29;
                            if (i30 != 0) {
                                i15 = i9;
                                i10 = i15;
                                unsafe = unsafe2;
                                i13 = i14;
                                i12 = -1;
                                break;
                            } else {
                                zzd = zzip.zzj(bArr2, i9, zzioVar2);
                                unsafe2.putInt(obj2, j, zzjf.zzb(zzioVar2.zza));
                                i27 |= i33;
                                i23 = zzd;
                                i26 = i14;
                                i24 = i11;
                                i21 = i16;
                                i22 = -1;
                                break;
                            }
                        case 16:
                            if (i30 != 0) {
                                i11 = i29;
                                i14 = zzx;
                                i15 = i9;
                                i10 = i15;
                                unsafe = unsafe2;
                                i13 = i14;
                                i12 = -1;
                                break;
                            } else {
                                zzioVar2 = zzioVar;
                                zzm = zzip.zzm(bArr2, i9, zzioVar2);
                                i14 = zzx;
                                i11 = i29;
                                i16 = 1048575;
                                unsafe2.putLong(obj, j, zzjf.zzc(zzioVar2.zzb));
                                i27 |= i33;
                                i23 = zzm;
                                i26 = i14;
                                i24 = i11;
                                i21 = i16;
                                i22 = -1;
                                break;
                            }
                        default:
                            i11 = i29;
                            i14 = zzx;
                            i15 = i9;
                            i10 = i15;
                            unsafe = unsafe2;
                            i13 = i14;
                            i12 = -1;
                            break;
                    }
                } else {
                    zzioVar2 = zzioVar;
                    i14 = zzx;
                    int i35 = i9;
                    i16 = 1048575;
                    i11 = i29;
                    if (zzA == 27) {
                        if (i30 == 2) {
                            zzkj zzkjVar = (zzkj) unsafe2.getObject(obj2, j);
                            if (!zzkjVar.zzc()) {
                                int size = zzkjVar.size();
                                zzkjVar = zzkjVar.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj2, j, zzkjVar);
                            }
                            i23 = zzip.zze(zzlmVar.zzE(i14), b7, bArr, i35, i8, zzkjVar, zzioVar);
                            i27 = i27;
                            i26 = i14;
                            i24 = i11;
                            i21 = i16;
                            i22 = -1;
                        } else {
                            i17 = i35;
                            i18 = i27;
                            i19 = i25;
                            unsafe = unsafe2;
                            i13 = i14;
                            i12 = -1;
                        }
                    } else if (zzA <= 49) {
                        i18 = i27;
                        i19 = i25;
                        i12 = -1;
                        unsafe = unsafe2;
                        i13 = i14;
                        i23 = zzv(obj, bArr, i35, i8, b7, i11, i30, i14, i31, zzA, j, zzioVar);
                        if (i23 != i35) {
                            obj2 = obj;
                            bArr2 = bArr;
                            i20 = i8;
                            zzioVar2 = zzioVar;
                            i25 = i19;
                            i22 = i12;
                            i24 = i11;
                            i27 = i18;
                            i26 = i13;
                            unsafe2 = unsafe;
                            i21 = 1048575;
                            zzlmVar = this;
                        } else {
                            i10 = i23;
                            i25 = i19;
                            i27 = i18;
                        }
                    } else {
                        i17 = i35;
                        i18 = i27;
                        i19 = i25;
                        unsafe = unsafe2;
                        i13 = i14;
                        i12 = -1;
                        if (zzA != 50) {
                            i23 = zzt(obj, bArr, i17, i8, b7, i11, i30, i31, zzA, j, i13, zzioVar);
                            if (i23 != i17) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i20 = i8;
                                zzioVar2 = zzioVar;
                                i25 = i19;
                                i22 = i12;
                                i24 = i11;
                                i27 = i18;
                                i26 = i13;
                                unsafe2 = unsafe;
                                i21 = 1048575;
                                zzlmVar = this;
                            } else {
                                i10 = i23;
                                i25 = i19;
                                i27 = i18;
                            }
                        } else if (i30 == 2) {
                            i23 = zzs(obj, bArr, i17, i8, i13, j, zzioVar);
                            if (i23 != i17) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i20 = i8;
                                zzioVar2 = zzioVar;
                                i25 = i19;
                                i22 = i12;
                                i24 = i11;
                                i27 = i18;
                                i26 = i13;
                                unsafe2 = unsafe;
                                i21 = 1048575;
                                zzlmVar = this;
                            } else {
                                i10 = i23;
                                i25 = i19;
                                i27 = i18;
                            }
                        }
                    }
                    i10 = i17;
                    i25 = i19;
                    i27 = i18;
                }
            }
            i23 = zzip.zzi(b7, bArr, i10, i8, zzd(obj), zzioVar);
            zzlmVar = this;
            obj2 = obj;
            bArr2 = bArr;
            i20 = i8;
            zzioVar2 = zzioVar;
            i22 = i12;
            i24 = i11;
            i26 = i13;
            unsafe2 = unsafe;
            i21 = 1048575;
        }
        int i36 = i27;
        int i37 = i25;
        Unsafe unsafe3 = unsafe2;
        if (i37 != i21) {
            unsafe3.putInt(obj, i37, i36);
        }
        if (i23 == i8) {
            return i23;
        }
        throw zzkm.zze();
    }

    private final int zzv(Object obj, byte[] bArr, int i7, int i8, int i9, int i10, int i11, int i12, long j, int i13, long j3, zzio zzioVar) {
        int i14;
        int i15;
        int i16;
        int i17;
        int zzj;
        int i18 = i7;
        Unsafe unsafe = zzb;
        zzkj zzkjVar = (zzkj) unsafe.getObject(obj, j3);
        if (!zzkjVar.zzc()) {
            int size = zzkjVar.size();
            zzkjVar = zzkjVar.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j3, zzkjVar);
        }
        switch (i13) {
            case 18:
            case 35:
                if (i11 == 2) {
                    zzjl zzjlVar = (zzjl) zzkjVar;
                    int zzj2 = zzip.zzj(bArr, i18, zzioVar);
                    int i19 = zzioVar.zza + zzj2;
                    while (zzj2 < i19) {
                        zzjlVar.zze(Double.longBitsToDouble(zzip.zzn(bArr, zzj2)));
                        zzj2 += 8;
                    }
                    if (zzj2 == i19) {
                        return zzj2;
                    }
                    throw zzkm.zzf();
                }
                if (i11 == 1) {
                    zzjl zzjlVar2 = (zzjl) zzkjVar;
                    zzjlVar2.zze(Double.longBitsToDouble(zzip.zzn(bArr, i7)));
                    while (true) {
                        i14 = i18 + 8;
                        if (i14 < i8) {
                            i18 = zzip.zzj(bArr, i14, zzioVar);
                            if (i9 == zzioVar.zza) {
                                zzjlVar2.zze(Double.longBitsToDouble(zzip.zzn(bArr, i18)));
                            }
                        }
                    }
                    return i14;
                }
                return i18;
            case 19:
            case 36:
                if (i11 == 2) {
                    zzjv zzjvVar = (zzjv) zzkjVar;
                    int zzj3 = zzip.zzj(bArr, i18, zzioVar);
                    int i20 = zzioVar.zza + zzj3;
                    while (zzj3 < i20) {
                        zzjvVar.zze(Float.intBitsToFloat(zzip.zzb(bArr, zzj3)));
                        zzj3 += 4;
                    }
                    if (zzj3 == i20) {
                        return zzj3;
                    }
                    throw zzkm.zzf();
                }
                if (i11 == 5) {
                    zzjv zzjvVar2 = (zzjv) zzkjVar;
                    zzjvVar2.zze(Float.intBitsToFloat(zzip.zzb(bArr, i7)));
                    while (true) {
                        i15 = i18 + 4;
                        if (i15 < i8) {
                            i18 = zzip.zzj(bArr, i15, zzioVar);
                            if (i9 == zzioVar.zza) {
                                zzjvVar2.zze(Float.intBitsToFloat(zzip.zzb(bArr, i18)));
                            }
                        }
                    }
                    return i15;
                }
                return i18;
            case 20:
            case zzbbd.zzt.zzm /* 21 */:
            case 37:
            case 38:
                if (i11 == 2) {
                    zzky zzkyVar = (zzky) zzkjVar;
                    int zzj4 = zzip.zzj(bArr, i18, zzioVar);
                    int i21 = zzioVar.zza + zzj4;
                    while (zzj4 < i21) {
                        zzj4 = zzip.zzm(bArr, zzj4, zzioVar);
                        zzkyVar.zzg(zzioVar.zzb);
                    }
                    if (zzj4 == i21) {
                        return zzj4;
                    }
                    throw zzkm.zzf();
                }
                if (i11 == 0) {
                    zzky zzkyVar2 = (zzky) zzkjVar;
                    int zzm = zzip.zzm(bArr, i18, zzioVar);
                    zzkyVar2.zzg(zzioVar.zzb);
                    while (zzm < i8) {
                        int zzj5 = zzip.zzj(bArr, zzm, zzioVar);
                        if (i9 != zzioVar.zza) {
                            return zzm;
                        }
                        zzm = zzip.zzm(bArr, zzj5, zzioVar);
                        zzkyVar2.zzg(zzioVar.zzb);
                    }
                    return zzm;
                }
                return i18;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i11 == 2) {
                    return zzip.zzf(bArr, i18, zzkjVar, zzioVar);
                }
                if (i11 == 0) {
                    return zzip.zzl(i9, bArr, i7, i8, zzkjVar, zzioVar);
                }
                return i18;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i11 == 2) {
                    zzky zzkyVar3 = (zzky) zzkjVar;
                    int zzj6 = zzip.zzj(bArr, i18, zzioVar);
                    int i22 = zzioVar.zza + zzj6;
                    while (zzj6 < i22) {
                        zzkyVar3.zzg(zzip.zzn(bArr, zzj6));
                        zzj6 += 8;
                    }
                    if (zzj6 == i22) {
                        return zzj6;
                    }
                    throw zzkm.zzf();
                }
                if (i11 == 1) {
                    zzky zzkyVar4 = (zzky) zzkjVar;
                    zzkyVar4.zzg(zzip.zzn(bArr, i7));
                    while (true) {
                        i16 = i18 + 8;
                        if (i16 < i8) {
                            i18 = zzip.zzj(bArr, i16, zzioVar);
                            if (i9 == zzioVar.zza) {
                                zzkyVar4.zzg(zzip.zzn(bArr, i18));
                            }
                        }
                    }
                    return i16;
                }
                return i18;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i11 == 2) {
                    zzkd zzkdVar = (zzkd) zzkjVar;
                    int zzj7 = zzip.zzj(bArr, i18, zzioVar);
                    int i23 = zzioVar.zza + zzj7;
                    while (zzj7 < i23) {
                        zzkdVar.zzh(zzip.zzb(bArr, zzj7));
                        zzj7 += 4;
                    }
                    if (zzj7 == i23) {
                        return zzj7;
                    }
                    throw zzkm.zzf();
                }
                if (i11 == 5) {
                    zzkd zzkdVar2 = (zzkd) zzkjVar;
                    zzkdVar2.zzh(zzip.zzb(bArr, i7));
                    while (true) {
                        i17 = i18 + 4;
                        if (i17 < i8) {
                            i18 = zzip.zzj(bArr, i17, zzioVar);
                            if (i9 == zzioVar.zza) {
                                zzkdVar2.zzh(zzip.zzb(bArr, i18));
                            }
                        }
                    }
                    return i17;
                }
                return i18;
            case 25:
            case 42:
                if (i11 == 2) {
                    zziq zziqVar = (zziq) zzkjVar;
                    zzj = zzip.zzj(bArr, i18, zzioVar);
                    int i24 = zzioVar.zza + zzj;
                    while (zzj < i24) {
                        zzj = zzip.zzm(bArr, zzj, zzioVar);
                        zziqVar.zze(zzioVar.zzb != 0);
                    }
                    if (zzj != i24) {
                        throw zzkm.zzf();
                    }
                    return zzj;
                }
                if (i11 == 0) {
                    zziq zziqVar2 = (zziq) zzkjVar;
                    int zzm2 = zzip.zzm(bArr, i18, zzioVar);
                    zziqVar2.zze(zzioVar.zzb != 0);
                    while (zzm2 < i8) {
                        int zzj8 = zzip.zzj(bArr, zzm2, zzioVar);
                        if (i9 != zzioVar.zza) {
                            return zzm2;
                        }
                        zzm2 = zzip.zzm(bArr, zzj8, zzioVar);
                        zziqVar2.zze(zzioVar.zzb != 0);
                    }
                    return zzm2;
                }
                return i18;
            case 26:
                if (i11 == 2) {
                    if ((j & 536870912) == 0) {
                        int zzj9 = zzip.zzj(bArr, i18, zzioVar);
                        int i25 = zzioVar.zza;
                        if (i25 < 0) {
                            throw zzkm.zzd();
                        }
                        if (i25 == 0) {
                            zzkjVar.add("");
                        } else {
                            zzkjVar.add(new String(bArr, zzj9, i25, zzkk.zzb));
                            zzj9 += i25;
                        }
                        while (zzj9 < i8) {
                            int zzj10 = zzip.zzj(bArr, zzj9, zzioVar);
                            if (i9 != zzioVar.zza) {
                                return zzj9;
                            }
                            zzj9 = zzip.zzj(bArr, zzj10, zzioVar);
                            int i26 = zzioVar.zza;
                            if (i26 < 0) {
                                throw zzkm.zzd();
                            }
                            if (i26 == 0) {
                                zzkjVar.add("");
                            } else {
                                zzkjVar.add(new String(bArr, zzj9, i26, zzkk.zzb));
                                zzj9 += i26;
                            }
                        }
                        return zzj9;
                    }
                    int zzj11 = zzip.zzj(bArr, i18, zzioVar);
                    int i27 = zzioVar.zza;
                    if (i27 < 0) {
                        throw zzkm.zzd();
                    }
                    if (i27 == 0) {
                        zzkjVar.add("");
                    } else {
                        int i28 = zzj11 + i27;
                        if (!zzna.zzf(bArr, zzj11, i28)) {
                            throw zzkm.zzc();
                        }
                        zzkjVar.add(new String(bArr, zzj11, i27, zzkk.zzb));
                        zzj11 = i28;
                    }
                    while (zzj11 < i8) {
                        int zzj12 = zzip.zzj(bArr, zzj11, zzioVar);
                        if (i9 != zzioVar.zza) {
                            return zzj11;
                        }
                        zzj11 = zzip.zzj(bArr, zzj12, zzioVar);
                        int i29 = zzioVar.zza;
                        if (i29 < 0) {
                            throw zzkm.zzd();
                        }
                        if (i29 == 0) {
                            zzkjVar.add("");
                        } else {
                            int i30 = zzj11 + i29;
                            if (!zzna.zzf(bArr, zzj11, i30)) {
                                throw zzkm.zzc();
                            }
                            zzkjVar.add(new String(bArr, zzj11, i29, zzkk.zzb));
                            zzj11 = i30;
                        }
                    }
                    return zzj11;
                }
                return i18;
            case 27:
                if (i11 == 2) {
                    return zzip.zze(zzE(i12), i9, bArr, i7, i8, zzkjVar, zzioVar);
                }
                return i18;
            case 28:
                if (i11 == 2) {
                    int zzj13 = zzip.zzj(bArr, i18, zzioVar);
                    int i31 = zzioVar.zza;
                    if (i31 < 0) {
                        throw zzkm.zzd();
                    }
                    if (i31 > bArr.length - zzj13) {
                        throw zzkm.zzf();
                    }
                    if (i31 == 0) {
                        zzkjVar.add(zzjb.zzb);
                    } else {
                        zzkjVar.add(zzjb.zzl(bArr, zzj13, i31));
                        zzj13 += i31;
                    }
                    while (zzj13 < i8) {
                        int zzj14 = zzip.zzj(bArr, zzj13, zzioVar);
                        if (i9 != zzioVar.zza) {
                            return zzj13;
                        }
                        zzj13 = zzip.zzj(bArr, zzj14, zzioVar);
                        int i32 = zzioVar.zza;
                        if (i32 < 0) {
                            throw zzkm.zzd();
                        }
                        if (i32 > bArr.length - zzj13) {
                            throw zzkm.zzf();
                        }
                        if (i32 == 0) {
                            zzkjVar.add(zzjb.zzb);
                        } else {
                            zzkjVar.add(zzjb.zzl(bArr, zzj13, i32));
                            zzj13 += i32;
                        }
                    }
                    return zzj13;
                }
                return i18;
            case 30:
            case 44:
                if (i11 != 2) {
                    if (i11 == 0) {
                        zzj = zzip.zzl(i9, bArr, i7, i8, zzkjVar, zzioVar);
                    }
                    return i18;
                }
                zzj = zzip.zzf(bArr, i18, zzkjVar, zzioVar);
                zzkc zzkcVar = (zzkc) obj;
                zzmm zzmmVar = zzkcVar.zzc;
                if (zzmmVar == zzmm.zzc()) {
                    zzmmVar = null;
                }
                Object zzC = zzlw.zzC(i10, zzkjVar, zzD(i12), zzmmVar, this.zzn);
                if (zzC != null) {
                    zzkcVar.zzc = (zzmm) zzC;
                    return zzj;
                }
                return zzj;
            case 33:
            case 47:
                if (i11 == 2) {
                    zzkd zzkdVar3 = (zzkd) zzkjVar;
                    int zzj15 = zzip.zzj(bArr, i18, zzioVar);
                    int i33 = zzioVar.zza + zzj15;
                    while (zzj15 < i33) {
                        zzj15 = zzip.zzj(bArr, zzj15, zzioVar);
                        zzkdVar3.zzh(zzjf.zzb(zzioVar.zza));
                    }
                    if (zzj15 == i33) {
                        return zzj15;
                    }
                    throw zzkm.zzf();
                }
                if (i11 == 0) {
                    zzkd zzkdVar4 = (zzkd) zzkjVar;
                    int zzj16 = zzip.zzj(bArr, i18, zzioVar);
                    zzkdVar4.zzh(zzjf.zzb(zzioVar.zza));
                    while (zzj16 < i8) {
                        int zzj17 = zzip.zzj(bArr, zzj16, zzioVar);
                        if (i9 != zzioVar.zza) {
                            return zzj16;
                        }
                        zzj16 = zzip.zzj(bArr, zzj17, zzioVar);
                        zzkdVar4.zzh(zzjf.zzb(zzioVar.zza));
                    }
                    return zzj16;
                }
                return i18;
            case 34:
            case 48:
                if (i11 == 2) {
                    zzky zzkyVar5 = (zzky) zzkjVar;
                    int zzj18 = zzip.zzj(bArr, i18, zzioVar);
                    int i34 = zzioVar.zza + zzj18;
                    while (zzj18 < i34) {
                        zzj18 = zzip.zzm(bArr, zzj18, zzioVar);
                        zzkyVar5.zzg(zzjf.zzc(zzioVar.zzb));
                    }
                    if (zzj18 == i34) {
                        return zzj18;
                    }
                    throw zzkm.zzf();
                }
                if (i11 == 0) {
                    zzky zzkyVar6 = (zzky) zzkjVar;
                    int zzm3 = zzip.zzm(bArr, i18, zzioVar);
                    zzkyVar6.zzg(zzjf.zzc(zzioVar.zzb));
                    while (zzm3 < i8) {
                        int zzj19 = zzip.zzj(bArr, zzm3, zzioVar);
                        if (i9 != zzioVar.zza) {
                            return zzm3;
                        }
                        zzm3 = zzip.zzm(bArr, zzj19, zzioVar);
                        zzkyVar6.zzg(zzjf.zzc(zzioVar.zzb));
                    }
                    return zzm3;
                }
                return i18;
            default:
                if (i11 == 3) {
                    zzlu zzE = zzE(i12);
                    int i35 = (i9 & (-8)) | 4;
                    int zzc = zzip.zzc(zzE, bArr, i7, i8, i35, zzioVar);
                    zzkjVar.add(zzioVar.zzc);
                    while (zzc < i8) {
                        int zzj20 = zzip.zzj(bArr, zzc, zzioVar);
                        if (i9 != zzioVar.zza) {
                            return zzc;
                        }
                        zzc = zzip.zzc(zzE, bArr, zzj20, i8, i35, zzioVar);
                        zzkjVar.add(zzioVar.zzc);
                    }
                    return zzc;
                }
                return i18;
        }
    }

    private final int zzw(int i7) {
        if (i7 < this.zze || i7 > this.zzf) {
            return -1;
        }
        return zzz(i7, 0);
    }

    private final int zzx(int i7, int i8) {
        if (i7 < this.zze || i7 > this.zzf) {
            return -1;
        }
        return zzz(i7, i8);
    }

    private final int zzy(int i7) {
        return this.zzc[i7 + 2];
    }

    private final int zzz(int i7, int i8) {
        int length = (this.zzc.length / 3) - 1;
        while (i8 <= length) {
            int i9 = (length + i8) >>> 1;
            int i10 = i9 * 3;
            int i11 = this.zzc[i10];
            if (i7 == i11) {
                return i10;
            }
            if (i7 < i11) {
                length = i9 - 1;
            } else {
                i8 = i9 + 1;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final int zza(Object obj) {
        return this.zzi ? zzq(obj) : zzp(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final int zzb(Object obj) {
        int i7;
        int zzc;
        int i8;
        int zzc2;
        int length = this.zzc.length;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int zzB = zzB(i10);
            int i11 = this.zzc[i10];
            long j = 1048575 & zzB;
            int i12 = 37;
            switch (zzA(zzB)) {
                case 0:
                    i7 = i9 * 53;
                    zzc = zzkk.zzc(Double.doubleToLongBits(zzmv.zza(obj, j)));
                    i9 = zzc + i7;
                    break;
                case 1:
                    i7 = i9 * 53;
                    zzc = Float.floatToIntBits(zzmv.zzb(obj, j));
                    i9 = zzc + i7;
                    break;
                case 2:
                    i7 = i9 * 53;
                    zzc = zzkk.zzc(zzmv.zzd(obj, j));
                    i9 = zzc + i7;
                    break;
                case 3:
                    i7 = i9 * 53;
                    zzc = zzkk.zzc(zzmv.zzd(obj, j));
                    i9 = zzc + i7;
                    break;
                case 4:
                    i8 = i9 * 53;
                    zzc2 = zzmv.zzc(obj, j);
                    i9 = i8 + zzc2;
                    break;
                case 5:
                    i7 = i9 * 53;
                    zzc = zzkk.zzc(zzmv.zzd(obj, j));
                    i9 = zzc + i7;
                    break;
                case 6:
                    i8 = i9 * 53;
                    zzc2 = zzmv.zzc(obj, j);
                    i9 = i8 + zzc2;
                    break;
                case 7:
                    i7 = i9 * 53;
                    zzc = zzkk.zza(zzmv.zzw(obj, j));
                    i9 = zzc + i7;
                    break;
                case 8:
                    i7 = i9 * 53;
                    zzc = ((String) zzmv.zzf(obj, j)).hashCode();
                    i9 = zzc + i7;
                    break;
                case 9:
                    Object zzf = zzmv.zzf(obj, j);
                    if (zzf != null) {
                        i12 = zzf.hashCode();
                    }
                    i9 = (i9 * 53) + i12;
                    break;
                case 10:
                    i7 = i9 * 53;
                    zzc = zzmv.zzf(obj, j).hashCode();
                    i9 = zzc + i7;
                    break;
                case 11:
                    i8 = i9 * 53;
                    zzc2 = zzmv.zzc(obj, j);
                    i9 = i8 + zzc2;
                    break;
                case 12:
                    i8 = i9 * 53;
                    zzc2 = zzmv.zzc(obj, j);
                    i9 = i8 + zzc2;
                    break;
                case 13:
                    i8 = i9 * 53;
                    zzc2 = zzmv.zzc(obj, j);
                    i9 = i8 + zzc2;
                    break;
                case 14:
                    i7 = i9 * 53;
                    zzc = zzkk.zzc(zzmv.zzd(obj, j));
                    i9 = zzc + i7;
                    break;
                case 15:
                    i8 = i9 * 53;
                    zzc2 = zzmv.zzc(obj, j);
                    i9 = i8 + zzc2;
                    break;
                case 16:
                    i7 = i9 * 53;
                    zzc = zzkk.zzc(zzmv.zzd(obj, j));
                    i9 = zzc + i7;
                    break;
                case 17:
                    Object zzf2 = zzmv.zzf(obj, j);
                    if (zzf2 != null) {
                        i12 = zzf2.hashCode();
                    }
                    i9 = (i9 * 53) + i12;
                    break;
                case 18:
                case 19:
                case 20:
                case zzbbd.zzt.zzm /* 21 */:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i7 = i9 * 53;
                    zzc = zzmv.zzf(obj, j).hashCode();
                    i9 = zzc + i7;
                    break;
                case 50:
                    i7 = i9 * 53;
                    zzc = zzmv.zzf(obj, j).hashCode();
                    i9 = zzc + i7;
                    break;
                case 51:
                    if (zzR(obj, i11, i10)) {
                        i7 = i9 * 53;
                        zzc = zzkk.zzc(Double.doubleToLongBits(zzn(obj, j)));
                        i9 = zzc + i7;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i11, i10)) {
                        i7 = i9 * 53;
                        zzc = Float.floatToIntBits(zzo(obj, j));
                        i9 = zzc + i7;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i11, i10)) {
                        i7 = i9 * 53;
                        zzc = zzkk.zzc(zzC(obj, j));
                        i9 = zzc + i7;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i11, i10)) {
                        i7 = i9 * 53;
                        zzc = zzkk.zzc(zzC(obj, j));
                        i9 = zzc + i7;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i11, i10)) {
                        i8 = i9 * 53;
                        zzc2 = zzr(obj, j);
                        i9 = i8 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i11, i10)) {
                        i7 = i9 * 53;
                        zzc = zzkk.zzc(zzC(obj, j));
                        i9 = zzc + i7;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i11, i10)) {
                        i8 = i9 * 53;
                        zzc2 = zzr(obj, j);
                        i9 = i8 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i11, i10)) {
                        i7 = i9 * 53;
                        zzc = zzkk.zza(zzS(obj, j));
                        i9 = zzc + i7;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i11, i10)) {
                        i7 = i9 * 53;
                        zzc = ((String) zzmv.zzf(obj, j)).hashCode();
                        i9 = zzc + i7;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i11, i10)) {
                        i7 = i9 * 53;
                        zzc = zzmv.zzf(obj, j).hashCode();
                        i9 = zzc + i7;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i11, i10)) {
                        i7 = i9 * 53;
                        zzc = zzmv.zzf(obj, j).hashCode();
                        i9 = zzc + i7;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i11, i10)) {
                        i8 = i9 * 53;
                        zzc2 = zzr(obj, j);
                        i9 = i8 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i11, i10)) {
                        i8 = i9 * 53;
                        zzc2 = zzr(obj, j);
                        i9 = i8 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i11, i10)) {
                        i8 = i9 * 53;
                        zzc2 = zzr(obj, j);
                        i9 = i8 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i11, i10)) {
                        i7 = i9 * 53;
                        zzc = zzkk.zzc(zzC(obj, j));
                        i9 = zzc + i7;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i11, i10)) {
                        i8 = i9 * 53;
                        zzc2 = zzr(obj, j);
                        i9 = i8 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i11, i10)) {
                        i7 = i9 * 53;
                        zzc = zzkk.zzc(zzC(obj, j));
                        i9 = zzc + i7;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i11, i10)) {
                        i7 = i9 * 53;
                        zzc = zzmv.zzf(obj, j).hashCode();
                        i9 = zzc + i7;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.zzn.zzc(obj).hashCode() + (i9 * 53);
        if (!this.zzh) {
            return hashCode;
        }
        this.zzo.zza(obj);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:217:0x03ab, code lost:
    
        if (r0 != r20) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x03ad, code lost:
    
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r2 = r33;
        r13 = r34;
        r11 = r35;
        r9 = r36;
        r5 = r20;
        r1 = r21;
        r3 = r22;
        r6 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x03c7, code lost:
    
        r2 = r0;
        r7 = r21;
        r6 = r23;
        r0 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x03f0, code lost:
    
        if (r0 != r15) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0416, code lost:
    
        if (r0 != r15) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0494, code lost:
    
        if (r6 == 1048575) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0496, code lost:
    
        r28.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x049c, code lost:
    
        r3 = r8.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x04a0, code lost:
    
        if (r3 >= r8.zzl) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x04a2, code lost:
    
        r4 = r8.zzj[r3];
        r5 = r8.zzc[r4];
        r5 = com.google.android.gms.internal.measurement.zzmv.zzf(r12, r8.zzB(r4) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x04b4, code lost:
    
        if (r5 != null) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x04bb, code lost:
    
        if (r8.zzD(r4) != null) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x04c0, code lost:
    
        r5 = (com.google.android.gms.internal.measurement.zzld) r5;
        r0 = (com.google.android.gms.internal.measurement.zzlc) r8.zzF(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x04c8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x04bd, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x04c9, code lost:
    
        if (r9 != 0) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x04cd, code lost:
    
        if (r0 != r34) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x04d4, code lost:
    
        throw com.google.android.gms.internal.measurement.zzkm.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x04db, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x04d7, code lost:
    
        if (r0 > r34) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x04d9, code lost:
    
        if (r1 != r9) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x04e0, code lost:
    
        throw com.google.android.gms.internal.measurement.zzkm.zze();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzc(Object obj, byte[] bArr, int i7, int i8, int i9, zzio zzioVar) {
        Unsafe unsafe;
        int i10;
        Object obj2;
        zzlm<T> zzlmVar;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Object obj3;
        int i18;
        zzio zzioVar2;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        zzlm<T> zzlmVar2 = this;
        Object obj4 = obj;
        byte[] bArr2 = bArr;
        int i32 = i8;
        int i33 = i9;
        zzio zzioVar3 = zzioVar;
        Unsafe unsafe2 = zzb;
        int i34 = i7;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = -1;
        int i39 = 1048575;
        while (true) {
            if (i34 < i32) {
                int i40 = i34 + 1;
                byte b7 = bArr2[i34];
                if (b7 < 0) {
                    int zzk = zzip.zzk(b7, bArr2, i40, zzioVar3);
                    i11 = zzioVar3.zza;
                    i40 = zzk;
                } else {
                    i11 = b7;
                }
                int i41 = i11 >>> 3;
                int i42 = i11 & 7;
                int zzx = i41 > i38 ? zzlmVar2.zzx(i41, i36 / 3) : zzlmVar2.zzw(i41);
                if (zzx == -1) {
                    i12 = i41;
                    i13 = i11;
                    i14 = i37;
                    unsafe = unsafe2;
                    i15 = i33;
                    i16 = 0;
                    i17 = i40;
                } else {
                    int[] iArr = zzlmVar2.zzc;
                    int i43 = iArr[zzx + 1];
                    int zzA = zzA(i43);
                    int i44 = i40;
                    long j = i43 & 1048575;
                    int i45 = i11;
                    if (zzA <= 17) {
                        int i46 = iArr[zzx + 2];
                        int i47 = 1 << (i46 >>> 20);
                        int i48 = i46 & 1048575;
                        if (i48 != i39) {
                            i22 = zzx;
                            if (i39 != 1048575) {
                                unsafe2.putInt(obj4, i39, i37);
                            }
                            i21 = i48;
                            i23 = unsafe2.getInt(obj4, i48);
                        } else {
                            i22 = zzx;
                            i21 = i39;
                            i23 = i37;
                        }
                        switch (zzA) {
                            case 0:
                                i24 = i41;
                                i25 = i22;
                                i26 = i44;
                                bArr2 = bArr;
                                if (i42 != 1) {
                                    i15 = i9;
                                    i14 = i23;
                                    unsafe = unsafe2;
                                    i12 = i24;
                                    i17 = i26;
                                    i13 = i45;
                                    i39 = i21;
                                    i16 = i25;
                                    break;
                                } else {
                                    zzmv.zzo(obj4, j, Double.longBitsToDouble(zzip.zzn(bArr2, i26)));
                                    i34 = i26 + 8;
                                    i37 = i23 | i47;
                                    i32 = i8;
                                    i38 = i24;
                                    i35 = i45;
                                    i39 = i21;
                                    i36 = i25;
                                    i33 = i9;
                                    break;
                                }
                            case 1:
                                i24 = i41;
                                i25 = i22;
                                i26 = i44;
                                bArr2 = bArr;
                                if (i42 != 5) {
                                    i15 = i9;
                                    i14 = i23;
                                    unsafe = unsafe2;
                                    i12 = i24;
                                    i17 = i26;
                                    i13 = i45;
                                    i39 = i21;
                                    i16 = i25;
                                    break;
                                } else {
                                    zzmv.zzp(obj4, j, Float.intBitsToFloat(zzip.zzb(bArr2, i26)));
                                    i34 = i26 + 4;
                                    i37 = i23 | i47;
                                    i32 = i8;
                                    i38 = i24;
                                    i35 = i45;
                                    i39 = i21;
                                    i36 = i25;
                                    i33 = i9;
                                    break;
                                }
                            case 2:
                            case 3:
                                i24 = i41;
                                i25 = i22;
                                i26 = i44;
                                bArr2 = bArr;
                                if (i42 != 0) {
                                    i15 = i9;
                                    i14 = i23;
                                    unsafe = unsafe2;
                                    i12 = i24;
                                    i17 = i26;
                                    i13 = i45;
                                    i39 = i21;
                                    i16 = i25;
                                    break;
                                } else {
                                    int zzm = zzip.zzm(bArr2, i26, zzioVar3);
                                    unsafe2.putLong(obj, j, zzioVar3.zzb);
                                    i37 = i23 | i47;
                                    i32 = i8;
                                    i34 = zzm;
                                    i38 = i24;
                                    i35 = i45;
                                    i39 = i21;
                                    i36 = i25;
                                    i33 = i9;
                                    break;
                                }
                            case 4:
                            case 11:
                                i24 = i41;
                                i25 = i22;
                                i26 = i44;
                                bArr2 = bArr;
                                if (i42 != 0) {
                                    i15 = i9;
                                    i14 = i23;
                                    unsafe = unsafe2;
                                    i12 = i24;
                                    i17 = i26;
                                    i13 = i45;
                                    i39 = i21;
                                    i16 = i25;
                                    break;
                                } else {
                                    i34 = zzip.zzj(bArr2, i26, zzioVar3);
                                    unsafe2.putInt(obj4, j, zzioVar3.zza);
                                    i37 = i23 | i47;
                                    i32 = i8;
                                    i38 = i24;
                                    i35 = i45;
                                    i39 = i21;
                                    i36 = i25;
                                    i33 = i9;
                                    break;
                                }
                            case 5:
                            case 14:
                                i24 = i41;
                                i27 = i22;
                                i28 = i44;
                                i29 = i45;
                                bArr2 = bArr;
                                if (i42 != 1) {
                                    i25 = i27;
                                    i45 = i29;
                                    i26 = i28;
                                    i15 = i9;
                                    i14 = i23;
                                    unsafe = unsafe2;
                                    i12 = i24;
                                    i17 = i26;
                                    i13 = i45;
                                    i39 = i21;
                                    i16 = i25;
                                    break;
                                } else {
                                    i25 = i27;
                                    i45 = i29;
                                    i26 = i28;
                                    unsafe2.putLong(obj, j, zzip.zzn(bArr2, i28));
                                    i34 = i26 + 8;
                                    i37 = i23 | i47;
                                    i32 = i8;
                                    i38 = i24;
                                    i35 = i45;
                                    i39 = i21;
                                    i36 = i25;
                                    i33 = i9;
                                    break;
                                }
                            case 6:
                            case 13:
                                i24 = i41;
                                i27 = i22;
                                i28 = i44;
                                i29 = i45;
                                bArr2 = bArr;
                                if (i42 != 5) {
                                    i25 = i27;
                                    i45 = i29;
                                    i26 = i28;
                                    i15 = i9;
                                    i14 = i23;
                                    unsafe = unsafe2;
                                    i12 = i24;
                                    i17 = i26;
                                    i13 = i45;
                                    i39 = i21;
                                    i16 = i25;
                                    break;
                                } else {
                                    unsafe2.putInt(obj4, j, zzip.zzb(bArr2, i28));
                                    int i49 = i28 + 4;
                                    i37 = i23 | i47;
                                    i36 = i27;
                                    i34 = i49;
                                    i38 = i24;
                                    i35 = i29;
                                    i39 = i21;
                                    i32 = i8;
                                    i33 = i9;
                                    break;
                                }
                            case 7:
                                i31 = i8;
                                i24 = i41;
                                i27 = i22;
                                i28 = i44;
                                i29 = i45;
                                bArr2 = bArr;
                                if (i42 != 0) {
                                    i25 = i27;
                                    i45 = i29;
                                    i26 = i28;
                                    i15 = i9;
                                    i14 = i23;
                                    unsafe = unsafe2;
                                    i12 = i24;
                                    i17 = i26;
                                    i13 = i45;
                                    i39 = i21;
                                    i16 = i25;
                                    break;
                                } else {
                                    int zzm2 = zzip.zzm(bArr2, i28, zzioVar3);
                                    zzmv.zzm(obj4, j, zzioVar3.zzb != 0);
                                    int i50 = i23 | i47;
                                    i36 = i27;
                                    i34 = zzm2;
                                    i39 = i21;
                                    i37 = i50;
                                    i38 = i24;
                                    i33 = i9;
                                    int i51 = i29;
                                    i32 = i31;
                                    i35 = i51;
                                    break;
                                }
                            case 8:
                                i31 = i8;
                                i24 = i41;
                                i27 = i22;
                                i28 = i44;
                                i29 = i45;
                                bArr2 = bArr;
                                if (i42 != 2) {
                                    i25 = i27;
                                    i45 = i29;
                                    i26 = i28;
                                    i15 = i9;
                                    i14 = i23;
                                    unsafe = unsafe2;
                                    i12 = i24;
                                    i17 = i26;
                                    i13 = i45;
                                    i39 = i21;
                                    i16 = i25;
                                    break;
                                } else {
                                    int zzg = (536870912 & i43) == 0 ? zzip.zzg(bArr2, i28, zzioVar3) : zzip.zzh(bArr2, i28, zzioVar3);
                                    unsafe2.putObject(obj4, j, zzioVar3.zzc);
                                    i37 = i23 | i47;
                                    i36 = i27;
                                    i34 = zzg;
                                    i38 = i24;
                                    i39 = i21;
                                    i33 = i9;
                                    int i512 = i29;
                                    i32 = i31;
                                    i35 = i512;
                                    break;
                                }
                            case 9:
                                i24 = i41;
                                i30 = i22;
                                i28 = i44;
                                i29 = i45;
                                bArr2 = bArr;
                                if (i42 != 2) {
                                    i25 = i30;
                                    i45 = i29;
                                    i26 = i28;
                                    i15 = i9;
                                    i14 = i23;
                                    unsafe = unsafe2;
                                    i12 = i24;
                                    i17 = i26;
                                    i13 = i45;
                                    i39 = i21;
                                    i16 = i25;
                                    break;
                                } else {
                                    i31 = i8;
                                    i34 = zzip.zzd(zzlmVar2.zzE(i30), bArr2, i28, i31, zzioVar3);
                                    if ((i23 & i47) == 0) {
                                        unsafe2.putObject(obj4, j, zzioVar3.zzc);
                                    } else {
                                        unsafe2.putObject(obj4, j, zzkk.zzg(unsafe2.getObject(obj4, j), zzioVar3.zzc));
                                    }
                                    i37 = i23 | i47;
                                    i36 = i30;
                                    i38 = i24;
                                    i39 = i21;
                                    i33 = i9;
                                    int i5122 = i29;
                                    i32 = i31;
                                    i35 = i5122;
                                    break;
                                }
                            case 10:
                                i24 = i41;
                                i30 = i22;
                                i28 = i44;
                                i29 = i45;
                                bArr2 = bArr;
                                if (i42 != 2) {
                                    i25 = i30;
                                    i45 = i29;
                                    i26 = i28;
                                    i15 = i9;
                                    i14 = i23;
                                    unsafe = unsafe2;
                                    i12 = i24;
                                    i17 = i26;
                                    i13 = i45;
                                    i39 = i21;
                                    i16 = i25;
                                    break;
                                } else {
                                    i34 = zzip.zza(bArr2, i28, zzioVar3);
                                    unsafe2.putObject(obj4, j, zzioVar3.zzc);
                                    i37 = i23 | i47;
                                    i36 = i30;
                                    i38 = i24;
                                    i35 = i29;
                                    i39 = i21;
                                    i32 = i8;
                                    i33 = i9;
                                    break;
                                }
                            case 12:
                                i24 = i41;
                                i30 = i22;
                                i28 = i44;
                                i29 = i45;
                                bArr2 = bArr;
                                if (i42 != 0) {
                                    i25 = i30;
                                    i45 = i29;
                                    i26 = i28;
                                    i15 = i9;
                                    i14 = i23;
                                    unsafe = unsafe2;
                                    i12 = i24;
                                    i17 = i26;
                                    i13 = i45;
                                    i39 = i21;
                                    i16 = i25;
                                    break;
                                } else {
                                    i34 = zzip.zzj(bArr2, i28, zzioVar3);
                                    int i52 = zzioVar3.zza;
                                    zzkg zzD = zzlmVar2.zzD(i30);
                                    if (zzD == null || zzD.zza(i52)) {
                                        unsafe2.putInt(obj4, j, i52);
                                        i37 = i23 | i47;
                                        i36 = i30;
                                        i38 = i24;
                                        i35 = i29;
                                        i39 = i21;
                                        i32 = i8;
                                        i33 = i9;
                                        break;
                                    } else {
                                        zzd(obj).zzh(i29, Long.valueOf(i52));
                                        i37 = i23;
                                        i36 = i30;
                                        i38 = i24;
                                        i35 = i29;
                                        i39 = i21;
                                        i32 = i8;
                                        i33 = i9;
                                    }
                                }
                                break;
                            case 15:
                                i24 = i41;
                                i30 = i22;
                                i28 = i44;
                                i29 = i45;
                                bArr2 = bArr;
                                if (i42 != 0) {
                                    i25 = i30;
                                    i45 = i29;
                                    i26 = i28;
                                    i15 = i9;
                                    i14 = i23;
                                    unsafe = unsafe2;
                                    i12 = i24;
                                    i17 = i26;
                                    i13 = i45;
                                    i39 = i21;
                                    i16 = i25;
                                    break;
                                } else {
                                    i34 = zzip.zzj(bArr2, i28, zzioVar3);
                                    unsafe2.putInt(obj4, j, zzjf.zzb(zzioVar3.zza));
                                    i37 = i23 | i47;
                                    i36 = i30;
                                    i38 = i24;
                                    i35 = i29;
                                    i39 = i21;
                                    i32 = i8;
                                    i33 = i9;
                                    break;
                                }
                            case 16:
                                i24 = i41;
                                int i53 = i22;
                                if (i42 != 0) {
                                    i45 = i45;
                                    i26 = i44;
                                    i25 = i53;
                                    i15 = i9;
                                    i14 = i23;
                                    unsafe = unsafe2;
                                    i12 = i24;
                                    i17 = i26;
                                    i13 = i45;
                                    i39 = i21;
                                    i16 = i25;
                                    break;
                                } else {
                                    bArr2 = bArr;
                                    int zzm3 = zzip.zzm(bArr2, i44, zzioVar3);
                                    i29 = i45;
                                    unsafe2.putLong(obj, j, zzjf.zzc(zzioVar3.zzb));
                                    i37 = i23 | i47;
                                    i36 = i53;
                                    i34 = zzm3;
                                    i38 = i24;
                                    i35 = i29;
                                    i39 = i21;
                                    i32 = i8;
                                    i33 = i9;
                                    break;
                                }
                            default:
                                if (i42 != 3) {
                                    i24 = i41;
                                    i25 = i22;
                                    i26 = i44;
                                    i15 = i9;
                                    i14 = i23;
                                    unsafe = unsafe2;
                                    i12 = i24;
                                    i17 = i26;
                                    i13 = i45;
                                    i39 = i21;
                                    i16 = i25;
                                    break;
                                } else {
                                    int i54 = i22;
                                    i34 = zzip.zzc(zzlmVar2.zzE(i54), bArr, i44, i8, (i41 << 3) | 4, zzioVar);
                                    if ((i23 & i47) == 0) {
                                        unsafe2.putObject(obj4, j, zzioVar3.zzc);
                                    } else {
                                        unsafe2.putObject(obj4, j, zzkk.zzg(unsafe2.getObject(obj4, j), zzioVar3.zzc));
                                    }
                                    i37 = i23 | i47;
                                    bArr2 = bArr;
                                    i32 = i8;
                                    i36 = i54;
                                    i35 = i45;
                                    i38 = i41;
                                    i39 = i21;
                                    i33 = i9;
                                    break;
                                }
                        }
                    } else {
                        bArr2 = bArr;
                        if (zzA != 27) {
                            i14 = i37;
                            i19 = i39;
                            i16 = zzx;
                            if (zzA <= 49) {
                                i12 = i41;
                                unsafe = unsafe2;
                                i34 = zzv(obj, bArr, i44, i8, i45, i12, i42, i16, i43, zzA, j, zzioVar);
                            } else {
                                i12 = i41;
                                unsafe = unsafe2;
                                i20 = i44;
                                if (zzA != 50) {
                                    i34 = zzt(obj, bArr, i20, i8, i45, i12, i42, i43, zzA, j, i16, zzioVar);
                                } else if (i42 == 2) {
                                    i34 = zzs(obj, bArr, i20, i8, i16, j, zzioVar);
                                }
                            }
                        } else if (i42 == 2) {
                            zzkj zzkjVar = (zzkj) unsafe2.getObject(obj4, j);
                            if (!zzkjVar.zzc()) {
                                int size = zzkjVar.size();
                                zzkjVar = zzkjVar.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj4, j, zzkjVar);
                            }
                            i35 = i45;
                            i21 = i39;
                            i34 = zzip.zze(zzlmVar2.zzE(zzx), i35, bArr, i44, i8, zzkjVar, zzioVar);
                            i32 = i8;
                            i36 = zzx;
                            i38 = i41;
                            i37 = i37;
                            i39 = i21;
                            i33 = i9;
                        } else {
                            i14 = i37;
                            i19 = i39;
                            i12 = i41;
                            unsafe = unsafe2;
                            i20 = i44;
                            i16 = zzx;
                        }
                        i15 = i9;
                        i17 = i20;
                        i13 = i45;
                        i39 = i19;
                    }
                }
                if (i13 != i15 || i15 == 0) {
                    int i55 = i15;
                    if (this.zzh) {
                        zzioVar2 = zzioVar;
                        if (zzioVar2.zzd != zzjo.zza()) {
                            i18 = i12;
                            if (zzioVar2.zzd.zzc(this.zzg, i18) != null) {
                                throw null;
                            }
                            i34 = zzip.zzi(i13, bArr, i17, i8, zzd(obj), zzioVar);
                            obj3 = obj;
                            i32 = i8;
                            i35 = i13;
                            zzlmVar2 = this;
                            i38 = i18;
                            obj4 = obj3;
                            i37 = i14;
                            i36 = i16;
                            bArr2 = bArr;
                            i33 = i55;
                            zzioVar3 = zzioVar2;
                            unsafe2 = unsafe;
                        } else {
                            obj3 = obj;
                            i18 = i12;
                        }
                    } else {
                        obj3 = obj;
                        i18 = i12;
                        zzioVar2 = zzioVar;
                    }
                    i34 = zzip.zzi(i13, bArr, i17, i8, zzd(obj), zzioVar);
                    i32 = i8;
                    i35 = i13;
                    zzlmVar2 = this;
                    i38 = i18;
                    obj4 = obj3;
                    i37 = i14;
                    i36 = i16;
                    bArr2 = bArr;
                    i33 = i55;
                    zzioVar3 = zzioVar2;
                    unsafe2 = unsafe;
                } else {
                    zzlmVar = this;
                    obj2 = obj;
                    i10 = i15;
                    i34 = i17;
                    i35 = i13;
                    i37 = i14;
                }
            } else {
                unsafe = unsafe2;
                i10 = i33;
                obj2 = obj4;
                zzlmVar = zzlmVar2;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final Object zze() {
        return ((zzkc) this.zzg).zzl(4, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzf(Object obj) {
        int i7;
        int i8 = this.zzk;
        while (true) {
            i7 = this.zzl;
            if (i8 >= i7) {
                break;
            }
            long zzB = zzB(this.zzj[i8]) & 1048575;
            Object zzf = zzmv.zzf(obj, zzB);
            if (zzf != null) {
                ((zzld) zzf).zzc();
                zzmv.zzs(obj, zzB, zzf);
            }
            i8++;
        }
        int length = this.zzj.length;
        while (i7 < length) {
            this.zzm.zza(obj, this.zzj[i7]);
            i7++;
        }
        this.zzn.zzg(obj);
        if (this.zzh) {
            this.zzo.zzb(obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzg(Object obj, Object obj2) {
        obj2.getClass();
        for (int i7 = 0; i7 < this.zzc.length; i7 += 3) {
            int zzB = zzB(i7);
            long j = 1048575 & zzB;
            int i8 = this.zzc[i7];
            switch (zzA(zzB)) {
                case 0:
                    if (zzO(obj2, i7)) {
                        zzmv.zzo(obj, j, zzmv.zza(obj2, j));
                        zzJ(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(obj2, i7)) {
                        zzmv.zzp(obj, j, zzmv.zzb(obj2, j));
                        zzJ(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(obj2, i7)) {
                        zzmv.zzr(obj, j, zzmv.zzd(obj2, j));
                        zzJ(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(obj2, i7)) {
                        zzmv.zzr(obj, j, zzmv.zzd(obj2, j));
                        zzJ(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(obj2, i7)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(obj2, i7)) {
                        zzmv.zzr(obj, j, zzmv.zzd(obj2, j));
                        zzJ(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(obj2, i7)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(obj2, i7)) {
                        zzmv.zzm(obj, j, zzmv.zzw(obj2, j));
                        zzJ(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzO(obj2, i7)) {
                        zzmv.zzs(obj, j, zzmv.zzf(obj2, j));
                        zzJ(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzH(obj, obj2, i7);
                    break;
                case 10:
                    if (zzO(obj2, i7)) {
                        zzmv.zzs(obj, j, zzmv.zzf(obj2, j));
                        zzJ(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(obj2, i7)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzO(obj2, i7)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(obj2, i7)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(obj2, i7)) {
                        zzmv.zzr(obj, j, zzmv.zzd(obj2, j));
                        zzJ(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(obj2, i7)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzO(obj2, i7)) {
                        zzmv.zzr(obj, j, zzmv.zzd(obj2, j));
                        zzJ(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzH(obj, obj2, i7);
                    break;
                case 18:
                case 19:
                case 20:
                case zzbbd.zzt.zzm /* 21 */:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzm.zzb(obj, obj2, j);
                    break;
                case 50:
                    zzlw.zzaa(this.zzq, obj, obj2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzR(obj2, i8, i7)) {
                        zzmv.zzs(obj, j, zzmv.zzf(obj2, j));
                        zzK(obj, i8, i7);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzI(obj, obj2, i7);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i8, i7)) {
                        zzmv.zzs(obj, j, zzmv.zzf(obj2, j));
                        zzK(obj, i8, i7);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzI(obj, obj2, i7);
                    break;
            }
        }
        zzlw.zzF(this.zzn, obj, obj2);
        if (this.zzh) {
            zzlw.zzE(this.zzo, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzh(Object obj, byte[] bArr, int i7, int i8, zzio zzioVar) {
        if (this.zzi) {
            zzu(obj, bArr, i7, i8, zzioVar);
        } else {
            zzc(obj, bArr, i7, i8, 0, zzioVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzi(Object obj, zznd zzndVar) {
        if (!this.zzi) {
            zzL(obj, zzndVar);
            return;
        }
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        for (int i7 = 0; i7 < length; i7 += 3) {
            int zzB = zzB(i7);
            int i8 = this.zzc[i7];
            switch (zzA(zzB)) {
                case 0:
                    if (zzO(obj, i7)) {
                        zzndVar.zzf(i8, zzmv.zza(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(obj, i7)) {
                        zzndVar.zzo(i8, zzmv.zzb(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(obj, i7)) {
                        zzndVar.zzt(i8, zzmv.zzd(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(obj, i7)) {
                        zzndVar.zzJ(i8, zzmv.zzd(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(obj, i7)) {
                        zzndVar.zzr(i8, zzmv.zzc(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(obj, i7)) {
                        zzndVar.zzm(i8, zzmv.zzd(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(obj, i7)) {
                        zzndVar.zzk(i8, zzmv.zzc(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(obj, i7)) {
                        zzndVar.zzb(i8, zzmv.zzw(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzO(obj, i7)) {
                        zzT(i8, zzmv.zzf(obj, zzB & 1048575), zzndVar);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (zzO(obj, i7)) {
                        zzndVar.zzv(i8, zzmv.zzf(obj, zzB & 1048575), zzE(i7));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzO(obj, i7)) {
                        zzndVar.zzd(i8, (zzjb) zzmv.zzf(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(obj, i7)) {
                        zzndVar.zzH(i8, zzmv.zzc(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzO(obj, i7)) {
                        zzndVar.zzi(i8, zzmv.zzc(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(obj, i7)) {
                        zzndVar.zzw(i8, zzmv.zzc(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(obj, i7)) {
                        zzndVar.zzy(i8, zzmv.zzd(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(obj, i7)) {
                        zzndVar.zzA(i8, zzmv.zzc(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzO(obj, i7)) {
                        zzndVar.zzC(i8, zzmv.zzd(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzO(obj, i7)) {
                        zzndVar.zzq(i8, zzmv.zzf(obj, zzB & 1048575), zzE(i7));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzlw.zzJ(i8, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 19:
                    zzlw.zzN(i8, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 20:
                    zzlw.zzQ(i8, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case zzbbd.zzt.zzm /* 21 */:
                    zzlw.zzY(i8, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 22:
                    zzlw.zzP(i8, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 23:
                    zzlw.zzM(i8, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 24:
                    zzlw.zzL(i8, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 25:
                    zzlw.zzH(i8, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 26:
                    zzlw.zzW(i8, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar);
                    break;
                case 27:
                    zzlw.zzR(i8, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, zzE(i7));
                    break;
                case 28:
                    zzlw.zzI(i8, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar);
                    break;
                case 29:
                    zzlw.zzX(i8, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 30:
                    zzlw.zzK(i8, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 31:
                    zzlw.zzS(i8, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 32:
                    zzlw.zzT(i8, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 33:
                    zzlw.zzU(i8, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 34:
                    zzlw.zzV(i8, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 35:
                    zzlw.zzJ(i8, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 36:
                    zzlw.zzN(i8, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 37:
                    zzlw.zzQ(i8, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 38:
                    zzlw.zzY(i8, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 39:
                    zzlw.zzP(i8, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 40:
                    zzlw.zzM(i8, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 41:
                    zzlw.zzL(i8, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 42:
                    zzlw.zzH(i8, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 43:
                    zzlw.zzX(i8, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 44:
                    zzlw.zzK(i8, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 45:
                    zzlw.zzS(i8, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 46:
                    zzlw.zzT(i8, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 47:
                    zzlw.zzU(i8, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 48:
                    zzlw.zzV(i8, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 49:
                    zzlw.zzO(i8, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, zzE(i7));
                    break;
                case 50:
                    zzM(zzndVar, i8, zzmv.zzf(obj, zzB & 1048575), i7);
                    break;
                case 51:
                    if (zzR(obj, i8, i7)) {
                        zzndVar.zzf(i8, zzn(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i8, i7)) {
                        zzndVar.zzo(i8, zzo(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i8, i7)) {
                        zzndVar.zzt(i8, zzC(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i8, i7)) {
                        zzndVar.zzJ(i8, zzC(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i8, i7)) {
                        zzndVar.zzr(i8, zzr(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i8, i7)) {
                        zzndVar.zzm(i8, zzC(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i8, i7)) {
                        zzndVar.zzk(i8, zzr(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i8, i7)) {
                        zzndVar.zzb(i8, zzS(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i8, i7)) {
                        zzT(i8, zzmv.zzf(obj, zzB & 1048575), zzndVar);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i8, i7)) {
                        zzndVar.zzv(i8, zzmv.zzf(obj, zzB & 1048575), zzE(i7));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i8, i7)) {
                        zzndVar.zzd(i8, (zzjb) zzmv.zzf(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i8, i7)) {
                        zzndVar.zzH(i8, zzr(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i8, i7)) {
                        zzndVar.zzi(i8, zzr(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i8, i7)) {
                        zzndVar.zzw(i8, zzr(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i8, i7)) {
                        zzndVar.zzy(i8, zzC(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i8, i7)) {
                        zzndVar.zzA(i8, zzr(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i8, i7)) {
                        zzndVar.zzC(i8, zzC(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i8, i7)) {
                        zzndVar.zzq(i8, zzmv.zzf(obj, zzB & 1048575), zzE(i7));
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzml zzmlVar = this.zzn;
        zzmlVar.zzi(zzmlVar.zzc(obj), zzndVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzZ;
        int length = this.zzc.length;
        for (int i7 = 0; i7 < length; i7 += 3) {
            int zzB = zzB(i7);
            long j = zzB & 1048575;
            switch (zzA(zzB)) {
                case 0:
                    if (zzN(obj, obj2, i7) && Double.doubleToLongBits(zzmv.zza(obj, j)) == Double.doubleToLongBits(zzmv.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzN(obj, obj2, i7) && Float.floatToIntBits(zzmv.zzb(obj, j)) == Float.floatToIntBits(zzmv.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzN(obj, obj2, i7) && zzmv.zzd(obj, j) == zzmv.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzN(obj, obj2, i7) && zzmv.zzd(obj, j) == zzmv.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzN(obj, obj2, i7) && zzmv.zzc(obj, j) == zzmv.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzN(obj, obj2, i7) && zzmv.zzd(obj, j) == zzmv.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzN(obj, obj2, i7) && zzmv.zzc(obj, j) == zzmv.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzN(obj, obj2, i7) && zzmv.zzw(obj, j) == zzmv.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzN(obj, obj2, i7) && zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzN(obj, obj2, i7) && zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzN(obj, obj2, i7) && zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzN(obj, obj2, i7) && zzmv.zzc(obj, j) == zzmv.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzN(obj, obj2, i7) && zzmv.zzc(obj, j) == zzmv.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzN(obj, obj2, i7) && zzmv.zzc(obj, j) == zzmv.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzN(obj, obj2, i7) && zzmv.zzd(obj, j) == zzmv.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzN(obj, obj2, i7) && zzmv.zzc(obj, j) == zzmv.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzN(obj, obj2, i7) && zzmv.zzd(obj, j) == zzmv.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzN(obj, obj2, i7) && zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case zzbbd.zzt.zzm /* 21 */:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzZ = zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j));
                    break;
                case 50:
                    zzZ = zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zzy = zzy(i7) & 1048575;
                    if (zzmv.zzc(obj, zzy) == zzmv.zzc(obj2, zzy) && zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzZ) {
                return false;
            }
        }
        if (!this.zzn.zzc(obj).equals(this.zzn.zzc(obj2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        this.zzo.zza(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final boolean zzk(Object obj) {
        int i7;
        int i8;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        while (i11 < this.zzk) {
            int i12 = this.zzj[i11];
            int i13 = this.zzc[i12];
            int zzB = zzB(i12);
            int i14 = this.zzc[i12 + 2];
            int i15 = i14 & 1048575;
            int i16 = 1 << (i14 >>> 20);
            if (i15 != i9) {
                if (i15 != 1048575) {
                    i10 = zzb.getInt(obj, i15);
                }
                i8 = i10;
                i7 = i15;
            } else {
                i7 = i9;
                i8 = i10;
            }
            if ((268435456 & zzB) != 0 && !zzP(obj, i12, i7, i8, i16)) {
                return false;
            }
            int zzA = zzA(zzB);
            if (zzA != 9 && zzA != 17) {
                if (zzA != 27) {
                    if (zzA == 60 || zzA == 68) {
                        if (zzR(obj, i13, i12) && !zzQ(obj, zzB, zzE(i12))) {
                            return false;
                        }
                    } else if (zzA != 49) {
                        if (zzA == 50 && !((zzld) zzmv.zzf(obj, zzB & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzmv.zzf(obj, zzB & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzlu zzE = zzE(i12);
                    for (int i17 = 0; i17 < list.size(); i17++) {
                        if (!zzE.zzk(list.get(i17))) {
                            return false;
                        }
                    }
                }
            } else if (zzP(obj, i12, i7, i8, i16) && !zzQ(obj, zzB, zzE(i12))) {
                return false;
            }
            i11++;
            i9 = i7;
            i10 = i8;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        throw null;
    }
}
