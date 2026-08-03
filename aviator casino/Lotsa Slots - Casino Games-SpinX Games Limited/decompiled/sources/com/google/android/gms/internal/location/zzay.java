package com.google.android.gms.internal.location;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes4.dex */
final class zzay extends com.google.android.gms.internal.location.zzan {
    private com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.location.LocationSettingsResult> zza;

    public zzay(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.location.LocationSettingsResult> resultHolder) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(resultHolder != null, "listener can't be null.");
        this.zza = resultHolder;
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void zzb(com.google.android.gms.location.LocationSettingsResult locationSettingsResult) throws android.os.RemoteException {
        this.zza.setResult(locationSettingsResult);
        this.zza = null;
    }
}
