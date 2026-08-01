package gatewayprotocol.v1;

import com.facebook.share.internal.ShareConstants;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.ironsource.L6;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InitializationRequestKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/InitializationRequestKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InitializationRequestKt {
    public static final InitializationRequestKt INSTANCE = new InitializationRequestKt();

    private InitializationRequestKt() {
    }

    /* compiled from: InitializationRequestKt.kt */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 \u0088\u00012\u00020\u0001:\u0004\u0088\u0001\u0089\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0019\u001a\u00020\u0010J\u0006\u0010\u001a\u001a\u00020\u0012J\u0006\u0010!\u001a\u00020\u0010J\u0006\u0010%\u001a\u00020\u0010J\u0006\u0010)\u001a\u00020\u0010J\u0006\u0010*\u001a\u00020\u0012J\u0006\u0010.\u001a\u00020\u0010J\u0006\u0010/\u001a\u00020\u0012J\u0006\u00103\u001a\u00020\u0010J\u0006\u00104\u001a\u00020\u0012J\u0006\u00108\u001a\u00020\u0010J\u0006\u00109\u001a\u00020\u0012J\u0006\u0010@\u001a\u00020\u0010J\u0006\u0010A\u001a\u00020\u0012J\u0006\u0010G\u001a\u00020\u0010J\u0006\u0010K\u001a\u00020\u0010J\u0006\u0010L\u001a\u00020\u0012J\u0006\u0010P\u001a\u00020\u0010J\u0006\u0010Q\u001a\u00020\u0012J\u0006\u0010U\u001a\u00020\u0010J\u0006\u0010V\u001a\u00020\u0012J\u0006\u0010Z\u001a\u00020\u0010J\u0006\u0010[\u001a\u00020\u0012J\u0006\u0010_\u001a\u00020\u0010J\u0006\u0010`\u001a\u00020\u0012J3\u0010f\u001a\u00020\u0010*\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020c0b2\u0006\u0010g\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001bH\u0007¢\u0006\u0002\bhJ4\u0010i\u001a\u00020\u0010*\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020c0b2\u0006\u0010g\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001bH\u0087\n¢\u0006\u0002\bjJ+\u0010k\u001a\u00020\u0010*\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020c0b2\u0006\u0010g\u001a\u00020\u001bH\u0007¢\u0006\u0002\blJ7\u0010m\u001a\u00020\u0010*\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020c0b2\u0012\u0010n\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0oH\u0007¢\u0006\u0002\bpJ#\u0010q\u001a\u00020\u0010*\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020c0bH\u0007¢\u0006\u0002\brJ\u0006\u0010v\u001a\u00020\u0010J\u0006\u0010w\u001a\u00020\u0012J\u0006\u0010~\u001a\u00020\u0010J\u0006\u0010\u007f\u001a\u00020\u0012J\u0007\u0010\u0086\u0001\u001a\u00020\u0010J\u0007\u0010\u0087\u0001\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\"\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R$\u0010&\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010\u0016\"\u0004\b(\u0010\u0018R$\u0010+\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010\u001e\"\u0004\b-\u0010 R$\u00100\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u0010\u0016\"\u0004\b2\u0010\u0018R$\u00105\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u0010\u001e\"\u0004\b7\u0010 R$\u0010;\u001a\u00020:2\u0006\u0010\b\u001a\u00020:8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010B\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010H\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u0010\u001e\"\u0004\bJ\u0010 R$\u0010M\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u0010\u0016\"\u0004\bO\u0010\u0018R$\u0010R\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bS\u0010\u0016\"\u0004\bT\u0010\u0018R$\u0010W\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bX\u0010\u0016\"\u0004\bY\u0010\u0018R$\u0010\\\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b]\u0010\u001e\"\u0004\b^\u0010 R#\u0010a\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020c0b8G¢\u0006\u0006\u001a\u0004\bd\u0010eR$\u0010s\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bt\u0010\u001e\"\u0004\bu\u0010 R$\u0010y\u001a\u00020x2\u0006\u0010\b\u001a\u00020x8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\u001a\u0010\u0080\u0001\u001a\u0004\u0018\u00010x*\u00020\u00008F¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R'\u0010\u0083\u0001\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0084\u0001\u0010\u001e\"\u0005\b\u0085\u0001\u0010 ¨\u0006\u008a\u0001"}, d2 = {"Lgatewayprotocol/v1/InitializationRequestKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest$Builder;", "<init>", "(Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest$Builder;)V", "_build", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;", "value", "Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;", "clientInfo", "getClientInfo", "()Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;", "setClientInfo", "(Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;)V", "clearClientInfo", "", "hasClientInfo", "", "Lcom/google/protobuf/ByteString;", ShareConstants.WEB_DIALOG_PARAM_PRIVACY, "getPrivacy", "()Lcom/google/protobuf/ByteString;", "setPrivacy", "(Lcom/google/protobuf/ByteString;)V", "clearPrivacy", "hasPrivacy", "", L6.P0, "getIdfi", "()Ljava/lang/String;", "setIdfi", "(Ljava/lang/String;)V", "clearIdfi", "sessionId", "getSessionId", "setSessionId", "clearSessionId", "cache", "getCache", "setCache", "clearCache", "hasCache", "legacyFlowUserConsent", "getLegacyFlowUserConsent", "setLegacyFlowUserConsent", "clearLegacyFlowUserConsent", "hasLegacyFlowUserConsent", "auid", "getAuid", "setAuid", "clearAuid", "hasAuid", "analyticsUserId", "getAnalyticsUserId", "setAnalyticsUserId", "clearAnalyticsUserId", "hasAnalyticsUserId", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationDeviceInfo;", "deviceInfo", "getDeviceInfo", "()Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationDeviceInfo;", "setDeviceInfo", "(Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationDeviceInfo;)V", "clearDeviceInfo", "hasDeviceInfo", "isFirstInit", "getIsFirstInit", "()Z", "setIsFirstInit", "(Z)V", "clearIsFirstInit", "auidString", "getAuidString", "setAuidString", "clearAuidString", "hasAuidString", "uadsInitBlob", "getUadsInitBlob", "setUadsInitBlob", "clearUadsInitBlob", "hasUadsInitBlob", "unityInstallationId", "getUnityInstallationId", "setUnityInstallationId", "clearUnityInstallationId", "hasUnityInstallationId", "unityMegaSessionId", "getUnityMegaSessionId", "setUnityMegaSessionId", "clearUnityMegaSessionId", "hasUnityMegaSessionId", "externalUserIdentifier", "getExternalUserIdentifier", "setExternalUserIdentifier", "clearExternalUserIdentifier", "hasExternalUserIdentifier", "extras", "Lcom/google/protobuf/kotlin/DslMap;", "Lgatewayprotocol/v1/InitializationRequestKt$Dsl$ExtrasProxy;", "getExtrasMap", "()Lcom/google/protobuf/kotlin/DslMap;", "put", "key", "putExtras", "set", "setExtras", "remove", "removeExtras", "putAll", "map", "", "putAllExtras", "clear", "clearExtras", "unityBuildGuid", "getUnityBuildGuid", "setUnityBuildGuid", "clearUnityBuildGuid", "hasUnityBuildGuid", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer;", "installReferrer", "getInstallReferrer", "()Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer;", "setInstallReferrer", "(Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer;)V", "clearInstallReferrer", "hasInstallReferrer", "installReferrerOrNull", "getInstallReferrerOrNull", "(Lgatewayprotocol/v1/InitializationRequestKt$Dsl;)Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer;", "googleAppId", "getGoogleAppId", "setGoogleAppId", "clearGoogleAppId", "hasGoogleAppId", k.M, "ExtrasProxy", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final InitializationRequestOuterClass.InitializationRequest.Builder _builder;

        public /* synthetic */ Dsl(InitializationRequestOuterClass.InitializationRequest.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(InitializationRequestOuterClass.InitializationRequest.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: InitializationRequestKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/InitializationRequestKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/InitializationRequestKt$Dsl;", "builder", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(InitializationRequestOuterClass.InitializationRequest.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ InitializationRequestOuterClass.InitializationRequest _build() {
            InitializationRequestOuterClass.InitializationRequest build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }

        public final ClientInfoOuterClass.ClientInfo getClientInfo() {
            ClientInfoOuterClass.ClientInfo clientInfo = this._builder.getClientInfo();
            Intrinsics.checkNotNullExpressionValue(clientInfo, "getClientInfo(...)");
            return clientInfo;
        }

        public final void setClientInfo(ClientInfoOuterClass.ClientInfo value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setClientInfo(value);
        }

        public final void clearClientInfo() {
            this._builder.clearClientInfo();
        }

        public final boolean hasClientInfo() {
            return this._builder.hasClientInfo();
        }

        public final ByteString getPrivacy() {
            ByteString privacy = this._builder.getPrivacy();
            Intrinsics.checkNotNullExpressionValue(privacy, "getPrivacy(...)");
            return privacy;
        }

        public final void setPrivacy(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setPrivacy(value);
        }

        public final void clearPrivacy() {
            this._builder.clearPrivacy();
        }

        public final boolean hasPrivacy() {
            return this._builder.hasPrivacy();
        }

        public final String getIdfi() {
            String idfi = this._builder.getIdfi();
            Intrinsics.checkNotNullExpressionValue(idfi, "getIdfi(...)");
            return idfi;
        }

        public final void setIdfi(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setIdfi(value);
        }

        public final void clearIdfi() {
            this._builder.clearIdfi();
        }

        public final ByteString getSessionId() {
            ByteString sessionId = this._builder.getSessionId();
            Intrinsics.checkNotNullExpressionValue(sessionId, "getSessionId(...)");
            return sessionId;
        }

        public final void setSessionId(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setSessionId(value);
        }

        public final void clearSessionId() {
            this._builder.clearSessionId();
        }

        public final ByteString getCache() {
            ByteString cache = this._builder.getCache();
            Intrinsics.checkNotNullExpressionValue(cache, "getCache(...)");
            return cache;
        }

        public final void setCache(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setCache(value);
        }

        public final void clearCache() {
            this._builder.clearCache();
        }

        public final boolean hasCache() {
            return this._builder.hasCache();
        }

        public final String getLegacyFlowUserConsent() {
            String legacyFlowUserConsent = this._builder.getLegacyFlowUserConsent();
            Intrinsics.checkNotNullExpressionValue(legacyFlowUserConsent, "getLegacyFlowUserConsent(...)");
            return legacyFlowUserConsent;
        }

        public final void setLegacyFlowUserConsent(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setLegacyFlowUserConsent(value);
        }

        public final void clearLegacyFlowUserConsent() {
            this._builder.clearLegacyFlowUserConsent();
        }

        public final boolean hasLegacyFlowUserConsent() {
            return this._builder.hasLegacyFlowUserConsent();
        }

        public final ByteString getAuid() {
            ByteString auid = this._builder.getAuid();
            Intrinsics.checkNotNullExpressionValue(auid, "getAuid(...)");
            return auid;
        }

        public final void setAuid(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAuid(value);
        }

        public final void clearAuid() {
            this._builder.clearAuid();
        }

        public final boolean hasAuid() {
            return this._builder.hasAuid();
        }

        public final String getAnalyticsUserId() {
            String analyticsUserId = this._builder.getAnalyticsUserId();
            Intrinsics.checkNotNullExpressionValue(analyticsUserId, "getAnalyticsUserId(...)");
            return analyticsUserId;
        }

        public final void setAnalyticsUserId(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAnalyticsUserId(value);
        }

        public final void clearAnalyticsUserId() {
            this._builder.clearAnalyticsUserId();
        }

        public final boolean hasAnalyticsUserId() {
            return this._builder.hasAnalyticsUserId();
        }

        public final InitializationRequestOuterClass.InitializationDeviceInfo getDeviceInfo() {
            InitializationRequestOuterClass.InitializationDeviceInfo deviceInfo = this._builder.getDeviceInfo();
            Intrinsics.checkNotNullExpressionValue(deviceInfo, "getDeviceInfo(...)");
            return deviceInfo;
        }

        public final void setDeviceInfo(InitializationRequestOuterClass.InitializationDeviceInfo value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setDeviceInfo(value);
        }

        public final void clearDeviceInfo() {
            this._builder.clearDeviceInfo();
        }

        public final boolean hasDeviceInfo() {
            return this._builder.hasDeviceInfo();
        }

        public final boolean getIsFirstInit() {
            return this._builder.getIsFirstInit();
        }

        public final void setIsFirstInit(boolean z) {
            this._builder.setIsFirstInit(z);
        }

        public final void clearIsFirstInit() {
            this._builder.clearIsFirstInit();
        }

        public final String getAuidString() {
            String auidString = this._builder.getAuidString();
            Intrinsics.checkNotNullExpressionValue(auidString, "getAuidString(...)");
            return auidString;
        }

        public final void setAuidString(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAuidString(value);
        }

        public final void clearAuidString() {
            this._builder.clearAuidString();
        }

        public final boolean hasAuidString() {
            return this._builder.hasAuidString();
        }

        public final ByteString getUadsInitBlob() {
            ByteString uadsInitBlob = this._builder.getUadsInitBlob();
            Intrinsics.checkNotNullExpressionValue(uadsInitBlob, "getUadsInitBlob(...)");
            return uadsInitBlob;
        }

        public final void setUadsInitBlob(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setUadsInitBlob(value);
        }

        public final void clearUadsInitBlob() {
            this._builder.clearUadsInitBlob();
        }

        public final boolean hasUadsInitBlob() {
            return this._builder.hasUadsInitBlob();
        }

        public final ByteString getUnityInstallationId() {
            ByteString unityInstallationId = this._builder.getUnityInstallationId();
            Intrinsics.checkNotNullExpressionValue(unityInstallationId, "getUnityInstallationId(...)");
            return unityInstallationId;
        }

        public final void setUnityInstallationId(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setUnityInstallationId(value);
        }

        public final void clearUnityInstallationId() {
            this._builder.clearUnityInstallationId();
        }

        public final boolean hasUnityInstallationId() {
            return this._builder.hasUnityInstallationId();
        }

        public final ByteString getUnityMegaSessionId() {
            ByteString unityMegaSessionId = this._builder.getUnityMegaSessionId();
            Intrinsics.checkNotNullExpressionValue(unityMegaSessionId, "getUnityMegaSessionId(...)");
            return unityMegaSessionId;
        }

        public final void setUnityMegaSessionId(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setUnityMegaSessionId(value);
        }

        public final void clearUnityMegaSessionId() {
            this._builder.clearUnityMegaSessionId();
        }

        public final boolean hasUnityMegaSessionId() {
            return this._builder.hasUnityMegaSessionId();
        }

        public final String getExternalUserIdentifier() {
            String externalUserIdentifier = this._builder.getExternalUserIdentifier();
            Intrinsics.checkNotNullExpressionValue(externalUserIdentifier, "getExternalUserIdentifier(...)");
            return externalUserIdentifier;
        }

        public final void setExternalUserIdentifier(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setExternalUserIdentifier(value);
        }

        public final void clearExternalUserIdentifier() {
            this._builder.clearExternalUserIdentifier();
        }

        public final boolean hasExternalUserIdentifier() {
            return this._builder.hasExternalUserIdentifier();
        }

        /* compiled from: InitializationRequestKt.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/InitializationRequestKt$Dsl$ExtrasProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ExtrasProxy extends DslProxy {
            private ExtrasProxy() {
            }
        }

        public final /* synthetic */ DslMap getExtrasMap() {
            Map<String, String> extrasMap = this._builder.getExtrasMap();
            Intrinsics.checkNotNullExpressionValue(extrasMap, "getExtrasMap(...)");
            return new DslMap(extrasMap);
        }

        public final void putExtras(DslMap<String, String, ExtrasProxy> dslMap, String key, String value) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.putExtras(key, value);
        }

        public final /* synthetic */ void setExtras(DslMap<String, String, ExtrasProxy> dslMap, String key, String value) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            putExtras(dslMap, key, value);
        }

        public final /* synthetic */ void removeExtras(DslMap dslMap, String key) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            this._builder.removeExtras(key);
        }

        public final /* synthetic */ void putAllExtras(DslMap dslMap, Map map) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            Intrinsics.checkNotNullParameter(map, "map");
            this._builder.putAllExtras(map);
        }

        public final /* synthetic */ void clearExtras(DslMap dslMap) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            this._builder.clearExtras();
        }

        public final String getUnityBuildGuid() {
            String unityBuildGuid = this._builder.getUnityBuildGuid();
            Intrinsics.checkNotNullExpressionValue(unityBuildGuid, "getUnityBuildGuid(...)");
            return unityBuildGuid;
        }

        public final void setUnityBuildGuid(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setUnityBuildGuid(value);
        }

        public final void clearUnityBuildGuid() {
            this._builder.clearUnityBuildGuid();
        }

        public final boolean hasUnityBuildGuid() {
            return this._builder.hasUnityBuildGuid();
        }

        public final InitializationRequestOuterClass.InstallReferrer getInstallReferrer() {
            InitializationRequestOuterClass.InstallReferrer installReferrer = this._builder.getInstallReferrer();
            Intrinsics.checkNotNullExpressionValue(installReferrer, "getInstallReferrer(...)");
            return installReferrer;
        }

        public final void setInstallReferrer(InitializationRequestOuterClass.InstallReferrer value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setInstallReferrer(value);
        }

        public final void clearInstallReferrer() {
            this._builder.clearInstallReferrer();
        }

        public final boolean hasInstallReferrer() {
            return this._builder.hasInstallReferrer();
        }

        public final InitializationRequestOuterClass.InstallReferrer getInstallReferrerOrNull(Dsl dsl) {
            Intrinsics.checkNotNullParameter(dsl, "<this>");
            return InitializationRequestKtKt.getInstallReferrerOrNull(dsl._builder);
        }

        public final String getGoogleAppId() {
            String googleAppId = this._builder.getGoogleAppId();
            Intrinsics.checkNotNullExpressionValue(googleAppId, "getGoogleAppId(...)");
            return googleAppId;
        }

        public final void setGoogleAppId(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setGoogleAppId(value);
        }

        public final void clearGoogleAppId() {
            this._builder.clearGoogleAppId();
        }

        public final boolean hasGoogleAppId() {
            return this._builder.hasGoogleAppId();
        }
    }
}
