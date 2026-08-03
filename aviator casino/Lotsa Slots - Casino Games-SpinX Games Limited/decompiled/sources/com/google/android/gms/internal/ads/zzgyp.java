package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgyp extends com.google.android.gms.internal.ads.zzgyg implements java.io.Serializable {
    final com.google.android.gms.internal.ads.zzgyg zza;

    zzgyp(com.google.android.gms.internal.ads.zzgyg zzgygVar) {
        this.zza = zzgygVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyg, java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return this.zza.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.ads.zzgyp) {
            return this.zza.equals(((com.google.android.gms.internal.ads.zzgyp) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return -this.zza.hashCode();
    }

    public final java.lang.String toString() {
        return this.zza.toString().concat(".reverse()");
    }
}
