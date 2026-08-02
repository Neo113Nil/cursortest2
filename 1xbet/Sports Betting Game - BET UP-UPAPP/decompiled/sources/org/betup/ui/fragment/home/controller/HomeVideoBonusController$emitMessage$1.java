package org.betup.ui.fragment.home.controller;

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
import org.betup.ui.fragment.home.controller.HomeVideoBonusEvent;

/* compiled from: HomeVideoBonusController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.home.controller.HomeVideoBonusController$emitMessage$1", f = "HomeVideoBonusController.kt", i = {}, l = {570}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class HomeVideoBonusController$emitMessage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ HomeVideoBonusEvent.ShowMessage $event;
    int label;
    final /* synthetic */ HomeVideoBonusController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeVideoBonusController$emitMessage$1(HomeVideoBonusController homeVideoBonusController, HomeVideoBonusEvent.ShowMessage showMessage, Continuation<? super HomeVideoBonusController$emitMessage$1> continuation) {
        super(2, continuation);
        this.this$0 = homeVideoBonusController;
        this.$event = showMessage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeVideoBonusController$emitMessage$1(this.this$0, this.$event, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeVideoBonusController$emitMessage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableSharedFlow mutableSharedFlow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mutableSharedFlow = this.this$0._events;
            this.label = 1;
            if (mutableSharedFlow.emit(this.$event, this) == coroutine_suspended) {
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
