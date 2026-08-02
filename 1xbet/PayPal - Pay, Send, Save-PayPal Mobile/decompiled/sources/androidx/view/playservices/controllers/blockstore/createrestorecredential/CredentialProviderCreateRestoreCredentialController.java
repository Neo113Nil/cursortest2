package androidx.view.playservices.controllers.blockstore.createrestorecredential;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u00002 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/credentials/playservices/controllers/blockstore/createrestorecredential/CredentialProviderCreateRestoreCredentialController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Landroidx/credentials/CreateRestoreCredentialRequest;", "Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialRequest;", "Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialResponse;", "Landroidx/credentials/CreateCredentialResponse;", "Landroidx/credentials/exceptions/CreateCredentialException;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "request", "Landroidx/credentials/CredentialManagerCallback;", com.sun.jna.Callback.METHOD_NAME, "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "", "invokePlayServices", "(Landroidx/credentials/CreateRestoreCredentialRequest;Landroidx/credentials/CredentialManagerCallback;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "convertRequestToPlayServices", "(Landroidx/credentials/CreateRestoreCredentialRequest;)Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialRequest;", "response", "convertResponseToCredentialManager", "(Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialResponse;)Landroidx/credentials/CreateCredentialResponse;", "getHighSpeedVideoFpsRanges", "Landroid/content/Context;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CredentialProviderCreateRestoreCredentialController extends androidx.view.playservices.controllers.CredentialProviderController<androidx.view.CreateRestoreCredentialRequest, com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialRequest, com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialResponse, androidx.view.CreateCredentialResponse, androidx.view.exceptions.CreateCredentialException> {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.content.Context Camera2StreamConfigurationMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreateRestoreCredentialController(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.Camera2StreamConfigurationMap = context;
    }

    @Override // androidx.view.playservices.controllers.CredentialProviderController
    public final void invokePlayServices(androidx.view.CreateRestoreCredentialRequest request, final androidx.view.CredentialManagerCallback<androidx.view.CreateCredentialResponse, androidx.view.exceptions.CreateCredentialException> callback, final java.util.concurrent.Executor executor, final android.os.CancellationSignal cancellationSignal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        if (androidx.view.playservices.CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        com.google.android.gms.tasks.Task<com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialResponse> createRestoreCredential = com.google.android.gms.auth.blockstore.restorecredential.RestoreCredential.getRestoreCredentialClient(this.Camera2StreamConfigurationMap).createRestoreCredential(convertRequestToPlayServices(request));
        final kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.credentials.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.view.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController.Camera2StreamConfigurationMap(androidx.view.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController.this, cancellationSignal, executor, callback, (com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialResponse) obj);
                return Camera2StreamConfigurationMap;
            }
        };
        createRestoreCredential.addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener() { // from class: androidx.credentials.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController$$ExternalSyntheticLambda6
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(java.lang.Object obj) {
                kotlin.jvm.functions.Function1.this.invoke(obj);
            }
        }).addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: androidx.credentials.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController$$ExternalSyntheticLambda7
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(java.lang.Exception exc) {
                androidx.view.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController.m9078$r8$lambda$13dZI6bjchbi94h8xynNtTwxIw(cancellationSignal, executor, callback, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(androidx.view.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController credentialProviderCreateRestoreCredentialController, android.os.CancellationSignal cancellationSignal, final java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback credentialManagerCallback, com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialResponse createRestoreCredentialResponse) {
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNull(createRestoreCredentialResponse);
            final androidx.view.CreateCredentialResponse convertResponseToCredentialManager = credentialProviderCreateRestoreCredentialController.convertResponseToCredentialManager(createRestoreCredentialResponse);
            androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.view.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController.$r8$lambda$vELkWBLTYqdLilMTMkIdhJe71ug(executor, credentialManagerCallback, convertResponseToCredentialManager);
                }
            });
        } catch (java.lang.Exception e) {
            androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.view.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController.m9082$r8$lambda$zpwRbI_yeldhlG7ygJcF2M8QvI(executor, credentialManagerCallback, e);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.view.playservices.controllers.CredentialProviderController
    public final com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialRequest convertRequestToPlayServices(androidx.view.CreateRestoreCredentialRequest request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        return new com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialRequest(request.getCredentialData());
    }

    @Override // androidx.view.playservices.controllers.CredentialProviderController
    public final androidx.view.CreateCredentialResponse convertResponseToCredentialManager(com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialResponse response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        return androidx.view.CreateRestoreCredentialResponse.INSTANCE.createFrom(response.getResponseBundle());
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [T, androidx.credentials.exceptions.restorecredential.E2eeUnavailableException] */
    /* JADX WARN: Type inference failed for: r1v12, types: [T, androidx.credentials.exceptions.CreateCredentialUnknownException] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, androidx.credentials.exceptions.CreateCredentialUnknownException] */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, androidx.credentials.exceptions.CreateCredentialUnknownException] */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, androidx.credentials.exceptions.restorecredential.CreateRestoreCredentialDomException] */
    /* renamed from: $r8$lambda$13dZI6bjchbi94h8xynN-tTwxIw, reason: not valid java name */
    public static /* synthetic */ void m9078$r8$lambda$13dZI6bjchbi94h8xynNtTwxIw(android.os.CancellationSignal cancellationSignal, final java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback credentialManagerCallback, java.lang.Exception exc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Create restore credential failed for unknown reason, failure: ");
        sb.append(exc.getMessage());
        objectRef.element = new androidx.view.exceptions.CreateCredentialUnknownException(sb.toString());
        if (exc instanceof com.google.android.gms.common.api.ApiException) {
            com.google.android.gms.common.api.ApiException apiException = (com.google.android.gms.common.api.ApiException) exc;
            switch (apiException.getStatusCode()) {
                case com.google.android.gms.auth.blockstore.restorecredential.RestoreCredentialStatusCodes.RESTORE_CREDENTIAL_INTERNAL_FAILURE /* 40201 */:
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("The restore credential internal service had a failure, failure: ");
                    sb2.append(exc.getMessage());
                    objectRef.element = new androidx.view.exceptions.CreateCredentialUnknownException(sb2.toString());
                    break;
                case com.google.android.gms.auth.blockstore.restorecredential.RestoreCredentialStatusCodes.RESTORE_CREDENTIAL_FIDO_FAILURE /* 40202 */:
                    androidx.view.exceptions.domerrors.DataError dataError = new androidx.view.exceptions.domerrors.DataError();
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("The request did not match the fido spec, failure: ");
                    sb3.append(exc.getMessage());
                    objectRef.element = new androidx.view.exceptions.restorecredential.CreateRestoreCredentialDomException(dataError, sb3.toString());
                    break;
                case com.google.android.gms.auth.blockstore.restorecredential.RestoreCredentialStatusCodes.RESTORE_CREDENTIAL_E2EE_UNAVAILABLE /* 40203 */:
                    objectRef.element = new androidx.view.exceptions.restorecredential.E2eeUnavailableException("E2ee is not available on the device. Check whether the backup and screen lock are enabled.");
                    break;
                default:
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder("The restore credential service failed with unsupported status code, failure: ");
                    sb4.append(exc.getMessage());
                    sb4.append(", status code: ");
                    sb4.append(apiException.getStatusCode());
                    objectRef.element = new androidx.view.exceptions.CreateCredentialUnknownException(sb4.toString());
                    break;
            }
        }
        androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.view.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController.m9080$r8$lambda$RB4Hqs02w04kb4B0S5bofVcHgg(executor, credentialManagerCallback, objectRef);
            }
        });
    }

    /* renamed from: $r8$lambda$RB4Hqs02w04kb4B0S5bofVc-Hgg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9080$r8$lambda$RB4Hqs02w04kb4B0S5bofVcHgg(java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback credentialManagerCallback, final kotlin.jvm.internal.Ref.ObjectRef objectRef) {
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.CredentialManagerCallback.this.onError(objectRef.element);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vELkWBLTYqdLilMTMkIdhJe71ug(java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback credentialManagerCallback, final androidx.view.CreateCredentialResponse createCredentialResponse) {
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.CredentialManagerCallback.this.onResult(createCredentialResponse);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$zpwR-bI_yeldhlG7ygJcF2M8QvI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9082$r8$lambda$zpwRbI_yeldhlG7ygJcF2M8QvI(java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback credentialManagerCallback, final java.lang.Exception exc) {
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.CredentialManagerCallback.this.onError(new androidx.view.exceptions.CreateCredentialUnknownException(exc.getMessage()));
            }
        });
        return kotlin.Unit.INSTANCE;
    }
}
