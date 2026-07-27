package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
final class zzigz<T> implements zziho<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zziih.zzn();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzigw zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zziia zzm;
    private final zziex zzn;

    private zzigz(int[] iArr, Object[] objArr, int i, int i2, zzigw zzigwVar, boolean z, int[] iArr2, int i3, int i4, zzihc zzihcVar, zzigi zzigiVar, zziia zziiaVar, zziex zziexVar, zzigr zzigrVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzigwVar instanceof zzifm;
        boolean z2 = false;
        if (zziexVar != null && (zzigwVar instanceof zzifi)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzm = zziiaVar;
        this.zzn = zziexVar;
        this.zzg = zzigwVar;
    }

    private final int zzA(int i) {
        return this.zzc[i + 1];
    }

    private final int zzB(int i) {
        return this.zzc[i + 2];
    }

    private static int zzC(int i) {
        return (i >>> 20) & 255;
    }

    private static boolean zzD(int i) {
        return (i & 536870912) != 0;
    }

    private static boolean zzE(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzifm) {
            return ((zzifm) obj).zzaX();
        }
        return true;
    }

    private static void zzF(Object obj) {
        if (zzE(obj)) {
            return;
        }
        String valueOf = String.valueOf(obj);
        String.valueOf(valueOf);
        throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(valueOf)));
    }

    private static int zzG(Object obj, long j) {
        return ((Integer) zziih.zzl(obj, j)).intValue();
    }

    private static long zzH(Object obj, long j) {
        return ((Long) zziih.zzl(obj, j)).longValue();
    }

    private final boolean zzI(Object obj, Object obj2, int i) {
        return zzK(obj, i) == zzK(obj2, i);
    }

    private final boolean zzJ(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzK(obj, i) : (i3 & i4) != 0;
    }

    private final boolean zzK(Object obj, int i) {
        int zzB = zzB(i);
        long j = zzB & 1048575;
        if (j != 1048575) {
            return (zziih.zzb(obj, j) & (1 << (zzB >>> 20))) != 0;
        }
        int zzA = zzA(i);
        long j2 = zzA & 1048575;
        switch (zzC(zzA)) {
            case 0:
                return Double.doubleToRawLongBits(zziih.zzj(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zziih.zzh(obj, j2)) != 0;
            case 2:
                return zziih.zzd(obj, j2) != 0;
            case 3:
                return zziih.zzd(obj, j2) != 0;
            case 4:
                return zziih.zzb(obj, j2) != 0;
            case 5:
                return zziih.zzd(obj, j2) != 0;
            case 6:
                return zziih.zzb(obj, j2) != 0;
            case 7:
                return zziih.zzf(obj, j2);
            case 8:
                Object zzl = zziih.zzl(obj, j2);
                return zzl instanceof String ? !((String) zzl).isEmpty() : zzl instanceof zziei ? !zziei.zza.equals(zzl) : zzR();
            case 9:
                return zziih.zzl(obj, j2) != null;
            case 10:
                return !zziei.zza.equals(zziih.zzl(obj, j2));
            case 11:
                return zziih.zzb(obj, j2) != 0;
            case 12:
                return zziih.zzb(obj, j2) != 0;
            case 13:
                return zziih.zzb(obj, j2) != 0;
            case 14:
                return zziih.zzd(obj, j2) != 0;
            case 15:
                return zziih.zzb(obj, j2) != 0;
            case 16:
                return zziih.zzd(obj, j2) != 0;
            case 17:
                return zziih.zzl(obj, j2) != null;
            default:
                return zzR();
        }
    }

    private final void zzL(Object obj, int i) {
        int zzB = zzB(i);
        long j = 1048575 & zzB;
        if (j == 1048575) {
            return;
        }
        zziih.zzc(obj, j, (1 << (zzB >>> 20)) | zziih.zzb(obj, j));
    }

    private final boolean zzM(Object obj, int i, int i2) {
        return zziih.zzb(obj, (long) (zzB(i2) & 1048575)) == i;
    }

    private final boolean zzN(Object obj, Object obj2, int i) {
        long zzB = zzB(i) & 1048575;
        return zziih.zzb(obj, zzB) == zziih.zzb(obj2, zzB);
    }

    private final void zzO(Object obj, int i, int i2) {
        zziih.zzc(obj, zzB(i2) & 1048575, i);
    }

    private final int zzP(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzQ(i, 0);
    }

    private final int zzQ(int i, int i2) {
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

    private boolean zzR() {
        throw new IllegalArgumentException();
    }

    private static final int zzS(byte[] bArr, int i, int i2, zziin zziinVar, Class cls, zzidw zzidwVar) throws IOException {
        int i3;
        zziin zziinVar2 = zziin.DOUBLE;
        switch (zziinVar) {
            case DOUBLE:
                i3 = i + 8;
                zzidwVar.zzc = Double.valueOf(Double.longBitsToDouble(zzidx.zze(bArr, i)));
                break;
            case FLOAT:
                i3 = i + 4;
                zzidwVar.zzc = Float.valueOf(Float.intBitsToFloat(zzidx.zzd(bArr, i)));
                break;
            case INT64:
            case UINT64:
                int zzc = zzidx.zzc(bArr, i, zzidwVar);
                zzidwVar.zzc = Long.valueOf(zzidwVar.zzb);
                return zzc;
            case INT32:
            case UINT32:
            case ENUM:
                int zza2 = zzidx.zza(bArr, i, zzidwVar);
                zzidwVar.zzc = Integer.valueOf(zzidwVar.zza);
                return zza2;
            case FIXED64:
            case SFIXED64:
                i3 = i + 8;
                zzidwVar.zzc = Long.valueOf(zzidx.zze(bArr, i));
                break;
            case FIXED32:
            case SFIXED32:
                i3 = i + 4;
                zzidwVar.zzc = Integer.valueOf(zzidx.zzd(bArr, i));
                break;
            case BOOL:
                int zzc2 = zzidx.zzc(bArr, i, zzidwVar);
                zzidwVar.zzc = Boolean.valueOf(zzidwVar.zzb != 0);
                return zzc2;
            case STRING:
                return zzidx.zzf(bArr, i, zzidwVar);
            case GROUP:
            default:
                throw new RuntimeException("unsupported field type.");
            case MESSAGE:
                return zzidx.zzh(zzihg.zza().zzb(cls), bArr, i, i2, zzidwVar);
            case BYTES:
                return zzidx.zzg(bArr, i, zzidwVar);
            case SINT32:
                int zza3 = zzidx.zza(bArr, i, zzidwVar);
                zzidwVar.zzc = Integer.valueOf(zziem.zzM(zzidwVar.zza));
                return zza3;
            case SINT64:
                int zzc3 = zzidx.zzc(bArr, i, zzidwVar);
                zzidwVar.zzc = Long.valueOf(zziem.zzN(zzidwVar.zzb));
                return zzc3;
        }
        return i3;
    }

    private static final void zzT(int i, Object obj, zziip zziipVar) throws IOException {
        if (obj instanceof String) {
            zziipVar.zzm(i, (String) obj);
        } else {
            zziipVar.zzn(i, (zziei) obj);
        }
    }

    static zziib zzh(Object obj) {
        zzifm zzifmVar = (zzifm) obj;
        zziib zziibVar = zzifmVar.zzt;
        if (zziibVar != zziib.zza()) {
            return zziibVar;
        }
        zziib zzb2 = zziib.zzb();
        zzifmVar.zzt = zzb2;
        return zzb2;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0259  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzigz zzm(Class cls, zzigt zzigtVar, zzihc zzihcVar, zzigi zzigiVar, zziia zziiaVar, zziex zziexVar, zzigr zzigrVar) {
        int i;
        int charAt;
        int charAt2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr;
        int i7;
        char charAt3;
        int i8;
        int i9;
        char charAt4;
        int i10;
        char charAt5;
        int i11;
        char charAt6;
        int i12;
        char charAt7;
        int i13;
        char charAt8;
        int i14;
        char charAt9;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        zzihi zzihiVar;
        String str;
        int objectFieldOffset;
        int i20;
        int i21;
        int i22;
        Field zzn;
        int i23;
        char charAt10;
        int i24;
        int i25;
        int i26;
        int i27;
        Object obj;
        Field zzn2;
        Object obj2;
        Field zzn3;
        int i28;
        char charAt11;
        int i29;
        char charAt12;
        int i30;
        char charAt13;
        int i31;
        char charAt14;
        if (!(zzigtVar instanceof zzihi)) {
            throw null;
        }
        zzihi zzihiVar2 = (zzihi) zzigtVar;
        String zzd = zzihiVar2.zzd();
        int length = zzd.length();
        char c = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i32 = 1;
            while (true) {
                i = i32 + 1;
                if (zzd.charAt(i32) < 55296) {
                    break;
                }
                i32 = i;
            }
        } else {
            i = 1;
        }
        int i33 = i + 1;
        int charAt15 = zzd.charAt(i);
        if (charAt15 >= 55296) {
            int i34 = charAt15 & 8191;
            int i35 = 13;
            while (true) {
                i31 = i33 + 1;
                charAt14 = zzd.charAt(i33);
                if (charAt14 < 55296) {
                    break;
                }
                i34 |= (charAt14 & 8191) << i35;
                i35 += 13;
                i33 = i31;
            }
            charAt15 = i34 | (charAt14 << i35);
            i33 = i31;
        }
        if (charAt15 == 0) {
            i6 = 0;
            charAt = 0;
            charAt2 = 0;
            i5 = 0;
            i3 = 0;
            i2 = 0;
            iArr = zza;
            i4 = 0;
        } else {
            int i36 = i33 + 1;
            int charAt16 = zzd.charAt(i33);
            if (charAt16 >= 55296) {
                int i37 = charAt16 & 8191;
                int i38 = 13;
                while (true) {
                    i14 = i36 + 1;
                    charAt9 = zzd.charAt(i36);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i37 |= (charAt9 & 8191) << i38;
                    i38 += 13;
                    i36 = i14;
                }
                charAt16 = i37 | (charAt9 << i38);
                i36 = i14;
            }
            int i39 = i36 + 1;
            int charAt17 = zzd.charAt(i36);
            if (charAt17 >= 55296) {
                int i40 = charAt17 & 8191;
                int i41 = 13;
                while (true) {
                    i13 = i39 + 1;
                    charAt8 = zzd.charAt(i39);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i40 |= (charAt8 & 8191) << i41;
                    i41 += 13;
                    i39 = i13;
                }
                charAt17 = i40 | (charAt8 << i41);
                i39 = i13;
            }
            int i42 = i39 + 1;
            int charAt18 = zzd.charAt(i39);
            if (charAt18 >= 55296) {
                int i43 = charAt18 & 8191;
                int i44 = 13;
                while (true) {
                    i12 = i42 + 1;
                    charAt7 = zzd.charAt(i42);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i43 |= (charAt7 & 8191) << i44;
                    i44 += 13;
                    i42 = i12;
                }
                charAt18 = i43 | (charAt7 << i44);
                i42 = i12;
            }
            int i45 = i42 + 1;
            int charAt19 = zzd.charAt(i42);
            if (charAt19 >= 55296) {
                int i46 = charAt19 & 8191;
                int i47 = 13;
                while (true) {
                    i11 = i45 + 1;
                    charAt6 = zzd.charAt(i45);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i46 |= (charAt6 & 8191) << i47;
                    i47 += 13;
                    i45 = i11;
                }
                charAt19 = i46 | (charAt6 << i47);
                i45 = i11;
            }
            int i48 = i45 + 1;
            charAt = zzd.charAt(i45);
            if (charAt >= 55296) {
                int i49 = charAt & 8191;
                int i50 = 13;
                while (true) {
                    i10 = i48 + 1;
                    charAt5 = zzd.charAt(i48);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i49 |= (charAt5 & 8191) << i50;
                    i50 += 13;
                    i48 = i10;
                }
                charAt = i49 | (charAt5 << i50);
                i48 = i10;
            }
            int i51 = i48 + 1;
            charAt2 = zzd.charAt(i48);
            if (charAt2 >= 55296) {
                int i52 = charAt2 & 8191;
                int i53 = 13;
                while (true) {
                    i9 = i51 + 1;
                    charAt4 = zzd.charAt(i51);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i52 |= (charAt4 & 8191) << i53;
                    i53 += 13;
                    i51 = i9;
                }
                charAt2 = i52 | (charAt4 << i53);
                i51 = i9;
            }
            int i54 = i51 + 1;
            if (zzd.charAt(i51) >= 55296) {
                while (true) {
                    i8 = i54 + 1;
                    if (zzd.charAt(i54) < 55296) {
                        break;
                    }
                    i54 = i8;
                }
                i54 = i8;
            }
            int i55 = i54 + 1;
            int charAt20 = zzd.charAt(i54);
            if (charAt20 >= 55296) {
                int i56 = charAt20 & 8191;
                int i57 = 13;
                while (true) {
                    i7 = i55 + 1;
                    charAt3 = zzd.charAt(i55);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i56 |= (charAt3 & 8191) << i57;
                    i57 += 13;
                    i55 = i7;
                }
                charAt20 = i56 | (charAt3 << i57);
                i55 = i7;
            }
            int i58 = charAt16 + charAt16 + charAt17;
            int[] iArr2 = new int[charAt20 + charAt2 + charAt16];
            i2 = charAt20;
            i3 = charAt19;
            i4 = charAt16;
            i33 = i55;
            i5 = charAt18;
            i6 = i58;
            iArr = iArr2;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzihiVar2.zze();
        Class<?> cls2 = zzihiVar2.zzb().getClass();
        int i59 = i2 + charAt2;
        int i60 = charAt + charAt;
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr = new Object[i60];
        int i61 = i2;
        int i62 = i59;
        int i63 = 0;
        int i64 = 0;
        while (i33 < length) {
            int i65 = i33 + 1;
            int charAt21 = zzd.charAt(i33);
            if (charAt21 >= c) {
                int i66 = charAt21 & 8191;
                int i67 = i65;
                int i68 = 13;
                while (true) {
                    i30 = i67 + 1;
                    charAt13 = zzd.charAt(i67);
                    if (charAt13 < c) {
                        break;
                    }
                    i66 |= (charAt13 & 8191) << i68;
                    i68 += 13;
                    i67 = i30;
                }
                charAt21 = i66 | (charAt13 << i68);
                i15 = i30;
            } else {
                i15 = i65;
            }
            int i69 = i15 + 1;
            int charAt22 = zzd.charAt(i15);
            if (charAt22 >= c) {
                int i70 = charAt22 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i29 = i71 + 1;
                    charAt12 = zzd.charAt(i71);
                    if (charAt12 < c) {
                        break;
                    }
                    i70 |= (charAt12 & 8191) << i72;
                    i72 += 13;
                    i71 = i29;
                }
                charAt22 = i70 | (charAt12 << i72);
                i16 = i29;
            } else {
                i16 = i69;
            }
            if ((charAt22 & 1024) != 0) {
                iArr[i63] = i64;
                i63++;
            }
            int i73 = charAt22 & 255;
            int i74 = length;
            int i75 = charAt22 & 2048;
            int i76 = i3;
            if (i73 >= 51) {
                int i77 = i16 + 1;
                int charAt23 = zzd.charAt(i16);
                if (charAt23 >= 55296) {
                    int i78 = charAt23 & 8191;
                    int i79 = i77;
                    int i80 = 13;
                    while (true) {
                        i28 = i79 + 1;
                        charAt11 = zzd.charAt(i79);
                        i17 = i5;
                        if (charAt11 < 55296) {
                            break;
                        }
                        i78 |= (charAt11 & 8191) << i80;
                        i80 += 13;
                        i79 = i28;
                        i5 = i17;
                    }
                    charAt23 = i78 | (charAt11 << i80);
                    i26 = i28;
                } else {
                    i17 = i5;
                    i26 = i77;
                }
                int i81 = i73 - 51;
                int i82 = i26;
                if (i81 == 9 || i81 == 17) {
                    i27 = i6 + 1;
                    int i83 = i64 / 3;
                    objArr[i83 + i83 + 1] = zze[i6];
                } else {
                    if (i81 == 12) {
                        if (zzihiVar2.zzc() == 1 || i75 != 0) {
                            i27 = i6 + 1;
                            int i84 = i64 / 3;
                            objArr[i84 + i84 + 1] = zze[i6];
                        } else {
                            i75 = 0;
                        }
                    }
                    int i85 = charAt23 + charAt23;
                    obj = zze[i85];
                    if (obj instanceof Field) {
                        zzn2 = zzn(cls2, (String) obj);
                        zze[i85] = zzn2;
                        iArr[i62] = i64;
                        i62++;
                    } else {
                        zzn2 = (Field) obj;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzn2);
                    int i86 = i85 + 1;
                    obj2 = zze[i86];
                    int i87 = i75;
                    if (obj2 instanceof Field) {
                        zzn3 = zzn(cls2, (String) obj2);
                        zze[i86] = zzn3;
                    } else {
                        zzn3 = (Field) obj2;
                    }
                    i21 = objectFieldOffset2;
                    i18 = i6;
                    i75 = i87;
                    zzihiVar = zzihiVar2;
                    i20 = (int) unsafe.objectFieldOffset(zzn3);
                    i16 = i82;
                    i22 = 0;
                    i19 = charAt21;
                    str = zzd;
                }
                i6 = i27;
                int i852 = charAt23 + charAt23;
                obj = zze[i852];
                if (obj instanceof Field) {
                }
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zzn2);
                int i862 = i852 + 1;
                obj2 = zze[i862];
                int i872 = i75;
                if (obj2 instanceof Field) {
                }
                i21 = objectFieldOffset22;
                i18 = i6;
                i75 = i872;
                zzihiVar = zzihiVar2;
                i20 = (int) unsafe.objectFieldOffset(zzn3);
                i16 = i82;
                i22 = 0;
                i19 = charAt21;
                str = zzd;
            } else {
                i17 = i5;
                i18 = i6 + 1;
                Field zzn4 = zzn(cls2, (String) zze[i6]);
                i19 = charAt21;
                if (i73 == 9 || i73 == 17) {
                    zzihiVar = zzihiVar2;
                    int i88 = i64 / 3;
                    objArr[i88 + i88 + 1] = zzn4.getType();
                } else {
                    if (i73 == 27) {
                        zzihiVar = zzihiVar2;
                        i24 = 1;
                        i25 = i6 + 2;
                    } else if (i73 == 49) {
                        i25 = i6 + 2;
                        zzihiVar = zzihiVar2;
                        i24 = 1;
                    } else {
                        if (i73 == 12 || i73 == 30 || i73 == 44) {
                            zzihiVar = zzihiVar2;
                            if (zzihiVar2.zzc() == 1 || i75 != 0) {
                                i25 = i6 + 2;
                                int i89 = i64 / 3;
                                objArr[i89 + i89 + 1] = zze[i18];
                                str = zzd;
                                i18 = i25;
                            } else {
                                str = zzd;
                                i75 = 0;
                            }
                        } else if (i73 == 50) {
                            int i90 = i6 + 2;
                            int i91 = i61 + 1;
                            iArr[i61] = i64;
                            int i92 = i64 / 3;
                            int i93 = i92 + i92;
                            objArr[i93] = zze[i18];
                            if (i75 != 0) {
                                i18 = i6 + 3;
                                objArr[i93 + 1] = zze[i90];
                                str = zzd;
                                i61 = i91;
                                zzihiVar = zzihiVar2;
                            } else {
                                i18 = i90;
                                i61 = i91;
                                i75 = 0;
                                zzihiVar = zzihiVar2;
                            }
                        } else {
                            zzihiVar = zzihiVar2;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(zzn4);
                        i20 = 1048575;
                        if ((charAt22 & 4096) != 0 || i73 > 17) {
                            i21 = objectFieldOffset;
                            i22 = 0;
                        } else {
                            int i94 = i16 + 1;
                            int charAt24 = str.charAt(i16);
                            if (charAt24 >= 55296) {
                                int i95 = charAt24 & 8191;
                                int i96 = 13;
                                while (true) {
                                    i23 = i94 + 1;
                                    charAt10 = str.charAt(i94);
                                    if (charAt10 < 55296) {
                                        break;
                                    }
                                    i95 |= (charAt10 & 8191) << i96;
                                    i96 += 13;
                                    i94 = i23;
                                }
                                charAt24 = i95 | (charAt10 << i96);
                                i94 = i23;
                            }
                            int i97 = i4 + i4 + (charAt24 / 32);
                            Object obj3 = zze[i97];
                            i21 = objectFieldOffset;
                            if (obj3 instanceof Field) {
                                zzn = (Field) obj3;
                            } else {
                                zzn = zzn(cls2, (String) obj3);
                                zze[i97] = zzn;
                            }
                            i20 = (int) unsafe.objectFieldOffset(zzn);
                            i22 = charAt24 % 32;
                            i16 = i94;
                        }
                    }
                    int i98 = i64 / 3;
                    objArr[i98 + i98 + i24] = zze[i18];
                    str = zzd;
                    i18 = i25;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzn4);
                    i20 = 1048575;
                    if ((charAt22 & 4096) != 0) {
                    }
                    i21 = objectFieldOffset;
                    i22 = 0;
                }
                str = zzd;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzn4);
                i20 = 1048575;
                if ((charAt22 & 4096) != 0) {
                }
                i21 = objectFieldOffset;
                i22 = 0;
            }
            int i99 = i64 + 1;
            iArr3[i64] = i19;
            int i100 = i64 + 2;
            Class<?> cls3 = cls2;
            iArr3[i99] = (i75 != 0 ? Integer.MIN_VALUE : 0) | ((charAt22 & 512) != 0 ? 536870912 : 0) | ((charAt22 & 256) != 0 ? 268435456 : 0) | (i73 << 20) | i21;
            i64 += 3;
            iArr3[i100] = (i22 << 20) | i20;
            zzd = str;
            i33 = i16;
            i6 = i18;
            length = i74;
            i3 = i76;
            cls2 = cls3;
            zzihiVar2 = zzihiVar;
            i5 = i17;
            c = 55296;
        }
        return new zzigz(iArr3, objArr, i5, i3, zzihiVar2.zzb(), false, iArr, i2, i59, zzihcVar, zzigiVar, zziiaVar, zziexVar, zzigrVar);
    }

    private static Field zzn(Class cls, String str) {
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

    private final void zzo(Object obj, Object obj2, int i) {
        if (zzK(obj2, i)) {
            int zzA = zzA(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzA;
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
            zziho zzq = zzq(i);
            if (!zzK(obj, i)) {
                if (zzE(object)) {
                    Object zza2 = zzq.zza();
                    zzq.zzd(zza2, object);
                    unsafe.putObject(obj, j, zza2);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzL(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzE(object2)) {
                Object zza3 = zzq.zza();
                zzq.zzd(zza3, object2);
                unsafe.putObject(obj, j, zza3);
                object2 = zza3;
            }
            zzq.zzd(object2, object);
        }
    }

    private final void zzp(Object obj, Object obj2, int i) {
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        if (zzM(obj2, i2, i)) {
            int zzA = zzA(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzA;
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
            zziho zzq = zzq(i);
            if (!zzM(obj, i2, i)) {
                if (zzE(object)) {
                    Object zza2 = zzq.zza();
                    zzq.zzd(zza2, object);
                    unsafe.putObject(obj, j, zza2);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzO(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzE(object2)) {
                Object zza3 = zzq.zza();
                zzq.zzd(zza3, object2);
                unsafe.putObject(obj, j, zza3);
                object2 = zza3;
            }
            zzq.zzd(object2, object);
        }
    }

    private final zziho zzq(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zziho zzihoVar = (zziho) objArr[i3];
        if (zzihoVar != null) {
            return zzihoVar;
        }
        zziho zzb2 = zzihg.zza().zzb((Class) objArr[i3 + 1]);
        objArr[i3] = zzb2;
        return zzb2;
    }

    private final Object zzr(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final zzifs zzs(int i) {
        int i2 = i / 3;
        return (zzifs) this.zzd[i2 + i2 + 1];
    }

    private final Object zzt(Object obj, int i) {
        zziho zzq = zzq(i);
        int zzA = zzA(i) & 1048575;
        if (!zzK(obj, i)) {
            return zzq.zza();
        }
        Object object = zzb.getObject(obj, zzA);
        if (zzE(object)) {
            return object;
        }
        Object zza2 = zzq.zza();
        if (object != null) {
            zzq.zzd(zza2, object);
        }
        return zza2;
    }

    private final void zzu(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzA(i) & 1048575, obj2);
        zzL(obj, i);
    }

    private final Object zzv(Object obj, int i, int i2) {
        zziho zzq = zzq(i2);
        if (!zzM(obj, i, i2)) {
            return zzq.zza();
        }
        Object object = zzb.getObject(obj, zzA(i2) & 1048575);
        if (zzE(object)) {
            return object;
        }
        Object zza2 = zzq.zza();
        if (object != null) {
            zzq.zzd(zza2, object);
        }
        return zza2;
    }

    private final void zzw(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzA(i2) & 1048575, obj2);
        zzO(obj, i, i2);
    }

    private final Object zzx(Object obj, int i, Object obj2, zziia zziiaVar, Object obj3) {
        zzifs zzs;
        int i2 = this.zzc[i];
        Object zzl = zziih.zzl(obj, zzA(i) & 1048575);
        if (zzl == null || (zzs = zzs(i)) == null) {
            return obj2;
        }
        zzigo zze = ((zzigp) zzr(i)).zze();
        Iterator it = ((zzigq) zzl).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!zzs.zza(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = zziic.zzk(obj3);
                }
                int zzc = zzigp.zzc(zze, entry.getKey(), entry.getValue());
                zziei zzieiVar = zziei.zza;
                byte[] bArr = new byte[zzc];
                zzieo zzieoVar = new zzieo(bArr, 0, zzc);
                try {
                    zzigp.zzb(zzieoVar, zze, entry.getKey(), entry.getValue());
                    zziic.zzi((zziib) obj2, i2, zziee.zza(zzieoVar, bArr));
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj2;
    }

    private static boolean zzy(Object obj, int i, zziho zzihoVar) {
        return zzihoVar.zzl(zziih.zzl(obj, i & 1048575));
    }

    private final void zzz(Object obj, int i, zzihj zzihjVar) throws IOException {
        long j = i & 1048575;
        if (zzD(i)) {
            zziih.zzm(obj, j, zzihjVar.zzn());
        } else if (this.zzi) {
            zziih.zzm(obj, j, zzihjVar.zzm());
        } else {
            zziih.zzm(obj, j, zzihjVar.zzq());
        }
    }

    @Override // com.google.android.gms.internal.ads.zziho
    public final Object zza() {
        return ((zzifm) this.zzg).zzbg();
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x01c2, code lost:
    
        continue;
     */
    @Override // com.google.android.gms.internal.ads.zziho
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzb(Object obj, Object obj2) {
        boolean zzF;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzA = zzA(i);
            int zzC = zzC(zzA);
            if (zzC <= 50 || zzC >= 69) {
                long j = zzA & 1048575;
                switch (zzC) {
                    case 0:
                        if (zzI(obj, obj2, i) && Double.doubleToLongBits(zziih.zzj(obj, j)) == Double.doubleToLongBits(zziih.zzj(obj2, j))) {
                            continue;
                        }
                        return false;
                    case 1:
                        if (zzI(obj, obj2, i) && Float.floatToIntBits(zziih.zzh(obj, j)) == Float.floatToIntBits(zziih.zzh(obj2, j))) {
                            continue;
                        }
                        return false;
                    case 2:
                        if (zzI(obj, obj2, i) && zziih.zzd(obj, j) == zziih.zzd(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 3:
                        if (zzI(obj, obj2, i) && zziih.zzd(obj, j) == zziih.zzd(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 4:
                        if (zzI(obj, obj2, i) && zziih.zzb(obj, j) == zziih.zzb(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 5:
                        if (zzI(obj, obj2, i) && zziih.zzd(obj, j) == zziih.zzd(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 6:
                        if (zzI(obj, obj2, i) && zziih.zzb(obj, j) == zziih.zzb(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 7:
                        if (zzI(obj, obj2, i) && zziih.zzf(obj, j) == zziih.zzf(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 8:
                        if (zzI(obj, obj2, i) && zzihp.zzF(zziih.zzl(obj, j), zziih.zzl(obj2, j))) {
                            continue;
                        }
                        return false;
                    case 9:
                        if (zzI(obj, obj2, i) && zzihp.zzF(zziih.zzl(obj, j), zziih.zzl(obj2, j))) {
                            continue;
                        }
                        return false;
                    case 10:
                        if (zzI(obj, obj2, i) && zzihp.zzF(zziih.zzl(obj, j), zziih.zzl(obj2, j))) {
                            continue;
                        }
                        return false;
                    case 11:
                        if (zzI(obj, obj2, i) && zziih.zzb(obj, j) == zziih.zzb(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 12:
                        if (zzI(obj, obj2, i) && zziih.zzb(obj, j) == zziih.zzb(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 13:
                        if (zzI(obj, obj2, i) && zziih.zzb(obj, j) == zziih.zzb(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 14:
                        if (zzI(obj, obj2, i) && zziih.zzd(obj, j) == zziih.zzd(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 15:
                        if (zzI(obj, obj2, i) && zziih.zzb(obj, j) == zziih.zzb(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 16:
                        if (zzI(obj, obj2, i) && zziih.zzd(obj, j) == zziih.zzd(obj2, j)) {
                            continue;
                        }
                        return false;
                    case 17:
                        if (zzI(obj, obj2, i) && zzihp.zzF(zziih.zzl(obj, j), zziih.zzl(obj2, j))) {
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
                        zzF = zzihp.zzF(zziih.zzl(obj, j), zziih.zzl(obj2, j));
                        break;
                    case 50:
                        zzF = zzihp.zzF(zziih.zzl(obj, j), zziih.zzl(obj2, j));
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
                        if (zzN(obj, obj2, i) && zzihp.zzF(zziih.zzl(obj, j), zziih.zzl(obj2, j))) {
                            continue;
                        }
                        return false;
                }
                if (!zzF) {
                    return false;
                }
            }
        }
        int i2 = this.zzl;
        while (true) {
            int[] iArr = this.zzj;
            if (i2 >= iArr.length) {
                if (!((zzifm) obj).zzt.equals(((zzifm) obj2).zzt)) {
                    return false;
                }
                if (this.zzh) {
                    return ((zzifi) obj).zza.equals(((zzifi) obj2).zza);
                }
                return true;
            }
            int i3 = iArr[i2];
            if (!zzN(obj, obj2, i3)) {
                return false;
            }
            if (!zzM(obj, 0, i3)) {
                long zzA2 = zzA(i3) & 1048575;
                if (!zzihp.zzF(zziih.zzl(obj, zzA2), zziih.zzl(obj2, zzA2))) {
                    return false;
                }
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziho
    public final int zzc(Object obj) {
        int i;
        long doubleToLongBits;
        int floatToIntBits;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzc.length; i4 += 3) {
            int zzA = zzA(i4);
            int zzC = zzC(zzA);
            if (zzC <= 50 || zzC >= 69) {
                long j = zzA & 1048575;
                int i5 = 37;
                switch (zzC) {
                    case 0:
                        i = i3 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zziih.zzj(obj, j));
                        byte[] bArr = zzifz.zza;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    case 1:
                        i = i3 * 53;
                        floatToIntBits = Float.floatToIntBits(zziih.zzh(obj, j));
                        i3 = i + floatToIntBits;
                        break;
                    case 2:
                        i = i3 * 53;
                        doubleToLongBits = zziih.zzd(obj, j);
                        byte[] bArr2 = zzifz.zza;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    case 3:
                        i = i3 * 53;
                        doubleToLongBits = zziih.zzd(obj, j);
                        byte[] bArr3 = zzifz.zza;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    case 4:
                        i = i3 * 53;
                        floatToIntBits = zziih.zzb(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    case 5:
                        i = i3 * 53;
                        doubleToLongBits = zziih.zzd(obj, j);
                        byte[] bArr4 = zzifz.zza;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    case 6:
                        i = i3 * 53;
                        floatToIntBits = zziih.zzb(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    case 7:
                        i = i3 * 53;
                        floatToIntBits = zzifz.zzb(zziih.zzf(obj, j));
                        i3 = i + floatToIntBits;
                        break;
                    case 8:
                        i = i3 * 53;
                        floatToIntBits = ((String) zziih.zzl(obj, j)).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                    case 9:
                        i2 = i3 * 53;
                        Object zzl = zziih.zzl(obj, j);
                        if (zzl != null) {
                            i5 = zzl.hashCode();
                        }
                        i3 = i2 + i5;
                        break;
                    case 10:
                        i = i3 * 53;
                        floatToIntBits = zziih.zzl(obj, j).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                    case 11:
                        i = i3 * 53;
                        floatToIntBits = zziih.zzb(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    case 12:
                        i = i3 * 53;
                        floatToIntBits = zziih.zzb(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    case 13:
                        i = i3 * 53;
                        floatToIntBits = zziih.zzb(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    case 14:
                        i = i3 * 53;
                        doubleToLongBits = zziih.zzd(obj, j);
                        byte[] bArr5 = zzifz.zza;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    case 15:
                        i = i3 * 53;
                        floatToIntBits = zziih.zzb(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    case 16:
                        i = i3 * 53;
                        doubleToLongBits = zziih.zzd(obj, j);
                        byte[] bArr6 = zzifz.zza;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    case 17:
                        i2 = i3 * 53;
                        Object zzl2 = zziih.zzl(obj, j);
                        if (zzl2 != null) {
                            i5 = zzl2.hashCode();
                        }
                        i3 = i2 + i5;
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
                        i = i3 * 53;
                        floatToIntBits = zziih.zzl(obj, j).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                    case 50:
                        i = i3 * 53;
                        floatToIntBits = zziih.zzl(obj, j).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                }
            }
        }
        int i6 = this.zzl;
        while (true) {
            int[] iArr = this.zzj;
            if (i6 >= iArr.length) {
                int hashCode = (i3 * 53) + ((zzifm) obj).zzt.hashCode();
                return this.zzh ? (hashCode * 53) + ((zzifi) obj).zza.zza.hashCode() : hashCode;
            }
            if (!zzM(obj, 0, iArr[i6])) {
                i3 = (i3 * 53) + zziih.zzl(obj, zzA(r3) & 1048575).hashCode();
            }
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziho
    public final void zzd(Object obj, Object obj2) {
        zzF(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i >= iArr.length) {
                zzihp.zzH(this.zzm, obj, obj2);
                if (this.zzh) {
                    zzihp.zzG(this.zzn, obj, obj2);
                    return;
                }
                return;
            }
            int zzA = zzA(i);
            int i2 = 1048575 & zzA;
            int zzC = zzC(zzA);
            int i3 = iArr[i];
            long j = i2;
            switch (zzC) {
                case 0:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zziih.zzk(obj, j, zziih.zzj(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 1:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zziih.zzi(obj, j, zziih.zzh(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 2:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zziih.zze(obj, j, zziih.zzd(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 3:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zziih.zze(obj, j, zziih.zzd(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 4:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zziih.zzc(obj, j, zziih.zzb(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 5:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zziih.zze(obj, j, zziih.zzd(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 6:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zziih.zzc(obj, j, zziih.zzb(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 7:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zziih.zzg(obj, j, zziih.zzf(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 8:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zziih.zzm(obj, j, zziih.zzl(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 9:
                    zzo(obj, obj2, i);
                    break;
                case 10:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zziih.zzm(obj, j, zziih.zzl(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 11:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zziih.zzc(obj, j, zziih.zzb(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 12:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zziih.zzc(obj, j, zziih.zzb(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 13:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zziih.zzc(obj, j, zziih.zzb(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 14:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zziih.zze(obj, j, zziih.zzd(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 15:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zziih.zzc(obj, j, zziih.zzb(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 16:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        zziih.zze(obj, j, zziih.zzd(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 17:
                    zzo(obj, obj2, i);
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
                    zzify zzifyVar = (zzify) zziih.zzl(obj, j);
                    zzify zzifyVar2 = (zzify) zziih.zzl(obj2, j);
                    int size = zzifyVar.size();
                    int size2 = zzifyVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzifyVar.zza()) {
                            zzifyVar = zzifyVar.zzh(size2 + size);
                        }
                        zzifyVar.addAll(zzifyVar2);
                    }
                    if (size > 0) {
                        zzifyVar2 = zzifyVar;
                    }
                    zziih.zzm(obj, j, zzifyVar2);
                    break;
                case 50:
                    int i4 = zzihp.zza;
                    zziih.zzm(obj, j, zzigr.zzb(zziih.zzl(obj, j), zziih.zzl(obj2, j)));
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
                        zziih.zzm(obj, j, zziih.zzl(obj2, j));
                        zzO(obj, i3, i);
                        break;
                    }
                case 60:
                    zzp(obj, obj2, i);
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
                        zziih.zzm(obj, j, zziih.zzl(obj2, j));
                        zzO(obj, i3, i);
                        break;
                    }
                case 68:
                    zzp(obj, obj2, i);
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
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v120, types: [int] */
    /* JADX WARN: Type inference failed for: r1v123, types: [int] */
    /* JADX WARN: Type inference failed for: r1v162 */
    /* JADX WARN: Type inference failed for: r1v165 */
    /* JADX WARN: Type inference failed for: r1v166 */
    /* JADX WARN: Type inference failed for: r1v167 */
    /* JADX WARN: Type inference failed for: r1v168 */
    /* JADX WARN: Type inference failed for: r1v80, types: [int] */
    /* JADX WARN: Type inference failed for: r1v82 */
    /* JADX WARN: Type inference failed for: r2v100 */
    /* JADX WARN: Type inference failed for: r2v101 */
    /* JADX WARN: Type inference failed for: r2v102 */
    /* JADX WARN: Type inference failed for: r2v103 */
    /* JADX WARN: Type inference failed for: r2v35, types: [int] */
    /* JADX WARN: Type inference failed for: r2v43, types: [int] */
    /* JADX WARN: Type inference failed for: r2v45, types: [int] */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52, types: [int] */
    /* JADX WARN: Type inference failed for: r2v80 */
    /* JADX WARN: Type inference failed for: r2v81, types: [int] */
    /* JADX WARN: Type inference failed for: r2v83 */
    /* JADX WARN: Type inference failed for: r2v84, types: [int] */
    /* JADX WARN: Type inference failed for: r2v98 */
    /* JADX WARN: Type inference failed for: r2v99 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28, types: [int] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31, types: [int] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v38, types: [int] */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v45, types: [int] */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34, types: [int] */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v41, types: [int] */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    @Override // com.google.android.gms.internal.ads.zziho
    public final int zze(Object obj) {
        int i;
        int i2;
        ?? r5;
        int zzF;
        int zzF2;
        int zzF3;
        int zzG;
        int zzF4;
        int zzF5;
        int zzb2;
        int zzF6;
        ?? zzs;
        int size;
        int zzF7;
        int zzb3;
        int zzF8;
        int zzb4;
        int zzF9;
        ?? r3;
        ?? r1;
        ?? r0;
        int zzB;
        int zzF10;
        int zzF11;
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
                int zzi = i5 + ((zzifm) obj).zzt.zzi();
                if (!this.zzh) {
                    return zzi;
                }
                zzihu zzihuVar = ((zzifi) obj).zza.zza;
                int zzc = zzihuVar.zzc();
                int i7 = 0;
                for (int i8 = 0; i8 < zzc; i8++) {
                    Map.Entry zzd = zzihuVar.zzd(i8);
                    i7 += zzifb.zzj(((zzihr) zzd).zza(), zzd.getValue());
                }
                for (Map.Entry entry : zzihuVar.zze()) {
                    i7 += zzifb.zzj((zzifa) entry.getKey(), entry.getValue());
                }
                return zzi + i7;
            }
            int zzA = zzA(i4);
            int zzC = zzC(zzA);
            int i9 = iArr[i4];
            int i10 = iArr[i4 + 2];
            int i11 = i10 & i3;
            if (zzC <= 17) {
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
            int i12 = zzA & i3;
            if (zzC >= zzifc.DOUBLE_LIST_PACKED.zza()) {
                zzifc.SINT64_LIST_PACKED.zza();
            }
            long j = i12;
            switch (zzC) {
                case 0:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        zzF = zzier.zzF(i9 << 3);
                        r0 = zzF + 8;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        zzF2 = zzier.zzF(i9 << 3);
                        r0 = zzF2 + 4;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        long j2 = unsafe.getLong(obj, j);
                        zzF3 = zzier.zzF(i9 << 3);
                        zzG = zzier.zzG(j2);
                        r0 = zzF3 + zzG;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        long j3 = unsafe.getLong(obj, j);
                        zzF3 = zzier.zzF(i9 << 3);
                        zzG = zzier.zzG(j3);
                        r0 = zzF3 + zzG;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        long j4 = unsafe.getInt(obj, j);
                        zzF3 = zzier.zzF(i9 << 3);
                        zzG = zzier.zzG(j4);
                        r0 = zzF3 + zzG;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        zzF = zzier.zzF(i9 << 3);
                        r0 = zzF + 8;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        zzF2 = zzier.zzF(i9 << 3);
                        r0 = zzF2 + 4;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        zzF4 = zzier.zzF(i9 << 3);
                        r0 = zzF4 + 1;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        int i13 = i9 << 3;
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zziei) {
                            zzF5 = zzier.zzF(i13);
                            zzb2 = ((zziei) object).zzb();
                            zzF6 = zzier.zzF(zzb2);
                        } else {
                            zzF5 = zzier.zzF(i13);
                            int i14 = zziim.zza;
                            zzb2 = zziij.zzb((String) object);
                            zzF6 = zzier.zzF(zzb2);
                        }
                        r0 = zzF5 + zzF6 + zzb2;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        Object object2 = unsafe.getObject(obj, j);
                        zziho zzq = zzq(i4);
                        int i15 = zzihp.zza;
                        zzF5 = zzier.zzF(i9 << 3);
                        zzb2 = ((zzidr) object2).zzaT(zzq);
                        zzF6 = zzier.zzF(zzb2);
                        r0 = zzF5 + zzF6 + zzb2;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        zziei zzieiVar = (zziei) unsafe.getObject(obj, j);
                        zzF5 = zzier.zzF(i9 << 3);
                        zzb2 = zzieiVar.zzb();
                        zzF6 = zzier.zzF(zzb2);
                        r0 = zzF5 + zzF6 + zzb2;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        int i16 = unsafe.getInt(obj, j);
                        zzF3 = zzier.zzF(i9 << 3);
                        zzG = zzier.zzF(i16);
                        r0 = zzF3 + zzG;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        long j5 = unsafe.getInt(obj, j);
                        zzF3 = zzier.zzF(i9 << 3);
                        zzG = zzier.zzG(j5);
                        r0 = zzF3 + zzG;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        zzF2 = zzier.zzF(i9 << 3);
                        r0 = zzF2 + 4;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        zzF = zzier.zzF(i9 << 3);
                        r0 = zzF + 8;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        int i17 = unsafe.getInt(obj, j);
                        zzF3 = zzier.zzF(i9 << 3);
                        zzG = zzier.zzF((i17 >> 31) ^ (i17 + i17));
                        r0 = zzF3 + zzG;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        long j6 = unsafe.getLong(obj, j);
                        zzF3 = zzier.zzF(i9 << 3);
                        zzG = zzier.zzG((j6 >> 63) ^ (j6 + j6));
                        r0 = zzF3 + zzG;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        r0 = zzihp.zzD(i9, (zzigw) unsafe.getObject(obj, j), zzq(i4));
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    r0 = zzihp.zzC(i9, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    break;
                case 19:
                    r0 = zzihp.zzA(i9, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j);
                    int i18 = zzihp.zza;
                    if (list.size() != 0) {
                        zzs = zzihp.zzs(list) + (list.size() * zzier.zzF(i9 << 3));
                        i5 += zzs;
                        break;
                    }
                    zzs = z;
                    i5 += zzs;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j);
                    int i19 = zzihp.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzF3 = zzihp.zzt(list2);
                        zzF7 = zzier.zzF(i9 << 3);
                        zzG = size * zzF7;
                        r0 = zzF3 + zzG;
                        i5 += r0;
                        break;
                    }
                    r0 = z;
                    i5 += r0;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i20 = zzihp.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzF3 = zzihp.zzw(list3);
                        zzF7 = zzier.zzF(i9 << 3);
                        zzG = size * zzF7;
                        r0 = zzF3 + zzG;
                        i5 += r0;
                        break;
                    }
                    r0 = z;
                    i5 += r0;
                case 23:
                    r0 = zzihp.zzC(i9, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    break;
                case 24:
                    r0 = zzihp.zzA(i9, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j);
                    int i21 = zzihp.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        r0 = size2 * (zzier.zzF(i9 << 3) + 1);
                        i5 += r0;
                        break;
                    }
                    r0 = z;
                    i5 += r0;
                case 26:
                    ?? r02 = (List) unsafe.getObject(obj, j);
                    int i22 = zzihp.zza;
                    int size3 = r02.size();
                    if (size3 != 0) {
                        int zzF12 = zzier.zzF(i9 << 3) * size3;
                        if (r02 instanceof zzigh) {
                            zzigh zzighVar = (zzigh) r02;
                            zzs = zzF12;
                            for (?? r32 = z; r32 < size3; r32++) {
                                Object zzc2 = zzighVar.zzc();
                                if (zzc2 instanceof zziei) {
                                    zzb4 = ((zziei) zzc2).zzb();
                                    zzF9 = zzier.zzF(zzb4);
                                } else {
                                    int i23 = zziim.zza;
                                    zzb4 = zziij.zzb((String) zzc2);
                                    zzF9 = zzier.zzF(zzb4);
                                }
                                zzs += zzF9 + zzb4;
                            }
                        } else {
                            zzs = zzF12;
                            for (?? r33 = z; r33 < size3; r33++) {
                                Object obj2 = r02.get(r33);
                                if (obj2 instanceof zziei) {
                                    zzb3 = ((zziei) obj2).zzb();
                                    zzF8 = zzier.zzF(zzb3);
                                } else {
                                    int i24 = zziim.zza;
                                    zzb3 = zziij.zzb((String) obj2);
                                    zzF8 = zzier.zzF(zzb3);
                                }
                                zzs += zzF8 + zzb3;
                            }
                        }
                        i5 += zzs;
                        break;
                    }
                    zzs = z;
                    i5 += zzs;
                case 27:
                    ?? r03 = (List) unsafe.getObject(obj, j);
                    zziho zzq2 = zzq(i4);
                    int i25 = zzihp.zza;
                    int size4 = r03.size();
                    if (size4 == 0) {
                        r3 = z;
                    } else {
                        r3 = zzier.zzF(i9 << 3) * size4;
                        for (?? r42 = z; r42 < size4; r42++) {
                            int zzaT = ((zzidr) r03.get(r42)).zzaT(zzq2);
                            r3 = (r3 == true ? 1 : 0) + zzier.zzF(zzaT) + zzaT;
                        }
                    }
                    i5 += r3;
                    break;
                case 28:
                    ?? r04 = (List) unsafe.getObject(obj, j);
                    int i26 = zzihp.zza;
                    int size5 = r04.size();
                    if (size5 == 0) {
                        r1 = z;
                    } else {
                        r1 = size5 * zzier.zzF(i9 << 3);
                        for (?? r2 = z; r2 < r04.size(); r2++) {
                            int zzb5 = ((zziei) r04.get(r2)).zzb();
                            r1 += zzier.zzF(zzb5) + zzb5;
                        }
                    }
                    i5 += r1;
                    break;
                case 29:
                    List list5 = (List) unsafe.getObject(obj, j);
                    int i27 = zzihp.zza;
                    size = list5.size();
                    if (size != 0) {
                        zzF3 = zzihp.zzx(list5);
                        zzF7 = zzier.zzF(i9 << 3);
                        zzG = size * zzF7;
                        r0 = zzF3 + zzG;
                        i5 += r0;
                        break;
                    }
                    r0 = z;
                    i5 += r0;
                case 30:
                    List list6 = (List) unsafe.getObject(obj, j);
                    int i28 = zzihp.zza;
                    size = list6.size();
                    if (size != 0) {
                        zzF3 = zzihp.zzv(list6);
                        zzF7 = zzier.zzF(i9 << 3);
                        zzG = size * zzF7;
                        r0 = zzF3 + zzG;
                        i5 += r0;
                        break;
                    }
                    r0 = z;
                    i5 += r0;
                case 31:
                    r0 = zzihp.zzA(i9, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    break;
                case 32:
                    r0 = zzihp.zzC(i9, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    break;
                case 33:
                    List list7 = (List) unsafe.getObject(obj, j);
                    int i29 = zzihp.zza;
                    size = list7.size();
                    if (size != 0) {
                        zzF3 = zzihp.zzy(list7);
                        zzF7 = zzier.zzF(i9 << 3);
                        zzG = size * zzF7;
                        r0 = zzF3 + zzG;
                        i5 += r0;
                        break;
                    }
                    r0 = z;
                    i5 += r0;
                case 34:
                    List list8 = (List) unsafe.getObject(obj, j);
                    int i30 = zzihp.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzF3 = zzihp.zzu(list8);
                        zzF7 = zzier.zzF(i9 << 3);
                        zzG = size * zzF7;
                        r0 = zzF3 + zzG;
                        i5 += r0;
                        break;
                    }
                    r0 = z;
                    i5 += r0;
                case 35:
                    zzB = zzihp.zzB((List) unsafe.getObject(obj, j));
                    if (zzB > 0) {
                        zzF10 = zzier.zzF(i9 << 3);
                        zzF11 = zzier.zzF(zzB);
                        r1 = zzF10 + zzF11 + zzB;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzB = zzihp.zzz((List) unsafe.getObject(obj, j));
                    if (zzB > 0) {
                        zzF10 = zzier.zzF(i9 << 3);
                        zzF11 = zzier.zzF(zzB);
                        r1 = zzF10 + zzF11 + zzB;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzB = zzihp.zzs((List) unsafe.getObject(obj, j));
                    if (zzB > 0) {
                        zzF10 = zzier.zzF(i9 << 3);
                        zzF11 = zzier.zzF(zzB);
                        r1 = zzF10 + zzF11 + zzB;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzB = zzihp.zzt((List) unsafe.getObject(obj, j));
                    if (zzB > 0) {
                        zzF10 = zzier.zzF(i9 << 3);
                        zzF11 = zzier.zzF(zzB);
                        r1 = zzF10 + zzF11 + zzB;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzB = zzihp.zzw((List) unsafe.getObject(obj, j));
                    if (zzB > 0) {
                        zzF10 = zzier.zzF(i9 << 3);
                        zzF11 = zzier.zzF(zzB);
                        r1 = zzF10 + zzF11 + zzB;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzB = zzihp.zzB((List) unsafe.getObject(obj, j));
                    if (zzB > 0) {
                        zzF10 = zzier.zzF(i9 << 3);
                        zzF11 = zzier.zzF(zzB);
                        r1 = zzF10 + zzF11 + zzB;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzB = zzihp.zzz((List) unsafe.getObject(obj, j));
                    if (zzB > 0) {
                        zzF10 = zzier.zzF(i9 << 3);
                        zzF11 = zzier.zzF(zzB);
                        r1 = zzF10 + zzF11 + zzB;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list9 = (List) unsafe.getObject(obj, j);
                    int i31 = zzihp.zza;
                    zzB = list9.size();
                    if (zzB > 0) {
                        zzF10 = zzier.zzF(i9 << 3);
                        zzF11 = zzier.zzF(zzB);
                        r1 = zzF10 + zzF11 + zzB;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzB = zzihp.zzx((List) unsafe.getObject(obj, j));
                    if (zzB > 0) {
                        zzF10 = zzier.zzF(i9 << 3);
                        zzF11 = zzier.zzF(zzB);
                        r1 = zzF10 + zzF11 + zzB;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzB = zzihp.zzv((List) unsafe.getObject(obj, j));
                    if (zzB > 0) {
                        zzF10 = zzier.zzF(i9 << 3);
                        zzF11 = zzier.zzF(zzB);
                        r1 = zzF10 + zzF11 + zzB;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzB = zzihp.zzz((List) unsafe.getObject(obj, j));
                    if (zzB > 0) {
                        zzF10 = zzier.zzF(i9 << 3);
                        zzF11 = zzier.zzF(zzB);
                        r1 = zzF10 + zzF11 + zzB;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzB = zzihp.zzB((List) unsafe.getObject(obj, j));
                    if (zzB > 0) {
                        zzF10 = zzier.zzF(i9 << 3);
                        zzF11 = zzier.zzF(zzB);
                        r1 = zzF10 + zzF11 + zzB;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzB = zzihp.zzy((List) unsafe.getObject(obj, j));
                    if (zzB > 0) {
                        zzF10 = zzier.zzF(i9 << 3);
                        zzF11 = zzier.zzF(zzB);
                        r1 = zzF10 + zzF11 + zzB;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzB = zzihp.zzu((List) unsafe.getObject(obj, j));
                    if (zzB > 0) {
                        zzF10 = zzier.zzF(i9 << 3);
                        zzF11 = zzier.zzF(zzB);
                        r1 = zzF10 + zzF11 + zzB;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    ?? r05 = (List) unsafe.getObject(obj, j);
                    zziho zzq3 = zzq(i4);
                    int i32 = zzihp.zza;
                    int size6 = r05.size();
                    if (size6 == 0) {
                        r4 = z;
                    } else {
                        boolean z2 = z;
                        r4 = z2;
                        ?? r34 = z2;
                        while (r34 < size6) {
                            int zzD = zzihp.zzD(i9, (zzigw) r05.get(r34), zzq3);
                            r34++;
                            r4 = (r4 == true ? 1 : 0) + zzD;
                        }
                    }
                    i5 += r4;
                    break;
                case 50:
                    zzigq zzigqVar = (zzigq) unsafe.getObject(obj, j);
                    zzigp zzigpVar = (zzigp) zzr(i4);
                    if (!zzigqVar.isEmpty()) {
                        zzs = z;
                        for (Map.Entry entry2 : zzigqVar.entrySet()) {
                            zzs += zzigpVar.zzd(i9, entry2.getKey(), entry2.getValue());
                        }
                        i5 += zzs;
                        break;
                    }
                    zzs = z;
                    i5 += zzs;
                case 51:
                    if (zzM(obj, i9, i4)) {
                        zzF = zzier.zzF(i9 << 3);
                        r0 = zzF + 8;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzM(obj, i9, i4)) {
                        zzF2 = zzier.zzF(i9 << 3);
                        r0 = zzF2 + 4;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzM(obj, i9, i4)) {
                        long zzH = zzH(obj, j);
                        zzF3 = zzier.zzF(i9 << 3);
                        zzG = zzier.zzG(zzH);
                        r0 = zzF3 + zzG;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzM(obj, i9, i4)) {
                        long zzH2 = zzH(obj, j);
                        zzF3 = zzier.zzF(i9 << 3);
                        zzG = zzier.zzG(zzH2);
                        r0 = zzF3 + zzG;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzM(obj, i9, i4)) {
                        long zzG2 = zzG(obj, j);
                        zzF3 = zzier.zzF(i9 << 3);
                        zzG = zzier.zzG(zzG2);
                        r0 = zzF3 + zzG;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzM(obj, i9, i4)) {
                        zzF = zzier.zzF(i9 << 3);
                        r0 = zzF + 8;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzM(obj, i9, i4)) {
                        zzF2 = zzier.zzF(i9 << 3);
                        r0 = zzF2 + 4;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzM(obj, i9, i4)) {
                        zzF4 = zzier.zzF(i9 << 3);
                        r0 = zzF4 + 1;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzM(obj, i9, i4)) {
                        int i33 = i9 << 3;
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof zziei) {
                            zzF5 = zzier.zzF(i33);
                            zzb2 = ((zziei) object3).zzb();
                            zzF6 = zzier.zzF(zzb2);
                        } else {
                            zzF5 = zzier.zzF(i33);
                            int i34 = zziim.zza;
                            zzb2 = zziij.zzb((String) object3);
                            zzF6 = zzier.zzF(zzb2);
                        }
                        r0 = zzF5 + zzF6 + zzb2;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzM(obj, i9, i4)) {
                        Object object4 = unsafe.getObject(obj, j);
                        zziho zzq4 = zzq(i4);
                        int i35 = zzihp.zza;
                        zzF5 = zzier.zzF(i9 << 3);
                        zzb2 = ((zzidr) object4).zzaT(zzq4);
                        zzF6 = zzier.zzF(zzb2);
                        r0 = zzF5 + zzF6 + zzb2;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzM(obj, i9, i4)) {
                        zziei zzieiVar2 = (zziei) unsafe.getObject(obj, j);
                        zzF5 = zzier.zzF(i9 << 3);
                        zzb2 = zzieiVar2.zzb();
                        zzF6 = zzier.zzF(zzb2);
                        r0 = zzF5 + zzF6 + zzb2;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzM(obj, i9, i4)) {
                        int zzG3 = zzG(obj, j);
                        zzF3 = zzier.zzF(i9 << 3);
                        zzG = zzier.zzF(zzG3);
                        r0 = zzF3 + zzG;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzM(obj, i9, i4)) {
                        long zzG4 = zzG(obj, j);
                        zzF3 = zzier.zzF(i9 << 3);
                        zzG = zzier.zzG(zzG4);
                        r0 = zzF3 + zzG;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzM(obj, i9, i4)) {
                        zzF2 = zzier.zzF(i9 << 3);
                        r0 = zzF2 + 4;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzM(obj, i9, i4)) {
                        zzF = zzier.zzF(i9 << 3);
                        r0 = zzF + 8;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzM(obj, i9, i4)) {
                        int zzG5 = zzG(obj, j);
                        zzF3 = zzier.zzF(i9 << 3);
                        zzG = zzier.zzF((zzG5 >> 31) ^ (zzG5 + zzG5));
                        r0 = zzF3 + zzG;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzM(obj, i9, i4)) {
                        long zzH3 = zzH(obj, j);
                        zzF3 = zzier.zzF(i9 << 3);
                        zzG = zzier.zzG((zzH3 >> 63) ^ (zzH3 + zzH3));
                        r0 = zzF3 + zzG;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzM(obj, i9, i4)) {
                        r0 = zzihp.zzD(i9, (zzigw) unsafe.getObject(obj, j), zzq(i4));
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    @Override // com.google.android.gms.internal.ads.zziho
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(Object obj, zziip zziipVar) throws IOException {
        Map.Entry entry;
        Iterator it;
        int[] iArr;
        int i;
        int i2;
        Map.Entry entry2;
        int i3;
        int[] iArr2;
        Map.Entry entry3;
        boolean z;
        Map.Entry entry4;
        if (this.zzh) {
            zzifb zzifbVar = ((zzifi) obj).zza;
            if (!zzifbVar.zza.isEmpty()) {
                Iterator zzc = zzifbVar.zzc();
                entry = (Map.Entry) zzc.next();
                it = zzc;
                iArr = this.zzc;
                Unsafe unsafe = zzb;
                int i4 = 1048575;
                int i5 = 1048575;
                int i6 = 0;
                i = 0;
                while (i < iArr.length) {
                    int zzA = zzA(i);
                    int zzC = zzC(zzA);
                    int i7 = iArr[i];
                    if (zzC <= 17) {
                        int i8 = iArr[i + 2];
                        int i9 = i8 & i4;
                        if (i9 != i5) {
                            if (i9 == i4) {
                                entry4 = entry;
                                i6 = 0;
                            } else {
                                entry4 = entry;
                                i6 = unsafe.getInt(obj, i9);
                            }
                            i5 = i9;
                        } else {
                            entry4 = entry;
                        }
                        int i10 = 1 << (i8 >>> 20);
                        i2 = i5;
                        i3 = i10;
                        entry2 = entry4;
                    } else {
                        i2 = i5;
                        entry2 = entry;
                        i3 = 0;
                    }
                    int i11 = i6;
                    while (entry2 != null && ((zzifj) entry2.getKey()).zza <= i7) {
                        this.zzn.zza(zziipVar, entry2);
                        entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    long j = zzA & i4;
                    switch (zzC) {
                        case 0:
                            iArr2 = iArr;
                            entry3 = entry2;
                            if (!zzJ(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                zziipVar.zzf(i7, zziih.zzj(obj, j));
                                break;
                            }
                        case 1:
                            iArr2 = iArr;
                            entry3 = entry2;
                            if (!zzJ(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                zziipVar.zze(i7, zziih.zzh(obj, j));
                                break;
                            }
                        case 2:
                            iArr2 = iArr;
                            entry3 = entry2;
                            if (!zzJ(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                zziipVar.zzc(i7, unsafe.getLong(obj, j));
                                break;
                            }
                        case 3:
                            iArr2 = iArr;
                            entry3 = entry2;
                            if (!zzJ(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                zziipVar.zzh(i7, unsafe.getLong(obj, j));
                                break;
                            }
                        case 4:
                            iArr2 = iArr;
                            entry3 = entry2;
                            if (!zzJ(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                zziipVar.zzi(i7, unsafe.getInt(obj, j));
                                break;
                            }
                        case 5:
                            iArr2 = iArr;
                            entry3 = entry2;
                            if (!zzJ(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                zziipVar.zzj(i7, unsafe.getLong(obj, j));
                                break;
                            }
                        case 6:
                            iArr2 = iArr;
                            entry3 = entry2;
                            if (!zzJ(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                zziipVar.zzk(i7, unsafe.getInt(obj, j));
                                break;
                            }
                        case 7:
                            iArr2 = iArr;
                            entry3 = entry2;
                            if (!zzJ(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                zziipVar.zzl(i7, zziih.zzf(obj, j));
                                break;
                            }
                        case 8:
                            iArr2 = iArr;
                            entry3 = entry2;
                            if (!zzJ(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                zzT(i7, unsafe.getObject(obj, j), zziipVar);
                                break;
                            }
                        case 9:
                            iArr2 = iArr;
                            entry3 = entry2;
                            if (!zzJ(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                zziipVar.zzr(i7, unsafe.getObject(obj, j), zzq(i));
                                break;
                            }
                        case 10:
                            iArr2 = iArr;
                            entry3 = entry2;
                            if (!zzJ(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                zziipVar.zzn(i7, (zziei) unsafe.getObject(obj, j));
                                break;
                            }
                        case 11:
                            iArr2 = iArr;
                            entry3 = entry2;
                            if (!zzJ(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                zziipVar.zzo(i7, unsafe.getInt(obj, j));
                                break;
                            }
                        case 12:
                            iArr2 = iArr;
                            entry3 = entry2;
                            if (!zzJ(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                zziipVar.zzg(i7, unsafe.getInt(obj, j));
                                break;
                            }
                        case 13:
                            iArr2 = iArr;
                            entry3 = entry2;
                            if (!zzJ(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                zziipVar.zzb(i7, unsafe.getInt(obj, j));
                                break;
                            }
                        case 14:
                            iArr2 = iArr;
                            entry3 = entry2;
                            if (!zzJ(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                zziipVar.zzd(i7, unsafe.getLong(obj, j));
                                break;
                            }
                        case 15:
                            iArr2 = iArr;
                            entry3 = entry2;
                            if (!zzJ(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                zziipVar.zzp(i7, unsafe.getInt(obj, j));
                                break;
                            }
                        case 16:
                            iArr2 = iArr;
                            entry3 = entry2;
                            if (!zzJ(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                zziipVar.zzq(i7, unsafe.getLong(obj, j));
                                break;
                            }
                        case 17:
                            entry3 = entry2;
                            iArr2 = iArr;
                            if (!zzJ(obj, i, i2, i11, i3)) {
                                break;
                            } else {
                                zziipVar.zzs(i7, unsafe.getObject(obj, j), zzq(i));
                                break;
                            }
                        case 18:
                            z = false;
                            zzihp.zza(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, false);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 19:
                            z = false;
                            zzihp.zzb(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, false);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 20:
                            z = false;
                            zzihp.zzc(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, false);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 21:
                            z = false;
                            zzihp.zzd(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, false);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 22:
                            z = false;
                            zzihp.zzh(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, false);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 23:
                            z = false;
                            zzihp.zzf(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, false);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 24:
                            z = false;
                            zzihp.zzk(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, false);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 25:
                            z = false;
                            zzihp.zzn(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, false);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 26:
                            zzihp.zzo(iArr[i], (List) unsafe.getObject(obj, j), zziipVar);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 27:
                            zzihp.zzq(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, zzq(i));
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 28:
                            zzihp.zzp(iArr[i], (List) unsafe.getObject(obj, j), zziipVar);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 29:
                            z = false;
                            zzihp.zzi(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, false);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 30:
                            z = false;
                            zzihp.zzm(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, false);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 31:
                            z = false;
                            zzihp.zzl(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, false);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 32:
                            z = false;
                            zzihp.zzg(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, false);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 33:
                            z = false;
                            zzihp.zzj(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, false);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 34:
                            z = false;
                            zzihp.zze(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, false);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 35:
                            zzihp.zza(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, true);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 36:
                            zzihp.zzb(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, true);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 37:
                            zzihp.zzc(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, true);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 38:
                            zzihp.zzd(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, true);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 39:
                            zzihp.zzh(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, true);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 40:
                            zzihp.zzf(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, true);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 41:
                            zzihp.zzk(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, true);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 42:
                            zzihp.zzn(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, true);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 43:
                            zzihp.zzi(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, true);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 44:
                            zzihp.zzm(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, true);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 45:
                            zzihp.zzl(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, true);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 46:
                            zzihp.zzg(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, true);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 47:
                            zzihp.zzj(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, true);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 48:
                            zzihp.zze(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, true);
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 49:
                            zzihp.zzr(iArr[i], (List) unsafe.getObject(obj, j), zziipVar, zzq(i));
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 50:
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                zziipVar.zzM(i7, ((zzigp) zzr(i)).zze(), (zzigq) object);
                            }
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 51:
                            if (zzM(obj, i7, i)) {
                                zziipVar.zzf(i7, ((Double) zziih.zzl(obj, j)).doubleValue());
                            }
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 52:
                            if (zzM(obj, i7, i)) {
                                zziipVar.zze(i7, ((Float) zziih.zzl(obj, j)).floatValue());
                            }
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 53:
                            if (zzM(obj, i7, i)) {
                                zziipVar.zzc(i7, zzH(obj, j));
                            }
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 54:
                            if (zzM(obj, i7, i)) {
                                zziipVar.zzh(i7, zzH(obj, j));
                            }
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 55:
                            if (zzM(obj, i7, i)) {
                                zziipVar.zzi(i7, zzG(obj, j));
                            }
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 56:
                            if (zzM(obj, i7, i)) {
                                zziipVar.zzj(i7, zzH(obj, j));
                            }
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 57:
                            if (zzM(obj, i7, i)) {
                                zziipVar.zzk(i7, zzG(obj, j));
                            }
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 58:
                            if (zzM(obj, i7, i)) {
                                zziipVar.zzl(i7, ((Boolean) zziih.zzl(obj, j)).booleanValue());
                            }
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 59:
                            if (zzM(obj, i7, i)) {
                                zzT(i7, unsafe.getObject(obj, j), zziipVar);
                            }
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 60:
                            if (zzM(obj, i7, i)) {
                                zziipVar.zzr(i7, unsafe.getObject(obj, j), zzq(i));
                            }
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 61:
                            if (zzM(obj, i7, i)) {
                                zziipVar.zzn(i7, (zziei) unsafe.getObject(obj, j));
                            }
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 62:
                            if (zzM(obj, i7, i)) {
                                zziipVar.zzo(i7, zzG(obj, j));
                            }
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 63:
                            if (zzM(obj, i7, i)) {
                                zziipVar.zzg(i7, zzG(obj, j));
                            }
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 64:
                            if (zzM(obj, i7, i)) {
                                zziipVar.zzb(i7, zzG(obj, j));
                            }
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 65:
                            if (zzM(obj, i7, i)) {
                                zziipVar.zzd(i7, zzH(obj, j));
                            }
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 66:
                            if (zzM(obj, i7, i)) {
                                zziipVar.zzp(i7, zzG(obj, j));
                            }
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 67:
                            if (zzM(obj, i7, i)) {
                                zziipVar.zzq(i7, zzH(obj, j));
                            }
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        case 68:
                            if (zzM(obj, i7, i)) {
                                zziipVar.zzs(i7, unsafe.getObject(obj, j), zzq(i));
                            }
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                        default:
                            iArr2 = iArr;
                            entry3 = entry2;
                            break;
                    }
                    i += 3;
                    i5 = i2;
                    entry = entry3;
                    i6 = i11;
                    iArr = iArr2;
                    i4 = 1048575;
                }
                while (entry != null) {
                    this.zzn.zza(zziipVar, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                ((zzifm) obj).zzt.zzg(zziipVar);
            }
        }
        entry = null;
        it = null;
        iArr = this.zzc;
        Unsafe unsafe2 = zzb;
        int i42 = 1048575;
        int i52 = 1048575;
        int i62 = 0;
        i = 0;
        while (i < iArr.length) {
        }
        while (entry != null) {
        }
        ((zzifm) obj).zzt.zzg(zziipVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:314:0x0528 A[LOOP:5: B:312:0x0524->B:314:0x0528, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0539  */
    @Override // com.google.android.gms.internal.ads.zziho
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzg(Object obj, zzihj zzihjVar, zziew zziewVar) throws IOException {
        int i;
        Object obj2;
        Object obj3;
        zziewVar.getClass();
        zzF(obj);
        zziia zziiaVar = this.zzm;
        Object obj4 = null;
        while (true) {
            try {
                int zzb2 = zzihjVar.zzb();
                int zzP = zzP(zzb2);
                if (zzP >= 0) {
                    int zzA = zzA(zzP);
                    try {
                    } catch (zzigd unused) {
                        if (obj4 == null) {
                            obj4 = zziic.zzk(obj);
                        }
                        if (!zziiaVar.zzh(obj4, zzihjVar, 0)) {
                            obj3 = obj4;
                            for (int i2 = this.zzk; i2 < this.zzl; i2++) {
                                obj3 = zzx(obj, this.zzj[i2], obj3, zziiaVar, obj);
                            }
                        }
                    }
                    switch (zzC(zzA)) {
                        case 0:
                            zziih.zzk(obj, zzA & 1048575, zzihjVar.zze());
                            zzL(obj, zzP);
                        case 1:
                            zziih.zzi(obj, zzA & 1048575, zzihjVar.zzf());
                            zzL(obj, zzP);
                        case 2:
                            zziih.zze(obj, zzA & 1048575, zzihjVar.zzh());
                            zzL(obj, zzP);
                        case 3:
                            zziih.zze(obj, zzA & 1048575, zzihjVar.zzg());
                            zzL(obj, zzP);
                        case 4:
                            zziih.zzc(obj, zzA & 1048575, zzihjVar.zzi());
                            zzL(obj, zzP);
                        case 5:
                            zziih.zze(obj, zzA & 1048575, zzihjVar.zzj());
                            zzL(obj, zzP);
                        case 6:
                            zziih.zzc(obj, zzA & 1048575, zzihjVar.zzk());
                            zzL(obj, zzP);
                        case 7:
                            zziih.zzg(obj, zzA & 1048575, zzihjVar.zzl());
                            zzL(obj, zzP);
                        case 8:
                            zzz(obj, zzA, zzihjVar);
                            zzL(obj, zzP);
                        case 9:
                            zzigw zzigwVar = (zzigw) zzt(obj, zzP);
                            zzihjVar.zzo(zzigwVar, zzq(zzP), zziewVar);
                            zzu(obj, zzP, zzigwVar);
                        case 10:
                            zziih.zzm(obj, zzA & 1048575, zzihjVar.zzq());
                            zzL(obj, zzP);
                        case 11:
                            zziih.zzc(obj, zzA & 1048575, zzihjVar.zzr());
                            zzL(obj, zzP);
                        case 12:
                            int zzs = zzihjVar.zzs();
                            zzifs zzs2 = zzs(zzP);
                            if (zzs2 != null && !zzs2.zza(zzs)) {
                                obj4 = zzihp.zzJ(obj, zzb2, zzs, obj4, zziiaVar);
                            }
                            zziih.zzc(obj, zzA & 1048575, zzs);
                            zzL(obj, zzP);
                            break;
                        case 13:
                            zziih.zzc(obj, zzA & 1048575, zzihjVar.zzt());
                            zzL(obj, zzP);
                        case 14:
                            zziih.zze(obj, zzA & 1048575, zzihjVar.zzu());
                            zzL(obj, zzP);
                        case 15:
                            zziih.zzc(obj, zzA & 1048575, zzihjVar.zzv());
                            zzL(obj, zzP);
                        case 16:
                            zziih.zze(obj, zzA & 1048575, zzihjVar.zzw());
                            zzL(obj, zzP);
                        case 17:
                            zzigw zzigwVar2 = (zzigw) zzt(obj, zzP);
                            zzihjVar.zzp(zzigwVar2, zzq(zzP), zziewVar);
                            zzu(obj, zzP, zzigwVar2);
                        case 18:
                            zzihjVar.zzx(zzigi.zza(obj, zzA & 1048575));
                        case 19:
                            zzihjVar.zzy(zzigi.zza(obj, zzA & 1048575));
                        case 20:
                            zzihjVar.zzA(zzigi.zza(obj, zzA & 1048575));
                        case 21:
                            zzihjVar.zzz(zzigi.zza(obj, zzA & 1048575));
                        case 22:
                            zzihjVar.zzB(zzigi.zza(obj, zzA & 1048575));
                        case 23:
                            zzihjVar.zzC(zzigi.zza(obj, zzA & 1048575));
                        case 24:
                            zzihjVar.zzD(zzigi.zza(obj, zzA & 1048575));
                        case 25:
                            zzihjVar.zzE(zzigi.zza(obj, zzA & 1048575));
                        case 26:
                            if (zzD(zzA)) {
                                ((zzien) zzihjVar).zzF(zzigi.zza(obj, zzA & 1048575), true);
                            } else {
                                ((zzien) zzihjVar).zzF(zzigi.zza(obj, zzA & 1048575), false);
                            }
                        case 27:
                            zzihjVar.zzG(zzigi.zza(obj, zzA & 1048575), zzq(zzP), zziewVar);
                        case 28:
                            zzihjVar.zzI(zzigi.zza(obj, zzA & 1048575));
                        case 29:
                            zzihjVar.zzJ(zzigi.zza(obj, zzA & 1048575));
                        case 30:
                            List zza2 = zzigi.zza(obj, zzA & 1048575);
                            zzihjVar.zzK(zza2);
                            obj4 = zzihp.zzI(obj, zzb2, zza2, zzs(zzP), obj4, zziiaVar);
                        case 31:
                            zzihjVar.zzL(zzigi.zza(obj, zzA & 1048575));
                        case 32:
                            zzihjVar.zzM(zzigi.zza(obj, zzA & 1048575));
                        case 33:
                            zzihjVar.zzN(zzigi.zza(obj, zzA & 1048575));
                        case 34:
                            zzihjVar.zzO(zzigi.zza(obj, zzA & 1048575));
                        case 35:
                            zzihjVar.zzx(zzigi.zza(obj, zzA & 1048575));
                        case 36:
                            zzihjVar.zzy(zzigi.zza(obj, zzA & 1048575));
                        case 37:
                            zzihjVar.zzA(zzigi.zza(obj, zzA & 1048575));
                        case 38:
                            zzihjVar.zzz(zzigi.zza(obj, zzA & 1048575));
                        case 39:
                            zzihjVar.zzB(zzigi.zza(obj, zzA & 1048575));
                        case 40:
                            zzihjVar.zzC(zzigi.zza(obj, zzA & 1048575));
                        case 41:
                            zzihjVar.zzD(zzigi.zza(obj, zzA & 1048575));
                        case 42:
                            zzihjVar.zzE(zzigi.zza(obj, zzA & 1048575));
                        case 43:
                            zzihjVar.zzJ(zzigi.zza(obj, zzA & 1048575));
                        case 44:
                            List zza3 = zzigi.zza(obj, zzA & 1048575);
                            zzihjVar.zzK(zza3);
                            obj4 = zzihp.zzI(obj, zzb2, zza3, zzs(zzP), obj4, zziiaVar);
                        case 45:
                            zzihjVar.zzL(zzigi.zza(obj, zzA & 1048575));
                        case 46:
                            zzihjVar.zzM(zzigi.zza(obj, zzA & 1048575));
                        case 47:
                            zzihjVar.zzN(zzigi.zza(obj, zzA & 1048575));
                        case 48:
                            zzihjVar.zzO(zzigi.zza(obj, zzA & 1048575));
                        case 49:
                            zzihjVar.zzH(zzigi.zza(obj, zzA & 1048575), zzq(zzP), zziewVar);
                        case 50:
                            Object zzr = zzr(zzP);
                            long zzA2 = zzA(zzP) & 1048575;
                            Object zzl = zziih.zzl(obj, zzA2);
                            if (zzl == null) {
                                zzl = zzigq.zza().zzc();
                                zziih.zzm(obj, zzA2, zzl);
                            } else if (zzigr.zza(zzl)) {
                                Object zzc = zzigq.zza().zzc();
                                zzigr.zzb(zzc, zzl);
                                zziih.zzm(obj, zzA2, zzc);
                                zzl = zzc;
                            }
                            zzihjVar.zzP((zzigq) zzl, ((zzigp) zzr).zze(), zziewVar);
                        case 51:
                            zziih.zzm(obj, zzA & 1048575, Double.valueOf(zzihjVar.zze()));
                            zzO(obj, zzb2, zzP);
                        case 52:
                            zziih.zzm(obj, zzA & 1048575, Float.valueOf(zzihjVar.zzf()));
                            zzO(obj, zzb2, zzP);
                        case 53:
                            zziih.zzm(obj, zzA & 1048575, Long.valueOf(zzihjVar.zzh()));
                            zzO(obj, zzb2, zzP);
                        case 54:
                            zziih.zzm(obj, zzA & 1048575, Long.valueOf(zzihjVar.zzg()));
                            zzO(obj, zzb2, zzP);
                        case 55:
                            zziih.zzm(obj, zzA & 1048575, Integer.valueOf(zzihjVar.zzi()));
                            zzO(obj, zzb2, zzP);
                        case 56:
                            zziih.zzm(obj, zzA & 1048575, Long.valueOf(zzihjVar.zzj()));
                            zzO(obj, zzb2, zzP);
                        case 57:
                            zziih.zzm(obj, zzA & 1048575, Integer.valueOf(zzihjVar.zzk()));
                            zzO(obj, zzb2, zzP);
                        case 58:
                            zziih.zzm(obj, zzA & 1048575, Boolean.valueOf(zzihjVar.zzl()));
                            zzO(obj, zzb2, zzP);
                        case 59:
                            zzz(obj, zzA, zzihjVar);
                            zzO(obj, zzb2, zzP);
                        case 60:
                            zzigw zzigwVar3 = (zzigw) zzv(obj, zzb2, zzP);
                            zzihjVar.zzo(zzigwVar3, zzq(zzP), zziewVar);
                            zzw(obj, zzb2, zzP, zzigwVar3);
                        case 61:
                            zziih.zzm(obj, zzA & 1048575, zzihjVar.zzq());
                            zzO(obj, zzb2, zzP);
                        case 62:
                            zziih.zzm(obj, zzA & 1048575, Integer.valueOf(zzihjVar.zzr()));
                            zzO(obj, zzb2, zzP);
                        case 63:
                            int zzs3 = zzihjVar.zzs();
                            zzifs zzs4 = zzs(zzP);
                            if (zzs4 != null && !zzs4.zza(zzs3)) {
                                obj4 = zzihp.zzJ(obj, zzb2, zzs3, obj4, zziiaVar);
                            }
                            zziih.zzm(obj, zzA & 1048575, Integer.valueOf(zzs3));
                            zzO(obj, zzb2, zzP);
                            break;
                        case 64:
                            zziih.zzm(obj, zzA & 1048575, Integer.valueOf(zzihjVar.zzt()));
                            zzO(obj, zzb2, zzP);
                        case 65:
                            zziih.zzm(obj, zzA & 1048575, Long.valueOf(zzihjVar.zzu()));
                            zzO(obj, zzb2, zzP);
                        case 66:
                            zziih.zzm(obj, zzA & 1048575, Integer.valueOf(zzihjVar.zzv()));
                            zzO(obj, zzb2, zzP);
                        case 67:
                            zziih.zzm(obj, zzA & 1048575, Long.valueOf(zzihjVar.zzw()));
                            zzO(obj, zzb2, zzP);
                        case 68:
                            zzigw zzigwVar4 = (zzigw) zzv(obj, zzb2, zzP);
                            zzihjVar.zzp(zzigwVar4, zzq(zzP), zziewVar);
                            zzw(obj, zzb2, zzP, zzigwVar4);
                        default:
                            if (obj4 == null) {
                                obj4 = zziic.zzk(obj);
                            }
                            if (!zziiaVar.zzh(obj4, zzihjVar, 0)) {
                                obj3 = obj4;
                                for (int i3 = this.zzk; i3 < this.zzl; i3++) {
                                    obj3 = zzx(obj, this.zzj[i3], obj3, zziiaVar, obj);
                                }
                                break;
                            }
                    }
                } else if (zzb2 == Integer.MAX_VALUE) {
                    obj3 = obj4;
                    for (int i4 = this.zzk; i4 < this.zzl; i4++) {
                        obj3 = zzx(obj, this.zzj[i4], obj3, zziiaVar, obj);
                    }
                } else {
                    if ((!this.zzh ? null : zziewVar.zzd(this.zzg, zzb2)) != null) {
                        throw null;
                    }
                    if (obj4 == null) {
                        obj4 = zziic.zzk(obj);
                    }
                    if (!zziiaVar.zzh(obj4, zzihjVar, 0)) {
                        obj3 = obj4;
                        for (int i5 = this.zzk; i5 < this.zzl; i5++) {
                            obj3 = zzx(obj, this.zzj[i5], obj3, zziiaVar, obj);
                        }
                    }
                }
            } catch (Throwable th) {
                obj2 = obj4;
                while (i < this.zzl) {
                }
                if (obj2 != null) {
                }
                throw th;
            }
            obj2 = obj4;
            for (i = this.zzk; i < this.zzl; i++) {
                obj2 = zzx(obj, this.zzj[i], obj2, zziiaVar, obj);
            }
            if (obj2 != null) {
                ((zzifm) obj).zzt = (zziib) obj2;
            }
            throw th;
        }
        if (obj3 != null) {
            ((zzifm) obj).zzt = (zziib) obj3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:200:0x0b55, code lost:
    
        throw new com.google.android.gms.internal.ads.zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0e97, code lost:
    
        if (r5 == 1048575) goto L595;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0e99, code lost:
    
        r12.putInt(r8, r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0e9d, code lost:
    
        r7 = r13.zzk;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0ea4, code lost:
    
        if (r7 >= r13.zzl) goto L724;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0ea6, code lost:
    
        r3 = (com.google.android.gms.internal.ads.zziib) zzx(r36, r13.zzj[r7], r3, r13.zzm, r36);
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0ebc, code lost:
    
        if (r3 == null) goto L601;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0ebe, code lost:
    
        ((com.google.android.gms.internal.ads.zzifm) r8).zzt = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0ec6, code lost:
    
        if (r9 != 0) goto L607;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0eca, code lost:
    
        if (r6 != r39) goto L605;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0ed4, code lost:
    
        throw new com.google.android.gms.internal.ads.zzige(r33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0edd, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0ed5, code lost:
    
        r1 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0ed9, code lost:
    
        if (r6 > r39) goto L611;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0edb, code lost:
    
        if (r10 != r9) goto L611;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0ee3, code lost:
    
        throw new com.google.android.gms.internal.ads.zzige(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0a10 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0a22 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0e13 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0e27 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzi(Object obj, byte[] bArr, int i, int i2, int i3, zzidw zzidwVar) throws IOException {
        String str;
        Unsafe unsafe;
        int i4;
        zzigz<T> zzigzVar;
        Object obj2;
        int i5;
        int i6;
        int i7;
        int i8;
        int zzP;
        int i9;
        int i10;
        int i11;
        zzigz<T> zzigzVar2;
        int i12;
        zzidw zzidwVar2;
        int i13;
        zzigz<T> zzigzVar3;
        char c;
        zzigz<T> zzigzVar4;
        int i14;
        int i15;
        boolean z;
        int i16;
        int i17;
        int zzc;
        zzigz<T> zzigzVar5;
        Unsafe unsafe2;
        zzidw zzidwVar3;
        int i18;
        int i19;
        char c2;
        zzidw zzidwVar4;
        int i20;
        int i21;
        String str2;
        int i22;
        Unsafe unsafe3;
        long j;
        zzigz<T> zzigzVar6;
        int i23;
        String str3;
        int i24;
        Unsafe unsafe4;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        zzidw zzidwVar5;
        int i33;
        Unsafe unsafe5;
        zzigz<T> zzigzVar7;
        int zzl;
        int zza2;
        int i34;
        int i35;
        Object obj3;
        Object obj4;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        zzigz<T> zzigzVar8;
        int i41;
        Unsafe unsafe6;
        int i42;
        int i43;
        zzigz<T> zzigzVar9 = this;
        Object obj5 = obj;
        int i44 = i2;
        int i45 = i3;
        zzidw zzidwVar6 = zzidwVar;
        zzF(obj);
        Unsafe unsafe7 = zzb;
        int i46 = i;
        int i47 = 0;
        int i48 = 0;
        int i49 = 0;
        int i50 = -1;
        int i51 = 1048575;
        while (true) {
            if (i46 < i44) {
                int i52 = i46 + 1;
                int i53 = bArr[i46];
                if (i53 < 0) {
                    i8 = zzidx.zzb(i53, bArr, i52, zzidwVar6);
                    i7 = zzidwVar6.zza;
                } else {
                    i7 = i53;
                    i8 = i52;
                }
                int i54 = i7 >>> 3;
                if (i54 > i50) {
                    zzP = (i54 < zzigzVar9.zze || i54 > zzigzVar9.zzf) ? -1 : zzigzVar9.zzQ(i54, i47 / 3);
                } else {
                    zzP = zzigzVar9.zzP(i54);
                }
                int i55 = zzP;
                if (i55 == -1) {
                    i9 = i8;
                    i6 = i7;
                    i10 = i49;
                    i11 = i51;
                    zzigzVar2 = zzigzVar9;
                    str = "Failed to parse the message.";
                    i12 = 0;
                    obj2 = obj5;
                    zzidwVar2 = zzidwVar6;
                    unsafe = unsafe7;
                    i13 = i54;
                    i4 = i45;
                } else {
                    int i56 = i7 & 7;
                    int[] iArr = zzigzVar9.zzc;
                    int i57 = i7;
                    int i58 = iArr[i55 + 1];
                    String str4 = "Failed to parse the message.";
                    int zzC = zzC(i58);
                    long j2 = i58 & 1048575;
                    if (zzC <= 17) {
                        int i59 = iArr[i55 + 2];
                        int i60 = 1 << (i59 >>> 20);
                        int i61 = i59 & 1048575;
                        if (i61 != i51) {
                            if (i51 != 1048575) {
                                unsafe7.putInt(obj5, i51, i49);
                            }
                            i49 = i61 == 1048575 ? 0 : unsafe7.getInt(obj5, i61);
                            i11 = i61;
                        } else {
                            i11 = i51;
                        }
                        switch (zzC) {
                            case 0:
                                c = 65535;
                                zzigzVar4 = this;
                                i14 = i8;
                                i15 = i55;
                                z = 1048575;
                                i16 = i57;
                                if (i56 != 1) {
                                    zzigzVar5 = zzigzVar4;
                                    unsafe2 = unsafe7;
                                    zzidwVar3 = zzidwVar6;
                                    i18 = i49;
                                    i19 = i15;
                                    i4 = i3;
                                    unsafe = unsafe2;
                                    i6 = i16;
                                    i10 = i18;
                                    str = str4;
                                    i13 = i54;
                                    zzigzVar2 = zzigzVar5;
                                    i9 = i14;
                                    i12 = i19;
                                    obj2 = obj5;
                                    zzidwVar2 = zzidwVar3;
                                    break;
                                } else {
                                    i46 = i14 + 8;
                                    i49 |= i60;
                                    zziih.zzk(obj5, j2, Double.longBitsToDouble(zzidx.zze(bArr, i14)));
                                    i44 = i2;
                                    i45 = i3;
                                    i48 = i16;
                                    zzigzVar9 = zzigzVar4;
                                    i47 = i15;
                                    i50 = i54;
                                    i51 = i11;
                                }
                            case 1:
                                c = 65535;
                                zzigzVar4 = this;
                                i14 = i8;
                                i15 = i55;
                                z = 1048575;
                                i16 = i57;
                                if (i56 != 5) {
                                    zzigzVar5 = zzigzVar4;
                                    unsafe2 = unsafe7;
                                    zzidwVar3 = zzidwVar6;
                                    i18 = i49;
                                    i19 = i15;
                                    i4 = i3;
                                    unsafe = unsafe2;
                                    i6 = i16;
                                    i10 = i18;
                                    str = str4;
                                    i13 = i54;
                                    zzigzVar2 = zzigzVar5;
                                    i9 = i14;
                                    i12 = i19;
                                    obj2 = obj5;
                                    zzidwVar2 = zzidwVar3;
                                    break;
                                } else {
                                    i46 = i14 + 4;
                                    i49 |= i60;
                                    zziih.zzi(obj5, j2, Float.intBitsToFloat(zzidx.zzd(bArr, i14)));
                                    i44 = i2;
                                    i45 = i3;
                                    i48 = i16;
                                    zzigzVar9 = zzigzVar4;
                                    i47 = i15;
                                    i50 = i54;
                                    i51 = i11;
                                }
                            case 2:
                            case 3:
                                c = 65535;
                                zzigzVar4 = this;
                                i14 = i8;
                                i15 = i55;
                                z = 1048575;
                                i16 = i57;
                                if (i56 != 0) {
                                    zzigzVar5 = zzigzVar4;
                                    unsafe2 = unsafe7;
                                    zzidwVar3 = zzidwVar6;
                                    i18 = i49;
                                    i19 = i15;
                                    i4 = i3;
                                    unsafe = unsafe2;
                                    i6 = i16;
                                    i10 = i18;
                                    str = str4;
                                    i13 = i54;
                                    zzigzVar2 = zzigzVar5;
                                    i9 = i14;
                                    i12 = i19;
                                    obj2 = obj5;
                                    zzidwVar2 = zzidwVar3;
                                    break;
                                } else {
                                    i17 = i60 | i49;
                                    zzc = zzidx.zzc(bArr, i14, zzidwVar6);
                                    unsafe7.putLong(obj, j2, zzidwVar6.zzb);
                                    i44 = i2;
                                    i45 = i3;
                                    i48 = i16;
                                    zzigzVar9 = zzigzVar4;
                                    i47 = i15;
                                    i49 = i17;
                                    i46 = zzc;
                                    i50 = i54;
                                    i51 = i11;
                                }
                            case 4:
                            case 11:
                                c = 65535;
                                zzigzVar4 = this;
                                i14 = i8;
                                i15 = i55;
                                z = 1048575;
                                i16 = i57;
                                if (i56 != 0) {
                                    zzigzVar5 = zzigzVar4;
                                    unsafe2 = unsafe7;
                                    zzidwVar3 = zzidwVar6;
                                    i18 = i49;
                                    i19 = i15;
                                    i4 = i3;
                                    unsafe = unsafe2;
                                    i6 = i16;
                                    i10 = i18;
                                    str = str4;
                                    i13 = i54;
                                    zzigzVar2 = zzigzVar5;
                                    i9 = i14;
                                    i12 = i19;
                                    obj2 = obj5;
                                    zzidwVar2 = zzidwVar3;
                                    break;
                                } else {
                                    i49 |= i60;
                                    i46 = zzidx.zza(bArr, i14, zzidwVar6);
                                    unsafe7.putInt(obj5, j2, zzidwVar6.zza);
                                    i44 = i2;
                                    i45 = i3;
                                    i48 = i16;
                                    zzigzVar9 = zzigzVar4;
                                    i47 = i15;
                                    i50 = i54;
                                    i51 = i11;
                                }
                            case 5:
                            case 14:
                                c = 65535;
                                zzigzVar4 = this;
                                i14 = i8;
                                i15 = i55;
                                z = 1048575;
                                i16 = i57;
                                if (i56 != 1) {
                                    zzigzVar5 = zzigzVar4;
                                    unsafe2 = unsafe7;
                                    zzidwVar3 = zzidwVar6;
                                    i18 = i49;
                                    i19 = i15;
                                    i4 = i3;
                                    unsafe = unsafe2;
                                    i6 = i16;
                                    i10 = i18;
                                    str = str4;
                                    i13 = i54;
                                    zzigzVar2 = zzigzVar5;
                                    i9 = i14;
                                    i12 = i19;
                                    obj2 = obj5;
                                    zzidwVar2 = zzidwVar3;
                                    break;
                                } else {
                                    zzc = i14 + 8;
                                    i17 = i60 | i49;
                                    unsafe7.putLong(obj, j2, zzidx.zze(bArr, i14));
                                    i44 = i2;
                                    i45 = i3;
                                    i48 = i16;
                                    zzigzVar9 = zzigzVar4;
                                    i47 = i15;
                                    i49 = i17;
                                    i46 = zzc;
                                    i50 = i54;
                                    i51 = i11;
                                }
                            case 6:
                            case 13:
                                c = 65535;
                                zzigzVar4 = this;
                                i14 = i8;
                                i15 = i55;
                                z = 1048575;
                                i16 = i57;
                                if (i56 != 5) {
                                    zzigzVar5 = zzigzVar4;
                                    unsafe2 = unsafe7;
                                    zzidwVar3 = zzidwVar6;
                                    i18 = i49;
                                    i19 = i15;
                                    i4 = i3;
                                    unsafe = unsafe2;
                                    i6 = i16;
                                    i10 = i18;
                                    str = str4;
                                    i13 = i54;
                                    zzigzVar2 = zzigzVar5;
                                    i9 = i14;
                                    i12 = i19;
                                    obj2 = obj5;
                                    zzidwVar2 = zzidwVar3;
                                    break;
                                } else {
                                    i46 = i14 + 4;
                                    i49 |= i60;
                                    unsafe7.putInt(obj5, j2, zzidx.zzd(bArr, i14));
                                    i44 = i2;
                                    i45 = i3;
                                    i48 = i16;
                                    zzigzVar9 = zzigzVar4;
                                    i47 = i15;
                                    i50 = i54;
                                    i51 = i11;
                                }
                            case 7:
                                c = 65535;
                                zzigzVar4 = this;
                                i14 = i8;
                                i15 = i55;
                                z = 1048575;
                                i16 = i57;
                                if (i56 != 0) {
                                    zzigzVar5 = zzigzVar4;
                                    unsafe2 = unsafe7;
                                    zzidwVar3 = zzidwVar6;
                                    i18 = i49;
                                    i19 = i15;
                                    i4 = i3;
                                    unsafe = unsafe2;
                                    i6 = i16;
                                    i10 = i18;
                                    str = str4;
                                    i13 = i54;
                                    zzigzVar2 = zzigzVar5;
                                    i9 = i14;
                                    i12 = i19;
                                    obj2 = obj5;
                                    zzidwVar2 = zzidwVar3;
                                    break;
                                } else {
                                    i49 |= i60;
                                    i46 = zzidx.zzc(bArr, i14, zzidwVar6);
                                    zziih.zzg(obj5, j2, zzidwVar6.zzb != 0);
                                    i44 = i2;
                                    i45 = i3;
                                    i48 = i16;
                                    zzigzVar9 = zzigzVar4;
                                    i47 = i15;
                                    i50 = i54;
                                    i51 = i11;
                                }
                            case 8:
                                c = 65535;
                                zzigzVar4 = this;
                                i14 = i8;
                                i15 = i55;
                                z = 1048575;
                                i16 = i57;
                                if (i56 != 2) {
                                    zzigzVar5 = zzigzVar4;
                                    unsafe2 = unsafe7;
                                    zzidwVar3 = zzidwVar6;
                                    i18 = i49;
                                    i19 = i15;
                                    i4 = i3;
                                    unsafe = unsafe2;
                                    i6 = i16;
                                    i10 = i18;
                                    str = str4;
                                    i13 = i54;
                                    zzigzVar2 = zzigzVar5;
                                    i9 = i14;
                                    i12 = i19;
                                    obj2 = obj5;
                                    zzidwVar2 = zzidwVar3;
                                    break;
                                } else {
                                    i49 |= i60;
                                    if (zzD(i58)) {
                                        i46 = zzidx.zzf(bArr, i14, zzidwVar6);
                                    } else {
                                        i46 = zzidx.zza(bArr, i14, zzidwVar6);
                                        int i62 = zzidwVar6.zza;
                                        if (i62 < 0) {
                                            throw new zzige("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                        }
                                        if (i62 == 0) {
                                            zzidwVar6.zzc = "";
                                        } else {
                                            zzidwVar6.zzc = new String(bArr, i46, i62, StandardCharsets.UTF_8);
                                            i46 += i62;
                                        }
                                    }
                                    unsafe7.putObject(obj5, j2, zzidwVar6.zzc);
                                    i44 = i2;
                                    i45 = i3;
                                    i48 = i16;
                                    zzigzVar9 = zzigzVar4;
                                    i47 = i15;
                                    i50 = i54;
                                    i51 = i11;
                                }
                            case 9:
                                c = 65535;
                                zzigzVar4 = this;
                                i15 = i55;
                                z = 1048575;
                                i16 = i57;
                                if (i56 != 2) {
                                    i14 = i8;
                                    zzigzVar5 = zzigzVar4;
                                    unsafe2 = unsafe7;
                                    zzidwVar3 = zzidwVar6;
                                    i18 = i49;
                                    i19 = i15;
                                    i4 = i3;
                                    unsafe = unsafe2;
                                    i6 = i16;
                                    i10 = i18;
                                    str = str4;
                                    i13 = i54;
                                    zzigzVar2 = zzigzVar5;
                                    i9 = i14;
                                    i12 = i19;
                                    obj2 = obj5;
                                    zzidwVar2 = zzidwVar3;
                                    break;
                                } else {
                                    Object zzt = zzigzVar4.zzt(obj5, i15);
                                    i46 = zzidx.zzj(zzt, zzigzVar4.zzq(i15), bArr, i8, i2, zzidwVar);
                                    zzigzVar4.zzu(obj5, i15, zzt);
                                    i44 = i2;
                                    i45 = i3;
                                    i48 = i16;
                                    zzigzVar9 = zzigzVar4;
                                    i47 = i15;
                                    i49 = i60 | i49;
                                    i50 = i54;
                                    i51 = i11;
                                }
                            case 10:
                                c = 65535;
                                zzigzVar4 = this;
                                i15 = i55;
                                z = 1048575;
                                i16 = i57;
                                if (i56 != 2) {
                                    i14 = i8;
                                    zzigzVar5 = zzigzVar4;
                                    unsafe2 = unsafe7;
                                    zzidwVar3 = zzidwVar6;
                                    i18 = i49;
                                    i19 = i15;
                                    i4 = i3;
                                    unsafe = unsafe2;
                                    i6 = i16;
                                    i10 = i18;
                                    str = str4;
                                    i13 = i54;
                                    zzigzVar2 = zzigzVar5;
                                    i9 = i14;
                                    i12 = i19;
                                    obj2 = obj5;
                                    zzidwVar2 = zzidwVar3;
                                    break;
                                } else {
                                    i49 |= i60;
                                    i46 = zzidx.zzg(bArr, i8, zzidwVar6);
                                    unsafe7.putObject(obj5, j2, zzidwVar6.zzc);
                                    i44 = i2;
                                    i45 = i3;
                                    i48 = i16;
                                    zzigzVar9 = zzigzVar4;
                                    i47 = i15;
                                    i50 = i54;
                                    i51 = i11;
                                }
                            case 12:
                                i15 = i55;
                                i16 = i57;
                                c2 = 65535;
                                if (i56 != 0) {
                                    zzigzVar5 = this;
                                    i14 = i8;
                                    i18 = i49;
                                    i19 = i15;
                                    unsafe2 = unsafe7;
                                    zzidwVar3 = zzidwVar6;
                                    i4 = i3;
                                    unsafe = unsafe2;
                                    i6 = i16;
                                    i10 = i18;
                                    str = str4;
                                    i13 = i54;
                                    zzigzVar2 = zzigzVar5;
                                    i9 = i14;
                                    i12 = i19;
                                    obj2 = obj5;
                                    zzidwVar2 = zzidwVar3;
                                    break;
                                } else {
                                    i46 = zzidx.zza(bArr, i8, zzidwVar6);
                                    int i63 = zzidwVar6.zza;
                                    zzigzVar4 = this;
                                    zzifs zzs = zzigzVar4.zzs(i15);
                                    if ((i58 & Integer.MIN_VALUE) == 0 || zzs == null || zzs.zza(i63)) {
                                        i49 |= i60;
                                        unsafe7.putInt(obj5, j2, i63);
                                    } else {
                                        zzh(obj).zzk(i16, Long.valueOf(i63));
                                    }
                                    i44 = i2;
                                    i45 = i3;
                                    i48 = i16;
                                    zzigzVar9 = zzigzVar4;
                                    i47 = i15;
                                    i50 = i54;
                                    i51 = i11;
                                }
                            case 15:
                                i16 = i57;
                                c2 = 65535;
                                if (i56 != 0) {
                                    zzigzVar5 = this;
                                    i14 = i8;
                                    i18 = i49;
                                    i19 = i55;
                                    unsafe2 = unsafe7;
                                    zzidwVar3 = zzidwVar6;
                                    i4 = i3;
                                    unsafe = unsafe2;
                                    i6 = i16;
                                    i10 = i18;
                                    str = str4;
                                    i13 = i54;
                                    zzigzVar2 = zzigzVar5;
                                    i9 = i14;
                                    i12 = i19;
                                    obj2 = obj5;
                                    zzidwVar2 = zzidwVar3;
                                    break;
                                } else {
                                    i49 |= i60;
                                    i46 = zzidx.zza(bArr, i8, zzidwVar6);
                                    unsafe7.putInt(obj5, j2, zziem.zzM(zzidwVar6.zza));
                                    i44 = i2;
                                    i45 = i3;
                                    i48 = i16;
                                    i47 = i55;
                                    i50 = i54;
                                    i51 = i11;
                                    zzigzVar9 = this;
                                }
                            case 16:
                                if (i56 != 0) {
                                    i16 = i57;
                                    c2 = 65535;
                                    zzigzVar5 = this;
                                    i14 = i8;
                                    i18 = i49;
                                    i19 = i55;
                                    unsafe2 = unsafe7;
                                    zzidwVar3 = zzidwVar6;
                                    i4 = i3;
                                    unsafe = unsafe2;
                                    i6 = i16;
                                    i10 = i18;
                                    str = str4;
                                    i13 = i54;
                                    zzigzVar2 = zzigzVar5;
                                    i9 = i14;
                                    i12 = i19;
                                    obj2 = obj5;
                                    zzidwVar2 = zzidwVar3;
                                    break;
                                } else {
                                    int zzc2 = zzidx.zzc(bArr, i8, zzidwVar6);
                                    unsafe7.putLong(obj, j2, zziem.zzN(zzidwVar6.zzb));
                                    i44 = i2;
                                    i45 = i3;
                                    i48 = i57;
                                    i49 |= i60;
                                    i46 = zzc2;
                                    i47 = i55;
                                    i50 = i54;
                                    i51 = i11;
                                    zzigzVar9 = this;
                                }
                            default:
                                c = 65535;
                                zzigzVar4 = this;
                                i14 = i8;
                                i15 = i55;
                                z = 1048575;
                                i16 = i57;
                                if (i56 != 3) {
                                    zzigzVar5 = zzigzVar4;
                                    unsafe2 = unsafe7;
                                    zzidwVar3 = zzidwVar6;
                                    i18 = i49;
                                    i19 = i15;
                                    i4 = i3;
                                    unsafe = unsafe2;
                                    i6 = i16;
                                    i10 = i18;
                                    str = str4;
                                    i13 = i54;
                                    zzigzVar2 = zzigzVar5;
                                    i9 = i14;
                                    i12 = i19;
                                    obj2 = obj5;
                                    zzidwVar2 = zzidwVar3;
                                    break;
                                } else {
                                    Object zzt2 = zzigzVar4.zzt(obj5, i15);
                                    int zzk = zzidx.zzk(zzt2, zzigzVar4.zzq(i15), bArr, i14, i2, (i54 << 3) | 4, zzidwVar);
                                    zzigzVar4.zzu(obj5, i15, zzt2);
                                    i44 = i2;
                                    i45 = i3;
                                    zzidwVar6 = zzidwVar6;
                                    unsafe7 = unsafe7;
                                    i48 = i16;
                                    i46 = zzk;
                                    i50 = i54;
                                    i51 = i11;
                                    zzigzVar9 = zzigzVar4;
                                    i47 = i15;
                                    i49 |= i60;
                                }
                        }
                    } else {
                        i10 = i49;
                        i11 = i51;
                        Unsafe unsafe8 = unsafe7;
                        int i64 = i8;
                        zzidw zzidwVar7 = zzidwVar6;
                        zzigz<T> zzigzVar10 = zzigzVar9;
                        int i65 = i57;
                        if (zzC != 27) {
                            int i66 = i55;
                            if (zzC > 49) {
                                int i67 = i64;
                                int i68 = i66;
                                i22 = i54;
                                str2 = str4;
                                int i69 = i2;
                                if (zzC != 50) {
                                    zzidwVar2 = zzidwVar;
                                    int i70 = i65;
                                    long j3 = iArr[i68 + 2] & 1048575;
                                    switch (zzC) {
                                        case 51:
                                            zzigzVar2 = this;
                                            obj2 = obj;
                                            i38 = i68;
                                            str = str2;
                                            i39 = i67;
                                            unsafe = unsafe8;
                                            i13 = i22;
                                            if (i56 == 1) {
                                                i40 = i39 + 8;
                                                unsafe.putObject(obj2, j2, Double.valueOf(Double.longBitsToDouble(zzidx.zze(bArr, i39))));
                                                unsafe.putInt(obj2, j3, i13);
                                                if (i40 == i39) {
                                                    i4 = i3;
                                                    i9 = i40;
                                                    i6 = i70;
                                                    i12 = i38;
                                                    break;
                                                } else {
                                                    i44 = i2;
                                                    i45 = i3;
                                                    i46 = i40;
                                                    zzigzVar9 = zzigzVar2;
                                                    i50 = i13;
                                                    unsafe7 = unsafe;
                                                    i49 = i10;
                                                    i48 = i70;
                                                    i51 = i11;
                                                    i47 = i38;
                                                    zzidwVar6 = zzidwVar2;
                                                    obj5 = obj2;
                                                }
                                            }
                                            i40 = i39;
                                            if (i40 == i39) {
                                            }
                                        case 52:
                                            zzigzVar2 = this;
                                            obj2 = obj;
                                            i38 = i68;
                                            str = str2;
                                            i39 = i67;
                                            unsafe = unsafe8;
                                            i13 = i22;
                                            if (i56 == 5) {
                                                i40 = i39 + 4;
                                                unsafe.putObject(obj2, j2, Float.valueOf(Float.intBitsToFloat(zzidx.zzd(bArr, i39))));
                                                unsafe.putInt(obj2, j3, i13);
                                                if (i40 == i39) {
                                                }
                                            }
                                            i40 = i39;
                                            if (i40 == i39) {
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            zzigzVar2 = this;
                                            obj2 = obj;
                                            i38 = i68;
                                            str = str2;
                                            i39 = i67;
                                            unsafe = unsafe8;
                                            i13 = i22;
                                            if (i56 == 0) {
                                                i40 = zzidx.zzc(bArr, i39, zzidwVar2);
                                                unsafe.putObject(obj2, j2, Long.valueOf(zzidwVar2.zzb));
                                                unsafe.putInt(obj2, j3, i13);
                                                if (i40 == i39) {
                                                }
                                            }
                                            i40 = i39;
                                            if (i40 == i39) {
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            zzigzVar2 = this;
                                            obj2 = obj;
                                            i38 = i68;
                                            str = str2;
                                            i39 = i67;
                                            unsafe = unsafe8;
                                            i13 = i22;
                                            if (i56 == 0) {
                                                i40 = zzidx.zza(bArr, i39, zzidwVar2);
                                                unsafe.putObject(obj2, j2, Integer.valueOf(zzidwVar2.zza));
                                                unsafe.putInt(obj2, j3, i13);
                                                if (i40 == i39) {
                                                }
                                            }
                                            i40 = i39;
                                            if (i40 == i39) {
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            zzigzVar2 = this;
                                            obj2 = obj;
                                            i38 = i68;
                                            str = str2;
                                            i39 = i67;
                                            unsafe = unsafe8;
                                            i13 = i22;
                                            if (i56 == 1) {
                                                i40 = i39 + 8;
                                                unsafe.putObject(obj2, j2, Long.valueOf(zzidx.zze(bArr, i39)));
                                                unsafe.putInt(obj2, j3, i13);
                                                if (i40 == i39) {
                                                }
                                            }
                                            i40 = i39;
                                            if (i40 == i39) {
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            zzigzVar2 = this;
                                            obj2 = obj;
                                            i38 = i68;
                                            str = str2;
                                            i39 = i67;
                                            unsafe = unsafe8;
                                            i13 = i22;
                                            if (i56 == 5) {
                                                i40 = i39 + 4;
                                                unsafe.putObject(obj2, j2, Integer.valueOf(zzidx.zzd(bArr, i39)));
                                                unsafe.putInt(obj2, j3, i13);
                                                if (i40 == i39) {
                                                }
                                            }
                                            i40 = i39;
                                            if (i40 == i39) {
                                            }
                                            break;
                                        case 58:
                                            zzigzVar2 = this;
                                            obj2 = obj;
                                            i38 = i68;
                                            str = str2;
                                            i39 = i67;
                                            unsafe = unsafe8;
                                            i13 = i22;
                                            if (i56 == 0) {
                                                i40 = zzidx.zzc(bArr, i39, zzidwVar2);
                                                unsafe.putObject(obj2, j2, Boolean.valueOf(zzidwVar2.zzb != 0));
                                                unsafe.putInt(obj2, j3, i13);
                                                if (i40 == i39) {
                                                }
                                            }
                                            i40 = i39;
                                            if (i40 == i39) {
                                            }
                                            break;
                                        case 59:
                                            zzigzVar2 = this;
                                            obj2 = obj;
                                            i38 = i68;
                                            str = str2;
                                            i39 = i67;
                                            unsafe = unsafe8;
                                            i13 = i22;
                                            if (i56 == 2) {
                                                i40 = zzidx.zza(bArr, i39, zzidwVar2);
                                                int i71 = zzidwVar2.zza;
                                                if (i71 == 0) {
                                                    unsafe.putObject(obj2, j2, "");
                                                } else {
                                                    int i72 = i40 + i71;
                                                    if ((i58 & 536870912) != 0 && !zziim.zzb(bArr, i40, i72)) {
                                                        throw new zzige("Protocol message had invalid UTF-8.");
                                                    }
                                                    unsafe.putObject(obj2, j2, new String(bArr, i40, i71, StandardCharsets.UTF_8));
                                                    i40 = i72;
                                                }
                                                unsafe.putInt(obj2, j3, i13);
                                                if (i40 == i39) {
                                                }
                                            }
                                            i40 = i39;
                                            if (i40 == i39) {
                                            }
                                            break;
                                        case 60:
                                            obj2 = obj;
                                            str = str2;
                                            if (i56 == 2) {
                                                Object zzv = zzv(obj2, i22, i68);
                                                unsafe = unsafe8;
                                                i70 = i70;
                                                i13 = i22;
                                                int zzj = zzidx.zzj(zzv, zzq(i68), bArr, i67, i2, zzidwVar);
                                                zzw(obj2, i13, i68, zzv);
                                                i40 = zzj;
                                                i38 = i68;
                                                zzigzVar2 = this;
                                                i39 = i67;
                                                if (i40 == i39) {
                                                }
                                            } else {
                                                unsafe = unsafe8;
                                                i70 = i70;
                                                i13 = i22;
                                                zzigzVar2 = this;
                                                i39 = i67;
                                                i38 = i68;
                                                i40 = i39;
                                                if (i40 == i39) {
                                                }
                                            }
                                            break;
                                        case 61:
                                            zzigzVar8 = this;
                                            obj2 = obj;
                                            str = str2;
                                            i41 = i67;
                                            unsafe6 = unsafe8;
                                            i42 = i70;
                                            i43 = i22;
                                            if (i56 == 2) {
                                                i40 = zzidx.zzg(bArr, i41, zzidwVar2);
                                                unsafe6.putObject(obj2, j2, zzidwVar2.zzc);
                                                unsafe6.putInt(obj2, j3, i43);
                                                unsafe = unsafe6;
                                                i39 = i41;
                                                i38 = i68;
                                                i70 = i42;
                                                i13 = i43;
                                                zzigzVar2 = zzigzVar8;
                                                if (i40 == i39) {
                                                }
                                            } else {
                                                unsafe = unsafe6;
                                                i39 = i41;
                                                i38 = i68;
                                                i70 = i42;
                                                i13 = i43;
                                                zzigzVar2 = zzigzVar8;
                                                i40 = i39;
                                                if (i40 == i39) {
                                                }
                                            }
                                            break;
                                        case 63:
                                            zzigzVar8 = this;
                                            obj2 = obj;
                                            str = str2;
                                            i41 = i67;
                                            unsafe6 = unsafe8;
                                            i43 = i22;
                                            if (i56 == 0) {
                                                i40 = zzidx.zza(bArr, i41, zzidwVar2);
                                                int i73 = zzidwVar2.zza;
                                                zzifs zzs2 = zzigzVar8.zzs(i68);
                                                if (zzs2 == null || zzs2.zza(i73)) {
                                                    i42 = i70;
                                                    unsafe6.putObject(obj2, j2, Integer.valueOf(i73));
                                                    unsafe6.putInt(obj2, j3, i43);
                                                } else {
                                                    i42 = i70;
                                                    zzh(obj).zzk(i42, Long.valueOf(i73));
                                                }
                                                unsafe = unsafe6;
                                                i39 = i41;
                                                i38 = i68;
                                                i70 = i42;
                                                i13 = i43;
                                                zzigzVar2 = zzigzVar8;
                                                if (i40 == i39) {
                                                }
                                            }
                                            unsafe = unsafe6;
                                            i39 = i41;
                                            i13 = i43;
                                            i38 = i68;
                                            zzigzVar2 = zzigzVar8;
                                            i40 = i39;
                                            if (i40 == i39) {
                                            }
                                            break;
                                        case 66:
                                            zzigzVar8 = this;
                                            obj2 = obj;
                                            str = str2;
                                            i41 = i67;
                                            unsafe6 = unsafe8;
                                            i43 = i22;
                                            if (i56 == 0) {
                                                i40 = zzidx.zza(bArr, i41, zzidwVar2);
                                                unsafe6.putObject(obj2, j2, Integer.valueOf(zziem.zzM(zzidwVar2.zza)));
                                                unsafe6.putInt(obj2, j3, i43);
                                                unsafe = unsafe6;
                                                i39 = i41;
                                                i13 = i43;
                                                i38 = i68;
                                                zzigzVar2 = zzigzVar8;
                                                if (i40 == i39) {
                                                }
                                            }
                                            unsafe = unsafe6;
                                            i39 = i41;
                                            i13 = i43;
                                            i38 = i68;
                                            zzigzVar2 = zzigzVar8;
                                            i40 = i39;
                                            if (i40 == i39) {
                                            }
                                            break;
                                        case 67:
                                            zzigzVar8 = this;
                                            obj2 = obj;
                                            str = str2;
                                            i41 = i67;
                                            unsafe6 = unsafe8;
                                            i43 = i22;
                                            if (i56 == 0) {
                                                i40 = zzidx.zzc(bArr, i41, zzidwVar2);
                                                unsafe6.putObject(obj2, j2, Long.valueOf(zziem.zzN(zzidwVar2.zzb)));
                                                unsafe6.putInt(obj2, j3, i43);
                                                unsafe = unsafe6;
                                                i39 = i41;
                                                i13 = i43;
                                                i38 = i68;
                                                zzigzVar2 = zzigzVar8;
                                                if (i40 == i39) {
                                                }
                                            }
                                            unsafe = unsafe6;
                                            i39 = i41;
                                            i13 = i43;
                                            i38 = i68;
                                            zzigzVar2 = zzigzVar8;
                                            i40 = i39;
                                            if (i40 == i39) {
                                            }
                                            break;
                                        case 68:
                                            if (i56 == 3) {
                                                Object zzv2 = zzv(obj, i22, i68);
                                                str = str2;
                                                int zzk2 = zzidx.zzk(zzv2, zzq(i68), bArr, i67, i2, (i70 & (-8)) | 4, zzidwVar);
                                                zzw(obj, i22, i68, zzv2);
                                                unsafe = unsafe8;
                                                i39 = i67;
                                                i13 = i22;
                                                i38 = i68;
                                                zzigzVar2 = this;
                                                obj2 = obj;
                                                i40 = zzk2;
                                                if (i40 == i39) {
                                                }
                                            } else {
                                                str = str2;
                                                zzigzVar2 = this;
                                                obj2 = obj;
                                                i38 = i68;
                                                i39 = i67;
                                                unsafe = unsafe8;
                                                i13 = i22;
                                                i40 = i39;
                                                if (i40 == i39) {
                                                }
                                            }
                                            break;
                                        default:
                                            zzigzVar2 = this;
                                            obj2 = obj;
                                            i38 = i68;
                                            str = str2;
                                            i39 = i67;
                                            unsafe = unsafe8;
                                            i13 = i22;
                                            i40 = i39;
                                            if (i40 == i39) {
                                            }
                                            break;
                                    }
                                } else if (i56 == 2) {
                                    Object zzr = zzigzVar10.zzr(i68);
                                    Object object = unsafe8.getObject(obj, j2);
                                    if (zzigr.zza(object)) {
                                        zzigq zzc3 = zzigq.zza().zzc();
                                        zzigr.zzb(zzc3, object);
                                        unsafe8.putObject(obj, j2, zzc3);
                                        object = zzc3;
                                    }
                                    zzigo zze = ((zzigp) zzr).zze();
                                    zzigq zzigqVar = (zzigq) object;
                                    int zza3 = zzidx.zza(bArr, i67, zzidwVar);
                                    int i74 = zzidwVar.zza;
                                    if (i74 >= 0 && i74 <= i69 - zza3) {
                                        int i75 = zza3 + i74;
                                        Object obj6 = zze.zzb;
                                        Object obj7 = zze.zzd;
                                        unsafe3 = unsafe8;
                                        Object obj8 = obj7;
                                        while (zza3 < i75) {
                                            int i76 = i67;
                                            int i77 = zza3 + 1;
                                            int i78 = bArr[zza3];
                                            if (i78 < 0) {
                                                i77 = zzidx.zzb(i78, bArr, i77, zzidwVar);
                                                i78 = zzidwVar.zza;
                                            }
                                            int i79 = i77;
                                            int i80 = i78 >>> 3;
                                            Object obj9 = obj6;
                                            int i81 = i78 & 7;
                                            int i82 = i68;
                                            if (i80 != 1) {
                                                if (i80 == 2) {
                                                    zziin zziinVar = zze.zzc;
                                                    if (i81 == zziinVar.zzb()) {
                                                        zza3 = zzS(bArr, i79, i2, zziinVar, obj7.getClass(), zzidwVar);
                                                        i68 = i82;
                                                        obj6 = obj9;
                                                        i69 = i69;
                                                        i65 = i65;
                                                        obj7 = obj7;
                                                        obj8 = zzidwVar.zzc;
                                                        i67 = i76;
                                                    }
                                                }
                                                i34 = i79;
                                                i35 = i76;
                                                obj3 = obj9;
                                                obj4 = obj7;
                                                i36 = i65;
                                                i37 = i82;
                                            } else {
                                                i34 = i79;
                                                i35 = i76;
                                                obj3 = obj9;
                                                obj4 = obj7;
                                                i36 = i65;
                                                i37 = i82;
                                                zziin zziinVar2 = zze.zza;
                                                if (i81 == zziinVar2.zzb()) {
                                                    zza3 = zzS(bArr, i34, i2, zziinVar2, null, zzidwVar);
                                                    obj6 = zzidwVar.zzc;
                                                    i68 = i37;
                                                    i69 = i69;
                                                    i67 = i35;
                                                    i65 = i36;
                                                    obj7 = obj4;
                                                }
                                            }
                                            zza3 = zzidx.zzp(i78, bArr, i34, i69, zzidwVar);
                                            i68 = i37;
                                            obj6 = obj3;
                                            i67 = i35;
                                            i65 = i36;
                                            obj7 = obj4;
                                        }
                                        int i83 = i67;
                                        Object obj10 = obj6;
                                        i21 = i65;
                                        i12 = i68;
                                        if (zza3 != i75) {
                                            throw new zzige(str2);
                                        }
                                        zzigqVar.put(obj10, obj8);
                                        if (i75 != i83) {
                                            i45 = i3;
                                            i44 = i69;
                                            i47 = i12;
                                            i46 = i75;
                                            zzidwVar6 = zzidwVar;
                                            i49 = i10;
                                            unsafe7 = unsafe3;
                                            i48 = i21;
                                            i50 = i22;
                                            i51 = i11;
                                            zzigzVar9 = this;
                                            obj5 = obj;
                                        } else {
                                            zzigzVar2 = this;
                                            i4 = i3;
                                            i9 = i75;
                                            zzidwVar2 = zzidwVar;
                                            str = str2;
                                        }
                                    }
                                } else {
                                    zzidwVar4 = zzidwVar;
                                    i20 = i67;
                                    i21 = i65;
                                    unsafe3 = unsafe8;
                                    i12 = i68;
                                    zzigzVar2 = this;
                                    i4 = i3;
                                    zzidwVar2 = zzidwVar4;
                                    str = str2;
                                    i9 = i20;
                                }
                            } else {
                                int i84 = i54;
                                long j4 = i58;
                                zzify zzifyVar = (zzify) unsafe8.getObject(obj5, j2);
                                if (zzifyVar.zza()) {
                                    j = j4;
                                } else {
                                    int size = zzifyVar.size();
                                    j = j4;
                                    zzifyVar = zzifyVar.zzh(size + size);
                                    unsafe8.putObject(obj5, j2, zzifyVar);
                                }
                                zzify zzifyVar2 = zzifyVar;
                                switch (zzC) {
                                    case 18:
                                    case 35:
                                        zzigzVar6 = this;
                                        i44 = i2;
                                        zzidwVar2 = zzidwVar7;
                                        i23 = i64;
                                        str3 = str4;
                                        i24 = i66;
                                        if (i56 != 2) {
                                            if (i56 == 1) {
                                                i46 = i23 + 8;
                                                int i85 = zzidx.zza;
                                                zziet zzietVar = (zziet) zzifyVar2;
                                                zzietVar.zzg(Double.longBitsToDouble(zzidx.zze(bArr, i23)));
                                                while (i46 < i44) {
                                                    int zza4 = zzidx.zza(bArr, i46, zzidwVar2);
                                                    if (i65 == zzidwVar2.zza) {
                                                        zzietVar.zzg(Double.longBitsToDouble(zzidx.zze(bArr, zza4)));
                                                        i46 = zza4 + 8;
                                                    }
                                                }
                                            }
                                            unsafe4 = unsafe8;
                                            i66 = i24;
                                            i46 = i23;
                                            if (i46 != i23) {
                                                obj2 = obj;
                                                i4 = i3;
                                                i9 = i46;
                                                str = str3;
                                                zzigzVar2 = zzigzVar6;
                                                i13 = i84;
                                                unsafe = unsafe4;
                                                i6 = i65;
                                                i12 = i66;
                                                break;
                                            } else {
                                                i45 = i3;
                                                i48 = i65;
                                                unsafe7 = unsafe4;
                                                zzigzVar9 = zzigzVar6;
                                                i49 = i10;
                                                i47 = i66;
                                                i50 = i84;
                                                i51 = i11;
                                                zzidwVar6 = zzidwVar2;
                                                obj5 = obj;
                                            }
                                        } else {
                                            int i86 = zzidx.zza;
                                            zziet zzietVar2 = (zziet) zzifyVar2;
                                            i46 = zzidx.zza(bArr, i23, zzidwVar2);
                                            int i87 = zzidwVar2.zza;
                                            if (i87 < 0) {
                                                throw new zzige("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i87 > bArr.length - i46) {
                                                throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            int i88 = i46 + i87;
                                            zzietVar2.zzi(zzietVar2.size() + (i87 >> 3));
                                            while (i46 < i88) {
                                                zzietVar2.zzg(Double.longBitsToDouble(zzidx.zze(bArr, i46)));
                                                i46 += 8;
                                            }
                                            if (i46 != i88) {
                                                throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        unsafe4 = unsafe8;
                                        i66 = i24;
                                        if (i46 != i23) {
                                        }
                                    case 19:
                                    case 36:
                                        zzigzVar6 = this;
                                        i44 = i2;
                                        zzidwVar2 = zzidwVar7;
                                        i23 = i64;
                                        str3 = str4;
                                        i24 = i66;
                                        if (i56 == 2) {
                                            int i89 = zzidx.zza;
                                            zzifd zzifdVar = (zzifd) zzifyVar2;
                                            i46 = zzidx.zza(bArr, i23, zzidwVar2);
                                            int i90 = zzidwVar2.zza;
                                            if (i90 < 0) {
                                                throw new zzige("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i90 > bArr.length - i46) {
                                                throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            int i91 = i46 + i90;
                                            zzifdVar.zzi(zzifdVar.size() + (i90 >> 2));
                                            while (i46 < i91) {
                                                zzifdVar.zzg(Float.intBitsToFloat(zzidx.zzd(bArr, i46)));
                                                i46 += 4;
                                            }
                                            if (i46 != i91) {
                                                throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        } else {
                                            if (i56 == 5) {
                                                i46 = i23 + 4;
                                                int i92 = zzidx.zza;
                                                zzifd zzifdVar2 = (zzifd) zzifyVar2;
                                                zzifdVar2.zzg(Float.intBitsToFloat(zzidx.zzd(bArr, i23)));
                                                while (i46 < i44) {
                                                    int zza5 = zzidx.zza(bArr, i46, zzidwVar2);
                                                    if (i65 == zzidwVar2.zza) {
                                                        zzifdVar2.zzg(Float.intBitsToFloat(zzidx.zzd(bArr, zza5)));
                                                        i46 = zza5 + 4;
                                                    }
                                                }
                                            }
                                            unsafe4 = unsafe8;
                                            i66 = i24;
                                            i46 = i23;
                                            if (i46 != i23) {
                                            }
                                        }
                                        unsafe4 = unsafe8;
                                        i66 = i24;
                                        if (i46 != i23) {
                                        }
                                        break;
                                    case 20:
                                    case 21:
                                    case 37:
                                    case 38:
                                        zzigzVar6 = this;
                                        i44 = i2;
                                        zzidwVar2 = zzidwVar7;
                                        i23 = i64;
                                        str3 = str4;
                                        i24 = i66;
                                        if (i56 == 2) {
                                            int i93 = zzidx.zza;
                                            zzigk zzigkVar = (zzigk) zzifyVar2;
                                            i46 = zzidx.zza(bArr, i23, zzidwVar2);
                                            int i94 = zzidwVar2.zza;
                                            if (i94 < 0) {
                                                throw new zzige("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i94 > bArr.length - i46) {
                                                throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            int i95 = i94 + i46;
                                            while (i46 < i95) {
                                                i46 = zzidx.zzc(bArr, i46, zzidwVar2);
                                                zzigkVar.zzd(zzidwVar2.zzb);
                                            }
                                            if (i46 != i95) {
                                                throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        } else {
                                            if (i56 == 0) {
                                                int i96 = zzidx.zza;
                                                zzigk zzigkVar2 = (zzigk) zzifyVar2;
                                                i46 = zzidx.zzc(bArr, i23, zzidwVar2);
                                                zzigkVar2.zzd(zzidwVar2.zzb);
                                                while (i46 < i44) {
                                                    int zza6 = zzidx.zza(bArr, i46, zzidwVar2);
                                                    if (i65 == zzidwVar2.zza) {
                                                        i46 = zzidx.zzc(bArr, zza6, zzidwVar2);
                                                        zzigkVar2.zzd(zzidwVar2.zzb);
                                                    }
                                                }
                                            }
                                            unsafe4 = unsafe8;
                                            i66 = i24;
                                            i46 = i23;
                                            if (i46 != i23) {
                                            }
                                        }
                                        unsafe4 = unsafe8;
                                        i66 = i24;
                                        if (i46 != i23) {
                                        }
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        i25 = i2;
                                        zzidwVar2 = zzidwVar7;
                                        i23 = i64;
                                        i24 = i66;
                                        if (i56 == 2) {
                                            i46 = zzidx.zzm(bArr, i23, zzifyVar2, zzidwVar2);
                                            zzigzVar6 = this;
                                            i44 = i25;
                                            unsafe4 = unsafe8;
                                            str3 = str4;
                                            i66 = i24;
                                            if (i46 != i23) {
                                            }
                                        } else if (i56 == 0) {
                                            zzigzVar6 = this;
                                            str3 = str4;
                                            i44 = i25;
                                            i46 = zzidx.zzl(i65, bArr, i23, i2, zzifyVar2, zzidwVar);
                                            unsafe4 = unsafe8;
                                            i66 = i24;
                                            if (i46 != i23) {
                                            }
                                        } else {
                                            zzigzVar6 = this;
                                            i44 = i25;
                                            str3 = str4;
                                            unsafe4 = unsafe8;
                                            i66 = i24;
                                            i46 = i23;
                                            if (i46 != i23) {
                                            }
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        i25 = i2;
                                        zzidwVar2 = zzidwVar7;
                                        i23 = i64;
                                        i24 = i66;
                                        int i97 = i84;
                                        if (i56 == 2) {
                                            int i98 = zzidx.zza;
                                            zzigk zzigkVar3 = (zzigk) zzifyVar2;
                                            i46 = zzidx.zza(bArr, i23, zzidwVar2);
                                            int i99 = zzidwVar2.zza;
                                            if (i99 < 0) {
                                                throw new zzige("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i99 > bArr.length - i46) {
                                                throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            int i100 = i46 + i99;
                                            zzigkVar3.zzi(zzigkVar3.size() + (i99 >> 3));
                                            while (i46 < i100) {
                                                zzigkVar3.zzd(zzidx.zze(bArr, i46));
                                                i46 += 8;
                                                i97 = i97;
                                            }
                                            i84 = i97;
                                            if (i46 != i100) {
                                                throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        } else {
                                            i84 = i97;
                                            if (i56 == 1) {
                                                i46 = i23 + 8;
                                                int i101 = zzidx.zza;
                                                zzigk zzigkVar4 = (zzigk) zzifyVar2;
                                                zzigkVar4.zzd(zzidx.zze(bArr, i23));
                                                while (i46 < i25) {
                                                    int zza7 = zzidx.zza(bArr, i46, zzidwVar2);
                                                    if (i65 == zzidwVar2.zza) {
                                                        zzigkVar4.zzd(zzidx.zze(bArr, zza7));
                                                        i46 = zza7 + 8;
                                                    }
                                                }
                                            } else {
                                                zzigzVar6 = this;
                                                i44 = i25;
                                                unsafe4 = unsafe8;
                                                str3 = str4;
                                                i66 = i24;
                                                i46 = i23;
                                                if (i46 != i23) {
                                                }
                                            }
                                        }
                                        zzigzVar6 = this;
                                        i44 = i25;
                                        unsafe4 = unsafe8;
                                        str3 = str4;
                                        i66 = i24;
                                        if (i46 != i23) {
                                        }
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        i26 = i2;
                                        zzidwVar2 = zzidwVar7;
                                        i23 = i64;
                                        i27 = i66;
                                        i28 = i84;
                                        if (i56 == 2) {
                                            int i102 = zzidx.zza;
                                            zzifn zzifnVar = (zzifn) zzifyVar2;
                                            i46 = zzidx.zza(bArr, i23, zzidwVar2);
                                            int i103 = zzidwVar2.zza;
                                            if (i103 < 0) {
                                                throw new zzige("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i103 > bArr.length - i46) {
                                                throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            int i104 = i46 + i103;
                                            zzifnVar.zzj(zzifnVar.size() + (i103 >> 2));
                                            while (i46 < i104) {
                                                zzifnVar.zzi(zzidx.zzd(bArr, i46));
                                                i46 += 4;
                                            }
                                            if (i46 != i104) {
                                                throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        } else {
                                            if (i56 == 5) {
                                                i46 = i23 + 4;
                                                int i105 = zzidx.zza;
                                                zzifn zzifnVar2 = (zzifn) zzifyVar2;
                                                zzifnVar2.zzi(zzidx.zzd(bArr, i23));
                                                while (i46 < i26) {
                                                    int zza8 = zzidx.zza(bArr, i46, zzidwVar2);
                                                    if (i65 == zzidwVar2.zza) {
                                                        zzifnVar2.zzi(zzidx.zzd(bArr, zza8));
                                                        i46 = zza8 + 4;
                                                    }
                                                }
                                            }
                                            i44 = i26;
                                            unsafe4 = unsafe8;
                                            i84 = i28;
                                            str3 = str4;
                                            i66 = i27;
                                            zzigzVar6 = this;
                                            i46 = i23;
                                            if (i46 != i23) {
                                            }
                                        }
                                        i44 = i26;
                                        unsafe4 = unsafe8;
                                        i84 = i28;
                                        str3 = str4;
                                        i66 = i27;
                                        zzigzVar6 = this;
                                        if (i46 != i23) {
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        i26 = i2;
                                        zzidwVar2 = zzidwVar7;
                                        i23 = i64;
                                        String str5 = str4;
                                        i27 = i66;
                                        i28 = i84;
                                        if (i56 == 2) {
                                            int i106 = zzidx.zza;
                                            zzidy zzidyVar = (zzidy) zzifyVar2;
                                            i46 = zzidx.zza(bArr, i23, zzidwVar2);
                                            int i107 = zzidwVar2.zza;
                                            if (i107 < 0) {
                                                throw new zzige("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i107 > bArr.length - i46) {
                                                throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            int i108 = i107 + i46;
                                            while (i46 < i108) {
                                                i46 = zzidx.zzc(bArr, i46, zzidwVar2);
                                                String str6 = str5;
                                                zzidyVar.zzg(zzidwVar2.zzb != 0);
                                                str5 = str6;
                                            }
                                            str4 = str5;
                                            if (i46 != i108) {
                                                throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        } else {
                                            str4 = str5;
                                            if (i56 == 0) {
                                                int i109 = zzidx.zza;
                                                zzidy zzidyVar2 = (zzidy) zzifyVar2;
                                                i46 = zzidx.zzc(bArr, i23, zzidwVar2);
                                                zzidyVar2.zzg(zzidwVar2.zzb != 0);
                                                while (i46 < i26) {
                                                    int zza9 = zzidx.zza(bArr, i46, zzidwVar2);
                                                    if (i65 == zzidwVar2.zza) {
                                                        i46 = zzidx.zzc(bArr, zza9, zzidwVar2);
                                                        zzidyVar2.zzg(zzidwVar2.zzb != 0);
                                                    }
                                                }
                                            }
                                            i44 = i26;
                                            unsafe4 = unsafe8;
                                            i84 = i28;
                                            str3 = str4;
                                            i66 = i27;
                                            zzigzVar6 = this;
                                            i46 = i23;
                                            if (i46 != i23) {
                                            }
                                        }
                                        i44 = i26;
                                        unsafe4 = unsafe8;
                                        i84 = i28;
                                        str3 = str4;
                                        i66 = i27;
                                        zzigzVar6 = this;
                                        if (i46 != i23) {
                                        }
                                        break;
                                    case 26:
                                        zzidwVar2 = zzidwVar7;
                                        i23 = i64;
                                        i27 = i66;
                                        long j5 = j;
                                        if (i56 != 2) {
                                            str3 = str4;
                                            i44 = i2;
                                            unsafe4 = unsafe8;
                                            i84 = i84;
                                            i66 = i27;
                                            zzigzVar6 = this;
                                            i46 = i23;
                                            if (i46 != i23) {
                                            }
                                        } else if ((j5 & 536870912) == 0) {
                                            int zza10 = zzidx.zza(bArr, i23, zzidwVar2);
                                            int i110 = zzidwVar2.zza;
                                            if (i110 < 0) {
                                                throw new zzige("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i110 == 0) {
                                                zzifyVar2.add("");
                                            } else {
                                                zzifyVar2.add(new String(bArr, zza10, i110, StandardCharsets.UTF_8));
                                                zza10 += i110;
                                            }
                                            while (zza10 < i2) {
                                                int zza11 = zzidx.zza(bArr, zza10, zzidwVar2);
                                                if (i65 == zzidwVar2.zza) {
                                                    zza10 = zzidx.zza(bArr, zza11, zzidwVar2);
                                                    int i111 = zzidwVar2.zza;
                                                    if (i111 < 0) {
                                                        throw new zzige("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i111 == 0) {
                                                        zzifyVar2.add("");
                                                    } else {
                                                        zzifyVar2.add(new String(bArr, zza10, i111, StandardCharsets.UTF_8));
                                                        zza10 += i111;
                                                    }
                                                } else {
                                                    str3 = str4;
                                                    i44 = i2;
                                                    unsafe4 = unsafe8;
                                                    i84 = i84;
                                                    i66 = i27;
                                                    zzigzVar6 = this;
                                                    i46 = zza10;
                                                    if (i46 != i23) {
                                                    }
                                                }
                                            }
                                            str3 = str4;
                                            i44 = i2;
                                            unsafe4 = unsafe8;
                                            i84 = i84;
                                            i66 = i27;
                                            zzigzVar6 = this;
                                            i46 = zza10;
                                            if (i46 != i23) {
                                            }
                                        } else {
                                            int zza12 = zzidx.zza(bArr, i23, zzidwVar2);
                                            int i112 = zzidwVar2.zza;
                                            if (i112 < 0) {
                                                throw new zzige("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i112 == 0) {
                                                zzifyVar2.add("");
                                            } else {
                                                int i113 = zza12 + i112;
                                                if (!zziim.zzb(bArr, zza12, i113)) {
                                                    throw new zzige("Protocol message had invalid UTF-8.");
                                                }
                                                zzifyVar2.add(new String(bArr, zza12, i112, StandardCharsets.UTF_8));
                                                zza12 = i113;
                                            }
                                            while (zza12 < i2) {
                                                int zza13 = zzidx.zza(bArr, zza12, zzidwVar2);
                                                if (i65 == zzidwVar2.zza) {
                                                    zza12 = zzidx.zza(bArr, zza13, zzidwVar2);
                                                    int i114 = zzidwVar2.zza;
                                                    if (i114 < 0) {
                                                        throw new zzige("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i114 == 0) {
                                                        zzifyVar2.add("");
                                                    } else {
                                                        int i115 = zza12 + i114;
                                                        if (!zziim.zzb(bArr, zza12, i115)) {
                                                            throw new zzige("Protocol message had invalid UTF-8.");
                                                        }
                                                        zzifyVar2.add(new String(bArr, zza12, i114, StandardCharsets.UTF_8));
                                                        zza12 = i115;
                                                    }
                                                } else {
                                                    i46 = zza12;
                                                    str3 = str4;
                                                    i44 = i2;
                                                    unsafe4 = unsafe8;
                                                    i84 = i84;
                                                    i66 = i27;
                                                    zzigzVar6 = this;
                                                    if (i46 != i23) {
                                                    }
                                                }
                                            }
                                            i46 = zza12;
                                            str3 = str4;
                                            i44 = i2;
                                            unsafe4 = unsafe8;
                                            i84 = i84;
                                            i66 = i27;
                                            zzigzVar6 = this;
                                            if (i46 != i23) {
                                            }
                                        }
                                        break;
                                    case 27:
                                        i29 = i2;
                                        i30 = i64;
                                        if (i56 == 2) {
                                            zzidwVar2 = zzidwVar7;
                                            int zzn = zzidx.zzn(zzq(i66), i65, bArr, i30, i2, zzifyVar2, zzidwVar);
                                            zzigzVar6 = this;
                                            str3 = str4;
                                            i44 = i29;
                                            unsafe4 = unsafe8;
                                            i46 = zzn;
                                            i66 = i66;
                                            i23 = i30;
                                            if (i46 != i23) {
                                            }
                                        } else {
                                            zzidwVar2 = zzidwVar7;
                                            zzigzVar6 = this;
                                            unsafe4 = unsafe8;
                                            i66 = i66;
                                            i44 = i29;
                                            i23 = i30;
                                            str3 = str4;
                                            i46 = i23;
                                            if (i46 != i23) {
                                            }
                                        }
                                        break;
                                    case 28:
                                        i29 = i2;
                                        i30 = i64;
                                        if (i56 == 2) {
                                            int zza14 = zzidx.zza(bArr, i30, zzidwVar7);
                                            int i116 = zzidwVar7.zza;
                                            if (i116 < 0) {
                                                throw new zzige("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i116 > bArr.length - zza14) {
                                                throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            if (i116 == 0) {
                                                zzifyVar2.add(zziei.zza);
                                            } else {
                                                zzifyVar2.add(zziei.zzt(bArr, zza14, i116));
                                                zza14 += i116;
                                            }
                                            while (zza14 < i29) {
                                                int zza15 = zzidx.zza(bArr, zza14, zzidwVar7);
                                                if (i65 == zzidwVar7.zza) {
                                                    zza14 = zzidx.zza(bArr, zza15, zzidwVar7);
                                                    int i117 = zzidwVar7.zza;
                                                    if (i117 < 0) {
                                                        throw new zzige("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i117 > bArr.length - zza14) {
                                                        throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    if (i117 == 0) {
                                                        zzifyVar2.add(zziei.zza);
                                                    } else {
                                                        zzifyVar2.add(zziei.zzt(bArr, zza14, i117));
                                                        zza14 += i117;
                                                    }
                                                } else {
                                                    unsafe4 = unsafe8;
                                                    zzidwVar2 = zzidwVar7;
                                                    i66 = i66;
                                                    zzigzVar6 = this;
                                                    i46 = zza14;
                                                    i44 = i29;
                                                    i23 = i30;
                                                    str3 = str4;
                                                    if (i46 != i23) {
                                                    }
                                                }
                                            }
                                            unsafe4 = unsafe8;
                                            zzidwVar2 = zzidwVar7;
                                            i66 = i66;
                                            zzigzVar6 = this;
                                            i46 = zza14;
                                            i44 = i29;
                                            i23 = i30;
                                            str3 = str4;
                                            if (i46 != i23) {
                                            }
                                        } else {
                                            unsafe4 = unsafe8;
                                            zzidwVar2 = zzidwVar7;
                                            i66 = i66;
                                            zzigzVar6 = this;
                                            i44 = i29;
                                            i23 = i30;
                                            str3 = str4;
                                            i46 = i23;
                                            if (i46 != i23) {
                                            }
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        i31 = i2;
                                        i32 = i66;
                                        if (i56 == 2) {
                                            zzidwVar5 = zzidwVar7;
                                            zzl = zzidx.zzm(bArr, i64, zzifyVar2, zzidwVar7);
                                            i30 = i64;
                                            i33 = i31;
                                            unsafe5 = unsafe8;
                                            zzigzVar7 = this;
                                        } else {
                                            if (i56 == 0) {
                                                zzidwVar5 = zzidwVar7;
                                                i30 = i64;
                                                i33 = i31;
                                                unsafe5 = unsafe8;
                                                zzigzVar7 = this;
                                                zzl = zzidx.zzl(i65, bArr, i64, i2, zzifyVar2, zzidwVar);
                                            }
                                            zzigzVar6 = this;
                                            zzidwVar2 = zzidwVar7;
                                            i23 = i64;
                                            unsafe4 = unsafe8;
                                            i66 = i32;
                                            str3 = str4;
                                            i44 = i31;
                                            i46 = i23;
                                            if (i46 != i23) {
                                            }
                                        }
                                        zzihp.zzI(obj, i84, zzifyVar2, zzigzVar7.zzs(i32), null, zzigzVar7.zzm);
                                        i46 = zzl;
                                        zzidwVar2 = zzidwVar5;
                                        zzigzVar6 = zzigzVar7;
                                        i66 = i32;
                                        i44 = i33;
                                        unsafe4 = unsafe5;
                                        i23 = i30;
                                        str3 = str4;
                                        if (i46 != i23) {
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        i31 = i2;
                                        i32 = i66;
                                        if (i56 == 2) {
                                            int i118 = zzidx.zza;
                                            zzifn zzifnVar3 = (zzifn) zzifyVar2;
                                            zza2 = zzidx.zza(bArr, i64, zzidwVar7);
                                            int i119 = zzidwVar7.zza;
                                            if (i119 < 0) {
                                                throw new zzige("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i119 > bArr.length - zza2) {
                                                throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            int i120 = i119 + zza2;
                                            while (zza2 < i120) {
                                                zza2 = zzidx.zza(bArr, zza2, zzidwVar7);
                                                zzifnVar3.zzi(zziem.zzM(zzidwVar7.zza));
                                            }
                                            if (zza2 != i120) {
                                                throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        } else {
                                            if (i56 == 0) {
                                                int i121 = zzidx.zza;
                                                zzifn zzifnVar4 = (zzifn) zzifyVar2;
                                                zza2 = zzidx.zza(bArr, i64, zzidwVar7);
                                                zzifnVar4.zzi(zziem.zzM(zzidwVar7.zza));
                                                while (zza2 < i31) {
                                                    int zza16 = zzidx.zza(bArr, zza2, zzidwVar7);
                                                    if (i65 == zzidwVar7.zza) {
                                                        zza2 = zzidx.zza(bArr, zza16, zzidwVar7);
                                                        zzifnVar4.zzi(zziem.zzM(zzidwVar7.zza));
                                                    }
                                                }
                                            }
                                            zzigzVar6 = this;
                                            zzidwVar2 = zzidwVar7;
                                            i23 = i64;
                                            unsafe4 = unsafe8;
                                            i66 = i32;
                                            str3 = str4;
                                            i44 = i31;
                                            i46 = i23;
                                            if (i46 != i23) {
                                            }
                                        }
                                        zzigzVar6 = this;
                                        zzidwVar2 = zzidwVar7;
                                        i46 = zza2;
                                        i23 = i64;
                                        unsafe4 = unsafe8;
                                        i66 = i32;
                                        str3 = str4;
                                        i44 = i31;
                                        if (i46 != i23) {
                                        }
                                        break;
                                    case 34:
                                    case 48:
                                        if (i56 == 2) {
                                            int i122 = zzidx.zza;
                                            zzigk zzigkVar5 = (zzigk) zzifyVar2;
                                            int zza17 = zzidx.zza(bArr, i64, zzidwVar7);
                                            int i123 = zzidwVar7.zza;
                                            if (i123 < 0) {
                                                throw new zzige("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i123 > bArr.length - zza17) {
                                                throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            int i124 = i123 + zza17;
                                            while (zza17 < i124) {
                                                zza17 = zzidx.zzc(bArr, zza17, zzidwVar7);
                                                zzigkVar5.zzd(zziem.zzN(zzidwVar7.zzb));
                                            }
                                            if (zza17 != i124) {
                                                throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzigzVar6 = this;
                                            i44 = i2;
                                            zzidwVar2 = zzidwVar7;
                                            i46 = zza17;
                                            i23 = i64;
                                            unsafe4 = unsafe8;
                                            str3 = str4;
                                            if (i46 != i23) {
                                            }
                                        } else if (i56 == 0) {
                                            int i125 = zzidx.zza;
                                            zzigk zzigkVar6 = (zzigk) zzifyVar2;
                                            zza2 = zzidx.zzc(bArr, i64, zzidwVar7);
                                            zzigkVar6.zzd(zziem.zzN(zzidwVar7.zzb));
                                            i31 = i2;
                                            i32 = i66;
                                            while (zza2 < i31) {
                                                int zza18 = zzidx.zza(bArr, zza2, zzidwVar7);
                                                if (i65 == zzidwVar7.zza) {
                                                    zza2 = zzidx.zzc(bArr, zza18, zzidwVar7);
                                                    zzigkVar6.zzd(zziem.zzN(zzidwVar7.zzb));
                                                } else {
                                                    zzigzVar6 = this;
                                                    zzidwVar2 = zzidwVar7;
                                                    i46 = zza2;
                                                    i23 = i64;
                                                    unsafe4 = unsafe8;
                                                    i66 = i32;
                                                    str3 = str4;
                                                    i44 = i31;
                                                    if (i46 != i23) {
                                                    }
                                                }
                                            }
                                            zzigzVar6 = this;
                                            zzidwVar2 = zzidwVar7;
                                            i46 = zza2;
                                            i23 = i64;
                                            unsafe4 = unsafe8;
                                            i66 = i32;
                                            str3 = str4;
                                            i44 = i31;
                                            if (i46 != i23) {
                                            }
                                        } else {
                                            zzigzVar6 = this;
                                            i44 = i2;
                                            zzidwVar2 = zzidwVar7;
                                            i23 = i64;
                                            unsafe4 = unsafe8;
                                            str3 = str4;
                                            i46 = i23;
                                            if (i46 != i23) {
                                            }
                                        }
                                        break;
                                    default:
                                        zzigzVar6 = this;
                                        i44 = i2;
                                        zzidwVar2 = zzidwVar7;
                                        i23 = i64;
                                        str3 = str4;
                                        i24 = i66;
                                        if (i56 == 3) {
                                            int i126 = (i65 & (-8)) | 4;
                                            zziho zzq = zzigzVar6.zzq(i24);
                                            i66 = i24;
                                            unsafe4 = unsafe8;
                                            i46 = zzidx.zzi(zzq, bArr, i23, i2, i126, zzidwVar);
                                            zzifyVar2.add(zzidwVar2.zzc);
                                            while (i46 < i44) {
                                                int zza19 = zzidx.zza(bArr, i46, zzidwVar2);
                                                if (i65 == zzidwVar2.zza) {
                                                    i46 = zzidx.zzi(zzq, bArr, zza19, i2, i126, zzidwVar);
                                                    zzifyVar2.add(zzidwVar2.zzc);
                                                } else if (i46 != i23) {
                                                }
                                            }
                                            if (i46 != i23) {
                                            }
                                        }
                                        unsafe4 = unsafe8;
                                        i66 = i24;
                                        i46 = i23;
                                        if (i46 != i23) {
                                        }
                                        break;
                                }
                            }
                        } else if (i56 == 2) {
                            zzify zzifyVar3 = (zzify) unsafe8.getObject(obj5, j2);
                            if (!zzifyVar3.zza()) {
                                int size2 = zzifyVar3.size();
                                zzifyVar3 = zzifyVar3.zzh(size2 == 0 ? 10 : size2 + size2);
                                unsafe8.putObject(obj5, j2, zzifyVar3);
                            }
                            zzify zzifyVar4 = zzifyVar3;
                            i50 = i54;
                            int zzn2 = zzidx.zzn(zzigzVar10.zzq(i55), i65, bArr, i64, i2, zzifyVar4, zzidwVar);
                            i44 = i2;
                            i45 = i3;
                            zzidwVar6 = zzidwVar7;
                            i46 = zzn2;
                            unsafe7 = unsafe8;
                            i48 = i65;
                            i51 = i11;
                            zzigzVar9 = zzigzVar10;
                            i47 = i55;
                            i49 = i10;
                        } else {
                            zzidwVar4 = zzidwVar7;
                            i20 = i64;
                            i21 = i65;
                            str2 = str4;
                            i22 = i54;
                            i12 = i55;
                            unsafe3 = unsafe8;
                            zzigzVar2 = this;
                            i4 = i3;
                            zzidwVar2 = zzidwVar4;
                            str = str2;
                            i9 = i20;
                        }
                        unsafe = unsafe3;
                        i6 = i21;
                        i13 = i22;
                        obj2 = obj;
                    }
                }
                if (i6 != i4 || i4 == 0) {
                    if (zzigzVar2.zzh) {
                        zziew zziewVar = zzidwVar2.zzd;
                        int i127 = zziew.zzb;
                        int i128 = zzidv.zza;
                        if (zziewVar != zziew.zza) {
                            zzigw zzigwVar = zzigzVar2.zzg;
                            int i129 = zzidx.zza;
                            if (zziewVar.zzd(zzigwVar, i13) != null) {
                                throw null;
                            }
                            zzigzVar3 = zzigzVar2;
                            i46 = zzidx.zzo(i6, bArr, i9, i2, zzh(obj), zzidwVar);
                            i44 = i2;
                            i47 = i12;
                            i48 = i6;
                            i50 = i13;
                            unsafe7 = unsafe;
                            zzigzVar9 = zzigzVar3;
                            i49 = i10;
                            i51 = i11;
                            zzidwVar6 = zzidwVar2;
                            obj5 = obj2;
                            i45 = i4;
                        }
                    }
                    zzigzVar3 = zzigzVar2;
                    i46 = zzidx.zzo(i6, bArr, i9, i2, zzh(obj), zzidwVar);
                    i44 = i2;
                    i47 = i12;
                    i48 = i6;
                    i50 = i13;
                    unsafe7 = unsafe;
                    zzigzVar9 = zzigzVar3;
                    i49 = i10;
                    i51 = i11;
                    zzidwVar6 = zzidwVar2;
                    obj5 = obj2;
                    i45 = i4;
                } else {
                    i5 = i9;
                    zzigzVar = zzigzVar2;
                    i49 = i10;
                    i51 = i11;
                }
            } else {
                str = "Failed to parse the message.";
                unsafe = unsafe7;
                i4 = i45;
                zzigzVar = zzigzVar9;
                obj2 = obj5;
                i5 = i46;
                i6 = i48;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zziho
    public final void zzj(Object obj, byte[] bArr, int i, int i2, zzidw zzidwVar) throws IOException {
        zzi(obj, bArr, i, i2, 0, zzidwVar);
    }

    @Override // com.google.android.gms.internal.ads.zziho
    public final void zzk(Object obj) {
        if (zzE(obj)) {
            if (obj instanceof zzifm) {
                zzifm zzifmVar = (zzifm) obj;
                zzifmVar.zzbq();
                zzifmVar.zzbb();
                zzifmVar.zzaY();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int zzA = zzA(i);
                int i2 = 1048575 & zzA;
                int zzC = zzC(zzA);
                long j = i2;
                if (zzC != 9) {
                    if (zzC != 60 && zzC != 68) {
                        switch (zzC) {
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
                                ((zzify) zziih.zzl(obj, j)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzigq) object).zzd();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzM(obj, iArr[i], i)) {
                        zzq(i).zzk(zzb.getObject(obj, j));
                    }
                }
                if (zzK(obj, i)) {
                    zzq(i).zzk(zzb.getObject(obj, j));
                }
            }
            ((zzifm) obj).zzt.zzd();
            if (this.zzh) {
                ((zzifi) obj).zza.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zziho
    public final boolean zzl(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.zzk) {
            int i6 = this.zzj[i4];
            int zzA = zzA(i6);
            int[] iArr = this.zzc;
            int i7 = iArr[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i5) {
                if (i8 != 1048575) {
                    i3 = zzb.getInt(obj, i8);
                }
                i2 = i3;
                i = i8;
            } else {
                i = i5;
                i2 = i3;
            }
            if ((268435456 & zzA) != 0 && !zzJ(obj, i6, i, i2, i9)) {
                return false;
            }
            int zzC = zzC(zzA);
            if (zzC != 9 && zzC != 17) {
                if (zzC != 27) {
                    if (zzC == 60 || zzC == 68) {
                        if (zzM(obj, iArr[i6], i6) && !zzy(obj, zzA, zzq(i6))) {
                            return false;
                        }
                    } else if (zzC != 49) {
                        if (zzC != 50) {
                            continue;
                        } else {
                            zzigq zzigqVar = (zzigq) zziih.zzl(obj, zzA & 1048575);
                            if (!zzigqVar.isEmpty() && ((zzigp) zzr(i6)).zze().zzc.zza() == zziio.MESSAGE) {
                                zziho zzihoVar = null;
                                for (Object obj2 : zzigqVar.values()) {
                                    if (zzihoVar == null) {
                                        zzihoVar = zzihg.zza().zzb(obj2.getClass());
                                    }
                                    if (!zzihoVar.zzl(obj2)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
                List list = (List) zziih.zzl(obj, zzA & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zziho zzq = zzq(i6);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (!zzq.zzl(list.get(i10))) {
                            return false;
                        }
                    }
                }
            } else if (zzJ(obj, i6, i, i2, i9) && !zzy(obj, zzA, zzq(i6))) {
                return false;
            }
            i4++;
            i5 = i;
            i3 = i2;
        }
        return !this.zzh || ((zzifi) obj).zza.zze();
    }
}
