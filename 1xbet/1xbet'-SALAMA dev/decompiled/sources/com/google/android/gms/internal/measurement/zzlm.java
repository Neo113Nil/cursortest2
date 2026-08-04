package com.google.android.gms.internal.measurement;

import W5.AbstractC0486a1;
import com.google.android.gms.internal.ads.zzbbd;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import p031e1.k;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
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
        zzlu zzluVarZzb = zzlr.zza().zzb((Class) this.zzd[i9 + 1]);
        this.zzd[i9] = zzluVarZzb;
        return zzluVarZzb;
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
            String string = Arrays.toString(declaredFields);
            StringBuilder sbL = k.l("Field ", str, " for ", name, " not found. Known fields are ");
            sbL.append(string);
            throw new RuntimeException(sbL.toString());
        }
    }

    private final void zzH(Object obj, Object obj2, int i7) {
        long jZzB = zzB(i7) & 1048575;
        if (zzO(obj2, i7)) {
            Object objZzf = zzmv.zzf(obj, jZzB);
            Object objZzf2 = zzmv.zzf(obj2, jZzB);
            if (objZzf != null && objZzf2 != null) {
                zzmv.zzs(obj, jZzB, zzkk.zzg(objZzf, objZzf2));
                zzJ(obj, i7);
            } else if (objZzf2 != null) {
                zzmv.zzs(obj, jZzB, objZzf2);
                zzJ(obj, i7);
            }
        }
    }

    private final void zzI(Object obj, Object obj2, int i7) {
        int iZzB = zzB(i7);
        int i8 = this.zzc[i7];
        long j = iZzB & 1048575;
        if (zzR(obj2, i8, i7)) {
            Object objZzf = zzR(obj, i8, i7) ? zzmv.zzf(obj, j) : null;
            Object objZzf2 = zzmv.zzf(obj2, j);
            if (objZzf != null && objZzf2 != null) {
                zzmv.zzs(obj, j, zzkk.zzg(objZzf, objZzf2));
                zzK(obj, i8, i7);
            } else if (objZzf2 != null) {
                zzmv.zzs(obj, j, objZzf2);
                zzK(obj, i8, i7);
            }
        }
    }

    private final void zzJ(Object obj, int i7) {
        int iZzy = zzy(i7);
        long j = 1048575 & iZzy;
        if (j == 1048575) {
            return;
        }
        zzmv.zzq(obj, j, (1 << (iZzy >>> 20)) | zzmv.zzc(obj, j));
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
            int iZzB = zzB(i10);
            int[] iArr = this.zzc;
            int i12 = iArr[i10];
            int iZzA = zzA(iZzB);
            if (iZzA <= 17) {
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
            long j = iZzB & i8;
            switch (iZzA) {
                case 0:
                    if ((i11 & i7) != 0) {
                        zzndVar.zzf(i12, zzmv.zza(obj, j));
                    }
                    break;
                case 1:
                    if ((i11 & i7) != 0) {
                        zzndVar.zzo(i12, zzmv.zzb(obj, j));
                    }
                    break;
                case 2:
                    if ((i11 & i7) != 0) {
                        zzndVar.zzt(i12, unsafe.getLong(obj, j));
                    }
                    break;
                case 3:
                    if ((i11 & i7) != 0) {
                        zzndVar.zzJ(i12, unsafe.getLong(obj, j));
                    }
                    break;
                case 4:
                    if ((i11 & i7) != 0) {
                        zzndVar.zzr(i12, unsafe.getInt(obj, j));
                    }
                    break;
                case 5:
                    if ((i11 & i7) != 0) {
                        zzndVar.zzm(i12, unsafe.getLong(obj, j));
                    }
                    break;
                case 6:
                    if ((i11 & i7) != 0) {
                        zzndVar.zzk(i12, unsafe.getInt(obj, j));
                    }
                    break;
                case 7:
                    if ((i11 & i7) != 0) {
                        zzndVar.zzb(i12, zzmv.zzw(obj, j));
                    }
                    break;
                case 8:
                    if ((i11 & i7) != 0) {
                        zzT(i12, unsafe.getObject(obj, j), zzndVar);
                    }
                    break;
                case 9:
                    if ((i11 & i7) != 0) {
                        zzndVar.zzv(i12, unsafe.getObject(obj, j), zzE(i10));
                    }
                    break;
                case 10:
                    if ((i11 & i7) != 0) {
                        zzndVar.zzd(i12, (zzjb) unsafe.getObject(obj, j));
                    }
                    break;
                case 11:
                    if ((i11 & i7) != 0) {
                        zzndVar.zzH(i12, unsafe.getInt(obj, j));
                    }
                    break;
                case 12:
                    if ((i11 & i7) != 0) {
                        zzndVar.zzi(i12, unsafe.getInt(obj, j));
                    }
                    break;
                case 13:
                    if ((i11 & i7) != 0) {
                        zzndVar.zzw(i12, unsafe.getInt(obj, j));
                    }
                    break;
                case 14:
                    if ((i11 & i7) != 0) {
                        zzndVar.zzy(i12, unsafe.getLong(obj, j));
                    }
                    break;
                case 15:
                    if ((i11 & i7) != 0) {
                        zzndVar.zzA(i12, unsafe.getInt(obj, j));
                    }
                    break;
                case 16:
                    if ((i11 & i7) != 0) {
                        zzndVar.zzC(i12, unsafe.getLong(obj, j));
                    }
                    break;
                case 17:
                    if ((i11 & i7) != 0) {
                        zzndVar.zzq(i12, unsafe.getObject(obj, j), zzE(i10));
                    }
                    break;
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
                default:
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
        int iZzy = zzy(i7);
        long j = iZzy & 1048575;
        if (j != 1048575) {
            return (zzmv.zzc(obj, j) & (1 << (iZzy >>> 20))) != 0;
        }
        int iZzB = zzB(i7);
        long j3 = iZzB & 1048575;
        switch (zzA(iZzB)) {
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
                Object objZzf = zzmv.zzf(obj, j3);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzjb) {
                    return !zzjb.zzb.equals(objZzf);
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
        if (i8 == 1048575) {
            return zzO(obj, i7);
        }
        return (i9 & i10) != 0;
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
        zzmm zzmmVarZze = zzmm.zze();
        zzkcVar.zzc = zzmmVarZze;
        return zzmmVarZze;
    }

    public static zzlm zzl(Class cls, zzlg zzlgVar, zzlo zzloVar, zzkx zzkxVar, zzml zzmlVar, zzjp zzjpVar, zzle zzleVar) {
        if (zzlgVar instanceof zzlt) {
            return zzm((zzlt) zzlgVar, zzloVar, zzkxVar, zzmlVar, zzjpVar, zzleVar);
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x025f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0265  */
    /* JADX WARN: Code duplicated, block: B:128:0x027b  */
    /* JADX WARN: Code duplicated, block: B:130:0x027f  */
    /* JADX WARN: Code duplicated, block: B:164:0x0332  */
    /* JADX WARN: Code duplicated, block: B:180:0x0381  */
    /* JADX WARN: Code duplicated, block: B:183:0x038a  */
    public static zzlm zzm(zzlt zzltVar, zzlo zzloVar, zzkx zzkxVar, zzml zzmlVar, zzjp zzjpVar, zzle zzleVar) {
        int i7;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int[] iArr;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        char cCharAt;
        int i13;
        char cCharAt2;
        int i14;
        char cCharAt3;
        int i15;
        char cCharAt4;
        int i16;
        char cCharAt5;
        int i17;
        char cCharAt6;
        int i18;
        char cCharAt7;
        int i19;
        char cCharAt8;
        int i20;
        int i21;
        int i22;
        int[] iArr2;
        int i23;
        int i24;
        int i25;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        Object[] objArr;
        int i26;
        int i27;
        Field fieldZzG;
        char cCharAt9;
        int i28;
        int i29;
        int i30;
        int i31;
        Object obj;
        Field fieldZzG2;
        int i32;
        Object obj2;
        Field fieldZzG3;
        int i33;
        char cCharAt10;
        int i34;
        char cCharAt11;
        int i35;
        char cCharAt12;
        int i36;
        char cCharAt13;
        boolean z4 = zzltVar.zzc() == 2;
        String strZzd = zzltVar.zzd();
        int length = strZzd.length();
        char c3 = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i37 = 1;
            while (true) {
                i7 = i37 + 1;
                if (strZzd.charAt(i37) < 55296) {
                    break;
                }
                i37 = i7;
            }
        } else {
            i7 = 1;
        }
        int i38 = i7 + 1;
        int iCharAt4 = strZzd.charAt(i7);
        if (iCharAt4 >= 55296) {
            int i39 = iCharAt4 & 8191;
            int i40 = 13;
            while (true) {
                i36 = i38 + 1;
                cCharAt13 = strZzd.charAt(i38);
                if (cCharAt13 < 55296) {
                    break;
                }
                i39 |= (cCharAt13 & 8191) << i40;
                i40 += 13;
                i38 = i36;
            }
            iCharAt4 = i39 | (cCharAt13 << i40);
            i38 = i36;
        }
        if (iCharAt4 == 0) {
            iCharAt = 0;
            i11 = 0;
            iCharAt2 = 0;
            i10 = 0;
            iCharAt3 = 0;
            i8 = 0;
            iArr = zza;
            i9 = 0;
        } else {
            int i41 = i38 + 1;
            int iCharAt5 = strZzd.charAt(i38);
            if (iCharAt5 >= 55296) {
                int i42 = iCharAt5 & 8191;
                int i43 = 13;
                while (true) {
                    i19 = i41 + 1;
                    cCharAt8 = strZzd.charAt(i41);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt8 & 8191) << i43;
                    i43 += 13;
                    i41 = i19;
                }
                iCharAt5 = i42 | (cCharAt8 << i43);
                i41 = i19;
            }
            int i44 = i41 + 1;
            int iCharAt6 = strZzd.charAt(i41);
            if (iCharAt6 >= 55296) {
                int i45 = iCharAt6 & 8191;
                int i46 = 13;
                while (true) {
                    i18 = i44 + 1;
                    cCharAt7 = strZzd.charAt(i44);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt7 & 8191) << i46;
                    i46 += 13;
                    i44 = i18;
                }
                iCharAt6 = i45 | (cCharAt7 << i46);
                i44 = i18;
            }
            int i47 = i44 + 1;
            iCharAt = strZzd.charAt(i44);
            if (iCharAt >= 55296) {
                int i48 = iCharAt & 8191;
                int i49 = 13;
                while (true) {
                    i17 = i47 + 1;
                    cCharAt6 = strZzd.charAt(i47);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt6 & 8191) << i49;
                    i49 += 13;
                    i47 = i17;
                }
                iCharAt = i48 | (cCharAt6 << i49);
                i47 = i17;
            }
            int i50 = i47 + 1;
            int iCharAt7 = strZzd.charAt(i47);
            if (iCharAt7 >= 55296) {
                int i51 = iCharAt7 & 8191;
                int i52 = 13;
                while (true) {
                    i16 = i50 + 1;
                    cCharAt5 = strZzd.charAt(i50);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt5 & 8191) << i52;
                    i52 += 13;
                    i50 = i16;
                }
                iCharAt7 = i51 | (cCharAt5 << i52);
                i50 = i16;
            }
            int i53 = i50 + 1;
            iCharAt2 = strZzd.charAt(i50);
            if (iCharAt2 >= 55296) {
                int i54 = iCharAt2 & 8191;
                int i55 = 13;
                while (true) {
                    i15 = i53 + 1;
                    cCharAt4 = strZzd.charAt(i53);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt4 & 8191) << i55;
                    i55 += 13;
                    i53 = i15;
                }
                iCharAt2 = i54 | (cCharAt4 << i55);
                i53 = i15;
            }
            int i56 = i53 + 1;
            int iCharAt8 = strZzd.charAt(i53);
            if (iCharAt8 >= 55296) {
                int i57 = iCharAt8 & 8191;
                int i58 = 13;
                while (true) {
                    i14 = i56 + 1;
                    cCharAt3 = strZzd.charAt(i56);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt3 & 8191) << i58;
                    i58 += 13;
                    i56 = i14;
                }
                iCharAt8 = i57 | (cCharAt3 << i58);
                i56 = i14;
            }
            int i59 = i56 + 1;
            int iCharAt9 = strZzd.charAt(i56);
            if (iCharAt9 >= 55296) {
                int i60 = iCharAt9 & 8191;
                int i61 = 13;
                while (true) {
                    i13 = i59 + 1;
                    cCharAt2 = strZzd.charAt(i59);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i60 |= (cCharAt2 & 8191) << i61;
                    i61 += 13;
                    i59 = i13;
                }
                iCharAt9 = i60 | (cCharAt2 << i61);
                i59 = i13;
            }
            int i62 = i59 + 1;
            iCharAt3 = strZzd.charAt(i59);
            if (iCharAt3 >= 55296) {
                int i63 = iCharAt3 & 8191;
                int i64 = 13;
                while (true) {
                    i12 = i62 + 1;
                    cCharAt = strZzd.charAt(i62);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i63 |= (cCharAt & 8191) << i64;
                    i64 += 13;
                    i62 = i12;
                }
                iCharAt3 = i63 | (cCharAt << i64);
                i62 = i12;
            }
            iArr = new int[iCharAt3 + iCharAt8 + iCharAt9];
            i8 = iCharAt5 + iCharAt5 + iCharAt6;
            i9 = iCharAt5;
            i38 = i62;
            int i65 = iCharAt8;
            i10 = iCharAt7;
            i11 = i65;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzltVar.zze();
        Class<?> cls = zzltVar.zza().getClass();
        int[] iArr3 = new int[iCharAt2 * 3];
        Object[] objArr2 = new Object[iCharAt2 + iCharAt2];
        int i66 = iCharAt3 + i11;
        int i67 = iCharAt3;
        int i68 = i66;
        int i69 = 0;
        int i70 = 0;
        while (i38 < length) {
            int i71 = i38 + 1;
            int iCharAt10 = strZzd.charAt(i38);
            if (iCharAt10 >= c3) {
                int i72 = iCharAt10 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i35 = i73 + 1;
                    cCharAt12 = strZzd.charAt(i73);
                    if (cCharAt12 < c3) {
                        break;
                    }
                    i72 |= (cCharAt12 & 8191) << i74;
                    i74 += 13;
                    i73 = i35;
                }
                iCharAt10 = i72 | (cCharAt12 << i74);
                i20 = i35;
            } else {
                i20 = i71;
            }
            int i75 = i20 + 1;
            int iCharAt11 = strZzd.charAt(i20);
            if (iCharAt11 >= c3) {
                int i76 = iCharAt11 & 8191;
                int i77 = i75;
                int i78 = 13;
                while (true) {
                    i34 = i77 + 1;
                    cCharAt11 = strZzd.charAt(i77);
                    i21 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i76 |= (cCharAt11 & 8191) << i78;
                    i78 += 13;
                    i77 = i34;
                    length = i21;
                }
                iCharAt11 = i76 | (cCharAt11 << i78);
                i22 = i34;
            } else {
                i21 = length;
                i22 = i75;
            }
            int i79 = iCharAt11 & 255;
            int i80 = iCharAt3;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i70] = i69;
                i70++;
            }
            if (i79 >= 51) {
                int i81 = i22 + 1;
                int iCharAt12 = strZzd.charAt(i22);
                if (iCharAt12 >= 55296) {
                    int i82 = iCharAt12 & 8191;
                    int i83 = i81;
                    int i84 = 13;
                    while (true) {
                        i33 = i83 + 1;
                        cCharAt10 = strZzd.charAt(i83);
                        i24 = i10;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i82 |= (cCharAt10 & 8191) << i84;
                        i84 += 13;
                        i83 = i33;
                        i10 = i24;
                    }
                    iCharAt12 = i82 | (cCharAt10 << i84);
                    i29 = i33;
                } else {
                    i24 = i10;
                    i29 = i81;
                }
                int i85 = i79 - 51;
                int i86 = i29;
                if (i85 == 9 || i85 == 17) {
                    int i87 = i69 / 3;
                    i30 = i8 + 1;
                    objArr2[i87 + i87 + 1] = objArrZze[i8];
                } else {
                    if (i85 == 12 && !z4) {
                        int i88 = i69 / 3;
                        i30 = i8 + 1;
                        objArr2[i88 + i88 + 1] = objArrZze[i8];
                    }
                    i31 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i31];
                    if (obj instanceof Field) {
                        fieldZzG2 = (Field) obj;
                    } else {
                        fieldZzG2 = zzG(cls, (String) obj);
                        objArrZze[i31] = fieldZzG2;
                    }
                    iArr2 = iArr3;
                    i23 = iCharAt;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzG2);
                    i32 = i31 + 1;
                    obj2 = objArrZze[i32];
                    if (obj2 instanceof Field) {
                        fieldZzG3 = (Field) obj2;
                    } else {
                        fieldZzG3 = zzG(cls, (String) obj2);
                        objArrZze[i32] = fieldZzG3;
                    }
                    objArr = objArr2;
                    i25 = i8;
                    i26 = i86;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzG3);
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i27 = 0;
                }
                i8 = i30;
                i31 = iCharAt12 + iCharAt12;
                obj = objArrZze[i31];
                if (obj instanceof Field) {
                    fieldZzG2 = (Field) obj;
                } else {
                    fieldZzG2 = zzG(cls, (String) obj);
                    objArrZze[i31] = fieldZzG2;
                }
                iArr2 = iArr3;
                i23 = iCharAt;
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZzG2);
                i32 = i31 + 1;
                obj2 = objArrZze[i32];
                if (obj2 instanceof Field) {
                    fieldZzG3 = (Field) obj2;
                } else {
                    fieldZzG3 = zzG(cls, (String) obj2);
                    objArrZze[i32] = fieldZzG3;
                }
                objArr = objArr2;
                i25 = i8;
                i26 = i86;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzG3);
                iObjectFieldOffset = iObjectFieldOffset4;
                i27 = 0;
            } else {
                iArr2 = iArr3;
                i23 = iCharAt;
                i24 = i10;
                int i89 = i8 + 1;
                Field fieldZzG4 = zzG(cls, (String) objArrZze[i8]);
                if (i79 == 9 || i79 == 17) {
                    int i90 = i69 / 3;
                    objArr2[i90 + i90 + 1] = fieldZzG4.getType();
                } else {
                    if (i79 == 27 || i79 == 49) {
                        int i91 = i69 / 3;
                        i28 = i8 + 2;
                        objArr2[i91 + i91 + 1] = objArrZze[i89];
                    } else if (i79 == 12 || i79 == 30 || i79 == 44) {
                        if (!z4) {
                            int i92 = i69 / 3;
                            i28 = i8 + 2;
                            objArr2[i92 + i92 + 1] = objArrZze[i89];
                        }
                    } else if (i79 == 50) {
                        int i93 = i67 + 1;
                        iArr[i67] = i69;
                        int i94 = i69 / 3;
                        int i95 = i94 + i94;
                        int i96 = i8 + 2;
                        objArr2[i95] = objArrZze[i89];
                        if ((iCharAt11 & 2048) != 0) {
                            i89 = i8 + 3;
                            objArr2[i95 + 1] = objArrZze[i96];
                            i67 = i93;
                        } else {
                            i67 = i93;
                            i25 = i96;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzG4);
                        iObjectFieldOffset2 = 1048575;
                        objArr = objArr2;
                        if ((iCharAt11 & 4096) == 4096 || i79 > 17) {
                            i26 = i22;
                            i27 = 0;
                        } else {
                            int i97 = i22 + 1;
                            int iCharAt13 = strZzd.charAt(i22);
                            if (iCharAt13 >= 55296) {
                                int i98 = iCharAt13 & 8191;
                                int i99 = 13;
                                while (true) {
                                    i26 = i97 + 1;
                                    cCharAt9 = strZzd.charAt(i97);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i98 |= (cCharAt9 & 8191) << i99;
                                    i99 += 13;
                                    i97 = i26;
                                }
                                iCharAt13 = i98 | (cCharAt9 << i99);
                            } else {
                                i26 = i97;
                            }
                            int i100 = (iCharAt13 / 32) + i9 + i9;
                            Object obj3 = objArrZze[i100];
                            if (obj3 instanceof Field) {
                                fieldZzG = (Field) obj3;
                            } else {
                                fieldZzG = zzG(cls, (String) obj3);
                                objArrZze[i100] = fieldZzG;
                            }
                            i27 = iCharAt13 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzG);
                        }
                        if (i79 >= 18 && i79 <= 49) {
                            iArr[i68] = iObjectFieldOffset;
                            i68++;
                        }
                    }
                    i25 = i28;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzG4);
                    iObjectFieldOffset2 = 1048575;
                    objArr = objArr2;
                    if ((iCharAt11 & 4096) == 4096) {
                        i26 = i22;
                        i27 = 0;
                    } else {
                        i26 = i22;
                        i27 = 0;
                    }
                    if (i79 >= 18) {
                        iArr[i68] = iObjectFieldOffset;
                        i68++;
                    }
                }
                i25 = i89;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzG4);
                iObjectFieldOffset2 = 1048575;
                objArr = objArr2;
                if ((iCharAt11 & 4096) == 4096) {
                    i26 = i22;
                    i27 = 0;
                } else {
                    i26 = i22;
                    i27 = 0;
                }
                if (i79 >= 18) {
                    iArr[i68] = iObjectFieldOffset;
                    i68++;
                }
            }
            int i101 = i69 + 1;
            iArr2[i69] = iCharAt10;
            int i102 = i69 + 2;
            iArr2[i101] = ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | (i79 << 20) | iObjectFieldOffset;
            i69 += 3;
            iArr2[i102] = (i27 << 20) | iObjectFieldOffset2;
            iCharAt = i23;
            iCharAt3 = i80;
            i38 = i26;
            length = i21;
            objArr2 = objArr;
            i8 = i25;
            iArr3 = iArr2;
            i10 = i24;
            c3 = 55296;
        }
        return new zzlm(iArr3, objArr2, iCharAt, i10, zzltVar.zza(), z4, false, iArr, iCharAt3, i66, zzloVar, zzkxVar, zzmlVar, zzjpVar, zzleVar, null);
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
        int iZzA;
        int iZzB;
        int iZzB2;
        int iZzA2;
        int iZzv;
        int iZzo;
        int iZzu;
        boolean z4;
        int iZzd;
        int iZzA3;
        int iZzB3;
        int iZzB4;
        int iZzA4;
        int iZzv2;
        Unsafe unsafe = zzb;
        int i8 = 1048575;
        int i9 = 1048575;
        int i10 = 0;
        int iP = 0;
        int i11 = 0;
        while (i10 < this.zzc.length) {
            int iZzB5 = zzB(i10);
            int[] iArr = this.zzc;
            int i12 = iArr[i10];
            int iZzA5 = zzA(iZzB5);
            if (iZzA5 <= 17) {
                int i13 = iArr[i10 + 2];
                int i14 = i13 & i8;
                i7 = 1 << (i13 >>> 20);
                if (i14 != i9) {
                    i11 = unsafe.getInt(obj, i14);
                    i9 = i14;
                }
            } else {
                i7 = 0;
            }
            long j = iZzB5 & i8;
            switch (iZzA5) {
                case 0:
                    if ((i11 & i7) != 0) {
                        iP = AbstractC0486a1.p(i12 << 3, 8, iP);
                    }
                    break;
                case 1:
                    if ((i11 & i7) != 0) {
                        iP = AbstractC0486a1.p(i12 << 3, 4, iP);
                    }
                    break;
                case 2:
                    if ((i11 & i7) != 0) {
                        long j3 = unsafe.getLong(obj, j);
                        iZzA = zzjj.zzA(i12 << 3);
                        iZzB = zzjj.zzB(j3);
                        iZzB2 = iZzB + iZzA;
                        iP += iZzB2;
                    }
                    break;
                case 3:
                    if ((i11 & i7) != 0) {
                        long j7 = unsafe.getLong(obj, j);
                        iZzA = zzjj.zzA(i12 << 3);
                        iZzB = zzjj.zzB(j7);
                        iZzB2 = iZzB + iZzA;
                        iP += iZzB2;
                    }
                    break;
                case 4:
                    if ((i11 & i7) != 0) {
                        int i15 = unsafe.getInt(obj, j);
                        iZzA2 = zzjj.zzA(i12 << 3);
                        iZzv = zzjj.zzv(i15);
                        iZzB2 = iZzv + iZzA2;
                        iP += iZzB2;
                    }
                    break;
                case 5:
                    if ((i11 & i7) != 0) {
                        iP = AbstractC0486a1.p(i12 << 3, 8, iP);
                    }
                    break;
                case 6:
                    if ((i11 & i7) != 0) {
                        iP = AbstractC0486a1.p(i12 << 3, 4, iP);
                    }
                    break;
                case 7:
                    if ((i11 & i7) != 0) {
                        iP = AbstractC0486a1.p(i12 << 3, 1, iP);
                    }
                    break;
                case 8:
                    if ((i11 & i7) != 0) {
                        Object object = unsafe.getObject(obj, j);
                        if (!(object instanceof zzjb)) {
                            iZzA2 = zzjj.zzA(i12 << 3);
                            iZzv = zzjj.zzy((String) object);
                            iZzB2 = iZzv + iZzA2;
                            iP += iZzB2;
                        } else {
                            int iZzA6 = zzjj.zzA(i12 << 3);
                            int iZzd2 = ((zzjb) object).zzd();
                            iP = AbstractC0486a1.s(iZzd2, iZzd2, iZzA6, iP);
                        }
                    }
                    break;
                case 9:
                    if ((i11 & i7) != 0) {
                        iZzo = zzlw.zzo(i12, unsafe.getObject(obj, j), zzE(i10));
                        iP += iZzo;
                    }
                    break;
                case 10:
                    if ((i11 & i7) != 0) {
                        zzjb zzjbVar = (zzjb) unsafe.getObject(obj, j);
                        int iZzA7 = zzjj.zzA(i12 << 3);
                        int iZzd3 = zzjbVar.zzd();
                        iP = AbstractC0486a1.s(iZzd3, iZzd3, iZzA7, iP);
                    }
                    break;
                case 11:
                    if ((i11 & i7) != 0) {
                        iP = AbstractC0486a1.p(unsafe.getInt(obj, j), zzjj.zzA(i12 << 3), iP);
                    }
                    break;
                case 12:
                    if ((i11 & i7) != 0) {
                        int i16 = unsafe.getInt(obj, j);
                        iZzA2 = zzjj.zzA(i12 << 3);
                        iZzv = zzjj.zzv(i16);
                        iZzB2 = iZzv + iZzA2;
                        iP += iZzB2;
                    }
                    break;
                case 13:
                    if ((i11 & i7) != 0) {
                        iP = AbstractC0486a1.p(i12 << 3, 4, iP);
                    }
                    break;
                case 14:
                    if ((i11 & i7) != 0) {
                        iP = AbstractC0486a1.p(i12 << 3, 8, iP);
                    }
                    break;
                case 15:
                    if ((i11 & i7) != 0) {
                        int i17 = unsafe.getInt(obj, j);
                        iP = AbstractC0486a1.p((i17 >> 31) ^ (i17 + i17), zzjj.zzA(i12 << 3), iP);
                    }
                    break;
                case 16:
                    if ((i7 & i11) != 0) {
                        long j8 = unsafe.getLong(obj, j);
                        iZzB2 = zzjj.zzB((j8 >> 63) ^ (j8 + j8)) + zzjj.zzA(i12 << 3);
                        iP += iZzB2;
                    }
                    break;
                case 17:
                    if ((i11 & i7) != 0) {
                        iZzB2 = zzjj.zzu(i12, (zzlj) unsafe.getObject(obj, j), zzE(i10));
                        iP += iZzB2;
                    }
                    break;
                case 18:
                    iZzo = zzlw.zzh(i12, (List) unsafe.getObject(obj, j), false);
                    iP += iZzo;
                    break;
                case 19:
                    iZzo = zzlw.zzf(i12, (List) unsafe.getObject(obj, j), false);
                    iP += iZzo;
                    break;
                case 20:
                    iZzo = zzlw.zzm(i12, (List) unsafe.getObject(obj, j), false);
                    iP += iZzo;
                    break;
                case zzbbd.zzt.zzm /* 21 */:
                    iZzo = zzlw.zzx(i12, (List) unsafe.getObject(obj, j), false);
                    iP += iZzo;
                    break;
                case 22:
                    iZzo = zzlw.zzk(i12, (List) unsafe.getObject(obj, j), false);
                    iP += iZzo;
                    break;
                case 23:
                    iZzo = zzlw.zzh(i12, (List) unsafe.getObject(obj, j), false);
                    iP += iZzo;
                    break;
                case 24:
                    iZzo = zzlw.zzf(i12, (List) unsafe.getObject(obj, j), false);
                    iP += iZzo;
                    break;
                case 25:
                    iZzo = zzlw.zza(i12, (List) unsafe.getObject(obj, j), false);
                    iP += iZzo;
                    break;
                case 26:
                    iZzu = zzlw.zzu(i12, (List) unsafe.getObject(obj, j));
                    iP += iZzu;
                    break;
                case 27:
                    iZzu = zzlw.zzp(i12, (List) unsafe.getObject(obj, j), zzE(i10));
                    iP += iZzu;
                    break;
                case 28:
                    iZzu = zzlw.zzc(i12, (List) unsafe.getObject(obj, j));
                    iP += iZzu;
                    break;
                case 29:
                    iZzu = zzlw.zzv(i12, (List) unsafe.getObject(obj, j), false);
                    iP += iZzu;
                    break;
                case 30:
                    z4 = false;
                    iZzd = zzlw.zzd(i12, (List) unsafe.getObject(obj, j), false);
                    iP += iZzd;
                    break;
                case 31:
                    z4 = false;
                    iZzd = zzlw.zzf(i12, (List) unsafe.getObject(obj, j), false);
                    iP += iZzd;
                    break;
                case 32:
                    z4 = false;
                    iZzd = zzlw.zzh(i12, (List) unsafe.getObject(obj, j), false);
                    iP += iZzd;
                    break;
                case 33:
                    z4 = false;
                    iZzd = zzlw.zzq(i12, (List) unsafe.getObject(obj, j), false);
                    iP += iZzd;
                    break;
                case 34:
                    z4 = false;
                    iZzd = zzlw.zzs(i12, (List) unsafe.getObject(obj, j), false);
                    iP += iZzd;
                    break;
                case 35:
                    int iZzi = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iP = AbstractC0486a1.s(iZzi, zzjj.zzz(i12), iZzi, iP);
                    }
                    break;
                case 36:
                    int iZzg = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (iZzg > 0) {
                        iP = AbstractC0486a1.s(iZzg, zzjj.zzz(i12), iZzg, iP);
                    }
                    break;
                case 37:
                    int iZzn = zzlw.zzn((List) unsafe.getObject(obj, j));
                    if (iZzn > 0) {
                        iP = AbstractC0486a1.s(iZzn, zzjj.zzz(i12), iZzn, iP);
                    }
                    break;
                case 38:
                    int iZzy = zzlw.zzy((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        iP = AbstractC0486a1.s(iZzy, zzjj.zzz(i12), iZzy, iP);
                    }
                    break;
                case 39:
                    int iZzl = zzlw.zzl((List) unsafe.getObject(obj, j));
                    if (iZzl > 0) {
                        iP = AbstractC0486a1.s(iZzl, zzjj.zzz(i12), iZzl, iP);
                    }
                    break;
                case 40:
                    int iZzi2 = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (iZzi2 > 0) {
                        iP = AbstractC0486a1.s(iZzi2, zzjj.zzz(i12), iZzi2, iP);
                    }
                    break;
                case 41:
                    int iZzg2 = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (iZzg2 > 0) {
                        iP = AbstractC0486a1.s(iZzg2, zzjj.zzz(i12), iZzg2, iP);
                    }
                    break;
                case 42:
                    int iZzb = zzlw.zzb((List) unsafe.getObject(obj, j));
                    if (iZzb > 0) {
                        iP = AbstractC0486a1.s(iZzb, zzjj.zzz(i12), iZzb, iP);
                    }
                    break;
                case 43:
                    int iZzw = zzlw.zzw((List) unsafe.getObject(obj, j));
                    if (iZzw > 0) {
                        iP = AbstractC0486a1.s(iZzw, zzjj.zzz(i12), iZzw, iP);
                    }
                    break;
                case 44:
                    int iZze = zzlw.zze((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iP = AbstractC0486a1.s(iZze, zzjj.zzz(i12), iZze, iP);
                    }
                    break;
                case 45:
                    int iZzg3 = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (iZzg3 > 0) {
                        iP = AbstractC0486a1.s(iZzg3, zzjj.zzz(i12), iZzg3, iP);
                    }
                    break;
                case 46:
                    int iZzi3 = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (iZzi3 > 0) {
                        iP = AbstractC0486a1.s(iZzi3, zzjj.zzz(i12), iZzi3, iP);
                    }
                    break;
                case 47:
                    int iZzr = zzlw.zzr((List) unsafe.getObject(obj, j));
                    if (iZzr > 0) {
                        iP = AbstractC0486a1.s(iZzr, zzjj.zzz(i12), iZzr, iP);
                    }
                    break;
                case 48:
                    int iZzt = zzlw.zzt((List) unsafe.getObject(obj, j));
                    if (iZzt > 0) {
                        iP = AbstractC0486a1.s(iZzt, zzjj.zzz(i12), iZzt, iP);
                    }
                    break;
                case 49:
                    iZzu = zzlw.zzj(i12, (List) unsafe.getObject(obj, j), zzE(i10));
                    iP += iZzu;
                    break;
                case 50:
                    zzle.zza(i12, unsafe.getObject(obj, j), zzF(i10));
                    break;
                case 51:
                    if (zzR(obj, i12, i10)) {
                        iP = AbstractC0486a1.p(i12 << 3, 8, iP);
                    }
                    break;
                case 52:
                    if (zzR(obj, i12, i10)) {
                        iP = AbstractC0486a1.p(i12 << 3, 4, iP);
                    }
                    break;
                case 53:
                    if (zzR(obj, i12, i10)) {
                        long jZzC = zzC(obj, j);
                        iZzA3 = zzjj.zzA(i12 << 3);
                        iZzB3 = zzjj.zzB(jZzC);
                        iZzB4 = iZzB3 + iZzA3;
                        iP += iZzB4;
                    }
                    break;
                case 54:
                    if (zzR(obj, i12, i10)) {
                        long jZzC2 = zzC(obj, j);
                        iZzA3 = zzjj.zzA(i12 << 3);
                        iZzB3 = zzjj.zzB(jZzC2);
                        iZzB4 = iZzB3 + iZzA3;
                        iP += iZzB4;
                    }
                    break;
                case 55:
                    if (zzR(obj, i12, i10)) {
                        int iZzr2 = zzr(obj, j);
                        iZzA4 = zzjj.zzA(i12 << 3);
                        iZzv2 = zzjj.zzv(iZzr2);
                        iZzB4 = iZzv2 + iZzA4;
                        iP += iZzB4;
                    }
                    break;
                case 56:
                    if (zzR(obj, i12, i10)) {
                        iP = AbstractC0486a1.p(i12 << 3, 8, iP);
                    }
                    break;
                case 57:
                    if (zzR(obj, i12, i10)) {
                        iP = AbstractC0486a1.p(i12 << 3, 4, iP);
                    }
                    break;
                case 58:
                    if (zzR(obj, i12, i10)) {
                        iP = AbstractC0486a1.p(i12 << 3, 1, iP);
                    }
                    break;
                case 59:
                    if (zzR(obj, i12, i10)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzjb) {
                            int iZzA8 = zzjj.zzA(i12 << 3);
                            int iZzd4 = ((zzjb) object2).zzd();
                            iP = AbstractC0486a1.s(iZzd4, iZzd4, iZzA8, iP);
                        } else {
                            iZzA4 = zzjj.zzA(i12 << 3);
                            iZzv2 = zzjj.zzy((String) object2);
                            iZzB4 = iZzv2 + iZzA4;
                            iP += iZzB4;
                        }
                    }
                    break;
                case 60:
                    if (zzR(obj, i12, i10)) {
                        iZzu = zzlw.zzo(i12, unsafe.getObject(obj, j), zzE(i10));
                        iP += iZzu;
                    }
                    break;
                case 61:
                    if (zzR(obj, i12, i10)) {
                        zzjb zzjbVar2 = (zzjb) unsafe.getObject(obj, j);
                        int iZzA9 = zzjj.zzA(i12 << 3);
                        int iZzd5 = zzjbVar2.zzd();
                        iP = AbstractC0486a1.s(iZzd5, iZzd5, iZzA9, iP);
                    }
                    break;
                case 62:
                    if (zzR(obj, i12, i10)) {
                        iP = AbstractC0486a1.p(zzr(obj, j), zzjj.zzA(i12 << 3), iP);
                    }
                    break;
                case 63:
                    if (zzR(obj, i12, i10)) {
                        int iZzr3 = zzr(obj, j);
                        iZzA4 = zzjj.zzA(i12 << 3);
                        iZzv2 = zzjj.zzv(iZzr3);
                        iZzB4 = iZzv2 + iZzA4;
                        iP += iZzB4;
                    }
                    break;
                case 64:
                    if (zzR(obj, i12, i10)) {
                        iP = AbstractC0486a1.p(i12 << 3, 4, iP);
                    }
                    break;
                case 65:
                    if (zzR(obj, i12, i10)) {
                        iP = AbstractC0486a1.p(i12 << 3, 8, iP);
                    }
                    break;
                case 66:
                    if (zzR(obj, i12, i10)) {
                        int iZzr4 = zzr(obj, j);
                        iP = AbstractC0486a1.p((iZzr4 >> 31) ^ (iZzr4 + iZzr4), zzjj.zzA(i12 << 3), iP);
                    }
                    break;
                case 67:
                    if (zzR(obj, i12, i10)) {
                        long jZzC3 = zzC(obj, j);
                        iZzB4 = zzjj.zzB((jZzC3 >> 63) ^ (jZzC3 + jZzC3)) + zzjj.zzA(i12 << 3);
                        iP += iZzB4;
                    }
                    break;
                case 68:
                    if (zzR(obj, i12, i10)) {
                        iZzB4 = zzjj.zzu(i12, (zzlj) unsafe.getObject(obj, j), zzE(i10));
                        iP += iZzB4;
                    }
                    break;
                default:
                    break;
            }
            i10 += 3;
            i8 = 1048575;
        }
        zzml zzmlVar = this.zzn;
        int iZza = iP + zzmlVar.zza(zzmlVar.zzc(obj));
        if (!this.zzh) {
            return iZza;
        }
        this.zzo.zza(obj);
        throw null;
    }

    private final int zzq(Object obj) {
        int iZzA;
        int iZzB;
        int iZzA2;
        int iZzv;
        int iZzo;
        int iZzu;
        Unsafe unsafe = zzb;
        int iP = 0;
        for (int i7 = 0; i7 < this.zzc.length; i7 += 3) {
            int iZzB2 = zzB(i7);
            int iZzA3 = zzA(iZzB2);
            int i8 = this.zzc[i7];
            long j = iZzB2 & 1048575;
            if (iZzA3 >= zzju.zzJ.zza() && iZzA3 <= zzju.zzW.zza()) {
                int i9 = this.zzc[i7 + 2];
            }
            switch (iZzA3) {
                case 0:
                    if (zzO(obj, i7)) {
                        iP = AbstractC0486a1.p(i8 << 3, 8, iP);
                    }
                    break;
                case 1:
                    if (zzO(obj, i7)) {
                        iP = AbstractC0486a1.p(i8 << 3, 4, iP);
                    }
                    break;
                case 2:
                    if (zzO(obj, i7)) {
                        long jZzd = zzmv.zzd(obj, j);
                        iZzA = zzjj.zzA(i8 << 3);
                        iZzB = zzjj.zzB(jZzd);
                        iZzu = iZzB + iZzA;
                        iP += iZzu;
                    }
                    break;
                case 3:
                    if (zzO(obj, i7)) {
                        long jZzd2 = zzmv.zzd(obj, j);
                        iZzA = zzjj.zzA(i8 << 3);
                        iZzB = zzjj.zzB(jZzd2);
                        iZzu = iZzB + iZzA;
                        iP += iZzu;
                    }
                    break;
                case 4:
                    if (zzO(obj, i7)) {
                        int iZzc = zzmv.zzc(obj, j);
                        iZzA2 = zzjj.zzA(i8 << 3);
                        iZzv = zzjj.zzv(iZzc);
                        iZzu = iZzv + iZzA2;
                        iP += iZzu;
                    }
                    break;
                case 5:
                    if (zzO(obj, i7)) {
                        iP = AbstractC0486a1.p(i8 << 3, 8, iP);
                    }
                    break;
                case 6:
                    if (zzO(obj, i7)) {
                        iP = AbstractC0486a1.p(i8 << 3, 4, iP);
                    }
                    break;
                case 7:
                    if (zzO(obj, i7)) {
                        iP = AbstractC0486a1.p(i8 << 3, 1, iP);
                    }
                    break;
                case 8:
                    if (zzO(obj, i7)) {
                        Object objZzf = zzmv.zzf(obj, j);
                        if (objZzf instanceof zzjb) {
                            int iZzA4 = zzjj.zzA(i8 << 3);
                            int iZzd = ((zzjb) objZzf).zzd();
                            iP = AbstractC0486a1.s(iZzd, iZzd, iZzA4, iP);
                        } else {
                            iZzA2 = zzjj.zzA(i8 << 3);
                            iZzv = zzjj.zzy((String) objZzf);
                            iZzu = iZzv + iZzA2;
                            iP += iZzu;
                        }
                    }
                    break;
                case 9:
                    if (zzO(obj, i7)) {
                        iZzo = zzlw.zzo(i8, zzmv.zzf(obj, j), zzE(i7));
                        iP += iZzo;
                    }
                    break;
                case 10:
                    if (zzO(obj, i7)) {
                        zzjb zzjbVar = (zzjb) zzmv.zzf(obj, j);
                        int iZzA5 = zzjj.zzA(i8 << 3);
                        int iZzd2 = zzjbVar.zzd();
                        iP = AbstractC0486a1.s(iZzd2, iZzd2, iZzA5, iP);
                    }
                    break;
                case 11:
                    if (zzO(obj, i7)) {
                        iP = AbstractC0486a1.p(zzmv.zzc(obj, j), zzjj.zzA(i8 << 3), iP);
                    }
                    break;
                case 12:
                    if (zzO(obj, i7)) {
                        int iZzc2 = zzmv.zzc(obj, j);
                        iZzA2 = zzjj.zzA(i8 << 3);
                        iZzv = zzjj.zzv(iZzc2);
                        iZzu = iZzv + iZzA2;
                        iP += iZzu;
                    }
                    break;
                case 13:
                    if (zzO(obj, i7)) {
                        iP = AbstractC0486a1.p(i8 << 3, 4, iP);
                    }
                    break;
                case 14:
                    if (zzO(obj, i7)) {
                        iP = AbstractC0486a1.p(i8 << 3, 8, iP);
                    }
                    break;
                case 15:
                    if (zzO(obj, i7)) {
                        int iZzc3 = zzmv.zzc(obj, j);
                        iP = AbstractC0486a1.p((iZzc3 >> 31) ^ (iZzc3 + iZzc3), zzjj.zzA(i8 << 3), iP);
                    }
                    break;
                case 16:
                    if (zzO(obj, i7)) {
                        long jZzd3 = zzmv.zzd(obj, j);
                        iZzA = zzjj.zzA(i8 << 3);
                        iZzB = zzjj.zzB((jZzd3 >> 63) ^ (jZzd3 + jZzd3));
                        iZzu = iZzB + iZzA;
                        iP += iZzu;
                    }
                    break;
                case 17:
                    if (zzO(obj, i7)) {
                        iZzu = zzjj.zzu(i8, (zzlj) zzmv.zzf(obj, j), zzE(i7));
                        iP += iZzu;
                    }
                    break;
                case 18:
                    iZzo = zzlw.zzh(i8, (List) zzmv.zzf(obj, j), false);
                    iP += iZzo;
                    break;
                case 19:
                    iZzo = zzlw.zzf(i8, (List) zzmv.zzf(obj, j), false);
                    iP += iZzo;
                    break;
                case 20:
                    iZzo = zzlw.zzm(i8, (List) zzmv.zzf(obj, j), false);
                    iP += iZzo;
                    break;
                case zzbbd.zzt.zzm /* 21 */:
                    iZzo = zzlw.zzx(i8, (List) zzmv.zzf(obj, j), false);
                    iP += iZzo;
                    break;
                case 22:
                    iZzo = zzlw.zzk(i8, (List) zzmv.zzf(obj, j), false);
                    iP += iZzo;
                    break;
                case 23:
                    iZzo = zzlw.zzh(i8, (List) zzmv.zzf(obj, j), false);
                    iP += iZzo;
                    break;
                case 24:
                    iZzo = zzlw.zzf(i8, (List) zzmv.zzf(obj, j), false);
                    iP += iZzo;
                    break;
                case 25:
                    iZzo = zzlw.zza(i8, (List) zzmv.zzf(obj, j), false);
                    iP += iZzo;
                    break;
                case 26:
                    iZzo = zzlw.zzu(i8, (List) zzmv.zzf(obj, j));
                    iP += iZzo;
                    break;
                case 27:
                    iZzo = zzlw.zzp(i8, (List) zzmv.zzf(obj, j), zzE(i7));
                    iP += iZzo;
                    break;
                case 28:
                    iZzo = zzlw.zzc(i8, (List) zzmv.zzf(obj, j));
                    iP += iZzo;
                    break;
                case 29:
                    iZzo = zzlw.zzv(i8, (List) zzmv.zzf(obj, j), false);
                    iP += iZzo;
                    break;
                case 30:
                    iZzo = zzlw.zzd(i8, (List) zzmv.zzf(obj, j), false);
                    iP += iZzo;
                    break;
                case 31:
                    iZzo = zzlw.zzf(i8, (List) zzmv.zzf(obj, j), false);
                    iP += iZzo;
                    break;
                case 32:
                    iZzo = zzlw.zzh(i8, (List) zzmv.zzf(obj, j), false);
                    iP += iZzo;
                    break;
                case 33:
                    iZzo = zzlw.zzq(i8, (List) zzmv.zzf(obj, j), false);
                    iP += iZzo;
                    break;
                case 34:
                    iZzo = zzlw.zzs(i8, (List) zzmv.zzf(obj, j), false);
                    iP += iZzo;
                    break;
                case 35:
                    int iZzi = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iP = AbstractC0486a1.s(iZzi, zzjj.zzz(i8), iZzi, iP);
                    }
                    break;
                case 36:
                    int iZzg = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (iZzg > 0) {
                        iP = AbstractC0486a1.s(iZzg, zzjj.zzz(i8), iZzg, iP);
                    }
                    break;
                case 37:
                    int iZzn = zzlw.zzn((List) unsafe.getObject(obj, j));
                    if (iZzn > 0) {
                        iP = AbstractC0486a1.s(iZzn, zzjj.zzz(i8), iZzn, iP);
                    }
                    break;
                case 38:
                    int iZzy = zzlw.zzy((List) unsafe.getObject(obj, j));
                    if (iZzy > 0) {
                        iP = AbstractC0486a1.s(iZzy, zzjj.zzz(i8), iZzy, iP);
                    }
                    break;
                case 39:
                    int iZzl = zzlw.zzl((List) unsafe.getObject(obj, j));
                    if (iZzl > 0) {
                        iP = AbstractC0486a1.s(iZzl, zzjj.zzz(i8), iZzl, iP);
                    }
                    break;
                case 40:
                    int iZzi2 = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (iZzi2 > 0) {
                        iP = AbstractC0486a1.s(iZzi2, zzjj.zzz(i8), iZzi2, iP);
                    }
                    break;
                case 41:
                    int iZzg2 = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (iZzg2 > 0) {
                        iP = AbstractC0486a1.s(iZzg2, zzjj.zzz(i8), iZzg2, iP);
                    }
                    break;
                case 42:
                    int iZzb = zzlw.zzb((List) unsafe.getObject(obj, j));
                    if (iZzb > 0) {
                        iP = AbstractC0486a1.s(iZzb, zzjj.zzz(i8), iZzb, iP);
                    }
                    break;
                case 43:
                    int iZzw = zzlw.zzw((List) unsafe.getObject(obj, j));
                    if (iZzw > 0) {
                        iP = AbstractC0486a1.s(iZzw, zzjj.zzz(i8), iZzw, iP);
                    }
                    break;
                case 44:
                    int iZze = zzlw.zze((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iP = AbstractC0486a1.s(iZze, zzjj.zzz(i8), iZze, iP);
                    }
                    break;
                case 45:
                    int iZzg3 = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (iZzg3 > 0) {
                        iP = AbstractC0486a1.s(iZzg3, zzjj.zzz(i8), iZzg3, iP);
                    }
                    break;
                case 46:
                    int iZzi3 = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (iZzi3 > 0) {
                        iP = AbstractC0486a1.s(iZzi3, zzjj.zzz(i8), iZzi3, iP);
                    }
                    break;
                case 47:
                    int iZzr = zzlw.zzr((List) unsafe.getObject(obj, j));
                    if (iZzr > 0) {
                        iP = AbstractC0486a1.s(iZzr, zzjj.zzz(i8), iZzr, iP);
                    }
                    break;
                case 48:
                    int iZzt = zzlw.zzt((List) unsafe.getObject(obj, j));
                    if (iZzt > 0) {
                        iP = AbstractC0486a1.s(iZzt, zzjj.zzz(i8), iZzt, iP);
                    }
                    break;
                case 49:
                    iZzo = zzlw.zzj(i8, (List) zzmv.zzf(obj, j), zzE(i7));
                    iP += iZzo;
                    break;
                case 50:
                    zzle.zza(i8, zzmv.zzf(obj, j), zzF(i7));
                    break;
                case 51:
                    if (zzR(obj, i8, i7)) {
                        iP = AbstractC0486a1.p(i8 << 3, 8, iP);
                    }
                    break;
                case 52:
                    if (zzR(obj, i8, i7)) {
                        iP = AbstractC0486a1.p(i8 << 3, 4, iP);
                    }
                    break;
                case 53:
                    if (zzR(obj, i8, i7)) {
                        long jZzC = zzC(obj, j);
                        iZzA = zzjj.zzA(i8 << 3);
                        iZzB = zzjj.zzB(jZzC);
                        iZzu = iZzB + iZzA;
                        iP += iZzu;
                    }
                    break;
                case 54:
                    if (zzR(obj, i8, i7)) {
                        long jZzC2 = zzC(obj, j);
                        iZzA = zzjj.zzA(i8 << 3);
                        iZzB = zzjj.zzB(jZzC2);
                        iZzu = iZzB + iZzA;
                        iP += iZzu;
                    }
                    break;
                case 55:
                    if (zzR(obj, i8, i7)) {
                        int iZzr2 = zzr(obj, j);
                        iZzA2 = zzjj.zzA(i8 << 3);
                        iZzv = zzjj.zzv(iZzr2);
                        iZzu = iZzv + iZzA2;
                        iP += iZzu;
                    }
                    break;
                case 56:
                    if (zzR(obj, i8, i7)) {
                        iP = AbstractC0486a1.p(i8 << 3, 8, iP);
                    }
                    break;
                case 57:
                    if (zzR(obj, i8, i7)) {
                        iP = AbstractC0486a1.p(i8 << 3, 4, iP);
                    }
                    break;
                case 58:
                    if (zzR(obj, i8, i7)) {
                        iP = AbstractC0486a1.p(i8 << 3, 1, iP);
                    }
                    break;
                case 59:
                    if (zzR(obj, i8, i7)) {
                        Object objZzf2 = zzmv.zzf(obj, j);
                        if (objZzf2 instanceof zzjb) {
                            int iZzA6 = zzjj.zzA(i8 << 3);
                            int iZzd3 = ((zzjb) objZzf2).zzd();
                            iP = AbstractC0486a1.s(iZzd3, iZzd3, iZzA6, iP);
                        } else {
                            iZzA2 = zzjj.zzA(i8 << 3);
                            iZzv = zzjj.zzy((String) objZzf2);
                            iZzu = iZzv + iZzA2;
                            iP += iZzu;
                        }
                    }
                    break;
                case 60:
                    if (zzR(obj, i8, i7)) {
                        iZzo = zzlw.zzo(i8, zzmv.zzf(obj, j), zzE(i7));
                        iP += iZzo;
                    }
                    break;
                case 61:
                    if (zzR(obj, i8, i7)) {
                        zzjb zzjbVar2 = (zzjb) zzmv.zzf(obj, j);
                        int iZzA7 = zzjj.zzA(i8 << 3);
                        int iZzd4 = zzjbVar2.zzd();
                        iP = AbstractC0486a1.s(iZzd4, iZzd4, iZzA7, iP);
                    }
                    break;
                case 62:
                    if (zzR(obj, i8, i7)) {
                        iP = AbstractC0486a1.p(zzr(obj, j), zzjj.zzA(i8 << 3), iP);
                    }
                    break;
                case 63:
                    if (zzR(obj, i8, i7)) {
                        int iZzr3 = zzr(obj, j);
                        iZzA2 = zzjj.zzA(i8 << 3);
                        iZzv = zzjj.zzv(iZzr3);
                        iZzu = iZzv + iZzA2;
                        iP += iZzu;
                    }
                    break;
                case 64:
                    if (zzR(obj, i8, i7)) {
                        iP = AbstractC0486a1.p(i8 << 3, 4, iP);
                    }
                    break;
                case 65:
                    if (zzR(obj, i8, i7)) {
                        iP = AbstractC0486a1.p(i8 << 3, 8, iP);
                    }
                    break;
                case 66:
                    if (zzR(obj, i8, i7)) {
                        int iZzr4 = zzr(obj, j);
                        iP = AbstractC0486a1.p((iZzr4 >> 31) ^ (iZzr4 + iZzr4), zzjj.zzA(i8 << 3), iP);
                    }
                    break;
                case 67:
                    if (zzR(obj, i8, i7)) {
                        long jZzC3 = zzC(obj, j);
                        iZzA = zzjj.zzA(i8 << 3);
                        iZzB = zzjj.zzB((jZzC3 >> 63) ^ (jZzC3 + jZzC3));
                        iZzu = iZzB + iZzA;
                        iP += iZzu;
                    }
                    break;
                case 68:
                    if (zzR(obj, i8, i7)) {
                        iZzu = zzjj.zzu(i8, (zzlj) zzmv.zzf(obj, j), zzE(i7));
                        iP += iZzu;
                    }
                    break;
            }
        }
        zzml zzmlVar = this.zzn;
        return iP + zzmlVar.zza(zzmlVar.zzc(obj));
    }

    private static int zzr(Object obj, long j) {
        return ((Integer) zzmv.zzf(obj, j)).intValue();
    }

    private final int zzs(Object obj, byte[] bArr, int i7, int i8, int i9, long j, zzio zzioVar) {
        Unsafe unsafe = zzb;
        Object objZzF = zzF(i9);
        Object object = unsafe.getObject(obj, j);
        if (!((zzld) object).zze()) {
            zzld zzldVarZzb = zzld.zza().zzb();
            zzle.zzb(zzldVarZzb, object);
            unsafe.putObject(obj, j, zzldVarZzb);
        }
        throw null;
    }

    private final int zzt(Object obj, byte[] bArr, int i7, int i8, int i9, int i10, int i11, int i12, int i13, long j, int i14, zzio zzioVar) throws zzkm {
        Unsafe unsafe = zzb;
        long j3 = this.zzc[i14 + 2] & 1048575;
        switch (i13) {
            case 51:
                if (i11 != 1) {
                    return i7;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzip.zzn(bArr, i7))));
                unsafe.putInt(obj, j3, i10);
                return i7 + 8;
            case 52:
                if (i11 != 5) {
                    return i7;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzip.zzb(bArr, i7))));
                unsafe.putInt(obj, j3, i10);
                return i7 + 4;
            case 53:
            case 54:
                if (i11 != 0) {
                    return i7;
                }
                int iZzm = zzip.zzm(bArr, i7, zzioVar);
                unsafe.putObject(obj, j, Long.valueOf(zzioVar.zzb));
                unsafe.putInt(obj, j3, i10);
                return iZzm;
            case 55:
            case 62:
                if (i11 != 0) {
                    return i7;
                }
                int iZzj = zzip.zzj(bArr, i7, zzioVar);
                unsafe.putObject(obj, j, Integer.valueOf(zzioVar.zza));
                unsafe.putInt(obj, j3, i10);
                return iZzj;
            case 56:
            case 65:
                if (i11 != 1) {
                    return i7;
                }
                unsafe.putObject(obj, j, Long.valueOf(zzip.zzn(bArr, i7)));
                unsafe.putInt(obj, j3, i10);
                return i7 + 8;
            case 57:
            case 64:
                if (i11 != 5) {
                    return i7;
                }
                unsafe.putObject(obj, j, Integer.valueOf(zzip.zzb(bArr, i7)));
                unsafe.putInt(obj, j3, i10);
                return i7 + 4;
            case 58:
                if (i11 != 0) {
                    return i7;
                }
                int iZzm2 = zzip.zzm(bArr, i7, zzioVar);
                unsafe.putObject(obj, j, Boolean.valueOf(zzioVar.zzb != 0));
                unsafe.putInt(obj, j3, i10);
                return iZzm2;
            case 59:
                if (i11 != 2) {
                    return i7;
                }
                int iZzj2 = zzip.zzj(bArr, i7, zzioVar);
                int i15 = zzioVar.zza;
                if (i15 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i12 & 536870912) != 0 && !zzna.zzf(bArr, iZzj2, iZzj2 + i15)) {
                        throw zzkm.zzc();
                    }
                    unsafe.putObject(obj, j, new String(bArr, iZzj2, i15, zzkk.zzb));
                    iZzj2 += i15;
                }
                unsafe.putInt(obj, j3, i10);
                return iZzj2;
            case 60:
                if (i11 != 2) {
                    return i7;
                }
                int iZzd = zzip.zzd(zzE(i14), bArr, i7, i8, zzioVar);
                Object object = unsafe.getInt(obj, j3) == i10 ? unsafe.getObject(obj, j) : null;
                if (object == null) {
                    unsafe.putObject(obj, j, zzioVar.zzc);
                } else {
                    unsafe.putObject(obj, j, zzkk.zzg(object, zzioVar.zzc));
                }
                unsafe.putInt(obj, j3, i10);
                return iZzd;
            case 61:
                if (i11 != 2) {
                    return i7;
                }
                int iZza = zzip.zza(bArr, i7, zzioVar);
                unsafe.putObject(obj, j, zzioVar.zzc);
                unsafe.putInt(obj, j3, i10);
                return iZza;
            case 63:
                if (i11 != 0) {
                    return i7;
                }
                int iZzj3 = zzip.zzj(bArr, i7, zzioVar);
                int i16 = zzioVar.zza;
                zzkg zzkgVarZzD = zzD(i14);
                if (zzkgVarZzD == null || zzkgVarZzD.zza(i16)) {
                    unsafe.putObject(obj, j, Integer.valueOf(i16));
                    unsafe.putInt(obj, j3, i10);
                } else {
                    zzd(obj).zzh(i9, Long.valueOf(i16));
                }
                return iZzj3;
            case 66:
                if (i11 != 0) {
                    return i7;
                }
                int iZzj4 = zzip.zzj(bArr, i7, zzioVar);
                unsafe.putObject(obj, j, Integer.valueOf(zzjf.zzb(zzioVar.zza)));
                unsafe.putInt(obj, j3, i10);
                return iZzj4;
            case 67:
                if (i11 != 0) {
                    return i7;
                }
                int iZzm3 = zzip.zzm(bArr, i7, zzioVar);
                unsafe.putObject(obj, j, Long.valueOf(zzjf.zzc(zzioVar.zzb)));
                unsafe.putInt(obj, j3, i10);
                return iZzm3;
            case 68:
                if (i11 != 3) {
                    return i7;
                }
                int iZzc = zzip.zzc(zzE(i14), bArr, i7, i8, (i9 & (-8)) | 4, zzioVar);
                Object object2 = unsafe.getInt(obj, j3) == i10 ? unsafe.getObject(obj, j) : null;
                if (object2 == null) {
                    unsafe.putObject(obj, j, zzioVar.zzc);
                } else {
                    unsafe.putObject(obj, j, zzkk.zzg(object2, zzioVar.zzc));
                }
                unsafe.putInt(obj, j3, i10);
                return iZzc;
            default:
                return i7;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0081. Please report as an issue. */
    private final int zzu(Object obj, byte[] bArr, int i7, int i8, zzio zzioVar) throws zzkm {
        int i9;
        int iZzk;
        int i10;
        int i11;
        int i12;
        Unsafe unsafe;
        int i13;
        int i14;
        int i15;
        int i16;
        int iZzm;
        int iZzd;
        int i17;
        int i18;
        int i19;
        zzlm<T> zzlmVar = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i20 = i8;
        zzioVar = zzioVar;
        Unsafe unsafe2 = zzb;
        int i21 = 1048575;
        int i22 = -1;
        int iZzi = i7;
        int i23 = -1;
        int i24 = 1048575;
        int i25 = 0;
        int i26 = 0;
        while (iZzi < i20) {
            int i27 = iZzi + 1;
            byte b7 = bArr2[iZzi];
            if (b7 < 0) {
                iZzk = zzip.zzk(b7, bArr2, i27, zzioVar);
                i9 = zzioVar.zza;
            } else {
                i9 = b7;
                iZzk = i27;
            }
            int i28 = i9 >>> 3;
            int i29 = i9 & 7;
            int iZzx = i28 > i23 ? zzlmVar.zzx(i28, i25 / 3) : zzlmVar.zzw(i28);
            if (iZzx == i22) {
                i10 = iZzk;
                i11 = i28;
                i12 = i22;
                unsafe = unsafe2;
                i13 = 0;
            } else {
                int[] iArr = zzlmVar.zzc;
                int i30 = iArr[iZzx + 1];
                int iZzA = zzA(i30);
                long j = i30 & i21;
                if (iZzA <= 17) {
                    int i31 = iArr[iZzx + 2];
                    int i32 = 1 << (i31 >>> 20);
                    i14 = 1048575;
                    int i33 = i31 & 1048575;
                    if (i33 != i24) {
                        if (i24 != 1048575) {
                            unsafe2.putInt(obj2, i24, i26);
                        }
                        if (i33 != 1048575) {
                            i26 = unsafe2.getInt(obj2, i33);
                        }
                        i24 = i33;
                    }
                    switch (iZzA) {
                        case 0:
                            i15 = iZzx;
                            i16 = iZzk;
                            i11 = i28;
                            if (i29 != 1) {
                                i10 = i16;
                                unsafe = unsafe2;
                                i13 = i15;
                                i12 = -1;
                            } else {
                                zzmv.zzo(obj2, j, Double.longBitsToDouble(zzip.zzn(bArr2, i16)));
                                iZzi = i16 + 8;
                                i26 |= i32;
                                i25 = i15;
                                i23 = i11;
                                i21 = i14;
                                i22 = -1;
                            }
                            break;
                        case 1:
                            zzioVar = zzioVar;
                            i15 = iZzx;
                            i16 = iZzk;
                            i14 = 1048575;
                            i11 = i28;
                            if (i29 != 5) {
                                i10 = i16;
                                unsafe = unsafe2;
                                i13 = i15;
                                i12 = -1;
                            } else {
                                zzmv.zzp(obj2, j, Float.intBitsToFloat(zzip.zzb(bArr2, i16)));
                                iZzi = i16 + 4;
                                i26 |= i32;
                                i25 = i15;
                                i23 = i11;
                                i21 = i14;
                                i22 = -1;
                            }
                            break;
                        case 2:
                        case 3:
                            zzioVar = zzioVar;
                            i15 = iZzx;
                            i16 = iZzk;
                            i11 = i28;
                            if (i29 != 0) {
                                i10 = i16;
                                unsafe = unsafe2;
                                i13 = i15;
                                i12 = -1;
                            } else {
                                iZzm = zzip.zzm(bArr2, i16, zzioVar);
                                unsafe2.putLong(obj, j, zzioVar.zzb);
                                i26 |= i32;
                                iZzi = iZzm;
                                i25 = i15;
                                i23 = i11;
                                i21 = i14;
                                i22 = -1;
                            }
                            break;
                        case 4:
                        case 11:
                            zzioVar = zzioVar;
                            i15 = iZzx;
                            i16 = iZzk;
                            i14 = 1048575;
                            i11 = i28;
                            if (i29 != 0) {
                                i10 = i16;
                                unsafe = unsafe2;
                                i13 = i15;
                                i12 = -1;
                            } else {
                                iZzi = zzip.zzj(bArr2, i16, zzioVar);
                                unsafe2.putInt(obj2, j, zzioVar.zza);
                                i26 |= i32;
                                i25 = i15;
                                i23 = i11;
                                i21 = i14;
                                i22 = -1;
                            }
                            break;
                        case 5:
                        case 14:
                            i15 = iZzx;
                            i11 = i28;
                            if (i29 != 1) {
                                i16 = iZzk;
                                i10 = i16;
                                unsafe = unsafe2;
                                i13 = i15;
                                i12 = -1;
                            } else {
                                i16 = iZzk;
                                unsafe2.putLong(obj, j, zzip.zzn(bArr2, iZzk));
                                iZzi = i16 + 8;
                                i26 |= i32;
                                i25 = i15;
                                i23 = i11;
                                i21 = i14;
                                i22 = -1;
                            }
                            break;
                        case 6:
                        case 13:
                            zzioVar = zzioVar;
                            i15 = iZzx;
                            i14 = 1048575;
                            i11 = i28;
                            if (i29 != 5) {
                                i16 = iZzk;
                                i10 = i16;
                                unsafe = unsafe2;
                                i13 = i15;
                                i12 = -1;
                            } else {
                                unsafe2.putInt(obj2, j, zzip.zzb(bArr2, iZzk));
                                iZzi = iZzk + 4;
                                i26 |= i32;
                                i25 = i15;
                                i23 = i11;
                                i21 = i14;
                                i22 = -1;
                            }
                            break;
                        case 7:
                            zzioVar = zzioVar;
                            i15 = iZzx;
                            i14 = 1048575;
                            i11 = i28;
                            if (i29 != 0) {
                                i16 = iZzk;
                                i10 = i16;
                                unsafe = unsafe2;
                                i13 = i15;
                                i12 = -1;
                            } else {
                                iZzi = zzip.zzm(bArr2, iZzk, zzioVar);
                                zzmv.zzm(obj2, j, zzioVar.zzb != 0);
                                i26 |= i32;
                                i25 = i15;
                                i23 = i11;
                                i21 = i14;
                                i22 = -1;
                            }
                            break;
                        case 8:
                            zzioVar = zzioVar;
                            i15 = iZzx;
                            i14 = 1048575;
                            i11 = i28;
                            if (i29 != 2) {
                                i16 = iZzk;
                                i10 = i16;
                                unsafe = unsafe2;
                                i13 = i15;
                                i12 = -1;
                            } else {
                                iZzi = (536870912 & i30) == 0 ? zzip.zzg(bArr2, iZzk, zzioVar) : zzip.zzh(bArr2, iZzk, zzioVar);
                                unsafe2.putObject(obj2, j, zzioVar.zzc);
                                i26 |= i32;
                                i25 = i15;
                                i23 = i11;
                                i21 = i14;
                                i22 = -1;
                            }
                            break;
                        case 9:
                            zzioVar = zzioVar;
                            i15 = iZzx;
                            i14 = 1048575;
                            i11 = i28;
                            if (i29 != 2) {
                                i16 = iZzk;
                                i10 = i16;
                                unsafe = unsafe2;
                                i13 = i15;
                                i12 = -1;
                            } else {
                                iZzd = zzip.zzd(zzlmVar.zzE(i15), bArr2, iZzk, i20, zzioVar);
                                Object object = unsafe2.getObject(obj2, j);
                                if (object == null) {
                                    unsafe2.putObject(obj2, j, zzioVar.zzc);
                                } else {
                                    unsafe2.putObject(obj2, j, zzkk.zzg(object, zzioVar.zzc));
                                }
                                i26 |= i32;
                                iZzi = iZzd;
                                i25 = i15;
                                i23 = i11;
                                i21 = i14;
                                i22 = -1;
                            }
                            break;
                        case 10:
                            zzioVar = zzioVar;
                            i15 = iZzx;
                            i14 = 1048575;
                            i11 = i28;
                            if (i29 != 2) {
                                i16 = iZzk;
                                i10 = i16;
                                unsafe = unsafe2;
                                i13 = i15;
                                i12 = -1;
                            } else {
                                iZzd = zzip.zza(bArr2, iZzk, zzioVar);
                                unsafe2.putObject(obj2, j, zzioVar.zzc);
                                i26 |= i32;
                                iZzi = iZzd;
                                i25 = i15;
                                i23 = i11;
                                i21 = i14;
                                i22 = -1;
                            }
                            break;
                        case 12:
                            zzioVar = zzioVar;
                            i15 = iZzx;
                            i14 = 1048575;
                            i11 = i28;
                            if (i29 != 0) {
                                i16 = iZzk;
                                i10 = i16;
                                unsafe = unsafe2;
                                i13 = i15;
                                i12 = -1;
                            } else {
                                iZzd = zzip.zzj(bArr2, iZzk, zzioVar);
                                unsafe2.putInt(obj2, j, zzioVar.zza);
                                i26 |= i32;
                                iZzi = iZzd;
                                i25 = i15;
                                i23 = i11;
                                i21 = i14;
                                i22 = -1;
                            }
                            break;
                        case 15:
                            zzioVar = zzioVar;
                            i15 = iZzx;
                            i14 = 1048575;
                            i11 = i28;
                            if (i29 != 0) {
                                i16 = iZzk;
                                i10 = i16;
                                unsafe = unsafe2;
                                i13 = i15;
                                i12 = -1;
                            } else {
                                iZzd = zzip.zzj(bArr2, iZzk, zzioVar);
                                unsafe2.putInt(obj2, j, zzjf.zzb(zzioVar.zza));
                                i26 |= i32;
                                iZzi = iZzd;
                                i25 = i15;
                                i23 = i11;
                                i21 = i14;
                                i22 = -1;
                            }
                            break;
                        case 16:
                            if (i29 != 0) {
                                i11 = i28;
                                i15 = iZzx;
                                i16 = iZzk;
                                i10 = i16;
                                unsafe = unsafe2;
                                i13 = i15;
                                i12 = -1;
                            } else {
                                zzioVar = zzioVar;
                                iZzm = zzip.zzm(bArr2, iZzk, zzioVar);
                                i15 = iZzx;
                                i11 = i28;
                                unsafe2.putLong(obj, j, zzjf.zzc(zzioVar.zzb));
                                i26 |= i32;
                                iZzi = iZzm;
                                i25 = i15;
                                i23 = i11;
                                i21 = i14;
                                i22 = -1;
                            }
                            break;
                        default:
                            i11 = i28;
                            i15 = iZzx;
                            i16 = iZzk;
                            i10 = i16;
                            unsafe = unsafe2;
                            i13 = i15;
                            i12 = -1;
                            break;
                    }
                } else {
                    zzioVar = zzioVar;
                    i15 = iZzx;
                    int i34 = iZzk;
                    i14 = 1048575;
                    i11 = i28;
                    if (iZzA == 27) {
                        if (i29 == 2) {
                            zzkj zzkjVarZzd = (zzkj) unsafe2.getObject(obj2, j);
                            if (!zzkjVarZzd.zzc()) {
                                int size = zzkjVarZzd.size();
                                zzkjVarZzd = zzkjVarZzd.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj2, j, zzkjVarZzd);
                            }
                            iZzi = zzip.zze(zzlmVar.zzE(i15), i9, bArr, i34, i8, zzkjVarZzd, zzioVar);
                            i26 = i26;
                            i25 = i15;
                            i23 = i11;
                            i21 = i14;
                            i22 = -1;
                        } else {
                            i17 = i34;
                            i18 = i26;
                            i19 = i24;
                            unsafe = unsafe2;
                            i13 = i15;
                            i12 = -1;
                        }
                    } else if (iZzA <= 49) {
                        i18 = i26;
                        i19 = i24;
                        i12 = -1;
                        unsafe = unsafe2;
                        i13 = i15;
                        iZzi = zzv(obj, bArr, i34, i8, i9, i11, i29, i15, i30, iZzA, j, zzioVar);
                        if (iZzi != i34) {
                            obj2 = obj;
                            bArr2 = bArr;
                            i20 = i8;
                            zzioVar = zzioVar;
                            i24 = i19;
                            i22 = i12;
                            i23 = i11;
                            i26 = i18;
                            i25 = i13;
                            unsafe2 = unsafe;
                            i21 = 1048575;
                            zzlmVar = this;
                        } else {
                            i10 = iZzi;
                            i24 = i19;
                            i26 = i18;
                        }
                    } else {
                        i17 = i34;
                        i18 = i26;
                        i19 = i24;
                        unsafe = unsafe2;
                        i13 = i15;
                        i12 = -1;
                        if (iZzA != 50) {
                            iZzi = zzt(obj, bArr, i17, i8, i9, i11, i29, i30, iZzA, j, i13, zzioVar);
                            if (iZzi != i17) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i20 = i8;
                                zzioVar = zzioVar;
                                i24 = i19;
                                i22 = i12;
                                i23 = i11;
                                i26 = i18;
                                i25 = i13;
                                unsafe2 = unsafe;
                                i21 = 1048575;
                                zzlmVar = this;
                            } else {
                                i10 = iZzi;
                                i24 = i19;
                                i26 = i18;
                            }
                        } else if (i29 == 2) {
                            iZzi = zzs(obj, bArr, i17, i8, i13, j, zzioVar);
                            if (iZzi != i17) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i20 = i8;
                                zzioVar = zzioVar;
                                i24 = i19;
                                i22 = i12;
                                i23 = i11;
                                i26 = i18;
                                i25 = i13;
                                unsafe2 = unsafe;
                                i21 = 1048575;
                                zzlmVar = this;
                            } else {
                                i10 = iZzi;
                                i24 = i19;
                                i26 = i18;
                            }
                        }
                    }
                    i10 = i17;
                    i24 = i19;
                    i26 = i18;
                }
            }
            iZzi = zzip.zzi(i9, bArr, i10, i8, zzd(obj), zzioVar);
            zzlmVar = this;
            obj2 = obj;
            bArr2 = bArr;
            i20 = i8;
            zzioVar = zzioVar;
            i22 = i12;
            i23 = i11;
            i25 = i13;
            unsafe2 = unsafe;
            i21 = 1048575;
        }
        int i35 = i26;
        int i36 = i24;
        Unsafe unsafe3 = unsafe2;
        if (i36 != i21) {
            unsafe3.putInt(obj, i36, i35);
        }
        if (iZzi == i8) {
            return iZzi;
        }
        throw zzkm.zze();
    }

    private final int zzv(Object obj, byte[] bArr, int i7, int i8, int i9, int i10, int i11, int i12, long j, int i13, long j3, zzio zzioVar) throws zzkm {
        int i14;
        int i15;
        int i16;
        int i17;
        int iZzj;
        int iZzj2 = i7;
        Unsafe unsafe = zzb;
        zzkj zzkjVarZzd = (zzkj) unsafe.getObject(obj, j3);
        if (!zzkjVarZzd.zzc()) {
            int size = zzkjVarZzd.size();
            zzkjVarZzd = zzkjVarZzd.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j3, zzkjVarZzd);
        }
        switch (i13) {
            case 18:
            case 35:
                if (i11 == 2) {
                    zzjl zzjlVar = (zzjl) zzkjVarZzd;
                    int iZzj3 = zzip.zzj(bArr, iZzj2, zzioVar);
                    int i18 = zzioVar.zza + iZzj3;
                    while (iZzj3 < i18) {
                        zzjlVar.zze(Double.longBitsToDouble(zzip.zzn(bArr, iZzj3)));
                        iZzj3 += 8;
                    }
                    if (iZzj3 == i18) {
                        return iZzj3;
                    }
                    throw zzkm.zzf();
                }
                if (i11 == 1) {
                    zzjl zzjlVar2 = (zzjl) zzkjVarZzd;
                    zzjlVar2.zze(Double.longBitsToDouble(zzip.zzn(bArr, i7)));
                    while (true) {
                        i14 = iZzj2 + 8;
                        if (i14 < i8) {
                            iZzj2 = zzip.zzj(bArr, i14, zzioVar);
                            if (i9 == zzioVar.zza) {
                                zzjlVar2.zze(Double.longBitsToDouble(zzip.zzn(bArr, iZzj2)));
                            }
                        }
                    }
                    return i14;
                }
                return iZzj2;
            case 19:
            case 36:
                if (i11 == 2) {
                    zzjv zzjvVar = (zzjv) zzkjVarZzd;
                    int iZzj4 = zzip.zzj(bArr, iZzj2, zzioVar);
                    int i19 = zzioVar.zza + iZzj4;
                    while (iZzj4 < i19) {
                        zzjvVar.zze(Float.intBitsToFloat(zzip.zzb(bArr, iZzj4)));
                        iZzj4 += 4;
                    }
                    if (iZzj4 == i19) {
                        return iZzj4;
                    }
                    throw zzkm.zzf();
                }
                if (i11 == 5) {
                    zzjv zzjvVar2 = (zzjv) zzkjVarZzd;
                    zzjvVar2.zze(Float.intBitsToFloat(zzip.zzb(bArr, i7)));
                    while (true) {
                        i15 = iZzj2 + 4;
                        if (i15 < i8) {
                            iZzj2 = zzip.zzj(bArr, i15, zzioVar);
                            if (i9 == zzioVar.zza) {
                                zzjvVar2.zze(Float.intBitsToFloat(zzip.zzb(bArr, iZzj2)));
                            }
                        }
                    }
                    return i15;
                }
                return iZzj2;
            case 20:
            case zzbbd.zzt.zzm /* 21 */:
            case 37:
            case 38:
                if (i11 == 2) {
                    zzky zzkyVar = (zzky) zzkjVarZzd;
                    int iZzj5 = zzip.zzj(bArr, iZzj2, zzioVar);
                    int i20 = zzioVar.zza + iZzj5;
                    while (iZzj5 < i20) {
                        iZzj5 = zzip.zzm(bArr, iZzj5, zzioVar);
                        zzkyVar.zzg(zzioVar.zzb);
                    }
                    if (iZzj5 == i20) {
                        return iZzj5;
                    }
                    throw zzkm.zzf();
                }
                if (i11 == 0) {
                    zzky zzkyVar2 = (zzky) zzkjVarZzd;
                    int iZzm = zzip.zzm(bArr, iZzj2, zzioVar);
                    zzkyVar2.zzg(zzioVar.zzb);
                    while (iZzm < i8) {
                        int iZzj6 = zzip.zzj(bArr, iZzm, zzioVar);
                        if (i9 != zzioVar.zza) {
                            return iZzm;
                        }
                        iZzm = zzip.zzm(bArr, iZzj6, zzioVar);
                        zzkyVar2.zzg(zzioVar.zzb);
                    }
                    return iZzm;
                }
                return iZzj2;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i11 == 2) {
                    return zzip.zzf(bArr, iZzj2, zzkjVarZzd, zzioVar);
                }
                if (i11 == 0) {
                    return zzip.zzl(i9, bArr, i7, i8, zzkjVarZzd, zzioVar);
                }
                return iZzj2;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i11 == 2) {
                    zzky zzkyVar3 = (zzky) zzkjVarZzd;
                    int iZzj7 = zzip.zzj(bArr, iZzj2, zzioVar);
                    int i21 = zzioVar.zza + iZzj7;
                    while (iZzj7 < i21) {
                        zzkyVar3.zzg(zzip.zzn(bArr, iZzj7));
                        iZzj7 += 8;
                    }
                    if (iZzj7 == i21) {
                        return iZzj7;
                    }
                    throw zzkm.zzf();
                }
                if (i11 == 1) {
                    zzky zzkyVar4 = (zzky) zzkjVarZzd;
                    zzkyVar4.zzg(zzip.zzn(bArr, i7));
                    while (true) {
                        i16 = iZzj2 + 8;
                        if (i16 < i8) {
                            iZzj2 = zzip.zzj(bArr, i16, zzioVar);
                            if (i9 == zzioVar.zza) {
                                zzkyVar4.zzg(zzip.zzn(bArr, iZzj2));
                            }
                        }
                    }
                    return i16;
                }
                return iZzj2;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i11 == 2) {
                    zzkd zzkdVar = (zzkd) zzkjVarZzd;
                    int iZzj8 = zzip.zzj(bArr, iZzj2, zzioVar);
                    int i22 = zzioVar.zza + iZzj8;
                    while (iZzj8 < i22) {
                        zzkdVar.zzh(zzip.zzb(bArr, iZzj8));
                        iZzj8 += 4;
                    }
                    if (iZzj8 == i22) {
                        return iZzj8;
                    }
                    throw zzkm.zzf();
                }
                if (i11 == 5) {
                    zzkd zzkdVar2 = (zzkd) zzkjVarZzd;
                    zzkdVar2.zzh(zzip.zzb(bArr, i7));
                    while (true) {
                        i17 = iZzj2 + 4;
                        if (i17 < i8) {
                            iZzj2 = zzip.zzj(bArr, i17, zzioVar);
                            if (i9 == zzioVar.zza) {
                                zzkdVar2.zzh(zzip.zzb(bArr, iZzj2));
                            }
                        }
                    }
                    return i17;
                }
                return iZzj2;
            case 25:
            case 42:
                if (i11 == 2) {
                    zziq zziqVar = (zziq) zzkjVarZzd;
                    iZzj = zzip.zzj(bArr, iZzj2, zzioVar);
                    int i23 = zzioVar.zza + iZzj;
                    while (iZzj < i23) {
                        iZzj = zzip.zzm(bArr, iZzj, zzioVar);
                        zziqVar.zze(zzioVar.zzb != 0);
                    }
                    if (iZzj != i23) {
                        throw zzkm.zzf();
                    }
                    return iZzj;
                }
                if (i11 == 0) {
                    zziq zziqVar2 = (zziq) zzkjVarZzd;
                    int iZzm2 = zzip.zzm(bArr, iZzj2, zzioVar);
                    zziqVar2.zze(zzioVar.zzb != 0);
                    while (iZzm2 < i8) {
                        int iZzj9 = zzip.zzj(bArr, iZzm2, zzioVar);
                        if (i9 != zzioVar.zza) {
                            return iZzm2;
                        }
                        iZzm2 = zzip.zzm(bArr, iZzj9, zzioVar);
                        zziqVar2.zze(zzioVar.zzb != 0);
                    }
                    return iZzm2;
                }
                return iZzj2;
            case 26:
                if (i11 == 2) {
                    if ((j & 536870912) == 0) {
                        int iZzj10 = zzip.zzj(bArr, iZzj2, zzioVar);
                        int i24 = zzioVar.zza;
                        if (i24 < 0) {
                            throw zzkm.zzd();
                        }
                        if (i24 == 0) {
                            zzkjVarZzd.add("");
                        } else {
                            zzkjVarZzd.add(new String(bArr, iZzj10, i24, zzkk.zzb));
                            iZzj10 += i24;
                        }
                        while (iZzj10 < i8) {
                            int iZzj11 = zzip.zzj(bArr, iZzj10, zzioVar);
                            if (i9 != zzioVar.zza) {
                                return iZzj10;
                            }
                            iZzj10 = zzip.zzj(bArr, iZzj11, zzioVar);
                            int i25 = zzioVar.zza;
                            if (i25 < 0) {
                                throw zzkm.zzd();
                            }
                            if (i25 == 0) {
                                zzkjVarZzd.add("");
                            } else {
                                zzkjVarZzd.add(new String(bArr, iZzj10, i25, zzkk.zzb));
                                iZzj10 += i25;
                            }
                        }
                        return iZzj10;
                    }
                    int iZzj12 = zzip.zzj(bArr, iZzj2, zzioVar);
                    int i26 = zzioVar.zza;
                    if (i26 < 0) {
                        throw zzkm.zzd();
                    }
                    if (i26 == 0) {
                        zzkjVarZzd.add("");
                    } else {
                        int i27 = iZzj12 + i26;
                        if (!zzna.zzf(bArr, iZzj12, i27)) {
                            throw zzkm.zzc();
                        }
                        zzkjVarZzd.add(new String(bArr, iZzj12, i26, zzkk.zzb));
                        iZzj12 = i27;
                    }
                    while (iZzj12 < i8) {
                        int iZzj13 = zzip.zzj(bArr, iZzj12, zzioVar);
                        if (i9 != zzioVar.zza) {
                            return iZzj12;
                        }
                        iZzj12 = zzip.zzj(bArr, iZzj13, zzioVar);
                        int i28 = zzioVar.zza;
                        if (i28 < 0) {
                            throw zzkm.zzd();
                        }
                        if (i28 == 0) {
                            zzkjVarZzd.add("");
                        } else {
                            int i29 = iZzj12 + i28;
                            if (!zzna.zzf(bArr, iZzj12, i29)) {
                                throw zzkm.zzc();
                            }
                            zzkjVarZzd.add(new String(bArr, iZzj12, i28, zzkk.zzb));
                            iZzj12 = i29;
                        }
                    }
                    return iZzj12;
                }
                return iZzj2;
            case 27:
                if (i11 == 2) {
                    return zzip.zze(zzE(i12), i9, bArr, i7, i8, zzkjVarZzd, zzioVar);
                }
                return iZzj2;
            case 28:
                if (i11 == 2) {
                    int iZzj14 = zzip.zzj(bArr, iZzj2, zzioVar);
                    int i30 = zzioVar.zza;
                    if (i30 < 0) {
                        throw zzkm.zzd();
                    }
                    if (i30 > bArr.length - iZzj14) {
                        throw zzkm.zzf();
                    }
                    if (i30 == 0) {
                        zzkjVarZzd.add(zzjb.zzb);
                    } else {
                        zzkjVarZzd.add(zzjb.zzl(bArr, iZzj14, i30));
                        iZzj14 += i30;
                    }
                    while (iZzj14 < i8) {
                        int iZzj15 = zzip.zzj(bArr, iZzj14, zzioVar);
                        if (i9 != zzioVar.zza) {
                            return iZzj14;
                        }
                        iZzj14 = zzip.zzj(bArr, iZzj15, zzioVar);
                        int i31 = zzioVar.zza;
                        if (i31 < 0) {
                            throw zzkm.zzd();
                        }
                        if (i31 > bArr.length - iZzj14) {
                            throw zzkm.zzf();
                        }
                        if (i31 == 0) {
                            zzkjVarZzd.add(zzjb.zzb);
                        } else {
                            zzkjVarZzd.add(zzjb.zzl(bArr, iZzj14, i31));
                            iZzj14 += i31;
                        }
                    }
                    return iZzj14;
                }
                return iZzj2;
            case 30:
            case 44:
                if (i11 != 2) {
                    if (i11 == 0) {
                        iZzj = zzip.zzl(i9, bArr, i7, i8, zzkjVarZzd, zzioVar);
                    }
                    return iZzj2;
                }
                iZzj = zzip.zzf(bArr, iZzj2, zzkjVarZzd, zzioVar);
                zzkc zzkcVar = (zzkc) obj;
                zzmm zzmmVar = zzkcVar.zzc;
                if (zzmmVar == zzmm.zzc()) {
                    zzmmVar = null;
                }
                Object objZzC = zzlw.zzC(i10, zzkjVarZzd, zzD(i12), zzmmVar, this.zzn);
                if (objZzC != null) {
                    zzkcVar.zzc = (zzmm) objZzC;
                    return iZzj;
                }
                return iZzj;
            case 33:
            case 47:
                if (i11 == 2) {
                    zzkd zzkdVar3 = (zzkd) zzkjVarZzd;
                    int iZzj16 = zzip.zzj(bArr, iZzj2, zzioVar);
                    int i32 = zzioVar.zza + iZzj16;
                    while (iZzj16 < i32) {
                        iZzj16 = zzip.zzj(bArr, iZzj16, zzioVar);
                        zzkdVar3.zzh(zzjf.zzb(zzioVar.zza));
                    }
                    if (iZzj16 == i32) {
                        return iZzj16;
                    }
                    throw zzkm.zzf();
                }
                if (i11 == 0) {
                    zzkd zzkdVar4 = (zzkd) zzkjVarZzd;
                    int iZzj17 = zzip.zzj(bArr, iZzj2, zzioVar);
                    zzkdVar4.zzh(zzjf.zzb(zzioVar.zza));
                    while (iZzj17 < i8) {
                        int iZzj18 = zzip.zzj(bArr, iZzj17, zzioVar);
                        if (i9 != zzioVar.zza) {
                            return iZzj17;
                        }
                        iZzj17 = zzip.zzj(bArr, iZzj18, zzioVar);
                        zzkdVar4.zzh(zzjf.zzb(zzioVar.zza));
                    }
                    return iZzj17;
                }
                return iZzj2;
            case 34:
            case 48:
                if (i11 == 2) {
                    zzky zzkyVar5 = (zzky) zzkjVarZzd;
                    int iZzj19 = zzip.zzj(bArr, iZzj2, zzioVar);
                    int i33 = zzioVar.zza + iZzj19;
                    while (iZzj19 < i33) {
                        iZzj19 = zzip.zzm(bArr, iZzj19, zzioVar);
                        zzkyVar5.zzg(zzjf.zzc(zzioVar.zzb));
                    }
                    if (iZzj19 == i33) {
                        return iZzj19;
                    }
                    throw zzkm.zzf();
                }
                if (i11 == 0) {
                    zzky zzkyVar6 = (zzky) zzkjVarZzd;
                    int iZzm3 = zzip.zzm(bArr, iZzj2, zzioVar);
                    zzkyVar6.zzg(zzjf.zzc(zzioVar.zzb));
                    while (iZzm3 < i8) {
                        int iZzj20 = zzip.zzj(bArr, iZzm3, zzioVar);
                        if (i9 != zzioVar.zza) {
                            return iZzm3;
                        }
                        iZzm3 = zzip.zzm(bArr, iZzj20, zzioVar);
                        zzkyVar6.zzg(zzjf.zzc(zzioVar.zzb));
                    }
                    return iZzm3;
                }
                return iZzj2;
            default:
                if (i11 == 3) {
                    zzlu zzluVarZzE = zzE(i12);
                    int i34 = (i9 & (-8)) | 4;
                    int iZzc = zzip.zzc(zzluVarZzE, bArr, i7, i8, i34, zzioVar);
                    zzkjVarZzd.add(zzioVar.zzc);
                    while (iZzc < i8) {
                        int iZzj21 = zzip.zzj(bArr, iZzc, zzioVar);
                        if (i9 != zzioVar.zza) {
                            return iZzc;
                        }
                        iZzc = zzip.zzc(zzluVarZzE, bArr, iZzj21, i8, i34, zzioVar);
                        zzkjVarZzd.add(zzioVar.zzc);
                    }
                    return iZzc;
                }
                return iZzj2;
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
        int iZzc;
        int i8;
        int iZzc2;
        int length = this.zzc.length;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iZzB = zzB(i10);
            int i11 = this.zzc[i10];
            long j = 1048575 & iZzB;
            int iHashCode = 37;
            switch (zzA(iZzB)) {
                case 0:
                    i7 = i9 * 53;
                    iZzc = zzkk.zzc(Double.doubleToLongBits(zzmv.zza(obj, j)));
                    i9 = iZzc + i7;
                    break;
                case 1:
                    i7 = i9 * 53;
                    iZzc = Float.floatToIntBits(zzmv.zzb(obj, j));
                    i9 = iZzc + i7;
                    break;
                case 2:
                    i7 = i9 * 53;
                    iZzc = zzkk.zzc(zzmv.zzd(obj, j));
                    i9 = iZzc + i7;
                    break;
                case 3:
                    i7 = i9 * 53;
                    iZzc = zzkk.zzc(zzmv.zzd(obj, j));
                    i9 = iZzc + i7;
                    break;
                case 4:
                    i8 = i9 * 53;
                    iZzc2 = zzmv.zzc(obj, j);
                    i9 = i8 + iZzc2;
                    break;
                case 5:
                    i7 = i9 * 53;
                    iZzc = zzkk.zzc(zzmv.zzd(obj, j));
                    i9 = iZzc + i7;
                    break;
                case 6:
                    i8 = i9 * 53;
                    iZzc2 = zzmv.zzc(obj, j);
                    i9 = i8 + iZzc2;
                    break;
                case 7:
                    i7 = i9 * 53;
                    iZzc = zzkk.zza(zzmv.zzw(obj, j));
                    i9 = iZzc + i7;
                    break;
                case 8:
                    i7 = i9 * 53;
                    iZzc = ((String) zzmv.zzf(obj, j)).hashCode();
                    i9 = iZzc + i7;
                    break;
                case 9:
                    Object objZzf = zzmv.zzf(obj, j);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i9 = (i9 * 53) + iHashCode;
                    break;
                case 10:
                    i7 = i9 * 53;
                    iZzc = zzmv.zzf(obj, j).hashCode();
                    i9 = iZzc + i7;
                    break;
                case 11:
                    i8 = i9 * 53;
                    iZzc2 = zzmv.zzc(obj, j);
                    i9 = i8 + iZzc2;
                    break;
                case 12:
                    i8 = i9 * 53;
                    iZzc2 = zzmv.zzc(obj, j);
                    i9 = i8 + iZzc2;
                    break;
                case 13:
                    i8 = i9 * 53;
                    iZzc2 = zzmv.zzc(obj, j);
                    i9 = i8 + iZzc2;
                    break;
                case 14:
                    i7 = i9 * 53;
                    iZzc = zzkk.zzc(zzmv.zzd(obj, j));
                    i9 = iZzc + i7;
                    break;
                case 15:
                    i8 = i9 * 53;
                    iZzc2 = zzmv.zzc(obj, j);
                    i9 = i8 + iZzc2;
                    break;
                case 16:
                    i7 = i9 * 53;
                    iZzc = zzkk.zzc(zzmv.zzd(obj, j));
                    i9 = iZzc + i7;
                    break;
                case 17:
                    Object objZzf2 = zzmv.zzf(obj, j);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i9 = (i9 * 53) + iHashCode;
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
                    iZzc = zzmv.zzf(obj, j).hashCode();
                    i9 = iZzc + i7;
                    break;
                case 50:
                    i7 = i9 * 53;
                    iZzc = zzmv.zzf(obj, j).hashCode();
                    i9 = iZzc + i7;
                    break;
                case 51:
                    if (zzR(obj, i11, i10)) {
                        i7 = i9 * 53;
                        iZzc = zzkk.zzc(Double.doubleToLongBits(zzn(obj, j)));
                        i9 = iZzc + i7;
                    }
                    break;
                case 52:
                    if (zzR(obj, i11, i10)) {
                        i7 = i9 * 53;
                        iZzc = Float.floatToIntBits(zzo(obj, j));
                        i9 = iZzc + i7;
                    }
                    break;
                case 53:
                    if (zzR(obj, i11, i10)) {
                        i7 = i9 * 53;
                        iZzc = zzkk.zzc(zzC(obj, j));
                        i9 = iZzc + i7;
                    }
                    break;
                case 54:
                    if (zzR(obj, i11, i10)) {
                        i7 = i9 * 53;
                        iZzc = zzkk.zzc(zzC(obj, j));
                        i9 = iZzc + i7;
                    }
                    break;
                case 55:
                    if (zzR(obj, i11, i10)) {
                        i8 = i9 * 53;
                        iZzc2 = zzr(obj, j);
                        i9 = i8 + iZzc2;
                    }
                    break;
                case 56:
                    if (zzR(obj, i11, i10)) {
                        i7 = i9 * 53;
                        iZzc = zzkk.zzc(zzC(obj, j));
                        i9 = iZzc + i7;
                    }
                    break;
                case 57:
                    if (zzR(obj, i11, i10)) {
                        i8 = i9 * 53;
                        iZzc2 = zzr(obj, j);
                        i9 = i8 + iZzc2;
                    }
                    break;
                case 58:
                    if (zzR(obj, i11, i10)) {
                        i7 = i9 * 53;
                        iZzc = zzkk.zza(zzS(obj, j));
                        i9 = iZzc + i7;
                    }
                    break;
                case 59:
                    if (zzR(obj, i11, i10)) {
                        i7 = i9 * 53;
                        iZzc = ((String) zzmv.zzf(obj, j)).hashCode();
                        i9 = iZzc + i7;
                    }
                    break;
                case 60:
                    if (zzR(obj, i11, i10)) {
                        i7 = i9 * 53;
                        iZzc = zzmv.zzf(obj, j).hashCode();
                        i9 = iZzc + i7;
                    }
                    break;
                case 61:
                    if (zzR(obj, i11, i10)) {
                        i7 = i9 * 53;
                        iZzc = zzmv.zzf(obj, j).hashCode();
                        i9 = iZzc + i7;
                    }
                    break;
                case 62:
                    if (zzR(obj, i11, i10)) {
                        i8 = i9 * 53;
                        iZzc2 = zzr(obj, j);
                        i9 = i8 + iZzc2;
                    }
                    break;
                case 63:
                    if (zzR(obj, i11, i10)) {
                        i8 = i9 * 53;
                        iZzc2 = zzr(obj, j);
                        i9 = i8 + iZzc2;
                    }
                    break;
                case 64:
                    if (zzR(obj, i11, i10)) {
                        i8 = i9 * 53;
                        iZzc2 = zzr(obj, j);
                        i9 = i8 + iZzc2;
                    }
                    break;
                case 65:
                    if (zzR(obj, i11, i10)) {
                        i7 = i9 * 53;
                        iZzc = zzkk.zzc(zzC(obj, j));
                        i9 = iZzc + i7;
                    }
                    break;
                case 66:
                    if (zzR(obj, i11, i10)) {
                        i8 = i9 * 53;
                        iZzc2 = zzr(obj, j);
                        i9 = i8 + iZzc2;
                    }
                    break;
                case 67:
                    if (zzR(obj, i11, i10)) {
                        i7 = i9 * 53;
                        iZzc = zzkk.zzc(zzC(obj, j));
                        i9 = iZzc + i7;
                    }
                    break;
                case 68:
                    if (zzR(obj, i11, i10)) {
                        i7 = i9 * 53;
                        iZzc = zzmv.zzf(obj, j).hashCode();
                        i9 = iZzc + i7;
                    }
                    break;
            }
        }
        int iHashCode2 = this.zzn.zzc(obj).hashCode() + (i9 * 53);
        if (!this.zzh) {
            return iHashCode2;
        }
        this.zzo.zza(obj);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x03ad A[PHI: r0 r28 r33
      0x03ad: PHI (r0v35 int) = (r0v29 int), (r0v32 int), (r0v37 int) binds: [B:137:0x0416, B:133:0x03f0, B:124:0x03ab] A[DONT_GENERATE, DONT_INLINE]
      0x03ad: PHI (r28v7 sun.misc.Unsafe) = (r28v5 sun.misc.Unsafe), (r28v5 sun.misc.Unsafe), (r28v8 sun.misc.Unsafe) binds: [B:137:0x0416, B:133:0x03f0, B:124:0x03ab] A[DONT_GENERATE, DONT_INLINE]
      0x03ad: PHI (r33v5 int) = (r33v3 int), (r33v3 int), (r33v6 int) binds: [B:137:0x0416, B:133:0x03f0, B:124:0x03ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:127:0x03c7 A[PHI: r0 r28 r33
      0x03c7: PHI (r0v33 int) = (r0v29 int), (r0v32 int), (r0v37 int) binds: [B:137:0x0416, B:133:0x03f0, B:124:0x03ab] A[DONT_GENERATE, DONT_INLINE]
      0x03c7: PHI (r28v6 sun.misc.Unsafe) = (r28v5 sun.misc.Unsafe), (r28v5 sun.misc.Unsafe), (r28v8 sun.misc.Unsafe) binds: [B:137:0x0416, B:133:0x03f0, B:124:0x03ab] A[DONT_GENERATE, DONT_INLINE]
      0x03c7: PHI (r33v4 int) = (r33v3 int), (r33v3 int), (r33v6 int) binds: [B:137:0x0416, B:133:0x03f0, B:124:0x03ab] A[DONT_GENERATE, DONT_INLINE]] */
    public final int zzc(Object obj, byte[] bArr, int i7, int i8, int i9, zzio zzioVar) throws zzkm {
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
        zzio zzioVar2;
        int i18;
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
        zzlm<T> zzlmVar2 = this;
        Object obj3 = obj;
        bArr = bArr;
        i8 = i8;
        int i29 = i9;
        zzio zzioVar3 = zzioVar;
        Unsafe unsafe2 = zzb;
        int iZzi = i7;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        int i33 = -1;
        int i34 = 1048575;
        while (true) {
            if (iZzi < i8) {
                int i35 = iZzi + 1;
                byte b7 = bArr[iZzi];
                if (b7 < 0) {
                    int iZzk = zzip.zzk(b7, bArr, i35, zzioVar3);
                    i11 = zzioVar3.zza;
                    i35 = iZzk;
                } else {
                    i11 = b7;
                }
                int i36 = i11 >>> 3;
                int i37 = i11 & 7;
                int iZzx = i36 > i33 ? zzlmVar2.zzx(i36, i31 / 3) : zzlmVar2.zzw(i36);
                if (iZzx == -1) {
                    i12 = i36;
                    i13 = i11;
                    i14 = i32;
                    unsafe = unsafe2;
                    i15 = i29;
                    i16 = 0;
                    i17 = i35;
                } else {
                    int[] iArr = zzlmVar2.zzc;
                    int i38 = iArr[iZzx + 1];
                    int iZzA = zzA(i38);
                    int i39 = i35;
                    long j = i38 & 1048575;
                    int i40 = i11;
                    if (iZzA <= 17) {
                        int i41 = iArr[iZzx + 2];
                        int i42 = 1 << (i41 >>> 20);
                        int i43 = i41 & 1048575;
                        if (i43 != i34) {
                            if (i34 != 1048575) {
                                unsafe2.putInt(obj3, i34, i32);
                            }
                            i34 = i43;
                            i20 = unsafe2.getInt(obj3, i43);
                        } else {
                            i34 = i34;
                            i20 = i32;
                        }
                        switch (iZzA) {
                            case 0:
                                i21 = i36;
                                i22 = iZzx;
                                i23 = i39;
                                bArr = bArr;
                                if (i37 == 1) {
                                    zzmv.zzo(obj3, j, Double.longBitsToDouble(zzip.zzn(bArr, i23)));
                                    iZzi = i23 + 8;
                                    i32 = i20 | i42;
                                    i33 = i21;
                                    i30 = i40;
                                    i34 = i34;
                                    i31 = i22;
                                    i29 = i9;
                                } else {
                                    i15 = i9;
                                    i14 = i20;
                                    unsafe = unsafe2;
                                    i12 = i21;
                                    i17 = i23;
                                    i13 = i40;
                                    i34 = i34;
                                    i16 = i22;
                                }
                                break;
                            case 1:
                                i21 = i36;
                                i22 = iZzx;
                                i23 = i39;
                                bArr = bArr;
                                if (i37 == 5) {
                                    zzmv.zzp(obj3, j, Float.intBitsToFloat(zzip.zzb(bArr, i23)));
                                    iZzi = i23 + 4;
                                    i32 = i20 | i42;
                                    i33 = i21;
                                    i30 = i40;
                                    i34 = i34;
                                    i31 = i22;
                                    i29 = i9;
                                } else {
                                    i15 = i9;
                                    i14 = i20;
                                    unsafe = unsafe2;
                                    i12 = i21;
                                    i17 = i23;
                                    i13 = i40;
                                    i34 = i34;
                                    i16 = i22;
                                }
                                break;
                            case 2:
                            case 3:
                                i21 = i36;
                                i22 = iZzx;
                                i23 = i39;
                                bArr = bArr;
                                if (i37 == 0) {
                                    int iZzm = zzip.zzm(bArr, i23, zzioVar3);
                                    unsafe2.putLong(obj, j, zzioVar3.zzb);
                                    i32 = i20 | i42;
                                    iZzi = iZzm;
                                    i33 = i21;
                                    i30 = i40;
                                    i34 = i34;
                                    i31 = i22;
                                    i29 = i9;
                                } else {
                                    i15 = i9;
                                    i14 = i20;
                                    unsafe = unsafe2;
                                    i12 = i21;
                                    i17 = i23;
                                    i13 = i40;
                                    i34 = i34;
                                    i16 = i22;
                                }
                                break;
                            case 4:
                            case 11:
                                i21 = i36;
                                i22 = iZzx;
                                i23 = i39;
                                bArr = bArr;
                                if (i37 == 0) {
                                    iZzi = zzip.zzj(bArr, i23, zzioVar3);
                                    unsafe2.putInt(obj3, j, zzioVar3.zza);
                                    i32 = i20 | i42;
                                    i33 = i21;
                                    i30 = i40;
                                    i34 = i34;
                                    i31 = i22;
                                    i29 = i9;
                                } else {
                                    i15 = i9;
                                    i14 = i20;
                                    unsafe = unsafe2;
                                    i12 = i21;
                                    i17 = i23;
                                    i13 = i40;
                                    i34 = i34;
                                    i16 = i22;
                                }
                                break;
                            case 5:
                            case 14:
                                i21 = i36;
                                i24 = iZzx;
                                i25 = i39;
                                i26 = i40;
                                bArr = bArr;
                                if (i37 == 1) {
                                    i22 = i24;
                                    i40 = i26;
                                    i23 = i25;
                                    unsafe2.putLong(obj, j, zzip.zzn(bArr, i25));
                                    iZzi = i23 + 8;
                                    i32 = i20 | i42;
                                    i33 = i21;
                                    i30 = i40;
                                    i34 = i34;
                                    i31 = i22;
                                    i29 = i9;
                                } else {
                                    i22 = i24;
                                    i40 = i26;
                                    i23 = i25;
                                    i15 = i9;
                                    i14 = i20;
                                    unsafe = unsafe2;
                                    i12 = i21;
                                    i17 = i23;
                                    i13 = i40;
                                    i34 = i34;
                                    i16 = i22;
                                }
                                break;
                            case 6:
                            case 13:
                                i21 = i36;
                                i24 = iZzx;
                                i25 = i39;
                                i26 = i40;
                                bArr = bArr;
                                if (i37 == 5) {
                                    unsafe2.putInt(obj3, j, zzip.zzb(bArr, i25));
                                    int i44 = i25 + 4;
                                    i32 = i20 | i42;
                                    i31 = i24;
                                    iZzi = i44;
                                    i33 = i21;
                                    i30 = i26;
                                    i34 = i34;
                                    i8 = i8;
                                    i29 = i9;
                                } else {
                                    i22 = i24;
                                    i40 = i26;
                                    i23 = i25;
                                    i15 = i9;
                                    i14 = i20;
                                    unsafe = unsafe2;
                                    i12 = i21;
                                    i17 = i23;
                                    i13 = i40;
                                    i34 = i34;
                                    i16 = i22;
                                }
                                break;
                            case 7:
                                i28 = i8;
                                i21 = i36;
                                i24 = iZzx;
                                i25 = i39;
                                i26 = i40;
                                bArr = bArr;
                                if (i37 == 0) {
                                    int iZzm2 = zzip.zzm(bArr, i25, zzioVar3);
                                    zzmv.zzm(obj3, j, zzioVar3.zzb != 0);
                                    i31 = i24;
                                    iZzi = iZzm2;
                                    i32 = i20 | i42;
                                    i33 = i21;
                                    i29 = i9;
                                    int i45 = i26;
                                    i8 = i28;
                                    i30 = i45;
                                } else {
                                    i22 = i24;
                                    i40 = i26;
                                    i23 = i25;
                                    i15 = i9;
                                    i14 = i20;
                                    unsafe = unsafe2;
                                    i12 = i21;
                                    i17 = i23;
                                    i13 = i40;
                                    i34 = i34;
                                    i16 = i22;
                                }
                                break;
                            case 8:
                                i28 = i8;
                                i21 = i36;
                                i24 = iZzx;
                                i25 = i39;
                                i26 = i40;
                                bArr = bArr;
                                if (i37 == 2) {
                                    int iZzg = (536870912 & i38) == 0 ? zzip.zzg(bArr, i25, zzioVar3) : zzip.zzh(bArr, i25, zzioVar3);
                                    unsafe2.putObject(obj3, j, zzioVar3.zzc);
                                    i32 = i20 | i42;
                                    i31 = i24;
                                    iZzi = iZzg;
                                    i33 = i21;
                                    i29 = i9;
                                    int i46 = i26;
                                    i8 = i28;
                                    i30 = i46;
                                } else {
                                    i22 = i24;
                                    i40 = i26;
                                    i23 = i25;
                                    i15 = i9;
                                    i14 = i20;
                                    unsafe = unsafe2;
                                    i12 = i21;
                                    i17 = i23;
                                    i13 = i40;
                                    i34 = i34;
                                    i16 = i22;
                                }
                                break;
                            case 9:
                                i21 = i36;
                                i27 = iZzx;
                                i25 = i39;
                                i26 = i40;
                                bArr = bArr;
                                if (i37 == 2) {
                                    i28 = i8;
                                    iZzi = zzip.zzd(zzlmVar2.zzE(i27), bArr, i25, i28, zzioVar3);
                                    if ((i20 & i42) == 0) {
                                        unsafe2.putObject(obj3, j, zzioVar3.zzc);
                                    } else {
                                        unsafe2.putObject(obj3, j, zzkk.zzg(unsafe2.getObject(obj3, j), zzioVar3.zzc));
                                    }
                                    i32 = i20 | i42;
                                    i31 = i27;
                                    i33 = i21;
                                    i29 = i9;
                                    int i47 = i26;
                                    i8 = i28;
                                    i30 = i47;
                                } else {
                                    i22 = i27;
                                    i40 = i26;
                                    i23 = i25;
                                    i15 = i9;
                                    i14 = i20;
                                    unsafe = unsafe2;
                                    i12 = i21;
                                    i17 = i23;
                                    i13 = i40;
                                    i34 = i34;
                                    i16 = i22;
                                }
                                break;
                            case 10:
                                i21 = i36;
                                i27 = iZzx;
                                i25 = i39;
                                i26 = i40;
                                bArr = bArr;
                                if (i37 == 2) {
                                    iZzi = zzip.zza(bArr, i25, zzioVar3);
                                    unsafe2.putObject(obj3, j, zzioVar3.zzc);
                                    i32 = i20 | i42;
                                    i31 = i27;
                                    i33 = i21;
                                    i30 = i26;
                                    i34 = i34;
                                    i8 = i8;
                                    i29 = i9;
                                } else {
                                    i22 = i27;
                                    i40 = i26;
                                    i23 = i25;
                                    i15 = i9;
                                    i14 = i20;
                                    unsafe = unsafe2;
                                    i12 = i21;
                                    i17 = i23;
                                    i13 = i40;
                                    i34 = i34;
                                    i16 = i22;
                                }
                                break;
                            case 12:
                                i21 = i36;
                                i27 = iZzx;
                                i25 = i39;
                                i26 = i40;
                                bArr = bArr;
                                if (i37 == 0) {
                                    iZzi = zzip.zzj(bArr, i25, zzioVar3);
                                    int i48 = zzioVar3.zza;
                                    zzkg zzkgVarZzD = zzlmVar2.zzD(i27);
                                    if (zzkgVarZzD == null || zzkgVarZzD.zza(i48)) {
                                        unsafe2.putInt(obj3, j, i48);
                                        i32 = i20 | i42;
                                    } else {
                                        zzd(obj).zzh(i26, Long.valueOf(i48));
                                        i32 = i20;
                                    }
                                    i31 = i27;
                                    i33 = i21;
                                    i30 = i26;
                                    i34 = i34;
                                    i8 = i8;
                                    i29 = i9;
                                } else {
                                    i22 = i27;
                                    i40 = i26;
                                    i23 = i25;
                                    i15 = i9;
                                    i14 = i20;
                                    unsafe = unsafe2;
                                    i12 = i21;
                                    i17 = i23;
                                    i13 = i40;
                                    i34 = i34;
                                    i16 = i22;
                                }
                                break;
                            case 15:
                                i21 = i36;
                                i27 = iZzx;
                                i25 = i39;
                                i26 = i40;
                                bArr = bArr;
                                if (i37 == 0) {
                                    iZzi = zzip.zzj(bArr, i25, zzioVar3);
                                    unsafe2.putInt(obj3, j, zzjf.zzb(zzioVar3.zza));
                                    i32 = i20 | i42;
                                    i31 = i27;
                                    i33 = i21;
                                    i30 = i26;
                                    i34 = i34;
                                    i8 = i8;
                                    i29 = i9;
                                } else {
                                    i22 = i27;
                                    i40 = i26;
                                    i23 = i25;
                                    i15 = i9;
                                    i14 = i20;
                                    unsafe = unsafe2;
                                    i12 = i21;
                                    i17 = i23;
                                    i13 = i40;
                                    i34 = i34;
                                    i16 = i22;
                                }
                                break;
                            case 16:
                                i21 = i36;
                                if (i37 == 0) {
                                    bArr = bArr;
                                    int iZzm3 = zzip.zzm(bArr, i39, zzioVar3);
                                    i26 = i40;
                                    unsafe2.putLong(obj, j, zzjf.zzc(zzioVar3.zzb));
                                    i32 = i20 | i42;
                                    i31 = iZzx;
                                    iZzi = iZzm3;
                                    i33 = i21;
                                    i30 = i26;
                                    i34 = i34;
                                    i8 = i8;
                                    i29 = i9;
                                } else {
                                    i40 = i40;
                                    i23 = i39;
                                    i22 = iZzx;
                                    i15 = i9;
                                    i14 = i20;
                                    unsafe = unsafe2;
                                    i12 = i21;
                                    i17 = i23;
                                    i13 = i40;
                                    i34 = i34;
                                    i16 = i22;
                                }
                                break;
                            default:
                                if (i37 == 3) {
                                    iZzi = zzip.zzc(zzlmVar2.zzE(iZzx), bArr, i39, i8, (i36 << 3) | 4, zzioVar);
                                    if ((i20 & i42) == 0) {
                                        unsafe2.putObject(obj3, j, zzioVar3.zzc);
                                    } else {
                                        unsafe2.putObject(obj3, j, zzkk.zzg(unsafe2.getObject(obj3, j), zzioVar3.zzc));
                                    }
                                    i32 = i20 | i42;
                                    i31 = iZzx;
                                    i30 = i40;
                                    i33 = i36;
                                    i34 = i34;
                                    i29 = i9;
                                } else {
                                    i21 = i36;
                                    i22 = iZzx;
                                    i23 = i39;
                                    i15 = i9;
                                    i14 = i20;
                                    unsafe = unsafe2;
                                    i12 = i21;
                                    i17 = i23;
                                    i13 = i40;
                                    i34 = i34;
                                    i16 = i22;
                                }
                                break;
                        }
                    } else {
                        if (iZzA != 27) {
                            i14 = i32;
                            i18 = i34;
                            i16 = iZzx;
                            if (iZzA <= 49) {
                                i12 = i36;
                                unsafe = unsafe2;
                                iZzi = zzv(obj, bArr, i39, i8, i40, i12, i37, i16, i38, iZzA, j, zzioVar);
                                if (iZzi != i39) {
                                    zzlmVar2 = this;
                                    obj3 = obj;
                                    i33 = i12;
                                    i29 = i9;
                                    zzioVar3 = zzioVar;
                                    i32 = i14;
                                    i30 = i40;
                                    i31 = i16;
                                    i34 = i18;
                                } else {
                                    i17 = iZzi;
                                    i13 = i40;
                                    i34 = i18;
                                    i15 = i9;
                                }
                                unsafe2 = unsafe;
                            } else {
                                i12 = i36;
                                unsafe = unsafe2;
                                i19 = i39;
                                if (iZzA != 50) {
                                    iZzi = zzt(obj, bArr, i19, i8, i40, i12, i37, i38, iZzA, j, i16, zzioVar);
                                    if (iZzi != i19) {
                                        zzlmVar2 = this;
                                        obj3 = obj;
                                        i33 = i12;
                                        i29 = i9;
                                        zzioVar3 = zzioVar;
                                        i32 = i14;
                                        i30 = i40;
                                        i31 = i16;
                                        i34 = i18;
                                    } else {
                                        i17 = iZzi;
                                        i13 = i40;
                                        i34 = i18;
                                        i15 = i9;
                                    }
                                    unsafe2 = unsafe;
                                } else if (i37 == 2) {
                                    iZzi = zzs(obj, bArr, i19, i8, i16, j, zzioVar);
                                    if (iZzi != i19) {
                                        zzlmVar2 = this;
                                        obj3 = obj;
                                        i33 = i12;
                                        i29 = i9;
                                        zzioVar3 = zzioVar;
                                        i32 = i14;
                                        i30 = i40;
                                        i31 = i16;
                                        i34 = i18;
                                    } else {
                                        i17 = iZzi;
                                        i13 = i40;
                                        i34 = i18;
                                        i15 = i9;
                                    }
                                    unsafe2 = unsafe;
                                }
                            }
                        } else if (i37 == 2) {
                            zzkj zzkjVarZzd = (zzkj) unsafe2.getObject(obj3, j);
                            if (!zzkjVarZzd.zzc()) {
                                int size = zzkjVarZzd.size();
                                zzkjVarZzd = zzkjVarZzd.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj3, j, zzkjVarZzd);
                            }
                            i30 = i40;
                            i34 = i34;
                            iZzi = zzip.zze(zzlmVar2.zzE(iZzx), i30, bArr, i39, i8, zzkjVarZzd, zzioVar);
                            i31 = iZzx;
                            i33 = i36;
                            i32 = i32;
                            i34 = i34;
                            i29 = i9;
                        } else {
                            i14 = i32;
                            i18 = i34;
                            i12 = i36;
                            unsafe = unsafe2;
                            i19 = i39;
                            i16 = iZzx;
                        }
                        i15 = i9;
                        i17 = i19;
                        i13 = i40;
                        i34 = i18;
                    }
                }
                if (i13 != i15 || i15 == 0) {
                    int i49 = i15;
                    if (this.zzh) {
                        zzioVar2 = zzioVar;
                        if (zzioVar2.zzd != zzjo.zza()) {
                            i12 = i12;
                            if (zzioVar2.zzd.zzc(this.zzg, i12) != null) {
                                throw null;
                            }
                            iZzi = zzip.zzi(i13, bArr, i17, i8, zzd(obj), zzioVar);
                            obj = obj;
                        }
                        i30 = i13;
                        zzlmVar2 = this;
                        i33 = i12;
                        obj3 = obj;
                        i32 = i14;
                        i31 = i16;
                        i29 = i49;
                        zzioVar3 = zzioVar2;
                        unsafe2 = unsafe;
                    } else {
                        zzioVar2 = zzioVar;
                    }
                    iZzi = zzip.zzi(i13, bArr, i17, i8, zzd(obj), zzioVar);
                    i30 = i13;
                    zzlmVar2 = this;
                    i33 = i12;
                    obj3 = obj;
                    i32 = i14;
                    i31 = i16;
                    i29 = i49;
                    zzioVar3 = zzioVar2;
                    unsafe2 = unsafe;
                } else {
                    zzlmVar = this;
                    obj2 = obj;
                    i10 = i15;
                    iZzi = i17;
                    i30 = i13;
                    i32 = i14;
                }
            } else {
                unsafe = unsafe2;
                i10 = i29;
                obj2 = obj3;
                zzlmVar = zzlmVar2;
            }
        }
        if (i34 != 1048575) {
            unsafe.putInt(obj2, i34, i32);
        }
        for (int i50 = zzlmVar.zzk; i50 < zzlmVar.zzl; i50++) {
            int i51 = zzlmVar.zzj[i50];
            int i52 = zzlmVar.zzc[i51];
            Object objZzf = zzmv.zzf(obj2, zzlmVar.zzB(i51) & 1048575);
            if (objZzf != null && zzlmVar.zzD(i51) != null) {
                throw null;
            }
        }
        if (i10 == 0) {
            if (iZzi != i8) {
                throw zzkm.zze();
            }
        } else if (iZzi > i8 || i30 != i10) {
            throw zzkm.zze();
        }
        return iZzi;
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
            long jZzB = zzB(this.zzj[i8]) & 1048575;
            Object objZzf = zzmv.zzf(obj, jZzB);
            if (objZzf != null) {
                ((zzld) objZzf).zzc();
                zzmv.zzs(obj, jZzB, objZzf);
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
            int iZzB = zzB(i7);
            long j = 1048575 & iZzB;
            int i8 = this.zzc[i7];
            switch (zzA(iZzB)) {
                case 0:
                    if (zzO(obj2, i7)) {
                        zzmv.zzo(obj, j, zzmv.zza(obj2, j));
                        zzJ(obj, i7);
                    }
                    break;
                case 1:
                    if (zzO(obj2, i7)) {
                        zzmv.zzp(obj, j, zzmv.zzb(obj2, j));
                        zzJ(obj, i7);
                    }
                    break;
                case 2:
                    if (zzO(obj2, i7)) {
                        zzmv.zzr(obj, j, zzmv.zzd(obj2, j));
                        zzJ(obj, i7);
                    }
                    break;
                case 3:
                    if (zzO(obj2, i7)) {
                        zzmv.zzr(obj, j, zzmv.zzd(obj2, j));
                        zzJ(obj, i7);
                    }
                    break;
                case 4:
                    if (zzO(obj2, i7)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i7);
                    }
                    break;
                case 5:
                    if (zzO(obj2, i7)) {
                        zzmv.zzr(obj, j, zzmv.zzd(obj2, j));
                        zzJ(obj, i7);
                    }
                    break;
                case 6:
                    if (zzO(obj2, i7)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i7);
                    }
                    break;
                case 7:
                    if (zzO(obj2, i7)) {
                        zzmv.zzm(obj, j, zzmv.zzw(obj2, j));
                        zzJ(obj, i7);
                    }
                    break;
                case 8:
                    if (zzO(obj2, i7)) {
                        zzmv.zzs(obj, j, zzmv.zzf(obj2, j));
                        zzJ(obj, i7);
                    }
                    break;
                case 9:
                    zzH(obj, obj2, i7);
                    break;
                case 10:
                    if (zzO(obj2, i7)) {
                        zzmv.zzs(obj, j, zzmv.zzf(obj2, j));
                        zzJ(obj, i7);
                    }
                    break;
                case 11:
                    if (zzO(obj2, i7)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i7);
                    }
                    break;
                case 12:
                    if (zzO(obj2, i7)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i7);
                    }
                    break;
                case 13:
                    if (zzO(obj2, i7)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i7);
                    }
                    break;
                case 14:
                    if (zzO(obj2, i7)) {
                        zzmv.zzr(obj, j, zzmv.zzd(obj2, j));
                        zzJ(obj, i7);
                    }
                    break;
                case 15:
                    if (zzO(obj2, i7)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i7);
                    }
                    break;
                case 16:
                    if (zzO(obj2, i7)) {
                        zzmv.zzr(obj, j, zzmv.zzd(obj2, j));
                        zzJ(obj, i7);
                    }
                    break;
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
                    }
                    break;
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
                    }
                    break;
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
    public final void zzh(Object obj, byte[] bArr, int i7, int i8, zzio zzioVar) throws zzkm {
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
            int iZzB = zzB(i7);
            int i8 = this.zzc[i7];
            switch (zzA(iZzB)) {
                case 0:
                    if (zzO(obj, i7)) {
                        zzndVar.zzf(i8, zzmv.zza(obj, iZzB & 1048575));
                    }
                    break;
                case 1:
                    if (zzO(obj, i7)) {
                        zzndVar.zzo(i8, zzmv.zzb(obj, iZzB & 1048575));
                    }
                    break;
                case 2:
                    if (zzO(obj, i7)) {
                        zzndVar.zzt(i8, zzmv.zzd(obj, iZzB & 1048575));
                    }
                    break;
                case 3:
                    if (zzO(obj, i7)) {
                        zzndVar.zzJ(i8, zzmv.zzd(obj, iZzB & 1048575));
                    }
                    break;
                case 4:
                    if (zzO(obj, i7)) {
                        zzndVar.zzr(i8, zzmv.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 5:
                    if (zzO(obj, i7)) {
                        zzndVar.zzm(i8, zzmv.zzd(obj, iZzB & 1048575));
                    }
                    break;
                case 6:
                    if (zzO(obj, i7)) {
                        zzndVar.zzk(i8, zzmv.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 7:
                    if (zzO(obj, i7)) {
                        zzndVar.zzb(i8, zzmv.zzw(obj, iZzB & 1048575));
                    }
                    break;
                case 8:
                    if (zzO(obj, i7)) {
                        zzT(i8, zzmv.zzf(obj, iZzB & 1048575), zzndVar);
                    }
                    break;
                case 9:
                    if (zzO(obj, i7)) {
                        zzndVar.zzv(i8, zzmv.zzf(obj, iZzB & 1048575), zzE(i7));
                    }
                    break;
                case 10:
                    if (zzO(obj, i7)) {
                        zzndVar.zzd(i8, (zzjb) zzmv.zzf(obj, iZzB & 1048575));
                    }
                    break;
                case 11:
                    if (zzO(obj, i7)) {
                        zzndVar.zzH(i8, zzmv.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 12:
                    if (zzO(obj, i7)) {
                        zzndVar.zzi(i8, zzmv.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 13:
                    if (zzO(obj, i7)) {
                        zzndVar.zzw(i8, zzmv.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 14:
                    if (zzO(obj, i7)) {
                        zzndVar.zzy(i8, zzmv.zzd(obj, iZzB & 1048575));
                    }
                    break;
                case 15:
                    if (zzO(obj, i7)) {
                        zzndVar.zzA(i8, zzmv.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 16:
                    if (zzO(obj, i7)) {
                        zzndVar.zzC(i8, zzmv.zzd(obj, iZzB & 1048575));
                    }
                    break;
                case 17:
                    if (zzO(obj, i7)) {
                        zzndVar.zzq(i8, zzmv.zzf(obj, iZzB & 1048575), zzE(i7));
                    }
                    break;
                case 18:
                    zzlw.zzJ(i8, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 19:
                    zzlw.zzN(i8, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 20:
                    zzlw.zzQ(i8, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case zzbbd.zzt.zzm /* 21 */:
                    zzlw.zzY(i8, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 22:
                    zzlw.zzP(i8, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 23:
                    zzlw.zzM(i8, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 24:
                    zzlw.zzL(i8, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 25:
                    zzlw.zzH(i8, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 26:
                    zzlw.zzW(i8, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar);
                    break;
                case 27:
                    zzlw.zzR(i8, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, zzE(i7));
                    break;
                case 28:
                    zzlw.zzI(i8, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar);
                    break;
                case 29:
                    zzlw.zzX(i8, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 30:
                    zzlw.zzK(i8, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 31:
                    zzlw.zzS(i8, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 32:
                    zzlw.zzT(i8, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 33:
                    zzlw.zzU(i8, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 34:
                    zzlw.zzV(i8, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 35:
                    zzlw.zzJ(i8, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 36:
                    zzlw.zzN(i8, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 37:
                    zzlw.zzQ(i8, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 38:
                    zzlw.zzY(i8, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 39:
                    zzlw.zzP(i8, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 40:
                    zzlw.zzM(i8, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 41:
                    zzlw.zzL(i8, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 42:
                    zzlw.zzH(i8, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 43:
                    zzlw.zzX(i8, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 44:
                    zzlw.zzK(i8, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 45:
                    zzlw.zzS(i8, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 46:
                    zzlw.zzT(i8, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 47:
                    zzlw.zzU(i8, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 48:
                    zzlw.zzV(i8, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 49:
                    zzlw.zzO(i8, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, zzE(i7));
                    break;
                case 50:
                    zzM(zzndVar, i8, zzmv.zzf(obj, iZzB & 1048575), i7);
                    break;
                case 51:
                    if (zzR(obj, i8, i7)) {
                        zzndVar.zzf(i8, zzn(obj, iZzB & 1048575));
                    }
                    break;
                case 52:
                    if (zzR(obj, i8, i7)) {
                        zzndVar.zzo(i8, zzo(obj, iZzB & 1048575));
                    }
                    break;
                case 53:
                    if (zzR(obj, i8, i7)) {
                        zzndVar.zzt(i8, zzC(obj, iZzB & 1048575));
                    }
                    break;
                case 54:
                    if (zzR(obj, i8, i7)) {
                        zzndVar.zzJ(i8, zzC(obj, iZzB & 1048575));
                    }
                    break;
                case 55:
                    if (zzR(obj, i8, i7)) {
                        zzndVar.zzr(i8, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case 56:
                    if (zzR(obj, i8, i7)) {
                        zzndVar.zzm(i8, zzC(obj, iZzB & 1048575));
                    }
                    break;
                case 57:
                    if (zzR(obj, i8, i7)) {
                        zzndVar.zzk(i8, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case 58:
                    if (zzR(obj, i8, i7)) {
                        zzndVar.zzb(i8, zzS(obj, iZzB & 1048575));
                    }
                    break;
                case 59:
                    if (zzR(obj, i8, i7)) {
                        zzT(i8, zzmv.zzf(obj, iZzB & 1048575), zzndVar);
                    }
                    break;
                case 60:
                    if (zzR(obj, i8, i7)) {
                        zzndVar.zzv(i8, zzmv.zzf(obj, iZzB & 1048575), zzE(i7));
                    }
                    break;
                case 61:
                    if (zzR(obj, i8, i7)) {
                        zzndVar.zzd(i8, (zzjb) zzmv.zzf(obj, iZzB & 1048575));
                    }
                    break;
                case 62:
                    if (zzR(obj, i8, i7)) {
                        zzndVar.zzH(i8, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case 63:
                    if (zzR(obj, i8, i7)) {
                        zzndVar.zzi(i8, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case 64:
                    if (zzR(obj, i8, i7)) {
                        zzndVar.zzw(i8, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case 65:
                    if (zzR(obj, i8, i7)) {
                        zzndVar.zzy(i8, zzC(obj, iZzB & 1048575));
                    }
                    break;
                case 66:
                    if (zzR(obj, i8, i7)) {
                        zzndVar.zzA(i8, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case 67:
                    if (zzR(obj, i8, i7)) {
                        zzndVar.zzC(i8, zzC(obj, iZzB & 1048575));
                    }
                    break;
                case 68:
                    if (zzR(obj, i8, i7)) {
                        zzndVar.zzq(i8, zzmv.zzf(obj, iZzB & 1048575), zzE(i7));
                    }
                    break;
            }
        }
        zzml zzmlVar = this.zzn;
        zzmlVar.zzi(zzmlVar.zzc(obj), zzndVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final boolean zzj(Object obj, Object obj2) {
        boolean zZzZ;
        int length = this.zzc.length;
        for (int i7 = 0; i7 < length; i7 += 3) {
            int iZzB = zzB(i7);
            long j = iZzB & 1048575;
            switch (zzA(iZzB)) {
                case 0:
                    if (!zzN(obj, obj2, i7) || Double.doubleToLongBits(zzmv.zza(obj, j)) != Double.doubleToLongBits(zzmv.zza(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzN(obj, obj2, i7) || Float.floatToIntBits(zzmv.zzb(obj, j)) != Float.floatToIntBits(zzmv.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzN(obj, obj2, i7) || zzmv.zzd(obj, j) != zzmv.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzN(obj, obj2, i7) || zzmv.zzd(obj, j) != zzmv.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzN(obj, obj2, i7) || zzmv.zzc(obj, j) != zzmv.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzN(obj, obj2, i7) || zzmv.zzd(obj, j) != zzmv.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzN(obj, obj2, i7) || zzmv.zzc(obj, j) != zzmv.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzN(obj, obj2, i7) || zzmv.zzw(obj, j) != zzmv.zzw(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzN(obj, obj2, i7) || !zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzN(obj, obj2, i7) || !zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzN(obj, obj2, i7) || !zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzN(obj, obj2, i7) || zzmv.zzc(obj, j) != zzmv.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzN(obj, obj2, i7) || zzmv.zzc(obj, j) != zzmv.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzN(obj, obj2, i7) || zzmv.zzc(obj, j) != zzmv.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzN(obj, obj2, i7) || zzmv.zzd(obj, j) != zzmv.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzN(obj, obj2, i7) || zzmv.zzc(obj, j) != zzmv.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzN(obj, obj2, i7) || zzmv.zzd(obj, j) != zzmv.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzN(obj, obj2, i7) || !zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
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
                    zZzZ = zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j));
                    break;
                case 50:
                    zZzZ = zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j));
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
                    long jZzy = zzy(i7) & 1048575;
                    if (zzmv.zzc(obj, jZzy) != zzmv.zzc(obj2, jZzy) || !zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzZ) {
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

    /* JADX WARN: Code duplicated, block: B:42:0x009e  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c3 A[LOOP:1: B:45:0x00b2->B:50:0x00c3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00e1 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzlu
    public final boolean zzk(Object obj) {
        int i7;
        int i8;
        List list;
        zzlu zzluVarZzE;
        int i9;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        while (i12 < this.zzk) {
            int i13 = this.zzj[i12];
            int i14 = this.zzc[i13];
            int iZzB = zzB(i13);
            int i15 = this.zzc[i13 + 2];
            int i16 = i15 & 1048575;
            int i17 = 1 << (i15 >>> 20);
            if (i16 != i10) {
                if (i16 != 1048575) {
                    i11 = zzb.getInt(obj, i16);
                }
                i8 = i11;
                i7 = i16;
            } else {
                i7 = i10;
                i8 = i11;
            }
            if ((268435456 & iZzB) != 0 && !zzP(obj, i13, i7, i8, i17)) {
                return false;
            }
            int iZzA = zzA(iZzB);
            if (iZzA == 9 || iZzA == 17) {
                if (zzP(obj, i13, i7, i8, i17) && !zzQ(obj, iZzB, zzE(i13))) {
                    return false;
                }
            } else if (iZzA == 27) {
                list = (List) zzmv.zzf(obj, iZzB & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzluVarZzE = zzE(i13);
                    for (i9 = 0; i9 < list.size(); i9++) {
                        if (!zzluVarZzE.zzk(list.get(i9))) {
                            return false;
                        }
                    }
                }
            } else if (iZzA == 60 || iZzA == 68) {
                if (zzR(obj, i14, i13) && !zzQ(obj, iZzB, zzE(i13))) {
                    return false;
                }
            } else if (iZzA == 49) {
                list = (List) zzmv.zzf(obj, iZzB & 1048575);
                if (list.isEmpty()) {
                    zzluVarZzE = zzE(i13);
                    while (i9 < list.size()) {
                        if (!zzluVarZzE.zzk(list.get(i9))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzA == 50 && !((zzld) zzmv.zzf(obj, iZzB & 1048575)).isEmpty()) {
                throw null;
            }
            i12++;
            i10 = i7;
            i11 = i8;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        throw null;
    }
}
