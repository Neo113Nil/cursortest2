package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$PaneHeader extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int COBRANDED_HEADER_ASSET_FIELD_NUMBER = 13;
    public static final int CONTENT_JUSTIFY_FIELD_NUMBER = 12;
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader DEFAULT_INSTANCE;
    public static final int HEADER_STYLE_FIELD_NUMBER = 14;
    public static final int ICON_MISSING_COLOR_FIELD_NUMBER = 4;
    public static final int ILLUSTRATION_FIELD_NUMBER = 7;
    public static final int IS_SCROLLABLE_FIELD_NUMBER = 9;
    public static final int LOGO_FIELD_NUMBER = 3;
    public static final int PADDING_BOTTOM_FIELD_NUMBER = 11;
    public static final int PADDING_TOP_FIELD_NUMBER = 10;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader> PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int TRAILING_ICON_ACTION_FIELD_NUMBER = 6;
    public static final int TRAILING_ICON_FIELD_NUMBER = 5;
    private int bitField0_;
    private int contentJustify_;
    private int headerStyle_;
    private int iconCase_ = 0;
    private java.lang.String iconMissingColor_ = "";
    private java.lang.Object icon_;
    private boolean isScrollable_;
    private float paddingBottom_;
    private float paddingTop_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString subtitle_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString title_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction trailingIconAction_;
    private int trailingIcon_;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.DEFAULT_INSTANCE);
        }
    }

    public enum b implements com.google.protobuf.Internal.EnumLite {
        HEADER_STYLE_UNKNOWN(0),
        HEADER_STYLE_CONSENT(1),
        HEADER_STYLE_THREADS(2),
        UNRECOGNIZED(-1);

        public static final int HEADER_STYLE_CONSENT_VALUE = 1;
        public static final int HEADER_STYLE_THREADS_VALUE = 2;
        public static final int HEADER_STYLE_UNKNOWN_VALUE = 0;
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.PaneHeader.b.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.PaneHeader.b.a();

        /* renamed from: a, reason: collision with root package name */
        public final int f6143a;

        public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.b> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.b findValueByNumber(int i) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.b.forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader$b$b, reason: collision with other inner class name */
        public static final class C0180b implements com.google.protobuf.Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.b.C0180b f6144a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.b.C0180b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.b.forNumber(i) != null;
            }
        }

        b(int i) {
            this.f6143a = i;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.b forNumber(int i) {
            if (i == 0) {
                return HEADER_STYLE_UNKNOWN;
            }
            if (i == 1) {
                return HEADER_STYLE_CONSENT;
            }
            if (i != 2) {
                return null;
            }
            return HEADER_STYLE_THREADS;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.b> internalGetValueMap() {
            return b;
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.b.C0180b.f6144a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f6143a;
            }
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.b valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum c {
        LOGO(3),
        ILLUSTRATION(7),
        COBRANDED_HEADER_ASSET(13),
        ICON_NOT_SET(0);


        /* renamed from: a, reason: collision with root package name */
        public final int f6145a;

        c(int i) {
            this.f6145a = i;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.c forNumber(int i) {
            if (i == 0) {
                return ICON_NOT_SET;
            }
            if (i == 3) {
                return LOGO;
            }
            if (i == 7) {
                return ILLUSTRATION;
            }
            if (i != 13) {
                return null;
            }
            return COBRANDED_HEADER_ASSET;
        }

        public final int getNumber() {
            return this.f6145a;
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.c valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader common$PaneHeader = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader();
        DEFAULT_INSTANCE = common$PaneHeader;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.class, common$PaneHeader);
    }

    private Common$PaneHeader() {
    }

    private void clearCobrandedHeaderAsset() {
        if (this.iconCase_ == 13) {
            this.iconCase_ = 0;
            this.icon_ = null;
        }
    }

    private void clearContentJustify() {
        this.contentJustify_ = 0;
    }

    private void clearHeaderStyle() {
        this.headerStyle_ = 0;
    }

    private void clearIcon() {
        this.iconCase_ = 0;
        this.icon_ = null;
    }

    private void clearIconMissingColor() {
        this.iconMissingColor_ = getDefaultInstance().getIconMissingColor();
    }

    private void clearIllustration() {
        if (this.iconCase_ == 7) {
            this.iconCase_ = 0;
            this.icon_ = null;
        }
    }

    private void clearIsScrollable() {
        this.isScrollable_ = false;
    }

    private void clearLogo() {
        if (this.iconCase_ == 3) {
            this.iconCase_ = 0;
            this.icon_ = null;
        }
    }

    private void clearPaddingBottom() {
        this.paddingBottom_ = 0.0f;
    }

    private void clearPaddingTop() {
        this.paddingTop_ = 0.0f;
    }

    private void clearSubtitle() {
        this.subtitle_ = null;
        this.bitField0_ &= -3;
    }

    private void clearTitle() {
        this.title_ = null;
        this.bitField0_ &= -2;
    }

    private void clearTrailingIcon() {
        this.trailingIcon_ = 0;
    }

    private void clearTrailingIconAction() {
        this.trailingIconAction_ = null;
        this.bitField0_ &= -5;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setContentJustify(com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0492s enumC0492s) {
        this.contentJustify_ = enumC0492s.getNumber();
    }

    private void setContentJustifyValue(int i) {
        this.contentJustify_ = i;
    }

    private void setHeaderStyle(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.b bVar) {
        this.headerStyle_ = bVar.getNumber();
    }

    private void setHeaderStyleValue(int i) {
        this.headerStyle_ = i;
    }

    private void setIconMissingColorBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.iconMissingColor_ = byteString.toStringUtf8();
    }

    private void setIllustration(com.plaid.internal.EnumC0527g enumC0527g) {
        this.icon_ = java.lang.Integer.valueOf(enumC0527g.getNumber());
        this.iconCase_ = 7;
    }

    private void setIllustrationValue(int i) {
        this.iconCase_ = 7;
        this.icon_ = java.lang.Integer.valueOf(i);
    }

    private void setIsScrollable(boolean z) {
        this.isScrollable_ = z;
    }

    private void setPaddingBottom(float f) {
        this.paddingBottom_ = f;
    }

    private void setPaddingTop(float f) {
        this.paddingTop_ = f;
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
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0001\u0001\u0001\u000e\r\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003<\u0000\u0004Ȉ\u0005\f\u0006ဉ\u0002\u0007?\u0000\t\u0007\n\u0001\u000b\u0001\f\f\r<\u0000\u000e\f", new java.lang.Object[]{"icon_", "iconCase_", "bitField0_", "title_", "subtitle_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.class, "iconMissingColor_", "trailingIcon_", "trailingIconAction_", "isScrollable_", "paddingTop_", "paddingBottom_", "contentJustify_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset.class, "headerStyle_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.class) {
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

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset getCobrandedHeaderAsset() {
        return this.iconCase_ == 13 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset) this.icon_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0492s getContentJustify() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0492s forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0492s.forNumber(this.contentJustify_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0492s.UNRECOGNIZED : forNumber;
    }

    public final int getContentJustifyValue() {
        return this.contentJustify_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.b getHeaderStyle() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.b forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.b.forNumber(this.headerStyle_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.b.UNRECOGNIZED : forNumber;
    }

    public final int getHeaderStyleValue() {
        return this.headerStyle_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.c getIconCase() {
        return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.c.forNumber(this.iconCase_);
    }

    public final java.lang.String getIconMissingColor() {
        return this.iconMissingColor_;
    }

    public final com.google.protobuf.ByteString getIconMissingColorBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.iconMissingColor_);
    }

    public final com.plaid.internal.EnumC0527g getIllustration() {
        if (this.iconCase_ != 7) {
            return com.plaid.internal.EnumC0527g.SDK_ASSET_UNKNOWN;
        }
        com.plaid.internal.EnumC0527g forNumber = com.plaid.internal.EnumC0527g.forNumber(((java.lang.Integer) this.icon_).intValue());
        return forNumber == null ? com.plaid.internal.EnumC0527g.UNRECOGNIZED : forNumber;
    }

    public final int getIllustrationValue() {
        if (this.iconCase_ == 7) {
            return ((java.lang.Integer) this.icon_).intValue();
        }
        return 0;
    }

    public final boolean getIsScrollable() {
        return this.isScrollable_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance getLogo() {
        return this.iconCase_ == 3 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance) this.icon_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance();
    }

    public final float getPaddingBottom() {
        return this.paddingBottom_;
    }

    public final float getPaddingTop() {
        return this.paddingTop_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getSubtitle() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.subtitle_;
        return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getTitle() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.title_;
        return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public final com.plaid.internal.EnumC0527g getTrailingIcon() {
        com.plaid.internal.EnumC0527g forNumber = com.plaid.internal.EnumC0527g.forNumber(this.trailingIcon_);
        return forNumber == null ? com.plaid.internal.EnumC0527g.UNRECOGNIZED : forNumber;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction getTrailingIconAction() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction common$LocalAction = this.trailingIconAction_;
        return common$LocalAction == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.getDefaultInstance() : common$LocalAction;
    }

    public final int getTrailingIconValue() {
        return this.trailingIcon_;
    }

    public final boolean hasCobrandedHeaderAsset() {
        return this.iconCase_ == 13;
    }

    public final boolean hasIllustration() {
        return this.iconCase_ == 7;
    }

    public final boolean hasLogo() {
        return this.iconCase_ == 3;
    }

    public final boolean hasSubtitle() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean hasTitle() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasTrailingIconAction() {
        return (this.bitField0_ & 4) != 0;
    }

    private void mergeCobrandedHeaderAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset common$CobrandedHeaderAsset) {
        if (this.iconCase_ != 13 || this.icon_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset.getDefaultInstance()) {
            this.icon_ = common$CobrandedHeaderAsset;
        } else {
            this.icon_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset) this.icon_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset.a) common$CobrandedHeaderAsset).buildPartial();
        }
        this.iconCase_ = 13;
    }

    private void mergeLogo(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        if (this.iconCase_ != 3 || this.icon_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance()) {
            this.icon_ = common$RenderedAssetAppearance;
        } else {
            this.icon_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance) this.icon_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.a) common$RenderedAssetAppearance).buildPartial();
        }
        this.iconCase_ = 3;
    }

    private void mergeSubtitle(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.subtitle_;
        if (common$LocalizedString2 == null || common$LocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
            this.subtitle_ = common$LocalizedString;
        } else {
            this.subtitle_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.subtitle_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
        }
        this.bitField0_ |= 2;
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

    private void mergeTrailingIconAction(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction common$LocalAction) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction common$LocalAction2 = this.trailingIconAction_;
        if (common$LocalAction2 == null || common$LocalAction2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.getDefaultInstance()) {
            this.trailingIconAction_ = common$LocalAction;
        } else {
            this.trailingIconAction_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.newBuilder(this.trailingIconAction_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.b) common$LocalAction).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader common$PaneHeader) {
        return DEFAULT_INSTANCE.createBuilder(common$PaneHeader);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setCobrandedHeaderAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset common$CobrandedHeaderAsset) {
        this.icon_ = common$CobrandedHeaderAsset;
        this.iconCase_ = 13;
    }

    private void setLogo(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        this.icon_ = common$RenderedAssetAppearance;
        this.iconCase_ = 3;
    }

    private void setSubtitle(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        this.subtitle_ = common$LocalizedString;
        this.bitField0_ |= 2;
    }

    private void setTitle(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        this.title_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    private void setTrailingIconAction(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction common$LocalAction) {
        this.trailingIconAction_ = common$LocalAction;
        this.bitField0_ |= 4;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setIconMissingColor(java.lang.String str) {
        this.iconMissingColor_ = str;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
