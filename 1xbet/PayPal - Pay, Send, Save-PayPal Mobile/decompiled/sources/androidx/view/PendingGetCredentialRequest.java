package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/credentials/PendingGetCredentialRequest;", "", "Landroidx/credentials/GetCredentialRequest;", "request", "Lkotlin/Function1;", "Landroidx/credentials/GetCredentialResponse;", "", com.sun.jna.Callback.METHOD_NAME, "<init>", "(Landroidx/credentials/GetCredentialRequest;Lkotlin/jvm/functions/Function1;)V", "Landroidx/credentials/GetCredentialRequest;", "getRequest", "()Landroidx/credentials/GetCredentialRequest;", "Lkotlin/jvm/functions/Function1;", "getCallback", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PendingGetCredentialRequest {
    private final kotlin.jvm.functions.Function1<androidx.view.GetCredentialResponse, kotlin.Unit> callback;
    private final androidx.view.GetCredentialRequest request;

    /* JADX WARN: Multi-variable type inference failed */
    public PendingGetCredentialRequest(androidx.view.GetCredentialRequest getCredentialRequest, kotlin.jvm.functions.Function1<? super androidx.view.GetCredentialResponse, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCredentialRequest, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.request = getCredentialRequest;
        this.callback = function1;
    }

    public final androidx.view.GetCredentialRequest getRequest() {
        return this.request;
    }

    public final kotlin.jvm.functions.Function1<androidx.view.GetCredentialResponse, kotlin.Unit> getCallback() {
        return this.callback;
    }
}
