package androidx.compose.material;

/* compiled from: BottomSheetScaffold.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\u0011\u0010\u0014\u001a\u00020\u0015H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\u0011\u0010\u0017\u001a\u00020\u0015H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u000f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u0011X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Landroidx/compose/material/BottomSheetState;", "Landroidx/compose/material/SwipeableState;", "Landroidx/compose/material/BottomSheetValue;", "initialValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmStateChange", "Lkotlin/Function1;", "", "(Landroidx/compose/material/BottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)V", "hasExpandedState", "getHasExpandedState$material_release", "()Z", "isCollapsed", "isExpanded", "nestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getNestedScrollConnection$material_release", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "collapse", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@androidx.compose.material.ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class BottomSheetState extends androidx.compose.material.SwipeableState<androidx.compose.material.BottomSheetValue> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.material.BottomSheetState.Companion INSTANCE = new androidx.compose.material.BottomSheetState.Companion(null);
    private final androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection;

    public /* synthetic */ BottomSheetState(androidx.compose.material.BottomSheetValue bottomSheetValue, androidx.compose.animation.core.SpringSpec<java.lang.Float> springSpec, androidx.compose.material.BottomSheetState.AnonymousClass1 anonymousClass1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(bottomSheetValue, (i & 2) != 0 ? androidx.compose.material.SwipeableDefaults.INSTANCE.getAnimationSpec() : springSpec, (i & 4) != 0 ? new kotlin.jvm.functions.Function1<androidx.compose.material.BottomSheetValue, java.lang.Boolean>() { // from class: androidx.compose.material.BottomSheetState.1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Boolean invoke(androidx.compose.material.BottomSheetValue it) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                return true;
            }
        } : anonymousClass1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetState(androidx.compose.material.BottomSheetValue initialValue, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, kotlin.jvm.functions.Function1<? super androidx.compose.material.BottomSheetValue, java.lang.Boolean> confirmStateChange) {
        super(initialValue, animationSpec, confirmStateChange);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        this.nestedScrollConnection = androidx.compose.material.SwipeableKt.getPreUpPostDownNestedScrollConnection(this);
    }

    public final boolean isExpanded() {
        return getCurrentValue() == androidx.compose.material.BottomSheetValue.Expanded;
    }

    public final boolean isCollapsed() {
        return getCurrentValue() == androidx.compose.material.BottomSheetValue.Collapsed;
    }

    public final java.lang.Object expand(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object animateTo$default = androidx.compose.material.SwipeableState.animateTo$default(this, getHasExpandedState$material_release() ? androidx.compose.material.BottomSheetValue.Expanded : androidx.compose.material.BottomSheetValue.Collapsed, null, continuation, 2, null);
        return animateTo$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo$default : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object collapse(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object animateTo$default = androidx.compose.material.SwipeableState.animateTo$default(this, androidx.compose.material.BottomSheetValue.Collapsed, null, continuation, 2, null);
        return animateTo$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo$default : kotlin.Unit.INSTANCE;
    }

    /* compiled from: BottomSheetScaffold.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¨\u0006\r"}, d2 = {"Landroidx/compose/material/BottomSheetState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/BottomSheetState;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmStateChange", "Lkotlin/Function1;", "Landroidx/compose/material/BottomSheetValue;", "", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final androidx.compose.runtime.saveable.Saver<androidx.compose.material.BottomSheetState, ?> Saver(final androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, final kotlin.jvm.functions.Function1<? super androidx.compose.material.BottomSheetValue, java.lang.Boolean> confirmStateChange) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
            return androidx.compose.runtime.saveable.SaverKt.Saver(new kotlin.jvm.functions.Function2<androidx.compose.runtime.saveable.SaverScope, androidx.compose.material.BottomSheetState, androidx.compose.material.BottomSheetValue>() { // from class: androidx.compose.material.BottomSheetState$Companion$Saver$1
                @Override // kotlin.jvm.functions.Function2
                public final androidx.compose.material.BottomSheetValue invoke(androidx.compose.runtime.saveable.SaverScope Saver, androidx.compose.material.BottomSheetState it) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                    return it.getCurrentValue();
                }
            }, new kotlin.jvm.functions.Function1<androidx.compose.material.BottomSheetValue, androidx.compose.material.BottomSheetState>() { // from class: androidx.compose.material.BottomSheetState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final androidx.compose.material.BottomSheetState invoke(androidx.compose.material.BottomSheetValue it) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                    return new androidx.compose.material.BottomSheetState(it, animationSpec, confirmStateChange);
                }
            });
        }
    }

    /* renamed from: getNestedScrollConnection$material_release, reason: from getter */
    public final androidx.compose.ui.input.nestedscroll.NestedScrollConnection getNestedScrollConnection() {
        return this.nestedScrollConnection;
    }

    public final boolean getHasExpandedState$material_release() {
        return getAnchors$material_release().containsValue(androidx.compose.material.BottomSheetValue.Expanded);
    }
}
