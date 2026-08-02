package com.zettle.sdk.feature.taptopay.core.transaction;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TapToPayRecoverTransaction;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionResult;", "<init>", "()V", "Failed", "Success", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TapToPayRecoverTransaction$Failed;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TapToPayRecoverTransaction$Success;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class TapToPayRecoverTransaction implements com.zettle.sdk.feature.taptopay.core.transaction.TransactionResult {

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TapToPayRecoverTransaction$Success;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TapToPayRecoverTransaction;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/Payload;", "payload", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/Payload;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/Payload;", "getPayload", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/Payload;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Success extends com.zettle.sdk.feature.taptopay.core.transaction.TapToPayRecoverTransaction {
        private final com.zettle.sdk.feature.taptopay.core.transaction.models.Payload payload;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.zettle.sdk.feature.taptopay.core.transaction.models.Payload payload) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "");
            this.payload = payload;
        }

        public final com.zettle.sdk.feature.taptopay.core.transaction.models.Payload getPayload() {
            return this.payload;
        }
    }

    private TapToPayRecoverTransaction() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TapToPayRecoverTransaction$Failed;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TapToPayRecoverTransaction;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "info", "Lcom/zettle/sdk/feature/taptopay/core/FailureReason;", "reason", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;Lcom/zettle/sdk/feature/taptopay/core/FailureReason;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "getInfo", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "Lcom/zettle/sdk/feature/taptopay/core/FailureReason;", "getReason", "()Lcom/zettle/sdk/feature/taptopay/core/FailureReason;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Failed extends com.zettle.sdk.feature.taptopay.core.transaction.TapToPayRecoverTransaction {
        private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo info;
        private final com.zettle.sdk.feature.taptopay.core.FailureReason reason;

        public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo getInfo() {
            return this.info;
        }

        public final com.zettle.sdk.feature.taptopay.core.FailureReason getReason() {
            return this.reason;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo, com.zettle.sdk.feature.taptopay.core.FailureReason failureReason) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionInfo, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failureReason, "");
            this.info = transactionInfo;
            this.reason = failureReason;
        }
    }

    public /* synthetic */ TapToPayRecoverTransaction(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
