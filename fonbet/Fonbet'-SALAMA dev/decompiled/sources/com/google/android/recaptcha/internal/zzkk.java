package com.google.android.recaptcha.internal;

import W5.AbstractC0486a1;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzkk extends zzii implements RandomAccess, zzkz, zzmf {
    private float[] zza;
    private int zzb;

    static {
        new zzkk(new float[0], 0, false);
    }

    public zzkk() {
        this(new float[10], 0, true);
    }

    private final String zzg(int i7) {
        return AbstractC0486a1.e(i7, this.zzb, "Index:", ", Size:");
    }

    private final void zzh(int i7) {
        if (i7 < 0 || i7 >= this.zzb) {
            throw new IndexOutOfBoundsException(zzg(i7));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzii, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i8;
        float floatValue = ((Float) obj).floatValue();
        zza();
        if (i7 < 0 || i7 > (i8 = this.zzb)) {
            throw new IndexOutOfBoundsException(zzg(i7));
        }
        int i9 = i7 + 1;
        float[] fArr = this.zza;
        if (i8 < fArr.length) {
            System.arraycopy(fArr, i7, fArr, i9, i8 - i7);
        } else {
            float[] fArr2 = new float[AbstractC0486a1.q(i8, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i7);
            System.arraycopy(this.zza, i7, fArr2, i9, this.zzb - i7);
            this.zza = fArr2;
        }
        this.zza[i7] = floatValue;
        this.zzb++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzii, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzla.zzb;
        collection.getClass();
        if (!(collection instanceof zzkk)) {
            return super.addAll(collection);
        }
        zzkk zzkkVar = (zzkk) collection;
        int i7 = zzkkVar.zzb;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.zzb;
        if (f.API_PRIORITY_OTHER - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        float[] fArr = this.zza;
        if (i9 > fArr.length) {
            this.zza = Arrays.copyOf(fArr, i9);
        }
        System.arraycopy(zzkkVar.zza, 0, this.zza, this.zzb, zzkkVar.zzb);
        this.zzb = i9;
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
        if (!(obj instanceof zzkk)) {
            return super.equals(obj);
        }
        zzkk zzkkVar = (zzkk) obj;
        if (this.zzb != zzkkVar.zzb) {
            return false;
        }
        float[] fArr = zzkkVar.zza;
        for (int i7 = 0; i7 < this.zzb; i7++) {
            if (Float.floatToIntBits(this.zza[i7]) != Float.floatToIntBits(fArr[i7])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        zzh(i7);
        return Float.valueOf(this.zza[i7]);
    }

    @Override // com.google.android.recaptcha.internal.zzii, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.zzb; i8++) {
            i7 = (i7 * 31) + Float.floatToIntBits(this.zza[i8]);
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i7 = this.zzb;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.zza[i8] == floatValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // com.google.android.recaptcha.internal.zzii, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        zza();
        zzh(i7);
        float[] fArr = this.zza;
        float f7 = fArr[i7];
        if (i7 < this.zzb - 1) {
            System.arraycopy(fArr, i7 + 1, fArr, i7, (r2 - i7) - 1);
        }
        this.zzb--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f7);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i8) {
        zza();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.zza;
        System.arraycopy(fArr, i8, fArr, i7, this.zzb - i8);
        this.zzb -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzii, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        zza();
        zzh(i7);
        float[] fArr = this.zza;
        float f7 = fArr[i7];
        fArr[i7] = floatValue;
        return Float.valueOf(f7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzkz
    public final /* bridge */ /* synthetic */ zzkz zzd(int i7) {
        if (i7 >= this.zzb) {
            return new zzkk(Arrays.copyOf(this.zza, i7), this.zzb, true);
        }
        throw new IllegalArgumentException();
    }

    public final float zze(int i7) {
        zzh(i7);
        return this.zza[i7];
    }

    public final void zzf(float f7) {
        zza();
        int i7 = this.zzb;
        float[] fArr = this.zza;
        if (i7 == fArr.length) {
            float[] fArr2 = new float[AbstractC0486a1.q(i7, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i7);
            this.zza = fArr2;
        }
        float[] fArr3 = this.zza;
        int i8 = this.zzb;
        this.zzb = i8 + 1;
        fArr3[i8] = f7;
    }

    private zzkk(float[] fArr, int i7, boolean z4) {
        super(z4);
        this.zza = fArr;
        this.zzb = i7;
    }

    @Override // com.google.android.recaptcha.internal.zzii, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Float) obj).floatValue());
        return true;
    }
}
