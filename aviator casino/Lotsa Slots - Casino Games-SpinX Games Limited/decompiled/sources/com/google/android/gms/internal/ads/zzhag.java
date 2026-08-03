package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzhag extends java.util.AbstractList implements java.util.RandomAccess, java.io.Serializable {
    final int[] zza;
    final int zzb;
    final int zzc;

    zzhag(int[] iArr, int i, int i2) {
        this.zza = iArr;
        this.zzb = i;
        this.zzc = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return (obj instanceof java.lang.Integer) && com.google.android.gms.internal.ads.zzhah.zzi(this.zza, ((java.lang.Integer) obj).intValue(), this.zzb, this.zzc) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.zzhag)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.ads.zzhag zzhagVar = (com.google.android.gms.internal.ads.zzhag) obj;
        int i = this.zzc;
        int i2 = this.zzb;
        int i3 = zzhagVar.zzc;
        int i4 = zzhagVar.zzb;
        int i5 = i - i2;
        if (i3 - i4 != i5) {
            return false;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            if (this.zza[i2 + i6] != zzhagVar.zza[i4 + i6]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int i) {
        int i2 = this.zzc;
        int i3 = this.zzb;
        com.google.android.gms.internal.ads.zzgtj.zzm(i, i2 - i3, com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
        return java.lang.Integer.valueOf(this.zza[i3 + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = this.zzb; i2 < this.zzc; i2++) {
            i = (i * 31) + this.zza[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Integer)) {
            return -1;
        }
        int[] iArr = this.zza;
        int intValue = ((java.lang.Integer) obj).intValue();
        int i = this.zzb;
        int zzi = com.google.android.gms.internal.ads.zzhah.zzi(iArr, intValue, i, this.zzc);
        if (zzi >= 0) {
            return zzi - i;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        if (obj instanceof java.lang.Integer) {
            int[] iArr = this.zza;
            int intValue = ((java.lang.Integer) obj).intValue();
            int i = this.zzb;
            int i2 = this.zzc - 1;
            while (true) {
                if (i2 < i) {
                    i2 = -1;
                    break;
                }
                if (iArr[i2] == intValue) {
                    break;
                }
                i2--;
            }
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        int i2 = this.zzc;
        int i3 = this.zzb;
        java.lang.Integer num = (java.lang.Integer) obj;
        com.google.android.gms.internal.ads.zzgtj.zzm(i, i2 - i3, com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
        int[] iArr = this.zza;
        int i4 = i3 + i;
        int i5 = iArr[i4];
        num.getClass();
        iArr[i4] = num.intValue();
        return java.lang.Integer.valueOf(i5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc - this.zzb;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public final /* bridge */ /* synthetic */ java.util.Spliterator spliterator() {
        return java.util.Spliterators.spliterator(this.zza, this.zzb, this.zzc, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.List subList(int i, int i2) {
        int i3 = this.zzc;
        int i4 = this.zzb;
        com.google.android.gms.internal.ads.zzgtj.zzo(i, i2, i3 - i4);
        return i == i2 ? java.util.Collections.emptyList() : new com.google.android.gms.internal.ads.zzhag(this.zza, i + i4, i4 + i2);
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        int i = this.zzc;
        int i2 = this.zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder((i - i2) * 5);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
        int[] iArr = this.zza;
        sb.append(iArr[i2]);
        while (true) {
            i2++;
            if (i2 >= i) {
                sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i2]);
        }
    }
}
