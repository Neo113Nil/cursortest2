package androidx.compose.ui.platform;

/* compiled from: Wrapper.android.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u001a0\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000fH\u0002¢\u0006\u0002\u0010\u0010\u001a,\u0010\u0011\u001a\u00020\t*\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000fH\u0000¢\u0006\u0002\u0010\u0013\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"DefaultLayoutParams", "Landroid/view/ViewGroup$LayoutParams;", "createSubcomposition", "Landroidx/compose/runtime/ReusableComposition;", "container", "Landroidx/compose/ui/node/LayoutNode;", "parent", "Landroidx/compose/runtime/CompositionContext;", "doSetContent", "Landroidx/compose/runtime/Composition;", "owner", "Landroidx/compose/ui/platform/AndroidComposeView;", "content", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/Composition;", "setContent", "Landroidx/compose/ui/platform/AbstractComposeView;", "(Landroidx/compose/ui/platform/AbstractComposeView;Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/Composition;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Wrapper_androidKt {
    private static final android.view.ViewGroup.LayoutParams DefaultLayoutParams = new android.view.ViewGroup.LayoutParams(-2, -2);

    public static final androidx.compose.runtime.ReusableComposition createSubcomposition(androidx.compose.ui.node.LayoutNode layoutNode, androidx.compose.runtime.CompositionContext compositionContext) {
        return androidx.compose.runtime.CompositionKt.ReusableComposition(new androidx.compose.ui.node.UiApplier(layoutNode), compositionContext);
    }

    public static final androidx.compose.runtime.Composition setContent(androidx.compose.ui.platform.AbstractComposeView abstractComposeView, androidx.compose.runtime.CompositionContext compositionContext, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2) {
        androidx.compose.ui.platform.GlobalSnapshotManager.INSTANCE.ensureStarted();
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = null;
        if (abstractComposeView.getChildCount() > 0) {
            android.view.View childAt = abstractComposeView.getChildAt(0);
            if (childAt instanceof androidx.compose.ui.platform.AndroidComposeView) {
                androidComposeView = (androidx.compose.ui.platform.AndroidComposeView) childAt;
            }
        } else {
            abstractComposeView.removeAllViews();
        }
        if (androidComposeView == null) {
            androidComposeView = new androidx.compose.ui.platform.AndroidComposeView(abstractComposeView.getContext(), compositionContext.getEffectCoroutineContext());
            abstractComposeView.addView(androidComposeView.getView(), DefaultLayoutParams);
        }
        return doSetContent(androidComposeView, compositionContext, function2);
    }

    private static final androidx.compose.runtime.Composition doSetContent(androidx.compose.ui.platform.AndroidComposeView androidComposeView, androidx.compose.runtime.CompositionContext compositionContext, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2) {
        if (androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() && androidComposeView.getTag(androidx.compose.ui.R.id.inspection_slot_table_set) == null) {
            androidComposeView.setTag(androidx.compose.ui.R.id.inspection_slot_table_set, java.util.Collections.newSetFromMap(new java.util.WeakHashMap()));
        }
        androidx.compose.runtime.Composition Composition = androidx.compose.runtime.CompositionKt.Composition(new androidx.compose.ui.node.UiApplier(androidComposeView.getRoot()), compositionContext);
        java.lang.Object tag = androidComposeView.getView().getTag(androidx.compose.ui.R.id.wrapped_composition_tag);
        androidx.compose.ui.platform.WrappedComposition wrappedComposition = tag instanceof androidx.compose.ui.platform.WrappedComposition ? (androidx.compose.ui.platform.WrappedComposition) tag : null;
        if (wrappedComposition == null) {
            wrappedComposition = new androidx.compose.ui.platform.WrappedComposition(androidComposeView, Composition);
            androidComposeView.getView().setTag(androidx.compose.ui.R.id.wrapped_composition_tag, wrappedComposition);
        }
        wrappedComposition.setContent(function2);
        return wrappedComposition;
    }
}
