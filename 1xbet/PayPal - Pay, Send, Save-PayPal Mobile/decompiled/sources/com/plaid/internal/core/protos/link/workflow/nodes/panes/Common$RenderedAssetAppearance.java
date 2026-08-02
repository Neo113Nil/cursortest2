package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$RenderedAssetAppearance extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.K {
    public static final int DARK_APPEARANCE_FIELD_NUMBER = 1;
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance DEFAULT_INSTANCE;
    public static final int LIGHT_APPEARANCE_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance> PARSER;
    private int bitField0_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset darkAppearance_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset lightAppearance_;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.K {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance();
        DEFAULT_INSTANCE = common$RenderedAssetAppearance;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.class, common$RenderedAssetAppearance);
    }

    private Common$RenderedAssetAppearance() {
    }

    private void clearDarkAppearance() {
        this.darkAppearance_ = null;
        this.bitField0_ &= -2;
    }

    private void clearLightAppearance() {
        this.lightAppearance_ = null;
        this.bitField0_ &= -3;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new java.lang.Object[]{"bitField0_", "darkAppearance_", "lightAppearance_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.class) {
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

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset getDarkAppearance() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset common$RenderedAsset = this.darkAppearance_;
        return common$RenderedAsset == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.getDefaultInstance() : common$RenderedAsset;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset getLightAppearance() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset common$RenderedAsset = this.lightAppearance_;
        return common$RenderedAsset == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.getDefaultInstance() : common$RenderedAsset;
    }

    public final boolean hasDarkAppearance() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasLightAppearance() {
        return (this.bitField0_ & 2) != 0;
    }

    private void mergeDarkAppearance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset common$RenderedAsset) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset common$RenderedAsset2 = this.darkAppearance_;
        if (common$RenderedAsset2 == null || common$RenderedAsset2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.getDefaultInstance()) {
            this.darkAppearance_ = common$RenderedAsset;
        } else {
            this.darkAppearance_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.newBuilder(this.darkAppearance_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.a) common$RenderedAsset).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    private void mergeLightAppearance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset common$RenderedAsset) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset common$RenderedAsset2 = this.lightAppearance_;
        if (common$RenderedAsset2 == null || common$RenderedAsset2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.getDefaultInstance()) {
            this.lightAppearance_ = common$RenderedAsset;
        } else {
            this.lightAppearance_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.newBuilder(this.lightAppearance_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.a) common$RenderedAsset).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        return DEFAULT_INSTANCE.createBuilder(common$RenderedAssetAppearance);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setDarkAppearance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset common$RenderedAsset) {
        this.darkAppearance_ = common$RenderedAsset;
        this.bitField0_ |= 1;
    }

    private void setLightAppearance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset common$RenderedAsset) {
        this.lightAppearance_ = common$RenderedAsset;
        this.bitField0_ |= 2;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
