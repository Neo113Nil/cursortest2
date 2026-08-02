package com.google.android.gms.fido.fido2;

/* loaded from: classes8.dex */
public class Fido2PrivilegedApiClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> {
    private static final com.google.android.gms.common.api.Api.ClientKey zza;
    private static final com.google.android.gms.common.api.Api zzb;

    static {
        com.google.android.gms.common.api.Api.ClientKey clientKey = new com.google.android.gms.common.api.Api.ClientKey();
        zza = clientKey;
        zzb = new com.google.android.gms.common.api.Api("Fido.FIDO2_PRIVILEGED_API", new com.google.android.gms.internal.fido.zzj(), clientKey);
    }

    @java.lang.Deprecated
    public Fido2PrivilegedApiClient(android.app.Activity activity) {
        super(activity, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions>) zzb, com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, (com.google.android.gms.common.api.internal.StatusExceptionMapper) new com.google.android.gms.common.api.internal.ApiExceptionMapper());
    }

    public com.google.android.gms.tasks.Task<java.util.List<com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails>> getCredentialList(final java.lang.String str) {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.fido.fido2.zzn
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.internal.fido.zzn) ((com.google.android.gms.internal.fido.zzk) obj).getService()).zzc(new com.google.android.gms.fido.fido2.zzv(com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2), str);
            }
        }).setMethodKey(5430).build());
    }

    @java.lang.Deprecated
    public com.google.android.gms.tasks.Task<com.google.android.gms.fido.fido2.Fido2PendingIntent> getRegisterIntent(final com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions) {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setMethodKey(5414).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.fido.fido2.zzp
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.internal.fido.zzn) ((com.google.android.gms.internal.fido.zzk) obj).getService()).zzd(new com.google.android.gms.fido.fido2.zzs(com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2), browserPublicKeyCredentialCreationOptions);
            }
        }).build());
    }

    public com.google.android.gms.tasks.Task<android.app.PendingIntent> getRegisterPendingIntent(final com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions) {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.fido.fido2.zzl
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.internal.fido.zzn) ((com.google.android.gms.internal.fido.zzk) obj).getService()).zzd(new com.google.android.gms.fido.fido2.zzq(com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2), browserPublicKeyCredentialCreationOptions);
            }
        }).setMethodKey(5412).build());
    }

    @java.lang.Deprecated
    public com.google.android.gms.tasks.Task<com.google.android.gms.fido.fido2.Fido2PendingIntent> getSignIntent(final com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions) {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setMethodKey(5415).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.fido.fido2.zzk
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.internal.fido.zzn) ((com.google.android.gms.internal.fido.zzk) obj).getService()).zze(new com.google.android.gms.fido.fido2.zzt(com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2), browserPublicKeyCredentialRequestOptions);
            }
        }).build());
    }

    public com.google.android.gms.tasks.Task<android.app.PendingIntent> getSignPendingIntent(final com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions) {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.fido.fido2.zzo
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.internal.fido.zzn) ((com.google.android.gms.internal.fido.zzk) obj).getService()).zze(new com.google.android.gms.fido.fido2.zzr(com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2), browserPublicKeyCredentialRequestOptions);
            }
        }).setMethodKey(5413).build());
    }

    public com.google.android.gms.tasks.Task<java.lang.Boolean> isUserVerifyingPlatformAuthenticatorAvailable() {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.fido.fido2.zzm
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.internal.fido.zzn) ((com.google.android.gms.internal.fido.zzk) obj).getService()).zzf(new com.google.android.gms.fido.fido2.zzu(com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2));
            }
        }).setFeatures(com.google.android.gms.fido.zza.zzh).setMethodKey(5416).build());
    }

    @java.lang.Deprecated
    public Fido2PrivilegedApiClient(android.content.Context context) {
        super(context, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions>) zzb, com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, new com.google.android.gms.common.api.internal.ApiExceptionMapper());
    }
}
