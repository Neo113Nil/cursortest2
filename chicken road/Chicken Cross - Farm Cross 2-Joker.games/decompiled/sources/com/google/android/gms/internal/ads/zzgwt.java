package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzgwt extends AbstractMap implements Serializable {
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

    zzgwt() {
        zza(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzA, reason: merged with bridge method [inline-methods] */
    public final int[] zzl() {
        return (int[]) Objects.requireNonNull(this.zza);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzB, reason: merged with bridge method [inline-methods] */
    public final Object[] zzm() {
        return (Object[]) Objects.requireNonNull(this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzC, reason: merged with bridge method [inline-methods] */
    public final Object[] zzn() {
        return (Object[]) Objects.requireNonNull(this.zzc);
    }

    private final void zzv(int i) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.zzf & (-32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzw, reason: merged with bridge method [inline-methods] */
    public final int zzh() {
        return (1 << (this.zzf & 31)) - 1;
    }

    private final int zzx(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object zza = zzgwu.zza(i2);
        if (i4 != 0) {
            zzgwu.zzc(zza, i3 & i5, i4 + 1);
        }
        Object requireNonNull = Objects.requireNonNull(this.zze);
        int[] zzl = zzl();
        for (int i6 = 0; i6 <= i; i6++) {
            int zzb = zzgwu.zzb(requireNonNull, i6);
            while (zzb != 0) {
                int i7 = zzb - 1;
                int i8 = zzl[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int zzb2 = zzgwu.zzb(zza, i10);
                zzgwu.zzc(zza, i10, zzb);
                zzl[i7] = ((~i5) & i9) | (zzb2 & i5);
                zzb = i8 & i;
            }
        }
        this.zze = zza;
        zzv(i5);
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzy, reason: merged with bridge method [inline-methods] */
    public final int zzi(Object obj) {
        if (zzb()) {
            return -1;
        }
        int zzb = zzgxf.zzb(obj);
        int zzh = zzh();
        int zzb2 = zzgwu.zzb(Objects.requireNonNull(this.zze), zzb & zzh);
        if (zzb2 != 0) {
            int i = ~zzh;
            int i2 = zzb & i;
            do {
                int i3 = zzb2 - 1;
                int i4 = zzl()[i3];
                if ((i4 & i) == i2 && Objects.equals(obj, zzm()[i3])) {
                    return i3;
                }
                zzb2 = i4 & zzh;
            } while (zzb2 != 0);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public final Object zzj(Object obj) {
        if (!zzb()) {
            int zzh = zzh();
            int zze = zzgwu.zze(obj, null, zzh, Objects.requireNonNull(this.zze), zzl(), zzm(), null);
            if (zze != -1) {
                Object obj2 = zzn()[zze];
                zze(zze, zzh);
                this.zzg--;
                zzd();
                return obj2;
            }
        }
        return zzd;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzb()) {
            return;
        }
        zzd();
        Map zzc = zzc();
        if (zzc != null) {
            this.zzf = zzhbj.zzc(size(), 3, LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
            zzc.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Arrays.fill(zzm(), 0, this.zzg, (Object) null);
        Arrays.fill(zzn(), 0, this.zzg, (Object) null);
        Object requireNonNull = Objects.requireNonNull(this.zze);
        if (requireNonNull instanceof byte[]) {
            Arrays.fill((byte[]) requireNonNull, (byte) 0);
        } else if (requireNonNull instanceof short[]) {
            Arrays.fill((short[]) requireNonNull, (short) 0);
        } else {
            Arrays.fill((int[]) requireNonNull, 0);
        }
        Arrays.fill(zzl(), 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map zzc = zzc();
        return zzc != null ? zzc.containsKey(obj) : zzi(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map zzc = zzc();
        if (zzc != null) {
            return zzc.containsValue(obj);
        }
        for (int i = 0; i < this.zzg; i++) {
            if (Objects.equals(obj, zzn()[i])) {
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
        zzgwo zzgwoVar = new zzgwo(this, null);
        this.zzi = zzgwoVar;
        return zzgwoVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map zzc = zzc();
        if (zzc != null) {
            return zzc.get(obj);
        }
        int zzi = zzi(obj);
        if (zzi == -1) {
            return null;
        }
        return zzn()[zzi];
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
        zzgwq zzgwqVar = new zzgwq(this, null);
        this.zzh = zzgwqVar;
        return zzgwqVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int min;
        if (zzb()) {
            zzguk.zzj(zzb(), "Arrays already allocated");
            int i = this.zzf;
            int max = Math.max(i + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.zze = zzgwu.zza(max2);
            zzv(max2 - 1);
            this.zza = new int[i];
            this.zzb = new Object[i];
            this.zzc = new Object[i];
        }
        Map zzc = zzc();
        if (zzc != null) {
            return zzc.put(obj, obj2);
        }
        int[] zzl = zzl();
        Object[] zzm = zzm();
        Object[] zzn = zzn();
        int i2 = this.zzg;
        int i3 = i2 + 1;
        int zzb = zzgxf.zzb(obj);
        int zzh = zzh();
        int i4 = zzb & zzh;
        int zzb2 = zzgwu.zzb(Objects.requireNonNull(this.zze), i4);
        if (zzb2 != 0) {
            int i5 = ~zzh;
            int i6 = zzb & i5;
            int i7 = 0;
            while (true) {
                int i8 = zzb2 - 1;
                int i9 = zzl[i8];
                int i10 = i9 & i5;
                if (i10 == i6 && Objects.equals(obj, zzm[i8])) {
                    Object obj3 = zzn[i8];
                    zzn[i8] = obj2;
                    return obj3;
                }
                int i11 = i9 & zzh;
                i7++;
                if (i11 != 0) {
                    zzb2 = i11;
                } else {
                    if (i7 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(zzh() + 1, 1.0f);
                        int zzf = zzf();
                        while (zzf >= 0) {
                            linkedHashMap.put(zzm()[zzf], zzn()[zzf]);
                            zzf = zzg(zzf);
                        }
                        this.zze = linkedHashMap;
                        this.zza = null;
                        this.zzb = null;
                        this.zzc = null;
                        zzd();
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i3 > zzh) {
                        zzh = zzx(zzh, zzgwu.zzd(zzh), zzb, i2);
                    } else {
                        zzl[i8] = (i3 & zzh) | i10;
                    }
                }
            }
        } else if (i3 > zzh) {
            zzh = zzx(zzh, zzgwu.zzd(zzh), zzb, i2);
        } else {
            zzgwu.zzc(Objects.requireNonNull(this.zze), i4, i3);
        }
        int length = zzl().length;
        if (i3 > length && (min = Math.min(LockFreeTaskQueueCore.MAX_CAPACITY_MASK, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.zza = Arrays.copyOf(zzl(), min);
            this.zzb = Arrays.copyOf(zzm(), min);
            this.zzc = Arrays.copyOf(zzn(), min);
        }
        zzl()[i2] = (~zzh) & zzb;
        zzm()[i2] = obj;
        zzn()[i2] = obj2;
        this.zzg = i3;
        zzd();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map zzc = zzc();
        if (zzc != null) {
            return zzc.remove(obj);
        }
        Object zzj = zzj(obj);
        if (zzj == zzd) {
            return null;
        }
        return zzj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map zzc = zzc();
        return zzc != null ? zzc.size() : this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzj;
        if (collection != null) {
            return collection;
        }
        zzgws zzgwsVar = new zzgws(this, null);
        this.zzj = zzgwsVar;
        return zzgwsVar;
    }

    final void zza(int i) {
        this.zzf = zzhbj.zzc(i, 1, LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
    }

    final boolean zzb() {
        return this.zze == null;
    }

    final Map zzc() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    final void zzd() {
        this.zzf += 32;
    }

    final void zze(int i, int i2) {
        Object requireNonNull = Objects.requireNonNull(this.zze);
        int[] zzl = zzl();
        Object[] zzm = zzm();
        Object[] zzn = zzn();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            zzm[i] = null;
            zzn[i] = null;
            zzl[i] = 0;
            return;
        }
        int i4 = i + 1;
        Object obj = zzm[i3];
        zzm[i] = obj;
        zzn[i] = zzn[i3];
        zzm[i3] = null;
        zzn[i3] = null;
        zzl[i] = zzl[i3];
        zzl[i3] = 0;
        int zzb = zzgxf.zzb(obj) & i2;
        int zzb2 = zzgwu.zzb(requireNonNull, zzb);
        if (zzb2 == size) {
            zzgwu.zzc(requireNonNull, zzb, i4);
            return;
        }
        while (true) {
            int i5 = zzb2 - 1;
            int i6 = zzl[i5];
            int i7 = i6 & i2;
            if (i7 == size) {
                zzl[i5] = (i6 & (~i2)) | (i2 & i4);
                return;
            }
            zzb2 = i7;
        }
    }

    final int zzf() {
        return isEmpty() ? -1 : 0;
    }

    final int zzg(int i) {
        int i2 = i + 1;
        if (i2 < this.zzg) {
            return i2;
        }
        return -1;
    }

    final /* synthetic */ Object zzk() {
        return Objects.requireNonNull(this.zze);
    }

    final /* synthetic */ Object zzo(int i) {
        return zzm()[i];
    }

    final /* synthetic */ Object zzp(int i) {
        return zzn()[i];
    }

    final /* synthetic */ void zzq(int i, Object obj) {
        zzn()[i] = obj;
    }

    final /* synthetic */ int zzs() {
        return this.zzf;
    }

    final /* synthetic */ int zzt() {
        return this.zzg;
    }

    final /* synthetic */ void zzu(int i) {
        this.zzg = i;
    }

    zzgwt(int i) {
        zza(8);
    }
}
