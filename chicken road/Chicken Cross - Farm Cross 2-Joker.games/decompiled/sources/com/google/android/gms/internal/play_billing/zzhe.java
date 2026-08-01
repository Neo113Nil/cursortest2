package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import sun.misc.Unsafe;

/* compiled from: com.android.billingclient:billing@@8.3.0 */
/* loaded from: classes8.dex */
final class zzhe<T> implements zzhl<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzii.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzhb zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzib zzl;
    private final zzfi zzm;

    private zzhe(int[] iArr, Object[] objArr, int i, int i2, zzhb zzhbVar, boolean z, int[] iArr2, int i3, int i4, zzhg zzhgVar, zzgk zzgkVar, zzib zzibVar, zzfi zzfiVar, zzgw zzgwVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        boolean z2 = false;
        if (zzfiVar != null && (zzhbVar instanceof zzfr)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzi = iArr2;
        this.zzj = i3;
        this.zzk = i4;
        this.zzl = zzibVar;
        this.zzm = zzfiVar;
        this.zzg = zzhbVar;
    }

    private static void zzA(Object obj) {
        if (!zzL(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void zzB(Object obj, Object obj2, int i) {
        if (zzI(obj2, i)) {
            int zzs = zzs(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzs;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzhl zzv = zzv(i);
            if (!zzI(obj, i)) {
                if (zzL(object)) {
                    Object zze = zzv.zze();
                    zzv.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzD(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzL(object2)) {
                Object zze2 = zzv.zze();
                zzv.zzg(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            zzv.zzg(object2, object);
        }
    }

    private final void zzC(Object obj, Object obj2, int i) {
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        if (zzM(obj2, i2, i)) {
            int zzs = zzs(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzs;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2.toString());
            }
            zzhl zzv = zzv(i);
            if (!zzM(obj, i2, i)) {
                if (zzL(object)) {
                    Object zze = zzv.zze();
                    zzv.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzE(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzL(object2)) {
                Object zze2 = zzv.zze();
                zzv.zzg(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            zzv.zzg(object2, object);
        }
    }

    private final void zzD(Object obj, int i) {
        int zzp = zzp(i);
        long j = 1048575 & zzp;
        if (j == 1048575) {
            return;
        }
        zzii.zzq(obj, j, (1 << (zzp >>> 20)) | zzii.zzc(obj, j));
    }

    private final void zzE(Object obj, int i, int i2) {
        zzii.zzq(obj, zzp(i2) & 1048575, i);
    }

    private final void zzF(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzs(i) & 1048575, obj2);
        zzD(obj, i);
    }

    private final void zzG(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzs(i2) & 1048575, obj2);
        zzE(obj, i, i2);
    }

    private final boolean zzH(Object obj, Object obj2, int i) {
        return zzI(obj, i) == zzI(obj2, i);
    }

    private final boolean zzI(Object obj, int i) {
        int zzp = zzp(i);
        long j = zzp & 1048575;
        if (j != 1048575) {
            return (zzii.zzc(obj, j) & (1 << (zzp >>> 20))) != 0;
        }
        int zzs = zzs(i);
        long j2 = zzs & 1048575;
        switch (zzr(zzs)) {
            case 0:
                return Double.doubleToRawLongBits(zzii.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzii.zzb(obj, j2)) != 0;
            case 2:
                return zzii.zzd(obj, j2) != 0;
            case 3:
                return zzii.zzd(obj, j2) != 0;
            case 4:
                return zzii.zzc(obj, j2) != 0;
            case 5:
                return zzii.zzd(obj, j2) != 0;
            case 6:
                return zzii.zzc(obj, j2) != 0;
            case 7:
                return zzii.zzw(obj, j2);
            case 8:
                Object zzf = zzii.zzf(obj, j2);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzev) {
                    return !zzev.zza.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzii.zzf(obj, j2) != null;
            case 10:
                return !zzev.zza.equals(zzii.zzf(obj, j2));
            case 11:
                return zzii.zzc(obj, j2) != 0;
            case 12:
                return zzii.zzc(obj, j2) != 0;
            case 13:
                return zzii.zzc(obj, j2) != 0;
            case 14:
                return zzii.zzd(obj, j2) != 0;
            case 15:
                return zzii.zzc(obj, j2) != 0;
            case 16:
                return zzii.zzd(obj, j2) != 0;
            case 17:
                return zzii.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzJ(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzI(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzK(Object obj, int i, zzhl zzhlVar) {
        return zzhlVar.zzk(zzii.zzf(obj, i & 1048575));
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzfu) {
            return ((zzfu) obj).zzF();
        }
        return true;
    }

    private final boolean zzM(Object obj, int i, int i2) {
        return zzii.zzc(obj, (long) (zzp(i2) & 1048575)) == i;
    }

    private static boolean zzN(Object obj, long j) {
        return ((Boolean) zzii.zzf(obj, j)).booleanValue();
    }

    private static final int zzO(byte[] bArr, int i, int i2, zzir zzirVar, Class cls, zzej zzejVar) throws IOException {
        int i3;
        zzir zzirVar2 = zzir.DOUBLE;
        switch (zzirVar) {
            case DOUBLE:
                i3 = i + 8;
                zzejVar.zzc = Double.valueOf(Double.longBitsToDouble(zzek.zzp(bArr, i)));
                break;
            case FLOAT:
                i3 = i + 4;
                zzejVar.zzc = Float.valueOf(Float.intBitsToFloat(zzek.zzb(bArr, i)));
                break;
            case INT64:
            case UINT64:
                int zzl = zzek.zzl(bArr, i, zzejVar);
                zzejVar.zzc = Long.valueOf(zzejVar.zzb);
                return zzl;
            case INT32:
            case UINT32:
            case ENUM:
                int zzi = zzek.zzi(bArr, i, zzejVar);
                zzejVar.zzc = Integer.valueOf(zzejVar.zza);
                return zzi;
            case FIXED64:
            case SFIXED64:
                i3 = i + 8;
                zzejVar.zzc = Long.valueOf(zzek.zzp(bArr, i));
                break;
            case FIXED32:
            case SFIXED32:
                i3 = i + 4;
                zzejVar.zzc = Integer.valueOf(zzek.zzb(bArr, i));
                break;
            case BOOL:
                int zzl2 = zzek.zzl(bArr, i, zzejVar);
                zzejVar.zzc = Boolean.valueOf(zzejVar.zzb != 0);
                return zzl2;
            case STRING:
                return zzek.zzg(bArr, i, zzejVar);
            case GROUP:
            default:
                throw new RuntimeException("unsupported field type.");
            case MESSAGE:
                return zzek.zzd(zzhi.zza().zzb(cls), bArr, i, i2, zzejVar);
            case BYTES:
                return zzek.zza(bArr, i, zzejVar);
            case SINT32:
                int zzi2 = zzek.zzi(bArr, i, zzejVar);
                zzejVar.zzc = Integer.valueOf(zzey.zzb(zzejVar.zza));
                return zzi2;
            case SINT64:
                int zzl3 = zzek.zzl(bArr, i, zzejVar);
                zzejVar.zzc = Long.valueOf(zzey.zzc(zzejVar.zzb));
                return zzl3;
        }
        return i3;
    }

    private static final void zzP(int i, Object obj, zzit zzitVar) throws IOException {
        if (obj instanceof String) {
            zzitVar.zzH(i, (String) obj);
        } else {
            zzitVar.zzd(i, (zzev) obj);
        }
    }

    static zzic zzd(Object obj) {
        zzfu zzfuVar = (zzfu) obj;
        zzic zzicVar = zzfuVar.zzc;
        if (zzicVar != zzic.zzc()) {
            return zzicVar;
        }
        zzic zzf = zzic.zzf();
        zzfuVar.zzc = zzf;
        return zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0268  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzhe zzl(Class cls, zzgy zzgyVar, zzhg zzhgVar, zzgk zzgkVar, zzib zzibVar, zzfi zzfiVar, zzgw zzgwVar) {
        int i;
        int charAt;
        int charAt2;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        char charAt3;
        int i8;
        char charAt4;
        int i9;
        char charAt5;
        int i10;
        char charAt6;
        int i11;
        char charAt7;
        int i12;
        char charAt8;
        int i13;
        char charAt9;
        int i14;
        char charAt10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        zzhk zzhkVar;
        String str;
        int objectFieldOffset;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        Field zzz;
        int i25;
        char charAt11;
        int i26;
        int i27;
        int i28;
        int i29;
        Object obj;
        Field zzz2;
        Object obj2;
        Field zzz3;
        int i30;
        char charAt12;
        int i31;
        char charAt13;
        int i32;
        char charAt14;
        int i33;
        char charAt15;
        if (!(zzgyVar instanceof zzhk)) {
            throw null;
        }
        zzhk zzhkVar2 = (zzhk) zzgyVar;
        String zzd = zzhkVar2.zzd();
        int length = zzd.length();
        char c = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i34 = 1;
            while (true) {
                i = i34 + 1;
                if (zzd.charAt(i34) < 55296) {
                    break;
                }
                i34 = i;
            }
        } else {
            i = 1;
        }
        int i35 = i + 1;
        int charAt16 = zzd.charAt(i);
        if (charAt16 >= 55296) {
            int i36 = charAt16 & 8191;
            int i37 = 13;
            while (true) {
                i33 = i35 + 1;
                charAt15 = zzd.charAt(i35);
                if (charAt15 < 55296) {
                    break;
                }
                i36 |= (charAt15 & 8191) << i37;
                i37 += 13;
                i35 = i33;
            }
            charAt16 = i36 | (charAt15 << i37);
            i35 = i33;
        }
        if (charAt16 == 0) {
            i4 = 0;
            charAt = 0;
            charAt2 = 0;
            i2 = 0;
            i5 = 0;
            i3 = 0;
            iArr = zza;
            i6 = 0;
        } else {
            int i38 = i35 + 1;
            int charAt17 = zzd.charAt(i35);
            if (charAt17 >= 55296) {
                int i39 = charAt17 & 8191;
                int i40 = 13;
                while (true) {
                    i14 = i38 + 1;
                    charAt10 = zzd.charAt(i38);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i39 |= (charAt10 & 8191) << i40;
                    i40 += 13;
                    i38 = i14;
                }
                charAt17 = i39 | (charAt10 << i40);
                i38 = i14;
            }
            int i41 = i38 + 1;
            int charAt18 = zzd.charAt(i38);
            if (charAt18 >= 55296) {
                int i42 = charAt18 & 8191;
                int i43 = 13;
                while (true) {
                    i13 = i41 + 1;
                    charAt9 = zzd.charAt(i41);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i42 |= (charAt9 & 8191) << i43;
                    i43 += 13;
                    i41 = i13;
                }
                charAt18 = i42 | (charAt9 << i43);
                i41 = i13;
            }
            int i44 = i41 + 1;
            int charAt19 = zzd.charAt(i41);
            if (charAt19 >= 55296) {
                int i45 = charAt19 & 8191;
                int i46 = 13;
                while (true) {
                    i12 = i44 + 1;
                    charAt8 = zzd.charAt(i44);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i45 |= (charAt8 & 8191) << i46;
                    i46 += 13;
                    i44 = i12;
                }
                charAt19 = i45 | (charAt8 << i46);
                i44 = i12;
            }
            int i47 = i44 + 1;
            int charAt20 = zzd.charAt(i44);
            if (charAt20 >= 55296) {
                int i48 = charAt20 & 8191;
                int i49 = 13;
                while (true) {
                    i11 = i47 + 1;
                    charAt7 = zzd.charAt(i47);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i48 |= (charAt7 & 8191) << i49;
                    i49 += 13;
                    i47 = i11;
                }
                charAt20 = i48 | (charAt7 << i49);
                i47 = i11;
            }
            int i50 = i47 + 1;
            charAt = zzd.charAt(i47);
            if (charAt >= 55296) {
                int i51 = charAt & 8191;
                int i52 = 13;
                while (true) {
                    i10 = i50 + 1;
                    charAt6 = zzd.charAt(i50);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i51 |= (charAt6 & 8191) << i52;
                    i52 += 13;
                    i50 = i10;
                }
                charAt = i51 | (charAt6 << i52);
                i50 = i10;
            }
            int i53 = i50 + 1;
            charAt2 = zzd.charAt(i50);
            if (charAt2 >= 55296) {
                int i54 = charAt2 & 8191;
                int i55 = 13;
                while (true) {
                    i9 = i53 + 1;
                    charAt5 = zzd.charAt(i53);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i54 |= (charAt5 & 8191) << i55;
                    i55 += 13;
                    i53 = i9;
                }
                charAt2 = i54 | (charAt5 << i55);
                i53 = i9;
            }
            int i56 = i53 + 1;
            int charAt21 = zzd.charAt(i53);
            if (charAt21 >= 55296) {
                int i57 = charAt21 & 8191;
                int i58 = 13;
                while (true) {
                    i8 = i56 + 1;
                    charAt4 = zzd.charAt(i56);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i57 |= (charAt4 & 8191) << i58;
                    i58 += 13;
                    i56 = i8;
                }
                charAt21 = i57 | (charAt4 << i58);
                i56 = i8;
            }
            int i59 = i56 + 1;
            int charAt22 = zzd.charAt(i56);
            if (charAt22 >= 55296) {
                int i60 = charAt22 & 8191;
                int i61 = 13;
                while (true) {
                    i7 = i59 + 1;
                    charAt3 = zzd.charAt(i59);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i60 |= (charAt3 & 8191) << i61;
                    i61 += 13;
                    i59 = i7;
                }
                charAt22 = i60 | (charAt3 << i61);
                i59 = i7;
            }
            int i62 = charAt17 + charAt17 + charAt18;
            int[] iArr2 = new int[charAt22 + charAt2 + charAt21];
            i2 = charAt19;
            i3 = charAt22;
            i4 = i62;
            iArr = iArr2;
            i5 = charAt20;
            i6 = charAt17;
            i35 = i59;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzhkVar2.zze();
        Class<?> cls2 = zzhkVar2.zza().getClass();
        int i63 = i3 + charAt2;
        int i64 = charAt + charAt;
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr = new Object[i64];
        int i65 = i3;
        int i66 = i63;
        int i67 = 0;
        int i68 = 0;
        while (i35 < length) {
            int i69 = i35 + 1;
            int charAt23 = zzd.charAt(i35);
            if (charAt23 >= c) {
                int i70 = charAt23 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i32 = i71 + 1;
                    charAt14 = zzd.charAt(i71);
                    if (charAt14 < c) {
                        break;
                    }
                    i70 |= (charAt14 & 8191) << i72;
                    i72 += 13;
                    i71 = i32;
                }
                charAt23 = i70 | (charAt14 << i72);
                i15 = i32;
            } else {
                i15 = i69;
            }
            int i73 = i15 + 1;
            int charAt24 = zzd.charAt(i15);
            if (charAt24 >= c) {
                int i74 = charAt24 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i31 = i75 + 1;
                    charAt13 = zzd.charAt(i75);
                    if (charAt13 < c) {
                        break;
                    }
                    i74 |= (charAt13 & 8191) << i76;
                    i76 += 13;
                    i75 = i31;
                }
                charAt24 = i74 | (charAt13 << i76);
                i16 = i31;
            } else {
                i16 = i73;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i67] = i68;
                i67++;
            }
            int i77 = charAt24 & 255;
            int i78 = length;
            int i79 = charAt24 & 2048;
            int i80 = i5;
            if (i77 >= 51) {
                int i81 = i16 + 1;
                int charAt25 = zzd.charAt(i16);
                if (charAt25 >= 55296) {
                    int i82 = charAt25 & 8191;
                    int i83 = i81;
                    int i84 = 13;
                    while (true) {
                        i30 = i83 + 1;
                        charAt12 = zzd.charAt(i83);
                        i17 = i2;
                        if (charAt12 < 55296) {
                            break;
                        }
                        i82 |= (charAt12 & 8191) << i84;
                        i84 += 13;
                        i83 = i30;
                        i2 = i17;
                    }
                    charAt25 = i82 | (charAt12 << i84);
                    i28 = i30;
                } else {
                    i17 = i2;
                    i28 = i81;
                }
                int i85 = i77 - 51;
                int i86 = i28;
                if (i85 == 9 || i85 == 17) {
                    i29 = i4 + 1;
                    int i87 = i68 / 3;
                    objArr[i87 + i87 + 1] = zze[i4];
                } else {
                    if (i85 == 12) {
                        if (zzhkVar2.zzc() == 1 || i79 != 0) {
                            i29 = i4 + 1;
                            int i88 = i68 / 3;
                            objArr[i88 + i88 + 1] = zze[i4];
                        } else {
                            i79 = 0;
                        }
                    }
                    int i89 = charAt25 + charAt25;
                    obj = zze[i89];
                    if (obj instanceof Field) {
                        zzz2 = zzz(cls2, (String) obj);
                        zze[i89] = zzz2;
                    } else {
                        zzz2 = (Field) obj;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzz2);
                    int i90 = i89 + 1;
                    obj2 = zze[i90];
                    int i91 = i79;
                    if (obj2 instanceof Field) {
                        zzz3 = zzz(cls2, (String) obj2);
                        zze[i90] = zzz3;
                    } else {
                        zzz3 = (Field) obj2;
                    }
                    i18 = i4;
                    i22 = i86;
                    i19 = charAt23;
                    i20 = (int) unsafe.objectFieldOffset(zzz3);
                    i23 = 0;
                    str = zzd;
                    zzhkVar = zzhkVar2;
                    objectFieldOffset = objectFieldOffset2;
                    i24 = i91;
                }
                i4 = i29;
                int i892 = charAt25 + charAt25;
                obj = zze[i892];
                if (obj instanceof Field) {
                }
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zzz2);
                int i902 = i892 + 1;
                obj2 = zze[i902];
                int i912 = i79;
                if (obj2 instanceof Field) {
                }
                i18 = i4;
                i22 = i86;
                i19 = charAt23;
                i20 = (int) unsafe.objectFieldOffset(zzz3);
                i23 = 0;
                str = zzd;
                zzhkVar = zzhkVar2;
                objectFieldOffset = objectFieldOffset22;
                i24 = i912;
            } else {
                i17 = i2;
                i18 = i4 + 1;
                Field zzz4 = zzz(cls2, (String) zze[i4]);
                i19 = charAt23;
                if (i77 == 9 || i77 == 17) {
                    zzhkVar = zzhkVar2;
                    int i92 = i68 / 3;
                    objArr[i92 + i92 + 1] = zzz4.getType();
                } else {
                    if (i77 == 27) {
                        zzhkVar = zzhkVar2;
                        i26 = 1;
                        i27 = i4 + 2;
                    } else if (i77 == 49) {
                        i27 = i4 + 2;
                        zzhkVar = zzhkVar2;
                        i26 = 1;
                    } else {
                        if (i77 == 12 || i77 == 30 || i77 == 44) {
                            zzhkVar = zzhkVar2;
                            if (zzhkVar2.zzc() == 1 || i79 != 0) {
                                i27 = i4 + 2;
                                int i93 = i68 / 3;
                                objArr[i93 + i93 + 1] = zze[i18];
                                str = zzd;
                                i18 = i27;
                            } else {
                                str = zzd;
                                i79 = 0;
                            }
                        } else if (i77 == 50) {
                            int i94 = i4 + 2;
                            int i95 = i65 + 1;
                            iArr[i65] = i68;
                            int i96 = i68 / 3;
                            int i97 = i96 + i96;
                            objArr[i97] = zze[i18];
                            if (i79 != 0) {
                                i18 = i4 + 3;
                                objArr[i97 + 1] = zze[i94];
                                str = zzd;
                                i65 = i95;
                                zzhkVar = zzhkVar2;
                            } else {
                                i18 = i94;
                                i65 = i95;
                                i79 = 0;
                                zzhkVar = zzhkVar2;
                            }
                        } else {
                            zzhkVar = zzhkVar2;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
                        i20 = 1048575;
                        if ((charAt24 & 4096) != 0 || i77 > 17) {
                            i21 = i79;
                            i22 = i16;
                            i23 = 0;
                        } else {
                            int i98 = i16 + 1;
                            int charAt26 = str.charAt(i16);
                            if (charAt26 >= 55296) {
                                int i99 = charAt26 & 8191;
                                int i100 = 13;
                                while (true) {
                                    i25 = i98 + 1;
                                    charAt11 = str.charAt(i98);
                                    if (charAt11 < 55296) {
                                        break;
                                    }
                                    i99 |= (charAt11 & 8191) << i100;
                                    i100 += 13;
                                    i98 = i25;
                                }
                                charAt26 = i99 | (charAt11 << i100);
                                i98 = i25;
                            }
                            int i101 = i6 + i6 + (charAt26 / 32);
                            Object obj3 = zze[i101];
                            i22 = i98;
                            if (obj3 instanceof Field) {
                                zzz = (Field) obj3;
                            } else {
                                zzz = zzz(cls2, (String) obj3);
                                zze[i101] = zzz;
                            }
                            i21 = i79;
                            i23 = charAt26 % 32;
                            i20 = (int) unsafe.objectFieldOffset(zzz);
                        }
                        if (i77 >= 18 && i77 <= 49) {
                            iArr[i66] = objectFieldOffset;
                            i66++;
                        }
                        i24 = i21;
                    }
                    int i102 = i68 / 3;
                    objArr[i102 + i102 + i26] = zze[i18];
                    str = zzd;
                    i18 = i27;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
                    i20 = 1048575;
                    if ((charAt24 & 4096) != 0) {
                    }
                    i21 = i79;
                    i22 = i16;
                    i23 = 0;
                    if (i77 >= 18) {
                        iArr[i66] = objectFieldOffset;
                        i66++;
                    }
                    i24 = i21;
                }
                str = zzd;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
                i20 = 1048575;
                if ((charAt24 & 4096) != 0) {
                }
                i21 = i79;
                i22 = i16;
                i23 = 0;
                if (i77 >= 18) {
                }
                i24 = i21;
            }
            int i103 = i68 + 1;
            iArr3[i68] = i19;
            int i104 = i68 + 2;
            Class<?> cls3 = cls2;
            iArr3[i103] = objectFieldOffset | (i24 != 0 ? Integer.MIN_VALUE : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | (i77 << 20);
            i68 += 3;
            iArr3[i104] = (i23 << 20) | i20;
            zzd = str;
            i4 = i18;
            length = i78;
            i5 = i80;
            cls2 = cls3;
            zzhkVar2 = zzhkVar;
            i35 = i22;
            i2 = i17;
            c = 55296;
        }
        return new zzhe(iArr3, objArr, i2, i5, zzhkVar2.zza(), false, iArr, i3, i63, zzhgVar, zzgkVar, zzibVar, zzfiVar, zzgwVar);
    }

    private static double zzm(Object obj, long j) {
        return ((Double) zzii.zzf(obj, j)).doubleValue();
    }

    private static float zzn(Object obj, long j) {
        return ((Float) zzii.zzf(obj, j)).floatValue();
    }

    private static int zzo(Object obj, long j) {
        return ((Integer) zzii.zzf(obj, j)).intValue();
    }

    private final int zzp(int i) {
        return this.zzc[i + 2];
    }

    private final int zzq(int i, int i2) {
        int[] iArr = this.zzc;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int zzr(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzs(int i) {
        return this.zzc[i + 1];
    }

    private static long zzt(Object obj, long j) {
        return ((Long) zzii.zzf(obj, j)).longValue();
    }

    private final zzfx zzu(int i) {
        int i2 = i / 3;
        return (zzfx) this.zzd[i2 + i2 + 1];
    }

    private final zzhl zzv(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzhl zzhlVar = (zzhl) objArr[i3];
        if (zzhlVar != null) {
            return zzhlVar;
        }
        zzhl zzb2 = zzhi.zza().zzb((Class) objArr[i3 + 1]);
        objArr[i3] = zzb2;
        return zzb2;
    }

    private final Object zzw(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzx(Object obj, int i) {
        zzhl zzv = zzv(i);
        int zzs = zzs(i) & 1048575;
        if (!zzI(obj, i)) {
            return zzv.zze();
        }
        Object object = zzb.getObject(obj, zzs);
        if (zzL(object)) {
            return object;
        }
        Object zze = zzv.zze();
        if (object != null) {
            zzv.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzy(Object obj, int i, int i2) {
        zzhl zzv = zzv(i2);
        if (!zzM(obj, i, i2)) {
            return zzv.zze();
        }
        Object object = zzb.getObject(obj, zzs(i2) & 1048575);
        if (zzL(object)) {
            return object;
        }
        Object zze = zzv.zze();
        if (object != null) {
            zzv.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzz(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v115, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v118, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v120, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v137 */
    /* JADX WARN: Type inference failed for: r0v185, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v253, types: [int] */
    /* JADX WARN: Type inference failed for: r0v260, types: [int] */
    /* JADX WARN: Type inference failed for: r0v265 */
    /* JADX WARN: Type inference failed for: r0v266 */
    /* JADX WARN: Type inference failed for: r0v267 */
    /* JADX WARN: Type inference failed for: r0v268 */
    /* JADX WARN: Type inference failed for: r0v269 */
    /* JADX WARN: Type inference failed for: r0v270 */
    /* JADX WARN: Type inference failed for: r0v271 */
    /* JADX WARN: Type inference failed for: r0v272 */
    /* JADX WARN: Type inference failed for: r0v273 */
    /* JADX WARN: Type inference failed for: r0v274 */
    /* JADX WARN: Type inference failed for: r0v275 */
    /* JADX WARN: Type inference failed for: r0v276 */
    /* JADX WARN: Type inference failed for: r0v277 */
    /* JADX WARN: Type inference failed for: r0v278 */
    /* JADX WARN: Type inference failed for: r0v279 */
    /* JADX WARN: Type inference failed for: r0v280 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v118, types: [int] */
    /* JADX WARN: Type inference failed for: r1v121, types: [int] */
    /* JADX WARN: Type inference failed for: r1v158 */
    /* JADX WARN: Type inference failed for: r1v161 */
    /* JADX WARN: Type inference failed for: r1v162 */
    /* JADX WARN: Type inference failed for: r1v163 */
    /* JADX WARN: Type inference failed for: r1v164 */
    /* JADX WARN: Type inference failed for: r1v78, types: [int] */
    /* JADX WARN: Type inference failed for: r1v80 */
    /* JADX WARN: Type inference failed for: r2v32, types: [int] */
    /* JADX WARN: Type inference failed for: r2v40, types: [int] */
    /* JADX WARN: Type inference failed for: r2v42, types: [int] */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49, types: [int] */
    /* JADX WARN: Type inference failed for: r2v77 */
    /* JADX WARN: Type inference failed for: r2v78, types: [int] */
    /* JADX WARN: Type inference failed for: r2v80 */
    /* JADX WARN: Type inference failed for: r2v81, types: [int] */
    /* JADX WARN: Type inference failed for: r2v92 */
    /* JADX WARN: Type inference failed for: r2v93 */
    /* JADX WARN: Type inference failed for: r2v94 */
    /* JADX WARN: Type inference failed for: r2v95 */
    /* JADX WARN: Type inference failed for: r2v96 */
    /* JADX WARN: Type inference failed for: r2v97 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28, types: [int] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31, types: [int] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v38, types: [int] */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v45, types: [int] */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32, types: [int] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v39, types: [int] */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    @Override // com.google.android.gms.internal.play_billing.zzhl
    public final int zza(Object obj) {
        int i;
        int i2;
        ?? r5;
        int zzy;
        int zzy2;
        int zzy3;
        int zzz;
        int zzy4;
        int zzy5;
        int zzb2;
        int zzy6;
        ?? zzh;
        int size;
        int zzy7;
        int zzb3;
        int zzy8;
        int zzb4;
        int zzy9;
        ?? r3;
        int zzi;
        int zzy10;
        ?? r1;
        ?? r0;
        int zzf;
        int zzy11;
        int zzy12;
        ?? r4;
        Unsafe unsafe = zzb;
        boolean z = false;
        int i3 = 1048575;
        ?? r12 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (true) {
            int[] iArr = this.zzc;
            if (i4 >= iArr.length) {
                int zza2 = i5 + ((zzfu) obj).zzc.zza();
                if (!this.zzh) {
                    return zza2;
                }
                zzht zzhtVar = ((zzfr) obj).zzb.zza;
                int zzc = zzhtVar.zzc();
                int i7 = 0;
                for (int i8 = 0; i8 < zzc; i8++) {
                    Map.Entry zzg = zzhtVar.zzg(i8);
                    i7 += zzfm.zzc((zzfl) ((zzhp) zzg).zza(), zzg.getValue());
                }
                for (Map.Entry entry : zzhtVar.zzd()) {
                    i7 += zzfm.zzc((zzfl) entry.getKey(), entry.getValue());
                }
                return zza2 + i7;
            }
            int zzs = zzs(i4);
            int zzr = zzr(zzs);
            int i9 = iArr[i4];
            int i10 = iArr[i4 + 2];
            int i11 = i10 & i3;
            if (zzr <= 17) {
                if (i11 != i6) {
                    r12 = i11 == i3 ? z : unsafe.getInt(obj, i11);
                    i6 = i11;
                }
                i = i6;
                i2 = r12;
                r5 = 1 << (i10 >>> 20);
            } else {
                i = i6;
                i2 = r12;
                r5 = z;
            }
            int i12 = zzs & i3;
            if (zzr >= zzfn.DOUBLE_LIST_PACKED.zza()) {
                zzfn.SINT64_LIST_PACKED.zza();
            }
            long j = i12;
            switch (zzr) {
                case 0:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        zzy = zzfc.zzy(i9 << 3);
                        r0 = zzy + 8;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        zzy2 = zzfc.zzy(i9 << 3);
                        r0 = zzy2 + 4;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        long j2 = unsafe.getLong(obj, j);
                        zzy3 = zzfc.zzy(i9 << 3);
                        zzz = zzfc.zzz(j2);
                        r0 = zzy3 + zzz;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        long j3 = unsafe.getLong(obj, j);
                        zzy3 = zzfc.zzy(i9 << 3);
                        zzz = zzfc.zzz(j3);
                        r0 = zzy3 + zzz;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        long j4 = unsafe.getInt(obj, j);
                        zzy3 = zzfc.zzy(i9 << 3);
                        zzz = zzfc.zzz(j4);
                        r0 = zzy3 + zzz;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        zzy = zzfc.zzy(i9 << 3);
                        r0 = zzy + 8;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        zzy2 = zzfc.zzy(i9 << 3);
                        r0 = zzy2 + 4;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        zzy4 = zzfc.zzy(i9 << 3);
                        r0 = zzy4 + 1;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        int i13 = i9 << 3;
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzev) {
                            zzy5 = zzfc.zzy(i13);
                            zzb2 = ((zzev) object).zze();
                            zzy6 = zzfc.zzy(zzb2);
                        } else {
                            zzy5 = zzfc.zzy(i13);
                            zzb2 = zzin.zzb((String) object);
                            zzy6 = zzfc.zzy(zzb2);
                        }
                        r0 = zzy5 + zzy6 + zzb2;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        r0 = zzhn.zzi(i9, unsafe.getObject(obj, j), zzv(i4));
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        zzev zzevVar = (zzev) unsafe.getObject(obj, j);
                        zzy5 = zzfc.zzy(i9 << 3);
                        zzb2 = zzevVar.zze();
                        zzy6 = zzfc.zzy(zzb2);
                        r0 = zzy5 + zzy6 + zzb2;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        int i14 = unsafe.getInt(obj, j);
                        zzy3 = zzfc.zzy(i9 << 3);
                        zzz = zzfc.zzy(i14);
                        r0 = zzy3 + zzz;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        long j5 = unsafe.getInt(obj, j);
                        zzy3 = zzfc.zzy(i9 << 3);
                        zzz = zzfc.zzz(j5);
                        r0 = zzy3 + zzz;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        zzy2 = zzfc.zzy(i9 << 3);
                        r0 = zzy2 + 4;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        zzy = zzfc.zzy(i9 << 3);
                        r0 = zzy + 8;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        int i15 = unsafe.getInt(obj, j);
                        zzy3 = zzfc.zzy(i9 << 3);
                        zzz = zzfc.zzy((i15 >> 31) ^ (i15 + i15));
                        r0 = zzy3 + zzz;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        long j6 = unsafe.getLong(obj, j);
                        zzy3 = zzfc.zzy(i9 << 3);
                        zzz = zzfc.zzz((j6 >> 63) ^ (j6 + j6));
                        r0 = zzy3 + zzz;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        r0 = zzhn.zza(i9, (zzhb) unsafe.getObject(obj, j), zzv(i4));
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    r0 = zzhn.zze(i9, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    break;
                case 19:
                    r0 = zzhn.zzc(i9, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j);
                    int i16 = zzhn.zza;
                    if (list.size() != 0) {
                        zzh = zzhn.zzh(list) + (list.size() * zzfc.zzy(i9 << 3));
                        i5 += zzh;
                        break;
                    }
                    zzh = z;
                    i5 += zzh;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j);
                    int i17 = zzhn.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzy3 = zzhn.zzm(list2);
                        zzy7 = zzfc.zzy(i9 << 3);
                        zzz = size * zzy7;
                        r0 = zzy3 + zzz;
                        i5 += r0;
                        break;
                    }
                    r0 = z;
                    i5 += r0;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i18 = zzhn.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzy3 = zzhn.zzg(list3);
                        zzy7 = zzfc.zzy(i9 << 3);
                        zzz = size * zzy7;
                        r0 = zzy3 + zzz;
                        i5 += r0;
                        break;
                    }
                    r0 = z;
                    i5 += r0;
                case 23:
                    r0 = zzhn.zze(i9, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    break;
                case 24:
                    r0 = zzhn.zzc(i9, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j);
                    int i19 = zzhn.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        r0 = size2 * (zzfc.zzy(i9 << 3) + 1);
                        i5 += r0;
                        break;
                    }
                    r0 = z;
                    i5 += r0;
                case 26:
                    ?? r02 = (List) unsafe.getObject(obj, j);
                    int i20 = zzhn.zza;
                    int size3 = r02.size();
                    if (size3 != 0) {
                        int zzy13 = zzfc.zzy(i9 << 3) * size3;
                        if (r02 instanceof zzgj) {
                            zzgj zzgjVar = (zzgj) r02;
                            zzh = zzy13;
                            for (?? r32 = z; r32 < size3; r32++) {
                                Object zza3 = zzgjVar.zza();
                                if (zza3 instanceof zzev) {
                                    zzb4 = ((zzev) zza3).zze();
                                    zzy9 = zzfc.zzy(zzb4);
                                } else {
                                    zzb4 = zzin.zzb((String) zza3);
                                    zzy9 = zzfc.zzy(zzb4);
                                }
                                zzh += zzy9 + zzb4;
                            }
                        } else {
                            zzh = zzy13;
                            for (?? r33 = z; r33 < size3; r33++) {
                                Object obj2 = r02.get(r33);
                                if (obj2 instanceof zzev) {
                                    zzb3 = ((zzev) obj2).zze();
                                    zzy8 = zzfc.zzy(zzb3);
                                } else {
                                    zzb3 = zzin.zzb((String) obj2);
                                    zzy8 = zzfc.zzy(zzb3);
                                }
                                zzh += zzy8 + zzb3;
                            }
                        }
                        i5 += zzh;
                        break;
                    }
                    zzh = z;
                    i5 += zzh;
                case 27:
                    ?? r03 = (List) unsafe.getObject(obj, j);
                    zzhl zzv = zzv(i4);
                    int i21 = zzhn.zza;
                    int size4 = r03.size();
                    if (size4 == 0) {
                        r3 = z;
                    } else {
                        r3 = zzfc.zzy(i9 << 3) * size4;
                        for (?? r42 = z; r42 < size4; r42++) {
                            Object obj3 = r03.get(r42);
                            if (obj3 instanceof zzgi) {
                                zzi = ((zzgi) obj3).zza();
                                zzy10 = zzfc.zzy(zzi);
                            } else {
                                zzi = ((zzeg) obj3).zzi(zzv);
                                zzy10 = zzfc.zzy(zzi);
                            }
                            r3 = (r3 == true ? 1 : 0) + zzy10 + zzi;
                        }
                    }
                    i5 += r3;
                    break;
                case 28:
                    ?? r04 = (List) unsafe.getObject(obj, j);
                    int i22 = zzhn.zza;
                    int size5 = r04.size();
                    if (size5 == 0) {
                        r1 = z;
                    } else {
                        r1 = size5 * zzfc.zzy(i9 << 3);
                        for (?? r2 = z; r2 < r04.size(); r2++) {
                            int zze = ((zzev) r04.get(r2)).zze();
                            r1 += zzfc.zzy(zze) + zze;
                        }
                    }
                    i5 += r1;
                    break;
                case 29:
                    List list5 = (List) unsafe.getObject(obj, j);
                    int i23 = zzhn.zza;
                    size = list5.size();
                    if (size != 0) {
                        zzy3 = zzhn.zzl(list5);
                        zzy7 = zzfc.zzy(i9 << 3);
                        zzz = size * zzy7;
                        r0 = zzy3 + zzz;
                        i5 += r0;
                        break;
                    }
                    r0 = z;
                    i5 += r0;
                case 30:
                    List list6 = (List) unsafe.getObject(obj, j);
                    int i24 = zzhn.zza;
                    size = list6.size();
                    if (size != 0) {
                        zzy3 = zzhn.zzb(list6);
                        zzy7 = zzfc.zzy(i9 << 3);
                        zzz = size * zzy7;
                        r0 = zzy3 + zzz;
                        i5 += r0;
                        break;
                    }
                    r0 = z;
                    i5 += r0;
                case 31:
                    r0 = zzhn.zzc(i9, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    break;
                case 32:
                    r0 = zzhn.zze(i9, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    break;
                case 33:
                    List list7 = (List) unsafe.getObject(obj, j);
                    int i25 = zzhn.zza;
                    size = list7.size();
                    if (size != 0) {
                        zzy3 = zzhn.zzj(list7);
                        zzy7 = zzfc.zzy(i9 << 3);
                        zzz = size * zzy7;
                        r0 = zzy3 + zzz;
                        i5 += r0;
                        break;
                    }
                    r0 = z;
                    i5 += r0;
                case 34:
                    List list8 = (List) unsafe.getObject(obj, j);
                    int i26 = zzhn.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzy3 = zzhn.zzk(list8);
                        zzy7 = zzfc.zzy(i9 << 3);
                        zzz = size * zzy7;
                        r0 = zzy3 + zzz;
                        i5 += r0;
                        break;
                    }
                    r0 = z;
                    i5 += r0;
                case 35:
                    zzf = zzhn.zzf((List) unsafe.getObject(obj, j));
                    if (zzf > 0) {
                        zzy11 = zzfc.zzy(i9 << 3);
                        zzy12 = zzfc.zzy(zzf);
                        r1 = zzy11 + zzy12 + zzf;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzf = zzhn.zzd((List) unsafe.getObject(obj, j));
                    if (zzf > 0) {
                        zzy11 = zzfc.zzy(i9 << 3);
                        zzy12 = zzfc.zzy(zzf);
                        r1 = zzy11 + zzy12 + zzf;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzf = zzhn.zzh((List) unsafe.getObject(obj, j));
                    if (zzf > 0) {
                        zzy11 = zzfc.zzy(i9 << 3);
                        zzy12 = zzfc.zzy(zzf);
                        r1 = zzy11 + zzy12 + zzf;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzf = zzhn.zzm((List) unsafe.getObject(obj, j));
                    if (zzf > 0) {
                        zzy11 = zzfc.zzy(i9 << 3);
                        zzy12 = zzfc.zzy(zzf);
                        r1 = zzy11 + zzy12 + zzf;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzf = zzhn.zzg((List) unsafe.getObject(obj, j));
                    if (zzf > 0) {
                        zzy11 = zzfc.zzy(i9 << 3);
                        zzy12 = zzfc.zzy(zzf);
                        r1 = zzy11 + zzy12 + zzf;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzf = zzhn.zzf((List) unsafe.getObject(obj, j));
                    if (zzf > 0) {
                        zzy11 = zzfc.zzy(i9 << 3);
                        zzy12 = zzfc.zzy(zzf);
                        r1 = zzy11 + zzy12 + zzf;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzf = zzhn.zzd((List) unsafe.getObject(obj, j));
                    if (zzf > 0) {
                        zzy11 = zzfc.zzy(i9 << 3);
                        zzy12 = zzfc.zzy(zzf);
                        r1 = zzy11 + zzy12 + zzf;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list9 = (List) unsafe.getObject(obj, j);
                    int i27 = zzhn.zza;
                    zzf = list9.size();
                    if (zzf > 0) {
                        zzy11 = zzfc.zzy(i9 << 3);
                        zzy12 = zzfc.zzy(zzf);
                        r1 = zzy11 + zzy12 + zzf;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzf = zzhn.zzl((List) unsafe.getObject(obj, j));
                    if (zzf > 0) {
                        zzy11 = zzfc.zzy(i9 << 3);
                        zzy12 = zzfc.zzy(zzf);
                        r1 = zzy11 + zzy12 + zzf;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzf = zzhn.zzb((List) unsafe.getObject(obj, j));
                    if (zzf > 0) {
                        zzy11 = zzfc.zzy(i9 << 3);
                        zzy12 = zzfc.zzy(zzf);
                        r1 = zzy11 + zzy12 + zzf;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzf = zzhn.zzd((List) unsafe.getObject(obj, j));
                    if (zzf > 0) {
                        zzy11 = zzfc.zzy(i9 << 3);
                        zzy12 = zzfc.zzy(zzf);
                        r1 = zzy11 + zzy12 + zzf;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzf = zzhn.zzf((List) unsafe.getObject(obj, j));
                    if (zzf > 0) {
                        zzy11 = zzfc.zzy(i9 << 3);
                        zzy12 = zzfc.zzy(zzf);
                        r1 = zzy11 + zzy12 + zzf;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzf = zzhn.zzj((List) unsafe.getObject(obj, j));
                    if (zzf > 0) {
                        zzy11 = zzfc.zzy(i9 << 3);
                        zzy12 = zzfc.zzy(zzf);
                        r1 = zzy11 + zzy12 + zzf;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzf = zzhn.zzk((List) unsafe.getObject(obj, j));
                    if (zzf > 0) {
                        zzy11 = zzfc.zzy(i9 << 3);
                        zzy12 = zzfc.zzy(zzf);
                        r1 = zzy11 + zzy12 + zzf;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    ?? r05 = (List) unsafe.getObject(obj, j);
                    zzhl zzv2 = zzv(i4);
                    int i28 = zzhn.zza;
                    int size6 = r05.size();
                    if (size6 == 0) {
                        r4 = z;
                    } else {
                        boolean z2 = z;
                        r4 = z2;
                        ?? r34 = z2;
                        while (r34 < size6) {
                            int zza4 = zzhn.zza(i9, (zzhb) r05.get(r34), zzv2);
                            r34++;
                            r4 = (r4 == true ? 1 : 0) + zza4;
                        }
                    }
                    i5 += r4;
                    break;
                case 50:
                    zzgv zzgvVar = (zzgv) unsafe.getObject(obj, j);
                    zzgu zzguVar = (zzgu) zzw(i4);
                    if (!zzgvVar.isEmpty()) {
                        zzh = z;
                        for (Map.Entry entry2 : zzgvVar.entrySet()) {
                            zzh += zzguVar.zza(i9, entry2.getKey(), entry2.getValue());
                        }
                        i5 += zzh;
                        break;
                    }
                    zzh = z;
                    i5 += zzh;
                case 51:
                    if (zzM(obj, i9, i4)) {
                        zzy = zzfc.zzy(i9 << 3);
                        r0 = zzy + 8;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzM(obj, i9, i4)) {
                        zzy2 = zzfc.zzy(i9 << 3);
                        r0 = zzy2 + 4;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzM(obj, i9, i4)) {
                        long zzt = zzt(obj, j);
                        zzy3 = zzfc.zzy(i9 << 3);
                        zzz = zzfc.zzz(zzt);
                        r0 = zzy3 + zzz;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzM(obj, i9, i4)) {
                        long zzt2 = zzt(obj, j);
                        zzy3 = zzfc.zzy(i9 << 3);
                        zzz = zzfc.zzz(zzt2);
                        r0 = zzy3 + zzz;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzM(obj, i9, i4)) {
                        long zzo = zzo(obj, j);
                        zzy3 = zzfc.zzy(i9 << 3);
                        zzz = zzfc.zzz(zzo);
                        r0 = zzy3 + zzz;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzM(obj, i9, i4)) {
                        zzy = zzfc.zzy(i9 << 3);
                        r0 = zzy + 8;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzM(obj, i9, i4)) {
                        zzy2 = zzfc.zzy(i9 << 3);
                        r0 = zzy2 + 4;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzM(obj, i9, i4)) {
                        zzy4 = zzfc.zzy(i9 << 3);
                        r0 = zzy4 + 1;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzM(obj, i9, i4)) {
                        int i29 = i9 << 3;
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzev) {
                            zzy5 = zzfc.zzy(i29);
                            zzb2 = ((zzev) object2).zze();
                            zzy6 = zzfc.zzy(zzb2);
                        } else {
                            zzy5 = zzfc.zzy(i29);
                            zzb2 = zzin.zzb((String) object2);
                            zzy6 = zzfc.zzy(zzb2);
                        }
                        r0 = zzy5 + zzy6 + zzb2;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzM(obj, i9, i4)) {
                        r0 = zzhn.zzi(i9, unsafe.getObject(obj, j), zzv(i4));
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzM(obj, i9, i4)) {
                        zzev zzevVar2 = (zzev) unsafe.getObject(obj, j);
                        zzy5 = zzfc.zzy(i9 << 3);
                        zzb2 = zzevVar2.zze();
                        zzy6 = zzfc.zzy(zzb2);
                        r0 = zzy5 + zzy6 + zzb2;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzM(obj, i9, i4)) {
                        int zzo2 = zzo(obj, j);
                        zzy3 = zzfc.zzy(i9 << 3);
                        zzz = zzfc.zzy(zzo2);
                        r0 = zzy3 + zzz;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzM(obj, i9, i4)) {
                        long zzo3 = zzo(obj, j);
                        zzy3 = zzfc.zzy(i9 << 3);
                        zzz = zzfc.zzz(zzo3);
                        r0 = zzy3 + zzz;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzM(obj, i9, i4)) {
                        zzy2 = zzfc.zzy(i9 << 3);
                        r0 = zzy2 + 4;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzM(obj, i9, i4)) {
                        zzy = zzfc.zzy(i9 << 3);
                        r0 = zzy + 8;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzM(obj, i9, i4)) {
                        int zzo4 = zzo(obj, j);
                        zzy3 = zzfc.zzy(i9 << 3);
                        zzz = zzfc.zzy((zzo4 >> 31) ^ (zzo4 + zzo4));
                        r0 = zzy3 + zzz;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzM(obj, i9, i4)) {
                        long zzt3 = zzt(obj, j);
                        zzy3 = zzfc.zzy(i9 << 3);
                        zzz = zzfc.zzz((zzt3 >> 63) ^ (zzt3 + zzt3));
                        r0 = zzy3 + zzz;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzM(obj, i9, i4)) {
                        r0 = zzhn.zza(i9, (zzhb) unsafe.getObject(obj, j), zzv(i4));
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
            }
            i4 += 3;
            i6 = i;
            r12 = i2;
            z = false;
            i3 = 1048575;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhl
    public final int zzb(Object obj) {
        int i;
        long doubleToLongBits;
        int floatToIntBits;
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i3 >= iArr.length) {
                int hashCode = (i4 * 53) + ((zzfu) obj).zzc.hashCode();
                return this.zzh ? (hashCode * 53) + ((zzfr) obj).zzb.zza.hashCode() : hashCode;
            }
            int zzs = zzs(i3);
            int i5 = 1048575 & zzs;
            int zzr = zzr(zzs);
            int i6 = iArr[i3];
            long j = i5;
            int i7 = 37;
            switch (zzr) {
                case 0:
                    i = i4 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzii.zza(obj, j));
                    byte[] bArr = zzga.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 1:
                    i = i4 * 53;
                    floatToIntBits = Float.floatToIntBits(zzii.zzb(obj, j));
                    i4 = i + floatToIntBits;
                    break;
                case 2:
                    i = i4 * 53;
                    doubleToLongBits = zzii.zzd(obj, j);
                    byte[] bArr2 = zzga.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 3:
                    i = i4 * 53;
                    doubleToLongBits = zzii.zzd(obj, j);
                    byte[] bArr3 = zzga.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 4:
                    i = i4 * 53;
                    floatToIntBits = zzii.zzc(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 5:
                    i = i4 * 53;
                    doubleToLongBits = zzii.zzd(obj, j);
                    byte[] bArr4 = zzga.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 6:
                    i = i4 * 53;
                    floatToIntBits = zzii.zzc(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 7:
                    i = i4 * 53;
                    floatToIntBits = zzga.zza(zzii.zzw(obj, j));
                    i4 = i + floatToIntBits;
                    break;
                case 8:
                    i = i4 * 53;
                    floatToIntBits = ((String) zzii.zzf(obj, j)).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 9:
                    i2 = i4 * 53;
                    Object zzf = zzii.zzf(obj, j);
                    if (zzf != null) {
                        i7 = zzf.hashCode();
                    }
                    i4 = i2 + i7;
                    break;
                case 10:
                    i = i4 * 53;
                    floatToIntBits = zzii.zzf(obj, j).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 11:
                    i = i4 * 53;
                    floatToIntBits = zzii.zzc(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 12:
                    i = i4 * 53;
                    floatToIntBits = zzii.zzc(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 13:
                    i = i4 * 53;
                    floatToIntBits = zzii.zzc(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 14:
                    i = i4 * 53;
                    doubleToLongBits = zzii.zzd(obj, j);
                    byte[] bArr5 = zzga.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 15:
                    i = i4 * 53;
                    floatToIntBits = zzii.zzc(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 16:
                    i = i4 * 53;
                    doubleToLongBits = zzii.zzd(obj, j);
                    byte[] bArr6 = zzga.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 17:
                    i2 = i4 * 53;
                    Object zzf2 = zzii.zzf(obj, j);
                    if (zzf2 != null) {
                        i7 = zzf2.hashCode();
                    }
                    i4 = i2 + i7;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
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
                    i = i4 * 53;
                    floatToIntBits = zzii.zzf(obj, j).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 50:
                    i = i4 * 53;
                    floatToIntBits = zzii.zzf(obj, j).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 51:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzm(obj, j));
                        byte[] bArr7 = zzga.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 52:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = Float.floatToIntBits(zzn(obj, j));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 53:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr8 = zzga.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 54:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr9 = zzga.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 55:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzo(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 56:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr10 = zzga.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 57:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzo(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 58:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzga.zza(zzN(obj, j));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 59:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = ((String) zzii.zzf(obj, j)).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 60:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzii.zzf(obj, j).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 61:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzii.zzf(obj, j).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 62:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzo(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 63:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzo(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 64:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzo(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 65:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr11 = zzga.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 66:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzo(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 67:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr12 = zzga.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 68:
                    if (!zzM(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzii.zzf(obj, j).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
            }
            i3 += 3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0d93, code lost:
    
        if (r7 == 1048575) goto L561;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0d95, code lost:
    
        r0.putInt(r10, r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0d99, code lost:
    
        r0 = r1.zzj;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x0abc, code lost:
    
        throw new com.google.android.gms.internal.play_billing.zzgc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0d9f, code lost:
    
        if (r0 >= r1.zzk) goto L689;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0da1, code lost:
    
        r4 = r1.zzi;
        r6 = r1.zzl;
        r7 = r1.zzc;
        r4 = r4[r0];
        r7 = r7[r4];
        r8 = com.google.android.gms.internal.play_billing.zzii.zzf(r10, r1.zzs(r4) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0db8, code lost:
    
        if (r8 == null) goto L690;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0dba, code lost:
    
        r12 = r1.zzu(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0dbe, code lost:
    
        if (r12 == null) goto L691;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0dc0, code lost:
    
        r4 = ((com.google.android.gms.internal.play_billing.zzgu) r1.zzw(r4)).zzc();
        r8 = ((com.google.android.gms.internal.play_billing.zzgv) r8).entrySet().iterator();
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0dd8, code lost:
    
        if (r8.hasNext() == false) goto L692;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0dda, code lost:
    
        r13 = (java.util.Map.Entry) r8.next();
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0dee, code lost:
    
        if (r12.zza(((java.lang.Integer) r13.getValue()).intValue()) != false) goto L693;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0df0, code lost:
    
        if (r3 != null) goto L575;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0df2, code lost:
    
        r3 = r6.zza(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0df6, code lost:
    
        r14 = com.google.android.gms.internal.play_billing.zzgu.zzb(r4, r13.getKey(), r13.getValue());
        r15 = com.google.android.gms.internal.play_billing.zzev.zza;
        r15 = new byte[r14];
        r16 = com.google.android.gms.internal.play_billing.zzfc.zzb;
        r9 = new com.google.android.gms.internal.play_billing.zzez(r15, 0, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0e0e, code lost:
    
        com.google.android.gms.internal.play_billing.zzgu.zze(r9, r4, r13.getKey(), r13.getValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0e19, code lost:
    
        r3.zzj((r7 << 3) | 2, com.google.android.gms.internal.play_billing.zzer.zza(r9, r15));
        r8.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0e38, code lost:
    
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0e31, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0e37, code lost:
    
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0e3b, code lost:
    
        r0 = r0 + 1;
        r1 = r31;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0e47, code lost:
    
        if (r3 == null) goto L585;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0e49, code lost:
    
        ((com.google.android.gms.internal.play_billing.zzfu) r10).zzc = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0e51, code lost:
    
        if (r11 != 0) goto L591;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0e55, code lost:
    
        if (r2 != r35) goto L589;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0e5f, code lost:
    
        throw new com.google.android.gms.internal.play_billing.zzgc(r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0e68, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0e60, code lost:
    
        r1 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0e64, code lost:
    
        if (r2 > r35) goto L595;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0e66, code lost:
    
        if (r5 != r11) goto L595;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0e6e, code lost:
    
        throw new com.google.android.gms.internal.play_billing.zzgc(r1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0993 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x09a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0d2b  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0d32  */
    /* JADX WARN: Removed duplicated region for block: B:736:0x005b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0d46  */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v102, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzc(Object obj, byte[] bArr, int i, int i2, int i3, zzej zzejVar) throws IOException {
        Object obj2;
        String str;
        Unsafe unsafe;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        zzhe<T> zzheVar;
        int i17;
        int i18;
        int zzl;
        int i19;
        zzhe<T> zzheVar2;
        Unsafe unsafe2;
        int i20;
        int i21;
        int i22;
        zzgt zzgtVar;
        Object obj3;
        zzgv zzgvVar;
        Object obj4;
        Object obj5;
        zzfz zzfzVar;
        zzhe<T> zzheVar3;
        int i23;
        Unsafe unsafe3;
        int i24;
        String str2;
        zzhe<T> zzheVar4;
        zzhe<T> zzheVar5;
        int zzi;
        Object obj6;
        int i25;
        zzhe<T> zzheVar6;
        int zzk;
        int i26;
        int i27;
        Unsafe unsafe4;
        int i28;
        zzhe<T> zzheVar7 = this;
        Object obj7 = obj;
        int i29 = i2;
        int i30 = i3;
        zzA(obj);
        Unsafe unsafe5 = zzb;
        int i31 = i;
        int i32 = -1;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = 1048575;
        while (true) {
            if (i31 < i29) {
                int i37 = i31 + 1;
                int i38 = bArr[i31];
                if (i38 < 0) {
                    i5 = zzek.zzj(i38, bArr, i37, zzejVar);
                    i4 = zzejVar.zza;
                } else {
                    i4 = i38;
                    i5 = i37;
                }
                int i39 = i4 >>> 3;
                if (i39 > i32) {
                    i7 = (i39 < zzheVar7.zze || i39 > zzheVar7.zzf) ? -1 : zzheVar7.zzq(i39, i33 / 3);
                } else if (i39 < zzheVar7.zze || i39 > zzheVar7.zzf) {
                    i6 = -1;
                    i7 = -1;
                    if (i7 != i6) {
                        obj2 = obj7;
                        i8 = i5;
                        i9 = i35;
                        i10 = i36;
                        str = "Failed to parse the message.";
                        unsafe = unsafe5;
                        i11 = i39;
                        i12 = 0;
                        i13 = i4;
                    } else {
                        int i40 = i4 & 7;
                        int[] iArr = zzheVar7.zzc;
                        int i41 = i4;
                        int i42 = iArr[i7 + 1];
                        str = "Failed to parse the message.";
                        int zzr = zzr(i42);
                        long j = i42 & 1048575;
                        int i43 = i39;
                        if (zzr <= 17) {
                            int i44 = iArr[i7 + 2];
                            int i45 = 1 << (i44 >>> 20);
                            int i46 = 1048575;
                            int i47 = i44 & 1048575;
                            int i48 = i5;
                            if (i47 != i36) {
                                if (i36 != 1048575) {
                                    unsafe5.putInt(obj7, i36, i35);
                                    i46 = 1048575;
                                }
                                i35 = i47 == i46 ? 0 : unsafe5.getInt(obj7, i47);
                            } else {
                                i47 = i36;
                            }
                            switch (zzr) {
                                case 0:
                                    zzheVar = this;
                                    i14 = i47;
                                    i17 = i48;
                                    i12 = i7;
                                    i16 = i41;
                                    if (i40 != 1) {
                                        zzheVar2 = zzheVar;
                                        i30 = i3;
                                        obj2 = obj7;
                                        i13 = i16;
                                        i9 = i35;
                                        i8 = i17;
                                        unsafe = unsafe5;
                                        zzheVar7 = zzheVar2;
                                        i10 = i14;
                                        i11 = i43;
                                        break;
                                    } else {
                                        i31 = i17 + 8;
                                        i35 |= i45;
                                        zzii.zzo(obj7, j, Double.longBitsToDouble(zzek.zzp(bArr, i17)));
                                        i29 = i2;
                                        i30 = i3;
                                        i34 = i16;
                                        zzheVar7 = zzheVar;
                                        i33 = i12;
                                        i36 = i14;
                                        i32 = i43;
                                    }
                                case 1:
                                    zzheVar = this;
                                    i14 = i47;
                                    i17 = i48;
                                    i12 = i7;
                                    i16 = i41;
                                    if (i40 != 5) {
                                        zzheVar2 = zzheVar;
                                        i30 = i3;
                                        obj2 = obj7;
                                        i13 = i16;
                                        i9 = i35;
                                        i8 = i17;
                                        unsafe = unsafe5;
                                        zzheVar7 = zzheVar2;
                                        i10 = i14;
                                        i11 = i43;
                                        break;
                                    } else {
                                        i31 = i17 + 4;
                                        i35 |= i45;
                                        zzii.zzp(obj7, j, Float.intBitsToFloat(zzek.zzb(bArr, i17)));
                                        i29 = i2;
                                        i30 = i3;
                                        i34 = i16;
                                        zzheVar7 = zzheVar;
                                        i33 = i12;
                                        i36 = i14;
                                        i32 = i43;
                                    }
                                case 2:
                                case 3:
                                    zzheVar = this;
                                    i14 = i47;
                                    i17 = i48;
                                    i12 = i7;
                                    i16 = i41;
                                    if (i40 != 0) {
                                        zzheVar2 = zzheVar;
                                        i30 = i3;
                                        obj2 = obj7;
                                        i13 = i16;
                                        i9 = i35;
                                        i8 = i17;
                                        unsafe = unsafe5;
                                        zzheVar7 = zzheVar2;
                                        i10 = i14;
                                        i11 = i43;
                                        break;
                                    } else {
                                        i18 = i45 | i35;
                                        zzl = zzek.zzl(bArr, i17, zzejVar);
                                        unsafe5.putLong(obj, j, zzejVar.zzb);
                                        i29 = i2;
                                        i30 = i3;
                                        i34 = i16;
                                        zzheVar7 = zzheVar;
                                        i33 = i12;
                                        i35 = i18;
                                        i31 = zzl;
                                        i36 = i14;
                                        i32 = i43;
                                    }
                                case 4:
                                case 11:
                                    zzheVar = this;
                                    i14 = i47;
                                    i17 = i48;
                                    i12 = i7;
                                    i16 = i41;
                                    if (i40 != 0) {
                                        zzheVar2 = zzheVar;
                                        i30 = i3;
                                        obj2 = obj7;
                                        i13 = i16;
                                        i9 = i35;
                                        i8 = i17;
                                        unsafe = unsafe5;
                                        zzheVar7 = zzheVar2;
                                        i10 = i14;
                                        i11 = i43;
                                        break;
                                    } else {
                                        i35 |= i45;
                                        i31 = zzek.zzi(bArr, i17, zzejVar);
                                        unsafe5.putInt(obj7, j, zzejVar.zza);
                                        i29 = i2;
                                        i30 = i3;
                                        i34 = i16;
                                        zzheVar7 = zzheVar;
                                        i33 = i12;
                                        i36 = i14;
                                        i32 = i43;
                                    }
                                case 5:
                                case 14:
                                    zzheVar = this;
                                    i14 = i47;
                                    i17 = i48;
                                    i12 = i7;
                                    i16 = i41;
                                    if (i40 != 1) {
                                        zzheVar2 = zzheVar;
                                        i30 = i3;
                                        obj2 = obj7;
                                        i13 = i16;
                                        i9 = i35;
                                        i8 = i17;
                                        unsafe = unsafe5;
                                        zzheVar7 = zzheVar2;
                                        i10 = i14;
                                        i11 = i43;
                                        break;
                                    } else {
                                        zzl = i17 + 8;
                                        i18 = i45 | i35;
                                        unsafe5.putLong(obj, j, zzek.zzp(bArr, i17));
                                        i29 = i2;
                                        i30 = i3;
                                        i34 = i16;
                                        zzheVar7 = zzheVar;
                                        i33 = i12;
                                        i35 = i18;
                                        i31 = zzl;
                                        i36 = i14;
                                        i32 = i43;
                                    }
                                case 6:
                                case 13:
                                    zzheVar = this;
                                    i14 = i47;
                                    i17 = i48;
                                    i12 = i7;
                                    i16 = i41;
                                    if (i40 != 5) {
                                        zzheVar2 = zzheVar;
                                        i30 = i3;
                                        obj2 = obj7;
                                        i13 = i16;
                                        i9 = i35;
                                        i8 = i17;
                                        unsafe = unsafe5;
                                        zzheVar7 = zzheVar2;
                                        i10 = i14;
                                        i11 = i43;
                                        break;
                                    } else {
                                        i31 = i17 + 4;
                                        i35 |= i45;
                                        unsafe5.putInt(obj7, j, zzek.zzb(bArr, i17));
                                        i29 = i2;
                                        i30 = i3;
                                        i34 = i16;
                                        zzheVar7 = zzheVar;
                                        i33 = i12;
                                        i36 = i14;
                                        i32 = i43;
                                    }
                                case 7:
                                    zzheVar = this;
                                    i14 = i47;
                                    i17 = i48;
                                    i12 = i7;
                                    i16 = i41;
                                    if (i40 != 0) {
                                        zzheVar2 = zzheVar;
                                        i30 = i3;
                                        obj2 = obj7;
                                        i13 = i16;
                                        i9 = i35;
                                        i8 = i17;
                                        unsafe = unsafe5;
                                        zzheVar7 = zzheVar2;
                                        i10 = i14;
                                        i11 = i43;
                                        break;
                                    } else {
                                        i35 |= i45;
                                        i31 = zzek.zzl(bArr, i17, zzejVar);
                                        zzii.zzm(obj7, j, zzejVar.zzb != 0);
                                        i29 = i2;
                                        i30 = i3;
                                        i34 = i16;
                                        zzheVar7 = zzheVar;
                                        i33 = i12;
                                        i36 = i14;
                                        i32 = i43;
                                    }
                                case 8:
                                    zzheVar = this;
                                    i14 = i47;
                                    i17 = i48;
                                    i12 = i7;
                                    i16 = i41;
                                    if (i40 != 2) {
                                        zzheVar2 = zzheVar;
                                        i30 = i3;
                                        obj2 = obj7;
                                        i13 = i16;
                                        i9 = i35;
                                        i8 = i17;
                                        unsafe = unsafe5;
                                        zzheVar7 = zzheVar2;
                                        i10 = i14;
                                        i11 = i43;
                                        break;
                                    } else {
                                        if ((i42 & 536870912) != 0) {
                                            i35 |= i45;
                                            i31 = zzek.zzg(bArr, i17, zzejVar);
                                        } else {
                                            i31 = zzek.zzi(bArr, i17, zzejVar);
                                            int i49 = zzejVar.zza;
                                            if (i49 < 0) {
                                                throw new zzgc("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            int i50 = i35 | i45;
                                            if (i49 == 0) {
                                                zzejVar.zzc = "";
                                            } else {
                                                zzejVar.zzc = new String(bArr, i31, i49, zzga.zza);
                                                i31 += i49;
                                            }
                                            i35 = i50;
                                        }
                                        unsafe5.putObject(obj7, j, zzejVar.zzc);
                                        i29 = i2;
                                        i30 = i3;
                                        i34 = i16;
                                        zzheVar7 = zzheVar;
                                        i33 = i12;
                                        i36 = i14;
                                        i32 = i43;
                                    }
                                case 9:
                                    zzheVar = this;
                                    i14 = i47;
                                    i19 = i48;
                                    i12 = i7;
                                    i16 = i41;
                                    if (i40 == 2) {
                                        Object zzx = zzheVar.zzx(obj7, i12);
                                        i31 = zzek.zzn(zzx, zzheVar.zzv(i12), bArr, i19, i2, zzejVar);
                                        zzheVar.zzF(obj7, i12, zzx);
                                        i30 = i3;
                                        i34 = i16;
                                        zzheVar7 = zzheVar;
                                        i35 |= i45;
                                        i33 = i12;
                                        i36 = i14;
                                        i32 = i43;
                                        break;
                                    }
                                    i17 = i19;
                                    zzheVar2 = zzheVar;
                                    i30 = i3;
                                    obj2 = obj7;
                                    i13 = i16;
                                    i9 = i35;
                                    i8 = i17;
                                    unsafe = unsafe5;
                                    zzheVar7 = zzheVar2;
                                    i10 = i14;
                                    i11 = i43;
                                    break;
                                case 10:
                                    zzheVar = this;
                                    i14 = i47;
                                    i19 = i48;
                                    i12 = i7;
                                    i16 = i41;
                                    if (i40 != 2) {
                                        i17 = i19;
                                        zzheVar2 = zzheVar;
                                        i30 = i3;
                                        obj2 = obj7;
                                        i13 = i16;
                                        i9 = i35;
                                        i8 = i17;
                                        unsafe = unsafe5;
                                        zzheVar7 = zzheVar2;
                                        i10 = i14;
                                        i11 = i43;
                                        break;
                                    } else {
                                        i35 |= i45;
                                        i31 = zzek.zza(bArr, i19, zzejVar);
                                        unsafe5.putObject(obj7, j, zzejVar.zzc);
                                        i29 = i2;
                                        i30 = i3;
                                        i34 = i16;
                                        zzheVar7 = zzheVar;
                                        i33 = i12;
                                        i36 = i14;
                                        i32 = i43;
                                    }
                                case 12:
                                    i14 = i47;
                                    i15 = i48;
                                    i16 = i41;
                                    i12 = i7;
                                    if (i40 != 0) {
                                        zzheVar2 = this;
                                        i17 = i15;
                                        i30 = i3;
                                        obj2 = obj7;
                                        i13 = i16;
                                        i9 = i35;
                                        i8 = i17;
                                        unsafe = unsafe5;
                                        zzheVar7 = zzheVar2;
                                        i10 = i14;
                                        i11 = i43;
                                        break;
                                    } else {
                                        i31 = zzek.zzi(bArr, i15, zzejVar);
                                        int i51 = zzejVar.zza;
                                        zzheVar = this;
                                        zzfx zzu = zzheVar.zzu(i12);
                                        if ((i42 & Integer.MIN_VALUE) == 0 || zzu == null || zzu.zza(i51)) {
                                            i35 |= i45;
                                            unsafe5.putInt(obj7, j, i51);
                                        } else {
                                            zzd(obj).zzj(i16, Long.valueOf(i51));
                                        }
                                        i29 = i2;
                                        i30 = i3;
                                        i34 = i16;
                                        zzheVar7 = zzheVar;
                                        i33 = i12;
                                        i36 = i14;
                                        i32 = i43;
                                    }
                                case 15:
                                    i14 = i47;
                                    i15 = i48;
                                    i16 = i41;
                                    i12 = i7;
                                    if (i40 != 0) {
                                        zzheVar2 = this;
                                        i17 = i15;
                                        i30 = i3;
                                        obj2 = obj7;
                                        i13 = i16;
                                        i9 = i35;
                                        i8 = i17;
                                        unsafe = unsafe5;
                                        zzheVar7 = zzheVar2;
                                        i10 = i14;
                                        i11 = i43;
                                        break;
                                    } else {
                                        i35 |= i45;
                                        i31 = zzek.zzi(bArr, i15, zzejVar);
                                        unsafe5.putInt(obj7, j, zzey.zzb(zzejVar.zza));
                                        i29 = i2;
                                        i30 = i3;
                                        i34 = i16;
                                        i33 = i12;
                                        i36 = i14;
                                        i32 = i43;
                                        zzheVar7 = this;
                                    }
                                case 16:
                                    if (i40 != 0) {
                                        i14 = i47;
                                        i15 = i48;
                                        i16 = i41;
                                        i12 = i7;
                                        zzheVar2 = this;
                                        i17 = i15;
                                        i30 = i3;
                                        obj2 = obj7;
                                        i13 = i16;
                                        i9 = i35;
                                        i8 = i17;
                                        unsafe = unsafe5;
                                        zzheVar7 = zzheVar2;
                                        i10 = i14;
                                        i11 = i43;
                                        break;
                                    } else {
                                        int i52 = i35 | i45;
                                        int zzl2 = zzek.zzl(bArr, i48, zzejVar);
                                        i14 = i47;
                                        unsafe5.putLong(obj, j, zzey.zzc(zzejVar.zzb));
                                        i29 = i2;
                                        i30 = i3;
                                        i34 = i41;
                                        i35 = i52;
                                        i33 = i7;
                                        i31 = zzl2;
                                        i36 = i14;
                                        i32 = i43;
                                        zzheVar7 = this;
                                    }
                                default:
                                    zzheVar = this;
                                    i14 = i47;
                                    i17 = i48;
                                    i12 = i7;
                                    i16 = i41;
                                    if (i40 == 3) {
                                        Object zzx2 = zzheVar.zzx(obj7, i12);
                                        i31 = zzek.zzm(zzx2, zzheVar.zzv(i12), bArr, i17, i2, (i43 << 3) | 4, zzejVar);
                                        zzheVar.zzF(obj7, i12, zzx2);
                                        i30 = i3;
                                        i34 = i16;
                                        i35 |= i45;
                                        i33 = i12;
                                        zzheVar7 = zzheVar;
                                        i36 = i14;
                                        i32 = i43;
                                        break;
                                    }
                                    zzheVar2 = zzheVar;
                                    i30 = i3;
                                    obj2 = obj7;
                                    i13 = i16;
                                    i9 = i35;
                                    i8 = i17;
                                    unsafe = unsafe5;
                                    zzheVar7 = zzheVar2;
                                    i10 = i14;
                                    i11 = i43;
                                    break;
                            }
                        } else {
                            int i53 = i5;
                            i12 = i7;
                            i10 = i36;
                            zzhe<T> zzheVar8 = zzheVar7;
                            i9 = i35;
                            if (zzr != 27) {
                                if (zzr > 49) {
                                    unsafe2 = unsafe5;
                                    i20 = i53;
                                    i29 = i2;
                                    if (zzr != 50) {
                                        unsafe = unsafe2;
                                        long j2 = iArr[i12 + 2] & 1048575;
                                        switch (zzr) {
                                            case 51:
                                                obj2 = obj;
                                                i13 = i41;
                                                str = str;
                                                i21 = i12;
                                                i11 = i43;
                                                zzheVar7 = this;
                                                if (i40 == 1) {
                                                    i31 = i20 + 8;
                                                    unsafe.putObject(obj2, j, Double.valueOf(Double.longBitsToDouble(zzek.zzp(bArr, i20))));
                                                    unsafe.putInt(obj2, j2, i11);
                                                    if (i31 == i20) {
                                                        i30 = i3;
                                                        i8 = i31;
                                                        i12 = i21;
                                                        break;
                                                    } else {
                                                        i30 = i3;
                                                        i34 = i13;
                                                        i32 = i11;
                                                        i33 = i21;
                                                        i35 = i9;
                                                        i36 = i10;
                                                        unsafe5 = unsafe;
                                                        obj7 = obj2;
                                                        break;
                                                    }
                                                }
                                                i31 = i20;
                                                if (i31 == i20) {
                                                }
                                            case 52:
                                                obj2 = obj;
                                                i13 = i41;
                                                str = str;
                                                i21 = i12;
                                                i11 = i43;
                                                zzheVar7 = this;
                                                if (i40 == 5) {
                                                    i31 = i20 + 4;
                                                    unsafe.putObject(obj2, j, Float.valueOf(Float.intBitsToFloat(zzek.zzb(bArr, i20))));
                                                    unsafe.putInt(obj2, j2, i11);
                                                    if (i31 == i20) {
                                                    }
                                                }
                                                i31 = i20;
                                                if (i31 == i20) {
                                                }
                                                break;
                                            case 53:
                                            case 54:
                                                obj2 = obj;
                                                i13 = i41;
                                                str = str;
                                                i21 = i12;
                                                i11 = i43;
                                                zzheVar7 = this;
                                                if (i40 == 0) {
                                                    i31 = zzek.zzl(bArr, i20, zzejVar);
                                                    unsafe.putObject(obj2, j, Long.valueOf(zzejVar.zzb));
                                                    unsafe.putInt(obj2, j2, i11);
                                                    if (i31 == i20) {
                                                    }
                                                }
                                                i31 = i20;
                                                if (i31 == i20) {
                                                }
                                                break;
                                            case 55:
                                            case 62:
                                                obj2 = obj;
                                                i13 = i41;
                                                str = str;
                                                i21 = i12;
                                                i11 = i43;
                                                zzheVar7 = this;
                                                if (i40 == 0) {
                                                    i31 = zzek.zzi(bArr, i20, zzejVar);
                                                    unsafe.putObject(obj2, j, Integer.valueOf(zzejVar.zza));
                                                    unsafe.putInt(obj2, j2, i11);
                                                    if (i31 == i20) {
                                                    }
                                                }
                                                i31 = i20;
                                                if (i31 == i20) {
                                                }
                                                break;
                                            case 56:
                                            case 65:
                                                obj2 = obj;
                                                i13 = i41;
                                                str = str;
                                                i21 = i12;
                                                i11 = i43;
                                                zzheVar7 = this;
                                                if (i40 == 1) {
                                                    i31 = i20 + 8;
                                                    unsafe.putObject(obj2, j, Long.valueOf(zzek.zzp(bArr, i20)));
                                                    unsafe.putInt(obj2, j2, i11);
                                                    if (i31 == i20) {
                                                    }
                                                }
                                                i31 = i20;
                                                if (i31 == i20) {
                                                }
                                                break;
                                            case 57:
                                            case 64:
                                                obj2 = obj;
                                                i13 = i41;
                                                str = str;
                                                i21 = i12;
                                                i11 = i43;
                                                zzheVar7 = this;
                                                if (i40 == 5) {
                                                    i31 = i20 + 4;
                                                    unsafe.putObject(obj2, j, Integer.valueOf(zzek.zzb(bArr, i20)));
                                                    unsafe.putInt(obj2, j2, i11);
                                                    if (i31 == i20) {
                                                    }
                                                }
                                                i31 = i20;
                                                if (i31 == i20) {
                                                }
                                                break;
                                            case 58:
                                                obj2 = obj;
                                                i13 = i41;
                                                str = str;
                                                i21 = i12;
                                                i11 = i43;
                                                zzheVar7 = this;
                                                if (i40 == 0) {
                                                    i31 = zzek.zzl(bArr, i20, zzejVar);
                                                    unsafe.putObject(obj2, j, Boolean.valueOf(zzejVar.zzb != 0));
                                                    unsafe.putInt(obj2, j2, i11);
                                                    if (i31 == i20) {
                                                    }
                                                }
                                                i31 = i20;
                                                if (i31 == i20) {
                                                }
                                                break;
                                            case 59:
                                                obj2 = obj;
                                                i13 = i41;
                                                str = str;
                                                i11 = i43;
                                                zzheVar7 = this;
                                                if (i40 == 2) {
                                                    i31 = zzek.zzi(bArr, i20, zzejVar);
                                                    int i54 = zzejVar.zza;
                                                    if (i54 == 0) {
                                                        unsafe.putObject(obj2, j, "");
                                                        i21 = i12;
                                                    } else {
                                                        i21 = i12;
                                                        int i55 = i31 + i54;
                                                        if ((i42 & 536870912) != 0 && !zzin.zzc(bArr, i31, i55)) {
                                                            throw new zzgc("Protocol message had invalid UTF-8.");
                                                        }
                                                        unsafe.putObject(obj2, j, new String(bArr, i31, i54, zzga.zza));
                                                        i31 = i55;
                                                    }
                                                    unsafe.putInt(obj2, j2, i11);
                                                    if (i31 == i20) {
                                                    }
                                                }
                                                i21 = i12;
                                                i31 = i20;
                                                if (i31 == i20) {
                                                }
                                                break;
                                            case 60:
                                                obj2 = obj;
                                                i13 = i41;
                                                str = str;
                                                i11 = i43;
                                                zzheVar7 = this;
                                                if (i40 == 2) {
                                                    Object zzy = zzheVar7.zzy(obj2, i11, i12);
                                                    i31 = zzek.zzn(zzy, zzheVar7.zzv(i12), bArr, i20, i2, zzejVar);
                                                    zzheVar7.zzG(obj2, i11, i12, zzy);
                                                    i21 = i12;
                                                    if (i31 == i20) {
                                                    }
                                                }
                                                i21 = i12;
                                                i31 = i20;
                                                if (i31 == i20) {
                                                }
                                                break;
                                            case 61:
                                                obj2 = obj;
                                                i13 = i41;
                                                str = str;
                                                i11 = i43;
                                                zzheVar7 = this;
                                                if (i40 == 2) {
                                                    int zza2 = zzek.zza(bArr, i20, zzejVar);
                                                    unsafe.putObject(obj2, j, zzejVar.zzc);
                                                    unsafe.putInt(obj2, j2, i11);
                                                    i31 = zza2;
                                                    i21 = i12;
                                                    if (i31 == i20) {
                                                    }
                                                }
                                                i21 = i12;
                                                i31 = i20;
                                                if (i31 == i20) {
                                                }
                                                break;
                                            case 63:
                                                obj2 = obj;
                                                str = str;
                                                i11 = i43;
                                                zzheVar7 = this;
                                                if (i40 == 0) {
                                                    i31 = zzek.zzi(bArr, i20, zzejVar);
                                                    int i56 = zzejVar.zza;
                                                    zzfx zzu2 = zzheVar7.zzu(i12);
                                                    if (zzu2 == null || zzu2.zza(i56)) {
                                                        i13 = i41;
                                                        unsafe.putObject(obj2, j, Integer.valueOf(i56));
                                                        unsafe.putInt(obj2, j2, i11);
                                                    } else {
                                                        i13 = i41;
                                                        zzd(obj).zzj(i13, Long.valueOf(i56));
                                                    }
                                                    i21 = i12;
                                                    if (i31 == i20) {
                                                    }
                                                } else {
                                                    i13 = i41;
                                                    i21 = i12;
                                                    i31 = i20;
                                                    if (i31 == i20) {
                                                    }
                                                }
                                                break;
                                            case 66:
                                                obj2 = obj;
                                                str = str;
                                                i11 = i43;
                                                i22 = i41;
                                                zzheVar7 = this;
                                                if (i40 == 0) {
                                                    i31 = zzek.zzi(bArr, i20, zzejVar);
                                                    unsafe.putObject(obj2, j, Integer.valueOf(zzey.zzb(zzejVar.zza)));
                                                    unsafe.putInt(obj2, j2, i11);
                                                    i21 = i12;
                                                    i13 = i22;
                                                    if (i31 == i20) {
                                                    }
                                                }
                                                i21 = i12;
                                                i13 = i22;
                                                i31 = i20;
                                                if (i31 == i20) {
                                                }
                                                break;
                                            case 67:
                                                obj2 = obj;
                                                str = str;
                                                i11 = i43;
                                                i22 = i41;
                                                zzheVar7 = this;
                                                if (i40 == 0) {
                                                    int zzl3 = zzek.zzl(bArr, i20, zzejVar);
                                                    unsafe.putObject(obj2, j, Long.valueOf(zzey.zzc(zzejVar.zzb)));
                                                    unsafe.putInt(obj2, j2, i11);
                                                    i31 = zzl3;
                                                    i21 = i12;
                                                    i13 = i22;
                                                    if (i31 == i20) {
                                                    }
                                                }
                                                i21 = i12;
                                                i13 = i22;
                                                i31 = i20;
                                                if (i31 == i20) {
                                                }
                                                break;
                                            case 68:
                                                if (i40 == 3) {
                                                    Object zzy2 = zzy(obj, i43, i12);
                                                    str = str;
                                                    i11 = i43;
                                                    obj2 = obj;
                                                    i22 = i41;
                                                    zzheVar7 = this;
                                                    i31 = zzek.zzm(zzy2, zzv(i12), bArr, i20, i2, (i41 & (-8)) | 4, zzejVar);
                                                    zzheVar7.zzG(obj2, i11, i12, zzy2);
                                                    i21 = i12;
                                                    i13 = i22;
                                                    if (i31 == i20) {
                                                    }
                                                } else {
                                                    obj2 = obj;
                                                    str = str;
                                                    i11 = i43;
                                                    i22 = i41;
                                                    zzheVar7 = this;
                                                    i21 = i12;
                                                    i13 = i22;
                                                    i31 = i20;
                                                    if (i31 == i20) {
                                                    }
                                                }
                                                break;
                                            default:
                                                obj2 = obj;
                                                i13 = i41;
                                                str = str;
                                                i21 = i12;
                                                i11 = i43;
                                                zzheVar7 = this;
                                                i31 = i20;
                                                if (i31 == i20) {
                                                }
                                                break;
                                        }
                                    } else if (i40 == 2) {
                                        Object zzw = zzw(i12);
                                        Unsafe unsafe6 = unsafe2;
                                        Object object = unsafe6.getObject(obj7, j);
                                        if (!((zzgv) object).zze()) {
                                            zzgv zzb2 = zzgv.zza().zzb();
                                            zzgw.zza(zzb2, object);
                                            unsafe6.putObject(obj7, j, zzb2);
                                            object = zzb2;
                                        }
                                        zzgt zzc = ((zzgu) zzw).zzc();
                                        zzgv zzgvVar2 = (zzgv) object;
                                        int zzi2 = zzek.zzi(bArr, i20, zzejVar);
                                        int i57 = zzejVar.zza;
                                        if (i57 >= 0 && i57 <= i29 - zzi2) {
                                            int i58 = zzi2 + i57;
                                            Object obj8 = zzc.zzb;
                                            Object obj9 = zzc.zzd;
                                            Object obj10 = obj8;
                                            Object obj11 = obj9;
                                            while (zzi2 < i58) {
                                                Object obj12 = obj11;
                                                int i59 = zzi2 + 1;
                                                byte b = bArr[zzi2];
                                                if (b < 0) {
                                                    i59 = zzek.zzj(b, bArr, i59, zzejVar);
                                                    b = zzejVar.zza;
                                                }
                                                Object obj13 = obj10;
                                                int i60 = b >>> 3;
                                                zzgv zzgvVar3 = zzgvVar2;
                                                int i61 = b & 7;
                                                Unsafe unsafe7 = unsafe6;
                                                if (i60 != 1) {
                                                    if (i60 == 2) {
                                                        zzir zzirVar = zzc.zzc;
                                                        if (i61 == zzirVar.zza()) {
                                                            obj4 = obj9;
                                                            zzgvVar = zzgvVar3;
                                                            zzgtVar = zzc;
                                                            zzi2 = zzO(bArr, i59, i2, zzirVar, obj9.getClass(), zzejVar);
                                                            obj11 = zzejVar.zzc;
                                                            obj10 = obj13;
                                                            zzgvVar2 = zzgvVar;
                                                            zzc = zzgtVar;
                                                            obj9 = obj4;
                                                            unsafe6 = unsafe7;
                                                        }
                                                    }
                                                    zzgtVar = zzc;
                                                    obj3 = obj13;
                                                    zzgvVar = zzgvVar3;
                                                    obj4 = obj9;
                                                    zzi2 = zzek.zzo(b, bArr, i59, i29, zzejVar);
                                                    obj10 = obj3;
                                                    obj11 = obj12;
                                                    zzgvVar2 = zzgvVar;
                                                    zzc = zzgtVar;
                                                    obj9 = obj4;
                                                    unsafe6 = unsafe7;
                                                } else {
                                                    zzgtVar = zzc;
                                                    obj3 = obj13;
                                                    zzgvVar = zzgvVar3;
                                                    obj4 = obj9;
                                                    zzir zzirVar2 = zzgtVar.zza;
                                                    if (i61 == zzirVar2.zza()) {
                                                        zzi2 = zzO(bArr, i59, i2, zzirVar2, null, zzejVar);
                                                        obj10 = zzejVar.zzc;
                                                        obj11 = obj12;
                                                        zzgvVar2 = zzgvVar;
                                                        zzc = zzgtVar;
                                                        obj9 = obj4;
                                                        unsafe6 = unsafe7;
                                                    }
                                                    zzi2 = zzek.zzo(b, bArr, i59, i29, zzejVar);
                                                    obj10 = obj3;
                                                    obj11 = obj12;
                                                    zzgvVar2 = zzgvVar;
                                                    zzc = zzgtVar;
                                                    obj9 = obj4;
                                                    unsafe6 = unsafe7;
                                                }
                                            }
                                            Object obj14 = obj11;
                                            Object obj15 = obj10;
                                            Unsafe unsafe8 = unsafe6;
                                            zzgv zzgvVar4 = zzgvVar2;
                                            if (zzi2 != i58) {
                                                throw new zzgc(str);
                                            }
                                            zzgvVar4.put(obj15, obj14);
                                            if (i58 != i20) {
                                                obj7 = obj;
                                                i30 = i3;
                                                i34 = i41;
                                                i33 = i12;
                                                i31 = i58;
                                                i35 = i9;
                                                i32 = i43;
                                                i36 = i10;
                                                unsafe5 = unsafe8;
                                                zzheVar7 = this;
                                            } else {
                                                obj2 = obj;
                                                i30 = i3;
                                                i13 = i41;
                                                i8 = i58;
                                                i11 = i43;
                                                unsafe = unsafe8;
                                                zzheVar7 = this;
                                            }
                                        }
                                    }
                                } else {
                                    long j3 = i42;
                                    zzfz zzfzVar2 = (zzfz) unsafe5.getObject(obj7, j);
                                    if (zzfzVar2.zzc()) {
                                        obj5 = "";
                                        zzfzVar = zzfzVar2;
                                    } else {
                                        int size = zzfzVar2.size();
                                        obj5 = "";
                                        zzfz zzd = zzfzVar2.zzd(size + size);
                                        unsafe5.putObject(obj7, j, zzd);
                                        zzfzVar = zzd;
                                    }
                                    switch (zzr) {
                                        case 18:
                                        case 35:
                                            zzheVar3 = this;
                                            i23 = i2;
                                            unsafe3 = unsafe5;
                                            i24 = i53;
                                            str2 = str;
                                            if (i40 != 2) {
                                                if (i40 == 1) {
                                                    i31 = i24 + 8;
                                                    int i62 = zzek.zza;
                                                    zzfe zzfeVar = (zzfe) zzfzVar;
                                                    zzfeVar.zzf(Double.longBitsToDouble(zzek.zzp(bArr, i24)));
                                                    while (i31 < i23) {
                                                        int zzi3 = zzek.zzi(bArr, i31, zzejVar);
                                                        if (i41 == zzejVar.zza) {
                                                            zzfeVar.zzf(Double.longBitsToDouble(zzek.zzp(bArr, zzi3)));
                                                            i31 = zzi3 + 8;
                                                        }
                                                    }
                                                }
                                                str = str2;
                                                zzheVar4 = zzheVar3;
                                                i31 = i24;
                                                if (i31 == i24) {
                                                    i30 = i3;
                                                    obj2 = obj7;
                                                    i13 = i41;
                                                    i8 = i31;
                                                    zzheVar7 = zzheVar4;
                                                    i11 = i43;
                                                    unsafe = unsafe3;
                                                    break;
                                                } else {
                                                    i30 = i3;
                                                    i34 = i41;
                                                    i29 = i23;
                                                    zzheVar7 = zzheVar4;
                                                    i33 = i12;
                                                    i35 = i9;
                                                    i32 = i43;
                                                    i36 = i10;
                                                    unsafe5 = unsafe3;
                                                }
                                            } else {
                                                int i63 = zzek.zza;
                                                zzfe zzfeVar2 = (zzfe) zzfzVar;
                                                i31 = zzek.zzi(bArr, i24, zzejVar);
                                                int i64 = zzejVar.zza;
                                                int i65 = i31 + i64;
                                                if (i65 > bArr.length) {
                                                    throw new zzgc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                zzfeVar2.zzg(zzfeVar2.size() + (i64 / 8));
                                                while (i31 < i65) {
                                                    zzfeVar2.zzf(Double.longBitsToDouble(zzek.zzp(bArr, i31)));
                                                    i31 += 8;
                                                }
                                                if (i31 != i65) {
                                                    throw new zzgc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            }
                                            str = str2;
                                            zzheVar4 = zzheVar3;
                                            if (i31 == i24) {
                                            }
                                        case 19:
                                        case 36:
                                            zzheVar3 = this;
                                            i23 = i2;
                                            unsafe3 = unsafe5;
                                            i24 = i53;
                                            str2 = str;
                                            if (i40 == 2) {
                                                int i66 = zzek.zza;
                                                zzfo zzfoVar = (zzfo) zzfzVar;
                                                i31 = zzek.zzi(bArr, i24, zzejVar);
                                                int i67 = zzejVar.zza;
                                                int i68 = i31 + i67;
                                                if (i68 > bArr.length) {
                                                    throw new zzgc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                zzfoVar.zzg(zzfoVar.size() + (i67 / 4));
                                                while (i31 < i68) {
                                                    zzfoVar.zzf(Float.intBitsToFloat(zzek.zzb(bArr, i31)));
                                                    i31 += 4;
                                                }
                                                if (i31 != i68) {
                                                    throw new zzgc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            } else {
                                                if (i40 == 5) {
                                                    i31 = i24 + 4;
                                                    int i69 = zzek.zza;
                                                    zzfo zzfoVar2 = (zzfo) zzfzVar;
                                                    zzfoVar2.zzf(Float.intBitsToFloat(zzek.zzb(bArr, i24)));
                                                    while (i31 < i23) {
                                                        int zzi4 = zzek.zzi(bArr, i31, zzejVar);
                                                        if (i41 == zzejVar.zza) {
                                                            zzfoVar2.zzf(Float.intBitsToFloat(zzek.zzb(bArr, zzi4)));
                                                            i31 = zzi4 + 4;
                                                        }
                                                    }
                                                }
                                                str = str2;
                                                zzheVar4 = zzheVar3;
                                                i31 = i24;
                                                if (i31 == i24) {
                                                }
                                            }
                                            str = str2;
                                            zzheVar4 = zzheVar3;
                                            if (i31 == i24) {
                                            }
                                            break;
                                        case 20:
                                        case 21:
                                        case 37:
                                        case 38:
                                            zzheVar3 = this;
                                            i23 = i2;
                                            unsafe3 = unsafe5;
                                            i24 = i53;
                                            str2 = str;
                                            if (i40 == 2) {
                                                int i70 = zzek.zza;
                                                zzgp zzgpVar = (zzgp) zzfzVar;
                                                i31 = zzek.zzi(bArr, i24, zzejVar);
                                                int i71 = zzejVar.zza + i31;
                                                while (i31 < i71) {
                                                    i31 = zzek.zzl(bArr, i31, zzejVar);
                                                    zzgpVar.zzf(zzejVar.zzb);
                                                }
                                                if (i31 != i71) {
                                                    throw new zzgc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            } else {
                                                if (i40 == 0) {
                                                    int i72 = zzek.zza;
                                                    zzgp zzgpVar2 = (zzgp) zzfzVar;
                                                    i31 = zzek.zzl(bArr, i24, zzejVar);
                                                    zzgpVar2.zzf(zzejVar.zzb);
                                                    while (i31 < i23) {
                                                        int zzi5 = zzek.zzi(bArr, i31, zzejVar);
                                                        if (i41 == zzejVar.zza) {
                                                            i31 = zzek.zzl(bArr, zzi5, zzejVar);
                                                            zzgpVar2.zzf(zzejVar.zzb);
                                                        }
                                                    }
                                                }
                                                str = str2;
                                                zzheVar4 = zzheVar3;
                                                i31 = i24;
                                                if (i31 == i24) {
                                                }
                                            }
                                            str = str2;
                                            zzheVar4 = zzheVar3;
                                            if (i31 == i24) {
                                            }
                                            break;
                                        case 22:
                                        case 29:
                                        case 39:
                                        case 43:
                                            zzheVar3 = this;
                                            i23 = i2;
                                            unsafe3 = unsafe5;
                                            i24 = i53;
                                            str2 = str;
                                            if (i40 == 2) {
                                                i31 = zzek.zzf(bArr, i24, zzfzVar, zzejVar);
                                                str = str2;
                                                zzheVar4 = zzheVar3;
                                                if (i31 == i24) {
                                                }
                                            } else {
                                                if (i40 == 0) {
                                                    i31 = zzek.zzk(i41, bArr, i24, i2, zzfzVar, zzejVar);
                                                    str = str2;
                                                    zzheVar4 = zzheVar3;
                                                    if (i31 == i24) {
                                                    }
                                                }
                                                str = str2;
                                                zzheVar4 = zzheVar3;
                                                i31 = i24;
                                                if (i31 == i24) {
                                                }
                                            }
                                            break;
                                        case 23:
                                        case 32:
                                        case 40:
                                        case 46:
                                            zzheVar3 = this;
                                            i23 = i2;
                                            unsafe3 = unsafe5;
                                            i24 = i53;
                                            str2 = str;
                                            if (i40 == 2) {
                                                int i73 = zzek.zza;
                                                zzgp zzgpVar3 = (zzgp) zzfzVar;
                                                i31 = zzek.zzi(bArr, i24, zzejVar);
                                                int i74 = zzejVar.zza;
                                                int i75 = i31 + i74;
                                                if (i75 > bArr.length) {
                                                    throw new zzgc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                zzgpVar3.zzg(zzgpVar3.size() + (i74 / 8));
                                                while (i31 < i75) {
                                                    zzgpVar3.zzf(zzek.zzp(bArr, i31));
                                                    i31 += 8;
                                                }
                                                if (i31 != i75) {
                                                    throw new zzgc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            } else {
                                                if (i40 == 1) {
                                                    i31 = i24 + 8;
                                                    int i76 = zzek.zza;
                                                    zzgp zzgpVar4 = (zzgp) zzfzVar;
                                                    zzgpVar4.zzf(zzek.zzp(bArr, i24));
                                                    while (i31 < i23) {
                                                        int zzi6 = zzek.zzi(bArr, i31, zzejVar);
                                                        if (i41 == zzejVar.zza) {
                                                            zzgpVar4.zzf(zzek.zzp(bArr, zzi6));
                                                            i31 = zzi6 + 8;
                                                        }
                                                    }
                                                }
                                                str = str2;
                                                zzheVar4 = zzheVar3;
                                                i31 = i24;
                                                if (i31 == i24) {
                                                }
                                            }
                                            str = str2;
                                            zzheVar4 = zzheVar3;
                                            if (i31 == i24) {
                                            }
                                            break;
                                        case 24:
                                        case 31:
                                        case 41:
                                        case 45:
                                            zzheVar3 = this;
                                            i23 = i2;
                                            unsafe3 = unsafe5;
                                            i24 = i53;
                                            str2 = str;
                                            if (i40 == 2) {
                                                int i77 = zzek.zza;
                                                zzfv zzfvVar = (zzfv) zzfzVar;
                                                i31 = zzek.zzi(bArr, i24, zzejVar);
                                                int i78 = zzejVar.zza;
                                                int i79 = i31 + i78;
                                                if (i79 > bArr.length) {
                                                    throw new zzgc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                zzfvVar.zzh(zzfvVar.size() + (i78 / 4));
                                                while (i31 < i79) {
                                                    zzfvVar.zzg(zzek.zzb(bArr, i31));
                                                    i31 += 4;
                                                }
                                                if (i31 != i79) {
                                                    throw new zzgc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            } else {
                                                if (i40 == 5) {
                                                    i31 = i24 + 4;
                                                    int i80 = zzek.zza;
                                                    zzfv zzfvVar2 = (zzfv) zzfzVar;
                                                    zzfvVar2.zzg(zzek.zzb(bArr, i24));
                                                    while (i31 < i23) {
                                                        int zzi7 = zzek.zzi(bArr, i31, zzejVar);
                                                        if (i41 == zzejVar.zza) {
                                                            zzfvVar2.zzg(zzek.zzb(bArr, zzi7));
                                                            i31 = zzi7 + 4;
                                                        }
                                                    }
                                                }
                                                str = str2;
                                                zzheVar4 = zzheVar3;
                                                i31 = i24;
                                                if (i31 == i24) {
                                                }
                                            }
                                            str = str2;
                                            zzheVar4 = zzheVar3;
                                            if (i31 == i24) {
                                            }
                                            break;
                                        case 25:
                                        case 42:
                                            zzheVar3 = this;
                                            i23 = i2;
                                            unsafe3 = unsafe5;
                                            i24 = i53;
                                            str2 = str;
                                            if (i40 == 2) {
                                                int i81 = zzek.zza;
                                                zzel zzelVar = (zzel) zzfzVar;
                                                i31 = zzek.zzi(bArr, i24, zzejVar);
                                                int i82 = zzejVar.zza + i31;
                                                while (i31 < i82) {
                                                    i31 = zzek.zzl(bArr, i31, zzejVar);
                                                    zzelVar.zze(zzejVar.zzb != 0);
                                                }
                                                if (i31 != i82) {
                                                    throw new zzgc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            } else {
                                                if (i40 == 0) {
                                                    int i83 = zzek.zza;
                                                    zzel zzelVar2 = (zzel) zzfzVar;
                                                    i31 = zzek.zzl(bArr, i24, zzejVar);
                                                    zzelVar2.zze(zzejVar.zzb != 0);
                                                    while (i31 < i23) {
                                                        int zzi8 = zzek.zzi(bArr, i31, zzejVar);
                                                        if (i41 == zzejVar.zza) {
                                                            i31 = zzek.zzl(bArr, zzi8, zzejVar);
                                                            zzelVar2.zze(zzejVar.zzb != 0);
                                                        }
                                                    }
                                                }
                                                str = str2;
                                                zzheVar4 = zzheVar3;
                                                i31 = i24;
                                                if (i31 == i24) {
                                                }
                                            }
                                            str = str2;
                                            zzheVar4 = zzheVar3;
                                            if (i31 == i24) {
                                            }
                                            break;
                                        case 26:
                                            zzheVar5 = this;
                                            i23 = i2;
                                            unsafe3 = unsafe5;
                                            i24 = i53;
                                            if (i40 == 2) {
                                                if ((j3 & 536870912) == 0) {
                                                    zzi = zzek.zzi(bArr, i24, zzejVar);
                                                    int i84 = zzejVar.zza;
                                                    if (i84 < 0) {
                                                        throw new zzgc("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i84 == 0) {
                                                        obj6 = obj5;
                                                        zzfzVar.add(obj6);
                                                    } else {
                                                        obj6 = obj5;
                                                        zzfzVar.add(new String(bArr, zzi, i84, zzga.zza));
                                                        zzi += i84;
                                                    }
                                                    while (zzi < i23) {
                                                        int zzi9 = zzek.zzi(bArr, zzi, zzejVar);
                                                        if (i41 == zzejVar.zza) {
                                                            zzi = zzek.zzi(bArr, zzi9, zzejVar);
                                                            int i85 = zzejVar.zza;
                                                            if (i85 < 0) {
                                                                throw new zzgc("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            }
                                                            if (i85 == 0) {
                                                                zzfzVar.add(obj6);
                                                            } else {
                                                                zzfzVar.add(new String(bArr, zzi, i85, zzga.zza));
                                                                zzi += i85;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    Object obj16 = obj5;
                                                    zzi = zzek.zzi(bArr, i24, zzejVar);
                                                    int i86 = zzejVar.zza;
                                                    if (i86 < 0) {
                                                        throw new zzgc("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i86 == 0) {
                                                        zzfzVar.add(obj16);
                                                    } else {
                                                        int i87 = zzi + i86;
                                                        if (!zzin.zzc(bArr, zzi, i87)) {
                                                            throw new zzgc("Protocol message had invalid UTF-8.");
                                                        }
                                                        zzfzVar.add(new String(bArr, zzi, i86, zzga.zza));
                                                        zzi = i87;
                                                    }
                                                    while (zzi < i23) {
                                                        int zzi10 = zzek.zzi(bArr, zzi, zzejVar);
                                                        if (i41 == zzejVar.zza) {
                                                            zzi = zzek.zzi(bArr, zzi10, zzejVar);
                                                            int i88 = zzejVar.zza;
                                                            if (i88 < 0) {
                                                                throw new zzgc("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            }
                                                            if (i88 == 0) {
                                                                zzfzVar.add(obj16);
                                                            } else {
                                                                int i89 = zzi + i88;
                                                                if (!zzin.zzc(bArr, zzi, i89)) {
                                                                    throw new zzgc("Protocol message had invalid UTF-8.");
                                                                }
                                                                zzfzVar.add(new String(bArr, zzi, i88, zzga.zza));
                                                                zzi = i89;
                                                            }
                                                        }
                                                    }
                                                }
                                                i31 = zzi;
                                                str = str;
                                                zzheVar4 = zzheVar5;
                                                if (i31 == i24) {
                                                }
                                            } else {
                                                str = str;
                                                zzheVar4 = zzheVar5;
                                                i31 = i24;
                                                if (i31 == i24) {
                                                }
                                            }
                                            break;
                                        case 27:
                                            zzheVar3 = this;
                                            i23 = i2;
                                            unsafe3 = unsafe5;
                                            i24 = i53;
                                            i25 = i43;
                                            if (i40 == 2) {
                                                zzheVar5 = zzheVar3;
                                                i43 = i25;
                                                i31 = zzek.zze(zzheVar3.zzv(i12), i41, bArr, i24, i2, zzfzVar, zzejVar);
                                                i23 = i23;
                                                zzheVar4 = zzheVar5;
                                                if (i31 == i24) {
                                                }
                                            }
                                            i43 = i25;
                                            zzheVar4 = zzheVar3;
                                            i31 = i24;
                                            if (i31 == i24) {
                                            }
                                            break;
                                        case 28:
                                            zzheVar3 = this;
                                            i23 = i2;
                                            unsafe3 = unsafe5;
                                            i24 = i53;
                                            i25 = i43;
                                            if (i40 == 2) {
                                                int zzi11 = zzek.zzi(bArr, i24, zzejVar);
                                                int i90 = zzejVar.zza;
                                                if (i90 < 0) {
                                                    throw new zzgc("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i90 > bArr.length - zzi11) {
                                                    throw new zzgc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                if (i90 == 0) {
                                                    zzfzVar.add(zzev.zza);
                                                } else {
                                                    zzfzVar.add(zzev.zzk(bArr, zzi11, i90));
                                                    zzi11 += i90;
                                                }
                                                while (zzi11 < i23) {
                                                    int zzi12 = zzek.zzi(bArr, zzi11, zzejVar);
                                                    if (i41 == zzejVar.zza) {
                                                        zzi11 = zzek.zzi(bArr, zzi12, zzejVar);
                                                        int i91 = zzejVar.zza;
                                                        if (i91 < 0) {
                                                            throw new zzgc("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i91 > bArr.length - zzi11) {
                                                            throw new zzgc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        }
                                                        if (i91 == 0) {
                                                            zzfzVar.add(zzev.zza);
                                                        } else {
                                                            zzfzVar.add(zzev.zzk(bArr, zzi11, i91));
                                                            zzi11 += i91;
                                                        }
                                                    } else {
                                                        i31 = zzi11;
                                                        i43 = i25;
                                                        zzheVar4 = zzheVar3;
                                                        if (i31 == i24) {
                                                        }
                                                    }
                                                }
                                                i31 = zzi11;
                                                i43 = i25;
                                                zzheVar4 = zzheVar3;
                                                if (i31 == i24) {
                                                }
                                            }
                                            i43 = i25;
                                            zzheVar4 = zzheVar3;
                                            i31 = i24;
                                            if (i31 == i24) {
                                            }
                                            break;
                                        case 30:
                                        case 44:
                                            i23 = i2;
                                            i24 = i53;
                                            if (i40 == 2) {
                                                zzk = zzek.zzf(bArr, i24, zzfzVar, zzejVar);
                                                zzheVar6 = this;
                                            } else {
                                                if (i40 == 0) {
                                                    zzheVar6 = this;
                                                    zzk = zzek.zzk(i41, bArr, i24, i2, zzfzVar, zzejVar);
                                                }
                                                unsafe3 = unsafe5;
                                                zzheVar4 = this;
                                                i31 = i24;
                                                if (i31 == i24) {
                                                }
                                            }
                                            zzfx zzu3 = zzheVar6.zzu(i12);
                                            zzib zzibVar = zzheVar6.zzl;
                                            int i92 = zzhn.zza;
                                            if (zzu3 == null) {
                                                i26 = zzk;
                                                unsafe3 = unsafe5;
                                                i27 = i43;
                                            } else if (zzfzVar instanceof RandomAccess) {
                                                int size2 = zzfzVar.size();
                                                i26 = zzk;
                                                Object obj17 = null;
                                                int i93 = 0;
                                                int i94 = 0;
                                                while (i93 < size2) {
                                                    int intValue = ((Integer) zzfzVar.get(i93)).intValue();
                                                    if (zzu3.zza(intValue)) {
                                                        if (i93 != i94) {
                                                            zzfzVar.set(i94, Integer.valueOf(intValue));
                                                        }
                                                        i94++;
                                                        unsafe4 = unsafe5;
                                                        i28 = i43;
                                                    } else {
                                                        unsafe4 = unsafe5;
                                                        i28 = i43;
                                                        obj17 = zzhn.zzo(obj7, i28, intValue, obj17, zzibVar);
                                                    }
                                                    i93++;
                                                    i43 = i28;
                                                    unsafe5 = unsafe4;
                                                }
                                                unsafe3 = unsafe5;
                                                i27 = i43;
                                                if (i94 != size2) {
                                                    zzfzVar.subList(i94, size2).clear();
                                                }
                                            } else {
                                                i26 = zzk;
                                                unsafe3 = unsafe5;
                                                i27 = i43;
                                                Iterator it = zzfzVar.iterator();
                                                Object obj18 = null;
                                                while (it.hasNext()) {
                                                    int intValue2 = ((Integer) it.next()).intValue();
                                                    if (!zzu3.zza(intValue2)) {
                                                        obj18 = zzhn.zzo(obj7, i27, intValue2, obj18, zzibVar);
                                                        it.remove();
                                                    }
                                                }
                                            }
                                            i43 = i27;
                                            i31 = i26;
                                            zzheVar4 = this;
                                            if (i31 == i24) {
                                            }
                                            break;
                                        case 33:
                                        case 47:
                                            i23 = i2;
                                            i24 = i53;
                                            if (i40 == 2) {
                                                int i95 = zzek.zza;
                                                zzfv zzfvVar3 = (zzfv) zzfzVar;
                                                i31 = zzek.zzi(bArr, i24, zzejVar);
                                                int i96 = zzejVar.zza + i31;
                                                while (i31 < i96) {
                                                    i31 = zzek.zzi(bArr, i31, zzejVar);
                                                    zzfvVar3.zzg(zzey.zzb(zzejVar.zza));
                                                }
                                                if (i31 != i96) {
                                                    throw new zzgc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            } else {
                                                if (i40 == 0) {
                                                    int i97 = zzek.zza;
                                                    zzfv zzfvVar4 = (zzfv) zzfzVar;
                                                    i31 = zzek.zzi(bArr, i24, zzejVar);
                                                    zzfvVar4.zzg(zzey.zzb(zzejVar.zza));
                                                    while (i31 < i23) {
                                                        int zzi13 = zzek.zzi(bArr, i31, zzejVar);
                                                        if (i41 == zzejVar.zza) {
                                                            i31 = zzek.zzi(bArr, zzi13, zzejVar);
                                                            zzfvVar4.zzg(zzey.zzb(zzejVar.zza));
                                                        }
                                                    }
                                                }
                                                unsafe3 = unsafe5;
                                                zzheVar4 = this;
                                                i31 = i24;
                                                if (i31 == i24) {
                                                }
                                            }
                                            unsafe3 = unsafe5;
                                            zzheVar4 = this;
                                            if (i31 == i24) {
                                            }
                                            break;
                                        case 34:
                                        case 48:
                                            if (i40 == 2) {
                                                int i98 = zzek.zza;
                                                zzgp zzgpVar5 = (zzgp) zzfzVar;
                                                i24 = i53;
                                                i31 = zzek.zzi(bArr, i24, zzejVar);
                                                int i99 = zzejVar.zza + i31;
                                                while (i31 < i99) {
                                                    i31 = zzek.zzl(bArr, i31, zzejVar);
                                                    zzgpVar5.zzf(zzey.zzc(zzejVar.zzb));
                                                }
                                                if (i31 != i99) {
                                                    throw new zzgc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                i23 = i2;
                                            } else {
                                                i24 = i53;
                                                if (i40 == 0) {
                                                    int i100 = zzek.zza;
                                                    zzgp zzgpVar6 = (zzgp) zzfzVar;
                                                    i31 = zzek.zzl(bArr, i24, zzejVar);
                                                    zzgpVar6.zzf(zzey.zzc(zzejVar.zzb));
                                                    i23 = i2;
                                                    while (i31 < i23) {
                                                        int zzi14 = zzek.zzi(bArr, i31, zzejVar);
                                                        if (i41 == zzejVar.zza) {
                                                            i31 = zzek.zzl(bArr, zzi14, zzejVar);
                                                            zzgpVar6.zzf(zzey.zzc(zzejVar.zzb));
                                                        }
                                                    }
                                                } else {
                                                    i23 = i2;
                                                    unsafe3 = unsafe5;
                                                    zzheVar4 = this;
                                                    i31 = i24;
                                                    if (i31 == i24) {
                                                    }
                                                }
                                            }
                                            unsafe3 = unsafe5;
                                            zzheVar4 = this;
                                            if (i31 == i24) {
                                            }
                                            break;
                                        default:
                                            zzheVar3 = this;
                                            i23 = i2;
                                            unsafe3 = unsafe5;
                                            i24 = i53;
                                            str2 = str;
                                            if (i40 == 3) {
                                                int i101 = (i41 & (-8)) | 4;
                                                zzhl zzv = zzheVar3.zzv(i12);
                                                str = str2;
                                                zzheVar4 = zzheVar3;
                                                i31 = zzek.zzc(zzv, bArr, i24, i2, i101, zzejVar);
                                                zzfzVar.add(zzejVar.zzc);
                                                while (i31 < i23) {
                                                    int zzi15 = zzek.zzi(bArr, i31, zzejVar);
                                                    if (i41 == zzejVar.zza) {
                                                        i31 = zzek.zzc(zzv, bArr, zzi15, i2, i101, zzejVar);
                                                        zzfzVar.add(zzejVar.zzc);
                                                    } else if (i31 == i24) {
                                                    }
                                                }
                                                if (i31 == i24) {
                                                }
                                            }
                                            str = str2;
                                            zzheVar4 = zzheVar3;
                                            i31 = i24;
                                            if (i31 == i24) {
                                            }
                                            break;
                                    }
                                }
                            } else if (i40 == 2) {
                                zzfz zzfzVar3 = (zzfz) unsafe5.getObject(obj7, j);
                                if (!zzfzVar3.zzc()) {
                                    int size3 = zzfzVar3.size();
                                    zzfzVar3 = zzfzVar3.zzd(size3 == 0 ? 10 : size3 + size3);
                                    unsafe5.putObject(obj7, j, zzfzVar3);
                                }
                                i31 = zzek.zze(zzheVar8.zzv(i12), i41, bArr, i53, i2, zzfzVar3, zzejVar);
                                i30 = i3;
                                i34 = i41;
                                zzheVar7 = zzheVar8;
                                i33 = i12;
                                i35 = i9;
                                i32 = i43;
                                i36 = i10;
                            } else {
                                unsafe2 = unsafe5;
                                i20 = i53;
                            }
                            obj2 = obj;
                            i13 = i41;
                            i8 = i20;
                            str = str;
                            i11 = i43;
                            unsafe = unsafe2;
                            zzheVar7 = this;
                            i30 = i3;
                        }
                        i29 = i2;
                    }
                    if (i13 == i30 || i30 == 0) {
                        if (zzheVar7.zzh) {
                            zzfh zzfhVar = zzejVar.zzd;
                            int i102 = zzfh.zzb;
                            int i103 = zzei.zza;
                            if (zzfhVar != zzfh.zza) {
                                zzhb zzhbVar = zzheVar7.zzg;
                                int i104 = zzek.zza;
                                if (zzfhVar.zza(zzhbVar, i11) != null) {
                                    throw null;
                                }
                                i31 = zzek.zzh(i13, bArr, i8, i2, zzd(obj), zzejVar);
                                i34 = i13;
                                i32 = i11;
                                i33 = i12;
                                i35 = i9;
                                i36 = i10;
                                unsafe5 = unsafe;
                                obj7 = obj2;
                                i29 = i2;
                            }
                        }
                        i31 = zzek.zzh(i13, bArr, i8, i2, zzd(obj), zzejVar);
                        i34 = i13;
                        i32 = i11;
                        i33 = i12;
                        i35 = i9;
                        i36 = i10;
                        unsafe5 = unsafe;
                        obj7 = obj2;
                        i29 = i2;
                    } else {
                        i31 = i8;
                        i34 = i13;
                        i35 = i9;
                        i36 = i10;
                    }
                } else {
                    i7 = zzheVar7.zzq(i39, 0);
                }
                i6 = -1;
                if (i7 != i6) {
                }
                if (i13 == i30) {
                }
                if (zzheVar7.zzh) {
                }
                i31 = zzek.zzh(i13, bArr, i8, i2, zzd(obj), zzejVar);
                i34 = i13;
                i32 = i11;
                i33 = i12;
                i35 = i9;
                i36 = i10;
                unsafe5 = unsafe;
                obj7 = obj2;
                i29 = i2;
            } else {
                obj2 = obj7;
                str = "Failed to parse the message.";
                unsafe = unsafe5;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhl
    public final Object zze() {
        return ((zzfu) this.zzg).zzs();
    }

    @Override // com.google.android.gms.internal.play_billing.zzhl
    public final void zzf(Object obj) {
        if (zzL(obj)) {
            if (obj instanceof zzfu) {
                zzfu zzfuVar = (zzfu) obj;
                zzfuVar.zzC(Integer.MAX_VALUE);
                zzfuVar.zza = 0;
                zzfuVar.zzA();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int zzs = zzs(i);
                int i2 = 1048575 & zzs;
                int zzr = zzr(zzs);
                long j = i2;
                if (zzr != 9) {
                    if (zzr != 60 && zzr != 68) {
                        switch (zzr) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
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
                                ((zzfz) zzii.zzf(obj, j)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzgv) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzM(obj, iArr[i], i)) {
                        zzv(i).zzf(zzb.getObject(obj, j));
                    }
                }
                if (zzI(obj, i)) {
                    zzv(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzl.zzb(obj);
            if (this.zzh) {
                this.zzm.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhl
    public final void zzg(Object obj, Object obj2) {
        zzA(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i >= iArr.length) {
                zzhn.zzq(this.zzl, obj, obj2);
                if (this.zzh) {
                    zzhn.zzp(this.zzm, obj, obj2);
                    return;
                }
                return;
            }
            int zzs = zzs(i);
            int i2 = 1048575 & zzs;
            int zzr = zzr(zzs);
            int i3 = iArr[i];
            long j = i2;
            switch (zzr) {
                case 0:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzii.zzo(obj, j, zzii.zza(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 1:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzii.zzp(obj, j, zzii.zzb(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 2:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzii.zzr(obj, j, zzii.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 3:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzii.zzr(obj, j, zzii.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 4:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzii.zzq(obj, j, zzii.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 5:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzii.zzr(obj, j, zzii.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 6:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzii.zzq(obj, j, zzii.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 7:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzii.zzm(obj, j, zzii.zzw(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 8:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzii.zzs(obj, j, zzii.zzf(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 9:
                    zzB(obj, obj2, i);
                    break;
                case 10:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzii.zzs(obj, j, zzii.zzf(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 11:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzii.zzq(obj, j, zzii.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 12:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzii.zzq(obj, j, zzii.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 13:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzii.zzq(obj, j, zzii.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 14:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzii.zzr(obj, j, zzii.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 15:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzii.zzq(obj, j, zzii.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 16:
                    if (!zzI(obj2, i)) {
                        break;
                    } else {
                        zzii.zzr(obj, j, zzii.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    }
                case 17:
                    zzB(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
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
                    zzfz zzfzVar = (zzfz) zzii.zzf(obj, j);
                    zzfz zzfzVar2 = (zzfz) zzii.zzf(obj2, j);
                    int size = zzfzVar.size();
                    int size2 = zzfzVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzfzVar.zzc()) {
                            zzfzVar = zzfzVar.zzd(size2 + size);
                        }
                        zzfzVar.addAll(zzfzVar2);
                    }
                    if (size > 0) {
                        zzfzVar2 = zzfzVar;
                    }
                    zzii.zzs(obj, j, zzfzVar2);
                    break;
                case 50:
                    int i4 = zzhn.zza;
                    zzii.zzs(obj, j, zzgw.zza(zzii.zzf(obj, j), zzii.zzf(obj2, j)));
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
                    if (!zzM(obj2, i3, i)) {
                        break;
                    } else {
                        zzii.zzs(obj, j, zzii.zzf(obj2, j));
                        zzE(obj, i3, i);
                        break;
                    }
                case 60:
                    zzC(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzM(obj2, i3, i)) {
                        break;
                    } else {
                        zzii.zzs(obj, j, zzii.zzf(obj2, j));
                        zzE(obj, i3, i);
                        break;
                    }
                case 68:
                    zzC(obj, obj2, i);
                    break;
            }
            i += 3;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhl
    public final void zzh(Object obj, byte[] bArr, int i, int i2, zzej zzejVar) throws IOException {
        zzc(obj, bArr, i, i2, 0, zzejVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:235:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    @Override // com.google.android.gms.internal.play_billing.zzhl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(Object obj, zzit zzitVar) throws IOException {
        Map.Entry entry;
        int[] iArr;
        int i;
        Map.Entry entry2;
        int i2;
        int i3;
        int i4;
        Map.Entry entry3;
        if (this.zzh) {
            zzfm zzfmVar = ((zzfr) obj).zzb;
            if (!zzfmVar.zza.isEmpty()) {
                entry = (Map.Entry) zzfmVar.zzf().next();
                iArr = this.zzc;
                Unsafe unsafe = zzb;
                int i5 = 1048575;
                int i6 = 1048575;
                int i7 = 0;
                i = 0;
                while (i < iArr.length) {
                    int zzs = zzs(i);
                    int zzr = zzr(zzs);
                    int i8 = iArr[i];
                    if (zzr <= 17) {
                        int i9 = iArr[i + 2];
                        int i10 = i9 & i5;
                        if (i10 != i6) {
                            i7 = i10 == i5 ? 0 : unsafe.getInt(obj, i10);
                            i6 = i10;
                        }
                        i2 = i6;
                        i3 = i7;
                        i4 = 1 << (i9 >>> 20);
                    } else {
                        i2 = i6;
                        i3 = i7;
                        i4 = 0;
                    }
                    if (entry != null) {
                        throw null;
                    }
                    long j = zzs & i5;
                    switch (zzr) {
                        case 0:
                            entry3 = entry;
                            if (!zzJ(obj, i, i2, i3, i4)) {
                                break;
                            } else {
                                zzitVar.zzf(i8, zzii.zza(obj, j));
                                continue;
                            }
                        case 1:
                            entry3 = entry;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzitVar.zzo(i8, zzii.zzb(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            entry3 = entry;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzitVar.zzt(i8, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            entry3 = entry;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzitVar.zzL(i8, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            entry3 = entry;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzitVar.zzr(i8, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            entry3 = entry;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzitVar.zzm(i8, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            entry3 = entry;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzitVar.zzk(i8, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            entry3 = entry;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzitVar.zzb(i8, zzii.zzw(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 8:
                            entry3 = entry;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzP(i8, unsafe.getObject(obj, j), zzitVar);
                                break;
                            } else {
                                continue;
                            }
                        case 9:
                            entry3 = entry;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzitVar.zzw(i8, unsafe.getObject(obj, j), zzv(i));
                                break;
                            } else {
                                continue;
                            }
                        case 10:
                            entry3 = entry;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzitVar.zzd(i8, (zzev) unsafe.getObject(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            entry3 = entry;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzitVar.zzJ(i8, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 12:
                            entry3 = entry;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzitVar.zzi(i8, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 13:
                            entry3 = entry;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzitVar.zzy(i8, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 14:
                            entry3 = entry;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzitVar.zzA(i8, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 15:
                            entry3 = entry;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzitVar.zzC(i8, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 16:
                            entry3 = entry;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzitVar.zzE(i8, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 17:
                            entry3 = entry;
                            if (zzJ(obj, i, i2, i3, i4)) {
                                zzitVar.zzq(i8, unsafe.getObject(obj, j), zzv(i));
                                break;
                            } else {
                                continue;
                            }
                        case 18:
                            zzhn.zzs(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, false);
                            break;
                        case 19:
                            zzhn.zzw(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, false);
                            break;
                        case 20:
                            zzhn.zzy(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, false);
                            break;
                        case 21:
                            zzhn.zzE(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, false);
                            break;
                        case 22:
                            zzhn.zzx(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, false);
                            break;
                        case 23:
                            zzhn.zzv(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, false);
                            break;
                        case 24:
                            zzhn.zzu(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, false);
                            break;
                        case 25:
                            zzhn.zzr(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, false);
                            break;
                        case 26:
                            int i11 = iArr[i];
                            List list = (List) unsafe.getObject(obj, j);
                            int i12 = zzhn.zza;
                            if (list != null && !list.isEmpty()) {
                                zzitVar.zzI(i11, list);
                                break;
                            }
                            break;
                        case 27:
                            int i13 = iArr[i];
                            List list2 = (List) unsafe.getObject(obj, j);
                            zzhl zzv = zzv(i);
                            int i14 = zzhn.zza;
                            if (list2 != null && !list2.isEmpty()) {
                                for (int i15 = 0; i15 < list2.size(); i15++) {
                                    ((zzfd) zzitVar).zzw(i13, list2.get(i15), zzv);
                                }
                                break;
                            }
                            break;
                        case 28:
                            int i16 = iArr[i];
                            List list3 = (List) unsafe.getObject(obj, j);
                            int i17 = zzhn.zza;
                            if (list3 != null && !list3.isEmpty()) {
                                zzitVar.zze(i16, list3);
                                break;
                            }
                            break;
                        case 29:
                            zzhn.zzD(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, false);
                            break;
                        case 30:
                            zzhn.zzt(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, false);
                            break;
                        case 31:
                            zzhn.zzz(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, false);
                            break;
                        case 32:
                            zzhn.zzA(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, false);
                            break;
                        case 33:
                            zzhn.zzB(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, false);
                            break;
                        case 34:
                            zzhn.zzC(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, false);
                            break;
                        case 35:
                            zzhn.zzs(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, true);
                            break;
                        case 36:
                            zzhn.zzw(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, true);
                            break;
                        case 37:
                            zzhn.zzy(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, true);
                            break;
                        case 38:
                            zzhn.zzE(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, true);
                            break;
                        case 39:
                            zzhn.zzx(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, true);
                            break;
                        case 40:
                            zzhn.zzv(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, true);
                            break;
                        case 41:
                            zzhn.zzu(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, true);
                            break;
                        case 42:
                            zzhn.zzr(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, true);
                            break;
                        case 43:
                            zzhn.zzD(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, true);
                            break;
                        case 44:
                            zzhn.zzt(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, true);
                            break;
                        case 45:
                            zzhn.zzz(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, true);
                            break;
                        case 46:
                            zzhn.zzA(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, true);
                            break;
                        case 47:
                            zzhn.zzB(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, true);
                            break;
                        case 48:
                            zzhn.zzC(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, true);
                            break;
                        case 49:
                            int i18 = iArr[i];
                            List list4 = (List) unsafe.getObject(obj, j);
                            zzhl zzv2 = zzv(i);
                            int i19 = zzhn.zza;
                            if (list4 != null && !list4.isEmpty()) {
                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                    ((zzfd) zzitVar).zzq(i18, list4.get(i20), zzv2);
                                }
                                break;
                            }
                            break;
                        case 50:
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                zzitVar.zzv(i8, ((zzgu) zzw(i)).zzc(), (zzgv) object);
                                break;
                            }
                            break;
                        case 51:
                            if (zzM(obj, i8, i)) {
                                zzitVar.zzf(i8, zzm(obj, j));
                                break;
                            }
                            break;
                        case 52:
                            if (zzM(obj, i8, i)) {
                                zzitVar.zzo(i8, zzn(obj, j));
                                break;
                            }
                            break;
                        case 53:
                            if (zzM(obj, i8, i)) {
                                zzitVar.zzt(i8, zzt(obj, j));
                                break;
                            }
                            break;
                        case 54:
                            if (zzM(obj, i8, i)) {
                                zzitVar.zzL(i8, zzt(obj, j));
                                break;
                            }
                            break;
                        case 55:
                            if (zzM(obj, i8, i)) {
                                zzitVar.zzr(i8, zzo(obj, j));
                                break;
                            }
                            break;
                        case 56:
                            if (zzM(obj, i8, i)) {
                                zzitVar.zzm(i8, zzt(obj, j));
                                break;
                            }
                            break;
                        case 57:
                            if (zzM(obj, i8, i)) {
                                zzitVar.zzk(i8, zzo(obj, j));
                                break;
                            }
                            break;
                        case 58:
                            if (zzM(obj, i8, i)) {
                                zzitVar.zzb(i8, zzN(obj, j));
                                break;
                            }
                            break;
                        case 59:
                            if (zzM(obj, i8, i)) {
                                zzP(i8, unsafe.getObject(obj, j), zzitVar);
                                break;
                            }
                            break;
                        case 60:
                            if (zzM(obj, i8, i)) {
                                zzitVar.zzw(i8, unsafe.getObject(obj, j), zzv(i));
                                break;
                            }
                            break;
                        case 61:
                            if (zzM(obj, i8, i)) {
                                zzitVar.zzd(i8, (zzev) unsafe.getObject(obj, j));
                                break;
                            }
                            break;
                        case 62:
                            if (zzM(obj, i8, i)) {
                                zzitVar.zzJ(i8, zzo(obj, j));
                                break;
                            }
                            break;
                        case 63:
                            if (zzM(obj, i8, i)) {
                                zzitVar.zzi(i8, zzo(obj, j));
                                break;
                            }
                            break;
                        case 64:
                            if (zzM(obj, i8, i)) {
                                zzitVar.zzy(i8, zzo(obj, j));
                                break;
                            }
                            break;
                        case 65:
                            if (zzM(obj, i8, i)) {
                                zzitVar.zzA(i8, zzt(obj, j));
                                break;
                            }
                            break;
                        case 66:
                            if (zzM(obj, i8, i)) {
                                zzitVar.zzC(i8, zzo(obj, j));
                                break;
                            }
                            break;
                        case 67:
                            if (zzM(obj, i8, i)) {
                                zzitVar.zzE(i8, zzt(obj, j));
                                break;
                            }
                            break;
                        case 68:
                            if (zzM(obj, i8, i)) {
                                zzitVar.zzq(i8, unsafe.getObject(obj, j), zzv(i));
                                break;
                            }
                            break;
                    }
                    entry3 = entry;
                    i += 3;
                    i6 = i2;
                    entry = entry3;
                    i7 = i3;
                    i5 = 1048575;
                }
                entry2 = entry;
                if (entry2 != null) {
                    ((zzfu) obj).zzc.zzl(zzitVar);
                    return;
                } else {
                    throw null;
                }
            }
        }
        entry = null;
        iArr = this.zzc;
        Unsafe unsafe2 = zzb;
        int i52 = 1048575;
        int i62 = 1048575;
        int i72 = 0;
        i = 0;
        while (i < iArr.length) {
        }
        entry2 = entry;
        if (entry2 != null) {
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhl
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzF;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzs = zzs(i);
            long j = zzs & 1048575;
            switch (zzr(zzs)) {
                case 0:
                    if (zzH(obj, obj2, i) && Double.doubleToLongBits(zzii.zza(obj, j)) == Double.doubleToLongBits(zzii.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzH(obj, obj2, i) && Float.floatToIntBits(zzii.zzb(obj, j)) == Float.floatToIntBits(zzii.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzH(obj, obj2, i) && zzii.zzd(obj, j) == zzii.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzH(obj, obj2, i) && zzii.zzd(obj, j) == zzii.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzH(obj, obj2, i) && zzii.zzc(obj, j) == zzii.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzH(obj, obj2, i) && zzii.zzd(obj, j) == zzii.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzH(obj, obj2, i) && zzii.zzc(obj, j) == zzii.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzH(obj, obj2, i) && zzii.zzw(obj, j) == zzii.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzH(obj, obj2, i) && zzhn.zzF(zzii.zzf(obj, j), zzii.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzH(obj, obj2, i) && zzhn.zzF(zzii.zzf(obj, j), zzii.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzH(obj, obj2, i) && zzhn.zzF(zzii.zzf(obj, j), zzii.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzH(obj, obj2, i) && zzii.zzc(obj, j) == zzii.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzH(obj, obj2, i) && zzii.zzc(obj, j) == zzii.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzH(obj, obj2, i) && zzii.zzc(obj, j) == zzii.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzH(obj, obj2, i) && zzii.zzd(obj, j) == zzii.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzH(obj, obj2, i) && zzii.zzc(obj, j) == zzii.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzH(obj, obj2, i) && zzii.zzd(obj, j) == zzii.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzH(obj, obj2, i) && zzhn.zzF(zzii.zzf(obj, j), zzii.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
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
                    zzF = zzhn.zzF(zzii.zzf(obj, j), zzii.zzf(obj2, j));
                    break;
                case 50:
                    zzF = zzhn.zzF(zzii.zzf(obj, j), zzii.zzf(obj2, j));
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
                    long zzp = zzp(i) & 1048575;
                    if (zzii.zzc(obj, zzp) == zzii.zzc(obj2, zzp) && zzhn.zzF(zzii.zzf(obj, j), zzii.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzF) {
                return false;
            }
        }
        if (!((zzfu) obj).zzc.equals(((zzfu) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzfr) obj).zzb.equals(((zzfr) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhl
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.zzj) {
            int[] iArr = this.zzi;
            int[] iArr2 = this.zzc;
            int i6 = iArr[i4];
            int i7 = iArr2[i6];
            int zzs = zzs(i6);
            int i8 = iArr2[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i3 = zzb.getInt(obj, i9);
                }
                i2 = i3;
                i = i9;
            } else {
                i = i5;
                i2 = i3;
            }
            if ((268435456 & zzs) != 0 && !zzJ(obj, i6, i, i2, i10)) {
                return false;
            }
            int zzr = zzr(zzs);
            if (zzr != 9 && zzr != 17) {
                if (zzr != 27) {
                    if (zzr == 60 || zzr == 68) {
                        if (zzM(obj, i7, i6) && !zzK(obj, zzs, zzv(i6))) {
                            return false;
                        }
                    } else if (zzr != 49) {
                        if (zzr != 50) {
                            continue;
                        } else {
                            zzgv zzgvVar = (zzgv) zzii.zzf(obj, zzs & 1048575);
                            if (!zzgvVar.isEmpty() && ((zzgu) zzw(i6)).zzc().zzc.zzb() == zzis.MESSAGE) {
                                zzhl zzhlVar = null;
                                for (Object obj2 : zzgvVar.values()) {
                                    if (zzhlVar == null) {
                                        zzhlVar = zzhi.zza().zzb(obj2.getClass());
                                    }
                                    if (!zzhlVar.zzk(obj2)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
                List list = (List) zzii.zzf(obj, zzs & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzhl zzv = zzv(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzv.zzk(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (zzJ(obj, i6, i, i2, i10) && !zzK(obj, zzs, zzv(i6))) {
                return false;
            }
            i4++;
            i5 = i;
            i3 = i2;
        }
        return !this.zzh || ((zzfr) obj).zzb.zzj();
    }
}
