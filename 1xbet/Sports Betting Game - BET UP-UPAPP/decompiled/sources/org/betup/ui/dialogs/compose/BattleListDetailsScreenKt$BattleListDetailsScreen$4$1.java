package org.betup.ui.dialogs.compose;

import androidx.compose.foundation.pager.PagerState;
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

/* compiled from: BattleListDetailsScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.dialogs.compose.BattleListDetailsScreenKt$BattleListDetailsScreen$4$1", f = "BattleListDetailsScreen.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class BattleListDetailsScreenKt$BattleListDetailsScreen$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<Long> $challengeIds;
    final /* synthetic */ int $currentPage;
    final /* synthetic */ PagerState $pagerState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BattleListDetailsScreenKt$BattleListDetailsScreen$4$1(List<Long> list, int i, PagerState pagerState, Continuation<? super BattleListDetailsScreenKt$BattleListDetailsScreen$4$1> continuation) {
        super(2, continuation);
        this.$challengeIds = list;
        this.$currentPage = i;
        this.$pagerState = pagerState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BattleListDetailsScreenKt$BattleListDetailsScreen$4$1(this.$challengeIds, this.$currentPage, this.$pagerState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BattleListDetailsScreenKt$BattleListDetailsScreen$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.$challengeIds.isEmpty() && this.$currentPage >= this.$challengeIds.size()) {
                this.label = 1;
                if (PagerState.animateScrollToPage$default(this.$pagerState, RangesKt.coerceAtLeast(this.$challengeIds.size() - 1, 0), 0.0f, null, this, 6, null) == coroutine_suspended) {
                    return coroutine_suspended;
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
