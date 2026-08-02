package org.betup.ui.fragment.flashbet.compose;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.betup.games.flashbet.model.FlashBetGameSessionDto;

/* compiled from: FlashBetGameContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$FlashBetGameContent$4$1$4$17$1", f = "FlashBetGameContent.kt", i = {}, l = {507}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class FlashBetGameContentKt$FlashBetGameContent$4$1$4$17$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $onTimeExpired;
    final /* synthetic */ FlashBetGameSessionDto $s;
    final /* synthetic */ MutableState<Boolean> $sessionExpiredNavigatePosted$delegate;
    final /* synthetic */ MutableState<Boolean> $timeExpiredByCountdown$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlashBetGameContentKt$FlashBetGameContent$4$1$4$17$1(FlashBetGameSessionDto flashBetGameSessionDto, Function0<Unit> function0, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Continuation<? super FlashBetGameContentKt$FlashBetGameContent$4$1$4$17$1> continuation) {
        super(2, continuation);
        this.$s = flashBetGameSessionDto;
        this.$onTimeExpired = function0;
        this.$timeExpiredByCountdown$delegate = mutableState;
        this.$sessionExpiredNavigatePosted$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FlashBetGameContentKt$FlashBetGameContent$4$1$4$17$1(this.$s, this.$onTimeExpired, this.$timeExpiredByCountdown$delegate, this.$sessionExpiredNavigatePosted$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FlashBetGameContentKt$FlashBetGameContent$4$1$4$17$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$95;
        boolean FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$98;
        Object flashBetDeferToNextLayoutFrame;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$95 = FlashBetGameContentKt.FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$95(this.$timeExpiredByCountdown$delegate);
            if (FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$95 && this.$s.getPendingQuestion() != null) {
                FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$98 = FlashBetGameContentKt.FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$98(this.$sessionExpiredNavigatePosted$delegate);
                if (!FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$98) {
                    FlashBetGameContentKt.FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$99(this.$sessionExpiredNavigatePosted$delegate, true);
                    this.label = 1;
                    flashBetDeferToNextLayoutFrame = FlashBetGameContentKt.flashBetDeferToNextLayoutFrame(this);
                    if (flashBetDeferToNextLayoutFrame == coroutine_suspended) {
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
        Function0<Unit> function0 = this.$onTimeExpired;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
