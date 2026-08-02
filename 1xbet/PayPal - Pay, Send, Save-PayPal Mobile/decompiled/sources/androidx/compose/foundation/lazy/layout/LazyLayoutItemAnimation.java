package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 Y2\u00020\u0001:\u0001YB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\fJ\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\fJ\r\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\fR\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR*\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R*\u0010&\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R*\u0010)\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010!\u001a\u0004\b*\u0010#\"\u0004\b+\u0010%R$\u0010-\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u000f8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b-\u0010/R+\u00103\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u000f8G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u0010/\"\u0004\b4\u00105R+\u00107\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u000f8G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b6\u00102\u001a\u0004\b7\u0010/\"\u0004\b8\u00105R+\u0010:\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u000f8G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b9\u00102\u001a\u0004\b:\u0010/\"\u0004\b;\u00105R+\u0010=\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u000f8G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b<\u00102\u001a\u0004\b=\u0010/\"\u0004\b>\u00105R\"\u0010?\u001a\u00020\r8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010E\u001a\u00020\r8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bE\u0010@\u001a\u0004\bF\u0010B\"\u0004\bG\u0010DR(\u0010I\u001a\u0004\u0018\u00010H2\b\u0010,\u001a\u0004\u0018\u00010H8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020N0M8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bO\u0010PR \u0010O\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020Q0M8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010PR+\u0010U\u001a\u00020\r2\u0006\u00100\u001a\u00020\r8G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\bR\u00102\u001a\u0004\bS\u0010B\"\u0004\bT\u0010DR\"\u0010V\u001a\u00020\r8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bV\u0010@\u001a\u0004\bW\u0010B\"\u0004\bX\u0010D"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Landroidx/compose/ui/graphics/GraphicsContext;", "graphicsContext", "Lkotlin/Function0;", "", "onLayerPropertyChanged", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;Lkotlin/jvm/functions/Function0;)V", "cancelPlacementAnimation", "()V", "Landroidx/compose/ui/unit/IntOffset;", "delta", "", "isMovingAway", "animatePlacementDelta-ar5cAso", "(JZ)V", "animatePlacementDelta", "animateAppearance", "animateDisappearance", "release", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/CoroutineScope;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/graphics/GraphicsContext;", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoSizes", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "fadeInSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getFadeInSpec", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "setFadeInSpec", "(Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "placementSpec", "getPlacementSpec", "setPlacementSpec", "fadeOutSpec", "getFadeOutSpec", "setFadeOutSpec", "p0", "isRunningMovingAwayAnimation", "Z", "()Z", "<set-?>", "isPlacementAnimationInProgress$delegate", "Landroidx/compose/runtime/MutableState;", "isPlacementAnimationInProgress", "setPlacementAnimationInProgress", "(Z)V", "isAppearanceAnimationInProgress$delegate", "isAppearanceAnimationInProgress", "setAppearanceAnimationInProgress", "isDisappearanceAnimationInProgress$delegate", "isDisappearanceAnimationInProgress", "setDisappearanceAnimationInProgress", "isDisappearanceAnimationFinished$delegate", "isDisappearanceAnimationFinished", "setDisappearanceAnimationFinished", "rawOffset", "J", "getRawOffset-nOcc-ac", "()J", "setRawOffset--gyyYBs", "(J)V", "finalOffset", "getFinalOffset-nOcc-ac", "setFinalOffset--gyyYBs", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "getLayer", "()Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector2D;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "placementDelta$delegate", "getPlacementDelta-nOcc-ac", "setPlacementDelta--gyyYBs", "placementDelta", "lookaheadOffset", "getLookaheadOffset-nOcc-ac", "setLookaheadOffset--gyyYBs", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyLayoutItemAnimation {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;
    private androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> fadeInSpec;
    private androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> fadeOutSpec;
    private long finalOffset;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.ui.graphics.GraphicsContext Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> getHighSpeedVideoFpsRangesFor;

    /* renamed from: isAppearanceAnimationInProgress$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState isAppearanceAnimationInProgress;

    /* renamed from: isDisappearanceAnimationFinished$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState isDisappearanceAnimationFinished;

    /* renamed from: isDisappearanceAnimationInProgress$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState isDisappearanceAnimationInProgress;

    /* renamed from: isPlacementAnimationInProgress$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState isPlacementAnimationInProgress;
    private boolean isRunningMovingAwayAnimation;
    private androidx.compose.ui.graphics.layer.GraphicsLayer layer;
    private long lookaheadOffset;

    /* renamed from: placementDelta$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState placementDelta;
    private androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> placementSpec;
    private long rawOffset;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.Companion INSTANCE = new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.Companion(null);
    public static final int $stable = 8;
    private static final long NotInitialized = androidx.compose.ui.unit.IntOffset.m8723constructorimpl(9223372034707292159L);

    public LazyLayoutItemAnimation(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.ui.graphics.GraphicsContext graphicsContext, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.getHighResolutionOutputSizeshNQ4ISI = coroutineScope;
        this.Camera2StreamConfigurationMap = graphicsContext;
        this.getHighSpeedVideoSizes = function0;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.isPlacementAnimationInProgress = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isAppearanceAnimationInProgress = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isDisappearanceAnimationInProgress = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isDisappearanceAnimationFinished = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        long j = NotInitialized;
        this.rawOffset = j;
        this.finalOffset = androidx.compose.ui.unit.IntOffset.INSTANCE.m8740getZeronOccac();
        this.layer = graphicsContext != null ? graphicsContext.createGraphicsLayer() : null;
        this.getHighSpeedVideoFpsRanges = new androidx.compose.animation.core.Animatable<>(androidx.compose.ui.unit.IntOffset.m8720boximpl(androidx.compose.ui.unit.IntOffset.INSTANCE.m8740getZeronOccac()), androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.unit.IntOffset.INSTANCE), null, null, 12, null);
        this.getHighSpeedVideoFpsRangesFor = new androidx.compose.animation.core.Animatable<>(java.lang.Float.valueOf(1.0f), androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE), null, null, 12, null);
        this.placementDelta = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.unit.IntOffset.m8720boximpl(androidx.compose.ui.unit.IntOffset.INSTANCE.m8740getZeronOccac()), null, 2, null);
        this.lookaheadOffset = j;
    }

    public /* synthetic */ LazyLayoutItemAnimation(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.ui.graphics.GraphicsContext graphicsContext, kotlin.jvm.functions.Function0 function0, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, (i & 2) != 0 ? null : graphicsContext, (i & 4) != 0 ? new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.Camera2StreamConfigurationMap();
                return Camera2StreamConfigurationMap;
            }
        } : function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap() {
        return kotlin.Unit.INSTANCE;
    }

    public final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> getFadeInSpec() {
        return this.fadeInSpec;
    }

    public final void setFadeInSpec(androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec) {
        this.fadeInSpec = finiteAnimationSpec;
    }

    public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> getPlacementSpec() {
        return this.placementSpec;
    }

    public final void setPlacementSpec(androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> finiteAnimationSpec) {
        this.placementSpec = finiteAnimationSpec;
    }

    public final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> getFadeOutSpec() {
        return this.fadeOutSpec;
    }

    public final void setFadeOutSpec(androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec) {
        this.fadeOutSpec = finiteAnimationSpec;
    }

    /* renamed from: isRunningMovingAwayAnimation, reason: from getter */
    public final boolean getIsRunningMovingAwayAnimation() {
        return this.isRunningMovingAwayAnimation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPlacementAnimationInProgress(boolean z) {
        this.isPlacementAnimationInProgress.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isPlacementAnimationInProgress() {
        return ((java.lang.Boolean) this.isPlacementAnimationInProgress.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAppearanceAnimationInProgress(boolean z) {
        this.isAppearanceAnimationInProgress.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isAppearanceAnimationInProgress() {
        return ((java.lang.Boolean) this.isAppearanceAnimationInProgress.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDisappearanceAnimationInProgress(boolean z) {
        this.isDisappearanceAnimationInProgress.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDisappearanceAnimationInProgress() {
        return ((java.lang.Boolean) this.isDisappearanceAnimationInProgress.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDisappearanceAnimationFinished(boolean z) {
        this.isDisappearanceAnimationFinished.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDisappearanceAnimationFinished() {
        return ((java.lang.Boolean) this.isDisappearanceAnimationFinished.getValue()).booleanValue();
    }

    /* renamed from: getRawOffset-nOcc-ac, reason: not valid java name and from getter */
    public final long getRawOffset() {
        return this.rawOffset;
    }

    /* renamed from: setRawOffset--gyyYBs, reason: not valid java name */
    public final void m1851setRawOffsetgyyYBs(long j) {
        this.rawOffset = j;
    }

    /* renamed from: getFinalOffset-nOcc-ac, reason: not valid java name and from getter */
    public final long getFinalOffset() {
        return this.finalOffset;
    }

    /* renamed from: setFinalOffset--gyyYBs, reason: not valid java name */
    public final void m1849setFinalOffsetgyyYBs(long j) {
        this.finalOffset = j;
    }

    public final androidx.compose.ui.graphics.layer.GraphicsLayer getLayer() {
        return this.layer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setPlacementDelta--gyyYBs, reason: not valid java name */
    public final void m1843setPlacementDeltagyyYBs(long j) {
        this.placementDelta.setValue(androidx.compose.ui.unit.IntOffset.m8720boximpl(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getPlacementDelta-nOcc-ac, reason: not valid java name */
    public final long m1847getPlacementDeltanOccac() {
        return ((androidx.compose.ui.unit.IntOffset) this.placementDelta.getValue()).m8738unboximpl();
    }

    public final void cancelPlacementAnimation() {
        if (isPlacementAnimationInProgress()) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighResolutionOutputSizeshNQ4ISI, null, null, new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$cancelPlacementAnimation$1(this, null), 3, null);
        }
    }

    /* renamed from: getLookaheadOffset-nOcc-ac, reason: not valid java name and from getter */
    public final long getLookaheadOffset() {
        return this.lookaheadOffset;
    }

    /* renamed from: setLookaheadOffset--gyyYBs, reason: not valid java name */
    public final void m1850setLookaheadOffsetgyyYBs(long j) {
        this.lookaheadOffset = j;
    }

    /* renamed from: animatePlacementDelta-ar5cAso, reason: not valid java name */
    public final void m1844animatePlacementDeltaar5cAso(long delta, boolean isMovingAway) {
        androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> finiteAnimationSpec = this.placementSpec;
        if (finiteAnimationSpec == null) {
            return;
        }
        long m8732minusqkQi6aY = androidx.compose.ui.unit.IntOffset.m8732minusqkQi6aY(m1847getPlacementDeltanOccac(), delta);
        m1843setPlacementDeltagyyYBs(m8732minusqkQi6aY);
        setPlacementAnimationInProgress(true);
        this.isRunningMovingAwayAnimation = isMovingAway;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighResolutionOutputSizeshNQ4ISI, null, null, new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1(this, finiteAnimationSpec, m8732minusqkQi6aY, null), 3, null);
    }

    public final void animateAppearance() {
        androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer = this.layer;
        androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec = this.fadeInSpec;
        if (isAppearanceAnimationInProgress() || finiteAnimationSpec == null || graphicsLayer == null) {
            if (isDisappearanceAnimationInProgress()) {
                if (graphicsLayer != null) {
                    graphicsLayer.setAlpha(1.0f);
                }
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighResolutionOutputSizeshNQ4ISI, null, null, new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$1(this, null), 3, null);
                return;
            }
            return;
        }
        setAppearanceAnimationInProgress(true);
        boolean isDisappearanceAnimationInProgress = isDisappearanceAnimationInProgress();
        if (!isDisappearanceAnimationInProgress) {
            graphicsLayer.setAlpha(0.0f);
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighResolutionOutputSizeshNQ4ISI, null, null, new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2(!isDisappearanceAnimationInProgress, this, finiteAnimationSpec, graphicsLayer, null), 3, null);
    }

    public final void animateDisappearance() {
        androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer = this.layer;
        androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec = this.fadeOutSpec;
        if (graphicsLayer == null || isDisappearanceAnimationInProgress() || finiteAnimationSpec == null) {
            return;
        }
        setDisappearanceAnimationInProgress(true);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighResolutionOutputSizeshNQ4ISI, null, null, new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateDisappearance$1(this, finiteAnimationSpec, graphicsLayer, null), 3, null);
    }

    public final void release() {
        androidx.compose.ui.graphics.GraphicsContext graphicsContext;
        if (isPlacementAnimationInProgress()) {
            setPlacementAnimationInProgress(false);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighResolutionOutputSizeshNQ4ISI, null, null, new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$1(this, null), 3, null);
        }
        if (isAppearanceAnimationInProgress()) {
            setAppearanceAnimationInProgress(false);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighResolutionOutputSizeshNQ4ISI, null, null, new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$2(this, null), 3, null);
        }
        if (isDisappearanceAnimationInProgress()) {
            setDisappearanceAnimationInProgress(false);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighResolutionOutputSizeshNQ4ISI, null, null, new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$3(this, null), 3, null);
        }
        this.isRunningMovingAwayAnimation = false;
        m1843setPlacementDeltagyyYBs(androidx.compose.ui.unit.IntOffset.INSTANCE.m8740getZeronOccac());
        this.rawOffset = NotInitialized;
        androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer = this.layer;
        if (graphicsLayer != null && (graphicsContext = this.Camera2StreamConfigurationMap) != null) {
            graphicsContext.releaseGraphicsLayer(graphicsLayer);
        }
        this.layer = null;
        this.fadeInSpec = null;
        this.fadeOutSpec = null;
        this.placementSpec = null;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/unit/IntOffset;", "NotInitialized", "J", "getNotInitialized-nOcc-ac", "()J"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getNotInitialized-nOcc-ac, reason: not valid java name */
        public final long m1852getNotInitializednOccac() {
            return androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.NotInitialized;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
