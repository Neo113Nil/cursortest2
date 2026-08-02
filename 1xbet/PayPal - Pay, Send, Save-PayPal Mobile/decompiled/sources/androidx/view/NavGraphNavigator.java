package androidx.view;

@androidx.navigation.Navigator.Name("navigation")
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u0011\u001a\u00020\u00102\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u001a8G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/navigation/NavGraphNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavGraph;", "Landroidx/navigation/NavigatorProvider;", "navigatorProvider", "<init>", "(Landroidx/navigation/NavigatorProvider;)V", "createDestination", "()Landroidx/navigation/NavGraph;", "", "Landroidx/navigation/NavBackStackEntry;", "entries", "Landroidx/navigation/NavOptions;", "navOptions", "Landroidx/navigation/Navigator$Extras;", "navigatorExtras", "", "navigate", "(Ljava/util/List;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "p0", "p1", "p2", "getHighSpeedVideoFpsRangesFor", "(Landroidx/navigation/NavBackStackEntry;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "getHighSpeedVideoFpsRanges", "Landroidx/navigation/NavigatorProvider;", "Lkotlinx/coroutines/flow/StateFlow;", "getBackStack", "()Lkotlinx/coroutines/flow/StateFlow;", "backStack", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class NavGraphNavigator extends androidx.view.Navigator<androidx.view.NavGraph> {
    public static final java.lang.String NAME = "navigation";
    private final androidx.view.NavigatorProvider getHighSpeedVideoFpsRanges;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphNavigator(androidx.view.NavigatorProvider navigatorProvider) {
        super("navigation");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigatorProvider, "");
        this.getHighSpeedVideoFpsRanges = navigatorProvider;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.util.List<androidx.view.NavBackStackEntry>> getBackStack() {
        return getState().getBackStack();
    }

    @Override // androidx.view.Navigator
    public androidx.view.NavGraph createDestination() {
        return new androidx.view.NavGraph(this);
    }

    @Override // androidx.view.Navigator
    public void navigate(java.util.List<androidx.view.NavBackStackEntry> entries, androidx.view.NavOptions navOptions, androidx.navigation.Navigator.Extras navigatorExtras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entries, "");
        java.util.Iterator<androidx.view.NavBackStackEntry> it = entries.iterator();
        while (it.hasNext()) {
            getHighSpeedVideoFpsRangesFor(it.next(), navOptions, navigatorExtras);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16, types: [T, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, android.os.Bundle] */
    private final void getHighSpeedVideoFpsRangesFor(androidx.view.NavBackStackEntry p0, androidx.view.NavOptions p1, androidx.navigation.Navigator.Extras p2) {
        androidx.view.NavDestination navDestination;
        kotlin.Pair[] pairArr;
        androidx.view.NavDestination destination = p0.getDestination();
        kotlin.jvm.internal.Intrinsics.checkNotNull(destination, "");
        androidx.view.NavGraph navGraph = (androidx.view.NavGraph) destination;
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = p0.getArguments();
        int startDestinationId = navGraph.getStartDestinationId();
        java.lang.String startDestinationRoute = navGraph.getStartDestinationRoute();
        if (startDestinationId == 0 && startDestinationRoute == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("no start destination defined via app:startDestination for ");
            sb.append(navGraph.getDisplayName());
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        if (startDestinationRoute != null) {
            navDestination = navGraph.findNode(startDestinationRoute, false);
        } else {
            navDestination = navGraph.getNodes().get(startDestinationId);
        }
        if (navDestination == null) {
            java.lang.String startDestDisplayName = navGraph.getStartDestDisplayName();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("navigation destination ");
            sb2.append(startDestDisplayName);
            sb2.append(" is not a direct child of this NavGraph");
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
        if (startDestinationRoute != null) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(startDestinationRoute, navDestination.getRoute())) {
                androidx.navigation.NavDestination.DeepLinkMatch matchRoute = navDestination.matchRoute(startDestinationRoute);
                android.os.Bundle matchingArgs = matchRoute != null ? matchRoute.getMatchingArgs() : null;
                if (matchingArgs != null && !androidx.view.SavedStateReader.m9374isEmptyimpl(androidx.view.SavedStateReader.m9296constructorimpl(matchingArgs))) {
                    java.util.Map emptyMap = kotlin.collections.MapsKt.emptyMap();
                    if (emptyMap.isEmpty()) {
                        pairArr = new kotlin.Pair[0];
                    } else {
                        java.util.ArrayList arrayList = new java.util.ArrayList(emptyMap.size());
                        for (java.util.Map.Entry entry : emptyMap.entrySet()) {
                            arrayList.add(kotlin.TuplesKt.to((java.lang.String) entry.getKey(), entry.getValue()));
                        }
                        pairArr = (kotlin.Pair[]) arrayList.toArray(new kotlin.Pair[0]);
                    }
                    ?? bundleOf = androidx.core.os.BundleKt.bundleOf((kotlin.Pair[]) java.util.Arrays.copyOf(pairArr, pairArr.length));
                    android.os.Bundle m9382constructorimpl = androidx.view.SavedStateWriter.m9382constructorimpl(bundleOf);
                    androidx.view.SavedStateWriter.m9386putAllimpl(m9382constructorimpl, matchingArgs);
                    android.os.Bundle bundle = (android.os.Bundle) objectRef.element;
                    if (bundle != null) {
                        androidx.view.SavedStateWriter.m9386putAllimpl(m9382constructorimpl, bundle);
                    }
                    objectRef.element = bundleOf;
                }
            }
            if (!navDestination.getArguments().isEmpty()) {
                java.util.List<java.lang.String> missingRequiredArguments = androidx.view.NavArgumentKt.missingRequiredArguments(navDestination.getArguments(), new kotlin.jvm.functions.Function1() { // from class: androidx.navigation.NavGraphNavigator$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return java.lang.Boolean.valueOf(androidx.view.NavGraphNavigator.$r8$lambda$qwdvpzsMM6_VwMCUnwoFhwzqayo(kotlin.jvm.internal.Ref.ObjectRef.this, (java.lang.String) obj));
                    }
                });
                if (!missingRequiredArguments.isEmpty()) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Cannot navigate to startDestination ");
                    sb3.append(navDestination);
                    sb3.append(". Missing required arguments [");
                    sb3.append(missingRequiredArguments);
                    sb3.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
                    throw new java.lang.IllegalArgumentException(sb3.toString().toString());
                }
            }
        }
        this.getHighSpeedVideoFpsRanges.getNavigator(navDestination.getNavigatorName()).navigate(kotlin.collections.CollectionsKt.listOf(getState().createBackStackEntry(navDestination, navDestination.addInDefaultArgs((android.os.Bundle) objectRef.element))), p1, p2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean $r8$lambda$qwdvpzsMM6_VwMCUnwoFhwzqayo(kotlin.jvm.internal.Ref.ObjectRef objectRef, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return objectRef.element == 0 || !androidx.view.SavedStateReader.m9297containsimpl(androidx.view.SavedStateReader.m9296constructorimpl((android.os.Bundle) objectRef.element), str);
    }
}
