package com.paypal.oslo.feature.businessinventory.di;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/businessinventory/navigation/result/BusinessInventoryAddItemNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businessinventory.di.NavigationModule$businessInventoryAddItemDestination$1$1$1$1", f = "NavigationModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class NavigationModule$businessInventoryAddItemDestination$1$1$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.businessinventory.navigation.result.BusinessInventoryAddItemNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        final com.paypal.oslo.feature.businessinventory.navigation.result.BusinessInventoryAddItemNavResult businessInventoryAddItemNavResult = (com.paypal.oslo.feature.businessinventory.navigation.result.BusinessInventoryAddItemNavResult) this.Camera2StreamConfigurationMap;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.di.NavigationModule$businessInventoryAddItemDestination$1$1$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.paypal.oslo.feature.businessinventory.di.NavigationModule$businessInventoryAddItemDestination$1$1$1$1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.businessinventory.navigation.result.BusinessInventoryAddItemNavResult.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.businessinventory.navigation.result.BusinessInventoryAddItemNavResult businessInventoryAddItemNavResult, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.businessinventory.api.navigation.result.ItemCreatedNavResult(businessInventoryAddItemNavResult.getItem()));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.businessinventory.navigation.result.BusinessInventoryAddItemNavResult businessInventoryAddItemNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.businessinventory.di.NavigationModule$businessInventoryAddItemDestination$1$1$1$1) create(businessInventoryAddItemNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.businessinventory.di.NavigationModule$businessInventoryAddItemDestination$1$1$1$1 navigationModule$businessInventoryAddItemDestination$1$1$1$1 = new com.paypal.oslo.feature.businessinventory.di.NavigationModule$businessInventoryAddItemDestination$1$1$1$1(this.getHighSpeedVideoSizes, continuation);
        navigationModule$businessInventoryAddItemDestination$1$1$1$1.Camera2StreamConfigurationMap = obj;
        return navigationModule$businessInventoryAddItemDestination$1$1$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavigationModule$businessInventoryAddItemDestination$1$1$1$1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businessinventory.di.NavigationModule$businessInventoryAddItemDestination$1$1$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = appNavigator;
    }
}
