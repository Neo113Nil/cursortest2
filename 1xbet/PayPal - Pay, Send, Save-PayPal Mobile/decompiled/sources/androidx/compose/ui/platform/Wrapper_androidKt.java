package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a.\u0010\r\u001a\u00020\f*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a2\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00062\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "container", "Landroidx/compose/runtime/AbstractApplier;", "createApplier", "(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/runtime/AbstractApplier;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/runtime/CompositionContext;", "parent", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "Landroidx/compose/runtime/Composition;", "setContent", "(Landroidx/compose/ui/platform/AbstractComposeView;Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/Composition;", "Landroidx/compose/ui/platform/AndroidComposeView;", "p0", "p1", "p2", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/Composition;", "Landroid/view/ViewGroup$LayoutParams;", "getHighSpeedVideoFpsRangesFor", "Landroid/view/ViewGroup$LayoutParams;", "getHighSpeedVideoSizes"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Wrapper_androidKt {
    private static final android.view.ViewGroup.LayoutParams getHighSpeedVideoFpsRangesFor = new android.view.ViewGroup.LayoutParams(-2, -2);

    public static final androidx.compose.runtime.AbstractApplier<androidx.compose.ui.node.LayoutNode> createApplier(androidx.compose.ui.node.LayoutNode layoutNode) {
        return new androidx.compose.ui.node.UiApplier(layoutNode);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final androidx.compose.runtime.Composition setContent(androidx.compose.ui.platform.AbstractComposeView abstractComposeView, androidx.compose.runtime.CompositionContext compositionContext, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2) {
        androidx.compose.ui.platform.AndroidComposeView androidComposeView;
        androidx.compose.ui.platform.GlobalSnapshotManager.INSTANCE.ensureStarted();
        if (abstractComposeView.getChildCount() > 0) {
            android.view.View childAt = abstractComposeView.getChildAt(0);
            if (childAt instanceof androidx.compose.ui.platform.AndroidComposeView) {
                androidComposeView = (androidx.compose.ui.platform.AndroidComposeView) childAt;
                if (androidComposeView == null) {
                    androidComposeView = new androidx.compose.ui.platform.AndroidComposeView(abstractComposeView.getContext(), compositionContext.getEffectCoroutineContext());
                    abstractComposeView.addView(androidComposeView.getView(), getHighSpeedVideoFpsRangesFor);
                }
                return getHighSpeedVideoFpsRanges(androidComposeView, compositionContext, function2);
            }
        } else {
            abstractComposeView.removeAllViews();
        }
        androidComposeView = null;
        if (androidComposeView == null) {
        }
        return getHighSpeedVideoFpsRanges(androidComposeView, compositionContext, function2);
    }

    private static final androidx.compose.runtime.Composition getHighSpeedVideoFpsRanges(androidx.compose.ui.platform.AndroidComposeView androidComposeView, androidx.compose.runtime.CompositionContext compositionContext, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2) {
        if (androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() && androidComposeView.getTag(androidx.compose.ui.R.id.inspection_slot_table_set) == null) {
            androidComposeView.setTag(androidx.compose.ui.R.id.inspection_slot_table_set, java.util.Collections.newSetFromMap(new java.util.WeakHashMap()));
        }
        java.lang.Object tag = androidComposeView.getView().getTag(androidx.compose.ui.R.id.wrapped_composition_tag);
        androidx.compose.ui.platform.WrappedComposition wrappedComposition = tag instanceof androidx.compose.ui.platform.WrappedComposition ? (androidx.compose.ui.platform.WrappedComposition) tag : null;
        if (wrappedComposition == null) {
            wrappedComposition = new androidx.compose.ui.platform.WrappedComposition(androidComposeView, androidx.compose.runtime.CompositionKt.Composition(new androidx.compose.ui.node.UiApplier(androidComposeView.getRoot()), compositionContext));
            androidComposeView.getView().setTag(androidx.compose.ui.R.id.wrapped_composition_tag, wrappedComposition);
        }
        wrappedComposition.setContent(function2);
        if (!kotlin.jvm.internal.Intrinsics.areEqual(androidComposeView.getCoroutineContext(), compositionContext.getEffectCoroutineContext())) {
            androidComposeView.setCoroutineContext(compositionContext.getEffectCoroutineContext());
        }
        androidComposeView.setFrameEndScheduler$ui(new androidx.compose.ui.platform.Wrapper_androidKt$doSetContent$1(compositionContext));
        return wrappedComposition;
    }
}
