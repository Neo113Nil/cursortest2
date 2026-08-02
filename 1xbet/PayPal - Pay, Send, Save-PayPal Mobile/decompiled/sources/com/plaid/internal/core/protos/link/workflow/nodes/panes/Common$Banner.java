package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$Banner extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int APPEARANCE_FIELD_NUMBER = 7;
    public static final int BUTTON_ACTION_FIELD_NUMBER = 6;
    public static final int BUTTON_FIELD_NUMBER = 5;
    public static final int CONTENT_FIELD_NUMBER = 4;
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int appearance_;
    private int bitField0_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction buttonAction_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent button_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString content_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance icon_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString title_;
    private int type_;

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner common$Banner) {
        return DEFAULT_INSTANCE.createBuilder(common$Banner);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public final boolean hasTitle() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean hasIcon() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasContent() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean hasButtonAction() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean hasButton() {
        return (this.bitField0_ & 8) != 0;
    }

    public final int getTypeValue() {
        return this.type_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0489o getType() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0489o forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0489o.forNumber(this.type_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0489o.UNRECOGNIZED : forNumber;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getTitle() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.title_;
        return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance getIcon() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.icon_;
        return common$RenderedAssetAppearance == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getContent() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.content_;
        return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction getButtonAction() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction common$LocalAction = this.buttonAction_;
        return common$LocalAction == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.getDefaultInstance() : common$LocalAction;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent getButton() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent = this.button_;
        return common$ButtonContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
    }

    public final int getAppearanceValue() {
        return this.appearance_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0488n getAppearance() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0488n forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0488n.forNumber(this.appearance_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0488n.UNRECOGNIZED : forNumber;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0004\u0007\f", new java.lang.Object[]{"bitField0_", "type_", "icon_", "title_", "content_", "button_", "buttonAction_", "appearance_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner.class) {
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

    private void setType(com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0489o enumC0489o) {
        this.type_ = enumC0489o.getNumber();
    }

    private void setTitle(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        this.title_ = common$LocalizedString;
        this.bitField0_ |= 2;
    }

    private void setIcon(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        this.icon_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 1;
    }

    private void setContent(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        this.content_ = common$LocalizedString;
        this.bitField0_ |= 4;
    }

    private void setButtonAction(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction common$LocalAction) {
        this.buttonAction_ = common$LocalAction;
        this.bitField0_ |= 16;
    }

    private void setButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
        this.button_ = common$ButtonContent;
        this.bitField0_ |= 8;
    }

    private void setAppearanceValue(int i) {
        this.appearance_ = i;
    }

    private void setAppearance(com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0488n enumC0488n) {
        this.appearance_ = enumC0488n.getNumber();
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void mergeTitle(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.title_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.title_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
        }
        this.title_ = common$LocalizedString;
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

    private void mergeContent(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.content_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.content_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
        }
        this.content_ = common$LocalizedString;
        this.bitField0_ |= 4;
    }

    private void mergeButtonAction(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction common$LocalAction) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction common$LocalAction2 = this.buttonAction_;
        if (common$LocalAction2 != null && common$LocalAction2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.getDefaultInstance()) {
            common$LocalAction = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.newBuilder(this.buttonAction_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.b) common$LocalAction).buildPartial();
        }
        this.buttonAction_ = common$LocalAction;
        this.bitField0_ |= 16;
    }

    private void mergeButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent2 = this.button_;
        if (common$ButtonContent2 != null && common$ButtonContent2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance()) {
            common$ButtonContent = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.newBuilder(this.button_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.a) common$ButtonContent).buildPartial();
        }
        this.button_ = common$ButtonContent;
        this.bitField0_ |= 8;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void clearType() {
        this.type_ = 0;
    }

    private void clearTitle() {
        this.title_ = null;
        this.bitField0_ &= -3;
    }

    private void clearIcon() {
        this.icon_ = null;
        this.bitField0_ &= -2;
    }

    private void clearContent() {
        this.content_ = null;
        this.bitField0_ &= -5;
    }

    private void clearButtonAction() {
        this.buttonAction_ = null;
        this.bitField0_ &= -17;
    }

    private void clearButton() {
        this.button_ = null;
        this.bitField0_ &= -9;
    }

    private void clearAppearance() {
        this.appearance_ = 0;
    }

    private Common$Banner() {
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner common$Banner = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner();
        DEFAULT_INSTANCE = common$Banner;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner.class, common$Banner);
    }
}
