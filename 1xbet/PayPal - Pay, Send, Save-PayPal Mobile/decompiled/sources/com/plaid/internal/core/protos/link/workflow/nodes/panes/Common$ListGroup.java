package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$ListGroup extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup DEFAULT_INSTANCE;
    public static final int HEADER_COMPONENTS_FIELD_NUMBER = 1;
    public static final int LIST_ITEMS_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup> PARSER;
    private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent> headerComponents_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent> listItems_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

    private void addHeaderComponents(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent common$FlexibleComponent) {
        ensureHeaderComponentsIsMutable();
        this.headerComponents_.add(i, common$FlexibleComponent);
    }

    private void addListItems(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent common$FlexibleComponent) {
        ensureListItemsIsMutable();
        this.listItems_.add(i, common$FlexibleComponent);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addHeaderComponents(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent common$FlexibleComponent) {
        ensureHeaderComponentsIsMutable();
        this.headerComponents_.add(common$FlexibleComponent);
    }

    private void addListItems(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent common$FlexibleComponent) {
        ensureListItemsIsMutable();
        this.listItems_.add(common$FlexibleComponent);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup common$ListGroup) {
        return DEFAULT_INSTANCE.createBuilder(common$ListGroup);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.InterfaceC0496w> getListItemsOrBuilderList() {
        return this.listItems_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.InterfaceC0496w getListItemsOrBuilder(int i) {
        return this.listItems_.get(i);
    }

    public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent> getListItemsList() {
        return this.listItems_;
    }

    public final int getListItemsCount() {
        return this.listItems_.size();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent getListItems(int i) {
        return this.listItems_.get(i);
    }

    public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.InterfaceC0496w> getHeaderComponentsOrBuilderList() {
        return this.headerComponents_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.InterfaceC0496w getHeaderComponentsOrBuilder(int i) {
        return this.headerComponents_.get(i);
    }

    public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent> getHeaderComponentsList() {
        return this.headerComponents_;
    }

    public final int getHeaderComponentsCount() {
        return this.headerComponents_.size();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent getHeaderComponents(int i) {
        return this.headerComponents_.get(i);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new java.lang.Object[]{"headerComponents_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.class, "listItems_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup.class) {
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

    private void setListItems(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent common$FlexibleComponent) {
        ensureListItemsIsMutable();
        this.listItems_.set(i, common$FlexibleComponent);
    }

    private void setHeaderComponents(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent common$FlexibleComponent) {
        ensureHeaderComponentsIsMutable();
        this.headerComponents_.set(i, common$FlexibleComponent);
    }

    private void removeListItems(int i) {
        ensureListItemsIsMutable();
        this.listItems_.remove(i);
    }

    private void removeHeaderComponents(int i) {
        ensureHeaderComponentsIsMutable();
        this.headerComponents_.remove(i);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void ensureListItemsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent> protobufList = this.listItems_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.listItems_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureHeaderComponentsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent> protobufList = this.headerComponents_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.headerComponents_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void clearListItems() {
        this.listItems_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    private void clearHeaderComponents() {
        this.headerComponents_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    private void addAllListItems(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent> iterable) {
        ensureListItemsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.listItems_);
    }

    private void addAllHeaderComponents(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent> iterable) {
        ensureHeaderComponentsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.headerComponents_);
    }

    private Common$ListGroup() {
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup common$ListGroup = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup();
        DEFAULT_INSTANCE = common$ListGroup;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup.class, common$ListGroup);
    }
}
