package org.betup.ui.fragment.flashbet.compose;

import androidx.compose.runtime.MutableIntState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.betup.games.flashbet.model.FlashBetGameSessionDto;
import org.betup.ui.fragment.flashbet.controller.FlashBetGameController;

/* compiled from: FlashBetGameContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$FlashBetGameContent$4$1$4$2$1", f = "FlashBetGameContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class FlashBetGameContentKt$FlashBetGameContent$4$1$4$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $allAnswered;
    final /* synthetic */ FlashBetGameController $controller;
    final /* synthetic */ int $endingPhaseRealMs;
    final /* synthetic */ MutableIntState $matchFinishingElapsedMs$delegate;
    final /* synthetic */ FlashBetGameSessionDto $s;
    final /* synthetic */ String $sessionId;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlashBetGameContentKt$FlashBetGameContent$4$1$4$2$1(boolean z, int i, FlashBetGameSessionDto flashBetGameSessionDto, FlashBetGameController flashBetGameController, String str, MutableIntState mutableIntState, Continuation<? super FlashBetGameContentKt$FlashBetGameContent$4$1$4$2$1> continuation) {
        super(2, continuation);
        this.$allAnswered = z;
        this.$endingPhaseRealMs = i;
        this.$s = flashBetGameSessionDto;
        this.$controller = flashBetGameController;
        this.$sessionId = str;
        this.$matchFinishingElapsedMs$delegate = mutableIntState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FlashBetGameContentKt$FlashBetGameContent$4$1$4$2$1(this.$allAnswered, this.$endingPhaseRealMs, this.$s, this.$controller, this.$sessionId, this.$matchFinishingElapsedMs$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FlashBetGameContentKt$FlashBetGameContent$4$1$4$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$31;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$allAnswered) {
            FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$31 = FlashBetGameContentKt.FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$31(this.$matchFinishingElapsedMs$delegate);
            if (FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$31 >= this.$endingPhaseRealMs && this.$s.getResult() == null) {
                this.$controller.loadSession(this.$sessionId, false, false);
            }
        }
        return Unit.INSTANCE;
    }
}
