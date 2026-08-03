package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgyi extends com.google.android.gms.internal.ads.zzgwm {
    final /* synthetic */ com.google.android.gms.internal.ads.zzgyj zza;

    zzgyi(com.google.android.gms.internal.ads.zzgyj zzgyjVar) {
        java.util.Objects.requireNonNull(zzgyjVar);
        this.zza = zzgyjVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int i) {
        com.google.android.gms.internal.ads.zzgyj zzgyjVar = this.zza;
        com.google.android.gms.internal.ads.zzgtj.zzm(i, zzgyjVar.zzx(), com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
        int i2 = i + i;
        return new java.util.AbstractMap.SimpleImmutableEntry(java.util.Objects.requireNonNull(zzgyjVar.zzw()[i2]), java.util.Objects.requireNonNull(zzgyjVar.zzw()[i2 + 1]));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzgwi
    public final boolean zzf() {
        return true;
    }
}
