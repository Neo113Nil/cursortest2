package com.zettle.sdk.feature.taptopay.core.transaction.models;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionDeclinedPayload;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/Payload;", "", "state", "result", "transactionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getResult", "()Ljava/lang/String;", "getState", "getTransactionId"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TransactionDeclinedPayload extends com.zettle.sdk.feature.taptopay.core.transaction.models.Payload {
    private final java.lang.String result;
    private final java.lang.String state;
    private final java.lang.String transactionId;

    public /* synthetic */ TransactionDeclinedPayload(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }

    public final java.lang.String getState() {
        return this.state;
    }

    public final java.lang.String getResult() {
        return this.result;
    }

    public final java.lang.String getTransactionId() {
        return this.transactionId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionDeclinedPayload(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.state = str;
        this.result = str2;
        this.transactionId = str3;
    }
}
