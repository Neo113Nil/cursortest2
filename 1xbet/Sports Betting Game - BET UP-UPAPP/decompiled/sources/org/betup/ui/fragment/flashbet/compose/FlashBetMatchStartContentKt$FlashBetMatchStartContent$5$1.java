package org.betup.ui.fragment.flashbet.compose;

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
import org.betup.games.flashbet.model.FlashBetGameSessionDto;

/* compiled from: FlashBetMatchStartContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartContentKt$FlashBetMatchStartContent$5$1", f = "FlashBetMatchStartContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class FlashBetMatchStartContentKt$FlashBetMatchStartContent$5$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FlashBetGameSessionDto $revealSession;
    final /* synthetic */ MutableState<Boolean> $team1RevealStopped$delegate;
    final /* synthetic */ MutableState<Boolean> $team2RevealStopped$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlashBetMatchStartContentKt$FlashBetMatchStartContent$5$1(FlashBetGameSessionDto flashBetGameSessionDto, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Continuation<? super FlashBetMatchStartContentKt$FlashBetMatchStartContent$5$1> continuation) {
        super(2, continuation);
        this.$revealSession = flashBetGameSessionDto;
        this.$team1RevealStopped$delegate = mutableState;
        this.$team2RevealStopped$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FlashBetMatchStartContentKt$FlashBetMatchStartContent$5$1(this.$revealSession, this.$team1RevealStopped$delegate, this.$team2RevealStopped$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FlashBetMatchStartContentKt$FlashBetMatchStartContent$5$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$revealSession != null) {
            FlashBetMatchStartContentKt.FlashBetMatchStartContent$lambda$13(this.$team1RevealStopped$delegate, false);
            FlashBetMatchStartContentKt.FlashBetMatchStartContent$lambda$16(this.$team2RevealStopped$delegate, false);
        }
        return Unit.INSTANCE;
    }
}
