package com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentContentKt$AddressViewComponentContent$4$1", f = "AddressViewComponentContent.kt", i = {}, l = {269}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class AddressViewComponentContentKt$AddressViewComponentContent$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.util.Map<kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field>, java.lang.String>> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function1<com.paypal.oslo.core.i18n.domain.model.Address, kotlin.Unit>> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.runtime.MutableState<java.util.Map<kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field>, java.lang.String>> mutableState = this.getHighSpeedVideoFpsRangesFor;
            kotlinx.coroutines.flow.Flow snapshotFlow = androidx.compose.runtime.SnapshotStateKt.snapshotFlow(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentContentKt$AddressViewComponentContent$4$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    java.util.Map access$AddressViewComponentContent$lambda$6;
                    access$AddressViewComponentContent$lambda$6 = com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentContentKt.access$AddressViewComponentContent$lambda$6(androidx.compose.runtime.MutableState.this);
                    return access$AddressViewComponentContent$lambda$6;
                }
            });
            final java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
            final androidx.compose.runtime.State<kotlin.jvm.functions.Function1<com.paypal.oslo.core.i18n.domain.model.Address, kotlin.Unit>> state = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRanges = 1;
            if (snapshotFlow.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentContentKt$AddressViewComponentContent$4$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentContentKt.access$AddressViewComponentContent$lambda$8(state).invoke(com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.utils.AddressFieldUtilsKt.buildAddressFromFields((java.util.Map) obj2, str));
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
        return ((com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentContentKt$AddressViewComponentContent$4$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentContentKt$AddressViewComponentContent$4$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AddressViewComponentContentKt$AddressViewComponentContent$4$1(androidx.compose.runtime.MutableState<java.util.Map<kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field>, java.lang.String>> mutableState, java.lang.String str, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.i18n.domain.model.Address, kotlin.Unit>> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentContentKt$AddressViewComponentContent$4$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = mutableState;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoSizes = state;
    }
}
