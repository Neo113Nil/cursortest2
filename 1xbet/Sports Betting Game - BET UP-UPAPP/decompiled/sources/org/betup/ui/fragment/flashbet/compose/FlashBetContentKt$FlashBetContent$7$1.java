package org.betup.ui.fragment.flashbet.compose;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FlashBetContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.flashbet.compose.FlashBetContentKt$FlashBetContent$7$1", f = "FlashBetContent.kt", i = {}, l = {85, 87}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class FlashBetContentKt$FlashBetContent$7$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PagerState $pagerState;
    final /* synthetic */ MutableState<Integer> $selectedTab$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlashBetContentKt$FlashBetContent$7$1(PagerState pagerState, MutableState<Integer> mutableState, Continuation<? super FlashBetContentKt$FlashBetContent$7$1> continuation) {
        super(2, continuation);
        this.$pagerState = pagerState;
        this.$selectedTab$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FlashBetContentKt$FlashBetContent$7$1(this.$pagerState, this.$selectedTab$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FlashBetContentKt$FlashBetContent$7$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int FlashBetContent$lambda$11;
        int FlashBetContent$lambda$112;
        int FlashBetContent$lambda$113;
        int FlashBetContent$lambda$114;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            int currentPage = this.$pagerState.getCurrentPage();
            FlashBetContent$lambda$11 = FlashBetContentKt.FlashBetContent$lambda$11(this.$selectedTab$delegate);
            if (currentPage != FlashBetContent$lambda$11) {
                int currentPage2 = this.$pagerState.getCurrentPage();
                FlashBetContent$lambda$112 = FlashBetContentKt.FlashBetContent$lambda$11(this.$selectedTab$delegate);
                if (Math.abs(currentPage2 - FlashBetContent$lambda$112) > 1) {
                    PagerState pagerState = this.$pagerState;
                    FlashBetContent$lambda$114 = FlashBetContentKt.FlashBetContent$lambda$11(this.$selectedTab$delegate);
                    this.label = 1;
                    if (PagerState.scrollToPage$default(pagerState, FlashBetContent$lambda$114, 0.0f, this, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    PagerState pagerState2 = this.$pagerState;
                    FlashBetContent$lambda$113 = FlashBetContentKt.FlashBetContent$lambda$11(this.$selectedTab$delegate);
                    this.label = 2;
                    if (PagerState.animateScrollToPage$default(pagerState2, FlashBetContent$lambda$113, 0.0f, null, this, 6, null) == coroutine_suspended) {
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
