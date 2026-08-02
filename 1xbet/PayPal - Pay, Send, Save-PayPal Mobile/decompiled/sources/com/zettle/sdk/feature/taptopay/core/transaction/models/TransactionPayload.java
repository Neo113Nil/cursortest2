package com.zettle.sdk.feature.taptopay.core.transaction.models;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\n\u0010\t"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionPayload;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/Payload;", "", "state", "result", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getResult", "()Ljava/lang/String;", "getState"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TransactionPayload extends com.zettle.sdk.feature.taptopay.core.transaction.models.Payload {
    private final java.lang.String result;
    private final java.lang.String state;

    public final java.lang.String getState() {
        return this.state;
    }

    public final java.lang.String getResult() {
        return this.result;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionPayload(java.lang.String str, java.lang.String str2) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.state = str;
        this.result = str2;
    }
}
