package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$ListItem extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.A {
    public static final int ACTION_OVERRIDE_FIELD_NUMBER = 10;
    public static final int CHILD_ITEMS_FIELD_NUMBER = 8;
    public static final int CHILD_ITEMS_HEADER_FIELD_NUMBER = 9;
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 7;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IMAGE_FIELD_NUMBER = 2;
    public static final int IMAGE_MISSING_COLOR_FIELD_NUMBER = 3;
    public static final int ON_SUBMIT_OVERRIDE_FIELD_NUMBER = 11;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem> PARSER = null;
    public static final int SECONDARY_SUBTITLE_FIELD_NUMBER = 12;
    public static final int SUBTITLE_FIELD_NUMBER = 5;
    public static final int TITLE_FIELD_NUMBER = 4;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction actionOverride_;
    private int bitField0_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ChildItemsHeader childItemsHeader_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance icon_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance image_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent onSubmitOverride_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString secondarySubtitle_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString subtitle_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString title_;
    private java.lang.String id_ = "";
    private java.lang.String imageMissingColor_ = "";
    private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem> childItems_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.A {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem common$ListItem = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem();
        DEFAULT_INSTANCE = common$ListItem;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem.class, common$ListItem);
    }

    private Common$ListItem() {
    }

    private void addAllChildItems(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem> iterable) {
        ensureChildItemsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.childItems_);
    }

    private void clearActionOverride() {
        this.actionOverride_ = null;
        this.bitField0_ &= -65;
    }

    private void clearChildItems() {
        this.childItems_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    private void clearChildItemsHeader() {
        this.childItemsHeader_ = null;
        this.bitField0_ &= -33;
    }

    private void clearIcon() {
        this.icon_ = null;
        this.bitField0_ &= -17;
    }

    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    private void clearImage() {
        this.image_ = null;
        this.bitField0_ &= -2;
    }

    private void clearImageMissingColor() {
        this.imageMissingColor_ = getDefaultInstance().getImageMissingColor();
    }

    private void clearOnSubmitOverride() {
        this.onSubmitOverride_ = null;
        this.bitField0_ &= -129;
    }

    private void clearSecondarySubtitle() {
        this.secondarySubtitle_ = null;
        this.bitField0_ &= -9;
    }

    private void clearSubtitle() {
        this.subtitle_ = null;
        this.bitField0_ &= -5;
    }

    private void clearTitle() {
        this.title_ = null;
        this.bitField0_ &= -3;
    }

    private void ensureChildItemsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem> protobufList = this.childItems_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.childItems_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeChildItems(int i) {
        ensureChildItemsIsMutable();
        this.childItems_.remove(i);
    }

    private void setIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    private void setImageMissingColorBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.imageMissingColor_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\f\u000b\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ\u0004ဉ\u0001\u0005ဉ\u0002\u0007ဉ\u0004\b\u001b\tဉ\u0005\nဉ\u0006\u000bဉ\u0007\fဉ\u0003", new java.lang.Object[]{"bitField0_", "id_", "image_", "imageMissingColor_", "title_", "subtitle_", "icon_", "childItems_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem.class, "childItemsHeader_", "actionOverride_", "onSubmitOverride_", "secondarySubtitle_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem.class) {
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

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction getActionOverride() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction common$LocalAction = this.actionOverride_;
        return common$LocalAction == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.getDefaultInstance() : common$LocalAction;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem getChildItems(int i) {
        return this.childItems_.get(i);
    }

    public final int getChildItemsCount() {
        return this.childItems_.size();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ChildItemsHeader getChildItemsHeader() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ChildItemsHeader common$ChildItemsHeader = this.childItemsHeader_;
        return common$ChildItemsHeader == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ChildItemsHeader.getDefaultInstance() : common$ChildItemsHeader;
    }

    public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem> getChildItemsList() {
        return this.childItems_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.A getChildItemsOrBuilder(int i) {
        return this.childItems_.get(i);
    }

    public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.A> getChildItemsOrBuilderList() {
        return this.childItems_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance getIcon() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.icon_;
        return common$RenderedAssetAppearance == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
    }

    public final java.lang.String getId() {
        return this.id_;
    }

    public final com.google.protobuf.ByteString getIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.id_);
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance getImage() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.image_;
        return common$RenderedAssetAppearance == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
    }

    public final java.lang.String getImageMissingColor() {
        return this.imageMissingColor_;
    }

    public final com.google.protobuf.ByteString getImageMissingColorBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.imageMissingColor_);
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent getOnSubmitOverride() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent = this.onSubmitOverride_;
        return common$SDKEvent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString getSecondarySubtitle() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString = this.secondarySubtitle_;
        return common$AttributedLocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getSubtitle() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.subtitle_;
        return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getTitle() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.title_;
        return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public final boolean hasActionOverride() {
        return (this.bitField0_ & 64) != 0;
    }

    public final boolean hasChildItemsHeader() {
        return (this.bitField0_ & 32) != 0;
    }

    public final boolean hasIcon() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean hasImage() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasOnSubmitOverride() {
        return (this.bitField0_ & 128) != 0;
    }

    public final boolean hasSecondarySubtitle() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean hasSubtitle() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean hasTitle() {
        return (this.bitField0_ & 2) != 0;
    }

    private void addChildItems(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem common$ListItem) {
        ensureChildItemsIsMutable();
        this.childItems_.add(common$ListItem);
    }

    private void mergeActionOverride(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction common$LocalAction) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction common$LocalAction2 = this.actionOverride_;
        if (common$LocalAction2 == null || common$LocalAction2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.getDefaultInstance()) {
            this.actionOverride_ = common$LocalAction;
        } else {
            this.actionOverride_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.newBuilder(this.actionOverride_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.b) common$LocalAction).buildPartial();
        }
        this.bitField0_ |= 64;
    }

    private void mergeChildItemsHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ChildItemsHeader common$ChildItemsHeader) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ChildItemsHeader common$ChildItemsHeader2 = this.childItemsHeader_;
        if (common$ChildItemsHeader2 == null || common$ChildItemsHeader2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ChildItemsHeader.getDefaultInstance()) {
            this.childItemsHeader_ = common$ChildItemsHeader;
        } else {
            this.childItemsHeader_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ChildItemsHeader.newBuilder(this.childItemsHeader_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ChildItemsHeader.a) common$ChildItemsHeader).buildPartial();
        }
        this.bitField0_ |= 32;
    }

    private void mergeIcon(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.icon_;
        if (common$RenderedAssetAppearance2 == null || common$RenderedAssetAppearance2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance()) {
            this.icon_ = common$RenderedAssetAppearance;
        } else {
            this.icon_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.newBuilder(this.icon_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.a) common$RenderedAssetAppearance).buildPartial();
        }
        this.bitField0_ |= 16;
    }

    private void mergeImage(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.image_;
        if (common$RenderedAssetAppearance2 == null || common$RenderedAssetAppearance2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance()) {
            this.image_ = common$RenderedAssetAppearance;
        } else {
            this.image_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.newBuilder(this.image_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.a) common$RenderedAssetAppearance).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    private void mergeOnSubmitOverride(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent2 = this.onSubmitOverride_;
        if (common$SDKEvent2 == null || common$SDKEvent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.getDefaultInstance()) {
            this.onSubmitOverride_ = common$SDKEvent;
        } else {
            this.onSubmitOverride_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.newBuilder(this.onSubmitOverride_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.a) common$SDKEvent).buildPartial();
        }
        this.bitField0_ |= 128;
    }

    private void mergeSecondarySubtitle(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.secondarySubtitle_;
        if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance()) {
            this.secondarySubtitle_ = common$AttributedLocalizedString;
        } else {
            this.secondarySubtitle_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.newBuilder(this.secondarySubtitle_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c) common$AttributedLocalizedString).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    private void mergeSubtitle(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.subtitle_;
        if (common$LocalizedString2 == null || common$LocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
            this.subtitle_ = common$LocalizedString;
        } else {
            this.subtitle_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.subtitle_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    private void mergeTitle(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.title_;
        if (common$LocalizedString2 == null || common$LocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
            this.title_ = common$LocalizedString;
        } else {
            this.title_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.title_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem common$ListItem) {
        return DEFAULT_INSTANCE.createBuilder(common$ListItem);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setActionOverride(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction common$LocalAction) {
        this.actionOverride_ = common$LocalAction;
        this.bitField0_ |= 64;
    }

    private void setChildItems(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem common$ListItem) {
        ensureChildItemsIsMutable();
        this.childItems_.set(i, common$ListItem);
    }

    private void setChildItemsHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ChildItemsHeader common$ChildItemsHeader) {
        this.childItemsHeader_ = common$ChildItemsHeader;
        this.bitField0_ |= 32;
    }

    private void setIcon(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        this.icon_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 16;
    }

    private void setImage(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        this.image_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 1;
    }

    private void setOnSubmitOverride(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
        this.onSubmitOverride_ = common$SDKEvent;
        this.bitField0_ |= 128;
    }

    private void setSecondarySubtitle(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
        this.secondarySubtitle_ = common$AttributedLocalizedString;
        this.bitField0_ |= 8;
    }

    private void setSubtitle(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        this.subtitle_ = common$LocalizedString;
        this.bitField0_ |= 4;
    }

    private void setTitle(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        this.title_ = common$LocalizedString;
        this.bitField0_ |= 2;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setId(java.lang.String str) {
        this.id_ = str;
    }

    private void setImageMissingColor(java.lang.String str) {
        this.imageMissingColor_ = str;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    private void addChildItems(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem common$ListItem) {
        ensureChildItemsIsMutable();
        this.childItems_.add(i, common$ListItem);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
