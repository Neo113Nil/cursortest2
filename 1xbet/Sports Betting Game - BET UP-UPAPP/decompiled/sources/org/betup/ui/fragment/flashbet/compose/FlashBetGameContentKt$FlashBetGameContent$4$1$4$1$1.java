package org.betup.ui.fragment.flashbet.compose;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: FlashBetGameContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$FlashBetGameContent$4$1$4$1$1", f = "FlashBetGameContent.kt", i = {}, l = {243}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class FlashBetGameContentKt$FlashBetGameContent$4$1$4$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<FlashBetEventFlash> $activeEventFlash$delegate;
    final /* synthetic */ boolean $allAnswered;
    final /* synthetic */ int $endingPhaseRealMs;
    final /* synthetic */ MutableIntState $matchFinishingElapsedMs$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlashBetGameContentKt$FlashBetGameContent$4$1$4$1$1(boolean z, int i, MutableIntState mutableIntState, MutableState<FlashBetEventFlash> mutableState, Continuation<? super FlashBetGameContentKt$FlashBetGameContent$4$1$4$1$1> continuation) {
        super(2, continuation);
        this.$allAnswered = z;
        this.$endingPhaseRealMs = i;
        this.$matchFinishingElapsedMs$delegate = mutableIntState;
        this.$activeEventFlash$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FlashBetGameContentKt$FlashBetGameContent$4$1$4$1$1(this.$allAnswered, this.$endingPhaseRealMs, this.$matchFinishingElapsedMs$delegate, this.$activeEventFlash$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FlashBetGameContentKt$FlashBetGameContent$4$1$4$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0026, code lost:
    
        if (r6 < r5.$endingPhaseRealMs) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003d -> B:5:0x0040). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$31;
        int FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$312;
        FlashBetEventFlash FlashBetGameContent$lambda$7;
        int FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$313;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$allAnswered) {
                FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$31 = FlashBetGameContentKt.FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$31(this.$matchFinishingElapsedMs$delegate);
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        FlashBetGameContent$lambda$7 = FlashBetGameContentKt.FlashBetGameContent$lambda$7(this.$activeEventFlash$delegate);
        if (FlashBetGameContent$lambda$7 == null) {
            MutableIntState mutableIntState = this.$matchFinishingElapsedMs$delegate;
            FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$313 = FlashBetGameContentKt.FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$31(mutableIntState);
            mutableIntState.setIntValue(RangesKt.coerceAtMost(FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$313 + 200, this.$endingPhaseRealMs));
        }
        FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$312 = FlashBetGameContentKt.FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$31(this.$matchFinishingElapsedMs$delegate);
        if (FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$312 < this.$endingPhaseRealMs) {
            this.label = 1;
            if (DelayKt.delay(200L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            FlashBetGameContent$lambda$7 = FlashBetGameContentKt.FlashBetGameContent$lambda$7(this.$activeEventFlash$delegate);
            if (FlashBetGameContent$lambda$7 == null) {
            }
            FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$312 = FlashBetGameContentKt.FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$31(this.$matchFinishingElapsedMs$delegate);
            if (FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$312 < this.$endingPhaseRealMs) {
            }
        }
        return Unit.INSTANCE;
    }
}
