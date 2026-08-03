package androidx.compose.material;

/* compiled from: FloatingActionButton.kt */
@kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2", f = "FloatingActionButton.kt", i = {}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_CLOSED_MISSING_HEARTBEAT_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class DefaultFloatingActionButtonElevation$elevation$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> $animatable;
    final /* synthetic */ androidx.compose.foundation.interaction.Interaction $interaction;
    final /* synthetic */ float $target;
    int label;
    final /* synthetic */ androidx.compose.material.DefaultFloatingActionButtonElevation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultFloatingActionButtonElevation$elevation$2(androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> animatable, androidx.compose.material.DefaultFloatingActionButtonElevation defaultFloatingActionButtonElevation, float f, androidx.compose.foundation.interaction.Interaction interaction, kotlin.coroutines.Continuation<? super androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2> continuation) {
        super(2, continuation);
        this.$animatable = animatable;
        this.this$0 = defaultFloatingActionButtonElevation;
        this.$target = f;
        this.$interaction = interaction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2(this.$animatable, this.this$0, this.$target, this.$interaction, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        float f;
        float f2;
        float f3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            float m4492unboximpl = this.$animatable.getTargetValue().m4492unboximpl();
            f = this.this$0.pressedElevation;
            androidx.compose.foundation.interaction.FocusInteraction.Focus focus = null;
            if (androidx.compose.ui.unit.Dp.m4483equalsimpl0(m4492unboximpl, f)) {
                focus = new androidx.compose.foundation.interaction.PressInteraction.Press(androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0(), null);
            } else {
                f2 = this.this$0.hoveredElevation;
                if (androidx.compose.ui.unit.Dp.m4483equalsimpl0(m4492unboximpl, f2)) {
                    focus = new androidx.compose.foundation.interaction.HoverInteraction.Enter();
                } else {
                    f3 = this.this$0.focusedElevation;
                    if (androidx.compose.ui.unit.Dp.m4483equalsimpl0(m4492unboximpl, f3)) {
                        focus = new androidx.compose.foundation.interaction.FocusInteraction.Focus();
                    }
                }
            }
            this.label = 1;
            if (androidx.compose.material.ElevationKt.m1380animateElevationrAjV9yQ(this.$animatable, this.$target, focus, this.$interaction, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }
}
