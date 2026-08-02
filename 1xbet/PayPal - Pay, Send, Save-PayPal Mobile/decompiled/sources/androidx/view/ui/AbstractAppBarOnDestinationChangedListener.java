package androidx.view.ui;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH$¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH$¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010!\u001a\u000e\u0012\b\u0012\u0006*\u00020 0 \u0018\u00010\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010$\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010("}, d2 = {"Landroidx/navigation/ui/AbstractAppBarOnDestinationChangedListener;", "Landroidx/navigation/NavController$OnDestinationChangedListener;", "Landroid/content/Context;", "context", "Landroidx/navigation/ui/AppBarConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "<init>", "(Landroid/content/Context;Landroidx/navigation/ui/AppBarConfiguration;)V", "", "title", "", "setTitle", "(Ljava/lang/CharSequence;)V", "Landroid/graphics/drawable/Drawable;", "icon", "", "contentDescription", "setNavigationIcon", "(Landroid/graphics/drawable/Drawable;I)V", "Landroidx/navigation/NavController;", "controller", "Landroidx/navigation/NavDestination;", "destination", "Landroid/os/Bundle;", "arguments", "onDestinationChanged", "(Landroidx/navigation/NavController;Landroidx/navigation/NavDestination;Landroid/os/Bundle;)V", "getHighSpeedVideoFpsRanges", "Landroid/content/Context;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/navigation/ui/AppBarConfiguration;", "Ljava/lang/ref/WeakReference;", "Landroidx/customview/widget/Openable;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/ref/WeakReference;", "Landroidx/appcompat/graphics/drawable/DrawerArrowDrawable;", "getHighSpeedVideoSizes", "Landroidx/appcompat/graphics/drawable/DrawerArrowDrawable;", "Camera2StreamConfigurationMap", "Landroid/animation/ValueAnimator;", "Landroid/animation/ValueAnimator;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class AbstractAppBarOnDestinationChangedListener implements androidx.navigation.NavController.OnDestinationChangedListener {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private android.animation.ValueAnimator getHighSpeedVideoSizes;
    private final androidx.view.ui.AppBarConfiguration getHighResolutionOutputSizeshNQ4ISI;
    private final android.content.Context getHighSpeedVideoFpsRanges;
    private final java.lang.ref.WeakReference<androidx.customview.widget.Openable> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private androidx.appcompat.graphics.drawable.DrawerArrowDrawable Camera2StreamConfigurationMap;

    protected abstract void setNavigationIcon(android.graphics.drawable.Drawable icon, int contentDescription);

    protected abstract void setTitle(java.lang.CharSequence title);

    public AbstractAppBarOnDestinationChangedListener(android.content.Context context, androidx.view.ui.AppBarConfiguration appBarConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appBarConfiguration, "");
        this.getHighSpeedVideoFpsRanges = context;
        this.getHighResolutionOutputSizeshNQ4ISI = appBarConfiguration;
        androidx.customview.widget.Openable openableLayout = appBarConfiguration.getOpenableLayout();
        this.getHighSpeedVideoFpsRangesFor = openableLayout != null ? new java.lang.ref.WeakReference<>(openableLayout) : null;
    }

    @Override // androidx.navigation.NavController.OnDestinationChangedListener
    public void onDestinationChanged(androidx.view.NavController controller, androidx.view.NavDestination destination, android.os.Bundle arguments) {
        kotlin.Pair pair;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(controller, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
        if (destination instanceof androidx.view.FloatingWindow) {
            return;
        }
        java.lang.ref.WeakReference<androidx.customview.widget.Openable> weakReference = this.getHighSpeedVideoFpsRangesFor;
        androidx.customview.widget.Openable openable = weakReference != null ? weakReference.get() : null;
        if (this.getHighSpeedVideoFpsRangesFor != null && openable == null) {
            controller.removeOnDestinationChangedListener(this);
            return;
        }
        java.lang.String fillInLabel = destination.fillInLabel(this.getHighSpeedVideoFpsRanges, arguments);
        if (fillInLabel != null) {
            setTitle(fillInLabel);
        }
        boolean isTopLevelDestination = this.getHighResolutionOutputSizeshNQ4ISI.isTopLevelDestination(destination);
        if (openable == null && isTopLevelDestination) {
            setNavigationIcon(null, 0);
            return;
        }
        boolean z = openable != null && isTopLevelDestination;
        androidx.appcompat.graphics.drawable.DrawerArrowDrawable drawerArrowDrawable = this.Camera2StreamConfigurationMap;
        if (drawerArrowDrawable == null || (pair = kotlin.TuplesKt.to(drawerArrowDrawable, java.lang.Boolean.TRUE)) == null) {
            androidx.appcompat.graphics.drawable.DrawerArrowDrawable drawerArrowDrawable2 = new androidx.appcompat.graphics.drawable.DrawerArrowDrawable(this.getHighSpeedVideoFpsRanges);
            this.Camera2StreamConfigurationMap = drawerArrowDrawable2;
            pair = kotlin.TuplesKt.to(drawerArrowDrawable2, java.lang.Boolean.FALSE);
        }
        androidx.appcompat.graphics.drawable.DrawerArrowDrawable drawerArrowDrawable3 = (androidx.appcompat.graphics.drawable.DrawerArrowDrawable) pair.component1();
        boolean booleanValue = ((java.lang.Boolean) pair.component2()).booleanValue();
        androidx.appcompat.graphics.drawable.DrawerArrowDrawable drawerArrowDrawable4 = drawerArrowDrawable3;
        if (z) {
            i = androidx.view.ui.R.string.nav_app_bar_open_drawer_description;
        } else {
            i = androidx.view.ui.R.string.nav_app_bar_navigate_up_description;
        }
        setNavigationIcon(drawerArrowDrawable4, i);
        float f = z ? 0.0f : 1.0f;
        if (booleanValue) {
            float progress = drawerArrowDrawable3.getProgress();
            android.animation.ValueAnimator valueAnimator = this.getHighSpeedVideoSizes;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(drawerArrowDrawable3, "progress", progress, f);
            this.getHighSpeedVideoSizes = ofFloat;
            kotlin.jvm.internal.Intrinsics.checkNotNull(ofFloat, "");
            ofFloat.start();
            return;
        }
        drawerArrowDrawable3.setProgress(f);
    }
}
