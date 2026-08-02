package org.betup.ui.fragment.user.compose;

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
import org.betup.ui.fragment.user.UserDetailsTab;

/* compiled from: UserProfileScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.user.compose.UserProfileScreenKt$UserProfileTabContent$1$1", f = "UserProfileScreen.kt", i = {}, l = {334, 336}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class UserProfileScreenKt$UserProfileTabContent$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<UserDetailsTab> $filteredTabs;
    final /* synthetic */ int $selectedIndex;
    final /* synthetic */ PagerState $userPagerState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UserProfileScreenKt$UserProfileTabContent$1$1(List<? extends UserDetailsTab> list, int i, PagerState pagerState, Continuation<? super UserProfileScreenKt$UserProfileTabContent$1$1> continuation) {
        super(2, continuation);
        this.$filteredTabs = list;
        this.$selectedIndex = i;
        this.$userPagerState = pagerState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UserProfileScreenKt$UserProfileTabContent$1$1(this.$filteredTabs, this.$selectedIndex, this.$userPagerState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UserProfileScreenKt$UserProfileTabContent$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            int size = this.$filteredTabs.size();
            if (size == 0) {
                return Unit.INSTANCE;
            }
            int coerceIn = RangesKt.coerceIn(this.$selectedIndex, 0, size - 1);
            if (this.$userPagerState.getCurrentPage() != coerceIn) {
                if (Math.abs(this.$userPagerState.getCurrentPage() - coerceIn) > 1) {
                    this.label = 1;
                    if (PagerState.scrollToPage$default(this.$userPagerState, coerceIn, 0.0f, this, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    this.label = 2;
                    if (PagerState.animateScrollToPage$default(this.$userPagerState, coerceIn, 0.0f, null, this, 6, null) == coroutine_suspended) {
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
