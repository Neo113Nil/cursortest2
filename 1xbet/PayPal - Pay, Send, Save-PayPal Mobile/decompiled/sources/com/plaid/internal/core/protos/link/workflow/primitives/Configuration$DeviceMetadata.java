package com.plaid.internal.core.protos.link.workflow.primitives;

/* loaded from: classes16.dex */
public final class Configuration$DeviceMetadata extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int BROWSER_METADATA_FIELD_NUMBER = 8;
    public static final int COUNTRY_CODE_FIELD_NUMBER = 6;
    private static final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata DEFAULT_INSTANCE;
    public static final int LANGUAGE_CODE_FIELD_NUMBER = 7;
    public static final int LOCALE_FIELD_NUMBER = 5;
    public static final int MANUFACTURER_FIELD_NUMBER = 1;
    public static final int MODEL_FIELD_NUMBER = 2;
    public static final int NETWORK_METADATA_FIELD_NUMBER = 13;
    public static final int OS_FIELD_NUMBER = 3;
    public static final int OS_VERSION_FIELD_NUMBER = 4;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata> PARSER = null;
    public static final int SCREEN_HEIGHT_FIELD_NUMBER = 9;
    public static final int SCREEN_WIDTH_FIELD_NUMBER = 10;
    public static final int VIEWPORT_HEIGHT_FIELD_NUMBER = 11;
    public static final int VIEWPORT_WIDTH_FIELD_NUMBER = 12;
    private int bitField0_;
    private com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata browserMetadata_;
    private com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata networkMetadata_;
    private int screenHeight_;
    private int screenWidth_;
    private int viewportHeight_;
    private int viewportWidth_;
    private java.lang.String manufacturer_ = "";
    private java.lang.String model_ = "";
    private java.lang.String os_ = "";
    private java.lang.String osVersion_ = "";
    private java.lang.String locale_ = "";
    private java.lang.String countryCode_ = "";
    private java.lang.String languageCode_ = "";

    public static final class BrowserMetadata extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata, com.plaid.internal.core.protos.link.workflow.primitives.Configuration.DeviceMetadata.BrowserMetadata.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int BROWSER_NAME_FIELD_NUMBER = 1;
        public static final int BROWSER_VERSION_FIELD_NUMBER = 2;
        private static final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata DEFAULT_INSTANCE;
        public static final int IS_CONDITIONAL_MEDIATION_AVAILABLE_FIELD_NUMBER = 8;
        public static final int IS_PROGRESSIVE_WEB_APP_FIELD_NUMBER = 10;
        public static final int IS_SECURE_CONTEXT_FIELD_NUMBER = 6;
        public static final int IS_USER_VERIFYING_PLATFORM_AUTHENTICATOR_AVAILABLE_FIELD_NUMBER = 7;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata> PARSER = null;
        public static final int PREFERS_DARK_MODE_FIELD_NUMBER = 11;
        public static final int REFERRER_ORIGIN_FIELD_NUMBER = 9;
        public static final int RENDERING_ENGINE_NAME_FIELD_NUMBER = 3;
        public static final int RENDERING_ENGINE_VERSION_FIELD_NUMBER = 4;
        public static final int USER_AGENT_FIELD_NUMBER = 5;
        private int isConditionalMediationAvailable_;
        private boolean isProgressiveWebApp_;
        private int isSecureContext_;
        private int isUserVerifyingPlatformAuthenticatorAvailable_;
        private int prefersDarkMode_;
        private java.lang.String browserName_ = "";
        private java.lang.String browserVersion_ = "";
        private java.lang.String renderingEngineName_ = "";
        private java.lang.String renderingEngineVersion_ = "";
        private java.lang.String userAgent_ = "";
        private java.lang.String referrerOrigin_ = "";

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata, com.plaid.internal.core.protos.link.workflow.primitives.Configuration.DeviceMetadata.BrowserMetadata.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata browserMetadata = new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata();
            DEFAULT_INSTANCE = browserMetadata;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata.class, browserMetadata);
        }

        private BrowserMetadata() {
        }

        private void clearBrowserName() {
            this.browserName_ = getDefaultInstance().getBrowserName();
        }

        private void clearBrowserVersion() {
            this.browserVersion_ = getDefaultInstance().getBrowserVersion();
        }

        private void clearIsConditionalMediationAvailable() {
            this.isConditionalMediationAvailable_ = 0;
        }

        private void clearIsProgressiveWebApp() {
            this.isProgressiveWebApp_ = false;
        }

        private void clearIsSecureContext() {
            this.isSecureContext_ = 0;
        }

        private void clearIsUserVerifyingPlatformAuthenticatorAvailable() {
            this.isUserVerifyingPlatformAuthenticatorAvailable_ = 0;
        }

        private void clearPrefersDarkMode() {
            this.prefersDarkMode_ = 0;
        }

        private void clearReferrerOrigin() {
            this.referrerOrigin_ = getDefaultInstance().getReferrerOrigin();
        }

        private void clearRenderingEngineName() {
            this.renderingEngineName_ = getDefaultInstance().getRenderingEngineName();
        }

        private void clearRenderingEngineVersion() {
            this.renderingEngineVersion_ = getDefaultInstance().getRenderingEngineVersion();
        }

        private void clearUserAgent() {
            this.userAgent_ = getDefaultInstance().getUserAgent();
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration.DeviceMetadata.BrowserMetadata.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setBrowserNameBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.browserName_ = byteString.toStringUtf8();
        }

        private void setBrowserVersionBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.browserVersion_ = byteString.toStringUtf8();
        }

        private void setIsConditionalMediationAvailable(com.plaid.internal.core.protos.link.workflow.primitives.j jVar) {
            this.isConditionalMediationAvailable_ = jVar.getNumber();
        }

        private void setIsConditionalMediationAvailableValue(int i) {
            this.isConditionalMediationAvailable_ = i;
        }

        private void setIsProgressiveWebApp(boolean z) {
            this.isProgressiveWebApp_ = z;
        }

        private void setIsSecureContext(com.plaid.internal.core.protos.link.workflow.primitives.j jVar) {
            this.isSecureContext_ = jVar.getNumber();
        }

        private void setIsSecureContextValue(int i) {
            this.isSecureContext_ = i;
        }

        private void setIsUserVerifyingPlatformAuthenticatorAvailable(com.plaid.internal.core.protos.link.workflow.primitives.j jVar) {
            this.isUserVerifyingPlatformAuthenticatorAvailable_ = jVar.getNumber();
        }

        private void setIsUserVerifyingPlatformAuthenticatorAvailableValue(int i) {
            this.isUserVerifyingPlatformAuthenticatorAvailable_ = i;
        }

        private void setPrefersDarkMode(com.plaid.internal.core.protos.link.workflow.primitives.j jVar) {
            this.prefersDarkMode_ = jVar.getNumber();
        }

        private void setPrefersDarkModeValue(int i) {
            this.prefersDarkMode_ = i;
        }

        private void setReferrerOriginBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.referrerOrigin_ = byteString.toStringUtf8();
        }

        private void setRenderingEngineNameBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.renderingEngineName_ = byteString.toStringUtf8();
        }

        private void setRenderingEngineVersionBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.renderingEngineVersion_ = byteString.toStringUtf8();
        }

        private void setUserAgentBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.userAgent_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.primitives.e.f6361a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration.DeviceMetadata.BrowserMetadata.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\f\u0007\f\b\f\tȈ\n\u0007\u000b\f", new java.lang.Object[]{"browserName_", "browserVersion_", "renderingEngineName_", "renderingEngineVersion_", "userAgent_", "isSecureContext_", "isUserVerifyingPlatformAuthenticatorAvailable_", "isConditionalMediationAvailable_", "referrerOrigin_", "isProgressiveWebApp_", "prefersDarkMode_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new java.lang.UnsupportedOperationException();
            }
        }

        public final java.lang.String getBrowserName() {
            return this.browserName_;
        }

        public final com.google.protobuf.ByteString getBrowserNameBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.browserName_);
        }

        public final java.lang.String getBrowserVersion() {
            return this.browserVersion_;
        }

        public final com.google.protobuf.ByteString getBrowserVersionBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.browserVersion_);
        }

        public final com.plaid.internal.core.protos.link.workflow.primitives.j getIsConditionalMediationAvailable() {
            com.plaid.internal.core.protos.link.workflow.primitives.j forNumber = com.plaid.internal.core.protos.link.workflow.primitives.j.forNumber(this.isConditionalMediationAvailable_);
            return forNumber == null ? com.plaid.internal.core.protos.link.workflow.primitives.j.UNRECOGNIZED : forNumber;
        }

        public final int getIsConditionalMediationAvailableValue() {
            return this.isConditionalMediationAvailable_;
        }

        public final boolean getIsProgressiveWebApp() {
            return this.isProgressiveWebApp_;
        }

        public final com.plaid.internal.core.protos.link.workflow.primitives.j getIsSecureContext() {
            com.plaid.internal.core.protos.link.workflow.primitives.j forNumber = com.plaid.internal.core.protos.link.workflow.primitives.j.forNumber(this.isSecureContext_);
            return forNumber == null ? com.plaid.internal.core.protos.link.workflow.primitives.j.UNRECOGNIZED : forNumber;
        }

        public final int getIsSecureContextValue() {
            return this.isSecureContext_;
        }

        public final com.plaid.internal.core.protos.link.workflow.primitives.j getIsUserVerifyingPlatformAuthenticatorAvailable() {
            com.plaid.internal.core.protos.link.workflow.primitives.j forNumber = com.plaid.internal.core.protos.link.workflow.primitives.j.forNumber(this.isUserVerifyingPlatformAuthenticatorAvailable_);
            return forNumber == null ? com.plaid.internal.core.protos.link.workflow.primitives.j.UNRECOGNIZED : forNumber;
        }

        public final int getIsUserVerifyingPlatformAuthenticatorAvailableValue() {
            return this.isUserVerifyingPlatformAuthenticatorAvailable_;
        }

        public final com.plaid.internal.core.protos.link.workflow.primitives.j getPrefersDarkMode() {
            com.plaid.internal.core.protos.link.workflow.primitives.j forNumber = com.plaid.internal.core.protos.link.workflow.primitives.j.forNumber(this.prefersDarkMode_);
            return forNumber == null ? com.plaid.internal.core.protos.link.workflow.primitives.j.UNRECOGNIZED : forNumber;
        }

        public final int getPrefersDarkModeValue() {
            return this.prefersDarkMode_;
        }

        public final java.lang.String getReferrerOrigin() {
            return this.referrerOrigin_;
        }

        public final com.google.protobuf.ByteString getReferrerOriginBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.referrerOrigin_);
        }

        public final java.lang.String getRenderingEngineName() {
            return this.renderingEngineName_;
        }

        public final com.google.protobuf.ByteString getRenderingEngineNameBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.renderingEngineName_);
        }

        public final java.lang.String getRenderingEngineVersion() {
            return this.renderingEngineVersion_;
        }

        public final com.google.protobuf.ByteString getRenderingEngineVersionBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.renderingEngineVersion_);
        }

        public final java.lang.String getUserAgent() {
            return this.userAgent_;
        }

        public final com.google.protobuf.ByteString getUserAgentBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.userAgent_);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration.DeviceMetadata.BrowserMetadata.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata browserMetadata) {
            return DEFAULT_INSTANCE.createBuilder(browserMetadata);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setBrowserName(java.lang.String str) {
            this.browserName_ = str;
        }

        private void setBrowserVersion(java.lang.String str) {
            this.browserVersion_ = str;
        }

        private void setReferrerOrigin(java.lang.String str) {
            this.referrerOrigin_ = str;
        }

        private void setRenderingEngineName(java.lang.String str) {
            this.renderingEngineName_ = str;
        }

        private void setRenderingEngineVersion(java.lang.String str) {
            this.renderingEngineVersion_ = str;
        }

        private void setUserAgent(java.lang.String str) {
            this.userAgent_ = str;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class NetworkMetadata extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata, com.plaid.internal.core.protos.link.workflow.primitives.Configuration.DeviceMetadata.NetworkMetadata.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata DEFAULT_INSTANCE;
        public static final int DOWNLINK_FIELD_NUMBER = 2;
        public static final int EFFECTIVE_TYPE_FIELD_NUMBER = 3;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata> PARSER = null;
        public static final int RTT_FIELD_NUMBER = 1;
        private float downlink_;
        private java.lang.String effectiveType_ = "";
        private int rtt_;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata, com.plaid.internal.core.protos.link.workflow.primitives.Configuration.DeviceMetadata.NetworkMetadata.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata networkMetadata = new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata();
            DEFAULT_INSTANCE = networkMetadata;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata.class, networkMetadata);
        }

        private NetworkMetadata() {
        }

        private void clearDownlink() {
            this.downlink_ = 0.0f;
        }

        private void clearEffectiveType() {
            this.effectiveType_ = getDefaultInstance().getEffectiveType();
        }

        private void clearRtt() {
            this.rtt_ = 0;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration.DeviceMetadata.NetworkMetadata.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setDownlink(float f) {
            this.downlink_ = f;
        }

        private void setEffectiveTypeBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.effectiveType_ = byteString.toStringUtf8();
        }

        private void setRtt(int i) {
            this.rtt_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.primitives.e.f6361a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration.DeviceMetadata.NetworkMetadata.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u0001\u0003Ȉ", new java.lang.Object[]{"rtt_", "downlink_", "effectiveType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new java.lang.UnsupportedOperationException();
            }
        }

        public final float getDownlink() {
            return this.downlink_;
        }

        public final java.lang.String getEffectiveType() {
            return this.effectiveType_;
        }

        public final com.google.protobuf.ByteString getEffectiveTypeBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.effectiveType_);
        }

        public final int getRtt() {
            return this.rtt_;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration.DeviceMetadata.NetworkMetadata.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata networkMetadata) {
            return DEFAULT_INSTANCE.createBuilder(networkMetadata);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setEffectiveType(java.lang.String str) {
            this.effectiveType_ = str;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata configuration$DeviceMetadata = new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata();
        DEFAULT_INSTANCE = configuration$DeviceMetadata;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.class, configuration$DeviceMetadata);
    }

    private Configuration$DeviceMetadata() {
    }

    private void clearBrowserMetadata() {
        this.browserMetadata_ = null;
        this.bitField0_ &= -2;
    }

    private void clearCountryCode() {
        this.countryCode_ = getDefaultInstance().getCountryCode();
    }

    private void clearLanguageCode() {
        this.languageCode_ = getDefaultInstance().getLanguageCode();
    }

    private void clearLocale() {
        this.locale_ = getDefaultInstance().getLocale();
    }

    private void clearManufacturer() {
        this.manufacturer_ = getDefaultInstance().getManufacturer();
    }

    private void clearModel() {
        this.model_ = getDefaultInstance().getModel();
    }

    private void clearNetworkMetadata() {
        this.networkMetadata_ = null;
        this.bitField0_ &= -3;
    }

    private void clearOs() {
        this.os_ = getDefaultInstance().getOs();
    }

    private void clearOsVersion() {
        this.osVersion_ = getDefaultInstance().getOsVersion();
    }

    private void clearScreenHeight() {
        this.screenHeight_ = 0;
    }

    private void clearScreenWidth() {
        this.screenWidth_ = 0;
    }

    private void clearViewportHeight() {
        this.viewportHeight_ = 0;
    }

    private void clearViewportWidth() {
        this.viewportWidth_ = 0;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCountryCodeBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.countryCode_ = byteString.toStringUtf8();
    }

    private void setLanguageCodeBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.languageCode_ = byteString.toStringUtf8();
    }

    private void setLocaleBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.locale_ = byteString.toStringUtf8();
    }

    private void setManufacturerBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.manufacturer_ = byteString.toStringUtf8();
    }

    private void setModelBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.model_ = byteString.toStringUtf8();
    }

    private void setOsBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.os_ = byteString.toStringUtf8();
    }

    private void setOsVersionBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.osVersion_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenHeight(int i) {
        this.screenHeight_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenWidth(int i) {
        this.screenWidth_ = i;
    }

    private void setViewportHeight(int i) {
        this.viewportHeight_ = i;
    }

    private void setViewportWidth(int i) {
        this.viewportWidth_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.primitives.e.f6361a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bဉ\u0000\t\u000b\n\u000b\u000b\u000b\f\u000b\rဉ\u0001", new java.lang.Object[]{"bitField0_", "manufacturer_", "model_", "os_", "osVersion_", "locale_", "countryCode_", "languageCode_", "browserMetadata_", "screenHeight_", "screenWidth_", "viewportHeight_", "viewportWidth_", "networkMetadata_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.class) {
                    parser = PARSER;
                    if (parser == null) {
                        parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                        PARSER = parser;
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata getBrowserMetadata() {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata browserMetadata = this.browserMetadata_;
        return browserMetadata == null ? com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata.getDefaultInstance() : browserMetadata;
    }

    public final java.lang.String getCountryCode() {
        return this.countryCode_;
    }

    public final com.google.protobuf.ByteString getCountryCodeBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.countryCode_);
    }

    public final java.lang.String getLanguageCode() {
        return this.languageCode_;
    }

    public final com.google.protobuf.ByteString getLanguageCodeBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.languageCode_);
    }

    public final java.lang.String getLocale() {
        return this.locale_;
    }

    public final com.google.protobuf.ByteString getLocaleBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.locale_);
    }

    public final java.lang.String getManufacturer() {
        return this.manufacturer_;
    }

    public final com.google.protobuf.ByteString getManufacturerBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.manufacturer_);
    }

    public final java.lang.String getModel() {
        return this.model_;
    }

    public final com.google.protobuf.ByteString getModelBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.model_);
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata getNetworkMetadata() {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata networkMetadata = this.networkMetadata_;
        return networkMetadata == null ? com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata.getDefaultInstance() : networkMetadata;
    }

    public final java.lang.String getOs() {
        return this.os_;
    }

    public final com.google.protobuf.ByteString getOsBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.os_);
    }

    public final java.lang.String getOsVersion() {
        return this.osVersion_;
    }

    public final com.google.protobuf.ByteString getOsVersionBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.osVersion_);
    }

    public final int getScreenHeight() {
        return this.screenHeight_;
    }

    public final int getScreenWidth() {
        return this.screenWidth_;
    }

    public final int getViewportHeight() {
        return this.viewportHeight_;
    }

    public final int getViewportWidth() {
        return this.viewportWidth_;
    }

    public final boolean hasBrowserMetadata() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasNetworkMetadata() {
        return (this.bitField0_ & 2) != 0;
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.DEFAULT_INSTANCE);
        }

        public final void a(java.lang.String str) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata) this.instance).setCountryCode(str);
        }

        public final void b(java.lang.String str) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata) this.instance).setLanguageCode(str);
        }

        public final void c(java.lang.String str) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata) this.instance).setLocale(str);
        }

        public final void d(java.lang.String str) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata) this.instance).setManufacturer(str);
        }

        public final void e(java.lang.String str) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata) this.instance).setModel(str);
        }

        public final void f(java.lang.String str) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata) this.instance).setOs(str);
        }

        public final void g(java.lang.String str) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata) this.instance).setOsVersion(str);
        }

        public final void a(int i) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata) this.instance).setScreenHeight(i);
        }

        public final void b(int i) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata) this.instance).setScreenWidth(i);
        }
    }

    private void mergeBrowserMetadata(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata browserMetadata) {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata browserMetadata2 = this.browserMetadata_;
        if (browserMetadata2 == null || browserMetadata2 == com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata.getDefaultInstance()) {
            this.browserMetadata_ = browserMetadata;
        } else {
            this.browserMetadata_ = com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata.newBuilder(this.browserMetadata_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.Configuration.DeviceMetadata.BrowserMetadata.a) browserMetadata).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    private void mergeNetworkMetadata(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata networkMetadata) {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata networkMetadata2 = this.networkMetadata_;
        if (networkMetadata2 == null || networkMetadata2 == com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata.getDefaultInstance()) {
            this.networkMetadata_ = networkMetadata;
        } else {
            this.networkMetadata_ = com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata.newBuilder(this.networkMetadata_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.Configuration.DeviceMetadata.NetworkMetadata.a) networkMetadata).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata configuration$DeviceMetadata) {
        return DEFAULT_INSTANCE.createBuilder(configuration$DeviceMetadata);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setBrowserMetadata(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.BrowserMetadata browserMetadata) {
        this.browserMetadata_ = browserMetadata;
        this.bitField0_ |= 1;
    }

    private void setNetworkMetadata(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.NetworkMetadata networkMetadata) {
        this.networkMetadata_ = networkMetadata;
        this.bitField0_ |= 2;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryCode(java.lang.String str) {
        this.countryCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguageCode(java.lang.String str) {
        this.languageCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocale(java.lang.String str) {
        this.locale_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setManufacturer(java.lang.String str) {
        this.manufacturer_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModel(java.lang.String str) {
        this.model_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOs(java.lang.String str) {
        this.os_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsVersion(java.lang.String str) {
        this.osVersion_ = str;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
