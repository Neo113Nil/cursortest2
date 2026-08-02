package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$CheckListItem extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.r {
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    public static final int FIRST_LINE_CONTENT_FIELD_NUMBER = 5;
    public static final int HEADER_FIELD_NUMBER = 1;
    public static final int ICON_FIELD_NUMBER = 3;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem> PARSER = null;
    public static final int SECOND_LINE_CONTENT_FIELD_NUMBER = 6;
    private int bitField0_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString description_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent firstLineContent_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString header_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance icon_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent secondLineContent_;

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem common$CheckListItem) {
        return DEFAULT_INSTANCE.createBuilder(common$CheckListItem);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public final boolean hasSecondLineContent() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean hasIcon() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean hasHeader() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasFirstLineContent() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean hasDescription() {
        return (this.bitField0_ & 4) != 0;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent getSecondLineContent() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent = this.secondLineContent_;
        return common$TextContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.getDefaultInstance() : common$TextContent;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance getIcon() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.icon_;
        return common$RenderedAssetAppearance == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getHeader() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.header_;
        return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent getFirstLineContent() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent = this.firstLineContent_;
        return common$TextContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.getDefaultInstance() : common$TextContent;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString getDescription() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString = this.description_;
        return common$AttributedLocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0004\u0004ဉ\u0002\u0005ဉ\u0001\u0006ဉ\u0003", new java.lang.Object[]{"bitField0_", "header_", "icon_", "description_", "firstLineContent_", "secondLineContent_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem.class) {
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

    private void setSecondLineContent(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent) {
        this.secondLineContent_ = common$TextContent;
        this.bitField0_ |= 8;
    }

    private void setIcon(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        this.icon_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 16;
    }

    private void setHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        this.header_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    private void setFirstLineContent(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent) {
        this.firstLineContent_ = common$TextContent;
        this.bitField0_ |= 2;
    }

    private void setDescription(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
        this.description_ = common$AttributedLocalizedString;
        this.bitField0_ |= 4;
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void mergeSecondLineContent(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent2 = this.secondLineContent_;
        if (common$TextContent2 != null && common$TextContent2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.getDefaultInstance()) {
            common$TextContent = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.newBuilder(this.secondLineContent_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.c) common$TextContent).buildPartial();
        }
        this.secondLineContent_ = common$TextContent;
        this.bitField0_ |= 8;
    }

    private void mergeIcon(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.icon_;
        if (common$RenderedAssetAppearance2 != null && common$RenderedAssetAppearance2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance()) {
            common$RenderedAssetAppearance = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.newBuilder(this.icon_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.a) common$RenderedAssetAppearance).buildPartial();
        }
        this.icon_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 16;
    }

    private void mergeHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.header_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.header_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
        }
        this.header_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    private void mergeFirstLineContent(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent2 = this.firstLineContent_;
        if (common$TextContent2 != null && common$TextContent2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.getDefaultInstance()) {
            common$TextContent = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.newBuilder(this.firstLineContent_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.c) common$TextContent).buildPartial();
        }
        this.firstLineContent_ = common$TextContent;
        this.bitField0_ |= 2;
    }

    private void mergeDescription(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.description_;
        if (common$AttributedLocalizedString2 != null && common$AttributedLocalizedString2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance()) {
            common$AttributedLocalizedString = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.newBuilder(this.description_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c) common$AttributedLocalizedString).buildPartial();
        }
        this.description_ = common$AttributedLocalizedString;
        this.bitField0_ |= 4;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void clearSecondLineContent() {
        this.secondLineContent_ = null;
        this.bitField0_ &= -9;
    }

    private void clearIcon() {
        this.icon_ = null;
        this.bitField0_ &= -17;
    }

    private void clearHeader() {
        this.header_ = null;
        this.bitField0_ &= -2;
    }

    private void clearFirstLineContent() {
        this.firstLineContent_ = null;
        this.bitField0_ &= -3;
    }

    private void clearDescription() {
        this.description_ = null;
        this.bitField0_ &= -5;
    }

    private Common$CheckListItem() {
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.r {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem common$CheckListItem = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem();
        DEFAULT_INSTANCE = common$CheckListItem;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem.class, common$CheckListItem);
    }
}
