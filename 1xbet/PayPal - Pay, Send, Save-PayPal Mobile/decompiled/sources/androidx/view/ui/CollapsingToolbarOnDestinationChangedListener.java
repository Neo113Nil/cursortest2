package androidx.view.ui;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001f"}, d2 = {"Landroidx/navigation/ui/CollapsingToolbarOnDestinationChangedListener;", "Landroidx/navigation/ui/AbstractAppBarOnDestinationChangedListener;", "Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "collapsingToolbarLayout", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroidx/navigation/ui/AppBarConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "<init>", "(Lcom/google/android/material/appbar/CollapsingToolbarLayout;Landroidx/appcompat/widget/Toolbar;Landroidx/navigation/ui/AppBarConfiguration;)V", "Landroidx/navigation/NavController;", "controller", "Landroidx/navigation/NavDestination;", "destination", "Landroid/os/Bundle;", "arguments", "", "onDestinationChanged", "(Landroidx/navigation/NavController;Landroidx/navigation/NavDestination;Landroid/os/Bundle;)V", "", "title", "setTitle", "(Ljava/lang/CharSequence;)V", "Landroid/graphics/drawable/Drawable;", "icon", "", "contentDescription", "setNavigationIcon", "(Landroid/graphics/drawable/Drawable;I)V", "Ljava/lang/ref/WeakReference;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/ref/WeakReference;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CollapsingToolbarOnDestinationChangedListener extends androidx.view.ui.AbstractAppBarOnDestinationChangedListener {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.ref.WeakReference<com.google.android.material.appbar.CollapsingToolbarLayout> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.ref.WeakReference<androidx.appcompat.widget.Toolbar> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CollapsingToolbarOnDestinationChangedListener(com.google.android.material.appbar.CollapsingToolbarLayout collapsingToolbarLayout, androidx.appcompat.widget.Toolbar toolbar, androidx.view.ui.AppBarConfiguration appBarConfiguration) {
        super(r1, appBarConfiguration);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collapsingToolbarLayout, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toolbar, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appBarConfiguration, "");
        android.content.Context context = collapsingToolbarLayout.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "");
        this.getHighSpeedVideoSizes = new java.lang.ref.WeakReference<>(collapsingToolbarLayout);
        this.getHighResolutionOutputSizeshNQ4ISI = new java.lang.ref.WeakReference<>(toolbar);
    }

    @Override // androidx.view.ui.AbstractAppBarOnDestinationChangedListener, androidx.navigation.NavController.OnDestinationChangedListener
    public final void onDestinationChanged(androidx.view.NavController controller, androidx.view.NavDestination destination, android.os.Bundle arguments) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(controller, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
        com.google.android.material.appbar.CollapsingToolbarLayout collapsingToolbarLayout = this.getHighSpeedVideoSizes.get();
        androidx.appcompat.widget.Toolbar toolbar = this.getHighResolutionOutputSizeshNQ4ISI.get();
        if (collapsingToolbarLayout == null || toolbar == null) {
            controller.removeOnDestinationChangedListener(this);
        } else {
            super.onDestinationChanged(controller, destination, arguments);
        }
    }

    @Override // androidx.view.ui.AbstractAppBarOnDestinationChangedListener
    protected final void setTitle(java.lang.CharSequence title) {
        com.google.android.material.appbar.CollapsingToolbarLayout collapsingToolbarLayout = this.getHighSpeedVideoSizes.get();
        if (collapsingToolbarLayout != null) {
            collapsingToolbarLayout.setTitle(title);
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
