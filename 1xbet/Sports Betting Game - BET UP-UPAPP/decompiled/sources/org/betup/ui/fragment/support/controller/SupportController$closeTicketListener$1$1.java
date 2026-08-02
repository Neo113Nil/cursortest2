package org.betup.ui.fragment.support.controller;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import okhttp3.ResponseBody;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.ui.fragment.support.compose.SupportEvent;

/* compiled from: SupportController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.support.controller.SupportController$closeTicketListener$1$1", f = "SupportController.kt", i = {}, l = {1218}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class SupportController$closeTicketListener$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FetchedResponseMessage<ResponseBody, String> $response;
    int label;
    final /* synthetic */ SupportController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SupportController$closeTicketListener$1$1(SupportController supportController, FetchedResponseMessage<ResponseBody, String> fetchedResponseMessage, Continuation<? super SupportController$closeTicketListener$1$1> continuation) {
        super(2, continuation);
        this.this$0 = supportController;
        this.$response = fetchedResponseMessage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SupportController$closeTicketListener$1$1(this.this$0, this.$response, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SupportController$closeTicketListener$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableSharedFlow mutableSharedFlow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mutableSharedFlow = this.this$0._events;
            String id = this.$response.getId();
            if (id == null) {
                id = "";
            }
            this.label = 1;
            if (mutableSharedFlow.emit(new SupportEvent.TicketClosed(id), this) == coroutine_suspended) {
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
