package okhttp3.internal.connection;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0002\u0018\u0019J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00148'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016À\u0006\u0003"}, d2 = {"Lokhttp3/internal/connection/RoutePlanner;", "", "", "isCanceled", "()Z", "Lokhttp3/internal/connection/RoutePlanner$Plan;", "plan", "()Lokhttp3/internal/connection/RoutePlanner$Plan;", "Lokhttp3/internal/connection/RealConnection;", "failedConnection", "hasNext", "(Lokhttp3/internal/connection/RealConnection;)Z", "Lokhttp3/HttpUrl;", "url", "sameHostAndPort", "(Lokhttp3/HttpUrl;)Z", "Lokhttp3/Address;", "getAddress", "()Lokhttp3/Address;", "address", "Lkotlin/collections/ArrayDeque;", "getDeferredPlans", "()Lkotlin/collections/ArrayDeque;", "deferredPlans", "Plan", "ConnectResult"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface RoutePlanner {

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u0000H&¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010À\u0006\u0003"}, d2 = {"Lokhttp3/internal/connection/RoutePlanner$Plan;", "", "Lokhttp3/internal/connection/RoutePlanner$ConnectResult;", "connectTcp", "()Lokhttp3/internal/connection/RoutePlanner$ConnectResult;", "connectTlsEtc", "Lokhttp3/internal/connection/RealConnection;", "handleSuccess", "()Lokhttp3/internal/connection/RealConnection;", "", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "()V", "retry", "()Lokhttp3/internal/connection/RoutePlanner$Plan;", "", "isReady", "()Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Plan {
        /* renamed from: cancel */
        void mo24418cancel();

        /* renamed from: connectTcp */
        okhttp3.internal.connection.RoutePlanner.ConnectResult mo24421connectTcp();

        /* renamed from: connectTlsEtc */
        okhttp3.internal.connection.RoutePlanner.ConnectResult mo24422connectTlsEtc();

        /* renamed from: handleSuccess */
        okhttp3.internal.connection.RealConnection mo24419handleSuccess();

        boolean isReady();

        /* renamed from: retry */
        okhttp3.internal.connection.RoutePlanner.Plan mo24420retry();
    }

    okhttp3.Address getAddress();

    kotlin.collections.ArrayDeque<okhttp3.internal.connection.RoutePlanner.Plan> getDeferredPlans();

    boolean hasNext(okhttp3.internal.connection.RealConnection failedConnection);

    boolean isCanceled();

    okhttp3.internal.connection.RoutePlanner.Plan plan() throws java.io.IOException;

    boolean sameHostAndPort(okhttp3.HttpUrl url);

    @kotlin.Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ boolean hasNext$default(okhttp3.internal.connection.RoutePlanner routePlanner, okhttp3.internal.connection.RealConnection realConnection, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hasNext");
        }
        if ((i & 1) != 0) {
            realConnection = null;
        }
        return routePlanner.hasNext(realConnection);
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u0011\u0010\u001f\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u001f\u0010 "}, d2 = {"Lokhttp3/internal/connection/RoutePlanner$ConnectResult;", "", "Lokhttp3/internal/connection/RoutePlanner$Plan;", "plan", "nextPlan", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Lokhttp3/internal/connection/RoutePlanner$Plan;Lokhttp3/internal/connection/RoutePlanner$Plan;Ljava/lang/Throwable;)V", "component1", "()Lokhttp3/internal/connection/RoutePlanner$Plan;", "component2", "component3", "()Ljava/lang/Throwable;", "copy", "(Lokhttp3/internal/connection/RoutePlanner$Plan;Lokhttp3/internal/connection/RoutePlanner$Plan;Ljava/lang/Throwable;)Lokhttp3/internal/connection/RoutePlanner$ConnectResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lokhttp3/internal/connection/RoutePlanner$Plan;", "getPlan", "getNextPlan", "Ljava/lang/Throwable;", "getThrowable", "isSuccess", "()Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConnectResult {
        private final okhttp3.internal.connection.RoutePlanner.Plan nextPlan;
        private final okhttp3.internal.connection.RoutePlanner.Plan plan;
        private final java.lang.Throwable throwable;

        public ConnectResult(okhttp3.internal.connection.RoutePlanner.Plan plan, okhttp3.internal.connection.RoutePlanner.Plan plan2, java.lang.Throwable th) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plan, "");
            this.plan = plan;
            this.nextPlan = plan2;
            this.throwable = th;
        }

        public /* synthetic */ ConnectResult(okhttp3.internal.connection.RoutePlanner.Plan plan, okhttp3.internal.connection.RoutePlanner.Plan plan2, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(plan, (i & 2) != 0 ? null : plan2, (i & 4) != 0 ? null : th);
        }

        public final okhttp3.internal.connection.RoutePlanner.Plan getPlan() {
            return this.plan;
        }

        public final okhttp3.internal.connection.RoutePlanner.Plan getNextPlan() {
            return this.nextPlan;
        }

        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        public final boolean isSuccess() {
            return this.nextPlan == null && this.throwable == null;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ConnectResult(plan=");
            sb.append(this.plan);
            sb.append(", nextPlan=");
            sb.append(this.nextPlan);
            sb.append(", throwable=");
            sb.append(this.throwable);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.plan.hashCode();
            okhttp3.internal.connection.RoutePlanner.Plan plan = this.nextPlan;
            int hashCode2 = plan == null ? 0 : plan.hashCode();
            java.lang.Throwable th = this.throwable;
            return (((hashCode * 31) + hashCode2) * 31) + (th != null ? th.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof okhttp3.internal.connection.RoutePlanner.ConnectResult)) {
                return false;
            }
            okhttp3.internal.connection.RoutePlanner.ConnectResult connectResult = (okhttp3.internal.connection.RoutePlanner.ConnectResult) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.plan, connectResult.plan) && kotlin.jvm.internal.Intrinsics.areEqual(this.nextPlan, connectResult.nextPlan) && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, connectResult.throwable);
        }

        public final okhttp3.internal.connection.RoutePlanner.ConnectResult copy(okhttp3.internal.connection.RoutePlanner.Plan plan, okhttp3.internal.connection.RoutePlanner.Plan nextPlan, java.lang.Throwable throwable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plan, "");
            return new okhttp3.internal.connection.RoutePlanner.ConnectResult(plan, nextPlan, throwable);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        /* renamed from: component2, reason: from getter */
        public final okhttp3.internal.connection.RoutePlanner.Plan getNextPlan() {
            return this.nextPlan;
        }

        /* renamed from: component1, reason: from getter */
        public final okhttp3.internal.connection.RoutePlanner.Plan getPlan() {
            return this.plan;
        }

        public static /* synthetic */ okhttp3.internal.connection.RoutePlanner.ConnectResult copy$default(okhttp3.internal.connection.RoutePlanner.ConnectResult connectResult, okhttp3.internal.connection.RoutePlanner.Plan plan, okhttp3.internal.connection.RoutePlanner.Plan plan2, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                plan = connectResult.plan;
            }
            if ((i & 2) != 0) {
                plan2 = connectResult.nextPlan;
            }
            if ((i & 4) != 0) {
                th = connectResult.throwable;
            }
            return connectResult.copy(plan, plan2, th);
        }
    }
}
