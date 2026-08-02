package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$OrderedList extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int ITEMS_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList> PARSER;
    private java.lang.String id_ = "";
    private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedListItem> items_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

    private void addItems(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedListItem common$OrderedListItem) {
        ensureItemsIsMutable();
        this.items_.add(i, common$OrderedListItem);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addItems(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedListItem common$OrderedListItem) {
        ensureItemsIsMutable();
        this.items_.add(common$OrderedListItem);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList common$OrderedList) {
        return DEFAULT_INSTANCE.createBuilder(common$OrderedList);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.H> getItemsOrBuilderList() {
        return this.items_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.H getItemsOrBuilder(int i) {
        return this.items_.get(i);
    }

    public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedListItem> getItemsList() {
        return this.items_;
    }

    public final int getItemsCount() {
        return this.items_.size();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedListItem getItems(int i) {
        return this.items_.get(i);
    }

    public final com.google.protobuf.ByteString getIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.id_);
    }

    public final java.lang.String getId() {
        return this.id_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new java.lang.Object[]{"id_", "items_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedListItem.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList.class) {
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

    private void setItems(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedListItem common$OrderedListItem) {
        ensureItemsIsMutable();
        this.items_.set(i, common$OrderedListItem);
    }

    private void setIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    private void setId(java.lang.String str) {
        this.id_ = str;
    }

    private void removeItems(int i) {
        ensureItemsIsMutable();
        this.items_.remove(i);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void ensureItemsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedListItem> protobufList = this.items_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.items_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void clearItems() {
        this.items_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    private void addAllItems(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedListItem> iterable) {
        ensureItemsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.items_);
    }

    private Common$OrderedList() {
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList common$OrderedList = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList();
        DEFAULT_INSTANCE = common$OrderedList;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList.class, common$OrderedList);
    }
}
