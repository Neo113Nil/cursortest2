package com.google.android.gms.internal.measurement;

import androidx.collection.e;
import androidx.concurrent.futures.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.appevents.q;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes4.dex */
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
        if (!zzA(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
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
        zzot zzotVar2 = zzot.zza;
        switch (zzotVar.ordinal()) {
            case 0:
                int i3 = i + 8;
                zzkwVar.zzc = Double.valueOf(Double.longBitsToDouble(zzkx.zze(bArr, i)));
                return i3;
            case 1:
                int i4 = i + 4;
                zzkwVar.zzc = Float.valueOf(Float.intBitsToFloat(zzkx.zzd(bArr, i)));
                return i4;
            case 2:
            case 3:
                int zzc = zzkx.zzc(bArr, i, zzkwVar);
                zzkwVar.zzc = Long.valueOf(zzkwVar.zzb);
                return zzc;
            case 4:
            case 12:
            case 13:
                int zza2 = zzkx.zza(bArr, i, zzkwVar);
                zzkwVar.zzc = Integer.valueOf(zzkwVar.zza);
                return zza2;
            case 5:
            case 15:
                int i5 = i + 8;
                zzkwVar.zzc = Long.valueOf(zzkx.zze(bArr, i));
                return i5;
            case 6:
            case 14:
                int i6 = i + 4;
                zzkwVar.zzc = Integer.valueOf(zzkx.zzd(bArr, i));
                return i6;
            case 7:
                int zzc2 = zzkx.zzc(bArr, i, zzkwVar);
                zzkwVar.zzc = Boolean.valueOf(zzkwVar.zzb != 0);
                return zzc2;
            case 8:
                return zzkx.zzf(bArr, i, zzkwVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return zzkx.zzh(zznu.zza().zzb(cls), bArr, i, i2, zzkwVar);
            case 11:
                return zzkx.zzg(bArr, i, zzkwVar);
            case 16:
                int zza3 = zzkx.zza(bArr, i, zzkwVar);
                zzkwVar.zzc = Integer.valueOf(zzlj.zzb(zzkwVar.zza));
                return zza3;
            case 17:
                int zzc3 = zzkx.zzc(bArr, i, zzkwVar);
                zzkwVar.zzc = Long.valueOf(zzlj.zzc(zzkwVar.zzb));
                return zzc3;
        }
    }

    private static final void zzP(int i, Object obj, zzov zzovVar) throws IOException {
        if (obj instanceof String) {
            zzovVar.zzm(i, (String) obj);
        } else {
            zzovVar.zzn(i, (zzlh) obj);
        }
    }

    public static zzoj zzg(Object obj) {
        zzmf zzmfVar = (zzmf) obj;
        zzoj zzojVar = zzmfVar.zzc;
        if (zzojVar != zzoj.zza()) {
            return zzojVar;
        }
        zzoj zzb2 = zzoj.zzb();
        zzmfVar.zzc = zzb2;
        return zzb2;
    }

    public static zznp zzl(Class cls, zznj zznjVar, zznr zznrVar, zzmy zzmyVar, zzoi zzoiVar, zzls zzlsVar, zznh zznhVar) {
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
        zznw zznwVar;
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
        Field zzm;
        char charAt10;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        Field zzm2;
        Field zzm3;
        int i34;
        char charAt11;
        int i35;
        int i36;
        char charAt12;
        int i37;
        char charAt13;
        int i38;
        char charAt14;
        if (!(zznjVar instanceof zznw)) {
            throw null;
        }
        zznw zznwVar2 = (zznw) zznjVar;
        String zzd = zznwVar2.zzd();
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
        Object[] zze = zznwVar2.zze();
        Class<?> cls2 = zznwVar2.zzb().getClass();
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
                    zznwVar = zznwVar2;
                    if (charAt12 < 55296) {
                        break;
                    }
                    i80 |= (charAt12 & 8191) << i82;
                    i82 += 13;
                    i81 = i36;
                    zznwVar2 = zznwVar;
                }
                charAt24 = i80 | (charAt12 << i82);
                i17 = i36;
            } else {
                zznwVar = zznwVar2;
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
                        if (zznwVar.zzc() == 1 || i85 != 0) {
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
                    zzm2 = (Field) obj;
                } else {
                    zzm2 = zzm(cls2, (String) obj);
                    zze[i93] = zzm2;
                }
                Object[] objArr3 = objArr2;
                int i95 = i6;
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzm2);
                int i96 = i93 + 1;
                Object obj2 = zze[i96];
                if (obj2 instanceof Field) {
                    zzm3 = (Field) obj2;
                } else {
                    zzm3 = zzm(cls2, (String) obj2);
                    zze[i96] = zzm3;
                }
                int objectFieldOffset3 = (int) unsafe.objectFieldOffset(zzm3);
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
                Field zzm4 = zzm(cls2, (String) zze[i6]);
                i18 = charAt23;
                if (i83 == 9 || i83 == 17) {
                    i19 = i7;
                    objArr[q.a(i73, 3, 1)] = zzm4.getType();
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
                            if (zznwVar.zzc() == 1 || i85 != 0) {
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
                        objectFieldOffset = (int) unsafe.objectFieldOffset(zzm4);
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
                                zzm = (Field) obj3;
                            } else {
                                zzm = zzm(cls2, (String) obj3);
                                zze[i105] = zzm;
                            }
                            i22 = i97;
                            i24 = charAt26 % 32;
                            i21 = (int) unsafe.objectFieldOffset(zzm);
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
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzm4);
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
            zznwVar2 = zznwVar;
            i7 = i19;
            objArr2 = objArr;
        }
        return new zznp(iArr3, objArr2, i2, i4, zznwVar2.zzb(), false, iArr, i5, i69, zznrVar, zzmyVar, zzoiVar, zzlsVar, zznhVar);
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
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(arrays).length());
            e.d(sb, "Field ", str, " for ", name);
            throw new RuntimeException(a.a(sb, " not found. Known fields are ", arrays), e);
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
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    zzB = zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j));
                    break;
                case 50:
                    zzB = zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j));
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
        int i2;
        int floatToIntBits;
        int zzd;
        int i3;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i4 >= iArr.length) {
                int hashCode = ((zzmf) obj).zzc.hashCode() + (i5 * 53);
                return this.zzh ? (hashCode * 53) + ((zzmc) obj).zzb.zza.hashCode() : hashCode;
            }
            int zzx = zzx(i4);
            int i6 = 1048575 & zzx;
            int zzz = zzz(zzx);
            int i7 = iArr[i4];
            long j = i6;
            int i8 = 37;
            switch (zzz) {
                case 0:
                    i = i5 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzop.zzl(obj, j));
                    byte[] bArr = zzmp.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i5 = i + zzd;
                    break;
                case 1:
                    i2 = i5 * 53;
                    floatToIntBits = Float.floatToIntBits(zzop.zzj(obj, j));
                    i5 = floatToIntBits + i2;
                    break;
                case 2:
                    i = i5 * 53;
                    doubleToLongBits = zzop.zzf(obj, j);
                    byte[] bArr2 = zzmp.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i5 = i + zzd;
                    break;
                case 3:
                    i = i5 * 53;
                    doubleToLongBits = zzop.zzf(obj, j);
                    byte[] bArr3 = zzmp.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i5 = i + zzd;
                    break;
                case 4:
                    i = i5 * 53;
                    zzd = zzop.zzd(obj, j);
                    i5 = i + zzd;
                    break;
                case 5:
                    i = i5 * 53;
                    doubleToLongBits = zzop.zzf(obj, j);
                    byte[] bArr4 = zzmp.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i5 = i + zzd;
                    break;
                case 6:
                    i = i5 * 53;
                    zzd = zzop.zzd(obj, j);
                    i5 = i + zzd;
                    break;
                case 7:
                    i2 = i5 * 53;
                    floatToIntBits = zzmp.zzb(zzop.zzh(obj, j));
                    i5 = floatToIntBits + i2;
                    break;
                case 8:
                    i2 = i5 * 53;
                    floatToIntBits = ((String) zzop.zzn(obj, j)).hashCode();
                    i5 = floatToIntBits + i2;
                    break;
                case 9:
                    i3 = i5 * 53;
                    Object zzn = zzop.zzn(obj, j);
                    if (zzn != null) {
                        i8 = zzn.hashCode();
                    }
                    i5 = i3 + i8;
                    break;
                case 10:
                    i2 = i5 * 53;
                    floatToIntBits = zzop.zzn(obj, j).hashCode();
                    i5 = floatToIntBits + i2;
                    break;
                case 11:
                    i = i5 * 53;
                    zzd = zzop.zzd(obj, j);
                    i5 = i + zzd;
                    break;
                case 12:
                    i = i5 * 53;
                    zzd = zzop.zzd(obj, j);
                    i5 = i + zzd;
                    break;
                case 13:
                    i = i5 * 53;
                    zzd = zzop.zzd(obj, j);
                    i5 = i + zzd;
                    break;
                case 14:
                    i = i5 * 53;
                    doubleToLongBits = zzop.zzf(obj, j);
                    byte[] bArr5 = zzmp.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i5 = i + zzd;
                    break;
                case 15:
                    i = i5 * 53;
                    zzd = zzop.zzd(obj, j);
                    i5 = i + zzd;
                    break;
                case 16:
                    i = i5 * 53;
                    doubleToLongBits = zzop.zzf(obj, j);
                    byte[] bArr6 = zzmp.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i5 = i + zzd;
                    break;
                case 17:
                    i3 = i5 * 53;
                    Object zzn2 = zzop.zzn(obj, j);
                    if (zzn2 != null) {
                        i8 = zzn2.hashCode();
                    }
                    i5 = i3 + i8;
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
                    i2 = i5 * 53;
                    floatToIntBits = zzop.zzn(obj, j).hashCode();
                    i5 = floatToIntBits + i2;
                    break;
                case 50:
                    i2 = i5 * 53;
                    floatToIntBits = zzop.zzn(obj, j).hashCode();
                    i5 = floatToIntBits + i2;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzC(obj, j));
                        byte[] bArr7 = zzmp.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + zzd;
                        break;
                    }
                case 52:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = Float.floatToIntBits(zzD(obj, j));
                        i5 = floatToIntBits + i2;
                        break;
                    }
                case 53:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        doubleToLongBits = zzF(obj, j);
                        byte[] bArr8 = zzmp.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + zzd;
                        break;
                    }
                case 54:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        doubleToLongBits = zzF(obj, j);
                        byte[] bArr9 = zzmp.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + zzd;
                        break;
                    }
                case 55:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        zzd = zzE(obj, j);
                        i5 = i + zzd;
                        break;
                    }
                case 56:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        doubleToLongBits = zzF(obj, j);
                        byte[] bArr10 = zzmp.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + zzd;
                        break;
                    }
                case 57:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        zzd = zzE(obj, j);
                        i5 = i + zzd;
                        break;
                    }
                case 58:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = zzmp.zzb(zzG(obj, j));
                        i5 = floatToIntBits + i2;
                        break;
                    }
                case 59:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = ((String) zzop.zzn(obj, j)).hashCode();
                        i5 = floatToIntBits + i2;
                        break;
                    }
                case 60:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = zzop.zzn(obj, j).hashCode();
                        i5 = floatToIntBits + i2;
                        break;
                    }
                case 61:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = zzop.zzn(obj, j).hashCode();
                        i5 = floatToIntBits + i2;
                        break;
                    }
                case 62:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        zzd = zzE(obj, j);
                        i5 = i + zzd;
                        break;
                    }
                case 63:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        zzd = zzE(obj, j);
                        i5 = i + zzd;
                        break;
                    }
                case 64:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        zzd = zzE(obj, j);
                        i5 = i + zzd;
                        break;
                    }
                case 65:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        doubleToLongBits = zzF(obj, j);
                        byte[] bArr11 = zzmp.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + zzd;
                        break;
                    }
                case 66:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        zzd = zzE(obj, j);
                        i5 = i + zzd;
                        break;
                    }
                case 67:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        doubleToLongBits = zzF(obj, j);
                        byte[] bArr12 = zzmp.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + zzd;
                        break;
                    }
                case 68:
                    if (!zzL(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = zzop.zzn(obj, j).hashCode();
                        i5 = floatToIntBits + i2;
                        break;
                    }
            }
            i4 += 3;
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
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
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
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
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

    @Override // com.google.android.gms.internal.measurement.zznx
    public final int zze(Object obj) {
        int i;
        int zzz;
        int zzA;
        int zzz2;
        int zzc;
        int zzz3;
        int zzz4;
        int zzG;
        int zzz5;
        int size;
        int zzp;
        int zzz6;
        int zzz7;
        int zzz8;
        int zzx;
        int zzz9;
        int zzz10;
        int i2;
        int zzz11;
        int zzA2;
        zznp<T> zznpVar = this;
        Object obj2 = obj;
        Unsafe unsafe = zzb;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1048575;
        while (true) {
            int[] iArr = zznpVar.zzc;
            if (i4 >= iArr.length) {
                int zzi = ((zzmf) obj).zzc.zzi() + i6;
                if (!zznpVar.zzh) {
                    return zzi;
                }
                zzoe zzoeVar = ((zzmc) obj).zzb.zza;
                int zzc2 = zzoeVar.zzc();
                int i8 = 0;
                for (int i9 = 0; i9 < zzc2; i9++) {
                    Map.Entry zzd = zzoeVar.zzd(i9);
                    i8 += zzlw.zzj((zzlv) ((zzob) zzd).zza(), zzd.getValue());
                }
                for (Map.Entry entry : zzoeVar.zze()) {
                    i8 += zzlw.zzj((zzlv) entry.getKey(), entry.getValue());
                }
                return zzi + i8;
            }
            int zzx2 = zznpVar.zzx(i4);
            int zzz12 = zzz(zzx2);
            int i10 = iArr[i4];
            int i11 = iArr[i4 + 2];
            int i12 = i11 & i3;
            if (zzz12 <= 17) {
                if (i12 != i7) {
                    i5 = i12 == i3 ? 0 : unsafe.getInt(obj2, i12);
                    i7 = i12;
                }
                i = 1 << (i11 >>> 20);
            } else {
                i = 0;
            }
            int i13 = zzx2 & i3;
            if (zzz12 >= zzlx.zzJ.zza()) {
                zzlx.zzW.zza();
            }
            long j = i13;
            switch (zzz12) {
                case 0:
                    if (zznpVar.zzI(obj2, i4, i7, i5, i)) {
                        i6 = androidx.core.database.a.a(i10 << 3, 8, i6);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zznpVar.zzI(obj2, i4, i7, i5, i)) {
                        i6 = androidx.core.database.a.a(i10 << 3, 4, i6);
                    }
                    zznpVar = this;
                    break;
                case 2:
                    if (zznpVar.zzI(obj2, i4, i7, i5, i)) {
                        long j2 = unsafe.getLong(obj2, j);
                        zzz = zzlm.zzz(i10 << 3);
                        zzA = zzlm.zzA(j2);
                        i6 += zzA + zzz;
                    }
                    zznpVar = this;
                    break;
                case 3:
                    if (zznpVar.zzI(obj2, i4, i7, i5, i)) {
                        long j3 = unsafe.getLong(obj2, j);
                        zzz = zzlm.zzz(i10 << 3);
                        zzA = zzlm.zzA(j3);
                        i6 += zzA + zzz;
                    }
                    zznpVar = this;
                    break;
                case 4:
                    if (zznpVar.zzI(obj2, i4, i7, i5, i)) {
                        long j4 = unsafe.getInt(obj2, j);
                        zzz = zzlm.zzz(i10 << 3);
                        zzA = zzlm.zzA(j4);
                        i6 += zzA + zzz;
                    }
                    zznpVar = this;
                    break;
                case 5:
                    if (zznpVar.zzI(obj2, i4, i7, i5, i)) {
                        i6 = androidx.core.database.a.a(i10 << 3, 8, i6);
                    }
                    zznpVar = this;
                    break;
                case 6:
                    if (zznpVar.zzI(obj2, i4, i7, i5, i)) {
                        i6 = androidx.core.database.a.a(i10 << 3, 4, i6);
                    }
                    zznpVar = this;
                    break;
                case 7:
                    if (zznpVar.zzI(obj2, i4, i7, i5, i)) {
                        i6 = androidx.core.database.a.a(i10 << 3, 1, i6);
                    }
                    zznpVar = this;
                    break;
                case 8:
                    if (zznpVar.zzI(obj2, i4, i7, i5, i)) {
                        int i14 = i10 << 3;
                        Object object = unsafe.getObject(obj2, j);
                        if (object instanceof zzlh) {
                            zzz2 = zzlm.zzz(i14);
                            zzc = ((zzlh) object).zzc();
                            zzz3 = zzlm.zzz(zzc);
                            i6 += zzz3 + zzc + zzz2;
                        } else {
                            zzz = zzlm.zzz(i14);
                            zzA = zzlm.zzB((String) object);
                            i6 += zzA + zzz;
                        }
                    }
                    zznpVar = this;
                    break;
                case 9:
                    if (zznpVar.zzI(obj2, i4, i7, i5, i)) {
                        zzz4 = zznz.zzz(i10, unsafe.getObject(obj2, j), zznpVar.zzp(i4));
                        i6 += zzz4;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zznpVar.zzI(obj2, i4, i7, i5, i)) {
                        zzlh zzlhVar = (zzlh) unsafe.getObject(obj2, j);
                        zzz2 = zzlm.zzz(i10 << 3);
                        zzc = zzlhVar.zzc();
                        zzz3 = zzlm.zzz(zzc);
                        i6 += zzz3 + zzc + zzz2;
                    }
                    zznpVar = this;
                    break;
                case 11:
                    if (zznpVar.zzI(obj2, i4, i7, i5, i)) {
                        i6 = androidx.core.database.a.a(unsafe.getInt(obj2, j), zzlm.zzz(i10 << 3), i6);
                    }
                    zznpVar = this;
                    break;
                case 12:
                    if (zznpVar.zzI(obj2, i4, i7, i5, i)) {
                        long j5 = unsafe.getInt(obj2, j);
                        zzz = zzlm.zzz(i10 << 3);
                        zzA = zzlm.zzA(j5);
                        i6 += zzA + zzz;
                    }
                    zznpVar = this;
                    break;
                case 13:
                    if (zznpVar.zzI(obj2, i4, i7, i5, i)) {
                        i6 = androidx.core.database.a.a(i10 << 3, 4, i6);
                    }
                    zznpVar = this;
                    break;
                case 14:
                    if (zznpVar.zzI(obj2, i4, i7, i5, i)) {
                        i6 = androidx.core.database.a.a(i10 << 3, 8, i6);
                    }
                    zznpVar = this;
                    break;
                case 15:
                    if (zznpVar.zzI(obj2, i4, i7, i5, i)) {
                        int i15 = unsafe.getInt(obj2, j);
                        i6 = androidx.core.database.a.a((i15 >> 31) ^ (i15 + i15), zzlm.zzz(i10 << 3), i6);
                    }
                    zznpVar = this;
                    break;
                case 16:
                    if (zznpVar.zzI(obj2, i4, i7, i5, i)) {
                        long j6 = unsafe.getLong(obj2, j);
                        zzz = zzlm.zzz(i10 << 3);
                        zzA = zzlm.zzA((j6 >> 63) ^ (j6 + j6));
                        i6 += zzA + zzz;
                    }
                    zznpVar = this;
                    break;
                case 17:
                    if (zznpVar.zzI(obj2, i4, i7, i5, i)) {
                        zzG = zzlm.zzG(i10, (zznm) unsafe.getObject(obj2, j), zznpVar.zzp(i4));
                        i6 += zzG;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzz4 = zznz.zzy(i10, (List) unsafe.getObject(obj2, j), false);
                    i6 += zzz4;
                    break;
                case 19:
                    zzz4 = zznz.zzw(i10, (List) unsafe.getObject(obj2, j), false);
                    i6 += zzz4;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j);
                    int i16 = zznz.zza;
                    if (list.size() != 0) {
                        zzz5 = (zzlm.zzz(i10 << 3) * list.size()) + zznz.zzo(list);
                        i6 += zzz5;
                        break;
                    }
                    zzz5 = 0;
                    i6 += zzz5;
                case 21:
                    List list2 = (List) unsafe.getObject(obj2, j);
                    int i17 = zznz.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzp = zznz.zzp(list2);
                        zzz6 = zzlm.zzz(i10 << 3);
                        zzz7 = (zzz6 * size) + zzp;
                        i6 += zzz7;
                        break;
                    }
                    zzz7 = 0;
                    i6 += zzz7;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, j);
                    int i18 = zznz.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzp = zznz.zzs(list3);
                        zzz6 = zzlm.zzz(i10 << 3);
                        zzz7 = (zzz6 * size) + zzp;
                        i6 += zzz7;
                        break;
                    }
                    zzz7 = 0;
                    i6 += zzz7;
                case 23:
                    zzz4 = zznz.zzy(i10, (List) unsafe.getObject(obj2, j), false);
                    i6 += zzz4;
                    break;
                case 24:
                    zzz4 = zznz.zzw(i10, (List) unsafe.getObject(obj2, j), false);
                    i6 += zzz4;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, j);
                    int i19 = zznz.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        zzz5 = (zzlm.zzz(i10 << 3) + 1) * size2;
                        i6 += zzz5;
                        break;
                    }
                    zzz5 = 0;
                    i6 += zzz5;
                case 26:
                    List list5 = (List) unsafe.getObject(obj2, j);
                    int i20 = zznz.zza;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        zzz7 = zzlm.zzz(i10 << 3) * size3;
                        if (list5 instanceof zzmx) {
                            zzmx zzmxVar = (zzmx) list5;
                            for (int i21 = 0; i21 < size3; i21++) {
                                Object zzc3 = zzmxVar.zzc();
                                if (zzc3 instanceof zzlh) {
                                    int zzc4 = ((zzlh) zzc3).zzc();
                                    zzz7 = androidx.core.database.a.a(zzc4, zzc4, zzz7);
                                } else {
                                    zzz7 = zzlm.zzB((String) zzc3) + zzz7;
                                }
                            }
                        } else {
                            for (int i22 = 0; i22 < size3; i22++) {
                                Object obj3 = list5.get(i22);
                                if (obj3 instanceof zzlh) {
                                    int zzc5 = ((zzlh) obj3).zzc();
                                    zzz7 = androidx.core.database.a.a(zzc5, zzc5, zzz7);
                                } else {
                                    zzz7 = zzlm.zzB((String) obj3) + zzz7;
                                }
                            }
                        }
                        i6 += zzz7;
                        break;
                    }
                    zzz7 = 0;
                    i6 += zzz7;
                case 27:
                    List list6 = (List) unsafe.getObject(obj2, j);
                    zznx zzp2 = zznpVar.zzp(i4);
                    int i23 = zznz.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        zzz8 = 0;
                    } else {
                        zzz8 = zzlm.zzz(i10 << 3) * size4;
                        for (int i24 = 0; i24 < size4; i24++) {
                            Object obj4 = list6.get(i24);
                            if (obj4 instanceof zzmw) {
                                int zzb2 = ((zzmw) obj4).zzb();
                                zzz8 = androidx.core.database.a.a(zzb2, zzb2, zzz8);
                            } else {
                                zzz8 = zzlm.zzD((zznm) obj4, zzp2) + zzz8;
                            }
                        }
                    }
                    i6 += zzz8;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, j);
                    int i25 = zznz.zza;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        zzz7 = zzlm.zzz(i10 << 3) * size5;
                        for (int i26 = 0; i26 < list7.size(); i26++) {
                            int zzc6 = ((zzlh) list7.get(i26)).zzc();
                            zzz7 = androidx.core.database.a.a(zzc6, zzc6, zzz7);
                        }
                        i6 += zzz7;
                        break;
                    }
                    zzz7 = 0;
                    i6 += zzz7;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j);
                    int i27 = zznz.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzp = zznz.zzt(list8);
                        zzz6 = zzlm.zzz(i10 << 3);
                        zzz7 = (zzz6 * size) + zzp;
                        i6 += zzz7;
                        break;
                    }
                    zzz7 = 0;
                    i6 += zzz7;
                case 30:
                    List list9 = (List) unsafe.getObject(obj2, j);
                    int i28 = zznz.zza;
                    size = list9.size();
                    if (size != 0) {
                        zzp = zznz.zzr(list9);
                        zzz6 = zzlm.zzz(i10 << 3);
                        zzz7 = (zzz6 * size) + zzp;
                        i6 += zzz7;
                        break;
                    }
                    zzz7 = 0;
                    i6 += zzz7;
                case 31:
                    zzz4 = zznz.zzw(i10, (List) unsafe.getObject(obj2, j), false);
                    i6 += zzz4;
                    break;
                case 32:
                    zzz4 = zznz.zzy(i10, (List) unsafe.getObject(obj2, j), false);
                    i6 += zzz4;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, j);
                    int i29 = zznz.zza;
                    size = list10.size();
                    if (size != 0) {
                        zzp = zznz.zzu(list10);
                        zzz6 = zzlm.zzz(i10 << 3);
                        zzz7 = (zzz6 * size) + zzp;
                        i6 += zzz7;
                        break;
                    }
                    zzz7 = 0;
                    i6 += zzz7;
                case 34:
                    List list11 = (List) unsafe.getObject(obj2, j);
                    int i30 = zznz.zza;
                    size = list11.size();
                    if (size != 0) {
                        zzp = zznz.zzq(list11);
                        zzz6 = zzlm.zzz(i10 << 3);
                        zzz7 = (zzz6 * size) + zzp;
                        i6 += zzz7;
                        break;
                    }
                    zzz7 = 0;
                    i6 += zzz7;
                case 35:
                    zzx = zznz.zzx((List) unsafe.getObject(obj2, j));
                    if (zzx > 0) {
                        zzz9 = zzlm.zzz(i10 << 3);
                        zzz10 = zzlm.zzz(zzx);
                        i6 += zzz10 + zzz9 + zzx;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzx = zznz.zzv((List) unsafe.getObject(obj2, j));
                    if (zzx > 0) {
                        zzz9 = zzlm.zzz(i10 << 3);
                        zzz10 = zzlm.zzz(zzx);
                        i6 += zzz10 + zzz9 + zzx;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzx = zznz.zzo((List) unsafe.getObject(obj2, j));
                    if (zzx > 0) {
                        zzz9 = zzlm.zzz(i10 << 3);
                        zzz10 = zzlm.zzz(zzx);
                        i6 += zzz10 + zzz9 + zzx;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzx = zznz.zzp((List) unsafe.getObject(obj2, j));
                    if (zzx > 0) {
                        zzz9 = zzlm.zzz(i10 << 3);
                        zzz10 = zzlm.zzz(zzx);
                        i6 += zzz10 + zzz9 + zzx;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzx = zznz.zzs((List) unsafe.getObject(obj2, j));
                    if (zzx > 0) {
                        zzz9 = zzlm.zzz(i10 << 3);
                        zzz10 = zzlm.zzz(zzx);
                        i6 += zzz10 + zzz9 + zzx;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzx = zznz.zzx((List) unsafe.getObject(obj2, j));
                    if (zzx > 0) {
                        zzz9 = zzlm.zzz(i10 << 3);
                        zzz10 = zzlm.zzz(zzx);
                        i6 += zzz10 + zzz9 + zzx;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzx = zznz.zzv((List) unsafe.getObject(obj2, j));
                    if (zzx > 0) {
                        zzz9 = zzlm.zzz(i10 << 3);
                        zzz10 = zzlm.zzz(zzx);
                        i6 += zzz10 + zzz9 + zzx;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list12 = (List) unsafe.getObject(obj2, j);
                    int i31 = zznz.zza;
                    zzx = list12.size();
                    if (zzx > 0) {
                        zzz9 = zzlm.zzz(i10 << 3);
                        zzz10 = zzlm.zzz(zzx);
                        i6 += zzz10 + zzz9 + zzx;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzx = zznz.zzt((List) unsafe.getObject(obj2, j));
                    if (zzx > 0) {
                        zzz9 = zzlm.zzz(i10 << 3);
                        zzz10 = zzlm.zzz(zzx);
                        i6 += zzz10 + zzz9 + zzx;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzx = zznz.zzr((List) unsafe.getObject(obj2, j));
                    if (zzx > 0) {
                        zzz9 = zzlm.zzz(i10 << 3);
                        zzz10 = zzlm.zzz(zzx);
                        i6 += zzz10 + zzz9 + zzx;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzx = zznz.zzv((List) unsafe.getObject(obj2, j));
                    if (zzx > 0) {
                        zzz9 = zzlm.zzz(i10 << 3);
                        zzz10 = zzlm.zzz(zzx);
                        i6 += zzz10 + zzz9 + zzx;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzx = zznz.zzx((List) unsafe.getObject(obj2, j));
                    if (zzx > 0) {
                        zzz9 = zzlm.zzz(i10 << 3);
                        zzz10 = zzlm.zzz(zzx);
                        i6 += zzz10 + zzz9 + zzx;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzx = zznz.zzu((List) unsafe.getObject(obj2, j));
                    if (zzx > 0) {
                        zzz9 = zzlm.zzz(i10 << 3);
                        zzz10 = zzlm.zzz(zzx);
                        i6 += zzz10 + zzz9 + zzx;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzx = zznz.zzq((List) unsafe.getObject(obj2, j));
                    if (zzx > 0) {
                        zzz9 = zzlm.zzz(i10 << 3);
                        zzz10 = zzlm.zzz(zzx);
                        i6 += zzz10 + zzz9 + zzx;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    List list13 = (List) unsafe.getObject(obj2, j);
                    zznx zzp3 = zznpVar.zzp(i4);
                    int i32 = zznz.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        i2 = 0;
                    } else {
                        i2 = 0;
                        for (int i33 = 0; i33 < size6; i33++) {
                            i2 += zzlm.zzG(i10, (zznm) list13.get(i33), zzp3);
                        }
                    }
                    i6 += i2;
                    break;
                case 50:
                    zzng zzngVar = (zzng) unsafe.getObject(obj2, j);
                    zznf zznfVar = (zznf) zznpVar.zzq(i4);
                    if (!zzngVar.isEmpty()) {
                        zzz7 = 0;
                        for (Map.Entry entry2 : zzngVar.entrySet()) {
                            zzz7 += zznfVar.zzd(i10, entry2.getKey(), entry2.getValue());
                        }
                        i6 += zzz7;
                        break;
                    }
                    zzz7 = 0;
                    i6 += zzz7;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zznpVar.zzL(obj2, i10, i4)) {
                        i6 = androidx.core.database.a.a(i10 << 3, 8, i6);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zznpVar.zzL(obj2, i10, i4)) {
                        i6 = androidx.core.database.a.a(i10 << 3, 4, i6);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zznpVar.zzL(obj2, i10, i4)) {
                        long zzF = zzF(obj2, j);
                        zzz11 = zzlm.zzz(i10 << 3);
                        zzA2 = zzlm.zzA(zzF);
                        i6 += zzA2 + zzz11;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zznpVar.zzL(obj2, i10, i4)) {
                        long zzF2 = zzF(obj2, j);
                        zzz11 = zzlm.zzz(i10 << 3);
                        zzA2 = zzlm.zzA(zzF2);
                        i6 += zzA2 + zzz11;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zznpVar.zzL(obj2, i10, i4)) {
                        long zzE = zzE(obj2, j);
                        zzz11 = zzlm.zzz(i10 << 3);
                        zzA2 = zzlm.zzA(zzE);
                        i6 += zzA2 + zzz11;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zznpVar.zzL(obj2, i10, i4)) {
                        i6 = androidx.core.database.a.a(i10 << 3, 8, i6);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zznpVar.zzL(obj2, i10, i4)) {
                        i6 = androidx.core.database.a.a(i10 << 3, 4, i6);
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zznpVar.zzL(obj2, i10, i4)) {
                        i6 = androidx.core.database.a.a(i10 << 3, 1, i6);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zznpVar.zzL(obj2, i10, i4)) {
                        int i34 = i10 << 3;
                        Object object2 = unsafe.getObject(obj2, j);
                        if (object2 instanceof zzlh) {
                            zzx = zzlm.zzz(i34);
                            zzz9 = ((zzlh) object2).zzc();
                            zzz10 = zzlm.zzz(zzz9);
                            i6 += zzz10 + zzz9 + zzx;
                            break;
                        } else {
                            zzz11 = zzlm.zzz(i34);
                            zzA2 = zzlm.zzB((String) object2);
                            i6 += zzA2 + zzz11;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (zznpVar.zzL(obj2, i10, i4)) {
                        zzz4 = zznz.zzz(i10, unsafe.getObject(obj2, j), zznpVar.zzp(i4));
                        i6 += zzz4;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zznpVar.zzL(obj2, i10, i4)) {
                        zzlh zzlhVar2 = (zzlh) unsafe.getObject(obj2, j);
                        zzx = zzlm.zzz(i10 << 3);
                        zzz9 = zzlhVar2.zzc();
                        zzz10 = zzlm.zzz(zzz9);
                        i6 += zzz10 + zzz9 + zzx;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zznpVar.zzL(obj2, i10, i4)) {
                        i6 = androidx.core.database.a.a(zzE(obj2, j), zzlm.zzz(i10 << 3), i6);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zznpVar.zzL(obj2, i10, i4)) {
                        long zzE2 = zzE(obj2, j);
                        zzz11 = zzlm.zzz(i10 << 3);
                        zzA2 = zzlm.zzA(zzE2);
                        i6 += zzA2 + zzz11;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zznpVar.zzL(obj2, i10, i4)) {
                        i6 = androidx.core.database.a.a(i10 << 3, 4, i6);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zznpVar.zzL(obj2, i10, i4)) {
                        i6 = androidx.core.database.a.a(i10 << 3, 8, i6);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zznpVar.zzL(obj2, i10, i4)) {
                        int zzE3 = zzE(obj2, j);
                        i6 = androidx.core.database.a.a((zzE3 >> 31) ^ (zzE3 + zzE3), zzlm.zzz(i10 << 3), i6);
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zznpVar.zzL(obj2, i10, i4)) {
                        long zzF3 = zzF(obj2, j);
                        zzz11 = zzlm.zzz(i10 << 3);
                        zzA2 = zzlm.zzA((zzF3 >> 63) ^ (zzF3 + zzF3));
                        i6 += zzA2 + zzz11;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zznpVar.zzL(obj2, i10, i4)) {
                        zzG = zzlm.zzG(i10, (zznm) unsafe.getObject(obj2, j), zznpVar.zzp(i4));
                        i6 += zzG;
                        break;
                    } else {
                        break;
                    }
            }
            i4 += 3;
            obj2 = obj;
            i3 = 1048575;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:249:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    @Override // com.google.android.gms.internal.measurement.zznx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(Object obj, zzov zzovVar) throws IOException {
        Map.Entry entry;
        int[] iArr;
        int i;
        int i2;
        int i3;
        zznp<T> zznpVar = this;
        if (zznpVar.zzh) {
            zzlw zzlwVar = ((zzmc) obj).zzb;
            if (!zzlwVar.zza.isEmpty()) {
                entry = (Map.Entry) zzlwVar.zzc().next();
                iArr = zznpVar.zzc;
                Unsafe unsafe = zzb;
                int i4 = 1048575;
                int i5 = 1048575;
                i = 0;
                int i6 = 0;
                while (i < iArr.length) {
                    int zzx = zznpVar.zzx(i);
                    int zzz = zzz(zzx);
                    int i7 = iArr[i];
                    if (zzz <= 17) {
                        int i8 = iArr[i + 2];
                        int i9 = i8 & i4;
                        if (i9 != i5) {
                            i6 = i9 == i4 ? 0 : unsafe.getInt(obj, i9);
                            i5 = i9;
                        }
                        i2 = zzx;
                        i3 = 1 << (i8 >>> 20);
                    } else {
                        i2 = zzx;
                        i3 = 0;
                    }
                    if (entry != null) {
                        throw null;
                    }
                    long j = i2 & i4;
                    switch (zzz) {
                        case 0:
                            if (!zznpVar.zzI(obj, i, i5, i6, i3)) {
                                break;
                            } else {
                                zzovVar.zzf(i7, zzop.zzl(obj, j));
                                continue;
                            }
                        case 1:
                            if (zznpVar.zzI(obj, i, i5, i6, i3)) {
                                zzovVar.zze(i7, zzop.zzj(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if (zznpVar.zzI(obj, i, i5, i6, i3)) {
                                zzovVar.zzc(i7, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            if (zznpVar.zzI(obj, i, i5, i6, i3)) {
                                zzovVar.zzh(i7, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            if (zznpVar.zzI(obj, i, i5, i6, i3)) {
                                zzovVar.zzi(i7, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            if (zznpVar.zzI(obj, i, i5, i6, i3)) {
                                zzovVar.zzj(i7, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            if (zznpVar.zzI(obj, i, i5, i6, i3)) {
                                zzovVar.zzk(i7, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            if (zznpVar.zzI(obj, i, i5, i6, i3)) {
                                zzovVar.zzl(i7, zzop.zzh(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 8:
                            if (zznpVar.zzI(obj, i, i5, i6, i3)) {
                                zzP(i7, unsafe.getObject(obj, j), zzovVar);
                                break;
                            } else {
                                continue;
                            }
                        case 9:
                            if (zznpVar.zzI(obj, i, i5, i6, i3)) {
                                zzovVar.zzr(i7, unsafe.getObject(obj, j), zznpVar.zzp(i));
                                break;
                            } else {
                                continue;
                            }
                        case 10:
                            if (zznpVar.zzI(obj, i, i5, i6, i3)) {
                                zzovVar.zzn(i7, (zzlh) unsafe.getObject(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            if (zznpVar.zzI(obj, i, i5, i6, i3)) {
                                zzovVar.zzo(i7, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 12:
                            if (zznpVar.zzI(obj, i, i5, i6, i3)) {
                                zzovVar.zzg(i7, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 13:
                            if (zznpVar.zzI(obj, i, i5, i6, i3)) {
                                zzovVar.zzb(i7, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 14:
                            if (zznpVar.zzI(obj, i, i5, i6, i3)) {
                                zzovVar.zzd(i7, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 15:
                            if (zznpVar.zzI(obj, i, i5, i6, i3)) {
                                zzovVar.zzp(i7, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 16:
                            if (zznpVar.zzI(obj, i, i5, i6, i3)) {
                                zzovVar.zzq(i7, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 17:
                            if (zznpVar.zzI(obj, i, i5, i6, i3)) {
                                zzovVar.zzs(i7, unsafe.getObject(obj, j), zznpVar.zzp(i));
                                break;
                            } else {
                                continue;
                            }
                        case 18:
                            zznz.zza(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, false);
                            continue;
                        case 19:
                            zznz.zzb(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, false);
                            continue;
                        case 20:
                            zznz.zzc(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, false);
                            continue;
                        case 21:
                            zznz.zzd(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, false);
                            continue;
                        case 22:
                            zznz.zzh(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, false);
                            continue;
                        case 23:
                            zznz.zzf(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, false);
                            continue;
                        case 24:
                            zznz.zzk(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, false);
                            continue;
                        case 25:
                            zznz.zzn(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, false);
                            continue;
                        case 26:
                            int i10 = iArr[i];
                            List list = (List) unsafe.getObject(obj, j);
                            int i11 = zznz.zza;
                            if (list != null && !list.isEmpty()) {
                                zzovVar.zzF(i10, list);
                                break;
                            }
                            break;
                        case 27:
                            int i12 = iArr[i];
                            List list2 = (List) unsafe.getObject(obj, j);
                            zznx zzp = zznpVar.zzp(i);
                            int i13 = zznz.zza;
                            if (list2 != null && !list2.isEmpty()) {
                                for (int i14 = 0; i14 < list2.size(); i14++) {
                                    ((zzln) zzovVar).zzr(i12, list2.get(i14), zzp);
                                }
                                break;
                            }
                            break;
                        case 28:
                            int i15 = iArr[i];
                            List list3 = (List) unsafe.getObject(obj, j);
                            int i16 = zznz.zza;
                            if (list3 != null && !list3.isEmpty()) {
                                zzovVar.zzG(i15, list3);
                                break;
                            }
                            break;
                        case 29:
                            zznz.zzi(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, false);
                            continue;
                        case 30:
                            zznz.zzm(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, false);
                            continue;
                        case 31:
                            zznz.zzl(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, false);
                            continue;
                        case 32:
                            zznz.zzg(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, false);
                            continue;
                        case 33:
                            zznz.zzj(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, false);
                            continue;
                        case 34:
                            zznz.zze(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, false);
                            continue;
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
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                            int i17 = iArr[i];
                            List list4 = (List) unsafe.getObject(obj, j);
                            zznx zzp2 = zznpVar.zzp(i);
                            int i18 = zznz.zza;
                            if (list4 != null && !list4.isEmpty()) {
                                for (int i19 = 0; i19 < list4.size(); i19++) {
                                    ((zzln) zzovVar).zzs(i17, list4.get(i19), zzp2);
                                }
                                break;
                            }
                            break;
                        case 50:
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                zzovVar.zzM(i7, ((zznf) zznpVar.zzq(i)).zze(), (zzng) object);
                                break;
                            }
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                            if (zznpVar.zzL(obj, i7, i)) {
                                zzovVar.zzf(i7, zzC(obj, j));
                                break;
                            }
                            break;
                        case 52:
                            if (zznpVar.zzL(obj, i7, i)) {
                                zzovVar.zze(i7, zzD(obj, j));
                                break;
                            }
                            break;
                        case 53:
                            if (zznpVar.zzL(obj, i7, i)) {
                                zzovVar.zzc(i7, zzF(obj, j));
                                break;
                            }
                            break;
                        case 54:
                            if (zznpVar.zzL(obj, i7, i)) {
                                zzovVar.zzh(i7, zzF(obj, j));
                                break;
                            }
                            break;
                        case 55:
                            if (zznpVar.zzL(obj, i7, i)) {
                                zzovVar.zzi(i7, zzE(obj, j));
                                break;
                            }
                            break;
                        case 56:
                            if (zznpVar.zzL(obj, i7, i)) {
                                zzovVar.zzj(i7, zzF(obj, j));
                                break;
                            }
                            break;
                        case 57:
                            if (zznpVar.zzL(obj, i7, i)) {
                                zzovVar.zzk(i7, zzE(obj, j));
                                break;
                            }
                            break;
                        case 58:
                            if (zznpVar.zzL(obj, i7, i)) {
                                zzovVar.zzl(i7, zzG(obj, j));
                                break;
                            }
                            break;
                        case 59:
                            if (zznpVar.zzL(obj, i7, i)) {
                                zzP(i7, unsafe.getObject(obj, j), zzovVar);
                                break;
                            }
                            break;
                        case 60:
                            if (zznpVar.zzL(obj, i7, i)) {
                                zzovVar.zzr(i7, unsafe.getObject(obj, j), zznpVar.zzp(i));
                                break;
                            }
                            break;
                        case 61:
                            if (zznpVar.zzL(obj, i7, i)) {
                                zzovVar.zzn(i7, (zzlh) unsafe.getObject(obj, j));
                                break;
                            }
                            break;
                        case 62:
                            if (zznpVar.zzL(obj, i7, i)) {
                                zzovVar.zzo(i7, zzE(obj, j));
                                break;
                            }
                            break;
                        case 63:
                            if (zznpVar.zzL(obj, i7, i)) {
                                zzovVar.zzg(i7, zzE(obj, j));
                                break;
                            }
                            break;
                        case 64:
                            if (zznpVar.zzL(obj, i7, i)) {
                                zzovVar.zzb(i7, zzE(obj, j));
                                break;
                            }
                            break;
                        case 65:
                            if (zznpVar.zzL(obj, i7, i)) {
                                zzovVar.zzd(i7, zzF(obj, j));
                                break;
                            }
                            break;
                        case 66:
                            if (zznpVar.zzL(obj, i7, i)) {
                                zzovVar.zzp(i7, zzE(obj, j));
                                break;
                            }
                            break;
                        case 67:
                            if (zznpVar.zzL(obj, i7, i)) {
                                zzovVar.zzq(i7, zzF(obj, j));
                                break;
                            }
                            break;
                        case 68:
                            if (zznpVar.zzL(obj, i7, i)) {
                                zzovVar.zzs(i7, unsafe.getObject(obj, j), zznpVar.zzp(i));
                                break;
                            }
                            break;
                    }
                    i += 3;
                    i4 = 1048575;
                    zznpVar = this;
                }
                if (entry != null) {
                    ((zzmf) obj).zzc.zzg(zzovVar);
                    return;
                } else {
                    throw null;
                }
            }
        }
        entry = null;
        iArr = zznpVar.zzc;
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

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int zzh(java.lang.Object r35, byte[] r36, int r37, int r38, int r39, com.google.android.gms.internal.measurement.zzkw r40) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 4164
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznp.zzh(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzkw):int");
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
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
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
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i5 < this.zzj) {
            int[] iArr = this.zzi;
            int[] iArr2 = this.zzc;
            int i7 = iArr[i5];
            int i8 = iArr2[i7];
            int zzx = zzx(i7);
            int i9 = iArr2[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i6) {
                if (i10 != 1048575) {
                    i4 = zzb.getInt(obj, i10);
                }
                i2 = i7;
                i3 = i4;
                i = i10;
            } else {
                int i12 = i4;
                i = i6;
                i2 = i7;
                i3 = i12;
            }
            if ((268435456 & zzx) != 0 && !zzI(obj, i2, i, i3, i11)) {
                return false;
            }
            int zzz = zzz(zzx);
            if (zzz != 9 && zzz != 17) {
                if (zzz != 27) {
                    if (zzz == 60 || zzz == 68) {
                        if (zzL(obj, i8, i2) && !zzw(obj, zzx, zzp(i2))) {
                            return false;
                        }
                    } else if (zzz != 49) {
                        if (zzz != 50) {
                            continue;
                        } else {
                            zzng zzngVar = (zzng) zzop.zzn(obj, zzx & 1048575);
                            if (!zzngVar.isEmpty() && ((zznf) zzq(i2)).zze().zzc.zza() == zzou.MESSAGE) {
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
                    zznx zzp = zzp(i2);
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        if (!zzp.zzk(list.get(i13))) {
                            return false;
                        }
                    }
                }
            } else if (zzI(obj, i2, i, i3, i11) && !zzw(obj, zzx, zzp(i2))) {
                return false;
            }
            i5++;
            i6 = i;
            i4 = i3;
        }
        return !this.zzh || ((zzmc) obj).zzb.zze();
    }
}
