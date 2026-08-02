package org.betup.ui.fragment.competitions.details.compose.components;

import androidx.compose.foundation.pager.PagerState;
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

/* compiled from: CompetitionDetailsPagerView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.competitions.details.compose.components.CompetitionDetailsPagerViewKt$CompetitionDetailsPagerView$3$1$2$1$1", f = "CompetitionDetailsPagerView.kt", i = {}, l = {Opcodes.IF_ACMPEQ, Opcodes.GOTO}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class CompetitionDetailsPagerViewKt$CompetitionDetailsPagerView$3$1$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $index;
    final /* synthetic */ PagerState $pagerState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CompetitionDetailsPagerViewKt$CompetitionDetailsPagerView$3$1$2$1$1(PagerState pagerState, int i, Continuation<? super CompetitionDetailsPagerViewKt$CompetitionDetailsPagerView$3$1$2$1$1> continuation) {
        super(2, continuation);
        this.$pagerState = pagerState;
        this.$index = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CompetitionDetailsPagerViewKt$CompetitionDetailsPagerView$3$1$2$1$1(this.$pagerState, this.$index, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CompetitionDetailsPagerViewKt$CompetitionDetailsPagerView$3$1$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (Math.abs(this.$pagerState.getCurrentPage() - this.$index) > 1) {
                this.label = 1;
                if (PagerState.scrollToPage$default(this.$pagerState, this.$index, 0.0f, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                this.label = 2;
                if (PagerState.animateScrollToPage$default(this.$pagerState, this.$index, 0.0f, null, this, 6, null) == coroutine_suspended) {
                    return coroutine_suspended;
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
