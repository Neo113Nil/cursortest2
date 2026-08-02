package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$Table extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table DEFAULT_INSTANCE;
    public static final int FLEX_DIRECTION_FIELD_NUMBER = 5;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table> PARSER = null;
    public static final int TABLE_ROWS_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 2;
    private int bitField0_;
    private int flexDirection_;
    private java.lang.String id_ = "";
    private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TableRow> tableRows_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString title_;

    private void addTableRows(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TableRow common$TableRow) {
        ensureTableRowsIsMutable();
        this.tableRows_.add(i, common$TableRow);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addTableRows(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TableRow common$TableRow) {
        ensureTableRowsIsMutable();
        this.tableRows_.add(common$TableRow);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table common$Table) {
        return DEFAULT_INSTANCE.createBuilder(common$Table);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public final boolean hasTitle() {
        return (this.bitField0_ & 1) != 0;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getTitle() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.title_;
        return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Q> getTableRowsOrBuilderList() {
        return this.tableRows_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Q getTableRowsOrBuilder(int i) {
        return this.tableRows_.get(i);
    }

    public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TableRow> getTableRowsList() {
        return this.tableRows_;
    }

    public final int getTableRowsCount() {
        return this.tableRows_.size();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TableRow getTableRows(int i) {
        return this.tableRows_.get(i);
    }

    public final com.google.protobuf.ByteString getIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.id_);
    }

    public final java.lang.String getId() {
        return this.id_;
    }

    public final int getFlexDirectionValue() {
        return this.flexDirection_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0494u getFlexDirection() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0494u forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0494u.forNumber(this.flexDirection_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0494u.UNRECOGNIZED : forNumber;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0004\u001b\u0005\f", new java.lang.Object[]{"bitField0_", "id_", "title_", "tableRows_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TableRow.class, "flexDirection_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table.class) {
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

    private void setTitle(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        this.title_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    private void setTableRows(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TableRow common$TableRow) {
        ensureTableRowsIsMutable();
        this.tableRows_.set(i, common$TableRow);
    }

    private void setIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    private void setId(java.lang.String str) {
        this.id_ = str;
    }

    private void setFlexDirectionValue(int i) {
        this.flexDirection_ = i;
    }

    private void setFlexDirection(com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0494u enumC0494u) {
        this.flexDirection_ = enumC0494u.getNumber();
    }

    private void removeTableRows(int i) {
        ensureTableRowsIsMutable();
        this.tableRows_.remove(i);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void mergeTitle(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.title_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.title_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
        }
        this.title_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void ensureTableRowsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TableRow> protobufList = this.tableRows_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.tableRows_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void clearTitle() {
        this.title_ = null;
        this.bitField0_ &= -2;
    }

    private void clearTableRows() {
        this.tableRows_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    private void clearFlexDirection() {
        this.flexDirection_ = 0;
    }

    private void addAllTableRows(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TableRow> iterable) {
        ensureTableRowsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.tableRows_);
    }

    private Common$Table() {
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table common$Table = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table();
        DEFAULT_INSTANCE = common$Table;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table.class, common$Table);
    }
}
