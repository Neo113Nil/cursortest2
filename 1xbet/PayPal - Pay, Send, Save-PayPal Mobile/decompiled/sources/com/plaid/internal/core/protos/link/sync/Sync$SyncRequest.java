package com.plaid.internal.core.protos.link.sync;

/* loaded from: classes16.dex */
public final class Sync$SyncRequest extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.sync.Sync$SyncRequest, com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.sync.Sync$SyncRequest DEFAULT_INSTANCE;
    public static final int GET_ACCOUNTS_FIELD_NUMBER = 2;
    public static final int GET_ACCOUNT_BALANCES_FIELD_NUMBER = 3;
    public static final int GET_TRANSACTION_HISTORY_FIELD_NUMBER = 4;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.sync.Sync$SyncRequest> PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 1;
    public static final int SYNC_COMPLETE_FIELD_NUMBER = 6;
    public static final int VALIDATE_SYNC_CONNECTED_FIELD_NUMBER = 5;
    private java.lang.Object requestType_;
    private int requestTypeCase_ = 0;
    private java.lang.String requestId_ = "";

    public static final class GetAccountBalancesRequest extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest, com.plaid.internal.core.protos.link.sync.Sync.SyncRequest.GetAccountBalancesRequest.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest> PARSER;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest, com.plaid.internal.core.protos.link.sync.Sync.SyncRequest.GetAccountBalancesRequest.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest getAccountBalancesRequest = new com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest();
            DEFAULT_INSTANCE = getAccountBalancesRequest;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest.class, getAccountBalancesRequest);
        }

        private GetAccountBalancesRequest() {
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.sync.Sync.SyncRequest.GetAccountBalancesRequest.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.sync.a.f6097a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest();
                case 2:
                    return new com.plaid.internal.core.protos.link.sync.Sync.SyncRequest.GetAccountBalancesRequest.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest.class) {
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

        public static com.plaid.internal.core.protos.link.sync.Sync.SyncRequest.GetAccountBalancesRequest.a newBuilder(com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest getAccountBalancesRequest) {
            return DEFAULT_INSTANCE.createBuilder(getAccountBalancesRequest);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class GetAccountsRequest extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest, com.plaid.internal.core.protos.link.sync.Sync.SyncRequest.GetAccountsRequest.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest> PARSER;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest, com.plaid.internal.core.protos.link.sync.Sync.SyncRequest.GetAccountsRequest.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest getAccountsRequest = new com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest();
            DEFAULT_INSTANCE = getAccountsRequest;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest.class, getAccountsRequest);
        }

        private GetAccountsRequest() {
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.sync.Sync.SyncRequest.GetAccountsRequest.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.sync.a.f6097a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest();
                case 2:
                    return new com.plaid.internal.core.protos.link.sync.Sync.SyncRequest.GetAccountsRequest.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest.class) {
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

        public static com.plaid.internal.core.protos.link.sync.Sync.SyncRequest.GetAccountsRequest.a newBuilder(com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest getAccountsRequest) {
            return DEFAULT_INSTANCE.createBuilder(getAccountsRequest);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class GetTransactionHistoryRequest extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest, com.plaid.internal.core.protos.link.sync.Sync.SyncRequest.GetTransactionHistoryRequest.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int ACCOUNT_ID_FIELD_NUMBER = 1;
        private static final com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest DEFAULT_INSTANCE;
        public static final int END_DATE_FIELD_NUMBER = 3;
        public static final int LIMIT_FIELD_NUMBER = 4;
        public static final int OFFSET_FIELD_NUMBER = 5;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest> PARSER = null;
        public static final int START_DATE_FIELD_NUMBER = 2;
        private java.lang.String accountId_ = "";
        private int bitField0_;
        private com.google.protobuf.Timestamp endDate_;
        private int limit_;
        private int offset_;
        private com.google.protobuf.Timestamp startDate_;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest, com.plaid.internal.core.protos.link.sync.Sync.SyncRequest.GetTransactionHistoryRequest.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest getTransactionHistoryRequest = new com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest();
            DEFAULT_INSTANCE = getTransactionHistoryRequest;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest.class, getTransactionHistoryRequest);
        }

        private GetTransactionHistoryRequest() {
        }

        private void clearAccountId() {
            this.accountId_ = getDefaultInstance().getAccountId();
        }

        private void clearEndDate() {
            this.endDate_ = null;
            this.bitField0_ &= -3;
        }

        private void clearLimit() {
            this.limit_ = 0;
        }

        private void clearOffset() {
            this.offset_ = 0;
        }

        private void clearStartDate() {
            this.startDate_ = null;
            this.bitField0_ &= -2;
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.sync.Sync.SyncRequest.GetTransactionHistoryRequest.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAccountIdBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.accountId_ = byteString.toStringUtf8();
        }

        private void setLimit(int i) {
            this.limit_ = i;
        }

        private void setOffset(int i) {
            this.offset_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.sync.a.f6097a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest();
                case 2:
                    return new com.plaid.internal.core.protos.link.sync.Sync.SyncRequest.GetTransactionHistoryRequest.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004\u0004\u0005\u0004", new java.lang.Object[]{"bitField0_", "accountId_", "startDate_", "endDate_", "limit_", "offset_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest.class) {
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

        public final java.lang.String getAccountId() {
            return this.accountId_;
        }

        public final com.google.protobuf.ByteString getAccountIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.accountId_);
        }

        public final com.google.protobuf.Timestamp getEndDate() {
            com.google.protobuf.Timestamp timestamp = this.endDate_;
            return timestamp == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timestamp;
        }

        public final int getLimit() {
            return this.limit_;
        }

        public final int getOffset() {
            return this.offset_;
        }

        public final com.google.protobuf.Timestamp getStartDate() {
            com.google.protobuf.Timestamp timestamp = this.startDate_;
            return timestamp == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timestamp;
        }

        public final boolean hasEndDate() {
            return (this.bitField0_ & 2) != 0;
        }

        public final boolean hasStartDate() {
            return (this.bitField0_ & 1) != 0;
        }

        private void mergeEndDate(com.google.protobuf.Timestamp timestamp) {
            com.google.protobuf.Timestamp timestamp2 = this.endDate_;
            if (timestamp2 == null || timestamp2 == com.google.protobuf.Timestamp.getDefaultInstance()) {
                this.endDate_ = timestamp;
            } else {
                this.endDate_ = com.google.protobuf.Timestamp.newBuilder(this.endDate_).mergeFrom((com.google.protobuf.Timestamp.Builder) timestamp).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        private void mergeStartDate(com.google.protobuf.Timestamp timestamp) {
            com.google.protobuf.Timestamp timestamp2 = this.startDate_;
            if (timestamp2 == null || timestamp2 == com.google.protobuf.Timestamp.getDefaultInstance()) {
                this.startDate_ = timestamp;
            } else {
                this.startDate_ = com.google.protobuf.Timestamp.newBuilder(this.startDate_).mergeFrom((com.google.protobuf.Timestamp.Builder) timestamp).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static com.plaid.internal.core.protos.link.sync.Sync.SyncRequest.GetTransactionHistoryRequest.a newBuilder(com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest getTransactionHistoryRequest) {
            return DEFAULT_INSTANCE.createBuilder(getTransactionHistoryRequest);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setEndDate(com.google.protobuf.Timestamp timestamp) {
            this.endDate_ = timestamp;
            this.bitField0_ |= 2;
        }

        private void setStartDate(com.google.protobuf.Timestamp timestamp) {
            this.startDate_ = timestamp;
            this.bitField0_ |= 1;
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setAccountId(java.lang.String str) {
            this.accountId_ = str;
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SyncCompleteRequest extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest, com.plaid.internal.core.protos.link.sync.Sync.SyncRequest.SyncCompleteRequest.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest> PARSER;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest, com.plaid.internal.core.protos.link.sync.Sync.SyncRequest.SyncCompleteRequest.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest syncCompleteRequest = new com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest();
            DEFAULT_INSTANCE = syncCompleteRequest;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest.class, syncCompleteRequest);
        }

        private SyncCompleteRequest() {
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.sync.Sync.SyncRequest.SyncCompleteRequest.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.sync.a.f6097a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest();
                case 2:
                    return new com.plaid.internal.core.protos.link.sync.Sync.SyncRequest.SyncCompleteRequest.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest.class) {
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

        public static com.plaid.internal.core.protos.link.sync.Sync.SyncRequest.SyncCompleteRequest.a newBuilder(com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest syncCompleteRequest) {
            return DEFAULT_INSTANCE.createBuilder(syncCompleteRequest);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ValidateSyncConnectedRequest extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest, com.plaid.internal.core.protos.link.sync.Sync.SyncRequest.ValidateSyncConnectedRequest.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest> PARSER;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest, com.plaid.internal.core.protos.link.sync.Sync.SyncRequest.ValidateSyncConnectedRequest.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest validateSyncConnectedRequest = new com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest();
            DEFAULT_INSTANCE = validateSyncConnectedRequest;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest.class, validateSyncConnectedRequest);
        }

        private ValidateSyncConnectedRequest() {
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.sync.Sync.SyncRequest.ValidateSyncConnectedRequest.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.sync.a.f6097a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest();
                case 2:
                    return new com.plaid.internal.core.protos.link.sync.Sync.SyncRequest.ValidateSyncConnectedRequest.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest.class) {
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

        public static com.plaid.internal.core.protos.link.sync.Sync.SyncRequest.ValidateSyncConnectedRequest.a newBuilder(com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest validateSyncConnectedRequest) {
            return DEFAULT_INSTANCE.createBuilder(validateSyncConnectedRequest);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.sync.Sync$SyncRequest, com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.DEFAULT_INSTANCE);
        }
    }

    public enum b {
        GET_ACCOUNTS(2),
        GET_ACCOUNT_BALANCES(3),
        GET_TRANSACTION_HISTORY(4),
        VALIDATE_SYNC_CONNECTED(5),
        SYNC_COMPLETE(6),
        REQUESTTYPE_NOT_SET(0);


        /* renamed from: a, reason: collision with root package name */
        public final int f6095a;

        b(int i) {
            this.f6095a = i;
        }

        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.b forNumber(int i) {
            if (i == 0) {
                return REQUESTTYPE_NOT_SET;
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
            return SYNC_COMPLETE;
        }

        public final int getNumber() {
            return this.f6095a;
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.b valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        com.plaid.internal.core.protos.link.sync.Sync$SyncRequest sync$SyncRequest = new com.plaid.internal.core.protos.link.sync.Sync$SyncRequest();
        DEFAULT_INSTANCE = sync$SyncRequest;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.class, sync$SyncRequest);
    }

    private Sync$SyncRequest() {
    }

    private void clearGetAccountBalances() {
        if (this.requestTypeCase_ == 3) {
            this.requestTypeCase_ = 0;
            this.requestType_ = null;
        }
    }

    private void clearGetAccounts() {
        if (this.requestTypeCase_ == 2) {
            this.requestTypeCase_ = 0;
            this.requestType_ = null;
        }
    }

    private void clearGetTransactionHistory() {
        if (this.requestTypeCase_ == 4) {
            this.requestTypeCase_ = 0;
            this.requestType_ = null;
        }
    }

    private void clearRequestId() {
        this.requestId_ = getDefaultInstance().getRequestId();
    }

    private void clearRequestType() {
        this.requestTypeCase_ = 0;
        this.requestType_ = null;
    }

    private void clearSyncComplete() {
        if (this.requestTypeCase_ == 6) {
            this.requestTypeCase_ = 0;
            this.requestType_ = null;
        }
    }

    private void clearValidateSyncConnected() {
        if (this.requestTypeCase_ == 5) {
            this.requestTypeCase_ = 0;
            this.requestType_ = null;
        }
    }

    public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.sync.Sync$SyncRequest> parser() {
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
                return new com.plaid.internal.core.protos.link.sync.Sync$SyncRequest();
            case 2:
                return new com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new java.lang.Object[]{"requestType_", "requestTypeCase_", "requestId_", com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest.class, com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest.class, com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest.class, com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest.class, com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.sync.Sync$SyncRequest> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.class) {
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

    public final com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest getGetAccountBalances() {
        return this.requestTypeCase_ == 3 ? (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest) this.requestType_ : com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest getGetAccounts() {
        return this.requestTypeCase_ == 2 ? (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest) this.requestType_ : com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest getGetTransactionHistory() {
        return this.requestTypeCase_ == 4 ? (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest) this.requestType_ : com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest.getDefaultInstance();
    }

    public final java.lang.String getRequestId() {
        return this.requestId_;
    }

    public final com.google.protobuf.ByteString getRequestIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.requestId_);
    }

    public final com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.b getRequestTypeCase() {
        return com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.b.forNumber(this.requestTypeCase_);
    }

    public final com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest getSyncComplete() {
        return this.requestTypeCase_ == 6 ? (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest) this.requestType_ : com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest getValidateSyncConnected() {
        return this.requestTypeCase_ == 5 ? (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest) this.requestType_ : com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest.getDefaultInstance();
    }

    public final boolean hasGetAccountBalances() {
        return this.requestTypeCase_ == 3;
    }

    public final boolean hasGetAccounts() {
        return this.requestTypeCase_ == 2;
    }

    public final boolean hasGetTransactionHistory() {
        return this.requestTypeCase_ == 4;
    }

    public final boolean hasSyncComplete() {
        return this.requestTypeCase_ == 6;
    }

    public final boolean hasValidateSyncConnected() {
        return this.requestTypeCase_ == 5;
    }

    private void mergeGetAccountBalances(com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest getAccountBalancesRequest) {
        if (this.requestTypeCase_ != 3 || this.requestType_ == com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest.getDefaultInstance()) {
            this.requestType_ = getAccountBalancesRequest;
        } else {
            this.requestType_ = com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest.newBuilder((com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest) this.requestType_).mergeFrom((com.plaid.internal.core.protos.link.sync.Sync.SyncRequest.GetAccountBalancesRequest.a) getAccountBalancesRequest).buildPartial();
        }
        this.requestTypeCase_ = 3;
    }

    private void mergeGetAccounts(com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest getAccountsRequest) {
        if (this.requestTypeCase_ != 2 || this.requestType_ == com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest.getDefaultInstance()) {
            this.requestType_ = getAccountsRequest;
        } else {
            this.requestType_ = com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest.newBuilder((com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest) this.requestType_).mergeFrom((com.plaid.internal.core.protos.link.sync.Sync.SyncRequest.GetAccountsRequest.a) getAccountsRequest).buildPartial();
        }
        this.requestTypeCase_ = 2;
    }

    private void mergeGetTransactionHistory(com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest getTransactionHistoryRequest) {
        if (this.requestTypeCase_ != 4 || this.requestType_ == com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest.getDefaultInstance()) {
            this.requestType_ = getTransactionHistoryRequest;
        } else {
            this.requestType_ = com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest.newBuilder((com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest) this.requestType_).mergeFrom((com.plaid.internal.core.protos.link.sync.Sync.SyncRequest.GetTransactionHistoryRequest.a) getTransactionHistoryRequest).buildPartial();
        }
        this.requestTypeCase_ = 4;
    }

    private void mergeSyncComplete(com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest syncCompleteRequest) {
        if (this.requestTypeCase_ != 6 || this.requestType_ == com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest.getDefaultInstance()) {
            this.requestType_ = syncCompleteRequest;
        } else {
            this.requestType_ = com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest.newBuilder((com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest) this.requestType_).mergeFrom((com.plaid.internal.core.protos.link.sync.Sync.SyncRequest.SyncCompleteRequest.a) syncCompleteRequest).buildPartial();
        }
        this.requestTypeCase_ = 6;
    }

    private void mergeValidateSyncConnected(com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest validateSyncConnectedRequest) {
        if (this.requestTypeCase_ != 5 || this.requestType_ == com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest.getDefaultInstance()) {
            this.requestType_ = validateSyncConnectedRequest;
        } else {
            this.requestType_ = com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest.newBuilder((com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest) this.requestType_).mergeFrom((com.plaid.internal.core.protos.link.sync.Sync.SyncRequest.ValidateSyncConnectedRequest.a) validateSyncConnectedRequest).buildPartial();
        }
        this.requestTypeCase_ = 5;
    }

    public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.a newBuilder(com.plaid.internal.core.protos.link.sync.Sync$SyncRequest sync$SyncRequest) {
        return DEFAULT_INSTANCE.createBuilder(sync$SyncRequest);
    }

    public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setGetAccountBalances(com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountBalancesRequest getAccountBalancesRequest) {
        this.requestType_ = getAccountBalancesRequest;
        this.requestTypeCase_ = 3;
    }

    private void setGetAccounts(com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetAccountsRequest getAccountsRequest) {
        this.requestType_ = getAccountsRequest;
        this.requestTypeCase_ = 2;
    }

    private void setGetTransactionHistory(com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.GetTransactionHistoryRequest getTransactionHistoryRequest) {
        this.requestType_ = getTransactionHistoryRequest;
        this.requestTypeCase_ = 4;
    }

    private void setSyncComplete(com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.SyncCompleteRequest syncCompleteRequest) {
        this.requestType_ = syncCompleteRequest;
        this.requestTypeCase_ = 6;
    }

    private void setValidateSyncConnected(com.plaid.internal.core.protos.link.sync.Sync$SyncRequest.ValidateSyncConnectedRequest validateSyncConnectedRequest) {
        this.requestType_ = validateSyncConnectedRequest;
        this.requestTypeCase_ = 5;
    }

    public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setRequestId(java.lang.String str) {
        this.requestId_ = str;
    }

    public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.sync.Sync$SyncRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.sync.Sync$SyncRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
