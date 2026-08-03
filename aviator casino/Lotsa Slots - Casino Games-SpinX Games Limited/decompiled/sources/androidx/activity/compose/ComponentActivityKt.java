package androidx.activity.compose;

/* compiled from: ComponentActivity.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a.\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0002\b\t¢\u0006\u0002\u0010\n\u001a\f\u0010\u000b\u001a\u00020\u0003*\u00020\u0004H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"DefaultActivityContentLayoutParams", "Landroid/view/ViewGroup$LayoutParams;", "setContent", "", "Landroidx/activity/ComponentActivity;", "parent", "Landroidx/compose/runtime/CompositionContext;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/activity/ComponentActivity;Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)V", "setOwners", "activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComponentActivityKt {
    private static final android.view.ViewGroup.LayoutParams DefaultActivityContentLayoutParams = new android.view.ViewGroup.LayoutParams(-2, -2);

    public static /* synthetic */ void setContent$default(androidx.activity.ComponentActivity componentActivity, androidx.compose.runtime.CompositionContext compositionContext, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            compositionContext = null;
        }
        setContent(componentActivity, compositionContext, function2);
    }

    public static final void setContent(androidx.activity.ComponentActivity componentActivity, androidx.compose.runtime.CompositionContext compositionContext, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        android.view.View childAt = ((android.view.ViewGroup) componentActivity.getWindow().getDecorView().findViewById(android.R.id.content)).getChildAt(0);
        androidx.compose.ui.platform.ComposeView composeView = childAt instanceof androidx.compose.ui.platform.ComposeView ? (androidx.compose.ui.platform.ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(compositionContext);
            composeView.setContent(content);
            return;
        }
        androidx.compose.ui.platform.ComposeView composeView2 = new androidx.compose.ui.platform.ComposeView(componentActivity, null, 0, 6, null);
        composeView2.setParentCompositionContext(compositionContext);
        composeView2.setContent(content);
        setOwners(componentActivity);
        componentActivity.setContentView(composeView2, DefaultActivityContentLayoutParams);
    }

    private static final void setOwners(androidx.activity.ComponentActivity componentActivity) {
        android.view.View decorView = componentActivity.getWindow().getDecorView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        if (androidx.lifecycle.ViewTreeLifecycleOwner.get(decorView) == null) {
            androidx.lifecycle.ViewTreeLifecycleOwner.set(decorView, componentActivity);
        }
        if (androidx.lifecycle.ViewTreeViewModelStoreOwner.get(decorView) == null) {
            androidx.lifecycle.ViewTreeViewModelStoreOwner.set(decorView, componentActivity);
        }
        if (androidx.savedstate.ViewTreeSavedStateRegistryOwner.get(decorView) == null) {
            androidx.savedstate.ViewTreeSavedStateRegistryOwner.set(decorView, componentActivity);
        }
    }
}
