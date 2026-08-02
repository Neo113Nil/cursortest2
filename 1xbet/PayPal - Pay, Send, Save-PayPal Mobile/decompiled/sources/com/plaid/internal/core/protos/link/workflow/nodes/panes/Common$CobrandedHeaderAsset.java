package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$CobrandedHeaderAsset extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int CLIENT_BRAND_COLOR_FIELD_NUMBER = 1;
    public static final int CLIENT_LOGO_ASSET_FIELD_NUMBER = 2;
    public static final int CONTENT_JUSTIFY_FIELD_NUMBER = 4;
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset DEFAULT_INSTANCE;
    public static final int HAS_GLOW_ARC_FIELD_NUMBER = 5;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset> PARSER = null;
    public static final int PLAID_LOGO_ASSET_FIELD_NUMBER = 3;
    private int bitField0_;
    private java.lang.String clientBrandColor_ = "";
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance clientLogoAsset_;
    private int contentJustify_;
    private boolean hasGlowArc_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance plaidLogoAsset_;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset common$CobrandedHeaderAsset = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset();
        DEFAULT_INSTANCE = common$CobrandedHeaderAsset;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset.class, common$CobrandedHeaderAsset);
    }

    private Common$CobrandedHeaderAsset() {
    }

    private void clearClientBrandColor() {
        this.clientBrandColor_ = getDefaultInstance().getClientBrandColor();
    }

    private void clearClientLogoAsset() {
        this.clientLogoAsset_ = null;
        this.bitField0_ &= -2;
    }

    private void clearContentJustify() {
        this.contentJustify_ = 0;
    }

    private void clearHasGlowArc() {
        this.hasGlowArc_ = false;
    }

    private void clearPlaidLogoAsset() {
        this.plaidLogoAsset_ = null;
        this.bitField0_ &= -3;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setClientBrandColorBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.clientBrandColor_ = byteString.toStringUtf8();
    }

    private void setContentJustify(com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0492s enumC0492s) {
        this.contentJustify_ = enumC0492s.getNumber();
    }

    private void setContentJustifyValue(int i) {
        this.contentJustify_ = i;
    }

    private void setHasGlowArc(boolean z) {
        this.hasGlowArc_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004\f\u0005\u0007", new java.lang.Object[]{"bitField0_", "clientBrandColor_", "clientLogoAsset_", "plaidLogoAsset_", "contentJustify_", "hasGlowArc_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset.class) {
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

    public final java.lang.String getClientBrandColor() {
        return this.clientBrandColor_;
    }

    public final com.google.protobuf.ByteString getClientBrandColorBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.clientBrandColor_);
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance getClientLogoAsset() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.clientLogoAsset_;
        return common$RenderedAssetAppearance == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0492s getContentJustify() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0492s forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0492s.forNumber(this.contentJustify_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0492s.UNRECOGNIZED : forNumber;
    }

    public final int getContentJustifyValue() {
        return this.contentJustify_;
    }

    public final boolean getHasGlowArc() {
        return this.hasGlowArc_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance getPlaidLogoAsset() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.plaidLogoAsset_;
        return common$RenderedAssetAppearance == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
    }

    public final boolean hasClientLogoAsset() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasPlaidLogoAsset() {
        return (this.bitField0_ & 2) != 0;
    }

    private void mergeClientLogoAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.clientLogoAsset_;
        if (common$RenderedAssetAppearance2 == null || common$RenderedAssetAppearance2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance()) {
            this.clientLogoAsset_ = common$RenderedAssetAppearance;
        } else {
            this.clientLogoAsset_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.newBuilder(this.clientLogoAsset_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.a) common$RenderedAssetAppearance).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    private void mergePlaidLogoAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.plaidLogoAsset_;
        if (common$RenderedAssetAppearance2 == null || common$RenderedAssetAppearance2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance()) {
            this.plaidLogoAsset_ = common$RenderedAssetAppearance;
        } else {
            this.plaidLogoAsset_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.newBuilder(this.plaidLogoAsset_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.a) common$RenderedAssetAppearance).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset common$CobrandedHeaderAsset) {
        return DEFAULT_INSTANCE.createBuilder(common$CobrandedHeaderAsset);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setClientLogoAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        this.clientLogoAsset_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 1;
    }

    private void setPlaidLogoAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        this.plaidLogoAsset_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 2;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setClientBrandColor(java.lang.String str) {
        this.clientBrandColor_ = str;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
