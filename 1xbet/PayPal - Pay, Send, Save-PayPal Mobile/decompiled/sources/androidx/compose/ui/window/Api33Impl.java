package androidx.compose.ui.window;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u000e\u0010\r"}, d2 = {"Landroidx/compose/ui/window/Api33Impl;", "", "<init>", "()V", "Lkotlin/Function0;", "", "p0", "Landroid/window/OnBackInvokedCallback;", "bc_", "(Lkotlin/jvm/functions/Function0;)Landroid/window/OnBackInvokedCallback;", "Landroid/view/View;", "p1", "getHighSpeedVideoFpsRanges", "(Landroid/view/View;Ljava/lang/Object;)V", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class Api33Impl {
    public static final androidx.compose.ui.window.Api33Impl INSTANCE = new androidx.compose.ui.window.Api33Impl();

    private Api33Impl() {
    }

    @kotlin.jvm.JvmStatic
    public static final android.window.OnBackInvokedCallback bc_(final kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
        return new android.window.OnBackInvokedCallback() { // from class: androidx.compose.ui.window.Api33Impl$$ExternalSyntheticLambda0
            @Override // android.window.OnBackInvokedCallback
            public final void onBackInvoked() {
                androidx.compose.ui.window.Api33Impl.getHighSpeedVideoSizes(kotlin.jvm.functions.Function0.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoSizes(kotlin.jvm.functions.Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void getHighSpeedVideoFpsRanges(android.view.View p0, java.lang.Object p1) {
        android.window.OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (!(p1 instanceof android.window.OnBackInvokedCallback) || (findOnBackInvokedDispatcher = p0.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, (android.window.OnBackInvokedCallback) p1);
    }

    @kotlin.jvm.JvmStatic
    public static final void getHighSpeedVideoFpsRangesFor(android.view.View p0, java.lang.Object p1) {
        android.window.OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (!(p1 instanceof android.window.OnBackInvokedCallback) || (findOnBackInvokedDispatcher = p0.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback((android.window.OnBackInvokedCallback) p1);
    }
}
