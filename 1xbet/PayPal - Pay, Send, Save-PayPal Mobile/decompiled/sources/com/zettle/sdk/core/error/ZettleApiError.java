package com.zettle.sdk.core.error;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/core/error/ZettleApiError;", "Lcom/zettle/sdk/ui/ZettleApiResult$Failed;", "Lcom/zettle/sdk/ui/FailureReason;", "reason", "<init>", "(Lcom/zettle/sdk/ui/FailureReason;)V", "Lcom/zettle/sdk/ui/FailureReason;", "getReason", "()Lcom/zettle/sdk/ui/FailureReason;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ZettleApiError implements com.zettle.sdk.ui.ZettleApiResult.Failed {
    private final com.zettle.sdk.ui.FailureReason reason;

    public ZettleApiError(com.zettle.sdk.ui.FailureReason failureReason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failureReason, "");
        this.reason = failureReason;
    }

    @Override // com.zettle.sdk.ui.ZettleApiResult.Failed
    public final com.zettle.sdk.ui.FailureReason getReason() {
        return this.reason;
    }
}
