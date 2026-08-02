package androidx.view.playservices.controllers;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/credentials/playservices/controllers/ResponseUtils;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ResponseUtils {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.playservices.controllers.ResponseUtils.Companion INSTANCE = new androidx.view.playservices.controllers.ResponseUtils.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/credentials/playservices/controllers/ResponseUtils$Companion;", "", "<init>", "()V", "", "uniqueRequestCode", "resultCode", "Landroid/content/Intent;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/util/concurrent/Executor;", "executor", "Landroidx/credentials/CredentialManagerCallback;", "Landroidx/credentials/GetCredentialResponse;", "Landroidx/credentials/exceptions/GetCredentialException;", com.sun.jna.Callback.METHOD_NAME, "Landroid/os/CancellationSignal;", "cancellationSignal", "", "handleGetCredentialResponse", "(IILandroid/content/Intent;Ljava/util/concurrent/Executor;Landroidx/credentials/CredentialManagerCallback;Landroid/os/CancellationSignal;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final void handleGetCredentialResponse(int uniqueRequestCode, int resultCode, android.content.Intent data, final java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback<androidx.view.GetCredentialResponse, androidx.view.exceptions.GetCredentialException> callback, android.os.CancellationSignal cancellationSignal) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
            if (uniqueRequestCode != androidx.view.playservices.controllers.CredentialProviderBaseController.INSTANCE.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release()) {
                androidx.view.playservices.controllers.CredentialProviderBaseController.INSTANCE.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release();
                return;
            }
            if (androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.maybeReportErrorResultCodeGet$credentials_play_services_auth_release(resultCode, new kotlin.jvm.functions.Function2() { // from class: androidx.credentials.playservices.controllers.ResponseUtils$Companion$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.view.playservices.controllers.ResponseUtils.Companion.$r8$lambda$4xDG5tuFzF9vPvJ3Fz0XD1ZPNoc((android.os.CancellationSignal) obj, (kotlin.jvm.functions.Function0) obj2);
                }
            }, new kotlin.jvm.functions.Function1() { // from class: androidx.credentials.playservices.controllers.ResponseUtils$Companion$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.view.playservices.controllers.ResponseUtils.Companion.$r8$lambda$2hPUcRRLnLX8WPITG566SK6PERA(executor, callback, (androidx.view.exceptions.GetCredentialException) obj);
                }
            }, cancellationSignal)) {
                return;
            }
            if (data == null) {
                androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.ResponseUtils$Companion$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return androidx.view.playservices.controllers.ResponseUtils.Companion.m9077$r8$lambda$WVfR8zP8KRUovgGI_JoJr82HRY(executor, callback);
                    }
                });
                return;
            }
            final androidx.view.GetCredentialResponse retrieveGetCredentialResponse = androidx.view.provider.PendingIntentHandler.INSTANCE.retrieveGetCredentialResponse(data);
            if (retrieveGetCredentialResponse != null) {
                androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.ResponseUtils$Companion$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return androidx.view.playservices.controllers.ResponseUtils.Companion.$r8$lambda$YP4ZQ9JLCp3HyecrcwWw0iX1oz8(executor, callback, retrieveGetCredentialResponse);
                    }
                });
            } else {
                final androidx.view.exceptions.GetCredentialException retrieveGetCredentialException = androidx.view.provider.PendingIntentHandler.INSTANCE.retrieveGetCredentialException(data);
                androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.ResponseUtils$Companion$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return androidx.view.playservices.controllers.ResponseUtils.Companion.m9076$r8$lambda$AF3nPHAhwX6zHzHvSxjX1PBI(executor, callback, retrieveGetCredentialException);
                    }
                });
            }
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$2hPUcRRLnLX8WPITG566SK6PERA(java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback credentialManagerCallback, final androidx.view.exceptions.GetCredentialException getCredentialException) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCredentialException, "");
            executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.ResponseUtils$Companion$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.view.CredentialManagerCallback.this.onError(getCredentialException);
                }
            });
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$4xDG5tuFzF9vPvJ3Fz0XD1ZPNoc(android.os.CancellationSignal cancellationSignal, kotlin.jvm.functions.Function0 function0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
            androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, function0);
            return kotlin.Unit.INSTANCE;
        }

        /* renamed from: $r8$lambda$AF3nPH-AhwX6-zHzHvSxj-X1PBI, reason: not valid java name */
        public static /* synthetic */ kotlin.Unit m9076$r8$lambda$AF3nPHAhwX6zHzHvSxjX1PBI(java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback credentialManagerCallback, final androidx.view.exceptions.GetCredentialException getCredentialException) {
            executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.ResponseUtils$Companion$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.view.playservices.controllers.ResponseUtils.Companion.$r8$lambda$SWK9b7N3FEhm4fs9MTvk8QmNFOc(androidx.view.CredentialManagerCallback.this, getCredentialException);
                }
            });
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ void $r8$lambda$SWK9b7N3FEhm4fs9MTvk8QmNFOc(androidx.view.CredentialManagerCallback credentialManagerCallback, androidx.view.exceptions.GetCredentialException getCredentialException) {
            if (getCredentialException == null) {
                getCredentialException = new androidx.view.exceptions.GetCredentialUnknownException("No provider data returned");
            }
            credentialManagerCallback.onError(getCredentialException);
        }

        /* renamed from: $r8$lambda$WVfR8zP8KRUovgGI-_JoJr82HRY, reason: not valid java name */
        public static /* synthetic */ kotlin.Unit m9077$r8$lambda$WVfR8zP8KRUovgGI_JoJr82HRY(java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback credentialManagerCallback) {
            executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.ResponseUtils$Companion$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.view.CredentialManagerCallback.this.onError(new androidx.view.exceptions.GetCredentialUnknownException("No provider data returned."));
                }
            });
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$YP4ZQ9JLCp3HyecrcwWw0iX1oz8(java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback credentialManagerCallback, final androidx.view.GetCredentialResponse getCredentialResponse) {
            executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.ResponseUtils$Companion$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.view.CredentialManagerCallback.this.onResult(getCredentialResponse);
                }
            });
            return kotlin.Unit.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void handleGetCredentialResponse(int i, int i2, android.content.Intent intent, java.util.concurrent.Executor executor, androidx.view.CredentialManagerCallback<androidx.view.GetCredentialResponse, androidx.view.exceptions.GetCredentialException> credentialManagerCallback, android.os.CancellationSignal cancellationSignal) {
        INSTANCE.handleGetCredentialResponse(i, i2, intent, executor, credentialManagerCallback, cancellationSignal);
    }
}
