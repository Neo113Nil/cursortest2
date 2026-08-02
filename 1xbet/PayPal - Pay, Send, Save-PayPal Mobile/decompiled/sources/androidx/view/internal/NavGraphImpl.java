package androidx.view.internal;

@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010)\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u0013\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\u0004\u0018\u00010\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u00192\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\u001e\u001a\u00020\u00192\u0012\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0 \"\u00020\u000bH\u0000¢\u0006\u0004\b\u001e\u0010!J\u0019\u0010$\u001a\u0004\u0018\u00010\u000b2\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b$\u0010%J7\u0010'\u001a\u0004\u0018\u00010\u000b2\u0006\u0010#\u001a\u00020\"2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b'\u0010(J\u001b\u0010$\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b$\u0010)J\u001d\u0010$\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030*H\u0000¢\u0006\u0004\b$\u0010+J!\u0010$\u001a\u0004\u0018\u00010\u000b\"\u0004\b\u0000\u0010,2\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000H\u0000¢\u0006\u0004\b$\u0010-J!\u0010$\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\bH\u0000¢\u0006\u0004\b$\u0010/J\u0015\u00101\u001a\b\u0012\u0004\u0012\u00020\u000b00H\u0000¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u00192\u0006\u00103\u001a\u00020\u0002H\u0000¢\u0006\u0004\b4\u0010\u0005J\u0017\u00105\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u000bH\u0000¢\u0006\u0004\b5\u0010\u001bJ\u000f\u00106\u001a\u00020\u0019H\u0000¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u0006H\u0000¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\u00192\u0006\u0010;\u001a\u00020\"H\u0000¢\u0006\u0004\b<\u0010=J\u0017\u0010<\u001a\u00020\u00192\u0006\u0010>\u001a\u00020\u0006H\u0000¢\u0006\u0004\b<\u0010?J'\u0010<\u001a\u00020\u0019\"\b\b\u0000\u0010,*\u00020\u00012\f\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000*H\u0000¢\u0006\u0004\b<\u0010@J!\u0010<\u001a\u00020\u0019\"\b\b\u0000\u0010,*\u00020\u00012\u0006\u0010>\u001a\u00028\u0000H\u0000¢\u0006\u0004\b<\u0010AJ7\u0010<\u001a\u00020\u0019\"\u0004\b\u0000\u0010,2\f\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000B2\u0012\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060DH\u0000¢\u0006\u0004\b<\u0010FR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010G\u001a\u0004\bH\u0010IR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0J8AX\u0081\u0004¢\u0006\f\n\u0004\b\u001d\u0010K\u001a\u0004\bL\u0010MR\"\u0010;\u001a\u00020\"8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b;\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010=R$\u0010R\u001a\u0004\u0018\u00010\u00068\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010?R$\u0010Y\u001a\u00020\"2\u0006\u0010;\u001a\u00020\"8A@AX\u0080\u000e¢\u0006\f\u001a\u0004\bW\u0010P\"\u0004\bX\u0010=R.\u0010Z\u001a\u0004\u0018\u00010\u00062\b\u0010>\u001a\u0004\u0018\u00010\u00068\u0001@AX\u0081\u000e¢\u0006\u0012\n\u0004\bZ\u0010S\u001a\u0004\b[\u0010U\"\u0004\b\\\u0010?R\u0014\u0010^\u001a\u00020\u00068AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b]\u0010U"}, d2 = {"Landroidx/navigation/internal/NavGraphImpl;", "", "Landroidx/navigation/NavGraph;", "graph", "<init>", "(Landroidx/navigation/NavGraph;)V", "", "route", "", "searchChildren", "searchParent", "Landroidx/navigation/NavDestination;", "lastVisited", "Landroidx/navigation/NavDestination$DeepLinkMatch;", "matchRouteComprehensive$navigation_common_release", "(Ljava/lang/String;ZZLandroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "bestMatch", "Landroidx/navigation/NavDeepLinkRequest;", "navDeepLinkRequest", "matchDeepLinkComprehensive$navigation_common_release", "(Landroidx/navigation/NavDestination$DeepLinkMatch;Landroidx/navigation/NavDeepLinkRequest;ZZLandroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "superBestMatch", "matchDeepLink$navigation_common_release", "(Landroidx/navigation/NavDestination$DeepLinkMatch;Landroidx/navigation/NavDeepLinkRequest;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "node", "", "addDestination$navigation_common_release", "(Landroidx/navigation/NavDestination;)V", "", "nodes", "addDestinations$navigation_common_release", "(Ljava/util/Collection;)V", "", "([Landroidx/navigation/NavDestination;)V", "", "resId", "findNode$navigation_common_release", "(I)Landroidx/navigation/NavDestination;", "matchingDest", "findNodeComprehensive$navigation_common_release", "(ILandroidx/navigation/NavDestination;ZLandroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination;", "(Ljava/lang/String;)Landroidx/navigation/NavDestination;", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;)Landroidx/navigation/NavDestination;", "T", "(Ljava/lang/Object;)Landroidx/navigation/NavDestination;", "searchParents", "(Ljava/lang/String;Z)Landroidx/navigation/NavDestination;", "", "iterator$navigation_common_release", "()Ljava/util/Iterator;", "other", "addAll$navigation_common_release", "remove$navigation_common_release", "clear$navigation_common_release", "()V", "superName", "getDisplayName$navigation_common_release", "(Ljava/lang/String;)Ljava/lang/String;", "startDestId", "setStartDestination$navigation_common_release", "(I)V", "startDestRoute", "(Ljava/lang/String;)V", "(Lkotlin/reflect/KClass;)V", "(Ljava/lang/Object;)V", "Lkotlinx/serialization/KSerializer;", "serializer", "Lkotlin/Function1;", "parseRoute", "(Lkotlinx/serialization/KSerializer;Lkotlin/jvm/functions/Function1;)V", "Landroidx/navigation/NavGraph;", "getGraph", "()Landroidx/navigation/NavGraph;", "Landroidx/collection/SparseArrayCompat;", "Landroidx/collection/SparseArrayCompat;", "getNodes$navigation_common_release", "()Landroidx/collection/SparseArrayCompat;", com.visa.cbp.getEncExpo.warmup, "getStartDestId$navigation_common_release", "()I", "setStartDestId$navigation_common_release", "startDestIdName", "Ljava/lang/String;", "getStartDestIdName$navigation_common_release", "()Ljava/lang/String;", "setStartDestIdName$navigation_common_release", "getStartDestinationId$navigation_common_release", "setStartDestinationId$navigation_common_release", "startDestinationId", "startDestinationRoute", "getStartDestinationRoute$navigation_common_release", "setStartDestinationRoute$navigation_common_release", "getStartDestDisplayName$navigation_common_release", "startDestDisplayName"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavGraphImpl {
    private final androidx.view.NavGraph graph;
    private final androidx.collection.SparseArrayCompat<androidx.view.NavDestination> nodes;
    private int startDestId;
    private java.lang.String startDestIdName;
    private java.lang.String startDestinationRoute;

    public NavGraphImpl(androidx.view.NavGraph navGraph) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navGraph, "");
        this.graph = navGraph;
        this.nodes = new androidx.collection.SparseArrayCompat<>(0, 1, null);
    }

    public final androidx.view.NavGraph getGraph() {
        return this.graph;
    }

    public final androidx.collection.SparseArrayCompat<androidx.view.NavDestination> getNodes$navigation_common_release() {
        return this.nodes;
    }

    /* renamed from: getStartDestId$navigation_common_release, reason: from getter */
    public final int getStartDestId() {
        return this.startDestId;
    }

    public final void setStartDestId$navigation_common_release(int i) {
        this.startDestId = i;
    }

    /* renamed from: getStartDestIdName$navigation_common_release, reason: from getter */
    public final java.lang.String getStartDestIdName() {
        return this.startDestIdName;
    }

    public final void setStartDestIdName$navigation_common_release(java.lang.String str) {
        this.startDestIdName = str;
    }

    public final androidx.navigation.NavDestination.DeepLinkMatch matchRouteComprehensive$navigation_common_release(java.lang.String route, boolean searchChildren, boolean searchParent, androidx.view.NavDestination lastVisited) {
        androidx.navigation.NavDestination.DeepLinkMatch deepLinkMatch;
        androidx.navigation.NavDestination.DeepLinkMatch matchRoute;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(route, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastVisited, "");
        androidx.navigation.NavDestination.DeepLinkMatch matchRoute2 = this.graph.matchRoute(route);
        androidx.navigation.NavDestination.DeepLinkMatch deepLinkMatch2 = null;
        if (searchChildren) {
            androidx.view.NavGraph navGraph = this.graph;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (androidx.view.NavDestination navDestination : navGraph) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(navDestination, lastVisited)) {
                    matchRoute = null;
                } else if (navDestination instanceof androidx.view.NavGraph) {
                    matchRoute = ((androidx.view.NavGraph) navDestination).matchRouteComprehensive(route, true, false, this.graph);
                } else {
                    matchRoute = navDestination.matchRoute(route);
                }
                if (matchRoute != null) {
                    arrayList.add(matchRoute);
                }
            }
            deepLinkMatch = (androidx.navigation.NavDestination.DeepLinkMatch) kotlin.collections.CollectionsKt.maxOrNull((java.lang.Iterable) arrayList);
        } else {
            deepLinkMatch = null;
        }
        androidx.view.NavGraph parent = this.graph.getParent();
        if (parent != null && searchParent && !kotlin.jvm.internal.Intrinsics.areEqual(parent, lastVisited)) {
            deepLinkMatch2 = parent.matchRouteComprehensive(route, searchChildren, true, this.graph);
        }
        return (androidx.navigation.NavDestination.DeepLinkMatch) kotlin.collections.CollectionsKt.maxOrNull((java.lang.Iterable) kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new androidx.navigation.NavDestination.DeepLinkMatch[]{matchRoute2, deepLinkMatch, deepLinkMatch2}));
    }

    public final androidx.navigation.NavDestination.DeepLinkMatch matchDeepLinkComprehensive$navigation_common_release(androidx.navigation.NavDestination.DeepLinkMatch bestMatch, androidx.view.NavDeepLinkRequest navDeepLinkRequest, boolean searchChildren, boolean searchParent, androidx.view.NavDestination lastVisited) {
        androidx.navigation.NavDestination.DeepLinkMatch deepLinkMatch;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navDeepLinkRequest, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastVisited, "");
        androidx.navigation.NavDestination.DeepLinkMatch deepLinkMatch2 = null;
        if (searchChildren) {
            androidx.view.NavGraph navGraph = this.graph;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (androidx.view.NavDestination navDestination : navGraph) {
                androidx.navigation.NavDestination.DeepLinkMatch matchDeepLink = !kotlin.jvm.internal.Intrinsics.areEqual(navDestination, lastVisited) ? navDestination.matchDeepLink(navDeepLinkRequest) : null;
                if (matchDeepLink != null) {
                    arrayList.add(matchDeepLink);
                }
            }
            deepLinkMatch = (androidx.navigation.NavDestination.DeepLinkMatch) kotlin.collections.CollectionsKt.maxOrNull((java.lang.Iterable) arrayList);
        } else {
            deepLinkMatch = null;
        }
        androidx.view.NavGraph parent = this.graph.getParent();
        if (parent != null && searchParent && !kotlin.jvm.internal.Intrinsics.areEqual(parent, lastVisited)) {
            deepLinkMatch2 = parent.matchDeepLinkComprehensive(navDeepLinkRequest, searchChildren, true, this.graph);
        }
        return (androidx.navigation.NavDestination.DeepLinkMatch) kotlin.collections.CollectionsKt.maxOrNull((java.lang.Iterable) kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new androidx.navigation.NavDestination.DeepLinkMatch[]{bestMatch, deepLinkMatch, deepLinkMatch2}));
    }

    public final androidx.navigation.NavDestination.DeepLinkMatch matchDeepLink$navigation_common_release(androidx.navigation.NavDestination.DeepLinkMatch superBestMatch, androidx.view.NavDeepLinkRequest navDeepLinkRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navDeepLinkRequest, "");
        return matchDeepLinkComprehensive$navigation_common_release(superBestMatch, navDeepLinkRequest, true, false, this.graph);
    }

    public final void addDestination$navigation_common_release(androidx.view.NavDestination node) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(node, "");
        int id = node.getId();
        java.lang.String route = node.getRoute();
        if (id == 0 && route == null) {
            throw new java.lang.IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.".toString());
        }
        if (this.graph.getRoute() != null && kotlin.jvm.internal.Intrinsics.areEqual(route, this.graph.getRoute())) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Destination ");
            sb.append(node);
            sb.append(" cannot have the same route as graph ");
            sb.append(this.graph);
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        if (id == this.graph.getId()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Destination ");
            sb2.append(node);
            sb2.append(" cannot have the same id as graph ");
            sb2.append(this.graph);
            throw new java.lang.IllegalArgumentException(sb2.toString().toString());
        }
        androidx.view.NavDestination navDestination = this.nodes.get(id);
        if (navDestination == node) {
            return;
        }
        if (node.getParent() != null) {
            throw new java.lang.IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.".toString());
        }
        if (navDestination != null) {
            navDestination.setParent(null);
        }
        node.setParent(this.graph);
        this.nodes.put(node.getId(), node);
    }

    public final void addDestinations$navigation_common_release(java.util.Collection<? extends androidx.view.NavDestination> nodes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nodes, "");
        for (androidx.view.NavDestination navDestination : nodes) {
            if (navDestination != null) {
                addDestination$navigation_common_release(navDestination);
            }
        }
    }

    public final void addDestinations$navigation_common_release(androidx.view.NavDestination... nodes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nodes, "");
        for (androidx.view.NavDestination navDestination : nodes) {
            addDestination$navigation_common_release(navDestination);
        }
    }

    public final androidx.view.NavDestination findNode$navigation_common_release(int resId) {
        return findNodeComprehensive$navigation_common_release$default(this, resId, this.graph, false, null, 8, null);
    }

    public static /* synthetic */ androidx.view.NavDestination findNodeComprehensive$navigation_common_release$default(androidx.view.internal.NavGraphImpl navGraphImpl, int i, androidx.view.NavDestination navDestination, boolean z, androidx.view.NavDestination navDestination2, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            navDestination2 = null;
        }
        return navGraphImpl.findNodeComprehensive$navigation_common_release(i, navDestination, z, navDestination2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0021, code lost:
    
        if (r0 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final androidx.view.NavDestination findNodeComprehensive$navigation_common_release(int resId, androidx.view.NavDestination lastVisited, boolean searchChildren, androidx.view.NavDestination matchingDest) {
        androidx.view.NavDestination navDestination = this.nodes.get(resId);
        if (matchingDest != null) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(navDestination, matchingDest) || !kotlin.jvm.internal.Intrinsics.areEqual(navDestination.getParent(), matchingDest.getParent())) {
                navDestination = null;
                if (searchChildren) {
                    java.util.Iterator it = kotlin.sequences.SequencesKt.asSequence(androidx.collection.SparseArrayKt.valueIterator(this.nodes)).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            navDestination = null;
                            break;
                        }
                        androidx.view.NavDestination navDestination2 = (androidx.view.NavDestination) it.next();
                        androidx.view.NavDestination findNodeComprehensive = (!(navDestination2 instanceof androidx.view.NavGraph) || kotlin.jvm.internal.Intrinsics.areEqual(navDestination2, lastVisited)) ? null : ((androidx.view.NavGraph) navDestination2).findNodeComprehensive(resId, this.graph, true, matchingDest);
                        if (findNodeComprehensive != null) {
                            navDestination = findNodeComprehensive;
                            break;
                        }
                    }
                }
                if (navDestination != null) {
                    return navDestination;
                }
                if (this.graph.getParent() == null || kotlin.jvm.internal.Intrinsics.areEqual(this.graph.getParent(), lastVisited)) {
                    return null;
                }
                androidx.view.NavGraph parent = this.graph.getParent();
                kotlin.jvm.internal.Intrinsics.checkNotNull(parent);
                return parent.findNodeComprehensive(resId, this.graph, searchChildren, matchingDest);
            }
            return navDestination;
        }
    }

    public final androidx.view.NavDestination findNode$navigation_common_release(java.lang.String route) {
        java.lang.String str = route;
        if (str == null || kotlin.text.StringsKt.isBlank(str)) {
            return null;
        }
        return findNode$navigation_common_release(route, true);
    }

    public final androidx.view.NavDestination findNode$navigation_common_release(kotlin.reflect.KClass<?> route) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(route, "");
        return findNode$navigation_common_release(androidx.view.serialization.RouteSerializerKt.generateHashCode(kotlinx.serialization.SerializersKt.serializer(route)));
    }

    public final <T> androidx.view.NavDestination findNode$navigation_common_release(T route) {
        if (route != null) {
            return findNode$navigation_common_release(androidx.view.serialization.RouteSerializerKt.generateHashCode(kotlinx.serialization.SerializersKt.serializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(route.getClass()))));
        }
        return null;
    }

    public final androidx.view.NavDestination findNode$navigation_common_release(java.lang.String route, boolean searchParents) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(route, "");
        java.util.Iterator it = kotlin.sequences.SequencesKt.asSequence(androidx.collection.SparseArrayKt.valueIterator(this.nodes)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            androidx.view.NavDestination navDestination = (androidx.view.NavDestination) obj;
            if (kotlin.text.StringsKt.equals$default(navDestination.getRoute(), route, false, 2, null) || navDestination.matchRoute(route) != null) {
                break;
            }
        }
        androidx.view.NavDestination navDestination2 = (androidx.view.NavDestination) obj;
        if (navDestination2 != null) {
            return navDestination2;
        }
        if (!searchParents || this.graph.getParent() == null) {
            return null;
        }
        androidx.view.NavGraph parent = this.graph.getParent();
        kotlin.jvm.internal.Intrinsics.checkNotNull(parent);
        return parent.findNode(route);
    }

    public final java.util.Iterator<androidx.view.NavDestination> iterator$navigation_common_release() {
        return new androidx.view.internal.NavGraphImpl$iterator$1(this);
    }

    public final void addAll$navigation_common_release(androidx.view.NavGraph other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
        java.util.Iterator<androidx.view.NavDestination> it = other.iterator();
        while (it.hasNext()) {
            androidx.view.NavDestination next = it.next();
            it.remove();
            addDestination$navigation_common_release(next);
        }
    }

    public final void remove$navigation_common_release(androidx.view.NavDestination node) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(node, "");
        int indexOfKey = this.nodes.indexOfKey(node.getId());
        if (indexOfKey >= 0) {
            this.nodes.valueAt(indexOfKey).setParent(null);
            this.nodes.removeAt(indexOfKey);
        }
    }

    public final void clear$navigation_common_release() {
        java.util.Iterator<androidx.view.NavDestination> iterator$navigation_common_release = iterator$navigation_common_release();
        while (iterator$navigation_common_release.hasNext()) {
            iterator$navigation_common_release.next();
            iterator$navigation_common_release.remove();
        }
    }

    public final java.lang.String getDisplayName$navigation_common_release(java.lang.String superName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(superName, "");
        return this.graph.getId() != 0 ? superName : "the root navigation";
    }

    public final int getStartDestinationId$navigation_common_release() {
        return this.startDestId;
    }

    public final void setStartDestinationId$navigation_common_release(int i) {
        if (i == this.graph.getId()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Start destination ");
            sb.append(i);
            sb.append(" cannot use the same id as the graph ");
            sb.append(this.graph);
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        if (this.startDestinationRoute != null) {
            setStartDestinationRoute$navigation_common_release(null);
        }
        this.startDestId = i;
        this.startDestIdName = null;
    }

    public final void setStartDestination$navigation_common_release(int startDestId) {
        setStartDestinationId$navigation_common_release(startDestId);
    }

    public final void setStartDestination$navigation_common_release(java.lang.String startDestRoute) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startDestRoute, "");
        setStartDestinationRoute$navigation_common_release(startDestRoute);
    }

    public final <T> void setStartDestination$navigation_common_release(kotlin.reflect.KClass<T> startDestRoute) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startDestRoute, "");
        setStartDestination$navigation_common_release(kotlinx.serialization.SerializersKt.serializer(startDestRoute), new kotlin.jvm.functions.Function1() { // from class: androidx.navigation.internal.NavGraphImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.view.internal.NavGraphImpl.$r8$lambda$7NtHsP4cyvSu1B_KzVqgkBGlNQM((androidx.view.NavDestination) obj);
            }
        });
    }

    public final <T> void setStartDestination$navigation_common_release(final T startDestRoute) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startDestRoute, "");
        setStartDestination$navigation_common_release(kotlinx.serialization.SerializersKt.serializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(startDestRoute.getClass())), new kotlin.jvm.functions.Function1() { // from class: androidx.navigation.internal.NavGraphImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.view.internal.NavGraphImpl.m9217$r8$lambda$7ZbhpXAI9PMBHspuuiZmnPe_AE(startDestRoute, (androidx.view.NavDestination) obj);
            }
        });
    }

    public final <T> void setStartDestination$navigation_common_release(kotlinx.serialization.KSerializer<T> serializer, kotlin.jvm.functions.Function1<? super androidx.view.NavDestination, java.lang.String> parseRoute) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parseRoute, "");
        int generateHashCode = androidx.view.serialization.RouteSerializerKt.generateHashCode(serializer);
        androidx.view.NavDestination findNode$navigation_common_release = findNode$navigation_common_release(generateHashCode);
        if (findNode$navigation_common_release == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot find startDestination ");
            sb.append(serializer.getDescriptor().getGetHighSpeedVideoSizes());
            sb.append(" from NavGraph. Ensure the starting NavDestination was added with route from KClass.");
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        setStartDestinationRoute$navigation_common_release(parseRoute.invoke(findNode$navigation_common_release));
        this.startDestId = generateHashCode;
    }

    /* renamed from: getStartDestinationRoute$navigation_common_release, reason: from getter */
    public final java.lang.String getStartDestinationRoute() {
        return this.startDestinationRoute;
    }

    public final void setStartDestinationRoute$navigation_common_release(java.lang.String str) {
        int hashCode;
        if (str == null) {
            hashCode = 0;
        } else {
            if (kotlin.jvm.internal.Intrinsics.areEqual(str, this.graph.getRoute())) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Start destination ");
                sb.append(str);
                sb.append(" cannot use the same route as the graph ");
                sb.append(this.graph);
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            if (kotlin.text.StringsKt.isBlank(str)) {
                throw new java.lang.IllegalArgumentException("Cannot have an empty start destination route".toString());
            }
            hashCode = androidx.view.NavDestination.INSTANCE.createRoute(str).hashCode();
        }
        this.startDestId = hashCode;
        this.startDestinationRoute = str;
    }

    public final java.lang.String getStartDestDisplayName$navigation_common_release() {
        if (this.startDestIdName == null) {
            java.lang.String str = this.startDestinationRoute;
            if (str == null) {
                str = java.lang.String.valueOf(this.startDestId);
            }
            this.startDestIdName = str;
        }
        java.lang.String str2 = this.startDestIdName;
        kotlin.jvm.internal.Intrinsics.checkNotNull(str2);
        return str2;
    }

    public static /* synthetic */ java.lang.String $r8$lambda$7NtHsP4cyvSu1B_KzVqgkBGlNQM(androidx.view.NavDestination navDestination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navDestination, "");
        java.lang.String route = navDestination.getRoute();
        kotlin.jvm.internal.Intrinsics.checkNotNull(route);
        return route;
    }

    /* renamed from: $r8$lambda$7ZbhpXAI9PMBHs-puuiZmnPe_AE, reason: not valid java name */
    public static /* synthetic */ java.lang.String m9217$r8$lambda$7ZbhpXAI9PMBHspuuiZmnPe_AE(java.lang.Object obj, androidx.view.NavDestination navDestination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navDestination, "");
        java.util.Map<java.lang.String, androidx.view.NavArgument> arguments = navDestination.getArguments();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(arguments.size()));
        java.util.Iterator<T> it = arguments.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((androidx.view.NavArgument) entry.getValue()).getType());
        }
        return androidx.view.serialization.RouteSerializerKt.generateRouteWithArgs(obj, linkedHashMap);
    }
}
