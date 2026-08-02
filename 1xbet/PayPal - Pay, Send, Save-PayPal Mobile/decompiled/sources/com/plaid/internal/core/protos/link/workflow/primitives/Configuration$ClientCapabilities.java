package com.plaid.internal.core.protos.link.workflow.primitives;

/* loaded from: classes16.dex */
public final class Configuration$ClientCapabilities extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities DEFAULT_INSTANCE;
    public static final int DETECTED_WEB3_WALLET_IDS_FIELD_NUMBER = 3;
    public static final int DISABLE_CUSTOM_TABS_FIELD_NUMBER = 4;
    public static final int INCREMENTAL_CALLBACK_SUPPORT_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities> PARSER = null;
    public static final int SUPPORTS_EAGER_START_FIELD_NUMBER = 5;
    public static final int SUPPORTS_INCREMENTAL_RESULTS_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.ProtobufList<java.lang.String> detectedWeb3WalletIds_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    private boolean disableCustomTabs_;
    private int incrementalCallbackSupport_;
    private boolean supportsEagerStart_;
    private boolean supportsIncrementalResults_;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities.DEFAULT_INSTANCE);
        }

        public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities.a a(boolean z) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities) this.instance).setDisableCustomTabs(z);
            return this;
        }

        public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities.a b(boolean z) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities) this.instance).setSupportsEagerStart(z);
            return this;
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities configuration$ClientCapabilities = new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities();
        DEFAULT_INSTANCE = configuration$ClientCapabilities;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities.class, configuration$ClientCapabilities);
    }

    private Configuration$ClientCapabilities() {
    }

    private void addAllDetectedWeb3WalletIds(java.lang.Iterable<java.lang.String> iterable) {
        ensureDetectedWeb3WalletIdsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.detectedWeb3WalletIds_);
    }

    private void addDetectedWeb3WalletIdsBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        ensureDetectedWeb3WalletIdsIsMutable();
        this.detectedWeb3WalletIds_.add(byteString.toStringUtf8());
    }

    private void clearDetectedWeb3WalletIds() {
        this.detectedWeb3WalletIds_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    private void clearDisableCustomTabs() {
        this.disableCustomTabs_ = false;
    }

    private void clearIncrementalCallbackSupport() {
        this.incrementalCallbackSupport_ = 0;
    }

    private void clearSupportsEagerStart() {
        this.supportsEagerStart_ = false;
    }

    private void clearSupportsIncrementalResults() {
        this.supportsIncrementalResults_ = false;
    }

    private void ensureDetectedWeb3WalletIdsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<java.lang.String> protobufList = this.detectedWeb3WalletIds_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.detectedWeb3WalletIds_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisableCustomTabs(boolean z) {
        this.disableCustomTabs_ = z;
    }

    private void setIncrementalCallbackSupport(com.plaid.internal.core.protos.link.workflow.primitives.h hVar) {
        this.incrementalCallbackSupport_ = hVar.getNumber();
    }

    private void setIncrementalCallbackSupportValue(int i) {
        this.incrementalCallbackSupport_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSupportsEagerStart(boolean z) {
        this.supportsEagerStart_ = z;
    }

    private void setSupportsIncrementalResults(boolean z) {
        this.supportsIncrementalResults_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.primitives.e.f6361a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0007\u0002\f\u0003Ț\u0004\u0007\u0005\u0007", new java.lang.Object[]{"supportsIncrementalResults_", "incrementalCallbackSupport_", "detectedWeb3WalletIds_", "disableCustomTabs_", "supportsEagerStart_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities.class) {
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

    public final java.lang.String getDetectedWeb3WalletIds(int i) {
        return this.detectedWeb3WalletIds_.get(i);
    }

    public final com.google.protobuf.ByteString getDetectedWeb3WalletIdsBytes(int i) {
        return com.google.protobuf.ByteString.copyFromUtf8(this.detectedWeb3WalletIds_.get(i));
    }

    public final int getDetectedWeb3WalletIdsCount() {
        return this.detectedWeb3WalletIds_.size();
    }

    public final java.util.List<java.lang.String> getDetectedWeb3WalletIdsList() {
        return this.detectedWeb3WalletIds_;
    }

    public final boolean getDisableCustomTabs() {
        return this.disableCustomTabs_;
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.h getIncrementalCallbackSupport() {
        com.plaid.internal.core.protos.link.workflow.primitives.h forNumber = com.plaid.internal.core.protos.link.workflow.primitives.h.forNumber(this.incrementalCallbackSupport_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.primitives.h.UNRECOGNIZED : forNumber;
    }

    public final int getIncrementalCallbackSupportValue() {
        return this.incrementalCallbackSupport_;
    }

    public final boolean getSupportsEagerStart() {
        return this.supportsEagerStart_;
    }

    public final boolean getSupportsIncrementalResults() {
        return this.supportsIncrementalResults_;
    }

    private void addDetectedWeb3WalletIds(java.lang.String str) {
        ensureDetectedWeb3WalletIdsIsMutable();
        this.detectedWeb3WalletIds_.add(str);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities configuration$ClientCapabilities) {
        return DEFAULT_INSTANCE.createBuilder(configuration$ClientCapabilities);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setDetectedWeb3WalletIds(int i, java.lang.String str) {
        ensureDetectedWeb3WalletIdsIsMutable();
        this.detectedWeb3WalletIds_.set(i, str);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
