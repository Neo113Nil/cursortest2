package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$CheckList extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int CONTAINER_STYLE_FIELD_NUMBER = 4;
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 3;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int ITEMS_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList> PARSER;
    private int bitField0_;
    private int containerStyle_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString header_;
    private java.lang.String id_ = "";
    private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem> items_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

    private void addItems(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem common$CheckListItem) {
        ensureItemsIsMutable();
        this.items_.add(i, common$CheckListItem);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addItems(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem common$CheckListItem) {
        ensureItemsIsMutable();
        this.items_.add(common$CheckListItem);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList common$CheckList) {
        return DEFAULT_INSTANCE.createBuilder(common$CheckList);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public final boolean hasHeader() {
        return (this.bitField0_ & 1) != 0;
    }

    public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.r> getItemsOrBuilderList() {
        return this.items_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.r getItemsOrBuilder(int i) {
        return this.items_.get(i);
    }

    public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem> getItemsList() {
        return this.items_;
    }

    public final int getItemsCount() {
        return this.items_.size();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem getItems(int i) {
        return this.items_.get(i);
    }

    public final com.google.protobuf.ByteString getIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.id_);
    }

    public final java.lang.String getId() {
        return this.id_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getHeader() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.header_;
        return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public final int getContainerStyleValue() {
        return this.containerStyle_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList.b getContainerStyle() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList.b forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList.b.forNumber(this.containerStyle_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList.b.UNRECOGNIZED : forNumber;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003ဉ\u0000\u0004\f", new java.lang.Object[]{"bitField0_", "id_", "items_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem.class, "header_", "containerStyle_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList.class) {
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

    private void setItems(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem common$CheckListItem) {
        ensureItemsIsMutable();
        this.items_.set(i, common$CheckListItem);
    }

    private void setIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    private void setId(java.lang.String str) {
        this.id_ = str;
    }

    private void setHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        this.header_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    private void setContainerStyleValue(int i) {
        this.containerStyle_ = i;
    }

    private void setContainerStyle(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList.b bVar) {
        this.containerStyle_ = bVar.getNumber();
    }

    private void removeItems(int i) {
        ensureItemsIsMutable();
        this.items_.remove(i);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void mergeHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.header_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.header_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
        }
        this.header_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void ensureItemsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem> protobufList = this.items_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.items_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void clearItems() {
        this.items_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    public enum b implements com.google.protobuf.Internal.EnumLite {
        CONTAINER_STYLE_UNKNOWN(0),
        CONTAINER_STYLE_BACKGROUND_CARD(1),
        CONTAINER_STYLE_TRANSPARENT(2),
        UNRECOGNIZED(-1);

        public static final int CONTAINER_STYLE_BACKGROUND_CARD_VALUE = 1;
        public static final int CONTAINER_STYLE_TRANSPARENT_VALUE = 2;
        public static final int CONTAINER_STYLE_UNKNOWN_VALUE = 0;
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.CheckList.b.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.CheckList.b.a();

        /* renamed from: a, reason: collision with root package name */
        public final int f6129a;

        public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList.b> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList.b findValueByNumber(int i) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList.b.forNumber(i);
            }
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList.b valueOf(int i) {
            return forNumber(i);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f6129a;
            }
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList$b$b, reason: collision with other inner class name */
        public static final class C0176b implements com.google.protobuf.Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList.b.C0176b f6130a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList.b.C0176b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList.b.forNumber(i) != null;
            }
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList.b.C0176b.f6130a;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList.b> internalGetValueMap() {
            return b;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList.b forNumber(int i) {
            if (i == 0) {
                return CONTAINER_STYLE_UNKNOWN;
            }
            if (i == 1) {
                return CONTAINER_STYLE_BACKGROUND_CARD;
            }
            if (i != 2) {
                return null;
            }
            return CONTAINER_STYLE_TRANSPARENT;
        }

        b(int i) {
            this.f6129a = i;
        }
    }

    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    private void clearHeader() {
        this.header_ = null;
        this.bitField0_ &= -2;
    }

    private void clearContainerStyle() {
        this.containerStyle_ = 0;
    }

    private void addAllItems(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckListItem> iterable) {
        ensureItemsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.items_);
    }

    private Common$CheckList() {
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList common$CheckList = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList();
        DEFAULT_INSTANCE = common$CheckList;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList.class, common$CheckList);
    }
}
