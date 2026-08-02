package com.plaid.internal.core.protos.clients;

/* loaded from: classes16.dex */
public final class LinkCustomizations$DocumentPreference extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference, com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference.a> implements com.plaid.internal.core.protos.clients.b {
    public static final int AT_LEAST_FIELD_NUMBER = 2;
    public static final int AT_MOST_FIELD_NUMBER = 3;
    private static final com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference DEFAULT_INSTANCE;
    public static final int DOCUMENT_TYPE_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference> PARSER;
    private com.google.protobuf.Int32Value atLeast_;
    private com.google.protobuf.Int32Value atMost_;
    private int bitField0_;
    private int documentType_;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference, com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference.a> implements com.plaid.internal.core.protos.clients.b {
        public a() {
            super(com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference linkCustomizations$DocumentPreference = new com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference();
        DEFAULT_INSTANCE = linkCustomizations$DocumentPreference;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference.class, linkCustomizations$DocumentPreference);
    }

    private LinkCustomizations$DocumentPreference() {
    }

    private void clearAtLeast() {
        this.atLeast_ = null;
        this.bitField0_ &= -2;
    }

    private void clearAtMost() {
        this.atMost_ = null;
        this.bitField0_ &= -3;
    }

    private void clearDocumentType() {
        this.documentType_ = 0;
    }

    public static com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDocumentType(com.plaid.internal.core.protos.income_verification_manager.b bVar) {
        this.documentType_ = bVar.getNumber();
    }

    private void setDocumentTypeValue(int i) {
        this.documentType_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.clients.a.f6030a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference();
            case 2:
                return new com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003ဉ\u0001", new java.lang.Object[]{"bitField0_", "documentType_", "atLeast_", "atMost_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference.class) {
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

    public final com.google.protobuf.Int32Value getAtLeast() {
        com.google.protobuf.Int32Value int32Value = this.atLeast_;
        return int32Value == null ? com.google.protobuf.Int32Value.getDefaultInstance() : int32Value;
    }

    public final com.google.protobuf.Int32Value getAtMost() {
        com.google.protobuf.Int32Value int32Value = this.atMost_;
        return int32Value == null ? com.google.protobuf.Int32Value.getDefaultInstance() : int32Value;
    }

    public final com.plaid.internal.core.protos.income_verification_manager.b getDocumentType() {
        com.plaid.internal.core.protos.income_verification_manager.b forNumber = com.plaid.internal.core.protos.income_verification_manager.b.forNumber(this.documentType_);
        return forNumber == null ? com.plaid.internal.core.protos.income_verification_manager.b.UNRECOGNIZED : forNumber;
    }

    public final int getDocumentTypeValue() {
        return this.documentType_;
    }

    public final boolean hasAtLeast() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasAtMost() {
        return (this.bitField0_ & 2) != 0;
    }

    private void mergeAtLeast(com.google.protobuf.Int32Value int32Value) {
        com.google.protobuf.Int32Value int32Value2 = this.atLeast_;
        if (int32Value2 == null || int32Value2 == com.google.protobuf.Int32Value.getDefaultInstance()) {
            this.atLeast_ = int32Value;
        } else {
            this.atLeast_ = com.google.protobuf.Int32Value.newBuilder(this.atLeast_).mergeFrom((com.google.protobuf.Int32Value.Builder) int32Value).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    private void mergeAtMost(com.google.protobuf.Int32Value int32Value) {
        com.google.protobuf.Int32Value int32Value2 = this.atMost_;
        if (int32Value2 == null || int32Value2 == com.google.protobuf.Int32Value.getDefaultInstance()) {
            this.atMost_ = int32Value;
        } else {
            this.atMost_ = com.google.protobuf.Int32Value.newBuilder(this.atMost_).mergeFrom((com.google.protobuf.Int32Value.Builder) int32Value).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference.a newBuilder(com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference linkCustomizations$DocumentPreference) {
        return DEFAULT_INSTANCE.createBuilder(linkCustomizations$DocumentPreference);
    }

    public static com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setAtLeast(com.google.protobuf.Int32Value int32Value) {
        this.atLeast_ = int32Value;
        this.bitField0_ |= 1;
    }

    private void setAtMost(com.google.protobuf.Int32Value int32Value) {
        this.atMost_ = int32Value;
        this.bitField0_ |= 2;
    }

    public static com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
