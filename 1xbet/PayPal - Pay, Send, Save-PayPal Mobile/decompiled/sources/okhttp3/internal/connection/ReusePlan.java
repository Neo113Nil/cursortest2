package okhttp3.internal.connection;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\u00108\u0017X\u0097D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013"}, d2 = {"Lokhttp3/internal/connection/ReusePlan;", "Lokhttp3/internal/connection/RoutePlanner$Plan;", "Lokhttp3/internal/connection/RealConnection;", "connection", "<init>", "(Lokhttp3/internal/connection/RealConnection;)V", "", "connectTcp", "()Ljava/lang/Void;", "connectTlsEtc", "handleSuccess", "()Lokhttp3/internal/connection/RealConnection;", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "retry", "Lokhttp3/internal/connection/RealConnection;", "getConnection", "", "isReady", "Z", "()Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ReusePlan implements okhttp3.internal.connection.RoutePlanner.Plan {
    private final okhttp3.internal.connection.RealConnection connection;
    private final boolean isReady;

    public ReusePlan(okhttp3.internal.connection.RealConnection realConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realConnection, "");
        this.connection = realConnection;
        this.isReady = true;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: connectTcp, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ okhttp3.internal.connection.RoutePlanner.ConnectResult mo24421connectTcp() {
        return (okhttp3.internal.connection.RoutePlanner.ConnectResult) connectTcp();
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: connectTlsEtc, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ okhttp3.internal.connection.RoutePlanner.ConnectResult mo24422connectTlsEtc() {
        return (okhttp3.internal.connection.RoutePlanner.ConnectResult) connectTlsEtc();
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: retry */
    public final /* bridge */ /* synthetic */ okhttp3.internal.connection.RoutePlanner.Plan mo24420retry() {
        return (okhttp3.internal.connection.RoutePlanner.Plan) retry();
    }

    public final okhttp3.internal.connection.RealConnection getConnection() {
        return this.connection;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: isReady, reason: from getter */
    public final boolean getIsReady() {
        return this.isReady;
    }

    public final java.lang.Void connectTcp() {
        throw new java.lang.IllegalStateException("already connected".toString());
    }

    public final java.lang.Void connectTlsEtc() {
        throw new java.lang.IllegalStateException("already connected".toString());
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: handleSuccess */
    public final okhttp3.internal.connection.RealConnection mo24419handleSuccess() {
        return this.connection;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan, okhttp3.internal.http.ExchangeCodec.Carrier
    /* renamed from: cancel, reason: merged with bridge method [inline-methods] */
    public final java.lang.Void mo24418cancel() {
        throw new java.lang.IllegalStateException("unexpected cancel".toString());
    }

    public final java.lang.Void retry() {
        throw new java.lang.IllegalStateException("unexpected retry".toString());
    }
}
