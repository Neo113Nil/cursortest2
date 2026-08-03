package androidx.compose.foundation.lazy.layout;

/* compiled from: LazyLayoutAnimation.kt */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 C2\u00020\u0001:\u0001CB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010=\u001a\u00020\u001cJ\u0018\u0010>\u001a\u00020\u001c2\u0006\u0010?\u001a\u00020!ø\u0001\u0000¢\u0006\u0004\b@\u0010%J\u0006\u0010A\u001a\u00020\u001cJ\u0006\u0010B\u001a\u00020\u001cR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R+\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\"\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a¢\u0006\u0002\b\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\"\u0010 \u001a\u00020!X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R1\u0010'\u001a\u00020!2\u0006\u0010\u000e\u001a\u00020!8F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b*\u0010\u0015\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R\u001a\u0010+\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020-0,X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010.\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\t\"\u0004\b0\u0010\u000bR\"\u00101\u001a\u00020!X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b2\u0010#\"\u0004\b3\u0010%R+\u00104\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00078F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020<0,X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006D"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimation;", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "appearanceSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "getAppearanceSpec", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "setAppearanceSpec", "(Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "<set-?>", "", "isAppearanceAnimationInProgress", "()Z", "setAppearanceAnimationInProgress", "(Z)V", "isAppearanceAnimationInProgress$delegate", "Landroidx/compose/runtime/MutableState;", "isPlacementAnimationInProgress", "setPlacementAnimationInProgress", "isPlacementAnimationInProgress$delegate", "layerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "Lkotlin/ExtensionFunctionType;", "getLayerBlock", "()Lkotlin/jvm/functions/Function1;", "lookaheadOffset", "Landroidx/compose/ui/unit/IntOffset;", "getLookaheadOffset-nOcc-ac", "()J", "setLookaheadOffset--gyyYBs", "(J)V", "J", "placementDelta", "getPlacementDelta-nOcc-ac", "setPlacementDelta--gyyYBs", "placementDelta$delegate", "placementDeltaAnimation", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector2D;", "placementSpec", "getPlacementSpec", "setPlacementSpec", "rawOffset", "getRawOffset-nOcc-ac", "setRawOffset--gyyYBs", "visibility", "getVisibility", "()F", "setVisibility", "(F)V", "visibility$delegate", "Landroidx/compose/runtime/MutableFloatState;", "visibilityAnimation", "Landroidx/compose/animation/core/AnimationVector1D;", "animateAppearance", "animatePlacementDelta", "delta", "animatePlacementDelta--gyyYBs", "cancelPlacementAnimation", "stopAnimations", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyLayoutAnimation {
    private androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> appearanceSpec;
    private final kotlinx.coroutines.CoroutineScope coroutineScope;
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> layerBlock;
    private long lookaheadOffset;

    /* renamed from: placementDelta$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState placementDelta;
    private final androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> placementDeltaAnimation;
    private androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> placementSpec;
    private long rawOffset;

    /* renamed from: visibility$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableFloatState visibility;
    private final androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> visibilityAnimation;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.lazy.layout.LazyLayoutAnimation.Companion INSTANCE = new androidx.compose.foundation.lazy.layout.LazyLayoutAnimation.Companion(null);
    public static final int $stable = 8;
    private static final long NotInitialized = androidx.compose.ui.unit.IntOffsetKt.IntOffset(Integer.MAX_VALUE, Integer.MAX_VALUE);

    /* renamed from: isPlacementAnimationInProgress$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState isPlacementAnimationInProgress = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);

    /* renamed from: isAppearanceAnimationInProgress$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState isAppearanceAnimationInProgress = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);

    public LazyLayoutAnimation(kotlinx.coroutines.CoroutineScope coroutineScope) {
        this.coroutineScope = coroutineScope;
        long j = NotInitialized;
        this.rawOffset = j;
        this.placementDeltaAnimation = new androidx.compose.animation.core.Animatable<>(androidx.compose.ui.unit.IntOffset.m4601boximpl(androidx.compose.ui.unit.IntOffset.INSTANCE.m4620getZeronOccac()), androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.unit.IntOffset.INSTANCE), null, null, 12, null);
        this.visibilityAnimation = new androidx.compose.animation.core.Animatable<>(java.lang.Float.valueOf(1.0f), androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE), null, null, 12, null);
        this.placementDelta = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.unit.IntOffset.m4601boximpl(androidx.compose.ui.unit.IntOffset.INSTANCE.m4620getZeronOccac()), null, 2, null);
        this.visibility = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(1.0f);
        this.layerBlock = new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$layerBlock$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
                invoke2(graphicsLayerScope);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
                graphicsLayerScope.setAlpha(androidx.compose.foundation.lazy.layout.LazyLayoutAnimation.this.getVisibility());
            }
        };
        this.lookaheadOffset = j;
    }

    public final kotlinx.coroutines.CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    public final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> getAppearanceSpec() {
        return this.appearanceSpec;
    }

    public final void setAppearanceSpec(androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec) {
        this.appearanceSpec = finiteAnimationSpec;
    }

    public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> getPlacementSpec() {
        return this.placementSpec;
    }

    public final void setPlacementSpec(androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> finiteAnimationSpec) {
        this.placementSpec = finiteAnimationSpec;
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

    /* renamed from: getRawOffset-nOcc-ac, reason: not valid java name and from getter */
    public final long getRawOffset() {
        return this.rawOffset;
    }

    /* renamed from: setRawOffset--gyyYBs, reason: not valid java name */
    public final void m721setRawOffsetgyyYBs(long j) {
        this.rawOffset = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setPlacementDelta--gyyYBs, reason: not valid java name */
    public final void m715setPlacementDeltagyyYBs(long j) {
        this.placementDelta.setValue(androidx.compose.ui.unit.IntOffset.m4601boximpl(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getPlacementDelta-nOcc-ac, reason: not valid java name */
    public final long m718getPlacementDeltanOccac() {
        return ((androidx.compose.ui.unit.IntOffset) this.placementDelta.getValue()).getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setVisibility(float f) {
        this.visibility.setFloatValue(f);
    }

    public final float getVisibility() {
        return this.visibility.getFloatValue();
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> getLayerBlock() {
        return this.layerBlock;
    }

    public final void cancelPlacementAnimation() {
        if (isPlacementAnimationInProgress()) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$cancelPlacementAnimation$1(this, null), 3, null);
        }
    }

    /* renamed from: getLookaheadOffset-nOcc-ac, reason: not valid java name and from getter */
    public final long getLookaheadOffset() {
        return this.lookaheadOffset;
    }

    /* renamed from: setLookaheadOffset--gyyYBs, reason: not valid java name */
    public final void m720setLookaheadOffsetgyyYBs(long j) {
        this.lookaheadOffset = j;
    }

    /* renamed from: animatePlacementDelta--gyyYBs, reason: not valid java name */
    public final void m716animatePlacementDeltagyyYBs(long delta) {
        androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> finiteAnimationSpec = this.placementSpec;
        if (finiteAnimationSpec == null) {
            return;
        }
        long m718getPlacementDeltanOccac = m718getPlacementDeltanOccac();
        long IntOffset = androidx.compose.ui.unit.IntOffsetKt.IntOffset(androidx.compose.ui.unit.IntOffset.m4610getXimpl(m718getPlacementDeltanOccac) - androidx.compose.ui.unit.IntOffset.m4610getXimpl(delta), androidx.compose.ui.unit.IntOffset.m4611getYimpl(m718getPlacementDeltanOccac) - androidx.compose.ui.unit.IntOffset.m4611getYimpl(delta));
        m715setPlacementDeltagyyYBs(IntOffset);
        setPlacementAnimationInProgress(true);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$animatePlacementDelta$1(this, finiteAnimationSpec, IntOffset, null), 3, null);
    }

    public final void animateAppearance() {
        androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec = this.appearanceSpec;
        if (isAppearanceAnimationInProgress() || finiteAnimationSpec == null) {
            return;
        }
        setAppearanceAnimationInProgress(true);
        setVisibility(0.0f);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$animateAppearance$1(this, finiteAnimationSpec, null), 3, null);
    }

    public final void stopAnimations() {
        if (isPlacementAnimationInProgress()) {
            setPlacementAnimationInProgress(false);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$stopAnimations$1(this, null), 3, null);
        }
        if (isAppearanceAnimationInProgress()) {
            setAppearanceAnimationInProgress(false);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$stopAnimations$2(this, null), 3, null);
        }
        m715setPlacementDeltagyyYBs(androidx.compose.ui.unit.IntOffset.INSTANCE.m4620getZeronOccac());
        this.rawOffset = NotInitialized;
        setVisibility(1.0f);
    }

    /* compiled from: LazyLayoutAnimation.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimation$Companion;", "", "()V", "NotInitialized", "Landroidx/compose/ui/unit/IntOffset;", "getNotInitialized-nOcc-ac", "()J", "J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getNotInitialized-nOcc-ac, reason: not valid java name */
        public final long m722getNotInitializednOccac() {
            return androidx.compose.foundation.lazy.layout.LazyLayoutAnimation.NotInitialized;
        }
    }
}
