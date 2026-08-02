package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbdi extends com.google.android.libraries.places.internal.zzbcb implements java.util.RandomAccess, com.google.android.libraries.places.internal.zzbdx, com.google.android.libraries.places.internal.zzbfg {
    private static final float[] zza;
    private float[] zzb;
    private int zzc;

    static {
        float[] fArr = new float[0];
        zza = fArr;
        new com.google.android.libraries.places.internal.zzbdi(fArr, 0, false);
    }

    zzbdi() {
        this(zza, 0, true);
    }

    private static int zzh(int i) {
        return java.lang.Math.max(((i * 3) / 2) + 1, 10);
    }

    private final void zzi(int i) {
        if (i < 0 || i >= this.zzc) {
            throw new java.lang.IndexOutOfBoundsException(zzj(i));
        }
    }

    private final java.lang.String zzj(int i) {
        return com.google.android.libraries.places.internal.zzbce.zzb(this.zzc, i, (byte) 13, "Index:", ", Size:");
    }

    @Override // com.google.android.libraries.places.internal.zzbcb, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        int i2;
        float floatValue = ((java.lang.Float) obj).floatValue();
        zzbO();
        if (i < 0 || i > (i2 = this.zzc)) {
            throw new java.lang.IndexOutOfBoundsException(zzj(i));
        }
        int i3 = i + 1;
        float[] fArr = this.zzb;
        int length = fArr.length;
        if (i2 < length) {
            java.lang.System.arraycopy(fArr, i, fArr, i3, i2 - i);
        } else {
            float[] fArr2 = new float[zzh(length)];
            java.lang.System.arraycopy(this.zzb, 0, fArr2, 0, i);
            java.lang.System.arraycopy(this.zzb, i, fArr2, i3, this.zzc - i);
            this.zzb = fArr2;
        }
        this.zzb[i] = floatValue;
        this.zzc++;
        this.modCount++;
    }

    @Override // com.google.android.libraries.places.internal.zzbcb, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        zzbO();
        if (!(collection instanceof com.google.android.libraries.places.internal.zzbdi)) {
            return super.addAll(collection);
        }
        com.google.android.libraries.places.internal.zzbdi zzbdiVar = (com.google.android.libraries.places.internal.zzbdi) collection;
        int i = zzbdiVar.zzc;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzc;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.zzb;
        if (i3 > fArr.length) {
            this.zzb = java.util.Arrays.copyOf(fArr, i3);
        }
        java.lang.System.arraycopy(zzbdiVar.zzb, 0, this.zzb, this.zzc, zzbdiVar.zzc);
        this.zzc = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.libraries.places.internal.zzbcb, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.internal.zzbdi)) {
            return super.equals(obj);
        }
        com.google.android.libraries.places.internal.zzbdi zzbdiVar = (com.google.android.libraries.places.internal.zzbdi) obj;
        if (this.zzc != zzbdiVar.zzc) {
            return false;
        }
        float[] fArr = zzbdiVar.zzb;
        for (int i = 0; i < this.zzc; i++) {
            if (java.lang.Float.floatToIntBits(this.zzb[i]) != java.lang.Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        zzi(i);
        return java.lang.Float.valueOf(this.zzb[i]);
    }

    @Override // com.google.android.libraries.places.internal.zzbcb, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            i = (i * 31) + java.lang.Float.floatToIntBits(this.zzb[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Float)) {
            return -1;
        }
        float floatValue = ((java.lang.Float) obj).floatValue();
        int i = this.zzc;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.zzb[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.libraries.places.internal.zzbcb, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object remove(int i) {
        zzbO();
        zzi(i);
        float[] fArr = this.zzb;
        float f = fArr[i];
        if (i < this.zzc - 1) {
            java.lang.System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.zzc--;
        this.modCount++;
        return java.lang.Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzbO();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.zzb;
        java.lang.System.arraycopy(fArr, i2, fArr, i, this.zzc - i2);
        this.zzc -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.libraries.places.internal.zzbcb, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        float floatValue = ((java.lang.Float) obj).floatValue();
        zzbO();
        zzi(i);
        float[] fArr = this.zzb;
        float f = fArr[i];
        fArr[i] = floatValue;
        return java.lang.Float.valueOf(f);
    }

    @Override // com.google.android.libraries.places.internal.zzbea, com.google.android.libraries.places.internal.zzbds
    /* renamed from: zzd */
    public final com.google.android.libraries.places.internal.zzbdx zzg(int i) {
        if (i >= this.zzc) {
            return new com.google.android.libraries.places.internal.zzbdi(i == 0 ? zza : java.util.Arrays.copyOf(this.zzb, i), this.zzc, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public final float zze(int i) {
        zzi(i);
        return this.zzb[i];
    }

    public final void zzf(float f) {
        zzbO();
        int i = this.zzc;
        int length = this.zzb.length;
        if (i == length) {
            float[] fArr = new float[zzh(length)];
            java.lang.System.arraycopy(this.zzb, 0, fArr, 0, this.zzc);
            this.zzb = fArr;
        }
        float[] fArr2 = this.zzb;
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        fArr2[i2] = f;
    }

    private zzbdi(float[] fArr, int i, boolean z) {
        super(z);
        this.zzb = fArr;
        this.zzc = i;
    }

    @Override // com.google.android.libraries.places.internal.zzbcb, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(java.lang.Object obj) {
        zzf(((java.lang.Float) obj).floatValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }
}
