package com.google.android.gms.internal.play_billing;

import androidx.core.text.HtmlCompat;
import androidx.core.view.MotionEventCompat;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.getcapacitor.Bridge;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import sun.misc.Unsafe;

/* compiled from: com.android.billingclient:billing@@8.3.0 */
/* loaded from: classes2.dex */
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
        zzir zzirVar2 = zzir.DOUBLE;
        switch (zzirVar) {
            case DOUBLE:
                int i3 = i + 8;
                zzejVar.zzc = Double.valueOf(Double.longBitsToDouble(zzek.zzp(bArr, i)));
                return i3;
            case FLOAT:
                int i4 = i + 4;
                zzejVar.zzc = Float.valueOf(Float.intBitsToFloat(zzek.zzb(bArr, i)));
                return i4;
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
                int i5 = i + 8;
                zzejVar.zzc = Long.valueOf(zzek.zzp(bArr, i));
                return i5;
            case FIXED32:
            case SFIXED32:
                int i6 = i + 4;
                zzejVar.zzc = Integer.valueOf(zzek.zzb(bArr, i));
                return i6;
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

    /* JADX WARN: Removed duplicated region for block: B:102:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0270  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzhe zzl(Class cls, zzgy zzgyVar, zzhg zzhgVar, zzgk zzgkVar, zzib zzibVar, zzfi zzfiVar, zzgw zzgwVar) {
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
        int i17;
        int i18;
        int i19;
        int i20;
        String str;
        int objectFieldOffset;
        char c;
        int i21;
        int i22;
        int i23;
        int i24;
        Field zzz;
        char charAt10;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        Object obj;
        Field zzz2;
        Object obj2;
        Field zzz3;
        int i30;
        char charAt11;
        int i31;
        char charAt12;
        int i32;
        char charAt13;
        int i33;
        char charAt14;
        if (!(zzgyVar instanceof zzhk)) {
            throw null;
        }
        zzhk zzhkVar = (zzhk) zzgyVar;
        String zzd = zzhkVar.zzd();
        int length = zzd.length();
        char c2 = 55296;
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
        int charAt15 = zzd.charAt(i);
        if (charAt15 >= 55296) {
            int i36 = charAt15 & 8191;
            int i37 = 13;
            while (true) {
                i33 = i35 + 1;
                charAt14 = zzd.charAt(i35);
                if (charAt14 < 55296) {
                    break;
                }
                i36 |= (charAt14 & 8191) << i37;
                i37 += 13;
                i35 = i33;
            }
            charAt15 = i36 | (charAt14 << i37);
            i35 = i33;
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
            int i38 = i35 + 1;
            int charAt16 = zzd.charAt(i35);
            if (charAt16 >= 55296) {
                int i39 = charAt16 & 8191;
                int i40 = 13;
                while (true) {
                    i15 = i38 + 1;
                    charAt9 = zzd.charAt(i38);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i39 |= (charAt9 & 8191) << i40;
                    i40 += 13;
                    i38 = i15;
                }
                charAt16 = i39 | (charAt9 << i40);
                i38 = i15;
            }
            int i41 = i38 + 1;
            int charAt17 = zzd.charAt(i38);
            if (charAt17 >= 55296) {
                int i42 = charAt17 & 8191;
                int i43 = 13;
                while (true) {
                    i14 = i41 + 1;
                    charAt8 = zzd.charAt(i41);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i42 |= (charAt8 & 8191) << i43;
                    i43 += 13;
                    i41 = i14;
                }
                charAt17 = i42 | (charAt8 << i43);
                i41 = i14;
            }
            int i44 = i41 + 1;
            int charAt18 = zzd.charAt(i41);
            if (charAt18 >= 55296) {
                int i45 = charAt18 & 8191;
                int i46 = 13;
                while (true) {
                    i13 = i44 + 1;
                    charAt7 = zzd.charAt(i44);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i45 |= (charAt7 & 8191) << i46;
                    i46 += 13;
                    i44 = i13;
                }
                charAt18 = i45 | (charAt7 << i46);
                i44 = i13;
            }
            int i47 = i44 + 1;
            int charAt19 = zzd.charAt(i44);
            if (charAt19 >= 55296) {
                int i48 = charAt19 & 8191;
                int i49 = 13;
                while (true) {
                    i12 = i47 + 1;
                    charAt6 = zzd.charAt(i47);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i48 |= (charAt6 & 8191) << i49;
                    i49 += 13;
                    i47 = i12;
                }
                charAt19 = i48 | (charAt6 << i49);
                i47 = i12;
            }
            int i50 = i47 + 1;
            charAt = zzd.charAt(i47);
            if (charAt >= 55296) {
                int i51 = charAt & 8191;
                int i52 = 13;
                while (true) {
                    i11 = i50 + 1;
                    charAt5 = zzd.charAt(i50);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i51 |= (charAt5 & 8191) << i52;
                    i52 += 13;
                    i50 = i11;
                }
                charAt = i51 | (charAt5 << i52);
                i50 = i11;
            }
            int i53 = i50 + 1;
            int charAt20 = zzd.charAt(i50);
            if (charAt20 >= 55296) {
                int i54 = charAt20 & 8191;
                int i55 = 13;
                while (true) {
                    i10 = i53 + 1;
                    charAt4 = zzd.charAt(i53);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i54 |= (charAt4 & 8191) << i55;
                    i55 += 13;
                    i53 = i10;
                }
                charAt20 = i54 | (charAt4 << i55);
                i53 = i10;
            }
            int i56 = i53 + 1;
            int charAt21 = zzd.charAt(i53);
            if (charAt21 >= 55296) {
                int i57 = charAt21 & 8191;
                int i58 = 13;
                while (true) {
                    i9 = i56 + 1;
                    charAt3 = zzd.charAt(i56);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i57 |= (charAt3 & 8191) << i58;
                    i58 += 13;
                    i56 = i9;
                }
                charAt21 = i57 | (charAt3 << i58);
                i56 = i9;
            }
            int i59 = i56 + 1;
            int charAt22 = zzd.charAt(i56);
            if (charAt22 >= 55296) {
                int i60 = charAt22 & 8191;
                int i61 = 13;
                while (true) {
                    i8 = i59 + 1;
                    charAt2 = zzd.charAt(i59);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i60 |= (charAt2 & 8191) << i61;
                    i61 += 13;
                    i59 = i8;
                }
                charAt22 = i60 | (charAt2 << i61);
                i59 = i8;
            }
            int i62 = charAt16 + charAt16 + charAt17;
            int[] iArr2 = new int[charAt22 + charAt20 + charAt21];
            int i63 = charAt20;
            i2 = charAt18;
            i3 = i63;
            i4 = charAt19;
            i5 = charAt22;
            i6 = i62;
            iArr = iArr2;
            i7 = charAt16;
            i35 = i59;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzhkVar.zze();
        Class<?> cls2 = zzhkVar.zza().getClass();
        int i64 = i5 + i3;
        int i65 = charAt + charAt;
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr = new Object[i65];
        int i66 = i5;
        int i67 = i64;
        int i68 = 0;
        int i69 = 0;
        while (i35 < length) {
            int i70 = i35 + 1;
            int charAt23 = zzd.charAt(i35);
            if (charAt23 >= c2) {
                int i71 = charAt23 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i32 = i72 + 1;
                    charAt13 = zzd.charAt(i72);
                    if (charAt13 < c2) {
                        break;
                    }
                    i71 |= (charAt13 & 8191) << i73;
                    i73 += 13;
                    i72 = i32;
                }
                charAt23 = i71 | (charAt13 << i73);
                i16 = i32;
            } else {
                i16 = i70;
            }
            int i74 = i16 + 1;
            int charAt24 = zzd.charAt(i16);
            if (charAt24 >= c2) {
                int i75 = charAt24 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i31 = i76 + 1;
                    charAt12 = zzd.charAt(i76);
                    if (charAt12 < c2) {
                        break;
                    }
                    i75 |= (charAt12 & 8191) << i77;
                    i77 += 13;
                    i76 = i31;
                }
                charAt24 = i75 | (charAt12 << i77);
                i17 = i31;
            } else {
                i17 = i74;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i68] = i69;
                i68++;
            }
            int i78 = charAt24 & 255;
            zzhk zzhkVar2 = zzhkVar;
            int i79 = charAt24 & 2048;
            if (i78 >= 51) {
                int i80 = i17 + 1;
                int charAt25 = zzd.charAt(i17);
                char c3 = 55296;
                if (charAt25 >= 55296) {
                    int i81 = charAt25 & 8191;
                    int i82 = i80;
                    int i83 = 13;
                    while (true) {
                        i30 = i82 + 1;
                        charAt11 = zzd.charAt(i82);
                        if (charAt11 < c3) {
                            break;
                        }
                        i81 |= (charAt11 & 8191) << i83;
                        i83 += 13;
                        i82 = i30;
                        c3 = 55296;
                    }
                    charAt25 = i81 | (charAt11 << i83);
                    i27 = i30;
                } else {
                    i27 = i80;
                }
                int i84 = i27;
                int i85 = i78 - 51;
                i18 = length;
                if (i85 == 9 || i85 == 17) {
                    i28 = i6 + 1;
                    int i86 = i69 / 3;
                    objArr[i86 + i86 + 1] = zze[i6];
                } else {
                    if (i85 == 12) {
                        if (zzhkVar2.zzc() == 1 || i79 != 0) {
                            i28 = i6 + 1;
                            int i87 = i69 / 3;
                            objArr[i87 + i87 + 1] = zze[i6];
                        } else {
                            i29 = 0;
                            int i88 = charAt25 + charAt25;
                            obj = zze[i88];
                            int i89 = i29;
                            if (obj instanceof Field) {
                                zzz2 = (Field) obj;
                            } else {
                                zzz2 = zzz(cls2, (String) obj);
                                zze[i88] = zzz2;
                            }
                            int i90 = i7;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzz2);
                            int i91 = i88 + 1;
                            obj2 = zze[i91];
                            i19 = i90;
                            if (obj2 instanceof Field) {
                                zzz3 = (Field) obj2;
                            } else {
                                zzz3 = zzz(cls2, (String) obj2);
                                zze[i91] = zzz3;
                            }
                            i21 = (int) unsafe.objectFieldOffset(zzz3);
                            str = zzd;
                            i23 = i89;
                            i17 = i84;
                            i22 = 0;
                            c = 55296;
                        }
                    }
                    i29 = i79;
                    int i882 = charAt25 + charAt25;
                    obj = zze[i882];
                    int i892 = i29;
                    if (obj instanceof Field) {
                    }
                    int i902 = i7;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzz2);
                    int i912 = i882 + 1;
                    obj2 = zze[i912];
                    i19 = i902;
                    if (obj2 instanceof Field) {
                    }
                    i21 = (int) unsafe.objectFieldOffset(zzz3);
                    str = zzd;
                    i23 = i892;
                    i17 = i84;
                    i22 = 0;
                    c = 55296;
                }
                i6 = i28;
                i29 = i79;
                int i8822 = charAt25 + charAt25;
                obj = zze[i8822];
                int i8922 = i29;
                if (obj instanceof Field) {
                }
                int i9022 = i7;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzz2);
                int i9122 = i8822 + 1;
                obj2 = zze[i9122];
                i19 = i9022;
                if (obj2 instanceof Field) {
                }
                i21 = (int) unsafe.objectFieldOffset(zzz3);
                str = zzd;
                i23 = i8922;
                i17 = i84;
                i22 = 0;
                c = 55296;
            } else {
                i18 = length;
                i19 = i7;
                int i92 = i6 + 1;
                Field zzz4 = zzz(cls2, (String) zze[i6]);
                if (i78 == 9 || i78 == 17) {
                    i20 = i92;
                    int i93 = i69 / 3;
                    objArr[i93 + i93 + 1] = zzz4.getType();
                } else {
                    if (i78 == 27) {
                        i25 = i92;
                        i26 = 1;
                        i6 += 2;
                    } else if (i78 == 49) {
                        i6 += 2;
                        i25 = i92;
                        i26 = 1;
                    } else if (i78 == 12 || i78 == 30 || i78 == 44) {
                        if (zzhkVar2.zzc() == 1 || i79 != 0) {
                            i6 += 2;
                            int i94 = i69 / 3;
                            objArr[i94 + i94 + 1] = zze[i92];
                            str = zzd;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
                            if ((charAt24 & 4096) != 0 || i78 > 17) {
                                c = 55296;
                                i21 = 1048575;
                                i22 = 0;
                            } else {
                                int i95 = i17 + 1;
                                int charAt26 = str.charAt(i17);
                                if (charAt26 >= 55296) {
                                    int i96 = charAt26 & 8191;
                                    int i97 = 13;
                                    while (true) {
                                        i24 = i95 + 1;
                                        charAt10 = str.charAt(i95);
                                        if (charAt10 < 55296) {
                                            break;
                                        }
                                        i96 |= (charAt10 & 8191) << i97;
                                        i97 += 13;
                                        i95 = i24;
                                    }
                                    charAt26 = i96 | (charAt10 << i97);
                                } else {
                                    i24 = i95;
                                }
                                int i98 = i19 + i19 + (charAt26 / 32);
                                Object obj3 = zze[i98];
                                if (obj3 instanceof Field) {
                                    zzz = (Field) obj3;
                                } else {
                                    zzz = zzz(cls2, (String) obj3);
                                    zze[i98] = zzz;
                                }
                                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzz);
                                i22 = charAt26 % 32;
                                i17 = i24;
                                c = 55296;
                                i21 = objectFieldOffset2;
                            }
                            if (i78 >= 18 && i78 <= 49) {
                                iArr[i67] = objectFieldOffset;
                                i67++;
                            }
                            i23 = i79;
                        } else {
                            str = zzd;
                            i6 = i92;
                            i79 = 0;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
                            if ((charAt24 & 4096) != 0) {
                            }
                            c = 55296;
                            i21 = 1048575;
                            i22 = 0;
                            if (i78 >= 18) {
                                iArr[i67] = objectFieldOffset;
                                i67++;
                            }
                            i23 = i79;
                        }
                    } else if (i78 == 50) {
                        int i99 = i6 + 2;
                        int i100 = i66 + 1;
                        iArr[i66] = i69;
                        int i101 = i69 / 3;
                        int i102 = i101 + i101;
                        objArr[i102] = zze[i92];
                        if (i79 != 0) {
                            objArr[i102 + 1] = zze[i99];
                            i6 += 3;
                            str = zzd;
                            i66 = i100;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
                            if ((charAt24 & 4096) != 0) {
                            }
                            c = 55296;
                            i21 = 1048575;
                            i22 = 0;
                            if (i78 >= 18) {
                            }
                            i23 = i79;
                        } else {
                            i6 = i99;
                            i66 = i100;
                            i79 = 0;
                            str = zzd;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
                            if ((charAt24 & 4096) != 0) {
                            }
                            c = 55296;
                            i21 = 1048575;
                            i22 = 0;
                            if (i78 >= 18) {
                            }
                            i23 = i79;
                        }
                    } else {
                        i20 = i92;
                    }
                    int i103 = i69 / 3;
                    objArr[i103 + i103 + i26] = zze[i25];
                    str = zzd;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
                    if ((charAt24 & 4096) != 0) {
                    }
                    c = 55296;
                    i21 = 1048575;
                    i22 = 0;
                    if (i78 >= 18) {
                    }
                    i23 = i79;
                }
                str = zzd;
                i6 = i20;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
                if ((charAt24 & 4096) != 0) {
                }
                c = 55296;
                i21 = 1048575;
                i22 = 0;
                if (i78 >= 18) {
                }
                i23 = i79;
            }
            int i104 = i69 + 1;
            iArr3[i69] = charAt23;
            int i105 = i69 + 2;
            iArr3[i104] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | (i23 != 0 ? Integer.MIN_VALUE : 0) | (i78 << 20) | objectFieldOffset;
            i69 += 3;
            iArr3[i105] = (i22 << 20) | i21;
            i35 = i17;
            zzd = str;
            c2 = c;
            zzhkVar = zzhkVar2;
            length = i18;
            i7 = i19;
        }
        return new zzhe(iArr3, objArr, i2, i4, zzhkVar.zza(), false, iArr, i5, i64, zzhgVar, zzgkVar, zzibVar, zzfiVar, zzgwVar);
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

    @Override // com.google.android.gms.internal.play_billing.zzhl
    public final int zza(Object obj) {
        int i;
        int zzy;
        int zzy2;
        int zzz;
        int zzy3;
        int zzy4;
        int zzy5;
        int zzb2;
        int zzy6;
        int zzi;
        int zzh;
        int size;
        int zzm;
        int zzy7;
        int zzb3;
        int zzy8;
        int zzb4;
        int zzy9;
        int zzy10;
        int zzi2;
        int zzy11;
        int zzy12;
        int i2;
        int zzf;
        int zzy13;
        int zzy14;
        int i3;
        int zzy15;
        int zzy16;
        int zzy17;
        int zzb5;
        int zzy18;
        zzhe<T> zzheVar = this;
        Object obj2 = obj;
        Unsafe unsafe = zzb;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1048575;
        while (true) {
            int[] iArr = zzheVar.zzc;
            if (i4 >= iArr.length) {
                int zza2 = i6 + ((zzfu) obj).zzc.zza();
                if (!zzheVar.zzh) {
                    return zza2;
                }
                zzht zzhtVar = ((zzfr) obj).zzb.zza;
                int zzc = zzhtVar.zzc();
                int i8 = 0;
                for (int i9 = 0; i9 < zzc; i9++) {
                    Map.Entry zzg = zzhtVar.zzg(i9);
                    i8 += zzfm.zzc((zzfl) ((zzhp) zzg).zza(), zzg.getValue());
                }
                for (Map.Entry entry : zzhtVar.zzd()) {
                    i8 += zzfm.zzc((zzfl) entry.getKey(), entry.getValue());
                }
                return zza2 + i8;
            }
            int zzs = zzheVar.zzs(i4);
            int zzr = zzr(zzs);
            int i10 = iArr[i4];
            int i11 = iArr[i4 + 2];
            int i12 = i11 & 1048575;
            if (zzr <= 17) {
                if (i12 != i7) {
                    i5 = i12 == 1048575 ? 0 : unsafe.getInt(obj2, i12);
                    i7 = i12;
                }
                i = 1 << (i11 >>> 20);
            } else {
                i = 0;
            }
            int i13 = zzs & 1048575;
            if (zzr >= zzfn.DOUBLE_LIST_PACKED.zza()) {
                zzfn.SINT64_LIST_PACKED.zza();
            }
            long j = i13;
            switch (zzr) {
                case 0:
                    if (zzheVar.zzJ(obj2, i4, i7, i5, i)) {
                        i6 += zzfc.zzy(i10 << 3) + 8;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzheVar.zzJ(obj2, i4, i7, i5, i)) {
                        zzy = zzfc.zzy(i10 << 3);
                        zzy4 = zzy + 4;
                        i6 += zzy4;
                    }
                    zzheVar = this;
                    break;
                case 2:
                    if (zzheVar.zzJ(obj2, i4, i7, i5, i)) {
                        long j2 = unsafe.getLong(obj2, j);
                        zzy2 = zzfc.zzy(i10 << 3);
                        zzz = zzfc.zzz(j2);
                        zzy4 = zzy2 + zzz;
                        i6 += zzy4;
                    }
                    zzheVar = this;
                    break;
                case 3:
                    if (zzheVar.zzJ(obj2, i4, i7, i5, i)) {
                        long j3 = unsafe.getLong(obj2, j);
                        zzy2 = zzfc.zzy(i10 << 3);
                        zzz = zzfc.zzz(j3);
                        zzy4 = zzy2 + zzz;
                        i6 += zzy4;
                    }
                    zzheVar = this;
                    break;
                case 4:
                    if (zzheVar.zzJ(obj2, i4, i7, i5, i)) {
                        long j4 = unsafe.getInt(obj2, j);
                        zzy2 = zzfc.zzy(i10 << 3);
                        zzz = zzfc.zzz(j4);
                        zzy4 = zzy2 + zzz;
                        i6 += zzy4;
                    }
                    zzheVar = this;
                    break;
                case 5:
                    if (zzheVar.zzJ(obj2, i4, i7, i5, i)) {
                        zzy3 = zzfc.zzy(i10 << 3);
                        zzy4 = zzy3 + 8;
                        i6 += zzy4;
                    }
                    zzheVar = this;
                    break;
                case 6:
                    if (zzheVar.zzJ(obj2, i4, i7, i5, i)) {
                        zzy = zzfc.zzy(i10 << 3);
                        zzy4 = zzy + 4;
                        i6 += zzy4;
                    }
                    zzheVar = this;
                    break;
                case 7:
                    if (zzheVar.zzJ(obj2, i4, i7, i5, i)) {
                        zzy4 = zzfc.zzy(i10 << 3) + 1;
                        i6 += zzy4;
                    }
                    zzheVar = this;
                    break;
                case 8:
                    if (zzheVar.zzJ(obj2, i4, i7, i5, i)) {
                        int i14 = i10 << 3;
                        Object object = unsafe.getObject(obj2, j);
                        if (object instanceof zzev) {
                            zzy5 = zzfc.zzy(i14);
                            zzb2 = ((zzev) object).zze();
                            zzy6 = zzfc.zzy(zzb2);
                        } else {
                            zzy5 = zzfc.zzy(i14);
                            zzb2 = zzin.zzb((String) object);
                            zzy6 = zzfc.zzy(zzb2);
                        }
                        zzy4 = zzy5 + zzy6 + zzb2;
                        i6 += zzy4;
                    }
                    zzheVar = this;
                    break;
                case 9:
                    if (zzheVar.zzJ(obj2, i4, i7, i5, i)) {
                        zzi = zzhn.zzi(i10, unsafe.getObject(obj2, j), zzheVar.zzv(i4));
                        i6 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzheVar.zzJ(obj2, i4, i7, i5, i)) {
                        zzev zzevVar = (zzev) unsafe.getObject(obj2, j);
                        zzy5 = zzfc.zzy(i10 << 3);
                        zzb2 = zzevVar.zze();
                        zzy6 = zzfc.zzy(zzb2);
                        zzy4 = zzy5 + zzy6 + zzb2;
                        i6 += zzy4;
                    }
                    zzheVar = this;
                    break;
                case 11:
                    if (zzheVar.zzJ(obj2, i4, i7, i5, i)) {
                        int i15 = unsafe.getInt(obj2, j);
                        zzy2 = zzfc.zzy(i10 << 3);
                        zzz = zzfc.zzy(i15);
                        zzy4 = zzy2 + zzz;
                        i6 += zzy4;
                    }
                    zzheVar = this;
                    break;
                case 12:
                    if (zzheVar.zzJ(obj2, i4, i7, i5, i)) {
                        long j5 = unsafe.getInt(obj2, j);
                        zzy2 = zzfc.zzy(i10 << 3);
                        zzz = zzfc.zzz(j5);
                        zzy4 = zzy2 + zzz;
                        i6 += zzy4;
                    }
                    zzheVar = this;
                    break;
                case 13:
                    if (zzheVar.zzJ(obj2, i4, i7, i5, i)) {
                        zzy = zzfc.zzy(i10 << 3);
                        zzy4 = zzy + 4;
                        i6 += zzy4;
                    }
                    zzheVar = this;
                    break;
                case 14:
                    if (zzheVar.zzJ(obj2, i4, i7, i5, i)) {
                        zzy3 = zzfc.zzy(i10 << 3);
                        zzy4 = zzy3 + 8;
                        i6 += zzy4;
                    }
                    zzheVar = this;
                    break;
                case 15:
                    if (zzheVar.zzJ(obj2, i4, i7, i5, i)) {
                        int i16 = unsafe.getInt(obj2, j);
                        zzy2 = zzfc.zzy(i10 << 3);
                        zzz = zzfc.zzy((i16 >> 31) ^ (i16 + i16));
                        zzy4 = zzy2 + zzz;
                        i6 += zzy4;
                    }
                    zzheVar = this;
                    break;
                case 16:
                    if (zzheVar.zzJ(obj2, i4, i7, i5, i)) {
                        long j6 = unsafe.getLong(obj2, j);
                        zzy2 = zzfc.zzy(i10 << 3);
                        zzz = zzfc.zzz((j6 >> 63) ^ (j6 + j6));
                        zzy4 = zzy2 + zzz;
                        i6 += zzy4;
                    }
                    zzheVar = this;
                    break;
                case 17:
                    if (zzheVar.zzJ(obj2, i4, i7, i5, i)) {
                        zzi = zzhn.zza(i10, (zzhb) unsafe.getObject(obj2, j), zzheVar.zzv(i4));
                        i6 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzi = zzhn.zze(i10, (List) unsafe.getObject(obj2, j), false);
                    i6 += zzi;
                    break;
                case 19:
                    zzi = zzhn.zzc(i10, (List) unsafe.getObject(obj2, j), false);
                    i6 += zzi;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j);
                    int i17 = zzhn.zza;
                    if (list.size() != 0) {
                        zzh = zzhn.zzh(list) + (list.size() * zzfc.zzy(i10 << 3));
                        i6 += zzh;
                        break;
                    }
                    zzh = 0;
                    i6 += zzh;
                case 21:
                    List list2 = (List) unsafe.getObject(obj2, j);
                    int i18 = zzhn.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzm = zzhn.zzm(list2);
                        zzy7 = zzfc.zzy(i10 << 3);
                        i2 = size * zzy7;
                        zzi = zzm + i2;
                        i6 += zzi;
                        break;
                    }
                    zzi = 0;
                    i6 += zzi;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, j);
                    int i19 = zzhn.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzm = zzhn.zzg(list3);
                        zzy7 = zzfc.zzy(i10 << 3);
                        i2 = size * zzy7;
                        zzi = zzm + i2;
                        i6 += zzi;
                        break;
                    }
                    zzi = 0;
                    i6 += zzi;
                case 23:
                    zzi = zzhn.zze(i10, (List) unsafe.getObject(obj2, j), false);
                    i6 += zzi;
                    break;
                case 24:
                    zzi = zzhn.zzc(i10, (List) unsafe.getObject(obj2, j), false);
                    i6 += zzi;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, j);
                    int i20 = zzhn.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        zzi = size2 * (zzfc.zzy(i10 << 3) + 1);
                        i6 += zzi;
                        break;
                    }
                    zzi = 0;
                    i6 += zzi;
                case 26:
                    List list5 = (List) unsafe.getObject(obj2, j);
                    int i21 = zzhn.zza;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        zzh = zzfc.zzy(i10 << 3) * size3;
                        if (list5 instanceof zzgj) {
                            zzgj zzgjVar = (zzgj) list5;
                            for (int i22 = 0; i22 < size3; i22++) {
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
                            for (int i23 = 0; i23 < size3; i23++) {
                                Object obj3 = list5.get(i23);
                                if (obj3 instanceof zzev) {
                                    zzb3 = ((zzev) obj3).zze();
                                    zzy8 = zzfc.zzy(zzb3);
                                } else {
                                    zzb3 = zzin.zzb((String) obj3);
                                    zzy8 = zzfc.zzy(zzb3);
                                }
                                zzh += zzy8 + zzb3;
                            }
                        }
                        i6 += zzh;
                        break;
                    }
                    zzh = 0;
                    i6 += zzh;
                case 27:
                    List list6 = (List) unsafe.getObject(obj2, j);
                    zzhl zzv = zzheVar.zzv(i4);
                    int i24 = zzhn.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        zzy10 = 0;
                    } else {
                        zzy10 = zzfc.zzy(i10 << 3) * size4;
                        for (int i25 = 0; i25 < size4; i25++) {
                            Object obj4 = list6.get(i25);
                            if (obj4 instanceof zzgi) {
                                zzi2 = ((zzgi) obj4).zza();
                                zzy11 = zzfc.zzy(zzi2);
                            } else {
                                zzi2 = ((zzeg) obj4).zzi(zzv);
                                zzy11 = zzfc.zzy(zzi2);
                            }
                            zzy10 += zzy11 + zzi2;
                        }
                    }
                    i6 += zzy10;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, j);
                    int i26 = zzhn.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        zzy12 = 0;
                    } else {
                        zzy12 = size5 * zzfc.zzy(i10 << 3);
                        for (int i27 = 0; i27 < list7.size(); i27++) {
                            int zze = ((zzev) list7.get(i27)).zze();
                            zzy12 += zzfc.zzy(zze) + zze;
                        }
                    }
                    i6 += zzy12;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j);
                    int i28 = zzhn.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzm = zzhn.zzl(list8);
                        zzy7 = zzfc.zzy(i10 << 3);
                        i2 = size * zzy7;
                        zzi = zzm + i2;
                        i6 += zzi;
                        break;
                    }
                    zzi = 0;
                    i6 += zzi;
                case 30:
                    List list9 = (List) unsafe.getObject(obj2, j);
                    int i29 = zzhn.zza;
                    size = list9.size();
                    if (size != 0) {
                        zzm = zzhn.zzb(list9);
                        zzy7 = zzfc.zzy(i10 << 3);
                        i2 = size * zzy7;
                        zzi = zzm + i2;
                        i6 += zzi;
                        break;
                    }
                    zzi = 0;
                    i6 += zzi;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    zzi = zzhn.zzc(i10, (List) unsafe.getObject(obj2, j), false);
                    i6 += zzi;
                    break;
                case 32:
                    zzi = zzhn.zze(i10, (List) unsafe.getObject(obj2, j), false);
                    i6 += zzi;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, j);
                    int i30 = zzhn.zza;
                    size = list10.size();
                    if (size != 0) {
                        zzm = zzhn.zzj(list10);
                        zzy7 = zzfc.zzy(i10 << 3);
                        i2 = size * zzy7;
                        zzi = zzm + i2;
                        i6 += zzi;
                        break;
                    }
                    zzi = 0;
                    i6 += zzi;
                case 34:
                    List list11 = (List) unsafe.getObject(obj2, j);
                    int i31 = zzhn.zza;
                    size = list11.size();
                    if (size != 0) {
                        zzm = zzhn.zzk(list11);
                        zzy7 = zzfc.zzy(i10 << 3);
                        i2 = size * zzy7;
                        zzi = zzm + i2;
                        i6 += zzi;
                        break;
                    }
                    zzi = 0;
                    i6 += zzi;
                case 35:
                    zzf = zzhn.zzf((List) unsafe.getObject(obj2, j));
                    if (zzf > 0) {
                        zzy13 = zzfc.zzy(i10 << 3);
                        zzy14 = zzfc.zzy(zzf);
                        zzy12 = zzy13 + zzy14 + zzf;
                        i6 += zzy12;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzf = zzhn.zzd((List) unsafe.getObject(obj2, j));
                    if (zzf > 0) {
                        zzy13 = zzfc.zzy(i10 << 3);
                        zzy14 = zzfc.zzy(zzf);
                        zzy12 = zzy13 + zzy14 + zzf;
                        i6 += zzy12;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzf = zzhn.zzh((List) unsafe.getObject(obj2, j));
                    if (zzf > 0) {
                        zzy13 = zzfc.zzy(i10 << 3);
                        zzy14 = zzfc.zzy(zzf);
                        zzy12 = zzy13 + zzy14 + zzf;
                        i6 += zzy12;
                        break;
                    } else {
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                    zzf = zzhn.zzm((List) unsafe.getObject(obj2, j));
                    if (zzf > 0) {
                        zzy13 = zzfc.zzy(i10 << 3);
                        zzy14 = zzfc.zzy(zzf);
                        zzy12 = zzy13 + zzy14 + zzf;
                        i6 += zzy12;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzf = zzhn.zzg((List) unsafe.getObject(obj2, j));
                    if (zzf > 0) {
                        zzy13 = zzfc.zzy(i10 << 3);
                        zzy14 = zzfc.zzy(zzf);
                        zzy12 = zzy13 + zzy14 + zzf;
                        i6 += zzy12;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzf = zzhn.zzf((List) unsafe.getObject(obj2, j));
                    if (zzf > 0) {
                        zzy13 = zzfc.zzy(i10 << 3);
                        zzy14 = zzfc.zzy(zzf);
                        zzy12 = zzy13 + zzy14 + zzf;
                        i6 += zzy12;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzf = zzhn.zzd((List) unsafe.getObject(obj2, j));
                    if (zzf > 0) {
                        zzy13 = zzfc.zzy(i10 << 3);
                        zzy14 = zzfc.zzy(zzf);
                        zzy12 = zzy13 + zzy14 + zzf;
                        i6 += zzy12;
                        break;
                    } else {
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                    List list12 = (List) unsafe.getObject(obj2, j);
                    int i32 = zzhn.zza;
                    zzf = list12.size();
                    if (zzf > 0) {
                        zzy13 = zzfc.zzy(i10 << 3);
                        zzy14 = zzfc.zzy(zzf);
                        zzy12 = zzy13 + zzy14 + zzf;
                        i6 += zzy12;
                        break;
                    } else {
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                    zzf = zzhn.zzl((List) unsafe.getObject(obj2, j));
                    if (zzf > 0) {
                        zzy13 = zzfc.zzy(i10 << 3);
                        zzy14 = zzfc.zzy(zzf);
                        zzy12 = zzy13 + zzy14 + zzf;
                        i6 += zzy12;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzf = zzhn.zzb((List) unsafe.getObject(obj2, j));
                    if (zzf > 0) {
                        zzy13 = zzfc.zzy(i10 << 3);
                        zzy14 = zzfc.zzy(zzf);
                        zzy12 = zzy13 + zzy14 + zzf;
                        i6 += zzy12;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzf = zzhn.zzd((List) unsafe.getObject(obj2, j));
                    if (zzf > 0) {
                        zzy13 = zzfc.zzy(i10 << 3);
                        zzy14 = zzfc.zzy(zzf);
                        zzy12 = zzy13 + zzy14 + zzf;
                        i6 += zzy12;
                        break;
                    } else {
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                    zzf = zzhn.zzf((List) unsafe.getObject(obj2, j));
                    if (zzf > 0) {
                        zzy13 = zzfc.zzy(i10 << 3);
                        zzy14 = zzfc.zzy(zzf);
                        zzy12 = zzy13 + zzy14 + zzf;
                        i6 += zzy12;
                        break;
                    } else {
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                    zzf = zzhn.zzj((List) unsafe.getObject(obj2, j));
                    if (zzf > 0) {
                        zzy13 = zzfc.zzy(i10 << 3);
                        zzy14 = zzfc.zzy(zzf);
                        zzy12 = zzy13 + zzy14 + zzf;
                        i6 += zzy12;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzf = zzhn.zzk((List) unsafe.getObject(obj2, j));
                    if (zzf > 0) {
                        zzy13 = zzfc.zzy(i10 << 3);
                        zzy14 = zzfc.zzy(zzf);
                        zzy12 = zzy13 + zzy14 + zzf;
                        i6 += zzy12;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list13 = (List) unsafe.getObject(obj2, j);
                    zzhl zzv2 = zzheVar.zzv(i4);
                    int i33 = zzhn.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        i3 = 0;
                    } else {
                        i3 = 0;
                        for (int i34 = 0; i34 < size6; i34++) {
                            i3 += zzhn.zza(i10, (zzhb) list13.get(i34), zzv2);
                        }
                    }
                    i6 += i3;
                    break;
                case 50:
                    zzgv zzgvVar = (zzgv) unsafe.getObject(obj2, j);
                    zzgu zzguVar = (zzgu) zzheVar.zzw(i4);
                    if (!zzgvVar.isEmpty()) {
                        zzh = 0;
                        for (Map.Entry entry2 : zzgvVar.entrySet()) {
                            zzh += zzguVar.zza(i10, entry2.getKey(), entry2.getValue());
                        }
                        i6 += zzh;
                        break;
                    }
                    zzh = 0;
                    i6 += zzh;
                case 51:
                    if (zzheVar.zzM(obj2, i10, i4)) {
                        zzy15 = zzfc.zzy(i10 << 3);
                        zzi = zzy15 + 8;
                        i6 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzheVar.zzM(obj2, i10, i4)) {
                        zzy16 = zzfc.zzy(i10 << 3);
                        zzi = zzy16 + 4;
                        i6 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzheVar.zzM(obj2, i10, i4)) {
                        long zzt = zzt(obj2, j);
                        zzm = zzfc.zzy(i10 << 3);
                        i2 = zzfc.zzz(zzt);
                        zzi = zzm + i2;
                        i6 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzheVar.zzM(obj2, i10, i4)) {
                        long zzt2 = zzt(obj2, j);
                        zzm = zzfc.zzy(i10 << 3);
                        i2 = zzfc.zzz(zzt2);
                        zzi = zzm + i2;
                        i6 += zzi;
                        break;
                    } else {
                        break;
                    }
                case Bridge.MINIMUM_ANDROID_WEBVIEW_VERSION /* 55 */:
                    if (zzheVar.zzM(obj2, i10, i4)) {
                        long zzo = zzo(obj2, j);
                        zzm = zzfc.zzy(i10 << 3);
                        i2 = zzfc.zzz(zzo);
                        zzi = zzm + i2;
                        i6 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzheVar.zzM(obj2, i10, i4)) {
                        zzy15 = zzfc.zzy(i10 << 3);
                        zzi = zzy15 + 8;
                        i6 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzheVar.zzM(obj2, i10, i4)) {
                        zzy16 = zzfc.zzy(i10 << 3);
                        zzi = zzy16 + 4;
                        i6 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzheVar.zzM(obj2, i10, i4)) {
                        zzi = zzfc.zzy(i10 << 3) + 1;
                        i6 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzheVar.zzM(obj2, i10, i4)) {
                        int i35 = i10 << 3;
                        Object object2 = unsafe.getObject(obj2, j);
                        if (object2 instanceof zzev) {
                            zzy17 = zzfc.zzy(i35);
                            zzb5 = ((zzev) object2).zze();
                            zzy18 = zzfc.zzy(zzb5);
                        } else {
                            zzy17 = zzfc.zzy(i35);
                            zzb5 = zzin.zzb((String) object2);
                            zzy18 = zzfc.zzy(zzb5);
                        }
                        zzi = zzy17 + zzy18 + zzb5;
                        i6 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzheVar.zzM(obj2, i10, i4)) {
                        zzi = zzhn.zzi(i10, unsafe.getObject(obj2, j), zzheVar.zzv(i4));
                        i6 += zzi;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzheVar.zzM(obj2, i10, i4)) {
                        zzev zzevVar2 = (zzev) unsafe.getObject(obj2, j);
                        zzy17 = zzfc.zzy(i10 << 3);
                        zzb5 = zzevVar2.zze();
                        zzy18 = zzfc.zzy(zzb5);
                        zzi = zzy17 + zzy18 + zzb5;
                        i6 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzheVar.zzM(obj2, i10, i4)) {
                        int zzo2 = zzo(obj2, j);
                        zzm = zzfc.zzy(i10 << 3);
                        i2 = zzfc.zzy(zzo2);
                        zzi = zzm + i2;
                        i6 += zzi;
                        break;
                    } else {
                        break;
                    }
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzheVar.zzM(obj2, i10, i4)) {
                        long zzo3 = zzo(obj2, j);
                        zzm = zzfc.zzy(i10 << 3);
                        i2 = zzfc.zzz(zzo3);
                        zzi = zzm + i2;
                        i6 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzheVar.zzM(obj2, i10, i4)) {
                        zzy16 = zzfc.zzy(i10 << 3);
                        zzi = zzy16 + 4;
                        i6 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzheVar.zzM(obj2, i10, i4)) {
                        zzy15 = zzfc.zzy(i10 << 3);
                        zzi = zzy15 + 8;
                        i6 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzheVar.zzM(obj2, i10, i4)) {
                        int zzo4 = zzo(obj2, j);
                        zzm = zzfc.zzy(i10 << 3);
                        i2 = zzfc.zzy((zzo4 >> 31) ^ (zzo4 + zzo4));
                        zzi = zzm + i2;
                        i6 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzheVar.zzM(obj2, i10, i4)) {
                        long zzt3 = zzt(obj2, j);
                        zzm = zzfc.zzy(i10 << 3);
                        i2 = zzfc.zzz((zzt3 >> 63) ^ (zzt3 + zzt3));
                        zzi = zzm + i2;
                        i6 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzheVar.zzM(obj2, i10, i4)) {
                        zzi = zzhn.zza(i10, (zzhb) unsafe.getObject(obj2, j), zzheVar.zzv(i4));
                        i6 += zzi;
                        break;
                    } else {
                        break;
                    }
            }
            i4 += 3;
            obj2 = obj;
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
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                case 39:
                case 40:
                case 41:
                case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                case 44:
                case 45:
                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
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
                case Bridge.MINIMUM_ANDROID_WEBVIEW_VERSION /* 55 */:
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
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
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
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
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

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    final int zzc(java.lang.Object r38, byte[] r39, int r40, int r41, int r42, com.google.android.gms.internal.play_billing.zzej r43) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzhe.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.zzej):int");
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
                            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                            case 39:
                            case 40:
                            case 41:
                            case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                            case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                            case 44:
                            case 45:
                            case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                            case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
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
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                case 39:
                case 40:
                case 41:
                case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                case 44:
                case 45:
                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
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
                case Bridge.MINIMUM_ANDROID_WEBVIEW_VERSION /* 55 */:
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
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case 62:
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
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

    /* JADX WARN: Removed duplicated region for block: B:249:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    @Override // com.google.android.gms.internal.play_billing.zzhl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(Object obj, zzit zzitVar) throws IOException {
        Map.Entry entry;
        int[] iArr;
        int i;
        int i2;
        int i3;
        zzhe<T> zzheVar = this;
        if (zzheVar.zzh) {
            zzfm zzfmVar = ((zzfr) obj).zzb;
            if (!zzfmVar.zza.isEmpty()) {
                entry = (Map.Entry) zzfmVar.zzf().next();
                iArr = zzheVar.zzc;
                Unsafe unsafe = zzb;
                int i4 = 1048575;
                int i5 = 1048575;
                i = 0;
                int i6 = 0;
                while (i < iArr.length) {
                    int zzs = zzheVar.zzs(i);
                    int zzr = zzr(zzs);
                    int i7 = iArr[i];
                    if (zzr <= 17) {
                        int i8 = iArr[i + 2];
                        int i9 = i8 & i4;
                        if (i9 != i5) {
                            i6 = i9 == i4 ? 0 : unsafe.getInt(obj, i9);
                            i5 = i9;
                        }
                        i2 = zzs;
                        i3 = 1 << (i8 >>> 20);
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
                            if (!zzheVar.zzJ(obj, i, i5, i6, i3)) {
                                break;
                            } else {
                                zzitVar.zzf(i7, zzii.zza(obj, j));
                                continue;
                            }
                        case 1:
                            if (zzheVar.zzJ(obj, i, i5, i6, i3)) {
                                zzitVar.zzo(i7, zzii.zzb(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if (zzheVar.zzJ(obj, i, i5, i6, i3)) {
                                zzitVar.zzt(i7, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            if (zzheVar.zzJ(obj, i, i5, i6, i3)) {
                                zzitVar.zzL(i7, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            if (zzheVar.zzJ(obj, i, i5, i6, i3)) {
                                zzitVar.zzr(i7, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            if (zzheVar.zzJ(obj, i, i5, i6, i3)) {
                                zzitVar.zzm(i7, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            if (zzheVar.zzJ(obj, i, i5, i6, i3)) {
                                zzitVar.zzk(i7, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            if (zzheVar.zzJ(obj, i, i5, i6, i3)) {
                                zzitVar.zzb(i7, zzii.zzw(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 8:
                            if (zzheVar.zzJ(obj, i, i5, i6, i3)) {
                                zzP(i7, unsafe.getObject(obj, j), zzitVar);
                                break;
                            } else {
                                continue;
                            }
                        case 9:
                            if (zzheVar.zzJ(obj, i, i5, i6, i3)) {
                                zzitVar.zzw(i7, unsafe.getObject(obj, j), zzheVar.zzv(i));
                                break;
                            } else {
                                continue;
                            }
                        case 10:
                            if (zzheVar.zzJ(obj, i, i5, i6, i3)) {
                                zzitVar.zzd(i7, (zzev) unsafe.getObject(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            if (zzheVar.zzJ(obj, i, i5, i6, i3)) {
                                zzitVar.zzJ(i7, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 12:
                            if (zzheVar.zzJ(obj, i, i5, i6, i3)) {
                                zzitVar.zzi(i7, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 13:
                            if (zzheVar.zzJ(obj, i, i5, i6, i3)) {
                                zzitVar.zzy(i7, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 14:
                            if (zzheVar.zzJ(obj, i, i5, i6, i3)) {
                                zzitVar.zzA(i7, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 15:
                            if (zzheVar.zzJ(obj, i, i5, i6, i3)) {
                                zzitVar.zzC(i7, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 16:
                            if (zzheVar.zzJ(obj, i, i5, i6, i3)) {
                                zzitVar.zzE(i7, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 17:
                            if (zzheVar.zzJ(obj, i, i5, i6, i3)) {
                                zzitVar.zzq(i7, unsafe.getObject(obj, j), zzheVar.zzv(i));
                                break;
                            } else {
                                continue;
                            }
                        case 18:
                            zzhn.zzs(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, false);
                            continue;
                        case 19:
                            zzhn.zzw(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, false);
                            continue;
                        case 20:
                            zzhn.zzy(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, false);
                            continue;
                        case 21:
                            zzhn.zzE(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, false);
                            continue;
                        case 22:
                            zzhn.zzx(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, false);
                            continue;
                        case 23:
                            zzhn.zzv(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, false);
                            continue;
                        case 24:
                            zzhn.zzu(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, false);
                            continue;
                        case 25:
                            zzhn.zzr(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, false);
                            continue;
                        case 26:
                            int i10 = iArr[i];
                            List list = (List) unsafe.getObject(obj, j);
                            int i11 = zzhn.zza;
                            if (list != null && !list.isEmpty()) {
                                zzitVar.zzI(i10, list);
                                break;
                            }
                            break;
                        case 27:
                            int i12 = iArr[i];
                            List list2 = (List) unsafe.getObject(obj, j);
                            zzhl zzv = zzheVar.zzv(i);
                            int i13 = zzhn.zza;
                            if (list2 != null && !list2.isEmpty()) {
                                for (int i14 = 0; i14 < list2.size(); i14++) {
                                    ((zzfd) zzitVar).zzw(i12, list2.get(i14), zzv);
                                }
                                break;
                            }
                            break;
                        case 28:
                            int i15 = iArr[i];
                            List list3 = (List) unsafe.getObject(obj, j);
                            int i16 = zzhn.zza;
                            if (list3 != null && !list3.isEmpty()) {
                                zzitVar.zze(i15, list3);
                                break;
                            }
                            break;
                        case 29:
                            zzhn.zzD(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, false);
                            continue;
                        case 30:
                            zzhn.zzt(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, false);
                            continue;
                        case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                            zzhn.zzz(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, false);
                            continue;
                        case 32:
                            zzhn.zzA(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, false);
                            continue;
                        case 33:
                            zzhn.zzB(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, false);
                            continue;
                        case 34:
                            zzhn.zzC(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, false);
                            continue;
                        case 35:
                            zzhn.zzs(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, true);
                            break;
                        case 36:
                            zzhn.zzw(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, true);
                            break;
                        case 37:
                            zzhn.zzy(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, true);
                            break;
                        case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
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
                        case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                            zzhn.zzr(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, true);
                            break;
                        case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                            zzhn.zzD(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, true);
                            break;
                        case 44:
                            zzhn.zzt(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, true);
                            break;
                        case 45:
                            zzhn.zzz(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, true);
                            break;
                        case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                            zzhn.zzA(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, true);
                            break;
                        case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                            zzhn.zzB(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, true);
                            break;
                        case 48:
                            zzhn.zzC(iArr[i], (List) unsafe.getObject(obj, j), zzitVar, true);
                            break;
                        case 49:
                            int i17 = iArr[i];
                            List list4 = (List) unsafe.getObject(obj, j);
                            zzhl zzv2 = zzheVar.zzv(i);
                            int i18 = zzhn.zza;
                            if (list4 != null && !list4.isEmpty()) {
                                for (int i19 = 0; i19 < list4.size(); i19++) {
                                    ((zzfd) zzitVar).zzq(i17, list4.get(i19), zzv2);
                                }
                                break;
                            }
                            break;
                        case 50:
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                zzitVar.zzv(i7, ((zzgu) zzheVar.zzw(i)).zzc(), (zzgv) object);
                                break;
                            }
                            break;
                        case 51:
                            if (zzheVar.zzM(obj, i7, i)) {
                                zzitVar.zzf(i7, zzm(obj, j));
                                break;
                            }
                            break;
                        case 52:
                            if (zzheVar.zzM(obj, i7, i)) {
                                zzitVar.zzo(i7, zzn(obj, j));
                                break;
                            }
                            break;
                        case 53:
                            if (zzheVar.zzM(obj, i7, i)) {
                                zzitVar.zzt(i7, zzt(obj, j));
                                break;
                            }
                            break;
                        case 54:
                            if (zzheVar.zzM(obj, i7, i)) {
                                zzitVar.zzL(i7, zzt(obj, j));
                                break;
                            }
                            break;
                        case Bridge.MINIMUM_ANDROID_WEBVIEW_VERSION /* 55 */:
                            if (zzheVar.zzM(obj, i7, i)) {
                                zzitVar.zzr(i7, zzo(obj, j));
                                break;
                            }
                            break;
                        case 56:
                            if (zzheVar.zzM(obj, i7, i)) {
                                zzitVar.zzm(i7, zzt(obj, j));
                                break;
                            }
                            break;
                        case 57:
                            if (zzheVar.zzM(obj, i7, i)) {
                                zzitVar.zzk(i7, zzo(obj, j));
                                break;
                            }
                            break;
                        case 58:
                            if (zzheVar.zzM(obj, i7, i)) {
                                zzitVar.zzb(i7, zzN(obj, j));
                                break;
                            }
                            break;
                        case 59:
                            if (zzheVar.zzM(obj, i7, i)) {
                                zzP(i7, unsafe.getObject(obj, j), zzitVar);
                                break;
                            }
                            break;
                        case 60:
                            if (zzheVar.zzM(obj, i7, i)) {
                                zzitVar.zzw(i7, unsafe.getObject(obj, j), zzheVar.zzv(i));
                                break;
                            }
                            break;
                        case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                            if (zzheVar.zzM(obj, i7, i)) {
                                zzitVar.zzd(i7, (zzev) unsafe.getObject(obj, j));
                                break;
                            }
                            break;
                        case 62:
                            if (zzheVar.zzM(obj, i7, i)) {
                                zzitVar.zzJ(i7, zzo(obj, j));
                                break;
                            }
                            break;
                        case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                            if (zzheVar.zzM(obj, i7, i)) {
                                zzitVar.zzi(i7, zzo(obj, j));
                                break;
                            }
                            break;
                        case 64:
                            if (zzheVar.zzM(obj, i7, i)) {
                                zzitVar.zzy(i7, zzo(obj, j));
                                break;
                            }
                            break;
                        case 65:
                            if (zzheVar.zzM(obj, i7, i)) {
                                zzitVar.zzA(i7, zzt(obj, j));
                                break;
                            }
                            break;
                        case 66:
                            if (zzheVar.zzM(obj, i7, i)) {
                                zzitVar.zzC(i7, zzo(obj, j));
                                break;
                            }
                            break;
                        case 67:
                            if (zzheVar.zzM(obj, i7, i)) {
                                zzitVar.zzE(i7, zzt(obj, j));
                                break;
                            }
                            break;
                        case 68:
                            if (zzheVar.zzM(obj, i7, i)) {
                                zzitVar.zzq(i7, unsafe.getObject(obj, j), zzheVar.zzv(i));
                                break;
                            }
                            break;
                    }
                    i += 3;
                    i4 = 1048575;
                    zzheVar = this;
                }
                if (entry != null) {
                    ((zzfu) obj).zzc.zzl(zzitVar);
                    return;
                } else {
                    throw null;
                }
            }
        }
        entry = null;
        iArr = zzheVar.zzc;
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
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                case 39:
                case 40:
                case 41:
                case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                case 44:
                case 45:
                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
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
                case Bridge.MINIMUM_ANDROID_WEBVIEW_VERSION /* 55 */:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case 62:
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
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
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i5 < this.zzj) {
            int[] iArr = this.zzi;
            int[] iArr2 = this.zzc;
            int i7 = iArr[i5];
            int i8 = iArr2[i7];
            int zzs = zzs(i7);
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
            if ((268435456 & zzs) != 0 && !zzJ(obj, i2, i, i3, i11)) {
                return false;
            }
            int zzr = zzr(zzs);
            if (zzr != 9 && zzr != 17) {
                if (zzr != 27) {
                    if (zzr == 60 || zzr == 68) {
                        if (zzM(obj, i8, i2) && !zzK(obj, zzs, zzv(i2))) {
                            return false;
                        }
                    } else if (zzr != 49) {
                        if (zzr != 50) {
                            continue;
                        } else {
                            zzgv zzgvVar = (zzgv) zzii.zzf(obj, zzs & 1048575);
                            if (!zzgvVar.isEmpty() && ((zzgu) zzw(i2)).zzc().zzc.zzb() == zzis.MESSAGE) {
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
                    zzhl zzv = zzv(i2);
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        if (!zzv.zzk(list.get(i13))) {
                            return false;
                        }
                    }
                }
            } else if (zzJ(obj, i2, i, i3, i11) && !zzK(obj, zzs, zzv(i2))) {
                return false;
            }
            i5++;
            i6 = i;
            i4 = i3;
        }
        return !this.zzh || ((zzfr) obj).zzb.zzj();
    }
}
