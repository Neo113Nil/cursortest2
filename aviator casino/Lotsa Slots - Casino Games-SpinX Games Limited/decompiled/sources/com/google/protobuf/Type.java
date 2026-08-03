package com.google.protobuf;

/* loaded from: classes4.dex */
public final class Type extends com.google.protobuf.GeneratedMessageLite<com.google.protobuf.Type, com.google.protobuf.Type.Builder> implements com.google.protobuf.TypeOrBuilder {
    private static final com.google.protobuf.Type DEFAULT_INSTANCE;
    public static final int EDITION_FIELD_NUMBER = 7;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ONEOFS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private static volatile com.google.protobuf.Parser<com.google.protobuf.Type> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 6;
    private int bitField0_;
    private com.google.protobuf.SourceContext sourceContext_;
    private int syntax_;
    private java.lang.String name_ = "";
    private com.google.protobuf.Internal.ProtobufList<com.google.protobuf.Field> fields_ = emptyProtobufList();
    private com.google.protobuf.Internal.ProtobufList<java.lang.String> oneofs_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    private com.google.protobuf.Internal.ProtobufList<com.google.protobuf.Option> options_ = emptyProtobufList();
    private java.lang.String edition_ = "";

    private Type() {
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public java.lang.String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public com.google.protobuf.ByteString getNameBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.name_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(java.lang.String value) {
        value.getClass();
        this.name_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(com.google.protobuf.ByteString value) {
        checkByteStringIsUtf8(value);
        this.name_ = value.toStringUtf8();
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public java.util.List<com.google.protobuf.Field> getFieldsList() {
        return this.fields_;
    }

    public java.util.List<? extends com.google.protobuf.FieldOrBuilder> getFieldsOrBuilderList() {
        return this.fields_;
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public int getFieldsCount() {
        return this.fields_.size();
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public com.google.protobuf.Field getFields(int index) {
        return this.fields_.get(index);
    }

    public com.google.protobuf.FieldOrBuilder getFieldsOrBuilder(int index) {
        return this.fields_.get(index);
    }

    private void ensureFieldsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<com.google.protobuf.Field> protobufList = this.fields_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.fields_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFields(int index, com.google.protobuf.Field value) {
        value.getClass();
        ensureFieldsIsMutable();
        this.fields_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFields(com.google.protobuf.Field value) {
        value.getClass();
        ensureFieldsIsMutable();
        this.fields_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFields(int index, com.google.protobuf.Field value) {
        value.getClass();
        ensureFieldsIsMutable();
        this.fields_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFields(java.lang.Iterable<? extends com.google.protobuf.Field> values) {
        ensureFieldsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) values, (java.util.List) this.fields_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFields() {
        this.fields_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFields(int index) {
        ensureFieldsIsMutable();
        this.fields_.remove(index);
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public java.util.List<java.lang.String> getOneofsList() {
        return this.oneofs_;
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public int getOneofsCount() {
        return this.oneofs_.size();
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public java.lang.String getOneofs(int index) {
        return this.oneofs_.get(index);
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public com.google.protobuf.ByteString getOneofsBytes(int index) {
        return com.google.protobuf.ByteString.copyFromUtf8(this.oneofs_.get(index));
    }

    private void ensureOneofsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<java.lang.String> protobufList = this.oneofs_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.oneofs_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOneofs(int index, java.lang.String value) {
        value.getClass();
        ensureOneofsIsMutable();
        this.oneofs_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOneofs(java.lang.String value) {
        value.getClass();
        ensureOneofsIsMutable();
        this.oneofs_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOneofs(java.lang.Iterable<java.lang.String> values) {
        ensureOneofsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) values, (java.util.List) this.oneofs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOneofs() {
        this.oneofs_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOneofsBytes(com.google.protobuf.ByteString value) {
        checkByteStringIsUtf8(value);
        ensureOneofsIsMutable();
        this.oneofs_.add(value.toStringUtf8());
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public java.util.List<com.google.protobuf.Option> getOptionsList() {
        return this.options_;
    }

    public java.util.List<? extends com.google.protobuf.OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public com.google.protobuf.Option getOptions(int index) {
        return this.options_.get(index);
    }

    public com.google.protobuf.OptionOrBuilder getOptionsOrBuilder(int index) {
        return this.options_.get(index);
    }

    private void ensureOptionsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<com.google.protobuf.Option> protobufList = this.options_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.options_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptions(int index, com.google.protobuf.Option value) {
        value.getClass();
        ensureOptionsIsMutable();
        this.options_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(com.google.protobuf.Option value) {
        value.getClass();
        ensureOptionsIsMutable();
        this.options_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(int index, com.google.protobuf.Option value) {
        value.getClass();
        ensureOptionsIsMutable();
        this.options_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOptions(java.lang.Iterable<? extends com.google.protobuf.Option> values) {
        ensureOptionsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) values, (java.util.List) this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOptions(int index) {
        ensureOptionsIsMutable();
        this.options_.remove(index);
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public boolean hasSourceContext() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public com.google.protobuf.SourceContext getSourceContext() {
        com.google.protobuf.SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? com.google.protobuf.SourceContext.getDefaultInstance() : sourceContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceContext(com.google.protobuf.SourceContext value) {
        value.getClass();
        this.sourceContext_ = value;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSourceContext(com.google.protobuf.SourceContext value) {
        value.getClass();
        com.google.protobuf.SourceContext sourceContext = this.sourceContext_;
        if (sourceContext != null && sourceContext != com.google.protobuf.SourceContext.getDefaultInstance()) {
            this.sourceContext_ = com.google.protobuf.SourceContext.newBuilder(this.sourceContext_).mergeFrom((com.google.protobuf.SourceContext.Builder) value).buildPartial();
        } else {
            this.sourceContext_ = value;
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceContext() {
        this.sourceContext_ = null;
        this.bitField0_ &= -2;
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public com.google.protobuf.Syntax getSyntax() {
        com.google.protobuf.Syntax forNumber = com.google.protobuf.Syntax.forNumber(this.syntax_);
        return forNumber == null ? com.google.protobuf.Syntax.UNRECOGNIZED : forNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntaxValue(int value) {
        this.syntax_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntax(com.google.protobuf.Syntax value) {
        this.syntax_ = value.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSyntax() {
        this.syntax_ = 0;
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public java.lang.String getEdition() {
        return this.edition_;
    }

    @Override // com.google.protobuf.TypeOrBuilder
    public com.google.protobuf.ByteString getEditionBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.edition_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEdition(java.lang.String value) {
        value.getClass();
        this.edition_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEdition() {
        this.edition_ = getDefaultInstance().getEdition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEditionBytes(com.google.protobuf.ByteString value) {
        checkByteStringIsUtf8(value);
        this.edition_ = value.toStringUtf8();
    }

    public static com.google.protobuf.Type parseFrom(java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Type) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static com.google.protobuf.Type parseFrom(java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Type) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static com.google.protobuf.Type parseFrom(com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Type) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static com.google.protobuf.Type parseFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Type) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static com.google.protobuf.Type parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Type) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static com.google.protobuf.Type parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Type) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static com.google.protobuf.Type parseFrom(java.io.InputStream input) throws java.io.IOException {
        return (com.google.protobuf.Type) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static com.google.protobuf.Type parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (com.google.protobuf.Type) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static com.google.protobuf.Type parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
        return (com.google.protobuf.Type) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static com.google.protobuf.Type parseDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (com.google.protobuf.Type) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static com.google.protobuf.Type parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        return (com.google.protobuf.Type) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static com.google.protobuf.Type parseFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (com.google.protobuf.Type) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static com.google.protobuf.Type.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.google.protobuf.Type.Builder newBuilder(com.google.protobuf.Type prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.google.protobuf.Type, com.google.protobuf.Type.Builder> implements com.google.protobuf.TypeOrBuilder {
        /* synthetic */ Builder(com.google.protobuf.Type.AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(com.google.protobuf.Type.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public java.lang.String getName() {
            return ((com.google.protobuf.Type) this.instance).getName();
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public com.google.protobuf.ByteString getNameBytes() {
            return ((com.google.protobuf.Type) this.instance).getNameBytes();
        }

        public com.google.protobuf.Type.Builder setName(java.lang.String value) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).setName(value);
            return this;
        }

        public com.google.protobuf.Type.Builder clearName() {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).clearName();
            return this;
        }

        public com.google.protobuf.Type.Builder setNameBytes(com.google.protobuf.ByteString value) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).setNameBytes(value);
            return this;
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public java.util.List<com.google.protobuf.Field> getFieldsList() {
            return java.util.Collections.unmodifiableList(((com.google.protobuf.Type) this.instance).getFieldsList());
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public int getFieldsCount() {
            return ((com.google.protobuf.Type) this.instance).getFieldsCount();
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public com.google.protobuf.Field getFields(int index) {
            return ((com.google.protobuf.Type) this.instance).getFields(index);
        }

        public com.google.protobuf.Type.Builder setFields(int index, com.google.protobuf.Field value) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).setFields(index, value);
            return this;
        }

        public com.google.protobuf.Type.Builder setFields(int index, com.google.protobuf.Field.Builder builderForValue) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).setFields(index, builderForValue.build());
            return this;
        }

        public com.google.protobuf.Type.Builder addFields(com.google.protobuf.Field value) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).addFields(value);
            return this;
        }

        public com.google.protobuf.Type.Builder addFields(int index, com.google.protobuf.Field value) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).addFields(index, value);
            return this;
        }

        public com.google.protobuf.Type.Builder addFields(com.google.protobuf.Field.Builder builderForValue) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).addFields(builderForValue.build());
            return this;
        }

        public com.google.protobuf.Type.Builder addFields(int index, com.google.protobuf.Field.Builder builderForValue) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).addFields(index, builderForValue.build());
            return this;
        }

        public com.google.protobuf.Type.Builder addAllFields(java.lang.Iterable<? extends com.google.protobuf.Field> values) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).addAllFields(values);
            return this;
        }

        public com.google.protobuf.Type.Builder clearFields() {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).clearFields();
            return this;
        }

        public com.google.protobuf.Type.Builder removeFields(int index) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).removeFields(index);
            return this;
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public java.util.List<java.lang.String> getOneofsList() {
            return java.util.Collections.unmodifiableList(((com.google.protobuf.Type) this.instance).getOneofsList());
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public int getOneofsCount() {
            return ((com.google.protobuf.Type) this.instance).getOneofsCount();
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public java.lang.String getOneofs(int index) {
            return ((com.google.protobuf.Type) this.instance).getOneofs(index);
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public com.google.protobuf.ByteString getOneofsBytes(int index) {
            return ((com.google.protobuf.Type) this.instance).getOneofsBytes(index);
        }

        public com.google.protobuf.Type.Builder setOneofs(int index, java.lang.String value) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).setOneofs(index, value);
            return this;
        }

        public com.google.protobuf.Type.Builder addOneofs(java.lang.String value) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).addOneofs(value);
            return this;
        }

        public com.google.protobuf.Type.Builder addAllOneofs(java.lang.Iterable<java.lang.String> values) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).addAllOneofs(values);
            return this;
        }

        public com.google.protobuf.Type.Builder clearOneofs() {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).clearOneofs();
            return this;
        }

        public com.google.protobuf.Type.Builder addOneofsBytes(com.google.protobuf.ByteString value) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).addOneofsBytes(value);
            return this;
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public java.util.List<com.google.protobuf.Option> getOptionsList() {
            return java.util.Collections.unmodifiableList(((com.google.protobuf.Type) this.instance).getOptionsList());
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public int getOptionsCount() {
            return ((com.google.protobuf.Type) this.instance).getOptionsCount();
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public com.google.protobuf.Option getOptions(int index) {
            return ((com.google.protobuf.Type) this.instance).getOptions(index);
        }

        public com.google.protobuf.Type.Builder setOptions(int index, com.google.protobuf.Option value) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).setOptions(index, value);
            return this;
        }

        public com.google.protobuf.Type.Builder setOptions(int index, com.google.protobuf.Option.Builder builderForValue) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).setOptions(index, builderForValue.build());
            return this;
        }

        public com.google.protobuf.Type.Builder addOptions(com.google.protobuf.Option value) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).addOptions(value);
            return this;
        }

        public com.google.protobuf.Type.Builder addOptions(int index, com.google.protobuf.Option value) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).addOptions(index, value);
            return this;
        }

        public com.google.protobuf.Type.Builder addOptions(com.google.protobuf.Option.Builder builderForValue) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).addOptions(builderForValue.build());
            return this;
        }

        public com.google.protobuf.Type.Builder addOptions(int index, com.google.protobuf.Option.Builder builderForValue) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).addOptions(index, builderForValue.build());
            return this;
        }

        public com.google.protobuf.Type.Builder addAllOptions(java.lang.Iterable<? extends com.google.protobuf.Option> values) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).addAllOptions(values);
            return this;
        }

        public com.google.protobuf.Type.Builder clearOptions() {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).clearOptions();
            return this;
        }

        public com.google.protobuf.Type.Builder removeOptions(int index) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).removeOptions(index);
            return this;
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public boolean hasSourceContext() {
            return ((com.google.protobuf.Type) this.instance).hasSourceContext();
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public com.google.protobuf.SourceContext getSourceContext() {
            return ((com.google.protobuf.Type) this.instance).getSourceContext();
        }

        public com.google.protobuf.Type.Builder setSourceContext(com.google.protobuf.SourceContext value) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).setSourceContext(value);
            return this;
        }

        public com.google.protobuf.Type.Builder setSourceContext(com.google.protobuf.SourceContext.Builder builderForValue) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).setSourceContext(builderForValue.build());
            return this;
        }

        public com.google.protobuf.Type.Builder mergeSourceContext(com.google.protobuf.SourceContext value) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).mergeSourceContext(value);
            return this;
        }

        public com.google.protobuf.Type.Builder clearSourceContext() {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).clearSourceContext();
            return this;
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public int getSyntaxValue() {
            return ((com.google.protobuf.Type) this.instance).getSyntaxValue();
        }

        public com.google.protobuf.Type.Builder setSyntaxValue(int value) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).setSyntaxValue(value);
            return this;
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public com.google.protobuf.Syntax getSyntax() {
            return ((com.google.protobuf.Type) this.instance).getSyntax();
        }

        public com.google.protobuf.Type.Builder setSyntax(com.google.protobuf.Syntax value) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).setSyntax(value);
            return this;
        }

        public com.google.protobuf.Type.Builder clearSyntax() {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).clearSyntax();
            return this;
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public java.lang.String getEdition() {
            return ((com.google.protobuf.Type) this.instance).getEdition();
        }

        @Override // com.google.protobuf.TypeOrBuilder
        public com.google.protobuf.ByteString getEditionBytes() {
            return ((com.google.protobuf.Type) this.instance).getEditionBytes();
        }

        public com.google.protobuf.Type.Builder setEdition(java.lang.String value) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).setEdition(value);
            return this;
        }

        public com.google.protobuf.Type.Builder clearEdition() {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).clearEdition();
            return this;
        }

        public com.google.protobuf.Type.Builder setEditionBytes(com.google.protobuf.ByteString value) {
            copyOnWrite();
            ((com.google.protobuf.Type) this.instance).setEditionBytes(value);
            return this;
        }
    }

    /* renamed from: com.google.protobuf.Type$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke method, java.lang.Object arg0, java.lang.Object arg1) {
        com.google.protobuf.Type.AnonymousClass1 anonymousClass1 = null;
        switch (com.google.protobuf.Type.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
            case 1:
                return new com.google.protobuf.Type();
            case 2:
                return new com.google.protobuf.Type.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003Ț\u0004\u001b\u0005ဉ\u0000\u0006\f\u0007Ȉ", new java.lang.Object[]{"bitField0_", "name_", "fields_", com.google.protobuf.Field.class, "oneofs_", "options_", com.google.protobuf.Option.class, "sourceContext_", "syntax_", "edition_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.google.protobuf.Type> parser = PARSER;
                if (parser == null) {
                    synchronized (com.google.protobuf.Type.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
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
        com.google.protobuf.Type type = new com.google.protobuf.Type();
        DEFAULT_INSTANCE = type;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.google.protobuf.Type.class, type);
    }

    public static com.google.protobuf.Type getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.protobuf.Parser<com.google.protobuf.Type> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
