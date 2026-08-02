package androidx.view.ui;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/navigation/ui/ActionBarOnDestinationChangedListener;", "Landroidx/navigation/ui/AbstractAppBarOnDestinationChangedListener;", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "Landroidx/navigation/ui/AppBarConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;Landroidx/navigation/ui/AppBarConfiguration;)V", "", "title", "", "setTitle", "(Ljava/lang/CharSequence;)V", "Landroid/graphics/drawable/Drawable;", "icon", "", "contentDescription", "setNavigationIcon", "(Landroid/graphics/drawable/Drawable;I)V", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/appcompat/app/AppCompatActivity;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActionBarOnDestinationChangedListener extends androidx.view.ui.AbstractAppBarOnDestinationChangedListener {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.appcompat.app.AppCompatActivity getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ActionBarOnDestinationChangedListener(androidx.appcompat.app.AppCompatActivity appCompatActivity, androidx.view.ui.AppBarConfiguration appBarConfiguration) {
        super(r1, appBarConfiguration);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appCompatActivity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appBarConfiguration, "");
        androidx.appcompat.app.ActionBarDrawerToggle.Delegate drawerToggleDelegate = appCompatActivity.getDrawerToggleDelegate();
        if (drawerToggleDelegate == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Activity ");
            sb.append(appCompatActivity);
            sb.append(" does not have a DrawerToggleDelegate set");
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        android.content.Context actionBarThemedContext = drawerToggleDelegate.getActionBarThemedContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(actionBarThemedContext, "");
        this.getHighSpeedVideoFpsRangesFor = appCompatActivity;
    }

    @Override // androidx.view.ui.AbstractAppBarOnDestinationChangedListener
    protected final void setTitle(java.lang.CharSequence title) {
        androidx.appcompat.app.ActionBar supportActionBar = this.getHighSpeedVideoFpsRangesFor.getSupportActionBar();
        if (supportActionBar == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Activity ");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append(" does not have an ActionBar set via setSupportActionBar()");
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        supportActionBar.setTitle(title);
    }

    @Override // androidx.view.ui.AbstractAppBarOnDestinationChangedListener
    protected final void setNavigationIcon(android.graphics.drawable.Drawable icon, int contentDescription) {
        androidx.appcompat.app.ActionBar supportActionBar = this.getHighSpeedVideoFpsRangesFor.getSupportActionBar();
        if (supportActionBar == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Activity ");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append(" does not have an ActionBar set via setSupportActionBar()");
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        supportActionBar.setDisplayHomeAsUpEnabled(icon != null);
        androidx.appcompat.app.ActionBarDrawerToggle.Delegate drawerToggleDelegate = this.getHighSpeedVideoFpsRangesFor.getDrawerToggleDelegate();
        if (drawerToggleDelegate == null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Activity ");
            sb2.append(this.getHighSpeedVideoFpsRangesFor);
            sb2.append(" does not have a DrawerToggleDelegate set");
            throw new java.lang.IllegalStateException(sb2.toString().toString());
        }
        drawerToggleDelegate.setActionBarUpIndicator(icon, contentDescription);
    }
}
