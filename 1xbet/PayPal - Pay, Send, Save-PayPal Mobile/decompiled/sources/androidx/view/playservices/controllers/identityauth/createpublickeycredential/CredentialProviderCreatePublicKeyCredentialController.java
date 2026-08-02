package androidx.view.playservices.controllers.identityauth.createpublickeycredential;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 ,2 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u0001,B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010!\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010&\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+"}, d2 = {"Landroidx/credentials/playservices/controllers/identityauth/createpublickeycredential/CredentialProviderCreatePublicKeyCredentialController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Landroidx/credentials/CreatePublicKeyCredentialRequest;", "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;", "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;", "Landroidx/credentials/CreateCredentialResponse;", "Landroidx/credentials/exceptions/CreateCredentialException;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "request", "Landroidx/credentials/CredentialManagerCallback;", com.sun.jna.Callback.METHOD_NAME, "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "", "invokePlayServices", "(Landroidx/credentials/CreatePublicKeyCredentialRequest;Landroidx/credentials/CredentialManagerCallback;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "", "uniqueRequestCode", "resultCode", "Landroid/content/Intent;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "handleResponse$credentials_play_services_auth_release", "(IILandroid/content/Intent;)V", "convertRequestToPlayServices", "(Landroidx/credentials/CreatePublicKeyCredentialRequest;)Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;", "response", "convertResponseToCredentialManager", "(Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;)Landroidx/credentials/CreateCredentialResponse;", "Camera2StreamConfigurationMap", "Landroid/content/Context;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Landroidx/credentials/CredentialManagerCallback;", "getHighSpeedVideoSizes", "Ljava/util/concurrent/Executor;", "Landroid/os/CancellationSignal;", "Landroidx/credentials/playservices/controllers/identityauth/createpublickeycredential/CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1;", "getHighSpeedVideoFpsRangesFor", "Landroidx/credentials/playservices/controllers/identityauth/createpublickeycredential/CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CredentialProviderCreatePublicKeyCredentialController extends androidx.view.playservices.controllers.CredentialProviderController<androidx.view.CreatePublicKeyCredentialRequest, com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions, com.google.android.gms.fido.fido2.api.common.PublicKeyCredential, androidx.view.CreateCredentialResponse, androidx.view.exceptions.CreateCredentialException> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.Companion INSTANCE = new androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final android.content.Context getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private android.os.CancellationSignal getHighSpeedVideoSizes;
    private androidx.view.CredentialManagerCallback<androidx.view.CreateCredentialResponse, androidx.view.exceptions.CreateCredentialException> getHighSpeedVideoFpsRanges;
    private final androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1 getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private java.util.concurrent.Executor Camera2StreamConfigurationMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1] */
    public CredentialProviderCreatePublicKeyCredentialController(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighResolutionOutputSizeshNQ4ISI = context;
        final android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.getHighSpeedVideoFpsRangesFor = new android.os.ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public final void onReceiveResult(int resultCode, android.os.Bundle resultData) {
                java.util.concurrent.Executor executor;
                java.util.concurrent.Executor executor2;
                androidx.view.CredentialManagerCallback credentialManagerCallback;
                androidx.view.CredentialManagerCallback credentialManagerCallback2;
                android.os.CancellationSignal cancellationSignal;
                boolean maybeReportErrorFromResultReceiver;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultData, "");
                androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.this;
                androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 credentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 = new androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1(androidx.view.playservices.controllers.CredentialProviderBaseController.INSTANCE);
                executor = androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.this.Camera2StreamConfigurationMap;
                if (executor == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    executor2 = null;
                } else {
                    executor2 = executor;
                }
                credentialManagerCallback = androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.this.getHighSpeedVideoFpsRanges;
                if (credentialManagerCallback == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    credentialManagerCallback2 = null;
                } else {
                    credentialManagerCallback2 = credentialManagerCallback;
                }
                cancellationSignal = androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.this.getHighSpeedVideoSizes;
                maybeReportErrorFromResultReceiver = credentialProviderCreatePublicKeyCredentialController.maybeReportErrorFromResultReceiver(resultData, credentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1, executor2, credentialManagerCallback2, cancellationSignal);
                if (maybeReportErrorFromResultReceiver) {
                    return;
                }
                androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.this.handleResponse$credentials_play_services_auth_release(resultData.getInt(androidx.view.playservices.controllers.CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), resultCode, (android.content.Intent) resultData.getParcelable(androidx.view.playservices.controllers.CredentialProviderBaseController.RESULT_DATA_TAG));
            }
        };
    }

    @Override // androidx.view.playservices.controllers.CredentialProviderController
    public final void invokePlayServices(androidx.view.CreatePublicKeyCredentialRequest request, androidx.view.CredentialManagerCallback<androidx.view.CreateCredentialResponse, androidx.view.exceptions.CreateCredentialException> callback, java.util.concurrent.Executor executor, final android.os.CancellationSignal cancellationSignal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        this.getHighSpeedVideoSizes = cancellationSignal;
        this.getHighSpeedVideoFpsRanges = callback;
        this.Camera2StreamConfigurationMap = executor;
        try {
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions convertRequestToPlayServices = convertRequestToPlayServices(request);
            if (androidx.view.playservices.CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                return;
            }
            com.google.android.gms.tasks.Task<android.app.PendingIntent> registerPendingIntent = com.google.android.gms.fido.Fido.getFido2ApiClient(this.getHighResolutionOutputSizeshNQ4ISI).getRegisterPendingIntent(convertRequestToPlayServices);
            final kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    kotlin.Unit highSpeedVideoFpsRanges;
                    highSpeedVideoFpsRanges = androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.getHighSpeedVideoFpsRanges(cancellationSignal, this, (android.app.PendingIntent) obj);
                    return highSpeedVideoFpsRanges;
                }
            };
            registerPendingIntent.addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda3
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(java.lang.Object obj) {
                    kotlin.jvm.functions.Function1.this.invoke(obj);
                }
            }).addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda4
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(java.lang.Exception exc) {
                    androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.m9098$r8$lambda$f9TQzHY7daPVLYYCJexCcAZGgU(androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.this, cancellationSignal, exc);
                }
            });
        } catch (org.json.JSONException e) {
            androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.$r8$lambda$Fb3QbKFPZr9wENYfLvIpRG7oy_g(androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.this, e);
                }
            });
        } catch (java.lang.Throwable th) {
            androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.$r8$lambda$bgEYeSc7OR_yH8pOXKRVJdhtIH4(androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.this, th);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(android.os.CancellationSignal cancellationSignal, final androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, android.app.PendingIntent pendingIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pendingIntent, "");
        if (androidx.view.playservices.CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return kotlin.Unit.INSTANCE;
        }
        android.content.Intent intent = new android.content.Intent(credentialProviderCreatePublicKeyCredentialController.getHighResolutionOutputSizeshNQ4ISI, (java.lang.Class<?>) androidx.view.playservices.controllers.identityauth.HiddenActivity.class);
        credentialProviderCreatePublicKeyCredentialController.generateHiddenActivityIntent(credentialProviderCreatePublicKeyCredentialController.getHighSpeedVideoFpsRangesFor, intent, androidx.view.playservices.controllers.CredentialProviderBaseController.CREATE_PUBLIC_KEY_CREDENTIAL_TAG);
        intent.putExtra(androidx.view.playservices.controllers.CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT, pendingIntent);
        try {
            credentialProviderCreatePublicKeyCredentialController.getHighResolutionOutputSizeshNQ4ISI.startActivity(intent);
        } catch (java.lang.Exception unused) {
            androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.m9095$r8$lambda$IA8rfGhjMhX8r7bC67B0BEHVmY(androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.this);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public final void handleResponse$credentials_play_services_auth_release(int uniqueRequestCode, int resultCode, android.content.Intent data) {
        if (uniqueRequestCode != androidx.view.playservices.controllers.CredentialProviderBaseController.INSTANCE.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release()) {
            androidx.view.playservices.controllers.CredentialProviderBaseController.INSTANCE.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release();
            return;
        }
        if (androidx.view.playservices.controllers.CredentialProviderController.maybeReportErrorResultCodeCreate(resultCode, new kotlin.jvm.functions.Function2() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.m9094$r8$lambda$2HjwAtxekOufSUPFX5duZGbr2s((android.os.CancellationSignal) obj, (kotlin.jvm.functions.Function0) obj2);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.$r8$lambda$_DOYgvV302yoLFAQmvweLGzh0f8(androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.this, (androidx.view.exceptions.CreateCredentialException) obj);
            }
        }, this.getHighSpeedVideoSizes)) {
            return;
        }
        java.util.concurrent.Executor executor = null;
        byte[] byteArrayExtra = data != null ? data.getByteArrayExtra(com.google.android.gms.fido.Fido.FIDO2_KEY_CREDENTIAL_EXTRA) : null;
        if (byteArrayExtra == null) {
            if (androidx.view.playservices.CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(this.getHighSpeedVideoSizes)) {
                return;
            }
            java.util.concurrent.Executor executor2 = this.Camera2StreamConfigurationMap;
            if (executor2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                executor = executor2;
            }
            executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda17
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.$r8$lambda$krzjS8D5MKRrr0XFQG6mvZEV2kY(androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.this);
                }
            });
            return;
        }
        com.google.android.gms.fido.fido2.api.common.PublicKeyCredential deserializeFromBytes = com.google.android.gms.fido.fido2.api.common.PublicKeyCredential.deserializeFromBytes(byteArrayExtra);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deserializeFromBytes, "");
        final androidx.view.exceptions.CreateCredentialException publicKeyCredentialResponseContainsError = androidx.view.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.INSTANCE.publicKeyCredentialResponseContainsError(deserializeFromBytes);
        if (publicKeyCredentialResponseContainsError != null) {
            androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(this.getHighSpeedVideoSizes, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.$r8$lambda$aV9hbjIQ43l0NE_ctgerBKM7JJ0(androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.this, publicKeyCredentialResponseContainsError);
                }
            });
            return;
        }
        try {
            final androidx.view.CreateCredentialResponse convertResponseToCredentialManager = convertResponseToCredentialManager(deserializeFromBytes);
            androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(this.getHighSpeedVideoSizes, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.$r8$lambda$FU6Uizo7Lub4My9cGRyFKW3A0Vw(androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.this, convertResponseToCredentialManager);
                }
            });
        } catch (org.json.JSONException e) {
            androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(this.getHighSpeedVideoSizes, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.$r8$lambda$y4dn7kuLRWYN5x8gKlJfY7SYq2o(androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.this, e);
                }
            });
        } catch (java.lang.Throwable th) {
            androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(this.getHighSpeedVideoSizes, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.m9097$r8$lambda$QPyqM0qgKBjteVzJvkKgWPGDRY(androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.this, th);
                }
            });
        }
    }

    @Override // androidx.view.playservices.controllers.CredentialProviderController
    public final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions convertRequestToPlayServices(androidx.view.CreatePublicKeyCredentialRequest request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        return androidx.view.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility.INSTANCE.convert(request, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // androidx.view.playservices.controllers.CredentialProviderController
    public final androidx.view.CreateCredentialResponse convertResponseToCredentialManager(com.google.android.gms.fido.fido2.api.common.PublicKeyCredential response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        try {
            java.lang.String json = response.toJson();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(json, "");
            return new androidx.view.CreatePublicKeyCredentialResponse(json);
        } catch (java.lang.Throwable th) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("The PublicKeyCredential response json had an unexpected exception when parsing: ");
            sb.append(th.getMessage());
            throw new androidx.view.exceptions.CreateCredentialUnknownException(sb.toString());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/credentials/playservices/controllers/identityauth/createpublickeycredential/CredentialProviderCreatePublicKeyCredentialController$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/credentials/playservices/controllers/identityauth/createpublickeycredential/CredentialProviderCreatePublicKeyCredentialController;", "getInstance", "(Landroid/content/Context;)Landroidx/credentials/playservices/controllers/identityauth/createpublickeycredential/CredentialProviderCreatePublicKeyCredentialController;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController getInstance(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            return new androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController(context);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: $r8$lambda$2HjwAtxekOufSUPFX5duZGbr2-s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9094$r8$lambda$2HjwAtxekOufSUPFX5duZGbr2s(android.os.CancellationSignal cancellationSignal, kotlin.jvm.functions.Function0 function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, function0);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ void $r8$lambda$5LX_hPQxVympnTz0xHKE6QXLdR0(androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, androidx.view.CreateCredentialResponse createCredentialResponse) {
        androidx.view.CredentialManagerCallback<androidx.view.CreateCredentialResponse, androidx.view.exceptions.CreateCredentialException> credentialManagerCallback = credentialProviderCreatePublicKeyCredentialController.getHighSpeedVideoFpsRanges;
        if (credentialManagerCallback == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            credentialManagerCallback = null;
        }
        credentialManagerCallback.onResult(createCredentialResponse);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FU6Uizo7Lub4My9cGRyFKW3A0Vw(final androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, final androidx.view.CreateCredentialResponse createCredentialResponse) {
        java.util.concurrent.Executor executor = credentialProviderCreatePublicKeyCredentialController.Camera2StreamConfigurationMap;
        if (executor == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            executor = null;
        }
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.$r8$lambda$5LX_hPQxVympnTz0xHKE6QXLdR0(androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.this, createCredentialResponse);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ void $r8$lambda$FVo61JxFUI6wSDK0Cnx5BCMLhuM(androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, androidx.view.exceptions.CreateCredentialException createCredentialException) {
        androidx.view.CredentialManagerCallback<androidx.view.CreateCredentialResponse, androidx.view.exceptions.CreateCredentialException> credentialManagerCallback = credentialProviderCreatePublicKeyCredentialController.getHighSpeedVideoFpsRanges;
        if (credentialManagerCallback == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            credentialManagerCallback = null;
        }
        credentialManagerCallback.onError(createCredentialException);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Fb3QbKFPZr9wENYfLvIpRG7oy_g(final androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, final org.json.JSONException jSONException) {
        java.util.concurrent.Executor executor = credentialProviderCreatePublicKeyCredentialController.Camera2StreamConfigurationMap;
        if (executor == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            executor = null;
        }
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.$r8$lambda$NtEtbwTU0X5ysGY7u9ZMxdgtp5Y(androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.this, jSONException);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GZ_DiW5laBi1vQG5BGKluZ54R2M(final androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, final androidx.view.exceptions.CreateCredentialException createCredentialException) {
        java.util.concurrent.Executor executor = credentialProviderCreatePublicKeyCredentialController.Camera2StreamConfigurationMap;
        if (executor == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            executor = null;
        }
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.$r8$lambda$aDwa0TcP_Fs8MS0eX02eKrBZ35Y(androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.this, createCredentialException);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$IA8rfGhjMhX8r7bC67B0-BEHVmY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9095$r8$lambda$IA8rfGhjMhX8r7bC67B0BEHVmY(final androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController) {
        java.util.concurrent.Executor executor = credentialProviderCreatePublicKeyCredentialController.Camera2StreamConfigurationMap;
        if (executor == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            executor = null;
        }
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.$r8$lambda$npqbLmWPTHIlWks1KkfL_GIO8FI(androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.this);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$J1krUn153R-QOLY4eAj0REs-7gQ, reason: not valid java name */
    public static /* synthetic */ void m9096$r8$lambda$J1krUn153RQOLY4eAj0REs7gQ(androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, androidx.view.exceptions.CreateCredentialException createCredentialException) {
        androidx.view.CredentialManagerCallback<androidx.view.CreateCredentialResponse, androidx.view.exceptions.CreateCredentialException> credentialManagerCallback = credentialProviderCreatePublicKeyCredentialController.getHighSpeedVideoFpsRanges;
        if (credentialManagerCallback == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            credentialManagerCallback = null;
        }
        credentialManagerCallback.onError(createCredentialException);
    }

    public static /* synthetic */ void $r8$lambda$NtEtbwTU0X5ysGY7u9ZMxdgtp5Y(androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, org.json.JSONException jSONException) {
        androidx.view.exceptions.publickeycredential.CreatePublicKeyCredentialDomException createPublicKeyCredentialDomException;
        androidx.view.CredentialManagerCallback<androidx.view.CreateCredentialResponse, androidx.view.exceptions.CreateCredentialException> credentialManagerCallback = credentialProviderCreatePublicKeyCredentialController.getHighSpeedVideoFpsRanges;
        if (credentialManagerCallback == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            credentialManagerCallback = null;
        }
        java.lang.String message = jSONException.getMessage();
        if (message != null && message.length() > 0) {
            createPublicKeyCredentialDomException = new androidx.view.exceptions.publickeycredential.CreatePublicKeyCredentialDomException(new androidx.view.exceptions.domerrors.EncodingError(), message);
        } else {
            createPublicKeyCredentialDomException = new androidx.view.exceptions.publickeycredential.CreatePublicKeyCredentialDomException(new androidx.view.exceptions.domerrors.EncodingError(), com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl.UNKNOWN_ERROR);
        }
        credentialManagerCallback.onError(createPublicKeyCredentialDomException);
    }

    /* renamed from: $r8$lambda$Q-PyqM0qgKBjteVzJvkKgWPGDRY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9097$r8$lambda$QPyqM0qgKBjteVzJvkKgWPGDRY(final androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, final java.lang.Throwable th) {
        java.util.concurrent.Executor executor = credentialProviderCreatePublicKeyCredentialController.Camera2StreamConfigurationMap;
        if (executor == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            executor = null;
        }
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.$r8$lambda$wcuPvYSbFq0HGUs07moQi7CBj5k(androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.this, th);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_DOYgvV302yoLFAQmvweLGzh0f8(final androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, final androidx.view.exceptions.CreateCredentialException createCredentialException) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createCredentialException, "");
        java.util.concurrent.Executor executor = credentialProviderCreatePublicKeyCredentialController.Camera2StreamConfigurationMap;
        if (executor == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            executor = null;
        }
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.$r8$lambda$FVo61JxFUI6wSDK0Cnx5BCMLhuM(androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.this, createCredentialException);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ void $r8$lambda$aDwa0TcP_Fs8MS0eX02eKrBZ35Y(androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, androidx.view.exceptions.CreateCredentialException createCredentialException) {
        androidx.view.CredentialManagerCallback<androidx.view.CreateCredentialResponse, androidx.view.exceptions.CreateCredentialException> credentialManagerCallback = credentialProviderCreatePublicKeyCredentialController.getHighSpeedVideoFpsRanges;
        if (credentialManagerCallback == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            credentialManagerCallback = null;
        }
        credentialManagerCallback.onError(createCredentialException);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$aV9hbjIQ43l0NE_ctgerBKM7JJ0(final androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, final androidx.view.exceptions.CreateCredentialException createCredentialException) {
        java.util.concurrent.Executor executor = credentialProviderCreatePublicKeyCredentialController.Camera2StreamConfigurationMap;
        if (executor == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            executor = null;
        }
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.m9096$r8$lambda$J1krUn153RQOLY4eAj0REs7gQ(androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.this, createCredentialException);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bgEYeSc7OR_yH8pOXKRVJdhtIH4(final androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, final java.lang.Throwable th) {
        java.util.concurrent.Executor executor = credentialProviderCreatePublicKeyCredentialController.Camera2StreamConfigurationMap;
        if (executor == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            executor = null;
        }
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.$r8$lambda$gUg77Qcx4tUd9k3OqPsDngyLzg8(androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.this, th);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$f9TQzHY7daPVL-YYCJexCcAZGgU, reason: not valid java name */
    public static /* synthetic */ void m9098$r8$lambda$f9TQzHY7daPVLYYCJexCcAZGgU(final androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, android.os.CancellationSignal cancellationSignal, java.lang.Exception exc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
        java.lang.Exception exc2 = exc;
        java.lang.String str = ((exc2 instanceof com.google.android.gms.common.api.ApiException) && androidx.view.playservices.controllers.CredentialProviderBaseController.INSTANCE.getRetryables().contains(java.lang.Integer.valueOf(((com.google.android.gms.common.api.ApiException) exc2).getStatusCode()))) ? androidx.view.playservices.controllers.CredentialProviderBaseController.CREATE_INTERRUPTED : androidx.view.playservices.controllers.CredentialProviderBaseController.CREATE_UNKNOWN;
        androidx.view.playservices.controllers.CredentialProviderBaseController.Companion companion = androidx.view.playservices.controllers.CredentialProviderBaseController.INSTANCE;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("During create public key credential, fido registration failure: ");
        sb.append(exc2.getMessage());
        final androidx.view.exceptions.CreateCredentialException createCredentialExceptionTypeToException$credentials_play_services_auth_release = companion.createCredentialExceptionTypeToException$credentials_play_services_auth_release(str, sb.toString());
        androidx.view.playservices.controllers.CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.$r8$lambda$GZ_DiW5laBi1vQG5BGKluZ54R2M(androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.this, createCredentialExceptionTypeToException$credentials_play_services_auth_release);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$gUg77Qcx4tUd9k3OqPsDngyLzg8(androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, java.lang.Throwable th) {
        androidx.view.CredentialManagerCallback<androidx.view.CreateCredentialResponse, androidx.view.exceptions.CreateCredentialException> credentialManagerCallback = credentialProviderCreatePublicKeyCredentialController.getHighSpeedVideoFpsRanges;
        if (credentialManagerCallback == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            credentialManagerCallback = null;
        }
        credentialManagerCallback.onError(new androidx.view.exceptions.CreateCredentialUnknownException(th.getMessage()));
    }

    public static /* synthetic */ void $r8$lambda$jrvO9OoQDzJdqkaNohSdWavha3c(androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, org.json.JSONException jSONException) {
        androidx.view.CredentialManagerCallback<androidx.view.CreateCredentialResponse, androidx.view.exceptions.CreateCredentialException> credentialManagerCallback = credentialProviderCreatePublicKeyCredentialController.getHighSpeedVideoFpsRanges;
        if (credentialManagerCallback == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            credentialManagerCallback = null;
        }
        credentialManagerCallback.onError(new androidx.view.exceptions.publickeycredential.CreatePublicKeyCredentialDomException(new androidx.view.exceptions.domerrors.EncodingError(), jSONException.getMessage()));
    }

    public static /* synthetic */ void $r8$lambda$krzjS8D5MKRrr0XFQG6mvZEV2kY(androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController) {
        androidx.view.CredentialManagerCallback<androidx.view.CreateCredentialResponse, androidx.view.exceptions.CreateCredentialException> credentialManagerCallback = credentialProviderCreatePublicKeyCredentialController.getHighSpeedVideoFpsRanges;
        if (credentialManagerCallback == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            credentialManagerCallback = null;
        }
        credentialManagerCallback.onError(new androidx.view.exceptions.publickeycredential.CreatePublicKeyCredentialDomException(new androidx.view.exceptions.domerrors.UnknownError(), "Upon handling create public key credential response, fido module giving null bytes indicating internal error"));
    }

    public static /* synthetic */ void $r8$lambda$npqbLmWPTHIlWks1KkfL_GIO8FI(androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController) {
        androidx.view.CredentialManagerCallback<androidx.view.CreateCredentialResponse, androidx.view.exceptions.CreateCredentialException> credentialManagerCallback = credentialProviderCreatePublicKeyCredentialController.getHighSpeedVideoFpsRanges;
        if (credentialManagerCallback == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            credentialManagerCallback = null;
        }
        credentialManagerCallback.onError(new androidx.view.exceptions.CreateCredentialUnknownException(androidx.view.playservices.controllers.CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
    }

    public static /* synthetic */ void $r8$lambda$wcuPvYSbFq0HGUs07moQi7CBj5k(androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, java.lang.Throwable th) {
        androidx.view.CredentialManagerCallback<androidx.view.CreateCredentialResponse, androidx.view.exceptions.CreateCredentialException> credentialManagerCallback = credentialProviderCreatePublicKeyCredentialController.getHighSpeedVideoFpsRanges;
        if (credentialManagerCallback == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            credentialManagerCallback = null;
        }
        credentialManagerCallback.onError(new androidx.view.exceptions.publickeycredential.CreatePublicKeyCredentialDomException(new androidx.view.exceptions.domerrors.UnknownError(), th.getMessage()));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$y4dn7kuLRWYN5x8gKlJfY7SYq2o(final androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, final org.json.JSONException jSONException) {
        java.util.concurrent.Executor executor = credentialProviderCreatePublicKeyCredentialController.Camera2StreamConfigurationMap;
        if (executor == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            executor = null;
        }
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.$r8$lambda$jrvO9OoQDzJdqkaNohSdWavha3c(androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController.this, jSONException);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController getInstance(android.content.Context context) {
        return INSTANCE.getInstance(context);
    }
}
