package com.zettle.sdk.feature.taptopay.core.refunds.usecase;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/usecase/CheckRefundableUseCaseImpl;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/usecase/CheckRefundableUseCase;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundService;", "refundService", "Lcom/zettle/sdk/commons/network/NetworkClient;", "networkClient", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundService;Lcom/zettle/sdk/commons/network/NetworkClient;)V", "Lcom/zettle/sdk/feature/taptopay/core/retrieve/CardPaymentPayload;", "cardPaymentPayload", "Lkotlin/Function1;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/usecase/CheckRefundableUseCase$Result;", "", "block", "invoke", "(Lcom/zettle/sdk/feature/taptopay/core/retrieve/CardPaymentPayload;Lkotlin/jvm/functions/Function1;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/commons/network/NetworkClient;", "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundService;", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CheckRefundableUseCaseImpl implements com.zettle.sdk.feature.taptopay.core.refunds.usecase.CheckRefundableUseCase {
    private final com.zettle.sdk.commons.network.NetworkClient getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.refunds.RefundService getHighSpeedVideoSizes;

    public CheckRefundableUseCaseImpl(com.zettle.sdk.feature.taptopay.core.refunds.RefundService refundService, com.zettle.sdk.commons.network.NetworkClient networkClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refundService, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkClient, "");
        this.getHighSpeedVideoSizes = refundService;
        this.getHighResolutionOutputSizeshNQ4ISI = networkClient;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.feature.taptopay.core.retrieve.CardPaymentPayload cardPaymentPayload, kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.refunds.usecase.CheckRefundableUseCase.Result, ? extends kotlin.Unit> function1) {
        invoke2(cardPaymentPayload, (kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.refunds.usecase.CheckRefundableUseCase.Result, kotlin.Unit>) function1);
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.refunds.usecase.CheckRefundableUseCase
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(com.zettle.sdk.feature.taptopay.core.retrieve.CardPaymentPayload cardPaymentPayload, final kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.refunds.usecase.CheckRefundableUseCase.Result, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardPaymentPayload, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        this.getHighSpeedVideoSizes.checkRefundable(this.getHighResolutionOutputSizeshNQ4ISI, cardPaymentPayload, new kotlin.jvm.functions.Function1<com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.refunds.CheckRefundableResult, ? extends java.lang.Throwable>, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.core.refunds.usecase.CheckRefundableUseCaseImpl$invoke$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.refunds.CheckRefundableResult, ? extends java.lang.Throwable> result) {
                Camera2StreamConfigurationMap(result);
                return kotlin.Unit.INSTANCE;
            }

            public final void Camera2StreamConfigurationMap(com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.refunds.CheckRefundableResult, ? extends java.lang.Throwable> result) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.refunds.usecase.CheckRefundableUseCase.Result, kotlin.Unit> function1 = block;
                if (result instanceof com.izettle.android.core.data.result.Success) {
                    com.zettle.sdk.feature.taptopay.core.refunds.CheckRefundableResult checkRefundableResult = (com.zettle.sdk.feature.taptopay.core.refunds.CheckRefundableResult) ((com.izettle.android.core.data.result.Success) result).getValue();
                    if (checkRefundableResult instanceof com.zettle.sdk.feature.taptopay.core.refunds.CheckRefundableResult.Failed) {
                        function1.invoke(new com.zettle.sdk.feature.taptopay.core.refunds.usecase.CheckRefundableUseCase.Result.Failed(((com.zettle.sdk.feature.taptopay.core.refunds.CheckRefundableResult.Failed) checkRefundableResult).getReason()));
                    } else if (checkRefundableResult instanceof com.zettle.sdk.feature.taptopay.core.refunds.CheckRefundableResult.Success) {
                        function1.invoke(new com.zettle.sdk.feature.taptopay.core.refunds.usecase.CheckRefundableUseCase.Result.Success(((com.zettle.sdk.feature.taptopay.core.refunds.CheckRefundableResult.Success) checkRefundableResult).getCardPaymentPayload()));
                    }
                }
                kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.refunds.usecase.CheckRefundableUseCase.Result, kotlin.Unit> function12 = block;
                if (result instanceof com.izettle.android.core.data.result.Failure) {
                    function12.invoke(new com.zettle.sdk.feature.taptopay.core.refunds.usecase.CheckRefundableUseCase.Result.Failed(com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.TechnicalError.INSTANCE));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }
        });
    }
}
