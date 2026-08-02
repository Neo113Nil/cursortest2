package com.zettle.sdk.feature.taptopay.core.refunds.models;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/models/RefundErrorPayload;", "", "", "error", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getError", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RefundErrorPayload {
    private final java.lang.String error;

    public RefundErrorPayload(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.error = str;
    }

    public final java.lang.String getError() {
        return this.error;
    }
}
