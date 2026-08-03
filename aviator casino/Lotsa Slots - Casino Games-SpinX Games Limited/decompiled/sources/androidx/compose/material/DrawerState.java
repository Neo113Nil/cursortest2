package androidx.compose.material;

/* compiled from: Drawer.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J'\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00032\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00110 H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010!J\u0011\u0010\"\u001a\u00020\u001eH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010#J\u0011\u0010$\u001a\u00020\u001eH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010#J\u0019\u0010%\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u0003H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010&R\u0011\u0010\b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0011\u0010\u000e\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u00038GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Landroidx/compose/material/DrawerState;", "", "initialValue", "Landroidx/compose/material/DrawerValue;", "confirmStateChange", "Lkotlin/Function1;", "", "(Landroidx/compose/material/DrawerValue;Lkotlin/jvm/functions/Function1;)V", "currentValue", "getCurrentValue", "()Landroidx/compose/material/DrawerValue;", "isAnimationRunning", "()Z", "isClosed", "isOpen", "offset", "Landroidx/compose/runtime/State;", "", "getOffset$annotations", "()V", "getOffset", "()Landroidx/compose/runtime/State;", "swipeableState", "Landroidx/compose/material/SwipeableState;", "getSwipeableState$material_release", "()Landroidx/compose/material/SwipeableState;", "targetValue", "getTargetValue$annotations", "getTargetValue", "animateTo", "", "anim", "Landroidx/compose/animation/core/AnimationSpec;", "(Landroidx/compose/material/DrawerValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "open", "snapTo", "(Landroidx/compose/material/DrawerValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DrawerState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.material.DrawerState.Companion INSTANCE = new androidx.compose.material.DrawerState.Companion(null);
    private final androidx.compose.material.SwipeableState<androidx.compose.material.DrawerValue> swipeableState;

    @androidx.compose.material.ExperimentalMaterialApi
    public static /* synthetic */ void getOffset$annotations() {
    }

    @androidx.compose.material.ExperimentalMaterialApi
    public static /* synthetic */ void getTargetValue$annotations() {
    }

    public DrawerState(androidx.compose.material.DrawerValue initialValue, kotlin.jvm.functions.Function1<? super androidx.compose.material.DrawerValue, java.lang.Boolean> confirmStateChange) {
        androidx.compose.animation.core.TweenSpec tweenSpec;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        tweenSpec = androidx.compose.material.DrawerKt.AnimationSpec;
        this.swipeableState = new androidx.compose.material.SwipeableState<>(initialValue, tweenSpec, confirmStateChange);
    }

    public /* synthetic */ DrawerState(androidx.compose.material.DrawerValue drawerValue, androidx.compose.material.DrawerState.AnonymousClass1 anonymousClass1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(drawerValue, (i & 2) != 0 ? new kotlin.jvm.functions.Function1<androidx.compose.material.DrawerValue, java.lang.Boolean>() { // from class: androidx.compose.material.DrawerState.1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Boolean invoke(androidx.compose.material.DrawerValue it) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                return true;
            }
        } : anonymousClass1);
    }

    public final androidx.compose.material.SwipeableState<androidx.compose.material.DrawerValue> getSwipeableState$material_release() {
        return this.swipeableState;
    }

    public final boolean isOpen() {
        return getCurrentValue() == androidx.compose.material.DrawerValue.Open;
    }

    public final boolean isClosed() {
        return getCurrentValue() == androidx.compose.material.DrawerValue.Closed;
    }

    public final androidx.compose.material.DrawerValue getCurrentValue() {
        return this.swipeableState.getCurrentValue();
    }

    public final boolean isAnimationRunning() {
        return this.swipeableState.isAnimationRunning();
    }

    public final java.lang.Object open(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.animation.core.TweenSpec tweenSpec;
        androidx.compose.material.DrawerValue drawerValue = androidx.compose.material.DrawerValue.Open;
        tweenSpec = androidx.compose.material.DrawerKt.AnimationSpec;
        java.lang.Object animateTo = animateTo(drawerValue, tweenSpec, continuation);
        return animateTo == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object close(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.animation.core.TweenSpec tweenSpec;
        androidx.compose.material.DrawerValue drawerValue = androidx.compose.material.DrawerValue.Closed;
        tweenSpec = androidx.compose.material.DrawerKt.AnimationSpec;
        java.lang.Object animateTo = animateTo(drawerValue, tweenSpec, continuation);
        return animateTo == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo : kotlin.Unit.INSTANCE;
    }

    @androidx.compose.material.ExperimentalMaterialApi
    public final java.lang.Object animateTo(androidx.compose.material.DrawerValue drawerValue, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object animateTo = this.swipeableState.animateTo(drawerValue, animationSpec, continuation);
        return animateTo == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo : kotlin.Unit.INSTANCE;
    }

    @androidx.compose.material.ExperimentalMaterialApi
    public final java.lang.Object snapTo(androidx.compose.material.DrawerValue drawerValue, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object snapTo = this.swipeableState.snapTo(drawerValue, continuation);
        return snapTo == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? snapTo : kotlin.Unit.INSTANCE;
    }

    @androidx.compose.material.ExperimentalMaterialApi
    public final androidx.compose.material.DrawerValue getTargetValue() {
        return this.swipeableState.getTargetValue();
    }

    @androidx.compose.material.ExperimentalMaterialApi
    public final androidx.compose.runtime.State<java.lang.Float> getOffset() {
        return this.swipeableState.getOffset();
    }

    /* compiled from: Drawer.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¨\u0006\n"}, d2 = {"Landroidx/compose/material/DrawerState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/DrawerState;", "Landroidx/compose/material/DrawerValue;", "confirmStateChange", "Lkotlin/Function1;", "", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final androidx.compose.runtime.saveable.Saver<androidx.compose.material.DrawerState, androidx.compose.material.DrawerValue> Saver(final kotlin.jvm.functions.Function1<? super androidx.compose.material.DrawerValue, java.lang.Boolean> confirmStateChange) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
            return androidx.compose.runtime.saveable.SaverKt.Saver(new kotlin.jvm.functions.Function2<androidx.compose.runtime.saveable.SaverScope, androidx.compose.material.DrawerState, androidx.compose.material.DrawerValue>() { // from class: androidx.compose.material.DrawerState$Companion$Saver$1
                @Override // kotlin.jvm.functions.Function2
                public final androidx.compose.material.DrawerValue invoke(androidx.compose.runtime.saveable.SaverScope Saver, androidx.compose.material.DrawerState it) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                    return it.getCurrentValue();
                }
            }, new kotlin.jvm.functions.Function1<androidx.compose.material.DrawerValue, androidx.compose.material.DrawerState>() { // from class: androidx.compose.material.DrawerState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final androidx.compose.material.DrawerState invoke(androidx.compose.material.DrawerValue it) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                    return new androidx.compose.material.DrawerState(it, confirmStateChange);
                }
            });
        }
    }
}
