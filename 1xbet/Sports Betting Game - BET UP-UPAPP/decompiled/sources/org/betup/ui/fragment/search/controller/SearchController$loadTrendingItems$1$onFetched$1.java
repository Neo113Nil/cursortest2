package org.betup.ui.fragment.search.controller;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.entity.search.TrendingItemsResponse;

/* compiled from: SearchController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.search.controller.SearchController$loadTrendingItems$1$onFetched$1", f = "SearchController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class SearchController$loadTrendingItems$1$onFetched$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FetchedResponseMessage<TrendingItemsResponse, Unit> $responseMessage;
    int label;
    final /* synthetic */ SearchController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchController$loadTrendingItems$1$onFetched$1(SearchController searchController, FetchedResponseMessage<TrendingItemsResponse, Unit> fetchedResponseMessage, Continuation<? super SearchController$loadTrendingItems$1$onFetched$1> continuation) {
        super(2, continuation);
        this.this$0 = searchController;
        this.$responseMessage = fetchedResponseMessage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchController$loadTrendingItems$1$onFetched$1(this.this$0, this.$responseMessage, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SearchController$loadTrendingItems$1$onFetched$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.updateTrendingItems(this.$responseMessage);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
