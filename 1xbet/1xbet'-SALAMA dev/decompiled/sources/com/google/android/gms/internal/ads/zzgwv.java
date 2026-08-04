package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzgwv {
    private static final zzgwv zzb = new zzgwv(true);
    final zzgzs zza = new zzgzn();
    private boolean zzc;
    private boolean zzd;

    private zzgwv() {
    }

    public static int zza(zzhaj zzhajVar, int i7, Object obj) {
        int iZzD = zzgwl.zzD(i7 << 3);
        if (zzhajVar == zzhaj.zzj) {
            byte[] bArr = zzgxt.zzb;
            if (((zzgyr) obj) instanceof zzgvi) {
                throw null;
            }
            iZzD += iZzD;
        }
        return iZzD + zzb(zzhajVar, obj);
    }

    public static int zzb(zzhaj zzhajVar, Object obj) {
        int iZzd;
        int iZzD;
        zzhaj zzhajVar2 = zzhaj.zza;
        zzhak zzhakVar = zzhak.INT;
        switch (zzhajVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                int i7 = zzgwl.zzf;
                return 8;
            case 1:
                ((Float) obj).getClass();
                int i8 = zzgwl.zzf;
                return 4;
            case 2:
                return zzgwl.zzE(((Long) obj).longValue());
            case 3:
                return zzgwl.zzE(((Long) obj).longValue());
            case 4:
                return zzgwl.zzE(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                int i9 = zzgwl.zzf;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                int i10 = zzgwl.zzf;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                int i11 = zzgwl.zzf;
                return 1;
            case 8:
                if (!(obj instanceof zzgvy)) {
                    return zzgwl.zzC((String) obj);
                }
                int i12 = zzgwl.zzf;
                iZzd = ((zzgvy) obj).zzd();
                iZzD = zzgwl.zzD(iZzd);
                break;
                break;
            case 9:
                int i13 = zzgwl.zzf;
                return ((zzgyr) obj).zzaY();
            case 10:
                if (!(obj instanceof zzgyb)) {
                    return zzgwl.zzz((zzgyr) obj);
                }
                int i14 = zzgwl.zzf;
                iZzd = ((zzgyb) obj).zza();
                iZzD = zzgwl.zzD(iZzd);
                break;
                break;
            case 11:
                if (!(obj instanceof zzgvy)) {
                    int i15 = zzgwl.zzf;
                    iZzd = ((byte[]) obj).length;
                    iZzD = zzgwl.zzD(iZzd);
                } else {
                    int i16 = zzgwl.zzf;
                    iZzd = ((zzgvy) obj).zzd();
                    iZzD = zzgwl.zzD(iZzd);
                }
                break;
            case 12:
                return zzgwl.zzD(((Integer) obj).intValue());
            case 13:
                return obj instanceof zzgxk ? zzgwl.zzE(((zzgxk) obj).zza()) : zzgwl.zzE(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                int i17 = zzgwl.zzf;
                return 4;
            case 15:
                ((Long) obj).getClass();
                int i18 = zzgwl.zzf;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return zzgwl.zzD((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return zzgwl.zzE((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iZzD + iZzd;
    }

    public static int zzc(zzgwu zzgwuVar, Object obj) {
        zzhaj zzhajVarZzb = zzgwuVar.zzb();
        int iZza = zzgwuVar.zza();
        if (!zzgwuVar.zze()) {
            return zza(zzhajVarZzb, iZza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i7 = 0;
        if (!zzgwuVar.zzd()) {
            int iZza2 = 0;
            while (i7 < size) {
                iZza2 += zza(zzhajVarZzb, iZza, list.get(i7));
                i7++;
            }
            return iZza2;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iZzb = 0;
        while (i7 < size) {
            iZzb += zzb(zzhajVarZzb, list.get(i7));
            i7++;
        }
        return zzgwl.zzD(iZzb) + zzgwl.zzD(iZza << 3) + iZzb;
    }

    public static zzgwv zze() {
        return zzb;
    }

    private static boolean zzj(Map.Entry entry) {
        zzgwu zzgwuVar = (zzgwu) entry.getKey();
        if (zzgwuVar.zzc() != zzhak.MESSAGE) {
            return true;
        }
        if (!zzgwuVar.zze()) {
            return zzk(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (!zzk(list.get(i7))) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzk(Object obj) {
        if (obj instanceof zzgys) {
            return ((zzgys) obj).zzbw();
        }
        if (obj instanceof zzgyb) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzl(Map.Entry entry) {
        int i7;
        int iZzD;
        int iZzz;
        zzgwu zzgwuVar = (zzgwu) entry.getKey();
        Object value = entry.getValue();
        if (zzgwuVar.zzc() != zzhak.MESSAGE || zzgwuVar.zze() || zzgwuVar.zzd()) {
            return zzc(zzgwuVar, value);
        }
        if (value instanceof zzgyb) {
            int iZza = ((zzgwu) entry.getKey()).zza();
            int iZzD2 = zzgwl.zzD(8);
            i7 = iZzD2 + iZzD2;
            iZzD = zzgwl.zzD(iZza) + zzgwl.zzD(16);
            int iZzD3 = zzgwl.zzD(24);
            int iZza2 = ((zzgyb) value).zza();
            iZzz = AbstractC0486a1.c(iZza2, iZza2, iZzD3);
        } else {
            int iZza3 = ((zzgwu) entry.getKey()).zza();
            int iZzD4 = zzgwl.zzD(8);
            i7 = iZzD4 + iZzD4;
            iZzD = zzgwl.zzD(iZza3) + zzgwl.zzD(16);
            iZzz = zzgwl.zzz((zzgyr) value) + zzgwl.zzD(24);
        }
        return i7 + iZzD + iZzz;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    private static final void zzm(zzgwu zzgwuVar, Object obj) {
        boolean z4;
        zzgwuVar.zzb();
        byte[] bArr = zzgxt.zzb;
        obj.getClass();
        zzhaj zzhajVar = zzhaj.zza;
        zzhak zzhakVar = zzhak.INT;
        switch (r0.zza()) {
            case INT:
                z4 = obj instanceof Integer;
                if (z4) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgwuVar.zza()), zzgwuVar.zzb().zza(), obj.getClass().getName()));
            case LONG:
                z4 = obj instanceof Long;
                if (z4) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgwuVar.zza()), zzgwuVar.zzb().zza(), obj.getClass().getName()));
            case FLOAT:
                z4 = obj instanceof Float;
                if (z4) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgwuVar.zza()), zzgwuVar.zzb().zza(), obj.getClass().getName()));
            case DOUBLE:
                z4 = obj instanceof Double;
                if (z4) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgwuVar.zza()), zzgwuVar.zzb().zza(), obj.getClass().getName()));
            case BOOLEAN:
                z4 = obj instanceof Boolean;
                if (z4) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgwuVar.zza()), zzgwuVar.zzb().zza(), obj.getClass().getName()));
            case STRING:
                z4 = obj instanceof String;
                if (z4) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgwuVar.zza()), zzgwuVar.zzb().zza(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof zzgvy) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgwuVar.zza()), zzgwuVar.zzb().zza(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zzgxk)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgwuVar.zza()), zzgwuVar.zzb().zza(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof zzgyr) || (obj instanceof zzgyb)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgwuVar.zza()), zzgwuVar.zzb().zza(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgwuVar.zza()), zzgwuVar.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        zzgwv zzgwvVar = new zzgwv();
        int iZzc = this.zza.zzc();
        for (int i7 = 0; i7 < iZzc; i7++) {
            Map.Entry entryZzg = this.zza.zzg(i7);
            zzgwvVar.zzh((zzgwu) ((zzgzo) entryZzg).zza(), entryZzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzd()) {
            zzgwvVar.zzh((zzgwu) entry.getKey(), entry.getValue());
        }
        zzgwvVar.zzd = this.zzd;
        return zzgwvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgwv) {
            return this.zza.equals(((zzgwv) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzd() {
        int iZzc = this.zza.zzc();
        int iZzl = 0;
        for (int i7 = 0; i7 < iZzc; i7++) {
            iZzl += zzl(this.zza.zzg(i7));
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            iZzl += zzl((Map.Entry) it.next());
        }
        return iZzl;
    }

    public final Iterator zzf() {
        if (this.zza.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.zzd ? new zzgxz(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzc) {
            return;
        }
        int iZzc = this.zza.zzc();
        for (int i7 = 0; i7 < iZzc; i7++) {
            Object value = this.zza.zzg(i7).getValue();
            if (value instanceof zzgxg) {
                ((zzgxg) value).zzbU();
            }
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zzgxg) {
                ((zzgxg) value2).zzbU();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzh(zzgwu zzgwuVar, Object obj) {
        if (!zzgwuVar.zze()) {
            zzm(zzgwuVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i7 = 0; i7 < size; i7++) {
                Object obj2 = list.get(i7);
                zzm(zzgwuVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzgyb) {
            this.zzd = true;
        }
        this.zza.put(zzgwuVar, obj);
    }

    public final boolean zzi() {
        int iZzc = this.zza.zzc();
        for (int i7 = 0; i7 < iZzc; i7++) {
            if (!zzj(this.zza.zzg(i7))) {
                return false;
            }
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            if (!zzj((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzgwv(boolean z4) {
        zzg();
        zzg();
    }
}
