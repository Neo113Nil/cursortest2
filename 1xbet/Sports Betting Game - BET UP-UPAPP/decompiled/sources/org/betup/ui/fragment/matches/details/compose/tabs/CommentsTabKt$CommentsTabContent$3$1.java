package org.betup.ui.fragment.matches.details.compose.tabs;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.betup.ui.fragment.matches.details.compose.tabs.comments.MatchCommentsCallbacks;
import org.betup.ui.fragment.matches.details.compose.tabs.comments.MatchCommentsState;

/* compiled from: CommentsTab.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.matches.details.compose.tabs.CommentsTabKt$CommentsTabContent$3$1", f = "CommentsTab.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class CommentsTabKt$CommentsTabContent$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MatchCommentsCallbacks $callbacks;
    final /* synthetic */ MatchCommentsState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentsTabKt$CommentsTabContent$3$1(MatchCommentsState matchCommentsState, MatchCommentsCallbacks matchCommentsCallbacks, Continuation<? super CommentsTabKt$CommentsTabContent$3$1> continuation) {
        super(2, continuation);
        this.$state = matchCommentsState;
        this.$callbacks = matchCommentsCallbacks;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CommentsTabKt$CommentsTabContent$3$1(this.$state, this.$callbacks, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CommentsTabKt$CommentsTabContent$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$state.getMessages().isEmpty() && !this.$state.isLoading()) {
            this.$callbacks.getOnRefresh().invoke();
        }
        return Unit.INSTANCE;
    }
}
