package com.plaid.internal.core.protos.link.workflow.primitives;

/* loaded from: classes16.dex */
public final class SdkResult$ResultAccounts extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$ResultAccounts, com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$ResultAccounts.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int ACCOUNTS_FIELD_NUMBER = 1;
    private static final com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$ResultAccounts DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$ResultAccounts> PARSER;
    private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account> accounts_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$ResultAccounts, com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$ResultAccounts.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$ResultAccounts.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$ResultAccounts sdkResult$ResultAccounts = new com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$ResultAccounts();
        DEFAULT_INSTANCE = sdkResult$ResultAccounts;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$ResultAccounts.class, sdkResult$ResultAccounts);
    }

    private SdkResult$ResultAccounts() {
    }

    private void addAllAccounts(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account> iterable) {
        ensureAccountsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.accounts_);
    }

    private void clearAccounts() {
        this.accounts_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureAccountsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account> protobufList = this.accounts_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.accounts_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$ResultAccounts getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$ResultAccounts.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$ResultAccounts parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$ResultAccounts) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$ResultAccounts parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$ResultAccounts) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$ResultAccounts> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeAccounts(int i) {
        ensureAccountsIsMutable();
        this.accounts_.remove(i);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.primitives.s.f6382a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$ResultAccounts();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$ResultAccounts.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"accounts_", com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$ResultAccounts> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$ResultAccounts.class) {
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

    private void addAccounts(com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account account) {
        ensureAccountsIsMutable();
        this.accounts_.add(account);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$ResultAccounts.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$ResultAccounts sdkResult$ResultAccounts) {
        return DEFAULT_INSTANCE.createBuilder(sdkResult$ResultAccounts);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$ResultAccounts parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$ResultAccounts) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$ResultAccounts parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$ResultAccounts) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setAccounts(int i, com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account account) {
        ensureAccountsIsMutable();
        this.accounts_.set(i, account);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$ResultAccounts parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$ResultAccounts) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$ResultAccounts parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$ResultAccounts) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    private void addAccounts(int i, com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account account) {
        ensureAccountsIsMutable();
        this.accounts_.add(i, account);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$ResultAccounts parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$ResultAccounts) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$ResultAccounts parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$ResultAccounts) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$ResultAccounts parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$ResultAccounts) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$ResultAccounts parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$ResultAccounts) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$ResultAccounts parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$ResultAccounts) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$ResultAccounts parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$ResultAccounts) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
