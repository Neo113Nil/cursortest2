package gatewayprotocol.v1;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import gatewayprotocol.v1.SessionCountersOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SessionCountersKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/SessionCountersKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SessionCountersKt {
    public static final SessionCountersKt INSTANCE = new SessionCountersKt();

    private SessionCountersKt() {
    }

    /* compiled from: SessionCountersKt.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b2\b\u0007\u0018\u0000 A2\u00020\u0001:\u0001AB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0010J\u0006\u0010\u001c\u001a\u00020\u0010J\u0006\u0010 \u001a\u00020\u0010J\u0006\u0010$\u001a\u00020\u0010J\u0006\u0010(\u001a\u00020\u0010J\u0006\u0010,\u001a\u00020\u0010J\u0006\u00100\u001a\u00020\u0010J\u0006\u00104\u001a\u00020\u0010J\u0006\u00108\u001a\u00020\u0010J\u0006\u0010<\u001a\u00020\u0010J\u0006\u0010@\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR$\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR$\u0010\u0019\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u000eR$\u0010\u001d\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010\u000eR$\u0010!\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR$\u0010%\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010\f\"\u0004\b'\u0010\u000eR$\u0010)\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010\f\"\u0004\b+\u0010\u000eR$\u0010-\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010\f\"\u0004\b/\u0010\u000eR$\u00101\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u0010\f\"\u0004\b3\u0010\u000eR$\u00105\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u0010\f\"\u0004\b7\u0010\u000eR$\u00109\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u0010\f\"\u0004\b;\u0010\u000eR$\u0010=\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b>\u0010\f\"\u0004\b?\u0010\u000e¨\u0006B"}, d2 = {"Lgatewayprotocol/v1/SessionCountersKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;", "<init>", "(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;)V", "_build", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "value", "", "loadRequests", "getLoadRequests", "()I", "setLoadRequests", "(I)V", "clearLoadRequests", "", "loadRequestsAdm", "getLoadRequestsAdm", "setLoadRequestsAdm", "clearLoadRequestsAdm", "bannerLoadRequests", "getBannerLoadRequests", "setBannerLoadRequests", "clearBannerLoadRequests", "bannerRequestsAdm", "getBannerRequestsAdm", "setBannerRequestsAdm", "clearBannerRequestsAdm", "bannerImpressions", "getBannerImpressions", "setBannerImpressions", "clearBannerImpressions", "globalAdsFocusTime", "getGlobalAdsFocusTime", "setGlobalAdsFocusTime", "clearGlobalAdsFocusTime", "globalAdsFocusChangeCount", "getGlobalAdsFocusChangeCount", "setGlobalAdsFocusChangeCount", "clearGlobalAdsFocusChangeCount", "focusChangeCount", "getFocusChangeCount", "setFocusChangeCount", "clearFocusChangeCount", "initializationLatency", "getInitializationLatency", "setInitializationLatency", "clearInitializationLatency", "lastLoadLatency", "getLastLoadLatency", "setLastLoadLatency", "clearLastLoadLatency", "allErrorsCount", "getAllErrorsCount", "setAllErrorsCount", "clearAllErrorsCount", "cacheTimeoutErrorsCount", "getCacheTimeoutErrorsCount", "setCacheTimeoutErrorsCount", "clearCacheTimeoutErrorsCount", "successCount", "getSuccessCount", "setSuccessCount", "clearSuccessCount", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final SessionCountersOuterClass.SessionCounters.Builder _builder;

        public /* synthetic */ Dsl(SessionCountersOuterClass.SessionCounters.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(SessionCountersOuterClass.SessionCounters.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: SessionCountersKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/SessionCountersKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/SessionCountersKt$Dsl;", "builder", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(SessionCountersOuterClass.SessionCounters.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ SessionCountersOuterClass.SessionCounters _build() {
            SessionCountersOuterClass.SessionCounters build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }

        public final int getLoadRequests() {
            return this._builder.getLoadRequests();
        }

        public final void setLoadRequests(int i) {
            this._builder.setLoadRequests(i);
        }

        public final void clearLoadRequests() {
            this._builder.clearLoadRequests();
        }

        public final int getLoadRequestsAdm() {
            return this._builder.getLoadRequestsAdm();
        }

        public final void setLoadRequestsAdm(int i) {
            this._builder.setLoadRequestsAdm(i);
        }

        public final void clearLoadRequestsAdm() {
            this._builder.clearLoadRequestsAdm();
        }

        public final int getBannerLoadRequests() {
            return this._builder.getBannerLoadRequests();
        }

        public final void setBannerLoadRequests(int i) {
            this._builder.setBannerLoadRequests(i);
        }

        public final void clearBannerLoadRequests() {
            this._builder.clearBannerLoadRequests();
        }

        public final int getBannerRequestsAdm() {
            return this._builder.getBannerRequestsAdm();
        }

        public final void setBannerRequestsAdm(int i) {
            this._builder.setBannerRequestsAdm(i);
        }

        public final void clearBannerRequestsAdm() {
            this._builder.clearBannerRequestsAdm();
        }

        public final int getBannerImpressions() {
            return this._builder.getBannerImpressions();
        }

        public final void setBannerImpressions(int i) {
            this._builder.setBannerImpressions(i);
        }

        public final void clearBannerImpressions() {
            this._builder.clearBannerImpressions();
        }

        public final int getGlobalAdsFocusTime() {
            return this._builder.getGlobalAdsFocusTime();
        }

        public final void setGlobalAdsFocusTime(int i) {
            this._builder.setGlobalAdsFocusTime(i);
        }

        public final void clearGlobalAdsFocusTime() {
            this._builder.clearGlobalAdsFocusTime();
        }

        public final int getGlobalAdsFocusChangeCount() {
            return this._builder.getGlobalAdsFocusChangeCount();
        }

        public final void setGlobalAdsFocusChangeCount(int i) {
            this._builder.setGlobalAdsFocusChangeCount(i);
        }

        public final void clearGlobalAdsFocusChangeCount() {
            this._builder.clearGlobalAdsFocusChangeCount();
        }

        public final int getFocusChangeCount() {
            return this._builder.getFocusChangeCount();
        }

        public final void setFocusChangeCount(int i) {
            this._builder.setFocusChangeCount(i);
        }

        public final void clearFocusChangeCount() {
            this._builder.clearFocusChangeCount();
        }

        public final int getInitializationLatency() {
            return this._builder.getInitializationLatency();
        }

        public final void setInitializationLatency(int i) {
            this._builder.setInitializationLatency(i);
        }

        public final void clearInitializationLatency() {
            this._builder.clearInitializationLatency();
        }

        public final int getLastLoadLatency() {
            return this._builder.getLastLoadLatency();
        }

        public final void setLastLoadLatency(int i) {
            this._builder.setLastLoadLatency(i);
        }

        public final void clearLastLoadLatency() {
            this._builder.clearLastLoadLatency();
        }

        public final int getAllErrorsCount() {
            return this._builder.getAllErrorsCount();
        }

        public final void setAllErrorsCount(int i) {
            this._builder.setAllErrorsCount(i);
        }

        public final void clearAllErrorsCount() {
            this._builder.clearAllErrorsCount();
        }

        public final int getCacheTimeoutErrorsCount() {
            return this._builder.getCacheTimeoutErrorsCount();
        }

        public final void setCacheTimeoutErrorsCount(int i) {
            this._builder.setCacheTimeoutErrorsCount(i);
        }

        public final void clearCacheTimeoutErrorsCount() {
            this._builder.clearCacheTimeoutErrorsCount();
        }

        public final int getSuccessCount() {
            return this._builder.getSuccessCount();
        }

        public final void setSuccessCount(int i) {
            this._builder.setSuccessCount(i);
        }

        public final void clearSuccessCount() {
            this._builder.clearSuccessCount();
        }
    }
}
