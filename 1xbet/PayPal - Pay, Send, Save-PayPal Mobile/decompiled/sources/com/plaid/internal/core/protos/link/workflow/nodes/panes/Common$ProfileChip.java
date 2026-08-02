package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$ProfileChip extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip DEFAULT_INSTANCE;
    public static final int HELPER_TEXT_FIELD_NUMBER = 6;
    public static final int HELPER_TEXT_LEADING_ASSET_FIELD_NUMBER = 7;
    public static final int ICON_FIELD_NUMBER = 8;
    public static final int MENU_BUTTON_ICON_NAME_FIELD_NUMBER = 9;
    public static final int OPTIONS_ACTION_FIELD_NUMBER = 3;
    public static final int OPTIONS_TEXT_FIELD_NUMBER = 5;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip> PARSER = null;
    public static final int PRIMARY_PROFILE_IDENTIFIER_FIELD_NUMBER = 1;
    public static final int PROFILE_STATUS_FIELD_NUMBER = 4;
    public static final int SECONDARY_PROFILE_IDENTIFIER_FIELD_NUMBER = 2;
    private int bitField0_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance helperTextLeadingAsset_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString helperText_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance icon_;
    private java.lang.String menuButtonIconName_ = "";
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction optionsAction_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString optionsText_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString primaryProfileIdentifier_;
    private int profileStatus_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString secondaryProfileIdentifier_;

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip common$ProfileChip) {
        return DEFAULT_INSTANCE.createBuilder(common$ProfileChip);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public final boolean hasSecondaryProfileIdentifier() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean hasPrimaryProfileIdentifier() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasOptionsText() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean hasOptionsAction() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean hasIcon() {
        return (this.bitField0_ & 64) != 0;
    }

    public final boolean hasHelperTextLeadingAsset() {
        return (this.bitField0_ & 32) != 0;
    }

    public final boolean hasHelperText() {
        return (this.bitField0_ & 16) != 0;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getSecondaryProfileIdentifier() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.secondaryProfileIdentifier_;
        return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public final int getProfileStatusValue() {
        return this.profileStatus_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip.b getProfileStatus() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip.b forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip.b.forNumber(this.profileStatus_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip.b.UNRECOGNIZED : forNumber;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getPrimaryProfileIdentifier() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.primaryProfileIdentifier_;
        return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getOptionsText() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.optionsText_;
        return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction getOptionsAction() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction common$LocalAction = this.optionsAction_;
        return common$LocalAction == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.getDefaultInstance() : common$LocalAction;
    }

    public final com.google.protobuf.ByteString getMenuButtonIconNameBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.menuButtonIconName_);
    }

    public final java.lang.String getMenuButtonIconName() {
        return this.menuButtonIconName_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance getIcon() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.icon_;
        return common$RenderedAssetAppearance == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance getHelperTextLeadingAsset() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.helperTextLeadingAsset_;
        return common$RenderedAssetAppearance == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getHelperText() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.helperText_;
        return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\f\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဉ\u0005\bဉ\u0006\tȈ", new java.lang.Object[]{"bitField0_", "primaryProfileIdentifier_", "secondaryProfileIdentifier_", "optionsAction_", "profileStatus_", "optionsText_", "helperText_", "helperTextLeadingAsset_", "icon_", "menuButtonIconName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip.class) {
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

    private void setSecondaryProfileIdentifier(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        this.secondaryProfileIdentifier_ = common$LocalizedString;
        this.bitField0_ |= 2;
    }

    private void setProfileStatusValue(int i) {
        this.profileStatus_ = i;
    }

    private void setProfileStatus(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip.b bVar) {
        this.profileStatus_ = bVar.getNumber();
    }

    private void setPrimaryProfileIdentifier(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        this.primaryProfileIdentifier_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    private void setOptionsText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        this.optionsText_ = common$LocalizedString;
        this.bitField0_ |= 8;
    }

    private void setOptionsAction(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction common$LocalAction) {
        this.optionsAction_ = common$LocalAction;
        this.bitField0_ |= 4;
    }

    private void setMenuButtonIconNameBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.menuButtonIconName_ = byteString.toStringUtf8();
    }

    private void setMenuButtonIconName(java.lang.String str) {
        this.menuButtonIconName_ = str;
    }

    private void setIcon(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        this.icon_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 64;
    }

    private void setHelperTextLeadingAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        this.helperTextLeadingAsset_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 32;
    }

    private void setHelperText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        this.helperText_ = common$LocalizedString;
        this.bitField0_ |= 16;
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void mergeSecondaryProfileIdentifier(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.secondaryProfileIdentifier_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.secondaryProfileIdentifier_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
        }
        this.secondaryProfileIdentifier_ = common$LocalizedString;
        this.bitField0_ |= 2;
    }

    private void mergePrimaryProfileIdentifier(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.primaryProfileIdentifier_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.primaryProfileIdentifier_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
        }
        this.primaryProfileIdentifier_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    private void mergeOptionsText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.optionsText_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.optionsText_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
        }
        this.optionsText_ = common$LocalizedString;
        this.bitField0_ |= 8;
    }

    private void mergeOptionsAction(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction common$LocalAction) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction common$LocalAction2 = this.optionsAction_;
        if (common$LocalAction2 != null && common$LocalAction2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.getDefaultInstance()) {
            common$LocalAction = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.newBuilder(this.optionsAction_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.b) common$LocalAction).buildPartial();
        }
        this.optionsAction_ = common$LocalAction;
        this.bitField0_ |= 4;
    }

    private void mergeIcon(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.icon_;
        if (common$RenderedAssetAppearance2 != null && common$RenderedAssetAppearance2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance()) {
            common$RenderedAssetAppearance = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.newBuilder(this.icon_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.a) common$RenderedAssetAppearance).buildPartial();
        }
        this.icon_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 64;
    }

    private void mergeHelperTextLeadingAsset(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.helperTextLeadingAsset_;
        if (common$RenderedAssetAppearance2 != null && common$RenderedAssetAppearance2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.getDefaultInstance()) {
            common$RenderedAssetAppearance = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.newBuilder(this.helperTextLeadingAsset_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance.a) common$RenderedAssetAppearance).buildPartial();
        }
        this.helperTextLeadingAsset_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 32;
    }

    private void mergeHelperText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.helperText_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.helperText_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
        }
        this.helperText_ = common$LocalizedString;
        this.bitField0_ |= 16;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void clearSecondaryProfileIdentifier() {
        this.secondaryProfileIdentifier_ = null;
        this.bitField0_ &= -3;
    }

    private void clearProfileStatus() {
        this.profileStatus_ = 0;
    }

    private void clearPrimaryProfileIdentifier() {
        this.primaryProfileIdentifier_ = null;
        this.bitField0_ &= -2;
    }

    private void clearOptionsText() {
        this.optionsText_ = null;
        this.bitField0_ &= -9;
    }

    private void clearOptionsAction() {
        this.optionsAction_ = null;
        this.bitField0_ &= -5;
    }

    public enum b implements com.google.protobuf.Internal.EnumLite {
        PROFILE_STATUS_UNKNOWN(0),
        PROFILE_STATUS_LOGGED_OUT(1),
        PROFILE_STATUS_LOGGED_IN(2),
        UNRECOGNIZED(-1);

        public static final int PROFILE_STATUS_LOGGED_IN_VALUE = 2;
        public static final int PROFILE_STATUS_LOGGED_OUT_VALUE = 1;
        public static final int PROFILE_STATUS_UNKNOWN_VALUE = 0;
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ProfileChip.b.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ProfileChip.b.a();

        /* renamed from: a, reason: collision with root package name */
        public final int f6146a;

        public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip.b> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip.b findValueByNumber(int i) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip.b.forNumber(i);
            }
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip.b valueOf(int i) {
            return forNumber(i);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f6146a;
            }
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip$b$b, reason: collision with other inner class name */
        public static final class C0181b implements com.google.protobuf.Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip.b.C0181b f6147a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip.b.C0181b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip.b.forNumber(i) != null;
            }
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip.b.C0181b.f6147a;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip.b> internalGetValueMap() {
            return b;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip.b forNumber(int i) {
            if (i == 0) {
                return PROFILE_STATUS_UNKNOWN;
            }
            if (i == 1) {
                return PROFILE_STATUS_LOGGED_OUT;
            }
            if (i != 2) {
                return null;
            }
            return PROFILE_STATUS_LOGGED_IN;
        }

        b(int i) {
            this.f6146a = i;
        }
    }

    private void clearMenuButtonIconName() {
        this.menuButtonIconName_ = getDefaultInstance().getMenuButtonIconName();
    }

    private void clearIcon() {
        this.icon_ = null;
        this.bitField0_ &= -65;
    }

    private void clearHelperTextLeadingAsset() {
        this.helperTextLeadingAsset_ = null;
        this.bitField0_ &= -33;
    }

    private void clearHelperText() {
        this.helperText_ = null;
        this.bitField0_ &= -17;
    }

    private Common$ProfileChip() {
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip common$ProfileChip = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip();
        DEFAULT_INSTANCE = common$ProfileChip;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip.class, common$ProfileChip);
    }
}
