package com.plaid.internal.core.protos.link.workflow.primitives;

/* loaded from: classes16.dex */
public final class CardTokenizationData$CardCollectError extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectError, com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectError.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectError DEFAULT_INSTANCE;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectError> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private java.lang.String errorMessage_ = "";
    private int type_;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectError, com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectError.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectError.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectError cardTokenizationData$CardCollectError = new com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectError();
        DEFAULT_INSTANCE = cardTokenizationData$CardCollectError;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectError.class, cardTokenizationData$CardCollectError);
    }

    private CardTokenizationData$CardCollectError() {
    }

    private void clearErrorMessage() {
        this.errorMessage_ = getDefaultInstance().getErrorMessage();
    }

    private void clearType() {
        this.type_ = 0;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectError getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectError.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectError parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectError) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectError parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectError) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectError> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setErrorMessageBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.errorMessage_ = byteString.toStringUtf8();
    }

    private void setType(com.plaid.internal.core.protos.link.workflow.primitives.c cVar) {
        this.type_ = cVar.getNumber();
    }

    private void setTypeValue(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.primitives.b.f6356a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectError();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectError.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new java.lang.Object[]{"type_", "errorMessage_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectError> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectError.class) {
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

    public final com.plaid.internal.core.protos.link.workflow.primitives.c getType() {
        com.plaid.internal.core.protos.link.workflow.primitives.c forNumber = com.plaid.internal.core.protos.link.workflow.primitives.c.forNumber(this.type_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.primitives.c.UNRECOGNIZED : forNumber;
    }

    public final int getTypeValue() {
        return this.type_;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectError.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectError cardTokenizationData$CardCollectError) {
        return DEFAULT_INSTANCE.createBuilder(cardTokenizationData$CardCollectError);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectError parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectError) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectError parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectError) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectError parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectError) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setErrorMessage(java.lang.String str) {
        this.errorMessage_ = str;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectError parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectError) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectError parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectError) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectError parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectError) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectError parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectError) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectError parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectError) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectError parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectError) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectError parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectError) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
