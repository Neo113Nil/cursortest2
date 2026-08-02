package org.betup.ui.fragment.matches.details.compose.tabs.betgorups;

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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MatchBetGroupsTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchBetGroupsTabContentKt$MatchBetGroupsTabContent$4$1", f = "MatchBetGroupsTabContent.kt", i = {}, l = {114, 116}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class MatchBetGroupsTabContentKt$MatchBetGroupsTabContent$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $effectiveSelectedTabIndex;
    final /* synthetic */ PagerState $pagerState;
    final /* synthetic */ List<BetGroupsTabs> $racingSubMatches;
    final /* synthetic */ boolean $shouldShowFinishedMyBets;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchBetGroupsTabContentKt$MatchBetGroupsTabContent$4$1(boolean z, List<BetGroupsTabs> list, PagerState pagerState, int i, Continuation<? super MatchBetGroupsTabContentKt$MatchBetGroupsTabContent$4$1> continuation) {
        super(2, continuation);
        this.$shouldShowFinishedMyBets = z;
        this.$racingSubMatches = list;
        this.$pagerState = pagerState;
        this.$effectiveSelectedTabIndex = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MatchBetGroupsTabContentKt$MatchBetGroupsTabContent$4$1(this.$shouldShowFinishedMyBets, this.$racingSubMatches, this.$pagerState, this.$effectiveSelectedTabIndex, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MatchBetGroupsTabContentKt$MatchBetGroupsTabContent$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$shouldShowFinishedMyBets || this.$racingSubMatches.isEmpty()) {
                return Unit.INSTANCE;
            }
            if (this.$pagerState.getCurrentPage() != this.$effectiveSelectedTabIndex) {
                if (Math.abs(this.$pagerState.getCurrentPage() - this.$effectiveSelectedTabIndex) > 1) {
                    this.label = 1;
                    if (PagerState.scrollToPage$default(this.$pagerState, this.$effectiveSelectedTabIndex, 0.0f, this, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    this.label = 2;
                    if (PagerState.animateScrollToPage$default(this.$pagerState, this.$effectiveSelectedTabIndex, 0.0f, null, this, 6, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
