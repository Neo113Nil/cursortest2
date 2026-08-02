package com.google.android.gms.internal.firebase_auth;

import com.google.android.gms.internal.firebase_auth.zzcu;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzcs<FieldDescriptorType extends zzcu<FieldDescriptorType>> {
    private static final zzcs zzod = new zzcs(true);
    private boolean zzob;
    private boolean zzoc = false;
    private final zzey<FieldDescriptorType, Object> zzoa = zzey.zzat(16);

    private zzcs() {
    }

    private zzcs(boolean z) {
        zzbs();
    }

    static int zza(zzgd zzgdVar, int i, Object obj) {
        int zzaa = zzci.zzaa(i);
        if (zzgdVar == zzgd.zzwo) {
            zzdd.zzf((zzeh) obj);
            zzaa <<= 1;
        }
        return zzaa + zzb(zzgdVar, obj);
    }

    private final Object zza(FieldDescriptorType fielddescriptortype) {
        Object obj = this.zzoa.get(fielddescriptortype);
        return obj instanceof zzdk ? zzdk.zzem() : obj;
    }

    static void zza(zzci zzciVar, zzgd zzgdVar, int i, Object obj) throws IOException {
        if (zzgdVar == zzgd.zzwo) {
            zzeh zzehVar = (zzeh) obj;
            zzdd.zzf(zzehVar);
            zzciVar.zzb(i, 3);
            zzehVar.zzb(zzciVar);
            zzciVar.zzb(i, 4);
        }
        zzciVar.zzb(i, zzgdVar.zzgk());
        switch (zzct.zzne[zzgdVar.ordinal()]) {
            case 1:
                zzciVar.zza(((Double) obj).doubleValue());
                break;
            case 2:
                zzciVar.zza(((Float) obj).floatValue());
                break;
            case 3:
                zzciVar.zza(((Long) obj).longValue());
                break;
            case 4:
                zzciVar.zza(((Long) obj).longValue());
                break;
            case 5:
                zzciVar.zzw(((Integer) obj).intValue());
                break;
            case 6:
                zzciVar.zzc(((Long) obj).longValue());
                break;
            case 7:
                zzciVar.zzz(((Integer) obj).intValue());
                break;
            case 8:
                zzciVar.zzf(((Boolean) obj).booleanValue());
                break;
            case 9:
                ((zzeh) obj).zzb(zzciVar);
                break;
            case 10:
                zzciVar.zzb((zzeh) obj);
                break;
            case 11:
                if (!(obj instanceof zzbu)) {
                    zzciVar.zzal((String) obj);
                    break;
                } else {
                    zzciVar.zza((zzbu) obj);
                    break;
                }
            case 12:
                if (!(obj instanceof zzbu)) {
                    byte[] bArr = (byte[]) obj;
                    zzciVar.zze(bArr, 0, bArr.length);
                    break;
                } else {
                    zzciVar.zza((zzbu) obj);
                    break;
                }
            case 13:
                zzciVar.zzx(((Integer) obj).intValue());
                break;
            case 14:
                zzciVar.zzz(((Integer) obj).intValue());
                break;
            case 15:
                zzciVar.zzc(((Long) obj).longValue());
                break;
            case 16:
                zzciVar.zzy(((Integer) obj).intValue());
                break;
            case 17:
                zzciVar.zzb(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof zzde)) {
                    zzciVar.zzw(((Integer) obj).intValue());
                    break;
                } else {
                    zzciVar.zzw(((zzde) obj).zzds());
                    break;
                }
        }
    }

    private final void zza(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.zzdv()) {
            zza(fielddescriptortype.zzdt(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                zza(fielddescriptortype.zzdt(), obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzdk) {
            this.zzoc = true;
        }
        this.zzoa.zza((zzey<FieldDescriptorType, Object>) fielddescriptortype, (FieldDescriptorType) obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if ((r3 instanceof com.google.android.gms.internal.firebase_auth.zzde) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if ((r3 instanceof byte[]) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if ((r3 instanceof com.google.android.gms.internal.firebase_auth.zzdk) == false) goto L27;
     */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zza(zzgd zzgdVar, Object obj) {
        boolean z;
        zzdd.checkNotNull(obj);
        boolean z2 = false;
        switch (zzct.zzoe[zzgdVar.zzgj().ordinal()]) {
            case 1:
                z = obj instanceof Integer;
                z2 = z;
                break;
            case 2:
                z = obj instanceof Long;
                z2 = z;
                break;
            case 3:
                z = obj instanceof Float;
                z2 = z;
                break;
            case 4:
                z = obj instanceof Double;
                z2 = z;
                break;
            case 5:
                z = obj instanceof Boolean;
                z2 = z;
                break;
            case 6:
                z = obj instanceof String;
                z2 = z;
                break;
            case 7:
                if (!(obj instanceof zzbu)) {
                    break;
                }
                z2 = true;
                break;
            case 8:
                if (!(obj instanceof Integer)) {
                    break;
                }
                z2 = true;
                break;
            case 9:
                if (!(obj instanceof zzeh)) {
                    break;
                }
                z2 = true;
                break;
        }
        if (!z2) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    private static int zzb(zzcu<?> zzcuVar, Object obj) {
        zzgd zzdt = zzcuVar.zzdt();
        int zzds = zzcuVar.zzds();
        if (!zzcuVar.zzdv()) {
            return zza(zzdt, zzds, obj);
        }
        int i = 0;
        if (zzcuVar.zzdw()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                i += zzb(zzdt, it.next());
            }
            return zzci.zzaa(zzds) + i + zzci.zzai(i);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            i += zza(zzdt, zzds, it2.next());
        }
        return i;
    }

    private static int zzb(zzgd zzgdVar, Object obj) {
        switch (zzct.zzne[zzgdVar.ordinal()]) {
            case 1:
                return zzci.zzb(((Double) obj).doubleValue());
            case 2:
                return zzci.zzb(((Float) obj).floatValue());
            case 3:
                return zzci.zzd(((Long) obj).longValue());
            case 4:
                return zzci.zze(((Long) obj).longValue());
            case 5:
                return zzci.zzab(((Integer) obj).intValue());
            case 6:
                return zzci.zzg(((Long) obj).longValue());
            case 7:
                return zzci.zzae(((Integer) obj).intValue());
            case 8:
                return zzci.zzg(((Boolean) obj).booleanValue());
            case 9:
                return zzci.zzd((zzeh) obj);
            case 10:
                return obj instanceof zzdk ? zzci.zza((zzdk) obj) : zzci.zzc((zzeh) obj);
            case 11:
                return obj instanceof zzbu ? zzci.zzb((zzbu) obj) : zzci.zzam((String) obj);
            case 12:
                return obj instanceof zzbu ? zzci.zzb((zzbu) obj) : zzci.zzc((byte[]) obj);
            case 13:
                return zzci.zzac(((Integer) obj).intValue());
            case 14:
                return zzci.zzaf(((Integer) obj).intValue());
            case 15:
                return zzci.zzh(((Long) obj).longValue());
            case 16:
                return zzci.zzad(((Integer) obj).intValue());
            case 17:
                return zzci.zzf(((Long) obj).longValue());
            case 18:
                return obj instanceof zzde ? zzci.zzag(((zzde) obj).zzds()) : zzci.zzag(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static boolean zzb(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.zzdu() == zzgi.MESSAGE) {
            if (key.zzdv()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((zzeh) it.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof zzeh)) {
                    if (value instanceof zzdk) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((zzeh) value).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    private final void zzc(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzdk) {
            value = zzdk.zzem();
        }
        if (key.zzdv()) {
            Object zza = zza((zzcs<FieldDescriptorType>) key);
            if (zza == null) {
                zza = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) zza).add(zzf(it.next()));
            }
            this.zzoa.zza((zzey<FieldDescriptorType, Object>) key, (FieldDescriptorType) zza);
            return;
        }
        if (key.zzdu() != zzgi.MESSAGE) {
            this.zzoa.zza((zzey<FieldDescriptorType, Object>) key, (FieldDescriptorType) zzf(value));
            return;
        }
        Object zza2 = zza((zzcs<FieldDescriptorType>) key);
        if (zza2 == null) {
            this.zzoa.zza((zzey<FieldDescriptorType, Object>) key, (FieldDescriptorType) zzf(value));
        } else {
            this.zzoa.zza((zzey<FieldDescriptorType, Object>) key, (FieldDescriptorType) (zza2 instanceof zzen ? key.zza((zzen) zza2, (zzen) value) : key.zza(((zzeh) zza2).zzdz(), (zzeh) value).zzed()));
        }
    }

    private static int zzd(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        return (key.zzdu() != zzgi.MESSAGE || key.zzdv() || key.zzdw()) ? zzb((zzcu<?>) key, value) : value instanceof zzdk ? zzci.zzb(entry.getKey().zzds(), (zzdk) value) : zzci.zzd(entry.getKey().zzds(), (zzeh) value);
    }

    public static <T extends zzcu<T>> zzcs<T> zzdp() {
        return zzod;
    }

    private static Object zzf(Object obj) {
        if (obj instanceof zzen) {
            return ((zzen) obj).zzfc();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzcs zzcsVar = new zzcs();
        for (int i = 0; i < this.zzoa.zzfo(); i++) {
            Map.Entry<FieldDescriptorType, Object> zzau = this.zzoa.zzau(i);
            zzcsVar.zza((zzcs) zzau.getKey(), zzau.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.zzoa.zzfp()) {
            zzcsVar.zza((zzcs) entry.getKey(), entry.getValue());
        }
        zzcsVar.zzoc = this.zzoc;
        return zzcsVar;
    }

    final Iterator<Map.Entry<FieldDescriptorType, Object>> descendingIterator() {
        return this.zzoc ? new zzdn(this.zzoa.zzfq().iterator()) : this.zzoa.zzfq().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzcs) {
            return this.zzoa.equals(((zzcs) obj).zzoa);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzoa.hashCode();
    }

    final boolean isEmpty() {
        return this.zzoa.isEmpty();
    }

    public final boolean isImmutable() {
        return this.zzob;
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.zzoa.zzfo(); i++) {
            if (!zzb(this.zzoa.zzau(i))) {
                return false;
            }
        }
        Iterator<Map.Entry<FieldDescriptorType, Object>> it = this.zzoa.zzfp().iterator();
        while (it.hasNext()) {
            if (!zzb(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Iterator<Map.Entry<FieldDescriptorType, Object>> iterator() {
        return this.zzoc ? new zzdn(this.zzoa.entrySet().iterator()) : this.zzoa.entrySet().iterator();
    }

    public final void zza(zzcs<FieldDescriptorType> zzcsVar) {
        for (int i = 0; i < zzcsVar.zzoa.zzfo(); i++) {
            zzc(zzcsVar.zzoa.zzau(i));
        }
        Iterator<Map.Entry<FieldDescriptorType, Object>> it = zzcsVar.zzoa.zzfp().iterator();
        while (it.hasNext()) {
            zzc(it.next());
        }
    }

    public final void zzbs() {
        if (this.zzob) {
            return;
        }
        this.zzoa.zzbs();
        this.zzob = true;
    }

    public final int zzdq() {
        int i = 0;
        for (int i2 = 0; i2 < this.zzoa.zzfo(); i2++) {
            Map.Entry<FieldDescriptorType, Object> zzau = this.zzoa.zzau(i2);
            i += zzb((zzcu<?>) zzau.getKey(), zzau.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.zzoa.zzfp()) {
            i += zzb((zzcu<?>) entry.getKey(), entry.getValue());
        }
        return i;
    }

    public final int zzdr() {
        int i = 0;
        for (int i2 = 0; i2 < this.zzoa.zzfo(); i2++) {
            i += zzd(this.zzoa.zzau(i2));
        }
        Iterator<Map.Entry<FieldDescriptorType, Object>> it = this.zzoa.zzfp().iterator();
        while (it.hasNext()) {
            i += zzd(it.next());
        }
        return i;
    }
}
