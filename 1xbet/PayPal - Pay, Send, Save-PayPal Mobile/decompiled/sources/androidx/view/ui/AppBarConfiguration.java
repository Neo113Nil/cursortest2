package androidx.view.ui;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002 !B+\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u001c8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/navigation/ui/AppBarConfiguration;", "", "", "", "p0", "Landroidx/customview/widget/Openable;", "p1", "Landroidx/navigation/ui/AppBarConfiguration$OnNavigateUpListener;", "p2", "<init>", "(Ljava/util/Set;Landroidx/customview/widget/Openable;Landroidx/navigation/ui/AppBarConfiguration$OnNavigateUpListener;)V", "Landroidx/navigation/NavDestination;", "destination", "", "isTopLevelDestination", "(Landroidx/navigation/NavDestination;)Z", "topLevelDestinations", "Ljava/util/Set;", "getTopLevelDestinations", "()Ljava/util/Set;", "openableLayout", "Landroidx/customview/widget/Openable;", "getOpenableLayout", "()Landroidx/customview/widget/Openable;", "fallbackOnNavigateUpListener", "Landroidx/navigation/ui/AppBarConfiguration$OnNavigateUpListener;", "getFallbackOnNavigateUpListener", "()Landroidx/navigation/ui/AppBarConfiguration$OnNavigateUpListener;", "Landroidx/drawerlayout/widget/DrawerLayout;", "getDrawerLayout", "()Landroidx/drawerlayout/widget/DrawerLayout;", "drawerLayout", "OnNavigateUpListener", "Builder"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppBarConfiguration {
    private final androidx.navigation.ui.AppBarConfiguration.OnNavigateUpListener fallbackOnNavigateUpListener;
    private final androidx.customview.widget.Openable openableLayout;
    private final java.util.Set<java.lang.Integer> topLevelDestinations;

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/navigation/ui/AppBarConfiguration$OnNavigateUpListener;", "", "", "onNavigateUp", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnNavigateUpListener {
        boolean onNavigateUp();
    }

    private AppBarConfiguration(java.util.Set<java.lang.Integer> set, androidx.customview.widget.Openable openable, androidx.navigation.ui.AppBarConfiguration.OnNavigateUpListener onNavigateUpListener) {
        this.topLevelDestinations = set;
        this.openableLayout = openable;
        this.fallbackOnNavigateUpListener = onNavigateUpListener;
    }

    public final java.util.Set<java.lang.Integer> getTopLevelDestinations() {
        return this.topLevelDestinations;
    }

    public final androidx.customview.widget.Openable getOpenableLayout() {
        return this.openableLayout;
    }

    public final androidx.navigation.ui.AppBarConfiguration.OnNavigateUpListener getFallbackOnNavigateUpListener() {
        return this.fallbackOnNavigateUpListener;
    }

    @kotlin.Deprecated(message = "Use {@link #getOpenableLayout()}.")
    public final androidx.drawerlayout.widget.DrawerLayout getDrawerLayout() {
        androidx.customview.widget.Openable openable = this.openableLayout;
        if (openable instanceof androidx.drawerlayout.widget.DrawerLayout) {
            return (androidx.drawerlayout.widget.DrawerLayout) openable;
        }
        return null;
    }

    public final boolean isTopLevelDestination(androidx.view.NavDestination destination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
        for (androidx.view.NavDestination navDestination : androidx.view.NavDestination.INSTANCE.getHierarchy(destination)) {
            if (this.topLevelDestinations.contains(java.lang.Integer.valueOf(navDestination.getId())) && (!(navDestination instanceof androidx.view.NavGraph) || destination.getId() == androidx.view.NavGraph.INSTANCE.findStartDestination((androidx.view.NavGraph) navDestination).getId())) {
                return true;
            }
        }
        return false;
    }

    @kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bB\u0017\b\u0016\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\f¢\u0006\u0004\b\u0004\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010#"}, d2 = {"Landroidx/navigation/ui/AppBarConfiguration$Builder;", "", "Landroidx/navigation/NavGraph;", "navGraph", "<init>", "(Landroidx/navigation/NavGraph;)V", "Landroid/view/Menu;", "topLevelMenu", "(Landroid/view/Menu;)V", "", "topLevelDestinationIds", "([I)V", "", "(Ljava/util/Set;)V", "Landroidx/drawerlayout/widget/DrawerLayout;", "drawerLayout", "setDrawerLayout", "(Landroidx/drawerlayout/widget/DrawerLayout;)Landroidx/navigation/ui/AppBarConfiguration$Builder;", "Landroidx/customview/widget/Openable;", "openableLayout", "setOpenableLayout", "(Landroidx/customview/widget/Openable;)Landroidx/navigation/ui/AppBarConfiguration$Builder;", "Landroidx/navigation/ui/AppBarConfiguration$OnNavigateUpListener;", "fallbackOnNavigateUpListener", "setFallbackOnNavigateUpListener", "(Landroidx/navigation/ui/AppBarConfiguration$OnNavigateUpListener;)Landroidx/navigation/ui/AppBarConfiguration$Builder;", "Landroidx/navigation/ui/AppBarConfiguration;", "build", "()Landroidx/navigation/ui/AppBarConfiguration;", "", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Set;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Landroidx/customview/widget/Openable;", "Landroidx/navigation/ui/AppBarConfiguration$OnNavigateUpListener;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final java.util.Set<java.lang.Integer> getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private androidx.navigation.ui.AppBarConfiguration.OnNavigateUpListener Camera2StreamConfigurationMap;
        private androidx.customview.widget.Openable getHighSpeedVideoSizes;

        public Builder(androidx.view.NavGraph navGraph) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navGraph, "");
            java.util.HashSet hashSet = new java.util.HashSet();
            this.getHighSpeedVideoFpsRangesFor = hashSet;
            hashSet.add(java.lang.Integer.valueOf(androidx.view.NavGraph.INSTANCE.findStartDestination(navGraph).getId()));
        }

        public Builder(android.view.Menu menu) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menu, "");
            this.getHighSpeedVideoFpsRangesFor = new java.util.HashSet();
            int size = menu.size();
            for (int i = 0; i < size; i++) {
                this.getHighSpeedVideoFpsRangesFor.add(java.lang.Integer.valueOf(menu.getItem(i).getItemId()));
            }
        }

        public Builder(int... iArr) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr, "");
            this.getHighSpeedVideoFpsRangesFor = new java.util.HashSet();
            for (int i : iArr) {
                this.getHighSpeedVideoFpsRangesFor.add(java.lang.Integer.valueOf(i));
            }
        }

        public Builder(java.util.Set<java.lang.Integer> set) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
            java.util.HashSet hashSet = new java.util.HashSet();
            this.getHighSpeedVideoFpsRangesFor = hashSet;
            hashSet.addAll(set);
        }

        @kotlin.Deprecated(message = "Use {@link #setOpenableLayout(Openable)}.")
        public final androidx.navigation.ui.AppBarConfiguration.Builder setDrawerLayout(androidx.drawerlayout.widget.DrawerLayout drawerLayout) {
            this.getHighSpeedVideoSizes = drawerLayout;
            return this;
        }

        public final androidx.navigation.ui.AppBarConfiguration.Builder setOpenableLayout(androidx.customview.widget.Openable openableLayout) {
            this.getHighSpeedVideoSizes = openableLayout;
            return this;
        }

        public final androidx.navigation.ui.AppBarConfiguration.Builder setFallbackOnNavigateUpListener(androidx.navigation.ui.AppBarConfiguration.OnNavigateUpListener fallbackOnNavigateUpListener) {
            this.Camera2StreamConfigurationMap = fallbackOnNavigateUpListener;
            return this;
        }

        public final androidx.view.ui.AppBarConfiguration build() {
            return new androidx.view.ui.AppBarConfiguration(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, null);
        }
    }

    public /* synthetic */ AppBarConfiguration(java.util.Set set, androidx.customview.widget.Openable openable, androidx.navigation.ui.AppBarConfiguration.OnNavigateUpListener onNavigateUpListener, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(set, openable, onNavigateUpListener);
    }
}
