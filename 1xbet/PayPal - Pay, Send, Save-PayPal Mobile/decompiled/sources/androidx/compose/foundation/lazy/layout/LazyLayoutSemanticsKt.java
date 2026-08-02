package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\u001aA\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "itemProviderLambda", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "userScrollEnabled", "reverseScrolling", "lazyLayoutSemantics", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "", "estimatedLazyScrollOffset", "(II)F", "canScrollForward", "estimatedLazyMaxScrollOffset", "(IIZ)F"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyLayoutSemanticsKt {
    public static final float estimatedLazyScrollOffset(int i, int i2) {
        return i2 + (i * 500);
    }

    public static final androidx.compose.ui.Modifier lazyLayoutSemantics(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0<? extends androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider> function0, androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState lazyLayoutSemanticState, androidx.compose.foundation.gestures.Orientation orientation, boolean z, boolean z2, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1070136913, i, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutSemantics (LazyLayoutSemantics.kt:48)");
        }
        androidx.compose.ui.Modifier then = modifier.then(new androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifier(function0, lazyLayoutSemanticState, orientation, z, z2));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return then;
    }

    public static final float estimatedLazyMaxScrollOffset(int i, int i2, boolean z) {
        if (z) {
            return estimatedLazyScrollOffset(i, i2) + 100.0f;
        }
        return estimatedLazyScrollOffset(i, i2);
    }
}
