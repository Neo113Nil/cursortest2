package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "invoke", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
/* loaded from: classes.dex */
public final class ConstraintLayoutKt$ConstraintLayout$7$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit> {
    final /* synthetic */ androidx.constraintlayout.compose.Measurer2 $getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        invoke2(semanticsPropertyReceiver);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.constraintlayout.compose.ToolingUtilsKt.setDesignInfoProvider(semanticsPropertyReceiver, this.$getHighSpeedVideoFpsRangesFor);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintLayoutKt$ConstraintLayout$7$1(androidx.constraintlayout.compose.Measurer2 measurer2) {
        super(1);
        this.$getHighSpeedVideoFpsRangesFor = measurer2;
    }
}
