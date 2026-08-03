package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzhmz implements java.lang.Iterable {
    final /* synthetic */ java.util.List zza;
    final /* synthetic */ java.util.List zzb;

    zzhmz(com.google.android.gms.internal.ads.zzhnc zzhncVar, java.util.List list, java.util.List list2) {
        this.zza = list;
        this.zzb = list2;
        java.util.Objects.requireNonNull(zzhncVar);
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new com.google.android.gms.internal.ads.zzhnb(this.zza.iterator(), this.zzb.iterator(), null);
    }
}
