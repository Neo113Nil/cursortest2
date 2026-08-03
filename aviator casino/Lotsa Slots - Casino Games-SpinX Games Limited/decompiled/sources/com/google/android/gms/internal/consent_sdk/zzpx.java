package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
final class zzpx extends com.google.android.gms.internal.consent_sdk.zzpb implements java.util.RandomAccess, com.google.android.gms.internal.consent_sdk.zzqr {
    private static final double[] zza;
    private double[] zzb;
    private int zzc;

    static {
        double[] dArr = new double[0];
        zza = dArr;
        new com.google.android.gms.internal.consent_sdk.zzpx(dArr, 0, false);
    }

    zzpx() {
        this(zza, 0, true);
    }

    private static int zzf(int i) {
        return java.lang.Math.max(((i * 3) / 2) + 1, 10);
    }

    private final java.lang.String zzg(int i) {
        return "Index:" + i + ", Size:" + this.zzc;
    }

    private final void zzh(int i) {
        if (i < 0 || i >= this.zzc) {
            throw new java.lang.IndexOutOfBoundsException(zzg(i));
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        int i2;
        double doubleValue = ((java.lang.Double) obj).doubleValue();
        zza();
        if (i < 0 || i > (i2 = this.zzc)) {
            throw new java.lang.IndexOutOfBoundsException(zzg(i));
        }
        int i3 = i + 1;
        double[] dArr = this.zzb;
        int length = dArr.length;
        if (i2 < length) {
            java.lang.System.arraycopy(dArr, i, dArr, i3, i2 - i);
        } else {
            double[] dArr2 = new double[zzf(length)];
            java.lang.System.arraycopy(this.zzb, 0, dArr2, 0, i);
            java.lang.System.arraycopy(this.zzb, i, dArr2, i3, this.zzc - i);
            this.zzb = dArr2;
        }
        this.zzb[i] = doubleValue;
        this.zzc++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        zza();
        byte[] bArr = com.google.android.gms.internal.consent_sdk.zzqs.zzb;
        collection.getClass();
        if (!(collection instanceof com.google.android.gms.internal.consent_sdk.zzpx)) {
            return super.addAll(collection);
        }
        com.google.android.gms.internal.consent_sdk.zzpx zzpxVar = (com.google.android.gms.internal.consent_sdk.zzpx) collection;
        int i = zzpxVar.zzc;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzc;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.zzb;
        if (i3 > dArr.length) {
            this.zzb = java.util.Arrays.copyOf(dArr, i3);
        }
        java.lang.System.arraycopy(zzpxVar.zzb, 0, this.zzb, this.zzc, zzpxVar.zzc);
        this.zzc = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.consent_sdk.zzpx)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.consent_sdk.zzpx zzpxVar = (com.google.android.gms.internal.consent_sdk.zzpx) obj;
        if (this.zzc != zzpxVar.zzc) {
            return false;
        }
        double[] dArr = zzpxVar.zzb;
        for (int i = 0; i < this.zzc; i++) {
            if (java.lang.Double.doubleToLongBits(this.zzb[i]) != java.lang.Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        zzh(i);
        return java.lang.Double.valueOf(this.zzb[i]);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            long doubleToLongBits = java.lang.Double.doubleToLongBits(this.zzb[i2]);
            byte[] bArr = com.google.android.gms.internal.consent_sdk.zzqs.zzb;
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
        int i = this.zzc;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.zzb[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int i) {
        zza();
        zzh(i);
        double[] dArr = this.zzb;
        double d = dArr[i];
        if (i < this.zzc - 1) {
            java.lang.System.arraycopy(dArr, i + 1, dArr, i, (r3 - i) - 1);
        }
        this.zzc--;
        this.modCount++;
        return java.lang.Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zza();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.zzb;
        java.lang.System.arraycopy(dArr, i2, dArr, i, this.zzc - i2);
        this.zzc -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        double doubleValue = ((java.lang.Double) obj).doubleValue();
        zza();
        zzh(i);
        double[] dArr = this.zzb;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return java.lang.Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqr
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.consent_sdk.zzqr zzd(int i) {
        if (i >= this.zzc) {
            return new com.google.android.gms.internal.consent_sdk.zzpx(i == 0 ? zza : java.util.Arrays.copyOf(this.zzb, i), this.zzc, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public final double zze(int i) {
        zzh(i);
        return this.zzb[i];
    }

    private zzpx(double[] dArr, int i, boolean z) {
        super(z);
        this.zzb = dArr;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        double doubleValue = ((java.lang.Double) obj).doubleValue();
        zza();
        int i = this.zzc;
        int length = this.zzb.length;
        if (i == length) {
            double[] dArr = new double[zzf(length)];
            java.lang.System.arraycopy(this.zzb, 0, dArr, 0, this.zzc);
            this.zzb = dArr;
        }
        double[] dArr2 = this.zzb;
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        dArr2[i2] = doubleValue;
        return true;
    }
}
