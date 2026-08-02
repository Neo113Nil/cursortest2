package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$SearchInput extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int INITIAL_VALUE_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput> PARSER = null;
    public static final int PLACEHOLDER_FIELD_NUMBER = 3;
    public static final int STYLE_OVERRIDE_FIELD_NUMBER = 4;
    private int bitField0_;
    private java.lang.String id_ = "";
    private java.lang.String initialValue_ = "";
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString placeholder_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride styleOverride_;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput common$SearchInput = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput();
        DEFAULT_INSTANCE = common$SearchInput;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput.class, common$SearchInput);
    }

    private Common$SearchInput() {
    }

    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    private void clearInitialValue() {
        this.initialValue_ = getDefaultInstance().getInitialValue();
    }

    private void clearPlaceholder() {
        this.placeholder_ = null;
        this.bitField0_ &= -2;
    }

    private void clearStyleOverride() {
        this.styleOverride_ = null;
        this.bitField0_ &= -3;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    private void setInitialValueBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.initialValue_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004ဉ\u0001", new java.lang.Object[]{"bitField0_", "id_", "initialValue_", "placeholder_", "styleOverride_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput.class) {
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

    public final java.lang.String getInitialValue() {
        return this.initialValue_;
    }

    public final com.google.protobuf.ByteString getInitialValueBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.initialValue_);
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getPlaceholder() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.placeholder_;
        return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride getStyleOverride() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride common$SearchInputStyleOverride = this.styleOverride_;
        return common$SearchInputStyleOverride == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride.getDefaultInstance() : common$SearchInputStyleOverride;
    }

    public final boolean hasPlaceholder() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasStyleOverride() {
        return (this.bitField0_ & 2) != 0;
    }

    private void mergePlaceholder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.placeholder_;
        if (common$LocalizedString2 == null || common$LocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
            this.placeholder_ = common$LocalizedString;
        } else {
            this.placeholder_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.placeholder_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    private void mergeStyleOverride(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride common$SearchInputStyleOverride) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride common$SearchInputStyleOverride2 = this.styleOverride_;
        if (common$SearchInputStyleOverride2 == null || common$SearchInputStyleOverride2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride.getDefaultInstance()) {
            this.styleOverride_ = common$SearchInputStyleOverride;
        } else {
            this.styleOverride_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride.newBuilder(this.styleOverride_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride.a) common$SearchInputStyleOverride).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput common$SearchInput) {
        return DEFAULT_INSTANCE.createBuilder(common$SearchInput);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setPlaceholder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        this.placeholder_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    private void setStyleOverride(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride common$SearchInputStyleOverride) {
        this.styleOverride_ = common$SearchInputStyleOverride;
        this.bitField0_ |= 2;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setId(java.lang.String str) {
        this.id_ = str;
    }

    private void setInitialValue(java.lang.String str) {
        this.initialValue_ = str;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
