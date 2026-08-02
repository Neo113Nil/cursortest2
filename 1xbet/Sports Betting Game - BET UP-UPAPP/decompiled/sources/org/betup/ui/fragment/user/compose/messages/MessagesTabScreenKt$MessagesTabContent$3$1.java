package org.betup.ui.fragment.user.compose.messages;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;

/* compiled from: MessagesTabScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.user.compose.messages.MessagesTabScreenKt$MessagesTabContent$3$1", f = "MessagesTabScreen.kt", i = {0}, l = {27}, m = "invokeSuspend", n = {"$this$LaunchedEffect"}, s = {"L$0"})
/* loaded from: classes4.dex */
final class MessagesTabScreenKt$MessagesTabContent$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UserMessagesCallbacks $callbacks;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessagesTabScreenKt$MessagesTabContent$3$1(UserMessagesCallbacks userMessagesCallbacks, Continuation<? super MessagesTabScreenKt$MessagesTabContent$3$1> continuation) {
        super(2, continuation);
        this.$callbacks = userMessagesCallbacks;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MessagesTabScreenKt$MessagesTabContent$3$1 messagesTabScreenKt$MessagesTabContent$3$1 = new MessagesTabScreenKt$MessagesTabContent$3$1(this.$callbacks, continuation);
        messagesTabScreenKt$MessagesTabContent$3$1.L$0 = obj;
        return messagesTabScreenKt$MessagesTabContent$3$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessagesTabScreenKt$MessagesTabContent$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0036 -> B:5:0x0039). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            if (CoroutineScopeKt.isActive(coroutineScope)) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            this.$callbacks.getOnRefreshChats().invoke();
            if (CoroutineScopeKt.isActive(coroutineScope)) {
                this.L$0 = coroutineScope;
                this.label = 1;
                if (DelayKt.delay(20000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.$callbacks.getOnRefreshChats().invoke();
                if (CoroutineScopeKt.isActive(coroutineScope)) {
                    return Unit.INSTANCE;
                }
            }
        }
    }
}
