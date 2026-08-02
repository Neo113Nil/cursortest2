package com.paypal.oslo.feature.activity.ui.common.factory;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.ui.common.factory.ActivityActionBottomSheetHandlerKt$ActionConfirmationHandler$2$1", f = "ActivityActionBottomSheetHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class ActivityActionBottomSheetHandlerKt$ActionConfirmationHandler$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState getHighSpeedVideoSizes;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizesFor;
    final /* synthetic */ java.lang.String getInputFormats;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel getOutputFormats;
    final /* synthetic */ com.paypal.oslo.feature.activity.api.models.ActivityTransactionDto getOutputMinFrameDuration;
    int getOutputMinFrameDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getOutputMinFrameDurationlomOqCM != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState.Success.INSTANCE)) {
            this.getHighSpeedVideoSizesFor.invoke();
            int i = com.paypal.oslo.feature.activity.ui.common.factory.ActivityActionBottomSheetHandlerKt$ActionConfirmationHandler$2$1.WhenMappings.$EnumSwitchMapping$0[this.getHighResolutionOutputSizeshNQ4ISI.getType().ordinal()];
            if (i == 1) {
                this.getHighSpeedVideoFpsRanges.hideSheet();
                this.Camera2StreamConfigurationMap.invoke();
                this.getInputSizeshNQ4ISI.invoke(this.getInputFormats);
                this.getOutputFormats.fetchActivityDetailResult$activity_prodRelease(this.getOutputMinFrameDuration);
                this.getOutputFormats.resetActionExecutionState$activity_prodRelease();
            } else if (i == 2) {
                this.getHighSpeedVideoFpsRanges.hideSheet();
                this.Camera2StreamConfigurationMap.invoke();
                this.getInputSizeshNQ4ISI.invoke(this.getHighSpeedVideoFpsRangesFor);
                this.getOutputFormats.resetActionExecutionState$activity_prodRelease();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.activity.ui.common.factory.ActivityActionBottomSheetHandlerKt$ActionConfirmationHandler$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.ActivityActionType.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ActivityActionType.REPORT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ActivityActionType.SHOW_P2P_BLOCK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.activity.ui.common.factory.ActivityActionBottomSheetHandlerKt$ActionConfirmationHandler$2$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoSizesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getInputSizeshNQ4ISI, this.getInputFormats, this.getOutputFormats, this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ActivityActionBottomSheetHandlerKt$ActionConfirmationHandler$2$1(com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState actionExecutionState, kotlin.jvm.functions.Function0<kotlin.Unit> function0, com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel, com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, java.lang.String str, com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel, com.paypal.oslo.feature.activity.api.models.ActivityTransactionDto activityTransactionDto, java.lang.String str2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.ui.common.factory.ActivityActionBottomSheetHandlerKt$ActionConfirmationHandler$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = actionExecutionState;
        this.getHighSpeedVideoSizesFor = function0;
        this.getHighResolutionOutputSizeshNQ4ISI = activityActionModel;
        this.getHighSpeedVideoFpsRanges = bottomSheetController;
        this.Camera2StreamConfigurationMap = function02;
        this.getInputSizeshNQ4ISI = function1;
        this.getInputFormats = str;
        this.getOutputFormats = activityTransactionDetailViewModel;
        this.getOutputMinFrameDuration = activityTransactionDto;
        this.getHighSpeedVideoFpsRangesFor = str2;
    }
}
