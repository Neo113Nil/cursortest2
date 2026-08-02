package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public abstract class zzcf extends com.google.android.gms.internal.fido.zzby implements java.util.Set {

    @javax.annotation.CheckForNull
    private transient com.google.android.gms.internal.fido.zzcc zza;

    zzcf() {
    }

    static int zzh(int i) {
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

    public static com.google.android.gms.internal.fido.zzcf zzk() {
        return com.google.android.gms.internal.fido.zzcu.zza;
    }

    public static com.google.android.gms.internal.fido.zzcf zzl(java.lang.Object obj) {
        return new com.google.android.gms.internal.fido.zzcz("FIDO");
    }

    public static com.google.android.gms.internal.fido.zzcf zzm(java.lang.Object obj, java.lang.Object obj2) {
        return zzf(2, obj, obj2);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof com.google.android.gms.internal.fido.zzcf) && zzg() && ((com.google.android.gms.internal.fido.zzcf) obj).zzg() && hashCode() != obj.hashCode()) {
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
        return com.google.android.gms.internal.fido.zzcy.zza(this);
    }

    @Override // com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract com.google.android.gms.internal.fido.zzdc iterator();

    boolean zzg() {
        return false;
    }

    public com.google.android.gms.internal.fido.zzcc zzi() {
        com.google.android.gms.internal.fido.zzcc zzccVar = this.zza;
        if (zzccVar != null) {
            return zzccVar;
        }
        com.google.android.gms.internal.fido.zzcc zzj = zzj();
        this.zza = zzj;
        return zzj;
    }

    com.google.android.gms.internal.fido.zzcc zzj() {
        java.lang.Object[] array = toArray();
        int i = com.google.android.gms.internal.fido.zzcc.zzd;
        return com.google.android.gms.internal.fido.zzcc.zzh(array, array.length);
    }

    private static com.google.android.gms.internal.fido.zzcf zzf(int i, java.lang.Object... objArr) {
        if (i == 0) {
            return com.google.android.gms.internal.fido.zzcu.zza;
        }
        if (i == 1) {
            return new com.google.android.gms.internal.fido.zzcz(java.util.Objects.requireNonNull(objArr[0]));
        }
        int zzh = zzh(i);
        java.lang.Object[] objArr2 = new java.lang.Object[zzh];
        int i2 = zzh - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            java.lang.Object obj = objArr[i5];
            com.google.android.gms.internal.fido.zzcr.zza(obj, i5);
            int hashCode = obj.hashCode();
            int zza = com.google.android.gms.internal.fido.zzbx.zza(hashCode);
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
            return new com.google.android.gms.internal.fido.zzcz(java.util.Objects.requireNonNull(objArr[0]));
        }
        if (zzh(i4) < zzh / 2) {
            return zzf(i4, objArr);
        }
        if (i4 <= 0) {
            objArr = java.util.Arrays.copyOf(objArr, i4);
        }
        return new com.google.android.gms.internal.fido.zzcu(objArr, i3, objArr2, i2, i4);
    }
}
