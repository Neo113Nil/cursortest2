package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.android.billingclient:billing@@8.3.0 */
/* loaded from: classes8.dex */
final class zzfm {
    private static final zzfm zzd = new zzfm(true);
    final zzht zza = new zzho();
    boolean zzb;
    boolean zzc;

    private zzfm() {
    }

    static int zza(zzir zzirVar, int i, Object obj) {
        int zzy = zzfc.zzy(i << 3);
        if (zzirVar == zzir.GROUP) {
            zzy += zzy;
        }
        return zzy + zzb(zzirVar, obj);
    }

    static int zzb(zzir zzirVar, Object obj) {
        int zzb;
        int zzy;
        zzir zzirVar2 = zzir.DOUBLE;
        zzis zzisVar = zzis.INT;
        switch (zzirVar) {
            case DOUBLE:
                ((Double) obj).doubleValue();
                int i = zzfc.zzb;
                return 8;
            case FLOAT:
                ((Float) obj).floatValue();
                int i2 = zzfc.zzb;
                return 4;
            case INT64:
                return zzfc.zzz(((Long) obj).longValue());
            case UINT64:
                return zzfc.zzz(((Long) obj).longValue());
            case INT32:
                return zzfc.zzz(((Integer) obj).intValue());
            case FIXED64:
                ((Long) obj).longValue();
                int i3 = zzfc.zzb;
                return 8;
            case FIXED32:
                ((Integer) obj).intValue();
                int i4 = zzfc.zzb;
                return 4;
            case BOOL:
                ((Boolean) obj).booleanValue();
                int i5 = zzfc.zzb;
                return 1;
            case STRING:
                if (!(obj instanceof zzev)) {
                    int i6 = zzfc.zzb;
                    zzb = zzin.zzb((String) obj);
                    zzy = zzfc.zzy(zzb);
                    break;
                } else {
                    int i7 = zzfc.zzb;
                    zzb = ((zzev) obj).zze();
                    zzy = zzfc.zzy(zzb);
                    break;
                }
            case GROUP:
                return ((zzhb) obj).zzn();
            case MESSAGE:
                if (!(obj instanceof zzgh)) {
                    return zzfc.zzx((zzhb) obj);
                }
                zzb = ((zzgh) obj).zza();
                zzy = zzfc.zzy(zzb);
                break;
            case BYTES:
                if (!(obj instanceof zzev)) {
                    int i8 = zzfc.zzb;
                    zzb = ((byte[]) obj).length;
                    zzy = zzfc.zzy(zzb);
                    break;
                } else {
                    int i9 = zzfc.zzb;
                    zzb = ((zzev) obj).zze();
                    zzy = zzfc.zzy(zzb);
                    break;
                }
            case UINT32:
                return zzfc.zzy(((Integer) obj).intValue());
            case ENUM:
                return obj instanceof zzfw ? zzfc.zzz(((zzfw) obj).zza()) : zzfc.zzz(((Integer) obj).intValue());
            case SFIXED32:
                ((Integer) obj).intValue();
                int i10 = zzfc.zzb;
                return 4;
            case SFIXED64:
                ((Long) obj).longValue();
                int i11 = zzfc.zzb;
                return 8;
            case SINT32:
                int intValue = ((Integer) obj).intValue();
                return zzfc.zzy((intValue >> 31) ^ (intValue + intValue));
            case SINT64:
                long longValue = ((Long) obj).longValue();
                return zzfc.zzz((longValue >> 63) ^ (longValue + longValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return zzy + zzb;
    }

    public static int zzc(zzfl zzflVar, Object obj) {
        zzir zzb = zzflVar.zzb();
        int zza = zzflVar.zza();
        if (!zzflVar.zze()) {
            return zza(zzb, zza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i = 0;
        if (!zzflVar.zzd()) {
            int i2 = 0;
            while (i < size) {
                i2 += zza(zzb, zza, list.get(i));
                i++;
            }
            return i2;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int i3 = 0;
        while (i < size) {
            i3 += zzb(zzb, list.get(i));
            i++;
        }
        return zzfc.zzy(zza << 3) + i3 + zzfc.zzy(i3);
    }

    public static zzfm zze() {
        return zzd;
    }

    static void zzi(zzfc zzfcVar, zzir zzirVar, int i, Object obj) throws IOException {
        if (zzirVar == zzir.GROUP) {
            zzfcVar.zzs(i, 3);
            ((zzhb) obj).zzD(zzfcVar);
            zzfcVar.zzs(i, 4);
            return;
        }
        zzfcVar.zzs(i, zzirVar.zza());
        zzis zzisVar = zzis.INT;
        switch (zzirVar) {
            case DOUBLE:
                zzfcVar.zzk(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case FLOAT:
                zzfcVar.zzi(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case INT64:
                zzfcVar.zzw(((Long) obj).longValue());
                break;
            case UINT64:
                zzfcVar.zzw(((Long) obj).longValue());
                break;
            case INT32:
                zzfcVar.zzm(((Integer) obj).intValue());
                break;
            case FIXED64:
                zzfcVar.zzk(((Long) obj).longValue());
                break;
            case FIXED32:
                zzfcVar.zzi(((Integer) obj).intValue());
                break;
            case BOOL:
                zzfcVar.zzb(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case STRING:
                if (!(obj instanceof zzev)) {
                    zzfcVar.zzr((String) obj);
                    break;
                } else {
                    zzfcVar.zzg((zzev) obj);
                    break;
                }
            case GROUP:
                ((zzhb) obj).zzD(zzfcVar);
                break;
            case MESSAGE:
                zzfcVar.zzn((zzhb) obj);
                break;
            case BYTES:
                if (!(obj instanceof zzev)) {
                    byte[] bArr = (byte[]) obj;
                    zzfcVar.zze(bArr, 0, bArr.length);
                    break;
                } else {
                    zzfcVar.zzg((zzev) obj);
                    break;
                }
            case UINT32:
                zzfcVar.zzu(((Integer) obj).intValue());
                break;
            case ENUM:
                if (!(obj instanceof zzfw)) {
                    zzfcVar.zzm(((Integer) obj).intValue());
                    break;
                } else {
                    zzfcVar.zzm(((zzfw) obj).zza());
                    break;
                }
            case SFIXED32:
                zzfcVar.zzi(((Integer) obj).intValue());
                break;
            case SFIXED64:
                zzfcVar.zzk(((Long) obj).longValue());
                break;
            case SINT32:
                int intValue = ((Integer) obj).intValue();
                zzfcVar.zzu((intValue >> 31) ^ (intValue + intValue));
                break;
            case SINT64:
                long longValue = ((Long) obj).longValue();
                zzfcVar.zzw((longValue >> 63) ^ (longValue + longValue));
                break;
        }
    }

    private static boolean zzk(Map.Entry entry) {
        zzfl zzflVar = (zzfl) entry.getKey();
        if (zzflVar.zzc() != zzis.MESSAGE) {
            return true;
        }
        if (!zzflVar.zze()) {
            return zzl(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!zzl(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzl(Object obj) {
        if (obj instanceof zzhc) {
            return ((zzhc) obj).zzo();
        }
        if (obj instanceof zzgh) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzm(Map.Entry entry) {
        int i;
        int zzy;
        int zzy2;
        zzfl zzflVar = (zzfl) entry.getKey();
        Object value = entry.getValue();
        if (zzflVar.zzc() != zzis.MESSAGE || zzflVar.zze() || zzflVar.zzd()) {
            return zzc(zzflVar, value);
        }
        if (value instanceof zzgh) {
            int zza = ((zzfl) entry.getKey()).zza();
            int zzy3 = zzfc.zzy(8);
            i = zzy3 + zzy3;
            zzy = zzfc.zzy(16) + zzfc.zzy(zza);
            int zzy4 = zzfc.zzy(24);
            int zza2 = ((zzgh) value).zza();
            zzy2 = zzy4 + zzfc.zzy(zza2) + zza2;
        } else {
            int zza3 = ((zzfl) entry.getKey()).zza();
            int zzy5 = zzfc.zzy(8);
            i = zzy5 + zzy5;
            zzy = zzfc.zzy(16) + zzfc.zzy(zza3);
            zzy2 = zzfc.zzy(24) + zzfc.zzx((zzhb) value);
        }
        return i + zzy + zzy2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void zzn(zzfl zzflVar, Object obj) {
        boolean z;
        zzflVar.zzb();
        byte[] bArr = zzga.zzb;
        obj.getClass();
        zzir zzirVar = zzir.DOUBLE;
        zzis zzisVar = zzis.INT;
        switch (r0.zzb()) {
            case INT:
                z = obj instanceof Integer;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzflVar.zza()), zzflVar.zzb().zzb(), obj.getClass().getName()));
            case LONG:
                z = obj instanceof Long;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzflVar.zza()), zzflVar.zzb().zzb(), obj.getClass().getName()));
            case FLOAT:
                z = obj instanceof Float;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzflVar.zza()), zzflVar.zzb().zzb(), obj.getClass().getName()));
            case DOUBLE:
                z = obj instanceof Double;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzflVar.zza()), zzflVar.zzb().zzb(), obj.getClass().getName()));
            case BOOLEAN:
                z = obj instanceof Boolean;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzflVar.zza()), zzflVar.zzb().zzb(), obj.getClass().getName()));
            case STRING:
                z = obj instanceof String;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzflVar.zza()), zzflVar.zzb().zzb(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof zzev) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzflVar.zza()), zzflVar.zzb().zzb(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zzfw)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzflVar.zza()), zzflVar.zzb().zzb(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof zzhb) || (obj instanceof zzgh)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzflVar.zza()), zzflVar.zzb().zzb(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzflVar.zza()), zzflVar.zzb().zzb(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzfm zzfmVar = new zzfm();
        zzht zzhtVar = this.zza;
        int zzc = zzhtVar.zzc();
        for (int i = 0; i < zzc; i++) {
            Map.Entry zzg = zzhtVar.zzg(i);
            zzfmVar.zzh((zzfl) ((zzhp) zzg).zza(), zzg.getValue());
        }
        for (Map.Entry entry : zzhtVar.zzd()) {
            zzfmVar.zzh((zzfl) entry.getKey(), entry.getValue());
        }
        zzfmVar.zzc = this.zzc;
        return zzfmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzfm) {
            return this.zza.equals(((zzfm) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzd() {
        zzht zzhtVar = this.zza;
        int zzc = zzhtVar.zzc();
        int i = 0;
        for (int i2 = 0; i2 < zzc; i2++) {
            i += zzm(zzhtVar.zzg(i2));
        }
        Iterator it = zzhtVar.zzd().iterator();
        while (it.hasNext()) {
            i += zzm((Map.Entry) it.next());
        }
        return i;
    }

    public final Iterator zzf() {
        zzht zzhtVar = this.zza;
        return zzhtVar.isEmpty() ? Collections.emptyIterator() : this.zzc ? new zzgf(zzhtVar.entrySet().iterator()) : zzhtVar.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzb) {
            return;
        }
        zzht zzhtVar = this.zza;
        int zzc = zzhtVar.zzc();
        for (int i = 0; i < zzc; i++) {
            Object value = zzhtVar.zzg(i).getValue();
            if (value instanceof zzfu) {
                ((zzfu) value).zzz();
            }
        }
        Iterator it = zzhtVar.zzd().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zzfu) {
                ((zzfu) value2).zzz();
            }
        }
        zzhtVar.zza();
        this.zzb = true;
    }

    public final void zzh(zzfl zzflVar, Object obj) {
        if (!zzflVar.zze()) {
            zzn(zzflVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                zzn(zzflVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzgh) {
            this.zzc = true;
        }
        this.zza.put(zzflVar, obj);
    }

    public final boolean zzj() {
        zzht zzhtVar = this.zza;
        int zzc = zzhtVar.zzc();
        for (int i = 0; i < zzc; i++) {
            if (!zzk(zzhtVar.zzg(i))) {
                return false;
            }
        }
        Iterator it = zzhtVar.zzd().iterator();
        while (it.hasNext()) {
            if (!zzk((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzfm(boolean z) {
        zzg();
        zzg();
    }
}
