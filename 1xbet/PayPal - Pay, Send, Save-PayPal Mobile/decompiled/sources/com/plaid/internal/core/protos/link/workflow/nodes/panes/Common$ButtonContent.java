package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$ButtonContent extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int ACTION_OVERRIDE_FIELD_NUMBER = 6;
    public static final int CLIENT_CUSTOMIZATIONS_FIELD_NUMBER = 10;
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent DEFAULT_INSTANCE;
    public static final int DISABLE_FOR_FIELD_NUMBER = 11;
    public static final int ICON_FIELD_NUMBER = 5;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent> PARSER = null;
    public static final int SECONDARY_TEXT_FIELD_NUMBER = 4;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_ALIGNMENT_IS_LEADING_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int TRAILING_ICON_FIELD_NUMBER = 9;
    public static final int WEIGHT_FIELD_NUMBER = 8;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction actionOverride_;
    private int bitField0_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations clientCustomizations_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor disableFor_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance icon_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString secondaryText_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString subtitle_;
    private boolean titleAlignmentIsLeading_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString title_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance trailingIcon_;
    private int weight_;

    public static final class ClientCustomizations extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int BORDER_RADIUS_FIELD_NUMBER = 2;
        public static final int COLOR_DARK_APPEARANCE_FIELD_NUMBER = 12;
        public static final int COLOR_FIELD_NUMBER = 1;
        public static final int COLOR_HOVER_DARK_APPEARANCE_FIELD_NUMBER = 13;
        public static final int COLOR_HOVER_FIELD_NUMBER = 3;
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations DEFAULT_INSTANCE;
        public static final int FONT_WEIGHT_FIELD_NUMBER = 5;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations> PARSER = null;
        public static final int TEXT_COLOR_DARK_APPEARANCE_FIELD_NUMBER = 14;
        public static final int TEXT_COLOR_FIELD_NUMBER = 4;
        public static final int TEXT_FONT_WEIGHT_FIELD_NUMBER = 6;
        private int bitField0_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius borderRadius_;
        private int fontWeight_;
        private int textFontWeight_;
        private java.lang.String color_ = "";
        private java.lang.String colorDarkAppearance_ = "";
        private java.lang.String colorHover_ = "";
        private java.lang.String colorHoverDarkAppearance_ = "";
        private java.lang.String textColor_ = "";
        private java.lang.String textColorDarkAppearance_ = "";

        public static final class BorderRadius extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius> PARSER = null;
            public static final int SIZE_FIELD_NUMBER = 1;
            private int size_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius borderRadius = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius();
                DEFAULT_INSTANCE = borderRadius;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius.class, borderRadius);
            }

            private BorderRadius() {
            }

            private void clearSize() {
                this.size_ = 0;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setSize(int i) {
                this.size_ = i;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new java.lang.Object[]{"size_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius.class) {
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

            public final int getSize() {
                return this.size_;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius borderRadius) {
                return DEFAULT_INSTANCE.createBuilder(borderRadius);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations.DEFAULT_INSTANCE);
            }
        }

        public enum b implements com.google.protobuf.Internal.EnumLite {
            FONT_WEIGHT_UNKNOWN(0),
            FONT_WEIGHT_NORMAL(1),
            FONT_WEIGHT_BOLD(2),
            FONT_WEIGHT_MEDIUM(3),
            FONT_WEIGHT_SEMI_BOLD(4),
            FONT_WEIGHT_EXTRA_BOLD(5),
            UNRECOGNIZED(-1);

            public static final int FONT_WEIGHT_BOLD_VALUE = 2;
            public static final int FONT_WEIGHT_EXTRA_BOLD_VALUE = 5;
            public static final int FONT_WEIGHT_MEDIUM_VALUE = 3;
            public static final int FONT_WEIGHT_NORMAL_VALUE = 1;
            public static final int FONT_WEIGHT_SEMI_BOLD_VALUE = 4;
            public static final int FONT_WEIGHT_UNKNOWN_VALUE = 0;
            public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.b.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.b.a();

            /* renamed from: a, reason: collision with root package name */
            public final int f6127a;

            public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.b> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.b findValueByNumber(int i) {
                    return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.b.forNumber(i);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent$ClientCustomizations$b$b, reason: collision with other inner class name */
            public static final class C0175b implements com.google.protobuf.Internal.EnumVerifier {

                /* renamed from: a, reason: collision with root package name */
                public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.b.C0175b f6128a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.b.C0175b();

                @Override // com.google.protobuf.Internal.EnumVerifier
                public final boolean isInRange(int i) {
                    return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.b.forNumber(i) != null;
                }
            }

            b(int i) {
                this.f6127a = i;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.b forNumber(int i) {
                if (i == 0) {
                    return FONT_WEIGHT_UNKNOWN;
                }
                if (i == 1) {
                    return FONT_WEIGHT_NORMAL;
                }
                if (i == 2) {
                    return FONT_WEIGHT_BOLD;
                }
                if (i == 3) {
                    return FONT_WEIGHT_MEDIUM;
                }
                if (i == 4) {
                    return FONT_WEIGHT_SEMI_BOLD;
                }
                if (i != 5) {
                    return null;
                }
                return FONT_WEIGHT_EXTRA_BOLD;
            }

            public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.b> internalGetValueMap() {
                return b;
            }

            public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.b.C0175b.f6128a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f6127a;
                }
                throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.b valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations clientCustomizations = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations();
            DEFAULT_INSTANCE = clientCustomizations;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations.class, clientCustomizations);
        }

        private ClientCustomizations() {
        }

        private void clearBorderRadius() {
            this.borderRadius_ = null;
            this.bitField0_ &= -2;
        }

        private void clearColor() {
            this.color_ = getDefaultInstance().getColor();
        }

        private void clearColorDarkAppearance() {
            this.colorDarkAppearance_ = getDefaultInstance().getColorDarkAppearance();
        }

        private void clearColorHover() {
            this.colorHover_ = getDefaultInstance().getColorHover();
        }

        private void clearColorHoverDarkAppearance() {
            this.colorHoverDarkAppearance_ = getDefaultInstance().getColorHoverDarkAppearance();
        }

        private void clearFontWeight() {
            this.fontWeight_ = 0;
        }

        private void clearTextColor() {
            this.textColor_ = getDefaultInstance().getTextColor();
        }

        private void clearTextColorDarkAppearance() {
            this.textColorDarkAppearance_ = getDefaultInstance().getTextColorDarkAppearance();
        }

        private void clearTextFontWeight() {
            this.textFontWeight_ = 0;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setColorBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.color_ = byteString.toStringUtf8();
        }

        private void setColorDarkAppearanceBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.colorDarkAppearance_ = byteString.toStringUtf8();
        }

        private void setColorHoverBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.colorHover_ = byteString.toStringUtf8();
        }

        private void setColorHoverDarkAppearanceBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.colorHoverDarkAppearance_ = byteString.toStringUtf8();
        }

        private void setFontWeight(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.g gVar) {
            this.fontWeight_ = gVar.getNumber();
        }

        private void setFontWeightValue(int i) {
            this.fontWeight_ = i;
        }

        private void setTextColorBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.textColor_ = byteString.toStringUtf8();
        }

        private void setTextColorDarkAppearanceBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.textColorDarkAppearance_ = byteString.toStringUtf8();
        }

        private void setTextFontWeight(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.b bVar) {
            this.textFontWeight_ = bVar.getNumber();
        }

        private void setTextFontWeightValue(int i) {
            this.textFontWeight_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\u000e\t\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ\u0004Ȉ\u0005\f\u0006\f\fȈ\rȈ\u000eȈ", new java.lang.Object[]{"bitField0_", "color_", "borderRadius_", "colorHover_", "textColor_", "fontWeight_", "textFontWeight_", "colorDarkAppearance_", "colorHoverDarkAppearance_", "textColorDarkAppearance_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius getBorderRadius() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius borderRadius = this.borderRadius_;
            return borderRadius == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius.getDefaultInstance() : borderRadius;
        }

        public final java.lang.String getColor() {
            return this.color_;
        }

        public final com.google.protobuf.ByteString getColorBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.color_);
        }

        public final java.lang.String getColorDarkAppearance() {
            return this.colorDarkAppearance_;
        }

        public final com.google.protobuf.ByteString getColorDarkAppearanceBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.colorDarkAppearance_);
        }

        public final java.lang.String getColorHover() {
            return this.colorHover_;
        }

        public final com.google.protobuf.ByteString getColorHoverBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.colorHover_);
        }

        public final java.lang.String getColorHoverDarkAppearance() {
            return this.colorHoverDarkAppearance_;
        }

        public final com.google.protobuf.ByteString getColorHoverDarkAppearanceBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.colorHoverDarkAppearance_);
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.g getFontWeight() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.g forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.g.forNumber(this.fontWeight_);
            return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.g.UNRECOGNIZED : forNumber;
        }

        public final int getFontWeightValue() {
            return this.fontWeight_;
        }

        public final java.lang.String getTextColor() {
            return this.textColor_;
        }

        public final com.google.protobuf.ByteString getTextColorBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.textColor_);
        }

        public final java.lang.String getTextColorDarkAppearance() {
            return this.textColorDarkAppearance_;
        }

        public final com.google.protobuf.ByteString getTextColorDarkAppearanceBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.textColorDarkAppearance_);
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.b getTextFontWeight() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.b forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.b.forNumber(this.textFontWeight_);
            return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.b.UNRECOGNIZED : forNumber;
        }

        public final int getTextFontWeightValue() {
            return this.textFontWeight_;
        }

        public final boolean hasBorderRadius() {
            return (this.bitField0_ & 1) != 0;
        }

        private void mergeBorderRadius(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius borderRadius) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius borderRadius2 = this.borderRadius_;
            if (borderRadius2 == null || borderRadius2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius.getDefaultInstance()) {
                this.borderRadius_ = borderRadius;
            } else {
                this.borderRadius_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius.newBuilder(this.borderRadius_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius.a) borderRadius).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations clientCustomizations) {
            return DEFAULT_INSTANCE.createBuilder(clientCustomizations);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setBorderRadius(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.BorderRadius borderRadius) {
            this.borderRadius_ = borderRadius;
            this.bitField0_ |= 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setColor(java.lang.String str) {
            this.color_ = str;
        }

        private void setColorDarkAppearance(java.lang.String str) {
            this.colorDarkAppearance_ = str;
        }

        private void setColorHover(java.lang.String str) {
            this.colorHover_ = str;
        }

        private void setColorHoverDarkAppearance(java.lang.String str) {
            this.colorHoverDarkAppearance_ = str;
        }

        private void setTextColor(java.lang.String str) {
            this.textColor_ = str;
        }

        private void setTextColorDarkAppearance(java.lang.String str) {
            this.textColorDarkAppearance_ = str;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class DisableFor extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.DisableFor.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor> PARSER = null;
        public static final int SECONDS_FIELD_NUMBER = 1;
        public static final int SHOW_COUNTDOWN_TIMER_FIELD_NUMBER = 2;
        private int seconds_;
        private boolean showCountdownTimer_;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.DisableFor.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor disableFor = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor();
            DEFAULT_INSTANCE = disableFor;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor.class, disableFor);
        }

        private DisableFor() {
        }

        private void clearSeconds() {
            this.seconds_ = 0;
        }

        private void clearShowCountdownTimer() {
            this.showCountdownTimer_ = false;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.DisableFor.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setSeconds(int i) {
            this.seconds_ = i;
        }

        private void setShowCountdownTimer(boolean z) {
            this.showCountdownTimer_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.DisableFor.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u0007", new java.lang.Object[]{"seconds_", "showCountdownTimer_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor.class) {
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

        public final int getSeconds() {
            return this.seconds_;
        }

        public final boolean getShowCountdownTimer() {
            return this.showCountdownTimer_;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.DisableFor.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor disableFor) {
            return DEFAULT_INSTANCE.createBuilder(disableFor);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent();
        DEFAULT_INSTANCE = common$ButtonContent;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.class, common$ButtonContent);
    }

    private Common$ButtonContent() {
    }

    private void clearActionOverride() {
        this.actionOverride_ = null;
        this.bitField0_ &= -33;
    }

    private void clearClientCustomizations() {
        this.clientCustomizations_ = null;
        this.bitField0_ &= -65;
    }

    private void clearDisableFor() {
        this.disableFor_ = null;
        this.bitField0_ &= -129;
    }

    private void clearIcon() {
        this.icon_ = null;
        this.bitField0_ &= -9;
    }

    private void clearSecondaryText() {
        this.secondaryText_ = null;
        this.bitField0_ &= -5;
    }

    private void clearSubtitle() {
        this.subtitle_ = null;
        this.bitField0_ &= -3;
    }

    private void clearTitle() {
        this.title_ = null;
        this.bitField0_ &= -2;
    }

    private void clearTitleAlignmentIsLeading() {
        this.titleAlignmentIsLeading_ = false;
    }

    private void clearTrailingIcon() {
        this.trailingIcon_ = null;
        this.bitField0_ &= -17;
    }

    private void clearWeight() {
        this.weight_ = 0;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setTitleAlignmentIsLeading(boolean z) {
        this.titleAlignmentIsLeading_ = z;
    }

    private void setWeight(com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0491q enumC0491q) {
        this.weight_ = enumC0491q.getNumber();
    }

    private void setWeightValue(int i) {
        this.weight_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u0007\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0005\b\f\tဉ\u0004\nဉ\u0006\u000bဉ\u0007", new java.lang.Object[]{"bitField0_", "title_", "subtitle_", "titleAlignmentIsLeading_", "secondaryText_", "icon_", "actionOverride_", "weight_", "trailingIcon_", "clientCustomizations_", "disableFor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.class) {
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

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction getActionOverride() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction common$LocalAction = this.actionOverride_;
        return common$LocalAction == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.getDefaultInstance() : common$LocalAction;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations getClientCustomizations() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations clientCustomizations = this.clientCustomizations_;
        return clientCustomizations == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations.getDefaultInstance() : clientCustomizations;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor getDisableFor() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor disableFor = this.disableFor_;
        return disableFor == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor.getDefaultInstance() : disableFor;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance getIcon() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.icon_;
        return common$RenderedAssetAppearance == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getSecondaryText() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.secondaryText_;
        return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getSubtitle() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.subtitle_;
        return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getTitle() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.title_;
        return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public final boolean getTitleAlignmentIsLeading() {
        return this.titleAlignmentIsLeading_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance getTrailingIcon() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.trailingIcon_;
        return common$RenderedAssetAppearance == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0491q getWeight() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0491q forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0491q.forNumber(this.weight_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0491q.UNRECOGNIZED : forNumber;
    }

    public final int getWeightValue() {
        return this.weight_;
    }

    public final boolean hasActionOverride() {
        return (this.bitField0_ & 32) != 0;
    }

    public final boolean hasClientCustomizations() {
        return (this.bitField0_ & 64) != 0;
    }

    public final boolean hasDisableFor() {
        return (this.bitField0_ & 128) != 0;
    }

    public final boolean hasIcon() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean hasSecondaryText() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean hasSubtitle() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean hasTitle() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasTrailingIcon() {
        return (this.bitField0_ & 16) != 0;
    }

    private void mergeActionOverride(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction common$LocalAction) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction common$LocalAction2 = this.actionOverride_;
        if (common$LocalAction2 == null || common$LocalAction2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.getDefaultInstance()) {
            this.actionOverride_ = common$LocalAction;
        } else {
            this.actionOverride_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.newBuilder(this.actionOverride_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.b) common$LocalAction).buildPartial();
        }
        this.bitField0_ |= 32;
    }

    private void mergeClientCustomizations(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations clientCustomizations) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations clientCustomizations2 = this.clientCustomizations_;
        if (clientCustomizations2 == null || clientCustomizations2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations.getDefaultInstance()) {
            this.clientCustomizations_ = clientCustomizations;
        } else {
            this.clientCustomizations_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations.newBuilder(this.clientCustomizations_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.ClientCustomizations.a) clientCustomizations).buildPartial();
        }
        this.bitField0_ |= 64;
    }

    private void mergeDisableFor(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor disableFor) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor disableFor2 = this.disableFor_;
        if (disableFor2 == null || disableFor2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor.getDefaultInstance()) {
            this.disableFor_ = disableFor;
        } else {
            this.disableFor_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor.newBuilder(this.disableFor_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ButtonContent.DisableFor.a) disableFor).buildPartial();
        }
        this.bitField0_ |= 128;
    }

    private void mergeIcon(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.icon_;
        if (common$RenderedAssetAppearance2 == null || common$RenderedAssetAppearance2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance()) {
            this.icon_ = common$RenderedAssetAppearance;
        } else {
            this.icon_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.newBuilder(this.icon_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.a) common$RenderedAssetAppearance).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    private void mergeSecondaryText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.secondaryText_;
        if (common$LocalizedString2 == null || common$LocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
            this.secondaryText_ = common$LocalizedString;
        } else {
            this.secondaryText_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.secondaryText_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
        }
        this.bitField0_ |= 4;
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

    private void mergeTrailingIcon(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.trailingIcon_;
        if (common$RenderedAssetAppearance2 == null || common$RenderedAssetAppearance2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance()) {
            this.trailingIcon_ = common$RenderedAssetAppearance;
        } else {
            this.trailingIcon_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.newBuilder(this.trailingIcon_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.a) common$RenderedAssetAppearance).buildPartial();
        }
        this.bitField0_ |= 16;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
        return DEFAULT_INSTANCE.createBuilder(common$ButtonContent);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setActionOverride(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction common$LocalAction) {
        this.actionOverride_ = common$LocalAction;
        this.bitField0_ |= 32;
    }

    private void setClientCustomizations(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.ClientCustomizations clientCustomizations) {
        this.clientCustomizations_ = clientCustomizations;
        this.bitField0_ |= 64;
    }

    private void setDisableFor(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.DisableFor disableFor) {
        this.disableFor_ = disableFor;
        this.bitField0_ |= 128;
    }

    private void setIcon(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        this.icon_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 8;
    }

    private void setSecondaryText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        this.secondaryText_ = common$LocalizedString;
        this.bitField0_ |= 4;
    }

    private void setSubtitle(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        this.subtitle_ = common$LocalizedString;
        this.bitField0_ |= 2;
    }

    private void setTitle(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        this.title_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    private void setTrailingIcon(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        this.trailingIcon_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 16;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
