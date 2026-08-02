package com.plaid.internal.core.protos.link.workflow.primitives;

/* loaded from: classes16.dex */
public final class CardTokenizationData$UserInputCardCredentials extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$UserInputCardCredentials, com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$UserInputCardCredentials.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int CARD_EXPIRATION_FIELD_NUMBER = 4;
    public static final int CARD_HOLDER_FIELD_NUMBER = 3;
    private static final com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$UserInputCardCredentials DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$UserInputCardCredentials> PARSER = null;
    public static final int TOKENIZED_CARD_CVC_FIELD_NUMBER = 1;
    public static final int TOKENIZED_CARD_NUMBER_FIELD_NUMBER = 2;
    private java.lang.String tokenizedCardCvc_ = "";
    private java.lang.String tokenizedCardNumber_ = "";
    private java.lang.String cardHolder_ = "";
    private java.lang.String cardExpiration_ = "";

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$UserInputCardCredentials, com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$UserInputCardCredentials.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$UserInputCardCredentials.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$UserInputCardCredentials cardTokenizationData$UserInputCardCredentials = new com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$UserInputCardCredentials();
        DEFAULT_INSTANCE = cardTokenizationData$UserInputCardCredentials;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$UserInputCardCredentials.class, cardTokenizationData$UserInputCardCredentials);
    }

    private CardTokenizationData$UserInputCardCredentials() {
    }

    private void clearCardExpiration() {
        this.cardExpiration_ = getDefaultInstance().getCardExpiration();
    }

    private void clearCardHolder() {
        this.cardHolder_ = getDefaultInstance().getCardHolder();
    }

    private void clearTokenizedCardCvc() {
        this.tokenizedCardCvc_ = getDefaultInstance().getTokenizedCardCvc();
    }

    private void clearTokenizedCardNumber() {
        this.tokenizedCardNumber_ = getDefaultInstance().getTokenizedCardNumber();
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$UserInputCardCredentials getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$UserInputCardCredentials.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$UserInputCardCredentials parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$UserInputCardCredentials) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$UserInputCardCredentials parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$UserInputCardCredentials) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$UserInputCardCredentials> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCardExpirationBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.cardExpiration_ = byteString.toStringUtf8();
    }

    private void setCardHolderBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.cardHolder_ = byteString.toStringUtf8();
    }

    private void setTokenizedCardCvcBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.tokenizedCardCvc_ = byteString.toStringUtf8();
    }

    private void setTokenizedCardNumberBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.tokenizedCardNumber_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.primitives.b.f6356a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$UserInputCardCredentials();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$UserInputCardCredentials.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new java.lang.Object[]{"tokenizedCardCvc_", "tokenizedCardNumber_", "cardHolder_", "cardExpiration_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$UserInputCardCredentials> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$UserInputCardCredentials.class) {
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

    public final java.lang.String getCardExpiration() {
        return this.cardExpiration_;
    }

    public final com.google.protobuf.ByteString getCardExpirationBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.cardExpiration_);
    }

    public final java.lang.String getCardHolder() {
        return this.cardHolder_;
    }

    public final com.google.protobuf.ByteString getCardHolderBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.cardHolder_);
    }

    public final java.lang.String getTokenizedCardCvc() {
        return this.tokenizedCardCvc_;
    }

    public final com.google.protobuf.ByteString getTokenizedCardCvcBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.tokenizedCardCvc_);
    }

    public final java.lang.String getTokenizedCardNumber() {
        return this.tokenizedCardNumber_;
    }

    public final com.google.protobuf.ByteString getTokenizedCardNumberBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.tokenizedCardNumber_);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$UserInputCardCredentials.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$UserInputCardCredentials cardTokenizationData$UserInputCardCredentials) {
        return DEFAULT_INSTANCE.createBuilder(cardTokenizationData$UserInputCardCredentials);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$UserInputCardCredentials parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$UserInputCardCredentials) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$UserInputCardCredentials parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$UserInputCardCredentials) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$UserInputCardCredentials parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$UserInputCardCredentials) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setCardExpiration(java.lang.String str) {
        this.cardExpiration_ = str;
    }

    private void setCardHolder(java.lang.String str) {
        this.cardHolder_ = str;
    }

    private void setTokenizedCardCvc(java.lang.String str) {
        this.tokenizedCardCvc_ = str;
    }

    private void setTokenizedCardNumber(java.lang.String str) {
        this.tokenizedCardNumber_ = str;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$UserInputCardCredentials parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$UserInputCardCredentials) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$UserInputCardCredentials parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$UserInputCardCredentials) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$UserInputCardCredentials parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$UserInputCardCredentials) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$UserInputCardCredentials parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$UserInputCardCredentials) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$UserInputCardCredentials parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$UserInputCardCredentials) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$UserInputCardCredentials parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$UserInputCardCredentials) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$UserInputCardCredentials parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$UserInputCardCredentials) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
