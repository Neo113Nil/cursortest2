package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$SDKEncryptionMetadata extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata> PARSER = null;
    public static final int PUBLIC_ENCRYPTION_PEM_KEY_FIELD_NUMBER = 1;
    public static final int SCHEME_FIELD_NUMBER = 2;
    private java.lang.String publicEncryptionPemKey_ = "";
    private int scheme_;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata common$SDKEncryptionMetadata = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata();
        DEFAULT_INSTANCE = common$SDKEncryptionMetadata;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata.class, common$SDKEncryptionMetadata);
    }

    private Common$SDKEncryptionMetadata() {
    }

    private void clearPublicEncryptionPemKey() {
        this.publicEncryptionPemKey_ = getDefaultInstance().getPublicEncryptionPemKey();
    }

    private void clearScheme() {
        this.scheme_ = 0;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setPublicEncryptionPemKeyBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.publicEncryptionPemKey_ = byteString.toStringUtf8();
    }

    private void setScheme(com.plaid.internal.core.protos.link.workflow.nodes.panes.L l) {
        this.scheme_ = l.getNumber();
    }

    private void setSchemeValue(int i) {
        this.scheme_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new java.lang.Object[]{"publicEncryptionPemKey_", "scheme_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata.class) {
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

    public final java.lang.String getPublicEncryptionPemKey() {
        return this.publicEncryptionPemKey_;
    }

    public final com.google.protobuf.ByteString getPublicEncryptionPemKeyBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.publicEncryptionPemKey_);
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.L getScheme() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.L forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.L.forNumber(this.scheme_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.L.UNRECOGNIZED : forNumber;
    }

    public final int getSchemeValue() {
        return this.scheme_;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata common$SDKEncryptionMetadata) {
        return DEFAULT_INSTANCE.createBuilder(common$SDKEncryptionMetadata);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setPublicEncryptionPemKey(java.lang.String str) {
        this.publicEncryptionPemKey_ = str;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
