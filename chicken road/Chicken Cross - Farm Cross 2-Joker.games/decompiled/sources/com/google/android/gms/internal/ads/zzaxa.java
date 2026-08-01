package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzaxa {
    public int zza = 1;
    private Object zzb;
    private long zzc;
    private double zzd;
    private zzawe zze;
    private List zzf;
    private zzaws zzg;

    private zzaxa() {
    }

    public static zzaxa zza(Object obj) {
        zzaxa zzaxaVar = new zzaxa();
        int[] iArr = {572660336, 1963204074, 810270723, 1168973800, 12304897, -1027511958, 1433925857, 2084420925, 1937477084};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = i7 + ((((i2 & (~i)) | i3) + ((i & i4) | i5)) - i6);
        zzaxaVar.zzr();
        zzaxaVar.zza = (i8 % 1937477084) ^ i9;
        zzaxaVar.zzb = obj;
        return zzaxaVar;
    }

    public static zzaxa zzb(long j) {
        zzaxa zzaxaVar = new zzaxa();
        int[] iArr = {269455306, 1628467785, 508432336, 1769894153, 149815616, -1737813993, 468055906, 524872353, 327254586};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = i7 + ((((i2 & (~i)) | i3) + ((i & i4) | i5)) - i6);
        zzaxaVar.zzr();
        zzaxaVar.zza = (i8 % 327254586) ^ i9;
        zzaxaVar.zzc = j;
        return zzaxaVar;
    }

    public static zzaxa zzc(double d) {
        zzaxa zzaxaVar = new zzaxa();
        int[] iArr = {76065818, 1629326670, 912768099, 1092092300, 784816880, -1349977414, 434065736, 1884661237, 1605908235};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = i7 + ((((i2 & (~i)) | i3) + ((i & i4) | i5)) - i6);
        zzaxaVar.zzr();
        zzaxaVar.zza = (i8 % 1605908235) ^ i9;
        zzaxaVar.zzd = d;
        return zzaxaVar;
    }

    public static zzaxa zzd(zzawe zzaweVar) {
        zzaxa zzaxaVar = new zzaxa();
        int[] iArr = {1143408282, 544368152, 1884037077, 79323401, 1472762119, -801477845, 201305624, 1470503465, 1402586708};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = i7 + ((((i2 & (~i)) | i3) + ((i & i4) | i5)) - i6);
        zzaxaVar.zzr();
        zzaxaVar.zza = (i8 % 1402586708) ^ i9;
        zzaxaVar.zze = zzaweVar;
        return zzaxaVar;
    }

    public static zzaxa zze(List list) {
        zzaxa zzaxaVar = new zzaxa();
        int[] iArr = {231602422, 370241669, 619070592, 319896591, 694865338, 1425770340, 39950860, 555996658, 324763920};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = i7 + ((((i2 & (~i)) | i3) + ((i & i4) | i5)) - i6);
        zzaxaVar.zzr();
        zzaxaVar.zza = (i8 % 324763920) ^ i9;
        zzaxaVar.zzf = list;
        return zzaxaVar;
    }

    public static zzaxa zzf(zzaws zzawsVar) {
        zzaxa zzaxaVar = new zzaxa();
        int[] iArr = {1315209188, 67133601, 1612794668, 612376713, 2023183116, -774012042, 5007439, 661761152, 474613996};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = i7 + ((((i2 & (~i)) | i3) + ((i & i4) | i5)) - i6);
        zzaxaVar.zzr();
        zzaxaVar.zza = (i8 % 474613996) ^ i9;
        zzaxaVar.zzg = zzawsVar;
        return zzaxaVar;
    }

    public static zzaxa zzg(Object obj) {
        if (obj instanceof Long) {
            return zzb(((Long) obj).longValue());
        }
        if (obj instanceof Boolean) {
            return zzb(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Integer) {
            return zzb(((Integer) obj).intValue());
        }
        if (obj instanceof Double) {
            return zzc(((Double) obj).doubleValue());
        }
        if (obj instanceof Float) {
            return zzc(((Float) obj).floatValue());
        }
        if (obj instanceof Short) {
            return zzb(((Short) obj).shortValue());
        }
        if (obj instanceof Byte) {
            return zzb(((Byte) obj).byteValue());
        }
        if (obj instanceof zzawe) {
            return zzd((zzawe) obj);
        }
        if (obj instanceof String) {
            return zzd(zzawe.zzf((String) obj));
        }
        if (!(obj instanceof ArrayList)) {
            return zza(obj);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(zzg(arrayList2.get(i)));
        }
        return zze(arrayList);
    }

    public static zzaxa zzj(zzaxa zzaxaVar) {
        int[] iArr = {1154349542, 1365661854, 772762753, -35647458, -1399059520, 905919471, 65677639, 1759726503, 552812661};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = i7 + ((((i2 & (~i)) | i3) + ((i & i4) | i5)) - i6);
        int i10 = i8 % 552812661;
        try {
            int i11 = zzaxaVar.zza;
            int i12 = (i10 ^ i9) + i11;
            if (i11 == 0) {
                throw null;
            }
            switch (i12) {
                case 0:
                    return new zzaxa();
                case 1:
                    return zza(zzaxaVar.zzl());
                case 2:
                    return zzb(zzaxaVar.zzm());
                case 3:
                    return zzd(zzaxaVar.zzn());
                case 4:
                    ArrayList arrayList = new ArrayList();
                    Iterator it = zzaxaVar.zzo().iterator();
                    while (it.hasNext()) {
                        arrayList.add(zzj((zzaxa) it.next()));
                    }
                    return zze(arrayList);
                case 5:
                    return zzf(zzaxaVar.zzp());
                case 6:
                    return zzc(zzaxaVar.zzq());
                default:
                    throw new AssertionError(zzawc.zza("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
            }
        } catch (zzawx e) {
            throw new AssertionError(zzawc.zza("CEiv6BFfPnitUE+D"), e);
        }
    }

    private final void zzr() {
        this.zza = 1;
        this.zzc = 0L;
        this.zzb = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = null;
    }

    private final void zzs(int i) throws zzawx {
        if (i != this.zza) {
            throw new zzawx();
        }
    }

    public final Object zzh() throws zzawx {
        int[] iArr = {172154289, 1050326876, 843682288, -858640882, -228026365, 881347074, 13857144, 514820752, 473891334};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = i7 + ((((i2 & (~i)) | i3) + ((i & i4) | i5)) - i6);
        int i10 = this.zza;
        int i11 = ((i8 % 473891334) ^ i9) + i10;
        if (i10 == 0) {
            throw null;
        }
        switch (i11) {
            case 0:
            case 5:
                throw new zzawx();
            case 1:
                return zzl();
            case 2:
                return Long.valueOf(zzm());
            case 3:
                return zzn().zza();
            case 4:
                ArrayList arrayList = new ArrayList();
                Iterator it = zzo().iterator();
                while (it.hasNext()) {
                    arrayList.add(((zzaxa) it.next()).zzh());
                }
                return arrayList;
            case 6:
                return Double.valueOf(zzq());
            default:
                throw new AssertionError(zzawc.zza("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0261, code lost:
    
        if (r8.equals(java.lang.Object.class) != false) goto L149;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzi(Class cls) throws zzawx {
        int i = ((((~849876229) & 176298782) | 901785696) + ((849876229 & 1241658174) | 1140858976)) - 1963068318;
        int i2 = 1297046355 % 1049561859;
        int i3 = ((((~1123716509) & 1768229282) | 106234960) + ((1123716509 & 1830821282) | 337466384)) - (-2089431944);
        int i4 = 878786386 % 19063328;
        int i5 = this.zza;
        int i6 = ((((((~104451352) & 1645008493) | 1535758986) + ((104451352 & (-1340865435)) | (-650413174))) - (-2144387213)) ^ (1862140492 % 1134040403)) + i5;
        if (i5 == 0) {
            throw null;
        }
        int i7 = i3 ^ i4;
        int i8 = i ^ i2;
        switch (i6) {
            case 0:
                break;
            case 1:
                return zzl();
            case 2:
                long zzm = zzm();
                if (!cls.equals(Byte.class) && !cls.equals(Byte.TYPE)) {
                    if (cls.equals(Short.class) || cls.equals(Short.TYPE)) {
                        return Short.valueOf((short) ((((int) zzm) << i8) >> i8));
                    }
                    if (cls.equals(Integer.class) || cls.equals(Integer.TYPE)) {
                        return Integer.valueOf(Math.toIntExact(zzm));
                    }
                    if (!cls.equals(Long.class) && !cls.equals(Long.TYPE)) {
                        if (cls.equals(Float.class) || cls.equals(Float.TYPE)) {
                            return Float.valueOf(zzm);
                        }
                        if (cls.equals(Double.class) || cls.equals(Double.TYPE)) {
                            return Double.valueOf(zzm);
                        }
                        if (!cls.equals(Boolean.class) && !cls.equals(Boolean.TYPE)) {
                            if (!cls.equals(Character.class) && !cls.equals(Character.TYPE)) {
                                break;
                            }
                        } else {
                            return Boolean.valueOf(zzm != 0);
                        }
                    }
                    return Long.valueOf(zzm);
                }
                return Byte.valueOf((byte) ((((int) zzm) << i7) >> i7));
            case 3:
                zzawe zzn = zzn();
                if (cls.equals(zzawe.class)) {
                    return zzn;
                }
                if (cls.equals(Object.class) || cls.equals(String.class)) {
                    return zzn.zzc();
                }
                if (cls.equals(byte[].class)) {
                    return zzn.zza();
                }
                break;
            case 4:
                if (cls.equals(ArrayList.class) || cls.equals(Object.class) || cls.equals(AbstractList.class) || cls.equals(AbstractCollection.class) || cls.equals(Serializable.class) || cls.equals(Cloneable.class) || cls.equals(Iterable.class) || cls.equals(Collection.class) || cls.equals(List.class) || cls.equals(RandomAccess.class)) {
                    return zzh();
                }
                if (cls.isArray()) {
                    List zzo = zzo();
                    Class<?> componentType = cls.getComponentType();
                    Object newInstance = Array.newInstance(componentType, zzo.size());
                    for (int i9 = 0; i9 < zzo.size(); i9++) {
                        Array.set(newInstance, i9, ((zzaxa) zzo.get(i9)).zzi(componentType));
                    }
                    return newInstance;
                }
                break;
            case 5:
                return zzp();
            case 6:
                double zzq = zzq();
                if (cls.equals(Float.class) || cls.equals(Float.TYPE)) {
                    return Float.valueOf((float) zzq);
                }
                if (cls.equals(Integer.class) || cls.equals(Integer.TYPE)) {
                    return Integer.valueOf((int) zzq);
                }
                if (cls.equals(Long.class) || cls.equals(Long.TYPE)) {
                    return Long.valueOf((long) zzq);
                }
                if (cls.equals(Byte.class) || cls.equals(Byte.TYPE)) {
                    return Byte.valueOf((byte) ((((int) zzq) << i7) >> i7));
                }
                if (cls.equals(Short.class) || cls.equals(Short.TYPE)) {
                    return Short.valueOf((short) ((((int) zzq) << i8) >> i8));
                }
                if (cls.equals(Double.class) || cls.equals(Double.TYPE) || cls.equals(Object.class)) {
                    return Double.valueOf(zzq);
                }
                break;
            default:
                throw new AssertionError(zzawc.zza("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
        }
        throw new zzawx();
    }

    public final void zzk(OutputStream outputStream) throws zzawx, IOException {
        long[] jArr = {1269833163, 1628598594, 308676977, 1629286434, 15633520, 3337700125L, 1402923307, 613197917, 297598514};
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = j7 + (((((~j) & j2) | j3) + ((j & j4) | j5)) - j6);
        long j10 = j8 % 297598514;
        int i = ((((~136416008) & 1315652152) | 568681609) + ((136416008 & 1310591536) | 838183178)) - (-1654427070);
        int i2 = 1414460396 % 78756298;
        int i3 = ((((~1202640845) & 472047875) | 1135942642) + ((1202640845 & 1006822481) | 585369424)) - 1952913860;
        int i4 = 1225708428 % 987359759;
        int i5 = this.zza;
        int i6 = ((((((~1959970879) & 1489831444) | 1998984087) + ((1959970879 & (-1446423480)) | (-182037905))) - (-2117037800)) ^ (1544048623 % 665228399)) + i5;
        if (i5 == 0) {
            throw null;
        }
        switch (i6) {
            case 0:
            case 1:
            case 5:
                throw new zzawx();
            case 2:
                zzawa.zzb(zzm(), new zzawz(outputStream, 1), true);
                return;
            case 3:
                byte[] bArr = zzn().zza;
                zzawa.zzb(bArr.length * (j9 ^ j10), new zzawz(outputStream, 0), true);
                outputStream.write(bArr);
                return;
            case 4:
                List zzo = zzo();
                zzawa.zzb(zzo.size(), new zzawz(outputStream, i3 ^ i4), true);
                Iterator it = zzo.iterator();
                while (it.hasNext()) {
                    ((zzaxa) it.next()).zzk(outputStream);
                }
                return;
            case 6:
                double zzq = zzq();
                zzawz zzawzVar = new zzawz(outputStream, i ^ i2);
                long doubleToRawLongBits = Double.doubleToRawLongBits(zzq);
                ByteBuffer allocate = ByteBuffer.allocate((((((~1470558289) & 1721781326) | 2037102441) + ((1470558289 & 109139991) | 560281113)) - (-1975232131)) ^ (1043353969 % 656635246));
                allocate.order(ByteOrder.LITTLE_ENDIAN);
                allocate.putLong(doubleToRawLongBits);
                for (byte b : allocate.array()) {
                    zzawzVar.zza(b);
                }
                int length = allocate.array().length;
                return;
            default:
                return;
        }
    }

    public final Object zzl() throws zzawx {
        int[] iArr = {427355115, 404248040, 1318670750, 874677346, 1819730563, -970011213, 126401947, 1858504292, 235745791};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        zzs((iArr[7] % 235745791) ^ (i7 + ((((i2 & (~i)) | i3) + ((i & i4) | i5)) - i6)));
        return this.zzb;
    }

    public final long zzm() throws zzawx {
        int[] iArr = {1646478179, 763209928, 1529626135, 609321208, 1403807536, -1382063087, 25624641, 1388803074, 733327814};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        zzs((iArr[7] % 733327814) ^ (i7 + ((((i2 & (~i)) | i3) + ((i & i4) | i5)) - i6)));
        return this.zzc;
    }

    public final zzawe zzn() throws zzawx {
        int[] iArr = {2059344234, 1917530355, 739411611, 1399403104, 95815174, 2094390031, 51245830, 1312994984, 1140384172};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        zzs((iArr[7] % 1140384172) ^ (i7 + ((((i2 & (~i)) | i3) + ((i & i4) | i5)) - i6)));
        return this.zze;
    }

    public final List zzo() throws zzawx {
        int[] iArr = {1435218189, 1093276829, 949583962, 1092752517, 575966040, -2054938211, 262178224, 1891252715, 1250801052};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        zzs((iArr[7] % 1250801052) ^ (i7 + ((((i2 & (~i)) | i3) + ((i & i4) | i5)) - i6)));
        return this.zzf;
    }

    public final zzaws zzp() throws zzawx {
        int[] iArr = {672139932, 1821026951, 1629321417, 214090246, 828986457, -1439766056, 580508860, 1579068977, 395191309};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        zzs((iArr[7] % 395191309) ^ (i7 + ((((i2 & (~i)) | i3) + ((i & i4) | i5)) - i6)));
        return this.zzg;
    }

    public final double zzq() throws zzawx {
        int[] iArr = {1714636915, 1758565445, 174653454, 1653642817, 38095532, -1976041400, 596516649, 1804289383, 846930886};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        zzs((iArr[7] % 846930886) ^ (i7 + ((((i2 & (~i)) | i3) + ((i & i4) | i5)) - i6)));
        return this.zzd;
    }
}
