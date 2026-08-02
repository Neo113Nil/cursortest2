package com.plaid.internal.core.protos.link.workflow.primitives;

/* loaded from: classes16.dex */
public final class SdkResult$SDKResult extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult, com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int CALLBACK_FIELD_NUMBER = 1;
    private static final com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 3;
    public static final int METADATA_FIELD_NUMBER = 4;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult> PARSER = null;
    public static final int PUBLIC_TOKEN_FIELD_NUMBER = 2;
    private int bitField0_;
    private int callback_;
    private com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error error_;
    private com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata metadata_;
    private java.lang.String publicToken_ = "";

    public static final class Error extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error, com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Error.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error DEFAULT_INSTANCE;
        public static final int DISPLAY_MESSAGE_FIELD_NUMBER = 4;
        public static final int ERROR_CODE_FIELD_NUMBER = 2;
        public static final int ERROR_MESSAGE_FIELD_NUMBER = 3;
        public static final int ERROR_TYPE_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error> PARSER = null;
        public static final int REQUEST_ID_FIELD_NUMBER = 5;
        private java.lang.String errorType_ = "";
        private java.lang.String errorCode_ = "";
        private java.lang.String errorMessage_ = "";
        private java.lang.String displayMessage_ = "";
        private java.lang.String requestId_ = "";

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error, com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Error.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error error = new com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error();
            DEFAULT_INSTANCE = error;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error.class, error);
        }

        private Error() {
        }

        private void clearDisplayMessage() {
            this.displayMessage_ = getDefaultInstance().getDisplayMessage();
        }

        private void clearErrorCode() {
            this.errorCode_ = getDefaultInstance().getErrorCode();
        }

        private void clearErrorMessage() {
            this.errorMessage_ = getDefaultInstance().getErrorMessage();
        }

        private void clearErrorType() {
            this.errorType_ = getDefaultInstance().getErrorType();
        }

        private void clearRequestId() {
            this.requestId_ = getDefaultInstance().getRequestId();
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Error.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setDisplayMessageBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.displayMessage_ = byteString.toStringUtf8();
        }

        private void setErrorCodeBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.errorCode_ = byteString.toStringUtf8();
        }

        private void setErrorMessageBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.errorMessage_ = byteString.toStringUtf8();
        }

        private void setErrorTypeBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.errorType_ = byteString.toStringUtf8();
        }

        private void setRequestIdBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.requestId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.primitives.s.f6382a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Error.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new java.lang.Object[]{"errorType_", "errorCode_", "errorMessage_", "displayMessage_", "requestId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error.class) {
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

        public final java.lang.String getDisplayMessage() {
            return this.displayMessage_;
        }

        public final com.google.protobuf.ByteString getDisplayMessageBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.displayMessage_);
        }

        public final java.lang.String getErrorCode() {
            return this.errorCode_;
        }

        public final com.google.protobuf.ByteString getErrorCodeBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.errorCode_);
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage_;
        }

        public final com.google.protobuf.ByteString getErrorMessageBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.errorMessage_);
        }

        public final java.lang.String getErrorType() {
            return this.errorType_;
        }

        public final com.google.protobuf.ByteString getErrorTypeBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.errorType_);
        }

        public final java.lang.String getRequestId() {
            return this.requestId_;
        }

        public final com.google.protobuf.ByteString getRequestIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.requestId_);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Error.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error error) {
            return DEFAULT_INSTANCE.createBuilder(error);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setDisplayMessage(java.lang.String str) {
            this.displayMessage_ = str;
        }

        private void setErrorCode(java.lang.String str) {
            this.errorCode_ = str;
        }

        private void setErrorMessage(java.lang.String str) {
            this.errorMessage_ = str;
        }

        private void setErrorType(java.lang.String str) {
            this.errorType_ = str;
        }

        private void setRequestId(java.lang.String str) {
            this.requestId_ = str;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Metadata extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata, com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.b> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int ACCOUNTS_FIELD_NUMBER = 4;
        public static final int ACCOUNT_FIELD_NUMBER = 5;
        public static final int ACCOUNT_ID_FIELD_NUMBER = 6;
        private static final com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata DEFAULT_INSTANCE;
        public static final int INSTITUTION_FIELD_NUMBER = 3;
        public static final int LINK_SESSION_ID_FIELD_NUMBER = 2;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata> PARSER = null;
        public static final int REQUEST_ID_FIELD_NUMBER = 8;
        public static final int STATUS_FIELD_NUMBER = 1;
        public static final int TRANSFER_STATUS_FIELD_NUMBER = 7;
        public static final int WALLET_FIELD_NUMBER = 9;
        private com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account account_;
        private int bitField0_;
        private com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution institution_;
        private com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet wallet_;
        private java.lang.String status_ = "";
        private java.lang.String linkSessionId_ = "";
        private java.lang.String requestId_ = "";
        private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account> accounts_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
        private java.lang.String accountId_ = "";
        private java.lang.String transferStatus_ = "";

        public static final class Account extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account, com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account.a> implements com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.a {
            public static final int CLASS_TYPE_FIELD_NUMBER = 7;
            private static final com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account DEFAULT_INSTANCE;
            public static final int ID_FIELD_NUMBER = 1;
            public static final int MASK_FIELD_NUMBER = 3;
            public static final int NAME_FIELD_NUMBER = 2;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account> PARSER = null;
            public static final int SUBTYPE_FIELD_NUMBER = 5;
            public static final int TYPE_FIELD_NUMBER = 4;
            public static final int VERIFICATION_STATUS_FIELD_NUMBER = 6;
            private java.lang.String id_ = "";
            private java.lang.String name_ = "";
            private java.lang.String mask_ = "";
            private java.lang.String type_ = "";
            private java.lang.String subtype_ = "";
            private java.lang.String verificationStatus_ = "";
            private java.lang.String classType_ = "";

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account, com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account.a> implements com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.a {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account account = new com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account();
                DEFAULT_INSTANCE = account;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account.class, account);
            }

            private Account() {
            }

            private void clearClassType() {
                this.classType_ = getDefaultInstance().getClassType();
            }

            private void clearId() {
                this.id_ = getDefaultInstance().getId();
            }

            private void clearMask() {
                this.mask_ = getDefaultInstance().getMask();
            }

            private void clearName() {
                this.name_ = getDefaultInstance().getName();
            }

            private void clearSubtype() {
                this.subtype_ = getDefaultInstance().getSubtype();
            }

            private void clearType() {
                this.type_ = getDefaultInstance().getType();
            }

            private void clearVerificationStatus() {
                this.verificationStatus_ = getDefaultInstance().getVerificationStatus();
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setClassTypeBytes(com.google.protobuf.ByteString byteString) {
                com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                this.classType_ = byteString.toStringUtf8();
            }

            private void setIdBytes(com.google.protobuf.ByteString byteString) {
                com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                this.id_ = byteString.toStringUtf8();
            }

            private void setMaskBytes(com.google.protobuf.ByteString byteString) {
                com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                this.mask_ = byteString.toStringUtf8();
            }

            private void setNameBytes(com.google.protobuf.ByteString byteString) {
                com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                this.name_ = byteString.toStringUtf8();
            }

            private void setSubtypeBytes(com.google.protobuf.ByteString byteString) {
                com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                this.subtype_ = byteString.toStringUtf8();
            }

            private void setTypeBytes(com.google.protobuf.ByteString byteString) {
                com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                this.type_ = byteString.toStringUtf8();
            }

            private void setVerificationStatusBytes(com.google.protobuf.ByteString byteString) {
                com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                this.verificationStatus_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.primitives.s.f6382a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ", new java.lang.Object[]{"id_", "name_", "mask_", "type_", "subtype_", "verificationStatus_", "classType_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account.class) {
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

            public final java.lang.String getClassType() {
                return this.classType_;
            }

            public final com.google.protobuf.ByteString getClassTypeBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.classType_);
            }

            public final java.lang.String getId() {
                return this.id_;
            }

            public final com.google.protobuf.ByteString getIdBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.id_);
            }

            public final java.lang.String getMask() {
                return this.mask_;
            }

            public final com.google.protobuf.ByteString getMaskBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.mask_);
            }

            public final java.lang.String getName() {
                return this.name_;
            }

            public final com.google.protobuf.ByteString getNameBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.name_);
            }

            public final java.lang.String getSubtype() {
                return this.subtype_;
            }

            public final com.google.protobuf.ByteString getSubtypeBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.subtype_);
            }

            public final java.lang.String getType() {
                return this.type_;
            }

            public final com.google.protobuf.ByteString getTypeBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.type_);
            }

            public final java.lang.String getVerificationStatus() {
                return this.verificationStatus_;
            }

            public final com.google.protobuf.ByteString getVerificationStatusBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.verificationStatus_);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account account) {
                return DEFAULT_INSTANCE.createBuilder(account);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            private void setClassType(java.lang.String str) {
                this.classType_ = str;
            }

            private void setId(java.lang.String str) {
                this.id_ = str;
            }

            private void setMask(java.lang.String str) {
                this.mask_ = str;
            }

            private void setName(java.lang.String str) {
                this.name_ = str;
            }

            private void setSubtype(java.lang.String str) {
                this.subtype_ = str;
            }

            private void setType(java.lang.String str) {
                this.type_ = str;
            }

            private void setVerificationStatus(java.lang.String str) {
                this.verificationStatus_ = str;
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Institution extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution, com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution DEFAULT_INSTANCE;
            public static final int INSTITUTION_ID_FIELD_NUMBER = 2;
            public static final int NAME_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution> PARSER;
            private java.lang.String name_ = "";
            private java.lang.String institutionId_ = "";

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution, com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution institution = new com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution();
                DEFAULT_INSTANCE = institution;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution.class, institution);
            }

            private Institution() {
            }

            private void clearInstitutionId() {
                this.institutionId_ = getDefaultInstance().getInstitutionId();
            }

            private void clearName() {
                this.name_ = getDefaultInstance().getName();
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setInstitutionIdBytes(com.google.protobuf.ByteString byteString) {
                com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                this.institutionId_ = byteString.toStringUtf8();
            }

            private void setNameBytes(com.google.protobuf.ByteString byteString) {
                com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                this.name_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.primitives.s.f6382a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new java.lang.Object[]{"name_", "institutionId_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution.class) {
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

            public final java.lang.String getInstitutionId() {
                return this.institutionId_;
            }

            public final com.google.protobuf.ByteString getInstitutionIdBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.institutionId_);
            }

            public final java.lang.String getName() {
                return this.name_;
            }

            public final com.google.protobuf.ByteString getNameBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.name_);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution institution) {
                return DEFAULT_INSTANCE.createBuilder(institution);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            private void setInstitutionId(java.lang.String str) {
                this.institutionId_ = str;
            }

            private void setName(java.lang.String str) {
                this.name_ = str;
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Wallet extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet, com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet DEFAULT_INSTANCE;
            public static final int NAME_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet> PARSER;
            private java.lang.String name_ = "";

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet, com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet wallet = new com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet();
                DEFAULT_INSTANCE = wallet;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet.class, wallet);
            }

            private Wallet() {
            }

            private void clearName() {
                this.name_ = getDefaultInstance().getName();
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setNameBytes(com.google.protobuf.ByteString byteString) {
                com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                this.name_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.primitives.s.f6382a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new java.lang.Object[]{"name_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet.class) {
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

            public final java.lang.String getName() {
                return this.name_;
            }

            public final com.google.protobuf.ByteString getNameBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.name_);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet wallet) {
                return DEFAULT_INSTANCE.createBuilder(wallet);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            private void setName(java.lang.String str) {
                this.name_ = str;
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public interface a extends com.google.protobuf.MessageLiteOrBuilder {
        }

        public static final class b extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata, com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.b> implements com.google.protobuf.MessageLiteOrBuilder {
            public b() {
                super(com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata metadata = new com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata();
            DEFAULT_INSTANCE = metadata;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata.class, metadata);
        }

        private Metadata() {
        }

        private void addAllAccounts(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account> iterable) {
            ensureAccountsIsMutable();
            com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.accounts_);
        }

        private void clearAccount() {
            this.account_ = null;
            this.bitField0_ &= -3;
        }

        private void clearAccountId() {
            this.accountId_ = getDefaultInstance().getAccountId();
        }

        private void clearAccounts() {
            this.accounts_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
        }

        private void clearInstitution() {
            this.institution_ = null;
            this.bitField0_ &= -2;
        }

        private void clearLinkSessionId() {
            this.linkSessionId_ = getDefaultInstance().getLinkSessionId();
        }

        private void clearRequestId() {
            this.requestId_ = getDefaultInstance().getRequestId();
        }

        private void clearStatus() {
            this.status_ = getDefaultInstance().getStatus();
        }

        private void clearTransferStatus() {
            this.transferStatus_ = getDefaultInstance().getTransferStatus();
        }

        private void clearWallet() {
            this.wallet_ = null;
            this.bitField0_ &= -5;
        }

        private void ensureAccountsIsMutable() {
            com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account> protobufList = this.accounts_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.accounts_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.b newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeAccounts(int i) {
            ensureAccountsIsMutable();
            this.accounts_.remove(i);
        }

        private void setAccountIdBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.accountId_ = byteString.toStringUtf8();
        }

        private void setLinkSessionIdBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.linkSessionId_ = byteString.toStringUtf8();
        }

        private void setRequestIdBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.requestId_ = byteString.toStringUtf8();
        }

        private void setStatusBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.status_ = byteString.toStringUtf8();
        }

        private void setTransferStatusBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.transferStatus_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.primitives.s.f6382a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.b();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004\u001b\u0005ဉ\u0001\u0006Ȉ\u0007Ȉ\bȈ\tဉ\u0002", new java.lang.Object[]{"bitField0_", "status_", "linkSessionId_", "institution_", "accounts_", com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account.class, "account_", "accountId_", "transferStatus_", "requestId_", "wallet_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account getAccount() {
            com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account account = this.account_;
            return account == null ? com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account.getDefaultInstance() : account;
        }

        public final java.lang.String getAccountId() {
            return this.accountId_;
        }

        public final com.google.protobuf.ByteString getAccountIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.accountId_);
        }

        public final com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account getAccounts(int i) {
            return this.accounts_.get(i);
        }

        public final int getAccountsCount() {
            return this.accounts_.size();
        }

        public final java.util.List<com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account> getAccountsList() {
            return this.accounts_;
        }

        public final com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.a getAccountsOrBuilder(int i) {
            return this.accounts_.get(i);
        }

        public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.a> getAccountsOrBuilderList() {
            return this.accounts_;
        }

        public final com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution getInstitution() {
            com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution institution = this.institution_;
            return institution == null ? com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution.getDefaultInstance() : institution;
        }

        public final java.lang.String getLinkSessionId() {
            return this.linkSessionId_;
        }

        public final com.google.protobuf.ByteString getLinkSessionIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.linkSessionId_);
        }

        public final java.lang.String getRequestId() {
            return this.requestId_;
        }

        public final com.google.protobuf.ByteString getRequestIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.requestId_);
        }

        public final java.lang.String getStatus() {
            return this.status_;
        }

        public final com.google.protobuf.ByteString getStatusBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.status_);
        }

        public final java.lang.String getTransferStatus() {
            return this.transferStatus_;
        }

        public final com.google.protobuf.ByteString getTransferStatusBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.transferStatus_);
        }

        public final com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet getWallet() {
            com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet wallet = this.wallet_;
            return wallet == null ? com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet.getDefaultInstance() : wallet;
        }

        public final boolean hasAccount() {
            return (this.bitField0_ & 2) != 0;
        }

        public final boolean hasInstitution() {
            return (this.bitField0_ & 1) != 0;
        }

        public final boolean hasWallet() {
            return (this.bitField0_ & 4) != 0;
        }

        private void addAccounts(com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account account) {
            ensureAccountsIsMutable();
            this.accounts_.add(account);
        }

        private void mergeAccount(com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account account) {
            com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account account2 = this.account_;
            if (account2 == null || account2 == com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account.getDefaultInstance()) {
                this.account_ = account;
            } else {
                this.account_ = com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account.newBuilder(this.account_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account.a) account).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        private void mergeInstitution(com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution institution) {
            com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution institution2 = this.institution_;
            if (institution2 == null || institution2 == com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution.getDefaultInstance()) {
                this.institution_ = institution;
            } else {
                this.institution_ = com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution.newBuilder(this.institution_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution.a) institution).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        private void mergeWallet(com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet wallet) {
            com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet wallet2 = this.wallet_;
            if (wallet2 == null || wallet2 == com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet.getDefaultInstance()) {
                this.wallet_ = wallet;
            } else {
                this.wallet_ = com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet.newBuilder(this.wallet_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet.a) wallet).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.b newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata metadata) {
            return DEFAULT_INSTANCE.createBuilder(metadata);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setAccount(com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account account) {
            this.account_ = account;
            this.bitField0_ |= 2;
        }

        private void setAccounts(int i, com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account account) {
            ensureAccountsIsMutable();
            this.accounts_.set(i, account);
        }

        private void setInstitution(com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution institution) {
            this.institution_ = institution;
            this.bitField0_ |= 1;
        }

        private void setWallet(com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Wallet wallet) {
            this.wallet_ = wallet;
            this.bitField0_ |= 4;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setAccountId(java.lang.String str) {
            this.accountId_ = str;
        }

        private void setLinkSessionId(java.lang.String str) {
            this.linkSessionId_ = str;
        }

        private void setRequestId(java.lang.String str) {
            this.requestId_ = str;
        }

        private void setStatus(java.lang.String str) {
            this.status_ = str;
        }

        private void setTransferStatus(java.lang.String str) {
            this.transferStatus_ = str;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        private void addAccounts(int i, com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account account) {
            ensureAccountsIsMutable();
            this.accounts_.add(i, account);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult, com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.DEFAULT_INSTANCE);
        }
    }

    public enum b implements com.google.protobuf.Internal.EnumLite {
        SDK_RESULT_CALLBACK_UNKNOWN(0),
        SDK_RESULT_CALLBACK_SUCCESS(1),
        SDK_RESULT_CALLBACK_ERROR(2),
        SDK_RESULT_CALLBACK_HTA_REDIRECT(3),
        UNRECOGNIZED(-1);

        public static final int SDK_RESULT_CALLBACK_ERROR_VALUE = 2;
        public static final int SDK_RESULT_CALLBACK_HTA_REDIRECT_VALUE = 3;
        public static final int SDK_RESULT_CALLBACK_SUCCESS_VALUE = 1;
        public static final int SDK_RESULT_CALLBACK_UNKNOWN_VALUE = 0;
        public static final com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.b.a b = new com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.b.a();

        /* renamed from: a, reason: collision with root package name */
        public final int f6353a;

        public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.b> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.b findValueByNumber(int i) {
                return com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.b.forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult$b$b, reason: collision with other inner class name */
        public static final class C0194b implements com.google.protobuf.Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.b.C0194b f6354a = new com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.b.C0194b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.b.forNumber(i) != null;
            }
        }

        b(int i) {
            this.f6353a = i;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.b forNumber(int i) {
            if (i == 0) {
                return SDK_RESULT_CALLBACK_UNKNOWN;
            }
            if (i == 1) {
                return SDK_RESULT_CALLBACK_SUCCESS;
            }
            if (i == 2) {
                return SDK_RESULT_CALLBACK_ERROR;
            }
            if (i != 3) {
                return null;
            }
            return SDK_RESULT_CALLBACK_HTA_REDIRECT;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.b> internalGetValueMap() {
            return b;
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.b.C0194b.f6354a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f6353a;
            }
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.b valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult sdkResult$SDKResult = new com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult();
        DEFAULT_INSTANCE = sdkResult$SDKResult;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.class, sdkResult$SDKResult);
    }

    private SdkResult$SDKResult() {
    }

    private void clearCallback() {
        this.callback_ = 0;
    }

    private void clearError() {
        this.error_ = null;
        this.bitField0_ &= -2;
    }

    private void clearMetadata() {
        this.metadata_ = null;
        this.bitField0_ &= -3;
    }

    private void clearPublicToken() {
        this.publicToken_ = getDefaultInstance().getPublicToken();
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCallback(com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.b bVar) {
        this.callback_ = bVar.getNumber();
    }

    private void setCallbackValue(int i) {
        this.callback_ = i;
    }

    private void setPublicTokenBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.publicToken_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.primitives.s.f6382a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003ဉ\u0000\u0004ဉ\u0001", new java.lang.Object[]{"bitField0_", "callback_", "publicToken_", "error_", "metadata_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.class) {
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

    public final com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.b getCallback() {
        com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.b forNumber = com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.b.forNumber(this.callback_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.b.UNRECOGNIZED : forNumber;
    }

    public final int getCallbackValue() {
        return this.callback_;
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error getError() {
        com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error error = this.error_;
        return error == null ? com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error.getDefaultInstance() : error;
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata getMetadata() {
        com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata metadata = this.metadata_;
        return metadata == null ? com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata.getDefaultInstance() : metadata;
    }

    public final java.lang.String getPublicToken() {
        return this.publicToken_;
    }

    public final com.google.protobuf.ByteString getPublicTokenBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.publicToken_);
    }

    public final boolean hasError() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasMetadata() {
        return (this.bitField0_ & 2) != 0;
    }

    private void mergeError(com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error error) {
        com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error error2 = this.error_;
        if (error2 == null || error2 == com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error.getDefaultInstance()) {
            this.error_ = error;
        } else {
            this.error_ = com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error.newBuilder(this.error_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Error.a) error).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    private void mergeMetadata(com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata metadata) {
        com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata metadata2 = this.metadata_;
        if (metadata2 == null || metadata2 == com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata.getDefaultInstance()) {
            this.metadata_ = metadata;
        } else {
            this.metadata_ = com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata.newBuilder(this.metadata_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.b) metadata).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult sdkResult$SDKResult) {
        return DEFAULT_INSTANCE.createBuilder(sdkResult$SDKResult);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setError(com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error error) {
        this.error_ = error;
        this.bitField0_ |= 1;
    }

    private void setMetadata(com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata metadata) {
        this.metadata_ = metadata;
        this.bitField0_ |= 2;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setPublicToken(java.lang.String str) {
        this.publicToken_ = str;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
