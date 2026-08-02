package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailInitializerMiddleware;", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/mapper/ActivityDetailUiModelMapper;", "uiModelMapper", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/mapper/ActivityDetailUiModelMapper;)V", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;", "input", "", "invoke", "(Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/mapper/ActivityDetailUiModelMapper;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ActivityDetailInitializerMiddleware implements com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailEvent> {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.mapper.ActivityDetailUiModelMapper getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public ActivityDetailInitializerMiddleware(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.mapper.ActivityDetailUiModelMapper activityDetailUiModelMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailUiModelMapper, "");
        this.getHighResolutionOutputSizeshNQ4ISI = activityDetailUiModelMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$handleOnViewCreated(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailInitializerMiddleware activityDetailInitializerMiddleware, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs activityDetailDestinationArgs, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailInitializerMiddleware$handleOnViewCreated$1 activityDetailInitializerMiddleware$handleOnViewCreated$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailInitializerMiddleware$handleOnViewCreated$1) {
            activityDetailInitializerMiddleware$handleOnViewCreated$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailInitializerMiddleware$handleOnViewCreated$1) continuation;
            if ((activityDetailInitializerMiddleware$handleOnViewCreated$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                activityDetailInitializerMiddleware$handleOnViewCreated$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = activityDetailInitializerMiddleware$handleOnViewCreated$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = activityDetailInitializerMiddleware$handleOnViewCreated$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.mapper.ActivityDetailUiModelMapper activityDetailUiModelMapper = activityDetailInitializerMiddleware.getHighResolutionOutputSizeshNQ4ISI;
                    activityDetailInitializerMiddleware$handleOnViewCreated$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(activityDetailDestinationArgs);
                    activityDetailInitializerMiddleware$handleOnViewCreated$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function1);
                    activityDetailInitializerMiddleware$handleOnViewCreated$1.Camera2StreamConfigurationMap = function1;
                    activityDetailInitializerMiddleware$handleOnViewCreated$1.getHighSpeedVideoFpsRangesFor = activityDetailDestinationArgs;
                    activityDetailInitializerMiddleware$handleOnViewCreated$1.getHighSpeedVideoSizes = 1;
                    obj = activityDetailUiModelMapper.mapToActivityDetailUiModel$revolvingcredit_servicing_prodRelease(activityDetailDestinationArgs, activityDetailInitializerMiddleware$handleOnViewCreated$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    activityDetailDestinationArgs = (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs) activityDetailInitializerMiddleware$handleOnViewCreated$1.getHighSpeedVideoFpsRangesFor;
                    function1 = (kotlin.jvm.functions.Function1) activityDetailInitializerMiddleware$handleOnViewCreated$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailEvent.OnInitializeScreen(activityDetailDestinationArgs, (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel) obj));
                return kotlin.Unit.INSTANCE;
            }
        }
        activityDetailInitializerMiddleware$handleOnViewCreated$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailInitializerMiddleware$handleOnViewCreated$1(activityDetailInitializerMiddleware, continuation);
        java.lang.Object obj2 = activityDetailInitializerMiddleware$handleOnViewCreated$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = activityDetailInitializerMiddleware$handleOnViewCreated$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailEvent.OnInitializeScreen(activityDetailDestinationArgs, (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel) obj2));
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
    public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailEvent> input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailEvent event = input.getEvent();
        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailEvent.OnViewCreated) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailInitializerMiddleware$invoke$1(this, event, input, null), 3, null);
        }
    }
}
