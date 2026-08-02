package com.plaid.internal.core.protos.clients;

/* loaded from: classes16.dex */
public final class LinkCustomizations$TemplateTokenConfiguration extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration, com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int ACCOUNT_SUBTYPES_FIELD_NUMBER = 2;
    private static final com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration> PARSER = null;
    public static final int PRODUCTS_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.ProtobufList<java.lang.String> products_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    private com.google.protobuf.Internal.ProtobufList<java.lang.String> accountSubtypes_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration, com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration linkCustomizations$TemplateTokenConfiguration = new com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration();
        DEFAULT_INSTANCE = linkCustomizations$TemplateTokenConfiguration;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration.class, linkCustomizations$TemplateTokenConfiguration);
    }

    private LinkCustomizations$TemplateTokenConfiguration() {
    }

    private void addAccountSubtypesBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        ensureAccountSubtypesIsMutable();
        this.accountSubtypes_.add(byteString.toStringUtf8());
    }

    private void addAllAccountSubtypes(java.lang.Iterable<java.lang.String> iterable) {
        ensureAccountSubtypesIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.accountSubtypes_);
    }

    private void addAllProducts(java.lang.Iterable<java.lang.String> iterable) {
        ensureProductsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.products_);
    }

    private void addProductsBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        ensureProductsIsMutable();
        this.products_.add(byteString.toStringUtf8());
    }

    private void clearAccountSubtypes() {
        this.accountSubtypes_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    private void clearProducts() {
        this.products_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureAccountSubtypesIsMutable() {
        com.google.protobuf.Internal.ProtobufList<java.lang.String> protobufList = this.accountSubtypes_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.accountSubtypes_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureProductsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<java.lang.String> protobufList = this.products_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.products_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.clients.a.f6030a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration();
            case 2:
                return new com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001Ț\u0002Ț", new java.lang.Object[]{"products_", "accountSubtypes_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration.class) {
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

    public final java.lang.String getAccountSubtypes(int i) {
        return this.accountSubtypes_.get(i);
    }

    public final com.google.protobuf.ByteString getAccountSubtypesBytes(int i) {
        return com.google.protobuf.ByteString.copyFromUtf8(this.accountSubtypes_.get(i));
    }

    public final int getAccountSubtypesCount() {
        return this.accountSubtypes_.size();
    }

    public final java.util.List<java.lang.String> getAccountSubtypesList() {
        return this.accountSubtypes_;
    }

    public final java.lang.String getProducts(int i) {
        return this.products_.get(i);
    }

    public final com.google.protobuf.ByteString getProductsBytes(int i) {
        return com.google.protobuf.ByteString.copyFromUtf8(this.products_.get(i));
    }

    public final int getProductsCount() {
        return this.products_.size();
    }

    public final java.util.List<java.lang.String> getProductsList() {
        return this.products_;
    }

    private void addAccountSubtypes(java.lang.String str) {
        ensureAccountSubtypesIsMutable();
        this.accountSubtypes_.add(str);
    }

    private void addProducts(java.lang.String str) {
        ensureProductsIsMutable();
        this.products_.add(str);
    }

    public static com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration.a newBuilder(com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration linkCustomizations$TemplateTokenConfiguration) {
        return DEFAULT_INSTANCE.createBuilder(linkCustomizations$TemplateTokenConfiguration);
    }

    public static com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setAccountSubtypes(int i, java.lang.String str) {
        ensureAccountSubtypesIsMutable();
        this.accountSubtypes_.set(i, str);
    }

    private void setProducts(int i, java.lang.String str) {
        ensureProductsIsMutable();
        this.products_.set(i, str);
    }

    public static com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
