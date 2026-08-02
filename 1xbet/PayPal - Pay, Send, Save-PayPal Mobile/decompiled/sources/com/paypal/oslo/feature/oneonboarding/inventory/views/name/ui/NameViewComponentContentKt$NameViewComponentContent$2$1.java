package com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentContentKt$NameViewComponentContent$2$1", f = "NameViewComponentContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class NameViewComponentContentKt$NameViewComponentContent$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameViewComponentConfig getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameCollectedItem, kotlin.Unit> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.model.NameFormState> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.core.i18n.domain.model.PersonName personName = com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentContentKt.access$NameViewComponentContent$lambda$2(this.getHighSpeedVideoSizes).toPersonName();
        if (!kotlin.jvm.internal.Intrinsics.areEqual(personName, new com.paypal.oslo.core.i18n.domain.model.PersonName(null, null, null, null, 15, null))) {
            this.getHighSpeedVideoFpsRanges.invoke(new com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameCollectedItem(this.getHighResolutionOutputSizeshNQ4ISI.mo16702getIdfHLlpbY(), this.getHighResolutionOutputSizeshNQ4ISI.getVariant(), personName, null));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentContentKt$NameViewComponentContent$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentContentKt$NameViewComponentContent$2$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    NameViewComponentContentKt$NameViewComponentContent$2$1(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameCollectedItem, kotlin.Unit> function1, com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameViewComponentConfig nameViewComponentConfig, androidx.compose.runtime.MutableState<com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.model.NameFormState> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentContentKt$NameViewComponentContent$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = function1;
        this.getHighResolutionOutputSizeshNQ4ISI = nameViewComponentConfig;
        this.getHighSpeedVideoSizes = mutableState;
    }
}
