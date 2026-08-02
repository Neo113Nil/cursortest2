package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010)\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u0000 d2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002:\u0001dB\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0001¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0019\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\"\u001a\u00020\u000b2\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010 ¢\u0006\u0004\b\"\u0010#J!\u0010\"\u001a\u00020\u000b2\u0012\u0010!\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010$\"\u00020\u0001¢\u0006\u0004\b\"\u0010%J\u0017\u0010(\u001a\u0004\u0018\u00010\u00012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J5\u0010+\u001a\u0004\u0018\u00010\u00012\u0006\u0010'\u001a\u00020&2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b+\u0010,J\u0019\u0010(\u001a\u0004\u0018\u00010\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b(\u0010-J\u001a\u0010(\u001a\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010.\u0018\u0001H\u0086\b¢\u0006\u0004\b(\u0010/J\u001b\u0010(\u001a\u0004\u0018\u00010\u00012\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u000300¢\u0006\u0004\b(\u00101J\u001f\u0010(\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010.2\b\u0010\u000f\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b(\u00102J\u001f\u0010(\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u00103\u001a\u00020\u0010¢\u0006\u0004\b(\u00104J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020\u000105H\u0086\u0002¢\u0006\u0004\b6\u00107J\u0015\u00109\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u0000¢\u0006\u0004\b9\u0010:J\u0015\u0010;\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0001¢\u0006\u0004\b;\u0010\u001fJ\r\u0010<\u001a\u00020\u000b¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020&H\u0007¢\u0006\u0004\b>\u0010?J\u0015\u0010A\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020&¢\u0006\u0004\bA\u0010BJ\u0015\u0010A\u001a\u00020\u000b2\u0006\u0010C\u001a\u00020\u000e¢\u0006\u0004\bA\u0010DJ\u001c\u0010A\u001a\u00020\u000b\"\n\b\u0000\u0010.\u0018\u0001*\u00020EH\u0086\b¢\u0006\u0004\bA\u0010=J%\u0010A\u001a\u00020\u000b\"\b\b\u0000\u0010.*\u00020E2\f\u0010C\u001a\b\u0012\u0004\u0012\u00028\u000000¢\u0006\u0004\bA\u0010FJ\u001f\u0010A\u001a\u00020\u000b\"\b\b\u0000\u0010.*\u00020E2\u0006\u0010C\u001a\u00028\u0000¢\u0006\u0004\bA\u0010GJ5\u0010A\u001a\u00020\u000b\"\u0004\b\u0000\u0010.2\f\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000H2\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e0J¢\u0006\u0004\bA\u0010LJ\u000f\u0010M\u001a\u00020\u000eH\u0016¢\u0006\u0004\bM\u0010NJ\u001a\u0010O\u001a\u00020\u00102\b\u00108\u001a\u0004\u0018\u00010EH\u0096\u0002¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020&H\u0016¢\u0006\u0004\bQ\u0010?R\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u001b\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010V8GX\u0086\u0084\u0002¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0014\u0010Z\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010NR%\u0010^\u001a\u00020&2\u0006\u0010[\u001a\u00020&8G@CX\u0086\u008e\u0002¢\u0006\f\u001a\u0004\b\\\u0010?\"\u0004\b]\u0010BR)\u0010a\u001a\u0004\u0018\u00010\u000e2\b\u0010[\u001a\u0004\u0018\u00010\u000e8G@CX\u0086\u008e\u0002¢\u0006\f\u001a\u0004\b_\u0010N\"\u0004\b`\u0010DR\u0015\u0010c\u001a\u00020\u000e8GX\u0086\u0084\u0002¢\u0006\u0006\u001a\u0004\bb\u0010N"}, d2 = {"Landroidx/navigation/NavGraph;", "Landroidx/navigation/NavDestination;", "", "Landroidx/navigation/Navigator;", "navGraphNavigator", "<init>", "(Landroidx/navigation/Navigator;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "onInflate", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "route", "", "searchChildren", "searchParent", "lastVisited", "Landroidx/navigation/NavDestination$DeepLinkMatch;", "matchRouteComprehensive", "(Ljava/lang/String;ZZLandroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "Landroidx/navigation/NavDeepLinkRequest;", "navDeepLinkRequest", "matchDeepLinkComprehensive", "(Landroidx/navigation/NavDeepLinkRequest;ZZLandroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "matchDeepLink", "(Landroidx/navigation/NavDeepLinkRequest;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "node", "addDestination", "(Landroidx/navigation/NavDestination;)V", "", "nodes", "addDestinations", "(Ljava/util/Collection;)V", "", "([Landroidx/navigation/NavDestination;)V", "", "resId", "findNode", "(I)Landroidx/navigation/NavDestination;", "matchingDest", "findNodeComprehensive", "(ILandroidx/navigation/NavDestination;ZLandroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination;", "(Ljava/lang/String;)Landroidx/navigation/NavDestination;", "T", "()Landroidx/navigation/NavDestination;", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;)Landroidx/navigation/NavDestination;", "(Ljava/lang/Object;)Landroidx/navigation/NavDestination;", "searchParents", "(Ljava/lang/String;Z)Landroidx/navigation/NavDestination;", "", "iterator", "()Ljava/util/Iterator;", "other", "addAll", "(Landroidx/navigation/NavGraph;)V", "remove", "clear", "()V", "getStartDestination", "()I", "startDestId", "setStartDestination", "(I)V", "startDestRoute", "(Ljava/lang/String;)V", "", "(Lkotlin/reflect/KClass;)V", "(Ljava/lang/Object;)V", "Lkotlinx/serialization/KSerializer;", "serializer", "Lkotlin/Function1;", "parseRoute", "(Lkotlinx/serialization/KSerializer;Lkotlin/jvm/functions/Function1;)V", "toString", "()Ljava/lang/String;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "Landroidx/navigation/internal/NavGraphImpl;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/navigation/internal/NavGraphImpl;", "getHighSpeedVideoFpsRangesFor", "Landroidx/collection/SparseArrayCompat;", "getNodes", "()Landroidx/collection/SparseArrayCompat;", "getDisplayName", "displayName", "<set-?>", "getStartDestinationId", "setStartDestinationId", "startDestinationId", "getStartDestinationRoute", "setStartDestinationRoute", "startDestinationRoute", "getStartDestDisplayName", "startDestDisplayName", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class NavGraph extends androidx.view.NavDestination implements java.lang.Iterable<androidx.view.NavDestination>, kotlin.jvm.internal.markers.KMappedMarker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.NavGraph.Companion INSTANCE = new androidx.view.NavGraph.Companion(null);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.view.internal.NavGraphImpl getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraph(androidx.view.Navigator<? extends androidx.view.NavGraph> navigator) {
        super(navigator);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        this.getHighSpeedVideoFpsRangesFor = new androidx.view.internal.NavGraphImpl(this);
    }

    public final androidx.collection.SparseArrayCompat<androidx.view.NavDestination> getNodes() {
        return this.getHighSpeedVideoFpsRangesFor.getNodes$navigation_common_release();
    }

    @Override // androidx.view.NavDestination
    public void onInflate(android.content.Context context, android.util.AttributeSet attrs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attrs, "");
        super.onInflate(context, attrs);
        android.content.res.TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, androidx.view.common.R.styleable.NavGraphNavigator);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtainAttributes, "");
        setStartDestinationId(obtainAttributes.getResourceId(androidx.view.common.R.styleable.NavGraphNavigator_startDestination, 0));
        this.getHighSpeedVideoFpsRangesFor.setStartDestIdName$navigation_common_release(androidx.view.NavDestination.INSTANCE.getDisplayName(new androidx.view.internal.NavContext(context), this.getHighSpeedVideoFpsRangesFor.getStartDestId()));
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        obtainAttributes.recycle();
    }

    public final androidx.navigation.NavDestination.DeepLinkMatch matchRouteComprehensive(java.lang.String route, boolean searchChildren, boolean searchParent, androidx.view.NavDestination lastVisited) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(route, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastVisited, "");
        return this.getHighSpeedVideoFpsRangesFor.matchRouteComprehensive$navigation_common_release(route, searchChildren, searchParent, lastVisited);
    }

    public final androidx.navigation.NavDestination.DeepLinkMatch matchDeepLinkComprehensive(androidx.view.NavDeepLinkRequest navDeepLinkRequest, boolean searchChildren, boolean searchParent, androidx.view.NavDestination lastVisited) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navDeepLinkRequest, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastVisited, "");
        return this.getHighSpeedVideoFpsRangesFor.matchDeepLinkComprehensive$navigation_common_release(super.matchDeepLink(navDeepLinkRequest), navDeepLinkRequest, searchChildren, searchParent, lastVisited);
    }

    @Override // androidx.view.NavDestination
    public androidx.navigation.NavDestination.DeepLinkMatch matchDeepLink(androidx.view.NavDeepLinkRequest navDeepLinkRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navDeepLinkRequest, "");
        return this.getHighSpeedVideoFpsRangesFor.matchDeepLink$navigation_common_release(super.matchDeepLink(navDeepLinkRequest), navDeepLinkRequest);
    }

    public final void addDestination(androidx.view.NavDestination node) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(node, "");
        this.getHighSpeedVideoFpsRangesFor.addDestination$navigation_common_release(node);
    }

    public final void addDestinations(java.util.Collection<? extends androidx.view.NavDestination> nodes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nodes, "");
        this.getHighSpeedVideoFpsRangesFor.addDestinations$navigation_common_release(nodes);
    }

    public final void addDestinations(androidx.view.NavDestination... nodes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nodes, "");
        this.getHighSpeedVideoFpsRangesFor.addDestinations$navigation_common_release((androidx.view.NavDestination[]) java.util.Arrays.copyOf(nodes, nodes.length));
    }

    public final androidx.view.NavDestination findNode(int resId) {
        return this.getHighSpeedVideoFpsRangesFor.findNode$navigation_common_release(resId);
    }

    public static /* synthetic */ androidx.view.NavDestination findNodeComprehensive$default(androidx.view.NavGraph navGraph, int i, androidx.view.NavDestination navDestination, boolean z, androidx.view.NavDestination navDestination2, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findNodeComprehensive");
        }
        if ((i2 & 8) != 0) {
            navDestination2 = null;
        }
        return navGraph.findNodeComprehensive(i, navDestination, z, navDestination2);
    }

    public final androidx.view.NavDestination findNodeComprehensive(int resId, androidx.view.NavDestination lastVisited, boolean searchChildren, androidx.view.NavDestination matchingDest) {
        return this.getHighSpeedVideoFpsRangesFor.findNodeComprehensive$navigation_common_release(resId, lastVisited, searchChildren, matchingDest);
    }

    public final androidx.view.NavDestination findNode(java.lang.String route) {
        return this.getHighSpeedVideoFpsRangesFor.findNode$navigation_common_release(route);
    }

    public final /* synthetic */ <T> androidx.view.NavDestination findNode() {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return findNode(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
    }

    public final androidx.view.NavDestination findNode(kotlin.reflect.KClass<?> route) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(route, "");
        return this.getHighSpeedVideoFpsRangesFor.findNode$navigation_common_release(route);
    }

    public final <T> androidx.view.NavDestination findNode(T route) {
        return this.getHighSpeedVideoFpsRangesFor.findNode$navigation_common_release((androidx.view.internal.NavGraphImpl) route);
    }

    public final androidx.view.NavDestination findNode(java.lang.String route, boolean searchParents) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(route, "");
        return this.getHighSpeedVideoFpsRangesFor.findNode$navigation_common_release(route, searchParents);
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<androidx.view.NavDestination> iterator() {
        return this.getHighSpeedVideoFpsRangesFor.iterator$navigation_common_release();
    }

    public final void addAll(androidx.view.NavGraph other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
        this.getHighSpeedVideoFpsRangesFor.addAll$navigation_common_release(other);
    }

    public final void remove(androidx.view.NavDestination node) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(node, "");
        this.getHighSpeedVideoFpsRangesFor.remove$navigation_common_release(node);
    }

    public final void clear() {
        this.getHighSpeedVideoFpsRangesFor.clear$navigation_common_release();
    }

    @Override // androidx.view.NavDestination
    public java.lang.String getDisplayName() {
        return this.getHighSpeedVideoFpsRangesFor.getDisplayName$navigation_common_release(super.getDisplayName());
    }

    @kotlin.Deprecated(message = "Use getStartDestinationId instead.", replaceWith = @kotlin.ReplaceWith(expression = "startDestinationId", imports = {}))
    public final int getStartDestination() {
        return this.getHighSpeedVideoFpsRangesFor.getStartDestinationId$navigation_common_release();
    }

    private final void setStartDestinationId(int i) {
        this.getHighSpeedVideoFpsRangesFor.setStartDestinationId$navigation_common_release(i);
    }

    public final int getStartDestinationId() {
        return this.getHighSpeedVideoFpsRangesFor.getStartDestinationId$navigation_common_release();
    }

    public final void setStartDestination(int startDestId) {
        this.getHighSpeedVideoFpsRangesFor.setStartDestination$navigation_common_release(startDestId);
    }

    public final void setStartDestination(java.lang.String startDestRoute) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startDestRoute, "");
        this.getHighSpeedVideoFpsRangesFor.setStartDestination$navigation_common_release(startDestRoute);
    }

    public final /* synthetic */ <T> void setStartDestination() {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        setStartDestination(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
    }

    public final /* synthetic */ void setStartDestination(kotlin.reflect.KClass startDestRoute) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startDestRoute, "");
        this.getHighSpeedVideoFpsRangesFor.setStartDestination$navigation_common_release(startDestRoute);
    }

    public final /* synthetic */ void setStartDestination(java.lang.Object startDestRoute) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startDestRoute, "");
        this.getHighSpeedVideoFpsRangesFor.setStartDestination$navigation_common_release((androidx.view.internal.NavGraphImpl) startDestRoute);
    }

    public final <T> void setStartDestination(kotlinx.serialization.KSerializer<T> serializer, kotlin.jvm.functions.Function1<? super androidx.view.NavDestination, java.lang.String> parseRoute) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parseRoute, "");
        this.getHighSpeedVideoFpsRangesFor.setStartDestination$navigation_common_release(serializer, parseRoute);
    }

    private final void setStartDestinationRoute(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor.setStartDestinationRoute$navigation_common_release(str);
    }

    public final java.lang.String getStartDestinationRoute() {
        return this.getHighSpeedVideoFpsRangesFor.getStartDestinationRoute();
    }

    public final java.lang.String getStartDestDisplayName() {
        return this.getHighSpeedVideoFpsRangesFor.getStartDestDisplayName$navigation_common_release();
    }

    @Override // androidx.view.NavDestination
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        androidx.view.NavDestination findNode = findNode(getStartDestinationRoute());
        if (findNode == null) {
            findNode = findNode(getStartDestinationId());
        }
        sb.append(" startDestination=");
        if (findNode == null) {
            if (getStartDestinationRoute() != null) {
                sb.append(getStartDestinationRoute());
            } else if (this.getHighSpeedVideoFpsRangesFor.getStartDestIdName() != null) {
                sb.append(this.getHighSpeedVideoFpsRangesFor.getStartDestIdName());
            } else {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("0x");
                sb2.append(java.lang.Integer.toHexString(this.getHighSpeedVideoFpsRangesFor.getStartDestId()));
                sb.append(sb2.toString());
            }
        } else {
            sb.append("{");
            sb.append(findNode.toString());
            sb.append("}");
        }
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    @Override // androidx.view.NavDestination
    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof androidx.view.NavGraph) || !super.equals(other)) {
            return false;
        }
        androidx.view.NavGraph navGraph = (androidx.view.NavGraph) other;
        if (getNodes().size() != navGraph.getNodes().size() || getStartDestinationId() != navGraph.getStartDestinationId()) {
            return false;
        }
        for (androidx.view.NavDestination navDestination : kotlin.sequences.SequencesKt.asSequence(androidx.collection.SparseArrayKt.valueIterator(getNodes()))) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(navDestination, navGraph.getNodes().get(navDestination.getId()))) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.view.NavDestination
    public int hashCode() {
        int startDestinationId = getStartDestinationId();
        androidx.collection.SparseArrayCompat<androidx.view.NavDestination> nodes = getNodes();
        int size = nodes.size();
        for (int i = 0; i < size; i++) {
            startDestinationId = (((startDestinationId * 31) + nodes.keyAt(i)) * 31) + nodes.valueAt(i).hashCode();
        }
        return startDestinationId;
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b*\u00020\u0004¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/navigation/NavGraph$Companion;", "", "<init>", "()V", "Landroidx/navigation/NavGraph;", "Landroidx/navigation/NavDestination;", "findStartDestination", "(Landroidx/navigation/NavGraph;)Landroidx/navigation/NavDestination;", "Lkotlin/sequences/Sequence;", "childHierarchy", "(Landroidx/navigation/NavGraph;)Lkotlin/sequences/Sequence;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.NavDestination findStartDestination(androidx.view.NavGraph navGraph) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navGraph, "");
            return (androidx.view.NavDestination) kotlin.sequences.SequencesKt.last(childHierarchy(navGraph));
        }

        public final kotlin.sequences.Sequence<androidx.view.NavDestination> childHierarchy(androidx.view.NavGraph navGraph) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navGraph, "");
            return kotlin.sequences.SequencesKt.generateSequence(navGraph, (kotlin.jvm.functions.Function1<? super androidx.view.NavGraph, ? extends androidx.view.NavGraph>) new kotlin.jvm.functions.Function1() { // from class: androidx.navigation.NavGraph$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.view.NavGraph.Companion.$r8$lambda$4yGYidhBGAXrRHTIOpPtAcqF1o0((androidx.view.NavDestination) obj);
                }
            });
        }

        public static /* synthetic */ androidx.view.NavDestination $r8$lambda$4yGYidhBGAXrRHTIOpPtAcqF1o0(androidx.view.NavDestination navDestination) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navDestination, "");
            if (!(navDestination instanceof androidx.view.NavGraph)) {
                return null;
            }
            androidx.view.NavGraph navGraph = (androidx.view.NavGraph) navDestination;
            return navGraph.findNode(navGraph.getStartDestinationId());
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.NavDestination findStartDestination(androidx.view.NavGraph navGraph) {
        return INSTANCE.findStartDestination(navGraph);
    }
}
