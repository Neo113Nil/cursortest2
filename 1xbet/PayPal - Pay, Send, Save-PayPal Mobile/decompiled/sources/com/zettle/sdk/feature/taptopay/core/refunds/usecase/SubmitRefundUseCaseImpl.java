package com.zettle.sdk.feature.taptopay.core.refunds.usecase;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JZ\u0010\u0018\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/usecase/SubmitRefundUseCaseImpl;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/usecase/SubmitRefundUseCase;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundService;", "refundService", "Lcom/zettle/sdk/commons/network/NetworkClient;", "networkClient", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundService;Lcom/zettle/sdk/commons/network/NetworkClient;)V", "Lcom/zettle/sdk/feature/taptopay/core/retrieve/CardPaymentPayload;", "payload", "", "amount", "", "refundReferenceId", "Lcom/zettle/sdk/meta/AppInfo;", "appInfo", "Lcom/zettle/sdk/meta/PlatformInfo;", "platformInfo", "Lcom/zettle/sdk/core/os/LocationData;", "lastLocation", "Lkotlin/Function1;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/usecase/SubmitRefundUseCase$Result;", "", "block", "invoke", "(Lcom/zettle/sdk/feature/taptopay/core/retrieve/CardPaymentPayload;Ljava/lang/Long;Ljava/lang/String;Lcom/zettle/sdk/meta/AppInfo;Lcom/zettle/sdk/meta/PlatformInfo;Lcom/zettle/sdk/core/os/LocationData;Lkotlin/jvm/functions/Function1;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/zettle/sdk/commons/network/NetworkClient;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundService;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SubmitRefundUseCaseImpl implements com.zettle.sdk.feature.taptopay.core.refunds.usecase.SubmitRefundUseCase {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.refunds.RefundService getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.zettle.sdk.commons.network.NetworkClient getHighSpeedVideoSizes;

    public SubmitRefundUseCaseImpl(com.zettle.sdk.feature.taptopay.core.refunds.RefundService refundService, com.zettle.sdk.commons.network.NetworkClient networkClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refundService, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkClient, "");
        this.getHighSpeedVideoFpsRangesFor = refundService;
        this.getHighSpeedVideoSizes = networkClient;
    }

    @Override // kotlin.jvm.functions.Function7
    public final /* bridge */ /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.feature.taptopay.core.retrieve.CardPaymentPayload cardPaymentPayload, java.lang.Long l, java.lang.String str, com.zettle.sdk.meta.AppInfo appInfo, com.zettle.sdk.meta.PlatformInfo platformInfo, com.zettle.sdk.core.os.LocationData locationData, kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.refunds.usecase.SubmitRefundUseCase.Result, ? extends kotlin.Unit> function1) {
        invoke2(cardPaymentPayload, l, str, appInfo, platformInfo, locationData, (kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.refunds.usecase.SubmitRefundUseCase.Result, kotlin.Unit>) function1);
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.refunds.usecase.SubmitRefundUseCase
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(com.zettle.sdk.feature.taptopay.core.retrieve.CardPaymentPayload payload, java.lang.Long amount, java.lang.String refundReferenceId, com.zettle.sdk.meta.AppInfo appInfo, com.zettle.sdk.meta.PlatformInfo platformInfo, com.zettle.sdk.core.os.LocationData lastLocation, final kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.refunds.usecase.SubmitRefundUseCase.Result, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platformInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        com.zettle.sdk.feature.taptopay.core.refunds.models.RefundRequest create = com.zettle.sdk.feature.taptopay.core.refunds.models.RefundRequest.INSTANCE.create(appInfo, platformInfo, lastLocation);
        create.amount(amount != null ? amount.longValue() : payload.getAmount());
        create.cardPaymentUuid(payload.getTransactionId());
        if (refundReferenceId != null) {
            create.reference(new com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference.Builder(refundReferenceId).build());
        }
        this.getHighSpeedVideoFpsRangesFor.refund(this.getHighSpeedVideoSizes, create.build(), payload.getAmount(), new kotlin.jvm.functions.Function1<com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.refunds.DoRefundResult, ? extends java.lang.Throwable>, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.core.refunds.usecase.SubmitRefundUseCaseImpl$invoke$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.refunds.DoRefundResult, ? extends java.lang.Throwable> result) {
                getHighSpeedVideoSizes(result);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoSizes(com.izettle.android.core.data.result.Result<? extends com.zettle.sdk.feature.taptopay.core.refunds.DoRefundResult, ? extends java.lang.Throwable> result) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.refunds.usecase.SubmitRefundUseCase.Result, kotlin.Unit> function1 = block;
                if (result instanceof com.izettle.android.core.data.result.Success) {
                    com.zettle.sdk.feature.taptopay.core.refunds.DoRefundResult doRefundResult = (com.zettle.sdk.feature.taptopay.core.refunds.DoRefundResult) ((com.izettle.android.core.data.result.Success) result).getValue();
                    if (doRefundResult instanceof com.zettle.sdk.feature.taptopay.core.refunds.DoRefundResult.Failed) {
                        function1.invoke(new com.zettle.sdk.feature.taptopay.core.refunds.usecase.SubmitRefundUseCase.Result.Failed(((com.zettle.sdk.feature.taptopay.core.refunds.DoRefundResult.Failed) doRefundResult).getReason()));
                    } else if (doRefundResult instanceof com.zettle.sdk.feature.taptopay.core.refunds.DoRefundResult.Success) {
                        function1.invoke(new com.zettle.sdk.feature.taptopay.core.refunds.usecase.SubmitRefundUseCase.Result.Success(((com.zettle.sdk.feature.taptopay.core.refunds.DoRefundResult.Success) doRefundResult).getRefundPayload()));
                    }
                }
                kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.refunds.usecase.SubmitRefundUseCase.Result, kotlin.Unit> function12 = block;
                if (result instanceof com.izettle.android.core.data.result.Failure) {
                    function12.invoke(new com.zettle.sdk.feature.taptopay.core.refunds.usecase.SubmitRefundUseCase.Result.Failed(com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.TechnicalError.INSTANCE));
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
