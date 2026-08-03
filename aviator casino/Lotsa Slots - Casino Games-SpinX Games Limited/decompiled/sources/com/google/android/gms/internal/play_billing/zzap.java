package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
final class zzap extends com.google.android.gms.internal.play_billing.zzai {
    final /* synthetic */ com.google.android.gms.internal.play_billing.zzaq zza;

    zzap(com.google.android.gms.internal.play_billing.zzaq zzaqVar) {
        this.zza = zzaqVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int i) {
        int i2;
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        i2 = this.zza.zzc;
        com.google.android.gms.internal.play_billing.zzaa.zza(i, i2, com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
        objArr = this.zza.zzb;
        int i3 = i + i;
        java.lang.Object requireNonNull = java.util.Objects.requireNonNull(objArr[i3]);
        objArr2 = this.zza.zzb;
        return new java.util.AbstractMap.SimpleImmutableEntry(requireNonNull, java.util.Objects.requireNonNull(objArr2[i3 + 1]));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.zza.zzc;
        return i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzaf
    public final boolean zzf() {
        return true;
    }
}
