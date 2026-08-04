package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class zzgwx extends zzgvk implements RandomAccess, zzgxn, zzgza {
    private static final float[] zza;
    private static final zzgwx zzb;
    private float[] zzc;
    private int zzd;

    static {
        float[] fArr = new float[0];
        zza = fArr;
        zzb = new zzgwx(fArr, 0, false);
    }

    public zzgwx() {
        this(zza, 0, true);
    }

    public static zzgwx zze() {
        return zzb;
    }

    private static int zzj(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final String zzk(int i7) {
        return AbstractC0486a1.e(i7, this.zzd, "Index:", ", Size:");
    }

    private final void zzl(int i7) {
        if (i7 < 0 || i7 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzk(i7));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgvk, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i8;
        float fFloatValue = ((Float) obj).floatValue();
        zzdG();
        if (i7 < 0 || i7 > (i8 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzk(i7));
        }
        int i9 = i7 + 1;
        float[] fArr = this.zzc;
        int length = fArr.length;
        if (i8 < length) {
            System.arraycopy(fArr, i7, fArr, i9, i8 - i7);
        } else {
            float[] fArr2 = new float[zzj(length)];
            System.arraycopy(this.zzc, 0, fArr2, 0, i7);
            System.arraycopy(this.zzc, i7, fArr2, i9, this.zzd - i7);
            this.zzc = fArr2;
        }
        this.zzc[i7] = fFloatValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgvk, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzdG();
        byte[] bArr = zzgxt.zzb;
        collection.getClass();
        if (!(collection instanceof zzgwx)) {
            return super.addAll(collection);
        }
        zzgwx zzgwxVar = (zzgwx) collection;
        int i7 = zzgwxVar.zzd;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.zzd;
        if (f.API_PRIORITY_OTHER - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        float[] fArr = this.zzc;
        if (i9 > fArr.length) {
            this.zzc = Arrays.copyOf(fArr, i9);
        }
        System.arraycopy(zzgwxVar.zzc, 0, this.zzc, this.zzd, zzgwxVar.zzd);
        this.zzd = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgvk, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgwx)) {
            return super.equals(obj);
        }
        zzgwx zzgwxVar = (zzgwx) obj;
        if (this.zzd != zzgwxVar.zzd) {
            return false;
        }
        float[] fArr = zzgwxVar.zzc;
        for (int i7 = 0; i7 < this.zzd; i7++) {
            if (Float.floatToIntBits(this.zzc[i7]) != Float.floatToIntBits(fArr[i7])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        zzl(i7);
        return Float.valueOf(this.zzc[i7]);
    }

    @Override // com.google.android.gms.internal.ads.zzgvk, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i7 = 0; i7 < this.zzd; i7++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.zzc[i7]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i7 = this.zzd;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.zzc[i8] == fFloatValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgvk, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        zzdG();
        zzl(i7);
        float[] fArr = this.zzc;
        float f7 = fArr[i7];
        int i8 = this.zzd;
        if (i7 < i8 - 1) {
            System.arraycopy(fArr, i7 + 1, fArr, i7, (i8 - i7) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f7);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i8) {
        zzdG();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.zzc;
        System.arraycopy(fArr, i8, fArr, i7, this.zzd - i8);
        this.zzd -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgvk, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        zzdG();
        zzl(i7);
        float[] fArr = this.zzc;
        float f7 = fArr[i7];
        fArr[i7] = fFloatValue;
        return Float.valueOf(f7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    public final float zzd(int i7) {
        zzl(i7);
        return this.zzc[i7];
    }

    @Override // com.google.android.gms.internal.ads.zzgxs
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzgxn zzf(int i7) {
        if (i7 >= this.zzd) {
            return new zzgwx(i7 == 0 ? zza : Arrays.copyOf(this.zzc, i7), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zzh(float f7) {
        zzdG();
        int i7 = this.zzd;
        int length = this.zzc.length;
        if (i7 == length) {
            float[] fArr = new float[zzj(length)];
            System.arraycopy(this.zzc, 0, fArr, 0, this.zzd);
            this.zzc = fArr;
        }
        float[] fArr2 = this.zzc;
        int i8 = this.zzd;
        this.zzd = i8 + 1;
        fArr2[i8] = f7;
    }

    public final void zzi(int i7) {
        int length = this.zzc.length;
        if (i7 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new float[Math.max(i7, 10)];
            return;
        }
        while (length < i7) {
            length = zzj(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zzgwx(float[] fArr, int i7, boolean z4) {
        super(z4);
        this.zzc = fArr;
        this.zzd = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzgvk, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Float) obj).floatValue());
        return true;
    }
}
