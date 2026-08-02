package androidx.view;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\u0004\u0010\u0005\u001a.\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\u0006*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0086\n¢\u0006\u0004\b\u0004\u0010\t\u001a&\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0007*\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b\u0004\u0010\n\u001a\u001c\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\f\u0010\r\u001a.\u0010\f\u001a\u00020\u000b\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\u0006*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0086\n¢\u0006\u0004\b\f\u0010\u000e\u001a&\u0010\f\u001a\u00020\u000b\"\b\b\u0000\u0010\u0007*\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\f\u0010\u000f\u001a\u001c\u0010\u0011\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001c\u0010\u0011\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\u0011\u0010\u0013\u001a\u001c\u0010\u0014\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u0014\u0010\u0012"}, d2 = {"Landroidx/navigation/NavGraph;", "", "p0", "Landroidx/navigation/NavDestination;", "get", "(Landroidx/navigation/NavGraph;Ljava/lang/String;)Landroidx/navigation/NavDestination;", "", "T", "Lkotlin/reflect/KClass;", "(Landroidx/navigation/NavGraph;Lkotlin/reflect/KClass;)Landroidx/navigation/NavDestination;", "(Landroidx/navigation/NavGraph;Ljava/lang/Object;)Landroidx/navigation/NavDestination;", "", "contains", "(Landroidx/navigation/NavGraph;Ljava/lang/String;)Z", "(Landroidx/navigation/NavGraph;Lkotlin/reflect/KClass;)Z", "(Landroidx/navigation/NavGraph;Ljava/lang/Object;)Z", "", "plusAssign", "(Landroidx/navigation/NavGraph;Landroidx/navigation/NavDestination;)V", "(Landroidx/navigation/NavGraph;Landroidx/navigation/NavGraph;)V", "minusAssign"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/navigation/NavGraphKt")
/* loaded from: classes7.dex */
final /* synthetic */ class NavGraphKt__NavGraphKt {
    public static final androidx.view.NavDestination get(androidx.view.NavGraph navGraph, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navGraph, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.view.NavDestination findNode = navGraph.findNode(str);
        if (findNode != null) {
            return findNode;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("No destination for ");
        sb.append(str);
        sb.append(" was found in ");
        sb.append(navGraph);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static final <T> androidx.view.NavDestination get(androidx.view.NavGraph navGraph, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navGraph, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        androidx.view.NavDestination findNode = navGraph.findNode((androidx.view.NavGraph) t);
        if (findNode != null) {
            return findNode;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("No destination for ");
        sb.append(t);
        sb.append(" was found in ");
        sb.append(navGraph);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static final boolean contains(androidx.view.NavGraph navGraph, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navGraph, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return navGraph.findNode(str) != null;
    }

    public static final <T> boolean contains(androidx.view.NavGraph navGraph, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navGraph, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        return navGraph.findNode((androidx.view.NavGraph) t) != null;
    }

    public static final void plusAssign(androidx.view.NavGraph navGraph, androidx.view.NavDestination navDestination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navGraph, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navDestination, "");
        navGraph.addDestination(navDestination);
    }

    public static final void plusAssign(androidx.view.NavGraph navGraph, androidx.view.NavGraph navGraph2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navGraph, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navGraph2, "");
        navGraph.addAll(navGraph2);
    }

    public static final void minusAssign(androidx.view.NavGraph navGraph, androidx.view.NavDestination navDestination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navGraph, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navDestination, "");
        navGraph.remove(navDestination);
    }

    public static final /* synthetic */ <T> androidx.view.NavDestination get(androidx.view.NavGraph navGraph, kotlin.reflect.KClass<T> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navGraph, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        androidx.view.NavDestination findNode = navGraph.findNode(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
        if (findNode != null) {
            return findNode;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("No destination for ");
        sb.append(kClass);
        sb.append(" was found in ");
        sb.append(navGraph);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static final /* synthetic */ <T> boolean contains(androidx.view.NavGraph navGraph, kotlin.reflect.KClass<T> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navGraph, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return navGraph.findNode(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class)) != null;
    }
}
