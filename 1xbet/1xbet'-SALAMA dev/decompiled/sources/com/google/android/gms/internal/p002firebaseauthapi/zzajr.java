package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzajr<T extends zzajt<T>> {
    private static final zzajr<?> zzb = new zzajr<>(true);
    final zzalw<T, Object> zza;
    private boolean zzc;
    private boolean zzd;

    private zzajr() {
        this.zza = new zzalz();
    }

    public static int zza(zzamw zzamwVar, int i7, Object obj) {
        int iZzi = zzajg.zzi(i7);
        if (zzamwVar == zzamw.zzj) {
            zzakb.zza((zzalc) obj);
            iZzi <<= 1;
        }
        return iZzi + zza(zzamwVar, obj);
    }

    public static <T extends zzajt<T>> zzajr<T> zzb() {
        return (zzajr<T>) zzb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ Object clone() {
        zzajr zzajrVar = new zzajr();
        int iZza = this.zza.zza();
        for (int i7 = 0; i7 < iZza; i7++) {
            Map.Entry<K, Object> entryZza = this.zza.zza(i7);
            zzajrVar.zzb((zzajt) entryZza.getKey(), entryZza.getValue());
        }
        Iterator it = this.zza.zzb().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zzajrVar.zzb((zzajt) entry.getKey(), entry.getValue());
        }
        zzajrVar.zzd = this.zzd;
        return zzajrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzajr) {
            return this.zza.equals(((zzajr) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final Iterator<Map.Entry<T, Object>> zzc() {
        if (this.zza.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.zzd ? new zzaki(this.zza.zzc().iterator()) : this.zza.zzc().iterator();
    }

    public final Iterator<Map.Entry<T, Object>> zzd() {
        if (this.zza.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.zzd ? new zzaki(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zze() {
        if (this.zzc) {
            return;
        }
        int iZza = this.zza.zza();
        for (int i7 = 0; i7 < iZza; i7++) {
            Object value = this.zza.zza(i7).getValue();
            if (value instanceof zzajy) {
                ((zzajy) value).zzs();
            }
        }
        Iterator it = this.zza.zzb().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zzajy) {
                ((zzajy) value2).zzs();
            }
        }
        this.zza.zzd();
        this.zzc = true;
    }

    public final boolean zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        int iZza = this.zza.zza();
        for (int i7 = 0; i7 < iZza; i7++) {
            if (!zzc(this.zza.zza(i7))) {
                return false;
            }
        }
        Iterator it = this.zza.zzb().iterator();
        while (it.hasNext()) {
            if (!zzc((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private final void zzb(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z4 = value instanceof zzakg;
        if (key.zze()) {
            if (z4) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object objZza = zza((zzajt) key);
            List list = (List) value;
            int size = list.size();
            if (objZza == null) {
                objZza = new ArrayList(size);
            }
            List list2 = (List) objZza;
            for (int i7 = 0; i7 < size; i7++) {
                list2.add(zza(list.get(i7)));
            }
            this.zza.put(key, objZza);
            return;
        }
        if (key.zzc() != zzand.MESSAGE) {
            if (z4) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.put(key, zza(value));
            return;
        }
        Object objZza2 = zza((zzajt) key);
        if (objZza2 != null) {
            if (z4) {
                throw new NoSuchMethodError();
            }
            this.zza.put(key, objZza2 instanceof zzall ? key.zza((zzall) objZza2, (zzall) value) : key.zza(((zzalc) objZza2).zzr(), (zzalc) value).zze());
        } else {
            this.zza.put(key, zza(value));
            if (z4) {
                this.zzd = true;
            }
        }
    }

    private zzajr(zzalw<T, Object> zzalwVar) {
        this.zza = zzalwVar;
        zze();
    }

    private static int zza(zzamw zzamwVar, Object obj) {
        switch (zzajq.zzb[zzamwVar.ordinal()]) {
            case 1:
                return zzajg.zza(((Double) obj).doubleValue());
            case 2:
                return zzajg.zza(((Float) obj).floatValue());
            case 3:
                return zzajg.zzd(((Long) obj).longValue());
            case 4:
                return zzajg.zzg(((Long) obj).longValue());
            case 5:
                return zzajg.zze(((Integer) obj).intValue());
            case 6:
                return zzajg.zzc(((Long) obj).longValue());
            case 7:
                return zzajg.zzd(((Integer) obj).intValue());
            case 8:
                return zzajg.zza(((Boolean) obj).booleanValue());
            case 9:
                return zzajg.zza((zzalc) obj);
            case 10:
                if (obj instanceof zzakg) {
                    return zzajg.zza((zzakg) obj);
                }
                return zzajg.zzb((zzalc) obj);
            case 11:
                if (obj instanceof zzaip) {
                    return zzajg.zza((zzaip) obj);
                }
                return zzajg.zza((String) obj);
            case 12:
                if (obj instanceof zzaip) {
                    return zzajg.zza((zzaip) obj);
                }
                return zzajg.zza((byte[]) obj);
            case 13:
                return zzajg.zzj(((Integer) obj).intValue());
            case 14:
                return zzajg.zzg(((Integer) obj).intValue());
            case 15:
                return zzajg.zze(((Long) obj).longValue());
            case 16:
                return zzajg.zzh(((Integer) obj).intValue());
            case 17:
                return zzajg.zzf(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzaka) {
                    return zzajg.zzc(((zzaka) obj).zza());
                }
                return zzajg.zzc(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static void zzc(T t7, Object obj) {
        zzamw zzamwVarZzb = t7.zzb();
        zzakb.zza(obj);
        boolean z4 = true;
        switch (zzajq.zza[zzamwVarZzb.zzb().ordinal()]) {
            case 1:
                z4 = obj instanceof Integer;
                break;
            case 2:
                z4 = obj instanceof Long;
                break;
            case 3:
                z4 = obj instanceof Float;
                break;
            case 4:
                z4 = obj instanceof Double;
                break;
            case 5:
                z4 = obj instanceof Boolean;
                break;
            case 6:
                z4 = obj instanceof String;
                break;
            case 7:
                if (!(obj instanceof zzaip) && !(obj instanceof byte[])) {
                    z4 = false;
                }
                break;
            case 8:
                if (!(obj instanceof Integer) && !(obj instanceof zzaka)) {
                    z4 = false;
                }
                break;
            case 9:
                if (!(obj instanceof zzalc) && !(obj instanceof zzakg)) {
                    z4 = false;
                }
                break;
            default:
                z4 = false;
                break;
        }
        if (!z4) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t7.zza()), t7.zzb().zzb(), obj.getClass().getName()));
        }
    }

    private zzajr(boolean z4) {
        this(new zzalz());
        zze();
    }

    private static <T extends zzajt<T>> boolean zzc(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.zzc() != zzand.MESSAGE) {
            return true;
        }
        if (key.zze()) {
            List list = (List) entry.getValue();
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (!zzb(list.get(i7))) {
                    return false;
                }
            }
            return true;
        }
        return zzb(entry.getValue());
    }

    private final void zzb(T t7, Object obj) {
        if (t7.zze()) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i7 = 0; i7 < size; i7++) {
                    Object obj2 = list.get(i7);
                    zzc(t7, obj2);
                    arrayList.add(obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            zzc(t7, obj);
        }
        if (obj instanceof zzakg) {
            this.zzd = true;
        }
        this.zza.put(t7, obj);
    }

    public static int zza(zzajt<?> zzajtVar, Object obj) {
        zzamw zzamwVarZzb = zzajtVar.zzb();
        int iZza = zzajtVar.zza();
        if (zzajtVar.zze()) {
            List list = (List) obj;
            int size = list.size();
            int i7 = 0;
            if (!zzajtVar.zzd()) {
                int iZza2 = 0;
                while (i7 < size) {
                    iZza2 += zza(zzamwVarZzb, iZza, list.get(i7));
                    i7++;
                }
                return iZza2;
            }
            if (list.isEmpty()) {
                return 0;
            }
            int iZza3 = 0;
            while (i7 < size) {
                iZza3 += zza(zzamwVarZzb, list.get(i7));
                i7++;
            }
            return zzajg.zzj(iZza3) + zzajg.zzi(iZza) + iZza3;
        }
        return zza(zzamwVarZzb, iZza, obj);
    }

    private static boolean zzb(Object obj) {
        if (obj instanceof zzale) {
            return ((zzale) obj).zzj();
        }
        if (obj instanceof zzakg) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public final int zza() {
        int iZza = this.zza.zza();
        int iZza2 = 0;
        for (int i7 = 0; i7 < iZza; i7++) {
            iZza2 += zza((Map.Entry) this.zza.zza(i7));
        }
        Iterator it = this.zza.zzb().iterator();
        while (it.hasNext()) {
            iZza2 += zza((Map.Entry) it.next());
        }
        return iZza2;
    }

    private static int zza(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.zzc() == zzand.MESSAGE && !key.zze() && !key.zzd()) {
            if (value instanceof zzakg) {
                return zzajg.zza(entry.getKey().zza(), (zzakg) value);
            }
            return zzajg.zza(entry.getKey().zza(), (zzalc) value);
        }
        return zza((zzajt<?>) key, value);
    }

    private static Object zza(Object obj) {
        if (obj instanceof zzall) {
            return ((zzall) obj).clone();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private final Object zza(T t7) {
        Object obj = this.zza.get(t7);
        if (obj instanceof zzakg) {
            throw new NoSuchMethodError();
        }
        return obj;
    }

    public final void zza(zzajr<T> zzajrVar) {
        int iZza = zzajrVar.zza.zza();
        for (int i7 = 0; i7 < iZza; i7++) {
            zzb((Map.Entry) zzajrVar.zza.zza(i7));
        }
        Iterator it = zzajrVar.zza.zzb().iterator();
        while (it.hasNext()) {
            zzb((Map.Entry) it.next());
        }
    }

    public static void zza(zzajg zzajgVar, zzamw zzamwVar, int i7, Object obj) {
        if (zzamwVar == zzamw.zzj) {
            zzalc zzalcVar = (zzalc) obj;
            zzakb.zza(zzalcVar);
            zzajgVar.zzk(i7, 3);
            zzalcVar.zza(zzajgVar);
            zzajgVar.zzk(i7, 4);
        }
        zzajgVar.zzk(i7, zzamwVar.zza());
        switch (zzajq.zzb[zzamwVar.ordinal()]) {
            case 1:
                zzajgVar.zzb(((Double) obj).doubleValue());
                break;
            case 2:
                zzajgVar.zzb(((Float) obj).floatValue());
                break;
            case 3:
                zzajgVar.zzj(((Long) obj).longValue());
                break;
            case 4:
                zzajgVar.zzj(((Long) obj).longValue());
                break;
            case 5:
                zzajgVar.zzl(((Integer) obj).intValue());
                break;
            case 6:
                zzajgVar.zzh(((Long) obj).longValue());
                break;
            case 7:
                zzajgVar.zzk(((Integer) obj).intValue());
                break;
            case 8:
                zzajgVar.zzb(((Boolean) obj).booleanValue());
                break;
            case 9:
                ((zzalc) obj).zza(zzajgVar);
                break;
            case 10:
                zzajgVar.zzc((zzalc) obj);
                break;
            case 11:
                if (obj instanceof zzaip) {
                    zzajgVar.zzb((zzaip) obj);
                } else {
                    zzajgVar.zzb((String) obj);
                }
                break;
            case 12:
                if (obj instanceof zzaip) {
                    zzajgVar.zzb((zzaip) obj);
                } else {
                    byte[] bArr = (byte[]) obj;
                    zzajgVar.zzb(bArr, 0, bArr.length);
                }
                break;
            case 13:
                zzajgVar.zzn(((Integer) obj).intValue());
                break;
            case 14:
                zzajgVar.zzk(((Integer) obj).intValue());
                break;
            case 15:
                zzajgVar.zzh(((Long) obj).longValue());
                break;
            case 16:
                zzajgVar.zzm(((Integer) obj).intValue());
                break;
            case 17:
                zzajgVar.zzi(((Long) obj).longValue());
                break;
            case 18:
                if (obj instanceof zzaka) {
                    zzajgVar.zzl(((zzaka) obj).zza());
                } else {
                    zzajgVar.zzl(((Integer) obj).intValue());
                }
                break;
        }
    }
}
