package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.Spliterators;

/* JADX INFO: loaded from: classes.dex */
final class zzfzj extends AbstractList implements RandomAccess, Serializable {
    final int[] zza;
    final int zzb;
    final int zzc;

    public zzfzj(int[] iArr, int i7, int i8) {
        this.zza = iArr;
        this.zzb = i7;
        this.zzc = i8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Integer) && zzfzk.zza(this.zza, ((Integer) obj).intValue(), this.zzb, this.zzc) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfzj)) {
            return super.equals(obj);
        }
        zzfzj zzfzjVar = (zzfzj) obj;
        int i7 = this.zzc - this.zzb;
        if (zzfzjVar.zzc - zzfzjVar.zzb != i7) {
            return false;
        }
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.zza[this.zzb + i8] != zzfzjVar.zza[zzfzjVar.zzb + i8]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i7) {
        zzfth.zza(i7, this.zzc - this.zzb, "index");
        return Integer.valueOf(this.zza[this.zzb + i7]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = this.zzb; i8 < this.zzc; i8++) {
            i7 = (i7 * 31) + this.zza[i8];
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int iZza;
        if (!(obj instanceof Integer) || (iZza = zzfzk.zza(this.zza, ((Integer) obj).intValue(), this.zzb, this.zzc)) < 0) {
            return -1;
        }
        return iZza - this.zzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.zza;
            int iIntValue = ((Integer) obj).intValue();
            int i7 = this.zzb;
            int i8 = this.zzc - 1;
            while (i8 >= i7) {
                if (iArr[i8] != iIntValue) {
                    i8--;
                } else if (i8 >= 0) {
                    return i8 - this.zzb;
                }
            }
            i8 = -1;
            if (i8 >= 0) {
                return i8 - this.zzb;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        Integer num = (Integer) obj;
        zzfth.zza(i7, this.zzc - this.zzb, "index");
        int[] iArr = this.zza;
        int i8 = this.zzb + i7;
        int i9 = iArr[i8];
        num.getClass();
        iArr[i8] = num.intValue();
        return Integer.valueOf(i9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc - this.zzb;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return Spliterators.spliterator(this.zza, this.zzb, this.zzc, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i7, int i8) {
        zzfth.zzk(i7, i8, this.zzc - this.zzb);
        if (i7 == i8) {
            return Collections.emptyList();
        }
        int[] iArr = this.zza;
        int i9 = this.zzb;
        return new zzfzj(iArr, i9 + i7, i8 + i9);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder((this.zzc - this.zzb) * 5);
        sb.append('[');
        sb.append(this.zza[this.zzb]);
        int i7 = this.zzb;
        while (true) {
            i7++;
            if (i7 >= this.zzc) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(this.zza[i7]);
        }
    }
}
