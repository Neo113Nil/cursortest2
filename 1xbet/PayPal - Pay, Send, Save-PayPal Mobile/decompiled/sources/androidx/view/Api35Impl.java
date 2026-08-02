package androidx.view;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/credentials/Api35Impl;", "", "<init>", "()V", "Landroid/view/View;", "p0", "Landroidx/credentials/GetCredentialRequest;", "p1", "Lkotlin/Function1;", "Landroidx/credentials/GetCredentialResponse;", "", "p2", "getHighSpeedVideoSizes", "(Landroid/view/View;Landroidx/credentials/GetCredentialRequest;Lkotlin/jvm/functions/Function1;)V", "getHighResolutionOutputSizeshNQ4ISI", "(Landroid/view/View;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final class Api35Impl {
    public static final androidx.view.Api35Impl INSTANCE = new androidx.view.Api35Impl();

    private Api35Impl() {
    }

    public final void getHighSpeedVideoSizes(android.view.View p0, androidx.view.GetCredentialRequest p1, final kotlin.jvm.functions.Function1<? super androidx.view.GetCredentialResponse, kotlin.Unit> p2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "");
        p0.setPendingCredentialRequest(androidx.view.internal.FrameworkImplHelper.INSTANCE.convertGetRequestToFrameworkClass(p1), new android.os.OutcomeReceiver<android.credentials.GetCredentialResponse, android.credentials.GetCredentialException>() { // from class: androidx.credentials.Api35Impl$setPendingGetCredentialRequest$frameworkCallback$1
            @Override // android.os.OutcomeReceiver
            public final void onResult(android.credentials.GetCredentialResponse response) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
                p2.invoke(androidx.view.internal.FrameworkImplHelper.INSTANCE.convertGetResponseToJetpackClass(response));
            }

            @Override // android.os.OutcomeReceiver
            public final void onError(android.credentials.GetCredentialException error) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                error.getType();
                error.getMessage();
            }
        });
    }

    public final void getHighResolutionOutputSizeshNQ4ISI(android.view.View p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        p0.clearPendingCredentialRequest();
    }
}
