package org.betup.ui.fragment.flashbet.compose;

import android.content.Context;
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
import org.betup.ui.fragment.flashbet.FlashBetUiSoundEffect;

/* compiled from: FlashBetGameContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$FlashBetGameContent$4$1$4$15$1", f = "FlashBetGameContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class FlashBetGameContentKt$FlashBetGameContent$4$1$4$15$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $allAnswered;
    final /* synthetic */ Context $appContext;
    final /* synthetic */ int $displayedMinute;
    final /* synthetic */ MutableState<Boolean> $fullTimeWhistlePlayed$delegate;
    final /* synthetic */ MutableState<Boolean> $showReveal$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlashBetGameContentKt$FlashBetGameContent$4$1$4$15$1(boolean z, int i, Context context, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Continuation<? super FlashBetGameContentKt$FlashBetGameContent$4$1$4$15$1> continuation) {
        super(2, continuation);
        this.$allAnswered = z;
        this.$displayedMinute = i;
        this.$appContext = context;
        this.$showReveal$delegate = mutableState;
        this.$fullTimeWhistlePlayed$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FlashBetGameContentKt$FlashBetGameContent$4$1$4$15$1(this.$allAnswered, this.$displayedMinute, this.$appContext, this.$showReveal$delegate, this.$fullTimeWhistlePlayed$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FlashBetGameContentKt$FlashBetGameContent$4$1$4$15$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$38;
        boolean FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$87;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$38 = FlashBetGameContentKt.FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$38(this.$showReveal$delegate);
            if (!FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$38 && this.$allAnswered && this.$displayedMinute >= 90) {
                FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$87 = FlashBetGameContentKt.FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$87(this.$fullTimeWhistlePlayed$delegate);
                if (!FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$87) {
                    FlashBetGameContentKt.FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$88(this.$fullTimeWhistlePlayed$delegate, true);
                    FlashBetUiSoundEffect flashBetUiSoundEffect = FlashBetUiSoundEffect.INSTANCE;
                    Context context = this.$appContext;
                    Intrinsics.checkNotNull(context);
                    flashBetUiSoundEffect.playWhistle(context, false);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
