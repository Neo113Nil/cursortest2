package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes9.dex */
public final class Enum extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<com.google.crypto.tink.shaded.protobuf.Enum, com.google.crypto.tink.shaded.protobuf.Enum.Builder> implements com.google.crypto.tink.shaded.protobuf.EnumOrBuilder {
    private static final com.google.crypto.tink.shaded.protobuf.Enum DEFAULT_INSTANCE;
    public static final int EDITION_FIELD_NUMBER = 6;
    public static final int ENUMVALUE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Enum> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 5;
    private int bitField0_;
    private com.google.crypto.tink.shaded.protobuf.SourceContext sourceContext_;
    private int syntax_;
    private java.lang.String name_ = "";
    private com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<com.google.crypto.tink.shaded.protobuf.EnumValue> enumvalue_ = emptyProtobufList();
    private com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<com.google.crypto.tink.shaded.protobuf.Option> options_ = emptyProtobufList();
    private java.lang.String edition_ = "";

    private Enum() {
    }

    @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
    public final java.lang.String getName() {
        return this.name_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
    public final com.google.crypto.tink.shaded.protobuf.ByteString getNameBytes() {
        return com.google.crypto.tink.shaded.protobuf.ByteString.copyFromUtf8(this.name_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(java.lang.String str) {
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
    public final java.util.List<com.google.crypto.tink.shaded.protobuf.EnumValue> getEnumvalueList() {
        return this.enumvalue_;
    }

    public final java.util.List<? extends com.google.crypto.tink.shaded.protobuf.EnumValueOrBuilder> getEnumvalueOrBuilderList() {
        return this.enumvalue_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
    public final int getEnumvalueCount() {
        return this.enumvalue_.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
    public final com.google.crypto.tink.shaded.protobuf.EnumValue getEnumvalue(int i) {
        return this.enumvalue_.get(i);
    }

    public final com.google.crypto.tink.shaded.protobuf.EnumValueOrBuilder getEnumvalueOrBuilder(int i) {
        return this.enumvalue_.get(i);
    }

    private void ensureEnumvalueIsMutable() {
        com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<com.google.crypto.tink.shaded.protobuf.EnumValue> protobufList = this.enumvalue_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.enumvalue_ = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnumvalue(int i, com.google.crypto.tink.shaded.protobuf.EnumValue enumValue) {
        ensureEnumvalueIsMutable();
        this.enumvalue_.set(i, enumValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEnumvalue(com.google.crypto.tink.shaded.protobuf.EnumValue enumValue) {
        ensureEnumvalueIsMutable();
        this.enumvalue_.add(enumValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEnumvalue(int i, com.google.crypto.tink.shaded.protobuf.EnumValue enumValue) {
        ensureEnumvalueIsMutable();
        this.enumvalue_.add(i, enumValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEnumvalue(java.lang.Iterable<? extends com.google.crypto.tink.shaded.protobuf.EnumValue> iterable) {
        ensureEnumvalueIsMutable();
        com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.addAll(iterable, this.enumvalue_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnumvalue() {
        this.enumvalue_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEnumvalue(int i) {
        ensureEnumvalueIsMutable();
        this.enumvalue_.remove(i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
    public final java.util.List<com.google.crypto.tink.shaded.protobuf.Option> getOptionsList() {
        return this.options_;
    }

    public final java.util.List<? extends com.google.crypto.tink.shaded.protobuf.OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
    public final int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
    public final com.google.crypto.tink.shaded.protobuf.Option getOptions(int i) {
        return this.options_.get(i);
    }

    public final com.google.crypto.tink.shaded.protobuf.OptionOrBuilder getOptionsOrBuilder(int i) {
        return this.options_.get(i);
    }

    private void ensureOptionsIsMutable() {
        com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<com.google.crypto.tink.shaded.protobuf.Option> protobufList = this.options_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.options_ = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptions(int i, com.google.crypto.tink.shaded.protobuf.Option option) {
        ensureOptionsIsMutable();
        this.options_.set(i, option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(com.google.crypto.tink.shaded.protobuf.Option option) {
        ensureOptionsIsMutable();
        this.options_.add(option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(int i, com.google.crypto.tink.shaded.protobuf.Option option) {
        ensureOptionsIsMutable();
        this.options_.add(i, option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOptions(java.lang.Iterable<? extends com.google.crypto.tink.shaded.protobuf.Option> iterable) {
        ensureOptionsIsMutable();
        com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.addAll(iterable, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOptions(int i) {
        ensureOptionsIsMutable();
        this.options_.remove(i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
    public final boolean hasSourceContext() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
    public final com.google.crypto.tink.shaded.protobuf.SourceContext getSourceContext() {
        com.google.crypto.tink.shaded.protobuf.SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? com.google.crypto.tink.shaded.protobuf.SourceContext.getDefaultInstance() : sourceContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceContext(com.google.crypto.tink.shaded.protobuf.SourceContext sourceContext) {
        this.sourceContext_ = sourceContext;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSourceContext(com.google.crypto.tink.shaded.protobuf.SourceContext sourceContext) {
        com.google.crypto.tink.shaded.protobuf.SourceContext sourceContext2 = this.sourceContext_;
        if (sourceContext2 != null && sourceContext2 != com.google.crypto.tink.shaded.protobuf.SourceContext.getDefaultInstance()) {
            this.sourceContext_ = com.google.crypto.tink.shaded.protobuf.SourceContext.newBuilder(this.sourceContext_).mergeFrom((com.google.crypto.tink.shaded.protobuf.SourceContext.Builder) sourceContext).buildPartial();
        } else {
            this.sourceContext_ = sourceContext;
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceContext() {
        this.sourceContext_ = null;
        this.bitField0_ &= -2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
    public final int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
    public final com.google.crypto.tink.shaded.protobuf.Syntax getSyntax() {
        com.google.crypto.tink.shaded.protobuf.Syntax forNumber = com.google.crypto.tink.shaded.protobuf.Syntax.forNumber(this.syntax_);
        return forNumber == null ? com.google.crypto.tink.shaded.protobuf.Syntax.UNRECOGNIZED : forNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntaxValue(int i) {
        this.syntax_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntax(com.google.crypto.tink.shaded.protobuf.Syntax syntax) {
        this.syntax_ = syntax.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSyntax() {
        this.syntax_ = 0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
    public final java.lang.String getEdition() {
        return this.edition_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
    public final com.google.crypto.tink.shaded.protobuf.ByteString getEditionBytes() {
        return com.google.crypto.tink.shaded.protobuf.ByteString.copyFromUtf8(this.edition_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEdition(java.lang.String str) {
        this.edition_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEdition() {
        this.edition_ = getDefaultInstance().getEdition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEditionBytes(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.edition_ = byteString.toStringUtf8();
    }

    public static com.google.crypto.tink.shaded.protobuf.Enum parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.shaded.protobuf.Enum) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.crypto.tink.shaded.protobuf.Enum parseFrom(java.nio.ByteBuffer byteBuffer, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.shaded.protobuf.Enum) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.google.crypto.tink.shaded.protobuf.Enum parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.shaded.protobuf.Enum) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.google.crypto.tink.shaded.protobuf.Enum parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.shaded.protobuf.Enum) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.google.crypto.tink.shaded.protobuf.Enum parseFrom(byte[] bArr) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.shaded.protobuf.Enum) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.google.crypto.tink.shaded.protobuf.Enum parseFrom(byte[] bArr, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.shaded.protobuf.Enum) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.google.crypto.tink.shaded.protobuf.Enum parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.crypto.tink.shaded.protobuf.Enum) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.crypto.tink.shaded.protobuf.Enum parseFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.shaded.protobuf.Enum) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.shaded.protobuf.Enum parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.crypto.tink.shaded.protobuf.Enum) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.crypto.tink.shaded.protobuf.Enum parseDelimitedFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.shaded.protobuf.Enum) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.shaded.protobuf.Enum parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (com.google.crypto.tink.shaded.protobuf.Enum) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.google.crypto.tink.shaded.protobuf.Enum parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.shaded.protobuf.Enum) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.shaded.protobuf.Enum.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.google.crypto.tink.shaded.protobuf.Enum.Builder newBuilder(com.google.crypto.tink.shaded.protobuf.Enum r1) {
        return DEFAULT_INSTANCE.createBuilder(r1);
    }

    public static final class Builder extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<com.google.crypto.tink.shaded.protobuf.Enum, com.google.crypto.tink.shaded.protobuf.Enum.Builder> implements com.google.crypto.tink.shaded.protobuf.EnumOrBuilder {
        /* synthetic */ Builder(com.google.crypto.tink.shaded.protobuf.Enum.AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(com.google.crypto.tink.shaded.protobuf.Enum.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
        public final java.lang.String getName() {
            return ((com.google.crypto.tink.shaded.protobuf.Enum) this.instance).getName();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
        public final com.google.crypto.tink.shaded.protobuf.ByteString getNameBytes() {
            return ((com.google.crypto.tink.shaded.protobuf.Enum) this.instance).getNameBytes();
        }

        public final com.google.crypto.tink.shaded.protobuf.Enum.Builder setName(java.lang.String str) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Enum) this.instance).setName(str);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Enum.Builder clearName() {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Enum) this.instance).clearName();
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Enum.Builder setNameBytes(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Enum) this.instance).setNameBytes(byteString);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
        public final java.util.List<com.google.crypto.tink.shaded.protobuf.EnumValue> getEnumvalueList() {
            return java.util.Collections.unmodifiableList(((com.google.crypto.tink.shaded.protobuf.Enum) this.instance).getEnumvalueList());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
        public final int getEnumvalueCount() {
            return ((com.google.crypto.tink.shaded.protobuf.Enum) this.instance).getEnumvalueCount();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
        public final com.google.crypto.tink.shaded.protobuf.EnumValue getEnumvalue(int i) {
            return ((com.google.crypto.tink.shaded.protobuf.Enum) this.instance).getEnumvalue(i);
        }

        public final com.google.crypto.tink.shaded.protobuf.Enum.Builder setEnumvalue(int i, com.google.crypto.tink.shaded.protobuf.EnumValue enumValue) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Enum) this.instance).setEnumvalue(i, enumValue);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Enum.Builder setEnumvalue(int i, com.google.crypto.tink.shaded.protobuf.EnumValue.Builder builder) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Enum) this.instance).setEnumvalue(i, builder.build());
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Enum.Builder addEnumvalue(com.google.crypto.tink.shaded.protobuf.EnumValue enumValue) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Enum) this.instance).addEnumvalue(enumValue);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Enum.Builder addEnumvalue(int i, com.google.crypto.tink.shaded.protobuf.EnumValue enumValue) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Enum) this.instance).addEnumvalue(i, enumValue);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Enum.Builder addEnumvalue(com.google.crypto.tink.shaded.protobuf.EnumValue.Builder builder) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Enum) this.instance).addEnumvalue(builder.build());
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Enum.Builder addEnumvalue(int i, com.google.crypto.tink.shaded.protobuf.EnumValue.Builder builder) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Enum) this.instance).addEnumvalue(i, builder.build());
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Enum.Builder addAllEnumvalue(java.lang.Iterable<? extends com.google.crypto.tink.shaded.protobuf.EnumValue> iterable) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Enum) this.instance).addAllEnumvalue(iterable);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Enum.Builder clearEnumvalue() {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Enum) this.instance).clearEnumvalue();
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Enum.Builder removeEnumvalue(int i) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Enum) this.instance).removeEnumvalue(i);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
        public final java.util.List<com.google.crypto.tink.shaded.protobuf.Option> getOptionsList() {
            return java.util.Collections.unmodifiableList(((com.google.crypto.tink.shaded.protobuf.Enum) this.instance).getOptionsList());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
        public final int getOptionsCount() {
            return ((com.google.crypto.tink.shaded.protobuf.Enum) this.instance).getOptionsCount();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
        public final com.google.crypto.tink.shaded.protobuf.Option getOptions(int i) {
            return ((com.google.crypto.tink.shaded.protobuf.Enum) this.instance).getOptions(i);
        }

        public final com.google.crypto.tink.shaded.protobuf.Enum.Builder setOptions(int i, com.google.crypto.tink.shaded.protobuf.Option option) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Enum) this.instance).setOptions(i, option);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Enum.Builder setOptions(int i, com.google.crypto.tink.shaded.protobuf.Option.Builder builder) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Enum) this.instance).setOptions(i, builder.build());
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Enum.Builder addOptions(com.google.crypto.tink.shaded.protobuf.Option option) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Enum) this.instance).addOptions(option);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Enum.Builder addOptions(int i, com.google.crypto.tink.shaded.protobuf.Option option) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Enum) this.instance).addOptions(i, option);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Enum.Builder addOptions(com.google.crypto.tink.shaded.protobuf.Option.Builder builder) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Enum) this.instance).addOptions(builder.build());
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Enum.Builder addOptions(int i, com.google.crypto.tink.shaded.protobuf.Option.Builder builder) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Enum) this.instance).addOptions(i, builder.build());
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Enum.Builder addAllOptions(java.lang.Iterable<? extends com.google.crypto.tink.shaded.protobuf.Option> iterable) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Enum) this.instance).addAllOptions(iterable);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Enum.Builder clearOptions() {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Enum) this.instance).clearOptions();
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Enum.Builder removeOptions(int i) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Enum) this.instance).removeOptions(i);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
        public final boolean hasSourceContext() {
            return ((com.google.crypto.tink.shaded.protobuf.Enum) this.instance).hasSourceContext();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
        public final com.google.crypto.tink.shaded.protobuf.SourceContext getSourceContext() {
            return ((com.google.crypto.tink.shaded.protobuf.Enum) this.instance).getSourceContext();
        }

        public final com.google.crypto.tink.shaded.protobuf.Enum.Builder setSourceContext(com.google.crypto.tink.shaded.protobuf.SourceContext sourceContext) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Enum) this.instance).setSourceContext(sourceContext);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Enum.Builder setSourceContext(com.google.crypto.tink.shaded.protobuf.SourceContext.Builder builder) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Enum) this.instance).setSourceContext(builder.build());
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Enum.Builder mergeSourceContext(com.google.crypto.tink.shaded.protobuf.SourceContext sourceContext) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Enum) this.instance).mergeSourceContext(sourceContext);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Enum.Builder clearSourceContext() {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Enum) this.instance).clearSourceContext();
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
        public final int getSyntaxValue() {
            return ((com.google.crypto.tink.shaded.protobuf.Enum) this.instance).getSyntaxValue();
        }

        public final com.google.crypto.tink.shaded.protobuf.Enum.Builder setSyntaxValue(int i) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Enum) this.instance).setSyntaxValue(i);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
        public final com.google.crypto.tink.shaded.protobuf.Syntax getSyntax() {
            return ((com.google.crypto.tink.shaded.protobuf.Enum) this.instance).getSyntax();
        }

        public final com.google.crypto.tink.shaded.protobuf.Enum.Builder setSyntax(com.google.crypto.tink.shaded.protobuf.Syntax syntax) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Enum) this.instance).setSyntax(syntax);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Enum.Builder clearSyntax() {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Enum) this.instance).clearSyntax();
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
        public final java.lang.String getEdition() {
            return ((com.google.crypto.tink.shaded.protobuf.Enum) this.instance).getEdition();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.EnumOrBuilder
        public final com.google.crypto.tink.shaded.protobuf.ByteString getEditionBytes() {
            return ((com.google.crypto.tink.shaded.protobuf.Enum) this.instance).getEditionBytes();
        }

        public final com.google.crypto.tink.shaded.protobuf.Enum.Builder setEdition(java.lang.String str) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Enum) this.instance).setEdition(str);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Enum.Builder clearEdition() {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Enum) this.instance).clearEdition();
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Enum.Builder setEditionBytes(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Enum) this.instance).setEditionBytes(byteString);
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.Enum$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final java.lang.Object dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.crypto.tink.shaded.protobuf.Parser parser;
        com.google.crypto.tink.shaded.protobuf.Enum.AnonymousClass1 anonymousClass1 = null;
        switch (com.google.crypto.tink.shaded.protobuf.Enum.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new com.google.crypto.tink.shaded.protobuf.Enum();
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.Enum.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004ဉ\u0000\u0005\f\u0006Ȉ", new java.lang.Object[]{"bitField0_", "name_", "enumvalue_", com.google.crypto.tink.shaded.protobuf.EnumValue.class, "options_", com.google.crypto.tink.shaded.protobuf.Option.class, "sourceContext_", "syntax_", "edition_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Enum> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.google.crypto.tink.shaded.protobuf.Enum.class) {
                    parser = PARSER;
                    if (parser == null) {
                        parser = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
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

    static {
        com.google.crypto.tink.shaded.protobuf.Enum r0 = new com.google.crypto.tink.shaded.protobuf.Enum();
        DEFAULT_INSTANCE = r0;
        com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.registerDefaultInstance(com.google.crypto.tink.shaded.protobuf.Enum.class, r0);
    }

    public static com.google.crypto.tink.shaded.protobuf.Enum getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Enum> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
