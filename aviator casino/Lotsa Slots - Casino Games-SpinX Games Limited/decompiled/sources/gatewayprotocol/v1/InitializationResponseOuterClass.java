package gatewayprotocol.v1;

/* loaded from: classes6.dex */
public final class InitializationResponseOuterClass {

    public interface InitializationResponseOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        boolean containsScarPlacements(java.lang.String str);

        int getCountOfLastShownCampaigns();

        gatewayprotocol.v1.ErrorOuterClass.Error getError();

        gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration();

        gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride getRequestUrlOverrides(int i);

        int getRequestUrlOverridesCount();

        java.util.List<gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride> getRequestUrlOverridesList();

        gatewayprotocol.v1.AdFormatOuterClass.AdFormat getScarEligibleFormats(int i);

        int getScarEligibleFormatsCount();

        java.util.List<gatewayprotocol.v1.AdFormatOuterClass.AdFormat> getScarEligibleFormatsList();

        int getScarEligibleFormatsValue(int i);

        java.util.List<java.lang.Integer> getScarEligibleFormatsValueList();

        @java.lang.Deprecated
        java.util.Map<java.lang.String, gatewayprotocol.v1.InitializationResponseOuterClass.Placement> getScarPlacements();

        int getScarPlacementsCount();

        java.util.Map<java.lang.String, gatewayprotocol.v1.InitializationResponseOuterClass.Placement> getScarPlacementsMap();

        gatewayprotocol.v1.InitializationResponseOuterClass.Placement getScarPlacementsOrDefault(java.lang.String str, gatewayprotocol.v1.InitializationResponseOuterClass.Placement placement);

        gatewayprotocol.v1.InitializationResponseOuterClass.Placement getScarPlacementsOrThrow(java.lang.String str);

        boolean getTriggerInitializationCompletedRequest();

        java.lang.String getUniversalRequestUrl();

        com.google.protobuf.ByteString getUniversalRequestUrlBytes();

        boolean hasError();

        boolean hasNativeConfiguration();

        boolean hasUniversalRequestUrl();
    }

    public interface PlacementOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        gatewayprotocol.v1.AdFormatOuterClass.AdFormat getAdFormat();

        int getAdFormatValue();
    }

    public interface RequestUrlOverrideOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        gatewayprotocol.v1.InitializationResponseOuterClass.RequestType getRequestType();

        int getRequestTypeValue();

        java.lang.String getUrl();

        com.google.protobuf.ByteString getUrlBytes();
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private InitializationResponseOuterClass() {
    }

    public enum RequestType implements com.google.protobuf.Internal.EnumLite {
        REQUEST_TYPE_UNSPECIFIED(0),
        REQUEST_TYPE_INITIALIZATION_COMPLETED(1),
        REQUEST_TYPE_AD(2),
        REQUEST_TYPE_OPERATIVE_EVENT(3),
        REQUEST_TYPE_DIAGNOSTIC_EVENT(4),
        REQUEST_TYPE_AD_PLAYER_CONFIG(5),
        REQUEST_TYPE_GET_TOKEN_EVENT(6),
        REQUEST_TYPE_PRIVACY_UPDATE(7),
        REQUEST_TYPE_AD_DATA_REFRESH(8),
        REQUEST_TYPE_TRANSACTION_EVENT(9),
        UNRECOGNIZED(-1);

        public static final int REQUEST_TYPE_AD_DATA_REFRESH_VALUE = 8;
        public static final int REQUEST_TYPE_AD_PLAYER_CONFIG_VALUE = 5;
        public static final int REQUEST_TYPE_AD_VALUE = 2;
        public static final int REQUEST_TYPE_DIAGNOSTIC_EVENT_VALUE = 4;
        public static final int REQUEST_TYPE_GET_TOKEN_EVENT_VALUE = 6;
        public static final int REQUEST_TYPE_INITIALIZATION_COMPLETED_VALUE = 1;
        public static final int REQUEST_TYPE_OPERATIVE_EVENT_VALUE = 3;
        public static final int REQUEST_TYPE_PRIVACY_UPDATE_VALUE = 7;
        public static final int REQUEST_TYPE_TRANSACTION_EVENT_VALUE = 9;
        public static final int REQUEST_TYPE_UNSPECIFIED_VALUE = 0;
        private static final com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.InitializationResponseOuterClass.RequestType> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.InitializationResponseOuterClass.RequestType>() { // from class: gatewayprotocol.v1.InitializationResponseOuterClass.RequestType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public gatewayprotocol.v1.InitializationResponseOuterClass.RequestType findValueByNumber(int i) {
                return gatewayprotocol.v1.InitializationResponseOuterClass.RequestType.forNumber(i);
            }
        };
        private final int value;

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @java.lang.Deprecated
        public static gatewayprotocol.v1.InitializationResponseOuterClass.RequestType valueOf(int i) {
            return forNumber(i);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.RequestType forNumber(int i) {
            switch (i) {
                case 0:
                    return REQUEST_TYPE_UNSPECIFIED;
                case 1:
                    return REQUEST_TYPE_INITIALIZATION_COMPLETED;
                case 2:
                    return REQUEST_TYPE_AD;
                case 3:
                    return REQUEST_TYPE_OPERATIVE_EVENT;
                case 4:
                    return REQUEST_TYPE_DIAGNOSTIC_EVENT;
                case 5:
                    return REQUEST_TYPE_AD_PLAYER_CONFIG;
                case 6:
                    return REQUEST_TYPE_GET_TOKEN_EVENT;
                case 7:
                    return REQUEST_TYPE_PRIVACY_UPDATE;
                case 8:
                    return REQUEST_TYPE_AD_DATA_REFRESH;
                case 9:
                    return REQUEST_TYPE_TRANSACTION_EVENT;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.InitializationResponseOuterClass.RequestType> internalGetValueMap() {
            return internalValueMap;
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return gatewayprotocol.v1.InitializationResponseOuterClass.RequestType.RequestTypeVerifier.INSTANCE;
        }

        private static final class RequestTypeVerifier implements com.google.protobuf.Internal.EnumVerifier {
            static final com.google.protobuf.Internal.EnumVerifier INSTANCE = new gatewayprotocol.v1.InitializationResponseOuterClass.RequestType.RequestTypeVerifier();

            private RequestTypeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return gatewayprotocol.v1.InitializationResponseOuterClass.RequestType.forNumber(i) != null;
            }
        }

        RequestType(int i) {
            this.value = i;
        }
    }

    public static final class Placement extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.InitializationResponseOuterClass.Placement, gatewayprotocol.v1.InitializationResponseOuterClass.Placement.Builder> implements gatewayprotocol.v1.InitializationResponseOuterClass.PlacementOrBuilder {
        public static final int AD_FORMAT_FIELD_NUMBER = 1;
        private static final gatewayprotocol.v1.InitializationResponseOuterClass.Placement DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.InitializationResponseOuterClass.Placement> PARSER;
        private int adFormat_;

        private Placement() {
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.PlacementOrBuilder
        public int getAdFormatValue() {
            return this.adFormat_;
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.PlacementOrBuilder
        public gatewayprotocol.v1.AdFormatOuterClass.AdFormat getAdFormat() {
            gatewayprotocol.v1.AdFormatOuterClass.AdFormat forNumber = gatewayprotocol.v1.AdFormatOuterClass.AdFormat.forNumber(this.adFormat_);
            return forNumber == null ? gatewayprotocol.v1.AdFormatOuterClass.AdFormat.UNRECOGNIZED : forNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdFormatValue(int i) {
            this.adFormat_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdFormat(gatewayprotocol.v1.AdFormatOuterClass.AdFormat adFormat) {
            this.adFormat_ = adFormat.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdFormat() {
            this.adFormat_ = 0;
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.Placement parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.Placement) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.Placement parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.Placement) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.Placement parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.Placement) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.Placement parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.Placement) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.Placement parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.Placement) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.Placement parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.Placement) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.Placement parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.Placement) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.Placement parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.Placement) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.Placement parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.Placement) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.Placement parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.Placement) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.Placement parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.Placement) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.Placement parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.Placement) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.Placement.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.Placement.Builder newBuilder(gatewayprotocol.v1.InitializationResponseOuterClass.Placement placement) {
            return DEFAULT_INSTANCE.createBuilder(placement);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.InitializationResponseOuterClass.Placement, gatewayprotocol.v1.InitializationResponseOuterClass.Placement.Builder> implements gatewayprotocol.v1.InitializationResponseOuterClass.PlacementOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.InitializationResponseOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.InitializationResponseOuterClass.Placement.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.PlacementOrBuilder
            public int getAdFormatValue() {
                return ((gatewayprotocol.v1.InitializationResponseOuterClass.Placement) this.instance).getAdFormatValue();
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.Placement.Builder setAdFormatValue(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.Placement) this.instance).setAdFormatValue(i);
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.PlacementOrBuilder
            public gatewayprotocol.v1.AdFormatOuterClass.AdFormat getAdFormat() {
                return ((gatewayprotocol.v1.InitializationResponseOuterClass.Placement) this.instance).getAdFormat();
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.Placement.Builder setAdFormat(gatewayprotocol.v1.AdFormatOuterClass.AdFormat adFormat) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.Placement) this.instance).setAdFormat(adFormat);
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.Placement.Builder clearAdFormat() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.Placement) this.instance).clearAdFormat();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.InitializationResponseOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.InitializationResponseOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.InitializationResponseOuterClass.Placement();
                case 2:
                    return new gatewayprotocol.v1.InitializationResponseOuterClass.Placement.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new java.lang.Object[]{"adFormat_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.InitializationResponseOuterClass.Placement> parser = PARSER;
                    if (parser == null) {
                        synchronized (gatewayprotocol.v1.InitializationResponseOuterClass.Placement.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
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

        static {
            gatewayprotocol.v1.InitializationResponseOuterClass.Placement placement = new gatewayprotocol.v1.InitializationResponseOuterClass.Placement();
            DEFAULT_INSTANCE = placement;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.InitializationResponseOuterClass.Placement.class, placement);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.Placement getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.InitializationResponseOuterClass.Placement> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: gatewayprotocol.v1.InitializationResponseOuterClass$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    public static final class RequestUrlOverride extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride, gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride.Builder> implements gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverrideOrBuilder {
        private static final gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride> PARSER = null;
        public static final int REQUEST_TYPE_FIELD_NUMBER = 1;
        public static final int URL_FIELD_NUMBER = 2;
        private int requestType_;
        private java.lang.String url_ = "";

        private RequestUrlOverride() {
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverrideOrBuilder
        public int getRequestTypeValue() {
            return this.requestType_;
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverrideOrBuilder
        public gatewayprotocol.v1.InitializationResponseOuterClass.RequestType getRequestType() {
            gatewayprotocol.v1.InitializationResponseOuterClass.RequestType forNumber = gatewayprotocol.v1.InitializationResponseOuterClass.RequestType.forNumber(this.requestType_);
            return forNumber == null ? gatewayprotocol.v1.InitializationResponseOuterClass.RequestType.UNRECOGNIZED : forNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRequestTypeValue(int i) {
            this.requestType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRequestType(gatewayprotocol.v1.InitializationResponseOuterClass.RequestType requestType) {
            this.requestType_ = requestType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRequestType() {
            this.requestType_ = 0;
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverrideOrBuilder
        public java.lang.String getUrl() {
            return this.url_;
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverrideOrBuilder
        public com.google.protobuf.ByteString getUrlBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.url_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrl(java.lang.String str) {
            str.getClass();
            this.url_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUrl() {
            this.url_ = getDefaultInstance().getUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrlBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.url_ = byteString.toStringUtf8();
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride.Builder newBuilder(gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride requestUrlOverride) {
            return DEFAULT_INSTANCE.createBuilder(requestUrlOverride);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride, gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride.Builder> implements gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverrideOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.InitializationResponseOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverrideOrBuilder
            public int getRequestTypeValue() {
                return ((gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride) this.instance).getRequestTypeValue();
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride.Builder setRequestTypeValue(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride) this.instance).setRequestTypeValue(i);
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverrideOrBuilder
            public gatewayprotocol.v1.InitializationResponseOuterClass.RequestType getRequestType() {
                return ((gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride) this.instance).getRequestType();
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride.Builder setRequestType(gatewayprotocol.v1.InitializationResponseOuterClass.RequestType requestType) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride) this.instance).setRequestType(requestType);
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride.Builder clearRequestType() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride) this.instance).clearRequestType();
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverrideOrBuilder
            public java.lang.String getUrl() {
                return ((gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride) this.instance).getUrl();
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverrideOrBuilder
            public com.google.protobuf.ByteString getUrlBytes() {
                return ((gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride) this.instance).getUrlBytes();
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride.Builder setUrl(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride) this.instance).setUrl(str);
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride.Builder clearUrl() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride) this.instance).clearUrl();
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride.Builder setUrlBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride) this.instance).setUrlBytes(byteString);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.InitializationResponseOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.InitializationResponseOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride();
                case 2:
                    return new gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new java.lang.Object[]{"requestType_", "url_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride> parser = PARSER;
                    if (parser == null) {
                        synchronized (gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
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

        static {
            gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride requestUrlOverride = new gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride();
            DEFAULT_INSTANCE = requestUrlOverride;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride.class, requestUrlOverride);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class InitializationResponse extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse, gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder> implements gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder {
        public static final int COUNT_OF_LAST_SHOWN_CAMPAIGNS_FIELD_NUMBER = 5;
        private static final gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse DEFAULT_INSTANCE;
        public static final int ERROR_FIELD_NUMBER = 3;
        public static final int NATIVE_CONFIGURATION_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse> PARSER = null;
        public static final int REQUEST_URL_OVERRIDES_FIELD_NUMBER = 8;
        public static final int SCAR_ELIGIBLE_FORMATS_FIELD_NUMBER = 7;
        public static final int SCAR_PLACEMENTS_FIELD_NUMBER = 6;
        public static final int TRIGGER_INITIALIZATION_COMPLETED_REQUEST_FIELD_NUMBER = 4;
        public static final int UNIVERSAL_REQUEST_URL_FIELD_NUMBER = 2;
        private static final com.google.protobuf.Internal.ListAdapter.Converter<java.lang.Integer, gatewayprotocol.v1.AdFormatOuterClass.AdFormat> scarEligibleFormats_converter_ = new com.google.protobuf.Internal.ListAdapter.Converter<java.lang.Integer, gatewayprotocol.v1.AdFormatOuterClass.AdFormat>() { // from class: gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public gatewayprotocol.v1.AdFormatOuterClass.AdFormat convert(java.lang.Integer num) {
                gatewayprotocol.v1.AdFormatOuterClass.AdFormat forNumber = gatewayprotocol.v1.AdFormatOuterClass.AdFormat.forNumber(num.intValue());
                return forNumber == null ? gatewayprotocol.v1.AdFormatOuterClass.AdFormat.UNRECOGNIZED : forNumber;
            }
        };
        private int bitField0_;
        private int countOfLastShownCampaigns_;
        private gatewayprotocol.v1.ErrorOuterClass.Error error_;
        private gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration_;
        private int scarEligibleFormatsMemoizedSerializedSize;
        private boolean triggerInitializationCompletedRequest_;
        private com.google.protobuf.MapFieldLite<java.lang.String, gatewayprotocol.v1.InitializationResponseOuterClass.Placement> scarPlacements_ = com.google.protobuf.MapFieldLite.emptyMapField();
        private java.lang.String universalRequestUrl_ = "";
        private com.google.protobuf.Internal.IntList scarEligibleFormats_ = emptyIntList();
        private com.google.protobuf.Internal.ProtobufList<gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride> requestUrlOverrides_ = emptyProtobufList();

        private InitializationResponse() {
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public boolean hasNativeConfiguration() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration() {
            gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration = this.nativeConfiguration_;
            return nativeConfiguration == null ? gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.getDefaultInstance() : nativeConfiguration;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNativeConfiguration(gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration) {
            nativeConfiguration.getClass();
            this.nativeConfiguration_ = nativeConfiguration;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeNativeConfiguration(gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration) {
            nativeConfiguration.getClass();
            gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration2 = this.nativeConfiguration_;
            if (nativeConfiguration2 != null && nativeConfiguration2 != gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.getDefaultInstance()) {
                this.nativeConfiguration_ = gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.newBuilder(this.nativeConfiguration_).mergeFrom((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder) nativeConfiguration).buildPartial();
            } else {
                this.nativeConfiguration_ = nativeConfiguration;
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNativeConfiguration() {
            this.nativeConfiguration_ = null;
            this.bitField0_ &= -2;
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public boolean hasUniversalRequestUrl() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public java.lang.String getUniversalRequestUrl() {
            return this.universalRequestUrl_;
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public com.google.protobuf.ByteString getUniversalRequestUrlBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.universalRequestUrl_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUniversalRequestUrl(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.universalRequestUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUniversalRequestUrl() {
            this.bitField0_ &= -3;
            this.universalRequestUrl_ = getDefaultInstance().getUniversalRequestUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUniversalRequestUrlBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.universalRequestUrl_ = byteString.toStringUtf8();
            this.bitField0_ |= 2;
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public boolean hasError() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public gatewayprotocol.v1.ErrorOuterClass.Error getError() {
            gatewayprotocol.v1.ErrorOuterClass.Error error = this.error_;
            return error == null ? gatewayprotocol.v1.ErrorOuterClass.Error.getDefaultInstance() : error;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setError(gatewayprotocol.v1.ErrorOuterClass.Error error) {
            error.getClass();
            this.error_ = error;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeError(gatewayprotocol.v1.ErrorOuterClass.Error error) {
            error.getClass();
            gatewayprotocol.v1.ErrorOuterClass.Error error2 = this.error_;
            if (error2 != null && error2 != gatewayprotocol.v1.ErrorOuterClass.Error.getDefaultInstance()) {
                this.error_ = gatewayprotocol.v1.ErrorOuterClass.Error.newBuilder(this.error_).mergeFrom((gatewayprotocol.v1.ErrorOuterClass.Error.Builder) error).buildPartial();
            } else {
                this.error_ = error;
            }
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearError() {
            this.error_ = null;
            this.bitField0_ &= -5;
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public boolean getTriggerInitializationCompletedRequest() {
            return this.triggerInitializationCompletedRequest_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTriggerInitializationCompletedRequest(boolean z) {
            this.triggerInitializationCompletedRequest_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTriggerInitializationCompletedRequest() {
            this.triggerInitializationCompletedRequest_ = false;
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public int getCountOfLastShownCampaigns() {
            return this.countOfLastShownCampaigns_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountOfLastShownCampaigns(int i) {
            this.countOfLastShownCampaigns_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCountOfLastShownCampaigns() {
            this.countOfLastShownCampaigns_ = 0;
        }

        private static final class ScarPlacementsDefaultEntryHolder {
            static final com.google.protobuf.MapEntryLite<java.lang.String, gatewayprotocol.v1.InitializationResponseOuterClass.Placement> defaultEntry = com.google.protobuf.MapEntryLite.newDefaultInstance(com.google.protobuf.WireFormat.FieldType.STRING, "", com.google.protobuf.WireFormat.FieldType.MESSAGE, gatewayprotocol.v1.InitializationResponseOuterClass.Placement.getDefaultInstance());

            private ScarPlacementsDefaultEntryHolder() {
            }
        }

        private com.google.protobuf.MapFieldLite<java.lang.String, gatewayprotocol.v1.InitializationResponseOuterClass.Placement> internalGetScarPlacements() {
            return this.scarPlacements_;
        }

        private com.google.protobuf.MapFieldLite<java.lang.String, gatewayprotocol.v1.InitializationResponseOuterClass.Placement> internalGetMutableScarPlacements() {
            if (!this.scarPlacements_.isMutable()) {
                this.scarPlacements_ = this.scarPlacements_.mutableCopy();
            }
            return this.scarPlacements_;
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public int getScarPlacementsCount() {
            return internalGetScarPlacements().size();
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public boolean containsScarPlacements(java.lang.String str) {
            str.getClass();
            return internalGetScarPlacements().containsKey(str);
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        @java.lang.Deprecated
        public java.util.Map<java.lang.String, gatewayprotocol.v1.InitializationResponseOuterClass.Placement> getScarPlacements() {
            return getScarPlacementsMap();
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public java.util.Map<java.lang.String, gatewayprotocol.v1.InitializationResponseOuterClass.Placement> getScarPlacementsMap() {
            return java.util.Collections.unmodifiableMap(internalGetScarPlacements());
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public gatewayprotocol.v1.InitializationResponseOuterClass.Placement getScarPlacementsOrDefault(java.lang.String str, gatewayprotocol.v1.InitializationResponseOuterClass.Placement placement) {
            str.getClass();
            com.google.protobuf.MapFieldLite<java.lang.String, gatewayprotocol.v1.InitializationResponseOuterClass.Placement> internalGetScarPlacements = internalGetScarPlacements();
            return internalGetScarPlacements.containsKey(str) ? internalGetScarPlacements.get(str) : placement;
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public gatewayprotocol.v1.InitializationResponseOuterClass.Placement getScarPlacementsOrThrow(java.lang.String str) {
            str.getClass();
            com.google.protobuf.MapFieldLite<java.lang.String, gatewayprotocol.v1.InitializationResponseOuterClass.Placement> internalGetScarPlacements = internalGetScarPlacements();
            if (!internalGetScarPlacements.containsKey(str)) {
                throw new java.lang.IllegalArgumentException();
            }
            return internalGetScarPlacements.get(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public java.util.Map<java.lang.String, gatewayprotocol.v1.InitializationResponseOuterClass.Placement> getMutableScarPlacementsMap() {
            return internalGetMutableScarPlacements();
        }

        static {
            gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse initializationResponse = new gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse();
            DEFAULT_INSTANCE = initializationResponse;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.class, initializationResponse);
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public java.util.List<gatewayprotocol.v1.AdFormatOuterClass.AdFormat> getScarEligibleFormatsList() {
            return new com.google.protobuf.Internal.ListAdapter(this.scarEligibleFormats_, scarEligibleFormats_converter_);
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public int getScarEligibleFormatsCount() {
            return this.scarEligibleFormats_.size();
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public gatewayprotocol.v1.AdFormatOuterClass.AdFormat getScarEligibleFormats(int i) {
            gatewayprotocol.v1.AdFormatOuterClass.AdFormat forNumber = gatewayprotocol.v1.AdFormatOuterClass.AdFormat.forNumber(this.scarEligibleFormats_.getInt(i));
            return forNumber == null ? gatewayprotocol.v1.AdFormatOuterClass.AdFormat.UNRECOGNIZED : forNumber;
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public java.util.List<java.lang.Integer> getScarEligibleFormatsValueList() {
            return this.scarEligibleFormats_;
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public int getScarEligibleFormatsValue(int i) {
            return this.scarEligibleFormats_.getInt(i);
        }

        private void ensureScarEligibleFormatsIsMutable() {
            com.google.protobuf.Internal.IntList intList = this.scarEligibleFormats_;
            if (intList.isModifiable()) {
                return;
            }
            this.scarEligibleFormats_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(intList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScarEligibleFormats(int i, gatewayprotocol.v1.AdFormatOuterClass.AdFormat adFormat) {
            adFormat.getClass();
            ensureScarEligibleFormatsIsMutable();
            this.scarEligibleFormats_.setInt(i, adFormat.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addScarEligibleFormats(gatewayprotocol.v1.AdFormatOuterClass.AdFormat adFormat) {
            adFormat.getClass();
            ensureScarEligibleFormatsIsMutable();
            this.scarEligibleFormats_.addInt(adFormat.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllScarEligibleFormats(java.lang.Iterable<? extends gatewayprotocol.v1.AdFormatOuterClass.AdFormat> iterable) {
            ensureScarEligibleFormatsIsMutable();
            java.util.Iterator<? extends gatewayprotocol.v1.AdFormatOuterClass.AdFormat> it = iterable.iterator();
            while (it.hasNext()) {
                this.scarEligibleFormats_.addInt(it.next().getNumber());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScarEligibleFormats() {
            this.scarEligibleFormats_ = emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScarEligibleFormatsValue(int i, int i2) {
            ensureScarEligibleFormatsIsMutable();
            this.scarEligibleFormats_.setInt(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addScarEligibleFormatsValue(int i) {
            ensureScarEligibleFormatsIsMutable();
            this.scarEligibleFormats_.addInt(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllScarEligibleFormatsValue(java.lang.Iterable<java.lang.Integer> iterable) {
            ensureScarEligibleFormatsIsMutable();
            java.util.Iterator<java.lang.Integer> it = iterable.iterator();
            while (it.hasNext()) {
                this.scarEligibleFormats_.addInt(it.next().intValue());
            }
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public java.util.List<gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride> getRequestUrlOverridesList() {
            return this.requestUrlOverrides_;
        }

        public java.util.List<? extends gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverrideOrBuilder> getRequestUrlOverridesOrBuilderList() {
            return this.requestUrlOverrides_;
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public int getRequestUrlOverridesCount() {
            return this.requestUrlOverrides_.size();
        }

        @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
        public gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride getRequestUrlOverrides(int i) {
            return this.requestUrlOverrides_.get(i);
        }

        public gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverrideOrBuilder getRequestUrlOverridesOrBuilder(int i) {
            return this.requestUrlOverrides_.get(i);
        }

        private void ensureRequestUrlOverridesIsMutable() {
            com.google.protobuf.Internal.ProtobufList<gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride> protobufList = this.requestUrlOverrides_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.requestUrlOverrides_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRequestUrlOverrides(int i, gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride requestUrlOverride) {
            requestUrlOverride.getClass();
            ensureRequestUrlOverridesIsMutable();
            this.requestUrlOverrides_.set(i, requestUrlOverride);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRequestUrlOverrides(gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride requestUrlOverride) {
            requestUrlOverride.getClass();
            ensureRequestUrlOverridesIsMutable();
            this.requestUrlOverrides_.add(requestUrlOverride);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRequestUrlOverrides(int i, gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride requestUrlOverride) {
            requestUrlOverride.getClass();
            ensureRequestUrlOverridesIsMutable();
            this.requestUrlOverrides_.add(i, requestUrlOverride);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllRequestUrlOverrides(java.lang.Iterable<? extends gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride> iterable) {
            ensureRequestUrlOverridesIsMutable();
            com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.requestUrlOverrides_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRequestUrlOverrides() {
            this.requestUrlOverrides_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeRequestUrlOverrides(int i) {
            ensureRequestUrlOverridesIsMutable();
            this.requestUrlOverrides_.remove(i);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder newBuilder(gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse initializationResponse) {
            return DEFAULT_INSTANCE.createBuilder(initializationResponse);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse, gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder> implements gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.InitializationResponseOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public boolean hasNativeConfiguration() {
                return ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).hasNativeConfiguration();
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration() {
                return ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).getNativeConfiguration();
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder setNativeConfiguration(gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).setNativeConfiguration(nativeConfiguration);
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder setNativeConfiguration(gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).setNativeConfiguration(builder.build());
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder mergeNativeConfiguration(gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).mergeNativeConfiguration(nativeConfiguration);
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder clearNativeConfiguration() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).clearNativeConfiguration();
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public boolean hasUniversalRequestUrl() {
                return ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).hasUniversalRequestUrl();
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public java.lang.String getUniversalRequestUrl() {
                return ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).getUniversalRequestUrl();
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public com.google.protobuf.ByteString getUniversalRequestUrlBytes() {
                return ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).getUniversalRequestUrlBytes();
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder setUniversalRequestUrl(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).setUniversalRequestUrl(str);
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder clearUniversalRequestUrl() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).clearUniversalRequestUrl();
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder setUniversalRequestUrlBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).setUniversalRequestUrlBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public boolean hasError() {
                return ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).hasError();
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public gatewayprotocol.v1.ErrorOuterClass.Error getError() {
                return ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).getError();
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder setError(gatewayprotocol.v1.ErrorOuterClass.Error error) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).setError(error);
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder setError(gatewayprotocol.v1.ErrorOuterClass.Error.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).setError(builder.build());
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder mergeError(gatewayprotocol.v1.ErrorOuterClass.Error error) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).mergeError(error);
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder clearError() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).clearError();
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public boolean getTriggerInitializationCompletedRequest() {
                return ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).getTriggerInitializationCompletedRequest();
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder setTriggerInitializationCompletedRequest(boolean z) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).setTriggerInitializationCompletedRequest(z);
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder clearTriggerInitializationCompletedRequest() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).clearTriggerInitializationCompletedRequest();
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public int getCountOfLastShownCampaigns() {
                return ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).getCountOfLastShownCampaigns();
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder setCountOfLastShownCampaigns(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).setCountOfLastShownCampaigns(i);
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder clearCountOfLastShownCampaigns() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).clearCountOfLastShownCampaigns();
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public int getScarPlacementsCount() {
                return ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).getScarPlacementsMap().size();
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public boolean containsScarPlacements(java.lang.String str) {
                str.getClass();
                return ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).getScarPlacementsMap().containsKey(str);
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder clearScarPlacements() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).getMutableScarPlacementsMap().clear();
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder removeScarPlacements(java.lang.String str) {
                str.getClass();
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).getMutableScarPlacementsMap().remove(str);
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            @java.lang.Deprecated
            public java.util.Map<java.lang.String, gatewayprotocol.v1.InitializationResponseOuterClass.Placement> getScarPlacements() {
                return getScarPlacementsMap();
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public java.util.Map<java.lang.String, gatewayprotocol.v1.InitializationResponseOuterClass.Placement> getScarPlacementsMap() {
                return java.util.Collections.unmodifiableMap(((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).getScarPlacementsMap());
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public gatewayprotocol.v1.InitializationResponseOuterClass.Placement getScarPlacementsOrDefault(java.lang.String str, gatewayprotocol.v1.InitializationResponseOuterClass.Placement placement) {
                str.getClass();
                java.util.Map<java.lang.String, gatewayprotocol.v1.InitializationResponseOuterClass.Placement> scarPlacementsMap = ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).getScarPlacementsMap();
                return scarPlacementsMap.containsKey(str) ? scarPlacementsMap.get(str) : placement;
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public gatewayprotocol.v1.InitializationResponseOuterClass.Placement getScarPlacementsOrThrow(java.lang.String str) {
                str.getClass();
                java.util.Map<java.lang.String, gatewayprotocol.v1.InitializationResponseOuterClass.Placement> scarPlacementsMap = ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).getScarPlacementsMap();
                if (!scarPlacementsMap.containsKey(str)) {
                    throw new java.lang.IllegalArgumentException();
                }
                return scarPlacementsMap.get(str);
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder putScarPlacements(java.lang.String str, gatewayprotocol.v1.InitializationResponseOuterClass.Placement placement) {
                str.getClass();
                placement.getClass();
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).getMutableScarPlacementsMap().put(str, placement);
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder putAllScarPlacements(java.util.Map<java.lang.String, gatewayprotocol.v1.InitializationResponseOuterClass.Placement> map) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).getMutableScarPlacementsMap().putAll(map);
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public java.util.List<gatewayprotocol.v1.AdFormatOuterClass.AdFormat> getScarEligibleFormatsList() {
                return ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).getScarEligibleFormatsList();
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public int getScarEligibleFormatsCount() {
                return ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).getScarEligibleFormatsCount();
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public gatewayprotocol.v1.AdFormatOuterClass.AdFormat getScarEligibleFormats(int i) {
                return ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).getScarEligibleFormats(i);
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder setScarEligibleFormats(int i, gatewayprotocol.v1.AdFormatOuterClass.AdFormat adFormat) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).setScarEligibleFormats(i, adFormat);
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder addScarEligibleFormats(gatewayprotocol.v1.AdFormatOuterClass.AdFormat adFormat) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).addScarEligibleFormats(adFormat);
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder addAllScarEligibleFormats(java.lang.Iterable<? extends gatewayprotocol.v1.AdFormatOuterClass.AdFormat> iterable) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).addAllScarEligibleFormats(iterable);
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder clearScarEligibleFormats() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).clearScarEligibleFormats();
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public java.util.List<java.lang.Integer> getScarEligibleFormatsValueList() {
                return java.util.Collections.unmodifiableList(((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).getScarEligibleFormatsValueList());
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public int getScarEligibleFormatsValue(int i) {
                return ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).getScarEligibleFormatsValue(i);
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder setScarEligibleFormatsValue(int i, int i2) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).setScarEligibleFormatsValue(i, i2);
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder addScarEligibleFormatsValue(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).addScarEligibleFormatsValue(i);
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder addAllScarEligibleFormatsValue(java.lang.Iterable<java.lang.Integer> iterable) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).addAllScarEligibleFormatsValue(iterable);
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public java.util.List<gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride> getRequestUrlOverridesList() {
                return java.util.Collections.unmodifiableList(((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).getRequestUrlOverridesList());
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public int getRequestUrlOverridesCount() {
                return ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).getRequestUrlOverridesCount();
            }

            @Override // gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponseOrBuilder
            public gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride getRequestUrlOverrides(int i) {
                return ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).getRequestUrlOverrides(i);
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder setRequestUrlOverrides(int i, gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride requestUrlOverride) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).setRequestUrlOverrides(i, requestUrlOverride);
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder setRequestUrlOverrides(int i, gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).setRequestUrlOverrides(i, builder.build());
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder addRequestUrlOverrides(gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride requestUrlOverride) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).addRequestUrlOverrides(requestUrlOverride);
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder addRequestUrlOverrides(int i, gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride requestUrlOverride) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).addRequestUrlOverrides(i, requestUrlOverride);
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder addRequestUrlOverrides(gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).addRequestUrlOverrides(builder.build());
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder addRequestUrlOverrides(int i, gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).addRequestUrlOverrides(i, builder.build());
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder addAllRequestUrlOverrides(java.lang.Iterable<? extends gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride> iterable) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).addAllRequestUrlOverrides(iterable);
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder clearRequestUrlOverrides() {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).clearRequestUrlOverrides();
                return this;
            }

            public gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder removeRequestUrlOverrides(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse) this.instance).removeRequestUrlOverrides(i);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.InitializationResponseOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.InitializationResponseOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse();
                case 2:
                    return new gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0001\u0002\u0000\u0001ဉ\u0000\u0002ለ\u0001\u0003ဉ\u0002\u0004\u0007\u0005\u0004\u00062\u0007,\b\u001b", new java.lang.Object[]{"bitField0_", "nativeConfiguration_", "universalRequestUrl_", "error_", "triggerInitializationCompletedRequest_", "countOfLastShownCampaigns_", "scarPlacements_", gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.ScarPlacementsDefaultEntryHolder.defaultEntry, "scarEligibleFormats_", "requestUrlOverrides_", gatewayprotocol.v1.InitializationResponseOuterClass.RequestUrlOverride.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse> parser = PARSER;
                    if (parser == null) {
                        synchronized (gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
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

        public static gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
