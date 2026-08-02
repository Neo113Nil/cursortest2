package org.betup.ui.fragment.flashbet.compose;

import java.util.List;
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
import kotlinx.coroutines.DelayKt;
import org.betup.games.flashbet.model.FlashBetGameSessionDto;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: FlashBetMatchStartContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.flashbet.compose.FlashBetMatchStartContentKt$FlashBetMatchStartContent$7$1", f = "FlashBetMatchStartContent.kt", i = {}, l = {Opcodes.DRETURN, Opcodes.ARETURN}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class FlashBetMatchStartContentKt$FlashBetMatchStartContent$7$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<String> $carouselUrlsTeam1;
    final /* synthetic */ List<String> $carouselUrlsTeam2;
    final /* synthetic */ Function1<FlashBetGameSessionDto, Unit> $onGameStarted;
    final /* synthetic */ FlashBetGameSessionDto $revealSession;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlashBetMatchStartContentKt$FlashBetMatchStartContent$7$1(FlashBetGameSessionDto flashBetGameSessionDto, List<String> list, List<String> list2, Function1<? super FlashBetGameSessionDto, Unit> function1, Continuation<? super FlashBetMatchStartContentKt$FlashBetMatchStartContent$7$1> continuation) {
        super(2, continuation);
        this.$revealSession = flashBetGameSessionDto;
        this.$carouselUrlsTeam1 = list;
        this.$carouselUrlsTeam2 = list2;
        this.$onGameStarted = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FlashBetMatchStartContentKt$FlashBetMatchStartContent$7$1(this.$revealSession, this.$carouselUrlsTeam1, this.$carouselUrlsTeam2, this.$onGameStarted, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FlashBetMatchStartContentKt$FlashBetMatchStartContent$7$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0053  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object deferToNextLayoutFrame;
        Function1<FlashBetGameSessionDto, Unit> function1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$revealSession != null && this.$carouselUrlsTeam1.isEmpty() && this.$carouselUrlsTeam2.isEmpty()) {
                this.label = 1;
                if (DelayKt.delay(100L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            function1 = this.$onGameStarted;
            if (function1 != null) {
                function1.invoke(this.$revealSession);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        this.label = 2;
        deferToNextLayoutFrame = FlashBetMatchStartContentKt.deferToNextLayoutFrame(this);
        if (deferToNextLayoutFrame == coroutine_suspended) {
            return coroutine_suspended;
        }
        function1 = this.$onGameStarted;
        if (function1 != null) {
        }
        return Unit.INSTANCE;
    }
}
