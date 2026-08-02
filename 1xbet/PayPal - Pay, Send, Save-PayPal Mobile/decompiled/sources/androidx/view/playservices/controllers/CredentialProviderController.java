package androidx.view.playservices.controllers;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b \u0018\u0000 $*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u0001*\b\b\u0003\u0010\u0005*\u00020\u0001*\b\b\u0004\u0010\u0006*\u00020\u00012\u00020\u0007:\u0001$B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ[\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\u001c\u0010\u0010\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00028\u00040\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0004¢\u0006\u0004\b\u0018\u0010\u0019J?\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00028\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u00132\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00028\u00012\u0006\u0010\u001a\u001a\u00028\u0000H$¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00028\u00032\u0006\u0010 \u001a\u00028\u0002H$¢\u0006\u0004\b!\u0010\u001fR\u0014\u0010\"\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#"}, d2 = {"Landroidx/credentials/playservices/controllers/CredentialProviderController;", "", "T1", "T2", "R2", "R1", "E1", "Landroidx/credentials/playservices/controllers/CredentialProviderBaseController;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "resultData", "Lkotlin/Function2;", "", "conversionFn", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/credentials/CredentialManagerCallback;", com.sun.jna.Callback.METHOD_NAME, "Landroid/os/CancellationSignal;", "cancellationSignal", "", "maybeReportErrorFromResultReceiver", "(Landroid/os/Bundle;Lkotlin/jvm/functions/Function2;Ljava/util/concurrent/Executor;Landroidx/credentials/CredentialManagerCallback;Landroid/os/CancellationSignal;)Z", "request", "", "invokePlayServices", "(Ljava/lang/Object;Landroidx/credentials/CredentialManagerCallback;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "convertRequestToPlayServices", "(Ljava/lang/Object;)Ljava/lang/Object;", "response", "convertResponseToCredentialManager", "Camera2StreamConfigurationMap", "Landroid/content/Context;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class CredentialProviderController<T1, T2, R2, R1, E1> extends androidx.view.playservices.controllers.CredentialProviderBaseController {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.playservices.controllers.CredentialProviderController.Companion INSTANCE = new androidx.view.playservices.controllers.CredentialProviderController.Companion(null);
    public static final java.lang.String ERROR_MESSAGE_START_ACTIVITY_FAILED = "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.";
    private final android.content.Context Camera2StreamConfigurationMap;

    protected abstract T2 convertRequestToPlayServices(T1 request);

    protected abstract R1 convertResponseToCredentialManager(R2 response);

    public abstract void invokePlayServices(T1 request, androidx.view.CredentialManagerCallback<R1, E1> callback, java.util.concurrent.Executor executor, android.os.CancellationSignal cancellationSignal);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderController(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.Camera2StreamConfigurationMap = context;
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JW\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042 \u0010\n\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\t0\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016JW\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042 \u0010\n\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\t0\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\t0\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0004\b\u0018\u0010\u0011J'\u0010\u001a\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Landroidx/credentials/playservices/controllers/CredentialProviderController$Companion;", "", "<init>", "()V", "", "resultCode", "Lkotlin/Function2;", "Landroid/os/CancellationSignal;", "Lkotlin/Function0;", "", "cancelOnError", "Lkotlin/Function1;", "Landroidx/credentials/exceptions/CreateCredentialException;", "onError", "cancellationSignal", "", "maybeReportErrorResultCodeCreate", "(ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroid/os/CancellationSignal;)Z", "", "generateErrorStringUnknown$credentials_play_services_auth_release", "(I)Ljava/lang/String;", "generateErrorStringCanceled$credentials_play_services_auth_release", "()Ljava/lang/String;", "Landroidx/credentials/exceptions/GetCredentialException;", "maybeReportErrorResultCodeGet$credentials_play_services_auth_release", "onResultOrException", "cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release", "(Landroid/os/CancellationSignal;Lkotlin/jvm/functions/Function0;)V", "ERROR_MESSAGE_START_ACTIVITY_FAILED", "Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [T, androidx.credentials.exceptions.CreateCredentialUnknownException] */
        /* JADX WARN: Type inference failed for: r4v4, types: [T, androidx.credentials.exceptions.CreateCredentialCancellationException] */
        @kotlin.jvm.JvmStatic
        protected final boolean maybeReportErrorResultCodeCreate(int resultCode, kotlin.jvm.functions.Function2<? super android.os.CancellationSignal, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> cancelOnError, final kotlin.jvm.functions.Function1<? super androidx.view.exceptions.CreateCredentialException, kotlin.Unit> onError, android.os.CancellationSignal cancellationSignal) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancelOnError, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onError, "");
            if (resultCode == -1) {
                return false;
            }
            final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            objectRef.element = new androidx.view.exceptions.CreateCredentialUnknownException(generateErrorStringUnknown$credentials_play_services_auth_release(resultCode));
            if (resultCode == 0) {
                objectRef.element = new androidx.view.exceptions.CreateCredentialCancellationException(generateErrorStringCanceled$credentials_play_services_auth_release());
            }
            cancelOnError.invoke(cancellationSignal, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.CredentialProviderController$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.view.playservices.controllers.CredentialProviderController.Companion.$r8$lambda$gJXSR3NACyPlTRlP79kwjKj4Ji4(kotlin.jvm.functions.Function1.this, objectRef);
                }
            });
            return true;
        }

        public final java.lang.String generateErrorStringUnknown$credentials_play_services_auth_release(int resultCode) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("activity with result code: ");
            sb.append(resultCode);
            sb.append(" indicating not RESULT_OK");
            return sb.toString();
        }

        public final java.lang.String generateErrorStringCanceled$credentials_play_services_auth_release() {
            return "activity is cancelled by the user.";
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [T, androidx.credentials.exceptions.GetCredentialUnknownException] */
        /* JADX WARN: Type inference failed for: r4v4, types: [T, androidx.credentials.exceptions.GetCredentialCancellationException] */
        @kotlin.jvm.JvmStatic
        public final boolean maybeReportErrorResultCodeGet$credentials_play_services_auth_release(int resultCode, kotlin.jvm.functions.Function2<? super android.os.CancellationSignal, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> cancelOnError, final kotlin.jvm.functions.Function1<? super androidx.view.exceptions.GetCredentialException, kotlin.Unit> onError, android.os.CancellationSignal cancellationSignal) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancelOnError, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onError, "");
            if (resultCode == -1) {
                return false;
            }
            final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            objectRef.element = new androidx.view.exceptions.GetCredentialUnknownException(generateErrorStringUnknown$credentials_play_services_auth_release(resultCode));
            if (resultCode == 0) {
                objectRef.element = new androidx.view.exceptions.GetCredentialCancellationException(generateErrorStringCanceled$credentials_play_services_auth_release());
            }
            cancelOnError.invoke(cancellationSignal, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.CredentialProviderController$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.view.playservices.controllers.CredentialProviderController.Companion.$r8$lambda$L3A61OiqsxEKaG1rAmKPE4eGsQY(kotlin.jvm.functions.Function1.this, objectRef);
                }
            });
            return true;
        }

        @kotlin.jvm.JvmStatic
        public final void cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(android.os.CancellationSignal cancellationSignal, kotlin.jvm.functions.Function0<kotlin.Unit> onResultOrException) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onResultOrException, "");
            if (androidx.view.playservices.CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                return;
            }
            onResultOrException.invoke();
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$L3A61OiqsxEKaG1rAmKPE4eGsQY(kotlin.jvm.functions.Function1 function1, kotlin.jvm.internal.Ref.ObjectRef objectRef) {
            function1.invoke(objectRef.element);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$gJXSR3NACyPlTRlP79kwjKj4Ji4(kotlin.jvm.functions.Function1 function1, kotlin.jvm.internal.Ref.ObjectRef objectRef) {
            function1.invoke(objectRef.element);
            return kotlin.Unit.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final boolean maybeReportErrorFromResultReceiver(android.os.Bundle resultData, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, ? extends E1> conversionFn, final java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback<R1, E1> callback, android.os.CancellationSignal cancellationSignal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conversionFn, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        if (!resultData.getBoolean(androidx.view.playservices.controllers.CredentialProviderBaseController.FAILURE_RESPONSE_TAG)) {
            return false;
        }
        final E1 invoke = conversionFn.invoke(resultData.getString(androidx.view.playservices.controllers.CredentialProviderBaseController.EXCEPTION_TYPE_TAG), resultData.getString(androidx.view.playservices.controllers.CredentialProviderBaseController.EXCEPTION_MESSAGE_TAG));
        INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new kotlin.jvm.functions.Function0() { // from class: androidx.credentials.playservices.controllers.CredentialProviderController$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.view.playservices.controllers.CredentialProviderController.$r8$lambda$n47xgMiG50_l3R9Et58_9VYKO94(executor, callback, invoke);
            }
        });
        return true;
    }

    public static /* synthetic */ void invokePlayServices$default(androidx.view.playservices.controllers.CredentialProviderController credentialProviderController, java.lang.Object obj, androidx.view.CredentialManagerCallback credentialManagerCallback, java.util.concurrent.Executor executor, android.os.CancellationSignal cancellationSignal, int i, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokePlayServices");
        }
        if ((i & 8) != 0) {
            cancellationSignal = null;
        }
        credentialProviderController.invokePlayServices(obj, credentialManagerCallback, executor, cancellationSignal);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$n47xgMiG50_l3R9Et58_9VYKO94(java.util.concurrent.Executor executor, final androidx.view.CredentialManagerCallback credentialManagerCallback, final java.lang.Object obj) {
        executor.execute(new java.lang.Runnable() { // from class: androidx.credentials.playservices.controllers.CredentialProviderController$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.CredentialManagerCallback.this.onError(obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.jvm.JvmStatic
    public static final boolean maybeReportErrorResultCodeCreate(int i, kotlin.jvm.functions.Function2<? super android.os.CancellationSignal, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> function2, kotlin.jvm.functions.Function1<? super androidx.view.exceptions.CreateCredentialException, kotlin.Unit> function1, android.os.CancellationSignal cancellationSignal) {
        return INSTANCE.maybeReportErrorResultCodeCreate(i, function2, function1, cancellationSignal);
    }
}
