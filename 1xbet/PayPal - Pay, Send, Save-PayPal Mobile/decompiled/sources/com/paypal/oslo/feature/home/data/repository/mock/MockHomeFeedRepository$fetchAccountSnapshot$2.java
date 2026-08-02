package com.paypal.oslo.feature.home.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001H\n"}, d2 = {"<anonymous>", "Larrow/core/Ior;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/home/domain/model/Section;", "Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.home.data.repository.mock.MockHomeFeedRepository$fetchAccountSnapshot$2", f = "MockHomeFeedRepository.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, nl = {86}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class MockHomeFeedRepository$fetchAccountSnapshot$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, ? extends com.paypal.oslo.feature.home.domain.model.Section<com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem>>>, java.lang.Object> {
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes = 1;
            if (kotlinx.coroutines.DelayKt.delay(1000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.feature.home.data.repository.mock.MockHomeFeedData mockHomeFeedData = com.paypal.oslo.feature.home.data.repository.mock.MockHomeFeedData.INSTANCE;
        return new arrow.core.Ior.Right(new com.paypal.oslo.feature.home.domain.model.Section("balance", com.paypal.oslo.feature.home.domain.model.SectionTypes.ACCOUNT_SNAPSHOT, (java.lang.String) null, (java.lang.String) null, com.paypal.oslo.feature.home.data.repository.mock.MockHomeFeedData.getHighResolutionOutputSizeshNQ4ISI(), (java.lang.String) null, (java.lang.String) null, (com.paypal.oslo.feature.home.domain.model.SectionInstrumentation) null, 224, (kotlin.jvm.internal.DefaultConstructorMarker) null));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, ? extends com.paypal.oslo.feature.home.domain.model.Section<com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem>>> continuation) {
        return ((com.paypal.oslo.feature.home.data.repository.mock.MockHomeFeedRepository$fetchAccountSnapshot$2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.home.data.repository.mock.MockHomeFeedRepository$fetchAccountSnapshot$2(continuation);
    }

    MockHomeFeedRepository$fetchAccountSnapshot$2(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.home.data.repository.mock.MockHomeFeedRepository$fetchAccountSnapshot$2> continuation) {
        super(1, continuation);
    }
}
