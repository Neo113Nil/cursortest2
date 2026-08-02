package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
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
        int zzb = zzfvz.zzb(obj);
        int zzv = zzv();
        Object obj2 = this.zze;
        Objects.requireNonNull(obj2);
        int zzc = zzfvr.zzc(obj2, zzb & zzv);
        if (zzc != 0) {
            int i7 = ~zzv;
            int i8 = zzb & i7;
            do {
                int i9 = zzc - 1;
                int i10 = zzA()[i9];
                if ((i10 & i7) == i8 && zzfte.zza(obj, zzB()[i9])) {
                    return i9;
                }
                zzc = i10 & zzv;
            } while (zzc != 0);
        }
        return -1;
    }

    private final int zzx(int i7, int i8, int i9, int i10) {
        int i11 = i8 - 1;
        Object zzd2 = zzfvr.zzd(i8);
        if (i10 != 0) {
            zzfvr.zze(zzd2, i9 & i11, i10 + 1);
        }
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] zzA = zzA();
        for (int i12 = 0; i12 <= i7; i12++) {
            int zzc = zzfvr.zzc(obj, i12);
            while (zzc != 0) {
                int i13 = zzc - 1;
                int i14 = zzA[i13];
                int i15 = ((~i7) & i14) | i12;
                int i16 = i15 & i11;
                int zzc2 = zzfvr.zzc(zzd2, i16);
                zzfvr.zze(zzd2, i16, zzc);
                zzA[i13] = ((~i11) & i15) | (zzc2 & i11);
                zzc = i14 & i7;
            }
        }
        this.zze = zzd2;
        zzz(i11);
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzy(Object obj) {
        if (!zzr()) {
            int zzv = zzv();
            Object obj2 = this.zze;
            Objects.requireNonNull(obj2);
            int zzb = zzfvr.zzb(obj, null, zzv, obj2, zzA(), zzB(), null);
            if (zzb != -1) {
                Object obj3 = zzC()[zzb];
                zzq(zzb, zzv);
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
        Map zzl = zzl();
        if (zzl != null) {
            this.zzf = zzfzk.zzc(size(), 3, 1073741823);
            zzl.clear();
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
        Map zzl = zzl();
        return zzl != null ? zzl.containsKey(obj) : zzw(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.containsValue(obj);
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
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.get(obj);
        }
        int zzw = zzw(obj);
        if (zzw == -1) {
            return null;
        }
        return zzC()[zzw];
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
        int min;
        if (zzr()) {
            zzfth.zzm(zzr(), "Arrays already allocated");
            int i7 = this.zzf;
            int max = Math.max(i7 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.zze = zzfvr.zzd(max2);
            zzz(max2 - 1);
            this.zza = new int[i7];
            this.zzb = new Object[i7];
            this.zzc = new Object[i7];
        }
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.put(obj, obj2);
        }
        int[] zzA = zzA();
        Object[] zzB = zzB();
        Object[] zzC = zzC();
        int i8 = this.zzg;
        int i9 = i8 + 1;
        int zzb = zzfvz.zzb(obj);
        int zzv = zzv();
        int i10 = zzb & zzv;
        Object obj3 = this.zze;
        Objects.requireNonNull(obj3);
        int zzc = zzfvr.zzc(obj3, i10);
        if (zzc != 0) {
            int i11 = ~zzv;
            int i12 = zzb & i11;
            int i13 = 0;
            while (true) {
                int i14 = zzc - 1;
                int i15 = zzA[i14];
                int i16 = i15 & i11;
                if (i16 == i12 && zzfte.zza(obj, zzB[i14])) {
                    Object obj4 = zzC[i14];
                    zzC[i14] = obj2;
                    return obj4;
                }
                int i17 = i15 & zzv;
                i13++;
                if (i17 != 0) {
                    zzc = i17;
                } else {
                    if (i13 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(zzv() + 1, 1.0f);
                        int zze = zze();
                        while (zze >= 0) {
                            linkedHashMap.put(zzB()[zze], zzC()[zze]);
                            zze = zzf(zze);
                        }
                        this.zze = linkedHashMap;
                        this.zza = null;
                        this.zzb = null;
                        this.zzc = null;
                        zzo();
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i9 > zzv) {
                        zzv = zzx(zzv, zzfvr.zza(zzv), zzb, i8);
                    } else {
                        zzA[i14] = (i9 & zzv) | i16;
                    }
                }
            }
        } else if (i9 > zzv) {
            zzv = zzx(zzv, zzfvr.zza(zzv), zzb, i8);
        } else {
            Object obj5 = this.zze;
            Objects.requireNonNull(obj5);
            zzfvr.zze(obj5, i10, i9);
        }
        int length = zzA().length;
        if (i9 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.zza = Arrays.copyOf(zzA(), min);
            this.zzb = Arrays.copyOf(zzB(), min);
            this.zzc = Arrays.copyOf(zzC(), min);
        }
        zzA()[i8] = (~zzv) & zzb;
        zzB()[i8] = obj;
        zzC()[i8] = obj2;
        this.zzg = i9;
        zzo();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.remove(obj);
        }
        Object zzy = zzy(obj);
        if (zzy == zzd) {
            return null;
        }
        return zzy;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map zzl = zzl();
        return zzl != null ? zzl.size() : this.zzg;
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
        int[] zzA = zzA();
        Object[] zzB = zzB();
        Object[] zzC = zzC();
        int size = size();
        int i9 = size - 1;
        if (i7 >= i9) {
            zzB[i7] = null;
            zzC[i7] = null;
            zzA[i7] = 0;
            return;
        }
        int i10 = i7 + 1;
        Object obj2 = zzB[i9];
        zzB[i7] = obj2;
        zzC[i7] = zzC[i9];
        zzB[i9] = null;
        zzC[i9] = null;
        zzA[i7] = zzA[i9];
        zzA[i9] = 0;
        int zzb = zzfvz.zzb(obj2) & i8;
        int zzc = zzfvr.zzc(obj, zzb);
        if (zzc == size) {
            zzfvr.zze(obj, zzb, i10);
            return;
        }
        while (true) {
            int i11 = zzc - 1;
            int i12 = zzA[i11];
            int i13 = i12 & i8;
            if (i13 == size) {
                zzA[i11] = (i12 & (~i8)) | (i8 & i10);
                return;
            }
            zzc = i13;
        }
    }

    public final boolean zzr() {
        return this.zze == null;
    }

    public zzfvq(int i7) {
        zzp(8);
    }
}
