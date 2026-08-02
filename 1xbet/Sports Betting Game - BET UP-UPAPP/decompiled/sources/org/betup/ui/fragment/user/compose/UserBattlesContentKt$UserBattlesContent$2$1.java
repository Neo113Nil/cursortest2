package org.betup.ui.fragment.user.compose;

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

/* compiled from: UserBattlesContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.user.compose.UserBattlesContentKt$UserBattlesContent$2$1", f = "UserBattlesContent.kt", i = {}, l = {69, 71}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class UserBattlesContentKt$UserBattlesContent$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PagerState $pagerState;
    final /* synthetic */ MutableState<Integer> $selectedTab$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserBattlesContentKt$UserBattlesContent$2$1(PagerState pagerState, MutableState<Integer> mutableState, Continuation<? super UserBattlesContentKt$UserBattlesContent$2$1> continuation) {
        super(2, continuation);
        this.$pagerState = pagerState;
        this.$selectedTab$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UserBattlesContentKt$UserBattlesContent$2$1(this.$pagerState, this.$selectedTab$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UserBattlesContentKt$UserBattlesContent$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int UserBattlesContent$lambda$3;
        int UserBattlesContent$lambda$32;
        int UserBattlesContent$lambda$33;
        int UserBattlesContent$lambda$34;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            int currentPage = this.$pagerState.getCurrentPage();
            UserBattlesContent$lambda$3 = UserBattlesContentKt.UserBattlesContent$lambda$3(this.$selectedTab$delegate);
            if (currentPage != UserBattlesContent$lambda$3) {
                int currentPage2 = this.$pagerState.getCurrentPage();
                UserBattlesContent$lambda$32 = UserBattlesContentKt.UserBattlesContent$lambda$3(this.$selectedTab$delegate);
                if (Math.abs(currentPage2 - UserBattlesContent$lambda$32) > 1) {
                    PagerState pagerState = this.$pagerState;
                    UserBattlesContent$lambda$34 = UserBattlesContentKt.UserBattlesContent$lambda$3(this.$selectedTab$delegate);
                    this.label = 1;
                    if (PagerState.scrollToPage$default(pagerState, UserBattlesContent$lambda$34, 0.0f, this, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    PagerState pagerState2 = this.$pagerState;
                    UserBattlesContent$lambda$33 = UserBattlesContentKt.UserBattlesContent$lambda$3(this.$selectedTab$delegate);
                    this.label = 2;
                    if (PagerState.animateScrollToPage$default(pagerState2, UserBattlesContent$lambda$33, 0.0f, null, this, 6, null) == coroutine_suspended) {
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
