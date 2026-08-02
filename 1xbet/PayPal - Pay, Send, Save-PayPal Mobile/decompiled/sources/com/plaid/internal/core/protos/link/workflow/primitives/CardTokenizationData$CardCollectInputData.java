package com.plaid.internal.core.protos.link.workflow.primitives;

/* loaded from: classes16.dex */
public final class CardTokenizationData$CardCollectInputData extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectInputData, com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectInputData.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int CARD_ID_FIELD_NUMBER = 1;
    public static final int CLIENT_ID_FIELD_NUMBER = 5;
    private static final com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectInputData DEFAULT_INSTANCE;
    public static final int LINK_TOKEN_FIELD_NUMBER = 6;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectInputData> PARSER = null;
    public static final int VAULT_CNAME_FIELD_NUMBER = 8;
    public static final int VAULT_ENVIRONMENT_FIELD_NUMBER = 7;
    public static final int VAULT_ID_FIELD_NUMBER = 3;
    public static final int VAULT_INBOUND_PATH_FIELD_NUMBER = 4;
    public static final int VAULT_TYPE_FIELD_NUMBER = 2;
    private int vaultType_;
    private java.lang.String cardId_ = "";
    private java.lang.String vaultId_ = "";
    private java.lang.String vaultInboundPath_ = "";
    private java.lang.String clientId_ = "";
    private java.lang.String linkToken_ = "";
    private java.lang.String vaultEnvironment_ = "";
    private java.lang.String vaultCname_ = "";

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectInputData, com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectInputData.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectInputData.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectInputData cardTokenizationData$CardCollectInputData = new com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectInputData();
        DEFAULT_INSTANCE = cardTokenizationData$CardCollectInputData;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectInputData.class, cardTokenizationData$CardCollectInputData);
    }

    private CardTokenizationData$CardCollectInputData() {
    }

    private void clearCardId() {
        this.cardId_ = getDefaultInstance().getCardId();
    }

    private void clearClientId() {
        this.clientId_ = getDefaultInstance().getClientId();
    }

    private void clearLinkToken() {
        this.linkToken_ = getDefaultInstance().getLinkToken();
    }

    private void clearVaultCname() {
        this.vaultCname_ = getDefaultInstance().getVaultCname();
    }

    private void clearVaultEnvironment() {
        this.vaultEnvironment_ = getDefaultInstance().getVaultEnvironment();
    }

    private void clearVaultId() {
        this.vaultId_ = getDefaultInstance().getVaultId();
    }

    private void clearVaultInboundPath() {
        this.vaultInboundPath_ = getDefaultInstance().getVaultInboundPath();
    }

    private void clearVaultType() {
        this.vaultType_ = 0;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectInputData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectInputData.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectInputData parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectInputData) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectInputData parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectInputData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectInputData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCardIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.cardId_ = byteString.toStringUtf8();
    }

    private void setClientIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.clientId_ = byteString.toStringUtf8();
    }

    private void setLinkTokenBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.linkToken_ = byteString.toStringUtf8();
    }

    private void setVaultCnameBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.vaultCname_ = byteString.toStringUtf8();
    }

    private void setVaultEnvironmentBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.vaultEnvironment_ = byteString.toStringUtf8();
    }

    private void setVaultIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.vaultId_ = byteString.toStringUtf8();
    }

    private void setVaultInboundPathBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.vaultInboundPath_ = byteString.toStringUtf8();
    }

    private void setVaultType(com.plaid.internal.core.protos.link.workflow.primitives.d dVar) {
        this.vaultType_ = dVar.getNumber();
    }

    private void setVaultTypeValue(int i) {
        this.vaultType_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.primitives.b.f6356a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectInputData();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectInputData.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ", new java.lang.Object[]{"cardId_", "vaultType_", "vaultId_", "vaultInboundPath_", "clientId_", "linkToken_", "vaultEnvironment_", "vaultCname_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectInputData> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectInputData.class) {
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

    public final java.lang.String getCardId() {
        return this.cardId_;
    }

    public final com.google.protobuf.ByteString getCardIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.cardId_);
    }

    public final java.lang.String getClientId() {
        return this.clientId_;
    }

    public final com.google.protobuf.ByteString getClientIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.clientId_);
    }

    public final java.lang.String getLinkToken() {
        return this.linkToken_;
    }

    public final com.google.protobuf.ByteString getLinkTokenBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.linkToken_);
    }

    public final java.lang.String getVaultCname() {
        return this.vaultCname_;
    }

    public final com.google.protobuf.ByteString getVaultCnameBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.vaultCname_);
    }

    public final java.lang.String getVaultEnvironment() {
        return this.vaultEnvironment_;
    }

    public final com.google.protobuf.ByteString getVaultEnvironmentBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.vaultEnvironment_);
    }

    public final java.lang.String getVaultId() {
        return this.vaultId_;
    }

    public final com.google.protobuf.ByteString getVaultIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.vaultId_);
    }

    public final java.lang.String getVaultInboundPath() {
        return this.vaultInboundPath_;
    }

    public final com.google.protobuf.ByteString getVaultInboundPathBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.vaultInboundPath_);
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.d getVaultType() {
        com.plaid.internal.core.protos.link.workflow.primitives.d forNumber = com.plaid.internal.core.protos.link.workflow.primitives.d.forNumber(this.vaultType_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.primitives.d.UNRECOGNIZED : forNumber;
    }

    public final int getVaultTypeValue() {
        return this.vaultType_;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectInputData.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectInputData cardTokenizationData$CardCollectInputData) {
        return DEFAULT_INSTANCE.createBuilder(cardTokenizationData$CardCollectInputData);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectInputData parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectInputData) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectInputData parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectInputData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectInputData parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectInputData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setCardId(java.lang.String str) {
        this.cardId_ = str;
    }

    private void setClientId(java.lang.String str) {
        this.clientId_ = str;
    }

    private void setLinkToken(java.lang.String str) {
        this.linkToken_ = str;
    }

    private void setVaultCname(java.lang.String str) {
        this.vaultCname_ = str;
    }

    private void setVaultEnvironment(java.lang.String str) {
        this.vaultEnvironment_ = str;
    }

    private void setVaultId(java.lang.String str) {
        this.vaultId_ = str;
    }

    private void setVaultInboundPath(java.lang.String str) {
        this.vaultInboundPath_ = str;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectInputData parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectInputData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectInputData parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectInputData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectInputData parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectInputData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectInputData parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectInputData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectInputData parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectInputData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectInputData parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectInputData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectInputData parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.CardTokenizationData$CardCollectInputData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
