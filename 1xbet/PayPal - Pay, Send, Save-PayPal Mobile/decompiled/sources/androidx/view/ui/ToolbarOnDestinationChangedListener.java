package androidx.view.ui;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Landroidx/navigation/ui/ToolbarOnDestinationChangedListener;", "Landroidx/navigation/ui/AbstractAppBarOnDestinationChangedListener;", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroidx/navigation/ui/AppBarConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "<init>", "(Landroidx/appcompat/widget/Toolbar;Landroidx/navigation/ui/AppBarConfiguration;)V", "Landroidx/navigation/NavController;", "controller", "Landroidx/navigation/NavDestination;", "destination", "Landroid/os/Bundle;", "arguments", "", "onDestinationChanged", "(Landroidx/navigation/NavController;Landroidx/navigation/NavDestination;Landroid/os/Bundle;)V", "", "title", "setTitle", "(Ljava/lang/CharSequence;)V", "Landroid/graphics/drawable/Drawable;", "icon", "", "contentDescription", "setNavigationIcon", "(Landroid/graphics/drawable/Drawable;I)V", "Ljava/lang/ref/WeakReference;", "getHighSpeedVideoSizes", "Ljava/lang/ref/WeakReference;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ToolbarOnDestinationChangedListener extends androidx.view.ui.AbstractAppBarOnDestinationChangedListener {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.ref.WeakReference<androidx.appcompat.widget.Toolbar> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ToolbarOnDestinationChangedListener(androidx.appcompat.widget.Toolbar toolbar, androidx.view.ui.AppBarConfiguration appBarConfiguration) {
        super(r1, appBarConfiguration);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toolbar, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appBarConfiguration, "");
        android.content.Context context = toolbar.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "");
        this.getHighResolutionOutputSizeshNQ4ISI = new java.lang.ref.WeakReference<>(toolbar);
    }

    @Override // androidx.view.ui.AbstractAppBarOnDestinationChangedListener, androidx.navigation.NavController.OnDestinationChangedListener
    public final void onDestinationChanged(androidx.view.NavController controller, androidx.view.NavDestination destination, android.os.Bundle arguments) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(controller, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
        if (this.getHighResolutionOutputSizeshNQ4ISI.get() == null) {
            controller.removeOnDestinationChangedListener(this);
        } else {
            super.onDestinationChanged(controller, destination, arguments);
        }
    }

    @Override // androidx.view.ui.AbstractAppBarOnDestinationChangedListener
    protected final void setTitle(java.lang.CharSequence title) {
        androidx.appcompat.widget.Toolbar toolbar = this.getHighResolutionOutputSizeshNQ4ISI.get();
        if (toolbar != null) {
            toolbar.setTitle(title);
        }
    }

    @Override // androidx.view.ui.AbstractAppBarOnDestinationChangedListener
    protected final void setNavigationIcon(android.graphics.drawable.Drawable icon, int contentDescription) {
        androidx.appcompat.widget.Toolbar toolbar = this.getHighResolutionOutputSizeshNQ4ISI.get();
        if (toolbar != null) {
            boolean z = icon == null && toolbar.getNavigationIcon() != null;
            toolbar.setNavigationIcon(icon);
            toolbar.setNavigationContentDescription(contentDescription);
            if (z) {
                androidx.transition.TransitionManager.beginDelayedTransition(toolbar);
            }
        }
    }
}
