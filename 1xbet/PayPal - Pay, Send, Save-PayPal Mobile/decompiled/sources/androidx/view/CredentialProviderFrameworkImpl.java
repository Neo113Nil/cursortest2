package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 <2\u00020\u0001:\u0001<B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J=\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012JE\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017JE\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0018JE\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00192\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020&H\u0000¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00152\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\r2\u0006\u0010*\u001a\u00020-H\u0000¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J?\u00106\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u0002032\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000104\u0012\u0004\u0012\u0002050\fH\u0016¢\u0006\u0004\b6\u00107R\u0016\u0010;\u001a\u0004\u0018\u0001088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:"}, d2 = {"Landroidx/credentials/CredentialProviderFrameworkImpl;", "Landroidx/credentials/CredentialProvider;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/credentials/GetCredentialRequest;", "request", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/credentials/CredentialManagerCallback;", "Landroidx/credentials/PrepareGetCredentialResponse;", "Landroidx/credentials/exceptions/GetCredentialException;", com.sun.jna.Callback.METHOD_NAME, "", "onPrepareCredential", "(Landroidx/credentials/GetCredentialRequest;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroidx/credentials/CredentialManagerCallback;)V", "Landroidx/credentials/PrepareGetCredentialResponse$PendingGetCredentialHandle;", "pendingGetCredentialHandle", "Landroidx/credentials/GetCredentialResponse;", "onGetCredential", "(Landroid/content/Context;Landroidx/credentials/PrepareGetCredentialResponse$PendingGetCredentialHandle;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroidx/credentials/CredentialManagerCallback;)V", "(Landroid/content/Context;Landroidx/credentials/GetCredentialRequest;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroidx/credentials/CredentialManagerCallback;)V", "Landroidx/credentials/CreateCredentialRequest;", "Landroidx/credentials/CreateCredentialResponse;", "Landroidx/credentials/exceptions/CreateCredentialException;", "onCreateCredential", "(Landroid/content/Context;Landroidx/credentials/CreateCredentialRequest;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroidx/credentials/CredentialManagerCallback;)V", "p0", "Landroid/credentials/GetCredentialRequest;", "cR_", "(Landroidx/credentials/GetCredentialRequest;)Landroid/credentials/GetCredentialRequest;", "Landroid/credentials/GetCredentialException;", "error", "convertToJetpackGetException$credentials_release", "(Landroid/credentials/GetCredentialException;)Landroidx/credentials/exceptions/GetCredentialException;", "Landroid/credentials/CreateCredentialException;", "convertToJetpackCreateException$credentials_release", "(Landroid/credentials/CreateCredentialException;)Landroidx/credentials/exceptions/CreateCredentialException;", "Landroid/credentials/GetCredentialResponse;", "response", "convertGetResponseToJetpackClass$credentials_release", "(Landroid/credentials/GetCredentialResponse;)Landroidx/credentials/GetCredentialResponse;", "Landroid/credentials/PrepareGetCredentialResponse;", "convertPrepareGetResponseToJetpackClass$credentials_release", "(Landroid/credentials/PrepareGetCredentialResponse;)Landroidx/credentials/PrepareGetCredentialResponse;", "", "isAvailableOnDevice", "()Z", "Landroidx/credentials/ClearCredentialStateRequest;", "Ljava/lang/Void;", "Landroidx/credentials/exceptions/ClearCredentialException;", "onClearCredential", "(Landroidx/credentials/ClearCredentialStateRequest;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroidx/credentials/CredentialManagerCallback;)V", "Landroid/credentials/CredentialManager;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/credentials/CredentialManager;", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CredentialProviderFrameworkImpl implements androidx.view.CredentialProvider {
    private static final androidx.credentials.CredentialProviderFrameworkImpl.Companion Companion = new androidx.credentials.CredentialProviderFrameworkImpl.Companion(null);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.credentials.CredentialManager getHighSpeedVideoFpsRanges;

    public CredentialProviderFrameworkImpl(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoFpsRanges = (android.credentials.CredentialManager) context.getSystemService("credential");
    }

    @Override // androidx.view.CredentialProvider
    public final void onPrepareCredential(androidx.view.GetCredentialRequest request, android.os.CancellationSignal cancellationSignal, java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback<androidx.view.PrepareGetCredentialResponse, androidx.view.exceptions.GetCredentialException> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.CredentialProviderFrameworkImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.view.CredentialProviderFrameworkImpl.m9064$r8$lambda$GCCqZWY2XhO7a0CwGv94Lcrf4c(androidx.view.CredentialManagerCallback.this);
            }
        };
        if (this.getHighSpeedVideoFpsRanges != null) {
            android.os.OutcomeReceiver<android.credentials.PrepareGetCredentialResponse, android.credentials.GetCredentialException> outcomeReceiver = new android.os.OutcomeReceiver<android.credentials.PrepareGetCredentialResponse, android.credentials.GetCredentialException>() { // from class: androidx.credentials.CredentialProviderFrameworkImpl$onPrepareCredential$outcome$1
                @Override // android.os.OutcomeReceiver
                public final void onResult(android.credentials.PrepareGetCredentialResponse response) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
                    callback.onResult(this.convertPrepareGetResponseToJetpackClass$credentials_release(response));
                }

                @Override // android.os.OutcomeReceiver
                public final void onError(android.credentials.GetCredentialException error) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                    callback.onError(this.convertToJetpackGetException$credentials_release(error));
                }
            };
            android.credentials.CredentialManager credentialManager = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.internal.Intrinsics.checkNotNull(credentialManager);
            credentialManager.prepareGetCredential(cR_(request), cancellationSignal, executor, outcomeReceiver);
            return;
        }
        function0.invoke();
    }

    @Override // androidx.view.CredentialProvider
    public final void onGetCredential(android.content.Context context, androidx.credentials.PrepareGetCredentialResponse.PendingGetCredentialHandle pendingGetCredentialHandle, android.os.CancellationSignal cancellationSignal, java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback<androidx.view.GetCredentialResponse, androidx.view.exceptions.GetCredentialException> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pendingGetCredentialHandle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.CredentialProviderFrameworkImpl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.view.CredentialProviderFrameworkImpl.m9063$r8$lambda$BGTCgAZAUrx_nDBb8V1lET4sA(androidx.view.CredentialManagerCallback.this);
            }
        };
        if (this.getHighSpeedVideoFpsRanges != null) {
            android.os.OutcomeReceiver<android.credentials.GetCredentialResponse, android.credentials.GetCredentialException> outcomeReceiver = new android.os.OutcomeReceiver<android.credentials.GetCredentialResponse, android.credentials.GetCredentialException>() { // from class: androidx.credentials.CredentialProviderFrameworkImpl$onGetCredential$outcome$1
                @Override // android.os.OutcomeReceiver
                public final void onResult(android.credentials.GetCredentialResponse response) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
                    callback.onResult(this.convertGetResponseToJetpackClass$credentials_release(response));
                }

                @Override // android.os.OutcomeReceiver
                public final void onError(android.credentials.GetCredentialException error) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                    callback.onError(this.convertToJetpackGetException$credentials_release(error));
                }
            };
            android.credentials.CredentialManager credentialManager = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.internal.Intrinsics.checkNotNull(credentialManager);
            android.credentials.PrepareGetCredentialResponse.PendingGetCredentialHandle frameworkHandle = pendingGetCredentialHandle.getFrameworkHandle();
            kotlin.jvm.internal.Intrinsics.checkNotNull(frameworkHandle);
            credentialManager.getCredential(context, frameworkHandle, cancellationSignal, executor, outcomeReceiver);
            return;
        }
        function0.invoke();
    }

    @Override // androidx.view.CredentialProvider
    public final void onGetCredential(android.content.Context context, androidx.view.GetCredentialRequest request, android.os.CancellationSignal cancellationSignal, java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback<androidx.view.GetCredentialResponse, androidx.view.exceptions.GetCredentialException> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.CredentialProviderFrameworkImpl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.view.CredentialProviderFrameworkImpl.$r8$lambda$rM6AWz6YbKE1Dcr6ARwvmJ_WElo(androidx.view.CredentialManagerCallback.this);
            }
        };
        if (this.getHighSpeedVideoFpsRanges != null) {
            android.os.OutcomeReceiver<android.credentials.GetCredentialResponse, android.credentials.GetCredentialException> outcomeReceiver = new android.os.OutcomeReceiver<android.credentials.GetCredentialResponse, android.credentials.GetCredentialException>() { // from class: androidx.credentials.CredentialProviderFrameworkImpl$onGetCredential$outcome$2
                @Override // android.os.OutcomeReceiver
                public final void onResult(android.credentials.GetCredentialResponse response) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
                    callback.onResult(this.convertGetResponseToJetpackClass$credentials_release(response));
                }

                @Override // android.os.OutcomeReceiver
                public final void onError(android.credentials.GetCredentialException error) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                    callback.onError(this.convertToJetpackGetException$credentials_release(error));
                }
            };
            android.credentials.CredentialManager credentialManager = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.internal.Intrinsics.checkNotNull(credentialManager);
            credentialManager.getCredential(context, cR_(request), cancellationSignal, executor, outcomeReceiver);
            return;
        }
        function0.invoke();
    }

    @Override // androidx.view.CredentialProvider
    public final void onCreateCredential(android.content.Context context, final androidx.view.CreateCredentialRequest request, android.os.CancellationSignal cancellationSignal, java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback<androidx.view.CreateCredentialResponse, androidx.view.exceptions.CreateCredentialException> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.CredentialProviderFrameworkImpl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.view.CredentialProviderFrameworkImpl.m9065$r8$lambda$aAOwS_sFkwUMIv_JgcnH96lhvw(androidx.view.CredentialManagerCallback.this);
            }
        };
        if (this.getHighSpeedVideoFpsRanges != null) {
            android.os.OutcomeReceiver<android.credentials.CreateCredentialResponse, android.credentials.CreateCredentialException> outcomeReceiver = new android.os.OutcomeReceiver<android.credentials.CreateCredentialResponse, android.credentials.CreateCredentialException>() { // from class: androidx.credentials.CredentialProviderFrameworkImpl$onCreateCredential$outcome$1
                @Override // android.os.OutcomeReceiver
                public final void onResult(android.credentials.CreateCredentialResponse response) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
                    androidx.view.CredentialManagerCallback<androidx.view.CreateCredentialResponse, androidx.view.exceptions.CreateCredentialException> credentialManagerCallback = callback;
                    androidx.view.CreateCredentialResponse.Companion companion = androidx.view.CreateCredentialResponse.INSTANCE;
                    java.lang.String type = request.getType();
                    android.os.Bundle data = response.getData();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "");
                    credentialManagerCallback.onResult(companion.createFrom(type, data));
                }

                @Override // android.os.OutcomeReceiver
                public final void onError(android.credentials.CreateCredentialException error) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                    callback.onError(this.convertToJetpackCreateException$credentials_release(error));
                }
            };
            android.credentials.CredentialManager credentialManager = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.internal.Intrinsics.checkNotNull(credentialManager);
            android.credentials.CreateCredentialRequest.Builder alwaysSendAppInfoToProvider = new android.credentials.CreateCredentialRequest.Builder(request.getType(), androidx.view.internal.ConversionUtilsKt.getFinalCreateCredentialData(request, context), request.getCandidateQueryData()).setIsSystemProviderRequired(request.getIsSystemProviderRequired()).setAlwaysSendAppInfoToProvider(true);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(alwaysSendAppInfoToProvider, "");
            if (request.getOrigin() != null) {
                alwaysSendAppInfoToProvider.setOrigin(request.getOrigin());
            }
            android.credentials.CreateCredentialRequest build = alwaysSendAppInfoToProvider.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            credentialManager.createCredential(context, build, cancellationSignal, executor, outcomeReceiver);
            return;
        }
        function0.invoke();
    }

    private static android.credentials.GetCredentialRequest cR_(androidx.view.GetCredentialRequest p0) {
        android.credentials.GetCredentialRequest.Builder builder = new android.credentials.GetCredentialRequest.Builder(androidx.view.GetCredentialRequest.INSTANCE.getRequestMetadataBundle(p0));
        for (androidx.view.CredentialOption credentialOption : p0.getCredentialOptions()) {
            builder.addCredentialOption(new android.credentials.CredentialOption.Builder(credentialOption.getType(), credentialOption.getRequestData(), credentialOption.getCandidateQueryData()).setIsSystemProviderRequired(credentialOption.getIsSystemProviderRequired()).setAllowedProviders(credentialOption.getAllowedProviders()).build());
        }
        if (p0.getOrigin() != null) {
            builder.setOrigin(p0.getOrigin());
        }
        android.credentials.GetCredentialRequest build = builder.build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }

    public final androidx.view.exceptions.GetCredentialException convertToJetpackGetException$credentials_release(android.credentials.GetCredentialException error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        java.lang.String type = error.getType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
        return androidx.view.internal.ConversionUtilsKt.toJetpackGetException(type, error.getMessage());
    }

    public final androidx.view.exceptions.CreateCredentialException convertToJetpackCreateException$credentials_release(android.credentials.CreateCredentialException error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        java.lang.String type = error.getType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
        return androidx.view.internal.ConversionUtilsKt.toJetpackCreateException(type, error.getMessage());
    }

    public final androidx.view.GetCredentialResponse convertGetResponseToJetpackClass$credentials_release(android.credentials.GetCredentialResponse response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        android.credentials.Credential credential = response.getCredential();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(credential, "");
        androidx.view.Credential.Companion companion = androidx.view.Credential.INSTANCE;
        java.lang.String type = credential.getType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
        android.os.Bundle data = credential.getData();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "");
        return new androidx.view.GetCredentialResponse(companion.createFrom(type, data));
    }

    public final androidx.view.PrepareGetCredentialResponse convertPrepareGetResponseToJetpackClass$credentials_release(android.credentials.PrepareGetCredentialResponse response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        return new androidx.credentials.PrepareGetCredentialResponse.Builder().setFrameworkResponse(response).setPendingGetCredentialHandle(new androidx.credentials.PrepareGetCredentialResponse.PendingGetCredentialHandle(response.getPendingGetCredentialHandle())).build();
    }

    @Override // androidx.view.CredentialProvider
    public final boolean isAvailableOnDevice() {
        return android.os.Build.VERSION.SDK_INT >= 34 && this.getHighSpeedVideoFpsRanges != null;
    }

    @Override // androidx.view.CredentialProvider
    public final void onClearCredential(androidx.view.ClearCredentialStateRequest request, android.os.CancellationSignal cancellationSignal, java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback<java.lang.Void, androidx.view.exceptions.ClearCredentialException> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.CredentialProviderFrameworkImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.view.CredentialProviderFrameworkImpl.$r8$lambda$Kmupk3yynMjRragPgbEmErGXmkI(androidx.view.CredentialManagerCallback.this);
            }
        };
        if (this.getHighSpeedVideoFpsRanges != null) {
            android.os.OutcomeReceiver<java.lang.Void, android.credentials.ClearCredentialStateException> outcomeReceiver = new android.os.OutcomeReceiver<java.lang.Void, android.credentials.ClearCredentialStateException>() { // from class: androidx.credentials.CredentialProviderFrameworkImpl$onClearCredential$outcome$1
                @Override // android.os.OutcomeReceiver
                public final void onResult(java.lang.Void response) {
                    callback.onResult(response);
                }

                @Override // android.os.OutcomeReceiver
                public final void onError(android.credentials.ClearCredentialStateException error) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                    callback.onError(new androidx.view.exceptions.ClearCredentialUnknownException(null, 1, null));
                }
            };
            android.credentials.CredentialManager credentialManager = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.internal.Intrinsics.checkNotNull(credentialManager);
            credentialManager.clearCredentialState(new android.credentials.ClearCredentialStateRequest(new android.os.Bundle()), cancellationSignal, executor, outcomeReceiver);
            return;
        }
        function0.invoke();
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/credentials/CredentialProviderFrameworkImpl$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: $r8$lambda$BGTCgAZAUrx_nDBb8V1l-E-T4sA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9063$r8$lambda$BGTCgAZAUrx_nDBb8V1lET4sA(androidx.view.CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new androidx.view.exceptions.GetCredentialUnsupportedException("Your device doesn't support credential manager"));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$GCCqZWY2XhO7-a0CwGv94Lcrf4c, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9064$r8$lambda$GCCqZWY2XhO7a0CwGv94Lcrf4c(androidx.view.CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new androidx.view.exceptions.GetCredentialUnsupportedException("Your device doesn't support credential manager"));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Kmupk3yynMjRragPgbEmErGXmkI(androidx.view.CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new androidx.view.exceptions.ClearCredentialUnsupportedException("Your device doesn't support credential manager"));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$aAOwS_sFkwUMIv-_JgcnH96lhvw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9065$r8$lambda$aAOwS_sFkwUMIv_JgcnH96lhvw(androidx.view.CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new androidx.view.exceptions.CreateCredentialUnsupportedException("Your device doesn't support credential manager"));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rM6AWz6YbKE1Dcr6ARwvmJ_WElo(androidx.view.CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new androidx.view.exceptions.GetCredentialUnsupportedException("Your device doesn't support credential manager"));
        return kotlin.Unit.INSTANCE;
    }
}
