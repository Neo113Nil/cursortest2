package org.betup.ui.fragment.user.compose;

import androidx.compose.foundation.pager.PagerState;
import com.explorestack.protobuf.openrtb.LossReason;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.betup.ui.fragment.user.compose.messages.UserMessagesCallbacks;

/* compiled from: UserProfileScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.user.compose.UserProfileScreenKt$UserProfileContent$1$2$1", f = "UserProfileScreen.kt", i = {}, l = {LossReason.LOSS_REASON_CREATIVE_FILTERED_AD_TYPE_EXCLUSIONS_VALUE, LossReason.LOSS_REASON_CREATIVE_FILTERED_NOT_ALLOWED_IN_DEAL_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class UserProfileScreenKt$UserProfileContent$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PagerState $basePagerState;
    final /* synthetic */ int $selectedIndexBase;
    final /* synthetic */ UserMessagesCallbacks $userMessagesCallbacks;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserProfileScreenKt$UserProfileContent$1$2$1(PagerState pagerState, int i, UserMessagesCallbacks userMessagesCallbacks, Continuation<? super UserProfileScreenKt$UserProfileContent$1$2$1> continuation) {
        super(2, continuation);
        this.$basePagerState = pagerState;
        this.$selectedIndexBase = i;
        this.$userMessagesCallbacks = userMessagesCallbacks;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UserProfileScreenKt$UserProfileContent$1$2$1(this.$basePagerState, this.$selectedIndexBase, this.$userMessagesCallbacks, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UserProfileScreenKt$UserProfileContent$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$basePagerState.getCurrentPage() != this.$selectedIndexBase) {
                if (Math.abs(this.$basePagerState.getCurrentPage() - this.$selectedIndexBase) > 1) {
                    this.label = 1;
                    if (PagerState.scrollToPage$default(this.$basePagerState, this.$selectedIndexBase, 0.0f, this, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    this.label = 2;
                    if (PagerState.animateScrollToPage$default(this.$basePagerState, this.$selectedIndexBase, 0.0f, null, this, 6, null) == coroutine_suspended) {
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
        if (this.$selectedIndexBase == 3) {
            this.$userMessagesCallbacks.getOnMessagesTabVisible().invoke();
        }
        return Unit.INSTANCE;
    }
}
