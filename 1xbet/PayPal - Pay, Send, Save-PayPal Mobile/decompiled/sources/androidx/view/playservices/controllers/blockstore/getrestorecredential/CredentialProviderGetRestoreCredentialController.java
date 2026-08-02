package androidx.view.playservices.controllers.blockstore.getrestorecredential;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/credentials/playservices/controllers/blockstore/getrestorecredential/CredentialProviderGetRestoreCredentialController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Landroidx/credentials/GetCredentialRequest;", "Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialRequest;", "Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialResponse;", "Landroidx/credentials/GetCredentialResponse;", "Landroidx/credentials/exceptions/GetCredentialException;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "request", "Landroidx/credentials/CredentialManagerCallback;", com.sun.jna.Callback.METHOD_NAME, "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "", "invokePlayServices", "(Landroidx/credentials/GetCredentialRequest;Landroidx/credentials/CredentialManagerCallback;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "convertRequestToPlayServices", "(Landroidx/credentials/GetCredentialRequest;)Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialRequest;", "response", "convertResponseToCredentialManager", "(Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialResponse;)Landroidx/credentials/GetCredentialResponse;", "Camera2StreamConfigurationMap", "Landroid/content/Context;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CredentialProviderGetRestoreCredentialController extends androidx.view.playservices.controllers.CredentialProviderController<androidx.view.GetCredentialRequest, com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialRequest, com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialResponse, androidx.view.GetCredentialResponse, androidx.view.exceptions.GetCredentialException> {
    private final android.content.Context Camera2StreamConfigurationMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetRestoreCredentialController(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.Camera2StreamConfigurationMap = context;
    }

    @Override // androidx.view.playservices.controllers.CredentialProviderController
    public final void invokePlayServices(androidx.view.GetCredentialRequest request, final androidx.view.CredentialManagerCallback<androidx.view.GetCredentialResponse, androidx.view.exceptions.GetCredentialException> callback, final java.util.concurrent.Executor executor, final android.os.CancellationSignal cancellationSignal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        if (androidx.view.playservices.CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        com.google.android.gms.tasks.Task<com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialResponse> restoreCredential = com.google.android.gms.auth.blockstore.restorecredential.RestoreCredential.getRestoreCredentialClient(this.Camera2StreamConfigurationMap).getRestoreCredential(convertRequestToPlayServices(request));
        final kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.view.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController.Camera2StreamConfigurationMap(androidx.view.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController.this, cancellationSignal, executor, callback, (com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialResponse) obj);
                return Camera2StreamConfigurationMap;
            }
        };
        restoreCredential.addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener() { // from class: androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(java.lang.Object obj) {
                kotlin.jvm.functions.Function1.this.invoke(obj);
            }
        }).addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(java.lang.Exception exc) {
                androidx.view.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController.$r8$lambda$TqbbeTb9fc__EvbSQeWDK5KUSzM(cancellationSignal, executor, callback, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(androidx.view.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController credentialProviderGetRestoreCredentialController, android.os.CancellationSignal cancellationSignal, final java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback credentialManagerCallback, com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialResponse getRestoreCredentialResponse) {
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNull(getRestoreCredentialResponse);
            final androidx.view.GetCredentialResponse convertResponseToCredentialManager = credentialProviderGetRestoreCredentialController.convertResponseToCredentialManager(getRestoreCredentialResponse);
            androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.view.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController.$r8$lambda$Z3gW9g50p9XEOKgE52qomU0ozMw(executor, credentialManagerCallback, convertResponseToCredentialManager);
                }
            });
        } catch (java.lang.Exception e) {
            androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.view.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController.$r8$lambda$BbJmZGGCaHaOn3mv1V4ahkmTNzg(executor, credentialManagerCallback, e);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.view.playservices.controllers.CredentialProviderController
    public final com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialRequest convertRequestToPlayServices(androidx.view.GetCredentialRequest request) {
        androidx.view.GetRestoreCredentialOption getRestoreCredentialOption;
        androidx.view.GetRestoreCredentialOption getRestoreCredentialOption2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        java.util.Iterator<androidx.view.CredentialOption> it = request.getCredentialOptions().iterator();
        while (true) {
            getRestoreCredentialOption = null;
            if (!it.hasNext()) {
                getRestoreCredentialOption2 = null;
                break;
            }
            androidx.view.CredentialOption next = it.next();
            if (next instanceof androidx.view.GetRestoreCredentialOption) {
                getRestoreCredentialOption2 = (androidx.view.GetRestoreCredentialOption) next;
                break;
            }
        }
        if (getRestoreCredentialOption2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            getRestoreCredentialOption = getRestoreCredentialOption2;
        }
        return new com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialRequest(getRestoreCredentialOption.getRequestData());
    }

    @Override // androidx.view.playservices.controllers.CredentialProviderController
    public final androidx.view.GetCredentialResponse convertResponseToCredentialManager(com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialResponse response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        return new androidx.view.GetCredentialResponse(androidx.view.Credential.INSTANCE.createFrom(androidx.view.RestoreCredential.TYPE_RESTORE_CREDENTIAL, response.getResponseBundle()));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BbJmZGGCaHaOn3mv1V4ahkmTNzg(java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback credentialManagerCallback, final java.lang.Exception exc) {
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.CredentialManagerCallback.this.onError(r2 instanceof androidx.view.exceptions.NoCredentialException ? (androidx.view.exceptions.GetCredentialException) r1 : (androidx.view.exceptions.GetCredentialException) new androidx.view.exceptions.GetCredentialUnknownException(exc.getMessage()));
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$On8hKTPH9xV1oQ4RoMZSgwzfGx0(java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback credentialManagerCallback, final kotlin.jvm.internal.Ref.ObjectRef objectRef) {
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.CredentialManagerCallback.this.onError(objectRef.element);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [T, androidx.credentials.exceptions.GetCredentialUnknownException] */
    /* JADX WARN: Type inference failed for: r1v9, types: [T, androidx.credentials.exceptions.GetCredentialUnknownException] */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, androidx.credentials.exceptions.GetCredentialUnknownException] */
    public static /* synthetic */ void $r8$lambda$TqbbeTb9fc__EvbSQeWDK5KUSzM(android.os.CancellationSignal cancellationSignal, final java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback credentialManagerCallback, java.lang.Exception exc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Get restore credential failed for unknown reason, failure: ");
        sb.append(exc.getMessage());
        objectRef.element = new androidx.view.exceptions.GetCredentialUnknownException(sb.toString());
        if (exc instanceof com.google.android.gms.common.api.ApiException) {
            com.google.android.gms.common.api.ApiException apiException = (com.google.android.gms.common.api.ApiException) exc;
            if (apiException.getStatusCode() == 40201) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("The restore credential internal service had a failure, failure: ");
                sb2.append(exc.getMessage());
                objectRef.element = new androidx.view.exceptions.GetCredentialUnknownException(sb2.toString());
            } else {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("The restore credential service failed with unsupported status code, failure: ");
                sb3.append(exc.getMessage());
                sb3.append(", status code: ");
                sb3.append(apiException.getStatusCode());
                objectRef.element = new androidx.view.exceptions.GetCredentialUnknownException(sb3.toString());
            }
        }
        androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.view.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController.$r8$lambda$On8hKTPH9xV1oQ4RoMZSgwzfGx0(executor, credentialManagerCallback, objectRef);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Z3gW9g50p9XEOKgE52qomU0ozMw(java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback credentialManagerCallback, final androidx.view.GetCredentialResponse getCredentialResponse) {
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.CredentialManagerCallback.this.onResult(getCredentialResponse);
            }
        });
        return kotlin.Unit.INSTANCE;
    }
}
