package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
public final class zzct extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.location.GeofencingClient {
    public static final /* synthetic */ int zza = 0;

    public zzct(android.app.Activity activity) {
        super(activity, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions>) com.google.android.gms.internal.identity.zzbi.zzb, com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.location.GeofencingClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> addGeofences(final com.google.android.gms.location.GeofencingRequest geofencingRequest, final android.app.PendingIntent pendingIntent) {
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.location.zzcw
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                int i = com.google.android.gms.internal.identity.zzct.zza;
                ((com.google.android.gms.internal.identity.zzdz) obj).zzE(com.google.android.gms.location.GeofencingRequest.this, pendingIntent, (com.google.android.gms.tasks.TaskCompletionSource) obj2);
            }
        }).setMethodKey(2424).build());
    }

    @Override // com.google.android.gms.location.GeofencingClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> removeGeofences(final android.app.PendingIntent pendingIntent) {
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.location.zzcu
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                int i = com.google.android.gms.internal.identity.zzct.zza;
                ((com.google.android.gms.internal.identity.zzdz) obj).zzF(com.google.android.gms.internal.identity.zzem.zzb(pendingIntent), (com.google.android.gms.tasks.TaskCompletionSource) obj2);
            }
        }).setMethodKey(2425).build());
    }

    public zzct(android.content.Context context) {
        super(context, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions>) com.google.android.gms.internal.identity.zzbi.zzb, com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.location.GeofencingClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> removeGeofences(final java.util.List<java.lang.String> list) {
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.location.zzcv
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                int i = com.google.android.gms.internal.identity.zzct.zza;
                ((com.google.android.gms.internal.identity.zzdz) obj).zzF(com.google.android.gms.internal.identity.zzem.zza(list), (com.google.android.gms.tasks.TaskCompletionSource) obj2);
            }
        }).setMethodKey(2425).build());
    }
}
