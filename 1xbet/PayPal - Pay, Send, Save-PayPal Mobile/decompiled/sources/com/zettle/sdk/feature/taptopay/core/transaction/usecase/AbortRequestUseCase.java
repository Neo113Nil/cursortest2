package com.zettle.sdk.feature.taptopay.core.transaction.usecase;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\bà\u0080\u0001\u0018\u000022\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\b0\u0001:\u0001\u0010JD\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00052\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H¦\u0002¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/AbortRequestUseCase;", "Lkotlin/Function5;", "Lcom/zettle/sdk/commons/network/NetworkClient;", "Lcom/zettle/sdk/core/os/LocationInfo;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "Lcom/zettle/sdk/feature/taptopay/core/FailureReason;", "Lkotlin/Function1;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/AbortRequestUseCase$Result;", "", "networkClient", "locationInfo", "info", "reason", "block", "invoke", "(Lcom/zettle/sdk/commons/network/NetworkClient;Lcom/zettle/sdk/core/os/LocationInfo;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;Lcom/zettle/sdk/feature/taptopay/core/FailureReason;Lkotlin/jvm/functions/Function1;)V", "Result"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface AbortRequestUseCase extends kotlin.jvm.functions.Function5<com.zettle.sdk.commons.network.NetworkClient, com.zettle.sdk.core.os.LocationInfo, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo, com.zettle.sdk.feature.taptopay.core.FailureReason, kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.AbortRequestUseCase.Result, ? extends kotlin.Unit>, kotlin.Unit> {
    void invoke(com.zettle.sdk.commons.network.NetworkClient networkClient, com.zettle.sdk.core.os.LocationInfo locationInfo, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo info, com.zettle.sdk.feature.taptopay.core.FailureReason reason, kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.AbortRequestUseCase.Result, kotlin.Unit> block);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/AbortRequestUseCase$Result;", "", "<init>", "()V", "Failed", "Success", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/AbortRequestUseCase$Result$Failed;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/AbortRequestUseCase$Result$Success;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Result {

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/AbortRequestUseCase$Result$Success;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/AbortRequestUseCase$Result;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Success extends com.zettle.sdk.feature.taptopay.core.transaction.usecase.AbortRequestUseCase.Result {
            public static final com.zettle.sdk.feature.taptopay.core.transaction.usecase.AbortRequestUseCase.Result.Success INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.usecase.AbortRequestUseCase.Result.Success();

            private Success() {
                super(null);
            }
        }

        private Result() {
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/AbortRequestUseCase$Result$Failed;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/AbortRequestUseCase$Result;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Failed extends com.zettle.sdk.feature.taptopay.core.transaction.usecase.AbortRequestUseCase.Result {
            public static final com.zettle.sdk.feature.taptopay.core.transaction.usecase.AbortRequestUseCase.Result.Failed INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.usecase.AbortRequestUseCase.Result.Failed();

            private Failed() {
                super(null);
            }
        }

        public /* synthetic */ Result(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
