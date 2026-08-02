package org.betup.ui.fragment.flashbet.compose;

import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.betup.games.flashbet.model.FlashBetGameSessionDto;
import org.betup.ui.fragment.flashbet.controller.FlashBetController;

/* compiled from: FlashBetContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.flashbet.compose.FlashBetContentKt$FlashBetContent$3$1", f = "FlashBetContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class FlashBetContentKt$FlashBetContent$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FlashBetController $controller;
    final /* synthetic */ Function1<FlashBetGameSessionDto, Unit> $onShowAbandonedSessionDialog;
    final /* synthetic */ State<FlashBetGameSessionDto> $pendingAbandonedSession$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlashBetContentKt$FlashBetContent$3$1(State<FlashBetGameSessionDto> state, Function1<? super FlashBetGameSessionDto, Unit> function1, FlashBetController flashBetController, Continuation<? super FlashBetContentKt$FlashBetContent$3$1> continuation) {
        super(2, continuation);
        this.$pendingAbandonedSession$delegate = state;
        this.$onShowAbandonedSessionDialog = function1;
        this.$controller = flashBetController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FlashBetContentKt$FlashBetContent$3$1(this.$pendingAbandonedSession$delegate, this.$onShowAbandonedSessionDialog, this.$controller, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FlashBetContentKt$FlashBetContent$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlashBetGameSessionDto FlashBetContent$lambda$6;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            FlashBetContent$lambda$6 = FlashBetContentKt.FlashBetContent$lambda$6(this.$pendingAbandonedSession$delegate);
            if (FlashBetContent$lambda$6 != null) {
                Function1<FlashBetGameSessionDto, Unit> function1 = this.$onShowAbandonedSessionDialog;
                FlashBetController flashBetController = this.$controller;
                function1.invoke(FlashBetContent$lambda$6);
                flashBetController.clearPendingAbandonedSession();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
