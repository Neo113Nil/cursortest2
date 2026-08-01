package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@23.0.0 */
/* loaded from: classes8.dex */
final class zznp<T> implements zznx<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzop.zzq();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zznm zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzoi zzl;
    private final zzls zzm;

    private zznp(int[] iArr, Object[] objArr, int i, int i2, zznm zznmVar, boolean z, int[] iArr2, int i3, int i4, zznr zznrVar, zzmy zzmyVar, zzoi zzoiVar, zzls zzlsVar, zznh zznhVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        boolean z2 = false;
        if (zzlsVar != null && (zznmVar instanceof zzmc)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzi = iArr2;
        this.zzj = i3;
        this.zzk = i4;
        this.zzl = zzoiVar;
        this.zzm = zzlsVar;
        this.zzg = zznmVar;
    }

    private static boolean zzA(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzmf) {
            return ((zzmf) obj).zzcf();
        }
        return true;
    }

    private static void zzB(Object obj) {
        if (zzA(obj)) {
            return;
        }
        String valueOf = String.valueOf(obj);
        String.valueOf(valueOf);
        throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(valueOf)));
    }

    private static double zzC(Object obj, long j) {
        return ((Double) zzop.zzn(obj, j)).doubleValue();
    }

    private static float zzD(Object obj, long j) {
        return ((Float) zzop.zzn(obj, j)).floatValue();
    }

    private static int zzE(Object obj, long j) {
        return ((Integer) zzop.zzn(obj, j)).intValue();
    }

    private static long zzF(Object obj, long j) {
        return ((Long) zzop.zzn(obj, j)).longValue();
    }

    private static boolean zzG(Object obj, long j) {
        return ((Boolean) zzop.zzn(obj, j)).booleanValue();
    }

    private final boolean zzH(Object obj, Object obj2, int i) {
        return zzJ(obj, i) == zzJ(obj2, i);
    }

    private final boolean zzI(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzJ(obj, i) : (i3 & i4) != 0;
    }

    private final boolean zzJ(Object obj, int i) {
        int zzy = zzy(i);
        long j = zzy & 1048575;
        if (j != 1048575) {
            return (zzop.zzd(obj, j) & (1 << (zzy >>> 20))) != 0;
        }
        int zzx = zzx(i);
        long j2 = zzx & 1048575;
        switch (zzz(zzx)) {
            case 0:
                return Double.doubleToRawLongBits(zzop.zzl(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzop.zzj(obj, j2)) != 0;
            case 2:
                return zzop.zzf(obj, j2) != 0;
            case 3:
                return zzop.zzf(obj, j2) != 0;
            case 4:
                return zzop.zzd(obj, j2) != 0;
            case 5:
                return zzop.zzf(obj, j2) != 0;
            case 6:
                return zzop.zzd(obj, j2) != 0;
            case 7:
                return zzop.zzh(obj, j2);
            case 8:
                Object zzn = zzop.zzn(obj, j2);
                if (zzn instanceof String) {
                    return !((String) zzn).isEmpty();
                }
                if (zzn instanceof zzlh) {
                    return !zzlh.zzb.equals(zzn);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzop.zzn(obj, j2) != null;
            case 10:
                return !zzlh.zzb.equals(zzop.zzn(obj, j2));
            case 11:
                return zzop.zzd(obj, j2) != 0;
            case 12:
                return zzop.zzd(obj, j2) != 0;
            case 13:
                return zzop.zzd(obj, j2) != 0;
            case 14:
                return zzop.zzf(obj, j2) != 0;
            case 15:
                return zzop.zzd(obj, j2) != 0;
            case 16:
                return zzop.zzf(obj, j2) != 0;
            case 17:
                return zzop.zzn(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void zzK(Object obj, int i) {
        int zzy = zzy(i);
        long j = 1048575 & zzy;
        if (j == 1048575) {
            return;
        }
        zzop.zze(obj, j, (1 << (zzy >>> 20)) | zzop.zzd(obj, j));
    }

    private final boolean zzL(Object obj, int i, int i2) {
        return zzop.zzd(obj, (long) (zzy(i2) & 1048575)) == i;
    }

    private final void zzM(Object obj, int i, int i2) {
        zzop.zze(obj, zzy(i2) & 1048575, i);
    }

    private final int zzN(int i, int i2) {
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

    private static final int zzO(byte[] bArr, int i, int i2, zzot zzotVar, Class cls, zzkw zzkwVar) throws IOException {
        int i3;
        zzot zzotVar2 = zzot.DOUBLE;
        switch (zzotVar) {
            case DOUBLE:
                i3 = i + 8;
                zzkwVar.zzc = Double.valueOf(Double.longBitsToDouble(zzkx.zze(bArr, i)));
                break;
            case FLOAT:
                i3 = i + 4;
                zzkwVar.zzc = Float.valueOf(Float.intBitsToFloat(zzkx.zzd(bArr, i)));
                break;
            case INT64:
            case UINT64:
                int zzc = zzkx.zzc(bArr, i, zzkwVar);
                zzkwVar.zzc = Long.valueOf(zzkwVar.zzb);
                return zzc;
            case INT32:
            case UINT32:
            case ENUM:
                int zza2 = zzkx.zza(bArr, i, zzkwVar);
                zzkwVar.zzc = Integer.valueOf(zzkwVar.zza);
                return zza2;
            case FIXED64:
            case SFIXED64:
                i3 = i + 8;
                zzkwVar.zzc = Long.valueOf(zzkx.zze(bArr, i));
                break;
            case FIXED32:
            case SFIXED32:
                i3 = i + 4;
                zzkwVar.zzc = Integer.valueOf(zzkx.zzd(bArr, i));
                break;
            case BOOL:
                int zzc2 = zzkx.zzc(bArr, i, zzkwVar);
                zzkwVar.zzc = Boolean.valueOf(zzkwVar.zzb != 0);
                return zzc2;
            case STRING:
                return zzkx.zzf(bArr, i, zzkwVar);
            case GROUP:
            default:
                throw new RuntimeException("unsupported field type.");
            case MESSAGE:
                return zzkx.zzh(zznu.zza().zzb(cls), bArr, i, i2, zzkwVar);
            case BYTES:
                return zzkx.zzg(bArr, i, zzkwVar);
            case SINT32:
                int zza3 = zzkx.zza(bArr, i, zzkwVar);
                zzkwVar.zzc = Integer.valueOf(zzlj.zzb(zzkwVar.zza));
                return zza3;
            case SINT64:
                int zzc3 = zzkx.zzc(bArr, i, zzkwVar);
                zzkwVar.zzc = Long.valueOf(zzlj.zzc(zzkwVar.zzb));
                return zzc3;
        }
        return i3;
    }

    private static final void zzP(int i, Object obj, zzov zzovVar) throws IOException {
        if (obj instanceof String) {
            zzovVar.zzm(i, (String) obj);
        } else {
            zzovVar.zzn(i, (zzlh) obj);
        }
    }

    static zzoj zzg(Object obj) {
        zzmf zzmfVar = (zzmf) obj;
        zzoj zzojVar = zzmfVar.zzc;
        if (zzojVar != zzoj.zza()) {
            return zzojVar;
        }
        zzoj zzb2 = zzoj.zzb();
        zzmfVar.zzc = zzb2;
        return zzb2;
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
    static zznp zzl(Class cls, zznj zznjVar, zznr zznrVar, zzmy zzmyVar, zzoi zzoiVar, zzls zzlsVar, zznh zznhVar) {
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
        zznw zznwVar;
        String str;
        int objectFieldOffset;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        Field zzm;
        int i25;
        char charAt11;
        int i26;
        int i27;
        int i28;
        int i29;
        Object obj;
        Field zzm2;
        Object obj2;
        Field zzm3;
        int i30;
        char charAt12;
        int i31;
        char charAt13;
        int i32;
        char charAt14;
        int i33;
        char charAt15;
        if (!(zznjVar instanceof zznw)) {
            throw null;
        }
        zznw zznwVar2 = (zznw) zznjVar;
        String zzd = zznwVar2.zzd();
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
        Object[] zze = zznwVar2.zze();
        Class<?> cls2 = zznwVar2.zzb().getClass();
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
                        if (zznwVar2.zzc() == 1 || i79 != 0) {
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
                        zzm2 = zzm(cls2, (String) obj);
                        zze[i89] = zzm2;
                    } else {
                        zzm2 = (Field) obj;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzm2);
                    int i90 = i89 + 1;
                    obj2 = zze[i90];
                    int i91 = i79;
                    if (obj2 instanceof Field) {
                        zzm3 = zzm(cls2, (String) obj2);
                        zze[i90] = zzm3;
                    } else {
                        zzm3 = (Field) obj2;
                    }
                    i18 = i4;
                    i22 = i86;
                    i19 = charAt23;
                    i20 = (int) unsafe.objectFieldOffset(zzm3);
                    i23 = 0;
                    str = zzd;
                    zznwVar = zznwVar2;
                    objectFieldOffset = objectFieldOffset2;
                    i24 = i91;
                }
                i4 = i29;
                int i892 = charAt25 + charAt25;
                obj = zze[i892];
                if (obj instanceof Field) {
                }
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zzm2);
                int i902 = i892 + 1;
                obj2 = zze[i902];
                int i912 = i79;
                if (obj2 instanceof Field) {
                }
                i18 = i4;
                i22 = i86;
                i19 = charAt23;
                i20 = (int) unsafe.objectFieldOffset(zzm3);
                i23 = 0;
                str = zzd;
                zznwVar = zznwVar2;
                objectFieldOffset = objectFieldOffset22;
                i24 = i912;
            } else {
                i17 = i2;
                i18 = i4 + 1;
                Field zzm4 = zzm(cls2, (String) zze[i4]);
                i19 = charAt23;
                if (i77 == 9 || i77 == 17) {
                    zznwVar = zznwVar2;
                    int i92 = i68 / 3;
                    objArr[i92 + i92 + 1] = zzm4.getType();
                } else {
                    if (i77 == 27) {
                        zznwVar = zznwVar2;
                        i26 = 1;
                        i27 = i4 + 2;
                    } else if (i77 == 49) {
                        i27 = i4 + 2;
                        zznwVar = zznwVar2;
                        i26 = 1;
                    } else {
                        if (i77 == 12 || i77 == 30 || i77 == 44) {
                            zznwVar = zznwVar2;
                            if (zznwVar2.zzc() == 1 || i79 != 0) {
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
                                zznwVar = zznwVar2;
                            } else {
                                i18 = i94;
                                i65 = i95;
                                i79 = 0;
                                zznwVar = zznwVar2;
                            }
                        } else {
                            zznwVar = zznwVar2;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(zzm4);
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
                                zzm = (Field) obj3;
                            } else {
                                zzm = zzm(cls2, (String) obj3);
                                zze[i101] = zzm;
                            }
                            i21 = i79;
                            i23 = charAt26 % 32;
                            i20 = (int) unsafe.objectFieldOffset(zzm);
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
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzm4);
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
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzm4);
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
            zznwVar2 = zznwVar;
            i35 = i22;
            i2 = i17;
            c = 55296;
        }
        return new zznp(iArr3, objArr, i2, i5, zznwVar2.zzb(), false, iArr, i3, i63, zznrVar, zzmyVar, zzoiVar, zzlsVar, zznhVar);
    }

    private static Field zzm(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(name).length() + 29 + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString(), e);
        }
    }

    private final void zzn(Object obj, Object obj2, int i) {
        if (zzJ(obj2, i)) {
            int zzx = zzx(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzx;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i2 = this.zzc[i];
                String obj3 = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 38 + obj3.length());
                sb.append("Source subfield ");
                sb.append(i2);
                sb.append(" is present but null: ");
                sb.append(obj3);
                throw new IllegalStateException(sb.toString());
            }
            zznx zzp = zzp(i);
            if (!zzJ(obj, i)) {
                if (zzA(object)) {
                    Object zza2 = zzp.zza();
                    zzp.zzd(zza2, object);
                    unsafe.putObject(obj, j, zza2);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzK(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzA(object2)) {
                Object zza3 = zzp.zza();
                zzp.zzd(zza3, object2);
                unsafe.putObject(obj, j, zza3);
                object2 = zza3;
            }
            zzp.zzd(object2, object);
        }
    }

    private final void zzo(Object obj, Object obj2, int i) {
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        if (zzL(obj2, i2, i)) {
            int zzx = zzx(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzx;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i3 = iArr[i];
                String obj3 = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 38 + obj3.length());
                sb.append("Source subfield ");
                sb.append(i3);
                sb.append(" is present but null: ");
                sb.append(obj3);
                throw new IllegalStateException(sb.toString());
            }
            zznx zzp = zzp(i);
            if (!zzL(obj, i2, i)) {
                if (zzA(object)) {
                    Object zza2 = zzp.zza();
                    zzp.zzd(zza2, object);
                    unsafe.putObject(obj, j, zza2);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzM(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzA(object2)) {
                Object zza3 = zzp.zza();
                zzp.zzd(zza3, object2);
                unsafe.putObject(obj, j, zza3);
                object2 = zza3;
            }
            zzp.zzd(object2, object);
        }
    }

    private final zznx zzp(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zznx zznxVar = (zznx) objArr[i3];
        if (zznxVar != null) {
            return zznxVar;
        }
        zznx zzb2 = zznu.zza().zzb((Class) objArr[i3 + 1]);
        objArr[i3] = zzb2;
        return zzb2;
    }

    private final Object zzq(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final zzmk zzr(int i) {
        int i2 = i / 3;
        return (zzmk) this.zzd[i2 + i2 + 1];
    }

    private final Object zzs(Object obj, int i) {
        zznx zzp = zzp(i);
        int zzx = zzx(i) & 1048575;
        if (!zzJ(obj, i)) {
            return zzp.zza();
        }
        Object object = zzb.getObject(obj, zzx);
        if (zzA(object)) {
            return object;
        }
        Object zza2 = zzp.zza();
        if (object != null) {
            zzp.zzd(zza2, object);
        }
        return zza2;
    }

    private final void zzt(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzx(i) & 1048575, obj2);
        zzK(obj, i);
    }

    private final Object zzu(Object obj, int i, int i2) {
        zznx zzp = zzp(i2);
        if (!zzL(obj, i, i2)) {
            return zzp.zza();
        }
        Object object = zzb.getObject(obj, zzx(i2) & 1048575);
        if (zzA(object)) {
            return object;
        }
        Object zza2 = zzp.zza();
        if (object != null) {
            zzp.zzd(zza2, object);
        }
        return zza2;
    }

    private final void zzv(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzx(i2) & 1048575, obj2);
        zzM(obj, i, i2);
    }

    private static boolean zzw(Object obj, int i, zznx zznxVar) {
        return zznxVar.zzk(zzop.zzn(obj, i & 1048575));
    }

    private final int zzx(int i) {
        return this.zzc[i + 1];
    }

    private final int zzy(int i) {
        return this.zzc[i + 2];
    }

    private static int zzz(int i) {
        return (i >>> 20) & 255;
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final Object zza() {
        return ((zzmf) this.zzg).zzch();
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final boolean zzb(Object obj, Object obj2) {
        boolean zzB;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzx = zzx(i);
            long j = zzx & 1048575;
            switch (zzz(zzx)) {
                case 0:
                    if (zzH(obj, obj2, i) && Double.doubleToLongBits(zzop.zzl(obj, j)) == Double.doubleToLongBits(zzop.zzl(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzH(obj, obj2, i) && Float.floatToIntBits(zzop.zzj(obj, j)) == Float.floatToIntBits(zzop.zzj(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzH(obj, obj2, i) && zzop.zzf(obj, j) == zzop.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzH(obj, obj2, i) && zzop.zzf(obj, j) == zzop.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzH(obj, obj2, i) && zzop.zzd(obj, j) == zzop.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzH(obj, obj2, i) && zzop.zzf(obj, j) == zzop.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzH(obj, obj2, i) && zzop.zzd(obj, j) == zzop.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzH(obj, obj2, i) && zzop.zzh(obj, j) == zzop.zzh(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzH(obj, obj2, i) && zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzH(obj, obj2, i) && zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzH(obj, obj2, i) && zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzH(obj, obj2, i) && zzop.zzd(obj, j) == zzop.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzH(obj, obj2, i) && zzop.zzd(obj, j) == zzop.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzH(obj, obj2, i) && zzop.zzd(obj, j) == zzop.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzH(obj, obj2, i) && zzop.zzf(obj, j) == zzop.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzH(obj, obj2, i) && zzop.zzd(obj, j) == zzop.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzH(obj, obj2, i) && zzop.zzf(obj, j) == zzop.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzH(obj, obj2, i) && zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j))) {
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
                    zzB = zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j));
                    break;
                case 50:
                    zzB = zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j));
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
                    long zzy = zzy(i) & 1048575;
                    if (zzop.zzd(obj, zzy) == zzop.zzd(obj2, zzy) && zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzB) {
                return false;
            }
        }
        if (!((zzmf) obj).zzc.equals(((zzmf) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzmc) obj).zzb.equals(((zzmc) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final int zzc(Object obj) {
        int i;
        long doubleToLongBits;
        int floatToIntBits;
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i3 >= iArr.length) {
                int hashCode = (i4 * 53) + ((zzmf) obj).zzc.hashCode();
                return this.zzh ? (hashCode * 53) + ((zzmc) obj).zzb.zza.hashCode() : hashCode;
            }
            int zzx = zzx(i3);
            int i5 = 1048575 & zzx;
            int zzz = zzz(zzx);
            int i6 = iArr[i3];
            long j = i5;
            int i7 = 37;
            switch (zzz) {
                case 0:
                    i = i4 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzop.zzl(obj, j));
                    byte[] bArr = zzmp.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 1:
                    i = i4 * 53;
                    floatToIntBits = Float.floatToIntBits(zzop.zzj(obj, j));
                    i4 = i + floatToIntBits;
                    break;
                case 2:
                    i = i4 * 53;
                    doubleToLongBits = zzop.zzf(obj, j);
                    byte[] bArr2 = zzmp.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 3:
                    i = i4 * 53;
                    doubleToLongBits = zzop.zzf(obj, j);
                    byte[] bArr3 = zzmp.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 4:
                    i = i4 * 53;
                    floatToIntBits = zzop.zzd(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 5:
                    i = i4 * 53;
                    doubleToLongBits = zzop.zzf(obj, j);
                    byte[] bArr4 = zzmp.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 6:
                    i = i4 * 53;
                    floatToIntBits = zzop.zzd(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 7:
                    i = i4 * 53;
                    floatToIntBits = zzmp.zzb(zzop.zzh(obj, j));
                    i4 = i + floatToIntBits;
                    break;
                case 8:
                    i = i4 * 53;
                    floatToIntBits = ((String) zzop.zzn(obj, j)).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 9:
                    i2 = i4 * 53;
                    Object zzn = zzop.zzn(obj, j);
                    if (zzn != null) {
                        i7 = zzn.hashCode();
                    }
                    i4 = i2 + i7;
                    break;
                case 10:
                    i = i4 * 53;
                    floatToIntBits = zzop.zzn(obj, j).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 11:
                    i = i4 * 53;
                    floatToIntBits = zzop.zzd(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 12:
                    i = i4 * 53;
                    floatToIntBits = zzop.zzd(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 13:
                    i = i4 * 53;
                    floatToIntBits = zzop.zzd(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 14:
                    i = i4 * 53;
                    doubleToLongBits = zzop.zzf(obj, j);
                    byte[] bArr5 = zzmp.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 15:
                    i = i4 * 53;
                    floatToIntBits = zzop.zzd(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 16:
                    i = i4 * 53;
                    doubleToLongBits = zzop.zzf(obj, j);
                    byte[] bArr6 = zzmp.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 17:
                    i2 = i4 * 53;
                    Object zzn2 = zzop.zzn(obj, j);
                    if (zzn2 != null) {
                        i7 = zzn2.hashCode();
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
                    floatToIntBits = zzop.zzn(obj, j).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 50:
                    i = i4 * 53;
                    floatToIntBits = zzop.zzn(obj, j).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 51:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzC(obj, j));
                        byte[] bArr7 = zzmp.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 52:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = Float.floatToIntBits(zzD(obj, j));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 53:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzF(obj, j);
                        byte[] bArr8 = zzmp.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 54:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzF(obj, j);
                        byte[] bArr9 = zzmp.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 55:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzE(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 56:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzF(obj, j);
                        byte[] bArr10 = zzmp.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 57:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzE(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 58:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzmp.zzb(zzG(obj, j));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 59:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = ((String) zzop.zzn(obj, j)).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 60:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzop.zzn(obj, j).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 61:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzop.zzn(obj, j).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 62:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzE(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 63:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzE(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 64:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzE(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 65:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzF(obj, j);
                        byte[] bArr11 = zzmp.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 66:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzE(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 67:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzF(obj, j);
                        byte[] bArr12 = zzmp.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 68:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzop.zzn(obj, j).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
            }
            i3 += 3;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final void zzd(Object obj, Object obj2) {
        zzB(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i >= iArr.length) {
                zznz.zzD(this.zzl, obj, obj2);
                if (this.zzh) {
                    zznz.zzC(this.zzm, obj, obj2);
                    return;
                }
                return;
            }
            int zzx = zzx(i);
            int i2 = 1048575 & zzx;
            int zzz = zzz(zzx);
            int i3 = iArr[i];
            long j = i2;
            switch (zzz) {
                case 0:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zzm(obj, j, zzop.zzl(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 1:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zzk(obj, j, zzop.zzj(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 2:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zzg(obj, j, zzop.zzf(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 3:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zzg(obj, j, zzop.zzf(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 4:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zze(obj, j, zzop.zzd(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 5:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zzg(obj, j, zzop.zzf(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 6:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zze(obj, j, zzop.zzd(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 7:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zzi(obj, j, zzop.zzh(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 8:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zzo(obj, j, zzop.zzn(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 9:
                    zzn(obj, obj2, i);
                    break;
                case 10:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zzo(obj, j, zzop.zzn(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 11:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zze(obj, j, zzop.zzd(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 12:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zze(obj, j, zzop.zzd(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 13:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zze(obj, j, zzop.zzd(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 14:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zzg(obj, j, zzop.zzf(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 15:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zze(obj, j, zzop.zzd(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 16:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zzg(obj, j, zzop.zzf(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 17:
                    zzn(obj, obj2, i);
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
                    zzmo zzmoVar = (zzmo) zzop.zzn(obj, j);
                    zzmo zzmoVar2 = (zzmo) zzop.zzn(obj2, j);
                    int size = zzmoVar.size();
                    int size2 = zzmoVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzmoVar.zza()) {
                            zzmoVar = zzmoVar.zzg(size2 + size);
                        }
                        zzmoVar.addAll(zzmoVar2);
                    }
                    if (size > 0) {
                        zzmoVar2 = zzmoVar;
                    }
                    zzop.zzo(obj, j, zzmoVar2);
                    break;
                case 50:
                    int i4 = zznz.zza;
                    zzop.zzo(obj, j, zznh.zza(zzop.zzn(obj, j), zzop.zzn(obj2, j)));
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
                    if (!zzL(obj2, i3, i)) {
                        break;
                    } else {
                        zzop.zzo(obj, j, zzop.zzn(obj2, j));
                        zzM(obj, i3, i);
                        break;
                    }
                case 60:
                    zzo(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzL(obj2, i3, i)) {
                        break;
                    } else {
                        zzop.zzo(obj, j, zzop.zzn(obj2, j));
                        zzM(obj, i3, i);
                        break;
                    }
                case 68:
                    zzo(obj, obj2, i);
                    break;
            }
            i += 3;
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
    /* JADX WARN: Type inference failed for: r2v31, types: [int] */
    /* JADX WARN: Type inference failed for: r2v39, types: [int] */
    /* JADX WARN: Type inference failed for: r2v43, types: [int] */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52, types: [int] */
    /* JADX WARN: Type inference failed for: r2v80 */
    /* JADX WARN: Type inference failed for: r2v81, types: [int] */
    /* JADX WARN: Type inference failed for: r2v83 */
    /* JADX WARN: Type inference failed for: r2v84, types: [int] */
    /* JADX WARN: Type inference failed for: r2v94 */
    /* JADX WARN: Type inference failed for: r2v95 */
    /* JADX WARN: Type inference failed for: r2v96 */
    /* JADX WARN: Type inference failed for: r2v97 */
    /* JADX WARN: Type inference failed for: r2v98 */
    /* JADX WARN: Type inference failed for: r2v99 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28, types: [int] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31, types: [int] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v40, types: [int] */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v47, types: [int] */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r3v61 */
    /* JADX WARN: Type inference failed for: r3v62 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30, types: [int] */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v37, types: [int] */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    @Override // com.google.android.gms.internal.measurement.zznx
    public final int zze(Object obj) {
        int i;
        int i2;
        ?? r5;
        int zzz;
        int zzz2;
        int zzz3;
        int zzA;
        int zzz4;
        int zzz5;
        int zzc;
        int zzz6;
        ?? zzo;
        int size;
        int zzz7;
        int zzB;
        int zzB2;
        ?? r3;
        int zzD;
        ?? r1;
        ?? r0;
        int zzx;
        int zzz8;
        int zzz9;
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
                int zzi = i5 + ((zzmf) obj).zzc.zzi();
                if (!this.zzh) {
                    return zzi;
                }
                zzoe zzoeVar = ((zzmc) obj).zzb.zza;
                int zzc2 = zzoeVar.zzc();
                int i7 = 0;
                for (int i8 = 0; i8 < zzc2; i8++) {
                    Map.Entry zzd = zzoeVar.zzd(i8);
                    i7 += zzlw.zzj((zzlv) ((zzob) zzd).zza(), zzd.getValue());
                }
                for (Map.Entry entry : zzoeVar.zze()) {
                    i7 += zzlw.zzj((zzlv) entry.getKey(), entry.getValue());
                }
                return zzi + i7;
            }
            int zzx2 = zzx(i4);
            int zzz10 = zzz(zzx2);
            int i9 = iArr[i4];
            int i10 = iArr[i4 + 2];
            int i11 = i10 & i3;
            if (zzz10 <= 17) {
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
            int i12 = zzx2 & i3;
            if (zzz10 >= zzlx.DOUBLE_LIST_PACKED.zza()) {
                zzlx.SINT64_LIST_PACKED.zza();
            }
            long j = i12;
            switch (zzz10) {
                case 0:
                    if (zzI(obj, i4, i, i2, r5)) {
                        zzz = zzlm.zzz(i9 << 3);
                        r0 = zzz + 8;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzI(obj, i4, i, i2, r5)) {
                        zzz2 = zzlm.zzz(i9 << 3);
                        r0 = zzz2 + 4;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzI(obj, i4, i, i2, r5)) {
                        long j2 = unsafe.getLong(obj, j);
                        zzz3 = zzlm.zzz(i9 << 3);
                        zzA = zzlm.zzA(j2);
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzI(obj, i4, i, i2, r5)) {
                        long j3 = unsafe.getLong(obj, j);
                        zzz3 = zzlm.zzz(i9 << 3);
                        zzA = zzlm.zzA(j3);
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzI(obj, i4, i, i2, r5)) {
                        long j4 = unsafe.getInt(obj, j);
                        zzz3 = zzlm.zzz(i9 << 3);
                        zzA = zzlm.zzA(j4);
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzI(obj, i4, i, i2, r5)) {
                        zzz = zzlm.zzz(i9 << 3);
                        r0 = zzz + 8;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzI(obj, i4, i, i2, r5)) {
                        zzz2 = zzlm.zzz(i9 << 3);
                        r0 = zzz2 + 4;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzI(obj, i4, i, i2, r5)) {
                        zzz4 = zzlm.zzz(i9 << 3);
                        r0 = zzz4 + 1;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zzI(obj, i4, i, i2, r5)) {
                        break;
                    } else {
                        int i13 = i9 << 3;
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzlh) {
                            zzz5 = zzlm.zzz(i13);
                            zzc = ((zzlh) object).zzc();
                            zzz6 = zzlm.zzz(zzc);
                            r0 = zzz5 + zzz6 + zzc;
                            i5 += r0;
                            break;
                        } else {
                            zzz3 = zzlm.zzz(i13);
                            zzA = zzlm.zzB((String) object);
                            r0 = zzz3 + zzA;
                            i5 += r0;
                        }
                    }
                case 9:
                    if (zzI(obj, i4, i, i2, r5)) {
                        r0 = zznz.zzz(i9, unsafe.getObject(obj, j), zzp(i4));
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzI(obj, i4, i, i2, r5)) {
                        zzlh zzlhVar = (zzlh) unsafe.getObject(obj, j);
                        zzz5 = zzlm.zzz(i9 << 3);
                        zzc = zzlhVar.zzc();
                        zzz6 = zzlm.zzz(zzc);
                        r0 = zzz5 + zzz6 + zzc;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzI(obj, i4, i, i2, r5)) {
                        int i14 = unsafe.getInt(obj, j);
                        zzz3 = zzlm.zzz(i9 << 3);
                        zzA = zzlm.zzz(i14);
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzI(obj, i4, i, i2, r5)) {
                        long j5 = unsafe.getInt(obj, j);
                        zzz3 = zzlm.zzz(i9 << 3);
                        zzA = zzlm.zzA(j5);
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzI(obj, i4, i, i2, r5)) {
                        zzz2 = zzlm.zzz(i9 << 3);
                        r0 = zzz2 + 4;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzI(obj, i4, i, i2, r5)) {
                        zzz = zzlm.zzz(i9 << 3);
                        r0 = zzz + 8;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzI(obj, i4, i, i2, r5)) {
                        int i15 = unsafe.getInt(obj, j);
                        zzz3 = zzlm.zzz(i9 << 3);
                        zzA = zzlm.zzz((i15 >> 31) ^ (i15 + i15));
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzI(obj, i4, i, i2, r5)) {
                        long j6 = unsafe.getLong(obj, j);
                        zzz3 = zzlm.zzz(i9 << 3);
                        zzA = zzlm.zzA((j6 >> 63) ^ (j6 + j6));
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzI(obj, i4, i, i2, r5)) {
                        r0 = zzlm.zzG(i9, (zznm) unsafe.getObject(obj, j), zzp(i4));
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    r0 = zznz.zzy(i9, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    break;
                case 19:
                    r0 = zznz.zzw(i9, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j);
                    int i16 = zznz.zza;
                    if (list.size() != 0) {
                        zzo = zznz.zzo(list) + (list.size() * zzlm.zzz(i9 << 3));
                        i5 += zzo;
                        break;
                    }
                    zzo = z;
                    i5 += zzo;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j);
                    int i17 = zznz.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzz3 = zznz.zzp(list2);
                        zzz7 = zzlm.zzz(i9 << 3);
                        zzA = size * zzz7;
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        break;
                    }
                    r0 = z;
                    i5 += r0;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i18 = zznz.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzz3 = zznz.zzs(list3);
                        zzz7 = zzlm.zzz(i9 << 3);
                        zzA = size * zzz7;
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        break;
                    }
                    r0 = z;
                    i5 += r0;
                case 23:
                    r0 = zznz.zzy(i9, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    break;
                case 24:
                    r0 = zznz.zzw(i9, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j);
                    int i19 = zznz.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        r0 = size2 * (zzlm.zzz(i9 << 3) + 1);
                        i5 += r0;
                        break;
                    }
                    r0 = z;
                    i5 += r0;
                case 26:
                    ?? r02 = (List) unsafe.getObject(obj, j);
                    int i20 = zznz.zza;
                    int size3 = r02.size();
                    if (size3 != 0) {
                        int zzz11 = zzlm.zzz(i9 << 3) * size3;
                        if (r02 instanceof zzmx) {
                            zzmx zzmxVar = (zzmx) r02;
                            zzo = zzz11;
                            for (?? r32 = z; r32 < size3; r32++) {
                                Object zzc3 = zzmxVar.zzc();
                                if (zzc3 instanceof zzlh) {
                                    int zzc4 = ((zzlh) zzc3).zzc();
                                    zzB2 = zzo + zzlm.zzz(zzc4) + zzc4;
                                } else {
                                    zzB2 = zzo + zzlm.zzB((String) zzc3);
                                }
                                zzo = zzB2;
                            }
                        } else {
                            zzo = zzz11;
                            for (?? r33 = z; r33 < size3; r33++) {
                                Object obj2 = r02.get(r33);
                                if (obj2 instanceof zzlh) {
                                    int zzc5 = ((zzlh) obj2).zzc();
                                    zzB = zzo + zzlm.zzz(zzc5) + zzc5;
                                } else {
                                    zzB = zzo + zzlm.zzB((String) obj2);
                                }
                                zzo = zzB;
                            }
                        }
                        i5 += zzo;
                        break;
                    }
                    zzo = z;
                    i5 += zzo;
                case 27:
                    ?? r03 = (List) unsafe.getObject(obj, j);
                    zznx zzp = zzp(i4);
                    int i21 = zznz.zza;
                    int size4 = r03.size();
                    if (size4 == 0) {
                        r3 = z;
                    } else {
                        r3 = zzlm.zzz(i9 << 3) * size4;
                        for (?? r42 = z; r42 < size4; r42++) {
                            Object obj3 = r03.get(r42);
                            if (obj3 instanceof zzmw) {
                                int zzb2 = ((zzmw) obj3).zzb();
                                zzD = (r3 == true ? 1 : 0) + zzlm.zzz(zzb2) + zzb2;
                            } else {
                                zzD = (r3 == true ? 1 : 0) + zzlm.zzD((zznm) obj3, zzp);
                            }
                            r3 = zzD;
                        }
                    }
                    i5 += r3;
                    break;
                case 28:
                    ?? r04 = (List) unsafe.getObject(obj, j);
                    int i22 = zznz.zza;
                    int size5 = r04.size();
                    if (size5 == 0) {
                        r1 = z;
                    } else {
                        r1 = size5 * zzlm.zzz(i9 << 3);
                        for (?? r2 = z; r2 < r04.size(); r2++) {
                            int zzc6 = ((zzlh) r04.get(r2)).zzc();
                            r1 += zzlm.zzz(zzc6) + zzc6;
                        }
                    }
                    i5 += r1;
                    break;
                case 29:
                    List list5 = (List) unsafe.getObject(obj, j);
                    int i23 = zznz.zza;
                    size = list5.size();
                    if (size != 0) {
                        zzz3 = zznz.zzt(list5);
                        zzz7 = zzlm.zzz(i9 << 3);
                        zzA = size * zzz7;
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        break;
                    }
                    r0 = z;
                    i5 += r0;
                case 30:
                    List list6 = (List) unsafe.getObject(obj, j);
                    int i24 = zznz.zza;
                    size = list6.size();
                    if (size != 0) {
                        zzz3 = zznz.zzr(list6);
                        zzz7 = zzlm.zzz(i9 << 3);
                        zzA = size * zzz7;
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        break;
                    }
                    r0 = z;
                    i5 += r0;
                case 31:
                    r0 = zznz.zzw(i9, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    break;
                case 32:
                    r0 = zznz.zzy(i9, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    break;
                case 33:
                    List list7 = (List) unsafe.getObject(obj, j);
                    int i25 = zznz.zza;
                    size = list7.size();
                    if (size != 0) {
                        zzz3 = zznz.zzu(list7);
                        zzz7 = zzlm.zzz(i9 << 3);
                        zzA = size * zzz7;
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        break;
                    }
                    r0 = z;
                    i5 += r0;
                case 34:
                    List list8 = (List) unsafe.getObject(obj, j);
                    int i26 = zznz.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzz3 = zznz.zzq(list8);
                        zzz7 = zzlm.zzz(i9 << 3);
                        zzA = size * zzz7;
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        break;
                    }
                    r0 = z;
                    i5 += r0;
                case 35:
                    zzx = zznz.zzx((List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzz8 = zzlm.zzz(i9 << 3);
                        zzz9 = zzlm.zzz(zzx);
                        r1 = zzz8 + zzz9 + zzx;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzx = zznz.zzv((List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzz8 = zzlm.zzz(i9 << 3);
                        zzz9 = zzlm.zzz(zzx);
                        r1 = zzz8 + zzz9 + zzx;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzx = zznz.zzo((List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzz8 = zzlm.zzz(i9 << 3);
                        zzz9 = zzlm.zzz(zzx);
                        r1 = zzz8 + zzz9 + zzx;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzx = zznz.zzp((List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzz8 = zzlm.zzz(i9 << 3);
                        zzz9 = zzlm.zzz(zzx);
                        r1 = zzz8 + zzz9 + zzx;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzx = zznz.zzs((List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzz8 = zzlm.zzz(i9 << 3);
                        zzz9 = zzlm.zzz(zzx);
                        r1 = zzz8 + zzz9 + zzx;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzx = zznz.zzx((List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzz8 = zzlm.zzz(i9 << 3);
                        zzz9 = zzlm.zzz(zzx);
                        r1 = zzz8 + zzz9 + zzx;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzx = zznz.zzv((List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzz8 = zzlm.zzz(i9 << 3);
                        zzz9 = zzlm.zzz(zzx);
                        r1 = zzz8 + zzz9 + zzx;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list9 = (List) unsafe.getObject(obj, j);
                    int i27 = zznz.zza;
                    zzx = list9.size();
                    if (zzx > 0) {
                        zzz8 = zzlm.zzz(i9 << 3);
                        zzz9 = zzlm.zzz(zzx);
                        r1 = zzz8 + zzz9 + zzx;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzx = zznz.zzt((List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzz8 = zzlm.zzz(i9 << 3);
                        zzz9 = zzlm.zzz(zzx);
                        r1 = zzz8 + zzz9 + zzx;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzx = zznz.zzr((List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzz8 = zzlm.zzz(i9 << 3);
                        zzz9 = zzlm.zzz(zzx);
                        r1 = zzz8 + zzz9 + zzx;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzx = zznz.zzv((List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzz8 = zzlm.zzz(i9 << 3);
                        zzz9 = zzlm.zzz(zzx);
                        r1 = zzz8 + zzz9 + zzx;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzx = zznz.zzx((List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzz8 = zzlm.zzz(i9 << 3);
                        zzz9 = zzlm.zzz(zzx);
                        r1 = zzz8 + zzz9 + zzx;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzx = zznz.zzu((List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzz8 = zzlm.zzz(i9 << 3);
                        zzz9 = zzlm.zzz(zzx);
                        r1 = zzz8 + zzz9 + zzx;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzx = zznz.zzq((List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzz8 = zzlm.zzz(i9 << 3);
                        zzz9 = zzlm.zzz(zzx);
                        r1 = zzz8 + zzz9 + zzx;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    ?? r05 = (List) unsafe.getObject(obj, j);
                    zznx zzp2 = zzp(i4);
                    int i28 = zznz.zza;
                    int size6 = r05.size();
                    if (size6 == 0) {
                        r4 = z;
                    } else {
                        boolean z2 = z;
                        r4 = z2;
                        ?? r34 = z2;
                        while (r34 < size6) {
                            int zzG = zzlm.zzG(i9, (zznm) r05.get(r34), zzp2);
                            r34++;
                            r4 = (r4 == true ? 1 : 0) + zzG;
                        }
                    }
                    i5 += r4;
                    break;
                case 50:
                    zzng zzngVar = (zzng) unsafe.getObject(obj, j);
                    zznf zznfVar = (zznf) zzq(i4);
                    if (!zzngVar.isEmpty()) {
                        zzo = z;
                        for (Map.Entry entry2 : zzngVar.entrySet()) {
                            zzo += zznfVar.zzd(i9, entry2.getKey(), entry2.getValue());
                        }
                        i5 += zzo;
                        break;
                    }
                    zzo = z;
                    i5 += zzo;
                case 51:
                    if (zzL(obj, i9, i4)) {
                        zzz = zzlm.zzz(i9 << 3);
                        r0 = zzz + 8;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzL(obj, i9, i4)) {
                        zzz2 = zzlm.zzz(i9 << 3);
                        r0 = zzz2 + 4;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzL(obj, i9, i4)) {
                        long zzF = zzF(obj, j);
                        zzz3 = zzlm.zzz(i9 << 3);
                        zzA = zzlm.zzA(zzF);
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzL(obj, i9, i4)) {
                        long zzF2 = zzF(obj, j);
                        zzz3 = zzlm.zzz(i9 << 3);
                        zzA = zzlm.zzA(zzF2);
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzL(obj, i9, i4)) {
                        long zzE = zzE(obj, j);
                        zzz3 = zzlm.zzz(i9 << 3);
                        zzA = zzlm.zzA(zzE);
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzL(obj, i9, i4)) {
                        zzz = zzlm.zzz(i9 << 3);
                        r0 = zzz + 8;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzL(obj, i9, i4)) {
                        zzz2 = zzlm.zzz(i9 << 3);
                        r0 = zzz2 + 4;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzL(obj, i9, i4)) {
                        zzz4 = zzlm.zzz(i9 << 3);
                        r0 = zzz4 + 1;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!zzL(obj, i9, i4)) {
                        break;
                    } else {
                        int i29 = i9 << 3;
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzlh) {
                            zzz5 = zzlm.zzz(i29);
                            zzc = ((zzlh) object2).zzc();
                            zzz6 = zzlm.zzz(zzc);
                            r0 = zzz5 + zzz6 + zzc;
                            i5 += r0;
                            break;
                        } else {
                            zzz3 = zzlm.zzz(i29);
                            zzA = zzlm.zzB((String) object2);
                            r0 = zzz3 + zzA;
                            i5 += r0;
                        }
                    }
                case 60:
                    if (zzL(obj, i9, i4)) {
                        r0 = zznz.zzz(i9, unsafe.getObject(obj, j), zzp(i4));
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzL(obj, i9, i4)) {
                        zzlh zzlhVar2 = (zzlh) unsafe.getObject(obj, j);
                        zzz5 = zzlm.zzz(i9 << 3);
                        zzc = zzlhVar2.zzc();
                        zzz6 = zzlm.zzz(zzc);
                        r0 = zzz5 + zzz6 + zzc;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzL(obj, i9, i4)) {
                        int zzE2 = zzE(obj, j);
                        zzz3 = zzlm.zzz(i9 << 3);
                        zzA = zzlm.zzz(zzE2);
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzL(obj, i9, i4)) {
                        long zzE3 = zzE(obj, j);
                        zzz3 = zzlm.zzz(i9 << 3);
                        zzA = zzlm.zzA(zzE3);
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzL(obj, i9, i4)) {
                        zzz2 = zzlm.zzz(i9 << 3);
                        r0 = zzz2 + 4;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzL(obj, i9, i4)) {
                        zzz = zzlm.zzz(i9 << 3);
                        r0 = zzz + 8;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzL(obj, i9, i4)) {
                        int zzE4 = zzE(obj, j);
                        zzz3 = zzlm.zzz(i9 << 3);
                        zzA = zzlm.zzz((zzE4 >> 31) ^ (zzE4 + zzE4));
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzL(obj, i9, i4)) {
                        long zzF3 = zzF(obj, j);
                        zzz3 = zzlm.zzz(i9 << 3);
                        zzA = zzlm.zzA((zzF3 >> 63) ^ (zzF3 + zzF3));
                        r0 = zzz3 + zzA;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzL(obj, i9, i4)) {
                        r0 = zzlm.zzG(i9, (zznm) unsafe.getObject(obj, j), zzp(i4));
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

    /* JADX WARN: Removed duplicated region for block: B:235:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    @Override // com.google.android.gms.internal.measurement.zznx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(Object obj, zzov zzovVar) throws IOException {
        Map.Entry entry;
        int[] iArr;
        int i;
        Map.Entry entry2;
        int i2;
        int i3;
        int i4;
        Map.Entry entry3;
        if (this.zzh) {
            zzlw zzlwVar = ((zzmc) obj).zzb;
            if (!zzlwVar.zza.isEmpty()) {
                entry = (Map.Entry) zzlwVar.zzc().next();
                iArr = this.zzc;
                Unsafe unsafe = zzb;
                int i5 = 1048575;
                int i6 = 1048575;
                int i7 = 0;
                i = 0;
                while (i < iArr.length) {
                    int zzx = zzx(i);
                    int zzz = zzz(zzx);
                    int i8 = iArr[i];
                    if (zzz <= 17) {
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
                    long j = zzx & i5;
                    switch (zzz) {
                        case 0:
                            entry3 = entry;
                            if (!zzI(obj, i, i2, i3, i4)) {
                                break;
                            } else {
                                zzovVar.zzf(i8, zzop.zzl(obj, j));
                                continue;
                            }
                        case 1:
                            entry3 = entry;
                            if (zzI(obj, i, i2, i3, i4)) {
                                zzovVar.zze(i8, zzop.zzj(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            entry3 = entry;
                            if (zzI(obj, i, i2, i3, i4)) {
                                zzovVar.zzc(i8, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            entry3 = entry;
                            if (zzI(obj, i, i2, i3, i4)) {
                                zzovVar.zzh(i8, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            entry3 = entry;
                            if (zzI(obj, i, i2, i3, i4)) {
                                zzovVar.zzi(i8, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            entry3 = entry;
                            if (zzI(obj, i, i2, i3, i4)) {
                                zzovVar.zzj(i8, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            entry3 = entry;
                            if (zzI(obj, i, i2, i3, i4)) {
                                zzovVar.zzk(i8, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            entry3 = entry;
                            if (zzI(obj, i, i2, i3, i4)) {
                                zzovVar.zzl(i8, zzop.zzh(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 8:
                            entry3 = entry;
                            if (zzI(obj, i, i2, i3, i4)) {
                                zzP(i8, unsafe.getObject(obj, j), zzovVar);
                                break;
                            } else {
                                continue;
                            }
                        case 9:
                            entry3 = entry;
                            if (zzI(obj, i, i2, i3, i4)) {
                                zzovVar.zzr(i8, unsafe.getObject(obj, j), zzp(i));
                                break;
                            } else {
                                continue;
                            }
                        case 10:
                            entry3 = entry;
                            if (zzI(obj, i, i2, i3, i4)) {
                                zzovVar.zzn(i8, (zzlh) unsafe.getObject(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            entry3 = entry;
                            if (zzI(obj, i, i2, i3, i4)) {
                                zzovVar.zzo(i8, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 12:
                            entry3 = entry;
                            if (zzI(obj, i, i2, i3, i4)) {
                                zzovVar.zzg(i8, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 13:
                            entry3 = entry;
                            if (zzI(obj, i, i2, i3, i4)) {
                                zzovVar.zzb(i8, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 14:
                            entry3 = entry;
                            if (zzI(obj, i, i2, i3, i4)) {
                                zzovVar.zzd(i8, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 15:
                            entry3 = entry;
                            if (zzI(obj, i, i2, i3, i4)) {
                                zzovVar.zzp(i8, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 16:
                            entry3 = entry;
                            if (zzI(obj, i, i2, i3, i4)) {
                                zzovVar.zzq(i8, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 17:
                            entry3 = entry;
                            if (zzI(obj, i, i2, i3, i4)) {
                                zzovVar.zzs(i8, unsafe.getObject(obj, j), zzp(i));
                                break;
                            } else {
                                continue;
                            }
                        case 18:
                            zznz.zza(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, false);
                            break;
                        case 19:
                            zznz.zzb(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, false);
                            break;
                        case 20:
                            zznz.zzc(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, false);
                            break;
                        case 21:
                            zznz.zzd(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, false);
                            break;
                        case 22:
                            zznz.zzh(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, false);
                            break;
                        case 23:
                            zznz.zzf(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, false);
                            break;
                        case 24:
                            zznz.zzk(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, false);
                            break;
                        case 25:
                            zznz.zzn(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, false);
                            break;
                        case 26:
                            int i11 = iArr[i];
                            List list = (List) unsafe.getObject(obj, j);
                            int i12 = zznz.zza;
                            if (list != null && !list.isEmpty()) {
                                zzovVar.zzF(i11, list);
                                break;
                            }
                            break;
                        case 27:
                            int i13 = iArr[i];
                            List list2 = (List) unsafe.getObject(obj, j);
                            zznx zzp = zzp(i);
                            int i14 = zznz.zza;
                            if (list2 != null && !list2.isEmpty()) {
                                for (int i15 = 0; i15 < list2.size(); i15++) {
                                    ((zzln) zzovVar).zzr(i13, list2.get(i15), zzp);
                                }
                                break;
                            }
                            break;
                        case 28:
                            int i16 = iArr[i];
                            List list3 = (List) unsafe.getObject(obj, j);
                            int i17 = zznz.zza;
                            if (list3 != null && !list3.isEmpty()) {
                                zzovVar.zzG(i16, list3);
                                break;
                            }
                            break;
                        case 29:
                            zznz.zzi(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, false);
                            break;
                        case 30:
                            zznz.zzm(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, false);
                            break;
                        case 31:
                            zznz.zzl(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, false);
                            break;
                        case 32:
                            zznz.zzg(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, false);
                            break;
                        case 33:
                            zznz.zzj(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, false);
                            break;
                        case 34:
                            zznz.zze(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, false);
                            break;
                        case 35:
                            zznz.zza(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, true);
                            break;
                        case 36:
                            zznz.zzb(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, true);
                            break;
                        case 37:
                            zznz.zzc(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, true);
                            break;
                        case 38:
                            zznz.zzd(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, true);
                            break;
                        case 39:
                            zznz.zzh(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, true);
                            break;
                        case 40:
                            zznz.zzf(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, true);
                            break;
                        case 41:
                            zznz.zzk(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, true);
                            break;
                        case 42:
                            zznz.zzn(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, true);
                            break;
                        case 43:
                            zznz.zzi(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, true);
                            break;
                        case 44:
                            zznz.zzm(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, true);
                            break;
                        case 45:
                            zznz.zzl(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, true);
                            break;
                        case 46:
                            zznz.zzg(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, true);
                            break;
                        case 47:
                            zznz.zzj(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, true);
                            break;
                        case 48:
                            zznz.zze(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, true);
                            break;
                        case 49:
                            int i18 = iArr[i];
                            List list4 = (List) unsafe.getObject(obj, j);
                            zznx zzp2 = zzp(i);
                            int i19 = zznz.zza;
                            if (list4 != null && !list4.isEmpty()) {
                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                    ((zzln) zzovVar).zzs(i18, list4.get(i20), zzp2);
                                }
                                break;
                            }
                            break;
                        case 50:
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                zzovVar.zzM(i8, ((zznf) zzq(i)).zze(), (zzng) object);
                                break;
                            }
                            break;
                        case 51:
                            if (zzL(obj, i8, i)) {
                                zzovVar.zzf(i8, zzC(obj, j));
                                break;
                            }
                            break;
                        case 52:
                            if (zzL(obj, i8, i)) {
                                zzovVar.zze(i8, zzD(obj, j));
                                break;
                            }
                            break;
                        case 53:
                            if (zzL(obj, i8, i)) {
                                zzovVar.zzc(i8, zzF(obj, j));
                                break;
                            }
                            break;
                        case 54:
                            if (zzL(obj, i8, i)) {
                                zzovVar.zzh(i8, zzF(obj, j));
                                break;
                            }
                            break;
                        case 55:
                            if (zzL(obj, i8, i)) {
                                zzovVar.zzi(i8, zzE(obj, j));
                                break;
                            }
                            break;
                        case 56:
                            if (zzL(obj, i8, i)) {
                                zzovVar.zzj(i8, zzF(obj, j));
                                break;
                            }
                            break;
                        case 57:
                            if (zzL(obj, i8, i)) {
                                zzovVar.zzk(i8, zzE(obj, j));
                                break;
                            }
                            break;
                        case 58:
                            if (zzL(obj, i8, i)) {
                                zzovVar.zzl(i8, zzG(obj, j));
                                break;
                            }
                            break;
                        case 59:
                            if (zzL(obj, i8, i)) {
                                zzP(i8, unsafe.getObject(obj, j), zzovVar);
                                break;
                            }
                            break;
                        case 60:
                            if (zzL(obj, i8, i)) {
                                zzovVar.zzr(i8, unsafe.getObject(obj, j), zzp(i));
                                break;
                            }
                            break;
                        case 61:
                            if (zzL(obj, i8, i)) {
                                zzovVar.zzn(i8, (zzlh) unsafe.getObject(obj, j));
                                break;
                            }
                            break;
                        case 62:
                            if (zzL(obj, i8, i)) {
                                zzovVar.zzo(i8, zzE(obj, j));
                                break;
                            }
                            break;
                        case 63:
                            if (zzL(obj, i8, i)) {
                                zzovVar.zzg(i8, zzE(obj, j));
                                break;
                            }
                            break;
                        case 64:
                            if (zzL(obj, i8, i)) {
                                zzovVar.zzb(i8, zzE(obj, j));
                                break;
                            }
                            break;
                        case 65:
                            if (zzL(obj, i8, i)) {
                                zzovVar.zzd(i8, zzF(obj, j));
                                break;
                            }
                            break;
                        case 66:
                            if (zzL(obj, i8, i)) {
                                zzovVar.zzp(i8, zzE(obj, j));
                                break;
                            }
                            break;
                        case 67:
                            if (zzL(obj, i8, i)) {
                                zzovVar.zzq(i8, zzF(obj, j));
                                break;
                            }
                            break;
                        case 68:
                            if (zzL(obj, i8, i)) {
                                zzovVar.zzs(i8, unsafe.getObject(obj, j), zzp(i));
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
                    ((zzmf) obj).zzc.zzg(zzovVar);
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
    
        throw new com.google.android.gms.internal.measurement.zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
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
        r8 = com.google.android.gms.internal.measurement.zzop.zzn(r10, r1.zzx(r4) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0db8, code lost:
    
        if (r8 == null) goto L690;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0dba, code lost:
    
        r12 = r1.zzr(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0dbe, code lost:
    
        if (r12 == null) goto L691;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0dc0, code lost:
    
        r4 = ((com.google.android.gms.internal.measurement.zznf) r1.zzq(r4)).zze();
        r8 = ((com.google.android.gms.internal.measurement.zzng) r8).entrySet().iterator();
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
    
        r14 = com.google.android.gms.internal.measurement.zznf.zzc(r4, r13.getKey(), r13.getValue());
        r15 = com.google.android.gms.internal.measurement.zzlh.zzb;
        r15 = new byte[r14];
        r16 = com.google.android.gms.internal.measurement.zzlm.zzb;
        r9 = new com.google.android.gms.internal.measurement.zzlk(r15, 0, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0e0e, code lost:
    
        com.google.android.gms.internal.measurement.zznf.zzb(r9, r4, r13.getKey(), r13.getValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0e19, code lost:
    
        r3.zzk((r7 << 3) | 2, com.google.android.gms.internal.measurement.zzle.zza(r9, r15));
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
    
        ((com.google.android.gms.internal.measurement.zzmf) r10).zzc = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0e51, code lost:
    
        if (r11 != 0) goto L591;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0e55, code lost:
    
        if (r2 != r35) goto L589;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0e5f, code lost:
    
        throw new com.google.android.gms.internal.measurement.zzmr(r19);
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
    
        throw new com.google.android.gms.internal.measurement.zzmr(r1);
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
    final int zzh(Object obj, byte[] bArr, int i, int i2, int i3, zzkw zzkwVar) throws IOException {
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
        zznp<T> zznpVar;
        int i17;
        int i18;
        int zzc;
        int i19;
        zznp<T> zznpVar2;
        Unsafe unsafe2;
        int i20;
        int i21;
        int i22;
        zzne zzneVar;
        Object obj3;
        zzng zzngVar;
        Object obj4;
        Object obj5;
        zzmo zzmoVar;
        zznp<T> zznpVar3;
        int i23;
        Unsafe unsafe3;
        int i24;
        String str2;
        zznp<T> zznpVar4;
        zznp<T> zznpVar5;
        int zza2;
        Object obj6;
        int i25;
        zznp<T> zznpVar6;
        int zzl;
        int i26;
        int i27;
        Unsafe unsafe4;
        int i28;
        zznp<T> zznpVar7 = this;
        Object obj7 = obj;
        int i29 = i2;
        int i30 = i3;
        zzB(obj);
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
                    i5 = zzkx.zzb(i38, bArr, i37, zzkwVar);
                    i4 = zzkwVar.zza;
                } else {
                    i4 = i38;
                    i5 = i37;
                }
                int i39 = i4 >>> 3;
                if (i39 > i32) {
                    i7 = (i39 < zznpVar7.zze || i39 > zznpVar7.zzf) ? -1 : zznpVar7.zzN(i39, i33 / 3);
                } else if (i39 < zznpVar7.zze || i39 > zznpVar7.zzf) {
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
                        int[] iArr = zznpVar7.zzc;
                        int i41 = i4;
                        int i42 = iArr[i7 + 1];
                        str = "Failed to parse the message.";
                        int zzz = zzz(i42);
                        long j = i42 & 1048575;
                        int i43 = i39;
                        if (zzz <= 17) {
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
                            switch (zzz) {
                                case 0:
                                    zznpVar = this;
                                    i14 = i47;
                                    i17 = i48;
                                    i12 = i7;
                                    i16 = i41;
                                    if (i40 != 1) {
                                        zznpVar2 = zznpVar;
                                        i30 = i3;
                                        obj2 = obj7;
                                        i13 = i16;
                                        i9 = i35;
                                        i8 = i17;
                                        unsafe = unsafe5;
                                        zznpVar7 = zznpVar2;
                                        i10 = i14;
                                        i11 = i43;
                                        break;
                                    } else {
                                        i31 = i17 + 8;
                                        i35 |= i45;
                                        zzop.zzm(obj7, j, Double.longBitsToDouble(zzkx.zze(bArr, i17)));
                                        i29 = i2;
                                        i30 = i3;
                                        i34 = i16;
                                        zznpVar7 = zznpVar;
                                        i33 = i12;
                                        i36 = i14;
                                        i32 = i43;
                                    }
                                case 1:
                                    zznpVar = this;
                                    i14 = i47;
                                    i17 = i48;
                                    i12 = i7;
                                    i16 = i41;
                                    if (i40 != 5) {
                                        zznpVar2 = zznpVar;
                                        i30 = i3;
                                        obj2 = obj7;
                                        i13 = i16;
                                        i9 = i35;
                                        i8 = i17;
                                        unsafe = unsafe5;
                                        zznpVar7 = zznpVar2;
                                        i10 = i14;
                                        i11 = i43;
                                        break;
                                    } else {
                                        i31 = i17 + 4;
                                        i35 |= i45;
                                        zzop.zzk(obj7, j, Float.intBitsToFloat(zzkx.zzd(bArr, i17)));
                                        i29 = i2;
                                        i30 = i3;
                                        i34 = i16;
                                        zznpVar7 = zznpVar;
                                        i33 = i12;
                                        i36 = i14;
                                        i32 = i43;
                                    }
                                case 2:
                                case 3:
                                    zznpVar = this;
                                    i14 = i47;
                                    i17 = i48;
                                    i12 = i7;
                                    i16 = i41;
                                    if (i40 != 0) {
                                        zznpVar2 = zznpVar;
                                        i30 = i3;
                                        obj2 = obj7;
                                        i13 = i16;
                                        i9 = i35;
                                        i8 = i17;
                                        unsafe = unsafe5;
                                        zznpVar7 = zznpVar2;
                                        i10 = i14;
                                        i11 = i43;
                                        break;
                                    } else {
                                        i18 = i45 | i35;
                                        zzc = zzkx.zzc(bArr, i17, zzkwVar);
                                        unsafe5.putLong(obj, j, zzkwVar.zzb);
                                        i29 = i2;
                                        i30 = i3;
                                        i34 = i16;
                                        zznpVar7 = zznpVar;
                                        i33 = i12;
                                        i35 = i18;
                                        i31 = zzc;
                                        i36 = i14;
                                        i32 = i43;
                                    }
                                case 4:
                                case 11:
                                    zznpVar = this;
                                    i14 = i47;
                                    i17 = i48;
                                    i12 = i7;
                                    i16 = i41;
                                    if (i40 != 0) {
                                        zznpVar2 = zznpVar;
                                        i30 = i3;
                                        obj2 = obj7;
                                        i13 = i16;
                                        i9 = i35;
                                        i8 = i17;
                                        unsafe = unsafe5;
                                        zznpVar7 = zznpVar2;
                                        i10 = i14;
                                        i11 = i43;
                                        break;
                                    } else {
                                        i35 |= i45;
                                        i31 = zzkx.zza(bArr, i17, zzkwVar);
                                        unsafe5.putInt(obj7, j, zzkwVar.zza);
                                        i29 = i2;
                                        i30 = i3;
                                        i34 = i16;
                                        zznpVar7 = zznpVar;
                                        i33 = i12;
                                        i36 = i14;
                                        i32 = i43;
                                    }
                                case 5:
                                case 14:
                                    zznpVar = this;
                                    i14 = i47;
                                    i17 = i48;
                                    i12 = i7;
                                    i16 = i41;
                                    if (i40 != 1) {
                                        zznpVar2 = zznpVar;
                                        i30 = i3;
                                        obj2 = obj7;
                                        i13 = i16;
                                        i9 = i35;
                                        i8 = i17;
                                        unsafe = unsafe5;
                                        zznpVar7 = zznpVar2;
                                        i10 = i14;
                                        i11 = i43;
                                        break;
                                    } else {
                                        zzc = i17 + 8;
                                        i18 = i45 | i35;
                                        unsafe5.putLong(obj, j, zzkx.zze(bArr, i17));
                                        i29 = i2;
                                        i30 = i3;
                                        i34 = i16;
                                        zznpVar7 = zznpVar;
                                        i33 = i12;
                                        i35 = i18;
                                        i31 = zzc;
                                        i36 = i14;
                                        i32 = i43;
                                    }
                                case 6:
                                case 13:
                                    zznpVar = this;
                                    i14 = i47;
                                    i17 = i48;
                                    i12 = i7;
                                    i16 = i41;
                                    if (i40 != 5) {
                                        zznpVar2 = zznpVar;
                                        i30 = i3;
                                        obj2 = obj7;
                                        i13 = i16;
                                        i9 = i35;
                                        i8 = i17;
                                        unsafe = unsafe5;
                                        zznpVar7 = zznpVar2;
                                        i10 = i14;
                                        i11 = i43;
                                        break;
                                    } else {
                                        i31 = i17 + 4;
                                        i35 |= i45;
                                        unsafe5.putInt(obj7, j, zzkx.zzd(bArr, i17));
                                        i29 = i2;
                                        i30 = i3;
                                        i34 = i16;
                                        zznpVar7 = zznpVar;
                                        i33 = i12;
                                        i36 = i14;
                                        i32 = i43;
                                    }
                                case 7:
                                    zznpVar = this;
                                    i14 = i47;
                                    i17 = i48;
                                    i12 = i7;
                                    i16 = i41;
                                    if (i40 != 0) {
                                        zznpVar2 = zznpVar;
                                        i30 = i3;
                                        obj2 = obj7;
                                        i13 = i16;
                                        i9 = i35;
                                        i8 = i17;
                                        unsafe = unsafe5;
                                        zznpVar7 = zznpVar2;
                                        i10 = i14;
                                        i11 = i43;
                                        break;
                                    } else {
                                        i35 |= i45;
                                        i31 = zzkx.zzc(bArr, i17, zzkwVar);
                                        zzop.zzi(obj7, j, zzkwVar.zzb != 0);
                                        i29 = i2;
                                        i30 = i3;
                                        i34 = i16;
                                        zznpVar7 = zznpVar;
                                        i33 = i12;
                                        i36 = i14;
                                        i32 = i43;
                                    }
                                case 8:
                                    zznpVar = this;
                                    i14 = i47;
                                    i17 = i48;
                                    i12 = i7;
                                    i16 = i41;
                                    if (i40 != 2) {
                                        zznpVar2 = zznpVar;
                                        i30 = i3;
                                        obj2 = obj7;
                                        i13 = i16;
                                        i9 = i35;
                                        i8 = i17;
                                        unsafe = unsafe5;
                                        zznpVar7 = zznpVar2;
                                        i10 = i14;
                                        i11 = i43;
                                        break;
                                    } else {
                                        if ((i42 & 536870912) != 0) {
                                            i35 |= i45;
                                            i31 = zzkx.zzf(bArr, i17, zzkwVar);
                                        } else {
                                            i31 = zzkx.zza(bArr, i17, zzkwVar);
                                            int i49 = zzkwVar.zza;
                                            if (i49 < 0) {
                                                throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            int i50 = i35 | i45;
                                            if (i49 == 0) {
                                                zzkwVar.zzc = "";
                                            } else {
                                                zzkwVar.zzc = new String(bArr, i31, i49, zzmp.zza);
                                                i31 += i49;
                                            }
                                            i35 = i50;
                                        }
                                        unsafe5.putObject(obj7, j, zzkwVar.zzc);
                                        i29 = i2;
                                        i30 = i3;
                                        i34 = i16;
                                        zznpVar7 = zznpVar;
                                        i33 = i12;
                                        i36 = i14;
                                        i32 = i43;
                                    }
                                case 9:
                                    zznpVar = this;
                                    i14 = i47;
                                    i19 = i48;
                                    i12 = i7;
                                    i16 = i41;
                                    if (i40 == 2) {
                                        Object zzs = zznpVar.zzs(obj7, i12);
                                        i31 = zzkx.zzj(zzs, zznpVar.zzp(i12), bArr, i19, i2, zzkwVar);
                                        zznpVar.zzt(obj7, i12, zzs);
                                        i30 = i3;
                                        i34 = i16;
                                        zznpVar7 = zznpVar;
                                        i35 |= i45;
                                        i33 = i12;
                                        i36 = i14;
                                        i32 = i43;
                                        break;
                                    }
                                    i17 = i19;
                                    zznpVar2 = zznpVar;
                                    i30 = i3;
                                    obj2 = obj7;
                                    i13 = i16;
                                    i9 = i35;
                                    i8 = i17;
                                    unsafe = unsafe5;
                                    zznpVar7 = zznpVar2;
                                    i10 = i14;
                                    i11 = i43;
                                    break;
                                case 10:
                                    zznpVar = this;
                                    i14 = i47;
                                    i19 = i48;
                                    i12 = i7;
                                    i16 = i41;
                                    if (i40 != 2) {
                                        i17 = i19;
                                        zznpVar2 = zznpVar;
                                        i30 = i3;
                                        obj2 = obj7;
                                        i13 = i16;
                                        i9 = i35;
                                        i8 = i17;
                                        unsafe = unsafe5;
                                        zznpVar7 = zznpVar2;
                                        i10 = i14;
                                        i11 = i43;
                                        break;
                                    } else {
                                        i35 |= i45;
                                        i31 = zzkx.zzg(bArr, i19, zzkwVar);
                                        unsafe5.putObject(obj7, j, zzkwVar.zzc);
                                        i29 = i2;
                                        i30 = i3;
                                        i34 = i16;
                                        zznpVar7 = zznpVar;
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
                                        zznpVar2 = this;
                                        i17 = i15;
                                        i30 = i3;
                                        obj2 = obj7;
                                        i13 = i16;
                                        i9 = i35;
                                        i8 = i17;
                                        unsafe = unsafe5;
                                        zznpVar7 = zznpVar2;
                                        i10 = i14;
                                        i11 = i43;
                                        break;
                                    } else {
                                        i31 = zzkx.zza(bArr, i15, zzkwVar);
                                        int i51 = zzkwVar.zza;
                                        zznpVar = this;
                                        zzmk zzr = zznpVar.zzr(i12);
                                        if ((i42 & Integer.MIN_VALUE) == 0 || zzr == null || zzr.zza(i51)) {
                                            i35 |= i45;
                                            unsafe5.putInt(obj7, j, i51);
                                        } else {
                                            zzg(obj).zzk(i16, Long.valueOf(i51));
                                        }
                                        i29 = i2;
                                        i30 = i3;
                                        i34 = i16;
                                        zznpVar7 = zznpVar;
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
                                        zznpVar2 = this;
                                        i17 = i15;
                                        i30 = i3;
                                        obj2 = obj7;
                                        i13 = i16;
                                        i9 = i35;
                                        i8 = i17;
                                        unsafe = unsafe5;
                                        zznpVar7 = zznpVar2;
                                        i10 = i14;
                                        i11 = i43;
                                        break;
                                    } else {
                                        i35 |= i45;
                                        i31 = zzkx.zza(bArr, i15, zzkwVar);
                                        unsafe5.putInt(obj7, j, zzlj.zzb(zzkwVar.zza));
                                        i29 = i2;
                                        i30 = i3;
                                        i34 = i16;
                                        i33 = i12;
                                        i36 = i14;
                                        i32 = i43;
                                        zznpVar7 = this;
                                    }
                                case 16:
                                    if (i40 != 0) {
                                        i14 = i47;
                                        i15 = i48;
                                        i16 = i41;
                                        i12 = i7;
                                        zznpVar2 = this;
                                        i17 = i15;
                                        i30 = i3;
                                        obj2 = obj7;
                                        i13 = i16;
                                        i9 = i35;
                                        i8 = i17;
                                        unsafe = unsafe5;
                                        zznpVar7 = zznpVar2;
                                        i10 = i14;
                                        i11 = i43;
                                        break;
                                    } else {
                                        int i52 = i35 | i45;
                                        int zzc2 = zzkx.zzc(bArr, i48, zzkwVar);
                                        i14 = i47;
                                        unsafe5.putLong(obj, j, zzlj.zzc(zzkwVar.zzb));
                                        i29 = i2;
                                        i30 = i3;
                                        i34 = i41;
                                        i35 = i52;
                                        i33 = i7;
                                        i31 = zzc2;
                                        i36 = i14;
                                        i32 = i43;
                                        zznpVar7 = this;
                                    }
                                default:
                                    zznpVar = this;
                                    i14 = i47;
                                    i17 = i48;
                                    i12 = i7;
                                    i16 = i41;
                                    if (i40 == 3) {
                                        Object zzs2 = zznpVar.zzs(obj7, i12);
                                        i31 = zzkx.zzk(zzs2, zznpVar.zzp(i12), bArr, i17, i2, (i43 << 3) | 4, zzkwVar);
                                        zznpVar.zzt(obj7, i12, zzs2);
                                        i30 = i3;
                                        i34 = i16;
                                        i35 |= i45;
                                        i33 = i12;
                                        zznpVar7 = zznpVar;
                                        i36 = i14;
                                        i32 = i43;
                                        break;
                                    }
                                    zznpVar2 = zznpVar;
                                    i30 = i3;
                                    obj2 = obj7;
                                    i13 = i16;
                                    i9 = i35;
                                    i8 = i17;
                                    unsafe = unsafe5;
                                    zznpVar7 = zznpVar2;
                                    i10 = i14;
                                    i11 = i43;
                                    break;
                            }
                        } else {
                            int i53 = i5;
                            i12 = i7;
                            i10 = i36;
                            zznp<T> zznpVar8 = zznpVar7;
                            i9 = i35;
                            if (zzz != 27) {
                                if (zzz > 49) {
                                    unsafe2 = unsafe5;
                                    i20 = i53;
                                    i29 = i2;
                                    if (zzz != 50) {
                                        unsafe = unsafe2;
                                        long j2 = iArr[i12 + 2] & 1048575;
                                        switch (zzz) {
                                            case 51:
                                                obj2 = obj;
                                                i13 = i41;
                                                str = str;
                                                i21 = i12;
                                                i11 = i43;
                                                zznpVar7 = this;
                                                if (i40 == 1) {
                                                    i31 = i20 + 8;
                                                    unsafe.putObject(obj2, j, Double.valueOf(Double.longBitsToDouble(zzkx.zze(bArr, i20))));
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
                                                zznpVar7 = this;
                                                if (i40 == 5) {
                                                    i31 = i20 + 4;
                                                    unsafe.putObject(obj2, j, Float.valueOf(Float.intBitsToFloat(zzkx.zzd(bArr, i20))));
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
                                                zznpVar7 = this;
                                                if (i40 == 0) {
                                                    i31 = zzkx.zzc(bArr, i20, zzkwVar);
                                                    unsafe.putObject(obj2, j, Long.valueOf(zzkwVar.zzb));
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
                                                zznpVar7 = this;
                                                if (i40 == 0) {
                                                    i31 = zzkx.zza(bArr, i20, zzkwVar);
                                                    unsafe.putObject(obj2, j, Integer.valueOf(zzkwVar.zza));
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
                                                zznpVar7 = this;
                                                if (i40 == 1) {
                                                    i31 = i20 + 8;
                                                    unsafe.putObject(obj2, j, Long.valueOf(zzkx.zze(bArr, i20)));
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
                                                zznpVar7 = this;
                                                if (i40 == 5) {
                                                    i31 = i20 + 4;
                                                    unsafe.putObject(obj2, j, Integer.valueOf(zzkx.zzd(bArr, i20)));
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
                                                zznpVar7 = this;
                                                if (i40 == 0) {
                                                    i31 = zzkx.zzc(bArr, i20, zzkwVar);
                                                    unsafe.putObject(obj2, j, Boolean.valueOf(zzkwVar.zzb != 0));
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
                                                zznpVar7 = this;
                                                if (i40 == 2) {
                                                    i31 = zzkx.zza(bArr, i20, zzkwVar);
                                                    int i54 = zzkwVar.zza;
                                                    if (i54 == 0) {
                                                        unsafe.putObject(obj2, j, "");
                                                        i21 = i12;
                                                    } else {
                                                        i21 = i12;
                                                        int i55 = i31 + i54;
                                                        if ((i42 & 536870912) != 0 && !zzos.zza(bArr, i31, i55)) {
                                                            throw new zzmr("Protocol message had invalid UTF-8.");
                                                        }
                                                        unsafe.putObject(obj2, j, new String(bArr, i31, i54, zzmp.zza));
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
                                                zznpVar7 = this;
                                                if (i40 == 2) {
                                                    Object zzu = zznpVar7.zzu(obj2, i11, i12);
                                                    i31 = zzkx.zzj(zzu, zznpVar7.zzp(i12), bArr, i20, i2, zzkwVar);
                                                    zznpVar7.zzv(obj2, i11, i12, zzu);
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
                                                zznpVar7 = this;
                                                if (i40 == 2) {
                                                    int zzg = zzkx.zzg(bArr, i20, zzkwVar);
                                                    unsafe.putObject(obj2, j, zzkwVar.zzc);
                                                    unsafe.putInt(obj2, j2, i11);
                                                    i31 = zzg;
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
                                                zznpVar7 = this;
                                                if (i40 == 0) {
                                                    i31 = zzkx.zza(bArr, i20, zzkwVar);
                                                    int i56 = zzkwVar.zza;
                                                    zzmk zzr2 = zznpVar7.zzr(i12);
                                                    if (zzr2 == null || zzr2.zza(i56)) {
                                                        i13 = i41;
                                                        unsafe.putObject(obj2, j, Integer.valueOf(i56));
                                                        unsafe.putInt(obj2, j2, i11);
                                                    } else {
                                                        i13 = i41;
                                                        zzg(obj).zzk(i13, Long.valueOf(i56));
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
                                                zznpVar7 = this;
                                                if (i40 == 0) {
                                                    i31 = zzkx.zza(bArr, i20, zzkwVar);
                                                    unsafe.putObject(obj2, j, Integer.valueOf(zzlj.zzb(zzkwVar.zza)));
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
                                                zznpVar7 = this;
                                                if (i40 == 0) {
                                                    int zzc3 = zzkx.zzc(bArr, i20, zzkwVar);
                                                    unsafe.putObject(obj2, j, Long.valueOf(zzlj.zzc(zzkwVar.zzb)));
                                                    unsafe.putInt(obj2, j2, i11);
                                                    i31 = zzc3;
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
                                                    Object zzu2 = zzu(obj, i43, i12);
                                                    str = str;
                                                    i11 = i43;
                                                    obj2 = obj;
                                                    i22 = i41;
                                                    zznpVar7 = this;
                                                    i31 = zzkx.zzk(zzu2, zzp(i12), bArr, i20, i2, (i41 & (-8)) | 4, zzkwVar);
                                                    zznpVar7.zzv(obj2, i11, i12, zzu2);
                                                    i21 = i12;
                                                    i13 = i22;
                                                    if (i31 == i20) {
                                                    }
                                                } else {
                                                    obj2 = obj;
                                                    str = str;
                                                    i11 = i43;
                                                    i22 = i41;
                                                    zznpVar7 = this;
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
                                                zznpVar7 = this;
                                                i31 = i20;
                                                if (i31 == i20) {
                                                }
                                                break;
                                        }
                                    } else if (i40 == 2) {
                                        Object zzq = zzq(i12);
                                        Unsafe unsafe6 = unsafe2;
                                        Object object = unsafe6.getObject(obj7, j);
                                        if (!((zzng) object).zze()) {
                                            zzng zzc4 = zzng.zza().zzc();
                                            zznh.zza(zzc4, object);
                                            unsafe6.putObject(obj7, j, zzc4);
                                            object = zzc4;
                                        }
                                        zzne zze = ((zznf) zzq).zze();
                                        zzng zzngVar2 = (zzng) object;
                                        int zza3 = zzkx.zza(bArr, i20, zzkwVar);
                                        int i57 = zzkwVar.zza;
                                        if (i57 >= 0 && i57 <= i29 - zza3) {
                                            int i58 = zza3 + i57;
                                            Object obj8 = zze.zzb;
                                            Object obj9 = zze.zzd;
                                            Object obj10 = obj8;
                                            Object obj11 = obj9;
                                            while (zza3 < i58) {
                                                Object obj12 = obj11;
                                                int i59 = zza3 + 1;
                                                byte b = bArr[zza3];
                                                if (b < 0) {
                                                    i59 = zzkx.zzb(b, bArr, i59, zzkwVar);
                                                    b = zzkwVar.zza;
                                                }
                                                Object obj13 = obj10;
                                                int i60 = b >>> 3;
                                                zzng zzngVar3 = zzngVar2;
                                                int i61 = b & 7;
                                                Unsafe unsafe7 = unsafe6;
                                                if (i60 != 1) {
                                                    if (i60 == 2) {
                                                        zzot zzotVar = zze.zzc;
                                                        if (i61 == zzotVar.zzb()) {
                                                            obj4 = obj9;
                                                            zzngVar = zzngVar3;
                                                            zzneVar = zze;
                                                            zza3 = zzO(bArr, i59, i2, zzotVar, obj9.getClass(), zzkwVar);
                                                            obj11 = zzkwVar.zzc;
                                                            obj10 = obj13;
                                                            zzngVar2 = zzngVar;
                                                            zze = zzneVar;
                                                            obj9 = obj4;
                                                            unsafe6 = unsafe7;
                                                        }
                                                    }
                                                    zzneVar = zze;
                                                    obj3 = obj13;
                                                    zzngVar = zzngVar3;
                                                    obj4 = obj9;
                                                    zza3 = zzkx.zzp(b, bArr, i59, i29, zzkwVar);
                                                    obj10 = obj3;
                                                    obj11 = obj12;
                                                    zzngVar2 = zzngVar;
                                                    zze = zzneVar;
                                                    obj9 = obj4;
                                                    unsafe6 = unsafe7;
                                                } else {
                                                    zzneVar = zze;
                                                    obj3 = obj13;
                                                    zzngVar = zzngVar3;
                                                    obj4 = obj9;
                                                    zzot zzotVar2 = zzneVar.zza;
                                                    if (i61 == zzotVar2.zzb()) {
                                                        zza3 = zzO(bArr, i59, i2, zzotVar2, null, zzkwVar);
                                                        obj10 = zzkwVar.zzc;
                                                        obj11 = obj12;
                                                        zzngVar2 = zzngVar;
                                                        zze = zzneVar;
                                                        obj9 = obj4;
                                                        unsafe6 = unsafe7;
                                                    }
                                                    zza3 = zzkx.zzp(b, bArr, i59, i29, zzkwVar);
                                                    obj10 = obj3;
                                                    obj11 = obj12;
                                                    zzngVar2 = zzngVar;
                                                    zze = zzneVar;
                                                    obj9 = obj4;
                                                    unsafe6 = unsafe7;
                                                }
                                            }
                                            Object obj14 = obj11;
                                            Object obj15 = obj10;
                                            Unsafe unsafe8 = unsafe6;
                                            zzng zzngVar4 = zzngVar2;
                                            if (zza3 != i58) {
                                                throw new zzmr(str);
                                            }
                                            zzngVar4.put(obj15, obj14);
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
                                                zznpVar7 = this;
                                            } else {
                                                obj2 = obj;
                                                i30 = i3;
                                                i13 = i41;
                                                i8 = i58;
                                                i11 = i43;
                                                unsafe = unsafe8;
                                                zznpVar7 = this;
                                            }
                                        }
                                    }
                                } else {
                                    long j3 = i42;
                                    zzmo zzmoVar2 = (zzmo) unsafe5.getObject(obj7, j);
                                    if (zzmoVar2.zza()) {
                                        obj5 = "";
                                        zzmoVar = zzmoVar2;
                                    } else {
                                        int size = zzmoVar2.size();
                                        obj5 = "";
                                        zzmo zzg2 = zzmoVar2.zzg(size + size);
                                        unsafe5.putObject(obj7, j, zzg2);
                                        zzmoVar = zzg2;
                                    }
                                    switch (zzz) {
                                        case 18:
                                        case 35:
                                            zznpVar3 = this;
                                            i23 = i2;
                                            unsafe3 = unsafe5;
                                            i24 = i53;
                                            str2 = str;
                                            if (i40 != 2) {
                                                if (i40 == 1) {
                                                    i31 = i24 + 8;
                                                    int i62 = zzkx.zza;
                                                    zzlo zzloVar = (zzlo) zzmoVar;
                                                    zzloVar.zzf(Double.longBitsToDouble(zzkx.zze(bArr, i24)));
                                                    while (i31 < i23) {
                                                        int zza4 = zzkx.zza(bArr, i31, zzkwVar);
                                                        if (i41 == zzkwVar.zza) {
                                                            zzloVar.zzf(Double.longBitsToDouble(zzkx.zze(bArr, zza4)));
                                                            i31 = zza4 + 8;
                                                        }
                                                    }
                                                }
                                                str = str2;
                                                zznpVar4 = zznpVar3;
                                                i31 = i24;
                                                if (i31 == i24) {
                                                    i30 = i3;
                                                    obj2 = obj7;
                                                    i13 = i41;
                                                    i8 = i31;
                                                    zznpVar7 = zznpVar4;
                                                    i11 = i43;
                                                    unsafe = unsafe3;
                                                    break;
                                                } else {
                                                    i30 = i3;
                                                    i34 = i41;
                                                    i29 = i23;
                                                    zznpVar7 = zznpVar4;
                                                    i33 = i12;
                                                    i35 = i9;
                                                    i32 = i43;
                                                    i36 = i10;
                                                    unsafe5 = unsafe3;
                                                }
                                            } else {
                                                int i63 = zzkx.zza;
                                                zzlo zzloVar2 = (zzlo) zzmoVar;
                                                i31 = zzkx.zza(bArr, i24, zzkwVar);
                                                int i64 = zzkwVar.zza;
                                                int i65 = i31 + i64;
                                                if (i65 > bArr.length) {
                                                    throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                zzloVar2.zzh(zzloVar2.size() + (i64 / 8));
                                                while (i31 < i65) {
                                                    zzloVar2.zzf(Double.longBitsToDouble(zzkx.zze(bArr, i31)));
                                                    i31 += 8;
                                                }
                                                if (i31 != i65) {
                                                    throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            }
                                            str = str2;
                                            zznpVar4 = zznpVar3;
                                            if (i31 == i24) {
                                            }
                                        case 19:
                                        case 36:
                                            zznpVar3 = this;
                                            i23 = i2;
                                            unsafe3 = unsafe5;
                                            i24 = i53;
                                            str2 = str;
                                            if (i40 == 2) {
                                                int i66 = zzkx.zza;
                                                zzly zzlyVar = (zzly) zzmoVar;
                                                i31 = zzkx.zza(bArr, i24, zzkwVar);
                                                int i67 = zzkwVar.zza;
                                                int i68 = i31 + i67;
                                                if (i68 > bArr.length) {
                                                    throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                zzlyVar.zzh(zzlyVar.size() + (i67 / 4));
                                                while (i31 < i68) {
                                                    zzlyVar.zzf(Float.intBitsToFloat(zzkx.zzd(bArr, i31)));
                                                    i31 += 4;
                                                }
                                                if (i31 != i68) {
                                                    throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            } else {
                                                if (i40 == 5) {
                                                    i31 = i24 + 4;
                                                    int i69 = zzkx.zza;
                                                    zzly zzlyVar2 = (zzly) zzmoVar;
                                                    zzlyVar2.zzf(Float.intBitsToFloat(zzkx.zzd(bArr, i24)));
                                                    while (i31 < i23) {
                                                        int zza5 = zzkx.zza(bArr, i31, zzkwVar);
                                                        if (i41 == zzkwVar.zza) {
                                                            zzlyVar2.zzf(Float.intBitsToFloat(zzkx.zzd(bArr, zza5)));
                                                            i31 = zza5 + 4;
                                                        }
                                                    }
                                                }
                                                str = str2;
                                                zznpVar4 = zznpVar3;
                                                i31 = i24;
                                                if (i31 == i24) {
                                                }
                                            }
                                            str = str2;
                                            zznpVar4 = zznpVar3;
                                            if (i31 == i24) {
                                            }
                                            break;
                                        case 20:
                                        case 21:
                                        case 37:
                                        case 38:
                                            zznpVar3 = this;
                                            i23 = i2;
                                            unsafe3 = unsafe5;
                                            i24 = i53;
                                            str2 = str;
                                            if (i40 == 2) {
                                                int i70 = zzkx.zza;
                                                zzna zznaVar = (zzna) zzmoVar;
                                                i31 = zzkx.zza(bArr, i24, zzkwVar);
                                                int i71 = zzkwVar.zza + i31;
                                                while (i31 < i71) {
                                                    i31 = zzkx.zzc(bArr, i31, zzkwVar);
                                                    zznaVar.zzf(zzkwVar.zzb);
                                                }
                                                if (i31 != i71) {
                                                    throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            } else {
                                                if (i40 == 0) {
                                                    int i72 = zzkx.zza;
                                                    zzna zznaVar2 = (zzna) zzmoVar;
                                                    i31 = zzkx.zzc(bArr, i24, zzkwVar);
                                                    zznaVar2.zzf(zzkwVar.zzb);
                                                    while (i31 < i23) {
                                                        int zza6 = zzkx.zza(bArr, i31, zzkwVar);
                                                        if (i41 == zzkwVar.zza) {
                                                            i31 = zzkx.zzc(bArr, zza6, zzkwVar);
                                                            zznaVar2.zzf(zzkwVar.zzb);
                                                        }
                                                    }
                                                }
                                                str = str2;
                                                zznpVar4 = zznpVar3;
                                                i31 = i24;
                                                if (i31 == i24) {
                                                }
                                            }
                                            str = str2;
                                            zznpVar4 = zznpVar3;
                                            if (i31 == i24) {
                                            }
                                            break;
                                        case 22:
                                        case 29:
                                        case 39:
                                        case 43:
                                            zznpVar3 = this;
                                            i23 = i2;
                                            unsafe3 = unsafe5;
                                            i24 = i53;
                                            str2 = str;
                                            if (i40 == 2) {
                                                i31 = zzkx.zzm(bArr, i24, zzmoVar, zzkwVar);
                                                str = str2;
                                                zznpVar4 = zznpVar3;
                                                if (i31 == i24) {
                                                }
                                            } else {
                                                if (i40 == 0) {
                                                    i31 = zzkx.zzl(i41, bArr, i24, i2, zzmoVar, zzkwVar);
                                                    str = str2;
                                                    zznpVar4 = zznpVar3;
                                                    if (i31 == i24) {
                                                    }
                                                }
                                                str = str2;
                                                zznpVar4 = zznpVar3;
                                                i31 = i24;
                                                if (i31 == i24) {
                                                }
                                            }
                                            break;
                                        case 23:
                                        case 32:
                                        case 40:
                                        case 46:
                                            zznpVar3 = this;
                                            i23 = i2;
                                            unsafe3 = unsafe5;
                                            i24 = i53;
                                            str2 = str;
                                            if (i40 == 2) {
                                                int i73 = zzkx.zza;
                                                zzna zznaVar3 = (zzna) zzmoVar;
                                                i31 = zzkx.zza(bArr, i24, zzkwVar);
                                                int i74 = zzkwVar.zza;
                                                int i75 = i31 + i74;
                                                if (i75 > bArr.length) {
                                                    throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                zznaVar3.zzh(zznaVar3.size() + (i74 / 8));
                                                while (i31 < i75) {
                                                    zznaVar3.zzf(zzkx.zze(bArr, i31));
                                                    i31 += 8;
                                                }
                                                if (i31 != i75) {
                                                    throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            } else {
                                                if (i40 == 1) {
                                                    i31 = i24 + 8;
                                                    int i76 = zzkx.zza;
                                                    zzna zznaVar4 = (zzna) zzmoVar;
                                                    zznaVar4.zzf(zzkx.zze(bArr, i24));
                                                    while (i31 < i23) {
                                                        int zza7 = zzkx.zza(bArr, i31, zzkwVar);
                                                        if (i41 == zzkwVar.zza) {
                                                            zznaVar4.zzf(zzkx.zze(bArr, zza7));
                                                            i31 = zza7 + 8;
                                                        }
                                                    }
                                                }
                                                str = str2;
                                                zznpVar4 = zznpVar3;
                                                i31 = i24;
                                                if (i31 == i24) {
                                                }
                                            }
                                            str = str2;
                                            zznpVar4 = zznpVar3;
                                            if (i31 == i24) {
                                            }
                                            break;
                                        case 24:
                                        case 31:
                                        case 41:
                                        case 45:
                                            zznpVar3 = this;
                                            i23 = i2;
                                            unsafe3 = unsafe5;
                                            i24 = i53;
                                            str2 = str;
                                            if (i40 == 2) {
                                                int i77 = zzkx.zza;
                                                zzmg zzmgVar = (zzmg) zzmoVar;
                                                i31 = zzkx.zza(bArr, i24, zzkwVar);
                                                int i78 = zzkwVar.zza;
                                                int i79 = i31 + i78;
                                                if (i79 > bArr.length) {
                                                    throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                zzmgVar.zzi(zzmgVar.size() + (i78 / 4));
                                                while (i31 < i79) {
                                                    zzmgVar.zzh(zzkx.zzd(bArr, i31));
                                                    i31 += 4;
                                                }
                                                if (i31 != i79) {
                                                    throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            } else {
                                                if (i40 == 5) {
                                                    i31 = i24 + 4;
                                                    int i80 = zzkx.zza;
                                                    zzmg zzmgVar2 = (zzmg) zzmoVar;
                                                    zzmgVar2.zzh(zzkx.zzd(bArr, i24));
                                                    while (i31 < i23) {
                                                        int zza8 = zzkx.zza(bArr, i31, zzkwVar);
                                                        if (i41 == zzkwVar.zza) {
                                                            zzmgVar2.zzh(zzkx.zzd(bArr, zza8));
                                                            i31 = zza8 + 4;
                                                        }
                                                    }
                                                }
                                                str = str2;
                                                zznpVar4 = zznpVar3;
                                                i31 = i24;
                                                if (i31 == i24) {
                                                }
                                            }
                                            str = str2;
                                            zznpVar4 = zznpVar3;
                                            if (i31 == i24) {
                                            }
                                            break;
                                        case 25:
                                        case 42:
                                            zznpVar3 = this;
                                            i23 = i2;
                                            unsafe3 = unsafe5;
                                            i24 = i53;
                                            str2 = str;
                                            if (i40 == 2) {
                                                int i81 = zzkx.zza;
                                                zzky zzkyVar = (zzky) zzmoVar;
                                                i31 = zzkx.zza(bArr, i24, zzkwVar);
                                                int i82 = zzkwVar.zza + i31;
                                                while (i31 < i82) {
                                                    i31 = zzkx.zzc(bArr, i31, zzkwVar);
                                                    zzkyVar.zzf(zzkwVar.zzb != 0);
                                                }
                                                if (i31 != i82) {
                                                    throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            } else {
                                                if (i40 == 0) {
                                                    int i83 = zzkx.zza;
                                                    zzky zzkyVar2 = (zzky) zzmoVar;
                                                    i31 = zzkx.zzc(bArr, i24, zzkwVar);
                                                    zzkyVar2.zzf(zzkwVar.zzb != 0);
                                                    while (i31 < i23) {
                                                        int zza9 = zzkx.zza(bArr, i31, zzkwVar);
                                                        if (i41 == zzkwVar.zza) {
                                                            i31 = zzkx.zzc(bArr, zza9, zzkwVar);
                                                            zzkyVar2.zzf(zzkwVar.zzb != 0);
                                                        }
                                                    }
                                                }
                                                str = str2;
                                                zznpVar4 = zznpVar3;
                                                i31 = i24;
                                                if (i31 == i24) {
                                                }
                                            }
                                            str = str2;
                                            zznpVar4 = zznpVar3;
                                            if (i31 == i24) {
                                            }
                                            break;
                                        case 26:
                                            zznpVar5 = this;
                                            i23 = i2;
                                            unsafe3 = unsafe5;
                                            i24 = i53;
                                            if (i40 == 2) {
                                                if ((j3 & 536870912) == 0) {
                                                    zza2 = zzkx.zza(bArr, i24, zzkwVar);
                                                    int i84 = zzkwVar.zza;
                                                    if (i84 < 0) {
                                                        throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i84 == 0) {
                                                        obj6 = obj5;
                                                        zzmoVar.add(obj6);
                                                    } else {
                                                        obj6 = obj5;
                                                        zzmoVar.add(new String(bArr, zza2, i84, zzmp.zza));
                                                        zza2 += i84;
                                                    }
                                                    while (zza2 < i23) {
                                                        int zza10 = zzkx.zza(bArr, zza2, zzkwVar);
                                                        if (i41 == zzkwVar.zza) {
                                                            zza2 = zzkx.zza(bArr, zza10, zzkwVar);
                                                            int i85 = zzkwVar.zza;
                                                            if (i85 < 0) {
                                                                throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            }
                                                            if (i85 == 0) {
                                                                zzmoVar.add(obj6);
                                                            } else {
                                                                zzmoVar.add(new String(bArr, zza2, i85, zzmp.zza));
                                                                zza2 += i85;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    Object obj16 = obj5;
                                                    zza2 = zzkx.zza(bArr, i24, zzkwVar);
                                                    int i86 = zzkwVar.zza;
                                                    if (i86 < 0) {
                                                        throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i86 == 0) {
                                                        zzmoVar.add(obj16);
                                                    } else {
                                                        int i87 = zza2 + i86;
                                                        if (!zzos.zza(bArr, zza2, i87)) {
                                                            throw new zzmr("Protocol message had invalid UTF-8.");
                                                        }
                                                        zzmoVar.add(new String(bArr, zza2, i86, zzmp.zza));
                                                        zza2 = i87;
                                                    }
                                                    while (zza2 < i23) {
                                                        int zza11 = zzkx.zza(bArr, zza2, zzkwVar);
                                                        if (i41 == zzkwVar.zza) {
                                                            zza2 = zzkx.zza(bArr, zza11, zzkwVar);
                                                            int i88 = zzkwVar.zza;
                                                            if (i88 < 0) {
                                                                throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            }
                                                            if (i88 == 0) {
                                                                zzmoVar.add(obj16);
                                                            } else {
                                                                int i89 = zza2 + i88;
                                                                if (!zzos.zza(bArr, zza2, i89)) {
                                                                    throw new zzmr("Protocol message had invalid UTF-8.");
                                                                }
                                                                zzmoVar.add(new String(bArr, zza2, i88, zzmp.zza));
                                                                zza2 = i89;
                                                            }
                                                        }
                                                    }
                                                }
                                                i31 = zza2;
                                                str = str;
                                                zznpVar4 = zznpVar5;
                                                if (i31 == i24) {
                                                }
                                            } else {
                                                str = str;
                                                zznpVar4 = zznpVar5;
                                                i31 = i24;
                                                if (i31 == i24) {
                                                }
                                            }
                                            break;
                                        case 27:
                                            zznpVar3 = this;
                                            i23 = i2;
                                            unsafe3 = unsafe5;
                                            i24 = i53;
                                            i25 = i43;
                                            if (i40 == 2) {
                                                zznpVar5 = zznpVar3;
                                                i43 = i25;
                                                i31 = zzkx.zzn(zznpVar3.zzp(i12), i41, bArr, i24, i2, zzmoVar, zzkwVar);
                                                i23 = i23;
                                                zznpVar4 = zznpVar5;
                                                if (i31 == i24) {
                                                }
                                            }
                                            i43 = i25;
                                            zznpVar4 = zznpVar3;
                                            i31 = i24;
                                            if (i31 == i24) {
                                            }
                                            break;
                                        case 28:
                                            zznpVar3 = this;
                                            i23 = i2;
                                            unsafe3 = unsafe5;
                                            i24 = i53;
                                            i25 = i43;
                                            if (i40 == 2) {
                                                int zza12 = zzkx.zza(bArr, i24, zzkwVar);
                                                int i90 = zzkwVar.zza;
                                                if (i90 < 0) {
                                                    throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i90 > bArr.length - zza12) {
                                                    throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                if (i90 == 0) {
                                                    zzmoVar.add(zzlh.zzb);
                                                } else {
                                                    zzmoVar.add(zzlh.zzh(bArr, zza12, i90));
                                                    zza12 += i90;
                                                }
                                                while (zza12 < i23) {
                                                    int zza13 = zzkx.zza(bArr, zza12, zzkwVar);
                                                    if (i41 == zzkwVar.zza) {
                                                        zza12 = zzkx.zza(bArr, zza13, zzkwVar);
                                                        int i91 = zzkwVar.zza;
                                                        if (i91 < 0) {
                                                            throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i91 > bArr.length - zza12) {
                                                            throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        }
                                                        if (i91 == 0) {
                                                            zzmoVar.add(zzlh.zzb);
                                                        } else {
                                                            zzmoVar.add(zzlh.zzh(bArr, zza12, i91));
                                                            zza12 += i91;
                                                        }
                                                    } else {
                                                        i31 = zza12;
                                                        i43 = i25;
                                                        zznpVar4 = zznpVar3;
                                                        if (i31 == i24) {
                                                        }
                                                    }
                                                }
                                                i31 = zza12;
                                                i43 = i25;
                                                zznpVar4 = zznpVar3;
                                                if (i31 == i24) {
                                                }
                                            }
                                            i43 = i25;
                                            zznpVar4 = zznpVar3;
                                            i31 = i24;
                                            if (i31 == i24) {
                                            }
                                            break;
                                        case 30:
                                        case 44:
                                            i23 = i2;
                                            i24 = i53;
                                            if (i40 == 2) {
                                                zzl = zzkx.zzm(bArr, i24, zzmoVar, zzkwVar);
                                                zznpVar6 = this;
                                            } else {
                                                if (i40 == 0) {
                                                    zznpVar6 = this;
                                                    zzl = zzkx.zzl(i41, bArr, i24, i2, zzmoVar, zzkwVar);
                                                }
                                                unsafe3 = unsafe5;
                                                zznpVar4 = this;
                                                i31 = i24;
                                                if (i31 == i24) {
                                                }
                                            }
                                            zzmk zzr3 = zznpVar6.zzr(i12);
                                            zzoi zzoiVar = zznpVar6.zzl;
                                            int i92 = zznz.zza;
                                            if (zzr3 == null) {
                                                i26 = zzl;
                                                unsafe3 = unsafe5;
                                                i27 = i43;
                                            } else if (zzmoVar instanceof RandomAccess) {
                                                int size2 = zzmoVar.size();
                                                i26 = zzl;
                                                Object obj17 = null;
                                                int i93 = 0;
                                                int i94 = 0;
                                                while (i93 < size2) {
                                                    int intValue = ((Integer) zzmoVar.get(i93)).intValue();
                                                    if (zzr3.zza(intValue)) {
                                                        if (i93 != i94) {
                                                            zzmoVar.set(i94, Integer.valueOf(intValue));
                                                        }
                                                        i94++;
                                                        unsafe4 = unsafe5;
                                                        i28 = i43;
                                                    } else {
                                                        unsafe4 = unsafe5;
                                                        i28 = i43;
                                                        obj17 = zznz.zzE(obj7, i28, intValue, obj17, zzoiVar);
                                                    }
                                                    i93++;
                                                    i43 = i28;
                                                    unsafe5 = unsafe4;
                                                }
                                                unsafe3 = unsafe5;
                                                i27 = i43;
                                                if (i94 != size2) {
                                                    zzmoVar.subList(i94, size2).clear();
                                                }
                                            } else {
                                                i26 = zzl;
                                                unsafe3 = unsafe5;
                                                i27 = i43;
                                                Iterator it = zzmoVar.iterator();
                                                Object obj18 = null;
                                                while (it.hasNext()) {
                                                    int intValue2 = ((Integer) it.next()).intValue();
                                                    if (!zzr3.zza(intValue2)) {
                                                        obj18 = zznz.zzE(obj7, i27, intValue2, obj18, zzoiVar);
                                                        it.remove();
                                                    }
                                                }
                                            }
                                            i43 = i27;
                                            i31 = i26;
                                            zznpVar4 = this;
                                            if (i31 == i24) {
                                            }
                                            break;
                                        case 33:
                                        case 47:
                                            i23 = i2;
                                            i24 = i53;
                                            if (i40 == 2) {
                                                int i95 = zzkx.zza;
                                                zzmg zzmgVar3 = (zzmg) zzmoVar;
                                                i31 = zzkx.zza(bArr, i24, zzkwVar);
                                                int i96 = zzkwVar.zza + i31;
                                                while (i31 < i96) {
                                                    i31 = zzkx.zza(bArr, i31, zzkwVar);
                                                    zzmgVar3.zzh(zzlj.zzb(zzkwVar.zza));
                                                }
                                                if (i31 != i96) {
                                                    throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                            } else {
                                                if (i40 == 0) {
                                                    int i97 = zzkx.zza;
                                                    zzmg zzmgVar4 = (zzmg) zzmoVar;
                                                    i31 = zzkx.zza(bArr, i24, zzkwVar);
                                                    zzmgVar4.zzh(zzlj.zzb(zzkwVar.zza));
                                                    while (i31 < i23) {
                                                        int zza14 = zzkx.zza(bArr, i31, zzkwVar);
                                                        if (i41 == zzkwVar.zza) {
                                                            i31 = zzkx.zza(bArr, zza14, zzkwVar);
                                                            zzmgVar4.zzh(zzlj.zzb(zzkwVar.zza));
                                                        }
                                                    }
                                                }
                                                unsafe3 = unsafe5;
                                                zznpVar4 = this;
                                                i31 = i24;
                                                if (i31 == i24) {
                                                }
                                            }
                                            unsafe3 = unsafe5;
                                            zznpVar4 = this;
                                            if (i31 == i24) {
                                            }
                                            break;
                                        case 34:
                                        case 48:
                                            if (i40 == 2) {
                                                int i98 = zzkx.zza;
                                                zzna zznaVar5 = (zzna) zzmoVar;
                                                i24 = i53;
                                                i31 = zzkx.zza(bArr, i24, zzkwVar);
                                                int i99 = zzkwVar.zza + i31;
                                                while (i31 < i99) {
                                                    i31 = zzkx.zzc(bArr, i31, zzkwVar);
                                                    zznaVar5.zzf(zzlj.zzc(zzkwVar.zzb));
                                                }
                                                if (i31 != i99) {
                                                    throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                i23 = i2;
                                            } else {
                                                i24 = i53;
                                                if (i40 == 0) {
                                                    int i100 = zzkx.zza;
                                                    zzna zznaVar6 = (zzna) zzmoVar;
                                                    i31 = zzkx.zzc(bArr, i24, zzkwVar);
                                                    zznaVar6.zzf(zzlj.zzc(zzkwVar.zzb));
                                                    i23 = i2;
                                                    while (i31 < i23) {
                                                        int zza15 = zzkx.zza(bArr, i31, zzkwVar);
                                                        if (i41 == zzkwVar.zza) {
                                                            i31 = zzkx.zzc(bArr, zza15, zzkwVar);
                                                            zznaVar6.zzf(zzlj.zzc(zzkwVar.zzb));
                                                        }
                                                    }
                                                } else {
                                                    i23 = i2;
                                                    unsafe3 = unsafe5;
                                                    zznpVar4 = this;
                                                    i31 = i24;
                                                    if (i31 == i24) {
                                                    }
                                                }
                                            }
                                            unsafe3 = unsafe5;
                                            zznpVar4 = this;
                                            if (i31 == i24) {
                                            }
                                            break;
                                        default:
                                            zznpVar3 = this;
                                            i23 = i2;
                                            unsafe3 = unsafe5;
                                            i24 = i53;
                                            str2 = str;
                                            if (i40 == 3) {
                                                int i101 = (i41 & (-8)) | 4;
                                                zznx zzp = zznpVar3.zzp(i12);
                                                str = str2;
                                                zznpVar4 = zznpVar3;
                                                i31 = zzkx.zzi(zzp, bArr, i24, i2, i101, zzkwVar);
                                                zzmoVar.add(zzkwVar.zzc);
                                                while (i31 < i23) {
                                                    int zza16 = zzkx.zza(bArr, i31, zzkwVar);
                                                    if (i41 == zzkwVar.zza) {
                                                        i31 = zzkx.zzi(zzp, bArr, zza16, i2, i101, zzkwVar);
                                                        zzmoVar.add(zzkwVar.zzc);
                                                    } else if (i31 == i24) {
                                                    }
                                                }
                                                if (i31 == i24) {
                                                }
                                            }
                                            str = str2;
                                            zznpVar4 = zznpVar3;
                                            i31 = i24;
                                            if (i31 == i24) {
                                            }
                                            break;
                                    }
                                }
                            } else if (i40 == 2) {
                                zzmo zzmoVar3 = (zzmo) unsafe5.getObject(obj7, j);
                                if (!zzmoVar3.zza()) {
                                    int size3 = zzmoVar3.size();
                                    zzmoVar3 = zzmoVar3.zzg(size3 == 0 ? 10 : size3 + size3);
                                    unsafe5.putObject(obj7, j, zzmoVar3);
                                }
                                i31 = zzkx.zzn(zznpVar8.zzp(i12), i41, bArr, i53, i2, zzmoVar3, zzkwVar);
                                i30 = i3;
                                i34 = i41;
                                zznpVar7 = zznpVar8;
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
                            zznpVar7 = this;
                            i30 = i3;
                        }
                        i29 = i2;
                    }
                    if (i13 == i30 || i30 == 0) {
                        if (zznpVar7.zzh) {
                            zzlr zzlrVar = zzkwVar.zzd;
                            int i102 = zzlr.zzb;
                            int i103 = zznu.zza;
                            if (zzlrVar != zzlr.zza) {
                                zznm zznmVar = zznpVar7.zzg;
                                int i104 = zzkx.zza;
                                if (zzlrVar.zzb(zznmVar, i11) != null) {
                                    throw null;
                                }
                                i31 = zzkx.zzo(i13, bArr, i8, i2, zzg(obj), zzkwVar);
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
                        i31 = zzkx.zzo(i13, bArr, i8, i2, zzg(obj), zzkwVar);
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
                    i7 = zznpVar7.zzN(i39, 0);
                }
                i6 = -1;
                if (i7 != i6) {
                }
                if (i13 == i30) {
                }
                if (zznpVar7.zzh) {
                }
                i31 = zzkx.zzo(i13, bArr, i8, i2, zzg(obj), zzkwVar);
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

    @Override // com.google.android.gms.internal.measurement.zznx
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzkw zzkwVar) throws IOException {
        zzh(obj, bArr, i, i2, 0, zzkwVar);
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final void zzj(Object obj) {
        if (zzA(obj)) {
            if (obj instanceof zzmf) {
                zzmf zzmfVar = (zzmf) obj;
                zzmfVar.zzcm(Integer.MAX_VALUE);
                zzmfVar.zza = 0;
                zzmfVar.zzcg();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int zzx = zzx(i);
                int i2 = 1048575 & zzx;
                int zzz = zzz(zzx);
                long j = i2;
                if (zzz != 9) {
                    if (zzz != 60 && zzz != 68) {
                        switch (zzz) {
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
                                ((zzmo) zzop.zzn(obj, j)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzng) object).zzd();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzL(obj, iArr[i], i)) {
                        zzp(i).zzj(zzb.getObject(obj, j));
                    }
                }
                if (zzJ(obj, i)) {
                    zzp(i).zzj(zzb.getObject(obj, j));
                }
            }
            this.zzl.zzb(obj);
            if (this.zzh) {
                this.zzm.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznx
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
            int zzx = zzx(i6);
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
            if ((268435456 & zzx) != 0 && !zzI(obj, i6, i, i2, i10)) {
                return false;
            }
            int zzz = zzz(zzx);
            if (zzz != 9 && zzz != 17) {
                if (zzz != 27) {
                    if (zzz == 60 || zzz == 68) {
                        if (zzL(obj, i7, i6) && !zzw(obj, zzx, zzp(i6))) {
                            return false;
                        }
                    } else if (zzz != 49) {
                        if (zzz != 50) {
                            continue;
                        } else {
                            zzng zzngVar = (zzng) zzop.zzn(obj, zzx & 1048575);
                            if (!zzngVar.isEmpty() && ((zznf) zzq(i6)).zze().zzc.zza() == zzou.MESSAGE) {
                                zznx zznxVar = null;
                                for (Object obj2 : zzngVar.values()) {
                                    if (zznxVar == null) {
                                        zznxVar = zznu.zza().zzb(obj2.getClass());
                                    }
                                    if (!zznxVar.zzk(obj2)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
                List list = (List) zzop.zzn(obj, zzx & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zznx zzp = zzp(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzp.zzk(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (zzI(obj, i6, i, i2, i10) && !zzw(obj, zzx, zzp(i6))) {
                return false;
            }
            i4++;
            i5 = i;
            i3 = i2;
        }
        return !this.zzh || ((zzmc) obj).zzb.zze();
    }
}
