package com.zettle.sdk.analytics;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005"}, d2 = {"Lcom/zettle/sdk/analytics/Gdp;", "", "Adapter", "DataFormatter", "Event", "Session"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface Gdp {

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u0013\u0010\r"}, d2 = {"Lcom/zettle/sdk/analytics/Gdp$Event;", "Lcom/zettle/sdk/analytics/Analytics$Event;", "", "domain", "subdomain", "page", "action", "Lorg/json/JSONObject;", "payload", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V", "Ljava/lang/String;", "getAction", "()Ljava/lang/String;", "getDomain", "getPage", "Lorg/json/JSONObject;", "getPayload", "()Lorg/json/JSONObject;", "getSubdomain"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Event implements com.zettle.sdk.analytics.Analytics.Event {
        private final java.lang.String action;
        private final java.lang.String domain;
        private final java.lang.String page;
        private final org.json.JSONObject payload;
        private final java.lang.String subdomain;

        public Event(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, org.json.JSONObject jSONObject) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jSONObject, "");
            this.domain = str;
            this.subdomain = str2;
            this.page = str3;
            this.action = str4;
            this.payload = jSONObject;
        }

        public final java.lang.String getAction() {
            return this.action;
        }

        public final java.lang.String getDomain() {
            return this.domain;
        }

        public final java.lang.String getPage() {
            return this.page;
        }

        public final org.json.JSONObject getPayload() {
            return this.payload;
        }

        public final java.lang.String getSubdomain() {
            return this.subdomain;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002"}, d2 = {"Lcom/zettle/sdk/analytics/Gdp$Adapter;", "Lcom/zettle/sdk/analytics/Analytics$Adapter;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Adapter extends com.zettle.sdk.analytics.Analytics.Adapter {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.zettle.sdk.analytics.Gdp.Adapter.Companion INSTANCE = com.zettle.sdk.analytics.Gdp.Adapter.Companion.getHighSpeedVideoFpsRanges;

        @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/zettle/sdk/analytics/Gdp$Adapter$Companion;", "", "<init>", "()V", "Lcom/zettle/sdk/core/user/MerchantProvider;", "merchantProvider", "Lcom/zettle/sdk/meta/AppInfo;", "appInfo", "Lcom/zettle/sdk/analytics/Gdp$Adapter;", "create", "(Lcom/zettle/sdk/core/user/MerchantProvider;Lcom/zettle/sdk/meta/AppInfo;)Lcom/zettle/sdk/analytics/Gdp$Adapter;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ com.zettle.sdk.analytics.Gdp.Adapter.Companion getHighSpeedVideoFpsRanges = new com.zettle.sdk.analytics.Gdp.Adapter.Companion();

            private Companion() {
            }

            public final com.zettle.sdk.analytics.Gdp.Adapter create(com.zettle.sdk.core.user.MerchantProvider merchantProvider, com.zettle.sdk.meta.AppInfo appInfo) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantProvider, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "");
                return new com.zettle.sdk.analytics.GdpAdapterImpl(merchantProvider, appInfo);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/analytics/Gdp$Session;", "", "", "timestamp", "", io.ktor.http.LinkHeader.Rel.Next, "(J)Ljava/lang/String;", "Instance"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Session {

        /* renamed from: Instance, reason: from kotlin metadata */
        public static final com.zettle.sdk.analytics.Gdp.Session.Companion INSTANCE = com.zettle.sdk.analytics.Gdp.Session.Companion.getHighSpeedVideoFpsRanges;

        java.lang.String next(long timestamp);

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/analytics/Gdp$Session$Instance;", "Lcom/zettle/sdk/analytics/Gdp$Session;", "<init>", "()V", "", "timestamp", "", io.ktor.http.LinkHeader.Rel.Next, "(J)Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.zettle.sdk.analytics.Gdp$Session$Instance, reason: from kotlin metadata */
        public static final class Companion implements com.zettle.sdk.analytics.Gdp.Session {
            static final /* synthetic */ com.zettle.sdk.analytics.Gdp.Session.Companion getHighSpeedVideoFpsRanges = new com.zettle.sdk.analytics.Gdp.Session.Companion();
            private final /* synthetic */ com.zettle.sdk.analytics.SessionImpl getHighResolutionOutputSizeshNQ4ISI = new com.zettle.sdk.analytics.SessionImpl(5, java.util.concurrent.TimeUnit.MINUTES, null, 4, null);

            private Companion() {
            }

            @Override // com.zettle.sdk.analytics.Gdp.Session
            public final java.lang.String next(long timestamp) {
                return this.getHighResolutionOutputSizeshNQ4ISI.next(timestamp);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/analytics/Gdp$DataFormatter;", "", "", "timestamp", "", "format", "(J)Ljava/lang/String;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface DataFormatter {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.zettle.sdk.analytics.Gdp.DataFormatter.Companion INSTANCE = com.zettle.sdk.analytics.Gdp.DataFormatter.Companion.getHighSpeedVideoSizes;

        java.lang.String format(long timestamp);

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/analytics/Gdp$DataFormatter$Companion;", "", "<init>", "()V", "Lcom/zettle/sdk/analytics/Gdp$DataFormatter;", "create", "()Lcom/zettle/sdk/analytics/Gdp$DataFormatter;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ com.zettle.sdk.analytics.Gdp.DataFormatter.Companion getHighSpeedVideoSizes = new com.zettle.sdk.analytics.Gdp.DataFormatter.Companion();

            private Companion() {
            }

            public final com.zettle.sdk.analytics.Gdp.DataFormatter create() {
                return new com.zettle.sdk.analytics.SynchronizedDataFormatterImpl();
            }
        }
    }
}
