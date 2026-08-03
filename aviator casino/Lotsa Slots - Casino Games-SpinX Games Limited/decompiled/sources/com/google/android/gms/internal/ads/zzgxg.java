package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgxg extends com.google.android.gms.internal.ads.zzgyg implements java.io.Serializable {
    final java.util.Comparator zza;

    zzgxg(java.util.Comparator comparator) {
        this.zza = comparator;
    }

    @Override // com.google.android.gms.internal.ads.zzgyg, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Iterator it = ((java.lang.Iterable) obj).iterator();
        java.util.Iterator it2 = ((java.lang.Iterable) obj2).iterator();
        while (it.hasNext()) {
            if (!it2.hasNext()) {
                return 1;
            }
            int compare = this.zza.compare(it.next(), it2.next());
            if (compare != 0) {
                return compare;
            }
        }
        return it2.hasNext() ? -1 : 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.ads.zzgxg) {
            return this.zza.equals(((com.google.android.gms.internal.ads.zzgxg) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 2075626741;
    }

    public final java.lang.String toString() {
        return this.zza.toString().concat(".lexicographical()");
    }
}
