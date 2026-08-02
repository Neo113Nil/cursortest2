package androidx.view.provider;

@kotlin.Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\b¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\b¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u001a0\bH&¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010 \u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\bH&¢\u0006\u0004\b \u0010!J3\u0010%\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\bH&¢\u0006\u0004\b%\u0010&R*\u0010)\u001a\u00020'2\u0006\u0010(\u001a\u00020'8G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+\"\u0004\b,\u0010-R.\u0010.\u001a\u0004\u0018\u00010\"2\b\u0010(\u001a\u0004\u0018\u00010\"8G@GX\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R.\u00104\u001a\u0004\u0018\u00010\u001d2\b\u0010(\u001a\u0004\u0018\u00010\u001d8G@GX\u0087\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R.\u0010:\u001a\u0004\u0018\u00010\u00192\b\u0010(\u001a\u0004\u0018\u00010\u00198G@GX\u0087\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?"}, d2 = {"Landroidx/credentials/provider/CredentialProviderService;", "Landroid/service/credentials/CredentialProviderService;", "<init>", "()V", "Landroid/service/credentials/BeginGetCredentialRequest;", "request", "Landroid/os/CancellationSignal;", "cancellationSignal", "Landroid/os/OutcomeReceiver;", "Landroid/service/credentials/BeginGetCredentialResponse;", "Landroid/credentials/GetCredentialException;", com.sun.jna.Callback.METHOD_NAME, "", "onBeginGetCredential", "(Landroid/service/credentials/BeginGetCredentialRequest;Landroid/os/CancellationSignal;Landroid/os/OutcomeReceiver;)V", "Landroid/service/credentials/BeginCreateCredentialRequest;", "Landroid/service/credentials/BeginCreateCredentialResponse;", "Landroid/credentials/CreateCredentialException;", "onBeginCreateCredential", "(Landroid/service/credentials/BeginCreateCredentialRequest;Landroid/os/CancellationSignal;Landroid/os/OutcomeReceiver;)V", "Landroid/service/credentials/ClearCredentialStateRequest;", "Ljava/lang/Void;", "Landroid/credentials/ClearCredentialStateException;", "onClearCredentialState", "(Landroid/service/credentials/ClearCredentialStateRequest;Landroid/os/CancellationSignal;Landroid/os/OutcomeReceiver;)V", "Landroidx/credentials/provider/ProviderClearCredentialStateRequest;", "Landroidx/credentials/exceptions/ClearCredentialException;", "onClearCredentialStateRequest", "(Landroidx/credentials/provider/ProviderClearCredentialStateRequest;Landroid/os/CancellationSignal;Landroid/os/OutcomeReceiver;)V", "Landroidx/credentials/provider/BeginGetCredentialRequest;", "Landroidx/credentials/provider/BeginGetCredentialResponse;", "Landroidx/credentials/exceptions/GetCredentialException;", "onBeginGetCredentialRequest", "(Landroidx/credentials/provider/BeginGetCredentialRequest;Landroid/os/CancellationSignal;Landroid/os/OutcomeReceiver;)V", "Landroidx/credentials/provider/BeginCreateCredentialRequest;", "Landroidx/credentials/provider/BeginCreateCredentialResponse;", "Landroidx/credentials/exceptions/CreateCredentialException;", "onBeginCreateCredentialRequest", "(Landroidx/credentials/provider/BeginCreateCredentialRequest;Landroid/os/CancellationSignal;Landroid/os/OutcomeReceiver;)V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "isTestMode", "Z", "()Z", "setTestMode", "(Z)V", "lastCreateRequest", "Landroidx/credentials/provider/BeginCreateCredentialRequest;", "getLastCreateRequest", "()Landroidx/credentials/provider/BeginCreateCredentialRequest;", "setLastCreateRequest", "(Landroidx/credentials/provider/BeginCreateCredentialRequest;)V", "lastGetRequest", "Landroidx/credentials/provider/BeginGetCredentialRequest;", "getLastGetRequest", "()Landroidx/credentials/provider/BeginGetCredentialRequest;", "setLastGetRequest", "(Landroidx/credentials/provider/BeginGetCredentialRequest;)V", "lastClearRequest", "Landroidx/credentials/provider/ProviderClearCredentialStateRequest;", "getLastClearRequest", "()Landroidx/credentials/provider/ProviderClearCredentialStateRequest;", "setLastClearRequest", "(Landroidx/credentials/provider/ProviderClearCredentialStateRequest;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class CredentialProviderService extends android.service.credentials.CredentialProviderService {
    private boolean isTestMode;
    private androidx.view.provider.ProviderClearCredentialStateRequest lastClearRequest;
    private androidx.view.provider.BeginCreateCredentialRequest lastCreateRequest;
    private androidx.view.provider.BeginGetCredentialRequest lastGetRequest;

    public abstract void onBeginCreateCredentialRequest(androidx.view.provider.BeginCreateCredentialRequest request, android.os.CancellationSignal cancellationSignal, android.os.OutcomeReceiver<androidx.view.provider.BeginCreateCredentialResponse, androidx.view.exceptions.CreateCredentialException> callback);

    public abstract void onBeginGetCredentialRequest(androidx.view.provider.BeginGetCredentialRequest request, android.os.CancellationSignal cancellationSignal, android.os.OutcomeReceiver<androidx.view.provider.BeginGetCredentialResponse, androidx.view.exceptions.GetCredentialException> callback);

    public abstract void onClearCredentialStateRequest(androidx.view.provider.ProviderClearCredentialStateRequest request, android.os.CancellationSignal cancellationSignal, android.os.OutcomeReceiver<java.lang.Void, androidx.view.exceptions.ClearCredentialException> callback);

    /* renamed from: isTestMode, reason: from getter */
    public final boolean getIsTestMode() {
        return this.isTestMode;
    }

    public final void setTestMode(boolean z) {
        this.isTestMode = z;
    }

    public final androidx.view.provider.BeginCreateCredentialRequest getLastCreateRequest() {
        return this.lastCreateRequest;
    }

    public final void setLastCreateRequest(androidx.view.provider.BeginCreateCredentialRequest beginCreateCredentialRequest) {
        this.lastCreateRequest = beginCreateCredentialRequest;
    }

    public final androidx.view.provider.BeginGetCredentialRequest getLastGetRequest() {
        return this.lastGetRequest;
    }

    public final void setLastGetRequest(androidx.view.provider.BeginGetCredentialRequest beginGetCredentialRequest) {
        this.lastGetRequest = beginGetCredentialRequest;
    }

    public final androidx.view.provider.ProviderClearCredentialStateRequest getLastClearRequest() {
        return this.lastClearRequest;
    }

    public final void setLastClearRequest(androidx.view.provider.ProviderClearCredentialStateRequest providerClearCredentialStateRequest) {
        this.lastClearRequest = providerClearCredentialStateRequest;
    }

    @Override // android.service.credentials.CredentialProviderService
    public final void onBeginGetCredential(android.service.credentials.BeginGetCredentialRequest request, android.os.CancellationSignal cancellationSignal, final android.os.OutcomeReceiver<android.service.credentials.BeginGetCredentialResponse, android.credentials.GetCredentialException> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancellationSignal, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        androidx.view.provider.BeginGetCredentialRequest convertToJetpackRequest$credentials_release = androidx.view.provider.utils.BeginGetCredentialUtil.INSTANCE.convertToJetpackRequest$credentials_release(request);
        android.os.OutcomeReceiver<androidx.view.provider.BeginGetCredentialResponse, androidx.view.exceptions.GetCredentialException> outcomeReceiver = new android.os.OutcomeReceiver<androidx.view.provider.BeginGetCredentialResponse, androidx.view.exceptions.GetCredentialException>() { // from class: androidx.credentials.provider.CredentialProviderService$onBeginGetCredential$outcome$1
            @Override // android.os.OutcomeReceiver
            public final void onResult(androidx.view.provider.BeginGetCredentialResponse response) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
                callback.onResult(androidx.view.provider.utils.BeginGetCredentialUtil.INSTANCE.convertToFrameworkResponse(response));
            }

            @Override // android.os.OutcomeReceiver
            public final void onError(androidx.view.exceptions.GetCredentialException error) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                callback.onError(new android.credentials.GetCredentialException(error.getType(), error.getMessage()));
            }
        };
        if (this.isTestMode) {
            this.lastGetRequest = convertToJetpackRequest$credentials_release;
        }
        onBeginGetCredentialRequest(convertToJetpackRequest$credentials_release, cancellationSignal, outcomeReceiver);
    }

    @Override // android.service.credentials.CredentialProviderService
    public final void onBeginCreateCredential(android.service.credentials.BeginCreateCredentialRequest request, android.os.CancellationSignal cancellationSignal, final android.os.OutcomeReceiver<android.service.credentials.BeginCreateCredentialResponse, android.credentials.CreateCredentialException> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancellationSignal, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        android.os.OutcomeReceiver<androidx.view.provider.BeginCreateCredentialResponse, androidx.view.exceptions.CreateCredentialException> outcomeReceiver = new android.os.OutcomeReceiver<androidx.view.provider.BeginCreateCredentialResponse, androidx.view.exceptions.CreateCredentialException>() { // from class: androidx.credentials.provider.CredentialProviderService$onBeginCreateCredential$outcome$1
            @Override // android.os.OutcomeReceiver
            public final void onResult(androidx.view.provider.BeginCreateCredentialResponse response) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
                callback.onResult(androidx.view.provider.utils.BeginCreateCredentialUtil.INSTANCE.convertToFrameworkResponse(response));
            }

            @Override // android.os.OutcomeReceiver
            public final void onError(androidx.view.exceptions.CreateCredentialException error) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                callback.onError(new android.credentials.CreateCredentialException(error.getType(), error.getMessage()));
            }
        };
        androidx.view.provider.BeginCreateCredentialRequest convertToJetpackRequest$credentials_release = androidx.view.provider.utils.BeginCreateCredentialUtil.INSTANCE.convertToJetpackRequest$credentials_release(request);
        if (this.isTestMode) {
            this.lastCreateRequest = convertToJetpackRequest$credentials_release;
        }
        onBeginCreateCredentialRequest(convertToJetpackRequest$credentials_release, cancellationSignal, outcomeReceiver);
    }

    @Override // android.service.credentials.CredentialProviderService
    public final void onClearCredentialState(android.service.credentials.ClearCredentialStateRequest request, android.os.CancellationSignal cancellationSignal, final android.os.OutcomeReceiver<java.lang.Void, android.credentials.ClearCredentialStateException> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancellationSignal, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        android.os.OutcomeReceiver<java.lang.Void, androidx.view.exceptions.ClearCredentialException> outcomeReceiver = new android.os.OutcomeReceiver<java.lang.Void, androidx.view.exceptions.ClearCredentialException>() { // from class: androidx.credentials.provider.CredentialProviderService$onClearCredentialState$outcome$1
            @Override // android.os.OutcomeReceiver
            public final void onResult(java.lang.Void response) {
                callback.onResult(response);
            }

            @Override // android.os.OutcomeReceiver
            public final void onError(androidx.view.exceptions.ClearCredentialException error) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                callback.onError(new android.credentials.ClearCredentialStateException(error.getType(), error.getMessage()));
            }
        };
        androidx.view.provider.ProviderClearCredentialStateRequest convertToJetpackRequest$credentials_release = androidx.view.provider.utils.ClearCredentialUtil.INSTANCE.convertToJetpackRequest$credentials_release(request);
        if (this.isTestMode) {
            this.lastClearRequest = convertToJetpackRequest$credentials_release;
        }
        onClearCredentialStateRequest(convertToJetpackRequest$credentials_release, cancellationSignal, outcomeReceiver);
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
