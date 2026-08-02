package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()V"}, k = 3, mv = {1, 8, 0}, xi = 176)
/* loaded from: classes.dex */
public final class ConstraintLayoutKt$ConstraintLayout$3$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlin.Unit> {
    final /* synthetic */ kotlinx.coroutines.channels.Channel<androidx.constraintlayout.compose.ConstraintSet> $getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.constraintlayout.compose.ConstraintSet $getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
        invoke2();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$getHighSpeedVideoFpsRanges.mo9266trySendJP2dKIU(this.$getHighSpeedVideoSizes);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintLayoutKt$ConstraintLayout$3$1(kotlinx.coroutines.channels.Channel<androidx.constraintlayout.compose.ConstraintSet> channel, androidx.constraintlayout.compose.ConstraintSet constraintSet) {
        super(0);
        this.$getHighSpeedVideoFpsRanges = channel;
        this.$getHighSpeedVideoSizes = constraintSet;
    }
}
