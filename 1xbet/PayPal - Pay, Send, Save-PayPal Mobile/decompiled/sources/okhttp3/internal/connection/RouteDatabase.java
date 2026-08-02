package okhttp3.internal.connection;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lokhttp3/internal/connection/RouteDatabase;", "", "<init>", "()V", "Lokhttp3/Route;", "failedRoute", "", "failed", "(Lokhttp3/Route;)V", "route", "connected", "", "shouldPostpone", "(Lokhttp3/Route;)Z", "", "_failedRoutes", "Ljava/util/Set;", "", "getFailedRoutes", "()Ljava/util/Set;", "failedRoutes"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RouteDatabase {
    private final java.util.Set<okhttp3.Route> _failedRoutes = new java.util.LinkedHashSet();

    public final java.util.Set<okhttp3.Route> getFailedRoutes() {
        java.util.Set<okhttp3.Route> set;
        synchronized (this) {
            set = kotlin.collections.CollectionsKt.toSet(this._failedRoutes);
        }
        return set;
    }

    public final void failed(okhttp3.Route failedRoute) {
        synchronized (this) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failedRoute, "");
            this._failedRoutes.add(failedRoute);
        }
    }

    public final void connected(okhttp3.Route route) {
        synchronized (this) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(route, "");
            this._failedRoutes.remove(route);
        }
    }

    public final boolean shouldPostpone(okhttp3.Route route) {
        boolean contains;
        synchronized (this) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(route, "");
            contains = this._failedRoutes.contains(route);
        }
        return contains;
    }
}
