package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$GridSelectionImageItem extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.InterfaceC0498y {
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IMAGE_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem> PARSER;
    private int bitField0_;
    private java.lang.String id_ = "";
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset image_;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.InterfaceC0498y {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem common$GridSelectionImageItem = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem();
        DEFAULT_INSTANCE = common$GridSelectionImageItem;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem.class, common$GridSelectionImageItem);
    }

    private Common$GridSelectionImageItem() {
    }

    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    private void clearImage() {
        this.image_ = null;
        this.bitField0_ &= -2;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new java.lang.Object[]{"bitField0_", "id_", "image_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem.class) {
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

    public final java.lang.String getId() {
        return this.id_;
    }

    public final com.google.protobuf.ByteString getIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.id_);
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset getImage() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset common$RenderedAsset = this.image_;
        return common$RenderedAsset == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.getDefaultInstance() : common$RenderedAsset;
    }

    public final boolean hasImage() {
        return (this.bitField0_ & 1) != 0;
    }

    private void mergeImage(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset common$RenderedAsset) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset common$RenderedAsset2 = this.image_;
        if (common$RenderedAsset2 == null || common$RenderedAsset2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.getDefaultInstance()) {
            this.image_ = common$RenderedAsset;
        } else {
            this.image_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.newBuilder(this.image_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.a) common$RenderedAsset).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem common$GridSelectionImageItem) {
        return DEFAULT_INSTANCE.createBuilder(common$GridSelectionImageItem);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setImage(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset common$RenderedAsset) {
        this.image_ = common$RenderedAsset;
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setId(java.lang.String str) {
        this.id_ = str;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
