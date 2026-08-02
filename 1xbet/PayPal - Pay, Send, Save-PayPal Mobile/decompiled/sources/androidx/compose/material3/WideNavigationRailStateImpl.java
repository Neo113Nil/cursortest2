package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001(B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\tH\u0096@¢\u0006\u0004\b\r\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0003\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010\u000e\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0013R\u0014\u0010'\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0013"}, d2 = {"Landroidx/compose/material3/WideNavigationRailStateImpl;", "Landroidx/compose/material3/WideNavigationRailState;", "Landroidx/compose/material3/WideNavigationRailValue;", "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "<init>", "(Landroidx/compose/material3/WideNavigationRailValue;Landroidx/compose/animation/core/AnimationSpec;)V", "", "expand", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collapse", "toggle", "targetValue", "snapTo", "(Landroidx/compose/material3/WideNavigationRailValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/material3/WideNavigationRailValue;", "getInitialValue", "()Landroidx/compose/material3/WideNavigationRailValue;", "setInitialValue", "(Landroidx/compose/material3/WideNavigationRailValue;)V", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/animation/core/AnimationSpec;", "getHighSpeedVideoFpsRangesFor", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoSizes", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "Landroidx/compose/animation/core/Animatable;", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/State;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/runtime/State;", "", "isAnimating", "()Z", "getTargetValue", "getCurrentValue", "currentValue", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WideNavigationRailStateImpl implements androidx.compose.material3.WideNavigationRailState {
    private final androidx.compose.animation.core.AnimationSpec<java.lang.Float> getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.compose.runtime.State<androidx.compose.material3.WideNavigationRailValue> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final float getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> Camera2StreamConfigurationMap;
    private androidx.compose.material3.WideNavigationRailValue initialValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.material3.WideNavigationRailStateImpl.Companion INSTANCE = new androidx.compose.material3.WideNavigationRailStateImpl.Companion(null);
    public static final int $stable = 8;

    public WideNavigationRailStateImpl(androidx.compose.material3.WideNavigationRailValue wideNavigationRailValue, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec) {
        this.initialValue = wideNavigationRailValue;
        this.getHighResolutionOutputSizeshNQ4ISI = animationSpec;
        float f = androidx.compose.material3.WideNavigationRailStateKt.isExpanded(wideNavigationRailValue) ? 1.0f : 0.0f;
        this.getHighSpeedVideoSizes = f;
        this.Camera2StreamConfigurationMap = new androidx.compose.animation.core.Animatable<>(java.lang.Float.valueOf(f), androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE), null, null, 12, null);
        this.getHighSpeedVideoFpsRanges = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.WideNavigationRailStateImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.compose.material3.WideNavigationRailStateImpl.$r8$lambda$4RMRSc6R5XTjUejyiWXg5uM1vjo(androidx.compose.material3.WideNavigationRailStateImpl.this);
            }
        });
    }

    public final androidx.compose.material3.WideNavigationRailValue getInitialValue() {
        return this.initialValue;
    }

    public final void setInitialValue(androidx.compose.material3.WideNavigationRailValue wideNavigationRailValue) {
        this.initialValue = wideNavigationRailValue;
    }

    @Override // androidx.compose.material3.WideNavigationRailState
    public final boolean isAnimating() {
        return this.Camera2StreamConfigurationMap.isRunning();
    }

    @Override // androidx.compose.material3.WideNavigationRailState
    public final androidx.compose.material3.WideNavigationRailValue getTargetValue() {
        if (this.Camera2StreamConfigurationMap.getTargetValue().floatValue() == 1.0f) {
            return androidx.compose.material3.WideNavigationRailValue.Expanded;
        }
        return androidx.compose.material3.WideNavigationRailValue.Collapsed;
    }

    @Override // androidx.compose.material3.WideNavigationRailState
    public final androidx.compose.material3.WideNavigationRailValue getCurrentValue() {
        return this.getHighSpeedVideoFpsRanges.getValue();
    }

    @Override // androidx.compose.material3.WideNavigationRailState
    public final java.lang.Object expand(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object animateTo$default = androidx.compose.animation.core.Animatable.animateTo$default(this.Camera2StreamConfigurationMap, kotlin.coroutines.jvm.internal.Boxing.boxFloat(1.0f), this.getHighResolutionOutputSizeshNQ4ISI, null, null, continuation, 12, null);
        return animateTo$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo$default : kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.material3.WideNavigationRailState
    public final java.lang.Object collapse(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object animateTo$default = androidx.compose.animation.core.Animatable.animateTo$default(this.Camera2StreamConfigurationMap, kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.0f), this.getHighResolutionOutputSizeshNQ4ISI, null, null, continuation, 12, null);
        return animateTo$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo$default : kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.material3.WideNavigationRailState
    public final java.lang.Object toggle(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object animateTo$default = androidx.compose.animation.core.Animatable.animateTo$default(this.Camera2StreamConfigurationMap, kotlin.coroutines.jvm.internal.Boxing.boxFloat(androidx.compose.material3.WideNavigationRailStateKt.isExpanded(getTargetValue()) ? 0.0f : 1.0f), this.getHighResolutionOutputSizeshNQ4ISI, null, null, continuation, 12, null);
        return animateTo$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo$default : kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.material3.WideNavigationRailState
    public final java.lang.Object snapTo(androidx.compose.material3.WideNavigationRailValue wideNavigationRailValue, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object snapTo = this.Camera2StreamConfigurationMap.snapTo(kotlin.coroutines.jvm.internal.Boxing.boxFloat(androidx.compose.material3.WideNavigationRailStateKt.isExpanded(wideNavigationRailValue) ? 1.0f : 0.0f), continuation);
        return snapTo == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? snapTo : kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/material3/WideNavigationRailStateImpl$Companion;", "", "<init>", "()V", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/WideNavigationRailState;", "Landroidx/compose/material3/WideNavigationRailValue;", "Saver", "(Landroidx/compose/animation/core/AnimationSpec;)Landroidx/compose/runtime/saveable/Saver;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.runtime.saveable.Saver<androidx.compose.material3.WideNavigationRailState, androidx.compose.material3.WideNavigationRailValue> Saver(final androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec) {
            return androidx.compose.runtime.saveable.SaverKt.Saver(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.WideNavigationRailStateImpl$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    androidx.compose.material3.WideNavigationRailValue targetValue;
                    targetValue = ((androidx.compose.material3.WideNavigationRailState) obj2).getTargetValue();
                    return targetValue;
                }
            }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.WideNavigationRailStateImpl$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.compose.material3.WideNavigationRailStateImpl.Companion.$r8$lambda$wFd2v3m8kq6dJXAFO2J10p44gHE(androidx.compose.animation.core.AnimationSpec.this, (androidx.compose.material3.WideNavigationRailValue) obj);
                }
            });
        }

        public static /* synthetic */ androidx.compose.material3.WideNavigationRailState $r8$lambda$wFd2v3m8kq6dJXAFO2J10p44gHE(androidx.compose.animation.core.AnimationSpec animationSpec, androidx.compose.material3.WideNavigationRailValue wideNavigationRailValue) {
            return new androidx.compose.material3.WideNavigationRailStateImpl(wideNavigationRailValue, animationSpec);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ androidx.compose.material3.WideNavigationRailValue $r8$lambda$4RMRSc6R5XTjUejyiWXg5uM1vjo(androidx.compose.material3.WideNavigationRailStateImpl wideNavigationRailStateImpl) {
        if (wideNavigationRailStateImpl.Camera2StreamConfigurationMap.getValue().floatValue() == 1.0f) {
            return androidx.compose.material3.WideNavigationRailValue.Expanded;
        }
        return androidx.compose.material3.WideNavigationRailValue.Collapsed;
    }
}
