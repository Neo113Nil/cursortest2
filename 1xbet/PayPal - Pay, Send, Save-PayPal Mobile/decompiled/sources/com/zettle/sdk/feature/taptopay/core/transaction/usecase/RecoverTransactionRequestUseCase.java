package com.zettle.sdk.feature.taptopay.core.transaction.usecase;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\bà\u0080\u0001\u0018\u00002&\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0004\u0012\u00020\u00060\u0001:\u0001\fJ4\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H¦\u0002¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/RecoverTransactionRequestUseCase;", "Lkotlin/Function3;", "Lcom/zettle/sdk/commons/network/NetworkClient;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "Lkotlin/Function1;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/RecoverTransactionRequestUseCase$Result;", "", "networkClient", "info", "block", "invoke", "(Lcom/zettle/sdk/commons/network/NetworkClient;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;Lkotlin/jvm/functions/Function1;)V", "Result"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface RecoverTransactionRequestUseCase extends kotlin.jvm.functions.Function3<com.zettle.sdk.commons.network.NetworkClient, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo, kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCase.Result, ? extends kotlin.Unit>, kotlin.Unit> {
    void invoke(com.zettle.sdk.commons.network.NetworkClient networkClient, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo info, kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCase.Result, kotlin.Unit> block);

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/RecoverTransactionRequestUseCase$Result;", "", "<init>", "()V", "BackendIssue", "Failed", "Success", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/RecoverTransactionRequestUseCase$Result$BackendIssue;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/RecoverTransactionRequestUseCase$Result$Failed;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/RecoverTransactionRequestUseCase$Result$Success;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Result {

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/RecoverTransactionRequestUseCase$Result$Failed;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/RecoverTransactionRequestUseCase$Result;", "Ljava/util/UUID;", com.zettle.sdk.commons.network.JsonKt.KEY_REFERENCES_LOCAL_TRANSACTION_UUID, "Lcom/zettle/sdk/feature/taptopay/core/FailureReason;", "reason", "<init>", "(Ljava/util/UUID;Lcom/zettle/sdk/feature/taptopay/core/FailureReason;)V", "Ljava/util/UUID;", "getLocalUUID", "()Ljava/util/UUID;", "Lcom/zettle/sdk/feature/taptopay/core/FailureReason;", "getReason", "()Lcom/zettle/sdk/feature/taptopay/core/FailureReason;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Failed extends com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCase.Result {
            private final java.util.UUID localUUID;
            private final com.zettle.sdk.feature.taptopay.core.FailureReason reason;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failed(java.util.UUID uuid, com.zettle.sdk.feature.taptopay.core.FailureReason failureReason) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uuid, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failureReason, "");
                this.localUUID = uuid;
                this.reason = failureReason;
            }

            public final java.util.UUID getLocalUUID() {
                return this.localUUID;
            }

            public final com.zettle.sdk.feature.taptopay.core.FailureReason getReason() {
                return this.reason;
            }
        }

        private Result() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/RecoverTransactionRequestUseCase$Result$Success;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/RecoverTransactionRequestUseCase$Result;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/Payload;", "payload", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/Payload;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/Payload;", "getPayload", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/Payload;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Success extends com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCase.Result {
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

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/RecoverTransactionRequestUseCase$Result$BackendIssue;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/RecoverTransactionRequestUseCase$Result;", "Ljava/util/UUID;", com.zettle.sdk.commons.network.JsonKt.KEY_REFERENCES_LOCAL_TRANSACTION_UUID, "<init>", "(Ljava/util/UUID;)V", "Ljava/util/UUID;", "getLocalUUID", "()Ljava/util/UUID;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class BackendIssue extends com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCase.Result {
            private final java.util.UUID localUUID;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BackendIssue(java.util.UUID uuid) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uuid, "");
                this.localUUID = uuid;
            }

            public final java.util.UUID getLocalUUID() {
                return this.localUUID;
            }
        }

        public /* synthetic */ Result(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
