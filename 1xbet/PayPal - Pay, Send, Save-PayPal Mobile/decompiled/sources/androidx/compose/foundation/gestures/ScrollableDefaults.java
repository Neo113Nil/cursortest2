package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableDefaults;", "", "<init>", "()V", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/FlingBehavior;", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/OverscrollEffect;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "reverseScrolling", "reverseDirection", "(Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/foundation/gestures/Orientation;Z)Z", "NoOpOverscrollEffect"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScrollableDefaults {
    public static final int $stable = 0;
    public static final androidx.compose.foundation.gestures.ScrollableDefaults INSTANCE = new androidx.compose.foundation.gestures.ScrollableDefaults();

    private ScrollableDefaults() {
    }

    public final androidx.compose.foundation.gestures.FlingBehavior flingBehavior(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1107739818, i, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.flingBehavior (Scrollable.kt:591)");
        }
        androidx.compose.foundation.gestures.FlingBehavior rememberPlatformDefaultFlingBehavior = androidx.compose.foundation.gestures.Scrollable_androidKt.rememberPlatformDefaultFlingBehavior(composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return rememberPlatformDefaultFlingBehavior;
    }

    @kotlin.Deprecated(message = "This API has been replaced with rememberOverscrollEffect, which queries theme provided OverscrollFactory values instead of the 'platform default' without customization.", replaceWith = @kotlin.ReplaceWith(expression = "rememberOverscrollEffect()", imports = {"androidx.compose.foundation.rememberOverscrollEffect"}))
    public final androidx.compose.foundation.OverscrollEffect overscrollEffect(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1809802212, i, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.overscrollEffect (Scrollable.kt:608)");
        }
        androidx.compose.foundation.gestures.ScrollableDefaults.NoOpOverscrollEffect rememberPlatformOverscrollEffect = androidx.compose.foundation.AndroidOverscroll_androidKt.rememberPlatformOverscrollEffect(composer, 0);
        if (rememberPlatformOverscrollEffect == null) {
            rememberPlatformOverscrollEffect = androidx.compose.foundation.gestures.ScrollableDefaults.NoOpOverscrollEffect.INSTANCE;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return rememberPlatformOverscrollEffect;
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ<\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\r2\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableDefaults$NoOpOverscrollEffect;", "Landroidx/compose/foundation/OverscrollEffect;", "<init>", "()V", "Landroidx/compose/ui/geometry/Offset;", "p0", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "p1", "Lkotlin/Function1;", "p2", "applyToScroll-Rhakbz0", "(JILkotlin/jvm/functions/Function1;)J", "applyToScroll", "Landroidx/compose/ui/unit/Velocity;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "applyToFling-BMRW4eQ", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applyToFling", "", "isInProgress", "()Z", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/node/DelegatableNode;", "getNode", "()Landroidx/compose/ui/node/DelegatableNode;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class NoOpOverscrollEffect implements androidx.compose.foundation.OverscrollEffect {
        public static final androidx.compose.foundation.gestures.ScrollableDefaults.NoOpOverscrollEffect INSTANCE = new androidx.compose.foundation.gestures.ScrollableDefaults.NoOpOverscrollEffect();

        @Override // androidx.compose.foundation.OverscrollEffect
        public final boolean isInProgress() {
            return false;
        }

        private NoOpOverscrollEffect() {
        }

        @Override // androidx.compose.foundation.OverscrollEffect
        /* renamed from: applyToScroll-Rhakbz0 */
        public final long mo1266applyToScrollRhakbz0(long p0, int p1, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, androidx.compose.ui.geometry.Offset> p2) {
            return p2.invoke(androidx.compose.ui.geometry.Offset.m5741boximpl(p0)).m5762unboximpl();
        }

        @Override // androidx.compose.foundation.OverscrollEffect
        /* renamed from: applyToFling-BMRW4eQ */
        public final java.lang.Object mo1265applyToFlingBMRW4eQ(long j, kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Velocity, ? super kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            java.lang.Object invoke = function2.invoke(androidx.compose.ui.unit.Velocity.m8830boximpl(j), continuation);
            return invoke == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invoke : kotlin.Unit.INSTANCE;
        }

        @Override // androidx.compose.foundation.OverscrollEffect
        public final androidx.compose.ui.node.DelegatableNode getNode() {
            return new androidx.compose.ui.Modifier.Node() { // from class: androidx.compose.foundation.gestures.ScrollableDefaults$NoOpOverscrollEffect$node$1
            };
        }
    }

    public final boolean reverseDirection(androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.foundation.gestures.Orientation orientation, boolean reverseScrolling) {
        return (layoutDirection != androidx.compose.ui.unit.LayoutDirection.Rtl || orientation == androidx.compose.foundation.gestures.Orientation.Vertical) ? !reverseScrolling : reverseScrolling;
    }
}
