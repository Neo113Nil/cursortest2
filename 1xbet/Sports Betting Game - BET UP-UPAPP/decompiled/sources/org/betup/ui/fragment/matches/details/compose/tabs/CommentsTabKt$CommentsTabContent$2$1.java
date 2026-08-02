package org.betup.ui.fragment.matches.details.compose.tabs;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CommentsTab.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.matches.details.compose.tabs.CommentsTabKt$CommentsTabContent$2$1", f = "CommentsTab.kt", i = {}, l = {73, 76}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class CommentsTabKt$CommentsTabContent$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $currentTopMessageId;
    final /* synthetic */ MutableState<String> $lastKnownTopMessageId$delegate;
    final /* synthetic */ LazyListState $messagesListState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentsTabKt$CommentsTabContent$2$1(String str, LazyListState lazyListState, MutableState<String> mutableState, Continuation<? super CommentsTabKt$CommentsTabContent$2$1> continuation) {
        super(2, continuation);
        this.$currentTopMessageId = str;
        this.$messagesListState = lazyListState;
        this.$lastKnownTopMessageId$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CommentsTabKt$CommentsTabContent$2$1(this.$currentTopMessageId, this.$messagesListState, this.$lastKnownTopMessageId$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CommentsTabKt$CommentsTabContent$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String CommentsTabContent$lambda$1;
        String CommentsTabContent$lambda$12;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$currentTopMessageId != null) {
                CommentsTabContent$lambda$1 = CommentsTabKt.CommentsTabContent$lambda$1(this.$lastKnownTopMessageId$delegate);
                boolean z = CommentsTabContent$lambda$1 == null;
                String str = this.$currentTopMessageId;
                CommentsTabContent$lambda$12 = CommentsTabKt.CommentsTabContent$lambda$1(this.$lastKnownTopMessageId$delegate);
                boolean areEqual = Intrinsics.areEqual(str, CommentsTabContent$lambda$12);
                if (z) {
                    this.label = 1;
                    if (LazyListState.scrollToItem$default(this.$messagesListState, 0, 0, this, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.$lastKnownTopMessageId$delegate.setValue(this.$currentTopMessageId);
                } else if (!areEqual) {
                    this.label = 2;
                    if (LazyListState.animateScrollToItem$default(this.$messagesListState, 0, 0, this, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.$lastKnownTopMessageId$delegate.setValue(this.$currentTopMessageId);
                }
            } else {
                this.$lastKnownTopMessageId$delegate.setValue(null);
                return Unit.INSTANCE;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            this.$lastKnownTopMessageId$delegate.setValue(this.$currentTopMessageId);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$lastKnownTopMessageId$delegate.setValue(this.$currentTopMessageId);
        }
        return Unit.INSTANCE;
    }
}
