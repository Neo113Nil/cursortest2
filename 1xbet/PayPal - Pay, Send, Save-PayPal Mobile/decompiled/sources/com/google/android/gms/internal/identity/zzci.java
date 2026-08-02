package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
public final class zzci extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.location.FusedOrientationProviderClient {
    public static final /* synthetic */ int zza = 0;

    public zzci(android.app.Activity activity) {
        super(activity, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions>) com.google.android.gms.internal.identity.zzbi.zzb, com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.common.api.GoogleApi
    public final java.lang.String getApiFallbackAttributionTag(android.content.Context context) {
        return null;
    }

    public zzci(android.content.Context context) {
        super(context, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions>) com.google.android.gms.internal.identity.zzbi.zzb, com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.location.FusedOrientationProviderClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> removeOrientationUpdates(com.google.android.gms.location.DeviceOrientationListener deviceOrientationListener) {
        return doUnregisterEventListener(com.google.android.gms.common.api.internal.ListenerHolders.createListenerKey(deviceOrientationListener, "DeviceOrientationListener"), 2440).continueWith(com.google.android.gms.internal.identity.zzcm.zza, com.google.android.gms.internal.identity.zzck.zza);
    }

    @Override // com.google.android.gms.location.FusedOrientationProviderClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> requestOrientationUpdates(final com.google.android.gms.location.DeviceOrientationRequest deviceOrientationRequest, java.util.concurrent.Executor executor, com.google.android.gms.location.DeviceOrientationListener deviceOrientationListener) {
        final com.google.android.gms.common.api.internal.ListenerHolder createListenerHolder = com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(deviceOrientationListener, executor, "DeviceOrientationListener");
        com.google.android.gms.common.api.internal.RemoteCall remoteCall = new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.location.zzcl
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                int i = com.google.android.gms.internal.identity.zzci.zza;
                ((com.google.android.gms.internal.identity.zzdz) obj).zzC(com.google.android.gms.common.api.internal.ListenerHolder.this, deviceOrientationRequest, (com.google.android.gms.tasks.TaskCompletionSource) obj2);
            }
        };
        return doRegisterEventListener(com.google.android.gms.common.api.internal.RegistrationMethods.builder().register(remoteCall).unregister(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.location.zzcj
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = (com.google.android.gms.tasks.TaskCompletionSource) obj2;
                com.google.android.gms.internal.identity.zzdz zzdzVar = (com.google.android.gms.internal.identity.zzdz) obj;
                int i = com.google.android.gms.internal.identity.zzci.zza;
                com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey listenerKey = com.google.android.gms.common.api.internal.ListenerHolder.this.getListenerKey();
                if (listenerKey != null) {
                    zzdzVar.zzD(listenerKey, taskCompletionSource);
                }
            }
        }).withHolder(createListenerHolder).setMethodKey(2434).build());
    }
}
