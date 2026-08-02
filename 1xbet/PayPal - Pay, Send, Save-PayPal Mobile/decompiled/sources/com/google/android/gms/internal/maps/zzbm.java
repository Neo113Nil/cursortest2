package com.google.android.gms.internal.maps;

/* loaded from: classes8.dex */
public abstract class zzbm extends com.google.android.gms.internal.maps.zzbf implements java.util.Set {
    private transient com.google.android.gms.internal.maps.zzbi zza;

    zzbm() {
    }

    static int zzf(int i) {
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

    @java.lang.SafeVarargs
    public static com.google.android.gms.internal.maps.zzbm zzi(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object... objArr) {
        java.lang.Object[] objArr2 = new java.lang.Object[7];
        objArr2[0] = com.google.android.gms.maps.model.FeatureType.ADMINISTRATIVE_AREA_LEVEL_1;
        objArr2[1] = com.google.android.gms.maps.model.FeatureType.ADMINISTRATIVE_AREA_LEVEL_2;
        objArr2[2] = com.google.android.gms.maps.model.FeatureType.COUNTRY;
        objArr2[3] = com.google.android.gms.maps.model.FeatureType.LOCALITY;
        objArr2[4] = com.google.android.gms.maps.model.FeatureType.POSTAL_CODE;
        objArr2[5] = com.google.android.gms.maps.model.FeatureType.SCHOOL_DISTRICT;
        java.lang.System.arraycopy(objArr, 0, objArr2, 6, 1);
        return zzk(7, objArr2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof com.google.android.gms.internal.maps.zzbm) && zzj() && ((com.google.android.gms.internal.maps.zzbm) obj).zzj() && hashCode() != obj.hashCode()) {
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
        return com.google.android.gms.internal.maps.zzbv.zza(this);
    }

    @Override // com.google.android.gms.internal.maps.zzbf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract com.google.android.gms.internal.maps.zzbx iterator();

    public final com.google.android.gms.internal.maps.zzbi zzg() {
        com.google.android.gms.internal.maps.zzbi zzbiVar = this.zza;
        if (zzbiVar != null) {
            return zzbiVar;
        }
        com.google.android.gms.internal.maps.zzbi zzh = zzh();
        this.zza = zzh;
        return zzh;
    }

    com.google.android.gms.internal.maps.zzbi zzh() {
        java.lang.Object[] array = toArray();
        int i = com.google.android.gms.internal.maps.zzbi.zzd;
        return com.google.android.gms.internal.maps.zzbi.zzg(array, array.length);
    }

    boolean zzj() {
        return false;
    }

    private static com.google.android.gms.internal.maps.zzbm zzk(int i, java.lang.Object... objArr) {
        if (i == 0) {
            return com.google.android.gms.internal.maps.zzbu.zza;
        }
        if (i == 1) {
            return new com.google.android.gms.internal.maps.zzbw(java.util.Objects.requireNonNull(objArr[0]));
        }
        int zzf = zzf(i);
        java.lang.Object[] objArr2 = new java.lang.Object[zzf];
        int i2 = zzf - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            java.lang.Object obj = objArr[i5];
            if (obj == null) {
                throw new java.lang.NullPointerException("at index " + i5);
            }
            int hashCode = obj.hashCode();
            int zza = com.google.android.gms.internal.maps.zzbe.zza(hashCode);
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
            return new com.google.android.gms.internal.maps.zzbw(java.util.Objects.requireNonNull(objArr[0]));
        }
        if (zzf(i4) < zzf / 2) {
            return zzk(i4, objArr);
        }
        if (i4 < 4) {
            objArr = java.util.Arrays.copyOf(objArr, i4);
        }
        return new com.google.android.gms.internal.maps.zzbu(objArr, i3, objArr2, i2, i4);
    }
}
