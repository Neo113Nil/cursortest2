package org.betup.ui.fragment.user.compose;

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
import org.betup.ui.fragment.user.ForeignUserDetailsController;
import org.betup.ui.fragment.user.UserDetailsController;

/* compiled from: UserProfileScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.user.compose.UserProfileScreenKt$UserProfileContent$1$3$1", f = "UserProfileScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class UserProfileScreenKt$UserProfileContent$1$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PagerState $basePagerState;
    final /* synthetic */ ForeignUserDetailsController $foreignUserDetailsController;
    final /* synthetic */ int $selectedIndexBase;
    final /* synthetic */ UserDetailsController $userDetailsController;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserProfileScreenKt$UserProfileContent$1$3$1(PagerState pagerState, int i, UserDetailsController userDetailsController, ForeignUserDetailsController foreignUserDetailsController, Continuation<? super UserProfileScreenKt$UserProfileContent$1$3$1> continuation) {
        super(2, continuation);
        this.$basePagerState = pagerState;
        this.$selectedIndexBase = i;
        this.$userDetailsController = userDetailsController;
        this.$foreignUserDetailsController = foreignUserDetailsController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UserProfileScreenKt$UserProfileContent$1$3$1(this.$basePagerState, this.$selectedIndexBase, this.$userDetailsController, this.$foreignUserDetailsController, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UserProfileScreenKt$UserProfileContent$1$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$basePagerState.getCurrentPage() != this.$selectedIndexBase) {
            UserDetailsController userDetailsController = this.$userDetailsController;
            if (userDetailsController != null) {
                userDetailsController.selectBaseTab(this.$basePagerState.getCurrentPage());
            }
            ForeignUserDetailsController foreignUserDetailsController = this.$foreignUserDetailsController;
            if (foreignUserDetailsController != null) {
                foreignUserDetailsController.selectBaseTab(this.$basePagerState.getCurrentPage());
            }
        }
        return Unit.INSTANCE;
    }
}
