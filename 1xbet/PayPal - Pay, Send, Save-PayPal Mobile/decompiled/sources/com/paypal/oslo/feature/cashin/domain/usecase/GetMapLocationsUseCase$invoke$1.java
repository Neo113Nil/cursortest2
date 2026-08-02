package com.paypal.oslo.feature.cashin.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/paypal/oslo/feature/cashin/domain/model/CashInStore;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cashin.domain.usecase.GetMapLocationsUseCase$invoke$1", f = "GetMapLocationsUseCase.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class GetMapLocationsUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.domain.model.CashInStore>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.cashin.domain.usecase.GetMapLocationsUseCase getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.cashin.domain.repository.LocationRepository locationRepository;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        locationRepository = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
        this.getHighResolutionOutputSizeshNQ4ISI = 1;
        java.lang.Object userLocation = locationRepository.getUserLocation(this);
        return userLocation == coroutine_suspended ? coroutine_suspended : userLocation;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.domain.model.CashInStore> continuation) {
        return ((com.paypal.oslo.feature.cashin.domain.usecase.GetMapLocationsUseCase$invoke$1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cashin.domain.usecase.GetMapLocationsUseCase$invoke$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetMapLocationsUseCase$invoke$1(com.paypal.oslo.feature.cashin.domain.usecase.GetMapLocationsUseCase getMapLocationsUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.domain.usecase.GetMapLocationsUseCase$invoke$1> continuation) {
        super(1, continuation);
        this.getHighSpeedVideoFpsRangesFor = getMapLocationsUseCase;
    }
}
