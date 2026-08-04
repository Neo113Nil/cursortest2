package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class zzfvq extends AbstractMap implements Serializable {
    private static final Object zzd = new Object();
    transient int[] zza;
    transient Object[] zzb;
    transient Object[] zzc;
    private transient Object zze;
    private transient int zzf;
    private transient int zzg;
    private transient Set zzh;
    private transient Set zzi;
    private transient Collection zzj;

    public zzfvq() {
        zzp(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] zzA() {
        int[] iArr = this.zza;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzB() {
        Object[] objArr = this.zzb;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzC() {
        Object[] objArr = this.zzc;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public static /* synthetic */ Object zzg(zzfvq zzfvqVar, int i7) {
        return zzfvqVar.zzB()[i7];
    }

    public static /* synthetic */ Object zzi(zzfvq zzfvqVar) {
        Object obj = zzfvqVar.zze;
        Objects.requireNonNull(obj);
        return obj;
    }

    public static /* synthetic */ Object zzj(zzfvq zzfvqVar, int i7) {
        return zzfvqVar.zzC()[i7];
    }

    public static /* synthetic */ void zzn(zzfvq zzfvqVar, int i7, Object obj) {
        zzfvqVar.zzC()[i7] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzv() {
        return (1 << (this.zzf & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzw(Object obj) {
        if (zzr()) {
            return -1;
        }
        int iZzb = zzfvz.zzb(obj);
        int iZzv = zzv();
        Object obj2 = this.zze;
        Objects.requireNonNull(obj2);
        int iZzc = zzfvr.zzc(obj2, iZzb & iZzv);
        if (iZzc != 0) {
            int i7 = ~iZzv;
            int i8 = iZzb & i7;
            do {
                int i9 = iZzc - 1;
                int i10 = zzA()[i9];
                if ((i10 & i7) == i8 && zzfte.zza(obj, zzB()[i9])) {
                    return i9;
                }
                iZzc = i10 & iZzv;
            } while (iZzc != 0);
        }
        return -1;
    }

    private final int zzx(int i7, int i8, int i9, int i10) {
        int i11 = i8 - 1;
        Object objZzd = zzfvr.zzd(i8);
        if (i10 != 0) {
            zzfvr.zze(objZzd, i9 & i11, i10 + 1);
        }
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] iArrZzA = zzA();
        for (int i12 = 0; i12 <= i7; i12++) {
            int iZzc = zzfvr.zzc(obj, i12);
            while (iZzc != 0) {
                int i13 = iZzc - 1;
                int i14 = iArrZzA[i13];
                int i15 = ((~i7) & i14) | i12;
                int i16 = i15 & i11;
                int iZzc2 = zzfvr.zzc(objZzd, i16);
                zzfvr.zze(objZzd, i16, iZzc);
                iArrZzA[i13] = ((~i11) & i15) | (iZzc2 & i11);
                iZzc = i14 & i7;
            }
        }
        this.zze = objZzd;
        zzz(i11);
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzy(Object obj) {
        if (!zzr()) {
            int iZzv = zzv();
            Object obj2 = this.zze;
            Objects.requireNonNull(obj2);
            int iZzb = zzfvr.zzb(obj, null, iZzv, obj2, zzA(), zzB(), null);
            if (iZzb != -1) {
                Object obj3 = zzC()[iZzb];
                zzq(iZzb, iZzv);
                this.zzg--;
                zzo();
                return obj3;
            }
        }
        return zzd;
    }

    private final void zzz(int i7) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i7)) & 31) | (this.zzf & (-32));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzr()) {
            return;
        }
        zzo();
        Map mapZzl = zzl();
        if (mapZzl != null) {
            this.zzf = zzfzk.zzc(size(), 3, 1073741823);
            mapZzl.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Arrays.fill(zzB(), 0, this.zzg, (Object) null);
        Arrays.fill(zzC(), 0, this.zzg, (Object) null);
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(zzA(), 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.containsKey(obj);
        }
        return zzw(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.containsValue(obj);
        }
        for (int i7 = 0; i7 < this.zzg; i7++) {
            if (zzfte.zza(obj, zzC()[i7])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zzi;
        if (set != null) {
            return set;
        }
        zzfvk zzfvkVar = new zzfvk(this);
        this.zzi = zzfvkVar;
        return zzfvkVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.get(obj);
        }
        int iZzw = zzw(obj);
        if (iZzw == -1) {
            return null;
        }
        return zzC()[iZzw];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.zzh;
        if (set != null) {
            return set;
        }
        zzfvm zzfvmVar = new zzfvm(this);
        this.zzh = zzfvmVar;
        return zzfvmVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int iMin;
        if (zzr()) {
            zzfth.zzm(zzr(), "Arrays already allocated");
            int i7 = this.zzf;
            int iMax = Math.max(i7 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.zze = zzfvr.zzd(iMax2);
            zzz(iMax2 - 1);
            this.zza = new int[i7];
            this.zzb = new Object[i7];
            this.zzc = new Object[i7];
        }
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.put(obj, obj2);
        }
        int[] iArrZzA = zzA();
        Object[] objArrZzB = zzB();
        Object[] objArrZzC = zzC();
        int i8 = this.zzg;
        int i9 = i8 + 1;
        int iZzb = zzfvz.zzb(obj);
        int iZzv = zzv();
        int i10 = iZzb & iZzv;
        Object obj3 = this.zze;
        Objects.requireNonNull(obj3);
        int iZzc = zzfvr.zzc(obj3, i10);
        if (iZzc != 0) {
            int i11 = ~iZzv;
            int i12 = iZzb & i11;
            int i13 = 0;
            while (true) {
                int i14 = iZzc - 1;
                int i15 = iArrZzA[i14];
                int i16 = i15 & i11;
                if (i16 == i12 && zzfte.zza(obj, objArrZzB[i14])) {
                    Object obj4 = objArrZzC[i14];
                    objArrZzC[i14] = obj2;
                    return obj4;
                }
                int i17 = i15 & iZzv;
                i13++;
                if (i17 == 0) {
                    if (i13 < 9) {
                        if (i9 <= iZzv) {
                            iArrZzA[i14] = (i9 & iZzv) | i16;
                            break;
                        }
                        iZzv = zzx(iZzv, zzfvr.zza(iZzv), iZzb, i8);
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(zzv() + 1, 1.0f);
                    int iZze = zze();
                    while (iZze >= 0) {
                        linkedHashMap.put(zzB()[iZze], zzC()[iZze]);
                        iZze = zzf(iZze);
                    }
                    this.zze = linkedHashMap;
                    this.zza = null;
                    this.zzb = null;
                    this.zzc = null;
                    zzo();
                    return linkedHashMap.put(obj, obj2);
                }
                iZzc = i17;
            }
        } else if (i9 > iZzv) {
            iZzv = zzx(iZzv, zzfvr.zza(iZzv), iZzb, i8);
        } else {
            Object obj5 = this.zze;
            Objects.requireNonNull(obj5);
            zzfvr.zze(obj5, i10, i9);
        }
        int length = zzA().length;
        if (i9 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.zza = Arrays.copyOf(zzA(), iMin);
            this.zzb = Arrays.copyOf(zzB(), iMin);
            this.zzc = Arrays.copyOf(zzC(), iMin);
        }
        zzA()[i8] = (~iZzv) & iZzb;
        zzB()[i8] = obj;
        zzC()[i8] = obj2;
        this.zzg = i9;
        zzo();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.remove(obj);
        }
        Object objZzy = zzy(obj);
        if (objZzy == zzd) {
            return null;
        }
        return objZzy;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapZzl = zzl();
        return mapZzl != null ? mapZzl.size() : this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzj;
        if (collection != null) {
            return collection;
        }
        zzfvo zzfvoVar = new zzfvo(this);
        this.zzj = zzfvoVar;
        return zzfvoVar;
    }

    public final int zze() {
        return isEmpty() ? -1 : 0;
    }

    public final int zzf(int i7) {
        int i8 = i7 + 1;
        if (i8 < this.zzg) {
            return i8;
        }
        return -1;
    }

    public final Map zzl() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void zzo() {
        this.zzf += 32;
    }

    public final void zzp(int i7) {
        this.zzf = zzfzk.zzc(i7, 1, 1073741823);
    }

    public final void zzq(int i7, int i8) {
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] iArrZzA = zzA();
        Object[] objArrZzB = zzB();
        Object[] objArrZzC = zzC();
        int size = size();
        int i9 = size - 1;
        if (i7 >= i9) {
            objArrZzB[i7] = null;
            objArrZzC[i7] = null;
            iArrZzA[i7] = 0;
            return;
        }
        int i10 = i7 + 1;
        Object obj2 = objArrZzB[i9];
        objArrZzB[i7] = obj2;
        objArrZzC[i7] = objArrZzC[i9];
        objArrZzB[i9] = null;
        objArrZzC[i9] = null;
        iArrZzA[i7] = iArrZzA[i9];
        iArrZzA[i9] = 0;
        int iZzb = zzfvz.zzb(obj2) & i8;
        int iZzc = zzfvr.zzc(obj, iZzb);
        if (iZzc == size) {
            zzfvr.zze(obj, iZzb, i10);
            return;
        }
        while (true) {
            int i11 = iZzc - 1;
            int i12 = iArrZzA[i11];
            int i13 = i12 & i8;
            if (i13 == size) {
                iArrZzA[i11] = (i12 & (~i8)) | (i8 & i10);
                return;
            }
            iZzc = i13;
        }
    }

    public final boolean zzr() {
        return this.zze == null;
    }

    public zzfvq(int i7) {
        zzp(8);
    }
}
