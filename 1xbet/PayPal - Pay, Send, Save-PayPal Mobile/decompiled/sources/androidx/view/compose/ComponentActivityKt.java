package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a0\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/activity/ComponentActivity;", "Landroidx/compose/runtime/CompositionContext;", "parent", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "setContent", "(Landroidx/activity/ComponentActivity;Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)V", "Landroid/view/ViewGroup$LayoutParams;", "getHighSpeedVideoFpsRanges", "Landroid/view/ViewGroup$LayoutParams;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ComponentActivityKt {
    private static final android.view.ViewGroup.LayoutParams getHighSpeedVideoFpsRanges = new android.view.ViewGroup.LayoutParams(-2, -2);

    public static /* synthetic */ void setContent$default(androidx.view.ComponentActivity componentActivity, androidx.compose.runtime.CompositionContext compositionContext, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            compositionContext = null;
        }
        setContent(componentActivity, compositionContext, function2);
    }

    public static final void setContent(androidx.view.ComponentActivity componentActivity, androidx.compose.runtime.CompositionContext compositionContext, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2) {
        android.view.View childAt = ((android.view.ViewGroup) componentActivity.getWindow().getDecorView().findViewById(android.R.id.content)).getChildAt(0);
        androidx.compose.ui.platform.ComposeView composeView = childAt instanceof androidx.compose.ui.platform.ComposeView ? (androidx.compose.ui.platform.ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(compositionContext);
            composeView.setContent(function2);
            return;
        }
        androidx.compose.ui.platform.ComposeView composeView2 = new androidx.compose.ui.platform.ComposeView(componentActivity, null, 0, 6, null);
        composeView2.setParentCompositionContext(compositionContext);
        composeView2.setContent(function2);
        android.view.View decorView = componentActivity.getWindow().getDecorView();
        if (androidx.view.C0276ViewTreeLifecycleOwner.get(decorView) == null) {
            androidx.view.C0276ViewTreeLifecycleOwner.set(decorView, componentActivity);
        }
        if (androidx.view.C0278ViewTreeViewModelStoreOwner.get(decorView) == null) {
            androidx.view.C0278ViewTreeViewModelStoreOwner.set(decorView, componentActivity);
        }
        if (androidx.view.C0291ViewTreeSavedStateRegistryOwner.get(decorView) == null) {
            androidx.view.C0291ViewTreeSavedStateRegistryOwner.set(decorView, componentActivity);
        }
        componentActivity.setContentView(composeView2, getHighSpeedVideoFpsRanges);
    }
}
