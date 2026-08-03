package gatewayprotocol.v1;

/* loaded from: classes6.dex */
public final class AudienceManagementResponseOuterClass {

    public interface AudienceManagementResponseOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        com.google.protobuf.ByteString getAudienceManagementData();

        gatewayprotocol.v1.ErrorOuterClass.Error getError();

        boolean hasError();
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private AudienceManagementResponseOuterClass() {
    }

    public static final class AudienceManagementResponse extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse, gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse.Builder> implements gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponseOrBuilder {
        public static final int AUDIENCE_MANAGEMENT_DATA_FIELD_NUMBER = 1;
        private static final gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse DEFAULT_INSTANCE;
        public static final int ERROR_FIELD_NUMBER = 2;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse> PARSER;
        private com.google.protobuf.ByteString audienceManagementData_ = com.google.protobuf.ByteString.EMPTY;
        private int bitField0_;
        private gatewayprotocol.v1.ErrorOuterClass.Error error_;

        private AudienceManagementResponse() {
        }

        @Override // gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponseOrBuilder
        public com.google.protobuf.ByteString getAudienceManagementData() {
            return this.audienceManagementData_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAudienceManagementData(com.google.protobuf.ByteString byteString) {
            byteString.getClass();
            this.audienceManagementData_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAudienceManagementData() {
            this.audienceManagementData_ = getDefaultInstance().getAudienceManagementData();
        }

        @Override // gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponseOrBuilder
        public boolean hasError() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponseOrBuilder
        public gatewayprotocol.v1.ErrorOuterClass.Error getError() {
            gatewayprotocol.v1.ErrorOuterClass.Error error = this.error_;
            return error == null ? gatewayprotocol.v1.ErrorOuterClass.Error.getDefaultInstance() : error;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setError(gatewayprotocol.v1.ErrorOuterClass.Error error) {
            error.getClass();
            this.error_ = error;
            this.bitField0_ |= 1;
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
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearError() {
            this.error_ = null;
            this.bitField0_ &= -2;
        }

        public static gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse.Builder newBuilder(gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse audienceManagementResponse) {
            return DEFAULT_INSTANCE.createBuilder(audienceManagementResponse);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse, gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse.Builder> implements gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponseOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.AudienceManagementResponseOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponseOrBuilder
            public com.google.protobuf.ByteString getAudienceManagementData() {
                return ((gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse) this.instance).getAudienceManagementData();
            }

            public gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse.Builder setAudienceManagementData(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse) this.instance).setAudienceManagementData(byteString);
                return this;
            }

            public gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse.Builder clearAudienceManagementData() {
                copyOnWrite();
                ((gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse) this.instance).clearAudienceManagementData();
                return this;
            }

            @Override // gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponseOrBuilder
            public boolean hasError() {
                return ((gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse) this.instance).hasError();
            }

            @Override // gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponseOrBuilder
            public gatewayprotocol.v1.ErrorOuterClass.Error getError() {
                return ((gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse) this.instance).getError();
            }

            public gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse.Builder setError(gatewayprotocol.v1.ErrorOuterClass.Error error) {
                copyOnWrite();
                ((gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse) this.instance).setError(error);
                return this;
            }

            public gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse.Builder setError(gatewayprotocol.v1.ErrorOuterClass.Error.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse) this.instance).setError(builder.build());
                return this;
            }

            public gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse.Builder mergeError(gatewayprotocol.v1.ErrorOuterClass.Error error) {
                copyOnWrite();
                ((gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse) this.instance).mergeError(error);
                return this;
            }

            public gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse.Builder clearError() {
                copyOnWrite();
                ((gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse) this.instance).clearError();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.AudienceManagementResponseOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.AudienceManagementResponseOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse();
                case 2:
                    return new gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002ဉ\u0000", new java.lang.Object[]{"bitField0_", "audienceManagementData_", "error_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse> parser = PARSER;
                    if (parser == null) {
                        synchronized (gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse.class) {
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
            gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse audienceManagementResponse = new gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse();
            DEFAULT_INSTANCE = audienceManagementResponse;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse.class, audienceManagementResponse);
        }

        public static gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.AudienceManagementResponseOuterClass.AudienceManagementResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: gatewayprotocol.v1.AudienceManagementResponseOuterClass$1, reason: invalid class name */
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
