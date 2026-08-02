package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 42\u00020\u0001:\u00014B9\b\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\t\u0010\nB-\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\t\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0013\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR/\u0010&\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e8G@GX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0011\u0010)\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010+\u001a\u00020*8G¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010/\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b-\u0010.R\u001b\u00103\u001a\u00020\u000b8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010."}, d2 = {"Landroidx/compose/material3/SearchBarState;", "", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "p0", "Landroidx/compose/animation/core/AnimationSpec;", "p1", "p2", "<init>", "(Landroidx/compose/animation/core/Animatable;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/AnimationSpec;)V", "Landroidx/compose/material3/SearchBarValue;", "initialValue", "animationSpecForExpand", "animationSpecForCollapse", "(Landroidx/compose/material3/SearchBarValue;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/AnimationSpec;)V", "", "animateToExpanded", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateToCollapsed", "fraction", "snapTo", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/animation/core/Animatable;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Landroidx/compose/animation/core/AnimationSpec;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/layout/LayoutCoordinates;", "<set-?>", "collapsedCoords$delegate", "Landroidx/compose/runtime/MutableState;", "getCollapsedCoords", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setCollapsedCoords", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "collapsedCoords", "getProgress", "()F", "progress", "", "isAnimating", "()Z", "getTargetValue", "()Landroidx/compose/material3/SearchBarValue;", "targetValue", "currentValue$delegate", "Landroidx/compose/runtime/State;", "getCurrentValue", "currentValue", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SearchBarState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.material3.SearchBarState.Companion INSTANCE = new androidx.compose.material3.SearchBarState.Companion(null);

    /* renamed from: collapsedCoords$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState collapsedCoords;

    /* renamed from: currentValue$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.State currentValue;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.animation.core.AnimationSpec<java.lang.Float> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.animation.core.AnimationSpec<java.lang.Float> Camera2StreamConfigurationMap;

    private SearchBarState(androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec2) {
        this.getHighResolutionOutputSizeshNQ4ISI = animatable;
        this.getHighSpeedVideoFpsRangesFor = animationSpec;
        this.Camera2StreamConfigurationMap = animationSpec2;
        this.collapsedCoords = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.currentValue = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.SearchBarState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.compose.material3.SearchBarState.$r8$lambda$ijZs2tfRazQ_T82rPG3vKJ20Cic(androidx.compose.material3.SearchBarState.this);
            }
        });
    }

    public SearchBarState(androidx.compose.material3.SearchBarValue searchBarValue, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec2) {
        this((androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>) androidx.compose.animation.core.AnimatableKt.Animatable$default(searchBarValue == androidx.compose.material3.SearchBarValue.Expanded ? 1.0f : 0.0f, 0.0f, 2, null), animationSpec, animationSpec2);
    }

    public final androidx.compose.ui.layout.LayoutCoordinates getCollapsedCoords() {
        return (androidx.compose.ui.layout.LayoutCoordinates) this.collapsedCoords.getValue();
    }

    public final void setCollapsedCoords(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        this.collapsedCoords.setValue(layoutCoordinates);
    }

    public final float getProgress() {
        return kotlin.ranges.RangesKt.coerceIn(this.getHighResolutionOutputSizeshNQ4ISI.getValue().floatValue(), 0.0f, 1.0f);
    }

    public final boolean isAnimating() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isRunning();
    }

    public final androidx.compose.material3.SearchBarValue getTargetValue() {
        if (this.getHighResolutionOutputSizeshNQ4ISI.getTargetValue().floatValue() == 1.0f) {
            return androidx.compose.material3.SearchBarValue.Expanded;
        }
        return androidx.compose.material3.SearchBarValue.Collapsed;
    }

    public final androidx.compose.material3.SearchBarValue getCurrentValue() {
        return (androidx.compose.material3.SearchBarValue) this.currentValue.getValue();
    }

    public final java.lang.Object animateToExpanded(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object animateTo$default = androidx.compose.animation.core.Animatable.animateTo$default(this.getHighResolutionOutputSizeshNQ4ISI, kotlin.coroutines.jvm.internal.Boxing.boxFloat(1.0f), this.getHighSpeedVideoFpsRangesFor, null, null, continuation, 12, null);
        return animateTo$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo$default : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object animateToCollapsed(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object animateTo$default = androidx.compose.animation.core.Animatable.animateTo$default(this.getHighResolutionOutputSizeshNQ4ISI, kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.0f), this.Camera2StreamConfigurationMap, null, null, continuation, 12, null);
        return animateTo$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo$default : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object snapTo(float f, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object snapTo = this.getHighResolutionOutputSizeshNQ4ISI.snapTo(kotlin.coroutines.jvm.internal.Boxing.boxFloat(f), continuation);
        return snapTo == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? snapTo : kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\n\u001a\f\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u00030\b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/material3/SearchBarState$Companion;", "", "<init>", "()V", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpecForExpand", "animationSpecForCollapse", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/SearchBarState;", "Saver", "(Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/AnimationSpec;)Landroidx/compose/runtime/saveable/Saver;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.runtime.saveable.Saver<androidx.compose.material3.SearchBarState, ?> Saver(final androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpecForExpand, final androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpecForCollapse) {
            return androidx.compose.runtime.saveable.ListSaverKt.listSaver(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.SearchBarState$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    java.util.List listOf;
                    listOf = kotlin.collections.CollectionsKt.listOf(java.lang.Float.valueOf(((androidx.compose.material3.SearchBarState) obj2).getProgress()));
                    return listOf;
                }
            }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.SearchBarState$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.compose.material3.SearchBarState.Companion.$r8$lambda$XC2Q6MKgXRvEdWozNgSJHu0iMyc(androidx.compose.animation.core.AnimationSpec.this, animationSpecForCollapse, (java.util.List) obj);
                }
            });
        }

        public static /* synthetic */ androidx.compose.material3.SearchBarState $r8$lambda$XC2Q6MKgXRvEdWozNgSJHu0iMyc(androidx.compose.animation.core.AnimationSpec animationSpec, androidx.compose.animation.core.AnimationSpec animationSpec2, java.util.List list) {
            return new androidx.compose.material3.SearchBarState(new androidx.compose.animation.core.Animatable(list.get(0), androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE), null, null, 12, null), animationSpec, animationSpec2, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ androidx.compose.material3.SearchBarValue $r8$lambda$ijZs2tfRazQ_T82rPG3vKJ20Cic(androidx.compose.material3.SearchBarState searchBarState) {
        if (searchBarState.getHighResolutionOutputSizeshNQ4ISI.getValue().floatValue() == 0.0f) {
            return androidx.compose.material3.SearchBarValue.Collapsed;
        }
        return androidx.compose.material3.SearchBarValue.Expanded;
    }

    public /* synthetic */ SearchBarState(androidx.compose.animation.core.Animatable animatable, androidx.compose.animation.core.AnimationSpec animationSpec, androidx.compose.animation.core.AnimationSpec animationSpec2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>) animatable, (androidx.compose.animation.core.AnimationSpec<java.lang.Float>) animationSpec, (androidx.compose.animation.core.AnimationSpec<java.lang.Float>) animationSpec2);
    }
}
