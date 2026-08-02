package com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentContentKt$NameViewComponent$7$1", f = "NameViewComponentContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class NameViewComponentContentKt$NameViewComponent$7$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.utils.NameValidationMessages Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentViewModel getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.model.NameFormState> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.i18n.domain.model.PersonName personName;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (this.getHighSpeedVideoFpsRanges != null) {
            com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.model.NameFormState access$NameViewComponent$lambda$3 = com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentContentKt.access$NameViewComponent$lambda$3(this.getHighSpeedVideoSizes);
            if (access$NameViewComponent$lambda$3 == null || (personName = access$NameViewComponent$lambda$3.toPersonName()) == null) {
                personName = new com.paypal.oslo.core.i18n.domain.model.PersonName(null, null, null, null, 15, null);
            }
            this.getHighSpeedVideoFpsRangesFor.applyBackendContextualErrors(this.getHighSpeedVideoFpsRanges, personName, this.Camera2StreamConfigurationMap);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentContentKt$NameViewComponent$7$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentContentKt$NameViewComponent$7$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NameViewComponentContentKt$NameViewComponent$7$1(java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo> list, com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentViewModel nameViewComponentViewModel, com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.utils.NameValidationMessages nameValidationMessages, androidx.compose.runtime.State<com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.model.NameFormState> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentContentKt$NameViewComponent$7$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = list;
        this.getHighSpeedVideoFpsRangesFor = nameViewComponentViewModel;
        this.Camera2StreamConfigurationMap = nameValidationMessages;
        this.getHighSpeedVideoSizes = state;
    }
}
