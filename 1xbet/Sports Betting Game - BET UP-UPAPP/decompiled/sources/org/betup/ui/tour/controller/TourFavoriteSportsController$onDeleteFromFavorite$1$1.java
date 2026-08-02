package org.betup.ui.tour.controller;

import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.ResponseBody;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.ui.fragment.matches.compose.SportListItemUiModel;

/* compiled from: TourFavoriteSportsController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.tour.controller.TourFavoriteSportsController$onDeleteFromFavorite$1$1", f = "TourFavoriteSportsController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class TourFavoriteSportsController$onDeleteFromFavorite$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SportListItemUiModel $item;
    final /* synthetic */ FetchedResponseMessage<ResponseBody, List<Integer>> $response;
    int label;
    final /* synthetic */ TourFavoriteSportsController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TourFavoriteSportsController$onDeleteFromFavorite$1$1(TourFavoriteSportsController tourFavoriteSportsController, FetchedResponseMessage<ResponseBody, List<Integer>> fetchedResponseMessage, SportListItemUiModel sportListItemUiModel, Continuation<? super TourFavoriteSportsController$onDeleteFromFavorite$1$1> continuation) {
        super(2, continuation);
        this.this$0 = tourFavoriteSportsController;
        this.$response = fetchedResponseMessage;
        this.$item = sportListItemUiModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TourFavoriteSportsController$onDeleteFromFavorite$1$1(this.this$0, this.$response, this.$item, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TourFavoriteSportsController$onDeleteFromFavorite$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (!this.this$0.getIsActive()) {
            return Unit.INSTANCE;
        }
        if (this.$response.getStat() == FetchStat.SUCCESS) {
            this.this$0.updateItemFavorite(this.$item.getId(), false);
        }
        return Unit.INSTANCE;
    }
}
