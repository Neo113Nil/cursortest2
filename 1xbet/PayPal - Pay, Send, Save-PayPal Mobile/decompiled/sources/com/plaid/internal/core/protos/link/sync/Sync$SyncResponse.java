package com.plaid.internal.core.protos.link.sync;

/* loaded from: classes16.dex */
public final class Sync$SyncResponse extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.sync.Sync$SyncResponse, com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.sync.Sync$SyncResponse DEFAULT_INSTANCE;
    public static final int ERROR_RESPONSE_FIELD_NUMBER = 6;
    public static final int GET_ACCOUNTS_FIELD_NUMBER = 2;
    public static final int GET_ACCOUNT_BALANCES_FIELD_NUMBER = 3;
    public static final int GET_TRANSACTION_HISTORY_FIELD_NUMBER = 4;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.sync.Sync$SyncResponse> PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 1;
    public static final int VALIDATE_SYNC_CONNECTED_FIELD_NUMBER = 5;
    private java.lang.Object responseType_;
    private int responseTypeCase_ = 0;
    private java.lang.String requestId_ = "";

    public static final class ErrorResponse extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse, com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.ErrorResponse.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse DEFAULT_INSTANCE;
        public static final int ERROR_MESSAGE_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse> PARSER;
        private java.lang.String errorMessage_ = "";

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse, com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.ErrorResponse.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse errorResponse = new com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse();
            DEFAULT_INSTANCE = errorResponse;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse.class, errorResponse);
        }

        private ErrorResponse() {
        }

        private void clearErrorMessage() {
            this.errorMessage_ = getDefaultInstance().getErrorMessage();
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.ErrorResponse.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setErrorMessageBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.errorMessage_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.sync.a.f6097a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse();
                case 2:
                    return new com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.ErrorResponse.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new java.lang.Object[]{"errorMessage_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse.class) {
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

        public final java.lang.String getErrorMessage() {
            return this.errorMessage_;
        }

        public final com.google.protobuf.ByteString getErrorMessageBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.errorMessage_);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.ErrorResponse.a newBuilder(com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse errorResponse) {
            return DEFAULT_INSTANCE.createBuilder(errorResponse);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setErrorMessage(java.lang.String str) {
            this.errorMessage_ = str;
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class GetAccountBalancesResponse extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse, com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetAccountBalancesResponse.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse> PARSER = null;
        public static final int RAW_JSON_FIELD_NUMBER = 1;
        private java.lang.String rawJson_ = "";

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse, com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetAccountBalancesResponse.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse getAccountBalancesResponse = new com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse();
            DEFAULT_INSTANCE = getAccountBalancesResponse;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse.class, getAccountBalancesResponse);
        }

        private GetAccountBalancesResponse() {
        }

        private void clearRawJson() {
            this.rawJson_ = getDefaultInstance().getRawJson();
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetAccountBalancesResponse.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setRawJsonBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.rawJson_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.sync.a.f6097a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse();
                case 2:
                    return new com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetAccountBalancesResponse.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new java.lang.Object[]{"rawJson_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse.class) {
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

        public final java.lang.String getRawJson() {
            return this.rawJson_;
        }

        public final com.google.protobuf.ByteString getRawJsonBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.rawJson_);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetAccountBalancesResponse.a newBuilder(com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse getAccountBalancesResponse) {
            return DEFAULT_INSTANCE.createBuilder(getAccountBalancesResponse);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setRawJson(java.lang.String str) {
            this.rawJson_ = str;
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class GetAccountsResponse extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse, com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetAccountsResponse.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse> PARSER = null;
        public static final int RAW_JSON_FIELD_NUMBER = 1;
        private java.lang.String rawJson_ = "";

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse, com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetAccountsResponse.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse getAccountsResponse = new com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse();
            DEFAULT_INSTANCE = getAccountsResponse;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse.class, getAccountsResponse);
        }

        private GetAccountsResponse() {
        }

        private void clearRawJson() {
            this.rawJson_ = getDefaultInstance().getRawJson();
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetAccountsResponse.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setRawJsonBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.rawJson_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.sync.a.f6097a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse();
                case 2:
                    return new com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetAccountsResponse.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new java.lang.Object[]{"rawJson_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse.class) {
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

        public final java.lang.String getRawJson() {
            return this.rawJson_;
        }

        public final com.google.protobuf.ByteString getRawJsonBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.rawJson_);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetAccountsResponse.a newBuilder(com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse getAccountsResponse) {
            return DEFAULT_INSTANCE.createBuilder(getAccountsResponse);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setRawJson(java.lang.String str) {
            this.rawJson_ = str;
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class GetTransactionHistoryResponse extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse, com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse DEFAULT_INSTANCE;
        public static final int NEXT_OFFSET_FIELD_NUMBER = 3;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse> PARSER = null;
        public static final int RAW_JSON_FIELD_NUMBER = 1;
        public static final int TRANSACTIONS_FIELD_NUMBER = 2;
        private int nextOffset_;
        private java.lang.String rawJson_ = "";
        private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse> transactions_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

        public static final class TransactionResponse extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse, com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse.a> implements com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.b {
            private static final com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse, com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse.a> implements com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.b {
                public a() {
                    super(com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse transactionResponse = new com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse();
                DEFAULT_INSTANCE = transactionResponse;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse.class, transactionResponse);
            }

            private TransactionResponse() {
            }

            public static com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.sync.a.f6097a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse();
                    case 2:
                        return new com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse.class) {
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

            public static com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse.a newBuilder(com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse transactionResponse) {
                return DEFAULT_INSTANCE.createBuilder(transactionResponse);
            }

            public static com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse, com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse.DEFAULT_INSTANCE);
            }
        }

        public interface b extends com.google.protobuf.MessageLiteOrBuilder {
        }

        static {
            com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse getTransactionHistoryResponse = new com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse();
            DEFAULT_INSTANCE = getTransactionHistoryResponse;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse.class, getTransactionHistoryResponse);
        }

        private GetTransactionHistoryResponse() {
        }

        private void addAllTransactions(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse> iterable) {
            ensureTransactionsIsMutable();
            com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.transactions_);
        }

        private void clearNextOffset() {
            this.nextOffset_ = 0;
        }

        private void clearRawJson() {
            this.rawJson_ = getDefaultInstance().getRawJson();
        }

        private void clearTransactions() {
            this.transactions_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureTransactionsIsMutable() {
            com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse> protobufList = this.transactions_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.transactions_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeTransactions(int i) {
            ensureTransactionsIsMutable();
            this.transactions_.remove(i);
        }

        private void setNextOffset(int i) {
            this.nextOffset_ = i;
        }

        private void setRawJsonBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.rawJson_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.sync.a.f6097a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse();
                case 2:
                    return new com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003\u0004", new java.lang.Object[]{"rawJson_", "transactions_", com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse.class, "nextOffset_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse.class) {
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

        public final int getNextOffset() {
            return this.nextOffset_;
        }

        public final java.lang.String getRawJson() {
            return this.rawJson_;
        }

        public final com.google.protobuf.ByteString getRawJsonBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.rawJson_);
        }

        public final com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse getTransactions(int i) {
            return this.transactions_.get(i);
        }

        public final int getTransactionsCount() {
            return this.transactions_.size();
        }

        public final java.util.List<com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse> getTransactionsList() {
            return this.transactions_;
        }

        public final com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.b getTransactionsOrBuilder(int i) {
            return this.transactions_.get(i);
        }

        public final java.util.List<? extends com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.b> getTransactionsOrBuilderList() {
            return this.transactions_;
        }

        private void addTransactions(com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse transactionResponse) {
            ensureTransactionsIsMutable();
            this.transactions_.add(transactionResponse);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.a newBuilder(com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse getTransactionHistoryResponse) {
            return DEFAULT_INSTANCE.createBuilder(getTransactionHistoryResponse);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setTransactions(int i, com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse transactionResponse) {
            ensureTransactionsIsMutable();
            this.transactions_.set(i, transactionResponse);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setRawJson(java.lang.String str) {
            this.rawJson_ = str;
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        private void addTransactions(int i, com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.TransactionResponse transactionResponse) {
            ensureTransactionsIsMutable();
            this.transactions_.add(i, transactionResponse);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ValidateSyncConnectedResponse extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse, com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.ValidateSyncConnectedResponse.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int CONNECTED_FIELD_NUMBER = 1;
        private static final com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse> PARSER;
        private boolean connected_;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse, com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.ValidateSyncConnectedResponse.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse validateSyncConnectedResponse = new com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse();
            DEFAULT_INSTANCE = validateSyncConnectedResponse;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse.class, validateSyncConnectedResponse);
        }

        private ValidateSyncConnectedResponse() {
        }

        private void clearConnected() {
            this.connected_ = false;
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.ValidateSyncConnectedResponse.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setConnected(boolean z) {
            this.connected_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.sync.a.f6097a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse();
                case 2:
                    return new com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.ValidateSyncConnectedResponse.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new java.lang.Object[]{"connected_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse.class) {
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

        public final boolean getConnected() {
            return this.connected_;
        }

        public static com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.ValidateSyncConnectedResponse.a newBuilder(com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse validateSyncConnectedResponse) {
            return DEFAULT_INSTANCE.createBuilder(validateSyncConnectedResponse);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.sync.Sync$SyncResponse, com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.DEFAULT_INSTANCE);
        }
    }

    public enum b {
        GET_ACCOUNTS(2),
        GET_ACCOUNT_BALANCES(3),
        GET_TRANSACTION_HISTORY(4),
        VALIDATE_SYNC_CONNECTED(5),
        ERROR_RESPONSE(6),
        RESPONSETYPE_NOT_SET(0);


        /* renamed from: a, reason: collision with root package name */
        public final int f6096a;

        b(int i) {
            this.f6096a = i;
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.b forNumber(int i) {
            if (i == 0) {
                return RESPONSETYPE_NOT_SET;
            }
            if (i == 2) {
                return GET_ACCOUNTS;
            }
            if (i == 3) {
                return GET_ACCOUNT_BALANCES;
            }
            if (i == 4) {
                return GET_TRANSACTION_HISTORY;
            }
            if (i == 5) {
                return VALIDATE_SYNC_CONNECTED;
            }
            if (i != 6) {
                return null;
            }
            return ERROR_RESPONSE;
        }

        public final int getNumber() {
            return this.f6096a;
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.b valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        com.plaid.internal.core.protos.link.sync.Sync$SyncResponse sync$SyncResponse = new com.plaid.internal.core.protos.link.sync.Sync$SyncResponse();
        DEFAULT_INSTANCE = sync$SyncResponse;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.class, sync$SyncResponse);
    }

    private Sync$SyncResponse() {
    }

    private void clearErrorResponse() {
        if (this.responseTypeCase_ == 6) {
            this.responseTypeCase_ = 0;
            this.responseType_ = null;
        }
    }

    private void clearGetAccountBalances() {
        if (this.responseTypeCase_ == 3) {
            this.responseTypeCase_ = 0;
            this.responseType_ = null;
        }
    }

    private void clearGetAccounts() {
        if (this.responseTypeCase_ == 2) {
            this.responseTypeCase_ = 0;
            this.responseType_ = null;
        }
    }

    private void clearGetTransactionHistory() {
        if (this.responseTypeCase_ == 4) {
            this.responseTypeCase_ = 0;
            this.responseType_ = null;
        }
    }

    private void clearRequestId() {
        this.requestId_ = getDefaultInstance().getRequestId();
    }

    private void clearResponseType() {
        this.responseTypeCase_ = 0;
        this.responseType_ = null;
    }

    private void clearValidateSyncConnected() {
        if (this.responseTypeCase_ == 5) {
            this.responseTypeCase_ = 0;
            this.responseType_ = null;
        }
    }

    public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.sync.Sync$SyncResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setRequestIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.requestId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.sync.a.f6097a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.sync.Sync$SyncResponse();
            case 2:
                return new com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new java.lang.Object[]{"responseType_", "responseTypeCase_", "requestId_", com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse.class, com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse.class, com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse.class, com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse.class, com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.sync.Sync$SyncResponse> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.class) {
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

    public final com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse getErrorResponse() {
        return this.responseTypeCase_ == 6 ? (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse) this.responseType_ : com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse getGetAccountBalances() {
        return this.responseTypeCase_ == 3 ? (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse) this.responseType_ : com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse getGetAccounts() {
        return this.responseTypeCase_ == 2 ? (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse) this.responseType_ : com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse getGetTransactionHistory() {
        return this.responseTypeCase_ == 4 ? (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse) this.responseType_ : com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse.getDefaultInstance();
    }

    public final java.lang.String getRequestId() {
        return this.requestId_;
    }

    public final com.google.protobuf.ByteString getRequestIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.requestId_);
    }

    public final com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.b getResponseTypeCase() {
        return com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.b.forNumber(this.responseTypeCase_);
    }

    public final com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse getValidateSyncConnected() {
        return this.responseTypeCase_ == 5 ? (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse) this.responseType_ : com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse.getDefaultInstance();
    }

    public final boolean hasErrorResponse() {
        return this.responseTypeCase_ == 6;
    }

    public final boolean hasGetAccountBalances() {
        return this.responseTypeCase_ == 3;
    }

    public final boolean hasGetAccounts() {
        return this.responseTypeCase_ == 2;
    }

    public final boolean hasGetTransactionHistory() {
        return this.responseTypeCase_ == 4;
    }

    public final boolean hasValidateSyncConnected() {
        return this.responseTypeCase_ == 5;
    }

    private void mergeErrorResponse(com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse errorResponse) {
        if (this.responseTypeCase_ != 6 || this.responseType_ == com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse.getDefaultInstance()) {
            this.responseType_ = errorResponse;
        } else {
            this.responseType_ = com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse.newBuilder((com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse) this.responseType_).mergeFrom((com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.ErrorResponse.a) errorResponse).buildPartial();
        }
        this.responseTypeCase_ = 6;
    }

    private void mergeGetAccountBalances(com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse getAccountBalancesResponse) {
        if (this.responseTypeCase_ != 3 || this.responseType_ == com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse.getDefaultInstance()) {
            this.responseType_ = getAccountBalancesResponse;
        } else {
            this.responseType_ = com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse.newBuilder((com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse) this.responseType_).mergeFrom((com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetAccountBalancesResponse.a) getAccountBalancesResponse).buildPartial();
        }
        this.responseTypeCase_ = 3;
    }

    private void mergeGetAccounts(com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse getAccountsResponse) {
        if (this.responseTypeCase_ != 2 || this.responseType_ == com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse.getDefaultInstance()) {
            this.responseType_ = getAccountsResponse;
        } else {
            this.responseType_ = com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse.newBuilder((com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse) this.responseType_).mergeFrom((com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetAccountsResponse.a) getAccountsResponse).buildPartial();
        }
        this.responseTypeCase_ = 2;
    }

    private void mergeGetTransactionHistory(com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse getTransactionHistoryResponse) {
        if (this.responseTypeCase_ != 4 || this.responseType_ == com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse.getDefaultInstance()) {
            this.responseType_ = getTransactionHistoryResponse;
        } else {
            this.responseType_ = com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse.newBuilder((com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse) this.responseType_).mergeFrom((com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.GetTransactionHistoryResponse.a) getTransactionHistoryResponse).buildPartial();
        }
        this.responseTypeCase_ = 4;
    }

    private void mergeValidateSyncConnected(com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse validateSyncConnectedResponse) {
        if (this.responseTypeCase_ != 5 || this.responseType_ == com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse.getDefaultInstance()) {
            this.responseType_ = validateSyncConnectedResponse;
        } else {
            this.responseType_ = com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse.newBuilder((com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse) this.responseType_).mergeFrom((com.plaid.internal.core.protos.link.sync.Sync.SyncResponse.ValidateSyncConnectedResponse.a) validateSyncConnectedResponse).buildPartial();
        }
        this.responseTypeCase_ = 5;
    }

    public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.a newBuilder(com.plaid.internal.core.protos.link.sync.Sync$SyncResponse sync$SyncResponse) {
        return DEFAULT_INSTANCE.createBuilder(sync$SyncResponse);
    }

    public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setErrorResponse(com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ErrorResponse errorResponse) {
        this.responseType_ = errorResponse;
        this.responseTypeCase_ = 6;
    }

    private void setGetAccountBalances(com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountBalancesResponse getAccountBalancesResponse) {
        this.responseType_ = getAccountBalancesResponse;
        this.responseTypeCase_ = 3;
    }

    private void setGetAccounts(com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetAccountsResponse getAccountsResponse) {
        this.responseType_ = getAccountsResponse;
        this.responseTypeCase_ = 2;
    }

    private void setGetTransactionHistory(com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.GetTransactionHistoryResponse getTransactionHistoryResponse) {
        this.responseType_ = getTransactionHistoryResponse;
        this.responseTypeCase_ = 4;
    }

    private void setValidateSyncConnected(com.plaid.internal.core.protos.link.sync.Sync$SyncResponse.ValidateSyncConnectedResponse validateSyncConnectedResponse) {
        this.responseType_ = validateSyncConnectedResponse;
        this.responseTypeCase_ = 5;
    }

    public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setRequestId(java.lang.String str) {
        this.requestId_ = str;
    }

    public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.sync.Sync$SyncResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.sync.Sync$SyncResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
