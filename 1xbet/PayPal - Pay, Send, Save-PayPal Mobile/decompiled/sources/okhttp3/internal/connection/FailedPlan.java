package okhttp3.internal.connection;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00128\u0017X\u0097D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015"}, d2 = {"Lokhttp3/internal/connection/FailedPlan;", "Lokhttp3/internal/connection/RoutePlanner$Plan;", "", "e", "<init>", "(Ljava/lang/Throwable;)V", "Lokhttp3/internal/connection/RoutePlanner$ConnectResult;", "connectTcp", "()Lokhttp3/internal/connection/RoutePlanner$ConnectResult;", "connectTlsEtc", "", "handleSuccess", "()Ljava/lang/Void;", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "retry", "result", "Lokhttp3/internal/connection/RoutePlanner$ConnectResult;", "getResult", "", "isReady", "Z", "()Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FailedPlan implements okhttp3.internal.connection.RoutePlanner.Plan {
    private final boolean isReady;
    private final okhttp3.internal.connection.RoutePlanner.ConnectResult result;

    public FailedPlan(java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        this.result = new okhttp3.internal.connection.RoutePlanner.ConnectResult(this, null, th, 2, null);
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: handleSuccess, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ okhttp3.internal.connection.RealConnection mo24419handleSuccess() {
        return (okhttp3.internal.connection.RealConnection) handleSuccess();
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: retry, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ okhttp3.internal.connection.RoutePlanner.Plan mo24420retry() {
        return (okhttp3.internal.connection.RoutePlanner.Plan) retry();
    }

    public final okhttp3.internal.connection.RoutePlanner.ConnectResult getResult() {
        return this.result;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: isReady, reason: from getter */
    public final boolean getIsReady() {
        return this.isReady;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: connectTcp, reason: from getter */
    public final okhttp3.internal.connection.RoutePlanner.ConnectResult getResult() {
        return this.result;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: connectTlsEtc */
    public final okhttp3.internal.connection.RoutePlanner.ConnectResult mo24422connectTlsEtc() {
        return this.result;
    }

    public final java.lang.Void handleSuccess() {
        throw new java.lang.IllegalStateException("unexpected call".toString());
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
