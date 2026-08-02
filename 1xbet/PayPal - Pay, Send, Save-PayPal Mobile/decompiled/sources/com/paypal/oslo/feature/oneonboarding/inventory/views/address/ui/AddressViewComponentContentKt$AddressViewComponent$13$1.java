package com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentContentKt$AddressViewComponent$13$1", f = "AddressViewComponentContent.kt", i = {}, l = {174}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class AddressViewComponentContentKt$AddressViewComponent$13$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit>> Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function1<java.util.Map<kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field>, com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.FieldError>, kotlin.Unit>> getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.Flow<java.lang.Boolean> validationResult = this.getHighResolutionOutputSizeshNQ4ISI.getValidationResult();
            final com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentViewModel addressViewComponentViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
            final androidx.compose.runtime.State<kotlin.jvm.functions.Function1<java.util.Map<kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field>, com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.FieldError>, kotlin.Unit>> state = this.getHighSpeedVideoFpsRangesFor;
            final androidx.compose.runtime.State<kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit>> state2 = this.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRanges = 1;
            if (validationResult.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentContentKt$AddressViewComponent$13$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
                    if (!booleanValue) {
                        com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentContentKt.access$AddressViewComponent$lambda$22(state).invoke(com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentViewModel.this.getFieldErrors().getValue());
                    }
                    com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentContentKt.access$AddressViewComponent$lambda$19(state2).invoke(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(booleanValue));
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentContentKt$AddressViewComponent$13$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentContentKt$AddressViewComponent$13$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AddressViewComponentContentKt$AddressViewComponent$13$1(com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentViewModel addressViewComponentViewModel, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super java.util.Map<kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field>, com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.FieldError>, kotlin.Unit>> state, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>> state2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentContentKt$AddressViewComponent$13$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = addressViewComponentViewModel;
        this.getHighSpeedVideoFpsRangesFor = state;
        this.Camera2StreamConfigurationMap = state2;
    }
}
