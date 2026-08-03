package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzidl extends com.google.android.gms.internal.ads.zzicm implements java.util.RandomAccess, com.google.android.gms.internal.ads.zzieh, com.google.android.gms.internal.ads.zzify {
    private static final double[] zza;
    private static final com.google.android.gms.internal.ads.zzidl zzb;
    private double[] zzc;
    private int zzd;

    static {
        double[] dArr = new double[0];
        zza = dArr;
        zzb = new com.google.android.gms.internal.ads.zzidl(dArr, 0, false);
    }

    zzidl() {
        this(zza, 0, true);
    }

    public static com.google.android.gms.internal.ads.zzidl zzd() {
        return zzb;
    }

    private static int zzj(int i) {
        return java.lang.Math.max(((i * 3) / 2) + 1, 10);
    }

    private final void zzk(int i) {
        if (i < 0 || i >= this.zzd) {
            throw new java.lang.IndexOutOfBoundsException(zzl(i));
        }
    }

    private final java.lang.String zzl(int i) {
        int i2 = this.zzd;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 13 + java.lang.String.valueOf(i2).length());
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzicm, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        int i2;
        double doubleValue = ((java.lang.Double) obj).doubleValue();
        zzdW();
        if (i < 0 || i > (i2 = this.zzd)) {
            throw new java.lang.IndexOutOfBoundsException(zzl(i));
        }
        int i3 = i + 1;
        double[] dArr = this.zzc;
        int length = dArr.length;
        if (i2 < length) {
            java.lang.System.arraycopy(dArr, i, dArr, i3, i2 - i);
        } else {
            double[] dArr2 = new double[zzj(length)];
            java.lang.System.arraycopy(this.zzc, 0, dArr2, 0, i);
            java.lang.System.arraycopy(this.zzc, i, dArr2, i3, this.zzd - i);
            this.zzc = dArr2;
        }
        this.zzc[i] = doubleValue;
        this.zzd++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzicm, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        zzdW();
        collection.getClass();
        if (!(collection instanceof com.google.android.gms.internal.ads.zzidl)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.ads.zzidl zzidlVar = (com.google.android.gms.internal.ads.zzidl) collection;
        int i = zzidlVar.zzd;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzd;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.zzc;
        if (i3 > dArr.length) {
            this.zzc = java.util.Arrays.copyOf(dArr, i3);
        }
        java.lang.System.arraycopy(zzidlVar.zzc, 0, this.zzc, this.zzd, zzidlVar.zzd);
        this.zzd = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzicm, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.zzidl)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.ads.zzidl zzidlVar = (com.google.android.gms.internal.ads.zzidl) obj;
        if (this.zzd != zzidlVar.zzd) {
            return false;
        }
        double[] dArr = zzidlVar.zzc;
        for (int i = 0; i < this.zzd; i++) {
            if (java.lang.Double.doubleToLongBits(this.zzc[i]) != java.lang.Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        zzk(i);
        return java.lang.Double.valueOf(this.zzc[i]);
    }

    @Override // com.google.android.gms.internal.ads.zzicm, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzd; i2++) {
            long doubleToLongBits = java.lang.Double.doubleToLongBits(this.zzc[i2]);
            byte[] bArr = com.google.android.gms.internal.ads.zzier.zza;
            i = (i * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Double)) {
            return -1;
        }
        double doubleValue = ((java.lang.Double) obj).doubleValue();
        int i = this.zzd;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.zzc[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzicm, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int i) {
        zzdW();
        zzk(i);
        double[] dArr = this.zzc;
        double d = dArr[i];
        if (i < this.zzd - 1) {
            java.lang.System.arraycopy(dArr, i + 1, dArr, i, (r3 - i) - 1);
        }
        this.zzd--;
        this.modCount++;
        return java.lang.Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzdW();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.zzc;
        java.lang.System.arraycopy(dArr, i2, dArr, i, this.zzd - i2);
        this.zzd -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzicm, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        double doubleValue = ((java.lang.Double) obj).doubleValue();
        zzdW();
        zzk(i);
        double[] dArr = this.zzc;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return java.lang.Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzieq
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.zzieh zzh(int i) {
        if (i >= this.zzd) {
            return new com.google.android.gms.internal.ads.zzidl(i == 0 ? zza : java.util.Arrays.copyOf(this.zzc, i), this.zzd, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public final double zzf(int i) {
        zzk(i);
        return this.zzc[i];
    }

    public final void zzg(double d) {
        zzdW();
        int i = this.zzd;
        int length = this.zzc.length;
        if (i == length) {
            double[] dArr = new double[zzj(length)];
            java.lang.System.arraycopy(this.zzc, 0, dArr, 0, this.zzd);
            this.zzc = dArr;
        }
        double[] dArr2 = this.zzc;
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        dArr2[i2] = d;
    }

    final void zzi(int i) {
        int length = this.zzc.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new double[java.lang.Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = zzj(length);
        }
        this.zzc = java.util.Arrays.copyOf(this.zzc, length);
    }

    private zzidl(double[] dArr, int i, boolean z) {
        super(z);
        this.zzc = dArr;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzicm, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        zzg(((java.lang.Double) obj).doubleValue());
        return true;
    }
}
