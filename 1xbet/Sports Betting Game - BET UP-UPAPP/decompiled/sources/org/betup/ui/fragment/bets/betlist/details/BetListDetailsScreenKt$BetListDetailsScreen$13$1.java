package org.betup.ui.fragment.bets.betlist.details;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.State;
import androidx.mediarouter.media.MediaRouter;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import org.betup.model.remote.api.rest.user.bets.models.BetsListModel;

/* compiled from: BetListDetailsScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$BetListDetailsScreen$13$1", f = "BetListDetailsScreen.kt", i = {}, l = {MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_CHANGED}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class BetListDetailsScreenKt$BetListDetailsScreen$13$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $currentPage;
    final /* synthetic */ State<List<BetsListModel>> $items$delegate;
    final /* synthetic */ PagerState $pagerState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BetListDetailsScreenKt$BetListDetailsScreen$13$1(int i, PagerState pagerState, State<? extends List<? extends BetsListModel>> state, Continuation<? super BetListDetailsScreenKt$BetListDetailsScreen$13$1> continuation) {
        super(2, continuation);
        this.$currentPage = i;
        this.$pagerState = pagerState;
        this.$items$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BetListDetailsScreenKt$BetListDetailsScreen$13$1(this.$currentPage, this.$pagerState, this.$items$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BetListDetailsScreenKt$BetListDetailsScreen$13$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List BetListDetailsScreen$lambda$16;
        List BetListDetailsScreen$lambda$162;
        List BetListDetailsScreen$lambda$163;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            BetListDetailsScreen$lambda$16 = BetListDetailsScreenKt.BetListDetailsScreen$lambda$16(this.$items$delegate);
            if (!BetListDetailsScreen$lambda$16.isEmpty()) {
                int i2 = this.$currentPage;
                BetListDetailsScreen$lambda$162 = BetListDetailsScreenKt.BetListDetailsScreen$lambda$16(this.$items$delegate);
                if (i2 >= BetListDetailsScreen$lambda$162.size()) {
                    BetListDetailsScreen$lambda$163 = BetListDetailsScreenKt.BetListDetailsScreen$lambda$16(this.$items$delegate);
                    int coerceAtLeast = RangesKt.coerceAtLeast(BetListDetailsScreen$lambda$163.size() - 1, 0);
                    this.label = 1;
                    if (PagerState.animateScrollToPage$default(this.$pagerState, coerceAtLeast, 0.0f, null, this, 6, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
