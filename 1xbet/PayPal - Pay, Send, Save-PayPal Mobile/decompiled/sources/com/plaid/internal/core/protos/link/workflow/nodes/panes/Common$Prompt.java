package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$Prompt extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.J {
    public static final int ATTRIBUTED_TEXT_FIELD_NUMBER = 3;
    public static final int AUTO_SUBMIT_CONFIGURATION_FIELD_NUMBER = 6;
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt DEFAULT_INSTANCE;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 8;
    public static final int INPUT_FIELD_NUMBER = 2;
    public static final int NOTE_TEXT_FIELD_NUMBER = 4;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt> PARSER = null;
    public static final int PHONE_INPUT_FIELD_NUMBER = 5;
    public static final int SEGMENTED_INPUT_FIELD_NUMBER = 7;
    public static final int TEXT_FIELD_NUMBER = 1;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString attributedText_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration autoSubmitConfiguration_;
    private int bitField0_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString errorMessage_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput input_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString noteText_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput phoneInput_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput segmentedInput_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString text_;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.J {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt common$Prompt = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt();
        DEFAULT_INSTANCE = common$Prompt;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt.class, common$Prompt);
    }

    private Common$Prompt() {
    }

    private void clearAttributedText() {
        this.attributedText_ = null;
        this.bitField0_ &= -17;
    }

    private void clearAutoSubmitConfiguration() {
        this.autoSubmitConfiguration_ = null;
        this.bitField0_ &= -65;
    }

    private void clearErrorMessage() {
        this.errorMessage_ = null;
        this.bitField0_ &= -129;
    }

    private void clearInput() {
        this.input_ = null;
        this.bitField0_ &= -3;
    }

    private void clearNoteText() {
        this.noteText_ = null;
        this.bitField0_ &= -33;
    }

    private void clearPhoneInput() {
        this.phoneInput_ = null;
        this.bitField0_ &= -5;
    }

    private void clearSegmentedInput() {
        this.segmentedInput_ = null;
        this.bitField0_ &= -9;
    }

    private void clearText() {
        this.text_ = null;
        this.bitField0_ &= -2;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0004\u0004ဉ\u0005\u0005ဉ\u0002\u0006ဉ\u0006\u0007ဉ\u0003\bဉ\u0007", new java.lang.Object[]{"bitField0_", "text_", "input_", "attributedText_", "noteText_", "phoneInput_", "autoSubmitConfiguration_", "segmentedInput_", "errorMessage_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt.class) {
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

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString getAttributedText() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString = this.attributedText_;
        return common$AttributedLocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration getAutoSubmitConfiguration() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration common$AutoSubmitConfiguration = this.autoSubmitConfiguration_;
        return common$AutoSubmitConfiguration == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration.getDefaultInstance() : common$AutoSubmitConfiguration;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getErrorMessage() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.errorMessage_;
        return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput getInput() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput common$TextInput = this.input_;
        return common$TextInput == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.getDefaultInstance() : common$TextInput;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString getNoteText() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString = this.noteText_;
        return common$AttributedLocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput getPhoneInput() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput common$PhoneInput = this.phoneInput_;
        return common$PhoneInput == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.getDefaultInstance() : common$PhoneInput;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput getSegmentedInput() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput common$SegmentedInput = this.segmentedInput_;
        return common$SegmentedInput == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput.getDefaultInstance() : common$SegmentedInput;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getText() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.text_;
        return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public final boolean hasAttributedText() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean hasAutoSubmitConfiguration() {
        return (this.bitField0_ & 64) != 0;
    }

    public final boolean hasErrorMessage() {
        return (this.bitField0_ & 128) != 0;
    }

    public final boolean hasInput() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean hasNoteText() {
        return (this.bitField0_ & 32) != 0;
    }

    public final boolean hasPhoneInput() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean hasSegmentedInput() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean hasText() {
        return (this.bitField0_ & 1) != 0;
    }

    private void mergeAttributedText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.attributedText_;
        if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance()) {
            this.attributedText_ = common$AttributedLocalizedString;
        } else {
            this.attributedText_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.newBuilder(this.attributedText_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c) common$AttributedLocalizedString).buildPartial();
        }
        this.bitField0_ |= 16;
    }

    private void mergeAutoSubmitConfiguration(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration common$AutoSubmitConfiguration) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration common$AutoSubmitConfiguration2 = this.autoSubmitConfiguration_;
        if (common$AutoSubmitConfiguration2 == null || common$AutoSubmitConfiguration2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration.getDefaultInstance()) {
            this.autoSubmitConfiguration_ = common$AutoSubmitConfiguration;
        } else {
            this.autoSubmitConfiguration_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration.newBuilder(this.autoSubmitConfiguration_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration.c) common$AutoSubmitConfiguration).buildPartial();
        }
        this.bitField0_ |= 64;
    }

    private void mergeErrorMessage(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.errorMessage_;
        if (common$LocalizedString2 == null || common$LocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
            this.errorMessage_ = common$LocalizedString;
        } else {
            this.errorMessage_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.errorMessage_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
        }
        this.bitField0_ |= 128;
    }

    private void mergeInput(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput common$TextInput) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput common$TextInput2 = this.input_;
        if (common$TextInput2 == null || common$TextInput2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.getDefaultInstance()) {
            this.input_ = common$TextInput;
        } else {
            this.input_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.newBuilder(this.input_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput.b) common$TextInput).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    private void mergeNoteText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.noteText_;
        if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance()) {
            this.noteText_ = common$AttributedLocalizedString;
        } else {
            this.noteText_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.newBuilder(this.noteText_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c) common$AttributedLocalizedString).buildPartial();
        }
        this.bitField0_ |= 32;
    }

    private void mergePhoneInput(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput common$PhoneInput) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput common$PhoneInput2 = this.phoneInput_;
        if (common$PhoneInput2 == null || common$PhoneInput2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.getDefaultInstance()) {
            this.phoneInput_ = common$PhoneInput;
        } else {
            this.phoneInput_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.newBuilder(this.phoneInput_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput.a) common$PhoneInput).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    private void mergeSegmentedInput(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput common$SegmentedInput) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput common$SegmentedInput2 = this.segmentedInput_;
        if (common$SegmentedInput2 == null || common$SegmentedInput2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput.getDefaultInstance()) {
            this.segmentedInput_ = common$SegmentedInput;
        } else {
            this.segmentedInput_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput.newBuilder(this.segmentedInput_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput.a) common$SegmentedInput).buildPartial();
        }
        this.bitField0_ |= 8;
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

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt common$Prompt) {
        return DEFAULT_INSTANCE.createBuilder(common$Prompt);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setAttributedText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
        this.attributedText_ = common$AttributedLocalizedString;
        this.bitField0_ |= 16;
    }

    private void setAutoSubmitConfiguration(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration common$AutoSubmitConfiguration) {
        this.autoSubmitConfiguration_ = common$AutoSubmitConfiguration;
        this.bitField0_ |= 64;
    }

    private void setErrorMessage(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        this.errorMessage_ = common$LocalizedString;
        this.bitField0_ |= 128;
    }

    private void setInput(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput common$TextInput) {
        this.input_ = common$TextInput;
        this.bitField0_ |= 2;
    }

    private void setNoteText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
        this.noteText_ = common$AttributedLocalizedString;
        this.bitField0_ |= 32;
    }

    private void setPhoneInput(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput common$PhoneInput) {
        this.phoneInput_ = common$PhoneInput;
        this.bitField0_ |= 4;
    }

    private void setSegmentedInput(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput common$SegmentedInput) {
        this.segmentedInput_ = common$SegmentedInput;
        this.bitField0_ |= 8;
    }

    private void setText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        this.text_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
