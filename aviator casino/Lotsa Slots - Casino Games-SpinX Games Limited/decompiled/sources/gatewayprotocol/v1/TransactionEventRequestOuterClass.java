package gatewayprotocol.v1;

/* loaded from: classes6.dex */
public final class TransactionEventRequestOuterClass {

    public interface TransactionDataOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        com.google.protobuf.ByteString getEventId();

        java.lang.String getJwsRepresentation();

        com.google.protobuf.ByteString getJwsRepresentationBytes();

        java.lang.String getProduct();

        com.google.protobuf.ByteString getProductBytes();

        java.lang.String getProductId();

        com.google.protobuf.ByteString getProductIdBytes();

        java.lang.String getReceipt();

        com.google.protobuf.ByteString getReceiptBytes();

        java.lang.String getSignature();

        com.google.protobuf.ByteString getSignatureBytes();

        com.google.protobuf.Timestamp getTimestamp();

        java.lang.String getTransaction();

        com.google.protobuf.ByteString getTransactionBytes();

        java.lang.String getTransactionId();

        com.google.protobuf.ByteString getTransactionIdBytes();

        gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionState getTransactionState();

        int getTransactionStateValue();

        boolean hasJwsRepresentation();

        boolean hasReceipt();

        boolean hasSignature();

        boolean hasTimestamp();
    }

    public interface TransactionEventRequestOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreType getAppStore();

        int getAppStoreValue();

        java.lang.String getCustomStore();

        com.google.protobuf.ByteString getCustomStoreBytes();

        gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo();

        java.lang.String getGooglePlayBillingLibraryVersion();

        com.google.protobuf.ByteString getGooglePlayBillingLibraryVersionBytes();

        gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionOrigin getOrigin();

        int getOriginValue();

        gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo();

        gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreKitVersion getStoreKitVersion();

        int getStoreKitVersionValue();

        gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData getTransactionData(int i);

        int getTransactionDataCount();

        java.util.List<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData> getTransactionDataList();

        boolean hasDynamicDeviceInfo();

        boolean hasStaticDeviceInfo();
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private TransactionEventRequestOuterClass() {
    }

    public enum StoreType implements com.google.protobuf.Internal.EnumLite {
        STORE_TYPE_UNSPECIFIED(0),
        STORE_TYPE_CUSTOM(1),
        STORE_TYPE_APPLE_APP_STORE(2),
        STORE_TYPE_GOOGLE_PLAY(3),
        UNRECOGNIZED(-1);

        public static final int STORE_TYPE_APPLE_APP_STORE_VALUE = 2;
        public static final int STORE_TYPE_CUSTOM_VALUE = 1;
        public static final int STORE_TYPE_GOOGLE_PLAY_VALUE = 3;
        public static final int STORE_TYPE_UNSPECIFIED_VALUE = 0;
        private static final com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreType> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreType>() { // from class: gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreType findValueByNumber(int i) {
                return gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreType.forNumber(i);
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
        public static gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreType valueOf(int i) {
            return forNumber(i);
        }

        public static gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreType forNumber(int i) {
            if (i == 0) {
                return STORE_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return STORE_TYPE_CUSTOM;
            }
            if (i == 2) {
                return STORE_TYPE_APPLE_APP_STORE;
            }
            if (i != 3) {
                return null;
            }
            return STORE_TYPE_GOOGLE_PLAY;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreType> internalGetValueMap() {
            return internalValueMap;
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreType.StoreTypeVerifier.INSTANCE;
        }

        private static final class StoreTypeVerifier implements com.google.protobuf.Internal.EnumVerifier {
            static final com.google.protobuf.Internal.EnumVerifier INSTANCE = new gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreType.StoreTypeVerifier();

            private StoreTypeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreType.forNumber(i) != null;
            }
        }

        StoreType(int i) {
            this.value = i;
        }
    }

    public enum StoreKitVersion implements com.google.protobuf.Internal.EnumLite {
        STORE_KIT_VERSION_UNSPECIFIED(0),
        STORE_KIT_VERSION_1(1),
        STORE_KIT_VERSION_2(2),
        UNRECOGNIZED(-1);

        public static final int STORE_KIT_VERSION_1_VALUE = 1;
        public static final int STORE_KIT_VERSION_2_VALUE = 2;
        public static final int STORE_KIT_VERSION_UNSPECIFIED_VALUE = 0;
        private static final com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreKitVersion> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreKitVersion>() { // from class: gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreKitVersion.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreKitVersion findValueByNumber(int i) {
                return gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreKitVersion.forNumber(i);
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
        public static gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreKitVersion valueOf(int i) {
            return forNumber(i);
        }

        public static gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreKitVersion forNumber(int i) {
            if (i == 0) {
                return STORE_KIT_VERSION_UNSPECIFIED;
            }
            if (i == 1) {
                return STORE_KIT_VERSION_1;
            }
            if (i != 2) {
                return null;
            }
            return STORE_KIT_VERSION_2;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreKitVersion> internalGetValueMap() {
            return internalValueMap;
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreKitVersion.StoreKitVersionVerifier.INSTANCE;
        }

        private static final class StoreKitVersionVerifier implements com.google.protobuf.Internal.EnumVerifier {
            static final com.google.protobuf.Internal.EnumVerifier INSTANCE = new gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreKitVersion.StoreKitVersionVerifier();

            private StoreKitVersionVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreKitVersion.forNumber(i) != null;
            }
        }

        StoreKitVersion(int i) {
            this.value = i;
        }
    }

    public enum TransactionState implements com.google.protobuf.Internal.EnumLite {
        TRANSACTION_STATE_UNSPECIFIED(0),
        TRANSACTION_STATE_PENDING(1),
        TRANSACTION_STATE_PURCHASED(2),
        TRANSACTION_STATE_FAILED(3),
        TRANSACTION_STATE_RESTORED(4),
        TRANSACTION_STATE_DEFERRED(5),
        UNRECOGNIZED(-1);

        public static final int TRANSACTION_STATE_DEFERRED_VALUE = 5;
        public static final int TRANSACTION_STATE_FAILED_VALUE = 3;
        public static final int TRANSACTION_STATE_PENDING_VALUE = 1;
        public static final int TRANSACTION_STATE_PURCHASED_VALUE = 2;
        public static final int TRANSACTION_STATE_RESTORED_VALUE = 4;
        public static final int TRANSACTION_STATE_UNSPECIFIED_VALUE = 0;
        private static final com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionState> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionState>() { // from class: gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionState.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionState findValueByNumber(int i) {
                return gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionState.forNumber(i);
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
        public static gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionState valueOf(int i) {
            return forNumber(i);
        }

        public static gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionState forNumber(int i) {
            if (i == 0) {
                return TRANSACTION_STATE_UNSPECIFIED;
            }
            if (i == 1) {
                return TRANSACTION_STATE_PENDING;
            }
            if (i == 2) {
                return TRANSACTION_STATE_PURCHASED;
            }
            if (i == 3) {
                return TRANSACTION_STATE_FAILED;
            }
            if (i == 4) {
                return TRANSACTION_STATE_RESTORED;
            }
            if (i != 5) {
                return null;
            }
            return TRANSACTION_STATE_DEFERRED;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionState> internalGetValueMap() {
            return internalValueMap;
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionState.TransactionStateVerifier.INSTANCE;
        }

        private static final class TransactionStateVerifier implements com.google.protobuf.Internal.EnumVerifier {
            static final com.google.protobuf.Internal.EnumVerifier INSTANCE = new gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionState.TransactionStateVerifier();

            private TransactionStateVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionState.forNumber(i) != null;
            }
        }

        TransactionState(int i) {
            this.value = i;
        }
    }

    public enum TransactionOrigin implements com.google.protobuf.Internal.EnumLite {
        TRANSACTION_ORIGIN_UNSPECIFIED(0),
        TRANSACTION_ORIGIN_LIVE_UPDATE(1),
        TRANSACTION_ORIGIN_HISTORICAL(2),
        TRANSACTION_ORIGIN_IAP_PLUGIN(3),
        UNRECOGNIZED(-1);

        public static final int TRANSACTION_ORIGIN_HISTORICAL_VALUE = 2;
        public static final int TRANSACTION_ORIGIN_IAP_PLUGIN_VALUE = 3;
        public static final int TRANSACTION_ORIGIN_LIVE_UPDATE_VALUE = 1;
        public static final int TRANSACTION_ORIGIN_UNSPECIFIED_VALUE = 0;
        private static final com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionOrigin> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionOrigin>() { // from class: gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionOrigin.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionOrigin findValueByNumber(int i) {
                return gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionOrigin.forNumber(i);
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
        public static gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionOrigin valueOf(int i) {
            return forNumber(i);
        }

        public static gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionOrigin forNumber(int i) {
            if (i == 0) {
                return TRANSACTION_ORIGIN_UNSPECIFIED;
            }
            if (i == 1) {
                return TRANSACTION_ORIGIN_LIVE_UPDATE;
            }
            if (i == 2) {
                return TRANSACTION_ORIGIN_HISTORICAL;
            }
            if (i != 3) {
                return null;
            }
            return TRANSACTION_ORIGIN_IAP_PLUGIN;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionOrigin> internalGetValueMap() {
            return internalValueMap;
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionOrigin.TransactionOriginVerifier.INSTANCE;
        }

        private static final class TransactionOriginVerifier implements com.google.protobuf.Internal.EnumVerifier {
            static final com.google.protobuf.Internal.EnumVerifier INSTANCE = new gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionOrigin.TransactionOriginVerifier();

            private TransactionOriginVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionOrigin.forNumber(i) != null;
            }
        }

        TransactionOrigin(int i) {
            this.value = i;
        }
    }

    public static final class TransactionData extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData, gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData.Builder> implements gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder {
        private static final gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData DEFAULT_INSTANCE;
        public static final int EVENT_ID_FIELD_NUMBER = 3;
        public static final int JWS_REPRESENTATION_FIELD_NUMBER = 9;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData> PARSER = null;
        public static final int PRODUCT_FIELD_NUMBER = 5;
        public static final int PRODUCT_ID_FIELD_NUMBER = 2;
        public static final int RECEIPT_FIELD_NUMBER = 7;
        public static final int SIGNATURE_FIELD_NUMBER = 10;
        public static final int TIMESTAMP_FIELD_NUMBER = 1;
        public static final int TRANSACTION_FIELD_NUMBER = 6;
        public static final int TRANSACTION_ID_FIELD_NUMBER = 4;
        public static final int TRANSACTION_STATE_FIELD_NUMBER = 8;
        private int bitField0_;
        private com.google.protobuf.Timestamp timestamp_;
        private int transactionState_;
        private java.lang.String productId_ = "";
        private com.google.protobuf.ByteString eventId_ = com.google.protobuf.ByteString.EMPTY;
        private java.lang.String transactionId_ = "";
        private java.lang.String product_ = "";
        private java.lang.String transaction_ = "";
        private java.lang.String receipt_ = "";
        private java.lang.String jwsRepresentation_ = "";
        private java.lang.String signature_ = "";

        private TransactionData() {
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
        public boolean hasTimestamp() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
        public com.google.protobuf.Timestamp getTimestamp() {
            com.google.protobuf.Timestamp timestamp = this.timestamp_;
            return timestamp == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timestamp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimestamp(com.google.protobuf.Timestamp timestamp) {
            timestamp.getClass();
            this.timestamp_ = timestamp;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTimestamp(com.google.protobuf.Timestamp timestamp) {
            timestamp.getClass();
            com.google.protobuf.Timestamp timestamp2 = this.timestamp_;
            if (timestamp2 != null && timestamp2 != com.google.protobuf.Timestamp.getDefaultInstance()) {
                this.timestamp_ = com.google.protobuf.Timestamp.newBuilder(this.timestamp_).mergeFrom((com.google.protobuf.Timestamp.Builder) timestamp).buildPartial();
            } else {
                this.timestamp_ = timestamp;
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimestamp() {
            this.timestamp_ = null;
            this.bitField0_ &= -2;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
        public java.lang.String getProductId() {
            return this.productId_;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
        public com.google.protobuf.ByteString getProductIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.productId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProductId(java.lang.String str) {
            str.getClass();
            this.productId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProductId() {
            this.productId_ = getDefaultInstance().getProductId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProductIdBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.productId_ = byteString.toStringUtf8();
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
        public com.google.protobuf.ByteString getEventId() {
            return this.eventId_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventId(com.google.protobuf.ByteString byteString) {
            byteString.getClass();
            this.eventId_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventId() {
            this.eventId_ = getDefaultInstance().getEventId();
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
        public java.lang.String getTransactionId() {
            return this.transactionId_;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
        public com.google.protobuf.ByteString getTransactionIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.transactionId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTransactionId(java.lang.String str) {
            str.getClass();
            this.transactionId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTransactionId() {
            this.transactionId_ = getDefaultInstance().getTransactionId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTransactionIdBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.transactionId_ = byteString.toStringUtf8();
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
        public java.lang.String getProduct() {
            return this.product_;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
        public com.google.protobuf.ByteString getProductBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.product_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProduct(java.lang.String str) {
            str.getClass();
            this.product_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProduct() {
            this.product_ = getDefaultInstance().getProduct();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProductBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.product_ = byteString.toStringUtf8();
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
        public java.lang.String getTransaction() {
            return this.transaction_;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
        public com.google.protobuf.ByteString getTransactionBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.transaction_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTransaction(java.lang.String str) {
            str.getClass();
            this.transaction_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTransaction() {
            this.transaction_ = getDefaultInstance().getTransaction();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTransactionBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.transaction_ = byteString.toStringUtf8();
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
        public boolean hasReceipt() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
        public java.lang.String getReceipt() {
            return this.receipt_;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
        public com.google.protobuf.ByteString getReceiptBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.receipt_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReceipt(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.receipt_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReceipt() {
            this.bitField0_ &= -3;
            this.receipt_ = getDefaultInstance().getReceipt();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReceiptBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.receipt_ = byteString.toStringUtf8();
            this.bitField0_ |= 2;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
        public int getTransactionStateValue() {
            return this.transactionState_;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
        public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionState getTransactionState() {
            gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionState forNumber = gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionState.forNumber(this.transactionState_);
            return forNumber == null ? gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionState.UNRECOGNIZED : forNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTransactionStateValue(int i) {
            this.transactionState_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTransactionState(gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionState transactionState) {
            this.transactionState_ = transactionState.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTransactionState() {
            this.transactionState_ = 0;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
        public boolean hasJwsRepresentation() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
        public java.lang.String getJwsRepresentation() {
            return this.jwsRepresentation_;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
        public com.google.protobuf.ByteString getJwsRepresentationBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.jwsRepresentation_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJwsRepresentation(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.jwsRepresentation_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJwsRepresentation() {
            this.bitField0_ &= -5;
            this.jwsRepresentation_ = getDefaultInstance().getJwsRepresentation();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJwsRepresentationBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.jwsRepresentation_ = byteString.toStringUtf8();
            this.bitField0_ |= 4;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
        public boolean hasSignature() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
        public java.lang.String getSignature() {
            return this.signature_;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
        public com.google.protobuf.ByteString getSignatureBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.signature_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSignature(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.signature_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSignature() {
            this.bitField0_ &= -9;
            this.signature_ = getDefaultInstance().getSignature();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSignatureBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.signature_ = byteString.toStringUtf8();
            this.bitField0_ |= 8;
        }

        public static gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData.Builder newBuilder(gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData transactionData) {
            return DEFAULT_INSTANCE.createBuilder(transactionData);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData, gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData.Builder> implements gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.TransactionEventRequestOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
            public boolean hasTimestamp() {
                return ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).hasTimestamp();
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
            public com.google.protobuf.Timestamp getTimestamp() {
                return ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).getTimestamp();
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData.Builder setTimestamp(com.google.protobuf.Timestamp timestamp) {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).setTimestamp(timestamp);
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData.Builder setTimestamp(com.google.protobuf.Timestamp.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).setTimestamp(builder.build());
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData.Builder mergeTimestamp(com.google.protobuf.Timestamp timestamp) {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).mergeTimestamp(timestamp);
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData.Builder clearTimestamp() {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).clearTimestamp();
                return this;
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
            public java.lang.String getProductId() {
                return ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).getProductId();
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
            public com.google.protobuf.ByteString getProductIdBytes() {
                return ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).getProductIdBytes();
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData.Builder setProductId(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).setProductId(str);
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData.Builder clearProductId() {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).clearProductId();
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData.Builder setProductIdBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).setProductIdBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
            public com.google.protobuf.ByteString getEventId() {
                return ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).getEventId();
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData.Builder setEventId(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).setEventId(byteString);
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData.Builder clearEventId() {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).clearEventId();
                return this;
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
            public java.lang.String getTransactionId() {
                return ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).getTransactionId();
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
            public com.google.protobuf.ByteString getTransactionIdBytes() {
                return ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).getTransactionIdBytes();
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData.Builder setTransactionId(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).setTransactionId(str);
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData.Builder clearTransactionId() {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).clearTransactionId();
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData.Builder setTransactionIdBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).setTransactionIdBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
            public java.lang.String getProduct() {
                return ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).getProduct();
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
            public com.google.protobuf.ByteString getProductBytes() {
                return ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).getProductBytes();
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData.Builder setProduct(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).setProduct(str);
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData.Builder clearProduct() {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).clearProduct();
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData.Builder setProductBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).setProductBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
            public java.lang.String getTransaction() {
                return ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).getTransaction();
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
            public com.google.protobuf.ByteString getTransactionBytes() {
                return ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).getTransactionBytes();
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData.Builder setTransaction(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).setTransaction(str);
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData.Builder clearTransaction() {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).clearTransaction();
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData.Builder setTransactionBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).setTransactionBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
            public boolean hasReceipt() {
                return ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).hasReceipt();
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
            public java.lang.String getReceipt() {
                return ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).getReceipt();
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
            public com.google.protobuf.ByteString getReceiptBytes() {
                return ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).getReceiptBytes();
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData.Builder setReceipt(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).setReceipt(str);
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData.Builder clearReceipt() {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).clearReceipt();
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData.Builder setReceiptBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).setReceiptBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
            public int getTransactionStateValue() {
                return ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).getTransactionStateValue();
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData.Builder setTransactionStateValue(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).setTransactionStateValue(i);
                return this;
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionState getTransactionState() {
                return ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).getTransactionState();
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData.Builder setTransactionState(gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionState transactionState) {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).setTransactionState(transactionState);
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData.Builder clearTransactionState() {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).clearTransactionState();
                return this;
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
            public boolean hasJwsRepresentation() {
                return ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).hasJwsRepresentation();
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
            public java.lang.String getJwsRepresentation() {
                return ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).getJwsRepresentation();
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
            public com.google.protobuf.ByteString getJwsRepresentationBytes() {
                return ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).getJwsRepresentationBytes();
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData.Builder setJwsRepresentation(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).setJwsRepresentation(str);
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData.Builder clearJwsRepresentation() {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).clearJwsRepresentation();
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData.Builder setJwsRepresentationBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).setJwsRepresentationBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
            public boolean hasSignature() {
                return ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).hasSignature();
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
            public java.lang.String getSignature() {
                return ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).getSignature();
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder
            public com.google.protobuf.ByteString getSignatureBytes() {
                return ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).getSignatureBytes();
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData.Builder setSignature(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).setSignature(str);
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData.Builder clearSignature() {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).clearSignature();
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData.Builder setSignatureBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData) this.instance).setSignatureBytes(byteString);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.TransactionEventRequestOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.TransactionEventRequestOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData();
                case 2:
                    return new gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003\n\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007ለ\u0001\b\f\tለ\u0002\nለ\u0003", new java.lang.Object[]{"bitField0_", "timestamp_", "productId_", "eventId_", "transactionId_", "product_", "transaction_", "receipt_", "transactionState_", "jwsRepresentation_", "signature_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData> parser = PARSER;
                    if (parser == null) {
                        synchronized (gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData.class) {
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
            gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData transactionData = new gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData();
            DEFAULT_INSTANCE = transactionData;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData.class, transactionData);
        }

        public static gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: gatewayprotocol.v1.TransactionEventRequestOuterClass$1, reason: invalid class name */
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

    public static final class TransactionEventRequest extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest, gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder> implements gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder {
        public static final int APP_STORE_FIELD_NUMBER = 3;
        public static final int CUSTOM_STORE_FIELD_NUMBER = 4;
        private static final gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest DEFAULT_INSTANCE;
        public static final int DYNAMIC_DEVICE_INFO_FIELD_NUMBER = 2;
        public static final int GOOGLE_PLAY_BILLING_LIBRARY_VERSION_FIELD_NUMBER = 8;
        public static final int ORIGIN_FIELD_NUMBER = 6;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest> PARSER = null;
        public static final int STATIC_DEVICE_INFO_FIELD_NUMBER = 1;
        public static final int STORE_KIT_VERSION_FIELD_NUMBER = 7;
        public static final int TRANSACTION_DATA_FIELD_NUMBER = 5;
        private int appStore_;
        private int bitField0_;
        private gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo_;
        private int origin_;
        private gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo_;
        private int storeKitVersion_;
        private java.lang.String customStore_ = "";
        private com.google.protobuf.Internal.ProtobufList<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData> transactionData_ = emptyProtobufList();
        private java.lang.String googlePlayBillingLibraryVersion_ = "";

        private TransactionEventRequest() {
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
        public boolean hasStaticDeviceInfo() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
        public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this.staticDeviceInfo_;
            return staticDeviceInfo == null ? gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.getDefaultInstance() : staticDeviceInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.getClass();
            this.staticDeviceInfo_ = staticDeviceInfo;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.getClass();
            gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo2 = this.staticDeviceInfo_;
            if (staticDeviceInfo2 != null && staticDeviceInfo2 != gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.getDefaultInstance()) {
                this.staticDeviceInfo_ = gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.newBuilder(this.staticDeviceInfo_).mergeFrom((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder) staticDeviceInfo).buildPartial();
            } else {
                this.staticDeviceInfo_ = staticDeviceInfo;
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStaticDeviceInfo() {
            this.staticDeviceInfo_ = null;
            this.bitField0_ &= -2;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
        public boolean hasDynamicDeviceInfo() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
        public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this.dynamicDeviceInfo_;
            return dynamicDeviceInfo == null ? gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.getDefaultInstance() : dynamicDeviceInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.getClass();
            this.dynamicDeviceInfo_ = dynamicDeviceInfo;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.getClass();
            gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo2 = this.dynamicDeviceInfo_;
            if (dynamicDeviceInfo2 != null && dynamicDeviceInfo2 != gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.getDefaultInstance()) {
                this.dynamicDeviceInfo_ = gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.newBuilder(this.dynamicDeviceInfo_).mergeFrom((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder) dynamicDeviceInfo).buildPartial();
            } else {
                this.dynamicDeviceInfo_ = dynamicDeviceInfo;
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDynamicDeviceInfo() {
            this.dynamicDeviceInfo_ = null;
            this.bitField0_ &= -3;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
        public int getAppStoreValue() {
            return this.appStore_;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
        public gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreType getAppStore() {
            gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreType forNumber = gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreType.forNumber(this.appStore_);
            return forNumber == null ? gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreType.UNRECOGNIZED : forNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppStoreValue(int i) {
            this.appStore_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppStore(gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreType storeType) {
            this.appStore_ = storeType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppStore() {
            this.appStore_ = 0;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
        public java.lang.String getCustomStore() {
            return this.customStore_;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
        public com.google.protobuf.ByteString getCustomStoreBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.customStore_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCustomStore(java.lang.String str) {
            str.getClass();
            this.customStore_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCustomStore() {
            this.customStore_ = getDefaultInstance().getCustomStore();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCustomStoreBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.customStore_ = byteString.toStringUtf8();
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
        public java.util.List<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData> getTransactionDataList() {
            return this.transactionData_;
        }

        public java.util.List<? extends gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder> getTransactionDataOrBuilderList() {
            return this.transactionData_;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
        public int getTransactionDataCount() {
            return this.transactionData_.size();
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
        public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData getTransactionData(int i) {
            return this.transactionData_.get(i);
        }

        public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionDataOrBuilder getTransactionDataOrBuilder(int i) {
            return this.transactionData_.get(i);
        }

        private void ensureTransactionDataIsMutable() {
            com.google.protobuf.Internal.ProtobufList<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData> protobufList = this.transactionData_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.transactionData_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTransactionData(int i, gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData transactionData) {
            transactionData.getClass();
            ensureTransactionDataIsMutable();
            this.transactionData_.set(i, transactionData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTransactionData(gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData transactionData) {
            transactionData.getClass();
            ensureTransactionDataIsMutable();
            this.transactionData_.add(transactionData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTransactionData(int i, gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData transactionData) {
            transactionData.getClass();
            ensureTransactionDataIsMutable();
            this.transactionData_.add(i, transactionData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllTransactionData(java.lang.Iterable<? extends gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData> iterable) {
            ensureTransactionDataIsMutable();
            com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.transactionData_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTransactionData() {
            this.transactionData_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeTransactionData(int i) {
            ensureTransactionDataIsMutable();
            this.transactionData_.remove(i);
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
        public int getOriginValue() {
            return this.origin_;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
        public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionOrigin getOrigin() {
            gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionOrigin forNumber = gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionOrigin.forNumber(this.origin_);
            return forNumber == null ? gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionOrigin.UNRECOGNIZED : forNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOriginValue(int i) {
            this.origin_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOrigin(gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionOrigin transactionOrigin) {
            this.origin_ = transactionOrigin.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOrigin() {
            this.origin_ = 0;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
        public int getStoreKitVersionValue() {
            return this.storeKitVersion_;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
        public gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreKitVersion getStoreKitVersion() {
            gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreKitVersion forNumber = gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreKitVersion.forNumber(this.storeKitVersion_);
            return forNumber == null ? gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreKitVersion.UNRECOGNIZED : forNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStoreKitVersionValue(int i) {
            this.storeKitVersion_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStoreKitVersion(gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreKitVersion storeKitVersion) {
            this.storeKitVersion_ = storeKitVersion.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStoreKitVersion() {
            this.storeKitVersion_ = 0;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
        public java.lang.String getGooglePlayBillingLibraryVersion() {
            return this.googlePlayBillingLibraryVersion_;
        }

        @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
        public com.google.protobuf.ByteString getGooglePlayBillingLibraryVersionBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.googlePlayBillingLibraryVersion_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGooglePlayBillingLibraryVersion(java.lang.String str) {
            str.getClass();
            this.googlePlayBillingLibraryVersion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGooglePlayBillingLibraryVersion() {
            this.googlePlayBillingLibraryVersion_ = getDefaultInstance().getGooglePlayBillingLibraryVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGooglePlayBillingLibraryVersionBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.googlePlayBillingLibraryVersion_ = byteString.toStringUtf8();
        }

        public static gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder newBuilder(gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest) {
            return DEFAULT_INSTANCE.createBuilder(transactionEventRequest);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest, gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder> implements gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.TransactionEventRequestOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
            public boolean hasStaticDeviceInfo() {
                return ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).hasStaticDeviceInfo();
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
            public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
                return ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).getStaticDeviceInfo();
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).setStaticDeviceInfo(staticDeviceInfo);
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).setStaticDeviceInfo(builder.build());
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder mergeStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).mergeStaticDeviceInfo(staticDeviceInfo);
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder clearStaticDeviceInfo() {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).clearStaticDeviceInfo();
                return this;
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
            public boolean hasDynamicDeviceInfo() {
                return ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).hasDynamicDeviceInfo();
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
            public gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
                return ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).getDynamicDeviceInfo();
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).setDynamicDeviceInfo(dynamicDeviceInfo);
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).setDynamicDeviceInfo(builder.build());
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder mergeDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).mergeDynamicDeviceInfo(dynamicDeviceInfo);
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder clearDynamicDeviceInfo() {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).clearDynamicDeviceInfo();
                return this;
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
            public int getAppStoreValue() {
                return ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).getAppStoreValue();
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder setAppStoreValue(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).setAppStoreValue(i);
                return this;
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
            public gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreType getAppStore() {
                return ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).getAppStore();
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder setAppStore(gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreType storeType) {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).setAppStore(storeType);
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder clearAppStore() {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).clearAppStore();
                return this;
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
            public java.lang.String getCustomStore() {
                return ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).getCustomStore();
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
            public com.google.protobuf.ByteString getCustomStoreBytes() {
                return ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).getCustomStoreBytes();
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder setCustomStore(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).setCustomStore(str);
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder clearCustomStore() {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).clearCustomStore();
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder setCustomStoreBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).setCustomStoreBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
            public java.util.List<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData> getTransactionDataList() {
                return java.util.Collections.unmodifiableList(((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).getTransactionDataList());
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
            public int getTransactionDataCount() {
                return ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).getTransactionDataCount();
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData getTransactionData(int i) {
                return ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).getTransactionData(i);
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder setTransactionData(int i, gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData transactionData) {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).setTransactionData(i, transactionData);
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder setTransactionData(int i, gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).setTransactionData(i, builder.build());
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder addTransactionData(gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData transactionData) {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).addTransactionData(transactionData);
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder addTransactionData(int i, gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData transactionData) {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).addTransactionData(i, transactionData);
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder addTransactionData(gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).addTransactionData(builder.build());
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder addTransactionData(int i, gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData.Builder builder) {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).addTransactionData(i, builder.build());
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder addAllTransactionData(java.lang.Iterable<? extends gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData> iterable) {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).addAllTransactionData(iterable);
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder clearTransactionData() {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).clearTransactionData();
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder removeTransactionData(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).removeTransactionData(i);
                return this;
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
            public int getOriginValue() {
                return ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).getOriginValue();
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder setOriginValue(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).setOriginValue(i);
                return this;
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionOrigin getOrigin() {
                return ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).getOrigin();
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder setOrigin(gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionOrigin transactionOrigin) {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).setOrigin(transactionOrigin);
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder clearOrigin() {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).clearOrigin();
                return this;
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
            public int getStoreKitVersionValue() {
                return ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).getStoreKitVersionValue();
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder setStoreKitVersionValue(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).setStoreKitVersionValue(i);
                return this;
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
            public gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreKitVersion getStoreKitVersion() {
                return ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).getStoreKitVersion();
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder setStoreKitVersion(gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreKitVersion storeKitVersion) {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).setStoreKitVersion(storeKitVersion);
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder clearStoreKitVersion() {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).clearStoreKitVersion();
                return this;
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
            public java.lang.String getGooglePlayBillingLibraryVersion() {
                return ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).getGooglePlayBillingLibraryVersion();
            }

            @Override // gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder
            public com.google.protobuf.ByteString getGooglePlayBillingLibraryVersionBytes() {
                return ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).getGooglePlayBillingLibraryVersionBytes();
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder setGooglePlayBillingLibraryVersion(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).setGooglePlayBillingLibraryVersion(str);
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder clearGooglePlayBillingLibraryVersion() {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).clearGooglePlayBillingLibraryVersion();
                return this;
            }

            public gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder setGooglePlayBillingLibraryVersionBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest) this.instance).setGooglePlayBillingLibraryVersionBytes(byteString);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.TransactionEventRequestOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.TransactionEventRequestOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest();
                case 2:
                    return new gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f\u0004Ȉ\u0005\u001b\u0006\f\u0007\f\bȈ", new java.lang.Object[]{"bitField0_", "staticDeviceInfo_", "dynamicDeviceInfo_", "appStore_", "customStore_", "transactionData_", gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData.class, "origin_", "storeKitVersion_", "googlePlayBillingLibraryVersion_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest> parser = PARSER;
                    if (parser == null) {
                        synchronized (gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.class) {
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
            gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest = new gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest();
            DEFAULT_INSTANCE = transactionEventRequest;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.class, transactionEventRequest);
        }

        public static gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
