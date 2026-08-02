package com.google.android.gms.internal.tapandpay;

/* loaded from: classes8.dex */
public abstract class zzbz extends com.google.android.gms.internal.tapandpay.zzbv implements java.util.Set {
    private transient com.google.android.gms.internal.tapandpay.zzby zza;

    zzbz() {
    }

    public static com.google.android.gms.internal.tapandpay.zzbz zzf(java.lang.Object obj, java.lang.Object obj2) {
        return zzk(2, obj, obj2);
    }

    static int zzg(int i) {
        int max = java.lang.Math.max(i, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return 1073741824;
            }
            throw new java.lang.IllegalArgumentException("collection too large");
        }
        int highestOneBit = java.lang.Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof com.google.android.gms.internal.tapandpay.zzbz) && zzh() && ((com.google.android.gms.internal.tapandpay.zzbz) obj).zzh() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set set = (java.util.Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        java.util.Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zza */
    public abstract com.google.android.gms.internal.tapandpay.zzcf iterator();

    boolean zzh() {
        return false;
    }

    public final com.google.android.gms.internal.tapandpay.zzby zzi() {
        com.google.android.gms.internal.tapandpay.zzby zzbyVar = this.zza;
        if (zzbyVar != null) {
            return zzbyVar;
        }
        com.google.android.gms.internal.tapandpay.zzby zzj = zzj();
        this.zza = zzj;
        return zzj;
    }

    com.google.android.gms.internal.tapandpay.zzby zzj() {
        java.lang.Object[] array = toArray();
        int i = com.google.android.gms.internal.tapandpay.zzby.zzd;
        return com.google.android.gms.internal.tapandpay.zzby.zzh(array, array.length);
    }

    private static com.google.android.gms.internal.tapandpay.zzbz zzk(int i, java.lang.Object... objArr) {
        if (i == 0) {
            return com.google.android.gms.internal.tapandpay.zzcd.zza;
        }
        if (i == 1) {
            return new com.google.android.gms.internal.tapandpay.zzce(java.util.Objects.requireNonNull(objArr[0]));
        }
        int zzg = zzg(i);
        java.lang.Object[] objArr2 = new java.lang.Object[zzg];
        int i2 = zzg - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            java.lang.Object obj = objArr[i5];
            com.google.android.gms.internal.tapandpay.zzcb.zza(obj, i5);
            int hashCode = obj.hashCode();
            int zza = com.google.android.gms.internal.tapandpay.zzbu.zza(hashCode);
            while (true) {
                int i6 = zza & i2;
                java.lang.Object obj2 = objArr2[i6];
                if (obj2 == null) {
                    objArr[i4] = obj;
                    objArr2[i6] = obj;
                    i3 += hashCode;
                    i4++;
                    break;
                }
                if (!obj2.equals(obj)) {
                    zza++;
                }
            }
        }
        java.util.Arrays.fill(objArr, i4, i, (java.lang.Object) null);
        if (i4 == 1) {
            return new com.google.android.gms.internal.tapandpay.zzce(java.util.Objects.requireNonNull(objArr[0]));
        }
        if (zzg(i4) < zzg / 2) {
            return zzk(i4, objArr);
        }
        if (i4 <= 0) {
            objArr = java.util.Arrays.copyOf(objArr, i4);
        }
        return new com.google.android.gms.internal.tapandpay.zzcd(objArr, i3, objArr2, i2, i4);
    }
}
