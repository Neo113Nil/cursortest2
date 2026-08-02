package com.paypal.oslo.feature.businessinventory.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl$getInventoryItems$1", f = "BusinessInventoryItemsRepositoryImpl.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class BusinessInventoryItemsRepositoryImpl$getInventoryItems$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super java.util.List<? extends com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl Camera2StreamConfigurationMap;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes = 1;
            if (this.Camera2StreamConfigurationMap.refreshItems(this) == coroutine_suspended) {
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
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super java.util.List<? extends com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl$getInventoryItems$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl$getInventoryItems$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BusinessInventoryItemsRepositoryImpl$getInventoryItems$1(com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl businessInventoryItemsRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl$getInventoryItems$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = businessInventoryItemsRepositoryImpl;
    }
}
