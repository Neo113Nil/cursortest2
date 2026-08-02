package androidx.webkit.internal;

/* loaded from: classes7.dex */
public class PrefetchOperationCallbackAdapter {
    private PrefetchOperationCallbackAdapter() {
    }

    public static java.lang.reflect.InvocationHandler buildInvocationHandler(final androidx.webkit.OutcomeReceiverCompat<java.lang.Void, androidx.webkit.PrefetchException> outcomeReceiverCompat) {
        return org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new org.chromium.support_lib_boundary.PrefetchOperationCallbackBoundaryInterface() { // from class: androidx.webkit.internal.PrefetchOperationCallbackAdapter.1
            @Override // org.chromium.support_lib_boundary.PrefetchOperationCallbackBoundaryInterface
            public void onSuccess() {
                androidx.webkit.OutcomeReceiverCompat.this.onResult(null);
            }

            @Override // org.chromium.support_lib_boundary.PrefetchOperationCallbackBoundaryInterface
            public void onFailure(int i, java.lang.String str, int i2) {
                if (i == 1) {
                    androidx.webkit.OutcomeReceiverCompat.this.onError(new androidx.webkit.PrefetchNetworkException(str, i2));
                } else {
                    androidx.webkit.OutcomeReceiverCompat.this.onError(new androidx.webkit.PrefetchException(str));
                }
            }
        });
    }
}
