package com.google.android.gms.fido.fido2;

/* loaded from: classes8.dex */
public class Fido2ApiClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> {
    private static final com.google.android.gms.common.api.Api.ClientKey zza;
    private static final com.google.android.gms.common.api.Api zzb;

    static {
        com.google.android.gms.common.api.Api.ClientKey clientKey = new com.google.android.gms.common.api.Api.ClientKey();
        zza = clientKey;
        zzb = new com.google.android.gms.common.api.Api("Fido.FIDO2_API", new com.google.android.gms.internal.fido.zzo(), clientKey);
    }

    @java.lang.Deprecated
    public Fido2ApiClient(android.app.Activity activity) {
        super(activity, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions>) zzb, com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, (com.google.android.gms.common.api.internal.StatusExceptionMapper) new com.google.android.gms.common.api.internal.ApiExceptionMapper());
    }

    @java.lang.Deprecated
    public com.google.android.gms.tasks.Task<com.google.android.gms.fido.fido2.Fido2PendingIntent> getRegisterIntent(final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setMethodKey(5409).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.fido.fido2.zzb
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.internal.fido.zzs) ((com.google.android.gms.internal.fido.zzp) obj).getService()).zzc(new com.google.android.gms.fido.fido2.zzh(com.google.android.gms.fido.fido2.Fido2ApiClient.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2), publicKeyCredentialCreationOptions);
            }
        }).build());
    }

    public com.google.android.gms.tasks.Task<android.app.PendingIntent> getRegisterPendingIntent(final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.fido.fido2.zza
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.internal.fido.zzs) ((com.google.android.gms.internal.fido.zzp) obj).getService()).zzc(new com.google.android.gms.fido.fido2.zzf(com.google.android.gms.fido.fido2.Fido2ApiClient.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2), publicKeyCredentialCreationOptions);
            }
        }).setMethodKey(5407).build());
    }

    @java.lang.Deprecated
    public com.google.android.gms.tasks.Task<com.google.android.gms.fido.fido2.Fido2PendingIntent> getSignIntent(final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions) {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setMethodKey(5410).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.fido.fido2.zze
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.internal.fido.zzs) ((com.google.android.gms.internal.fido.zzp) obj).getService()).zzd(new com.google.android.gms.fido.fido2.zzi(com.google.android.gms.fido.fido2.Fido2ApiClient.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2), publicKeyCredentialRequestOptions);
            }
        }).build());
    }

    public com.google.android.gms.tasks.Task<android.app.PendingIntent> getSignPendingIntent(final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions) {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.fido.fido2.zzc
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.internal.fido.zzs) ((com.google.android.gms.internal.fido.zzp) obj).getService()).zzd(new com.google.android.gms.fido.fido2.zzg(com.google.android.gms.fido.fido2.Fido2ApiClient.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2), publicKeyCredentialRequestOptions);
            }
        }).setMethodKey(5408).build());
    }

    public com.google.android.gms.tasks.Task<java.lang.Boolean> isUserVerifyingPlatformAuthenticatorAvailable() {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.fido.fido2.zzd
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.internal.fido.zzs) ((com.google.android.gms.internal.fido.zzp) obj).getService()).zze(new com.google.android.gms.fido.fido2.zzj(com.google.android.gms.fido.fido2.Fido2ApiClient.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2));
            }
        }).setFeatures(com.google.android.gms.fido.zza.zzh).setMethodKey(5411).build());
    }

    @java.lang.Deprecated
    public Fido2ApiClient(android.content.Context context) {
        super(context, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions>) zzb, com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, new com.google.android.gms.common.api.internal.ApiExceptionMapper());
    }
}
