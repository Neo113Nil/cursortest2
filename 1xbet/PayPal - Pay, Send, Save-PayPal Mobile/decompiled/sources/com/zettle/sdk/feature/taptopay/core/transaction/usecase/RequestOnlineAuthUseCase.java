package com.zettle.sdk.feature.taptopay.core.transaction.usecase;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\bà\u0080\u0001\u0018\u000026\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0004\u0012\u00020\u00070\u0001:\u0001\rJD\u0010\u000b\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00022\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H¦\u0002¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/RequestOnlineAuthUseCase;", "Lkotlin/Function3;", "", "", "", "Lkotlin/Function1;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/RequestOnlineAuthUseCase$Result;", "", com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES, "map", "block", "invoke", "([BLjava/util/Map;Lkotlin/jvm/functions/Function1;)V", "Result"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface RequestOnlineAuthUseCase extends kotlin.jvm.functions.Function3<byte[], java.util.Map<java.lang.String, byte[]>, kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.RequestOnlineAuthUseCase.Result, ? extends kotlin.Unit>, kotlin.Unit> {
    void invoke(byte[] bytes, java.util.Map<java.lang.String, byte[]> map, kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.RequestOnlineAuthUseCase.Result, kotlin.Unit> block);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/RequestOnlineAuthUseCase$Result;", "", "<init>", "()V", "Failed", "RequestOnlineAuth", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/RequestOnlineAuthUseCase$Result$Failed;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/RequestOnlineAuthUseCase$Result$RequestOnlineAuth;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Result {

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/RequestOnlineAuthUseCase$Result$Failed;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/RequestOnlineAuthUseCase$Result;", "Lcom/zettle/sdk/feature/taptopay/core/FailureReason;", "reason", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/FailureReason;)V", "Lcom/zettle/sdk/feature/taptopay/core/FailureReason;", "getReason", "()Lcom/zettle/sdk/feature/taptopay/core/FailureReason;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Failed extends com.zettle.sdk.feature.taptopay.core.transaction.usecase.RequestOnlineAuthUseCase.Result {
            private final com.zettle.sdk.feature.taptopay.core.FailureReason reason;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failed(com.zettle.sdk.feature.taptopay.core.FailureReason failureReason) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failureReason, "");
                this.reason = failureReason;
            }

            public final com.zettle.sdk.feature.taptopay.core.FailureReason getReason() {
                return this.reason;
            }
        }

        private Result() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/RequestOnlineAuthUseCase$Result$RequestOnlineAuth;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/RequestOnlineAuthUseCase$Result;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;", "onlineHostRequestMessage", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;", "getOnlineHostRequestMessage", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class RequestOnlineAuth extends com.zettle.sdk.feature.taptopay.core.transaction.usecase.RequestOnlineAuthUseCase.Result {
            private final com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage onlineHostRequestMessage;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RequestOnlineAuth(com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage onlineHostRequestMessage) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onlineHostRequestMessage, "");
                this.onlineHostRequestMessage = onlineHostRequestMessage;
            }

            public final com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage getOnlineHostRequestMessage() {
                return this.onlineHostRequestMessage;
            }
        }

        public /* synthetic */ Result(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
