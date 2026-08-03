package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgxi extends com.google.android.gms.internal.ads.zzgyz {
    final /* synthetic */ com.google.android.gms.internal.ads.zzgxj zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgxi(com.google.android.gms.internal.ads.zzgxj zzgxjVar, java.util.ListIterator listIterator) {
        super(listIterator);
        java.util.Objects.requireNonNull(zzgxjVar);
        this.zza = zzgxjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyy
    final java.lang.Object zza(java.lang.Object obj) {
        return this.zza.zzb.apply(obj);
    }
}
