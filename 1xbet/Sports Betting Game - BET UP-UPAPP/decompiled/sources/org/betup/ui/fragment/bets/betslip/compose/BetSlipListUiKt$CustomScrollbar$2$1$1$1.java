package org.betup.ui.fragment.bets.betslip.compose;

import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: BetSlipListUi.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.bets.betslip.compose.BetSlipListUiKt$CustomScrollbar$2$1$1$1", f = "BetSlipListUi.kt", i = {}, l = {Opcodes.TABLESWITCH}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class BetSlipListUiKt$CustomScrollbar$2$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ int $maxScroll;
    final /* synthetic */ float $newRatio;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BetSlipListUiKt$CustomScrollbar$2$1$1$1(LazyListState lazyListState, float f, int i, Continuation<? super BetSlipListUiKt$CustomScrollbar$2$1$1$1> continuation) {
        super(2, continuation);
        this.$listState = lazyListState;
        this.$newRatio = f;
        this.$maxScroll = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BetSlipListUiKt$CustomScrollbar$2$1$1$1(this.$listState, this.$newRatio, this.$maxScroll, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BetSlipListUiKt$CustomScrollbar$2$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (LazyListState.scrollToItem$default(this.$listState, (int) (this.$newRatio * this.$maxScroll), 0, this, 2, null) == coroutine_suspended) {
                return coroutine_suspended;
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
