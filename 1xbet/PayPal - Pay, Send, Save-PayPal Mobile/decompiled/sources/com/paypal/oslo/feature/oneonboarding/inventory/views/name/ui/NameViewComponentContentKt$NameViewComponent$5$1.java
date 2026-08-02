package com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentContentKt$NameViewComponent$5$1", f = "NameViewComponentContent.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, nl = {117}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class NameViewComponentContentKt$NameViewComponent$5$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function1<java.util.Map<kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field>, com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.FieldError>, kotlin.Unit>> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit>> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.Flow<java.lang.Boolean> validationResult = this.getHighSpeedVideoFpsRanges.getValidationResult();
            final com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentViewModel nameViewComponentViewModel = this.getHighSpeedVideoFpsRanges;
            final androidx.compose.runtime.State<kotlin.jvm.functions.Function1<java.util.Map<kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field>, com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.FieldError>, kotlin.Unit>> state = this.getHighResolutionOutputSizeshNQ4ISI;
            final androidx.compose.runtime.State<kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit>> state2 = this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoSizes = 1;
            if (validationResult.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentContentKt$NameViewComponent$5$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
                    if (!booleanValue) {
                        com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentContentKt.access$NameViewComponent$lambda$9(state).invoke(com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentViewModel.this.getFieldErrors().getValue());
                    }
                    com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentContentKt.access$NameViewComponent$lambda$8(state2).invoke(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(booleanValue));
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
        return ((com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentContentKt$NameViewComponent$5$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentContentKt$NameViewComponent$5$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    NameViewComponentContentKt$NameViewComponent$5$1(com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentViewModel nameViewComponentViewModel, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super java.util.Map<kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field>, com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.FieldError>, kotlin.Unit>> state, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>> state2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentContentKt$NameViewComponent$5$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = nameViewComponentViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = state;
        this.getHighSpeedVideoFpsRangesFor = state2;
    }
}
