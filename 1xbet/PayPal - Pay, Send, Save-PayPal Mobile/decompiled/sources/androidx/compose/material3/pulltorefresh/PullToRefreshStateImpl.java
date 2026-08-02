package androidx.compose.material3.pulltorefresh;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001d\b\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00158WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;", "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "p0", "<init>", "(Landroidx/compose/animation/core/Animatable;)V", "()V", "", "animateToThreshold", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateToHidden", "targetValue", "snapTo", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/animation/core/Animatable;", "getDistanceFraction", "()F", "distanceFraction", "", "isAnimating", "()Z", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PullToRefreshStateImpl implements androidx.compose.material3.pulltorefresh.PullToRefreshState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl.Companion INSTANCE = new androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl.Companion(null);
    private static final androidx.compose.runtime.saveable.Saver<androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl, java.lang.Float> Saver = androidx.compose.runtime.saveable.SaverKt.Saver(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            java.lang.Float value;
            value = ((androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl) obj2).getHighSpeedVideoFpsRanges.getValue();
            return value;
        }
    }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl.$r8$lambda$Xq1974UTjSPMPCyvrKn2E0_AMdc(((java.lang.Float) obj).floatValue());
        }
    });
    private final androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> getHighSpeedVideoFpsRanges;

    private PullToRefreshStateImpl(androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable) {
        this.getHighSpeedVideoFpsRanges = animatable;
    }

    public PullToRefreshStateImpl() {
        this(new androidx.compose.animation.core.Animatable(java.lang.Float.valueOf(0.0f), androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE), null, null, 12, null));
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public final float getDistanceFraction() {
        return this.getHighSpeedVideoFpsRanges.getValue().floatValue();
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public final boolean isAnimating() {
        return this.getHighSpeedVideoFpsRanges.isRunning();
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public final java.lang.Object animateToThreshold(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object animateTo$default = androidx.compose.animation.core.Animatable.animateTo$default(this.getHighSpeedVideoFpsRanges, kotlin.coroutines.jvm.internal.Boxing.boxFloat(1.0f), null, null, null, continuation, 14, null);
        return animateTo$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo$default : kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public final java.lang.Object animateToHidden(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object animateTo$default = androidx.compose.animation.core.Animatable.animateTo$default(this.getHighSpeedVideoFpsRanges, kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.0f), null, null, null, continuation, 14, null);
        return animateTo$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo$default : kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public final java.lang.Object snapTo(float f, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object snapTo = this.getHighSpeedVideoFpsRanges.snapTo(kotlin.coroutines.jvm.internal.Boxing.boxFloat(f), continuation);
        return snapTo == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? snapTo : kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;", "", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.runtime.saveable.Saver<androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl, java.lang.Float> getSaver() {
            return androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl.Saver;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl $r8$lambda$Xq1974UTjSPMPCyvrKn2E0_AMdc(float f) {
        return new androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl(new androidx.compose.animation.core.Animatable(java.lang.Float.valueOf(f), androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE), null, null, 12, null));
    }
}
