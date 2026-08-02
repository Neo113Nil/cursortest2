package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentUpdaterMiddleware;", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/mapper/ReviewPaymentUiModelMapper;", "uiModelMapper", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/mapper/ReviewPaymentUiModelMapper;)V", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;", "input", "", "invoke", "(Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;)V", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/mapper/ReviewPaymentUiModelMapper;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ReviewPaymentUpdaterMiddleware implements com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent> {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.mapper.ReviewPaymentUiModelMapper getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public ReviewPaymentUpdaterMiddleware(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.mapper.ReviewPaymentUiModelMapper reviewPaymentUiModelMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewPaymentUiModelMapper, "");
        this.getHighSpeedVideoFpsRangesFor = reviewPaymentUiModelMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$handleOnPaymentInfoUpdated(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUpdaterMiddleware reviewPaymentUpdaterMiddleware, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ReviewPaymentArgs reviewPaymentArgs, java.time.LocalDate localDate, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUpdaterMiddleware$handleOnPaymentInfoUpdated$1 reviewPaymentUpdaterMiddleware$handleOnPaymentInfoUpdated$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUpdaterMiddleware$handleOnPaymentInfoUpdated$1) {
            reviewPaymentUpdaterMiddleware$handleOnPaymentInfoUpdated$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUpdaterMiddleware$handleOnPaymentInfoUpdated$1) continuation;
            if ((reviewPaymentUpdaterMiddleware$handleOnPaymentInfoUpdated$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                reviewPaymentUpdaterMiddleware$handleOnPaymentInfoUpdated$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = reviewPaymentUpdaterMiddleware$handleOnPaymentInfoUpdated$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = reviewPaymentUpdaterMiddleware$handleOnPaymentInfoUpdated$1.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.mapper.ReviewPaymentUiModelMapper reviewPaymentUiModelMapper = reviewPaymentUpdaterMiddleware.getHighSpeedVideoFpsRangesFor;
                    reviewPaymentUpdaterMiddleware$handleOnPaymentInfoUpdated$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(reviewPaymentArgs);
                    reviewPaymentUpdaterMiddleware$handleOnPaymentInfoUpdated$1.getHighSpeedVideoFpsRanges = localDate;
                    reviewPaymentUpdaterMiddleware$handleOnPaymentInfoUpdated$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function1);
                    reviewPaymentUpdaterMiddleware$handleOnPaymentInfoUpdated$1.getHighSpeedVideoFpsRangesFor = function1;
                    reviewPaymentUpdaterMiddleware$handleOnPaymentInfoUpdated$1.Camera2StreamConfigurationMap = reviewPaymentArgs;
                    reviewPaymentUpdaterMiddleware$handleOnPaymentInfoUpdated$1.getOutputMinFrameDuration = 1;
                    obj = reviewPaymentUiModelMapper.toReviewPaymentUiModel(reviewPaymentArgs, localDate, reviewPaymentUpdaterMiddleware$handleOnPaymentInfoUpdated$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    reviewPaymentArgs = (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ReviewPaymentArgs) reviewPaymentUpdaterMiddleware$handleOnPaymentInfoUpdated$1.Camera2StreamConfigurationMap;
                    function1 = (kotlin.jvm.functions.Function1) reviewPaymentUpdaterMiddleware$handleOnPaymentInfoUpdated$1.getHighSpeedVideoFpsRangesFor;
                    localDate = (java.time.LocalDate) reviewPaymentUpdaterMiddleware$handleOnPaymentInfoUpdated$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnViewUpdated(reviewPaymentArgs, (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.uimodel.ReviewPaymentUiModel) obj, localDate));
                return kotlin.Unit.INSTANCE;
            }
        }
        reviewPaymentUpdaterMiddleware$handleOnPaymentInfoUpdated$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUpdaterMiddleware$handleOnPaymentInfoUpdated$1(reviewPaymentUpdaterMiddleware, continuation);
        java.lang.Object obj2 = reviewPaymentUpdaterMiddleware$handleOnPaymentInfoUpdated$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = reviewPaymentUpdaterMiddleware$handleOnPaymentInfoUpdated$1.getOutputMinFrameDuration;
        if (i != 0) {
        }
        function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnViewUpdated(reviewPaymentArgs, (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.uimodel.ReviewPaymentUiModel) obj2, localDate));
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
    public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent> input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent event = input.getEvent();
        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnViewCreated) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUpdaterMiddleware$invoke$1(this, event, input, null), 3, null);
            return;
        }
        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnDateSelected) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUpdaterMiddleware$invoke$2(this, input, event, null), 3, null);
        } else if ((event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnPaymentMethodSelected) || (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnBackupPaymentMethodSelected)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUpdaterMiddleware$invoke$3(this, input, null), 3, null);
        } else {
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }
}
