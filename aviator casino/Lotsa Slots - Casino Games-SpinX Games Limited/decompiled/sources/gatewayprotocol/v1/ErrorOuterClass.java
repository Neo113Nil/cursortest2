package gatewayprotocol.v1;

/* loaded from: classes6.dex */
public final class ErrorOuterClass {

    public interface ErrorOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        gatewayprotocol.v1.ErrorOuterClass.PublicErrorCode getErrorCode();

        int getErrorCodeValue();

        java.lang.String getErrorText();

        com.google.protobuf.ByteString getErrorTextBytes();

        com.google.protobuf.ByteString getErrorToken();
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private ErrorOuterClass() {
    }

    public enum PublicErrorCode implements com.google.protobuf.Internal.EnumLite {
        PUBLIC_ERROR_CODE_UNSPECIFIED(0),
        PUBLIC_ERROR_CODE_TIMEOUT(2),
        PUBLIC_ERROR_CODE_INIT_UNKNOWN(PUBLIC_ERROR_CODE_INIT_UNKNOWN_VALUE),
        PUBLIC_ERROR_CODE_INIT_NOT_FOUND(PUBLIC_ERROR_CODE_INIT_NOT_FOUND_VALUE),
        PUBLIC_ERROR_CODE_INIT_MISMATCHED_PLATFORM(PUBLIC_ERROR_CODE_INIT_MISMATCHED_PLATFORM_VALUE),
        PUBLIC_ERROR_CODE_INIT_PROTO(PUBLIC_ERROR_CODE_INIT_PROTO_VALUE),
        PUBLIC_ERROR_CODE_INIT_INTERNAL_SYSTEM(PUBLIC_ERROR_CODE_INIT_INTERNAL_SYSTEM_VALUE),
        PUBLIC_ERROR_CODE_INIT_NETWORK(PUBLIC_ERROR_CODE_INIT_NETWORK_VALUE),
        PUBLIC_ERROR_CODE_INIT_FILE_SYSTEM(PUBLIC_ERROR_CODE_INIT_FILE_SYSTEM_VALUE),
        PUBLIC_ERROR_CODE_LOAD_NO_FILL(PUBLIC_ERROR_CODE_LOAD_NO_FILL_VALUE),
        PUBLIC_ERROR_CODE_LOAD_NOT_INITIALIZED(PUBLIC_ERROR_CODE_LOAD_NOT_INITIALIZED_VALUE),
        PUBLIC_ERROR_CODE_LOAD_PLACEMENT_NOT_FOUND(PUBLIC_ERROR_CODE_LOAD_PLACEMENT_NOT_FOUND_VALUE),
        PUBLIC_ERROR_CODE_LOAD_PROTO(PUBLIC_ERROR_CODE_LOAD_PROTO_VALUE),
        PUBLIC_ERROR_CODE_LOAD_UNSUPPORTED_PLACEMENT(PUBLIC_ERROR_CODE_LOAD_UNSUPPORTED_PLACEMENT_VALUE),
        PUBLIC_ERROR_CODE_LOAD_NETWORK(PUBLIC_ERROR_CODE_LOAD_NETWORK_VALUE),
        PUBLIC_ERROR_CODE_LOAD_FILE_SYSTEM(PUBLIC_ERROR_CODE_LOAD_FILE_SYSTEM_VALUE),
        PUBLIC_ERROR_CODE_LOAD_ADVIEWER(PUBLIC_ERROR_CODE_LOAD_ADVIEWER_VALUE),
        PUBLIC_ERROR_CODE_SHOW_EXPIRED(PUBLIC_ERROR_CODE_SHOW_EXPIRED_VALUE),
        PUBLIC_ERROR_CODE_SHOW_ALREADY_SHOWN(PUBLIC_ERROR_CODE_SHOW_ALREADY_SHOWN_VALUE),
        PUBLIC_ERROR_CODE_SHOW_INTERNAL(PUBLIC_ERROR_CODE_SHOW_INTERNAL_VALUE),
        UNRECOGNIZED(-1);

        public static final int PUBLIC_ERROR_CODE_INIT_FILE_SYSTEM_VALUE = 52006;
        public static final int PUBLIC_ERROR_CODE_INIT_INTERNAL_SYSTEM_VALUE = 52004;
        public static final int PUBLIC_ERROR_CODE_INIT_MISMATCHED_PLATFORM_VALUE = 52002;
        public static final int PUBLIC_ERROR_CODE_INIT_NETWORK_VALUE = 52005;
        public static final int PUBLIC_ERROR_CODE_INIT_NOT_FOUND_VALUE = 52001;
        public static final int PUBLIC_ERROR_CODE_INIT_PROTO_VALUE = 52003;
        public static final int PUBLIC_ERROR_CODE_INIT_UNKNOWN_VALUE = 52000;
        public static final int PUBLIC_ERROR_CODE_LOAD_ADVIEWER_VALUE = 52107;
        public static final int PUBLIC_ERROR_CODE_LOAD_FILE_SYSTEM_VALUE = 52106;
        public static final int PUBLIC_ERROR_CODE_LOAD_NETWORK_VALUE = 52105;
        public static final int PUBLIC_ERROR_CODE_LOAD_NOT_INITIALIZED_VALUE = 52101;
        public static final int PUBLIC_ERROR_CODE_LOAD_NO_FILL_VALUE = 52100;
        public static final int PUBLIC_ERROR_CODE_LOAD_PLACEMENT_NOT_FOUND_VALUE = 52102;
        public static final int PUBLIC_ERROR_CODE_LOAD_PROTO_VALUE = 52103;
        public static final int PUBLIC_ERROR_CODE_LOAD_UNSUPPORTED_PLACEMENT_VALUE = 52104;
        public static final int PUBLIC_ERROR_CODE_SHOW_ALREADY_SHOWN_VALUE = 52201;
        public static final int PUBLIC_ERROR_CODE_SHOW_EXPIRED_VALUE = 52200;
        public static final int PUBLIC_ERROR_CODE_SHOW_INTERNAL_VALUE = 52202;
        public static final int PUBLIC_ERROR_CODE_TIMEOUT_VALUE = 2;
        public static final int PUBLIC_ERROR_CODE_UNSPECIFIED_VALUE = 0;
        private static final com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.ErrorOuterClass.PublicErrorCode> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.ErrorOuterClass.PublicErrorCode>() { // from class: gatewayprotocol.v1.ErrorOuterClass.PublicErrorCode.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public gatewayprotocol.v1.ErrorOuterClass.PublicErrorCode findValueByNumber(int i) {
                return gatewayprotocol.v1.ErrorOuterClass.PublicErrorCode.forNumber(i);
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
        public static gatewayprotocol.v1.ErrorOuterClass.PublicErrorCode valueOf(int i) {
            return forNumber(i);
        }

        public static gatewayprotocol.v1.ErrorOuterClass.PublicErrorCode forNumber(int i) {
            if (i == 0) {
                return PUBLIC_ERROR_CODE_UNSPECIFIED;
            }
            if (i == 2) {
                return PUBLIC_ERROR_CODE_TIMEOUT;
            }
            switch (i) {
                case PUBLIC_ERROR_CODE_INIT_UNKNOWN_VALUE:
                    return PUBLIC_ERROR_CODE_INIT_UNKNOWN;
                case PUBLIC_ERROR_CODE_INIT_NOT_FOUND_VALUE:
                    return PUBLIC_ERROR_CODE_INIT_NOT_FOUND;
                case PUBLIC_ERROR_CODE_INIT_MISMATCHED_PLATFORM_VALUE:
                    return PUBLIC_ERROR_CODE_INIT_MISMATCHED_PLATFORM;
                case PUBLIC_ERROR_CODE_INIT_PROTO_VALUE:
                    return PUBLIC_ERROR_CODE_INIT_PROTO;
                case PUBLIC_ERROR_CODE_INIT_INTERNAL_SYSTEM_VALUE:
                    return PUBLIC_ERROR_CODE_INIT_INTERNAL_SYSTEM;
                case PUBLIC_ERROR_CODE_INIT_NETWORK_VALUE:
                    return PUBLIC_ERROR_CODE_INIT_NETWORK;
                case PUBLIC_ERROR_CODE_INIT_FILE_SYSTEM_VALUE:
                    return PUBLIC_ERROR_CODE_INIT_FILE_SYSTEM;
                default:
                    switch (i) {
                        case PUBLIC_ERROR_CODE_LOAD_NO_FILL_VALUE:
                            return PUBLIC_ERROR_CODE_LOAD_NO_FILL;
                        case PUBLIC_ERROR_CODE_LOAD_NOT_INITIALIZED_VALUE:
                            return PUBLIC_ERROR_CODE_LOAD_NOT_INITIALIZED;
                        case PUBLIC_ERROR_CODE_LOAD_PLACEMENT_NOT_FOUND_VALUE:
                            return PUBLIC_ERROR_CODE_LOAD_PLACEMENT_NOT_FOUND;
                        case PUBLIC_ERROR_CODE_LOAD_PROTO_VALUE:
                            return PUBLIC_ERROR_CODE_LOAD_PROTO;
                        case PUBLIC_ERROR_CODE_LOAD_UNSUPPORTED_PLACEMENT_VALUE:
                            return PUBLIC_ERROR_CODE_LOAD_UNSUPPORTED_PLACEMENT;
                        case PUBLIC_ERROR_CODE_LOAD_NETWORK_VALUE:
                            return PUBLIC_ERROR_CODE_LOAD_NETWORK;
                        case PUBLIC_ERROR_CODE_LOAD_FILE_SYSTEM_VALUE:
                            return PUBLIC_ERROR_CODE_LOAD_FILE_SYSTEM;
                        case PUBLIC_ERROR_CODE_LOAD_ADVIEWER_VALUE:
                            return PUBLIC_ERROR_CODE_LOAD_ADVIEWER;
                        default:
                            switch (i) {
                                case PUBLIC_ERROR_CODE_SHOW_EXPIRED_VALUE:
                                    return PUBLIC_ERROR_CODE_SHOW_EXPIRED;
                                case PUBLIC_ERROR_CODE_SHOW_ALREADY_SHOWN_VALUE:
                                    return PUBLIC_ERROR_CODE_SHOW_ALREADY_SHOWN;
                                case PUBLIC_ERROR_CODE_SHOW_INTERNAL_VALUE:
                                    return PUBLIC_ERROR_CODE_SHOW_INTERNAL;
                                default:
                                    return null;
                            }
                    }
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.ErrorOuterClass.PublicErrorCode> internalGetValueMap() {
            return internalValueMap;
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return gatewayprotocol.v1.ErrorOuterClass.PublicErrorCode.PublicErrorCodeVerifier.INSTANCE;
        }

        private static final class PublicErrorCodeVerifier implements com.google.protobuf.Internal.EnumVerifier {
            static final com.google.protobuf.Internal.EnumVerifier INSTANCE = new gatewayprotocol.v1.ErrorOuterClass.PublicErrorCode.PublicErrorCodeVerifier();

            private PublicErrorCodeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return gatewayprotocol.v1.ErrorOuterClass.PublicErrorCode.forNumber(i) != null;
            }
        }

        PublicErrorCode(int i) {
            this.value = i;
        }
    }

    public static final class Error extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.ErrorOuterClass.Error, gatewayprotocol.v1.ErrorOuterClass.Error.Builder> implements gatewayprotocol.v1.ErrorOuterClass.ErrorOrBuilder {
        private static final gatewayprotocol.v1.ErrorOuterClass.Error DEFAULT_INSTANCE;
        public static final int ERROR_CODE_FIELD_NUMBER = 3;
        public static final int ERROR_TEXT_FIELD_NUMBER = 2;
        public static final int ERROR_TOKEN_FIELD_NUMBER = 4;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.ErrorOuterClass.Error> PARSER;
        private int errorCode_;
        private java.lang.String errorText_ = "";
        private com.google.protobuf.ByteString errorToken_ = com.google.protobuf.ByteString.EMPTY;

        private Error() {
        }

        @Override // gatewayprotocol.v1.ErrorOuterClass.ErrorOrBuilder
        public java.lang.String getErrorText() {
            return this.errorText_;
        }

        @Override // gatewayprotocol.v1.ErrorOuterClass.ErrorOrBuilder
        public com.google.protobuf.ByteString getErrorTextBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.errorText_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorText(java.lang.String str) {
            str.getClass();
            this.errorText_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrorText() {
            this.errorText_ = getDefaultInstance().getErrorText();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorTextBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.errorText_ = byteString.toStringUtf8();
        }

        @Override // gatewayprotocol.v1.ErrorOuterClass.ErrorOrBuilder
        public int getErrorCodeValue() {
            return this.errorCode_;
        }

        @Override // gatewayprotocol.v1.ErrorOuterClass.ErrorOrBuilder
        public gatewayprotocol.v1.ErrorOuterClass.PublicErrorCode getErrorCode() {
            gatewayprotocol.v1.ErrorOuterClass.PublicErrorCode forNumber = gatewayprotocol.v1.ErrorOuterClass.PublicErrorCode.forNumber(this.errorCode_);
            return forNumber == null ? gatewayprotocol.v1.ErrorOuterClass.PublicErrorCode.UNRECOGNIZED : forNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorCodeValue(int i) {
            this.errorCode_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorCode(gatewayprotocol.v1.ErrorOuterClass.PublicErrorCode publicErrorCode) {
            this.errorCode_ = publicErrorCode.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrorCode() {
            this.errorCode_ = 0;
        }

        @Override // gatewayprotocol.v1.ErrorOuterClass.ErrorOrBuilder
        public com.google.protobuf.ByteString getErrorToken() {
            return this.errorToken_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorToken(com.google.protobuf.ByteString byteString) {
            byteString.getClass();
            this.errorToken_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrorToken() {
            this.errorToken_ = getDefaultInstance().getErrorToken();
        }

        public static gatewayprotocol.v1.ErrorOuterClass.Error parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.ErrorOuterClass.Error) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.ErrorOuterClass.Error parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.ErrorOuterClass.Error) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.ErrorOuterClass.Error parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.ErrorOuterClass.Error) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.ErrorOuterClass.Error parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.ErrorOuterClass.Error) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.ErrorOuterClass.Error parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.ErrorOuterClass.Error) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.ErrorOuterClass.Error parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.ErrorOuterClass.Error) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.ErrorOuterClass.Error parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.ErrorOuterClass.Error) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.ErrorOuterClass.Error parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.ErrorOuterClass.Error) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.ErrorOuterClass.Error parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.ErrorOuterClass.Error) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.ErrorOuterClass.Error parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.ErrorOuterClass.Error) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.ErrorOuterClass.Error parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.ErrorOuterClass.Error) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.ErrorOuterClass.Error parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.ErrorOuterClass.Error) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.ErrorOuterClass.Error.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.ErrorOuterClass.Error.Builder newBuilder(gatewayprotocol.v1.ErrorOuterClass.Error error) {
            return DEFAULT_INSTANCE.createBuilder(error);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.ErrorOuterClass.Error, gatewayprotocol.v1.ErrorOuterClass.Error.Builder> implements gatewayprotocol.v1.ErrorOuterClass.ErrorOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.ErrorOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.ErrorOuterClass.Error.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.ErrorOuterClass.ErrorOrBuilder
            public java.lang.String getErrorText() {
                return ((gatewayprotocol.v1.ErrorOuterClass.Error) this.instance).getErrorText();
            }

            @Override // gatewayprotocol.v1.ErrorOuterClass.ErrorOrBuilder
            public com.google.protobuf.ByteString getErrorTextBytes() {
                return ((gatewayprotocol.v1.ErrorOuterClass.Error) this.instance).getErrorTextBytes();
            }

            public gatewayprotocol.v1.ErrorOuterClass.Error.Builder setErrorText(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.ErrorOuterClass.Error) this.instance).setErrorText(str);
                return this;
            }

            public gatewayprotocol.v1.ErrorOuterClass.Error.Builder clearErrorText() {
                copyOnWrite();
                ((gatewayprotocol.v1.ErrorOuterClass.Error) this.instance).clearErrorText();
                return this;
            }

            public gatewayprotocol.v1.ErrorOuterClass.Error.Builder setErrorTextBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.ErrorOuterClass.Error) this.instance).setErrorTextBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.ErrorOuterClass.ErrorOrBuilder
            public int getErrorCodeValue() {
                return ((gatewayprotocol.v1.ErrorOuterClass.Error) this.instance).getErrorCodeValue();
            }

            public gatewayprotocol.v1.ErrorOuterClass.Error.Builder setErrorCodeValue(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.ErrorOuterClass.Error) this.instance).setErrorCodeValue(i);
                return this;
            }

            @Override // gatewayprotocol.v1.ErrorOuterClass.ErrorOrBuilder
            public gatewayprotocol.v1.ErrorOuterClass.PublicErrorCode getErrorCode() {
                return ((gatewayprotocol.v1.ErrorOuterClass.Error) this.instance).getErrorCode();
            }

            public gatewayprotocol.v1.ErrorOuterClass.Error.Builder setErrorCode(gatewayprotocol.v1.ErrorOuterClass.PublicErrorCode publicErrorCode) {
                copyOnWrite();
                ((gatewayprotocol.v1.ErrorOuterClass.Error) this.instance).setErrorCode(publicErrorCode);
                return this;
            }

            public gatewayprotocol.v1.ErrorOuterClass.Error.Builder clearErrorCode() {
                copyOnWrite();
                ((gatewayprotocol.v1.ErrorOuterClass.Error) this.instance).clearErrorCode();
                return this;
            }

            @Override // gatewayprotocol.v1.ErrorOuterClass.ErrorOrBuilder
            public com.google.protobuf.ByteString getErrorToken() {
                return ((gatewayprotocol.v1.ErrorOuterClass.Error) this.instance).getErrorToken();
            }

            public gatewayprotocol.v1.ErrorOuterClass.Error.Builder setErrorToken(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.ErrorOuterClass.Error) this.instance).setErrorToken(byteString);
                return this;
            }

            public gatewayprotocol.v1.ErrorOuterClass.Error.Builder clearErrorToken() {
                copyOnWrite();
                ((gatewayprotocol.v1.ErrorOuterClass.Error) this.instance).clearErrorToken();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.ErrorOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.ErrorOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.ErrorOuterClass.Error();
                case 2:
                    return new gatewayprotocol.v1.ErrorOuterClass.Error.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0002\u0004\u0003\u0000\u0000\u0000\u0002Ȉ\u0003\f\u0004\n", new java.lang.Object[]{"errorText_", "errorCode_", "errorToken_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.ErrorOuterClass.Error> parser = PARSER;
                    if (parser == null) {
                        synchronized (gatewayprotocol.v1.ErrorOuterClass.Error.class) {
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
            gatewayprotocol.v1.ErrorOuterClass.Error error = new gatewayprotocol.v1.ErrorOuterClass.Error();
            DEFAULT_INSTANCE = error;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.ErrorOuterClass.Error.class, error);
        }

        public static gatewayprotocol.v1.ErrorOuterClass.Error getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.ErrorOuterClass.Error> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: gatewayprotocol.v1.ErrorOuterClass$1, reason: invalid class name */
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
}
