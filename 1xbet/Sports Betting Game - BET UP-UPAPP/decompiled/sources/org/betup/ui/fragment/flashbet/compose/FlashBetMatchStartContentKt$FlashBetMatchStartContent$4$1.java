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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.betup.games.flashbet.model.FlashBetGameSessionDto;
import org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartUiState;

/* compiled from: FlashBetMatchStartContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartContentKt$FlashBetMatchStartContent$4$1", f = "FlashBetMatchStartContent.kt", i = {}, l = {157}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class FlashBetMatchStartContentKt$FlashBetMatchStartContent$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<FlashBetGameSessionDto, Unit> $onGameStarted;
    final /* synthetic */ State<FlashBetMatchStartUiState> $uiState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlashBetMatchStartContentKt$FlashBetMatchStartContent$4$1(Function1<? super FlashBetGameSessionDto, Unit> function1, State<? extends FlashBetMatchStartUiState> state, Continuation<? super FlashBetMatchStartContentKt$FlashBetMatchStartContent$4$1> continuation) {
        super(2, continuation);
        this.$onGameStarted = function1;
        this.$uiState$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FlashBetMatchStartContentKt$FlashBetMatchStartContent$4$1(this.$onGameStarted, this.$uiState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FlashBetMatchStartContentKt$FlashBetMatchStartContent$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlashBetMatchStartUiState FlashBetMatchStartContent$lambda$4;
        FlashBetMatchStartUiState FlashBetMatchStartContent$lambda$42;
        Object deferToNextLayoutFrame;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlashBetMatchStartContent$lambda$4 = FlashBetMatchStartContentKt.FlashBetMatchStartContent$lambda$4(this.$uiState$delegate);
            if (FlashBetMatchStartContent$lambda$4 instanceof FlashBetMatchStartUiState.StartSuccess) {
                FlashBetMatchStartContent$lambda$42 = FlashBetMatchStartContentKt.FlashBetMatchStartContent$lambda$4(this.$uiState$delegate);
                Intrinsics.checkNotNull(FlashBetMatchStartContent$lambda$42, "null cannot be cast to non-null type org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartUiState.StartSuccess");
                if (((FlashBetMatchStartUiState.StartSuccess) FlashBetMatchStartContent$lambda$42).getSession() == null) {
                    this.label = 1;
                    deferToNextLayoutFrame = FlashBetMatchStartContentKt.deferToNextLayoutFrame(this);
                    if (deferToNextLayoutFrame == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Function1<FlashBetGameSessionDto, Unit> function1 = this.$onGameStarted;
        if (function1 != null) {
            function1.invoke(null);
        }
        return Unit.INSTANCE;
    }
}
