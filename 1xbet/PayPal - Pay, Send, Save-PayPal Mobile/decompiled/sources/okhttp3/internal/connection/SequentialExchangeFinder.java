package okhttp3.internal.connection;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lokhttp3/internal/connection/SequentialExchangeFinder;", "Lokhttp3/internal/connection/ExchangeFinder;", "Lokhttp3/internal/connection/RoutePlanner;", "routePlanner", "<init>", "(Lokhttp3/internal/connection/RoutePlanner;)V", "Lokhttp3/internal/connection/RealConnection;", "find", "()Lokhttp3/internal/connection/RealConnection;", "Lokhttp3/internal/connection/RoutePlanner;", "getRoutePlanner", "()Lokhttp3/internal/connection/RoutePlanner;"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SequentialExchangeFinder implements okhttp3.internal.connection.ExchangeFinder {
    private final okhttp3.internal.connection.RoutePlanner routePlanner;

    public SequentialExchangeFinder(okhttp3.internal.connection.RoutePlanner routePlanner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(routePlanner, "");
        this.routePlanner = routePlanner;
    }

    @Override // okhttp3.internal.connection.ExchangeFinder
    public final okhttp3.internal.connection.RoutePlanner getRoutePlanner() {
        return this.routePlanner;
    }

    @Override // okhttp3.internal.connection.ExchangeFinder
    public final okhttp3.internal.connection.RealConnection find() {
        okhttp3.internal.connection.RoutePlanner.Plan plan;
        java.io.IOException iOException = null;
        while (!getRoutePlanner().isCanceled()) {
            try {
                plan = getRoutePlanner().plan();
            } catch (java.io.IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    kotlin.ExceptionsKt.addSuppressed(iOException, e);
                }
                if (!okhttp3.internal.connection.RoutePlanner.hasNext$default(getRoutePlanner(), null, 1, null)) {
                    throw iOException;
                }
            }
            if (!plan.getIsReady()) {
                okhttp3.internal.connection.RoutePlanner.ConnectResult result = plan.getResult();
                if (result.isSuccess()) {
                    result = plan.mo24422connectTlsEtc();
                }
                okhttp3.internal.connection.RoutePlanner.Plan nextPlan = result.getNextPlan();
                java.lang.Throwable throwable = result.getThrowable();
                if (throwable != null) {
                    throw throwable;
                }
                if (nextPlan != null) {
                    getRoutePlanner().getDeferredPlans().addFirst(nextPlan);
                }
            }
            return plan.mo24419handleSuccess();
        }
        throw new java.io.IOException("Canceled");
    }
}
