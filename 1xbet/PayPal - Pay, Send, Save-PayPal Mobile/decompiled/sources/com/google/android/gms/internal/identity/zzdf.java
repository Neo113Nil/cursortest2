package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
final class zzdf extends com.google.android.gms.internal.identity.zzaa {
    final /* synthetic */ com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder zza;

    zzdf(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultHolder) {
        this.zza = resultHolder;
    }

    @Override // com.google.android.gms.internal.identity.zzab
    public final void zzb(com.google.android.gms.location.LocationSettingsResult locationSettingsResult) {
        this.zza.setResult(locationSettingsResult);
    }
}
