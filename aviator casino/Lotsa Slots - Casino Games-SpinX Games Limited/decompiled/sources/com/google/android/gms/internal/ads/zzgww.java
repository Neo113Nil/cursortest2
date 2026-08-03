package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzgww<E> extends com.google.android.gms.internal.ads.zzgwi<E> implements java.util.Set<E> {
    private transient com.google.android.gms.internal.ads.zzgwm zza;

    zzgww() {
    }

    public static com.google.android.gms.internal.ads.zzgww zzh() {
        return com.google.android.gms.internal.ads.zzgyn.zza;
    }

    public static com.google.android.gms.internal.ads.zzgww zzi(java.lang.Object obj) {
        return new com.google.android.gms.internal.ads.zzgyx(obj);
    }

    public static com.google.android.gms.internal.ads.zzgww zzj(java.lang.Object obj, java.lang.Object obj2) {
        return zzw(2, obj, obj2);
    }

    public static com.google.android.gms.internal.ads.zzgww zzk(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return zzw(3, obj, obj2, obj3);
    }

    public static com.google.android.gms.internal.ads.zzgww zzl(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        return zzw(4, obj, obj2, obj3, obj4);
    }

    public static com.google.android.gms.internal.ads.zzgww zzm(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        return zzw(5, obj, obj2, obj3, obj4, obj5);
    }

    @java.lang.SafeVarargs
    public static com.google.android.gms.internal.ads.zzgww zzn(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object... objArr) {
        int length = objArr.length;
        int i = length + 6;
        java.lang.Object[] objArr2 = new java.lang.Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        java.lang.System.arraycopy(objArr, 0, objArr2, 6, length);
        return zzw(i, objArr2);
    }

    static int zzo(int i) {
        int max = java.lang.Math.max(i, 2);
        if (max >= 751619276) {
            com.google.android.gms.internal.ads.zzgtj.zzb(max < 1073741824, "collection too large");
            return 1073741824;
        }
        int highestOneBit = java.lang.Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    public static com.google.android.gms.internal.ads.zzgww zzp(java.util.Collection collection) {
        if ((collection instanceof com.google.android.gms.internal.ads.zzgww) && !(collection instanceof java.util.SortedSet)) {
            com.google.android.gms.internal.ads.zzgww zzgwwVar = (com.google.android.gms.internal.ads.zzgww) collection;
            if (!zzgwwVar.zzf()) {
                return zzgwwVar;
            }
        }
        java.lang.Object[] array = collection.toArray();
        return zzw(array.length, array);
    }

    public static com.google.android.gms.internal.ads.zzgww zzq(java.lang.Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? zzw(length, (java.lang.Object[]) objArr.clone()) : new com.google.android.gms.internal.ads.zzgyx(objArr[0]) : com.google.android.gms.internal.ads.zzgyn.zza;
    }

    public static com.google.android.gms.internal.ads.zzgwv zzt(int i) {
        com.google.android.gms.internal.ads.zzgvi.zzb(i, "expectedSize");
        return new com.google.android.gms.internal.ads.zzgwv(i, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzx(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof com.google.android.gms.internal.ads.zzgww) && zzr() && ((com.google.android.gms.internal.ads.zzgww) obj).zzr() && hashCode() != obj.hashCode()) {
            return false;
        }
        return com.google.android.gms.internal.ads.zzgyw.zzd(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return com.google.android.gms.internal.ads.zzgyw.zzc(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgwi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public abstract com.google.android.gms.internal.ads.zzgza iterator();

    @Override // com.google.android.gms.internal.ads.zzgwi
    public com.google.android.gms.internal.ads.zzgwm zze() {
        com.google.android.gms.internal.ads.zzgwm zzgwmVar = this.zza;
        if (zzgwmVar != null) {
            return zzgwmVar;
        }
        com.google.android.gms.internal.ads.zzgwm zzs = zzs();
        this.zza = zzs;
        return zzs;
    }

    boolean zzr() {
        return false;
    }

    com.google.android.gms.internal.ads.zzgwm zzs() {
        java.lang.Object[] array = toArray();
        int i = com.google.android.gms.internal.ads.zzgwm.zzd;
        return com.google.android.gms.internal.ads.zzgwm.zzt(array, array.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.gms.internal.ads.zzgww zzw(int i, java.lang.Object... objArr) {
        if (i == 0) {
            return com.google.android.gms.internal.ads.zzgyn.zza;
        }
        if (i == 1) {
            return new com.google.android.gms.internal.ads.zzgyx(java.util.Objects.requireNonNull(objArr[0]));
        }
        int zzo = zzo(i);
        java.lang.Object[] objArr2 = new java.lang.Object[zzo];
        int i2 = zzo - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            java.lang.Object obj = objArr[i5];
            com.google.android.gms.internal.ads.zzgyf.zzb(obj, i5);
            int hashCode = obj.hashCode();
            int zza = com.google.android.gms.internal.ads.zzgwf.zza(hashCode);
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
            return new com.google.android.gms.internal.ads.zzgyx(java.util.Objects.requireNonNull(objArr[0]));
        }
        if (zzo(i4) < zzo / 2) {
            return zzw(i4, objArr);
        }
        if (zzx(i4, objArr.length)) {
            objArr = java.util.Arrays.copyOf(objArr, i4);
        }
        return new com.google.android.gms.internal.ads.zzgyn(objArr, i3, objArr2, i2, i4);
    }
}
