package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\"2\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00018G@GX\u0086\u000e¢\u0006\u0012\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/View;", "Landroidx/credentials/PendingGetCredentialRequest;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getPendingGetCredentialRequest", "(Landroid/view/View;)Landroidx/credentials/PendingGetCredentialRequest;", "setPendingGetCredentialRequest", "(Landroid/view/View;Landroidx/credentials/PendingGetCredentialRequest;)V", "getPendingGetCredentialRequest$annotations", "(Landroid/view/View;)V", "pendingGetCredentialRequest"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: androidx.credentials.CredentialManagerViewHandler, reason: from Kotlin metadata and case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C0272CredentialManagerViewHandler {
    public static /* synthetic */ void getPendingGetCredentialRequest$annotations(android.view.View view) {
    }

    public static final androidx.view.PendingGetCredentialRequest getPendingGetCredentialRequest(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        java.lang.Object tag = view.getTag(androidx.view.C0273R.id.androidx_credential_pendingCredentialRequest);
        if (tag instanceof androidx.view.PendingGetCredentialRequest) {
            return (androidx.view.PendingGetCredentialRequest) tag;
        }
        return null;
    }

    public static final void setPendingGetCredentialRequest(android.view.View view, androidx.view.PendingGetCredentialRequest pendingGetCredentialRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        view.setTag(androidx.view.C0273R.id.androidx_credential_pendingCredentialRequest, pendingGetCredentialRequest);
        if (pendingGetCredentialRequest != null) {
            if (android.os.Build.VERSION.SDK_INT >= 35 || (android.os.Build.VERSION.SDK_INT == 34 && android.os.Build.VERSION.PREVIEW_SDK_INT > 0)) {
                androidx.view.Api35Impl.INSTANCE.getHighSpeedVideoSizes(view, pendingGetCredentialRequest.getRequest(), pendingGetCredentialRequest.getCallback());
                return;
            }
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 35 || (android.os.Build.VERSION.SDK_INT == 34 && android.os.Build.VERSION.PREVIEW_SDK_INT > 0)) {
            androidx.view.Api35Impl.INSTANCE.getHighResolutionOutputSizeshNQ4ISI(view);
        }
    }
}
