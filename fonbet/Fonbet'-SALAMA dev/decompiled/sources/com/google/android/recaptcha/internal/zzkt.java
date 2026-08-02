package com.google.android.recaptcha.internal;

import W5.AbstractC0486a1;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzkt extends zzii implements RandomAccess, zzkx, zzmf {
    private static final zzkt zza = new zzkt(new int[0], 0, false);
    private int[] zzb;
    private int zzc;

    public zzkt() {
        this(new int[10], 0, true);
    }

    public static zzkt zzf() {
        return zza;
    }

    private final String zzi(int i7) {
        return AbstractC0486a1.e(i7, this.zzc, "Index:", ", Size:");
    }

    private final void zzj(int i7) {
        if (i7 < 0 || i7 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzi(i7));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzii, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i8;
        int intValue = ((Integer) obj).intValue();
        zza();
        if (i7 < 0 || i7 > (i8 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzi(i7));
        }
        int i9 = i7 + 1;
        int[] iArr = this.zzb;
        if (i8 < iArr.length) {
            System.arraycopy(iArr, i7, iArr, i9, i8 - i7);
        } else {
            int[] iArr2 = new int[AbstractC0486a1.q(i8, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i7);
            System.arraycopy(this.zzb, i7, iArr2, i9, this.zzc - i7);
            this.zzb = iArr2;
        }
        this.zzb[i7] = intValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzii, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzla.zzb;
        collection.getClass();
        if (!(collection instanceof zzkt)) {
            return super.addAll(collection);
        }
        zzkt zzktVar = (zzkt) collection;
        int i7 = zzktVar.zzc;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.zzc;
        if (f.API_PRIORITY_OTHER - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        int[] iArr = this.zzb;
        if (i9 > iArr.length) {
            this.zzb = Arrays.copyOf(iArr, i9);
        }
        System.arraycopy(zzktVar.zzb, 0, this.zzb, this.zzc, zzktVar.zzc);
        this.zzc = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.recaptcha.internal.zzii, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzkt)) {
            return super.equals(obj);
        }
        zzkt zzktVar = (zzkt) obj;
        if (this.zzc != zzktVar.zzc) {
            return false;
        }
        int[] iArr = zzktVar.zzb;
        for (int i7 = 0; i7 < this.zzc; i7++) {
            if (this.zzb[i7] != iArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        zzj(i7);
        return Integer.valueOf(this.zzb[i7]);
    }

    @Override // com.google.android.recaptcha.internal.zzii, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.zzc; i8++) {
            i7 = (i7 * 31) + this.zzb[i8];
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i7 = this.zzc;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.zzb[i8] == intValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // com.google.android.recaptcha.internal.zzii, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        zza();
        zzj(i7);
        int[] iArr = this.zzb;
        int i8 = iArr[i7];
        if (i7 < this.zzc - 1) {
            System.arraycopy(iArr, i7 + 1, iArr, i7, (r2 - i7) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i8);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i8) {
        zza();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.zzb;
        System.arraycopy(iArr, i8, iArr, i7, this.zzc - i8);
        this.zzc -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzii, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zza();
        zzj(i7);
        int[] iArr = this.zzb;
        int i8 = iArr[i7];
        iArr[i7] = intValue;
        return Integer.valueOf(i8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    public final int zze(int i7) {
        zzj(i7);
        return this.zzb[i7];
    }

    @Override // com.google.android.recaptcha.internal.zzkz
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzkx zzd(int i7) {
        if (i7 >= this.zzc) {
            return new zzkt(Arrays.copyOf(this.zzb, i7), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.recaptcha.internal.zzkx
    public final void zzh(int i7) {
        zza();
        int i8 = this.zzc;
        int[] iArr = this.zzb;
        if (i8 == iArr.length) {
            int[] iArr2 = new int[AbstractC0486a1.q(i8, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i8);
            this.zzb = iArr2;
        }
        int[] iArr3 = this.zzb;
        int i9 = this.zzc;
        this.zzc = i9 + 1;
        iArr3[i9] = i7;
    }

    private zzkt(int[] iArr, int i7, boolean z4) {
        super(z4);
        this.zzb = iArr;
        this.zzc = i7;
    }

    @Override // com.google.android.recaptcha.internal.zzii, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Integer) obj).intValue());
        return true;
    }
}
