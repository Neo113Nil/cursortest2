package org.betup.ui.fragment.competitions.details.compose.components;

import androidx.compose.foundation.lazy.LazyListState;
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

/* compiled from: MatchNavigationDots.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.competitions.details.compose.components.MatchNavigationDotsKt$MatchNavigationDots$4$1", f = "MatchNavigationDots.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class MatchNavigationDotsKt$MatchNavigationDots$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $currentIndex;
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ int $matchCount;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchNavigationDotsKt$MatchNavigationDots$4$1(int i, int i2, LazyListState lazyListState, Continuation<? super MatchNavigationDotsKt$MatchNavigationDots$4$1> continuation) {
        super(2, continuation);
        this.$matchCount = i;
        this.$currentIndex = i2;
        this.$listState = lazyListState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MatchNavigationDotsKt$MatchNavigationDots$4$1(this.$matchCount, this.$currentIndex, this.$listState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MatchNavigationDotsKt$MatchNavigationDots$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            int i2 = this.$matchCount;
            if (i2 > 0) {
                int coerceIn = RangesKt.coerceIn(this.$currentIndex, 0, i2 - 1);
                this.label = 1;
                if (this.$listState.animateScrollToItem(coerceIn, 0, this) == coroutine_suspended) {
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
