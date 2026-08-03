package com.google.android.gms.internal.fido;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes4.dex */
public abstract class zzau extends com.google.android.gms.internal.fido.zzaq implements java.util.Set {

    @javax.annotation.CheckForNull
    private transient com.google.android.gms.internal.fido.zzat zza;

    zzau() {
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

    public static com.google.android.gms.internal.fido.zzau zzi(java.lang.Object obj, java.lang.Object obj2) {
        return zzk(2, obj, obj2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof com.google.android.gms.internal.fido.zzau) && zzj() && ((com.google.android.gms.internal.fido.zzau) obj).zzj() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set set = (java.util.Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
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

    @Override // com.google.android.gms.internal.fido.zzaq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract com.google.android.gms.internal.fido.zzaz iterator();

    public final com.google.android.gms.internal.fido.zzat zzg() {
        com.google.android.gms.internal.fido.zzat zzatVar = this.zza;
        if (zzatVar != null) {
            return zzatVar;
        }
        com.google.android.gms.internal.fido.zzat zzh = zzh();
        this.zza = zzh;
        return zzh;
    }

    com.google.android.gms.internal.fido.zzat zzh() {
        java.lang.Object[] array = toArray();
        int i = com.google.android.gms.internal.fido.zzat.zzd;
        return com.google.android.gms.internal.fido.zzat.zzg(array, array.length);
    }

    boolean zzj() {
        return false;
    }

    private static com.google.android.gms.internal.fido.zzau zzk(int i, java.lang.Object... objArr) {
        if (i == 0) {
            return com.google.android.gms.internal.fido.zzax.zza;
        }
        if (i == 1) {
            java.lang.Object obj = objArr[0];
            obj.getClass();
            return new com.google.android.gms.internal.fido.zzay(obj);
        }
        int zzf = zzf(i);
        java.lang.Object[] objArr2 = new java.lang.Object[zzf];
        int i2 = zzf - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            java.lang.Object obj2 = objArr[i5];
            if (obj2 == null) {
                throw new java.lang.NullPointerException("at index " + i5);
            }
            int hashCode = obj2.hashCode();
            int zza = com.google.android.gms.internal.fido.zzap.zza(hashCode);
            while (true) {
                int i6 = zza & i2;
                java.lang.Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += hashCode;
                    i4++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    zza++;
                }
            }
        }
        java.util.Arrays.fill(objArr, i4, i, (java.lang.Object) null);
        if (i4 == 1) {
            java.lang.Object obj4 = objArr[0];
            obj4.getClass();
            return new com.google.android.gms.internal.fido.zzay(obj4);
        }
        if (zzf(i4) < zzf / 2) {
            return zzk(i4, objArr);
        }
        if (i4 <= 0) {
            objArr = java.util.Arrays.copyOf(objArr, i4);
        }
        return new com.google.android.gms.internal.fido.zzax(objArr, i3, objArr2, i2, i4);
    }
}
