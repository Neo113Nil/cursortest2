package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Pane$Navigation extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation, com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int BACK_BUTTON_TITLE_FIELD_NUMBER = 8;
    public static final int BACK_STACK_BEHAVIOR_FIELD_NUMBER = 3;
    public static final int BACK_VISIBLE_FIELD_NUMBER = 2;
    public static final int BADGE_FIELD_NUMBER = 9;
    public static final int BANNER_FIELD_NUMBER = 13;
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation DEFAULT_INSTANCE;
    public static final int DIVIDER_VISIBLE_FIELD_NUMBER = 16;
    public static final int EXIT_ACTION_OVERRIDE_FIELD_NUMBER = 17;
    public static final int EXIT_BUTTON_TITLE_FIELD_NUMBER = 7;
    public static final int EXIT_VISIBLE_FIELD_NUMBER = 1;
    public static final int FALLBACK_TRANSITION_FIELD_NUMBER = 14;
    public static final int FOOTER_FIELD_NUMBER = 15;
    public static final int LEADING_BADGE_FIELD_NUMBER = 11;
    public static final int LEADING_LOGO_APPEARANCE_FIELD_NUMBER = 10;
    public static final int LOGO_APPEARANCE_FIELD_NUMBER = 6;
    public static final int LOGO_FIELD_NUMBER = 5;
    public static final int NOTE_FIELD_NUMBER = 12;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation> PARSER = null;
    public static final int TRANSITION_FIELD_NUMBER = 4;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString backButtonTitle_;
    private int backStackBehavior_;
    private boolean backVisible_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner banner_;
    private int bitField0_;
    private java.lang.Object centerContent_;
    private boolean dividerVisible_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction exitActionOverride_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString exitButtonTitle_;
    private boolean exitVisible_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition fallbackTransition_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer footer_;
    private java.lang.Object leadingContent_;
    private int logo_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition transition_;
    private int centerContentCase_ = 0;
    private int leadingContentCase_ = 0;

    public static final class Badge extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge, com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Badge.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int ASSET_FIELD_NUMBER = 3;
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge DEFAULT_INSTANCE;
        public static final int LEADING_ASSET_FIELD_NUMBER = 2;
        public static final int PANE_BRANDING_FIELD_NUMBER = 4;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge> PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 1;
        private int bitField0_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance leadingAsset_;
        private int styleCase_ = 0;
        private java.lang.Object style_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString text_;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge, com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Badge.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge.DEFAULT_INSTANCE);
            }
        }

        public enum b {
            ASSET(3),
            PANE_BRANDING(4),
            STYLE_NOT_SET(0);


            /* renamed from: a, reason: collision with root package name */
            public final int f6225a;

            b(int i) {
                this.f6225a = i;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Badge.b forNumber(int i) {
                if (i == 0) {
                    return STYLE_NOT_SET;
                }
                if (i == 3) {
                    return ASSET;
                }
                if (i != 4) {
                    return null;
                }
                return PANE_BRANDING;
            }

            public final int getNumber() {
                return this.f6225a;
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Badge.b valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge badge = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge();
            DEFAULT_INSTANCE = badge;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge.class, badge);
        }

        private Badge() {
        }

        private void clearAsset() {
            if (this.styleCase_ == 3) {
                this.styleCase_ = 0;
                this.style_ = null;
            }
        }

        private void clearLeadingAsset() {
            this.leadingAsset_ = null;
            this.bitField0_ &= -3;
        }

        private void clearPaneBranding() {
            if (this.styleCase_ == 4) {
                this.styleCase_ = 0;
                this.style_ = null;
            }
        }

        private void clearStyle() {
            this.styleCase_ = 0;
            this.style_ = null;
        }

        private void clearText() {
            this.text_ = null;
            this.bitField0_ &= -2;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Badge.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setPaneBranding(com.plaid.internal.core.protos.link.workflow.nodes.panes.I i) {
            this.style_ = java.lang.Integer.valueOf(i.getNumber());
            this.styleCase_ = 4;
        }

        private void setPaneBrandingValue(int i) {
            this.styleCase_ = 4;
            this.style_ = java.lang.Integer.valueOf(i);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.m0.f6311a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Badge.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003<\u0000\u0004?\u0000", new java.lang.Object[]{"style_", "styleCase_", "bitField0_", "text_", "leadingAsset_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance getAsset() {
            return this.styleCase_ == 3 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance) this.style_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance getLeadingAsset() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.leadingAsset_;
            return common$RenderedAssetAppearance == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.I getPaneBranding() {
            if (this.styleCase_ != 4) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.I.PANE_BRANDING_UNKNOWN;
            }
            com.plaid.internal.core.protos.link.workflow.nodes.panes.I forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.I.forNumber(((java.lang.Integer) this.style_).intValue());
            return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.I.UNRECOGNIZED : forNumber;
        }

        public final int getPaneBrandingValue() {
            if (this.styleCase_ == 4) {
                return ((java.lang.Integer) this.style_).intValue();
            }
            return 0;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Badge.b getStyleCase() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Badge.b.forNumber(this.styleCase_);
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getText() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.text_;
            return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public final boolean hasAsset() {
            return this.styleCase_ == 3;
        }

        public final boolean hasLeadingAsset() {
            return (this.bitField0_ & 2) != 0;
        }

        public final boolean hasPaneBranding() {
            return this.styleCase_ == 4;
        }

        public final boolean hasText() {
            return (this.bitField0_ & 1) != 0;
        }

        private void mergeAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            if (this.styleCase_ != 3 || this.style_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance()) {
                this.style_ = common$RenderedAssetAppearance;
            } else {
                this.style_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance) this.style_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.a) common$RenderedAssetAppearance).buildPartial();
            }
            this.styleCase_ = 3;
        }

        private void mergeLeadingAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.leadingAsset_;
            if (common$RenderedAssetAppearance2 == null || common$RenderedAssetAppearance2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance()) {
                this.leadingAsset_ = common$RenderedAssetAppearance;
            } else {
                this.leadingAsset_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.newBuilder(this.leadingAsset_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.a) common$RenderedAssetAppearance).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        private void mergeText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.text_;
            if (common$LocalizedString2 == null || common$LocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
                this.text_ = common$LocalizedString;
            } else {
                this.text_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.text_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Badge.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge badge) {
            return DEFAULT_INSTANCE.createBuilder(badge);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            this.style_ = common$RenderedAssetAppearance;
            this.styleCase_ = 3;
        }

        private void setLeadingAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            this.leadingAsset_ = common$RenderedAssetAppearance;
            this.bitField0_ |= 2;
        }

        private void setText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
            this.text_ = common$LocalizedString;
            this.bitField0_ |= 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Footer extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer, com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Footer.b> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int BACKGROUND_CONTRAST_FIELD_NUMBER = 2;
        public static final int COMPONENTS_FIELD_NUMBER = 1;
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer DEFAULT_INSTANCE;
        public static final int FADE_TYPE_FIELD_NUMBER = 4;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer> PARSER = null;
        public static final int SPACING_FIELD_NUMBER = 3;
        private int backgroundContrast_;
        private int bitField0_;
        private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent> components_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
        private int fadeType_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing spacing_;

        public enum a implements com.google.protobuf.Internal.EnumLite {
            BACKGROUND_CONTRAST_UNKNOWN(0),
            BACKGROUND_CONTRAST_NONE(1),
            BACKGROUND_CONTRAST_MEDIUM(2),
            UNRECOGNIZED(-1);

            public static final int BACKGROUND_CONTRAST_MEDIUM_VALUE = 2;
            public static final int BACKGROUND_CONTRAST_NONE_VALUE = 1;
            public static final int BACKGROUND_CONTRAST_UNKNOWN_VALUE = 0;
            public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Footer.a.C0189a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Footer.a.C0189a();

            /* renamed from: a, reason: collision with root package name */
            public final int f6226a;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation$Footer$a$a, reason: collision with other inner class name */
            public final class C0189a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Footer.a> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Footer.a findValueByNumber(int i) {
                    return com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Footer.a.forNumber(i);
                }
            }

            public static final class b implements com.google.protobuf.Internal.EnumVerifier {

                /* renamed from: a, reason: collision with root package name */
                public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Footer.a.b f6227a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Footer.a.b();

                @Override // com.google.protobuf.Internal.EnumVerifier
                public final boolean isInRange(int i) {
                    return com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Footer.a.forNumber(i) != null;
                }
            }

            a(int i) {
                this.f6226a = i;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Footer.a forNumber(int i) {
                if (i == 0) {
                    return BACKGROUND_CONTRAST_UNKNOWN;
                }
                if (i == 1) {
                    return BACKGROUND_CONTRAST_NONE;
                }
                if (i != 2) {
                    return null;
                }
                return BACKGROUND_CONTRAST_MEDIUM;
            }

            public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Footer.a> internalGetValueMap() {
                return b;
            }

            public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Footer.a.b.f6227a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f6226a;
                }
                throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Footer.a valueOf(int i) {
                return forNumber(i);
            }
        }

        public static final class b extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer, com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Footer.b> implements com.google.protobuf.MessageLiteOrBuilder {
            public b() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer.DEFAULT_INSTANCE);
            }
        }

        public enum c implements com.google.protobuf.Internal.EnumLite {
            FADE_TYPE_UNKNOWN(0),
            FADE_TYPE_NONE(1),
            FADE_TYPE_DIVIDER(2),
            UNRECOGNIZED(-1);

            public static final int FADE_TYPE_DIVIDER_VALUE = 2;
            public static final int FADE_TYPE_NONE_VALUE = 1;
            public static final int FADE_TYPE_UNKNOWN_VALUE = 0;
            public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Footer.c.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Footer.c.a();

            /* renamed from: a, reason: collision with root package name */
            public final int f6228a;

            public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Footer.c> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Footer.c findValueByNumber(int i) {
                    return com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Footer.c.forNumber(i);
                }
            }

            public static final class b implements com.google.protobuf.Internal.EnumVerifier {

                /* renamed from: a, reason: collision with root package name */
                public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Footer.c.b f6229a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Footer.c.b();

                @Override // com.google.protobuf.Internal.EnumVerifier
                public final boolean isInRange(int i) {
                    return com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Footer.c.forNumber(i) != null;
                }
            }

            c(int i) {
                this.f6228a = i;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Footer.c forNumber(int i) {
                if (i == 0) {
                    return FADE_TYPE_UNKNOWN;
                }
                if (i == 1) {
                    return FADE_TYPE_NONE;
                }
                if (i != 2) {
                    return null;
                }
                return FADE_TYPE_DIVIDER;
            }

            public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Footer.c> internalGetValueMap() {
                return b;
            }

            public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Footer.c.b.f6229a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f6228a;
                }
                throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Footer.c valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer footer = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer();
            DEFAULT_INSTANCE = footer;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer.class, footer);
        }

        private Footer() {
        }

        private void addAllComponents(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent> iterable) {
            ensureComponentsIsMutable();
            com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.components_);
        }

        private void clearBackgroundContrast() {
            this.backgroundContrast_ = 0;
        }

        private void clearComponents() {
            this.components_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
        }

        private void clearFadeType() {
            this.fadeType_ = 0;
        }

        private void clearSpacing() {
            this.spacing_ = null;
            this.bitField0_ &= -2;
        }

        private void ensureComponentsIsMutable() {
            com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent> protobufList = this.components_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.components_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Footer.b newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeComponents(int i) {
            ensureComponentsIsMutable();
            this.components_.remove(i);
        }

        private void setBackgroundContrast(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Footer.a aVar) {
            this.backgroundContrast_ = aVar.getNumber();
        }

        private void setBackgroundContrastValue(int i) {
            this.backgroundContrast_ = i;
        }

        private void setFadeType(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Footer.c cVar) {
            this.fadeType_ = cVar.getNumber();
        }

        private void setFadeTypeValue(int i) {
            this.fadeType_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.m0.f6311a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Footer.b();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002\f\u0003ဉ\u0000\u0004\f", new java.lang.Object[]{"bitField0_", "components_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.class, "backgroundContrast_", "spacing_", "fadeType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Footer.a getBackgroundContrast() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Footer.a forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Footer.a.forNumber(this.backgroundContrast_);
            return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Footer.a.UNRECOGNIZED : forNumber;
        }

        public final int getBackgroundContrastValue() {
            return this.backgroundContrast_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent getComponents(int i) {
            return this.components_.get(i);
        }

        public final int getComponentsCount() {
            return this.components_.size();
        }

        public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent> getComponentsList() {
            return this.components_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.InterfaceC0496w getComponentsOrBuilder(int i) {
            return this.components_.get(i);
        }

        public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.InterfaceC0496w> getComponentsOrBuilderList() {
            return this.components_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Footer.c getFadeType() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Footer.c forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Footer.c.forNumber(this.fadeType_);
            return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Footer.c.UNRECOGNIZED : forNumber;
        }

        public final int getFadeTypeValue() {
            return this.fadeType_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing getSpacing() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing spacing = this.spacing_;
            return spacing == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing.getDefaultInstance() : spacing;
        }

        public final boolean hasSpacing() {
            return (this.bitField0_ & 1) != 0;
        }

        private void addComponents(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent common$FlexibleComponent) {
            ensureComponentsIsMutable();
            this.components_.add(common$FlexibleComponent);
        }

        private void mergeSpacing(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing spacing) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing spacing2 = this.spacing_;
            if (spacing2 == null || spacing2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing.getDefaultInstance()) {
                this.spacing_ = spacing;
            } else {
                this.spacing_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing.newBuilder(this.spacing_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FlexibleComponent.Spacing.a) spacing).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Footer.b newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer footer) {
            return DEFAULT_INSTANCE.createBuilder(footer);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setComponents(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent common$FlexibleComponent) {
            ensureComponentsIsMutable();
            this.components_.set(i, common$FlexibleComponent);
        }

        private void setSpacing(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing spacing) {
            this.spacing_ = spacing;
            this.bitField0_ |= 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        private void addComponents(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent common$FlexibleComponent) {
            ensureComponentsIsMutable();
            this.components_.add(i, common$FlexibleComponent);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation, com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.DEFAULT_INSTANCE);
        }
    }

    public enum b {
        LOGO_APPEARANCE(6),
        BADGE(9),
        NOTE(12),
        CENTERCONTENT_NOT_SET(0);


        /* renamed from: a, reason: collision with root package name */
        public final int f6230a;

        b(int i) {
            this.f6230a = i;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.b forNumber(int i) {
            if (i == 0) {
                return CENTERCONTENT_NOT_SET;
            }
            if (i == 6) {
                return LOGO_APPEARANCE;
            }
            if (i == 9) {
                return BADGE;
            }
            if (i != 12) {
                return null;
            }
            return NOTE;
        }

        public final int getNumber() {
            return this.f6230a;
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.b valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum c {
        LEADING_LOGO_APPEARANCE(10),
        LEADING_BADGE(11),
        LEADINGCONTENT_NOT_SET(0);


        /* renamed from: a, reason: collision with root package name */
        public final int f6231a;

        c(int i) {
            this.f6231a = i;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.c forNumber(int i) {
            if (i == 0) {
                return LEADINGCONTENT_NOT_SET;
            }
            if (i == 10) {
                return LEADING_LOGO_APPEARANCE;
            }
            if (i != 11) {
                return null;
            }
            return LEADING_BADGE;
        }

        public final int getNumber() {
            return this.f6231a;
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.c valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation pane$Navigation = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation();
        DEFAULT_INSTANCE = pane$Navigation;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.class, pane$Navigation);
    }

    private Pane$Navigation() {
    }

    private void clearBackButtonTitle() {
        this.backButtonTitle_ = null;
        this.bitField0_ &= -5;
    }

    private void clearBackStackBehavior() {
        this.backStackBehavior_ = 0;
    }

    private void clearBackVisible() {
        this.backVisible_ = false;
    }

    private void clearBadge() {
        if (this.centerContentCase_ == 9) {
            this.centerContentCase_ = 0;
            this.centerContent_ = null;
        }
    }

    private void clearBanner() {
        this.banner_ = null;
        this.bitField0_ &= -33;
    }

    private void clearCenterContent() {
        this.centerContentCase_ = 0;
        this.centerContent_ = null;
    }

    private void clearDividerVisible() {
        this.dividerVisible_ = false;
    }

    private void clearExitActionOverride() {
        this.exitActionOverride_ = null;
        this.bitField0_ &= -3;
    }

    private void clearExitButtonTitle() {
        this.exitButtonTitle_ = null;
        this.bitField0_ &= -2;
    }

    private void clearExitVisible() {
        this.exitVisible_ = false;
    }

    private void clearFallbackTransition() {
        this.fallbackTransition_ = null;
        this.bitField0_ &= -17;
    }

    private void clearFooter() {
        this.footer_ = null;
        this.bitField0_ &= -65;
    }

    private void clearLeadingBadge() {
        if (this.leadingContentCase_ == 11) {
            this.leadingContentCase_ = 0;
            this.leadingContent_ = null;
        }
    }

    private void clearLeadingContent() {
        this.leadingContentCase_ = 0;
        this.leadingContent_ = null;
    }

    private void clearLeadingLogoAppearance() {
        if (this.leadingContentCase_ == 10) {
            this.leadingContentCase_ = 0;
            this.leadingContent_ = null;
        }
    }

    private void clearLogo() {
        this.logo_ = 0;
    }

    private void clearLogoAppearance() {
        if (this.centerContentCase_ == 6) {
            this.centerContentCase_ = 0;
            this.centerContent_ = null;
        }
    }

    private void clearNote() {
        if (this.centerContentCase_ == 12) {
            this.centerContentCase_ = 0;
            this.centerContent_ = null;
        }
    }

    private void clearTransition() {
        this.transition_ = null;
        this.bitField0_ &= -9;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setBackStackBehavior(com.plaid.internal.core.protos.link.workflow.nodes.panes.n0 n0Var) {
        this.backStackBehavior_ = n0Var.getNumber();
    }

    private void setBackStackBehaviorValue(int i) {
        this.backStackBehavior_ = i;
    }

    private void setBackVisible(boolean z) {
        this.backVisible_ = z;
    }

    private void setDividerVisible(boolean z) {
        this.dividerVisible_ = z;
    }

    private void setExitVisible(boolean z) {
        this.exitVisible_ = z;
    }

    private void setLogo(com.plaid.internal.EnumC0527g enumC0527g) {
        this.logo_ = enumC0527g.getNumber();
    }

    private void setLogoValue(int i) {
        this.logo_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.m0.f6311a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0011\u0002\u0001\u0001\u0011\u0011\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\f\u0004ဉ\u0003\u0005\f\u0006<\u0000\u0007ဉ\u0000\bဉ\u0002\t<\u0000\n<\u0001\u000b<\u0001\f<\u0000\rဉ\u0005\u000eဉ\u0004\u000fဉ\u0006\u0010\u0007\u0011ဉ\u0001", new java.lang.Object[]{"centerContent_", "centerContentCase_", "leadingContent_", "leadingContentCase_", "bitField0_", "exitVisible_", "backVisible_", "backStackBehavior_", "transition_", "logo_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.class, "exitButtonTitle_", "backButtonTitle_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note.class, "banner_", "fallbackTransition_", "footer_", "dividerVisible_", "exitActionOverride_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.class) {
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

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getBackButtonTitle() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.backButtonTitle_;
        return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.n0 getBackStackBehavior() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.n0 forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.n0.forNumber(this.backStackBehavior_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.n0.UNRECOGNIZED : forNumber;
    }

    public final int getBackStackBehaviorValue() {
        return this.backStackBehavior_;
    }

    public final boolean getBackVisible() {
        return this.backVisible_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge getBadge() {
        return this.centerContentCase_ == 9 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge) this.centerContent_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner getBanner() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner common$Banner = this.banner_;
        return common$Banner == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner.getDefaultInstance() : common$Banner;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.b getCenterContentCase() {
        return com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.b.forNumber(this.centerContentCase_);
    }

    public final boolean getDividerVisible() {
        return this.dividerVisible_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction getExitActionOverride() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction common$LocalAction = this.exitActionOverride_;
        return common$LocalAction == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.getDefaultInstance() : common$LocalAction;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getExitButtonTitle() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.exitButtonTitle_;
        return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public final boolean getExitVisible() {
        return this.exitVisible_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition getFallbackTransition() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition common$Transition = this.fallbackTransition_;
        return common$Transition == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.getDefaultInstance() : common$Transition;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer getFooter() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer footer = this.footer_;
        return footer == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer.getDefaultInstance() : footer;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge getLeadingBadge() {
        return this.leadingContentCase_ == 11 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge) this.leadingContent_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.c getLeadingContentCase() {
        return com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.c.forNumber(this.leadingContentCase_);
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance getLeadingLogoAppearance() {
        return this.leadingContentCase_ == 10 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance) this.leadingContent_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance();
    }

    public final com.plaid.internal.EnumC0527g getLogo() {
        com.plaid.internal.EnumC0527g forNumber = com.plaid.internal.EnumC0527g.forNumber(this.logo_);
        return forNumber == null ? com.plaid.internal.EnumC0527g.UNRECOGNIZED : forNumber;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance getLogoAppearance() {
        return this.centerContentCase_ == 6 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance) this.centerContent_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance();
    }

    public final int getLogoValue() {
        return this.logo_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note getNote() {
        return this.centerContentCase_ == 12 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note) this.centerContent_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition getTransition() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition common$Transition = this.transition_;
        return common$Transition == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.getDefaultInstance() : common$Transition;
    }

    public final boolean hasBackButtonTitle() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean hasBadge() {
        return this.centerContentCase_ == 9;
    }

    public final boolean hasBanner() {
        return (this.bitField0_ & 32) != 0;
    }

    public final boolean hasExitActionOverride() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean hasExitButtonTitle() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasFallbackTransition() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean hasFooter() {
        return (this.bitField0_ & 64) != 0;
    }

    public final boolean hasLeadingBadge() {
        return this.leadingContentCase_ == 11;
    }

    public final boolean hasLeadingLogoAppearance() {
        return this.leadingContentCase_ == 10;
    }

    public final boolean hasLogoAppearance() {
        return this.centerContentCase_ == 6;
    }

    public final boolean hasNote() {
        return this.centerContentCase_ == 12;
    }

    public final boolean hasTransition() {
        return (this.bitField0_ & 8) != 0;
    }

    private void mergeBackButtonTitle(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.backButtonTitle_;
        if (common$LocalizedString2 == null || common$LocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
            this.backButtonTitle_ = common$LocalizedString;
        } else {
            this.backButtonTitle_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.backButtonTitle_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    private void mergeBadge(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge badge) {
        if (this.centerContentCase_ != 9 || this.centerContent_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge.getDefaultInstance()) {
            this.centerContent_ = badge;
        } else {
            this.centerContent_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge) this.centerContent_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Badge.a) badge).buildPartial();
        }
        this.centerContentCase_ = 9;
    }

    private void mergeBanner(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner common$Banner) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner common$Banner2 = this.banner_;
        if (common$Banner2 == null || common$Banner2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner.getDefaultInstance()) {
            this.banner_ = common$Banner;
        } else {
            this.banner_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner.newBuilder(this.banner_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner.a) common$Banner).buildPartial();
        }
        this.bitField0_ |= 32;
    }

    private void mergeExitActionOverride(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction common$LocalAction) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction common$LocalAction2 = this.exitActionOverride_;
        if (common$LocalAction2 == null || common$LocalAction2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.getDefaultInstance()) {
            this.exitActionOverride_ = common$LocalAction;
        } else {
            this.exitActionOverride_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.newBuilder(this.exitActionOverride_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.b) common$LocalAction).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    private void mergeExitButtonTitle(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.exitButtonTitle_;
        if (common$LocalizedString2 == null || common$LocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
            this.exitButtonTitle_ = common$LocalizedString;
        } else {
            this.exitButtonTitle_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.exitButtonTitle_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    private void mergeFallbackTransition(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition common$Transition) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition common$Transition2 = this.fallbackTransition_;
        if (common$Transition2 == null || common$Transition2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.getDefaultInstance()) {
            this.fallbackTransition_ = common$Transition;
        } else {
            this.fallbackTransition_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.newBuilder(this.fallbackTransition_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.a) common$Transition).buildPartial();
        }
        this.bitField0_ |= 16;
    }

    private void mergeFooter(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer footer) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer footer2 = this.footer_;
        if (footer2 == null || footer2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer.getDefaultInstance()) {
            this.footer_ = footer;
        } else {
            this.footer_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer.newBuilder(this.footer_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Footer.b) footer).buildPartial();
        }
        this.bitField0_ |= 64;
    }

    private void mergeLeadingBadge(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge badge) {
        if (this.leadingContentCase_ != 11 || this.leadingContent_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge.getDefaultInstance()) {
            this.leadingContent_ = badge;
        } else {
            this.leadingContent_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge) this.leadingContent_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.Navigation.Badge.a) badge).buildPartial();
        }
        this.leadingContentCase_ = 11;
    }

    private void mergeLeadingLogoAppearance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        if (this.leadingContentCase_ != 10 || this.leadingContent_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance()) {
            this.leadingContent_ = common$RenderedAssetAppearance;
        } else {
            this.leadingContent_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance) this.leadingContent_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.a) common$RenderedAssetAppearance).buildPartial();
        }
        this.leadingContentCase_ = 10;
    }

    private void mergeLogoAppearance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        if (this.centerContentCase_ != 6 || this.centerContent_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance()) {
            this.centerContent_ = common$RenderedAssetAppearance;
        } else {
            this.centerContent_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance) this.centerContent_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.a) common$RenderedAssetAppearance).buildPartial();
        }
        this.centerContentCase_ = 6;
    }

    private void mergeNote(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note common$Note) {
        if (this.centerContentCase_ != 12 || this.centerContent_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note.getDefaultInstance()) {
            this.centerContent_ = common$Note;
        } else {
            this.centerContent_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note) this.centerContent_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note.a) common$Note).buildPartial();
        }
        this.centerContentCase_ = 12;
    }

    private void mergeTransition(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition common$Transition) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition common$Transition2 = this.transition_;
        if (common$Transition2 == null || common$Transition2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.getDefaultInstance()) {
            this.transition_ = common$Transition;
        } else {
            this.transition_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.newBuilder(this.transition_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition.a) common$Transition).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation pane$Navigation) {
        return DEFAULT_INSTANCE.createBuilder(pane$Navigation);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setBackButtonTitle(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        this.backButtonTitle_ = common$LocalizedString;
        this.bitField0_ |= 4;
    }

    private void setBadge(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge badge) {
        this.centerContent_ = badge;
        this.centerContentCase_ = 9;
    }

    private void setBanner(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner common$Banner) {
        this.banner_ = common$Banner;
        this.bitField0_ |= 32;
    }

    private void setExitActionOverride(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction common$LocalAction) {
        this.exitActionOverride_ = common$LocalAction;
        this.bitField0_ |= 2;
    }

    private void setExitButtonTitle(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        this.exitButtonTitle_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    private void setFallbackTransition(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition common$Transition) {
        this.fallbackTransition_ = common$Transition;
        this.bitField0_ |= 16;
    }

    private void setFooter(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Footer footer) {
        this.footer_ = footer;
        this.bitField0_ |= 64;
    }

    private void setLeadingBadge(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.Badge badge) {
        this.leadingContent_ = badge;
        this.leadingContentCase_ = 11;
    }

    private void setLeadingLogoAppearance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        this.leadingContent_ = common$RenderedAssetAppearance;
        this.leadingContentCase_ = 10;
    }

    private void setLogoAppearance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        this.centerContent_ = common$RenderedAssetAppearance;
        this.centerContentCase_ = 6;
    }

    private void setNote(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note common$Note) {
        this.centerContent_ = common$Note;
        this.centerContentCase_ = 12;
    }

    private void setTransition(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition common$Transition) {
        this.transition_ = common$Transition;
        this.bitField0_ |= 8;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
