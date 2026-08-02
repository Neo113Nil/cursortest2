package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()V"}, k = 3, mv = {1, 8, 0}, xi = 176)
/* loaded from: classes.dex */
public final class ConstraintLayoutKt$ConstraintLayout$onHelpersChanged$1$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlin.Unit> {
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> $Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.constraintlayout.compose.ConstraintSetForInlineDsl $getHighSpeedVideoFpsRanges;

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
        invoke2();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$Camera2StreamConfigurationMap.setValue(java.lang.Boolean.valueOf(!r0.getValue().booleanValue()));
        this.$getHighSpeedVideoFpsRanges.setKnownDirty(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintLayoutKt$ConstraintLayout$onHelpersChanged$1$1(androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, androidx.constraintlayout.compose.ConstraintSetForInlineDsl constraintSetForInlineDsl) {
        super(0);
        this.$Camera2StreamConfigurationMap = mutableState;
        this.$getHighSpeedVideoFpsRanges = constraintSetForInlineDsl;
    }
}
