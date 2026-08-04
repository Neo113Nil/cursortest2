package com.google.android.gms.internal.p002firebaseauthapi;

import W5.AbstractC0486a1;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class zzain extends zzaij<Boolean> implements zzakc<Boolean>, RandomAccess {
    private static final boolean[] zza;
    private boolean[] zzb;
    private int zzc;

    static {
        boolean[] zArr = new boolean[0];
        zza = zArr;
        new zzain(zArr, 0, false);
    }

    public zzain() {
        this(zza, 0, true);
    }

    private static int zzc(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final String zzd(int i7) {
        return AbstractC0486a1.e(i7, this.zzc, "Index:", ", Size:");
    }

    private final void zze(int i7) {
        if (i7 < 0 || i7 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzd(i7));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaij, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i8;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zza();
        if (i7 < 0 || i7 > (i8 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzd(i7));
        }
        boolean[] zArr = this.zzb;
        if (i8 < zArr.length) {
            System.arraycopy(zArr, i7, zArr, i7 + 1, i8 - i7);
        } else {
            boolean[] zArr2 = new boolean[zzc(zArr.length)];
            System.arraycopy(this.zzb, 0, zArr2, 0, i7);
            System.arraycopy(this.zzb, i7, zArr2, i7 + 1, this.zzc - i7);
            this.zzb = zArr2;
        }
        this.zzb[i7] = zBooleanValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaij, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        zza();
        zzakb.zza(collection);
        if (!(collection instanceof zzain)) {
            return super.addAll(collection);
        }
        zzain zzainVar = (zzain) collection;
        int i7 = zzainVar.zzc;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.zzc;
        if (f.API_PRIORITY_OTHER - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        boolean[] zArr = this.zzb;
        if (i9 > zArr.length) {
            this.zzb = Arrays.copyOf(zArr, i9);
        }
        System.arraycopy(zzainVar.zzb, 0, this.zzb, this.zzc, zzainVar.zzc);
        this.zzc = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaij, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzain)) {
            return super.equals(obj);
        }
        zzain zzainVar = (zzain) obj;
        if (this.zzc != zzainVar.zzc) {
            return false;
        }
        boolean[] zArr = zzainVar.zzb;
        for (int i7 = 0; i7 < this.zzc; i7++) {
            if (this.zzb[i7] != zArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        return Boolean.valueOf(zzb(i7));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaij, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZza = 1;
        for (int i7 = 0; i7 < this.zzc; i7++) {
            iZza = (iZza * 31) + zzakb.zza(this.zzb[i7]);
        }
        return iZza;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (this.zzb[i7] == zBooleanValue) {
                return i7;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaij, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i7) {
        zza();
        zze(i7);
        boolean[] zArr = this.zzb;
        boolean z4 = zArr[i7];
        int i8 = this.zzc;
        if (i7 < i8 - 1) {
            System.arraycopy(zArr, i7 + 1, zArr, i7, (i8 - i7) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z4);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i8) {
        zza();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zzb;
        System.arraycopy(zArr, i8, zArr, i7, this.zzc - i8);
        this.zzc -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaij, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i7, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zza();
        zze(i7);
        boolean[] zArr = this.zzb;
        boolean z4 = zArr[i7];
        zArr[i7] = zBooleanValue;
        return Boolean.valueOf(z4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakc
    public final /* synthetic */ zzakc<Boolean> zza(int i7) {
        if (i7 >= this.zzc) {
            return new zzain(i7 == 0 ? zza : Arrays.copyOf(this.zzb, i7), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final boolean zzb(int i7) {
        zze(i7);
        return this.zzb[i7];
    }

    private zzain(boolean[] zArr, int i7, boolean z4) {
        super(z4);
        this.zzb = zArr;
        this.zzc = i7;
    }

    public final void zza(boolean z4) {
        zza();
        int i7 = this.zzc;
        boolean[] zArr = this.zzb;
        if (i7 == zArr.length) {
            boolean[] zArr2 = new boolean[zzc(zArr.length)];
            System.arraycopy(this.zzb, 0, zArr2, 0, this.zzc);
            this.zzb = zArr2;
        }
        boolean[] zArr3 = this.zzb;
        int i8 = this.zzc;
        this.zzc = i8 + 1;
        zArr3[i8] = z4;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaij, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zza(((Boolean) obj).booleanValue());
        return true;
    }
}
