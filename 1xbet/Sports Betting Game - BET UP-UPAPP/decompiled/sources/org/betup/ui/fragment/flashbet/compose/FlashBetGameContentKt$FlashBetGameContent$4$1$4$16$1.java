package org.betup.ui.fragment.flashbet.compose;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
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
@DebugMetadata(c = "org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$FlashBetGameContent$4$1$4$16$1", f = "FlashBetGameContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class FlashBetGameContentKt$FlashBetGameContent$4$1$4$16$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $appContext;
    final /* synthetic */ MutableState<Long> $lockInAnswerId$delegate;
    final /* synthetic */ State<Long> $selectedAnswerId$delegate;
    final /* synthetic */ boolean $showQuestion;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlashBetGameContentKt$FlashBetGameContent$4$1$4$16$1(boolean z, Context context, State<Long> state, MutableState<Long> mutableState, Continuation<? super FlashBetGameContentKt$FlashBetGameContent$4$1$4$16$1> continuation) {
        super(2, continuation);
        this.$showQuestion = z;
        this.$appContext = context;
        this.$selectedAnswerId$delegate = state;
        this.$lockInAnswerId$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FlashBetGameContentKt$FlashBetGameContent$4$1$4$16$1(this.$showQuestion, this.$appContext, this.$selectedAnswerId$delegate, this.$lockInAnswerId$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FlashBetGameContentKt$FlashBetGameContent$4$1$4$16$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Long FlashBetGameContent$lambda$4;
        Long FlashBetGameContent$lambda$42;
        Long FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$91;
        Long FlashBetGameContent$lambda$43;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$showQuestion) {
            FlashBetGameContent$lambda$4 = FlashBetGameContentKt.FlashBetGameContent$lambda$4(this.$selectedAnswerId$delegate);
            if (FlashBetGameContent$lambda$4 != null) {
                FlashBetGameContent$lambda$42 = FlashBetGameContentKt.FlashBetGameContent$lambda$4(this.$selectedAnswerId$delegate);
                FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$91 = FlashBetGameContentKt.FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$91(this.$lockInAnswerId$delegate);
                if (!Intrinsics.areEqual(FlashBetGameContent$lambda$42, FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$91)) {
                    MutableState<Long> mutableState = this.$lockInAnswerId$delegate;
                    FlashBetGameContent$lambda$43 = FlashBetGameContentKt.FlashBetGameContent$lambda$4(this.$selectedAnswerId$delegate);
                    mutableState.setValue(FlashBetGameContent$lambda$43);
                    FlashBetUiSoundEffect flashBetUiSoundEffect = FlashBetUiSoundEffect.INSTANCE;
                    Context context = this.$appContext;
                    Intrinsics.checkNotNull(context);
                    flashBetUiSoundEffect.playLockIn(context);
                    return Unit.INSTANCE;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
