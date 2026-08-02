package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$AccordionItem extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.InterfaceC0485k {
    public static final int ATTRIBUTED_DETAIL_FIELD_NUMBER = 4;
    public static final int ATTRIBUTED_LABEL_FIELD_NUMBER = 5;
    public static final int BUTTON_FIELD_NUMBER = 8;
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem DEFAULT_INSTANCE;
    public static final int DETAIL_FIELD_NUMBER = 3;
    public static final int ICON_FIELD_NUMBER = 1;
    public static final int ID_FIELD_NUMBER = 9;
    public static final int IS_EXPANDED_FIELD_NUMBER = 6;
    public static final int LABEL_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem> PARSER = null;
    public static final int PROMPTS_FIELD_NUMBER = 7;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString attributedDetail_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString attributedLabel_;
    private int bitField0_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent button_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString detail_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance icon_;
    private int id_;
    private boolean isExpanded_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString label_;
    private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt> prompts_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

    private void addPrompts(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt common$Prompt) {
        ensurePromptsIsMutable();
        this.prompts_.add(i, common$Prompt);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addPrompts(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt common$Prompt) {
        ensurePromptsIsMutable();
        this.prompts_.add(common$Prompt);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem common$AccordionItem) {
        return DEFAULT_INSTANCE.createBuilder(common$AccordionItem);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public final boolean hasLabel() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean hasIcon() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasDetail() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean hasButton() {
        return (this.bitField0_ & 32) != 0;
    }

    public final boolean hasAttributedLabel() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean hasAttributedDetail() {
        return (this.bitField0_ & 16) != 0;
    }

    public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.J> getPromptsOrBuilderList() {
        return this.prompts_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.J getPromptsOrBuilder(int i) {
        return this.prompts_.get(i);
    }

    public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt> getPromptsList() {
        return this.prompts_;
    }

    public final int getPromptsCount() {
        return this.prompts_.size();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt getPrompts(int i) {
        return this.prompts_.get(i);
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getLabel() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.label_;
        return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public final boolean getIsExpanded() {
        return this.isExpanded_;
    }

    public final int getId() {
        return this.id_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance getIcon() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.icon_;
        return common$RenderedAssetAppearance == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getDetail() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.detail_;
        return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent getButton() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent = this.button_;
        return common$ButtonContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString getAttributedLabel() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString = this.attributedLabel_;
        return common$AttributedLocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString getAttributedDetail() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString = this.attributedDetail_;
        return common$AttributedLocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0003\u0004ဉ\u0004\u0005ဉ\u0002\u0006\u0007\u0007\u001b\bဉ\u0005\t\u0004", new java.lang.Object[]{"bitField0_", "icon_", "label_", "detail_", "attributedDetail_", "attributedLabel_", "isExpanded_", "prompts_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt.class, "button_", "id_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem.class) {
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

    private void setPrompts(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt common$Prompt) {
        ensurePromptsIsMutable();
        this.prompts_.set(i, common$Prompt);
    }

    private void setLabel(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        this.label_ = common$LocalizedString;
        this.bitField0_ |= 2;
    }

    private void setIsExpanded(boolean z) {
        this.isExpanded_ = z;
    }

    private void setId(int i) {
        this.id_ = i;
    }

    private void setIcon(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        this.icon_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 1;
    }

    private void setDetail(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        this.detail_ = common$LocalizedString;
        this.bitField0_ |= 8;
    }

    private void setButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
        this.button_ = common$ButtonContent;
        this.bitField0_ |= 32;
    }

    private void setAttributedLabel(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
        this.attributedLabel_ = common$AttributedLocalizedString;
        this.bitField0_ |= 4;
    }

    private void setAttributedDetail(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
        this.attributedDetail_ = common$AttributedLocalizedString;
        this.bitField0_ |= 16;
    }

    private void removePrompts(int i) {
        ensurePromptsIsMutable();
        this.prompts_.remove(i);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void mergeLabel(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.label_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.label_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
        }
        this.label_ = common$LocalizedString;
        this.bitField0_ |= 2;
    }

    private void mergeIcon(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.icon_;
        if (common$RenderedAssetAppearance2 != null && common$RenderedAssetAppearance2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance()) {
            common$RenderedAssetAppearance = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.newBuilder(this.icon_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.a) common$RenderedAssetAppearance).buildPartial();
        }
        this.icon_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 1;
    }

    private void mergeDetail(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.detail_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.detail_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
        }
        this.detail_ = common$LocalizedString;
        this.bitField0_ |= 8;
    }

    private void mergeButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent2 = this.button_;
        if (common$ButtonContent2 != null && common$ButtonContent2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance()) {
            common$ButtonContent = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.newBuilder(this.button_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.a) common$ButtonContent).buildPartial();
        }
        this.button_ = common$ButtonContent;
        this.bitField0_ |= 32;
    }

    private void mergeAttributedLabel(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.attributedLabel_;
        if (common$AttributedLocalizedString2 != null && common$AttributedLocalizedString2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance()) {
            common$AttributedLocalizedString = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.newBuilder(this.attributedLabel_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c) common$AttributedLocalizedString).buildPartial();
        }
        this.attributedLabel_ = common$AttributedLocalizedString;
        this.bitField0_ |= 4;
    }

    private void mergeAttributedDetail(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.attributedDetail_;
        if (common$AttributedLocalizedString2 != null && common$AttributedLocalizedString2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance()) {
            common$AttributedLocalizedString = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.newBuilder(this.attributedDetail_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c) common$AttributedLocalizedString).buildPartial();
        }
        this.attributedDetail_ = common$AttributedLocalizedString;
        this.bitField0_ |= 16;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void ensurePromptsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt> protobufList = this.prompts_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.prompts_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void clearPrompts() {
        this.prompts_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    private void clearLabel() {
        this.label_ = null;
        this.bitField0_ &= -3;
    }

    private void clearIsExpanded() {
        this.isExpanded_ = false;
    }

    private void clearId() {
        this.id_ = 0;
    }

    private void clearIcon() {
        this.icon_ = null;
        this.bitField0_ &= -2;
    }

    private void clearDetail() {
        this.detail_ = null;
        this.bitField0_ &= -9;
    }

    private void clearButton() {
        this.button_ = null;
        this.bitField0_ &= -33;
    }

    private void clearAttributedLabel() {
        this.attributedLabel_ = null;
        this.bitField0_ &= -5;
    }

    private void clearAttributedDetail() {
        this.attributedDetail_ = null;
        this.bitField0_ &= -17;
    }

    private void addAllPrompts(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt> iterable) {
        ensurePromptsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.prompts_);
    }

    private Common$AccordionItem() {
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.InterfaceC0485k {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem common$AccordionItem = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem();
        DEFAULT_INSTANCE = common$AccordionItem;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AccordionItem.class, common$AccordionItem);
    }
}
