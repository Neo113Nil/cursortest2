package com.google.android.gms.auth.blockstore.restorecredential.internal;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0016B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2\u0006\u0010\t\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\n2\u0006\u0010\t\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/google/android/gms/auth/blockstore/restorecredential/internal/InternalRestoreCredentialClient;", "Lcom/google/android/gms/common/api/GoogleApi;", "Lcom/google/android/gms/common/api/Api$ApiOptions$NoOptions;", "Lcom/google/android/gms/auth/blockstore/restorecredential/RestoreCredentialClient;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialRequest;", "request", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialResponse;", "getRestoreCredential", "(Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialRequest;)Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialRequest;", "Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialResponse;", "createRestoreCredential", "(Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialRequest;)Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/auth/blockstore/restorecredential/ClearRestoreCredentialRequest;", "", "clearRestoreCredential", "(Lcom/google/android/gms/auth/blockstore/restorecredential/ClearRestoreCredentialRequest;)Lcom/google/android/gms/tasks/Task;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class InternalRestoreCredentialClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> implements com.google.android.gms.auth.blockstore.restorecredential.RestoreCredentialClient {
    private static final com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> API;
    private static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.auth.blockstore.restorecredential.internal.RestoreCredentialClientImpl> CLIENT_KEY;
    private static final com.google.android.gms.auth.blockstore.restorecredential.internal.InternalRestoreCredentialClient$Companion$clientBuilder$1 clientBuilder;

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.auth.blockstore.restorecredential.internal.InternalRestoreCredentialClient$Companion$clientBuilder$1] */
    static {
        com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.auth.blockstore.restorecredential.internal.RestoreCredentialClientImpl> clientKey = new com.google.android.gms.common.api.Api.ClientKey<>();
        CLIENT_KEY = clientKey;
        ?? r1 = new com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.auth.blockstore.restorecredential.internal.RestoreCredentialClientImpl, com.google.android.gms.common.api.Api.ApiOptions.NoOptions>() { // from class: com.google.android.gms.auth.blockstore.restorecredential.internal.InternalRestoreCredentialClient$Companion$clientBuilder$1
            @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
            public final com.google.android.gms.auth.blockstore.restorecredential.internal.RestoreCredentialClientImpl buildClient(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings commonSettings, com.google.android.gms.common.api.Api.ApiOptions.NoOptions apiOptions, com.google.android.gms.common.api.internal.ConnectionCallbacks connectedListener, com.google.android.gms.common.api.internal.OnConnectionFailedListener connectionFailedListener) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(looper, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commonSettings, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apiOptions, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectedListener, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionFailedListener, "");
                return new com.google.android.gms.auth.blockstore.restorecredential.internal.RestoreCredentialClientImpl(context, looper, commonSettings, connectedListener, connectionFailedListener);
            }
        };
        clientBuilder = r1;
        API = new com.google.android.gms.common.api.Api<>("RestoreCredential.API", (com.google.android.gms.common.api.Api.AbstractClientBuilder) r1, clientKey);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalRestoreCredentialClient(android.content.Context context) {
        super(context, API, com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clearRestoreCredential$lambda$2(com.google.android.gms.auth.blockstore.restorecredential.ClearRestoreCredentialRequest clearRestoreCredentialRequest, com.google.android.gms.auth.blockstore.restorecredential.internal.RestoreCredentialClientImpl restoreCredentialClientImpl, final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clearRestoreCredentialRequest, "");
        ((com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService) restoreCredentialClientImpl.getService()).clearRestoreCredential(clearRestoreCredentialRequest, new com.google.android.gms.auth.blockstore.restorecredential.internal.IClearRestoreCredentialCallback.Stub() { // from class: com.google.android.gms.auth.blockstore.restorecredential.internal.InternalRestoreCredentialClient$clearRestoreCredential$1$callback$1
            @Override // com.google.android.gms.auth.blockstore.restorecredential.internal.IClearRestoreCredentialCallback
            public final void onClearRestoreCredential(com.google.android.gms.common.api.Status status, boolean cleared) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
                com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(status, java.lang.Boolean.valueOf(cleared), taskCompletionSource);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createRestoreCredential$lambda$1(com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialRequest createRestoreCredentialRequest, com.google.android.gms.auth.blockstore.restorecredential.internal.RestoreCredentialClientImpl restoreCredentialClientImpl, final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createRestoreCredentialRequest, "");
        ((com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService) restoreCredentialClientImpl.getService()).createRestoreCredential(createRestoreCredentialRequest, new com.google.android.gms.auth.blockstore.restorecredential.internal.ICreateRestoreCredentialCallback.Stub() { // from class: com.google.android.gms.auth.blockstore.restorecredential.internal.InternalRestoreCredentialClient$createRestoreCredential$1$callback$1
            @Override // com.google.android.gms.auth.blockstore.restorecredential.internal.ICreateRestoreCredentialCallback
            public final void onCreateRestoreCredential(com.google.android.gms.common.api.Status status, com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialResponse response) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
                com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(status, response, taskCompletionSource);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getRestoreCredential$lambda$0(com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialRequest getRestoreCredentialRequest, com.google.android.gms.auth.blockstore.restorecredential.internal.RestoreCredentialClientImpl restoreCredentialClientImpl, final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getRestoreCredentialRequest, "");
        ((com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService) restoreCredentialClientImpl.getService()).getRestoreCredential(getRestoreCredentialRequest, new com.google.android.gms.auth.blockstore.restorecredential.internal.IGetRestoreCredentialCallback.Stub() { // from class: com.google.android.gms.auth.blockstore.restorecredential.internal.InternalRestoreCredentialClient$getRestoreCredential$1$callback$1
            @Override // com.google.android.gms.auth.blockstore.restorecredential.internal.IGetRestoreCredentialCallback
            public final void onGetRestoreCredential(com.google.android.gms.common.api.Status status, com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialResponse response) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
                com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(status, response, taskCompletionSource);
            }
        });
    }

    @Override // com.google.android.gms.auth.blockstore.restorecredential.RestoreCredentialClient
    public final com.google.android.gms.tasks.Task<java.lang.Boolean> clearRestoreCredential(final com.google.android.gms.auth.blockstore.restorecredential.ClearRestoreCredentialRequest request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        com.google.android.gms.tasks.Task doRead = doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.internal.auth_blockstore.zzab.zzi).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.auth.blockstore.restorecredential.internal.InternalRestoreCredentialClient$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.auth.blockstore.restorecredential.internal.InternalRestoreCredentialClient.clearRestoreCredential$lambda$2(com.google.android.gms.auth.blockstore.restorecredential.ClearRestoreCredentialRequest.this, (com.google.android.gms.auth.blockstore.restorecredential.internal.RestoreCredentialClientImpl) obj, (com.google.android.gms.tasks.TaskCompletionSource) obj2);
            }
        }).setMethodKey(1694).build());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(doRead, "");
        return doRead;
    }

    @Override // com.google.android.gms.auth.blockstore.restorecredential.RestoreCredentialClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialResponse> createRestoreCredential(final com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialRequest request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        com.google.android.gms.tasks.Task doRead = doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.internal.auth_blockstore.zzab.zzj).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.auth.blockstore.restorecredential.internal.InternalRestoreCredentialClient$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.auth.blockstore.restorecredential.internal.InternalRestoreCredentialClient.createRestoreCredential$lambda$1(com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialRequest.this, (com.google.android.gms.auth.blockstore.restorecredential.internal.RestoreCredentialClientImpl) obj, (com.google.android.gms.tasks.TaskCompletionSource) obj2);
            }
        }).setMethodKey(1693).build());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(doRead, "");
        return doRead;
    }

    @Override // com.google.android.gms.auth.blockstore.restorecredential.RestoreCredentialClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialResponse> getRestoreCredential(final com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialRequest request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        com.google.android.gms.tasks.Task doRead = doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.internal.auth_blockstore.zzab.zzk).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.auth.blockstore.restorecredential.internal.InternalRestoreCredentialClient$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.auth.blockstore.restorecredential.internal.InternalRestoreCredentialClient.getRestoreCredential$lambda$0(com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialRequest.this, (com.google.android.gms.auth.blockstore.restorecredential.internal.RestoreCredentialClientImpl) obj, (com.google.android.gms.tasks.TaskCompletionSource) obj2);
            }
        }).setMethodKey(1695).build());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(doRead, "");
        return doRead;
    }
}
