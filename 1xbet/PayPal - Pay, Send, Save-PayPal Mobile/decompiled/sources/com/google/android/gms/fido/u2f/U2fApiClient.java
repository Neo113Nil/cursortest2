package com.google.android.gms.fido.u2f;

@java.lang.Deprecated
/* loaded from: classes8.dex */
public class U2fApiClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> {
    private static final com.google.android.gms.common.api.Api.ClientKey zza;
    private static final com.google.android.gms.common.api.Api zzb;

    static {
        com.google.android.gms.common.api.Api.ClientKey clientKey = new com.google.android.gms.common.api.Api.ClientKey();
        zza = clientKey;
        zzb = new com.google.android.gms.common.api.Api("Fido.U2F_API", new com.google.android.gms.internal.fido.zzx(), clientKey);
    }

    public U2fApiClient(android.app.Activity activity) {
        super(activity, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions>) zzb, com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, (com.google.android.gms.common.api.internal.StatusExceptionMapper) new com.google.android.gms.common.api.internal.ApiExceptionMapper());
    }

    public com.google.android.gms.tasks.Task<com.google.android.gms.fido.u2f.U2fPendingIntent> getRegisterIntent(final com.google.android.gms.fido.u2f.api.common.RegisterRequestParams registerRequestParams) {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setMethodKey(5424).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.fido.u2f.zza
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.internal.fido.zzw) ((com.google.android.gms.internal.fido.zzy) obj).getService()).zzc(new com.google.android.gms.fido.u2f.zzc(com.google.android.gms.fido.u2f.U2fApiClient.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2), registerRequestParams);
            }
        }).build());
    }

    public com.google.android.gms.tasks.Task<com.google.android.gms.fido.u2f.U2fPendingIntent> getSignIntent(final com.google.android.gms.fido.u2f.api.common.SignRequestParams signRequestParams) {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setMethodKey(5425).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.fido.u2f.zzb
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.internal.fido.zzw) ((com.google.android.gms.internal.fido.zzy) obj).getService()).zzd(new com.google.android.gms.fido.u2f.zzd(com.google.android.gms.fido.u2f.U2fApiClient.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2), signRequestParams);
            }
        }).build());
    }

    public U2fApiClient(android.content.Context context) {
        super(context, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions>) zzb, com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, new com.google.android.gms.common.api.internal.ApiExceptionMapper());
    }
}
