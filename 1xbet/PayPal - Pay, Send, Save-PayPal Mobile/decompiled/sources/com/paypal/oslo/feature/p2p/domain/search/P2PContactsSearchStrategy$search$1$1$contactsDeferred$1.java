package com.paypal.oslo.feature.p2p.domain.search;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0005H\n"}, d2 = {"<anonymous>", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/contacts/api/domain/ContactSearchError;", "", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy$search$1$1$contactsDeferred$1", f = "P2PContactsSearchStrategy.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class P2PContactsSearchStrategy$search$1$1$contactsDeferred$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.contacts.api.domain.ContactSearchError, ? extends java.util.List<? extends com.paypal.oslo.feature.contacts.api.ContactSearchContactItem>>>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.contacts.api.ContactSearchNetworkType getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.contacts.api.usecase.SearchContactsUseCase searchContactsUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        searchContactsUseCase = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRanges = 1;
        java.lang.Object invoke = searchContactsUseCase.invoke(com.paypal.oslo.feature.contacts.api.domain.ContactSearchType.CONTACTS, this.getHighSpeedVideoSizes, 5, this.getHighResolutionOutputSizeshNQ4ISI, this);
        return invoke == coroutine_suspended ? coroutine_suspended : invoke;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.contacts.api.domain.ContactSearchError, ? extends java.util.List<? extends com.paypal.oslo.feature.contacts.api.ContactSearchContactItem>>> continuation) {
        return ((com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy$search$1$1$contactsDeferred$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy$search$1$1$contactsDeferred$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    P2PContactsSearchStrategy$search$1$1$contactsDeferred$1(com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy p2PContactsSearchStrategy, java.lang.String str, com.paypal.oslo.feature.contacts.api.ContactSearchNetworkType contactSearchNetworkType, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy$search$1$1$contactsDeferred$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = p2PContactsSearchStrategy;
        this.getHighSpeedVideoSizes = str;
        this.getHighResolutionOutputSizeshNQ4ISI = contactSearchNetworkType;
    }
}
