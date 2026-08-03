package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgvv extends com.google.android.gms.internal.ads.zzgyg implements java.io.Serializable {
    final java.util.Comparator zza;

    zzgvv(java.util.Comparator comparator) {
        this.zza = comparator;
    }

    @Override // com.google.android.gms.internal.ads.zzgyg, java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return this.zza.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.ads.zzgvv) {
            return this.zza.equals(((com.google.android.gms.internal.ads.zzgvv) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final java.lang.String toString() {
        return this.zza.toString();
    }
}
