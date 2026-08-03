package androidx.compose.material;

/* compiled from: ModalBottomSheet.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB5\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nB;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\fJ\u0013\u0010\u0016\u001a\u00020\u0017H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u0017H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0019J\u0011\u0010\u001c\u001a\u00020\u0017H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0019J\u0011\u0010\u001d\u001a\u00020\u0017H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0019R\u0014\u0010\r\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0011\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u0013X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Landroidx/compose/material/ModalBottomSheetState;", "Landroidx/compose/material/SwipeableState;", "Landroidx/compose/material/ModalBottomSheetValue;", "initialValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmStateChange", "Lkotlin/Function1;", "", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)V", "isSkipHalfExpanded", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function1;)V", "hasHalfExpandedState", "getHasHalfExpandedState$material_release", "()Z", "isSkipHalfExpanded$material_release", com.ironsource.C3023e8.k, "nestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getNestedScrollConnection$material_release", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.e, "", "expand$material_release", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "halfExpand", "halfExpand$material_release", "hide", com.ironsource.C3232q2.v, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@androidx.compose.material.ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class ModalBottomSheetState extends androidx.compose.material.SwipeableState<androidx.compose.material.ModalBottomSheetValue> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.material.ModalBottomSheetState.Companion INSTANCE = new androidx.compose.material.ModalBottomSheetState.Companion(null);
    private final boolean isSkipHalfExpanded;
    private final androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection;

    public /* synthetic */ ModalBottomSheetState(androidx.compose.material.ModalBottomSheetValue modalBottomSheetValue, androidx.compose.animation.core.SpringSpec<java.lang.Float> springSpec, boolean z, androidx.compose.material.ModalBottomSheetState.AnonymousClass1 anonymousClass1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(modalBottomSheetValue, (i & 2) != 0 ? androidx.compose.material.SwipeableDefaults.INSTANCE.getAnimationSpec() : springSpec, z, (i & 8) != 0 ? new kotlin.jvm.functions.Function1<androidx.compose.material.ModalBottomSheetValue, java.lang.Boolean>() { // from class: androidx.compose.material.ModalBottomSheetState.1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Boolean invoke(androidx.compose.material.ModalBottomSheetValue it) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                return true;
            }
        } : anonymousClass1);
    }

    /* renamed from: isSkipHalfExpanded$material_release, reason: from getter */
    public final boolean getIsSkipHalfExpanded() {
        return this.isSkipHalfExpanded;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetState(androidx.compose.material.ModalBottomSheetValue initialValue, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, boolean z, kotlin.jvm.functions.Function1<? super androidx.compose.material.ModalBottomSheetValue, java.lang.Boolean> confirmStateChange) {
        super(initialValue, animationSpec, confirmStateChange);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        this.isSkipHalfExpanded = z;
        if (z && initialValue == androidx.compose.material.ModalBottomSheetValue.HalfExpanded) {
            throw new java.lang.IllegalArgumentException("The initial value must not be set to HalfExpanded if skipHalfExpanded is set to true.".toString());
        }
        this.nestedScrollConnection = androidx.compose.material.SwipeableKt.getPreUpPostDownNestedScrollConnection(this);
    }

    public final boolean isVisible() {
        return getCurrentValue() != androidx.compose.material.ModalBottomSheetValue.Hidden;
    }

    public final boolean getHasHalfExpandedState$material_release() {
        return getAnchors$material_release().values().contains(androidx.compose.material.ModalBottomSheetValue.HalfExpanded);
    }

    public /* synthetic */ ModalBottomSheetState(androidx.compose.material.ModalBottomSheetValue modalBottomSheetValue, androidx.compose.animation.core.SpringSpec<java.lang.Float> springSpec, androidx.compose.material.ModalBottomSheetState.AnonymousClass2 anonymousClass2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(modalBottomSheetValue, (i & 2) != 0 ? androidx.compose.material.SwipeableDefaults.INSTANCE.getAnimationSpec() : springSpec, (i & 4) != 0 ? new kotlin.jvm.functions.Function1<androidx.compose.material.ModalBottomSheetValue, java.lang.Boolean>() { // from class: androidx.compose.material.ModalBottomSheetState.2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Boolean invoke(androidx.compose.material.ModalBottomSheetValue it) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                return true;
            }
        } : anonymousClass2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetState(androidx.compose.material.ModalBottomSheetValue initialValue, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, kotlin.jvm.functions.Function1<? super androidx.compose.material.ModalBottomSheetValue, java.lang.Boolean> confirmStateChange) {
        this(initialValue, animationSpec, false, confirmStateChange);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
    }

    public final java.lang.Object show(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object animateTo$default = androidx.compose.material.SwipeableState.animateTo$default(this, getHasHalfExpandedState$material_release() ? androidx.compose.material.ModalBottomSheetValue.HalfExpanded : androidx.compose.material.ModalBottomSheetValue.Expanded, null, continuation, 2, null);
        return animateTo$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo$default : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object halfExpand$material_release(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (!getHasHalfExpandedState$material_release()) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object animateTo$default = androidx.compose.material.SwipeableState.animateTo$default(this, androidx.compose.material.ModalBottomSheetValue.HalfExpanded, null, continuation, 2, null);
        return animateTo$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo$default : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object expand$material_release(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object animateTo$default = androidx.compose.material.SwipeableState.animateTo$default(this, androidx.compose.material.ModalBottomSheetValue.Expanded, null, continuation, 2, null);
        return animateTo$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo$default : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object hide(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object animateTo$default = androidx.compose.material.SwipeableState.animateTo$default(this, androidx.compose.material.ModalBottomSheetValue.Hidden, null, continuation, 2, null);
        return animateTo$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo$default : kotlin.Unit.INSTANCE;
    }

    /* renamed from: getNestedScrollConnection$material_release, reason: from getter */
    public final androidx.compose.ui.input.nestedscroll.NestedScrollConnection getNestedScrollConnection() {
        return this.nestedScrollConnection;
    }

    /* compiled from: ModalBottomSheet.kt */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0007J:\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¨\u0006\u000e"}, d2 = {"Landroidx/compose/material/ModalBottomSheetState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/ModalBottomSheetState;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmStateChange", "Lkotlin/Function1;", "Landroidx/compose/material/ModalBottomSheetValue;", "", "skipHalfExpanded", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final androidx.compose.runtime.saveable.Saver<androidx.compose.material.ModalBottomSheetState, ?> Saver(final androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, final boolean skipHalfExpanded, final kotlin.jvm.functions.Function1<? super androidx.compose.material.ModalBottomSheetValue, java.lang.Boolean> confirmStateChange) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
            return androidx.compose.runtime.saveable.SaverKt.Saver(new kotlin.jvm.functions.Function2<androidx.compose.runtime.saveable.SaverScope, androidx.compose.material.ModalBottomSheetState, androidx.compose.material.ModalBottomSheetValue>() { // from class: androidx.compose.material.ModalBottomSheetState$Companion$Saver$1
                @Override // kotlin.jvm.functions.Function2
                public final androidx.compose.material.ModalBottomSheetValue invoke(androidx.compose.runtime.saveable.SaverScope Saver, androidx.compose.material.ModalBottomSheetState it) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                    return it.getCurrentValue();
                }
            }, new kotlin.jvm.functions.Function1<androidx.compose.material.ModalBottomSheetValue, androidx.compose.material.ModalBottomSheetState>() { // from class: androidx.compose.material.ModalBottomSheetState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final androidx.compose.material.ModalBottomSheetState invoke(androidx.compose.material.ModalBottomSheetValue it) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                    return new androidx.compose.material.ModalBottomSheetState(it, animationSpec, skipHalfExpanded, confirmStateChange);
                }
            });
        }

        @kotlin.Deprecated(message = "Please specify the skipHalfExpanded parameter", replaceWith = @kotlin.ReplaceWith(expression = "ModalBottomSheetState.Saver(animationSpec = animationSpec,skipHalfExpanded = ,confirmStateChange = confirmStateChange)", imports = {}))
        public final androidx.compose.runtime.saveable.Saver<androidx.compose.material.ModalBottomSheetState, ?> Saver(androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, kotlin.jvm.functions.Function1<? super androidx.compose.material.ModalBottomSheetValue, java.lang.Boolean> confirmStateChange) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
            return Saver(animationSpec, false, confirmStateChange);
        }
    }
}
