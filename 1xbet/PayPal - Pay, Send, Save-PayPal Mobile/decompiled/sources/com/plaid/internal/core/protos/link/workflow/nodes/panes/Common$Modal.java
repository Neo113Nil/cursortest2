package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$Modal extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int ATTRIBUTED_CONTENT_FIELD_NUMBER = 6;
    public static final int BUTTON_FIELD_NUMBER = 3;
    public static final int CLOSE_ICON_BUTTON_FIELD_NUMBER = 12;
    public static final int CONTENT_FIELD_NUMBER = 2;
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal DEFAULT_INSTANCE;
    public static final int DISCLAIMER_TEXT_FIELD_NUMBER = 10;
    public static final int DISCLAIMER_TEXT_PLACEMENT_FIELD_NUMBER = 9;
    public static final int FLEXIBLE_COMPONENTS_FIELD_NUMBER = 7;
    public static final int IMAGE_FIELD_NUMBER = 5;
    public static final int PANE_BRANDING_FIELD_NUMBER = 13;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal> PARSER = null;
    public static final int SECONDARY_BUTTON_FIELD_NUMBER = 4;
    public static final int TERTIARY_BUTTON_FIELD_NUMBER = 8;
    public static final int TITLE_FIELD_NUMBER = 1;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString attributedContent_;
    private int bitField0_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent button_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton closeIconButton_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString content_;
    private int disclaimerTextPlacement_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString disclaimerText_;
    private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent> flexibleComponents_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance image_;
    private int paneBranding_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent secondaryButton_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent tertiaryButton_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString title_;

    public static final class CloseIconButton extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Modal.CloseIconButton.b> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int ADDITIONAL_ACTION_FIELD_NUMBER = 2;
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton DEFAULT_INSTANCE;
        public static final int IS_VISIBLE_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton> PARSER;
        private int additionalAction_;
        private boolean isVisible_;

        public enum a implements com.google.protobuf.Internal.EnumLite {
            ADDITIONAL_ACTION_UNKNOWN(0),
            ADDITIONAL_ACTION_PRIMARY_BUTTON_TAP(1),
            ADDITIONAL_ACTION_SECONDARY_BUTTON_TAP(2),
            ADDITIONAL_ACTION_TERTIARY_BUTTON_TAP(3),
            UNRECOGNIZED(-1);

            public static final int ADDITIONAL_ACTION_PRIMARY_BUTTON_TAP_VALUE = 1;
            public static final int ADDITIONAL_ACTION_SECONDARY_BUTTON_TAP_VALUE = 2;
            public static final int ADDITIONAL_ACTION_TERTIARY_BUTTON_TAP_VALUE = 3;
            public static final int ADDITIONAL_ACTION_UNKNOWN_VALUE = 0;
            public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Modal.CloseIconButton.a.C0177a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Modal.CloseIconButton.a.C0177a();

            /* renamed from: a, reason: collision with root package name */
            public final int f6137a;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal$CloseIconButton$a$a, reason: collision with other inner class name */
            public final class C0177a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Modal.CloseIconButton.a> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Modal.CloseIconButton.a findValueByNumber(int i) {
                    return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Modal.CloseIconButton.a.forNumber(i);
                }
            }

            public static final class b implements com.google.protobuf.Internal.EnumVerifier {

                /* renamed from: a, reason: collision with root package name */
                public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Modal.CloseIconButton.a.b f6138a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Modal.CloseIconButton.a.b();

                @Override // com.google.protobuf.Internal.EnumVerifier
                public final boolean isInRange(int i) {
                    return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Modal.CloseIconButton.a.forNumber(i) != null;
                }
            }

            a(int i) {
                this.f6137a = i;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Modal.CloseIconButton.a forNumber(int i) {
                if (i == 0) {
                    return ADDITIONAL_ACTION_UNKNOWN;
                }
                if (i == 1) {
                    return ADDITIONAL_ACTION_PRIMARY_BUTTON_TAP;
                }
                if (i == 2) {
                    return ADDITIONAL_ACTION_SECONDARY_BUTTON_TAP;
                }
                if (i != 3) {
                    return null;
                }
                return ADDITIONAL_ACTION_TERTIARY_BUTTON_TAP;
            }

            public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Modal.CloseIconButton.a> internalGetValueMap() {
                return b;
            }

            public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Modal.CloseIconButton.a.b.f6138a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f6137a;
                }
                throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Modal.CloseIconButton.a valueOf(int i) {
                return forNumber(i);
            }
        }

        public static final class b extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Modal.CloseIconButton.b> implements com.google.protobuf.MessageLiteOrBuilder {
            public b() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton closeIconButton = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton();
            DEFAULT_INSTANCE = closeIconButton;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton.class, closeIconButton);
        }

        private CloseIconButton() {
        }

        private void clearAdditionalAction() {
            this.additionalAction_ = 0;
        }

        private void clearIsVisible() {
            this.isVisible_ = false;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Modal.CloseIconButton.b newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAdditionalAction(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Modal.CloseIconButton.a aVar) {
            this.additionalAction_ = aVar.getNumber();
        }

        private void setAdditionalActionValue(int i) {
            this.additionalAction_ = i;
        }

        private void setIsVisible(boolean z) {
            this.isVisible_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Modal.CloseIconButton.b();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\f", new java.lang.Object[]{"isVisible_", "additionalAction_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Modal.CloseIconButton.a getAdditionalAction() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Modal.CloseIconButton.a forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Modal.CloseIconButton.a.forNumber(this.additionalAction_);
            return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Modal.CloseIconButton.a.UNRECOGNIZED : forNumber;
        }

        public final int getAdditionalActionValue() {
            return this.additionalAction_;
        }

        public final boolean getIsVisible() {
            return this.isVisible_;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Modal.CloseIconButton.b newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton closeIconButton) {
            return DEFAULT_INSTANCE.createBuilder(closeIconButton);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal common$Modal = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal();
        DEFAULT_INSTANCE = common$Modal;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.class, common$Modal);
    }

    private Common$Modal() {
    }

    private void addAllFlexibleComponents(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent> iterable) {
        ensureFlexibleComponentsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.flexibleComponents_);
    }

    private void clearAttributedContent() {
        this.attributedContent_ = null;
        this.bitField0_ &= -5;
    }

    private void clearButton() {
        this.button_ = null;
        this.bitField0_ &= -9;
    }

    private void clearCloseIconButton() {
        this.closeIconButton_ = null;
        this.bitField0_ &= -257;
    }

    private void clearContent() {
        this.content_ = null;
        this.bitField0_ &= -3;
    }

    private void clearDisclaimerText() {
        this.disclaimerText_ = null;
        this.bitField0_ &= -65;
    }

    private void clearDisclaimerTextPlacement() {
        this.disclaimerTextPlacement_ = 0;
    }

    private void clearFlexibleComponents() {
        this.flexibleComponents_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    private void clearImage() {
        this.image_ = null;
        this.bitField0_ &= -129;
    }

    private void clearPaneBranding() {
        this.paneBranding_ = 0;
    }

    private void clearSecondaryButton() {
        this.secondaryButton_ = null;
        this.bitField0_ &= -17;
    }

    private void clearTertiaryButton() {
        this.tertiaryButton_ = null;
        this.bitField0_ &= -33;
    }

    private void clearTitle() {
        this.title_ = null;
        this.bitField0_ &= -2;
    }

    private void ensureFlexibleComponentsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent> protobufList = this.flexibleComponents_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.flexibleComponents_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeFlexibleComponents(int i) {
        ensureFlexibleComponentsIsMutable();
        this.flexibleComponents_.remove(i);
    }

    private void setDisclaimerTextPlacement(com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0493t enumC0493t) {
        this.disclaimerTextPlacement_ = enumC0493t.getNumber();
    }

    private void setDisclaimerTextPlacementValue(int i) {
        this.disclaimerTextPlacement_ = i;
    }

    private void setPaneBranding(com.plaid.internal.core.protos.link.workflow.nodes.panes.I i) {
        this.paneBranding_ = i.getNumber();
    }

    private void setPaneBrandingValue(int i) {
        this.paneBranding_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\r\f\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0003\u0004ဉ\u0004\u0005ဉ\u0007\u0006ဉ\u0002\u0007\u001b\bဉ\u0005\t\f\nဉ\u0006\fဉ\b\r\f", new java.lang.Object[]{"bitField0_", "title_", "content_", "button_", "secondaryButton_", "image_", "attributedContent_", "flexibleComponents_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.class, "tertiaryButton_", "disclaimerTextPlacement_", "disclaimerText_", "closeIconButton_", "paneBranding_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.class) {
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

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString getAttributedContent() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString = this.attributedContent_;
        return common$AttributedLocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent getButton() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent = this.button_;
        return common$ButtonContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton getCloseIconButton() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton closeIconButton = this.closeIconButton_;
        return closeIconButton == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton.getDefaultInstance() : closeIconButton;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getContent() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.content_;
        return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString getDisclaimerText() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString = this.disclaimerText_;
        return common$AttributedLocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0493t getDisclaimerTextPlacement() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0493t forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0493t.forNumber(this.disclaimerTextPlacement_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0493t.UNRECOGNIZED : forNumber;
    }

    public final int getDisclaimerTextPlacementValue() {
        return this.disclaimerTextPlacement_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent getFlexibleComponents(int i) {
        return this.flexibleComponents_.get(i);
    }

    public final int getFlexibleComponentsCount() {
        return this.flexibleComponents_.size();
    }

    public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent> getFlexibleComponentsList() {
        return this.flexibleComponents_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.InterfaceC0496w getFlexibleComponentsOrBuilder(int i) {
        return this.flexibleComponents_.get(i);
    }

    public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.InterfaceC0496w> getFlexibleComponentsOrBuilderList() {
        return this.flexibleComponents_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance getImage() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.image_;
        return common$RenderedAssetAppearance == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.I getPaneBranding() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.I forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.I.forNumber(this.paneBranding_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.I.UNRECOGNIZED : forNumber;
    }

    public final int getPaneBrandingValue() {
        return this.paneBranding_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent getSecondaryButton() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent = this.secondaryButton_;
        return common$ButtonContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent getTertiaryButton() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent = this.tertiaryButton_;
        return common$ButtonContent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getTitle() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.title_;
        return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public final boolean hasAttributedContent() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean hasButton() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean hasCloseIconButton() {
        return (this.bitField0_ & 256) != 0;
    }

    public final boolean hasContent() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean hasDisclaimerText() {
        return (this.bitField0_ & 64) != 0;
    }

    public final boolean hasImage() {
        return (this.bitField0_ & 128) != 0;
    }

    public final boolean hasSecondaryButton() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean hasTertiaryButton() {
        return (this.bitField0_ & 32) != 0;
    }

    public final boolean hasTitle() {
        return (this.bitField0_ & 1) != 0;
    }

    private void addFlexibleComponents(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent common$FlexibleComponent) {
        ensureFlexibleComponentsIsMutable();
        this.flexibleComponents_.add(common$FlexibleComponent);
    }

    private void mergeAttributedContent(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.attributedContent_;
        if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance()) {
            this.attributedContent_ = common$AttributedLocalizedString;
        } else {
            this.attributedContent_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.newBuilder(this.attributedContent_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c) common$AttributedLocalizedString).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    private void mergeButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent2 = this.button_;
        if (common$ButtonContent2 == null || common$ButtonContent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance()) {
            this.button_ = common$ButtonContent;
        } else {
            this.button_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.newBuilder(this.button_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.a) common$ButtonContent).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    private void mergeCloseIconButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton closeIconButton) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton closeIconButton2 = this.closeIconButton_;
        if (closeIconButton2 == null || closeIconButton2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton.getDefaultInstance()) {
            this.closeIconButton_ = closeIconButton;
        } else {
            this.closeIconButton_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton.newBuilder(this.closeIconButton_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.Modal.CloseIconButton.b) closeIconButton).buildPartial();
        }
        this.bitField0_ |= 256;
    }

    private void mergeContent(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.content_;
        if (common$LocalizedString2 == null || common$LocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
            this.content_ = common$LocalizedString;
        } else {
            this.content_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.content_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    private void mergeDisclaimerText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.disclaimerText_;
        if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance()) {
            this.disclaimerText_ = common$AttributedLocalizedString;
        } else {
            this.disclaimerText_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.newBuilder(this.disclaimerText_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c) common$AttributedLocalizedString).buildPartial();
        }
        this.bitField0_ |= 64;
    }

    private void mergeImage(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.image_;
        if (common$RenderedAssetAppearance2 == null || common$RenderedAssetAppearance2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance()) {
            this.image_ = common$RenderedAssetAppearance;
        } else {
            this.image_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.newBuilder(this.image_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.a) common$RenderedAssetAppearance).buildPartial();
        }
        this.bitField0_ |= 128;
    }

    private void mergeSecondaryButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent2 = this.secondaryButton_;
        if (common$ButtonContent2 == null || common$ButtonContent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance()) {
            this.secondaryButton_ = common$ButtonContent;
        } else {
            this.secondaryButton_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.newBuilder(this.secondaryButton_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.a) common$ButtonContent).buildPartial();
        }
        this.bitField0_ |= 16;
    }

    private void mergeTertiaryButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent2 = this.tertiaryButton_;
        if (common$ButtonContent2 == null || common$ButtonContent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance()) {
            this.tertiaryButton_ = common$ButtonContent;
        } else {
            this.tertiaryButton_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.newBuilder(this.tertiaryButton_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.a) common$ButtonContent).buildPartial();
        }
        this.bitField0_ |= 32;
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

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal common$Modal) {
        return DEFAULT_INSTANCE.createBuilder(common$Modal);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setAttributedContent(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
        this.attributedContent_ = common$AttributedLocalizedString;
        this.bitField0_ |= 4;
    }

    private void setButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
        this.button_ = common$ButtonContent;
        this.bitField0_ |= 8;
    }

    private void setCloseIconButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.CloseIconButton closeIconButton) {
        this.closeIconButton_ = closeIconButton;
        this.bitField0_ |= 256;
    }

    private void setContent(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        this.content_ = common$LocalizedString;
        this.bitField0_ |= 2;
    }

    private void setDisclaimerText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
        this.disclaimerText_ = common$AttributedLocalizedString;
        this.bitField0_ |= 64;
    }

    private void setFlexibleComponents(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent common$FlexibleComponent) {
        ensureFlexibleComponentsIsMutable();
        this.flexibleComponents_.set(i, common$FlexibleComponent);
    }

    private void setImage(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        this.image_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 128;
    }

    private void setSecondaryButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
        this.secondaryButton_ = common$ButtonContent;
        this.bitField0_ |= 16;
    }

    private void setTertiaryButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
        this.tertiaryButton_ = common$ButtonContent;
        this.bitField0_ |= 32;
    }

    private void setTitle(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        this.title_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    private void addFlexibleComponents(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent common$FlexibleComponent) {
        ensureFlexibleComponentsIsMutable();
        this.flexibleComponents_.add(i, common$FlexibleComponent);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
