package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgxk extends com.google.android.gms.internal.ads.zzgyz {
    final /* synthetic */ com.google.android.gms.internal.ads.zzgxl zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgxk(com.google.android.gms.internal.ads.zzgxl zzgxlVar, java.util.ListIterator listIterator) {
        super(listIterator);
        java.util.Objects.requireNonNull(zzgxlVar);
        this.zza = zzgxlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyy
    final java.lang.Object zza(java.lang.Object obj) {
        return this.zza.zzb.apply(obj);
    }
}
