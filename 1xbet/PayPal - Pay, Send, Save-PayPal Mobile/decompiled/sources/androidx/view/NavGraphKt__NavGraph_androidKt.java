package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/navigation/NavGraph;", "", "p0", "Landroidx/navigation/NavDestination;", "get", "(Landroidx/navigation/NavGraph;I)Landroidx/navigation/NavDestination;", "", "contains", "(Landroidx/navigation/NavGraph;I)Z"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/navigation/NavGraphKt")
/* loaded from: classes7.dex */
final /* synthetic */ class NavGraphKt__NavGraph_androidKt {
    public static final androidx.view.NavDestination get(androidx.view.NavGraph navGraph, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navGraph, "");
        androidx.view.NavDestination findNode = navGraph.findNode(i);
        if (findNode != null) {
            return findNode;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("No destination for ");
        sb.append(i);
        sb.append(" was found in ");
        sb.append(navGraph);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static final boolean contains(androidx.view.NavGraph navGraph, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navGraph, "");
        return navGraph.findNode(i) != null;
    }
}
