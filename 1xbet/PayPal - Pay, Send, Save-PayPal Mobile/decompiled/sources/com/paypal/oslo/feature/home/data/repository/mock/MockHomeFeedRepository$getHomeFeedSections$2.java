package com.paypal.oslo.feature.home.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00030\u0001H\n"}, d2 = {"<anonymous>", "Larrow/core/Ior;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "", "Lcom/paypal/oslo/feature/home/domain/model/Section;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.home.data.repository.mock.MockHomeFeedRepository$getHomeFeedSections$2", f = "MockHomeFeedRepository.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, nl = {72}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class MockHomeFeedRepository$getHomeFeedSections$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, ? extends java.util.List<? extends com.paypal.oslo.feature.home.domain.model.Section<?>>>>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.home.data.repository.mock.MockHomeFeedRepository getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator demoErrorSimulator;
        com.paypal.oslo.feature.home.featureflags.HomeConfigManager homeConfigManager;
        java.util.List highResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (kotlinx.coroutines.DelayKt.delay(1000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.feature.home.data.repository.mock.MockHomeFeedRepository mockHomeFeedRepository = this.getHighSpeedVideoSizes;
        demoErrorSimulator = mockHomeFeedRepository.getHighSpeedVideoFpsRanges;
        com.paypal.oslo.feature.home.data.repository.mock.MockHomeFeedData mockHomeFeedData = com.paypal.oslo.feature.home.data.repository.mock.MockHomeFeedData.INSTANCE;
        homeConfigManager = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor;
        highResolutionOutputSizeshNQ4ISI = mockHomeFeedRepository.getHighResolutionOutputSizeshNQ4ISI(demoErrorSimulator.simulateSectionErrors(mockHomeFeedData.Camera2StreamConfigurationMap(homeConfigManager.isAdInFeedEnabled())));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : highResolutionOutputSizeshNQ4ISI) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.home.domain.model.Section) obj2).getType(), com.paypal.oslo.feature.home.domain.model.SectionTypes.ACCOUNT_SNAPSHOT)) {
                arrayList.add(obj2);
            }
        }
        return new arrow.core.Ior.Right(arrayList);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, ? extends java.util.List<? extends com.paypal.oslo.feature.home.domain.model.Section<?>>>> continuation) {
        return ((com.paypal.oslo.feature.home.data.repository.mock.MockHomeFeedRepository$getHomeFeedSections$2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.home.data.repository.mock.MockHomeFeedRepository$getHomeFeedSections$2(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockHomeFeedRepository$getHomeFeedSections$2(com.paypal.oslo.feature.home.data.repository.mock.MockHomeFeedRepository mockHomeFeedRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.home.data.repository.mock.MockHomeFeedRepository$getHomeFeedSections$2> continuation) {
        super(1, continuation);
        this.getHighSpeedVideoSizes = mockHomeFeedRepository;
    }
}
