package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$TabularListRow extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TabularListRow, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TabularListRow.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.T {
    public static final int BUTTON_FIELD_NUMBER = 3;
    public static final int BUTTON_MODAL_FIELD_NUMBER = 4;
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TabularListRow DEFAULT_INSTANCE;
    public static final int LABEL_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TabularListRow> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 2;
    private int bitField0_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal buttonModal_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent button_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString label_;
    private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString> values_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

    private void addValues(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
        ensureValuesIsMutable();
        this.values_.add(i, common$AttributedLocalizedString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TabularListRow.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TabularListRow parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TabularListRow) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TabularListRow parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TabularListRow) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addValues(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
        ensureValuesIsMutable();
        this.values_.add(common$AttributedLocalizedString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TabularListRow.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TabularListRow common$TabularListRow) {
        return DEFAULT_INSTANCE.createBuilder(common$TabularListRow);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TabularListRow parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TabularListRow) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TabularListRow parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TabularListRow) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TabularListRow parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TabularListRow) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TabularListRow parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TabularListRow) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TabularListRow parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TabularListRow) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TabularListRow parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TabularListRow) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TabularListRow parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TabularListRow) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TabularListRow parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TabularListRow) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TabularListRow parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TabularListRow) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TabularListRow parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TabularListRow) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public final boolean hasLabel() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasButtonModal() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean hasButton() {
        return (this.bitField0_ & 2) != 0;
    }

    public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.InterfaceC0486l> getValuesOrBuilderList() {
        return this.values_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.InterfaceC0486l getValuesOrBuilder(int i) {
        return this.values_.get(i);
    }

    public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString> getValuesList() {
        return this.values_;
    }

    public final int getValuesCount() {
        return this.values_.size();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString getValues(int i) {
        return this.values_.get(i);
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString getLabel() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString = this.label_;
        return common$AttributedLocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal getButtonModal() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal common$Modal = this.buttonModal_;
        return common$Modal == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.getDefaultInstance() : common$Modal;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent getButton() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent = this.button_;
        return common$ButtonContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TabularListRow();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TabularListRow.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဉ\u0002", new java.lang.Object[]{"bitField0_", "label_", "values_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.class, "button_", "buttonModal_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TabularListRow> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TabularListRow.class) {
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

    private void setValues(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
        ensureValuesIsMutable();
        this.values_.set(i, common$AttributedLocalizedString);
    }

    private void setLabel(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
        this.label_ = common$AttributedLocalizedString;
        this.bitField0_ |= 1;
    }

    private void setButtonModal(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal common$Modal) {
        this.buttonModal_ = common$Modal;
        this.bitField0_ |= 4;
    }

    private void setButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
        this.button_ = common$ButtonContent;
        this.bitField0_ |= 2;
    }

    private void removeValues(int i) {
        ensureValuesIsMutable();
        this.values_.remove(i);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TabularListRow> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void mergeLabel(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.label_;
        if (common$AttributedLocalizedString2 != null && common$AttributedLocalizedString2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance()) {
            common$AttributedLocalizedString = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.newBuilder(this.label_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c) common$AttributedLocalizedString).buildPartial();
        }
        this.label_ = common$AttributedLocalizedString;
        this.bitField0_ |= 1;
    }

    private void mergeButtonModal(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal common$Modal) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal common$Modal2 = this.buttonModal_;
        if (common$Modal2 != null && common$Modal2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.getDefaultInstance()) {
            common$Modal = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.newBuilder(this.buttonModal_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.a) common$Modal).buildPartial();
        }
        this.buttonModal_ = common$Modal;
        this.bitField0_ |= 4;
    }

    private void mergeButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent2 = this.button_;
        if (common$ButtonContent2 != null && common$ButtonContent2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance()) {
            common$ButtonContent = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.newBuilder(this.button_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.a) common$ButtonContent).buildPartial();
        }
        this.button_ = common$ButtonContent;
        this.bitField0_ |= 2;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TabularListRow getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void ensureValuesIsMutable() {
        com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString> protobufList = this.values_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.values_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void clearValues() {
        this.values_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    private void clearLabel() {
        this.label_ = null;
        this.bitField0_ &= -2;
    }

    private void clearButtonModal() {
        this.buttonModal_ = null;
        this.bitField0_ &= -5;
    }

    private void clearButton() {
        this.button_ = null;
        this.bitField0_ &= -3;
    }

    private void addAllValues(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString> iterable) {
        ensureValuesIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.values_);
    }

    private Common$TabularListRow() {
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TabularListRow, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TabularListRow.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.T {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TabularListRow.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TabularListRow common$TabularListRow = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TabularListRow();
        DEFAULT_INSTANCE = common$TabularListRow;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TabularListRow.class, common$TabularListRow);
    }
}
