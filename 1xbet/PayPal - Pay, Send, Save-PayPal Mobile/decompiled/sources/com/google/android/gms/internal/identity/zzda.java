package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
public final class zzda extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.location.SettingsClient {
    public static final /* synthetic */ int zza = 0;

    public zzda(android.app.Activity activity) {
        super(activity, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions>) com.google.android.gms.internal.identity.zzbi.zzb, com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.location.SettingsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.location.LocationSettingsResponse> checkLocationSettings(final com.google.android.gms.location.LocationSettingsRequest locationSettingsRequest) {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.location.zzdb
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = (com.google.android.gms.tasks.TaskCompletionSource) obj2;
                com.google.android.gms.internal.identity.zzdz zzdzVar = (com.google.android.gms.internal.identity.zzdz) obj;
                int i = com.google.android.gms.internal.identity.zzda.zza;
                com.google.android.gms.location.LocationSettingsRequest locationSettingsRequest2 = com.google.android.gms.location.LocationSettingsRequest.this;
                com.google.android.gms.common.internal.Preconditions.checkArgument(locationSettingsRequest2 != null, "locationSettingsRequest can't be null");
                ((com.google.android.gms.internal.identity.zzv) zzdzVar.getService()).zzD(locationSettingsRequest2, new com.google.android.gms.internal.identity.zzde(taskCompletionSource), null);
            }
        }).setMethodKey(2426).build());
    }

    @Override // com.google.android.gms.location.SettingsClient
    public final com.google.android.gms.tasks.Task<java.lang.Boolean> isGoogleLocationAccuracyEnabled() {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(com.google.android.gms.internal.identity.zzdc.zza).setMethodKey(2444).setFeatures(com.google.android.gms.location.zzo.zzm).build());
    }

    public zzda(android.content.Context context) {
        super(context, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions>) com.google.android.gms.internal.identity.zzbi.zzb, com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
