package com.paypal.oslo.app.environment;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \u001f2\u00020\u0001:\u0003\u001f !B9\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0017\u0010\u000fR\u001a\u0010\u0018\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\u001c8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0001\u0002\"#"}, d2 = {"Lcom/paypal/oslo/app/environment/Environment;", "", "", "p0", "p1", "p2", "p3", "p4", "Lcom/paypal/oslo/core/network/graphql/config/GraphQlConfig;", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/core/network/graphql/config/GraphQlConfig;)V", "baseUrl", "Ljava/lang/String;", "getBaseUrl", "()Ljava/lang/String;", "appID", "getAppID", "firstPartyClientId", "getFirstPartyClientId", "proxyClientId", "getProxyClientId", "redirectUri", "getRedirectUri", "graphQlConfig", "Lcom/paypal/oslo/core/network/graphql/config/GraphQlConfig;", "getGraphQlConfig", "()Lcom/paypal/oslo/core/network/graphql/config/GraphQlConfig;", "", "isProduction", "()Z", "Companion", "Production", "Stage", "Lcom/paypal/oslo/app/environment/Environment$Production;", "Lcom/paypal/oslo/app/environment/Environment$Stage;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class Environment {
    private final java.lang.String appID;
    private final java.lang.String baseUrl;
    private final java.lang.String firstPartyClientId;
    private final com.paypal.oslo.core.network.graphql.config.GraphQlConfig graphQlConfig;
    private final java.lang.String proxyClientId;
    private final java.lang.String redirectUri;
    public static final int $stable = 8;

    private Environment(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.paypal.oslo.core.network.graphql.config.GraphQlConfig graphQlConfig) {
        this.baseUrl = str;
        this.appID = str2;
        this.firstPartyClientId = str3;
        this.proxyClientId = str4;
        this.redirectUri = str5;
        this.graphQlConfig = graphQlConfig;
    }

    public final java.lang.String getBaseUrl() {
        return this.baseUrl;
    }

    public final java.lang.String getAppID() {
        return this.appID;
    }

    public final java.lang.String getFirstPartyClientId() {
        return this.firstPartyClientId;
    }

    public final java.lang.String getProxyClientId() {
        return this.proxyClientId;
    }

    public final java.lang.String getRedirectUri() {
        return this.redirectUri;
    }

    public final com.paypal.oslo.core.network.graphql.config.GraphQlConfig getGraphQlConfig() {
        return this.graphQlConfig;
    }

    public final boolean isProduction() {
        return this instanceof com.paypal.oslo.app.environment.Environment.Production;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/app/environment/Environment$Production;", "Lcom/paypal/oslo/app/environment/Environment;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Production extends com.paypal.oslo.app.environment.Environment {
        public static final com.paypal.oslo.app.environment.Environment.Production INSTANCE = new com.paypal.oslo.app.environment.Environment.Production();
        public static final int $stable = 8;

        public final int hashCode() {
            return 1828188501;
        }

        private Production() {
            super("https://api-m.paypal.com", "APP-80W284485P519543T", "d3aacf450dd6aa992cfba77067560733", "AV8hdBBM80xlgKsD-OaOQxeeHXJlZlaCvXWgVpvUqZMTdTXy9pmfEXtE1lCq", "urn:ietf:wg:oauth:2.0:oob", new com.paypal.oslo.app.config.AppGraphQlConfig("https://api-m.paypal.com", true), null);
        }

        public final java.lang.String toString() {
            return "Production";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.app.environment.Environment.Production)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/app/environment/Environment$Stage;", "Lcom/paypal/oslo/app/environment/Environment;", "", "baseUrl", "<init>", "(Ljava/lang/String;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Stage extends com.paypal.oslo.app.environment.Environment {
        public static final int $stable = 8;

        public /* synthetic */ Stage(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "https://api.stage2d0122.stage.paypal.com" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Stage(java.lang.String str) {
            super(kotlin.text.StringsKt.trimEnd(str, kotlinx.io.files.FileSystemKt.UnixPathSeparator), "APP-1JE4291016473214C", "walletnativeclientstage2", "ARDnRxBcfQ_3yu-KD44NfpOaKDs5NrF9502WWMbGpt1jaVrVPDXK1GkNTfSP", "urn:ietf:wg:oauth:2.0:oob", new com.paypal.oslo.app.config.AppGraphQlConfig(str, false), null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Stage() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ Environment(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.paypal.oslo.core.network.graphql.config.GraphQlConfig graphQlConfig, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, graphQlConfig);
    }
}
