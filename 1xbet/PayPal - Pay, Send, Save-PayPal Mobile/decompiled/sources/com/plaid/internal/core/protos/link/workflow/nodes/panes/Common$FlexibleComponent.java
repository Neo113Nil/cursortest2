package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$FlexibleComponent extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.InterfaceC0496w {
    public static final int ACCORDION_FIELD_NUMBER = 14;
    public static final int ASSET_FIELD_NUMBER = 11;
    public static final int ATTRIBUTED_STRING_FIELD_NUMBER = 8;
    public static final int BOX_FIELD_NUMBER = 21;
    public static final int BUTTON_FIELD_NUMBER = 9;
    public static final int CHECK_LIST_FIELD_NUMBER = 18;
    public static final int COBRANDED_ASSET_FIELD_NUMBER = 29;
    public static final int COMPONENT_ACTION_FIELD_NUMBER = 2;
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent DEFAULT_INSTANCE;
    public static final int DISCLAIMER_FIELD_NUMBER = 26;
    public static final int DISCLAIMER_TEXT_FIELD_NUMBER = 25;
    public static final int FINE_PRINT_FIELD_NUMBER = 17;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LIST_GROUP_FIELD_NUMBER = 24;
    public static final int LIST_ITEM_FIELD_NUMBER = 12;
    public static final int NOTE_FIELD_NUMBER = 15;
    public static final int OAUTH_GUIDANCE_FIELD_NUMBER = 28;
    public static final int ON_TAP_FIELD_NUMBER = 3;
    public static final int ORDERED_LIST_FIELD_NUMBER = 19;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent> PARSER = null;
    public static final int PASSPORT_MODAL_FIELD_NUMBER = 32;
    public static final int PHONE_INPUT_FIELD_NUMBER = 30;
    public static final int PRIMARY_HEADING_FIELD_NUMBER = 7;
    public static final int SPACING_FIELD_NUMBER = 4;
    public static final int STEPPED_TRANSITION_TEXT_FIELD_NUMBER = 27;
    public static final int TABLE_FIELD_NUMBER = 16;
    public static final int TEXT_CONTENT_FIELD_NUMBER = 23;
    public static final int TEXT_INPUT_FIELD_NUMBER = 10;
    public static final int THREADS_LIST_ITEM_FIELD_NUMBER = 20;
    public static final int TOUCHABLE_FIELD_NUMBER = 22;
    public static final int VALUE_PROPOSITION_SHEET_FIELD_NUMBER = 31;
    private int bitField0_;
    private int componentAction_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent onTap_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing spacing_;
    private java.lang.Object type_;
    private int typeCase_ = 0;
    private java.lang.String id_ = "";

    public static final class Spacing extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FlexibleComponent.Spacing.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing DEFAULT_INSTANCE;
        public static final int MARGIN_BOTTOM_FIELD_NUMBER = 1;
        public static final int MARGIN_LEFT_FIELD_NUMBER = 2;
        public static final int MARGIN_RIGHT_FIELD_NUMBER = 3;
        public static final int PADDING_BOTTOM_FIELD_NUMBER = 5;
        public static final int PADDING_LEFT_FIELD_NUMBER = 6;
        public static final int PADDING_RIGHT_FIELD_NUMBER = 7;
        public static final int PADDING_TOP_FIELD_NUMBER = 4;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing> PARSER;
        private float marginBottom_;
        private float marginLeft_;
        private float marginRight_;
        private float paddingBottom_;
        private float paddingLeft_;
        private float paddingRight_;
        private float paddingTop_;

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FlexibleComponent.Spacing.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FlexibleComponent.Spacing.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing spacing) {
            return DEFAULT_INSTANCE.createBuilder(spacing);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public final float getPaddingTop() {
            return this.paddingTop_;
        }

        public final float getPaddingRight() {
            return this.paddingRight_;
        }

        public final float getPaddingLeft() {
            return this.paddingLeft_;
        }

        public final float getPaddingBottom() {
            return this.paddingBottom_;
        }

        public final float getMarginRight() {
            return this.marginRight_;
        }

        public final float getMarginLeft() {
            return this.marginLeft_;
        }

        public final float getMarginBottom() {
            return this.marginBottom_;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FlexibleComponent.Spacing.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0001\u0002\u0001\u0003\u0001\u0004\u0001\u0005\u0001\u0006\u0001\u0007\u0001", new java.lang.Object[]{"marginBottom_", "marginLeft_", "marginRight_", "paddingTop_", "paddingBottom_", "paddingLeft_", "paddingRight_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing.class) {
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

        private void setPaddingTop(float f) {
            this.paddingTop_ = f;
        }

        private void setPaddingRight(float f) {
            this.paddingRight_ = f;
        }

        private void setPaddingLeft(float f) {
            this.paddingLeft_ = f;
        }

        private void setPaddingBottom(float f) {
            this.paddingBottom_ = f;
        }

        private void setMarginRight(float f) {
            this.marginRight_ = f;
        }

        private void setMarginLeft(float f) {
            this.marginLeft_ = f;
        }

        private void setMarginBottom(float f) {
            this.marginBottom_ = f;
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void clearPaddingTop() {
            this.paddingTop_ = 0.0f;
        }

        private void clearPaddingRight() {
            this.paddingRight_ = 0.0f;
        }

        private void clearPaddingLeft() {
            this.paddingLeft_ = 0.0f;
        }

        private void clearPaddingBottom() {
            this.paddingBottom_ = 0.0f;
        }

        private void clearMarginRight() {
            this.marginRight_ = 0.0f;
        }

        private void clearMarginLeft() {
            this.marginLeft_ = 0.0f;
        }

        private void clearMarginBottom() {
            this.marginBottom_ = 0.0f;
        }

        private Spacing() {
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FlexibleComponent.Spacing.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing spacing = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing();
            DEFAULT_INSTANCE = spacing;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing.class, spacing);
        }
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent common$FlexibleComponent) {
        return DEFAULT_INSTANCE.createBuilder(common$FlexibleComponent);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public final boolean hasValuePropositionSheet() {
        return this.typeCase_ == 31;
    }

    public final boolean hasTouchable() {
        return this.typeCase_ == 22;
    }

    public final boolean hasThreadsListItem() {
        return this.typeCase_ == 20;
    }

    public final boolean hasTextInput() {
        return this.typeCase_ == 10;
    }

    public final boolean hasTextContent() {
        return this.typeCase_ == 23;
    }

    public final boolean hasTable() {
        return this.typeCase_ == 16;
    }

    public final boolean hasSteppedTransitionText() {
        return this.typeCase_ == 27;
    }

    public final boolean hasSpacing() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean hasPrimaryHeading() {
        return this.typeCase_ == 7;
    }

    public final boolean hasPhoneInput() {
        return this.typeCase_ == 30;
    }

    public final boolean hasPassportModal() {
        return this.typeCase_ == 32;
    }

    public final boolean hasOrderedList() {
        return this.typeCase_ == 19;
    }

    public final boolean hasOnTap() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasOauthGuidance() {
        return this.typeCase_ == 28;
    }

    public final boolean hasNote() {
        return this.typeCase_ == 15;
    }

    public final boolean hasListItem() {
        return this.typeCase_ == 12;
    }

    public final boolean hasListGroup() {
        return this.typeCase_ == 24;
    }

    public final boolean hasFinePrint() {
        return this.typeCase_ == 17;
    }

    public final boolean hasDisclaimerText() {
        return this.typeCase_ == 25;
    }

    public final boolean hasDisclaimer() {
        return this.typeCase_ == 26;
    }

    public final boolean hasCobrandedAsset() {
        return this.typeCase_ == 29;
    }

    public final boolean hasCheckList() {
        return this.typeCase_ == 18;
    }

    public final boolean hasButton() {
        return this.typeCase_ == 9;
    }

    public final boolean hasBox() {
        return this.typeCase_ == 21;
    }

    public final boolean hasAttributedString() {
        return this.typeCase_ == 8;
    }

    public final boolean hasAsset() {
        return this.typeCase_ == 11;
    }

    public final boolean hasAccordion() {
        return this.typeCase_ == 14;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet getValuePropositionSheet() {
        return this.typeCase_ == 31 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet) this.type_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.b getTypeCase() {
        return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.b.forNumber(this.typeCase_);
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable getTouchable() {
        return this.typeCase_ == 22 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable) this.type_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem getThreadsListItem() {
        return this.typeCase_ == 20 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem) this.type_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput getTextInput() {
        return this.typeCase_ == 10 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput) this.type_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent getTextContent() {
        return this.typeCase_ == 23 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent) this.type_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table getTable() {
        return this.typeCase_ == 16 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table) this.type_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText getSteppedTransitionText() {
        return this.typeCase_ == 27 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText) this.type_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing getSpacing() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing spacing = this.spacing_;
        return spacing == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing.getDefaultInstance() : spacing;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getPrimaryHeading() {
        return this.typeCase_ == 7 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString) this.type_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput getPhoneInput() {
        return this.typeCase_ == 30 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput) this.type_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PassportModal getPassportModal() {
        return this.typeCase_ == 32 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PassportModal) this.type_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PassportModal.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList getOrderedList() {
        return this.typeCase_ == 19 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList) this.type_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent getOnTap() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent = this.onTap_;
        return common$SDKEvent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance getOauthGuidance() {
        return this.typeCase_ == 28 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance) this.type_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note getNote() {
        return this.typeCase_ == 15 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note) this.type_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem getListItem() {
        return this.typeCase_ == 12 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem) this.type_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup getListGroup() {
        return this.typeCase_ == 24 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup) this.type_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup.getDefaultInstance();
    }

    public final com.google.protobuf.ByteString getIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.id_);
    }

    public final java.lang.String getId() {
        return this.id_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString getFinePrint() {
        return this.typeCase_ == 17 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString) this.type_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString getDisclaimerText() {
        return this.typeCase_ == 25 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString) this.type_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Disclaimer getDisclaimer() {
        return this.typeCase_ == 26 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Disclaimer) this.type_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Disclaimer.getDefaultInstance();
    }

    public final int getComponentActionValue() {
        return this.componentAction_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0495v getComponentAction() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0495v forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0495v.forNumber(this.componentAction_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0495v.UNRECOGNIZED : forNumber;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedAsset getCobrandedAsset() {
        return this.typeCase_ == 29 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedAsset) this.type_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedAsset.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList getCheckList() {
        return this.typeCase_ == 18 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList) this.type_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent getButton() {
        return this.typeCase_ == 9 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent) this.type_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box getBox() {
        return this.typeCase_ == 21 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box) this.type_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString getAttributedString() {
        return this.typeCase_ == 8 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString) this.type_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset getAsset() {
        return this.typeCase_ == 11 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset) this.type_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Accordion getAccordion() {
        return this.typeCase_ == 14 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Accordion) this.type_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Accordion.getDefaultInstance();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u001d\u0001\u0001\u0001 \u001d\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003ဉ\u0000\u0004ဉ\u0001\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000\u0014<\u0000\u0015<\u0000\u0016<\u0000\u0017<\u0000\u0018<\u0000\u0019<\u0000\u001a<\u0000\u001b<\u0000\u001c<\u0000\u001d<\u0000\u001e<\u0000\u001f<\u0000 <\u0000", new java.lang.Object[]{"type_", "typeCase_", "bitField0_", "id_", "componentAction_", "onTap_", "spacing_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Accordion.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Disclaimer.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedAsset.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PassportModal.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.class) {
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

    private void setValuePropositionSheet(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet common$ValuePropositionSheet) {
        this.type_ = common$ValuePropositionSheet;
        this.typeCase_ = 31;
    }

    private void setTouchable(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable common$Touchable) {
        this.type_ = common$Touchable;
        this.typeCase_ = 22;
    }

    private void setThreadsListItem(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem common$ThreadsListItem) {
        this.type_ = common$ThreadsListItem;
        this.typeCase_ = 20;
    }

    private void setTextInput(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput common$TextInput) {
        this.type_ = common$TextInput;
        this.typeCase_ = 10;
    }

    private void setTextContent(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent) {
        this.type_ = common$TextContent;
        this.typeCase_ = 23;
    }

    private void setTable(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table common$Table) {
        this.type_ = common$Table;
        this.typeCase_ = 16;
    }

    private void setSteppedTransitionText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText common$SteppedTransitionText) {
        this.type_ = common$SteppedTransitionText;
        this.typeCase_ = 27;
    }

    private void setSpacing(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing spacing) {
        this.spacing_ = spacing;
        this.bitField0_ |= 2;
    }

    private void setPrimaryHeading(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        this.type_ = common$LocalizedString;
        this.typeCase_ = 7;
    }

    private void setPhoneInput(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput common$PhoneInput) {
        this.type_ = common$PhoneInput;
        this.typeCase_ = 30;
    }

    private void setPassportModal(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PassportModal common$PassportModal) {
        this.type_ = common$PassportModal;
        this.typeCase_ = 32;
    }

    private void setOrderedList(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList common$OrderedList) {
        this.type_ = common$OrderedList;
        this.typeCase_ = 19;
    }

    private void setOnTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
        this.onTap_ = common$SDKEvent;
        this.bitField0_ |= 1;
    }

    private void setOauthGuidance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance common$OAuthGuidance) {
        this.type_ = common$OAuthGuidance;
        this.typeCase_ = 28;
    }

    private void setNote(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note common$Note) {
        this.type_ = common$Note;
        this.typeCase_ = 15;
    }

    private void setListItem(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem common$ListItem) {
        this.type_ = common$ListItem;
        this.typeCase_ = 12;
    }

    private void setListGroup(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup common$ListGroup) {
        this.type_ = common$ListGroup;
        this.typeCase_ = 24;
    }

    private void setIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    private void setId(java.lang.String str) {
        this.id_ = str;
    }

    private void setFinePrint(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
        this.type_ = common$AttributedLocalizedString;
        this.typeCase_ = 17;
    }

    private void setDisclaimerText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
        this.type_ = common$AttributedLocalizedString;
        this.typeCase_ = 25;
    }

    private void setDisclaimer(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Disclaimer common$Disclaimer) {
        this.type_ = common$Disclaimer;
        this.typeCase_ = 26;
    }

    private void setComponentActionValue(int i) {
        this.componentAction_ = i;
    }

    private void setComponentAction(com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0495v enumC0495v) {
        this.componentAction_ = enumC0495v.getNumber();
    }

    private void setCobrandedAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedAsset common$CobrandedAsset) {
        this.type_ = common$CobrandedAsset;
        this.typeCase_ = 29;
    }

    private void setCheckList(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList common$CheckList) {
        this.type_ = common$CheckList;
        this.typeCase_ = 18;
    }

    private void setButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
        this.type_ = common$ButtonContent;
        this.typeCase_ = 9;
    }

    private void setBox(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box common$Box) {
        this.type_ = common$Box;
        this.typeCase_ = 21;
    }

    private void setAttributedString(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
        this.type_ = common$AttributedLocalizedString;
        this.typeCase_ = 8;
    }

    private void setAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset common$RenderedAsset) {
        this.type_ = common$RenderedAsset;
        this.typeCase_ = 11;
    }

    private void setAccordion(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Accordion common$Accordion) {
        this.type_ = common$Accordion;
        this.typeCase_ = 14;
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void mergeValuePropositionSheet(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet common$ValuePropositionSheet) {
        if (this.typeCase_ == 31 && this.type_ != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.getDefaultInstance()) {
            common$ValuePropositionSheet = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet) this.type_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.a) common$ValuePropositionSheet).buildPartial();
        }
        this.type_ = common$ValuePropositionSheet;
        this.typeCase_ = 31;
    }

    private void mergeTouchable(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable common$Touchable) {
        if (this.typeCase_ == 22 && this.type_ != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable.getDefaultInstance()) {
            common$Touchable = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable) this.type_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable.a) common$Touchable).buildPartial();
        }
        this.type_ = common$Touchable;
        this.typeCase_ = 22;
    }

    private void mergeThreadsListItem(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem common$ThreadsListItem) {
        if (this.typeCase_ == 20 && this.type_ != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.getDefaultInstance()) {
            common$ThreadsListItem = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem) this.type_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem.a) common$ThreadsListItem).buildPartial();
        }
        this.type_ = common$ThreadsListItem;
        this.typeCase_ = 20;
    }

    private void mergeTextInput(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput common$TextInput) {
        if (this.typeCase_ == 10 && this.type_ != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.getDefaultInstance()) {
            common$TextInput = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput) this.type_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.b) common$TextInput).buildPartial();
        }
        this.type_ = common$TextInput;
        this.typeCase_ = 10;
    }

    private void mergeTextContent(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent common$TextContent) {
        if (this.typeCase_ == 23 && this.type_ != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.getDefaultInstance()) {
            common$TextContent = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent) this.type_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent.c) common$TextContent).buildPartial();
        }
        this.type_ = common$TextContent;
        this.typeCase_ = 23;
    }

    private void mergeTable(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table common$Table) {
        if (this.typeCase_ == 16 && this.type_ != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table.getDefaultInstance()) {
            common$Table = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table) this.type_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table.a) common$Table).buildPartial();
        }
        this.type_ = common$Table;
        this.typeCase_ = 16;
    }

    private void mergeSteppedTransitionText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText common$SteppedTransitionText) {
        if (this.typeCase_ == 27 && this.type_ != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.getDefaultInstance()) {
            common$SteppedTransitionText = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText) this.type_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.a) common$SteppedTransitionText).buildPartial();
        }
        this.type_ = common$SteppedTransitionText;
        this.typeCase_ = 27;
    }

    private void mergeSpacing(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing spacing) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing spacing2 = this.spacing_;
        if (spacing2 != null && spacing2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing.getDefaultInstance()) {
            spacing = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.Spacing.newBuilder(this.spacing_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.FlexibleComponent.Spacing.a) spacing).buildPartial();
        }
        this.spacing_ = spacing;
        this.bitField0_ |= 2;
    }

    private void mergePrimaryHeading(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        if (this.typeCase_ == 7 && this.type_ != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString) this.type_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
        }
        this.type_ = common$LocalizedString;
        this.typeCase_ = 7;
    }

    private void mergePhoneInput(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput common$PhoneInput) {
        if (this.typeCase_ == 30 && this.type_ != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.getDefaultInstance()) {
            common$PhoneInput = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput) this.type_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.a) common$PhoneInput).buildPartial();
        }
        this.type_ = common$PhoneInput;
        this.typeCase_ = 30;
    }

    private void mergePassportModal(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PassportModal common$PassportModal) {
        if (this.typeCase_ == 32 && this.type_ != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PassportModal.getDefaultInstance()) {
            common$PassportModal = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PassportModal.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PassportModal) this.type_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PassportModal.a) common$PassportModal).buildPartial();
        }
        this.type_ = common$PassportModal;
        this.typeCase_ = 32;
    }

    private void mergeOrderedList(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList common$OrderedList) {
        if (this.typeCase_ == 19 && this.type_ != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList.getDefaultInstance()) {
            common$OrderedList = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList) this.type_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList.a) common$OrderedList).buildPartial();
        }
        this.type_ = common$OrderedList;
        this.typeCase_ = 19;
    }

    private void mergeOnTap(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent2 = this.onTap_;
        if (common$SDKEvent2 != null && common$SDKEvent2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.getDefaultInstance()) {
            common$SDKEvent = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.newBuilder(this.onTap_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.a) common$SDKEvent).buildPartial();
        }
        this.onTap_ = common$SDKEvent;
        this.bitField0_ |= 1;
    }

    private void mergeOauthGuidance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance common$OAuthGuidance) {
        if (this.typeCase_ == 28 && this.type_ != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance.getDefaultInstance()) {
            common$OAuthGuidance = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance) this.type_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance.a) common$OAuthGuidance).buildPartial();
        }
        this.type_ = common$OAuthGuidance;
        this.typeCase_ = 28;
    }

    private void mergeNote(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note common$Note) {
        if (this.typeCase_ == 15 && this.type_ != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note.getDefaultInstance()) {
            common$Note = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note) this.type_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note.a) common$Note).buildPartial();
        }
        this.type_ = common$Note;
        this.typeCase_ = 15;
    }

    private void mergeListItem(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem common$ListItem) {
        if (this.typeCase_ == 12 && this.type_ != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem.getDefaultInstance()) {
            common$ListItem = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem) this.type_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem.a) common$ListItem).buildPartial();
        }
        this.type_ = common$ListItem;
        this.typeCase_ = 12;
    }

    private void mergeListGroup(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup common$ListGroup) {
        if (this.typeCase_ == 24 && this.type_ != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup.getDefaultInstance()) {
            common$ListGroup = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup) this.type_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup.a) common$ListGroup).buildPartial();
        }
        this.type_ = common$ListGroup;
        this.typeCase_ = 24;
    }

    private void mergeFinePrint(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
        if (this.typeCase_ == 17 && this.type_ != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance()) {
            common$AttributedLocalizedString = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString) this.type_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c) common$AttributedLocalizedString).buildPartial();
        }
        this.type_ = common$AttributedLocalizedString;
        this.typeCase_ = 17;
    }

    private void mergeDisclaimerText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
        if (this.typeCase_ == 25 && this.type_ != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance()) {
            common$AttributedLocalizedString = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString) this.type_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c) common$AttributedLocalizedString).buildPartial();
        }
        this.type_ = common$AttributedLocalizedString;
        this.typeCase_ = 25;
    }

    private void mergeDisclaimer(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Disclaimer common$Disclaimer) {
        if (this.typeCase_ == 26 && this.type_ != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Disclaimer.getDefaultInstance()) {
            common$Disclaimer = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Disclaimer.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Disclaimer) this.type_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Disclaimer.a) common$Disclaimer).buildPartial();
        }
        this.type_ = common$Disclaimer;
        this.typeCase_ = 26;
    }

    private void mergeCobrandedAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedAsset common$CobrandedAsset) {
        if (this.typeCase_ == 29 && this.type_ != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedAsset.getDefaultInstance()) {
            common$CobrandedAsset = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedAsset.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedAsset) this.type_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedAsset.a) common$CobrandedAsset).buildPartial();
        }
        this.type_ = common$CobrandedAsset;
        this.typeCase_ = 29;
    }

    private void mergeCheckList(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList common$CheckList) {
        if (this.typeCase_ == 18 && this.type_ != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList.getDefaultInstance()) {
            common$CheckList = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList) this.type_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList.a) common$CheckList).buildPartial();
        }
        this.type_ = common$CheckList;
        this.typeCase_ = 18;
    }

    private void mergeButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent common$ButtonContent) {
        if (this.typeCase_ == 9 && this.type_ != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.getDefaultInstance()) {
            common$ButtonContent = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent) this.type_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent.a) common$ButtonContent).buildPartial();
        }
        this.type_ = common$ButtonContent;
        this.typeCase_ = 9;
    }

    private void mergeBox(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box common$Box) {
        if (this.typeCase_ == 21 && this.type_ != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.getDefaultInstance()) {
            common$Box = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box) this.type_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box.d) common$Box).buildPartial();
        }
        this.type_ = common$Box;
        this.typeCase_ = 21;
    }

    private void mergeAttributedString(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
        if (this.typeCase_ == 8 && this.type_ != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance()) {
            common$AttributedLocalizedString = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString) this.type_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c) common$AttributedLocalizedString).buildPartial();
        }
        this.type_ = common$AttributedLocalizedString;
        this.typeCase_ = 8;
    }

    private void mergeAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset common$RenderedAsset) {
        if (this.typeCase_ == 11 && this.type_ != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.getDefaultInstance()) {
            common$RenderedAsset = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset) this.type_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset.a) common$RenderedAsset).buildPartial();
        }
        this.type_ = common$RenderedAsset;
        this.typeCase_ = 11;
    }

    private void mergeAccordion(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Accordion common$Accordion) {
        if (this.typeCase_ == 14 && this.type_ != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Accordion.getDefaultInstance()) {
            common$Accordion = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Accordion.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Accordion) this.type_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Accordion.a) common$Accordion).buildPartial();
        }
        this.type_ = common$Accordion;
        this.typeCase_ = 14;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void clearValuePropositionSheet() {
        if (this.typeCase_ == 31) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearType() {
        this.typeCase_ = 0;
        this.type_ = null;
    }

    private void clearTouchable() {
        if (this.typeCase_ == 22) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearThreadsListItem() {
        if (this.typeCase_ == 20) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearTextInput() {
        if (this.typeCase_ == 10) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearTextContent() {
        if (this.typeCase_ == 23) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearTable() {
        if (this.typeCase_ == 16) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearSteppedTransitionText() {
        if (this.typeCase_ == 27) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearSpacing() {
        this.spacing_ = null;
        this.bitField0_ &= -3;
    }

    private void clearPrimaryHeading() {
        if (this.typeCase_ == 7) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearPhoneInput() {
        if (this.typeCase_ == 30) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearPassportModal() {
        if (this.typeCase_ == 32) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearOrderedList() {
        if (this.typeCase_ == 19) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearOnTap() {
        this.onTap_ = null;
        this.bitField0_ &= -2;
    }

    private void clearOauthGuidance() {
        if (this.typeCase_ == 28) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearNote() {
        if (this.typeCase_ == 15) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearListItem() {
        if (this.typeCase_ == 12) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearListGroup() {
        if (this.typeCase_ == 24) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    private void clearFinePrint() {
        if (this.typeCase_ == 17) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearDisclaimerText() {
        if (this.typeCase_ == 25) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearDisclaimer() {
        if (this.typeCase_ == 26) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearComponentAction() {
        this.componentAction_ = 0;
    }

    private void clearCobrandedAsset() {
        if (this.typeCase_ == 29) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearCheckList() {
        if (this.typeCase_ == 18) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearButton() {
        if (this.typeCase_ == 9) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearBox() {
        if (this.typeCase_ == 21) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearAttributedString() {
        if (this.typeCase_ == 8) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    public enum b {
        PRIMARY_HEADING(7),
        ATTRIBUTED_STRING(8),
        BUTTON(9),
        TEXT_INPUT(10),
        ASSET(11),
        LIST_ITEM(12),
        ACCORDION(14),
        NOTE(15),
        TABLE(16),
        FINE_PRINT(17),
        CHECK_LIST(18),
        ORDERED_LIST(19),
        THREADS_LIST_ITEM(20),
        BOX(21),
        TOUCHABLE(22),
        TEXT_CONTENT(23),
        LIST_GROUP(24),
        DISCLAIMER_TEXT(25),
        DISCLAIMER(26),
        STEPPED_TRANSITION_TEXT(27),
        OAUTH_GUIDANCE(28),
        COBRANDED_ASSET(29),
        PHONE_INPUT(30),
        VALUE_PROPOSITION_SHEET(31),
        PASSPORT_MODAL(32),
        TYPE_NOT_SET(0);


        /* renamed from: a, reason: collision with root package name */
        public final int f6132a;

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.b valueOf(int i) {
            return forNumber(i);
        }

        public final int getNumber() {
            return this.f6132a;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.b forNumber(int i) {
            if (i == 0) {
                return TYPE_NOT_SET;
            }
            switch (i) {
                case 7:
                    return PRIMARY_HEADING;
                case 8:
                    return ATTRIBUTED_STRING;
                case 9:
                    return BUTTON;
                case 10:
                    return TEXT_INPUT;
                case 11:
                    return ASSET;
                case 12:
                    return LIST_ITEM;
                default:
                    switch (i) {
                        case 14:
                            return ACCORDION;
                        case 15:
                            return NOTE;
                        case 16:
                            return TABLE;
                        case 17:
                            return FINE_PRINT;
                        case 18:
                            return CHECK_LIST;
                        case 19:
                            return ORDERED_LIST;
                        case 20:
                            return THREADS_LIST_ITEM;
                        case 21:
                            return BOX;
                        case 22:
                            return TOUCHABLE;
                        case 23:
                            return TEXT_CONTENT;
                        case 24:
                            return LIST_GROUP;
                        case 25:
                            return DISCLAIMER_TEXT;
                        case 26:
                            return DISCLAIMER;
                        case 27:
                            return STEPPED_TRANSITION_TEXT;
                        case 28:
                            return OAUTH_GUIDANCE;
                        case 29:
                            return COBRANDED_ASSET;
                        case 30:
                            return PHONE_INPUT;
                        case 31:
                            return VALUE_PROPOSITION_SHEET;
                        case 32:
                            return PASSPORT_MODAL;
                        default:
                            return null;
                    }
            }
        }

        b(int i) {
            this.f6132a = i;
        }
    }

    private void clearAsset() {
        if (this.typeCase_ == 11) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearAccordion() {
        if (this.typeCase_ == 14) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private Common$FlexibleComponent() {
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.InterfaceC0496w {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent common$FlexibleComponent = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent();
        DEFAULT_INSTANCE = common$FlexibleComponent;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent.class, common$FlexibleComponent);
    }
}
