package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$ValuePropositionSheet extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int BODY_FIELD_NUMBER = 3;
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet> PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int VALUE_PROPOSITIONS_FIELD_NUMBER = 4;
    private int bitField0_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString body_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString subtitle_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString title_;
    private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition> valuePropositions_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

    public static final class ValueProposition extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ValuePropositionSheet.ValueProposition.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.b {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition> PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 1;
        private int bitField0_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TwoToneText text_;

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ValuePropositionSheet.ValueProposition.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ValuePropositionSheet.ValueProposition.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition valueProposition) {
            return DEFAULT_INSTANCE.createBuilder(valueProposition);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public final boolean hasText() {
            return (this.bitField0_ & 1) != 0;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TwoToneText getText() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TwoToneText common$TwoToneText = this.text_;
            return common$TwoToneText == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TwoToneText.getDefaultInstance() : common$TwoToneText;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ValuePropositionSheet.ValueProposition.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new java.lang.Object[]{"bitField0_", "text_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition.class) {
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

        private void setText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TwoToneText common$TwoToneText) {
            this.text_ = common$TwoToneText;
            this.bitField0_ |= 1;
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void mergeText(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TwoToneText common$TwoToneText) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TwoToneText common$TwoToneText2 = this.text_;
            if (common$TwoToneText2 != null && common$TwoToneText2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TwoToneText.getDefaultInstance()) {
                common$TwoToneText = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TwoToneText.newBuilder(this.text_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TwoToneText.b) common$TwoToneText).buildPartial();
            }
            this.text_ = common$TwoToneText;
            this.bitField0_ |= 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void clearText() {
            this.text_ = null;
            this.bitField0_ &= -2;
        }

        private ValueProposition() {
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.ValuePropositionSheet.ValueProposition.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.b {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition valueProposition = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition();
            DEFAULT_INSTANCE = valueProposition;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition.class, valueProposition);
        }
    }

    public interface b extends com.google.protobuf.MessageLiteOrBuilder {
    }

    private void addValuePropositions(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition valueProposition) {
        ensureValuePropositionsIsMutable();
        this.valuePropositions_.add(i, valueProposition);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addValuePropositions(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition valueProposition) {
        ensureValuePropositionsIsMutable();
        this.valuePropositions_.add(valueProposition);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet common$ValuePropositionSheet) {
        return DEFAULT_INSTANCE.createBuilder(common$ValuePropositionSheet);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public final boolean hasTitle() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasSubtitle() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean hasBody() {
        return (this.bitField0_ & 4) != 0;
    }

    public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.b> getValuePropositionsOrBuilderList() {
        return this.valuePropositions_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.b getValuePropositionsOrBuilder(int i) {
        return this.valuePropositions_.get(i);
    }

    public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition> getValuePropositionsList() {
        return this.valuePropositions_;
    }

    public final int getValuePropositionsCount() {
        return this.valuePropositions_.size();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition getValuePropositions(int i) {
        return this.valuePropositions_.get(i);
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getTitle() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.title_;
        return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getSubtitle() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.subtitle_;
        return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getBody() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.body_;
        return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u001b", new java.lang.Object[]{"bitField0_", "title_", "subtitle_", "body_", "valuePropositions_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.class) {
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

    private void setValuePropositions(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition valueProposition) {
        ensureValuePropositionsIsMutable();
        this.valuePropositions_.set(i, valueProposition);
    }

    private void setTitle(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        this.title_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    private void setSubtitle(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        this.subtitle_ = common$LocalizedString;
        this.bitField0_ |= 2;
    }

    private void setBody(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        this.body_ = common$LocalizedString;
        this.bitField0_ |= 4;
    }

    private void removeValuePropositions(int i) {
        ensureValuePropositionsIsMutable();
        this.valuePropositions_.remove(i);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void mergeTitle(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.title_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.title_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
        }
        this.title_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    private void mergeSubtitle(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.subtitle_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.subtitle_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
        }
        this.subtitle_ = common$LocalizedString;
        this.bitField0_ |= 2;
    }

    private void mergeBody(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.body_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.body_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
        }
        this.body_ = common$LocalizedString;
        this.bitField0_ |= 4;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void ensureValuePropositionsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition> protobufList = this.valuePropositions_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.valuePropositions_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void clearValuePropositions() {
        this.valuePropositions_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    private void clearTitle() {
        this.title_ = null;
        this.bitField0_ &= -2;
    }

    private void clearSubtitle() {
        this.subtitle_ = null;
        this.bitField0_ &= -3;
    }

    private void clearBody() {
        this.body_ = null;
        this.bitField0_ &= -5;
    }

    private void addAllValuePropositions(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.ValueProposition> iterable) {
        ensureValuePropositionsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.valuePropositions_);
    }

    private Common$ValuePropositionSheet() {
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet common$ValuePropositionSheet = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet();
        DEFAULT_INSTANCE = common$ValuePropositionSheet;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet.class, common$ValuePropositionSheet);
    }
}
