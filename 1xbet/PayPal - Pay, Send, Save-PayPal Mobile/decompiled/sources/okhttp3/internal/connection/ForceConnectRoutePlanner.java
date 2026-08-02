package okhttp3.internal.connection;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001b8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Lokhttp3/internal/connection/ForceConnectRoutePlanner;", "Lokhttp3/internal/connection/RoutePlanner;", "Lokhttp3/internal/connection/RealRoutePlanner;", "delegate", "<init>", "(Lokhttp3/internal/connection/RealRoutePlanner;)V", "Lokhttp3/internal/connection/RoutePlanner$Plan;", "plan", "()Lokhttp3/internal/connection/RoutePlanner$Plan;", "Lokhttp3/internal/connection/RealConnection;", "failedConnection", "", "hasNext", "(Lokhttp3/internal/connection/RealConnection;)Z", "isCanceled", "()Z", "Lokhttp3/HttpUrl;", "url", "sameHostAndPort", "(Lokhttp3/HttpUrl;)Z", "getHighSpeedVideoFpsRangesFor", "Lokhttp3/internal/connection/RealRoutePlanner;", "getHighResolutionOutputSizeshNQ4ISI", "Lokhttp3/Address;", "getAddress", "()Lokhttp3/Address;", "address", "Lkotlin/collections/ArrayDeque;", "getDeferredPlans", "()Lkotlin/collections/ArrayDeque;", "deferredPlans"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ForceConnectRoutePlanner implements okhttp3.internal.connection.RoutePlanner {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final okhttp3.internal.connection.RealRoutePlanner getHighResolutionOutputSizeshNQ4ISI;

    public ForceConnectRoutePlanner(okhttp3.internal.connection.RealRoutePlanner realRoutePlanner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realRoutePlanner, "");
        this.getHighResolutionOutputSizeshNQ4ISI = realRoutePlanner;
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final okhttp3.internal.connection.RoutePlanner.Plan plan() {
        return this.getHighResolutionOutputSizeshNQ4ISI.planConnect$okhttp();
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final boolean sameHostAndPort(okhttp3.HttpUrl url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.sameHostAndPort(url);
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final boolean isCanceled() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isCanceled();
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final boolean hasNext(okhttp3.internal.connection.RealConnection failedConnection) {
        return this.getHighResolutionOutputSizeshNQ4ISI.hasNext(failedConnection);
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final kotlin.collections.ArrayDeque<okhttp3.internal.connection.RoutePlanner.Plan> getDeferredPlans() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getDeferredPlans();
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final okhttp3.Address getAddress() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getAddress();
    }
}
