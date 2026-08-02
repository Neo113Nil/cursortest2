package com.google.android.gms.internal.firebase_auth;

import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.internal.firebase_auth.zzdb;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zzel<T> implements zzev<T> {
    private static final int[] zzti = new int[0];
    private static final Unsafe zztj = zzfv.zzge();
    private final int[] zztk;
    private final Object[] zztl;
    private final int zztm;
    private final int zztn;
    private final zzeh zzto;
    private final boolean zztp;
    private final boolean zztq;
    private final boolean zztr;
    private final boolean zzts;
    private final int[] zztt;
    private final int zztu;
    private final int zztv;
    private final zzeo zztw;
    private final zzdr zztx;
    private final zzfp<?, ?> zzty;
    private final zzcp<?> zztz;
    private final zzec zzua;

    private zzel(int[] iArr, Object[] objArr, int i, int i2, zzeh zzehVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzeo zzeoVar, zzdr zzdrVar, zzfp<?, ?> zzfpVar, zzcp<?> zzcpVar, zzec zzecVar) {
        this.zztk = iArr;
        this.zztl = objArr;
        this.zztm = i;
        this.zztn = i2;
        this.zztq = zzehVar instanceof zzdb;
        this.zztr = z;
        this.zztp = zzcpVar != null && zzcpVar.zze(zzehVar);
        this.zzts = false;
        this.zztt = iArr2;
        this.zztu = i3;
        this.zztv = i4;
        this.zztw = zzeoVar;
        this.zztx = zzdrVar;
        this.zzty = zzfpVar;
        this.zztz = zzcpVar;
        this.zzto = zzehVar;
        this.zzua = zzecVar;
    }

    private static <UT, UB> int zza(zzfp<UT, UB> zzfpVar, T t) {
        return zzfpVar.zzo(zzfpVar.zzr(t));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    static <T> zzel<T> zza(Class<T> cls, zzef zzefVar, zzeo zzeoVar, zzdr zzdrVar, zzfp<?, ?> zzfpVar, zzcp<?> zzcpVar, zzec zzecVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        char charAt;
        int i6;
        int charAt2;
        int charAt3;
        int i7;
        int[] iArr;
        int i8;
        char c;
        char c2;
        int i9;
        char charAt4;
        int i10;
        char charAt5;
        int i11;
        char charAt6;
        int i12;
        char charAt7;
        char charAt8;
        char charAt9;
        char charAt10;
        char charAt11;
        int i13;
        int i14;
        int i15;
        char c3;
        char c4;
        int i16;
        int objectFieldOffset;
        String str;
        Class<?> cls2;
        int i17;
        int i18;
        int i19;
        Field zza;
        int i20;
        char charAt12;
        int i21;
        int i22;
        int i23;
        Field zza2;
        Field zza3;
        int i24;
        char charAt13;
        int i25;
        char charAt14;
        int i26;
        char charAt15;
        char charAt16;
        char charAt17;
        if (!(zzefVar instanceof zzet)) {
            ((zzfi) zzefVar).zzez();
            throw new NoSuchMethodError();
        }
        zzet zzetVar = (zzet) zzefVar;
        int i27 = 0;
        boolean z = zzetVar.zzez() == zzdb.zze.zzrn;
        String zzfh = zzetVar.zzfh();
        int length = zzfh.length();
        int charAt18 = zzfh.charAt(0);
        if (charAt18 >= 55296) {
            int i28 = charAt18 & 8191;
            int i29 = 1;
            int i30 = 13;
            while (true) {
                i = i29 + 1;
                charAt17 = zzfh.charAt(i29);
                if (charAt17 < 55296) {
                    break;
                }
                i28 |= (charAt17 & 8191) << i30;
                i30 += 13;
                i29 = i;
            }
            charAt18 = (charAt17 << i30) | i28;
        } else {
            i = 1;
        }
        int i31 = i + 1;
        int charAt19 = zzfh.charAt(i);
        if (charAt19 >= 55296) {
            int i32 = charAt19 & 8191;
            int i33 = 13;
            while (true) {
                i2 = i31 + 1;
                charAt16 = zzfh.charAt(i31);
                if (charAt16 < 55296) {
                    break;
                }
                i32 |= (charAt16 & 8191) << i33;
                i33 += 13;
                i31 = i2;
            }
            charAt19 = i32 | (charAt16 << i33);
        } else {
            i2 = i31;
        }
        if (charAt19 == 0) {
            iArr = zzti;
            charAt3 = 0;
            c2 = 0;
            i8 = 0;
            charAt = 0;
            charAt2 = 0;
            c = 0;
        } else {
            int i34 = i2 + 1;
            char charAt20 = zzfh.charAt(i2);
            if (charAt20 >= 55296) {
                int i35 = charAt20 & 8191;
                int i36 = 13;
                while (true) {
                    i3 = i34 + 1;
                    charAt11 = zzfh.charAt(i34);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i35 |= (charAt11 & 8191) << i36;
                    i36 += 13;
                    i34 = i3;
                }
                charAt20 = ((charAt11 << i36) | i35) == true ? 1 : 0;
            } else {
                i3 = i34;
            }
            int i37 = i3 + 1;
            int charAt21 = zzfh.charAt(i3);
            if (charAt21 >= 55296) {
                int i38 = charAt21 & 8191;
                int i39 = 13;
                while (true) {
                    i4 = i37 + 1;
                    charAt10 = zzfh.charAt(i37);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i38 |= (charAt10 & 8191) << i39;
                    i39 += 13;
                    i37 = i4;
                }
                charAt21 = i38 | (charAt10 << i39);
            } else {
                i4 = i37;
            }
            int i40 = i4 + 1;
            char charAt22 = zzfh.charAt(i4);
            if (charAt22 >= 55296) {
                int i41 = charAt22 & 8191;
                int i42 = 13;
                while (true) {
                    i5 = i40 + 1;
                    charAt9 = zzfh.charAt(i40);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i41 |= (charAt9 & 8191) << i42;
                    i42 += 13;
                    i40 = i5;
                }
                charAt22 = ((charAt9 << i42) | i41) == true ? 1 : 0;
            } else {
                i5 = i40;
            }
            int i43 = i5 + 1;
            charAt = zzfh.charAt(i5);
            if (charAt >= 55296) {
                int i44 = charAt & 8191;
                int i45 = 13;
                while (true) {
                    i6 = i43 + 1;
                    charAt8 = zzfh.charAt(i43);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i44 |= (charAt8 & 8191) << i45;
                    i45 += 13;
                    i43 = i6;
                }
                charAt = ((charAt8 << i45) | i44) == true ? 1 : 0;
            } else {
                i6 = i43;
            }
            int i46 = i6 + 1;
            charAt2 = zzfh.charAt(i6);
            if (charAt2 >= 55296) {
                int i47 = charAt2 & 8191;
                int i48 = 13;
                while (true) {
                    i12 = i46 + 1;
                    charAt7 = zzfh.charAt(i46);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i47 |= (charAt7 & 8191) << i48;
                    i48 += 13;
                    i46 = i12;
                }
                charAt2 = (charAt7 << i48) | i47;
                i46 = i12;
            }
            int i49 = i46 + 1;
            charAt3 = zzfh.charAt(i46);
            if (charAt3 >= 55296) {
                int i50 = charAt3 & 8191;
                int i51 = 13;
                while (true) {
                    i11 = i49 + 1;
                    charAt6 = zzfh.charAt(i49);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i50 |= (charAt6 & 8191) << i51;
                    i51 += 13;
                    i49 = i11;
                }
                charAt3 = i50 | (charAt6 << i51);
                i49 = i11;
            }
            int i52 = i49 + 1;
            int charAt23 = zzfh.charAt(i49);
            if (charAt23 >= 55296) {
                int i53 = 13;
                int i54 = charAt23 & 8191;
                int i55 = i52;
                while (true) {
                    i10 = i55 + 1;
                    charAt5 = zzfh.charAt(i55);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i54 |= (charAt5 & 8191) << i53;
                    i53 += 13;
                    i55 = i10;
                }
                charAt23 = i54 | (charAt5 << i53);
                i7 = i10;
            } else {
                i7 = i52;
            }
            int i56 = i7 + 1;
            i27 = zzfh.charAt(i7);
            if (i27 >= 55296) {
                int i57 = 13;
                int i58 = i27 & 8191;
                int i59 = i56;
                while (true) {
                    i9 = i59 + 1;
                    charAt4 = zzfh.charAt(i59);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i58 |= (charAt4 & 8191) << i57;
                    i57 += 13;
                    i59 = i9;
                }
                i27 = i58 | (charAt4 << i57);
                i56 = i9;
            }
            iArr = new int[i27 + charAt3 + charAt23];
            i8 = (charAt20 << 1) + charAt21;
            int i60 = i56;
            c = charAt20;
            c2 = charAt22;
            i2 = i60;
        }
        Unsafe unsafe = zztj;
        Object[] zzfi = zzetVar.zzfi();
        Class<?> cls3 = zzetVar.zzfb().getClass();
        int i61 = i8;
        int[] iArr2 = new int[charAt2 * 3];
        Object[] objArr = new Object[charAt2 << 1];
        int i62 = i27 + charAt3;
        int i63 = i27;
        int i64 = i61;
        int i65 = i62;
        int i66 = 0;
        int i67 = 0;
        while (i2 < length) {
            int i68 = i2 + 1;
            int charAt24 = zzfh.charAt(i2);
            char c5 = 55296;
            if (charAt24 >= 55296) {
                int i69 = 13;
                int i70 = charAt24 & 8191;
                int i71 = i68;
                while (true) {
                    i26 = i71 + 1;
                    charAt15 = zzfh.charAt(i71);
                    if (charAt15 < c5) {
                        break;
                    }
                    i70 |= (charAt15 & 8191) << i69;
                    i69 += 13;
                    i71 = i26;
                    c5 = 55296;
                }
                charAt24 = i70 | (charAt15 << i69);
                i13 = i26;
            } else {
                i13 = i68;
            }
            int i72 = i13 + 1;
            int charAt25 = zzfh.charAt(i13);
            int i73 = length;
            char c6 = 55296;
            if (charAt25 >= 55296) {
                int i74 = 13;
                int i75 = charAt25 & 8191;
                int i76 = i72;
                while (true) {
                    i25 = i76 + 1;
                    charAt14 = zzfh.charAt(i76);
                    if (charAt14 < c6) {
                        break;
                    }
                    i75 |= (charAt14 & 8191) << i74;
                    i74 += 13;
                    i76 = i25;
                    c6 = 55296;
                }
                charAt25 = i75 | (charAt14 << i74);
                i14 = i25;
            } else {
                i14 = i72;
            }
            int i77 = i27;
            int i78 = charAt25 & 255;
            boolean z2 = z;
            if ((charAt25 & 1024) != 0) {
                iArr[i66] = i67;
                i66++;
            }
            if (i78 > zzcv.MAP.id()) {
                int i79 = i14 + 1;
                int charAt26 = zzfh.charAt(i14);
                i15 = i66;
                char c7 = 55296;
                if (charAt26 >= 55296) {
                    int i80 = charAt26 & 8191;
                    int i81 = 13;
                    while (true) {
                        i24 = i79 + 1;
                        charAt13 = zzfh.charAt(i79);
                        if (charAt13 < c7) {
                            break;
                        }
                        i80 |= (charAt13 & 8191) << i81;
                        i81 += 13;
                        i79 = i24;
                        c7 = 55296;
                    }
                    charAt26 = i80 | (charAt13 << i81);
                    i79 = i24;
                }
                if (i78 == zzcv.MESSAGE.id() + 51 || i78 == zzcv.GROUP.id() + 51) {
                    i22 = i79;
                    i23 = 1;
                    objArr[((i67 / 3) << 1) + 1] = zzfi[i64];
                    i64++;
                } else {
                    if (i78 == zzcv.ENUM.id() + 51) {
                        i22 = i79;
                        if ((charAt18 & 1) == 1) {
                            objArr[((i67 / 3) << 1) + 1] = zzfi[i64];
                            i64++;
                        }
                    } else {
                        i22 = i79;
                    }
                    i23 = 1;
                }
                int i82 = charAt26 << i23;
                Object obj = zzfi[i82];
                if (obj instanceof Field) {
                    zza2 = (Field) obj;
                } else {
                    zza2 = zza(cls3, (String) obj);
                    zzfi[i82] = zza2;
                }
                char c8 = c2;
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zza2);
                int i83 = i82 + 1;
                Object obj2 = zzfi[i83];
                if (obj2 instanceof Field) {
                    zza3 = (Field) obj2;
                } else {
                    zza3 = zza(cls3, (String) obj2);
                    zzfi[i83] = zza3;
                }
                int objectFieldOffset3 = (int) unsafe.objectFieldOffset(zza3);
                str = zzfh;
                cls2 = cls3;
                i17 = i64;
                objectFieldOffset = objectFieldOffset2;
                i19 = objectFieldOffset3;
                c4 = c8;
                i18 = 0;
                char c9 = charAt;
                i16 = charAt24;
                i2 = i22;
                c3 = c9;
            } else {
                i15 = i66;
                char c10 = c2;
                int i84 = i64 + 1;
                Field zza4 = zza(cls3, (String) zzfi[i64]);
                c3 = charAt;
                if (i78 == zzcv.MESSAGE.id() || i78 == zzcv.GROUP.id()) {
                    c4 = c10;
                    objArr[((i67 / 3) << 1) + 1] = zza4.getType();
                } else {
                    if (i78 == zzcv.MESSAGE_LIST.id() || i78 == zzcv.GROUP_LIST.id()) {
                        c4 = c10;
                        i21 = i84 + 1;
                        objArr[((i67 / 3) << 1) + 1] = zzfi[i84];
                    } else if (i78 == zzcv.ENUM.id() || i78 == zzcv.ENUM_LIST.id() || i78 == zzcv.ENUM_LIST_PACKED.id()) {
                        c4 = c10;
                        if ((charAt18 & 1) == 1) {
                            i21 = i84 + 1;
                            objArr[((i67 / 3) << 1) + 1] = zzfi[i84];
                        }
                    } else if (i78 == zzcv.MAP.id()) {
                        int i85 = i63 + 1;
                        iArr[i63] = i67;
                        int i86 = (i67 / 3) << 1;
                        int i87 = i84 + 1;
                        objArr[i86] = zzfi[i84];
                        if ((charAt25 & 2048) != 0) {
                            i84 = i87 + 1;
                            objArr[i86 + 1] = zzfi[i87];
                            c4 = c10;
                        } else {
                            c4 = c10;
                            i84 = i87;
                        }
                        i63 = i85;
                    } else {
                        c4 = c10;
                    }
                    i16 = charAt24;
                    i84 = i21;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zza4);
                    if ((charAt18 & 1) == 1 || i78 > zzcv.GROUP.id()) {
                        str = zzfh;
                        cls2 = cls3;
                        i17 = i84;
                        i2 = i14;
                        i18 = 0;
                        i19 = 0;
                    } else {
                        int i88 = i14 + 1;
                        int charAt27 = zzfh.charAt(i14);
                        if (charAt27 >= 55296) {
                            int i89 = charAt27 & 8191;
                            int i90 = 13;
                            while (true) {
                                i20 = i88 + 1;
                                charAt12 = zzfh.charAt(i88);
                                if (charAt12 < 55296) {
                                    break;
                                }
                                i89 |= (charAt12 & 8191) << i90;
                                i90 += 13;
                                i88 = i20;
                            }
                            charAt27 = i89 | (charAt12 << i90);
                            i88 = i20;
                        }
                        int i91 = (c << 1) + (charAt27 / 32);
                        Object obj3 = zzfi[i91];
                        str = zzfh;
                        if (obj3 instanceof Field) {
                            zza = (Field) obj3;
                        } else {
                            zza = zza(cls3, (String) obj3);
                            zzfi[i91] = zza;
                        }
                        cls2 = cls3;
                        i17 = i84;
                        i19 = (int) unsafe.objectFieldOffset(zza);
                        i18 = charAt27 % 32;
                        i2 = i88;
                    }
                }
                i16 = charAt24;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zza4);
                if ((charAt18 & 1) == 1) {
                }
                str = zzfh;
                cls2 = cls3;
                i17 = i84;
                i2 = i14;
                i18 = 0;
                i19 = 0;
            }
            if (i78 >= 18 && i78 <= 49) {
                iArr[i65] = objectFieldOffset;
                i65++;
            }
            int i92 = i67 + 1;
            iArr2[i67] = i16;
            int i93 = i92 + 1;
            iArr2[i92] = (i78 << 20) | ((charAt25 & 256) != 0 ? CrashUtils.ErrorDialogData.BINDER_CRASH : 0) | ((charAt25 & 512) != 0 ? CrashUtils.ErrorDialogData.DYNAMITE_CRASH : 0) | objectFieldOffset;
            i67 = i93 + 1;
            iArr2[i93] = (i18 << 20) | i19;
            cls3 = cls2;
            c2 = c4;
            i27 = i77;
            i64 = i17;
            length = i73;
            z = z2;
            i66 = i15;
            charAt = c3;
            zzfh = str;
        }
        return new zzel<>(iArr2, objArr, c2, charAt, zzetVar.zzfb(), z, false, iArr, i27, i62, zzeoVar, zzdrVar, zzfpVar, zzcpVar, zzecVar);
    }

    private final <K, V, UT, UB> UB zza(int i, int i2, Map<K, V> map, zzdf<?> zzdfVar, UB ub, zzfp<UT, UB> zzfpVar) {
        zzea<?, ?> zzn = this.zzua.zzn(zzao(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (zzdfVar.zzam(((Integer) next.getValue()).intValue()) == null) {
                if (ub == null) {
                    ub = zzfpVar.zzfy();
                }
                zzbz zzl = zzbu.zzl(zzdz.zza(zzn, next.getKey(), next.getValue()));
                try {
                    zzdz.zza(zzl.zzcb(), zzn, next.getKey(), next.getValue());
                    zzfpVar.zza((zzfp<UT, UB>) ub, i2, zzl.zzca());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    private final <UT, UB> UB zza(Object obj, int i, UB ub, zzfp<UT, UB> zzfpVar) {
        zzdf<?> zzap;
        int i2 = this.zztk[i];
        Object zzp = zzfv.zzp(obj, zzaq(i) & 1048575);
        return (zzp == null || (zzap = zzap(i)) == null) ? ub : (UB) zza(i, i2, this.zzua.zzi(zzp), zzap, ub, zzfpVar);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private static Field zza(Class<?> cls, String str) {
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
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    private static void zza(int i, Object obj, zzgj zzgjVar) throws IOException {
        if (obj instanceof String) {
            zzgjVar.zza(i, (String) obj);
        } else {
            zzgjVar.zza(i, (zzbu) obj);
        }
    }

    private static <UT, UB> void zza(zzfp<UT, UB> zzfpVar, T t, zzgj zzgjVar) throws IOException {
        zzfpVar.zza((zzfp<UT, UB>) zzfpVar.zzr(t), zzgjVar);
    }

    private final <K, V> void zza(zzgj zzgjVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zzgjVar.zza(i, this.zzua.zzn(zzao(i2)), this.zzua.zzj(obj));
        }
    }

    private final void zza(Object obj, int i, zzeu zzeuVar) throws IOException {
        long j;
        Object zzck;
        if (zzas(i)) {
            j = i & 1048575;
            zzck = zzeuVar.zzcj();
        } else if (this.zztq) {
            j = i & 1048575;
            zzck = zzeuVar.readString();
        } else {
            j = i & 1048575;
            zzck = zzeuVar.zzck();
        }
        zzfv.zza(obj, j, zzck);
    }

    private final void zza(T t, T t2, int i) {
        long zzaq = zzaq(i) & 1048575;
        if (zza((zzel<T>) t2, i)) {
            Object zzp = zzfv.zzp(t, zzaq);
            Object zzp2 = zzfv.zzp(t2, zzaq);
            if (zzp != null && zzp2 != null) {
                zzfv.zza(t, zzaq, zzdd.zza(zzp, zzp2));
                zzb((zzel<T>) t, i);
            } else if (zzp2 != null) {
                zzfv.zza(t, zzaq, zzp2);
                zzb((zzel<T>) t, i);
            }
        }
    }

    private final boolean zza(T t, int i) {
        if (!this.zztr) {
            int zzar = zzar(i);
            return (zzfv.zzk(t, (long) (zzar & 1048575)) & (1 << (zzar >>> 20))) != 0;
        }
        int zzaq = zzaq(i);
        long j = zzaq & 1048575;
        switch ((zzaq & 267386880) >>> 20) {
            case 0:
                return zzfv.zzo(t, j) != 0.0d;
            case 1:
                return zzfv.zzn(t, j) != 0.0f;
            case 2:
                return zzfv.zzl(t, j) != 0;
            case 3:
                return zzfv.zzl(t, j) != 0;
            case 4:
                return zzfv.zzk(t, j) != 0;
            case 5:
                return zzfv.zzl(t, j) != 0;
            case 6:
                return zzfv.zzk(t, j) != 0;
            case 7:
                return zzfv.zzm(t, j);
            case 8:
                Object zzp = zzfv.zzp(t, j);
                if (zzp instanceof String) {
                    return !((String) zzp).isEmpty();
                }
                if (zzp instanceof zzbu) {
                    return !zzbu.zzmi.equals(zzp);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzfv.zzp(t, j) != null;
            case 10:
                return !zzbu.zzmi.equals(zzfv.zzp(t, j));
            case 11:
                return zzfv.zzk(t, j) != 0;
            case 12:
                return zzfv.zzk(t, j) != 0;
            case 13:
                return zzfv.zzk(t, j) != 0;
            case 14:
                return zzfv.zzl(t, j) != 0;
            case 15:
                return zzfv.zzk(t, j) != 0;
            case 16:
                return zzfv.zzl(t, j) != 0;
            case 17:
                return zzfv.zzp(t, j) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zza(T t, int i, int i2) {
        return zzfv.zzk(t, (long) (zzar(i2) & 1048575)) == i;
    }

    private final boolean zza(T t, int i, int i2, int i3) {
        return this.zztr ? zza((zzel<T>) t, i) : (i2 & i3) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i, zzev zzevVar) {
        return zzevVar.zzp(zzfv.zzp(obj, i & 1048575));
    }

    private final zzev zzan(int i) {
        int i2 = (i / 3) << 1;
        zzev zzevVar = (zzev) this.zztl[i2];
        if (zzevVar != null) {
            return zzevVar;
        }
        zzev<T> zzf = zzes.zzfg().zzf((Class) this.zztl[i2 + 1]);
        this.zztl[i2] = zzf;
        return zzf;
    }

    private final Object zzao(int i) {
        return this.zztl[(i / 3) << 1];
    }

    private final zzdf<?> zzap(int i) {
        return (zzdf) this.zztl[((i / 3) << 1) + 1];
    }

    private final int zzaq(int i) {
        return this.zztk[i + 1];
    }

    private final int zzar(int i) {
        return this.zztk[i + 2];
    }

    private static boolean zzas(int i) {
        return (i & CrashUtils.ErrorDialogData.DYNAMITE_CRASH) != 0;
    }

    private final void zzb(T t, int i) {
        if (this.zztr) {
            return;
        }
        int zzar = zzar(i);
        long j = zzar & 1048575;
        zzfv.zzb(t, j, zzfv.zzk(t, j) | (1 << (zzar >>> 20)));
    }

    private final void zzb(T t, int i, int i2) {
        zzfv.zzb(t, zzar(i2) & 1048575, i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzb(T t, zzgj zzgjVar) throws IOException {
        Iterator<Map.Entry<?, Object>> it;
        Map.Entry<?, ?> entry;
        int length;
        int i;
        Map.Entry<?, ?> entry2;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        int i7;
        int i8;
        List list;
        boolean z6;
        Map.Entry<?, ?> entry3;
        if (this.zztp) {
            zzcs<?> zzc = this.zztz.zzc(t);
            if (!zzc.isEmpty()) {
                it = zzc.iterator();
                entry = (Map.Entry) it.next();
                int i9 = -1;
                length = this.zztk.length;
                Unsafe unsafe = zztj;
                Map.Entry<?, ?> entry4 = entry;
                int i10 = 0;
                for (i = 0; i < length; i += 3) {
                    int zzaq = zzaq(i);
                    int[] iArr = this.zztk;
                    int i11 = iArr[i];
                    int i12 = (267386880 & zzaq) >>> 20;
                    if (this.zztr || i12 > 17) {
                        entry4 = entry4;
                        i2 = 0;
                    } else {
                        int i13 = iArr[i + 2];
                        int i14 = i13 & 1048575;
                        if (i14 != i9) {
                            entry3 = entry4;
                            i10 = unsafe.getInt(t, i14);
                        } else {
                            entry3 = entry4;
                            i14 = i9;
                        }
                        i2 = 1 << (i13 >>> 20);
                        i9 = i14;
                        entry4 = entry3;
                    }
                    while (entry4 != null && this.zztz.zza(entry4) <= i11) {
                        this.zztz.zza(zzgjVar, entry4);
                        entry4 = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    long j = zzaq & 1048575;
                    switch (i12) {
                        case 0:
                            if ((i10 & i2) != 0) {
                                zzgjVar.zza(i11, zzfv.zzo(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if ((i10 & i2) != 0) {
                                zzgjVar.zza(i11, zzfv.zzn(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if ((i10 & i2) != 0) {
                                zzgjVar.zzi(i11, unsafe.getLong(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if ((i10 & i2) != 0) {
                                zzgjVar.zza(i11, unsafe.getLong(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if ((i10 & i2) != 0) {
                                zzgjVar.zzc(i11, unsafe.getInt(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if ((i10 & i2) != 0) {
                                zzgjVar.zzc(i11, unsafe.getLong(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if ((i10 & i2) != 0) {
                                zzgjVar.zzf(i11, unsafe.getInt(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if ((i10 & i2) != 0) {
                                zzgjVar.zzb(i11, zzfv.zzm(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if ((i10 & i2) != 0) {
                                zza(i11, unsafe.getObject(t, j), zzgjVar);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if ((i10 & i2) != 0) {
                                zzgjVar.zza(i11, unsafe.getObject(t, j), zzan(i));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if ((i10 & i2) != 0) {
                                zzgjVar.zza(i11, (zzbu) unsafe.getObject(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if ((i10 & i2) != 0) {
                                zzgjVar.zzd(i11, unsafe.getInt(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if ((i10 & i2) != 0) {
                                zzgjVar.zzn(i11, unsafe.getInt(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if ((i10 & i2) != 0) {
                                zzgjVar.zzm(i11, unsafe.getInt(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if ((i10 & i2) != 0) {
                                zzgjVar.zzj(i11, unsafe.getLong(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if ((i10 & i2) != 0) {
                                zzgjVar.zze(i11, unsafe.getInt(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if ((i10 & i2) != 0) {
                                zzgjVar.zzb(i11, unsafe.getLong(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if ((i10 & i2) != 0) {
                                zzgjVar.zzb(i11, unsafe.getObject(t, j), zzan(i));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            zzex.zza(this.zztk[i], (List<Double>) unsafe.getObject(t, j), zzgjVar, false);
                            break;
                        case 19:
                            zzex.zzb(this.zztk[i], (List<Float>) unsafe.getObject(t, j), zzgjVar, false);
                            break;
                        case 20:
                            zzex.zzc(this.zztk[i], (List) unsafe.getObject(t, j), zzgjVar, false);
                            break;
                        case 21:
                            zzex.zzd(this.zztk[i], (List) unsafe.getObject(t, j), zzgjVar, false);
                            break;
                        case 22:
                            zzex.zzh(this.zztk[i], (List) unsafe.getObject(t, j), zzgjVar, false);
                            break;
                        case 23:
                            zzex.zzf(this.zztk[i], (List) unsafe.getObject(t, j), zzgjVar, false);
                            break;
                        case 24:
                            zzex.zzk(this.zztk[i], (List) unsafe.getObject(t, j), zzgjVar, false);
                            break;
                        case 25:
                            zzex.zzn(this.zztk[i], (List) unsafe.getObject(t, j), zzgjVar, false);
                            break;
                        case 26:
                            zzex.zza(this.zztk[i], (List<String>) unsafe.getObject(t, j), zzgjVar);
                            break;
                        case 27:
                            zzex.zza(this.zztk[i], (List<?>) unsafe.getObject(t, j), zzgjVar, zzan(i));
                            break;
                        case 28:
                            zzex.zzb(this.zztk[i], (List) unsafe.getObject(t, j), zzgjVar);
                            break;
                        case 29:
                            z = false;
                            i3 = this.zztk[i];
                            zzex.zzi(i3, (List) unsafe.getObject(t, j), zzgjVar, z);
                            break;
                        case 30:
                            z2 = false;
                            i4 = this.zztk[i];
                            zzex.zzm(i4, (List) unsafe.getObject(t, j), zzgjVar, z2);
                            break;
                        case 31:
                            z3 = false;
                            i5 = this.zztk[i];
                            zzex.zzl(i5, (List) unsafe.getObject(t, j), zzgjVar, z3);
                            break;
                        case 32:
                            z4 = false;
                            i6 = this.zztk[i];
                            zzex.zzg(i6, (List) unsafe.getObject(t, j), zzgjVar, z4);
                            break;
                        case 33:
                            z5 = false;
                            i7 = this.zztk[i];
                            zzex.zzj(i7, (List) unsafe.getObject(t, j), zzgjVar, z5);
                            break;
                        case 34:
                            i8 = this.zztk[i];
                            list = (List) unsafe.getObject(t, j);
                            z6 = false;
                            zzex.zze(i8, list, zzgjVar, z6);
                            break;
                        case 35:
                            zzex.zza(this.zztk[i], (List<Double>) unsafe.getObject(t, j), zzgjVar, true);
                            break;
                        case 36:
                            zzex.zzb(this.zztk[i], (List<Float>) unsafe.getObject(t, j), zzgjVar, true);
                            break;
                        case 37:
                            zzex.zzc(this.zztk[i], (List) unsafe.getObject(t, j), zzgjVar, true);
                            break;
                        case 38:
                            zzex.zzd(this.zztk[i], (List) unsafe.getObject(t, j), zzgjVar, true);
                            break;
                        case 39:
                            zzex.zzh(this.zztk[i], (List) unsafe.getObject(t, j), zzgjVar, true);
                            break;
                        case 40:
                            zzex.zzf(this.zztk[i], (List) unsafe.getObject(t, j), zzgjVar, true);
                            break;
                        case 41:
                            zzex.zzk(this.zztk[i], (List) unsafe.getObject(t, j), zzgjVar, true);
                            break;
                        case 42:
                            zzex.zzn(this.zztk[i], (List) unsafe.getObject(t, j), zzgjVar, true);
                            break;
                        case 43:
                            z = true;
                            i3 = this.zztk[i];
                            zzex.zzi(i3, (List) unsafe.getObject(t, j), zzgjVar, z);
                            break;
                        case 44:
                            z2 = true;
                            i4 = this.zztk[i];
                            zzex.zzm(i4, (List) unsafe.getObject(t, j), zzgjVar, z2);
                            break;
                        case 45:
                            z3 = true;
                            i5 = this.zztk[i];
                            zzex.zzl(i5, (List) unsafe.getObject(t, j), zzgjVar, z3);
                            break;
                        case 46:
                            z4 = true;
                            i6 = this.zztk[i];
                            zzex.zzg(i6, (List) unsafe.getObject(t, j), zzgjVar, z4);
                            break;
                        case 47:
                            z5 = true;
                            i7 = this.zztk[i];
                            zzex.zzj(i7, (List) unsafe.getObject(t, j), zzgjVar, z5);
                            break;
                        case 48:
                            i8 = this.zztk[i];
                            list = (List) unsafe.getObject(t, j);
                            z6 = true;
                            zzex.zze(i8, list, zzgjVar, z6);
                            break;
                        case 49:
                            zzex.zzb(this.zztk[i], (List<?>) unsafe.getObject(t, j), zzgjVar, zzan(i));
                            break;
                        case 50:
                            zza(zzgjVar, i11, unsafe.getObject(t, j), i);
                            break;
                        case 51:
                            if (zza((zzel<T>) t, i11, i)) {
                                zzgjVar.zza(i11, zzf(t, j));
                            }
                            break;
                        case 52:
                            if (zza((zzel<T>) t, i11, i)) {
                                zzgjVar.zza(i11, zzg(t, j));
                            }
                            break;
                        case 53:
                            if (zza((zzel<T>) t, i11, i)) {
                                zzgjVar.zzi(i11, zzi(t, j));
                            }
                            break;
                        case 54:
                            if (zza((zzel<T>) t, i11, i)) {
                                zzgjVar.zza(i11, zzi(t, j));
                            }
                            break;
                        case 55:
                            if (zza((zzel<T>) t, i11, i)) {
                                zzgjVar.zzc(i11, zzh(t, j));
                            }
                            break;
                        case 56:
                            if (zza((zzel<T>) t, i11, i)) {
                                zzgjVar.zzc(i11, zzi(t, j));
                            }
                            break;
                        case 57:
                            if (zza((zzel<T>) t, i11, i)) {
                                zzgjVar.zzf(i11, zzh(t, j));
                            }
                            break;
                        case 58:
                            if (zza((zzel<T>) t, i11, i)) {
                                zzgjVar.zzb(i11, zzj(t, j));
                            }
                            break;
                        case 59:
                            if (zza((zzel<T>) t, i11, i)) {
                                zza(i11, unsafe.getObject(t, j), zzgjVar);
                            }
                            break;
                        case 60:
                            if (zza((zzel<T>) t, i11, i)) {
                                zzgjVar.zza(i11, unsafe.getObject(t, j), zzan(i));
                            }
                            break;
                        case 61:
                            if (zza((zzel<T>) t, i11, i)) {
                                zzgjVar.zza(i11, (zzbu) unsafe.getObject(t, j));
                            }
                            break;
                        case 62:
                            if (zza((zzel<T>) t, i11, i)) {
                                zzgjVar.zzd(i11, zzh(t, j));
                            }
                            break;
                        case 63:
                            if (zza((zzel<T>) t, i11, i)) {
                                zzgjVar.zzn(i11, zzh(t, j));
                            }
                            break;
                        case 64:
                            if (zza((zzel<T>) t, i11, i)) {
                                zzgjVar.zzm(i11, zzh(t, j));
                            }
                            break;
                        case 65:
                            if (zza((zzel<T>) t, i11, i)) {
                                zzgjVar.zzj(i11, zzi(t, j));
                            }
                            break;
                        case 66:
                            if (zza((zzel<T>) t, i11, i)) {
                                zzgjVar.zze(i11, zzh(t, j));
                            }
                            break;
                        case 67:
                            if (zza((zzel<T>) t, i11, i)) {
                                zzgjVar.zzb(i11, zzi(t, j));
                            }
                            break;
                        case 68:
                            if (zza((zzel<T>) t, i11, i)) {
                                zzgjVar.zzb(i11, unsafe.getObject(t, j), zzan(i));
                            }
                            break;
                    }
                }
                entry2 = entry4;
                while (entry2 != null) {
                    this.zztz.zza(zzgjVar, entry2);
                    entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                zza(this.zzty, t, zzgjVar);
            }
        }
        it = null;
        entry = null;
        int i92 = -1;
        length = this.zztk.length;
        Unsafe unsafe2 = zztj;
        Map.Entry<?, ?> entry42 = entry;
        int i102 = 0;
        while (i < length) {
        }
        entry2 = entry42;
        while (entry2 != null) {
        }
        zza(this.zzty, t, zzgjVar);
    }

    private final void zzb(T t, T t2, int i) {
        int zzaq = zzaq(i);
        int i2 = this.zztk[i];
        long j = zzaq & 1048575;
        if (zza((zzel<T>) t2, i2, i)) {
            Object zzp = zzfv.zzp(t, j);
            Object zzp2 = zzfv.zzp(t2, j);
            if (zzp != null && zzp2 != null) {
                zzfv.zza(t, j, zzdd.zza(zzp, zzp2));
                zzb((zzel<T>) t, i2, i);
            } else if (zzp2 != null) {
                zzfv.zza(t, j, zzp2);
                zzb((zzel<T>) t, i2, i);
            }
        }
    }

    private final boolean zzc(T t, T t2, int i) {
        return zza((zzel<T>) t, i) == zza((zzel<T>) t2, i);
    }

    private static <E> List<E> zze(Object obj, long j) {
        return (List) zzfv.zzp(obj, j);
    }

    private static <T> double zzf(T t, long j) {
        return ((Double) zzfv.zzp(t, j)).doubleValue();
    }

    private static <T> float zzg(T t, long j) {
        return ((Float) zzfv.zzp(t, j)).floatValue();
    }

    private static <T> int zzh(T t, long j) {
        return ((Integer) zzfv.zzp(t, j)).intValue();
    }

    private static <T> long zzi(T t, long j) {
        return ((Long) zzfv.zzp(t, j)).longValue();
    }

    private static <T> boolean zzj(T t, long j) {
        return ((Boolean) zzfv.zzp(t, j)).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
    
        if (com.google.android.gms.internal.firebase_auth.zzex.zzd(com.google.android.gms.internal.firebase_auth.zzfv.zzp(r10, r6), com.google.android.gms.internal.firebase_auth.zzfv.zzp(r11, r6)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        if (com.google.android.gms.internal.firebase_auth.zzfv.zzl(r10, r6) == com.google.android.gms.internal.firebase_auth.zzfv.zzl(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
    
        if (com.google.android.gms.internal.firebase_auth.zzfv.zzk(r10, r6) == com.google.android.gms.internal.firebase_auth.zzfv.zzk(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
    
        if (com.google.android.gms.internal.firebase_auth.zzfv.zzl(r10, r6) == com.google.android.gms.internal.firebase_auth.zzfv.zzl(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a8, code lost:
    
        if (com.google.android.gms.internal.firebase_auth.zzfv.zzk(r10, r6) == com.google.android.gms.internal.firebase_auth.zzfv.zzk(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ba, code lost:
    
        if (com.google.android.gms.internal.firebase_auth.zzfv.zzk(r10, r6) == com.google.android.gms.internal.firebase_auth.zzfv.zzk(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cc, code lost:
    
        if (com.google.android.gms.internal.firebase_auth.zzfv.zzk(r10, r6) == com.google.android.gms.internal.firebase_auth.zzfv.zzk(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e2, code lost:
    
        if (com.google.android.gms.internal.firebase_auth.zzex.zzd(com.google.android.gms.internal.firebase_auth.zzfv.zzp(r10, r6), com.google.android.gms.internal.firebase_auth.zzfv.zzp(r11, r6)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f8, code lost:
    
        if (com.google.android.gms.internal.firebase_auth.zzex.zzd(com.google.android.gms.internal.firebase_auth.zzfv.zzp(r10, r6), com.google.android.gms.internal.firebase_auth.zzfv.zzp(r11, r6)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010e, code lost:
    
        if (com.google.android.gms.internal.firebase_auth.zzex.zzd(com.google.android.gms.internal.firebase_auth.zzfv.zzp(r10, r6), com.google.android.gms.internal.firebase_auth.zzfv.zzp(r11, r6)) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0120, code lost:
    
        if (com.google.android.gms.internal.firebase_auth.zzfv.zzm(r10, r6) == com.google.android.gms.internal.firebase_auth.zzfv.zzm(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0132, code lost:
    
        if (com.google.android.gms.internal.firebase_auth.zzfv.zzk(r10, r6) == com.google.android.gms.internal.firebase_auth.zzfv.zzk(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0145, code lost:
    
        if (com.google.android.gms.internal.firebase_auth.zzfv.zzl(r10, r6) == com.google.android.gms.internal.firebase_auth.zzfv.zzl(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0156, code lost:
    
        if (com.google.android.gms.internal.firebase_auth.zzfv.zzk(r10, r6) == com.google.android.gms.internal.firebase_auth.zzfv.zzk(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0169, code lost:
    
        if (com.google.android.gms.internal.firebase_auth.zzfv.zzl(r10, r6) == com.google.android.gms.internal.firebase_auth.zzfv.zzl(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017c, code lost:
    
        if (com.google.android.gms.internal.firebase_auth.zzfv.zzl(r10, r6) == com.google.android.gms.internal.firebase_auth.zzfv.zzl(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x018d, code lost:
    
        if (com.google.android.gms.internal.firebase_auth.zzfv.zzk(r10, r6) == com.google.android.gms.internal.firebase_auth.zzfv.zzk(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a0, code lost:
    
        if (com.google.android.gms.internal.firebase_auth.zzfv.zzl(r10, r6) == com.google.android.gms.internal.firebase_auth.zzfv.zzl(r11, r6)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (com.google.android.gms.internal.firebase_auth.zzex.zzd(com.google.android.gms.internal.firebase_auth.zzfv.zzp(r10, r6), com.google.android.gms.internal.firebase_auth.zzfv.zzp(r11, r6)) != false) goto L104;
     */
    @Override // com.google.android.gms.internal.firebase_auth.zzev
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(T t, T t2) {
        int length = this.zztk.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                if (!this.zzty.zzr(t).equals(this.zzty.zzr(t2))) {
                    return false;
                }
                if (this.zztp) {
                    return this.zztz.zzc(t).equals(this.zztz.zzc(t2));
                }
                return true;
            }
            int zzaq = zzaq(i);
            long j = zzaq & 1048575;
            switch ((zzaq & 267386880) >>> 20) {
                case 0:
                    if (zzc(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 1:
                    if (zzc(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 2:
                    if (zzc(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 3:
                    if (zzc(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 4:
                    if (zzc(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 5:
                    if (zzc(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 6:
                    if (zzc(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 7:
                    if (zzc(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 8:
                    if (zzc(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 9:
                    if (zzc(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 10:
                    if (zzc(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 11:
                    if (zzc(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 12:
                    if (zzc(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 13:
                    if (zzc(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 14:
                    if (zzc(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 15:
                    if (zzc(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 16:
                    if (zzc(t, t2, i)) {
                        break;
                    }
                    z = false;
                    break;
                case 17:
                    if (zzc(t, t2, i)) {
                        break;
                    }
                    z = false;
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
                case 50:
                    z = zzex.zzd(zzfv.zzp(t, j), zzfv.zzp(t2, j));
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
                    long zzar = zzar(i) & 1048575;
                    if (zzfv.zzk(t, zzar) == zzfv.zzk(t2, zzar)) {
                        break;
                    }
                    z = false;
                    break;
            }
            if (!z) {
                return false;
            }
            i += 3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ce, code lost:
    
        if (r3 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e6, code lost:
    
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e2, code lost:
    
        r7 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00e0, code lost:
    
        if (r3 != null) goto L68;
     */
    @Override // com.google.android.gms.internal.firebase_auth.zzev
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int hashCode(T t) {
        int i;
        double zzo;
        float zzn;
        long zzl;
        int zzk;
        boolean zzm;
        Object zzp;
        Object zzp2;
        int length = this.zztk.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int zzaq = zzaq(i3);
            int i4 = this.zztk[i3];
            long j = 1048575 & zzaq;
            int i5 = 37;
            switch ((zzaq & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    zzo = zzfv.zzo(t, j);
                    zzl = Double.doubleToLongBits(zzo);
                    zzk = zzdd.zzk(zzl);
                    i2 = i + zzk;
                    break;
                case 1:
                    i = i2 * 53;
                    zzn = zzfv.zzn(t, j);
                    zzk = Float.floatToIntBits(zzn);
                    i2 = i + zzk;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i = i2 * 53;
                    zzl = zzfv.zzl(t, j);
                    zzk = zzdd.zzk(zzl);
                    i2 = i + zzk;
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    i = i2 * 53;
                    zzk = zzfv.zzk(t, j);
                    i2 = i + zzk;
                    break;
                case 7:
                    i = i2 * 53;
                    zzm = zzfv.zzm(t, j);
                    zzk = zzdd.zzh(zzm);
                    i2 = i + zzk;
                    break;
                case 8:
                    i = i2 * 53;
                    zzk = ((String) zzfv.zzp(t, j)).hashCode();
                    i2 = i + zzk;
                    break;
                case 9:
                    zzp = zzfv.zzp(t, j);
                    break;
                case 10:
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
                case 50:
                    i = i2 * 53;
                    zzp2 = zzfv.zzp(t, j);
                    zzk = zzp2.hashCode();
                    i2 = i + zzk;
                    break;
                case 17:
                    zzp = zzfv.zzp(t, j);
                    break;
                case 51:
                    if (zza((zzel<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzo = zzf(t, j);
                        zzl = Double.doubleToLongBits(zzo);
                        zzk = zzdd.zzk(zzl);
                        i2 = i + zzk;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zza((zzel<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzn = zzg(t, j);
                        zzk = Float.floatToIntBits(zzn);
                        i2 = i + zzk;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (!zza((zzel<T>) t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzl = zzi(t, j);
                    zzk = zzdd.zzk(zzl);
                    i2 = i + zzk;
                    break;
                case 54:
                    if (!zza((zzel<T>) t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzl = zzi(t, j);
                    zzk = zzdd.zzk(zzl);
                    i2 = i + zzk;
                    break;
                case 55:
                    if (!zza((zzel<T>) t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzk = zzh(t, j);
                    i2 = i + zzk;
                    break;
                case 56:
                    if (!zza((zzel<T>) t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzl = zzi(t, j);
                    zzk = zzdd.zzk(zzl);
                    i2 = i + zzk;
                    break;
                case 57:
                    if (!zza((zzel<T>) t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzk = zzh(t, j);
                    i2 = i + zzk;
                    break;
                case 58:
                    if (zza((zzel<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzm = zzj(t, j);
                        zzk = zzdd.zzh(zzm);
                        i2 = i + zzk;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!zza((zzel<T>) t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzk = ((String) zzfv.zzp(t, j)).hashCode();
                    i2 = i + zzk;
                    break;
                case 60:
                    if (!zza((zzel<T>) t, i4, i3)) {
                        break;
                    }
                    zzp2 = zzfv.zzp(t, j);
                    i = i2 * 53;
                    zzk = zzp2.hashCode();
                    i2 = i + zzk;
                    break;
                case 61:
                    if (!zza((zzel<T>) t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzp2 = zzfv.zzp(t, j);
                    zzk = zzp2.hashCode();
                    i2 = i + zzk;
                    break;
                case 62:
                    if (!zza((zzel<T>) t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzk = zzh(t, j);
                    i2 = i + zzk;
                    break;
                case 63:
                    if (!zza((zzel<T>) t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzk = zzh(t, j);
                    i2 = i + zzk;
                    break;
                case 64:
                    if (!zza((zzel<T>) t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzk = zzh(t, j);
                    i2 = i + zzk;
                    break;
                case 65:
                    if (!zza((zzel<T>) t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzl = zzi(t, j);
                    zzk = zzdd.zzk(zzl);
                    i2 = i + zzk;
                    break;
                case 66:
                    if (!zza((zzel<T>) t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzk = zzh(t, j);
                    i2 = i + zzk;
                    break;
                case 67:
                    if (!zza((zzel<T>) t, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    zzl = zzi(t, j);
                    zzk = zzdd.zzk(zzl);
                    i2 = i + zzk;
                    break;
                case 68:
                    if (!zza((zzel<T>) t, i4, i3)) {
                        break;
                    }
                    zzp2 = zzfv.zzp(t, j);
                    i = i2 * 53;
                    zzk = zzp2.hashCode();
                    i2 = i + zzk;
                    break;
            }
        }
        int hashCode = (i2 * 53) + this.zzty.zzr(t).hashCode();
        return this.zztp ? (hashCode * 53) + this.zztz.zzc(t).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzev
    public final T newInstance() {
        return (T) this.zztw.newInstance(this.zzto);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.firebase_auth.zzev
    public final void zza(T t, zzeu zzeuVar, zzco zzcoVar) throws IOException {
        long j;
        Object zza;
        int zzcm;
        List<Double> zza2;
        List<Float> zza3;
        List<Long> zza4;
        List<Long> zza5;
        List<Integer> zza6;
        List<Long> zza7;
        List<Integer> zza8;
        List<Boolean> zza9;
        List<Integer> zza10;
        List<Integer> zza11;
        zzdf<?> zzap;
        List<Integer> zza12;
        List<Long> zza13;
        List<Integer> zza14;
        List<Long> zza15;
        if (zzcoVar == null) {
            throw new NullPointerException();
        }
        zzfp zzfpVar = this.zzty;
        zzcp<?> zzcpVar = this.zztz;
        zzcs<?> zzcsVar = null;
        Object obj = null;
        while (true) {
            try {
                int zzda = zzeuVar.zzda();
                int i = -1;
                if (zzda >= this.zztm && zzda <= this.zztn) {
                    int i2 = 0;
                    int length = (this.zztk.length / 3) - 1;
                    while (true) {
                        if (i2 <= length) {
                            int i3 = (length + i2) >>> 1;
                            int i4 = i3 * 3;
                            int i5 = this.zztk[i4];
                            if (zzda == i5) {
                                i = i4;
                            } else if (zzda < i5) {
                                length = i3 - 1;
                            } else {
                                i2 = i3 + 1;
                            }
                        }
                    }
                }
                if (i >= 0) {
                    int zzaq = zzaq(i);
                    switch ((267386880 & zzaq) >>> 20) {
                        case 0:
                            zzfv.zza(t, zzaq & 1048575, zzeuVar.readDouble());
                            zzb((zzel<T>) t, i);
                            break;
                        case 1:
                            zzfv.zza((Object) t, zzaq & 1048575, zzeuVar.readFloat());
                            zzb((zzel<T>) t, i);
                            break;
                        case 2:
                            zzfv.zza((Object) t, zzaq & 1048575, zzeuVar.zzce());
                            zzb((zzel<T>) t, i);
                            break;
                        case 3:
                            zzfv.zza((Object) t, zzaq & 1048575, zzeuVar.zzcd());
                            zzb((zzel<T>) t, i);
                            break;
                        case 4:
                            zzfv.zzb(t, zzaq & 1048575, zzeuVar.zzcf());
                            zzb((zzel<T>) t, i);
                            break;
                        case 5:
                            zzfv.zza((Object) t, zzaq & 1048575, zzeuVar.zzcg());
                            zzb((zzel<T>) t, i);
                            break;
                        case 6:
                            zzfv.zzb(t, zzaq & 1048575, zzeuVar.zzch());
                            zzb((zzel<T>) t, i);
                            break;
                        case 7:
                            zzfv.zza(t, zzaq & 1048575, zzeuVar.zzci());
                            zzb((zzel<T>) t, i);
                            break;
                        case 8:
                            zza(t, zzaq, zzeuVar);
                            zzb((zzel<T>) t, i);
                            break;
                        case 9:
                            if (zza((zzel<T>) t, i)) {
                                j = zzaq & 1048575;
                                zza = zzdd.zza(zzfv.zzp(t, j), zzeuVar.zza(zzan(i), zzcoVar));
                                zzfv.zza(t, j, zza);
                                break;
                            } else {
                                zzfv.zza(t, zzaq & 1048575, zzeuVar.zza(zzan(i), zzcoVar));
                                zzb((zzel<T>) t, i);
                                break;
                            }
                        case 10:
                            zzfv.zza(t, zzaq & 1048575, zzeuVar.zzck());
                            zzb((zzel<T>) t, i);
                            break;
                        case 11:
                            zzfv.zzb(t, zzaq & 1048575, zzeuVar.zzcl());
                            zzb((zzel<T>) t, i);
                            break;
                        case 12:
                            zzcm = zzeuVar.zzcm();
                            zzdf<?> zzap2 = zzap(i);
                            if (zzap2 == null || zzap2.zzam(zzcm) != null) {
                                zzfv.zzb(t, zzaq & 1048575, zzcm);
                                zzb((zzel<T>) t, i);
                                break;
                            } else {
                                obj = zzex.zza(zzda, zzcm, obj, (zzfp<UT, Object>) zzfpVar);
                                break;
                            }
                        case 13:
                            zzfv.zzb(t, zzaq & 1048575, zzeuVar.zzcn());
                            zzb((zzel<T>) t, i);
                            break;
                        case 14:
                            zzfv.zza((Object) t, zzaq & 1048575, zzeuVar.zzco());
                            zzb((zzel<T>) t, i);
                            break;
                        case 15:
                            zzfv.zzb(t, zzaq & 1048575, zzeuVar.zzcp());
                            zzb((zzel<T>) t, i);
                            break;
                        case 16:
                            zzfv.zza((Object) t, zzaq & 1048575, zzeuVar.zzcq());
                            zzb((zzel<T>) t, i);
                            break;
                        case 17:
                            if (zza((zzel<T>) t, i)) {
                                j = zzaq & 1048575;
                                zza = zzdd.zza(zzfv.zzp(t, j), zzeuVar.zzb(zzan(i), zzcoVar));
                                zzfv.zza(t, j, zza);
                                break;
                            } else {
                                zzfv.zza(t, zzaq & 1048575, zzeuVar.zzb(zzan(i), zzcoVar));
                                zzb((zzel<T>) t, i);
                                break;
                            }
                        case 18:
                            zza2 = this.zztx.zza(t, zzaq & 1048575);
                            zzeuVar.zzc(zza2);
                            break;
                        case 19:
                            zza3 = this.zztx.zza(t, zzaq & 1048575);
                            zzeuVar.zzd(zza3);
                            break;
                        case 20:
                            zza4 = this.zztx.zza(t, zzaq & 1048575);
                            zzeuVar.zzf(zza4);
                            break;
                        case 21:
                            zza5 = this.zztx.zza(t, zzaq & 1048575);
                            zzeuVar.zze(zza5);
                            break;
                        case 22:
                            zza6 = this.zztx.zza(t, zzaq & 1048575);
                            zzeuVar.zzg(zza6);
                            break;
                        case 23:
                            zza7 = this.zztx.zza(t, zzaq & 1048575);
                            zzeuVar.zzh(zza7);
                            break;
                        case 24:
                            zza8 = this.zztx.zza(t, zzaq & 1048575);
                            zzeuVar.zzi(zza8);
                            break;
                        case 25:
                            zza9 = this.zztx.zza(t, zzaq & 1048575);
                            zzeuVar.zzj(zza9);
                            break;
                        case 26:
                            if (zzas(zzaq)) {
                                zzeuVar.zzk(this.zztx.zza(t, zzaq & 1048575));
                                break;
                            } else {
                                zzeuVar.readStringList(this.zztx.zza(t, zzaq & 1048575));
                                break;
                            }
                        case 27:
                            zzeuVar.zza(this.zztx.zza(t, zzaq & 1048575), zzan(i), zzcoVar);
                            break;
                        case 28:
                            zzeuVar.zzl(this.zztx.zza(t, zzaq & 1048575));
                            break;
                        case 29:
                            zza10 = this.zztx.zza(t, zzaq & 1048575);
                            zzeuVar.zzm(zza10);
                            break;
                        case 30:
                            zza11 = this.zztx.zza(t, zzaq & 1048575);
                            zzeuVar.zzn(zza11);
                            zzap = zzap(i);
                            obj = zzex.zza(zzda, zza11, zzap, obj, zzfpVar);
                            break;
                        case 31:
                            zza12 = this.zztx.zza(t, zzaq & 1048575);
                            zzeuVar.zzo(zza12);
                            break;
                        case 32:
                            zza13 = this.zztx.zza(t, zzaq & 1048575);
                            zzeuVar.zzp(zza13);
                            break;
                        case 33:
                            zza14 = this.zztx.zza(t, zzaq & 1048575);
                            zzeuVar.zzq(zza14);
                            break;
                        case 34:
                            zza15 = this.zztx.zza(t, zzaq & 1048575);
                            zzeuVar.zzr(zza15);
                            break;
                        case 35:
                            zza2 = this.zztx.zza(t, zzaq & 1048575);
                            zzeuVar.zzc(zza2);
                            break;
                        case 36:
                            zza3 = this.zztx.zza(t, zzaq & 1048575);
                            zzeuVar.zzd(zza3);
                            break;
                        case 37:
                            zza4 = this.zztx.zza(t, zzaq & 1048575);
                            zzeuVar.zzf(zza4);
                            break;
                        case 38:
                            zza5 = this.zztx.zza(t, zzaq & 1048575);
                            zzeuVar.zze(zza5);
                            break;
                        case 39:
                            zza6 = this.zztx.zza(t, zzaq & 1048575);
                            zzeuVar.zzg(zza6);
                            break;
                        case 40:
                            zza7 = this.zztx.zza(t, zzaq & 1048575);
                            zzeuVar.zzh(zza7);
                            break;
                        case 41:
                            zza8 = this.zztx.zza(t, zzaq & 1048575);
                            zzeuVar.zzi(zza8);
                            break;
                        case 42:
                            zza9 = this.zztx.zza(t, zzaq & 1048575);
                            zzeuVar.zzj(zza9);
                            break;
                        case 43:
                            zza10 = this.zztx.zza(t, zzaq & 1048575);
                            zzeuVar.zzm(zza10);
                            break;
                        case 44:
                            zza11 = this.zztx.zza(t, zzaq & 1048575);
                            zzeuVar.zzn(zza11);
                            zzap = zzap(i);
                            obj = zzex.zza(zzda, zza11, zzap, obj, zzfpVar);
                            break;
                        case 45:
                            zza12 = this.zztx.zza(t, zzaq & 1048575);
                            zzeuVar.zzo(zza12);
                            break;
                        case 46:
                            zza13 = this.zztx.zza(t, zzaq & 1048575);
                            zzeuVar.zzp(zza13);
                            break;
                        case 47:
                            zza14 = this.zztx.zza(t, zzaq & 1048575);
                            zzeuVar.zzq(zza14);
                            break;
                        case 48:
                            zza15 = this.zztx.zza(t, zzaq & 1048575);
                            zzeuVar.zzr(zza15);
                            break;
                        case 49:
                            zzeuVar.zzb(this.zztx.zza(t, zzaq & 1048575), zzan(i), zzcoVar);
                            break;
                        case 50:
                            Object zzao = zzao(i);
                            long zzaq2 = zzaq(i) & 1048575;
                            Object zzp = zzfv.zzp(t, zzaq2);
                            if (zzp == null) {
                                zzp = this.zzua.zzm(zzao);
                                zzfv.zza(t, zzaq2, zzp);
                            } else if (this.zzua.zzk(zzp)) {
                                Object zzm = this.zzua.zzm(zzao);
                                this.zzua.zzb(zzm, zzp);
                                zzfv.zza(t, zzaq2, zzm);
                                zzp = zzm;
                            }
                            zzeuVar.zza(this.zzua.zzi(zzp), this.zzua.zzn(zzao), zzcoVar);
                            break;
                        case 51:
                            zzfv.zza(t, zzaq & 1048575, Double.valueOf(zzeuVar.readDouble()));
                            zzb((zzel<T>) t, zzda, i);
                            break;
                        case 52:
                            zzfv.zza(t, zzaq & 1048575, Float.valueOf(zzeuVar.readFloat()));
                            zzb((zzel<T>) t, zzda, i);
                            break;
                        case 53:
                            zzfv.zza(t, zzaq & 1048575, Long.valueOf(zzeuVar.zzce()));
                            zzb((zzel<T>) t, zzda, i);
                            break;
                        case 54:
                            zzfv.zza(t, zzaq & 1048575, Long.valueOf(zzeuVar.zzcd()));
                            zzb((zzel<T>) t, zzda, i);
                            break;
                        case 55:
                            zzfv.zza(t, zzaq & 1048575, Integer.valueOf(zzeuVar.zzcf()));
                            zzb((zzel<T>) t, zzda, i);
                            break;
                        case 56:
                            zzfv.zza(t, zzaq & 1048575, Long.valueOf(zzeuVar.zzcg()));
                            zzb((zzel<T>) t, zzda, i);
                            break;
                        case 57:
                            zzfv.zza(t, zzaq & 1048575, Integer.valueOf(zzeuVar.zzch()));
                            zzb((zzel<T>) t, zzda, i);
                            break;
                        case 58:
                            zzfv.zza(t, zzaq & 1048575, Boolean.valueOf(zzeuVar.zzci()));
                            zzb((zzel<T>) t, zzda, i);
                            break;
                        case 59:
                            zza(t, zzaq, zzeuVar);
                            zzb((zzel<T>) t, zzda, i);
                            break;
                        case 60:
                            if (zza((zzel<T>) t, zzda, i)) {
                                long j2 = zzaq & 1048575;
                                zzfv.zza(t, j2, zzdd.zza(zzfv.zzp(t, j2), zzeuVar.zza(zzan(i), zzcoVar)));
                            } else {
                                zzfv.zza(t, zzaq & 1048575, zzeuVar.zza(zzan(i), zzcoVar));
                                zzb((zzel<T>) t, i);
                            }
                            zzb((zzel<T>) t, zzda, i);
                            break;
                        case 61:
                            zzfv.zza(t, zzaq & 1048575, zzeuVar.zzck());
                            zzb((zzel<T>) t, zzda, i);
                            break;
                        case 62:
                            zzfv.zza(t, zzaq & 1048575, Integer.valueOf(zzeuVar.zzcl()));
                            zzb((zzel<T>) t, zzda, i);
                            break;
                        case 63:
                            zzcm = zzeuVar.zzcm();
                            zzdf<?> zzap3 = zzap(i);
                            if (zzap3 != null && zzap3.zzam(zzcm) == null) {
                                obj = zzex.zza(zzda, zzcm, obj, (zzfp<UT, Object>) zzfpVar);
                                break;
                            }
                            zzfv.zza(t, zzaq & 1048575, Integer.valueOf(zzcm));
                            zzb((zzel<T>) t, zzda, i);
                            break;
                        case 64:
                            zzfv.zza(t, zzaq & 1048575, Integer.valueOf(zzeuVar.zzcn()));
                            zzb((zzel<T>) t, zzda, i);
                            break;
                        case 65:
                            zzfv.zza(t, zzaq & 1048575, Long.valueOf(zzeuVar.zzco()));
                            zzb((zzel<T>) t, zzda, i);
                            break;
                        case 66:
                            zzfv.zza(t, zzaq & 1048575, Integer.valueOf(zzeuVar.zzcp()));
                            zzb((zzel<T>) t, zzda, i);
                            break;
                        case 67:
                            zzfv.zza(t, zzaq & 1048575, Long.valueOf(zzeuVar.zzcq()));
                            zzb((zzel<T>) t, zzda, i);
                            break;
                        case 68:
                            zzfv.zza(t, zzaq & 1048575, zzeuVar.zzb(zzan(i), zzcoVar));
                            zzb((zzel<T>) t, zzda, i);
                            break;
                        default:
                            if (obj == null) {
                                try {
                                    obj = zzfpVar.zzfy();
                                } catch (zzdi unused) {
                                    zzfpVar.zza(zzeuVar);
                                    if (obj == null) {
                                        obj = zzfpVar.zzs(t);
                                    }
                                    if (!zzfpVar.zza((zzfp) obj, zzeuVar)) {
                                        for (int i6 = this.zztu; i6 < this.zztv; i6++) {
                                            obj = zza((Object) t, this.zztt[i6], (int) obj, (zzfp<UT, int>) zzfpVar);
                                        }
                                        if (obj != null) {
                                            zzfpVar.zzf(t, obj);
                                            return;
                                        }
                                        return;
                                    }
                                    break;
                                }
                            }
                            if (!zzfpVar.zza((zzfp) obj, zzeuVar)) {
                                for (int i7 = this.zztu; i7 < this.zztv; i7++) {
                                    obj = zza((Object) t, this.zztt[i7], (int) obj, (zzfp<UT, int>) zzfpVar);
                                }
                                if (obj != null) {
                                    zzfpVar.zzf(t, obj);
                                    return;
                                }
                                return;
                            }
                            break;
                    }
                } else {
                    if (zzda == Integer.MAX_VALUE) {
                        for (int i8 = this.zztu; i8 < this.zztv; i8++) {
                            obj = zza((Object) t, this.zztt[i8], (int) obj, (zzfp<UT, int>) zzfpVar);
                        }
                        if (obj != null) {
                            zzfpVar.zzf(t, obj);
                            return;
                        }
                        return;
                    }
                    Object zza16 = !this.zztp ? null : zzcpVar.zza(zzcoVar, this.zzto, zzda);
                    if (zza16 != null) {
                        if (zzcsVar == null) {
                            zzcsVar = zzcpVar.zzd(t);
                        }
                        zzcs<?> zzcsVar2 = zzcsVar;
                        obj = zzcpVar.zza(zzeuVar, zza16, zzcoVar, zzcsVar2, obj, zzfpVar);
                        zzcsVar = zzcsVar2;
                    } else {
                        zzfpVar.zza(zzeuVar);
                        if (obj == null) {
                            obj = zzfpVar.zzs(t);
                        }
                        if (!zzfpVar.zza((zzfp) obj, zzeuVar)) {
                            for (int i9 = this.zztu; i9 < this.zztv; i9++) {
                                obj = zza((Object) t, this.zztt[i9], (int) obj, (zzfp<UT, int>) zzfpVar);
                            }
                            if (obj != null) {
                                zzfpVar.zzf(t, obj);
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i10 = this.zztu; i10 < this.zztv; i10++) {
                    obj = zza((Object) t, this.zztt[i10], (int) obj, (zzfp<UT, int>) zzfpVar);
                }
                if (obj != null) {
                    zzfpVar.zzf(t, obj);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0977  */
    @Override // com.google.android.gms.internal.firebase_auth.zzev
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t, zzgj zzgjVar) throws IOException {
        Iterator<Map.Entry<?, Object>> it;
        Map.Entry<?, ?> entry;
        int length;
        Map.Entry<?, ?> entry2;
        int i;
        double zzo;
        float zzn;
        long zzl;
        long zzl2;
        int zzk;
        long zzl3;
        int zzk2;
        boolean zzm;
        int zzk3;
        int zzk4;
        int zzk5;
        long zzl4;
        int zzk6;
        long zzl5;
        Iterator<Map.Entry<?, Object>> it2;
        Map.Entry<?, ?> entry3;
        int length2;
        double zzo2;
        float zzn2;
        long zzl6;
        long zzl7;
        int zzk7;
        long zzl8;
        int zzk8;
        boolean zzm2;
        int zzk9;
        int zzk10;
        int zzk11;
        long zzl9;
        int zzk12;
        long zzl10;
        if (zzgjVar.zzdf() == zzdb.zze.zzrq) {
            zza(this.zzty, t, zzgjVar);
            if (this.zztp) {
                zzcs<?> zzc = this.zztz.zzc(t);
                if (!zzc.isEmpty()) {
                    it2 = zzc.descendingIterator();
                    entry3 = (Map.Entry) it2.next();
                    for (length2 = this.zztk.length - 3; length2 >= 0; length2 -= 3) {
                        int zzaq = zzaq(length2);
                        int i2 = this.zztk[length2];
                        while (entry3 != null && this.zztz.zza(entry3) > i2) {
                            this.zztz.zza(zzgjVar, entry3);
                            entry3 = it2.hasNext() ? (Map.Entry) it2.next() : null;
                        }
                        switch ((zzaq & 267386880) >>> 20) {
                            case 0:
                                if (zza((zzel<T>) t, length2)) {
                                    zzo2 = zzfv.zzo(t, zzaq & 1048575);
                                    zzgjVar.zza(i2, zzo2);
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
                                if (zza((zzel<T>) t, length2)) {
                                    zzn2 = zzfv.zzn(t, zzaq & 1048575);
                                    zzgjVar.zza(i2, zzn2);
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                if (zza((zzel<T>) t, length2)) {
                                    zzl6 = zzfv.zzl(t, zzaq & 1048575);
                                    zzgjVar.zzi(i2, zzl6);
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
                                if (zza((zzel<T>) t, length2)) {
                                    zzl7 = zzfv.zzl(t, zzaq & 1048575);
                                    zzgjVar.zza(i2, zzl7);
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                if (zza((zzel<T>) t, length2)) {
                                    zzk7 = zzfv.zzk(t, zzaq & 1048575);
                                    zzgjVar.zzc(i2, zzk7);
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
                                if (zza((zzel<T>) t, length2)) {
                                    zzl8 = zzfv.zzl(t, zzaq & 1048575);
                                    zzgjVar.zzc(i2, zzl8);
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                if (zza((zzel<T>) t, length2)) {
                                    zzk8 = zzfv.zzk(t, zzaq & 1048575);
                                    zzgjVar.zzf(i2, zzk8);
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                if (zza((zzel<T>) t, length2)) {
                                    zzm2 = zzfv.zzm(t, zzaq & 1048575);
                                    zzgjVar.zzb(i2, zzm2);
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
                                if (!zza((zzel<T>) t, length2)) {
                                    break;
                                }
                                zza(i2, zzfv.zzp(t, zzaq & 1048575), zzgjVar);
                                break;
                            case 9:
                                if (!zza((zzel<T>) t, length2)) {
                                    break;
                                }
                                zzgjVar.zza(i2, zzfv.zzp(t, zzaq & 1048575), zzan(length2));
                                break;
                            case 10:
                                if (!zza((zzel<T>) t, length2)) {
                                    break;
                                }
                                zzgjVar.zza(i2, (zzbu) zzfv.zzp(t, zzaq & 1048575));
                                break;
                            case 11:
                                if (zza((zzel<T>) t, length2)) {
                                    zzk9 = zzfv.zzk(t, zzaq & 1048575);
                                    zzgjVar.zzd(i2, zzk9);
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
                                if (zza((zzel<T>) t, length2)) {
                                    zzk10 = zzfv.zzk(t, zzaq & 1048575);
                                    zzgjVar.zzn(i2, zzk10);
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
                                if (zza((zzel<T>) t, length2)) {
                                    zzk11 = zzfv.zzk(t, zzaq & 1048575);
                                    zzgjVar.zzm(i2, zzk11);
                                    break;
                                } else {
                                    break;
                                }
                            case 14:
                                if (zza((zzel<T>) t, length2)) {
                                    zzl9 = zzfv.zzl(t, zzaq & 1048575);
                                    zzgjVar.zzj(i2, zzl9);
                                    break;
                                } else {
                                    break;
                                }
                            case 15:
                                if (zza((zzel<T>) t, length2)) {
                                    zzk12 = zzfv.zzk(t, zzaq & 1048575);
                                    zzgjVar.zze(i2, zzk12);
                                    break;
                                } else {
                                    break;
                                }
                            case 16:
                                if (zza((zzel<T>) t, length2)) {
                                    zzl10 = zzfv.zzl(t, zzaq & 1048575);
                                    zzgjVar.zzb(i2, zzl10);
                                    break;
                                } else {
                                    break;
                                }
                            case 17:
                                if (!zza((zzel<T>) t, length2)) {
                                    break;
                                }
                                zzgjVar.zzb(i2, zzfv.zzp(t, zzaq & 1048575), zzan(length2));
                                break;
                            case 18:
                                zzex.zza(this.zztk[length2], (List<Double>) zzfv.zzp(t, zzaq & 1048575), zzgjVar, false);
                                break;
                            case 19:
                                zzex.zzb(this.zztk[length2], (List<Float>) zzfv.zzp(t, zzaq & 1048575), zzgjVar, false);
                                break;
                            case 20:
                                zzex.zzc(this.zztk[length2], (List) zzfv.zzp(t, zzaq & 1048575), zzgjVar, false);
                                break;
                            case 21:
                                zzex.zzd(this.zztk[length2], (List) zzfv.zzp(t, zzaq & 1048575), zzgjVar, false);
                                break;
                            case 22:
                                zzex.zzh(this.zztk[length2], (List) zzfv.zzp(t, zzaq & 1048575), zzgjVar, false);
                                break;
                            case 23:
                                zzex.zzf(this.zztk[length2], (List) zzfv.zzp(t, zzaq & 1048575), zzgjVar, false);
                                break;
                            case 24:
                                zzex.zzk(this.zztk[length2], (List) zzfv.zzp(t, zzaq & 1048575), zzgjVar, false);
                                break;
                            case 25:
                                zzex.zzn(this.zztk[length2], (List) zzfv.zzp(t, zzaq & 1048575), zzgjVar, false);
                                break;
                            case 26:
                                zzex.zza(this.zztk[length2], (List<String>) zzfv.zzp(t, zzaq & 1048575), zzgjVar);
                                break;
                            case 27:
                                zzex.zza(this.zztk[length2], (List<?>) zzfv.zzp(t, zzaq & 1048575), zzgjVar, zzan(length2));
                                break;
                            case 28:
                                zzex.zzb(this.zztk[length2], (List) zzfv.zzp(t, zzaq & 1048575), zzgjVar);
                                break;
                            case 29:
                                zzex.zzi(this.zztk[length2], (List) zzfv.zzp(t, zzaq & 1048575), zzgjVar, false);
                                break;
                            case 30:
                                zzex.zzm(this.zztk[length2], (List) zzfv.zzp(t, zzaq & 1048575), zzgjVar, false);
                                break;
                            case 31:
                                zzex.zzl(this.zztk[length2], (List) zzfv.zzp(t, zzaq & 1048575), zzgjVar, false);
                                break;
                            case 32:
                                zzex.zzg(this.zztk[length2], (List) zzfv.zzp(t, zzaq & 1048575), zzgjVar, false);
                                break;
                            case 33:
                                zzex.zzj(this.zztk[length2], (List) zzfv.zzp(t, zzaq & 1048575), zzgjVar, false);
                                break;
                            case 34:
                                zzex.zze(this.zztk[length2], (List) zzfv.zzp(t, zzaq & 1048575), zzgjVar, false);
                                break;
                            case 35:
                                zzex.zza(this.zztk[length2], (List<Double>) zzfv.zzp(t, zzaq & 1048575), zzgjVar, true);
                                break;
                            case 36:
                                zzex.zzb(this.zztk[length2], (List<Float>) zzfv.zzp(t, zzaq & 1048575), zzgjVar, true);
                                break;
                            case 37:
                                zzex.zzc(this.zztk[length2], (List) zzfv.zzp(t, zzaq & 1048575), zzgjVar, true);
                                break;
                            case 38:
                                zzex.zzd(this.zztk[length2], (List) zzfv.zzp(t, zzaq & 1048575), zzgjVar, true);
                                break;
                            case 39:
                                zzex.zzh(this.zztk[length2], (List) zzfv.zzp(t, zzaq & 1048575), zzgjVar, true);
                                break;
                            case 40:
                                zzex.zzf(this.zztk[length2], (List) zzfv.zzp(t, zzaq & 1048575), zzgjVar, true);
                                break;
                            case 41:
                                zzex.zzk(this.zztk[length2], (List) zzfv.zzp(t, zzaq & 1048575), zzgjVar, true);
                                break;
                            case 42:
                                zzex.zzn(this.zztk[length2], (List) zzfv.zzp(t, zzaq & 1048575), zzgjVar, true);
                                break;
                            case 43:
                                zzex.zzi(this.zztk[length2], (List) zzfv.zzp(t, zzaq & 1048575), zzgjVar, true);
                                break;
                            case 44:
                                zzex.zzm(this.zztk[length2], (List) zzfv.zzp(t, zzaq & 1048575), zzgjVar, true);
                                break;
                            case 45:
                                zzex.zzl(this.zztk[length2], (List) zzfv.zzp(t, zzaq & 1048575), zzgjVar, true);
                                break;
                            case 46:
                                zzex.zzg(this.zztk[length2], (List) zzfv.zzp(t, zzaq & 1048575), zzgjVar, true);
                                break;
                            case 47:
                                zzex.zzj(this.zztk[length2], (List) zzfv.zzp(t, zzaq & 1048575), zzgjVar, true);
                                break;
                            case 48:
                                zzex.zze(this.zztk[length2], (List) zzfv.zzp(t, zzaq & 1048575), zzgjVar, true);
                                break;
                            case 49:
                                zzex.zzb(this.zztk[length2], (List<?>) zzfv.zzp(t, zzaq & 1048575), zzgjVar, zzan(length2));
                                break;
                            case 50:
                                zza(zzgjVar, i2, zzfv.zzp(t, zzaq & 1048575), length2);
                                break;
                            case 51:
                                if (zza((zzel<T>) t, i2, length2)) {
                                    zzo2 = zzf(t, zzaq & 1048575);
                                    zzgjVar.zza(i2, zzo2);
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
                                if (zza((zzel<T>) t, i2, length2)) {
                                    zzn2 = zzg(t, zzaq & 1048575);
                                    zzgjVar.zza(i2, zzn2);
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                if (zza((zzel<T>) t, i2, length2)) {
                                    zzl6 = zzi(t, zzaq & 1048575);
                                    zzgjVar.zzi(i2, zzl6);
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                if (zza((zzel<T>) t, i2, length2)) {
                                    zzl7 = zzi(t, zzaq & 1048575);
                                    zzgjVar.zza(i2, zzl7);
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
                                if (zza((zzel<T>) t, i2, length2)) {
                                    zzk7 = zzh(t, zzaq & 1048575);
                                    zzgjVar.zzc(i2, zzk7);
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
                                if (zza((zzel<T>) t, i2, length2)) {
                                    zzl8 = zzi(t, zzaq & 1048575);
                                    zzgjVar.zzc(i2, zzl8);
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
                                if (zza((zzel<T>) t, i2, length2)) {
                                    zzk8 = zzh(t, zzaq & 1048575);
                                    zzgjVar.zzf(i2, zzk8);
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
                                if (zza((zzel<T>) t, i2, length2)) {
                                    zzm2 = zzj(t, zzaq & 1048575);
                                    zzgjVar.zzb(i2, zzm2);
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
                                if (!zza((zzel<T>) t, i2, length2)) {
                                    break;
                                }
                                zza(i2, zzfv.zzp(t, zzaq & 1048575), zzgjVar);
                                break;
                            case 60:
                                if (!zza((zzel<T>) t, i2, length2)) {
                                    break;
                                }
                                zzgjVar.zza(i2, zzfv.zzp(t, zzaq & 1048575), zzan(length2));
                                break;
                            case 61:
                                if (!zza((zzel<T>) t, i2, length2)) {
                                    break;
                                }
                                zzgjVar.zza(i2, (zzbu) zzfv.zzp(t, zzaq & 1048575));
                                break;
                            case 62:
                                if (zza((zzel<T>) t, i2, length2)) {
                                    zzk9 = zzh(t, zzaq & 1048575);
                                    zzgjVar.zzd(i2, zzk9);
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
                                if (zza((zzel<T>) t, i2, length2)) {
                                    zzk10 = zzh(t, zzaq & 1048575);
                                    zzgjVar.zzn(i2, zzk10);
                                    break;
                                } else {
                                    break;
                                }
                            case 64:
                                if (zza((zzel<T>) t, i2, length2)) {
                                    zzk11 = zzh(t, zzaq & 1048575);
                                    zzgjVar.zzm(i2, zzk11);
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
                                if (zza((zzel<T>) t, i2, length2)) {
                                    zzl9 = zzi(t, zzaq & 1048575);
                                    zzgjVar.zzj(i2, zzl9);
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
                                if (zza((zzel<T>) t, i2, length2)) {
                                    zzk12 = zzh(t, zzaq & 1048575);
                                    zzgjVar.zze(i2, zzk12);
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
                                if (zza((zzel<T>) t, i2, length2)) {
                                    zzl10 = zzi(t, zzaq & 1048575);
                                    zzgjVar.zzb(i2, zzl10);
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
                                if (!zza((zzel<T>) t, i2, length2)) {
                                    break;
                                }
                                zzgjVar.zzb(i2, zzfv.zzp(t, zzaq & 1048575), zzan(length2));
                                break;
                        }
                    }
                    while (entry3 != null) {
                        this.zztz.zza(zzgjVar, entry3);
                        entry3 = it2.hasNext() ? (Map.Entry) it2.next() : null;
                    }
                    return;
                }
            }
            it2 = null;
            entry3 = null;
            while (length2 >= 0) {
            }
            while (entry3 != null) {
            }
            return;
        }
        if (!this.zztr) {
            zzb((zzel<T>) t, zzgjVar);
            return;
        }
        if (this.zztp) {
            zzcs<?> zzc2 = this.zztz.zzc(t);
            if (!zzc2.isEmpty()) {
                it = zzc2.iterator();
                entry = (Map.Entry) it.next();
                length = this.zztk.length;
                entry2 = entry;
                for (i = 0; i < length; i += 3) {
                    int zzaq2 = zzaq(i);
                    int i3 = this.zztk[i];
                    while (entry2 != null && this.zztz.zza(entry2) <= i3) {
                        this.zztz.zza(zzgjVar, entry2);
                        entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    switch ((zzaq2 & 267386880) >>> 20) {
                        case 0:
                            if (zza((zzel<T>) t, i)) {
                                zzo = zzfv.zzo(t, zzaq2 & 1048575);
                                zzgjVar.zza(i3, zzo);
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (zza((zzel<T>) t, i)) {
                                zzn = zzfv.zzn(t, zzaq2 & 1048575);
                                zzgjVar.zza(i3, zzn);
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (zza((zzel<T>) t, i)) {
                                zzl = zzfv.zzl(t, zzaq2 & 1048575);
                                zzgjVar.zzi(i3, zzl);
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (zza((zzel<T>) t, i)) {
                                zzl2 = zzfv.zzl(t, zzaq2 & 1048575);
                                zzgjVar.zza(i3, zzl2);
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (zza((zzel<T>) t, i)) {
                                zzk = zzfv.zzk(t, zzaq2 & 1048575);
                                zzgjVar.zzc(i3, zzk);
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (zza((zzel<T>) t, i)) {
                                zzl3 = zzfv.zzl(t, zzaq2 & 1048575);
                                zzgjVar.zzc(i3, zzl3);
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (zza((zzel<T>) t, i)) {
                                zzk2 = zzfv.zzk(t, zzaq2 & 1048575);
                                zzgjVar.zzf(i3, zzk2);
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (zza((zzel<T>) t, i)) {
                                zzm = zzfv.zzm(t, zzaq2 & 1048575);
                                zzgjVar.zzb(i3, zzm);
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (!zza((zzel<T>) t, i)) {
                                break;
                            }
                            zza(i3, zzfv.zzp(t, zzaq2 & 1048575), zzgjVar);
                            break;
                        case 9:
                            if (!zza((zzel<T>) t, i)) {
                                break;
                            }
                            zzgjVar.zza(i3, zzfv.zzp(t, zzaq2 & 1048575), zzan(i));
                            break;
                        case 10:
                            if (!zza((zzel<T>) t, i)) {
                                break;
                            }
                            zzgjVar.zza(i3, (zzbu) zzfv.zzp(t, zzaq2 & 1048575));
                            break;
                        case 11:
                            if (zza((zzel<T>) t, i)) {
                                zzk3 = zzfv.zzk(t, zzaq2 & 1048575);
                                zzgjVar.zzd(i3, zzk3);
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (zza((zzel<T>) t, i)) {
                                zzk4 = zzfv.zzk(t, zzaq2 & 1048575);
                                zzgjVar.zzn(i3, zzk4);
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (zza((zzel<T>) t, i)) {
                                zzk5 = zzfv.zzk(t, zzaq2 & 1048575);
                                zzgjVar.zzm(i3, zzk5);
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (zza((zzel<T>) t, i)) {
                                zzl4 = zzfv.zzl(t, zzaq2 & 1048575);
                                zzgjVar.zzj(i3, zzl4);
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (zza((zzel<T>) t, i)) {
                                zzk6 = zzfv.zzk(t, zzaq2 & 1048575);
                                zzgjVar.zze(i3, zzk6);
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (zza((zzel<T>) t, i)) {
                                zzl5 = zzfv.zzl(t, zzaq2 & 1048575);
                                zzgjVar.zzb(i3, zzl5);
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (!zza((zzel<T>) t, i)) {
                                break;
                            }
                            zzgjVar.zzb(i3, zzfv.zzp(t, zzaq2 & 1048575), zzan(i));
                            break;
                        case 18:
                            zzex.zza(this.zztk[i], (List<Double>) zzfv.zzp(t, zzaq2 & 1048575), zzgjVar, false);
                            break;
                        case 19:
                            zzex.zzb(this.zztk[i], (List<Float>) zzfv.zzp(t, zzaq2 & 1048575), zzgjVar, false);
                            break;
                        case 20:
                            zzex.zzc(this.zztk[i], (List) zzfv.zzp(t, zzaq2 & 1048575), zzgjVar, false);
                            break;
                        case 21:
                            zzex.zzd(this.zztk[i], (List) zzfv.zzp(t, zzaq2 & 1048575), zzgjVar, false);
                            break;
                        case 22:
                            zzex.zzh(this.zztk[i], (List) zzfv.zzp(t, zzaq2 & 1048575), zzgjVar, false);
                            break;
                        case 23:
                            zzex.zzf(this.zztk[i], (List) zzfv.zzp(t, zzaq2 & 1048575), zzgjVar, false);
                            break;
                        case 24:
                            zzex.zzk(this.zztk[i], (List) zzfv.zzp(t, zzaq2 & 1048575), zzgjVar, false);
                            break;
                        case 25:
                            zzex.zzn(this.zztk[i], (List) zzfv.zzp(t, zzaq2 & 1048575), zzgjVar, false);
                            break;
                        case 26:
                            zzex.zza(this.zztk[i], (List<String>) zzfv.zzp(t, zzaq2 & 1048575), zzgjVar);
                            break;
                        case 27:
                            zzex.zza(this.zztk[i], (List<?>) zzfv.zzp(t, zzaq2 & 1048575), zzgjVar, zzan(i));
                            break;
                        case 28:
                            zzex.zzb(this.zztk[i], (List) zzfv.zzp(t, zzaq2 & 1048575), zzgjVar);
                            break;
                        case 29:
                            zzex.zzi(this.zztk[i], (List) zzfv.zzp(t, zzaq2 & 1048575), zzgjVar, false);
                            break;
                        case 30:
                            zzex.zzm(this.zztk[i], (List) zzfv.zzp(t, zzaq2 & 1048575), zzgjVar, false);
                            break;
                        case 31:
                            zzex.zzl(this.zztk[i], (List) zzfv.zzp(t, zzaq2 & 1048575), zzgjVar, false);
                            break;
                        case 32:
                            zzex.zzg(this.zztk[i], (List) zzfv.zzp(t, zzaq2 & 1048575), zzgjVar, false);
                            break;
                        case 33:
                            zzex.zzj(this.zztk[i], (List) zzfv.zzp(t, zzaq2 & 1048575), zzgjVar, false);
                            break;
                        case 34:
                            zzex.zze(this.zztk[i], (List) zzfv.zzp(t, zzaq2 & 1048575), zzgjVar, false);
                            break;
                        case 35:
                            zzex.zza(this.zztk[i], (List<Double>) zzfv.zzp(t, zzaq2 & 1048575), zzgjVar, true);
                            break;
                        case 36:
                            zzex.zzb(this.zztk[i], (List<Float>) zzfv.zzp(t, zzaq2 & 1048575), zzgjVar, true);
                            break;
                        case 37:
                            zzex.zzc(this.zztk[i], (List) zzfv.zzp(t, zzaq2 & 1048575), zzgjVar, true);
                            break;
                        case 38:
                            zzex.zzd(this.zztk[i], (List) zzfv.zzp(t, zzaq2 & 1048575), zzgjVar, true);
                            break;
                        case 39:
                            zzex.zzh(this.zztk[i], (List) zzfv.zzp(t, zzaq2 & 1048575), zzgjVar, true);
                            break;
                        case 40:
                            zzex.zzf(this.zztk[i], (List) zzfv.zzp(t, zzaq2 & 1048575), zzgjVar, true);
                            break;
                        case 41:
                            zzex.zzk(this.zztk[i], (List) zzfv.zzp(t, zzaq2 & 1048575), zzgjVar, true);
                            break;
                        case 42:
                            zzex.zzn(this.zztk[i], (List) zzfv.zzp(t, zzaq2 & 1048575), zzgjVar, true);
                            break;
                        case 43:
                            zzex.zzi(this.zztk[i], (List) zzfv.zzp(t, zzaq2 & 1048575), zzgjVar, true);
                            break;
                        case 44:
                            zzex.zzm(this.zztk[i], (List) zzfv.zzp(t, zzaq2 & 1048575), zzgjVar, true);
                            break;
                        case 45:
                            zzex.zzl(this.zztk[i], (List) zzfv.zzp(t, zzaq2 & 1048575), zzgjVar, true);
                            break;
                        case 46:
                            zzex.zzg(this.zztk[i], (List) zzfv.zzp(t, zzaq2 & 1048575), zzgjVar, true);
                            break;
                        case 47:
                            zzex.zzj(this.zztk[i], (List) zzfv.zzp(t, zzaq2 & 1048575), zzgjVar, true);
                            break;
                        case 48:
                            zzex.zze(this.zztk[i], (List) zzfv.zzp(t, zzaq2 & 1048575), zzgjVar, true);
                            break;
                        case 49:
                            zzex.zzb(this.zztk[i], (List<?>) zzfv.zzp(t, zzaq2 & 1048575), zzgjVar, zzan(i));
                            break;
                        case 50:
                            zza(zzgjVar, i3, zzfv.zzp(t, zzaq2 & 1048575), i);
                            break;
                        case 51:
                            if (zza((zzel<T>) t, i3, i)) {
                                zzo = zzf(t, zzaq2 & 1048575);
                                zzgjVar.zza(i3, zzo);
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (zza((zzel<T>) t, i3, i)) {
                                zzn = zzg(t, zzaq2 & 1048575);
                                zzgjVar.zza(i3, zzn);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (zza((zzel<T>) t, i3, i)) {
                                zzl = zzi(t, zzaq2 & 1048575);
                                zzgjVar.zzi(i3, zzl);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (zza((zzel<T>) t, i3, i)) {
                                zzl2 = zzi(t, zzaq2 & 1048575);
                                zzgjVar.zza(i3, zzl2);
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (zza((zzel<T>) t, i3, i)) {
                                zzk = zzh(t, zzaq2 & 1048575);
                                zzgjVar.zzc(i3, zzk);
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (zza((zzel<T>) t, i3, i)) {
                                zzl3 = zzi(t, zzaq2 & 1048575);
                                zzgjVar.zzc(i3, zzl3);
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (zza((zzel<T>) t, i3, i)) {
                                zzk2 = zzh(t, zzaq2 & 1048575);
                                zzgjVar.zzf(i3, zzk2);
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (zza((zzel<T>) t, i3, i)) {
                                zzm = zzj(t, zzaq2 & 1048575);
                                zzgjVar.zzb(i3, zzm);
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (!zza((zzel<T>) t, i3, i)) {
                                break;
                            }
                            zza(i3, zzfv.zzp(t, zzaq2 & 1048575), zzgjVar);
                            break;
                        case 60:
                            if (!zza((zzel<T>) t, i3, i)) {
                                break;
                            }
                            zzgjVar.zza(i3, zzfv.zzp(t, zzaq2 & 1048575), zzan(i));
                            break;
                        case 61:
                            if (!zza((zzel<T>) t, i3, i)) {
                                break;
                            }
                            zzgjVar.zza(i3, (zzbu) zzfv.zzp(t, zzaq2 & 1048575));
                            break;
                        case 62:
                            if (zza((zzel<T>) t, i3, i)) {
                                zzk3 = zzh(t, zzaq2 & 1048575);
                                zzgjVar.zzd(i3, zzk3);
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (zza((zzel<T>) t, i3, i)) {
                                zzk4 = zzh(t, zzaq2 & 1048575);
                                zzgjVar.zzn(i3, zzk4);
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (zza((zzel<T>) t, i3, i)) {
                                zzk5 = zzh(t, zzaq2 & 1048575);
                                zzgjVar.zzm(i3, zzk5);
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (zza((zzel<T>) t, i3, i)) {
                                zzl4 = zzi(t, zzaq2 & 1048575);
                                zzgjVar.zzj(i3, zzl4);
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (zza((zzel<T>) t, i3, i)) {
                                zzk6 = zzh(t, zzaq2 & 1048575);
                                zzgjVar.zze(i3, zzk6);
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (zza((zzel<T>) t, i3, i)) {
                                zzl5 = zzi(t, zzaq2 & 1048575);
                                zzgjVar.zzb(i3, zzl5);
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (!zza((zzel<T>) t, i3, i)) {
                                break;
                            }
                            zzgjVar.zzb(i3, zzfv.zzp(t, zzaq2 & 1048575), zzan(i));
                            break;
                    }
                }
                while (entry2 != null) {
                    this.zztz.zza(zzgjVar, entry2);
                    entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                zza(this.zzty, t, zzgjVar);
            }
        }
        it = null;
        entry = null;
        length = this.zztk.length;
        entry2 = entry;
        while (i < length) {
        }
        while (entry2 != null) {
        }
        zza(this.zzty, t, zzgjVar);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.firebase_auth.zzev
    public final void zzc(T t, T t2) {
        if (t2 == null) {
            throw new NullPointerException();
        }
        for (int i = 0; i < this.zztk.length; i += 3) {
            int zzaq = zzaq(i);
            long j = 1048575 & zzaq;
            int i2 = this.zztk[i];
            switch ((zzaq & 267386880) >>> 20) {
                case 0:
                    if (zza((zzel<T>) t2, i)) {
                        zzfv.zza(t, j, zzfv.zzo(t2, j));
                        zzb((zzel<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zza((zzel<T>) t2, i)) {
                        zzfv.zza((Object) t, j, zzfv.zzn(t2, j));
                        zzb((zzel<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!zza((zzel<T>) t2, i)) {
                        break;
                    }
                    zzfv.zza((Object) t, j, zzfv.zzl(t2, j));
                    zzb((zzel<T>) t, i);
                    break;
                case 3:
                    if (!zza((zzel<T>) t2, i)) {
                        break;
                    }
                    zzfv.zza((Object) t, j, zzfv.zzl(t2, j));
                    zzb((zzel<T>) t, i);
                    break;
                case 4:
                    if (!zza((zzel<T>) t2, i)) {
                        break;
                    }
                    zzfv.zzb(t, j, zzfv.zzk(t2, j));
                    zzb((zzel<T>) t, i);
                    break;
                case 5:
                    if (!zza((zzel<T>) t2, i)) {
                        break;
                    }
                    zzfv.zza((Object) t, j, zzfv.zzl(t2, j));
                    zzb((zzel<T>) t, i);
                    break;
                case 6:
                    if (!zza((zzel<T>) t2, i)) {
                        break;
                    }
                    zzfv.zzb(t, j, zzfv.zzk(t2, j));
                    zzb((zzel<T>) t, i);
                    break;
                case 7:
                    if (zza((zzel<T>) t2, i)) {
                        zzfv.zza(t, j, zzfv.zzm(t2, j));
                        zzb((zzel<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zza((zzel<T>) t2, i)) {
                        break;
                    }
                    zzfv.zza(t, j, zzfv.zzp(t2, j));
                    zzb((zzel<T>) t, i);
                    break;
                case 9:
                case 17:
                    zza(t, t2, i);
                    break;
                case 10:
                    if (!zza((zzel<T>) t2, i)) {
                        break;
                    }
                    zzfv.zza(t, j, zzfv.zzp(t2, j));
                    zzb((zzel<T>) t, i);
                    break;
                case 11:
                    if (!zza((zzel<T>) t2, i)) {
                        break;
                    }
                    zzfv.zzb(t, j, zzfv.zzk(t2, j));
                    zzb((zzel<T>) t, i);
                    break;
                case 12:
                    if (!zza((zzel<T>) t2, i)) {
                        break;
                    }
                    zzfv.zzb(t, j, zzfv.zzk(t2, j));
                    zzb((zzel<T>) t, i);
                    break;
                case 13:
                    if (!zza((zzel<T>) t2, i)) {
                        break;
                    }
                    zzfv.zzb(t, j, zzfv.zzk(t2, j));
                    zzb((zzel<T>) t, i);
                    break;
                case 14:
                    if (!zza((zzel<T>) t2, i)) {
                        break;
                    }
                    zzfv.zza((Object) t, j, zzfv.zzl(t2, j));
                    zzb((zzel<T>) t, i);
                    break;
                case 15:
                    if (!zza((zzel<T>) t2, i)) {
                        break;
                    }
                    zzfv.zzb(t, j, zzfv.zzk(t2, j));
                    zzb((zzel<T>) t, i);
                    break;
                case 16:
                    if (!zza((zzel<T>) t2, i)) {
                        break;
                    }
                    zzfv.zza((Object) t, j, zzfv.zzl(t2, j));
                    zzb((zzel<T>) t, i);
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
                    this.zztx.zza(t, t2, j);
                    break;
                case 50:
                    zzex.zza(this.zzua, t, t2, j);
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
                    if (!zza((zzel<T>) t2, i2, i)) {
                        break;
                    }
                    zzfv.zza(t, j, zzfv.zzp(t2, j));
                    zzb((zzel<T>) t, i2, i);
                    break;
                case 60:
                case 68:
                    zzb(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zza((zzel<T>) t2, i2, i)) {
                        break;
                    }
                    zzfv.zza(t, j, zzfv.zzp(t2, j));
                    zzb((zzel<T>) t, i2, i);
                    break;
            }
        }
        if (this.zztr) {
            return;
        }
        zzex.zza(this.zzty, t, t2);
        if (this.zztp) {
            zzex.zza(this.zztz, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzev
    public final void zze(T t) {
        int i;
        int i2 = this.zztu;
        while (true) {
            i = this.zztv;
            if (i2 >= i) {
                break;
            }
            long zzaq = zzaq(this.zztt[i2]) & 1048575;
            Object zzp = zzfv.zzp(t, zzaq);
            if (zzp != null) {
                zzfv.zza(t, zzaq, this.zzua.zzl(zzp));
            }
            i2++;
        }
        int length = this.zztt.length;
        while (i < length) {
            this.zztx.zzb(t, this.zztt[i]);
            i++;
        }
        this.zzty.zze(t);
        if (this.zztp) {
            this.zztz.zze(t);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0127, code lost:
    
        if (r19.zzts != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0211, code lost:
    
        r3 = (com.google.android.gms.internal.firebase_auth.zzci.zzaa(r3) + com.google.android.gms.internal.firebase_auth.zzci.zzac(r5)) + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x020d, code lost:
    
        r2.putInt(r20, r14, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0139, code lost:
    
        if (r19.zzts != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x014b, code lost:
    
        if (r19.zzts != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x015d, code lost:
    
        if (r19.zzts != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x016f, code lost:
    
        if (r19.zzts != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0181, code lost:
    
        if (r19.zzts != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0193, code lost:
    
        if (r19.zzts != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01a5, code lost:
    
        if (r19.zzts != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01b6, code lost:
    
        if (r19.zzts != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01c7, code lost:
    
        if (r19.zzts != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01d8, code lost:
    
        if (r19.zzts != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x01e9, code lost:
    
        if (r19.zzts != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01fa, code lost:
    
        if (r19.zzts != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x020b, code lost:
    
        if (r19.zzts != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0331, code lost:
    
        if ((r5 instanceof com.google.android.gms.internal.firebase_auth.zzbu) != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0417, code lost:
    
        if (zza((com.google.android.gms.internal.firebase_auth.zzel<T>) r20, r15, r3) != false) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x06b9, code lost:
    
        r4 = com.google.android.gms.internal.firebase_auth.zzci.zzc(r15, (com.google.android.gms.internal.firebase_auth.zzeh) r2.getObject(r20, r9), zzan(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0437, code lost:
    
        if (zza((com.google.android.gms.internal.firebase_auth.zzel<T>) r20, r15, r3) != false) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x06e6, code lost:
    
        r4 = com.google.android.gms.internal.firebase_auth.zzci.zzh(r15, 0L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x043f, code lost:
    
        if (zza((com.google.android.gms.internal.firebase_auth.zzel<T>) r20, r15, r3) != false) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x06f1, code lost:
    
        r9 = com.google.android.gms.internal.firebase_auth.zzci.zzk(r15, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x045f, code lost:
    
        if (zza((com.google.android.gms.internal.firebase_auth.zzel<T>) r20, r15, r3) != false) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0716, code lost:
    
        r4 = r2.getObject(r20, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x071a, code lost:
    
        r4 = com.google.android.gms.internal.firebase_auth.zzci.zzc(r15, (com.google.android.gms.internal.firebase_auth.zzbu) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0467, code lost:
    
        if (zza((com.google.android.gms.internal.firebase_auth.zzel<T>) r20, r15, r3) != false) goto L425;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0725, code lost:
    
        r4 = com.google.android.gms.internal.firebase_auth.zzex.zzc(r15, r2.getObject(r20, r9), zzan(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0477, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.firebase_auth.zzbu) != false) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0740, code lost:
    
        r4 = com.google.android.gms.internal.firebase_auth.zzci.zzb(r15, (java.lang.String) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x047f, code lost:
    
        if (zza((com.google.android.gms.internal.firebase_auth.zzel<T>) r20, r15, r3) != false) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x074c, code lost:
    
        r4 = com.google.android.gms.internal.firebase_auth.zzci.zzc(r15, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0517, code lost:
    
        if (r19.zzts != false) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0601, code lost:
    
        r9 = (com.google.android.gms.internal.firebase_auth.zzci.zzaa(r15) + com.google.android.gms.internal.firebase_auth.zzci.zzac(r4)) + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x05fd, code lost:
    
        r2.putInt(r20, r11, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0529, code lost:
    
        if (r19.zzts != false) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x053b, code lost:
    
        if (r19.zzts != false) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x054d, code lost:
    
        if (r19.zzts != false) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x055f, code lost:
    
        if (r19.zzts != false) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0571, code lost:
    
        if (r19.zzts != false) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0583, code lost:
    
        if (r19.zzts != false) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0595, code lost:
    
        if (r19.zzts != false) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x05a6, code lost:
    
        if (r19.zzts != false) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x05b7, code lost:
    
        if (r19.zzts != false) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x05c8, code lost:
    
        if (r19.zzts != false) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x05d9, code lost:
    
        if (r19.zzts != false) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x05ea, code lost:
    
        if (r19.zzts != false) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x05fb, code lost:
    
        if (r19.zzts != false) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x06b7, code lost:
    
        if ((r12 & r18) != 0) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x06e4, code lost:
    
        if ((r12 & r18) != 0) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x06ef, code lost:
    
        if ((r12 & r18) != 0) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0714, code lost:
    
        if ((r12 & r18) != 0) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0723, code lost:
    
        if ((r12 & r18) != 0) goto L425;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x073d, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.firebase_auth.zzbu) != false) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x074a, code lost:
    
        if ((r12 & r18) != 0) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ab, code lost:
    
        if ((r5 instanceof com.google.android.gms.internal.firebase_auth.zzbu) != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0334, code lost:
    
        r3 = com.google.android.gms.internal.firebase_auth.zzci.zzb(r3, (java.lang.String) r5);
     */
    @Override // com.google.android.gms.internal.firebase_auth.zzev
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzo(T t) {
        int i;
        int i2;
        long j;
        int zzd;
        Object object;
        int i3;
        int i4;
        int i5;
        long j2;
        int zzw;
        int zzaa;
        int zzaa2;
        long zzl;
        long zzl2;
        int zzk;
        Object zzp;
        int zzk2;
        int zzk3;
        int zzk4;
        long zzl3;
        int zzw2;
        int zzaa3;
        int i6 = 267386880;
        if (!this.zztr) {
            Unsafe unsafe = zztj;
            int i7 = 0;
            int i8 = 0;
            int i9 = -1;
            int i10 = 0;
            while (i7 < this.zztk.length) {
                int zzaq = zzaq(i7);
                int[] iArr = this.zztk;
                int i11 = iArr[i7];
                int i12 = (zzaq & 267386880) >>> 20;
                if (i12 <= 17) {
                    i = iArr[i7 + 2];
                    int i13 = i & 1048575;
                    i2 = 1 << (i >>> 20);
                    if (i13 != i9) {
                        i10 = unsafe.getInt(t, i13);
                    } else {
                        i13 = i9;
                    }
                    i9 = i13;
                } else {
                    i = (!this.zzts || i12 < zzcv.DOUBLE_LIST_PACKED.id() || i12 > zzcv.SINT64_LIST_PACKED.id()) ? 0 : this.zztk[i7 + 2] & 1048575;
                    i2 = 0;
                }
                long j3 = zzaq & 1048575;
                switch (i12) {
                    case 0:
                        j = 0;
                        if ((i10 & i2) != 0) {
                            i8 += zzci.zzb(i11, 0.0d);
                            break;
                        }
                        break;
                    case 1:
                        j = 0;
                        if ((i10 & i2) != 0) {
                            i8 += zzci.zzb(i11, 0.0f);
                            break;
                        }
                    case 2:
                        j = 0;
                        if ((i10 & i2) != 0) {
                            zzd = zzci.zzd(i11, unsafe.getLong(t, j3));
                            i8 += zzd;
                        }
                        break;
                    case 3:
                        j = 0;
                        if ((i10 & i2) != 0) {
                            zzd = zzci.zze(i11, unsafe.getLong(t, j3));
                            i8 += zzd;
                        }
                        break;
                    case 4:
                        j = 0;
                        if ((i10 & i2) != 0) {
                            zzd = zzci.zzg(i11, unsafe.getInt(t, j3));
                            i8 += zzd;
                        }
                        break;
                    case 5:
                        if ((i10 & i2) != 0) {
                            j = 0;
                            zzd = zzci.zzg(i11, 0L);
                            i8 += zzd;
                            break;
                        } else {
                            j = 0;
                        }
                    case 6:
                        if ((i10 & i2) != 0) {
                            i8 += zzci.zzj(i11, 0);
                            j = 0;
                            break;
                        }
                        j = 0;
                    case 7:
                        break;
                    case 8:
                        if ((i10 & i2) != 0) {
                            object = unsafe.getObject(t, j3);
                            break;
                        }
                        j = 0;
                        break;
                    case 9:
                        break;
                    case 10:
                        break;
                    case 11:
                        if ((i10 & i2) != 0) {
                            i3 = unsafe.getInt(t, j3);
                            zzw = zzci.zzh(i11, i3);
                            i8 += zzw;
                        }
                        j = 0;
                        break;
                    case 12:
                        if ((i10 & i2) != 0) {
                            i4 = unsafe.getInt(t, j3);
                            zzw = zzci.zzl(i11, i4);
                            i8 += zzw;
                        }
                        j = 0;
                        break;
                    case 13:
                        break;
                    case 14:
                        break;
                    case 15:
                        if ((i10 & i2) != 0) {
                            i5 = unsafe.getInt(t, j3);
                            zzw = zzci.zzi(i11, i5);
                            i8 += zzw;
                        }
                        j = 0;
                        break;
                    case 16:
                        if ((i10 & i2) != 0) {
                            j2 = unsafe.getLong(t, j3);
                            zzw = zzci.zzf(i11, j2);
                            i8 += zzw;
                        }
                        j = 0;
                        break;
                    case 17:
                        break;
                    case 18:
                    case 23:
                    case 32:
                        zzw = zzex.zzw(i11, (List) unsafe.getObject(t, j3), false);
                        i8 += zzw;
                        j = 0;
                        break;
                    case 19:
                    case 24:
                    case 31:
                        zzw = zzex.zzv(i11, (List) unsafe.getObject(t, j3), false);
                        i8 += zzw;
                        j = 0;
                        break;
                    case 20:
                        zzw = zzex.zzo(i11, (List) unsafe.getObject(t, j3), false);
                        i8 += zzw;
                        j = 0;
                        break;
                    case 21:
                        zzw = zzex.zzp(i11, (List) unsafe.getObject(t, j3), false);
                        i8 += zzw;
                        j = 0;
                        break;
                    case 22:
                        zzw = zzex.zzs(i11, (List) unsafe.getObject(t, j3), false);
                        i8 += zzw;
                        j = 0;
                        break;
                    case 25:
                        zzw = zzex.zzx(i11, (List) unsafe.getObject(t, j3), false);
                        i8 += zzw;
                        j = 0;
                        break;
                    case 26:
                        zzw = zzex.zzc(i11, (List) unsafe.getObject(t, j3));
                        i8 += zzw;
                        j = 0;
                        break;
                    case 27:
                        zzw = zzex.zzc(i11, (List<?>) unsafe.getObject(t, j3), zzan(i7));
                        i8 += zzw;
                        j = 0;
                        break;
                    case 28:
                        zzw = zzex.zzd(i11, (List<zzbu>) unsafe.getObject(t, j3));
                        i8 += zzw;
                        j = 0;
                        break;
                    case 29:
                        zzw = zzex.zzt(i11, (List) unsafe.getObject(t, j3), false);
                        i8 += zzw;
                        j = 0;
                        break;
                    case 30:
                        zzw = zzex.zzr(i11, (List) unsafe.getObject(t, j3), false);
                        i8 += zzw;
                        j = 0;
                        break;
                    case 33:
                        zzw = zzex.zzu(i11, (List) unsafe.getObject(t, j3), false);
                        i8 += zzw;
                        j = 0;
                        break;
                    case 34:
                        zzw = zzex.zzq(i11, (List) unsafe.getObject(t, j3), false);
                        i8 += zzw;
                        j = 0;
                        break;
                    case 35:
                        zzaa = zzex.zzaa((List) unsafe.getObject(t, j3));
                        if (zzaa > 0) {
                            break;
                        }
                        j = 0;
                        break;
                    case 36:
                        zzaa = zzex.zzz((List) unsafe.getObject(t, j3));
                        if (zzaa > 0) {
                            break;
                        }
                        j = 0;
                        break;
                    case 37:
                        zzaa = zzex.zzs((List) unsafe.getObject(t, j3));
                        if (zzaa > 0) {
                            break;
                        }
                        j = 0;
                        break;
                    case 38:
                        zzaa = zzex.zzt((List) unsafe.getObject(t, j3));
                        if (zzaa > 0) {
                            break;
                        }
                        j = 0;
                        break;
                    case 39:
                        zzaa = zzex.zzw((List) unsafe.getObject(t, j3));
                        if (zzaa > 0) {
                            break;
                        }
                        j = 0;
                        break;
                    case 40:
                        zzaa = zzex.zzaa((List) unsafe.getObject(t, j3));
                        if (zzaa > 0) {
                            break;
                        }
                        j = 0;
                        break;
                    case 41:
                        zzaa = zzex.zzz((List) unsafe.getObject(t, j3));
                        if (zzaa > 0) {
                            break;
                        }
                        j = 0;
                        break;
                    case 42:
                        zzaa = zzex.zzab((List) unsafe.getObject(t, j3));
                        if (zzaa > 0) {
                            break;
                        }
                        j = 0;
                        break;
                    case 43:
                        zzaa = zzex.zzx((List) unsafe.getObject(t, j3));
                        if (zzaa > 0) {
                            break;
                        }
                        j = 0;
                        break;
                    case 44:
                        zzaa = zzex.zzv((List) unsafe.getObject(t, j3));
                        if (zzaa > 0) {
                            break;
                        }
                        j = 0;
                        break;
                    case 45:
                        zzaa = zzex.zzz((List) unsafe.getObject(t, j3));
                        if (zzaa > 0) {
                            break;
                        }
                        j = 0;
                        break;
                    case 46:
                        zzaa = zzex.zzaa((List) unsafe.getObject(t, j3));
                        if (zzaa > 0) {
                            break;
                        }
                        j = 0;
                        break;
                    case 47:
                        zzaa = zzex.zzy((List) unsafe.getObject(t, j3));
                        if (zzaa > 0) {
                            break;
                        }
                        j = 0;
                        break;
                    case 48:
                        zzaa = zzex.zzu((List) unsafe.getObject(t, j3));
                        if (zzaa > 0) {
                            break;
                        }
                        j = 0;
                        break;
                    case 49:
                        zzw = zzex.zzd(i11, (List) unsafe.getObject(t, j3), zzan(i7));
                        i8 += zzw;
                        j = 0;
                        break;
                    case 50:
                        zzw = this.zzua.zzb(i11, unsafe.getObject(t, j3), zzao(i7));
                        i8 += zzw;
                        j = 0;
                        break;
                    case 51:
                        if (zza((zzel<T>) t, i11, i7)) {
                            zzw = zzci.zzb(i11, 0.0d);
                            i8 += zzw;
                        }
                        j = 0;
                        break;
                    case 52:
                        if (zza((zzel<T>) t, i11, i7)) {
                            zzaa2 = zzci.zzb(i11, 0.0f);
                            i8 += zzaa2;
                        }
                        j = 0;
                        break;
                    case 53:
                        if (zza((zzel<T>) t, i11, i7)) {
                            zzw = zzci.zzd(i11, zzi(t, j3));
                            i8 += zzw;
                        }
                        j = 0;
                        break;
                    case 54:
                        if (zza((zzel<T>) t, i11, i7)) {
                            zzw = zzci.zze(i11, zzi(t, j3));
                            i8 += zzw;
                        }
                        j = 0;
                        break;
                    case 55:
                        if (zza((zzel<T>) t, i11, i7)) {
                            zzw = zzci.zzg(i11, zzh(t, j3));
                            i8 += zzw;
                        }
                        j = 0;
                        break;
                    case 56:
                        if (zza((zzel<T>) t, i11, i7)) {
                            zzw = zzci.zzg(i11, 0L);
                            i8 += zzw;
                        }
                        j = 0;
                        break;
                    case 57:
                        if (zza((zzel<T>) t, i11, i7)) {
                            zzaa2 = zzci.zzj(i11, 0);
                            i8 += zzaa2;
                        }
                        j = 0;
                        break;
                    case 58:
                        break;
                    case 59:
                        if (zza((zzel<T>) t, i11, i7)) {
                            object = unsafe.getObject(t, j3);
                            break;
                        }
                        j = 0;
                        break;
                    case 60:
                        break;
                    case 61:
                        break;
                    case 62:
                        if (zza((zzel<T>) t, i11, i7)) {
                            i3 = zzh(t, j3);
                            zzw = zzci.zzh(i11, i3);
                            i8 += zzw;
                        }
                        j = 0;
                        break;
                    case 63:
                        if (zza((zzel<T>) t, i11, i7)) {
                            i4 = zzh(t, j3);
                            zzw = zzci.zzl(i11, i4);
                            i8 += zzw;
                        }
                        j = 0;
                        break;
                    case 64:
                        break;
                    case 65:
                        break;
                    case 66:
                        if (zza((zzel<T>) t, i11, i7)) {
                            i5 = zzh(t, j3);
                            zzw = zzci.zzi(i11, i5);
                            i8 += zzw;
                        }
                        j = 0;
                        break;
                    case 67:
                        if (zza((zzel<T>) t, i11, i7)) {
                            j2 = zzi(t, j3);
                            zzw = zzci.zzf(i11, j2);
                            i8 += zzw;
                        }
                        j = 0;
                        break;
                    case 68:
                        break;
                    default:
                        j = 0;
                        break;
                }
                i7 += 3;
            }
            int zza = i8 + zza(this.zzty, t);
            return this.zztp ? zza + this.zztz.zzc(t).zzdq() : zza;
        }
        Unsafe unsafe2 = zztj;
        int i14 = 0;
        int i15 = 0;
        while (i14 < this.zztk.length) {
            int zzaq2 = zzaq(i14);
            int i16 = (zzaq2 & i6) >>> 20;
            int i17 = this.zztk[i14];
            long j4 = zzaq2 & 1048575;
            int i18 = (i16 < zzcv.DOUBLE_LIST_PACKED.id() || i16 > zzcv.SINT64_LIST_PACKED.id()) ? 0 : this.zztk[i14 + 2] & 1048575;
            switch (i16) {
                case 0:
                    if (!zza((zzel<T>) t, i14)) {
                        break;
                    }
                    zzw2 = zzci.zzb(i17, 0.0d);
                    i15 += zzw2;
                    break;
                case 1:
                    if (!zza((zzel<T>) t, i14)) {
                        break;
                    }
                    zzw2 = zzci.zzb(i17, 0.0f);
                    i15 += zzw2;
                    break;
                case 2:
                    if (!zza((zzel<T>) t, i14)) {
                        break;
                    } else {
                        zzl = zzfv.zzl(t, j4);
                        zzw2 = zzci.zzd(i17, zzl);
                        i15 += zzw2;
                        break;
                    }
                case 3:
                    if (!zza((zzel<T>) t, i14)) {
                        break;
                    } else {
                        zzl2 = zzfv.zzl(t, j4);
                        zzw2 = zzci.zze(i17, zzl2);
                        i15 += zzw2;
                        break;
                    }
                case 4:
                    if (!zza((zzel<T>) t, i14)) {
                        break;
                    } else {
                        zzk = zzfv.zzk(t, j4);
                        zzw2 = zzci.zzg(i17, zzk);
                        i15 += zzw2;
                        break;
                    }
                case 5:
                    if (!zza((zzel<T>) t, i14)) {
                        break;
                    }
                    zzw2 = zzci.zzg(i17, 0L);
                    i15 += zzw2;
                    break;
                case 6:
                    if (!zza((zzel<T>) t, i14)) {
                        break;
                    }
                    zzw2 = zzci.zzj(i17, 0);
                    i15 += zzw2;
                    break;
                case 7:
                    if (!zza((zzel<T>) t, i14)) {
                        break;
                    }
                    zzw2 = zzci.zzc(i17, true);
                    i15 += zzw2;
                    break;
                case 8:
                    if (!zza((zzel<T>) t, i14)) {
                        break;
                    } else {
                        zzp = zzfv.zzp(t, j4);
                        break;
                    }
                case 9:
                    if (!zza((zzel<T>) t, i14)) {
                        break;
                    }
                    zzw2 = zzex.zzc(i17, zzfv.zzp(t, j4), zzan(i14));
                    i15 += zzw2;
                    break;
                case 10:
                    if (!zza((zzel<T>) t, i14)) {
                        break;
                    }
                    zzp = zzfv.zzp(t, j4);
                    zzw2 = zzci.zzc(i17, (zzbu) zzp);
                    i15 += zzw2;
                    break;
                case 11:
                    if (!zza((zzel<T>) t, i14)) {
                        break;
                    } else {
                        zzk2 = zzfv.zzk(t, j4);
                        zzw2 = zzci.zzh(i17, zzk2);
                        i15 += zzw2;
                        break;
                    }
                case 12:
                    if (!zza((zzel<T>) t, i14)) {
                        break;
                    } else {
                        zzk3 = zzfv.zzk(t, j4);
                        zzw2 = zzci.zzl(i17, zzk3);
                        i15 += zzw2;
                        break;
                    }
                case 13:
                    if (!zza((zzel<T>) t, i14)) {
                        break;
                    }
                    zzw2 = zzci.zzk(i17, 0);
                    i15 += zzw2;
                    break;
                case 14:
                    if (!zza((zzel<T>) t, i14)) {
                        break;
                    }
                    zzw2 = zzci.zzh(i17, 0L);
                    i15 += zzw2;
                    break;
                case 15:
                    if (!zza((zzel<T>) t, i14)) {
                        break;
                    } else {
                        zzk4 = zzfv.zzk(t, j4);
                        zzw2 = zzci.zzi(i17, zzk4);
                        i15 += zzw2;
                        break;
                    }
                case 16:
                    if (!zza((zzel<T>) t, i14)) {
                        break;
                    } else {
                        zzl3 = zzfv.zzl(t, j4);
                        zzw2 = zzci.zzf(i17, zzl3);
                        i15 += zzw2;
                        break;
                    }
                case 17:
                    if (!zza((zzel<T>) t, i14)) {
                        break;
                    }
                    zzw2 = zzci.zzc(i17, (zzeh) zzfv.zzp(t, j4), zzan(i14));
                    i15 += zzw2;
                    break;
                case 18:
                case 23:
                case 32:
                    zzw2 = zzex.zzw(i17, zze(t, j4), false);
                    i15 += zzw2;
                    break;
                case 19:
                case 24:
                case 31:
                    zzw2 = zzex.zzv(i17, zze(t, j4), false);
                    i15 += zzw2;
                    break;
                case 20:
                    zzw2 = zzex.zzo(i17, zze(t, j4), false);
                    i15 += zzw2;
                    break;
                case 21:
                    zzw2 = zzex.zzp(i17, zze(t, j4), false);
                    i15 += zzw2;
                    break;
                case 22:
                    zzw2 = zzex.zzs(i17, zze(t, j4), false);
                    i15 += zzw2;
                    break;
                case 25:
                    zzw2 = zzex.zzx(i17, zze(t, j4), false);
                    i15 += zzw2;
                    break;
                case 26:
                    zzw2 = zzex.zzc(i17, zze(t, j4));
                    i15 += zzw2;
                    break;
                case 27:
                    zzw2 = zzex.zzc(i17, (List<?>) zze(t, j4), zzan(i14));
                    i15 += zzw2;
                    break;
                case 28:
                    zzw2 = zzex.zzd(i17, (List<zzbu>) zze(t, j4));
                    i15 += zzw2;
                    break;
                case 29:
                    zzw2 = zzex.zzt(i17, zze(t, j4), false);
                    i15 += zzw2;
                    break;
                case 30:
                    zzw2 = zzex.zzr(i17, zze(t, j4), false);
                    i15 += zzw2;
                    break;
                case 33:
                    zzw2 = zzex.zzu(i17, zze(t, j4), false);
                    i15 += zzw2;
                    break;
                case 34:
                    zzw2 = zzex.zzq(i17, zze(t, j4), false);
                    i15 += zzw2;
                    break;
                case 35:
                    zzaa3 = zzex.zzaa((List) unsafe2.getObject(t, j4));
                    if (zzaa3 > 0) {
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzaa3 = zzex.zzz((List) unsafe2.getObject(t, j4));
                    if (zzaa3 > 0) {
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzaa3 = zzex.zzs((List) unsafe2.getObject(t, j4));
                    if (zzaa3 > 0) {
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzaa3 = zzex.zzt((List) unsafe2.getObject(t, j4));
                    if (zzaa3 > 0) {
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzaa3 = zzex.zzw((List) unsafe2.getObject(t, j4));
                    if (zzaa3 > 0) {
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzaa3 = zzex.zzaa((List) unsafe2.getObject(t, j4));
                    if (zzaa3 > 0) {
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzaa3 = zzex.zzz((List) unsafe2.getObject(t, j4));
                    if (zzaa3 > 0) {
                        break;
                    } else {
                        break;
                    }
                case 42:
                    zzaa3 = zzex.zzab((List) unsafe2.getObject(t, j4));
                    if (zzaa3 > 0) {
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzaa3 = zzex.zzx((List) unsafe2.getObject(t, j4));
                    if (zzaa3 > 0) {
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzaa3 = zzex.zzv((List) unsafe2.getObject(t, j4));
                    if (zzaa3 > 0) {
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzaa3 = zzex.zzz((List) unsafe2.getObject(t, j4));
                    if (zzaa3 > 0) {
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzaa3 = zzex.zzaa((List) unsafe2.getObject(t, j4));
                    if (zzaa3 > 0) {
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzaa3 = zzex.zzy((List) unsafe2.getObject(t, j4));
                    if (zzaa3 > 0) {
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzaa3 = zzex.zzu((List) unsafe2.getObject(t, j4));
                    if (zzaa3 > 0) {
                        break;
                    } else {
                        break;
                    }
                case 49:
                    zzw2 = zzex.zzd(i17, zze(t, j4), zzan(i14));
                    i15 += zzw2;
                    break;
                case 50:
                    zzw2 = this.zzua.zzb(i17, zzfv.zzp(t, j4), zzao(i14));
                    i15 += zzw2;
                    break;
                case 51:
                    if (!zza((zzel<T>) t, i17, i14)) {
                        break;
                    }
                    zzw2 = zzci.zzb(i17, 0.0d);
                    i15 += zzw2;
                    break;
                case 52:
                    if (!zza((zzel<T>) t, i17, i14)) {
                        break;
                    }
                    zzw2 = zzci.zzb(i17, 0.0f);
                    i15 += zzw2;
                    break;
                case 53:
                    if (!zza((zzel<T>) t, i17, i14)) {
                        break;
                    } else {
                        zzl = zzi(t, j4);
                        zzw2 = zzci.zzd(i17, zzl);
                        i15 += zzw2;
                        break;
                    }
                case 54:
                    if (!zza((zzel<T>) t, i17, i14)) {
                        break;
                    } else {
                        zzl2 = zzi(t, j4);
                        zzw2 = zzci.zze(i17, zzl2);
                        i15 += zzw2;
                        break;
                    }
                case 55:
                    if (!zza((zzel<T>) t, i17, i14)) {
                        break;
                    } else {
                        zzk = zzh(t, j4);
                        zzw2 = zzci.zzg(i17, zzk);
                        i15 += zzw2;
                        break;
                    }
                case 56:
                    if (!zza((zzel<T>) t, i17, i14)) {
                        break;
                    }
                    zzw2 = zzci.zzg(i17, 0L);
                    i15 += zzw2;
                    break;
                case 57:
                    if (!zza((zzel<T>) t, i17, i14)) {
                        break;
                    }
                    zzw2 = zzci.zzj(i17, 0);
                    i15 += zzw2;
                    break;
                case 58:
                    if (!zza((zzel<T>) t, i17, i14)) {
                        break;
                    }
                    zzw2 = zzci.zzc(i17, true);
                    i15 += zzw2;
                    break;
                case 59:
                    if (!zza((zzel<T>) t, i17, i14)) {
                        break;
                    } else {
                        zzp = zzfv.zzp(t, j4);
                        break;
                    }
                case 60:
                    if (!zza((zzel<T>) t, i17, i14)) {
                        break;
                    }
                    zzw2 = zzex.zzc(i17, zzfv.zzp(t, j4), zzan(i14));
                    i15 += zzw2;
                    break;
                case 61:
                    if (!zza((zzel<T>) t, i17, i14)) {
                        break;
                    }
                    zzp = zzfv.zzp(t, j4);
                    zzw2 = zzci.zzc(i17, (zzbu) zzp);
                    i15 += zzw2;
                    break;
                case 62:
                    if (!zza((zzel<T>) t, i17, i14)) {
                        break;
                    } else {
                        zzk2 = zzh(t, j4);
                        zzw2 = zzci.zzh(i17, zzk2);
                        i15 += zzw2;
                        break;
                    }
                case 63:
                    if (!zza((zzel<T>) t, i17, i14)) {
                        break;
                    } else {
                        zzk3 = zzh(t, j4);
                        zzw2 = zzci.zzl(i17, zzk3);
                        i15 += zzw2;
                        break;
                    }
                case 64:
                    if (!zza((zzel<T>) t, i17, i14)) {
                        break;
                    }
                    zzw2 = zzci.zzk(i17, 0);
                    i15 += zzw2;
                    break;
                case 65:
                    if (!zza((zzel<T>) t, i17, i14)) {
                        break;
                    }
                    zzw2 = zzci.zzh(i17, 0L);
                    i15 += zzw2;
                    break;
                case 66:
                    if (!zza((zzel<T>) t, i17, i14)) {
                        break;
                    } else {
                        zzk4 = zzh(t, j4);
                        zzw2 = zzci.zzi(i17, zzk4);
                        i15 += zzw2;
                        break;
                    }
                case 67:
                    if (!zza((zzel<T>) t, i17, i14)) {
                        break;
                    } else {
                        zzl3 = zzi(t, j4);
                        zzw2 = zzci.zzf(i17, zzl3);
                        i15 += zzw2;
                        break;
                    }
                case 68:
                    if (!zza((zzel<T>) t, i17, i14)) {
                        break;
                    }
                    zzw2 = zzci.zzc(i17, (zzeh) zzfv.zzp(t, j4), zzan(i14));
                    i15 += zzw2;
                    break;
            }
            i14 += 3;
            i6 = 267386880;
        }
        return i15 + zza(this.zzty, t);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0104, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [com.google.android.gms.internal.firebase_auth.zzev] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.android.gms.internal.firebase_auth.zzev] */
    @Override // com.google.android.gms.internal.firebase_auth.zzev
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzp(T t) {
        int i;
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        while (true) {
            boolean z = true;
            if (i2 >= this.zztu) {
                return !this.zztp || this.zztz.zzc(t).isInitialized();
            }
            int i5 = this.zztt[i2];
            int i6 = this.zztk[i5];
            int zzaq = zzaq(i5);
            if (this.zztr) {
                i = 0;
            } else {
                int i7 = this.zztk[i5 + 2];
                int i8 = i7 & 1048575;
                i = 1 << (i7 >>> 20);
                if (i8 != i3) {
                    i4 = zztj.getInt(t, i8);
                    i3 = i8;
                }
            }
            if (((268435456 & zzaq) != 0) && !zza((zzel<T>) t, i5, i4, i)) {
                return false;
            }
            int i9 = (267386880 & zzaq) >>> 20;
            if (i9 != 9 && i9 != 17) {
                if (i9 != 27) {
                    if (i9 != 60 && i9 != 68) {
                        switch (i9) {
                            case 50:
                                Map<?, ?> zzj = this.zzua.zzj(zzfv.zzp(t, zzaq & 1048575));
                                if (!zzj.isEmpty()) {
                                    if (this.zzua.zzn(zzao(i5)).zztd.zzgj() == zzgi.MESSAGE) {
                                        ?? r4 = 0;
                                        Iterator<?> it = zzj.values().iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                Object next = it.next();
                                                r4 = r4;
                                                if (r4 == 0) {
                                                    r4 = zzes.zzfg().zzf(next.getClass());
                                                }
                                                if (!r4.zzp(next)) {
                                                    z = false;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (!z) {
                                    return false;
                                }
                                break;
                        }
                    } else if (zza((zzel<T>) t, i6, i5) && !zza(t, zzaq, zzan(i5))) {
                        return false;
                    }
                }
                List list = (List) zzfv.zzp(t, zzaq & 1048575);
                if (!list.isEmpty()) {
                    ?? zzan = zzan(i5);
                    int i10 = 0;
                    while (true) {
                        if (i10 < list.size()) {
                            if (zzan.zzp(list.get(i10))) {
                                i10++;
                            } else {
                                z = false;
                            }
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (zza((zzel<T>) t, i5, i4, i) && !zza(t, zzaq, zzan(i5))) {
                return false;
            }
            i2++;
        }
    }
}
