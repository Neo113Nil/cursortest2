package com.zettle.sdk.feature.taptopay.core.refunds.usecase;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/usecase/RetrievePaymentUseCaseImpl;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/usecase/RetrievePaymentUseCase;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundService;", "refundService", "Lcom/zettle/sdk/commons/network/NetworkClient;", "networkClient", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundService;Lcom/zettle/sdk/commons/network/NetworkClient;)V", "", "paymentReferenceId", "Ljava/util/Currency;", "currency", "Lkotlin/Function1;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/usecase/RetrievePaymentUseCase$Result;", "", "block", "invoke", "(Ljava/lang/String;Ljava/util/Currency;Lkotlin/jvm/functions/Function1;)V", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/commons/network/NetworkClient;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundService;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RetrievePaymentUseCaseImpl implements com.zettle.sdk.feature.taptopay.core.refunds.usecase.RetrievePaymentUseCase {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.refunds.RefundService getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.zettle.sdk.commons.network.NetworkClient getHighResolutionOutputSizeshNQ4ISI;

    public RetrievePaymentUseCaseImpl(com.zettle.sdk.feature.taptopay.core.refunds.RefundService refundService, com.zettle.sdk.commons.network.NetworkClient networkClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refundService, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkClient, "");
        this.getHighSpeedVideoFpsRangesFor = refundService;
        this.getHighResolutionOutputSizeshNQ4ISI = networkClient;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.String str, java.util.Currency currency, kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.refunds.usecase.RetrievePaymentUseCase.Result, ? extends kotlin.Unit> function1) {
        invoke2(str, currency, (kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.refunds.usecase.RetrievePaymentUseCase.Result, kotlin.Unit>) function1);
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.refunds.usecase.RetrievePaymentUseCase
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(java.lang.String paymentReferenceId, java.util.Currency currency, final kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.refunds.usecase.RetrievePaymentUseCase.Result, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentReferenceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        this.getHighSpeedVideoFpsRangesFor.retrievePayment(this.getHighResolutionOutputSizeshNQ4ISI, paymentReferenceId, currency, new kotlin.jvm.functions.Function1<com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.refunds.RetrievePaymentResult, ? extends java.lang.Throwable>, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.core.refunds.usecase.RetrievePaymentUseCaseImpl$invoke$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.refunds.RetrievePaymentResult, ? extends java.lang.Throwable> result) {
                Camera2StreamConfigurationMap(result);
                return kotlin.Unit.INSTANCE;
            }

            public final void Camera2StreamConfigurationMap(com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.refunds.RetrievePaymentResult, ? extends java.lang.Throwable> result) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.refunds.usecase.RetrievePaymentUseCase.Result, kotlin.Unit> function1 = block;
                if (result instanceof com.izettle.android.core.data.result.Success) {
                    com.zettle.sdk.feature.taptopay.core.refunds.RetrievePaymentResult retrievePaymentResult = (com.zettle.sdk.feature.taptopay.core.refunds.RetrievePaymentResult) ((com.izettle.android.core.data.result.Success) result).getValue();
                    if (retrievePaymentResult instanceof com.zettle.sdk.feature.taptopay.core.refunds.RetrievePaymentResult.Failed) {
                        function1.invoke(new com.zettle.sdk.feature.taptopay.core.refunds.usecase.RetrievePaymentUseCase.Result.Failed(((com.zettle.sdk.feature.taptopay.core.refunds.RetrievePaymentResult.Failed) retrievePaymentResult).getReason()));
                    } else if (retrievePaymentResult instanceof com.zettle.sdk.feature.taptopay.core.refunds.RetrievePaymentResult.Success) {
                        function1.invoke(new com.zettle.sdk.feature.taptopay.core.refunds.usecase.RetrievePaymentUseCase.Result.Success(((com.zettle.sdk.feature.taptopay.core.refunds.RetrievePaymentResult.Success) retrievePaymentResult).getCardPaymentPayload()));
                    }
                }
                kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.refunds.usecase.RetrievePaymentUseCase.Result, kotlin.Unit> function12 = block;
                if (result instanceof com.izettle.android.core.data.result.Failure) {
                    function12.invoke(new com.zettle.sdk.feature.taptopay.core.refunds.usecase.RetrievePaymentUseCase.Result.Failed(com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.TechnicalError.INSTANCE));
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
