package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$SteppedTransitionText extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText> PARSER = null;
    public static final int TEXT_STEPS_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep> textSteps_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

    public static final class TextStep extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SteppedTransitionText.TextStep.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.b {
        public static final int CONTENT_FIELD_NUMBER = 2;
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep DEFAULT_INSTANCE;
        public static final int HEADER_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep> PARSER;
        private int bitField0_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString content_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString header_;

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SteppedTransitionText.TextStep.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SteppedTransitionText.TextStep.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep textStep) {
            return DEFAULT_INSTANCE.createBuilder(textStep);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public final boolean hasHeader() {
            return (this.bitField0_ & 1) != 0;
        }

        public final boolean hasContent() {
            return (this.bitField0_ & 2) != 0;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getHeader() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.header_;
            return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString getContent() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString = this.content_;
            return common$AttributedLocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SteppedTransitionText.TextStep.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new java.lang.Object[]{"bitField0_", "header_", "content_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep.class) {
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

        private void setHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
            this.header_ = common$LocalizedString;
            this.bitField0_ |= 1;
        }

        private void setContent(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
            this.content_ = common$AttributedLocalizedString;
            this.bitField0_ |= 2;
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void mergeHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.header_;
            if (common$LocalizedString2 != null && common$LocalizedString2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
                common$LocalizedString = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.header_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
            }
            this.header_ = common$LocalizedString;
            this.bitField0_ |= 1;
        }

        private void mergeContent(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.content_;
            if (common$AttributedLocalizedString2 != null && common$AttributedLocalizedString2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance()) {
                common$AttributedLocalizedString = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.newBuilder(this.content_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c) common$AttributedLocalizedString).buildPartial();
            }
            this.content_ = common$AttributedLocalizedString;
            this.bitField0_ |= 2;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void clearHeader() {
            this.header_ = null;
            this.bitField0_ &= -2;
        }

        private void clearContent() {
            this.content_ = null;
            this.bitField0_ &= -3;
        }

        private TextStep() {
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.SteppedTransitionText.TextStep.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.b {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep textStep = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep();
            DEFAULT_INSTANCE = textStep;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep.class, textStep);
        }
    }

    public interface b extends com.google.protobuf.MessageLiteOrBuilder {
    }

    private void addTextSteps(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep textStep) {
        ensureTextStepsIsMutable();
        this.textSteps_.add(i, textStep);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addTextSteps(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep textStep) {
        ensureTextStepsIsMutable();
        this.textSteps_.add(textStep);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText common$SteppedTransitionText) {
        return DEFAULT_INSTANCE.createBuilder(common$SteppedTransitionText);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.b> getTextStepsOrBuilderList() {
        return this.textSteps_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.b getTextStepsOrBuilder(int i) {
        return this.textSteps_.get(i);
    }

    public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep> getTextStepsList() {
        return this.textSteps_;
    }

    public final int getTextStepsCount() {
        return this.textSteps_.size();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep getTextSteps(int i) {
        return this.textSteps_.get(i);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"textSteps_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.class) {
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

    private void setTextSteps(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep textStep) {
        ensureTextStepsIsMutable();
        this.textSteps_.set(i, textStep);
    }

    private void removeTextSteps(int i) {
        ensureTextStepsIsMutable();
        this.textSteps_.remove(i);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void ensureTextStepsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep> protobufList = this.textSteps_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.textSteps_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void clearTextSteps() {
        this.textSteps_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    private void addAllTextSteps(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.TextStep> iterable) {
        ensureTextStepsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.textSteps_);
    }

    private Common$SteppedTransitionText() {
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText common$SteppedTransitionText = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText();
        DEFAULT_INSTANCE = common$SteppedTransitionText;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText.class, common$SteppedTransitionText);
    }
}
