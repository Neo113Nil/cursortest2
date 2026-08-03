package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzkm implements com.google.android.gms.measurement.internal.zzpn {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzli zza;

    zzkm(com.google.android.gms.measurement.internal.zzli zzliVar) {
        java.util.Objects.requireNonNull(zzliVar);
        this.zza = zzliVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzpn
    public final void zza(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        if (android.text.TextUtils.isEmpty(str)) {
            this.zza.zzB("auto", "_err", bundle);
        } else {
            this.zza.zzI("auto", "_err", bundle, str);
        }
    }
}
