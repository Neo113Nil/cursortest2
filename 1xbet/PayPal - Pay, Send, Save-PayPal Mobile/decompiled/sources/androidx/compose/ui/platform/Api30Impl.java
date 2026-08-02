package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/platform/Api30Impl;", "", "<init>", "()V", "Landroid/view/View;", "p0", "", "getHighResolutionOutputSizeshNQ4ISI", "(Landroid/view/View;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class Api30Impl {
    public static final androidx.compose.ui.platform.Api30Impl INSTANCE = new androidx.compose.ui.platform.Api30Impl();

    private Api30Impl() {
    }

    public final boolean getHighResolutionOutputSizeshNQ4ISI(android.view.View p0) {
        return p0.isShowingLayoutBounds();
    }
}
