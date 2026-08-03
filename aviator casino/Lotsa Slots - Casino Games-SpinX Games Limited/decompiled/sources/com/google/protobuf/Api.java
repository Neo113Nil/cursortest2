package com.google.protobuf;

/* loaded from: classes4.dex */
public final class Api extends com.google.protobuf.GeneratedMessageLite<com.google.protobuf.Api, com.google.protobuf.Api.Builder> implements com.google.protobuf.ApiOrBuilder {
    private static final com.google.protobuf.Api DEFAULT_INSTANCE;
    public static final int METHODS_FIELD_NUMBER = 2;
    public static final int MIXINS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile com.google.protobuf.Parser<com.google.protobuf.Api> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    public static final int VERSION_FIELD_NUMBER = 4;
    private int bitField0_;
    private com.google.protobuf.SourceContext sourceContext_;
    private int syntax_;
    private java.lang.String name_ = "";
    private com.google.protobuf.Internal.ProtobufList<com.google.protobuf.Method> methods_ = emptyProtobufList();
    private com.google.protobuf.Internal.ProtobufList<com.google.protobuf.Option> options_ = emptyProtobufList();
    private java.lang.String version_ = "";
    private com.google.protobuf.Internal.ProtobufList<com.google.protobuf.Mixin> mixins_ = emptyProtobufList();

    private Api() {
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public java.lang.String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.ApiOrBuilder
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

    @Override // com.google.protobuf.ApiOrBuilder
    public java.util.List<com.google.protobuf.Method> getMethodsList() {
        return this.methods_;
    }

    public java.util.List<? extends com.google.protobuf.MethodOrBuilder> getMethodsOrBuilderList() {
        return this.methods_;
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public int getMethodsCount() {
        return this.methods_.size();
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public com.google.protobuf.Method getMethods(int index) {
        return this.methods_.get(index);
    }

    public com.google.protobuf.MethodOrBuilder getMethodsOrBuilder(int index) {
        return this.methods_.get(index);
    }

    private void ensureMethodsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<com.google.protobuf.Method> protobufList = this.methods_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.methods_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMethods(int index, com.google.protobuf.Method value) {
        value.getClass();
        ensureMethodsIsMutable();
        this.methods_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMethods(com.google.protobuf.Method value) {
        value.getClass();
        ensureMethodsIsMutable();
        this.methods_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMethods(int index, com.google.protobuf.Method value) {
        value.getClass();
        ensureMethodsIsMutable();
        this.methods_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMethods(java.lang.Iterable<? extends com.google.protobuf.Method> values) {
        ensureMethodsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) values, (java.util.List) this.methods_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMethods() {
        this.methods_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMethods(int index) {
        ensureMethodsIsMutable();
        this.methods_.remove(index);
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public java.util.List<com.google.protobuf.Option> getOptionsList() {
        return this.options_;
    }

    public java.util.List<? extends com.google.protobuf.OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.ApiOrBuilder
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

    @Override // com.google.protobuf.ApiOrBuilder
    public java.lang.String getVersion() {
        return this.version_;
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public com.google.protobuf.ByteString getVersionBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.version_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(java.lang.String value) {
        value.getClass();
        this.version_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = getDefaultInstance().getVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersionBytes(com.google.protobuf.ByteString value) {
        checkByteStringIsUtf8(value);
        this.version_ = value.toStringUtf8();
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public boolean hasSourceContext() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.ApiOrBuilder
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

    @Override // com.google.protobuf.ApiOrBuilder
    public java.util.List<com.google.protobuf.Mixin> getMixinsList() {
        return this.mixins_;
    }

    public java.util.List<? extends com.google.protobuf.MixinOrBuilder> getMixinsOrBuilderList() {
        return this.mixins_;
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public int getMixinsCount() {
        return this.mixins_.size();
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public com.google.protobuf.Mixin getMixins(int index) {
        return this.mixins_.get(index);
    }

    public com.google.protobuf.MixinOrBuilder getMixinsOrBuilder(int index) {
        return this.mixins_.get(index);
    }

    private void ensureMixinsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<com.google.protobuf.Mixin> protobufList = this.mixins_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.mixins_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMixins(int index, com.google.protobuf.Mixin value) {
        value.getClass();
        ensureMixinsIsMutable();
        this.mixins_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMixins(com.google.protobuf.Mixin value) {
        value.getClass();
        ensureMixinsIsMutable();
        this.mixins_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMixins(int index, com.google.protobuf.Mixin value) {
        value.getClass();
        ensureMixinsIsMutable();
        this.mixins_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMixins(java.lang.Iterable<? extends com.google.protobuf.Mixin> values) {
        ensureMixinsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) values, (java.util.List) this.mixins_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMixins() {
        this.mixins_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMixins(int index) {
        ensureMixinsIsMutable();
        this.mixins_.remove(index);
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // com.google.protobuf.ApiOrBuilder
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

    public static com.google.protobuf.Api parseFrom(java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Api) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static com.google.protobuf.Api parseFrom(java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Api) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static com.google.protobuf.Api parseFrom(com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Api) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static com.google.protobuf.Api parseFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Api) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static com.google.protobuf.Api parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Api) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static com.google.protobuf.Api parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
        return (com.google.protobuf.Api) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static com.google.protobuf.Api parseFrom(java.io.InputStream input) throws java.io.IOException {
        return (com.google.protobuf.Api) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static com.google.protobuf.Api parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (com.google.protobuf.Api) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static com.google.protobuf.Api parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
        return (com.google.protobuf.Api) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static com.google.protobuf.Api parseDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (com.google.protobuf.Api) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static com.google.protobuf.Api parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        return (com.google.protobuf.Api) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static com.google.protobuf.Api parseFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return (com.google.protobuf.Api) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static com.google.protobuf.Api.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.google.protobuf.Api.Builder newBuilder(com.google.protobuf.Api prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<com.google.protobuf.Api, com.google.protobuf.Api.Builder> implements com.google.protobuf.ApiOrBuilder {
        /* synthetic */ Builder(com.google.protobuf.Api.AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(com.google.protobuf.Api.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public java.lang.String getName() {
            return ((com.google.protobuf.Api) this.instance).getName();
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public com.google.protobuf.ByteString getNameBytes() {
            return ((com.google.protobuf.Api) this.instance).getNameBytes();
        }

        public com.google.protobuf.Api.Builder setName(java.lang.String value) {
            copyOnWrite();
            ((com.google.protobuf.Api) this.instance).setName(value);
            return this;
        }

        public com.google.protobuf.Api.Builder clearName() {
            copyOnWrite();
            ((com.google.protobuf.Api) this.instance).clearName();
            return this;
        }

        public com.google.protobuf.Api.Builder setNameBytes(com.google.protobuf.ByteString value) {
            copyOnWrite();
            ((com.google.protobuf.Api) this.instance).setNameBytes(value);
            return this;
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public java.util.List<com.google.protobuf.Method> getMethodsList() {
            return java.util.Collections.unmodifiableList(((com.google.protobuf.Api) this.instance).getMethodsList());
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public int getMethodsCount() {
            return ((com.google.protobuf.Api) this.instance).getMethodsCount();
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public com.google.protobuf.Method getMethods(int index) {
            return ((com.google.protobuf.Api) this.instance).getMethods(index);
        }

        public com.google.protobuf.Api.Builder setMethods(int index, com.google.protobuf.Method value) {
            copyOnWrite();
            ((com.google.protobuf.Api) this.instance).setMethods(index, value);
            return this;
        }

        public com.google.protobuf.Api.Builder setMethods(int index, com.google.protobuf.Method.Builder builderForValue) {
            copyOnWrite();
            ((com.google.protobuf.Api) this.instance).setMethods(index, builderForValue.build());
            return this;
        }

        public com.google.protobuf.Api.Builder addMethods(com.google.protobuf.Method value) {
            copyOnWrite();
            ((com.google.protobuf.Api) this.instance).addMethods(value);
            return this;
        }

        public com.google.protobuf.Api.Builder addMethods(int index, com.google.protobuf.Method value) {
            copyOnWrite();
            ((com.google.protobuf.Api) this.instance).addMethods(index, value);
            return this;
        }

        public com.google.protobuf.Api.Builder addMethods(com.google.protobuf.Method.Builder builderForValue) {
            copyOnWrite();
            ((com.google.protobuf.Api) this.instance).addMethods(builderForValue.build());
            return this;
        }

        public com.google.protobuf.Api.Builder addMethods(int index, com.google.protobuf.Method.Builder builderForValue) {
            copyOnWrite();
            ((com.google.protobuf.Api) this.instance).addMethods(index, builderForValue.build());
            return this;
        }

        public com.google.protobuf.Api.Builder addAllMethods(java.lang.Iterable<? extends com.google.protobuf.Method> values) {
            copyOnWrite();
            ((com.google.protobuf.Api) this.instance).addAllMethods(values);
            return this;
        }

        public com.google.protobuf.Api.Builder clearMethods() {
            copyOnWrite();
            ((com.google.protobuf.Api) this.instance).clearMethods();
            return this;
        }

        public com.google.protobuf.Api.Builder removeMethods(int index) {
            copyOnWrite();
            ((com.google.protobuf.Api) this.instance).removeMethods(index);
            return this;
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public java.util.List<com.google.protobuf.Option> getOptionsList() {
            return java.util.Collections.unmodifiableList(((com.google.protobuf.Api) this.instance).getOptionsList());
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public int getOptionsCount() {
            return ((com.google.protobuf.Api) this.instance).getOptionsCount();
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public com.google.protobuf.Option getOptions(int index) {
            return ((com.google.protobuf.Api) this.instance).getOptions(index);
        }

        public com.google.protobuf.Api.Builder setOptions(int index, com.google.protobuf.Option value) {
            copyOnWrite();
            ((com.google.protobuf.Api) this.instance).setOptions(index, value);
            return this;
        }

        public com.google.protobuf.Api.Builder setOptions(int index, com.google.protobuf.Option.Builder builderForValue) {
            copyOnWrite();
            ((com.google.protobuf.Api) this.instance).setOptions(index, builderForValue.build());
            return this;
        }

        public com.google.protobuf.Api.Builder addOptions(com.google.protobuf.Option value) {
            copyOnWrite();
            ((com.google.protobuf.Api) this.instance).addOptions(value);
            return this;
        }

        public com.google.protobuf.Api.Builder addOptions(int index, com.google.protobuf.Option value) {
            copyOnWrite();
            ((com.google.protobuf.Api) this.instance).addOptions(index, value);
            return this;
        }

        public com.google.protobuf.Api.Builder addOptions(com.google.protobuf.Option.Builder builderForValue) {
            copyOnWrite();
            ((com.google.protobuf.Api) this.instance).addOptions(builderForValue.build());
            return this;
        }

        public com.google.protobuf.Api.Builder addOptions(int index, com.google.protobuf.Option.Builder builderForValue) {
            copyOnWrite();
            ((com.google.protobuf.Api) this.instance).addOptions(index, builderForValue.build());
            return this;
        }

        public com.google.protobuf.Api.Builder addAllOptions(java.lang.Iterable<? extends com.google.protobuf.Option> values) {
            copyOnWrite();
            ((com.google.protobuf.Api) this.instance).addAllOptions(values);
            return this;
        }

        public com.google.protobuf.Api.Builder clearOptions() {
            copyOnWrite();
            ((com.google.protobuf.Api) this.instance).clearOptions();
            return this;
        }

        public com.google.protobuf.Api.Builder removeOptions(int index) {
            copyOnWrite();
            ((com.google.protobuf.Api) this.instance).removeOptions(index);
            return this;
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public java.lang.String getVersion() {
            return ((com.google.protobuf.Api) this.instance).getVersion();
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public com.google.protobuf.ByteString getVersionBytes() {
            return ((com.google.protobuf.Api) this.instance).getVersionBytes();
        }

        public com.google.protobuf.Api.Builder setVersion(java.lang.String value) {
            copyOnWrite();
            ((com.google.protobuf.Api) this.instance).setVersion(value);
            return this;
        }

        public com.google.protobuf.Api.Builder clearVersion() {
            copyOnWrite();
            ((com.google.protobuf.Api) this.instance).clearVersion();
            return this;
        }

        public com.google.protobuf.Api.Builder setVersionBytes(com.google.protobuf.ByteString value) {
            copyOnWrite();
            ((com.google.protobuf.Api) this.instance).setVersionBytes(value);
            return this;
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public boolean hasSourceContext() {
            return ((com.google.protobuf.Api) this.instance).hasSourceContext();
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public com.google.protobuf.SourceContext getSourceContext() {
            return ((com.google.protobuf.Api) this.instance).getSourceContext();
        }

        public com.google.protobuf.Api.Builder setSourceContext(com.google.protobuf.SourceContext value) {
            copyOnWrite();
            ((com.google.protobuf.Api) this.instance).setSourceContext(value);
            return this;
        }

        public com.google.protobuf.Api.Builder setSourceContext(com.google.protobuf.SourceContext.Builder builderForValue) {
            copyOnWrite();
            ((com.google.protobuf.Api) this.instance).setSourceContext(builderForValue.build());
            return this;
        }

        public com.google.protobuf.Api.Builder mergeSourceContext(com.google.protobuf.SourceContext value) {
            copyOnWrite();
            ((com.google.protobuf.Api) this.instance).mergeSourceContext(value);
            return this;
        }

        public com.google.protobuf.Api.Builder clearSourceContext() {
            copyOnWrite();
            ((com.google.protobuf.Api) this.instance).clearSourceContext();
            return this;
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public java.util.List<com.google.protobuf.Mixin> getMixinsList() {
            return java.util.Collections.unmodifiableList(((com.google.protobuf.Api) this.instance).getMixinsList());
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public int getMixinsCount() {
            return ((com.google.protobuf.Api) this.instance).getMixinsCount();
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public com.google.protobuf.Mixin getMixins(int index) {
            return ((com.google.protobuf.Api) this.instance).getMixins(index);
        }

        public com.google.protobuf.Api.Builder setMixins(int index, com.google.protobuf.Mixin value) {
            copyOnWrite();
            ((com.google.protobuf.Api) this.instance).setMixins(index, value);
            return this;
        }

        public com.google.protobuf.Api.Builder setMixins(int index, com.google.protobuf.Mixin.Builder builderForValue) {
            copyOnWrite();
            ((com.google.protobuf.Api) this.instance).setMixins(index, builderForValue.build());
            return this;
        }

        public com.google.protobuf.Api.Builder addMixins(com.google.protobuf.Mixin value) {
            copyOnWrite();
            ((com.google.protobuf.Api) this.instance).addMixins(value);
            return this;
        }

        public com.google.protobuf.Api.Builder addMixins(int index, com.google.protobuf.Mixin value) {
            copyOnWrite();
            ((com.google.protobuf.Api) this.instance).addMixins(index, value);
            return this;
        }

        public com.google.protobuf.Api.Builder addMixins(com.google.protobuf.Mixin.Builder builderForValue) {
            copyOnWrite();
            ((com.google.protobuf.Api) this.instance).addMixins(builderForValue.build());
            return this;
        }

        public com.google.protobuf.Api.Builder addMixins(int index, com.google.protobuf.Mixin.Builder builderForValue) {
            copyOnWrite();
            ((com.google.protobuf.Api) this.instance).addMixins(index, builderForValue.build());
            return this;
        }

        public com.google.protobuf.Api.Builder addAllMixins(java.lang.Iterable<? extends com.google.protobuf.Mixin> values) {
            copyOnWrite();
            ((com.google.protobuf.Api) this.instance).addAllMixins(values);
            return this;
        }

        public com.google.protobuf.Api.Builder clearMixins() {
            copyOnWrite();
            ((com.google.protobuf.Api) this.instance).clearMixins();
            return this;
        }

        public com.google.protobuf.Api.Builder removeMixins(int index) {
            copyOnWrite();
            ((com.google.protobuf.Api) this.instance).removeMixins(index);
            return this;
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public int getSyntaxValue() {
            return ((com.google.protobuf.Api) this.instance).getSyntaxValue();
        }

        public com.google.protobuf.Api.Builder setSyntaxValue(int value) {
            copyOnWrite();
            ((com.google.protobuf.Api) this.instance).setSyntaxValue(value);
            return this;
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public com.google.protobuf.Syntax getSyntax() {
            return ((com.google.protobuf.Api) this.instance).getSyntax();
        }

        public com.google.protobuf.Api.Builder setSyntax(com.google.protobuf.Syntax value) {
            copyOnWrite();
            ((com.google.protobuf.Api) this.instance).setSyntax(value);
            return this;
        }

        public com.google.protobuf.Api.Builder clearSyntax() {
            copyOnWrite();
            ((com.google.protobuf.Api) this.instance).clearSyntax();
            return this;
        }
    }

    /* renamed from: com.google.protobuf.Api$1, reason: invalid class name */
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
        com.google.protobuf.Api.AnonymousClass1 anonymousClass1 = null;
        switch (com.google.protobuf.Api.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
            case 1:
                return new com.google.protobuf.Api();
            case 2:
                return new com.google.protobuf.Api.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004Ȉ\u0005ဉ\u0000\u0006\u001b\u0007\f", new java.lang.Object[]{"bitField0_", "name_", "methods_", com.google.protobuf.Method.class, "options_", com.google.protobuf.Option.class, "version_", "sourceContext_", "mixins_", com.google.protobuf.Mixin.class, "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.google.protobuf.Api> parser = PARSER;
                if (parser == null) {
                    synchronized (com.google.protobuf.Api.class) {
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
        com.google.protobuf.Api api = new com.google.protobuf.Api();
        DEFAULT_INSTANCE = api;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.google.protobuf.Api.class, api);
    }

    public static com.google.protobuf.Api getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.protobuf.Parser<com.google.protobuf.Api> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
