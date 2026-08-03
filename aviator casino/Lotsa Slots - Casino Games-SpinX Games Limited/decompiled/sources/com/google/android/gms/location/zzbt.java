package com.google.android.gms.location;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes4.dex */
final class zzbt implements com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.location.LocationSettingsResult> {
    private final com.google.android.gms.tasks.TaskCompletionSource<com.google.android.gms.location.LocationSettingsResponse> zza;

    public zzbt(com.google.android.gms.tasks.TaskCompletionSource<com.google.android.gms.location.LocationSettingsResponse> taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final void setFailedResult(com.google.android.gms.common.api.Status status) {
        this.zza.setException(new com.google.android.gms.common.api.ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final /* bridge */ /* synthetic */ void setResult(java.lang.Object obj) {
        com.google.android.gms.location.LocationSettingsResult locationSettingsResult = (com.google.android.gms.location.LocationSettingsResult) obj;
        com.google.android.gms.common.api.Status status = locationSettingsResult.getStatus();
        if (status.isSuccess()) {
            this.zza.setResult(new com.google.android.gms.location.LocationSettingsResponse(locationSettingsResult));
        } else if (status.hasResolution()) {
            this.zza.setException(new com.google.android.gms.common.api.ResolvableApiException(status));
        } else {
            this.zza.setException(new com.google.android.gms.common.api.ApiException(status));
        }
    }
}
