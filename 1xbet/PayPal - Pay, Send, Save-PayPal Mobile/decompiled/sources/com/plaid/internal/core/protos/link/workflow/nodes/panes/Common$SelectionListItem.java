package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$SelectionListItem extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.P {
    public static final int CHILDREN_FIELD_NUMBER = 11;
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem DEFAULT_INSTANCE;
    public static final int DETAIL_FIELD_NUMBER = 4;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LEADING_ASSET_FIELD_NUMBER = 12;
    public static final int NOTE_FIELD_NUMBER = 7;
    public static final int ON_SUBMIT_FIELD_NUMBER = 10;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem> PARSER = null;
    public static final int PRESELECTED_FIELD_NUMBER = 5;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TRAILING_ASSET_FIELD_NUMBER = 13;
    public static final int TRAILING_ICON_FIELD_NUMBER = 6;
    private int bitField0_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString detail_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset leadingAsset_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note note_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent onSubmit_;
    private boolean preselected_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString subtitle_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString title_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset trailingAsset_;
    private int trailingIcon_;
    private java.lang.String id_ = "";
    private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem> children_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.P {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem common$SelectionListItem = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem();
        DEFAULT_INSTANCE = common$SelectionListItem;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem.class, common$SelectionListItem);
    }

    private Common$SelectionListItem() {
    }

    private void addAllChildren(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem> iterable) {
        ensureChildrenIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.children_);
    }

    private void clearChildren() {
        this.children_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    private void clearDetail() {
        this.detail_ = null;
        this.bitField0_ &= -9;
    }

    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    private void clearLeadingAsset() {
        this.leadingAsset_ = null;
        this.bitField0_ &= -33;
    }

    private void clearNote() {
        this.note_ = null;
        this.bitField0_ &= -3;
    }

    private void clearOnSubmit() {
        this.onSubmit_ = null;
        this.bitField0_ &= -17;
    }

    private void clearPreselected() {
        this.preselected_ = false;
    }

    private void clearSubtitle() {
        this.subtitle_ = null;
        this.bitField0_ &= -5;
    }

    private void clearTitle() {
        this.title_ = null;
        this.bitField0_ &= -2;
    }

    private void clearTrailingAsset() {
        this.trailingAsset_ = null;
        this.bitField0_ &= -65;
    }

    private void clearTrailingIcon() {
        this.trailingIcon_ = 0;
    }

    private void ensureChildrenIsMutable() {
        com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem> protobufList = this.children_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.children_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeChildren(int i) {
        ensureChildrenIsMutable();
        this.children_.remove(i);
    }

    private void setIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    private void setPreselected(boolean z) {
        this.preselected_ = z;
    }

    private void setTrailingIcon(com.plaid.internal.EnumC0527g enumC0527g) {
        this.trailingIcon_ = enumC0527g.getNumber();
    }

    private void setTrailingIconValue(int i) {
        this.trailingIcon_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\r\u000b\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u0007\u0006\f\u0007ဉ\u0001\nဉ\u0004\u000b\u001b\fဉ\u0005\rဉ\u0006", new java.lang.Object[]{"bitField0_", "id_", "title_", "subtitle_", "detail_", "preselected_", "trailingIcon_", "note_", "onSubmit_", "children_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem.class, "leadingAsset_", "trailingAsset_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem.class) {
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

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem getChildren(int i) {
        return this.children_.get(i);
    }

    public final int getChildrenCount() {
        return this.children_.size();
    }

    public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem> getChildrenList() {
        return this.children_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.P getChildrenOrBuilder(int i) {
        return this.children_.get(i);
    }

    public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.P> getChildrenOrBuilderList() {
        return this.children_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getDetail() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.detail_;
        return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public final java.lang.String getId() {
        return this.id_;
    }

    public final com.google.protobuf.ByteString getIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.id_);
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset getLeadingAsset() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset common$RenderedAsset = this.leadingAsset_;
        return common$RenderedAsset == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.getDefaultInstance() : common$RenderedAsset;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note getNote() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note common$Note = this.note_;
        return common$Note == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note.getDefaultInstance() : common$Note;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent getOnSubmit() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent = this.onSubmit_;
        return common$SDKEvent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
    }

    public final boolean getPreselected() {
        return this.preselected_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getSubtitle() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.subtitle_;
        return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getTitle() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.title_;
        return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset getTrailingAsset() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset common$RenderedAsset = this.trailingAsset_;
        return common$RenderedAsset == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.getDefaultInstance() : common$RenderedAsset;
    }

    public final com.plaid.internal.EnumC0527g getTrailingIcon() {
        com.plaid.internal.EnumC0527g forNumber = com.plaid.internal.EnumC0527g.forNumber(this.trailingIcon_);
        return forNumber == null ? com.plaid.internal.EnumC0527g.UNRECOGNIZED : forNumber;
    }

    public final int getTrailingIconValue() {
        return this.trailingIcon_;
    }

    public final boolean hasDetail() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean hasLeadingAsset() {
        return (this.bitField0_ & 32) != 0;
    }

    public final boolean hasNote() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean hasOnSubmit() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean hasSubtitle() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean hasTitle() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasTrailingAsset() {
        return (this.bitField0_ & 64) != 0;
    }

    private void addChildren(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem common$SelectionListItem) {
        ensureChildrenIsMutable();
        this.children_.add(common$SelectionListItem);
    }

    private void mergeDetail(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.detail_;
        if (common$LocalizedString2 == null || common$LocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
            this.detail_ = common$LocalizedString;
        } else {
            this.detail_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.detail_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    private void mergeLeadingAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset common$RenderedAsset) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset common$RenderedAsset2 = this.leadingAsset_;
        if (common$RenderedAsset2 == null || common$RenderedAsset2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.getDefaultInstance()) {
            this.leadingAsset_ = common$RenderedAsset;
        } else {
            this.leadingAsset_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.newBuilder(this.leadingAsset_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.a) common$RenderedAsset).buildPartial();
        }
        this.bitField0_ |= 32;
    }

    private void mergeNote(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note common$Note) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note common$Note2 = this.note_;
        if (common$Note2 == null || common$Note2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note.getDefaultInstance()) {
            this.note_ = common$Note;
        } else {
            this.note_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note.newBuilder(this.note_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note.a) common$Note).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    private void mergeOnSubmit(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent2 = this.onSubmit_;
        if (common$SDKEvent2 == null || common$SDKEvent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.getDefaultInstance()) {
            this.onSubmit_ = common$SDKEvent;
        } else {
            this.onSubmit_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.newBuilder(this.onSubmit_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.a) common$SDKEvent).buildPartial();
        }
        this.bitField0_ |= 16;
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
        this.bitField0_ |= 1;
    }

    private void mergeTrailingAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset common$RenderedAsset) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset common$RenderedAsset2 = this.trailingAsset_;
        if (common$RenderedAsset2 == null || common$RenderedAsset2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.getDefaultInstance()) {
            this.trailingAsset_ = common$RenderedAsset;
        } else {
            this.trailingAsset_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.newBuilder(this.trailingAsset_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.a) common$RenderedAsset).buildPartial();
        }
        this.bitField0_ |= 64;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem common$SelectionListItem) {
        return DEFAULT_INSTANCE.createBuilder(common$SelectionListItem);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setChildren(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem common$SelectionListItem) {
        ensureChildrenIsMutable();
        this.children_.set(i, common$SelectionListItem);
    }

    private void setDetail(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        this.detail_ = common$LocalizedString;
        this.bitField0_ |= 8;
    }

    private void setLeadingAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset common$RenderedAsset) {
        this.leadingAsset_ = common$RenderedAsset;
        this.bitField0_ |= 32;
    }

    private void setNote(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note common$Note) {
        this.note_ = common$Note;
        this.bitField0_ |= 2;
    }

    private void setOnSubmit(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
        this.onSubmit_ = common$SDKEvent;
        this.bitField0_ |= 16;
    }

    private void setSubtitle(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        this.subtitle_ = common$LocalizedString;
        this.bitField0_ |= 4;
    }

    private void setTitle(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        this.title_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    private void setTrailingAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset common$RenderedAsset) {
        this.trailingAsset_ = common$RenderedAsset;
        this.bitField0_ |= 64;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setId(java.lang.String str) {
        this.id_ = str;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    private void addChildren(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem common$SelectionListItem) {
        ensureChildrenIsMutable();
        this.children_.add(i, common$SelectionListItem);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SelectionListItem) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
