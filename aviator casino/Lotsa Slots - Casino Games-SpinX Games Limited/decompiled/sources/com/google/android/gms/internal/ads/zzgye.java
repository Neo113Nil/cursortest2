package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgye extends com.google.android.gms.internal.ads.zzgyg implements java.io.Serializable {
    static final com.google.android.gms.internal.ads.zzgye zza = new com.google.android.gms.internal.ads.zzgye();

    private zzgye() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyg, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        java.lang.Comparable comparable2 = (java.lang.Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final java.lang.String toString() {
        return "Ordering.natural()";
    }

    @Override // com.google.android.gms.internal.ads.zzgyg
    public final com.google.android.gms.internal.ads.zzgyg zza() {
        return com.google.android.gms.internal.ads.zzgyo.zza;
    }
}
