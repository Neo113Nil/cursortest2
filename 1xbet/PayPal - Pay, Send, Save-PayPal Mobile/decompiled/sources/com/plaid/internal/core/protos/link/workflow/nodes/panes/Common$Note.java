package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$Note extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note DEFAULT_INSTANCE;
    public static final int FIXED_WIDTH_FIELD_NUMBER = 3;
    public static final int ICON_FIELD_NUMBER = 6;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note> PARSER = null;
    public static final int SIZE_FIELD_NUMBER = 7;
    public static final int SMALL_SIZE_FIELD_NUMBER = 4;
    public static final int SOLID_FIELD_NUMBER = 5;
    public static final int TEXT_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean fixedWidth_;
    private int icon_;
    private int size_;
    private boolean smallSize_;
    private boolean solid_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString text_;
    private int type_;

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setIcon(com.plaid.internal.EnumC0527g enumC0527g) {
        this.icon_ = enumC0527g.getNumber();
    }

    public final com.plaid.internal.EnumC0527g getIcon() {
        com.plaid.internal.EnumC0527g forNumber = com.plaid.internal.EnumC0527g.forNumber(this.icon_);
        return forNumber == null ? com.plaid.internal.EnumC0527g.UNRECOGNIZED : forNumber;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note common$Note) {
        return DEFAULT_INSTANCE.createBuilder(common$Note);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public final boolean hasText() {
        return (this.bitField0_ & 1) != 0;
    }

    public final int getTypeValue() {
        return this.type_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.E getType() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.E forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.E.forNumber(this.type_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.E.UNRECOGNIZED : forNumber;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getText() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.text_;
        return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public final boolean getSolid() {
        return this.solid_;
    }

    public final boolean getSmallSize() {
        return this.smallSize_;
    }

    public final int getSizeValue() {
        return this.size_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.D getSize() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.D forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.D.forNumber(this.size_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.D.UNRECOGNIZED : forNumber;
    }

    public final int getIconValue() {
        return this.icon_;
    }

    public final boolean getFixedWidth() {
        return this.fixedWidth_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u0007\u0004\u0007\u0005\u0007\u0006\f\u0007\f", new java.lang.Object[]{"bitField0_", "text_", "type_", "fixedWidth_", "smallSize_", "solid_", "icon_", "size_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note.class) {
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

    private void setTypeValue(int i) {
        this.type_ = i;
    }

    private void setType(com.plaid.internal.core.protos.link.workflow.nodes.panes.E e) {
        this.type_ = e.getNumber();
    }

    private void setText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        this.text_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    private void setSolid(boolean z) {
        this.solid_ = z;
    }

    private void setSmallSize(boolean z) {
        this.smallSize_ = z;
    }

    private void setSizeValue(int i) {
        this.size_ = i;
    }

    private void setSize(com.plaid.internal.core.protos.link.workflow.nodes.panes.D d) {
        this.size_ = d.getNumber();
    }

    private void setIconValue(int i) {
        this.icon_ = i;
    }

    private void setFixedWidth(boolean z) {
        this.fixedWidth_ = z;
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void mergeText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.text_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.text_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
        }
        this.text_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void clearType() {
        this.type_ = 0;
    }

    private void clearText() {
        this.text_ = null;
        this.bitField0_ &= -2;
    }

    private void clearSolid() {
        this.solid_ = false;
    }

    private void clearSmallSize() {
        this.smallSize_ = false;
    }

    private void clearSize() {
        this.size_ = 0;
    }

    private void clearIcon() {
        this.icon_ = 0;
    }

    private void clearFixedWidth() {
        this.fixedWidth_ = false;
    }

    private Common$Note() {
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note common$Note = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note();
        DEFAULT_INSTANCE = common$Note;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note.class, common$Note);
    }
}
