package com.google.android.gms.internal.play_billing;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.datastore.preferences.protobuf.c;
import com.facebook.appevents.q;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes4.dex */
final class zzip<T> implements zzix<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzjq.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzim zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzjj zzl;
    private final zzgx zzm;

    private zzip(int[] iArr, Object[] objArr, int i, int i2, zzim zzimVar, boolean z, int[] iArr2, int i3, int i4, zzir zzirVar, zzhz zzhzVar, zzjj zzjjVar, zzgx zzgxVar, zzih zzihVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        boolean z2 = false;
        if (zzgxVar != null && (zzimVar instanceof zzhh)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzi = iArr2;
        this.zzj = i3;
        this.zzk = i4;
        this.zzl = zzjjVar;
        this.zzm = zzgxVar;
        this.zzg = zzimVar;
    }

    private static void zzA(Object obj) {
        if (!zzL(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
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
            zzix zzv = zzv(i);
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
        int i2 = this.zzc[i];
        if (zzM(obj2, i2, i)) {
            int zzs = zzs(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzs;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzix zzv = zzv(i);
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
        zzjq.zzq(obj, j, (1 << (zzp >>> 20)) | zzjq.zzc(obj, j));
    }

    private final void zzE(Object obj, int i, int i2) {
        zzjq.zzq(obj, zzp(i2) & 1048575, i);
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
            return (zzjq.zzc(obj, j) & (1 << (zzp >>> 20))) != 0;
        }
        int zzs = zzs(i);
        long j2 = zzs & 1048575;
        switch (zzr(zzs)) {
            case 0:
                return Double.doubleToRawLongBits(zzjq.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzjq.zzb(obj, j2)) != 0;
            case 2:
                return zzjq.zzd(obj, j2) != 0;
            case 3:
                return zzjq.zzd(obj, j2) != 0;
            case 4:
                return zzjq.zzc(obj, j2) != 0;
            case 5:
                return zzjq.zzd(obj, j2) != 0;
            case 6:
                return zzjq.zzc(obj, j2) != 0;
            case 7:
                return zzjq.zzw(obj, j2);
            case 8:
                Object zzf = zzjq.zzf(obj, j2);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzgk) {
                    return !zzgk.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzjq.zzf(obj, j2) != null;
            case 10:
                return !zzgk.zzb.equals(zzjq.zzf(obj, j2));
            case 11:
                return zzjq.zzc(obj, j2) != 0;
            case 12:
                return zzjq.zzc(obj, j2) != 0;
            case 13:
                return zzjq.zzc(obj, j2) != 0;
            case 14:
                return zzjq.zzd(obj, j2) != 0;
            case 15:
                return zzjq.zzc(obj, j2) != 0;
            case 16:
                return zzjq.zzd(obj, j2) != 0;
            case 17:
                return zzjq.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzJ(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzI(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzK(Object obj, int i, zzix zzixVar) {
        return zzixVar.zzk(zzjq.zzf(obj, i & 1048575));
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzhk) {
            return ((zzhk) obj).zzA();
        }
        return true;
    }

    private final boolean zzM(Object obj, int i, int i2) {
        return zzjq.zzc(obj, (long) (zzp(i2) & 1048575)) == i;
    }

    private static boolean zzN(Object obj, long j) {
        return ((Boolean) zzjq.zzf(obj, j)).booleanValue();
    }

    private static final void zzO(int i, Object obj, zzjw zzjwVar) throws IOException {
        if (obj instanceof String) {
            zzjwVar.zzG(i, (String) obj);
        } else {
            zzjwVar.zzd(i, (zzgk) obj);
        }
    }

    public static zzjk zzd(Object obj) {
        zzhk zzhkVar = (zzhk) obj;
        zzjk zzjkVar = zzhkVar.zzc;
        if (zzjkVar != zzjk.zzc()) {
            return zzjkVar;
        }
        zzjk zzf = zzjk.zzf();
        zzhkVar.zzc = zzf;
        return zzf;
    }

    public static zzip zzl(Class cls, zzij zzijVar, zzir zzirVar, zzhz zzhzVar, zzjj zzjjVar, zzgx zzgxVar, zzih zzihVar) {
        int i;
        int charAt;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr;
        int i7;
        int i8;
        char charAt2;
        int i9;
        char charAt3;
        int i10;
        char charAt4;
        int i11;
        char charAt5;
        int i12;
        char charAt6;
        int i13;
        char charAt7;
        int i14;
        char charAt8;
        int i15;
        char charAt9;
        int i16;
        zziw zziwVar;
        int i17;
        Object[] objArr;
        int i18;
        int i19;
        int i20;
        int objectFieldOffset;
        int i21;
        int i22;
        char c;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        Field zzz;
        char charAt10;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        Field zzz2;
        Field zzz3;
        int i34;
        char charAt11;
        int i35;
        int i36;
        char charAt12;
        int i37;
        char charAt13;
        int i38;
        char charAt14;
        if (!(zzijVar instanceof zziw)) {
            throw null;
        }
        zziw zziwVar2 = (zziw) zzijVar;
        String zzd = zziwVar2.zzd();
        int length = zzd.length();
        char c2 = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i39 = 1;
            while (true) {
                i = i39 + 1;
                if (zzd.charAt(i39) < 55296) {
                    break;
                }
                i39 = i;
            }
        } else {
            i = 1;
        }
        int i40 = i + 1;
        int charAt15 = zzd.charAt(i);
        if (charAt15 >= 55296) {
            int i41 = charAt15 & 8191;
            int i42 = 13;
            while (true) {
                i38 = i40 + 1;
                charAt14 = zzd.charAt(i40);
                if (charAt14 < 55296) {
                    break;
                }
                i41 |= (charAt14 & 8191) << i42;
                i42 += 13;
                i40 = i38;
            }
            charAt15 = i41 | (charAt14 << i42);
            i40 = i38;
        }
        if (charAt15 == 0) {
            i3 = 0;
            i6 = 0;
            charAt = 0;
            i2 = 0;
            i4 = 0;
            i5 = 0;
            iArr = zza;
            i7 = 0;
        } else {
            int i43 = i40 + 1;
            int charAt16 = zzd.charAt(i40);
            if (charAt16 >= 55296) {
                int i44 = charAt16 & 8191;
                int i45 = 13;
                while (true) {
                    i15 = i43 + 1;
                    charAt9 = zzd.charAt(i43);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i44 |= (charAt9 & 8191) << i45;
                    i45 += 13;
                    i43 = i15;
                }
                charAt16 = i44 | (charAt9 << i45);
                i43 = i15;
            }
            int i46 = i43 + 1;
            int charAt17 = zzd.charAt(i43);
            if (charAt17 >= 55296) {
                int i47 = charAt17 & 8191;
                int i48 = 13;
                while (true) {
                    i14 = i46 + 1;
                    charAt8 = zzd.charAt(i46);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i47 |= (charAt8 & 8191) << i48;
                    i48 += 13;
                    i46 = i14;
                }
                charAt17 = i47 | (charAt8 << i48);
                i46 = i14;
            }
            int i49 = i46 + 1;
            int charAt18 = zzd.charAt(i46);
            if (charAt18 >= 55296) {
                int i50 = charAt18 & 8191;
                int i51 = 13;
                while (true) {
                    i13 = i49 + 1;
                    charAt7 = zzd.charAt(i49);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i50 |= (charAt7 & 8191) << i51;
                    i51 += 13;
                    i49 = i13;
                }
                charAt18 = i50 | (charAt7 << i51);
                i49 = i13;
            }
            int i52 = i49 + 1;
            int charAt19 = zzd.charAt(i49);
            if (charAt19 >= 55296) {
                int i53 = charAt19 & 8191;
                int i54 = 13;
                while (true) {
                    i12 = i52 + 1;
                    charAt6 = zzd.charAt(i52);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i53 |= (charAt6 & 8191) << i54;
                    i54 += 13;
                    i52 = i12;
                }
                charAt19 = i53 | (charAt6 << i54);
                i52 = i12;
            }
            int i55 = i52 + 1;
            charAt = zzd.charAt(i52);
            if (charAt >= 55296) {
                int i56 = charAt & 8191;
                int i57 = 13;
                while (true) {
                    i11 = i55 + 1;
                    charAt5 = zzd.charAt(i55);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i56 |= (charAt5 & 8191) << i57;
                    i57 += 13;
                    i55 = i11;
                }
                charAt = i56 | (charAt5 << i57);
                i55 = i11;
            }
            int i58 = i55 + 1;
            int charAt20 = zzd.charAt(i55);
            if (charAt20 >= 55296) {
                int i59 = charAt20 & 8191;
                int i60 = 13;
                while (true) {
                    i10 = i58 + 1;
                    charAt4 = zzd.charAt(i58);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i59 |= (charAt4 & 8191) << i60;
                    i60 += 13;
                    i58 = i10;
                }
                charAt20 = i59 | (charAt4 << i60);
                i58 = i10;
            }
            int i61 = i58 + 1;
            int charAt21 = zzd.charAt(i58);
            if (charAt21 >= 55296) {
                int i62 = charAt21 & 8191;
                int i63 = 13;
                while (true) {
                    i9 = i61 + 1;
                    charAt3 = zzd.charAt(i61);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i62 |= (charAt3 & 8191) << i63;
                    i63 += 13;
                    i61 = i9;
                }
                charAt21 = i62 | (charAt3 << i63);
                i61 = i9;
            }
            int i64 = i61 + 1;
            int charAt22 = zzd.charAt(i61);
            if (charAt22 >= 55296) {
                int i65 = charAt22 & 8191;
                int i66 = 13;
                while (true) {
                    i8 = i64 + 1;
                    charAt2 = zzd.charAt(i64);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i65 |= (charAt2 & 8191) << i66;
                    i66 += 13;
                    i64 = i8;
                }
                charAt22 = i65 | (charAt2 << i66);
                i64 = i8;
            }
            int i67 = charAt16 + charAt16 + charAt17;
            int[] iArr2 = new int[charAt22 + charAt20 + charAt21];
            int i68 = charAt20;
            i2 = charAt18;
            i3 = i68;
            i4 = charAt19;
            i5 = charAt22;
            i6 = i67;
            iArr = iArr2;
            i7 = charAt16;
            i40 = i64;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zziwVar2.zze();
        Class<?> cls2 = zziwVar2.zza().getClass();
        int i69 = i5 + i3;
        int i70 = charAt + charAt;
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr2 = new Object[i70];
        int i71 = i5;
        int i72 = i69;
        int i73 = 0;
        int i74 = 0;
        while (i40 < length) {
            int i75 = i40 + 1;
            int charAt23 = zzd.charAt(i40);
            if (charAt23 >= c2) {
                int i76 = charAt23 & 8191;
                int i77 = i75;
                int i78 = 13;
                while (true) {
                    i37 = i77 + 1;
                    charAt13 = zzd.charAt(i77);
                    if (charAt13 < c2) {
                        break;
                    }
                    i76 |= (charAt13 & 8191) << i78;
                    i78 += 13;
                    i77 = i37;
                }
                charAt23 = i76 | (charAt13 << i78);
                i16 = i37;
            } else {
                i16 = i75;
            }
            int i79 = i16 + 1;
            int charAt24 = zzd.charAt(i16);
            if (charAt24 >= c2) {
                int i80 = charAt24 & 8191;
                int i81 = i79;
                int i82 = 13;
                while (true) {
                    i36 = i81 + 1;
                    charAt12 = zzd.charAt(i81);
                    zziwVar = zziwVar2;
                    if (charAt12 < 55296) {
                        break;
                    }
                    i80 |= (charAt12 & 8191) << i82;
                    i82 += 13;
                    i81 = i36;
                    zziwVar2 = zziwVar;
                }
                charAt24 = i80 | (charAt12 << i82);
                i17 = i36;
            } else {
                zziwVar = zziwVar2;
                i17 = i79;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i74] = i73;
                i74++;
            }
            int i83 = charAt24 & 255;
            int i84 = length;
            int i85 = charAt24 & 2048;
            if (i83 >= 51) {
                int i86 = i17 + 1;
                int charAt25 = zzd.charAt(i17);
                if (charAt25 >= 55296) {
                    int i87 = charAt25 & 8191;
                    int i88 = i86;
                    int i89 = 13;
                    while (true) {
                        i34 = i88 + 1;
                        charAt11 = zzd.charAt(i88);
                        i35 = i87;
                        if (charAt11 < 55296) {
                            break;
                        }
                        i87 = i35 | ((charAt11 & 8191) << i89);
                        i89 += 13;
                        i88 = i34;
                    }
                    charAt25 = i35 | (charAt11 << i89);
                    i32 = i34;
                } else {
                    i32 = i86;
                }
                int i90 = charAt25;
                int i91 = i83 - 51;
                int i92 = i32;
                if (i91 == 9 || i91 == 17) {
                    objArr2[q.a(i73, 3, 1)] = zze[i6];
                    i33 = i85;
                    i6++;
                } else {
                    if (i91 == 12) {
                        if (zziwVar.zzc() == 1 || i85 != 0) {
                            objArr2[q.a(i73, 3, 1)] = zze[i6];
                            i6++;
                        } else {
                            i33 = 0;
                        }
                    }
                    i33 = i85;
                }
                int i93 = i90 + i90;
                Object obj = zze[i93];
                int i94 = i33;
                if (obj instanceof Field) {
                    zzz2 = (Field) obj;
                } else {
                    zzz2 = zzz(cls2, (String) obj);
                    zze[i93] = zzz2;
                }
                Object[] objArr3 = objArr2;
                int i95 = i6;
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzz2);
                int i96 = i93 + 1;
                Object obj2 = zze[i96];
                if (obj2 instanceof Field) {
                    zzz3 = (Field) obj2;
                } else {
                    zzz3 = zzz(cls2, (String) obj2);
                    zze[i96] = zzz3;
                }
                int objectFieldOffset3 = (int) unsafe.objectFieldOffset(zzz3);
                i19 = i7;
                i27 = i95;
                i20 = i73;
                c = 55296;
                i21 = objectFieldOffset3;
                i26 = objectFieldOffset2;
                i85 = i94;
                i18 = charAt23;
                i40 = i92;
                objArr = objArr3;
                i25 = 0;
            } else {
                Object[] objArr4 = objArr2;
                int i97 = i6 + 1;
                objArr = objArr4;
                Field zzz4 = zzz(cls2, (String) zze[i6]);
                i18 = charAt23;
                if (i83 == 9 || i83 == 17) {
                    i19 = i7;
                    objArr[q.a(i73, 3, 1)] = zzz4.getType();
                } else {
                    if (i83 == 27) {
                        i19 = i7;
                        i29 = 3;
                        i30 = 1;
                        i31 = i6 + 2;
                    } else if (i83 == 49) {
                        i31 = i6 + 2;
                        i19 = i7;
                        i29 = 3;
                        i30 = 1;
                    } else {
                        if (i83 == 12 || i83 == 30 || i83 == 44) {
                            i19 = i7;
                            if (zziwVar.zzc() == 1 || i85 != 0) {
                                i31 = i6 + 2;
                                objArr[q.a(i73, 3, 1)] = zze[i97];
                                i97 = i31;
                            } else {
                                i20 = i73;
                                i85 = 0;
                            }
                        } else if (i83 == 50) {
                            int i98 = i6 + 2;
                            int i99 = i71 + 1;
                            iArr[i71] = i73;
                            int i100 = i73 / 3;
                            int i101 = i100 + i100;
                            objArr[i101] = zze[i97];
                            if (i85 != 0) {
                                i97 = i6 + 3;
                                objArr[i101 + 1] = zze[i98];
                                i20 = i73;
                                i71 = i99;
                            } else {
                                i97 = i98;
                                i20 = i73;
                                i71 = i99;
                                i85 = 0;
                            }
                            i19 = i7;
                        } else {
                            i19 = i7;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
                        i21 = 1048575;
                        if ((charAt24 & 4096) != 0 || i83 > 17) {
                            i22 = i97;
                            c = 55296;
                            i23 = i17;
                            i24 = 0;
                        } else {
                            int i102 = i17 + 1;
                            int charAt26 = zzd.charAt(i17);
                            if (charAt26 >= 55296) {
                                int i103 = charAt26 & 8191;
                                int i104 = 13;
                                while (true) {
                                    i28 = i102 + 1;
                                    charAt10 = zzd.charAt(i102);
                                    if (charAt10 < 55296) {
                                        break;
                                    }
                                    i103 |= (charAt10 & 8191) << i104;
                                    i104 += 13;
                                    i102 = i28;
                                }
                                charAt26 = i103 | (charAt10 << i104);
                            } else {
                                i28 = i102;
                            }
                            int i105 = (charAt26 / 32) + i19 + i19;
                            Object obj3 = zze[i105];
                            if (obj3 instanceof Field) {
                                zzz = (Field) obj3;
                            } else {
                                zzz = zzz(cls2, (String) obj3);
                                zze[i105] = zzz;
                            }
                            i22 = i97;
                            i24 = charAt26 % 32;
                            i21 = (int) unsafe.objectFieldOffset(zzz);
                            i23 = i28;
                            c = 55296;
                        }
                        if (i83 >= 18 || i83 > 49) {
                            i25 = i24;
                            i26 = objectFieldOffset;
                            int i106 = i23;
                            i27 = i22;
                            i40 = i106;
                        } else {
                            int i107 = i72 + 1;
                            iArr[i72] = objectFieldOffset;
                            i25 = i24;
                            i26 = objectFieldOffset;
                            int i108 = i23;
                            i27 = i22;
                            i40 = i108;
                            i72 = i107;
                        }
                    }
                    objArr[q.a(i73, i29, i30)] = zze[i97];
                    i97 = i31;
                }
                i20 = i73;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
                i21 = 1048575;
                if ((charAt24 & 4096) != 0) {
                }
                i22 = i97;
                c = 55296;
                i23 = i17;
                i24 = 0;
                if (i83 >= 18) {
                }
                i25 = i24;
                i26 = objectFieldOffset;
                int i1062 = i23;
                i27 = i22;
                i40 = i1062;
            }
            int i109 = i20 + 1;
            iArr3[i20] = i18;
            int i110 = i20 + 2;
            iArr3[i109] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | (i85 != 0 ? Integer.MIN_VALUE : 0) | (i83 << 20) | i26;
            iArr3[i110] = (i25 << 20) | i21;
            i73 = i20 + 3;
            i6 = i27;
            length = i84;
            c2 = c;
            zziwVar2 = zziwVar;
            i7 = i19;
            objArr2 = objArr;
        }
        return new zzip(iArr3, objArr2, i2, i4, zziwVar2.zza(), false, iArr, i5, i69, zzirVar, zzhzVar, zzjjVar, zzgxVar, zzihVar);
    }

    private static double zzm(Object obj, long j) {
        return ((Double) zzjq.zzf(obj, j)).doubleValue();
    }

    private static float zzn(Object obj, long j) {
        return ((Float) zzjq.zzf(obj, j)).floatValue();
    }

    private static int zzo(Object obj, long j) {
        return ((Integer) zzjq.zzf(obj, j)).intValue();
    }

    private final int zzp(int i) {
        return this.zzc[i + 2];
    }

    private final int zzq(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
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
        return ((Long) zzjq.zzf(obj, j)).longValue();
    }

    private final zzhm zzu(int i) {
        int i2 = i / 3;
        return (zzhm) this.zzd[i2 + i2 + 1];
    }

    private final zzix zzv(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzix zzixVar = (zzix) objArr[i3];
        if (zzixVar != null) {
            return zzixVar;
        }
        zzix zzb2 = zziu.zza().zzb((Class) objArr[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzw(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzx(Object obj, int i) {
        zzix zzv = zzv(i);
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
        zzix zzv = zzv(i2);
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
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder a = c.a("Field ", str, " for ", name, " not found. Known fields are ");
            a.append(arrays);
            throw new RuntimeException(a.toString());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.play_billing.zzix
    public final int zza(Object obj) {
        int i;
        int zzz;
        int zzA;
        int zzz2;
        int zzd;
        int zzz3;
        int zzh;
        int zzz4;
        int size;
        int zzl;
        int zzz5;
        int zzd2;
        boolean z;
        int zzb2;
        int i2;
        int zzz6;
        int zzz7;
        int size2;
        int zzk;
        int zzz8;
        int size3;
        int zzi;
        int zzz9;
        int i3;
        int zze;
        int zzz10;
        int zzz11;
        int zzz12;
        int zzA2;
        zzip<T> zzipVar = this;
        Object obj2 = obj;
        Unsafe unsafe = zzb;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < zzipVar.zzc.length) {
            int zzs = zzipVar.zzs(i6);
            int zzr = zzr(zzs);
            int[] iArr = zzipVar.zzc;
            int i9 = iArr[i6];
            int i10 = iArr[i6 + 2];
            int i11 = i10 & i4;
            if (zzr <= 17) {
                if (i11 != i5) {
                    i7 = i11 == i4 ? 0 : unsafe.getInt(obj2, i11);
                    i5 = i11;
                }
                i = 1 << (i10 >>> 20);
            } else {
                i = 0;
            }
            int i12 = zzs & i4;
            if (zzr >= zzhc.zzJ.zza()) {
                zzhc.zzW.zza();
            }
            long j = i12;
            switch (zzr) {
                case 0:
                    if (zzipVar.zzJ(obj2, i6, i5, i7, i)) {
                        i8 = androidx.core.graphics.a.a(i9 << 3, 8, i8);
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 1:
                    if (zzipVar.zzJ(obj2, i6, i5, i7, i)) {
                        i8 = androidx.core.graphics.a.a(i9 << 3, 4, i8);
                    }
                    zzipVar = this;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 2:
                    if (zzipVar.zzJ(obj2, i6, i5, i7, i)) {
                        long j2 = unsafe.getLong(obj2, j);
                        zzz = zzgr.zzz(i9 << 3);
                        zzA = zzgr.zzA(j2);
                        i8 += zzA + zzz;
                    }
                    zzipVar = this;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 3:
                    if (zzipVar.zzJ(obj2, i6, i5, i7, i)) {
                        long j3 = unsafe.getLong(obj2, j);
                        zzz = zzgr.zzz(i9 << 3);
                        zzA = zzgr.zzA(j3);
                        i8 += zzA + zzz;
                    }
                    zzipVar = this;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 4:
                    if (zzipVar.zzJ(obj2, i6, i5, i7, i)) {
                        long j4 = unsafe.getInt(obj2, j);
                        zzz = zzgr.zzz(i9 << 3);
                        zzA = zzgr.zzA(j4);
                        i8 += zzA + zzz;
                    }
                    zzipVar = this;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 5:
                    if (zzipVar.zzJ(obj2, i6, i5, i7, i)) {
                        i8 = androidx.core.graphics.a.a(i9 << 3, 8, i8);
                    }
                    zzipVar = this;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 6:
                    if (zzipVar.zzJ(obj2, i6, i5, i7, i)) {
                        i8 = androidx.core.graphics.a.a(i9 << 3, 4, i8);
                    }
                    zzipVar = this;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 7:
                    if (zzipVar.zzJ(obj2, i6, i5, i7, i)) {
                        i8 = androidx.core.graphics.a.a(i9 << 3, 1, i8);
                    }
                    zzipVar = this;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 8:
                    if (zzipVar.zzJ(obj2, i6, i5, i7, i)) {
                        int i13 = i9 << 3;
                        Object object = unsafe.getObject(obj2, j);
                        if (object instanceof zzgk) {
                            zzz2 = zzgr.zzz(i13);
                            zzd = ((zzgk) object).zzd();
                            zzz3 = zzgr.zzz(zzd);
                            i8 += zzz3 + zzd + zzz2;
                        } else {
                            zzz = zzgr.zzz(i13);
                            zzA = zzgr.zzy((String) object);
                            i8 += zzA + zzz;
                        }
                    }
                    zzipVar = this;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 9:
                    if (zzipVar.zzJ(obj2, i6, i5, i7, i)) {
                        zzh = zziz.zzh(i9, unsafe.getObject(obj2, j), zzipVar.zzv(i6));
                        i8 += zzh;
                        i6 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    } else {
                        i6 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                case 10:
                    if (zzipVar.zzJ(obj2, i6, i5, i7, i)) {
                        zzgk zzgkVar = (zzgk) unsafe.getObject(obj2, j);
                        zzz2 = zzgr.zzz(i9 << 3);
                        zzd = zzgkVar.zzd();
                        zzz3 = zzgr.zzz(zzd);
                        i8 += zzz3 + zzd + zzz2;
                    }
                    zzipVar = this;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 11:
                    if (zzipVar.zzJ(obj2, i6, i5, i7, i)) {
                        i8 = androidx.core.graphics.a.a(unsafe.getInt(obj2, j), zzgr.zzz(i9 << 3), i8);
                    }
                    zzipVar = this;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 12:
                    if (zzipVar.zzJ(obj2, i6, i5, i7, i)) {
                        long j5 = unsafe.getInt(obj2, j);
                        zzz = zzgr.zzz(i9 << 3);
                        zzA = zzgr.zzA(j5);
                        i8 += zzA + zzz;
                    }
                    zzipVar = this;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 13:
                    if (zzipVar.zzJ(obj2, i6, i5, i7, i)) {
                        i8 = androidx.core.graphics.a.a(i9 << 3, 4, i8);
                    }
                    zzipVar = this;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 14:
                    if (zzipVar.zzJ(obj2, i6, i5, i7, i)) {
                        i8 = androidx.core.graphics.a.a(i9 << 3, 8, i8);
                    }
                    zzipVar = this;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 15:
                    if (zzipVar.zzJ(obj2, i6, i5, i7, i)) {
                        int i14 = unsafe.getInt(obj2, j);
                        i8 = androidx.core.graphics.a.a((i14 >> 31) ^ (i14 + i14), zzgr.zzz(i9 << 3), i8);
                    }
                    zzipVar = this;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 16:
                    if (zzipVar.zzJ(obj2, i6, i5, i7, i)) {
                        long j6 = unsafe.getLong(obj2, j);
                        zzz = zzgr.zzz(i9 << 3);
                        zzA = zzgr.zzA((j6 >> 63) ^ (j6 + j6));
                        i8 += zzA + zzz;
                    }
                    zzipVar = this;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 17:
                    if (zzipVar.zzJ(obj2, i6, i5, i7, i)) {
                        i8 += zzgr.zzw(i9, (zzim) unsafe.getObject(obj2, j), zzipVar.zzv(i6));
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 18:
                    zzh = zziz.zzd(i9, (List) unsafe.getObject(obj2, j), false);
                    i8 += zzh;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 19:
                    zzh = zziz.zzb(i9, (List) unsafe.getObject(obj2, j), false);
                    i8 += zzh;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j);
                    int i15 = zziz.zza;
                    if (list.size() != 0) {
                        zzz4 = (zzgr.zzz(i9 << 3) * list.size()) + zziz.zzg(list);
                        i8 += zzz4;
                        i6 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzz4 = 0;
                    i8 += zzz4;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(obj2, j);
                    int i16 = zziz.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzl = zziz.zzl(list2);
                        zzz5 = zzgr.zzz(i9 << 3);
                        zzz4 = (zzz5 * size) + zzl;
                        i8 += zzz4;
                        i6 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzz4 = 0;
                    i8 += zzz4;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, j);
                    int i17 = zziz.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzl = zziz.zzf(list3);
                        zzz5 = zzgr.zzz(i9 << 3);
                        zzz4 = (zzz5 * size) + zzl;
                        i8 += zzz4;
                        i6 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzz4 = 0;
                    i8 += zzz4;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 23:
                    zzd2 = zziz.zzd(i9, (List) unsafe.getObject(obj2, j), false);
                    i8 += zzd2;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 24:
                    z = false;
                    zzb2 = zziz.zzb(i9, (List) unsafe.getObject(obj2, j), false);
                    i8 += zzb2;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, j);
                    int i18 = zziz.zza;
                    int size4 = list4.size();
                    if (size4 != 0) {
                        zzd2 = size4 * (zzgr.zzz(i9 << 3) + 1);
                        i8 += zzd2;
                        i6 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzd2 = 0;
                    i8 += zzd2;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 26:
                    List list5 = (List) unsafe.getObject(obj2, j);
                    int i19 = zziz.zza;
                    int size5 = list5.size();
                    if (size5 == 0) {
                        i2 = 0;
                    } else {
                        int zzz13 = zzgr.zzz(i9 << 3) * size5;
                        if (list5 instanceof zzhy) {
                            zzhy zzhyVar = (zzhy) list5;
                            i2 = zzz13;
                            for (int i20 = 0; i20 < size5; i20++) {
                                Object zzc = zzhyVar.zzc();
                                if (zzc instanceof zzgk) {
                                    int zzd3 = ((zzgk) zzc).zzd();
                                    i2 = androidx.core.graphics.a.a(zzd3, zzd3, i2);
                                } else {
                                    i2 = zzgr.zzy((String) zzc) + i2;
                                }
                            }
                        } else {
                            i2 = zzz13;
                            for (int i21 = 0; i21 < size5; i21++) {
                                Object obj3 = list5.get(i21);
                                if (obj3 instanceof zzgk) {
                                    int zzd4 = ((zzgk) obj3).zzd();
                                    i2 = androidx.core.graphics.a.a(zzd4, zzd4, i2);
                                } else {
                                    i2 = zzgr.zzy((String) obj3) + i2;
                                }
                            }
                        }
                    }
                    i8 += i2;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 27:
                    List list6 = (List) unsafe.getObject(obj2, j);
                    zzix zzv = zzipVar.zzv(i6);
                    int i22 = zziz.zza;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        zzz6 = 0;
                    } else {
                        zzz6 = zzgr.zzz(i9 << 3) * size6;
                        for (int i23 = 0; i23 < size6; i23++) {
                            Object obj4 = list6.get(i23);
                            if (obj4 instanceof zzhx) {
                                int zza2 = ((zzhx) obj4).zza();
                                zzz6 = androidx.core.graphics.a.a(zza2, zza2, zzz6);
                            } else {
                                zzz6 = zzgr.zzx((zzim) obj4, zzv) + zzz6;
                            }
                        }
                    }
                    i8 += zzz6;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, j);
                    int i24 = zziz.zza;
                    int size7 = list7.size();
                    if (size7 == 0) {
                        zzz7 = 0;
                    } else {
                        zzz7 = zzgr.zzz(i9 << 3) * size7;
                        for (int i25 = 0; i25 < list7.size(); i25++) {
                            int zzd5 = ((zzgk) list7.get(i25)).zzd();
                            zzz7 = androidx.core.graphics.a.a(zzd5, zzd5, zzz7);
                        }
                    }
                    i8 += zzz7;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j);
                    int i26 = zziz.zza;
                    size2 = list8.size();
                    if (size2 != 0) {
                        zzk = zziz.zzk(list8);
                        zzz8 = zzgr.zzz(i9 << 3);
                        zzd2 = zzk + (zzz8 * size2);
                        i8 += zzd2;
                        i6 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzd2 = 0;
                    i8 += zzd2;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 30:
                    List list9 = (List) unsafe.getObject(obj2, j);
                    int i27 = zziz.zza;
                    size2 = list9.size();
                    if (size2 != 0) {
                        zzk = zziz.zza(list9);
                        zzz8 = zzgr.zzz(i9 << 3);
                        zzd2 = zzk + (zzz8 * size2);
                        i8 += zzd2;
                        i6 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzd2 = 0;
                    i8 += zzd2;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 31:
                    zzd2 = zziz.zzb(i9, (List) unsafe.getObject(obj2, j), false);
                    i8 += zzd2;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 32:
                    z = false;
                    zzb2 = zziz.zzd(i9, (List) unsafe.getObject(obj2, j), false);
                    i8 += zzb2;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, j);
                    int i28 = zziz.zza;
                    size3 = list10.size();
                    if (size3 != 0) {
                        zzi = zziz.zzi(list10);
                        zzz9 = zzgr.zzz(i9 << 3);
                        i3 = (zzz9 * size3) + zzi;
                        i8 += i3;
                        i6 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i3 = 0;
                    i8 += i3;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 34:
                    List list11 = (List) unsafe.getObject(obj2, j);
                    int i29 = zziz.zza;
                    size3 = list11.size();
                    if (size3 != 0) {
                        zzi = zziz.zzj(list11);
                        zzz9 = zzgr.zzz(i9 << 3);
                        i3 = (zzz9 * size3) + zzi;
                        i8 += i3;
                        i6 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i3 = 0;
                    i8 += i3;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 35:
                    zze = zziz.zze((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzz10 = zzgr.zzz(i9 << 3);
                        zzz11 = zzgr.zzz(zze);
                        i8 += zzz11 + zzz10 + zze;
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 36:
                    zze = zziz.zzc((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzz10 = zzgr.zzz(i9 << 3);
                        zzz11 = zzgr.zzz(zze);
                        i8 += zzz11 + zzz10 + zze;
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 37:
                    zze = zziz.zzg((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzz10 = zzgr.zzz(i9 << 3);
                        zzz11 = zzgr.zzz(zze);
                        i8 += zzz11 + zzz10 + zze;
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 38:
                    zze = zziz.zzl((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzz10 = zzgr.zzz(i9 << 3);
                        zzz11 = zzgr.zzz(zze);
                        i8 += zzz11 + zzz10 + zze;
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 39:
                    zze = zziz.zzf((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzz10 = zzgr.zzz(i9 << 3);
                        zzz11 = zzgr.zzz(zze);
                        i8 += zzz11 + zzz10 + zze;
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 40:
                    zze = zziz.zze((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzz10 = zzgr.zzz(i9 << 3);
                        zzz11 = zzgr.zzz(zze);
                        i8 += zzz11 + zzz10 + zze;
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 41:
                    zze = zziz.zzc((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzz10 = zzgr.zzz(i9 << 3);
                        zzz11 = zzgr.zzz(zze);
                        i8 += zzz11 + zzz10 + zze;
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 42:
                    List list12 = (List) unsafe.getObject(obj2, j);
                    int i30 = zziz.zza;
                    zze = list12.size();
                    if (zze > 0) {
                        zzz10 = zzgr.zzz(i9 << 3);
                        zzz11 = zzgr.zzz(zze);
                        i8 += zzz11 + zzz10 + zze;
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 43:
                    zze = zziz.zzk((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzz10 = zzgr.zzz(i9 << 3);
                        zzz11 = zzgr.zzz(zze);
                        i8 += zzz11 + zzz10 + zze;
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 44:
                    zze = zziz.zza((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzz10 = zzgr.zzz(i9 << 3);
                        zzz11 = zzgr.zzz(zze);
                        i8 += zzz11 + zzz10 + zze;
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 45:
                    zze = zziz.zzc((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzz10 = zzgr.zzz(i9 << 3);
                        zzz11 = zzgr.zzz(zze);
                        i8 += zzz11 + zzz10 + zze;
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 46:
                    zze = zziz.zze((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzz10 = zzgr.zzz(i9 << 3);
                        zzz11 = zzgr.zzz(zze);
                        i8 += zzz11 + zzz10 + zze;
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 47:
                    zze = zziz.zzi((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzz10 = zzgr.zzz(i9 << 3);
                        zzz11 = zzgr.zzz(zze);
                        i8 += zzz11 + zzz10 + zze;
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 48:
                    zze = zziz.zzj((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzz10 = zzgr.zzz(i9 << 3);
                        zzz11 = zzgr.zzz(zze);
                        i8 += zzz11 + zzz10 + zze;
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    List list13 = (List) unsafe.getObject(obj2, j);
                    zzix zzv2 = zzipVar.zzv(i6);
                    int i31 = zziz.zza;
                    int size8 = list13.size();
                    if (size8 != 0) {
                        int i32 = 0;
                        for (int i33 = 0; i33 < size8; i33++) {
                            i32 += zzgr.zzw(i9, (zzim) list13.get(i33), zzv2);
                        }
                        i3 = i32;
                        i8 += i3;
                        i6 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i3 = 0;
                    i8 += i3;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 50:
                    zzig zzigVar = (zzig) unsafe.getObject(obj2, j);
                    if (!zzigVar.isEmpty()) {
                        Iterator it = zzigVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzipVar.zzM(obj2, i9, i6)) {
                        i8 = androidx.core.graphics.a.a(i9 << 3, 8, i8);
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 52:
                    if (zzipVar.zzM(obj2, i9, i6)) {
                        i8 = androidx.core.graphics.a.a(i9 << 3, 4, i8);
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 53:
                    if (zzipVar.zzM(obj2, i9, i6)) {
                        long zzt = zzt(obj2, j);
                        zzz12 = zzgr.zzz(i9 << 3);
                        zzA2 = zzgr.zzA(zzt);
                        i8 += zzA2 + zzz12;
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 54:
                    if (zzipVar.zzM(obj2, i9, i6)) {
                        long zzt2 = zzt(obj2, j);
                        zzz12 = zzgr.zzz(i9 << 3);
                        zzA2 = zzgr.zzA(zzt2);
                        i8 += zzA2 + zzz12;
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 55:
                    if (zzipVar.zzM(obj2, i9, i6)) {
                        long zzo = zzo(obj2, j);
                        zzz12 = zzgr.zzz(i9 << 3);
                        zzA2 = zzgr.zzA(zzo);
                        i8 += zzA2 + zzz12;
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 56:
                    if (zzipVar.zzM(obj2, i9, i6)) {
                        i8 = androidx.core.graphics.a.a(i9 << 3, 8, i8);
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 57:
                    if (zzipVar.zzM(obj2, i9, i6)) {
                        i8 = androidx.core.graphics.a.a(i9 << 3, 4, i8);
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 58:
                    if (zzipVar.zzM(obj2, i9, i6)) {
                        i8 = androidx.core.graphics.a.a(i9 << 3, 1, i8);
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 59:
                    if (zzipVar.zzM(obj2, i9, i6)) {
                        int i34 = i9 << 3;
                        Object object2 = unsafe.getObject(obj2, j);
                        if (object2 instanceof zzgk) {
                            zze = zzgr.zzz(i34);
                            zzz10 = ((zzgk) object2).zzd();
                            zzz11 = zzgr.zzz(zzz10);
                            i8 += zzz11 + zzz10 + zze;
                        } else {
                            zzz12 = zzgr.zzz(i34);
                            zzA2 = zzgr.zzy((String) object2);
                            i8 += zzA2 + zzz12;
                        }
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 60:
                    if (zzipVar.zzM(obj2, i9, i6)) {
                        zzd2 = zziz.zzh(i9, unsafe.getObject(obj2, j), zzipVar.zzv(i6));
                        i8 += zzd2;
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 61:
                    if (zzipVar.zzM(obj2, i9, i6)) {
                        zzgk zzgkVar2 = (zzgk) unsafe.getObject(obj2, j);
                        zze = zzgr.zzz(i9 << 3);
                        zzz10 = zzgkVar2.zzd();
                        zzz11 = zzgr.zzz(zzz10);
                        i8 += zzz11 + zzz10 + zze;
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 62:
                    if (zzipVar.zzM(obj2, i9, i6)) {
                        i8 = androidx.core.graphics.a.a(zzo(obj2, j), zzgr.zzz(i9 << 3), i8);
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 63:
                    if (zzipVar.zzM(obj2, i9, i6)) {
                        long zzo2 = zzo(obj2, j);
                        zzz12 = zzgr.zzz(i9 << 3);
                        zzA2 = zzgr.zzA(zzo2);
                        i8 += zzA2 + zzz12;
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 64:
                    if (zzipVar.zzM(obj2, i9, i6)) {
                        i8 = androidx.core.graphics.a.a(i9 << 3, 4, i8);
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 65:
                    if (zzipVar.zzM(obj2, i9, i6)) {
                        i8 = androidx.core.graphics.a.a(i9 << 3, 8, i8);
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 66:
                    if (zzipVar.zzM(obj2, i9, i6)) {
                        int zzo3 = zzo(obj2, j);
                        i8 = androidx.core.graphics.a.a((zzo3 >> 31) ^ (zzo3 + zzo3), zzgr.zzz(i9 << 3), i8);
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 67:
                    if (zzipVar.zzM(obj2, i9, i6)) {
                        long zzt3 = zzt(obj2, j);
                        zzz12 = zzgr.zzz(i9 << 3);
                        zzA2 = zzgr.zzA((zzt3 >> 63) ^ (zzt3 + zzt3));
                        i8 += zzA2 + zzz12;
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 68:
                    if (zzipVar.zzM(obj2, i9, i6)) {
                        i8 += zzgr.zzw(i9, (zzim) unsafe.getObject(obj2, j), zzipVar.zzv(i6));
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                default:
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
            }
        }
        int i35 = 0;
        int zza3 = ((zzhk) obj).zzc.zza() + i8;
        if (!zzipVar.zzh) {
            return zza3;
        }
        zzhb zzhbVar = ((zzhh) obj).zzb;
        int zzc2 = zzhbVar.zza.zzc();
        for (int i36 = 0; i36 < zzc2; i36++) {
            Map.Entry zzg = zzhbVar.zza.zzg(i36);
            i35 += zzhb.zzb((zzha) ((zzjb) zzg).zza(), zzg.getValue());
        }
        for (Map.Entry entry2 : zzhbVar.zza.zzd()) {
            i35 += zzhb.zzb((zzha) entry2.getKey(), entry2.getValue());
        }
        return zza3 + i35;
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final int zzb(Object obj) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int zzc;
        int i3;
        int i4 = 0;
        for (int i5 = 0; i5 < this.zzc.length; i5 += 3) {
            int zzs = zzs(i5);
            int[] iArr = this.zzc;
            int i6 = 1048575 & zzs;
            int zzr = zzr(zzs);
            int i7 = iArr[i5];
            long j = i6;
            int i8 = 37;
            switch (zzr) {
                case 0:
                    i = i4 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzjq.zza(obj, j));
                    byte[] bArr = zzhp.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + zzc;
                    break;
                case 1:
                    i2 = i4 * 53;
                    floatToIntBits = Float.floatToIntBits(zzjq.zzb(obj, j));
                    i4 = floatToIntBits + i2;
                    break;
                case 2:
                    i = i4 * 53;
                    doubleToLongBits = zzjq.zzd(obj, j);
                    byte[] bArr2 = zzhp.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + zzc;
                    break;
                case 3:
                    i = i4 * 53;
                    doubleToLongBits = zzjq.zzd(obj, j);
                    byte[] bArr3 = zzhp.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + zzc;
                    break;
                case 4:
                    i = i4 * 53;
                    zzc = zzjq.zzc(obj, j);
                    i4 = i + zzc;
                    break;
                case 5:
                    i = i4 * 53;
                    doubleToLongBits = zzjq.zzd(obj, j);
                    byte[] bArr4 = zzhp.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + zzc;
                    break;
                case 6:
                    i = i4 * 53;
                    zzc = zzjq.zzc(obj, j);
                    i4 = i + zzc;
                    break;
                case 7:
                    i2 = i4 * 53;
                    floatToIntBits = zzhp.zza(zzjq.zzw(obj, j));
                    i4 = floatToIntBits + i2;
                    break;
                case 8:
                    i2 = i4 * 53;
                    floatToIntBits = ((String) zzjq.zzf(obj, j)).hashCode();
                    i4 = floatToIntBits + i2;
                    break;
                case 9:
                    i3 = i4 * 53;
                    Object zzf = zzjq.zzf(obj, j);
                    if (zzf != null) {
                        i8 = zzf.hashCode();
                    }
                    i4 = i3 + i8;
                    break;
                case 10:
                    i2 = i4 * 53;
                    floatToIntBits = zzjq.zzf(obj, j).hashCode();
                    i4 = floatToIntBits + i2;
                    break;
                case 11:
                    i = i4 * 53;
                    zzc = zzjq.zzc(obj, j);
                    i4 = i + zzc;
                    break;
                case 12:
                    i = i4 * 53;
                    zzc = zzjq.zzc(obj, j);
                    i4 = i + zzc;
                    break;
                case 13:
                    i = i4 * 53;
                    zzc = zzjq.zzc(obj, j);
                    i4 = i + zzc;
                    break;
                case 14:
                    i = i4 * 53;
                    doubleToLongBits = zzjq.zzd(obj, j);
                    byte[] bArr5 = zzhp.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + zzc;
                    break;
                case 15:
                    i = i4 * 53;
                    zzc = zzjq.zzc(obj, j);
                    i4 = i + zzc;
                    break;
                case 16:
                    i = i4 * 53;
                    doubleToLongBits = zzjq.zzd(obj, j);
                    byte[] bArr6 = zzhp.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + zzc;
                    break;
                case 17:
                    i3 = i4 * 53;
                    Object zzf2 = zzjq.zzf(obj, j);
                    if (zzf2 != null) {
                        i8 = zzf2.hashCode();
                    }
                    i4 = i3 + i8;
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
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    i2 = i4 * 53;
                    floatToIntBits = zzjq.zzf(obj, j).hashCode();
                    i4 = floatToIntBits + i2;
                    break;
                case 50:
                    i2 = i4 * 53;
                    floatToIntBits = zzjq.zzf(obj, j).hashCode();
                    i4 = floatToIntBits + i2;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzm(obj, j));
                        byte[] bArr7 = zzhp.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = Float.floatToIntBits(zzn(obj, j));
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr8 = zzhp.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr9 = zzhp.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        zzc = zzo(obj, j);
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr10 = zzhp.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        zzc = zzo(obj, j);
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzhp.zza(zzN(obj, j));
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = ((String) zzjq.zzf(obj, j)).hashCode();
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzjq.zzf(obj, j).hashCode();
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzjq.zzf(obj, j).hashCode();
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        zzc = zzo(obj, j);
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        zzc = zzo(obj, j);
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        zzc = zzo(obj, j);
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr11 = zzhp.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        zzc = zzo(obj, j);
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr12 = zzhp.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzjq.zzf(obj, j).hashCode();
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = ((zzhk) obj).zzc.hashCode() + (i4 * 53);
        return this.zzh ? (hashCode * 53) + ((zzhh) obj).zzb.zza.hashCode() : hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0eb0, code lost:
    
        if (r9 == 1048575) goto L593;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0eb2, code lost:
    
        r20.putInt(r2, r9, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0eb8, code lost:
    
        r1 = r12.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0ebc, code lost:
    
        if (r1 >= r12.zzk) goto L713;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0ebe, code lost:
    
        r3 = r12.zzi;
        r6 = r12.zzc;
        r3 = r3[r1];
        r6 = r6[r3];
        r6 = com.google.android.gms.internal.play_billing.zzjq.zzf(r2, r12.zzs(r3) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0ed4, code lost:
    
        if (r6 != null) goto L599;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0edb, code lost:
    
        if (r12.zzu(r3) != null) goto L712;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0ee0, code lost:
    
        r6 = (com.google.android.gms.internal.play_billing.zzig) r6;
        r0 = (com.google.android.gms.internal.play_billing.zzif) r12.zzw(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0ee8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0edd, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0eeb, code lost:
    
        if (r0 != 0) goto L610;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0eed, code lost:
    
        if (r5 != r4) goto L608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0ef5, code lost:
    
        throw new com.google.android.gms.internal.play_billing.zzhr("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0efa, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0ef6, code lost:
    
        if (r5 > r4) goto L613;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0ef8, code lost:
    
        if (r15 != r0) goto L613;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0f00, code lost:
    
        throw new com.google.android.gms.internal.play_billing.zzhr("Failed to parse the message.");
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0ba8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0bbc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0e2e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0e43 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0e4a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:640:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0e5e  */
    /* JADX WARN: Removed duplicated region for block: B:770:0x0052 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzc(Object obj, byte[] bArr, int i, int i2, int i3, zzfz zzfzVar) throws IOException {
        zzip<T> zzipVar;
        Unsafe unsafe;
        int i4;
        int zzq;
        zzfz zzfzVar2;
        int i5;
        int i6;
        int i7;
        int i8;
        Object obj2;
        byte[] bArr2;
        int i9;
        int i10;
        int i11;
        int zzg;
        int i12;
        int i13;
        Unsafe unsafe2;
        Object obj3;
        zzfz zzfzVar3;
        int i14;
        int i15;
        int i16;
        byte[] bArr3;
        int i17;
        int i18;
        int i19;
        int i20;
        zzfz zzfzVar4;
        int i21;
        Unsafe unsafe3;
        Object obj4;
        byte[] bArr4;
        Object obj5;
        int i22;
        int zzh;
        int i23;
        int i24;
        int i25;
        byte[] bArr5;
        int i26;
        int i27;
        zzfz zzfzVar5;
        int i28;
        int i29;
        int i30;
        zzfz zzfzVar6;
        int i31;
        int i32;
        int i33;
        int zzh2;
        int i34;
        int i35;
        int i36;
        zzho zzhoVar;
        int zzj;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int zzh3;
        int zzh4;
        int i42;
        int i43;
        int i44;
        byte[] bArr6;
        int i45;
        zzip<T> zzipVar2 = this;
        Object obj6 = obj;
        byte[] bArr7 = bArr;
        int i46 = i2;
        zzfz zzfzVar7 = zzfzVar;
        zzA(obj6);
        Unsafe unsafe4 = zzb;
        int i47 = 0;
        int i48 = -1;
        int i49 = i;
        int i50 = 0;
        int i51 = 0;
        int i52 = 0;
        int i53 = -1;
        int i54 = 1048575;
        while (true) {
            if (i49 < i46) {
                int i55 = i49 + 1;
                int i56 = bArr7[i49];
                if (i56 < 0) {
                    i55 = zzga.zzi(i56, bArr7, i55, zzfzVar7);
                    i56 = zzfzVar7.zza;
                }
                int i57 = i55;
                i52 = i56;
                int i58 = i52 >>> 3;
                if (i58 > i53) {
                    int i59 = i50 / 3;
                    if (i58 >= zzipVar2.zze && i58 <= zzipVar2.zzf) {
                        zzq = zzipVar2.zzq(i58, i59);
                        if (zzq != i48) {
                            zzfzVar2 = zzfzVar;
                            zzipVar = zzipVar2;
                            unsafe = unsafe4;
                            i5 = i54;
                            i50 = i47;
                            i6 = i50;
                            i7 = i51;
                            i8 = i52;
                            i4 = i3;
                            obj2 = obj6;
                            bArr2 = bArr7;
                            i9 = i58;
                            i10 = i57;
                        } else {
                            int i60 = i52 & 7;
                            int[] iArr = zzipVar2.zzc;
                            int i61 = iArr[zzq + 1];
                            int zzr = zzr(i61);
                            long j = i61 & 1048575;
                            if (zzr <= 17) {
                                int i62 = iArr[zzq + 2];
                                int i63 = 1 << (i62 >>> 20);
                                int i64 = i62 & 1048575;
                                if (i64 != i54) {
                                    int i65 = 1048575;
                                    i12 = zzr;
                                    if (i54 != 1048575) {
                                        unsafe4.putInt(obj6, i54, i51);
                                        i65 = 1048575;
                                    }
                                    int i66 = i64 == i65 ? 0 : unsafe4.getInt(obj6, i64);
                                    i13 = i64;
                                    i51 = i66;
                                } else {
                                    i12 = zzr;
                                    i13 = i54;
                                }
                                switch (i12) {
                                    case 0:
                                        i17 = zzq;
                                        i18 = i13;
                                        i15 = i58;
                                        bArr3 = bArr;
                                        zzfzVar4 = zzfzVar;
                                        i19 = i51;
                                        i20 = i52;
                                        obj2 = obj6;
                                        i21 = i57;
                                        if (i60 != 1) {
                                            i5 = i18;
                                            i10 = i21;
                                            bArr2 = bArr3;
                                            i50 = i17;
                                            zzfzVar2 = zzfzVar4;
                                            i9 = i15;
                                            i8 = i20;
                                            i7 = i19;
                                            i6 = 0;
                                            zzipVar = zzipVar2;
                                            unsafe = unsafe4;
                                            i4 = i3;
                                            break;
                                        } else {
                                            i49 = i21 + 8;
                                            i51 = i19 | i63;
                                            zzjq.zzo(obj2, j, Double.longBitsToDouble(zzga.zzn(bArr3, i21)));
                                            i54 = i18;
                                            i46 = i2;
                                            bArr7 = bArr3;
                                            i50 = i17;
                                            zzfzVar7 = zzfzVar4;
                                            i53 = i15;
                                            obj6 = obj2;
                                            i52 = i20;
                                            i47 = 0;
                                            i48 = -1;
                                        }
                                    case 1:
                                        i17 = zzq;
                                        i18 = i13;
                                        i15 = i58;
                                        bArr3 = bArr;
                                        zzfzVar4 = zzfzVar;
                                        i19 = i51;
                                        i20 = i52;
                                        obj2 = obj6;
                                        i21 = i57;
                                        if (i60 != 5) {
                                            i5 = i18;
                                            i10 = i21;
                                            bArr2 = bArr3;
                                            i50 = i17;
                                            zzfzVar2 = zzfzVar4;
                                            i9 = i15;
                                            i8 = i20;
                                            i7 = i19;
                                            i6 = 0;
                                            zzipVar = zzipVar2;
                                            unsafe = unsafe4;
                                            i4 = i3;
                                            break;
                                        } else {
                                            i49 = i21 + 4;
                                            i51 = i19 | i63;
                                            zzjq.zzp(obj2, j, Float.intBitsToFloat(zzga.zzb(bArr3, i21)));
                                            i54 = i18;
                                            i46 = i2;
                                            bArr7 = bArr3;
                                            i50 = i17;
                                            zzfzVar7 = zzfzVar4;
                                            i53 = i15;
                                            obj6 = obj2;
                                            i52 = i20;
                                            i47 = 0;
                                            i48 = -1;
                                        }
                                    case 2:
                                    case 3:
                                        unsafe3 = unsafe4;
                                        obj4 = obj6;
                                        i17 = zzq;
                                        i18 = i13;
                                        i15 = i58;
                                        i21 = i57;
                                        bArr3 = bArr;
                                        zzfzVar4 = zzfzVar;
                                        i19 = i51;
                                        i20 = i52;
                                        if (i60 != 0) {
                                            obj2 = obj4;
                                            unsafe4 = unsafe3;
                                            i5 = i18;
                                            i10 = i21;
                                            bArr2 = bArr3;
                                            i50 = i17;
                                            zzfzVar2 = zzfzVar4;
                                            i9 = i15;
                                            i8 = i20;
                                            i7 = i19;
                                            i6 = 0;
                                            zzipVar = zzipVar2;
                                            unsafe = unsafe4;
                                            i4 = i3;
                                            break;
                                        } else {
                                            i51 = i19 | i63;
                                            int zzk = zzga.zzk(bArr3, i21, zzfzVar4);
                                            obj6 = obj4;
                                            unsafe4 = unsafe3;
                                            unsafe4.putLong(obj6, j, zzfzVar4.zzb);
                                            i54 = i18;
                                            i46 = i2;
                                            bArr7 = bArr3;
                                            i49 = zzk;
                                            i50 = i17;
                                            zzfzVar7 = zzfzVar4;
                                            i53 = i15;
                                            i52 = i20;
                                            i47 = 0;
                                            i48 = -1;
                                        }
                                    case 4:
                                    case 11:
                                        unsafe3 = unsafe4;
                                        obj4 = obj6;
                                        i17 = zzq;
                                        i18 = i13;
                                        i15 = i58;
                                        i21 = i57;
                                        bArr3 = bArr;
                                        zzfzVar4 = zzfzVar;
                                        i19 = i51;
                                        i20 = i52;
                                        if (i60 != 0) {
                                            obj2 = obj4;
                                            unsafe4 = unsafe3;
                                            i5 = i18;
                                            i10 = i21;
                                            bArr2 = bArr3;
                                            i50 = i17;
                                            zzfzVar2 = zzfzVar4;
                                            i9 = i15;
                                            i8 = i20;
                                            i7 = i19;
                                            i6 = 0;
                                            zzipVar = zzipVar2;
                                            unsafe = unsafe4;
                                            i4 = i3;
                                            break;
                                        } else {
                                            i51 = i19 | i63;
                                            i49 = zzga.zzh(bArr3, i21, zzfzVar4);
                                            unsafe3.putInt(obj4, j, zzfzVar4.zza);
                                            i46 = i2;
                                            obj6 = obj4;
                                            bArr7 = bArr3;
                                            unsafe4 = unsafe3;
                                            i50 = i17;
                                            zzfzVar7 = zzfzVar4;
                                            i53 = i15;
                                            i52 = i20;
                                            i47 = 0;
                                            i48 = -1;
                                            i54 = i18;
                                        }
                                    case 5:
                                    case 14:
                                        unsafe3 = unsafe4;
                                        i17 = zzq;
                                        i18 = i13;
                                        i15 = i58;
                                        Object obj7 = obj6;
                                        i21 = i57;
                                        i19 = i51;
                                        i20 = i52;
                                        if (i60 != 1) {
                                            bArr3 = bArr;
                                            obj4 = obj7;
                                            zzfzVar4 = zzfzVar;
                                            obj2 = obj4;
                                            unsafe4 = unsafe3;
                                            i5 = i18;
                                            i10 = i21;
                                            bArr2 = bArr3;
                                            i50 = i17;
                                            zzfzVar2 = zzfzVar4;
                                            i9 = i15;
                                            i8 = i20;
                                            i7 = i19;
                                            i6 = 0;
                                            zzipVar = zzipVar2;
                                            unsafe = unsafe4;
                                            i4 = i3;
                                            break;
                                        } else {
                                            int i67 = i21 + 8;
                                            int i68 = i19 | i63;
                                            long zzn = zzga.zzn(bArr, i21);
                                            zzfzVar4 = zzfzVar;
                                            obj6 = obj7;
                                            unsafe4 = unsafe3;
                                            unsafe4.putLong(obj6, j, zzn);
                                            i54 = i18;
                                            i46 = i2;
                                            bArr7 = bArr;
                                            i49 = i67;
                                            i50 = i17;
                                            i51 = i68;
                                            zzfzVar7 = zzfzVar4;
                                            i53 = i15;
                                            i52 = i20;
                                            i47 = 0;
                                            i48 = -1;
                                        }
                                    case 6:
                                    case 13:
                                        zzfzVar7 = zzfzVar;
                                        unsafe3 = unsafe4;
                                        i17 = zzq;
                                        i18 = i13;
                                        i15 = i58;
                                        bArr4 = bArr;
                                        obj5 = obj6;
                                        i21 = i57;
                                        i19 = i51;
                                        i20 = i52;
                                        if (i60 != 5) {
                                            zzfzVar4 = zzfzVar7;
                                            obj2 = obj5;
                                            bArr3 = bArr4;
                                            unsafe4 = unsafe3;
                                            i5 = i18;
                                            i10 = i21;
                                            bArr2 = bArr3;
                                            i50 = i17;
                                            zzfzVar2 = zzfzVar4;
                                            i9 = i15;
                                            i8 = i20;
                                            i7 = i19;
                                            i6 = 0;
                                            zzipVar = zzipVar2;
                                            unsafe = unsafe4;
                                            i4 = i3;
                                            break;
                                        } else {
                                            i49 = i21 + 4;
                                            i22 = i19 | i63;
                                            unsafe3.putInt(obj5, j, zzga.zzb(bArr4, i21));
                                            i46 = i2;
                                            i51 = i22;
                                            obj6 = obj5;
                                            i50 = i17;
                                            i53 = i15;
                                            i52 = i20;
                                            i47 = 0;
                                            i48 = -1;
                                            bArr7 = bArr4;
                                            unsafe4 = unsafe3;
                                            i54 = i18;
                                        }
                                    case 7:
                                        zzfzVar7 = zzfzVar;
                                        unsafe3 = unsafe4;
                                        i18 = i13;
                                        i15 = i58;
                                        bArr4 = bArr;
                                        int i69 = zzq;
                                        obj5 = obj6;
                                        i21 = i57;
                                        i19 = i51;
                                        i20 = i52;
                                        if (i60 != 0) {
                                            i17 = i69;
                                            zzfzVar4 = zzfzVar7;
                                            obj2 = obj5;
                                            bArr3 = bArr4;
                                            unsafe4 = unsafe3;
                                            i5 = i18;
                                            i10 = i21;
                                            bArr2 = bArr3;
                                            i50 = i17;
                                            zzfzVar2 = zzfzVar4;
                                            i9 = i15;
                                            i8 = i20;
                                            i7 = i19;
                                            i6 = 0;
                                            zzipVar = zzipVar2;
                                            unsafe = unsafe4;
                                            i4 = i3;
                                            break;
                                        } else {
                                            i22 = i19 | i63;
                                            i49 = zzga.zzk(bArr4, i21, zzfzVar7);
                                            i17 = i69;
                                            zzjq.zzm(obj5, j, zzfzVar7.zzb != 0);
                                            i46 = i2;
                                            i51 = i22;
                                            obj6 = obj5;
                                            i50 = i17;
                                            i53 = i15;
                                            i52 = i20;
                                            i47 = 0;
                                            i48 = -1;
                                            bArr7 = bArr4;
                                            unsafe4 = unsafe3;
                                            i54 = i18;
                                        }
                                    case 8:
                                        zzfzVar7 = zzfzVar;
                                        unsafe3 = unsafe4;
                                        i18 = i13;
                                        i15 = i58;
                                        int i70 = zzq;
                                        Object obj8 = obj6;
                                        i21 = i57;
                                        i19 = i51;
                                        i20 = i52;
                                        if (i60 != 2) {
                                            obj2 = obj8;
                                            i17 = i70;
                                            bArr3 = bArr;
                                            zzfzVar4 = zzfzVar7;
                                            unsafe4 = unsafe3;
                                            i5 = i18;
                                            i10 = i21;
                                            bArr2 = bArr3;
                                            i50 = i17;
                                            zzfzVar2 = zzfzVar4;
                                            i9 = i15;
                                            i8 = i20;
                                            i7 = i19;
                                            i6 = 0;
                                            zzipVar = zzipVar2;
                                            unsafe = unsafe4;
                                            i4 = i3;
                                            break;
                                        } else {
                                            if ((i61 & 536870912) != 0) {
                                                int i71 = i19 | i63;
                                                zzh = zzga.zzh(bArr, i21, zzfzVar7);
                                                int i72 = zzfzVar7.zza;
                                                if (i72 < 0) {
                                                    throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i72 == 0) {
                                                    zzfzVar7.zzc = "";
                                                    i23 = i71;
                                                    i47 = 0;
                                                } else {
                                                    int i73 = zzjt.zza;
                                                    int length = bArr.length;
                                                    if ((((length - zzh) - i72) | zzh | i72) < 0) {
                                                        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(zzh), Integer.valueOf(i72)));
                                                    }
                                                    int i74 = zzh + i72;
                                                    char[] cArr = new char[i72];
                                                    int i75 = 0;
                                                    while (zzh < i74) {
                                                        byte b = bArr[zzh];
                                                        if (zzjr.zzd(b)) {
                                                            zzh++;
                                                            cArr[i75] = (char) b;
                                                            i75++;
                                                        } else {
                                                            while (zzh < i74) {
                                                                int i76 = zzh + 1;
                                                                int i77 = zzh;
                                                                byte b2 = bArr[i77];
                                                                if (zzjr.zzd(b2)) {
                                                                    int i78 = i75 + 1;
                                                                    cArr[i75] = (char) b2;
                                                                    zzh = i76;
                                                                    while (true) {
                                                                        i75 = i78;
                                                                        if (zzh < i74) {
                                                                            byte b3 = bArr[zzh];
                                                                            if (zzjr.zzd(b3)) {
                                                                                zzh++;
                                                                                i78 = i75 + 1;
                                                                                cArr[i75] = (char) b3;
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    int i79 = i71;
                                                                    if (b2 >= -32) {
                                                                        if (b2 >= -16) {
                                                                            i24 = i74;
                                                                            if (i76 >= i24 - 2) {
                                                                                throw new zzhr("Protocol message had invalid UTF-8.");
                                                                            }
                                                                            char[] cArr2 = cArr;
                                                                            zzjr.zza(b2, bArr[i76], bArr[i77 + 2], bArr[i77 + 3], cArr2, i75);
                                                                            i75 += 2;
                                                                            cArr = cArr2;
                                                                            zzh = i77 + 4;
                                                                        } else {
                                                                            if (i76 >= i74 - 1) {
                                                                                throw new zzhr("Protocol message had invalid UTF-8.");
                                                                            }
                                                                            i24 = i74;
                                                                            zzjr.zzb(b2, bArr[i76], bArr[i77 + 2], cArr, i75);
                                                                            i75++;
                                                                            zzh = i77 + 3;
                                                                        }
                                                                        i71 = i79;
                                                                        i74 = i24;
                                                                    } else {
                                                                        if (i76 >= i74) {
                                                                            throw new zzhr("Protocol message had invalid UTF-8.");
                                                                        }
                                                                        zzjr.zzc(b2, bArr[i76], cArr, i75);
                                                                        i75++;
                                                                        zzh = i77 + 2;
                                                                        i71 = i79;
                                                                    }
                                                                }
                                                            }
                                                            i23 = i71;
                                                            i47 = 0;
                                                            zzfzVar7.zzc = new String(cArr, 0, i75);
                                                            zzh = i74;
                                                        }
                                                    }
                                                    while (zzh < i74) {
                                                    }
                                                    i23 = i71;
                                                    i47 = 0;
                                                    zzfzVar7.zzc = new String(cArr, 0, i75);
                                                    zzh = i74;
                                                }
                                            } else {
                                                i47 = 0;
                                                zzh = zzga.zzh(bArr, i21, zzfzVar7);
                                                int i80 = zzfzVar7.zza;
                                                if (i80 < 0) {
                                                    throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                int i81 = i19 | i63;
                                                if (i80 == 0) {
                                                    zzfzVar7.zzc = "";
                                                } else {
                                                    zzfzVar7.zzc = new String(bArr, zzh, i80, zzhp.zza);
                                                    zzh += i80;
                                                }
                                                i23 = i81;
                                            }
                                            i49 = zzh;
                                            unsafe3.putObject(obj8, j, zzfzVar7.zzc);
                                            i46 = i2;
                                            bArr7 = bArr;
                                            obj6 = obj8;
                                            unsafe4 = unsafe3;
                                            i50 = i70;
                                            i53 = i15;
                                            i51 = i23;
                                            i52 = i20;
                                            i48 = -1;
                                            i54 = i18;
                                        }
                                        break;
                                    case 9:
                                        Object obj9 = obj6;
                                        Unsafe unsafe5 = unsafe4;
                                        int i82 = zzq;
                                        i15 = i58;
                                        if (i60 != 2) {
                                            obj5 = obj9;
                                            bArr4 = bArr;
                                            zzfzVar7 = zzfzVar;
                                            unsafe3 = unsafe5;
                                            i21 = i57;
                                            i17 = i82;
                                            i18 = i13;
                                            i19 = i51;
                                            i20 = i52;
                                            zzfzVar4 = zzfzVar7;
                                            obj2 = obj5;
                                            bArr3 = bArr4;
                                            unsafe4 = unsafe3;
                                            i5 = i18;
                                            i10 = i21;
                                            bArr2 = bArr3;
                                            i50 = i17;
                                            zzfzVar2 = zzfzVar4;
                                            i9 = i15;
                                            i8 = i20;
                                            i7 = i19;
                                            i6 = 0;
                                            zzipVar = zzipVar2;
                                            unsafe = unsafe4;
                                            i4 = i3;
                                            break;
                                        } else {
                                            i51 |= i63;
                                            Object zzx = zzipVar2.zzx(obj9, i82);
                                            zzfzVar7 = zzfzVar;
                                            i50 = i82;
                                            int zzm = zzga.zzm(zzx, zzipVar2.zzv(i82), bArr, i57, i2, zzfzVar7);
                                            zzipVar2.zzF(obj9, i50, zzx);
                                            i46 = i2;
                                            bArr7 = bArr;
                                            i49 = zzm;
                                            obj6 = obj9;
                                            unsafe4 = unsafe5;
                                            i54 = i13;
                                            i53 = i15;
                                            i47 = 0;
                                            i48 = -1;
                                        }
                                    case 10:
                                        Object obj10 = obj6;
                                        unsafe2 = unsafe4;
                                        obj3 = obj10;
                                        zzfzVar3 = zzfzVar;
                                        i14 = zzq;
                                        i15 = i58;
                                        i16 = i57;
                                        bArr3 = bArr;
                                        if (i60 != 2) {
                                            i17 = i14;
                                            i18 = i13;
                                            i19 = i51;
                                            i20 = i52;
                                            obj2 = obj3;
                                            unsafe4 = unsafe2;
                                            i21 = i16;
                                            zzfzVar4 = zzfzVar3;
                                            i5 = i18;
                                            i10 = i21;
                                            bArr2 = bArr3;
                                            i50 = i17;
                                            zzfzVar2 = zzfzVar4;
                                            i9 = i15;
                                            i8 = i20;
                                            i7 = i19;
                                            i6 = 0;
                                            zzipVar = zzipVar2;
                                            unsafe = unsafe4;
                                            i4 = i3;
                                            break;
                                        } else {
                                            i51 |= i63;
                                            int zza2 = zzga.zza(bArr3, i16, zzfzVar3);
                                            unsafe2.putObject(obj3, j, zzfzVar3.zzc);
                                            obj6 = obj3;
                                            unsafe4 = unsafe2;
                                            i50 = i14;
                                            i49 = zza2;
                                            bArr7 = bArr3;
                                            zzfzVar7 = zzfzVar3;
                                            i54 = i13;
                                            i53 = i15;
                                            i47 = 0;
                                            i48 = -1;
                                            i46 = i2;
                                        }
                                    case 12:
                                        Object obj11 = obj6;
                                        unsafe2 = unsafe4;
                                        obj3 = obj11;
                                        zzfzVar3 = zzfzVar;
                                        i14 = zzq;
                                        i15 = i58;
                                        i16 = i57;
                                        bArr3 = bArr;
                                        if (i60 != 0) {
                                            i17 = i14;
                                            i18 = i13;
                                            i19 = i51;
                                            i20 = i52;
                                            obj2 = obj3;
                                            unsafe4 = unsafe2;
                                            i21 = i16;
                                            zzfzVar4 = zzfzVar3;
                                            i5 = i18;
                                            i10 = i21;
                                            bArr2 = bArr3;
                                            i50 = i17;
                                            zzfzVar2 = zzfzVar4;
                                            i9 = i15;
                                            i8 = i20;
                                            i7 = i19;
                                            i6 = 0;
                                            zzipVar = zzipVar2;
                                            unsafe = unsafe4;
                                            i4 = i3;
                                            break;
                                        } else {
                                            int zzh5 = zzga.zzh(bArr3, i16, zzfzVar3);
                                            int i83 = zzfzVar3.zza;
                                            zzhm zzu = zzipVar2.zzu(i14);
                                            if ((i61 & Integer.MIN_VALUE) == 0 || zzu == null || zzu.zza(i83)) {
                                                i51 |= i63;
                                                unsafe2.putInt(obj3, j, i83);
                                            } else {
                                                zzd(obj3).zzj(i52, Long.valueOf(i83));
                                            }
                                            obj6 = obj3;
                                            unsafe4 = unsafe2;
                                            i49 = zzh5;
                                            i46 = i2;
                                            i50 = i14;
                                            bArr7 = bArr3;
                                            zzfzVar7 = zzfzVar3;
                                            i54 = i13;
                                            i53 = i15;
                                            i47 = 0;
                                            i48 = -1;
                                        }
                                    case 15:
                                        Object obj12 = obj6;
                                        unsafe2 = unsafe4;
                                        obj3 = obj12;
                                        zzfzVar3 = zzfzVar;
                                        i25 = zzq;
                                        i15 = i58;
                                        i16 = i57;
                                        bArr3 = bArr;
                                        if (i60 != 0) {
                                            i17 = i25;
                                            i18 = i13;
                                            i19 = i51;
                                            i20 = i52;
                                            obj2 = obj3;
                                            unsafe4 = unsafe2;
                                            i21 = i16;
                                            zzfzVar4 = zzfzVar3;
                                            i5 = i18;
                                            i10 = i21;
                                            bArr2 = bArr3;
                                            i50 = i17;
                                            zzfzVar2 = zzfzVar4;
                                            i9 = i15;
                                            i8 = i20;
                                            i7 = i19;
                                            i6 = 0;
                                            zzipVar = zzipVar2;
                                            unsafe = unsafe4;
                                            i4 = i3;
                                            break;
                                        } else {
                                            i51 |= i63;
                                            int zzh6 = zzga.zzh(bArr3, i16, zzfzVar3);
                                            unsafe2.putInt(obj3, j, zzgn.zzb(zzfzVar3.zza));
                                            obj6 = obj3;
                                            unsafe4 = unsafe2;
                                            i46 = i2;
                                            i49 = zzh6;
                                            bArr7 = bArr3;
                                            zzfzVar7 = zzfzVar3;
                                            i50 = i25;
                                            i54 = i13;
                                            i53 = i15;
                                            i47 = 0;
                                            i48 = -1;
                                        }
                                    case 16:
                                        zzfzVar3 = zzfzVar;
                                        i25 = zzq;
                                        i15 = i58;
                                        i16 = i57;
                                        bArr3 = bArr;
                                        if (i60 != 0) {
                                            Object obj13 = obj6;
                                            unsafe2 = unsafe4;
                                            obj3 = obj13;
                                            i17 = i25;
                                            i18 = i13;
                                            i19 = i51;
                                            i20 = i52;
                                            obj2 = obj3;
                                            unsafe4 = unsafe2;
                                            i21 = i16;
                                            zzfzVar4 = zzfzVar3;
                                            i5 = i18;
                                            i10 = i21;
                                            bArr2 = bArr3;
                                            i50 = i17;
                                            zzfzVar2 = zzfzVar4;
                                            i9 = i15;
                                            i8 = i20;
                                            i7 = i19;
                                            i6 = 0;
                                            zzipVar = zzipVar2;
                                            unsafe = unsafe4;
                                            i4 = i3;
                                            break;
                                        } else {
                                            i51 |= i63;
                                            int zzk2 = zzga.zzk(bArr3, i16, zzfzVar3);
                                            unsafe4.putLong(obj6, j, zzgn.zzc(zzfzVar3.zzb));
                                            obj6 = obj6;
                                            unsafe4 = unsafe4;
                                            i46 = i2;
                                            bArr7 = bArr3;
                                            i49 = zzk2;
                                            zzfzVar7 = zzfzVar3;
                                            i50 = i25;
                                            i54 = i13;
                                            i53 = i15;
                                            i47 = 0;
                                            i48 = -1;
                                        }
                                    default:
                                        if (i60 != 3) {
                                            i15 = i58;
                                            i17 = zzq;
                                            i18 = i13;
                                            i19 = i51;
                                            i20 = i52;
                                            bArr3 = bArr;
                                            zzfzVar4 = zzfzVar;
                                            obj2 = obj6;
                                            i21 = i57;
                                            i5 = i18;
                                            i10 = i21;
                                            bArr2 = bArr3;
                                            i50 = i17;
                                            zzfzVar2 = zzfzVar4;
                                            i9 = i15;
                                            i8 = i20;
                                            i7 = i19;
                                            i6 = 0;
                                            zzipVar = zzipVar2;
                                            unsafe = unsafe4;
                                            i4 = i3;
                                            break;
                                        } else {
                                            i51 |= i63;
                                            Object zzx2 = zzipVar2.zzx(obj6, zzq);
                                            int i84 = zzq;
                                            i15 = i58;
                                            int zzl = zzga.zzl(zzx2, zzipVar2.zzv(zzq), bArr, i57, i2, (i58 << 3) | 4, zzfzVar);
                                            zzipVar2.zzF(obj6, i84, zzx2);
                                            i49 = zzl;
                                            bArr7 = bArr;
                                            zzfzVar7 = zzfzVar;
                                            i50 = i84;
                                            i54 = i13;
                                            i53 = i15;
                                            i47 = 0;
                                            i48 = -1;
                                            i46 = i2;
                                        }
                                }
                            } else {
                                int i85 = zzq;
                                int i86 = i58;
                                i6 = 0;
                                obj2 = obj6;
                                i5 = i54;
                                if (zzr != 27) {
                                    Unsafe unsafe6 = unsafe4;
                                    if (zzr > 49) {
                                        unsafe = unsafe6;
                                        i26 = i86;
                                        zzipVar = zzipVar2;
                                        i8 = i52;
                                        i27 = i57;
                                        bArr5 = bArr;
                                        i7 = i51;
                                        zzfzVar5 = zzfzVar;
                                        if (zzr != 50) {
                                            Unsafe unsafe7 = zzb;
                                            long j2 = iArr[i85 + 2] & 1048575;
                                            switch (zzr) {
                                                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                                                    i42 = i85;
                                                    zzfzVar2 = zzfzVar5;
                                                    i9 = i26;
                                                    i43 = i27;
                                                    bArr2 = bArr;
                                                    if (i60 == 1) {
                                                        i44 = i43 + 8;
                                                        unsafe7.putObject(obj2, j, Double.valueOf(Double.longBitsToDouble(zzga.zzn(bArr2, i43))));
                                                        unsafe7.putInt(obj2, j2, i9);
                                                        i49 = i44;
                                                        if (i49 == i43) {
                                                            i4 = i3;
                                                            i10 = i49;
                                                            i50 = i42;
                                                            break;
                                                        } else {
                                                            i46 = i2;
                                                            i53 = i9;
                                                            zzfzVar7 = zzfzVar2;
                                                            zzipVar2 = zzipVar;
                                                            bArr7 = bArr2;
                                                            obj6 = obj2;
                                                            i47 = 0;
                                                            unsafe4 = unsafe;
                                                            i50 = i42;
                                                            i54 = i5;
                                                            i51 = i7;
                                                            i48 = -1;
                                                            i52 = i8;
                                                        }
                                                    }
                                                    i49 = i43;
                                                    if (i49 == i43) {
                                                    }
                                                case 52:
                                                    i42 = i85;
                                                    zzfzVar2 = zzfzVar5;
                                                    i9 = i26;
                                                    i43 = i27;
                                                    bArr2 = bArr;
                                                    if (i60 == 5) {
                                                        i44 = i43 + 4;
                                                        unsafe7.putObject(obj2, j, Float.valueOf(Float.intBitsToFloat(zzga.zzb(bArr2, i43))));
                                                        unsafe7.putInt(obj2, j2, i9);
                                                        i49 = i44;
                                                        if (i49 == i43) {
                                                        }
                                                    }
                                                    i49 = i43;
                                                    if (i49 == i43) {
                                                    }
                                                    break;
                                                case 53:
                                                case 54:
                                                    i42 = i85;
                                                    zzfzVar2 = zzfzVar5;
                                                    i9 = i26;
                                                    i43 = i27;
                                                    bArr2 = bArr;
                                                    if (i60 == 0) {
                                                        i44 = zzga.zzk(bArr2, i43, zzfzVar2);
                                                        unsafe7.putObject(obj2, j, Long.valueOf(zzfzVar2.zzb));
                                                        unsafe7.putInt(obj2, j2, i9);
                                                        i49 = i44;
                                                        if (i49 == i43) {
                                                        }
                                                    }
                                                    i49 = i43;
                                                    if (i49 == i43) {
                                                    }
                                                    break;
                                                case 55:
                                                case 62:
                                                    i42 = i85;
                                                    zzfzVar2 = zzfzVar5;
                                                    i9 = i26;
                                                    i43 = i27;
                                                    bArr2 = bArr;
                                                    if (i60 == 0) {
                                                        i44 = zzga.zzh(bArr2, i43, zzfzVar2);
                                                        unsafe7.putObject(obj2, j, Integer.valueOf(zzfzVar2.zza));
                                                        unsafe7.putInt(obj2, j2, i9);
                                                        i49 = i44;
                                                        if (i49 == i43) {
                                                        }
                                                    }
                                                    i49 = i43;
                                                    if (i49 == i43) {
                                                    }
                                                    break;
                                                case 56:
                                                case 65:
                                                    i42 = i85;
                                                    zzfzVar2 = zzfzVar5;
                                                    i9 = i26;
                                                    i43 = i27;
                                                    bArr2 = bArr;
                                                    if (i60 == 1) {
                                                        i44 = i43 + 8;
                                                        unsafe7.putObject(obj2, j, Long.valueOf(zzga.zzn(bArr2, i43)));
                                                        unsafe7.putInt(obj2, j2, i9);
                                                        i49 = i44;
                                                        if (i49 == i43) {
                                                        }
                                                    }
                                                    i49 = i43;
                                                    if (i49 == i43) {
                                                    }
                                                    break;
                                                case 57:
                                                case 64:
                                                    i42 = i85;
                                                    zzfzVar2 = zzfzVar5;
                                                    i9 = i26;
                                                    i43 = i27;
                                                    bArr2 = bArr;
                                                    if (i60 == 5) {
                                                        i44 = i43 + 4;
                                                        unsafe7.putObject(obj2, j, Integer.valueOf(zzga.zzb(bArr2, i43)));
                                                        unsafe7.putInt(obj2, j2, i9);
                                                        i49 = i44;
                                                        if (i49 == i43) {
                                                        }
                                                    }
                                                    i49 = i43;
                                                    if (i49 == i43) {
                                                    }
                                                    break;
                                                case 58:
                                                    i42 = i85;
                                                    zzfzVar2 = zzfzVar5;
                                                    i9 = i26;
                                                    i43 = i27;
                                                    bArr2 = bArr;
                                                    if (i60 == 0) {
                                                        i44 = zzga.zzk(bArr2, i43, zzfzVar2);
                                                        unsafe7.putObject(obj2, j, Boolean.valueOf(zzfzVar2.zzb != 0));
                                                        unsafe7.putInt(obj2, j2, i9);
                                                        i49 = i44;
                                                        if (i49 == i43) {
                                                        }
                                                    }
                                                    i49 = i43;
                                                    if (i49 == i43) {
                                                    }
                                                    break;
                                                case 59:
                                                    i42 = i85;
                                                    zzfzVar2 = zzfzVar5;
                                                    i9 = i26;
                                                    i43 = i27;
                                                    bArr2 = bArr;
                                                    if (i60 == 2) {
                                                        i49 = zzga.zzh(bArr2, i43, zzfzVar2);
                                                        int i87 = zzfzVar2.zza;
                                                        if (i87 == 0) {
                                                            unsafe7.putObject(obj2, j, "");
                                                        } else {
                                                            int i88 = i49 + i87;
                                                            if ((i61 & 536870912) != 0 && !zzjt.zzd(bArr2, i49, i88)) {
                                                                throw new zzhr("Protocol message had invalid UTF-8.");
                                                            }
                                                            unsafe7.putObject(obj2, j, new String(bArr2, i49, i87, zzhp.zza));
                                                            i49 = i88;
                                                        }
                                                        unsafe7.putInt(obj2, j2, i9);
                                                        if (i49 == i43) {
                                                        }
                                                    }
                                                    i49 = i43;
                                                    if (i49 == i43) {
                                                    }
                                                    break;
                                                case 60:
                                                    i9 = i26;
                                                    if (i60 == 2) {
                                                        Object zzy = zzipVar.zzy(obj2, i9, i85);
                                                        int zzm2 = zzga.zzm(zzy, zzipVar.zzv(i85), bArr, i27, i2, zzfzVar5);
                                                        bArr2 = bArr;
                                                        zzipVar.zzG(obj2, i9, i85, zzy);
                                                        i49 = zzm2;
                                                        i43 = i27;
                                                        i42 = i85;
                                                        zzfzVar2 = zzfzVar;
                                                        if (i49 == i43) {
                                                        }
                                                    } else {
                                                        bArr2 = bArr;
                                                        i43 = i27;
                                                        i42 = i85;
                                                        zzfzVar2 = zzfzVar;
                                                        i49 = i43;
                                                        if (i49 == i43) {
                                                        }
                                                    }
                                                    break;
                                                case 61:
                                                    bArr6 = bArr;
                                                    i9 = i26;
                                                    i45 = i27;
                                                    if (i60 == 2) {
                                                        i49 = zzga.zza(bArr6, i45, zzfzVar5);
                                                        unsafe7.putObject(obj2, j, zzfzVar5.zzc);
                                                        unsafe7.putInt(obj2, j2, i9);
                                                        i43 = i45;
                                                        i42 = i85;
                                                        zzfzVar2 = zzfzVar5;
                                                        bArr2 = bArr6;
                                                        if (i49 == i43) {
                                                        }
                                                    }
                                                    i43 = i45;
                                                    i42 = i85;
                                                    zzfzVar2 = zzfzVar5;
                                                    bArr2 = bArr6;
                                                    i49 = i43;
                                                    if (i49 == i43) {
                                                    }
                                                    break;
                                                case 63:
                                                    bArr6 = bArr;
                                                    i42 = i85;
                                                    i9 = i26;
                                                    i45 = i27;
                                                    if (i60 == 0) {
                                                        i49 = zzga.zzh(bArr6, i45, zzfzVar5);
                                                        int i89 = zzfzVar5.zza;
                                                        i85 = i42;
                                                        zzhm zzu2 = zzipVar.zzu(i85);
                                                        if (zzu2 == null || zzu2.zza(i89)) {
                                                            unsafe7.putObject(obj2, j, Integer.valueOf(i89));
                                                            unsafe7.putInt(obj2, j2, i9);
                                                        } else {
                                                            zzd(obj2).zzj(i8, Long.valueOf(i89));
                                                        }
                                                        i43 = i45;
                                                        i42 = i85;
                                                        zzfzVar2 = zzfzVar5;
                                                        bArr2 = bArr6;
                                                        if (i49 == i43) {
                                                        }
                                                    }
                                                    i43 = i45;
                                                    zzfzVar2 = zzfzVar5;
                                                    bArr2 = bArr6;
                                                    i49 = i43;
                                                    if (i49 == i43) {
                                                    }
                                                    break;
                                                case 66:
                                                    bArr6 = bArr;
                                                    i42 = i85;
                                                    i9 = i26;
                                                    i45 = i27;
                                                    if (i60 == 0) {
                                                        i49 = zzga.zzh(bArr6, i45, zzfzVar5);
                                                        unsafe7.putObject(obj2, j, Integer.valueOf(zzgn.zzb(zzfzVar5.zza)));
                                                        unsafe7.putInt(obj2, j2, i9);
                                                        i43 = i45;
                                                        zzfzVar2 = zzfzVar5;
                                                        bArr2 = bArr6;
                                                        if (i49 == i43) {
                                                        }
                                                    }
                                                    i43 = i45;
                                                    zzfzVar2 = zzfzVar5;
                                                    bArr2 = bArr6;
                                                    i49 = i43;
                                                    if (i49 == i43) {
                                                    }
                                                    break;
                                                case 67:
                                                    bArr6 = bArr;
                                                    i9 = i26;
                                                    i45 = i27;
                                                    if (i60 == 0) {
                                                        i49 = zzga.zzk(bArr6, i45, zzfzVar5);
                                                        i42 = i85;
                                                        unsafe7.putObject(obj2, j, Long.valueOf(zzgn.zzc(zzfzVar5.zzb)));
                                                        unsafe7.putInt(obj2, j2, i9);
                                                        i43 = i45;
                                                        zzfzVar2 = zzfzVar5;
                                                        bArr2 = bArr6;
                                                        if (i49 == i43) {
                                                        }
                                                    }
                                                    i43 = i45;
                                                    i42 = i85;
                                                    zzfzVar2 = zzfzVar5;
                                                    bArr2 = bArr6;
                                                    i49 = i43;
                                                    if (i49 == i43) {
                                                    }
                                                    break;
                                                case 68:
                                                    if (i60 == 3) {
                                                        i9 = i26;
                                                        Object zzy2 = zzipVar.zzy(obj2, i9, i85);
                                                        bArr6 = bArr;
                                                        i45 = i27;
                                                        int zzl2 = zzga.zzl(zzy2, zzipVar.zzv(i85), bArr6, i45, i2, (i8 & (-8)) | 4, zzfzVar5);
                                                        zzipVar.zzG(obj2, i9, i85, zzy2);
                                                        i49 = zzl2;
                                                        i43 = i45;
                                                        i42 = i85;
                                                        zzfzVar2 = zzfzVar5;
                                                        bArr2 = bArr6;
                                                        if (i49 == i43) {
                                                        }
                                                    } else {
                                                        i9 = i26;
                                                        i42 = i85;
                                                        zzfzVar2 = zzfzVar5;
                                                        i43 = i27;
                                                        bArr2 = bArr;
                                                        i49 = i43;
                                                        if (i49 == i43) {
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    i42 = i85;
                                                    zzfzVar2 = zzfzVar5;
                                                    i9 = i26;
                                                    i43 = i27;
                                                    bArr2 = bArr;
                                                    i49 = i43;
                                                    if (i49 == i43) {
                                                    }
                                                    break;
                                            }
                                        } else if (i60 == 2) {
                                            Unsafe unsafe8 = zzb;
                                            Object zzw = zzipVar.zzw(i85);
                                            Object object = unsafe8.getObject(obj2, j);
                                            if (!((zzig) object).zze()) {
                                                zzig zzb2 = zzig.zza().zzb();
                                                zzih.zza(zzb2, object);
                                                unsafe8.putObject(obj2, j, zzb2);
                                            }
                                            throw null;
                                        }
                                    } else {
                                        long j3 = i61;
                                        Unsafe unsafe9 = zzb;
                                        zzho zzhoVar2 = (zzho) unsafe9.getObject(obj2, j);
                                        if (!zzhoVar2.zzc()) {
                                            int size = zzhoVar2.size();
                                            zzhoVar2 = zzhoVar2.zzd(size + size);
                                            unsafe9.putObject(obj2, j, zzhoVar2);
                                        }
                                        zzho zzhoVar3 = zzhoVar2;
                                        switch (zzr) {
                                            case 18:
                                            case 35:
                                                bArr5 = bArr;
                                                i28 = i2;
                                                i26 = i86;
                                                i8 = i52;
                                                i29 = i57;
                                                unsafe = unsafe6;
                                                i7 = i51;
                                                zzfzVar5 = zzfzVar;
                                                zzipVar = zzipVar2;
                                                if (i60 == 2) {
                                                    zzgt zzgtVar = (zzgt) zzhoVar3;
                                                    i27 = zzga.zzh(bArr5, i29, zzfzVar5);
                                                    int i90 = zzfzVar5.zza;
                                                    int i91 = i27 + i90;
                                                    if (i91 > bArr5.length) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    zzgtVar.zzg((i90 / 8) + zzgtVar.size());
                                                    while (i27 < i91) {
                                                        zzgtVar.zzf(Double.longBitsToDouble(zzga.zzn(bArr5, i27)));
                                                        i27 += 8;
                                                    }
                                                    if (i27 != i91) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    if (i27 == i29) {
                                                        break;
                                                    } else {
                                                        bArr7 = bArr5;
                                                        i46 = i28;
                                                        i50 = i85;
                                                        zzfzVar7 = zzfzVar5;
                                                        obj6 = obj2;
                                                        i47 = 0;
                                                        unsafe4 = unsafe;
                                                        i54 = i5;
                                                        i53 = i26;
                                                        i51 = i7;
                                                        i49 = i27;
                                                        zzipVar2 = zzipVar;
                                                        i52 = i8;
                                                        i48 = -1;
                                                    }
                                                } else {
                                                    if (i60 == 1) {
                                                        i30 = i29 + 8;
                                                        zzgt zzgtVar2 = (zzgt) zzhoVar3;
                                                        zzgtVar2.zzf(Double.longBitsToDouble(zzga.zzn(bArr5, i29)));
                                                        while (i30 < i28) {
                                                            int zzh7 = zzga.zzh(bArr5, i30, zzfzVar5);
                                                            if (i8 == zzfzVar5.zza) {
                                                                zzgtVar2.zzf(Double.longBitsToDouble(zzga.zzn(bArr5, zzh7)));
                                                                i30 = zzh7 + 8;
                                                            } else {
                                                                i27 = i30;
                                                                if (i27 == i29) {
                                                                }
                                                            }
                                                        }
                                                        i27 = i30;
                                                        if (i27 == i29) {
                                                        }
                                                    }
                                                    i27 = i29;
                                                    if (i27 == i29) {
                                                    }
                                                }
                                            case 19:
                                            case 36:
                                                bArr5 = bArr;
                                                i28 = i2;
                                                i26 = i86;
                                                i8 = i52;
                                                i29 = i57;
                                                unsafe = unsafe6;
                                                i7 = i51;
                                                zzfzVar5 = zzfzVar;
                                                zzipVar = zzipVar2;
                                                if (i60 == 2) {
                                                    zzhd zzhdVar = (zzhd) zzhoVar3;
                                                    i27 = zzga.zzh(bArr5, i29, zzfzVar5);
                                                    int i92 = zzfzVar5.zza;
                                                    int i93 = i27 + i92;
                                                    if (i93 > bArr5.length) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    zzhdVar.zzg((i92 / 4) + zzhdVar.size());
                                                    while (i27 < i93) {
                                                        zzhdVar.zzf(Float.intBitsToFloat(zzga.zzb(bArr5, i27)));
                                                        i27 += 4;
                                                    }
                                                    if (i27 != i93) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    if (i27 == i29) {
                                                    }
                                                } else {
                                                    if (i60 == 5) {
                                                        i30 = i29 + 4;
                                                        zzhd zzhdVar2 = (zzhd) zzhoVar3;
                                                        zzhdVar2.zzf(Float.intBitsToFloat(zzga.zzb(bArr5, i29)));
                                                        while (i30 < i28) {
                                                            int zzh8 = zzga.zzh(bArr5, i30, zzfzVar5);
                                                            if (i8 == zzfzVar5.zza) {
                                                                zzhdVar2.zzf(Float.intBitsToFloat(zzga.zzb(bArr5, zzh8)));
                                                                i30 = zzh8 + 4;
                                                            } else {
                                                                i27 = i30;
                                                                if (i27 == i29) {
                                                                }
                                                            }
                                                        }
                                                        i27 = i30;
                                                        if (i27 == i29) {
                                                        }
                                                    }
                                                    i27 = i29;
                                                    if (i27 == i29) {
                                                    }
                                                }
                                                break;
                                            case 20:
                                            case 21:
                                            case 37:
                                            case 38:
                                                bArr5 = bArr;
                                                i28 = i2;
                                                i26 = i86;
                                                i8 = i52;
                                                i29 = i57;
                                                unsafe = unsafe6;
                                                i7 = i51;
                                                zzfzVar5 = zzfzVar;
                                                zzipVar = zzipVar2;
                                                if (i60 == 2) {
                                                    zzib zzibVar = (zzib) zzhoVar3;
                                                    i27 = zzga.zzh(bArr5, i29, zzfzVar5);
                                                    int i94 = zzfzVar5.zza + i27;
                                                    while (i27 < i94) {
                                                        i27 = zzga.zzk(bArr5, i27, zzfzVar5);
                                                        zzibVar.zzf(zzfzVar5.zzb);
                                                    }
                                                    if (i27 != i94) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                } else {
                                                    if (i60 == 0) {
                                                        zzib zzibVar2 = (zzib) zzhoVar3;
                                                        i27 = zzga.zzk(bArr5, i29, zzfzVar5);
                                                        zzibVar2.zzf(zzfzVar5.zzb);
                                                        while (i27 < i28) {
                                                            int zzh9 = zzga.zzh(bArr5, i27, zzfzVar5);
                                                            if (i8 == zzfzVar5.zza) {
                                                                i27 = zzga.zzk(bArr5, zzh9, zzfzVar5);
                                                                zzibVar2.zzf(zzfzVar5.zzb);
                                                            }
                                                        }
                                                    }
                                                    i27 = i29;
                                                }
                                                if (i27 == i29) {
                                                }
                                                break;
                                            case 22:
                                            case 29:
                                            case 39:
                                            case 43:
                                                bArr5 = bArr;
                                                zzfzVar6 = zzfzVar;
                                                i26 = i86;
                                                i31 = i52;
                                                i32 = i57;
                                                unsafe = unsafe6;
                                                i7 = i51;
                                                i33 = i2;
                                                zzipVar = zzipVar2;
                                                if (i60 == 2) {
                                                    i27 = zzga.zzf(bArr5, i32, zzhoVar3, zzfzVar6);
                                                    zzfzVar5 = zzfzVar6;
                                                    i28 = i33;
                                                    i8 = i31;
                                                    i29 = i32;
                                                    if (i27 == i29) {
                                                    }
                                                } else {
                                                    if (i60 == 0) {
                                                        i27 = zzga.zzj(i31, bArr5, i32, i33, zzhoVar3, zzfzVar6);
                                                        i8 = i31;
                                                        i28 = i33;
                                                        zzfzVar5 = zzfzVar6;
                                                        i29 = i32;
                                                        if (i27 == i29) {
                                                        }
                                                    }
                                                    zzfzVar5 = zzfzVar6;
                                                    i28 = i33;
                                                    i8 = i31;
                                                    i29 = i32;
                                                    i27 = i29;
                                                    if (i27 == i29) {
                                                    }
                                                }
                                                break;
                                            case 23:
                                            case 32:
                                            case 40:
                                            case 46:
                                                bArr5 = bArr;
                                                zzfzVar6 = zzfzVar;
                                                i26 = i86;
                                                i31 = i52;
                                                i32 = i57;
                                                unsafe = unsafe6;
                                                i7 = i51;
                                                i33 = i2;
                                                zzipVar = zzipVar2;
                                                if (i60 == 2) {
                                                    zzib zzibVar3 = (zzib) zzhoVar3;
                                                    zzh2 = zzga.zzh(bArr5, i32, zzfzVar6);
                                                    int i95 = zzfzVar6.zza;
                                                    int i96 = zzh2 + i95;
                                                    if (i96 > bArr5.length) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    zzibVar3.zzg((i95 / 8) + zzibVar3.size());
                                                    while (zzh2 < i96) {
                                                        zzibVar3.zzf(zzga.zzn(bArr5, zzh2));
                                                        zzh2 += 8;
                                                    }
                                                    if (zzh2 != i96) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    i27 = zzh2;
                                                    zzfzVar5 = zzfzVar6;
                                                    i28 = i33;
                                                    i8 = i31;
                                                    i29 = i32;
                                                    if (i27 == i29) {
                                                    }
                                                } else {
                                                    if (i60 == 1) {
                                                        i27 = i32 + 8;
                                                        zzib zzibVar4 = (zzib) zzhoVar3;
                                                        zzibVar4.zzf(zzga.zzn(bArr5, i32));
                                                        while (i27 < i33) {
                                                            int zzh10 = zzga.zzh(bArr5, i27, zzfzVar6);
                                                            if (i31 == zzfzVar6.zza) {
                                                                zzibVar4.zzf(zzga.zzn(bArr5, zzh10));
                                                                i27 = zzh10 + 8;
                                                            } else {
                                                                zzfzVar5 = zzfzVar6;
                                                                i28 = i33;
                                                                i8 = i31;
                                                                i29 = i32;
                                                                if (i27 == i29) {
                                                                }
                                                            }
                                                        }
                                                        zzfzVar5 = zzfzVar6;
                                                        i28 = i33;
                                                        i8 = i31;
                                                        i29 = i32;
                                                        if (i27 == i29) {
                                                        }
                                                    }
                                                    zzfzVar5 = zzfzVar6;
                                                    i28 = i33;
                                                    i8 = i31;
                                                    i29 = i32;
                                                    i27 = i29;
                                                    if (i27 == i29) {
                                                    }
                                                }
                                                break;
                                            case 24:
                                            case 31:
                                            case 41:
                                            case 45:
                                                bArr5 = bArr;
                                                zzfzVar6 = zzfzVar;
                                                i26 = i86;
                                                i31 = i52;
                                                i32 = i57;
                                                unsafe = unsafe6;
                                                i7 = i51;
                                                i33 = i2;
                                                zzipVar = zzipVar2;
                                                if (i60 == 2) {
                                                    zzhl zzhlVar = (zzhl) zzhoVar3;
                                                    zzh2 = zzga.zzh(bArr5, i32, zzfzVar6);
                                                    int i97 = zzfzVar6.zza;
                                                    int i98 = zzh2 + i97;
                                                    if (i98 > bArr5.length) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    zzhlVar.zzh((i97 / 4) + zzhlVar.size());
                                                    while (zzh2 < i98) {
                                                        zzhlVar.zzg(zzga.zzb(bArr5, zzh2));
                                                        zzh2 += 4;
                                                    }
                                                    if (zzh2 != i98) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    i27 = zzh2;
                                                    zzfzVar5 = zzfzVar6;
                                                    i28 = i33;
                                                    i8 = i31;
                                                    i29 = i32;
                                                    if (i27 == i29) {
                                                    }
                                                } else {
                                                    if (i60 == 5) {
                                                        i27 = i32 + 4;
                                                        zzhl zzhlVar2 = (zzhl) zzhoVar3;
                                                        zzhlVar2.zzg(zzga.zzb(bArr5, i32));
                                                        while (i27 < i33) {
                                                            int zzh11 = zzga.zzh(bArr5, i27, zzfzVar6);
                                                            if (i31 == zzfzVar6.zza) {
                                                                zzhlVar2.zzg(zzga.zzb(bArr5, zzh11));
                                                                i27 = zzh11 + 4;
                                                            } else {
                                                                zzfzVar5 = zzfzVar6;
                                                                i28 = i33;
                                                                i8 = i31;
                                                                i29 = i32;
                                                                if (i27 == i29) {
                                                                }
                                                            }
                                                        }
                                                        zzfzVar5 = zzfzVar6;
                                                        i28 = i33;
                                                        i8 = i31;
                                                        i29 = i32;
                                                        if (i27 == i29) {
                                                        }
                                                    }
                                                    zzfzVar5 = zzfzVar6;
                                                    i28 = i33;
                                                    i8 = i31;
                                                    i29 = i32;
                                                    i27 = i29;
                                                    if (i27 == i29) {
                                                    }
                                                }
                                                break;
                                            case 25:
                                            case 42:
                                                bArr5 = bArr;
                                                zzfzVar6 = zzfzVar;
                                                i26 = i86;
                                                i31 = i52;
                                                i32 = i57;
                                                unsafe = unsafe6;
                                                i7 = i51;
                                                i33 = i2;
                                                zzipVar = zzipVar2;
                                                if (i60 == 2) {
                                                    zzgb zzgbVar = (zzgb) zzhoVar3;
                                                    zzh2 = zzga.zzh(bArr5, i32, zzfzVar6);
                                                    int i99 = zzfzVar6.zza + zzh2;
                                                    while (zzh2 < i99) {
                                                        zzh2 = zzga.zzk(bArr5, zzh2, zzfzVar6);
                                                        zzgbVar.zze(zzfzVar6.zzb != 0);
                                                    }
                                                    if (zzh2 != i99) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    i27 = zzh2;
                                                    zzfzVar5 = zzfzVar6;
                                                    i28 = i33;
                                                    i8 = i31;
                                                    i29 = i32;
                                                    if (i27 == i29) {
                                                    }
                                                } else {
                                                    if (i60 == 0) {
                                                        zzgb zzgbVar2 = (zzgb) zzhoVar3;
                                                        int zzk3 = zzga.zzk(bArr5, i32, zzfzVar6);
                                                        zzgbVar2.zze(zzfzVar6.zzb != 0);
                                                        while (zzk3 < i33) {
                                                            int zzh12 = zzga.zzh(bArr5, zzk3, zzfzVar6);
                                                            if (i31 == zzfzVar6.zza) {
                                                                zzk3 = zzga.zzk(bArr5, zzh12, zzfzVar6);
                                                                zzgbVar2.zze(zzfzVar6.zzb != 0);
                                                            } else {
                                                                i27 = zzk3;
                                                                zzfzVar5 = zzfzVar6;
                                                                i28 = i33;
                                                                i8 = i31;
                                                                i29 = i32;
                                                                if (i27 == i29) {
                                                                }
                                                            }
                                                        }
                                                        i27 = zzk3;
                                                        zzfzVar5 = zzfzVar6;
                                                        i28 = i33;
                                                        i8 = i31;
                                                        i29 = i32;
                                                        if (i27 == i29) {
                                                        }
                                                    }
                                                    zzfzVar5 = zzfzVar6;
                                                    i28 = i33;
                                                    i8 = i31;
                                                    i29 = i32;
                                                    i27 = i29;
                                                    if (i27 == i29) {
                                                    }
                                                }
                                                break;
                                            case 26:
                                                bArr5 = bArr;
                                                zzfzVar6 = zzfzVar;
                                                i31 = i52;
                                                i32 = i57;
                                                unsafe = unsafe6;
                                                i7 = i51;
                                                zzipVar = zzipVar2;
                                                i33 = i2;
                                                if (i60 != 2) {
                                                    i26 = i86;
                                                    zzfzVar5 = zzfzVar6;
                                                    i28 = i33;
                                                    i8 = i31;
                                                    i29 = i32;
                                                    i27 = i29;
                                                    if (i27 == i29) {
                                                    }
                                                } else if ((j3 & 536870912) == 0) {
                                                    i27 = zzga.zzh(bArr5, i32, zzfzVar6);
                                                    int i100 = zzfzVar6.zza;
                                                    if (i100 < 0) {
                                                        throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i100 == 0) {
                                                        zzhoVar3.add("");
                                                    } else {
                                                        zzhoVar3.add(new String(bArr5, i27, i100, zzhp.zza));
                                                        i27 += i100;
                                                    }
                                                    while (i27 < i33) {
                                                        int zzh13 = zzga.zzh(bArr5, i27, zzfzVar6);
                                                        if (i31 == zzfzVar6.zza) {
                                                            i27 = zzga.zzh(bArr5, zzh13, zzfzVar6);
                                                            int i101 = zzfzVar6.zza;
                                                            if (i101 < 0) {
                                                                throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            }
                                                            if (i101 == 0) {
                                                                zzhoVar3.add("");
                                                            } else {
                                                                zzhoVar3.add(new String(bArr5, i27, i101, zzhp.zza));
                                                                i27 += i101;
                                                            }
                                                        } else {
                                                            i28 = i33;
                                                            i8 = i31;
                                                            i29 = i32;
                                                            i26 = i86;
                                                            zzfzVar5 = zzfzVar6;
                                                            if (i27 == i29) {
                                                            }
                                                        }
                                                    }
                                                    i28 = i33;
                                                    i8 = i31;
                                                    i29 = i32;
                                                    i26 = i86;
                                                    zzfzVar5 = zzfzVar6;
                                                    if (i27 == i29) {
                                                    }
                                                } else {
                                                    i27 = zzga.zzh(bArr5, i32, zzfzVar6);
                                                    int i102 = zzfzVar6.zza;
                                                    if (i102 < 0) {
                                                        throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i102 == 0) {
                                                        zzhoVar3.add("");
                                                        i26 = i86;
                                                    } else {
                                                        int i103 = i27 + i102;
                                                        if (!zzjt.zzd(bArr5, i27, i103)) {
                                                            throw new zzhr("Protocol message had invalid UTF-8.");
                                                        }
                                                        i26 = i86;
                                                        zzhoVar3.add(new String(bArr5, i27, i102, zzhp.zza));
                                                        i27 = i103;
                                                    }
                                                    while (i27 < i33) {
                                                        int zzh14 = zzga.zzh(bArr5, i27, zzfzVar6);
                                                        if (i31 == zzfzVar6.zza) {
                                                            i27 = zzga.zzh(bArr5, zzh14, zzfzVar6);
                                                            int i104 = zzfzVar6.zza;
                                                            if (i104 < 0) {
                                                                throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            }
                                                            if (i104 == 0) {
                                                                zzhoVar3.add("");
                                                            } else {
                                                                int i105 = i27 + i104;
                                                                if (!zzjt.zzd(bArr5, i27, i105)) {
                                                                    throw new zzhr("Protocol message had invalid UTF-8.");
                                                                }
                                                                zzhoVar3.add(new String(bArr5, i27, i104, zzhp.zza));
                                                                i27 = i105;
                                                            }
                                                        } else {
                                                            zzfzVar5 = zzfzVar6;
                                                            i28 = i33;
                                                            i8 = i31;
                                                            i29 = i32;
                                                            if (i27 == i29) {
                                                            }
                                                        }
                                                    }
                                                    zzfzVar5 = zzfzVar6;
                                                    i28 = i33;
                                                    i8 = i31;
                                                    i29 = i32;
                                                    if (i27 == i29) {
                                                    }
                                                }
                                                break;
                                            case 27:
                                                bArr5 = bArr;
                                                i34 = i2;
                                                zzfzVar6 = zzfzVar;
                                                i31 = i52;
                                                i35 = i57;
                                                unsafe = unsafe6;
                                                i7 = i51;
                                                i36 = i86;
                                                if (i60 == 2) {
                                                    zzipVar = this;
                                                    i28 = i34;
                                                    i29 = i35;
                                                    i27 = zzga.zze(zzipVar.zzv(i85), i31, bArr5, i29, i28, zzhoVar3, zzfzVar6);
                                                    i8 = i31;
                                                    bArr5 = bArr5;
                                                    i26 = i36;
                                                    zzfzVar5 = zzfzVar6;
                                                    if (i27 == i29) {
                                                    }
                                                }
                                                zzipVar = this;
                                                i28 = i34;
                                                i8 = i31;
                                                i26 = i36;
                                                i29 = i35;
                                                zzfzVar5 = zzfzVar6;
                                                i27 = i29;
                                                if (i27 == i29) {
                                                }
                                                break;
                                            case 28:
                                                bArr5 = bArr;
                                                i34 = i2;
                                                zzfzVar6 = zzfzVar;
                                                i31 = i52;
                                                i35 = i57;
                                                unsafe = unsafe6;
                                                i7 = i51;
                                                i36 = i86;
                                                if (i60 == 2) {
                                                    i27 = zzga.zzh(bArr5, i35, zzfzVar6);
                                                    int i106 = zzfzVar6.zza;
                                                    if (i106 < 0) {
                                                        throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i106 > bArr5.length - i27) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    if (i106 == 0) {
                                                        zzhoVar3.add(zzgk.zzb);
                                                    } else {
                                                        zzhoVar3.add(zzgk.zzj(bArr5, i27, i106));
                                                        i27 += i106;
                                                    }
                                                    while (i27 < i34) {
                                                        int zzh15 = zzga.zzh(bArr5, i27, zzfzVar6);
                                                        if (i31 == zzfzVar6.zza) {
                                                            i27 = zzga.zzh(bArr5, zzh15, zzfzVar6);
                                                            int i107 = zzfzVar6.zza;
                                                            if (i107 < 0) {
                                                                throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            }
                                                            if (i107 > bArr5.length - i27) {
                                                                throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                            }
                                                            if (i107 == 0) {
                                                                zzhoVar3.add(zzgk.zzb);
                                                            } else {
                                                                zzhoVar3.add(zzgk.zzj(bArr5, i27, i107));
                                                                i27 += i107;
                                                            }
                                                        } else {
                                                            zzipVar = this;
                                                            i28 = i34;
                                                            i8 = i31;
                                                            i26 = i36;
                                                            i29 = i35;
                                                            zzfzVar5 = zzfzVar6;
                                                            if (i27 == i29) {
                                                            }
                                                        }
                                                    }
                                                    zzipVar = this;
                                                    i28 = i34;
                                                    i8 = i31;
                                                    i26 = i36;
                                                    i29 = i35;
                                                    zzfzVar5 = zzfzVar6;
                                                    if (i27 == i29) {
                                                    }
                                                }
                                                zzipVar = this;
                                                i28 = i34;
                                                i8 = i31;
                                                i26 = i36;
                                                i29 = i35;
                                                zzfzVar5 = zzfzVar6;
                                                i27 = i29;
                                                if (i27 == i29) {
                                                }
                                                break;
                                            case 30:
                                            case 44:
                                                bArr5 = bArr;
                                                i34 = i2;
                                                zzfzVar6 = zzfzVar;
                                                i26 = i86;
                                                i31 = i52;
                                                i32 = i57;
                                                unsafe = unsafe6;
                                                if (i60 == 2) {
                                                    zzj = zzga.zzf(bArr5, i32, zzhoVar3, zzfzVar6);
                                                    i35 = i32;
                                                    zzhoVar = zzhoVar3;
                                                } else if (i60 == 0) {
                                                    i35 = i32;
                                                    zzhoVar = zzhoVar3;
                                                    zzj = zzga.zzj(i31, bArr5, i35, i34, zzhoVar3, zzfzVar6);
                                                } else {
                                                    i7 = i51;
                                                    zzipVar = this;
                                                    i28 = i34;
                                                    zzfzVar5 = zzfzVar6;
                                                    i8 = i31;
                                                    i29 = i32;
                                                    i27 = i29;
                                                    if (i27 == i29) {
                                                    }
                                                }
                                                zzhm zzu3 = zzipVar2.zzu(i85);
                                                zzjj zzjjVar = zzipVar2.zzl;
                                                int i108 = zziz.zza;
                                                if (zzu3 == null) {
                                                    i37 = zzj;
                                                    i7 = i51;
                                                    i36 = i26;
                                                } else if (zzhoVar != null) {
                                                    int size2 = zzhoVar.size();
                                                    i37 = zzj;
                                                    Object obj14 = null;
                                                    int i109 = 0;
                                                    int i110 = 0;
                                                    while (i109 < size2) {
                                                        int i111 = i51;
                                                        Integer num = (Integer) zzhoVar.get(i109);
                                                        int intValue = num.intValue();
                                                        if (zzu3.zza(intValue)) {
                                                            if (i109 != i110) {
                                                                zzhoVar.set(i110, num);
                                                            }
                                                            i110++;
                                                            i38 = i26;
                                                        } else {
                                                            i38 = i26;
                                                            obj14 = zziz.zzn(obj2, i38, intValue, obj14, zzjjVar);
                                                        }
                                                        i109++;
                                                        i26 = i38;
                                                        i51 = i111;
                                                    }
                                                    i7 = i51;
                                                    i36 = i26;
                                                    if (i110 != size2) {
                                                        zzhoVar.subList(i110, size2).clear();
                                                    }
                                                } else {
                                                    i37 = zzj;
                                                    i7 = i51;
                                                    i36 = i26;
                                                    Iterator it = zzhoVar.iterator();
                                                    Object obj15 = null;
                                                    while (it.hasNext()) {
                                                        int intValue2 = ((Integer) it.next()).intValue();
                                                        if (!zzu3.zza(intValue2)) {
                                                            obj15 = zziz.zzn(obj2, i36, intValue2, obj15, zzjjVar);
                                                            it.remove();
                                                        }
                                                    }
                                                }
                                                zzipVar = this;
                                                i27 = i37;
                                                i28 = i34;
                                                i8 = i31;
                                                i26 = i36;
                                                i29 = i35;
                                                zzfzVar5 = zzfzVar6;
                                                if (i27 == i29) {
                                                }
                                                break;
                                            case 33:
                                            case 47:
                                                bArr5 = bArr;
                                                i39 = i2;
                                                zzfzVar6 = zzfzVar;
                                                i26 = i86;
                                                i40 = i52;
                                                i41 = i57;
                                                unsafe = unsafe6;
                                                if (i60 == 2) {
                                                    zzhl zzhlVar3 = (zzhl) zzhoVar3;
                                                    zzh4 = zzga.zzh(bArr5, i41, zzfzVar6);
                                                    int i112 = zzfzVar6.zza + zzh4;
                                                    while (zzh4 < i112) {
                                                        zzh4 = zzga.zzh(bArr5, zzh4, zzfzVar6);
                                                        zzhlVar3.zzg(zzgn.zzb(zzfzVar6.zza));
                                                    }
                                                    if (zzh4 != i112) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    zzipVar = zzipVar2;
                                                    i27 = zzh4;
                                                    i28 = i39;
                                                    i8 = i40;
                                                    i29 = i41;
                                                    i7 = i51;
                                                    zzfzVar5 = zzfzVar6;
                                                    if (i27 == i29) {
                                                    }
                                                } else {
                                                    if (i60 == 0) {
                                                        zzhl zzhlVar4 = (zzhl) zzhoVar3;
                                                        zzh3 = zzga.zzh(bArr5, i41, zzfzVar6);
                                                        zzhlVar4.zzg(zzgn.zzb(zzfzVar6.zza));
                                                        while (zzh3 < i39) {
                                                            int zzh16 = zzga.zzh(bArr5, zzh3, zzfzVar6);
                                                            if (i40 == zzfzVar6.zza) {
                                                                zzh3 = zzga.zzh(bArr5, zzh16, zzfzVar6);
                                                                zzhlVar4.zzg(zzgn.zzb(zzfzVar6.zza));
                                                            } else {
                                                                zzipVar = zzipVar2;
                                                                i27 = zzh3;
                                                                i28 = i39;
                                                                i8 = i40;
                                                                i29 = i41;
                                                                i7 = i51;
                                                                zzfzVar5 = zzfzVar6;
                                                                if (i27 == i29) {
                                                                }
                                                            }
                                                        }
                                                        zzipVar = zzipVar2;
                                                        i27 = zzh3;
                                                        i28 = i39;
                                                        i8 = i40;
                                                        i29 = i41;
                                                        i7 = i51;
                                                        zzfzVar5 = zzfzVar6;
                                                        if (i27 == i29) {
                                                        }
                                                    }
                                                    zzipVar = zzipVar2;
                                                    i28 = i39;
                                                    i8 = i40;
                                                    i29 = i41;
                                                    i7 = i51;
                                                    zzfzVar5 = zzfzVar6;
                                                    i27 = i29;
                                                    if (i27 == i29) {
                                                    }
                                                }
                                                break;
                                            case 34:
                                            case 48:
                                                bArr5 = bArr;
                                                i39 = i2;
                                                zzfzVar6 = zzfzVar;
                                                i40 = i52;
                                                i41 = i57;
                                                if (i60 == 2) {
                                                    zzib zzibVar5 = (zzib) zzhoVar3;
                                                    zzh4 = zzga.zzh(bArr5, i41, zzfzVar6);
                                                    int i113 = zzfzVar6.zza + zzh4;
                                                    while (zzh4 < i113) {
                                                        zzh4 = zzga.zzk(bArr5, zzh4, zzfzVar6);
                                                        zzibVar5.zzf(zzgn.zzc(zzfzVar6.zzb));
                                                        unsafe6 = unsafe6;
                                                        i86 = i86;
                                                    }
                                                    unsafe = unsafe6;
                                                    i26 = i86;
                                                    if (zzh4 != i113) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    zzipVar = zzipVar2;
                                                    i27 = zzh4;
                                                    i28 = i39;
                                                    i8 = i40;
                                                    i29 = i41;
                                                    i7 = i51;
                                                    zzfzVar5 = zzfzVar6;
                                                    if (i27 == i29) {
                                                    }
                                                } else {
                                                    unsafe = unsafe6;
                                                    i26 = i86;
                                                    if (i60 == 0) {
                                                        zzib zzibVar6 = (zzib) zzhoVar3;
                                                        zzh3 = zzga.zzk(bArr5, i41, zzfzVar6);
                                                        zzibVar6.zzf(zzgn.zzc(zzfzVar6.zzb));
                                                        while (zzh3 < i39) {
                                                            int zzh17 = zzga.zzh(bArr5, zzh3, zzfzVar6);
                                                            if (i40 == zzfzVar6.zza) {
                                                                zzh3 = zzga.zzk(bArr5, zzh17, zzfzVar6);
                                                                zzibVar6.zzf(zzgn.zzc(zzfzVar6.zzb));
                                                            } else {
                                                                zzipVar = zzipVar2;
                                                                i27 = zzh3;
                                                                i28 = i39;
                                                                i8 = i40;
                                                                i29 = i41;
                                                                i7 = i51;
                                                                zzfzVar5 = zzfzVar6;
                                                                if (i27 == i29) {
                                                                }
                                                            }
                                                        }
                                                        zzipVar = zzipVar2;
                                                        i27 = zzh3;
                                                        i28 = i39;
                                                        i8 = i40;
                                                        i29 = i41;
                                                        i7 = i51;
                                                        zzfzVar5 = zzfzVar6;
                                                        if (i27 == i29) {
                                                        }
                                                    }
                                                    zzipVar = zzipVar2;
                                                    i28 = i39;
                                                    i8 = i40;
                                                    i29 = i41;
                                                    i7 = i51;
                                                    zzfzVar5 = zzfzVar6;
                                                    i27 = i29;
                                                    if (i27 == i29) {
                                                    }
                                                }
                                                break;
                                            default:
                                                if (i60 == 3) {
                                                    int i114 = (i52 & (-8)) | 4;
                                                    zzix zzv = zzipVar2.zzv(i85);
                                                    bArr5 = bArr;
                                                    int zzc = zzga.zzc(zzv, bArr5, i57, i2, i114, zzfzVar);
                                                    zzhoVar3.add(zzfzVar.zzc);
                                                    while (zzc < i2) {
                                                        int zzh18 = zzga.zzh(bArr5, zzc, zzfzVar);
                                                        zzix zzixVar = zzv;
                                                        if (i52 == zzfzVar.zza) {
                                                            zzv = zzixVar;
                                                            zzc = zzga.zzc(zzv, bArr5, zzh18, i2, i114, zzfzVar);
                                                            zzhoVar3.add(zzfzVar.zzc);
                                                        } else {
                                                            i28 = i2;
                                                            i29 = i57;
                                                            unsafe = unsafe6;
                                                            i26 = i86;
                                                            i7 = i51;
                                                            zzipVar = zzipVar2;
                                                            zzfzVar5 = zzfzVar;
                                                            i27 = zzc;
                                                            i8 = i52;
                                                            if (i27 == i29) {
                                                            }
                                                        }
                                                    }
                                                    i28 = i2;
                                                    i29 = i57;
                                                    unsafe = unsafe6;
                                                    i26 = i86;
                                                    i7 = i51;
                                                    zzipVar = zzipVar2;
                                                    zzfzVar5 = zzfzVar;
                                                    i27 = zzc;
                                                    i8 = i52;
                                                    if (i27 == i29) {
                                                    }
                                                } else {
                                                    bArr5 = bArr;
                                                    i28 = i2;
                                                    i26 = i86;
                                                    i8 = i52;
                                                    i29 = i57;
                                                    unsafe = unsafe6;
                                                    i7 = i51;
                                                    zzfzVar5 = zzfzVar;
                                                    zzipVar = zzipVar2;
                                                    i27 = i29;
                                                    if (i27 == i29) {
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                    i10 = i27;
                                    i50 = i85;
                                    zzfzVar2 = zzfzVar5;
                                    i9 = i26;
                                    i4 = i3;
                                    bArr2 = bArr5;
                                } else if (i60 == 2) {
                                    zzho zzhoVar4 = (zzho) unsafe4.getObject(obj2, j);
                                    if (!zzhoVar4.zzc()) {
                                        int size3 = zzhoVar4.size();
                                        zzhoVar4 = zzhoVar4.zzd(size3 == 0 ? 10 : size3 + size3);
                                        unsafe4.putObject(obj2, j, zzhoVar4);
                                    }
                                    Unsafe unsafe10 = unsafe4;
                                    int zze = zzga.zze(zzipVar2.zzv(i85), i52, bArr, i57, i2, zzhoVar4, zzfzVar);
                                    i52 = i52;
                                    obj6 = obj2;
                                    bArr7 = bArr;
                                    i46 = i2;
                                    zzfzVar7 = zzfzVar;
                                    i49 = zze;
                                    i50 = i85;
                                    unsafe4 = unsafe10;
                                    i53 = i86;
                                    i47 = 0;
                                    i54 = i5;
                                    i48 = -1;
                                } else {
                                    bArr5 = bArr;
                                    zzipVar = zzipVar2;
                                    i26 = i86;
                                    i8 = i52;
                                    i27 = i57;
                                    unsafe = unsafe4;
                                    i7 = i51;
                                    zzfzVar5 = zzfzVar;
                                    i10 = i27;
                                    i50 = i85;
                                    zzfzVar2 = zzfzVar5;
                                    i9 = i26;
                                    i4 = i3;
                                    bArr2 = bArr5;
                                }
                            }
                        }
                        if (i8 == i4 || i4 == 0) {
                            if (zzipVar.zzh) {
                                zzgw zzgwVar = zzfzVar2.zzd;
                                int i115 = zzgw.zzb;
                                int i116 = zziu.zza;
                                if (zzgwVar != zzgw.zza) {
                                    if (zzgwVar.zzb(zzipVar.zzg, i9) != null) {
                                        throw null;
                                    }
                                    i46 = i2;
                                    i11 = i8;
                                    zzg = zzga.zzg(i11, bArr2, i10, i46, zzd(obj2), zzfzVar2);
                                    i49 = zzg;
                                    bArr7 = bArr;
                                    zzfzVar7 = zzfzVar;
                                    i53 = i9;
                                    zzipVar2 = zzipVar;
                                    obj6 = obj2;
                                    i47 = i6;
                                    i54 = i5;
                                    i51 = i7;
                                    i48 = -1;
                                    i52 = i11;
                                    unsafe4 = unsafe;
                                }
                            }
                            i11 = i8;
                            i46 = i2;
                            zzg = zzga.zzg(i11, bArr, i10, i46, zzd(obj2), zzfzVar);
                            i49 = zzg;
                            bArr7 = bArr;
                            zzfzVar7 = zzfzVar;
                            i53 = i9;
                            zzipVar2 = zzipVar;
                            obj6 = obj2;
                            i47 = i6;
                            i54 = i5;
                            i51 = i7;
                            i48 = -1;
                            i52 = i11;
                            unsafe4 = unsafe;
                        } else {
                            i46 = i2;
                            i49 = i10;
                            obj6 = obj2;
                            i52 = i8;
                            i54 = i5;
                            i51 = i7;
                        }
                    }
                    zzq = i48;
                    if (zzq != i48) {
                    }
                    if (i8 == i4) {
                    }
                    if (zzipVar.zzh) {
                    }
                    i11 = i8;
                    i46 = i2;
                    zzg = zzga.zzg(i11, bArr, i10, i46, zzd(obj2), zzfzVar);
                    i49 = zzg;
                    bArr7 = bArr;
                    zzfzVar7 = zzfzVar;
                    i53 = i9;
                    zzipVar2 = zzipVar;
                    obj6 = obj2;
                    i47 = i6;
                    i54 = i5;
                    i51 = i7;
                    i48 = -1;
                    i52 = i11;
                    unsafe4 = unsafe;
                } else {
                    if (i58 >= zzipVar2.zze && i58 <= zzipVar2.zzf) {
                        zzq = zzipVar2.zzq(i58, i47);
                        if (zzq != i48) {
                        }
                        if (i8 == i4) {
                        }
                        if (zzipVar.zzh) {
                        }
                        i11 = i8;
                        i46 = i2;
                        zzg = zzga.zzg(i11, bArr, i10, i46, zzd(obj2), zzfzVar);
                        i49 = zzg;
                        bArr7 = bArr;
                        zzfzVar7 = zzfzVar;
                        i53 = i9;
                        zzipVar2 = zzipVar;
                        obj6 = obj2;
                        i47 = i6;
                        i54 = i5;
                        i51 = i7;
                        i48 = -1;
                        i52 = i11;
                        unsafe4 = unsafe;
                    }
                    zzq = i48;
                    if (zzq != i48) {
                    }
                    if (i8 == i4) {
                    }
                    if (zzipVar.zzh) {
                    }
                    i11 = i8;
                    i46 = i2;
                    zzg = zzga.zzg(i11, bArr, i10, i46, zzd(obj2), zzfzVar);
                    i49 = zzg;
                    bArr7 = bArr;
                    zzfzVar7 = zzfzVar;
                    i53 = i9;
                    zzipVar2 = zzipVar;
                    obj6 = obj2;
                    i47 = i6;
                    i54 = i5;
                    i51 = i7;
                    i48 = -1;
                    i52 = i11;
                    unsafe4 = unsafe;
                }
            } else {
                zzipVar = zzipVar2;
                unsafe = unsafe4;
                i4 = i3;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final Object zze() {
        return ((zzhk) this.zzg).zzp();
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final void zzf(Object obj) {
        if (zzL(obj)) {
            if (obj instanceof zzhk) {
                zzhk zzhkVar = (zzhk) obj;
                zzhkVar.zzy(Integer.MAX_VALUE);
                zzhkVar.zza = 0;
                zzhkVar.zzw();
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
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                                ((zzho) zzjq.zzf(obj, j)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzig) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzM(obj, this.zzc[i], i)) {
                        zzv(i).zzf(zzb.getObject(obj, j));
                    }
                }
                if (zzI(obj, i)) {
                    zzv(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzl.zza(obj);
            if (this.zzh) {
                this.zzm.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final void zzg(Object obj, Object obj2) {
        zzA(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzs = zzs(i);
            int i2 = 1048575 & zzs;
            int[] iArr = this.zzc;
            int zzr = zzr(zzs);
            int i3 = iArr[i];
            long j = i2;
            switch (zzr) {
                case 0:
                    if (zzI(obj2, i)) {
                        zzjq.zzo(obj, j, zzjq.zza(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzI(obj2, i)) {
                        zzjq.zzp(obj, j, zzjq.zzb(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzI(obj2, i)) {
                        zzjq.zzr(obj, j, zzjq.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzI(obj2, i)) {
                        zzjq.zzr(obj, j, zzjq.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzI(obj2, i)) {
                        zzjq.zzq(obj, j, zzjq.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzI(obj2, i)) {
                        zzjq.zzr(obj, j, zzjq.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzI(obj2, i)) {
                        zzjq.zzq(obj, j, zzjq.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzI(obj2, i)) {
                        zzjq.zzm(obj, j, zzjq.zzw(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzI(obj2, i)) {
                        zzjq.zzs(obj, j, zzjq.zzf(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzB(obj, obj2, i);
                    break;
                case 10:
                    if (zzI(obj2, i)) {
                        zzjq.zzs(obj, j, zzjq.zzf(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzI(obj2, i)) {
                        zzjq.zzq(obj, j, zzjq.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzI(obj2, i)) {
                        zzjq.zzq(obj, j, zzjq.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzI(obj2, i)) {
                        zzjq.zzq(obj, j, zzjq.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzI(obj2, i)) {
                        zzjq.zzr(obj, j, zzjq.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzI(obj2, i)) {
                        zzjq.zzq(obj, j, zzjq.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzI(obj2, i)) {
                        zzjq.zzr(obj, j, zzjq.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
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
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    zzho zzhoVar = (zzho) zzjq.zzf(obj, j);
                    zzho zzhoVar2 = (zzho) zzjq.zzf(obj2, j);
                    int size = zzhoVar.size();
                    int size2 = zzhoVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzhoVar.zzc()) {
                            zzhoVar = zzhoVar.zzd(size2 + size);
                        }
                        zzhoVar.addAll(zzhoVar2);
                    }
                    if (size > 0) {
                        zzhoVar2 = zzhoVar;
                    }
                    zzjq.zzs(obj, j, zzhoVar2);
                    break;
                case 50:
                    int i4 = zziz.zza;
                    zzjq.zzs(obj, j, zzih.zza(zzjq.zzf(obj, j), zzjq.zzf(obj2, j)));
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzM(obj2, i3, i)) {
                        zzjq.zzs(obj, j, zzjq.zzf(obj2, j));
                        zzE(obj, i3, i);
                        break;
                    } else {
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
                    if (zzM(obj2, i3, i)) {
                        zzjq.zzs(obj, j, zzjq.zzf(obj2, j));
                        zzE(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzC(obj, obj2, i);
                    break;
            }
        }
        zziz.zzp(this.zzl, obj, obj2);
        if (this.zzh) {
            zziz.zzo(this.zzm, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final void zzh(Object obj, byte[] bArr, int i, int i2, zzfz zzfzVar) throws IOException {
        zzc(obj, bArr, i, i2, 0, zzfzVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:251:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    @Override // com.google.android.gms.internal.play_billing.zzix
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(Object obj, zzjw zzjwVar) throws IOException {
        Map.Entry entry;
        int[] iArr;
        int i;
        int i2;
        int i3;
        zzip<T> zzipVar = this;
        if (zzipVar.zzh) {
            zzhb zzhbVar = ((zzhh) obj).zzb;
            if (!zzhbVar.zza.isEmpty()) {
                entry = (Map.Entry) zzhbVar.zze().next();
                iArr = zzipVar.zzc;
                Unsafe unsafe = zzb;
                int i4 = 1048575;
                int i5 = 1048575;
                i = 0;
                int i6 = 0;
                while (i < iArr.length) {
                    int zzs = zzipVar.zzs(i);
                    int[] iArr2 = zzipVar.zzc;
                    int zzr = zzr(zzs);
                    int i7 = iArr2[i];
                    if (zzr <= 17) {
                        int i8 = iArr2[i + 2];
                        int i9 = i8 & i4;
                        if (i9 != i5) {
                            i6 = i9 == i4 ? 0 : unsafe.getInt(obj, i9);
                            i5 = i9;
                        }
                        int i10 = 1 << (i8 >>> 20);
                        i2 = zzs;
                        i3 = i10;
                    } else {
                        i2 = zzs;
                        i3 = 0;
                    }
                    if (entry != null) {
                        throw null;
                    }
                    long j = i2 & i4;
                    switch (zzr) {
                        case 0:
                            if (zzipVar.zzJ(obj, i, i5, i6, i3)) {
                                zzjwVar.zzf(i7, zzjq.zza(obj, j));
                                continue;
                            }
                            i += 3;
                            i4 = 1048575;
                            zzipVar = this;
                        case 1:
                            if (zzipVar.zzJ(obj, i, i5, i6, i3)) {
                                zzjwVar.zzo(i7, zzjq.zzb(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i4 = 1048575;
                            zzipVar = this;
                        case 2:
                            if (zzipVar.zzJ(obj, i, i5, i6, i3)) {
                                zzjwVar.zzt(i7, unsafe.getLong(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i4 = 1048575;
                            zzipVar = this;
                        case 3:
                            if (zzipVar.zzJ(obj, i, i5, i6, i3)) {
                                zzjwVar.zzK(i7, unsafe.getLong(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i4 = 1048575;
                            zzipVar = this;
                        case 4:
                            if (zzipVar.zzJ(obj, i, i5, i6, i3)) {
                                zzjwVar.zzr(i7, unsafe.getInt(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i4 = 1048575;
                            zzipVar = this;
                        case 5:
                            if (zzipVar.zzJ(obj, i, i5, i6, i3)) {
                                zzjwVar.zzm(i7, unsafe.getLong(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i4 = 1048575;
                            zzipVar = this;
                        case 6:
                            if (zzipVar.zzJ(obj, i, i5, i6, i3)) {
                                zzjwVar.zzk(i7, unsafe.getInt(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i4 = 1048575;
                            zzipVar = this;
                        case 7:
                            if (zzipVar.zzJ(obj, i, i5, i6, i3)) {
                                zzjwVar.zzb(i7, zzjq.zzw(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i4 = 1048575;
                            zzipVar = this;
                        case 8:
                            if (zzipVar.zzJ(obj, i, i5, i6, i3)) {
                                zzO(i7, unsafe.getObject(obj, j), zzjwVar);
                            } else {
                                continue;
                            }
                            i += 3;
                            i4 = 1048575;
                            zzipVar = this;
                        case 9:
                            if (zzipVar.zzJ(obj, i, i5, i6, i3)) {
                                zzjwVar.zzv(i7, unsafe.getObject(obj, j), zzipVar.zzv(i));
                            } else {
                                continue;
                            }
                            i += 3;
                            i4 = 1048575;
                            zzipVar = this;
                        case 10:
                            if (zzipVar.zzJ(obj, i, i5, i6, i3)) {
                                zzjwVar.zzd(i7, (zzgk) unsafe.getObject(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i4 = 1048575;
                            zzipVar = this;
                        case 11:
                            if (zzipVar.zzJ(obj, i, i5, i6, i3)) {
                                zzjwVar.zzI(i7, unsafe.getInt(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i4 = 1048575;
                            zzipVar = this;
                        case 12:
                            if (zzipVar.zzJ(obj, i, i5, i6, i3)) {
                                zzjwVar.zzi(i7, unsafe.getInt(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i4 = 1048575;
                            zzipVar = this;
                        case 13:
                            if (zzipVar.zzJ(obj, i, i5, i6, i3)) {
                                zzjwVar.zzx(i7, unsafe.getInt(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i4 = 1048575;
                            zzipVar = this;
                        case 14:
                            if (zzipVar.zzJ(obj, i, i5, i6, i3)) {
                                zzjwVar.zzz(i7, unsafe.getLong(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i4 = 1048575;
                            zzipVar = this;
                        case 15:
                            if (zzipVar.zzJ(obj, i, i5, i6, i3)) {
                                zzjwVar.zzB(i7, unsafe.getInt(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i4 = 1048575;
                            zzipVar = this;
                        case 16:
                            if (zzipVar.zzJ(obj, i, i5, i6, i3)) {
                                zzjwVar.zzD(i7, unsafe.getLong(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            i4 = 1048575;
                            zzipVar = this;
                        case 17:
                            if (zzipVar.zzJ(obj, i, i5, i6, i3)) {
                                zzjwVar.zzq(i7, unsafe.getObject(obj, j), zzipVar.zzv(i));
                            } else {
                                continue;
                            }
                            i += 3;
                            i4 = 1048575;
                            zzipVar = this;
                        case 18:
                            zziz.zzr(zzipVar.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, false);
                            continue;
                            i += 3;
                            i4 = 1048575;
                            zzipVar = this;
                        case 19:
                            zziz.zzv(zzipVar.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, false);
                            continue;
                            i += 3;
                            i4 = 1048575;
                            zzipVar = this;
                        case 20:
                            zziz.zzx(zzipVar.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, false);
                            continue;
                            i += 3;
                            i4 = 1048575;
                            zzipVar = this;
                        case 21:
                            zziz.zzD(zzipVar.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, false);
                            continue;
                            i += 3;
                            i4 = 1048575;
                            zzipVar = this;
                        case 22:
                            zziz.zzw(zzipVar.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, false);
                            continue;
                            i += 3;
                            i4 = 1048575;
                            zzipVar = this;
                        case 23:
                            zziz.zzu(zzipVar.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, false);
                            continue;
                            i += 3;
                            i4 = 1048575;
                            zzipVar = this;
                        case 24:
                            zziz.zzt(zzipVar.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, false);
                            continue;
                            i += 3;
                            i4 = 1048575;
                            zzipVar = this;
                        case 25:
                            zziz.zzq(zzipVar.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, false);
                            continue;
                            i += 3;
                            i4 = 1048575;
                            zzipVar = this;
                        case 26:
                            int i11 = zzipVar.zzc[i];
                            List list = (List) unsafe.getObject(obj, j);
                            int i12 = zziz.zza;
                            if (list != null && !list.isEmpty()) {
                                zzjwVar.zzH(i11, list);
                                break;
                            }
                            break;
                        case 27:
                            int i13 = zzipVar.zzc[i];
                            List list2 = (List) unsafe.getObject(obj, j);
                            zzix zzv = zzipVar.zzv(i);
                            int i14 = zziz.zza;
                            if (list2 != null && !list2.isEmpty()) {
                                for (int i15 = 0; i15 < list2.size(); i15++) {
                                    ((zzgs) zzjwVar).zzv(i13, list2.get(i15), zzv);
                                }
                                break;
                            }
                            break;
                        case 28:
                            int i16 = zzipVar.zzc[i];
                            List list3 = (List) unsafe.getObject(obj, j);
                            int i17 = zziz.zza;
                            if (list3 != null && !list3.isEmpty()) {
                                zzjwVar.zze(i16, list3);
                                break;
                            }
                            break;
                        case 29:
                            zziz.zzC(zzipVar.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, false);
                            continue;
                            i += 3;
                            i4 = 1048575;
                            zzipVar = this;
                        case 30:
                            zziz.zzs(zzipVar.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, false);
                            continue;
                            i += 3;
                            i4 = 1048575;
                            zzipVar = this;
                        case 31:
                            zziz.zzy(zzipVar.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, false);
                            continue;
                            i += 3;
                            i4 = 1048575;
                            zzipVar = this;
                        case 32:
                            zziz.zzz(zzipVar.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, false);
                            continue;
                            i += 3;
                            i4 = 1048575;
                            zzipVar = this;
                        case 33:
                            zziz.zzA(zzipVar.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, false);
                            continue;
                            i += 3;
                            i4 = 1048575;
                            zzipVar = this;
                        case 34:
                            zziz.zzB(zzipVar.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, false);
                            continue;
                            i += 3;
                            i4 = 1048575;
                            zzipVar = this;
                        case 35:
                            zziz.zzr(zzipVar.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, true);
                            break;
                        case 36:
                            zziz.zzv(zzipVar.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, true);
                            break;
                        case 37:
                            zziz.zzx(zzipVar.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, true);
                            break;
                        case 38:
                            zziz.zzD(zzipVar.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, true);
                            break;
                        case 39:
                            zziz.zzw(zzipVar.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, true);
                            break;
                        case 40:
                            zziz.zzu(zzipVar.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, true);
                            break;
                        case 41:
                            zziz.zzt(zzipVar.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, true);
                            break;
                        case 42:
                            zziz.zzq(zzipVar.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, true);
                            break;
                        case 43:
                            zziz.zzC(zzipVar.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, true);
                            break;
                        case 44:
                            zziz.zzs(zzipVar.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, true);
                            break;
                        case 45:
                            zziz.zzy(zzipVar.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, true);
                            break;
                        case 46:
                            zziz.zzz(zzipVar.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, true);
                            break;
                        case 47:
                            zziz.zzA(zzipVar.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, true);
                            break;
                        case 48:
                            zziz.zzB(zzipVar.zzc[i], (List) unsafe.getObject(obj, j), zzjwVar, true);
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                            int i18 = zzipVar.zzc[i];
                            List list4 = (List) unsafe.getObject(obj, j);
                            zzix zzv2 = zzipVar.zzv(i);
                            int i19 = zziz.zza;
                            if (list4 != null && !list4.isEmpty()) {
                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                    ((zzgs) zzjwVar).zzq(i18, list4.get(i20), zzv2);
                                }
                                break;
                            }
                            break;
                        case 50:
                            if (unsafe.getObject(obj, j) != null) {
                                throw null;
                            }
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                            if (zzipVar.zzM(obj, i7, i)) {
                                zzjwVar.zzf(i7, zzm(obj, j));
                                break;
                            }
                            break;
                        case 52:
                            if (zzipVar.zzM(obj, i7, i)) {
                                zzjwVar.zzo(i7, zzn(obj, j));
                                break;
                            }
                            break;
                        case 53:
                            if (zzipVar.zzM(obj, i7, i)) {
                                zzjwVar.zzt(i7, zzt(obj, j));
                                break;
                            }
                            break;
                        case 54:
                            if (zzipVar.zzM(obj, i7, i)) {
                                zzjwVar.zzK(i7, zzt(obj, j));
                                break;
                            }
                            break;
                        case 55:
                            if (zzipVar.zzM(obj, i7, i)) {
                                zzjwVar.zzr(i7, zzo(obj, j));
                                break;
                            }
                            break;
                        case 56:
                            if (zzipVar.zzM(obj, i7, i)) {
                                zzjwVar.zzm(i7, zzt(obj, j));
                                break;
                            }
                            break;
                        case 57:
                            if (zzipVar.zzM(obj, i7, i)) {
                                zzjwVar.zzk(i7, zzo(obj, j));
                                break;
                            }
                            break;
                        case 58:
                            if (zzipVar.zzM(obj, i7, i)) {
                                zzjwVar.zzb(i7, zzN(obj, j));
                                break;
                            }
                            break;
                        case 59:
                            if (zzipVar.zzM(obj, i7, i)) {
                                zzO(i7, unsafe.getObject(obj, j), zzjwVar);
                                break;
                            }
                            break;
                        case 60:
                            if (zzipVar.zzM(obj, i7, i)) {
                                zzjwVar.zzv(i7, unsafe.getObject(obj, j), zzipVar.zzv(i));
                                break;
                            }
                            break;
                        case 61:
                            if (zzipVar.zzM(obj, i7, i)) {
                                zzjwVar.zzd(i7, (zzgk) unsafe.getObject(obj, j));
                                break;
                            }
                            break;
                        case 62:
                            if (zzipVar.zzM(obj, i7, i)) {
                                zzjwVar.zzI(i7, zzo(obj, j));
                                break;
                            }
                            break;
                        case 63:
                            if (zzipVar.zzM(obj, i7, i)) {
                                zzjwVar.zzi(i7, zzo(obj, j));
                                break;
                            }
                            break;
                        case 64:
                            if (zzipVar.zzM(obj, i7, i)) {
                                zzjwVar.zzx(i7, zzo(obj, j));
                                break;
                            }
                            break;
                        case 65:
                            if (zzipVar.zzM(obj, i7, i)) {
                                zzjwVar.zzz(i7, zzt(obj, j));
                                break;
                            }
                            break;
                        case 66:
                            if (zzipVar.zzM(obj, i7, i)) {
                                zzjwVar.zzB(i7, zzo(obj, j));
                                break;
                            }
                            break;
                        case 67:
                            if (zzipVar.zzM(obj, i7, i)) {
                                zzjwVar.zzD(i7, zzt(obj, j));
                                break;
                            }
                            break;
                        case 68:
                            if (zzipVar.zzM(obj, i7, i)) {
                                zzjwVar.zzq(i7, unsafe.getObject(obj, j), zzipVar.zzv(i));
                                break;
                            }
                            break;
                    }
                    i += 3;
                    i4 = 1048575;
                    zzipVar = this;
                }
                if (entry != null) {
                    ((zzhk) obj).zzc.zzl(zzjwVar);
                    return;
                } else {
                    throw null;
                }
            }
        }
        entry = null;
        iArr = zzipVar.zzc;
        Unsafe unsafe2 = zzb;
        int i42 = 1048575;
        int i52 = 1048575;
        i = 0;
        int i62 = 0;
        while (i < iArr.length) {
        }
        if (entry != null) {
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzE;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzs = zzs(i);
            long j = zzs & 1048575;
            switch (zzr(zzs)) {
                case 0:
                    if (zzH(obj, obj2, i) && Double.doubleToLongBits(zzjq.zza(obj, j)) == Double.doubleToLongBits(zzjq.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzH(obj, obj2, i) && Float.floatToIntBits(zzjq.zzb(obj, j)) == Float.floatToIntBits(zzjq.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzH(obj, obj2, i) && zzjq.zzd(obj, j) == zzjq.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzH(obj, obj2, i) && zzjq.zzd(obj, j) == zzjq.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzH(obj, obj2, i) && zzjq.zzc(obj, j) == zzjq.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzH(obj, obj2, i) && zzjq.zzd(obj, j) == zzjq.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzH(obj, obj2, i) && zzjq.zzc(obj, j) == zzjq.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzH(obj, obj2, i) && zzjq.zzw(obj, j) == zzjq.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzH(obj, obj2, i) && zziz.zzE(zzjq.zzf(obj, j), zzjq.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzH(obj, obj2, i) && zziz.zzE(zzjq.zzf(obj, j), zzjq.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzH(obj, obj2, i) && zziz.zzE(zzjq.zzf(obj, j), zzjq.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzH(obj, obj2, i) && zzjq.zzc(obj, j) == zzjq.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzH(obj, obj2, i) && zzjq.zzc(obj, j) == zzjq.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzH(obj, obj2, i) && zzjq.zzc(obj, j) == zzjq.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzH(obj, obj2, i) && zzjq.zzd(obj, j) == zzjq.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzH(obj, obj2, i) && zzjq.zzc(obj, j) == zzjq.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzH(obj, obj2, i) && zzjq.zzd(obj, j) == zzjq.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzH(obj, obj2, i) && zziz.zzE(zzjq.zzf(obj, j), zzjq.zzf(obj2, j))) {
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
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    zzE = zziz.zzE(zzjq.zzf(obj, j), zzjq.zzf(obj2, j));
                    break;
                case 50:
                    zzE = zziz.zzE(zzjq.zzf(obj, j), zzjq.zzf(obj2, j));
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
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
                    if (zzjq.zzc(obj, zzp) == zzjq.zzc(obj2, zzp) && zziz.zzE(zzjq.zzf(obj, j), zzjq.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzE) {
                return false;
            }
        }
        if (!((zzhk) obj).zzc.equals(((zzhk) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzhh) obj).zzb.equals(((zzhh) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i3 < this.zzj) {
            int[] iArr = this.zzi;
            int[] iArr2 = this.zzc;
            int i6 = iArr[i3];
            int i7 = iArr2[i6];
            int zzs = zzs(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i4 = zzb.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i5;
                i2 = i4;
            }
            Object obj2 = obj;
            if ((268435456 & zzs) != 0 && !zzJ(obj2, i6, i, i2, i10)) {
                return false;
            }
            int zzr = zzr(zzs);
            if (zzr != 9 && zzr != 17) {
                if (zzr != 27) {
                    if (zzr == 60 || zzr == 68) {
                        if (zzM(obj2, i7, i6) && !zzK(obj2, zzs, zzv(i6))) {
                            return false;
                        }
                    } else if (zzr != 49) {
                        if (zzr == 50 && !((zzig) zzjq.zzf(obj2, zzs & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzjq.zzf(obj2, zzs & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzix zzv = zzv(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzv.zzk(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (zzJ(obj2, i6, i, i2, i10) && !zzK(obj2, zzs, zzv(i6))) {
                return false;
            }
            i3++;
            obj = obj2;
            i5 = i;
            i4 = i2;
        }
        return !this.zzh || ((zzhh) obj).zzb.zzh();
    }
}
