package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes9.dex */
public final class Api extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<com.google.crypto.tink.shaded.protobuf.Api, com.google.crypto.tink.shaded.protobuf.Api.Builder> implements com.google.crypto.tink.shaded.protobuf.ApiOrBuilder {
    private static final com.google.crypto.tink.shaded.protobuf.Api DEFAULT_INSTANCE;
    public static final int METHODS_FIELD_NUMBER = 2;
    public static final int MIXINS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Api> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    public static final int VERSION_FIELD_NUMBER = 4;
    private int bitField0_;
    private com.google.crypto.tink.shaded.protobuf.SourceContext sourceContext_;
    private int syntax_;
    private java.lang.String name_ = "";
    private com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<com.google.crypto.tink.shaded.protobuf.Method> methods_ = emptyProtobufList();
    private com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<com.google.crypto.tink.shaded.protobuf.Option> options_ = emptyProtobufList();
    private java.lang.String version_ = "";
    private com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<com.google.crypto.tink.shaded.protobuf.Mixin> mixins_ = emptyProtobufList();

    private Api() {
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
    public final java.lang.String getName() {
        return this.name_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
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

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
    public final java.util.List<com.google.crypto.tink.shaded.protobuf.Method> getMethodsList() {
        return this.methods_;
    }

    public final java.util.List<? extends com.google.crypto.tink.shaded.protobuf.MethodOrBuilder> getMethodsOrBuilderList() {
        return this.methods_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
    public final int getMethodsCount() {
        return this.methods_.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
    public final com.google.crypto.tink.shaded.protobuf.Method getMethods(int i) {
        return this.methods_.get(i);
    }

    public final com.google.crypto.tink.shaded.protobuf.MethodOrBuilder getMethodsOrBuilder(int i) {
        return this.methods_.get(i);
    }

    private void ensureMethodsIsMutable() {
        com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<com.google.crypto.tink.shaded.protobuf.Method> protobufList = this.methods_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.methods_ = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMethods(int i, com.google.crypto.tink.shaded.protobuf.Method method) {
        ensureMethodsIsMutable();
        this.methods_.set(i, method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMethods(com.google.crypto.tink.shaded.protobuf.Method method) {
        ensureMethodsIsMutable();
        this.methods_.add(method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMethods(int i, com.google.crypto.tink.shaded.protobuf.Method method) {
        ensureMethodsIsMutable();
        this.methods_.add(i, method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMethods(java.lang.Iterable<? extends com.google.crypto.tink.shaded.protobuf.Method> iterable) {
        ensureMethodsIsMutable();
        com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.addAll(iterable, this.methods_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMethods() {
        this.methods_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMethods(int i) {
        ensureMethodsIsMutable();
        this.methods_.remove(i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
    public final java.util.List<com.google.crypto.tink.shaded.protobuf.Option> getOptionsList() {
        return this.options_;
    }

    public final java.util.List<? extends com.google.crypto.tink.shaded.protobuf.OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
    public final int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
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

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
    public final java.lang.String getVersion() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
    public final com.google.crypto.tink.shaded.protobuf.ByteString getVersionBytes() {
        return com.google.crypto.tink.shaded.protobuf.ByteString.copyFromUtf8(this.version_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(java.lang.String str) {
        this.version_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = getDefaultInstance().getVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersionBytes(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.version_ = byteString.toStringUtf8();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
    public final boolean hasSourceContext() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
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

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
    public final java.util.List<com.google.crypto.tink.shaded.protobuf.Mixin> getMixinsList() {
        return this.mixins_;
    }

    public final java.util.List<? extends com.google.crypto.tink.shaded.protobuf.MixinOrBuilder> getMixinsOrBuilderList() {
        return this.mixins_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
    public final int getMixinsCount() {
        return this.mixins_.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
    public final com.google.crypto.tink.shaded.protobuf.Mixin getMixins(int i) {
        return this.mixins_.get(i);
    }

    public final com.google.crypto.tink.shaded.protobuf.MixinOrBuilder getMixinsOrBuilder(int i) {
        return this.mixins_.get(i);
    }

    private void ensureMixinsIsMutable() {
        com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<com.google.crypto.tink.shaded.protobuf.Mixin> protobufList = this.mixins_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.mixins_ = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMixins(int i, com.google.crypto.tink.shaded.protobuf.Mixin mixin) {
        ensureMixinsIsMutable();
        this.mixins_.set(i, mixin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMixins(com.google.crypto.tink.shaded.protobuf.Mixin mixin) {
        ensureMixinsIsMutable();
        this.mixins_.add(mixin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMixins(int i, com.google.crypto.tink.shaded.protobuf.Mixin mixin) {
        ensureMixinsIsMutable();
        this.mixins_.add(i, mixin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMixins(java.lang.Iterable<? extends com.google.crypto.tink.shaded.protobuf.Mixin> iterable) {
        ensureMixinsIsMutable();
        com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.addAll(iterable, this.mixins_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMixins() {
        this.mixins_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMixins(int i) {
        ensureMixinsIsMutable();
        this.mixins_.remove(i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
    public final int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
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

    public static com.google.crypto.tink.shaded.protobuf.Api parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.shaded.protobuf.Api) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.crypto.tink.shaded.protobuf.Api parseFrom(java.nio.ByteBuffer byteBuffer, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.shaded.protobuf.Api) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.google.crypto.tink.shaded.protobuf.Api parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.shaded.protobuf.Api) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.google.crypto.tink.shaded.protobuf.Api parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.shaded.protobuf.Api) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.google.crypto.tink.shaded.protobuf.Api parseFrom(byte[] bArr) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.shaded.protobuf.Api) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.google.crypto.tink.shaded.protobuf.Api parseFrom(byte[] bArr, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.shaded.protobuf.Api) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.google.crypto.tink.shaded.protobuf.Api parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.crypto.tink.shaded.protobuf.Api) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.crypto.tink.shaded.protobuf.Api parseFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.shaded.protobuf.Api) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.shaded.protobuf.Api parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.crypto.tink.shaded.protobuf.Api) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.crypto.tink.shaded.protobuf.Api parseDelimitedFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.shaded.protobuf.Api) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.shaded.protobuf.Api parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (com.google.crypto.tink.shaded.protobuf.Api) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.google.crypto.tink.shaded.protobuf.Api parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.shaded.protobuf.Api) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.shaded.protobuf.Api.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.google.crypto.tink.shaded.protobuf.Api.Builder newBuilder(com.google.crypto.tink.shaded.protobuf.Api api) {
        return DEFAULT_INSTANCE.createBuilder(api);
    }

    public static final class Builder extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<com.google.crypto.tink.shaded.protobuf.Api, com.google.crypto.tink.shaded.protobuf.Api.Builder> implements com.google.crypto.tink.shaded.protobuf.ApiOrBuilder {
        /* synthetic */ Builder(com.google.crypto.tink.shaded.protobuf.Api.AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(com.google.crypto.tink.shaded.protobuf.Api.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public final java.lang.String getName() {
            return ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).getName();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public final com.google.crypto.tink.shaded.protobuf.ByteString getNameBytes() {
            return ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).getNameBytes();
        }

        public final com.google.crypto.tink.shaded.protobuf.Api.Builder setName(java.lang.String str) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).setName(str);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Api.Builder clearName() {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).clearName();
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Api.Builder setNameBytes(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).setNameBytes(byteString);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public final java.util.List<com.google.crypto.tink.shaded.protobuf.Method> getMethodsList() {
            return java.util.Collections.unmodifiableList(((com.google.crypto.tink.shaded.protobuf.Api) this.instance).getMethodsList());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public final int getMethodsCount() {
            return ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).getMethodsCount();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public final com.google.crypto.tink.shaded.protobuf.Method getMethods(int i) {
            return ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).getMethods(i);
        }

        public final com.google.crypto.tink.shaded.protobuf.Api.Builder setMethods(int i, com.google.crypto.tink.shaded.protobuf.Method method) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).setMethods(i, method);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Api.Builder setMethods(int i, com.google.crypto.tink.shaded.protobuf.Method.Builder builder) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).setMethods(i, builder.build());
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Api.Builder addMethods(com.google.crypto.tink.shaded.protobuf.Method method) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).addMethods(method);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Api.Builder addMethods(int i, com.google.crypto.tink.shaded.protobuf.Method method) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).addMethods(i, method);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Api.Builder addMethods(com.google.crypto.tink.shaded.protobuf.Method.Builder builder) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).addMethods(builder.build());
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Api.Builder addMethods(int i, com.google.crypto.tink.shaded.protobuf.Method.Builder builder) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).addMethods(i, builder.build());
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Api.Builder addAllMethods(java.lang.Iterable<? extends com.google.crypto.tink.shaded.protobuf.Method> iterable) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).addAllMethods(iterable);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Api.Builder clearMethods() {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).clearMethods();
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Api.Builder removeMethods(int i) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).removeMethods(i);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public final java.util.List<com.google.crypto.tink.shaded.protobuf.Option> getOptionsList() {
            return java.util.Collections.unmodifiableList(((com.google.crypto.tink.shaded.protobuf.Api) this.instance).getOptionsList());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public final int getOptionsCount() {
            return ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).getOptionsCount();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public final com.google.crypto.tink.shaded.protobuf.Option getOptions(int i) {
            return ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).getOptions(i);
        }

        public final com.google.crypto.tink.shaded.protobuf.Api.Builder setOptions(int i, com.google.crypto.tink.shaded.protobuf.Option option) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).setOptions(i, option);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Api.Builder setOptions(int i, com.google.crypto.tink.shaded.protobuf.Option.Builder builder) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).setOptions(i, builder.build());
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Api.Builder addOptions(com.google.crypto.tink.shaded.protobuf.Option option) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).addOptions(option);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Api.Builder addOptions(int i, com.google.crypto.tink.shaded.protobuf.Option option) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).addOptions(i, option);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Api.Builder addOptions(com.google.crypto.tink.shaded.protobuf.Option.Builder builder) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).addOptions(builder.build());
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Api.Builder addOptions(int i, com.google.crypto.tink.shaded.protobuf.Option.Builder builder) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).addOptions(i, builder.build());
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Api.Builder addAllOptions(java.lang.Iterable<? extends com.google.crypto.tink.shaded.protobuf.Option> iterable) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).addAllOptions(iterable);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Api.Builder clearOptions() {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).clearOptions();
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Api.Builder removeOptions(int i) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).removeOptions(i);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public final java.lang.String getVersion() {
            return ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).getVersion();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public final com.google.crypto.tink.shaded.protobuf.ByteString getVersionBytes() {
            return ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).getVersionBytes();
        }

        public final com.google.crypto.tink.shaded.protobuf.Api.Builder setVersion(java.lang.String str) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).setVersion(str);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Api.Builder clearVersion() {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).clearVersion();
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Api.Builder setVersionBytes(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).setVersionBytes(byteString);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public final boolean hasSourceContext() {
            return ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).hasSourceContext();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public final com.google.crypto.tink.shaded.protobuf.SourceContext getSourceContext() {
            return ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).getSourceContext();
        }

        public final com.google.crypto.tink.shaded.protobuf.Api.Builder setSourceContext(com.google.crypto.tink.shaded.protobuf.SourceContext sourceContext) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).setSourceContext(sourceContext);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Api.Builder setSourceContext(com.google.crypto.tink.shaded.protobuf.SourceContext.Builder builder) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).setSourceContext(builder.build());
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Api.Builder mergeSourceContext(com.google.crypto.tink.shaded.protobuf.SourceContext sourceContext) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).mergeSourceContext(sourceContext);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Api.Builder clearSourceContext() {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).clearSourceContext();
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public final java.util.List<com.google.crypto.tink.shaded.protobuf.Mixin> getMixinsList() {
            return java.util.Collections.unmodifiableList(((com.google.crypto.tink.shaded.protobuf.Api) this.instance).getMixinsList());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public final int getMixinsCount() {
            return ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).getMixinsCount();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public final com.google.crypto.tink.shaded.protobuf.Mixin getMixins(int i) {
            return ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).getMixins(i);
        }

        public final com.google.crypto.tink.shaded.protobuf.Api.Builder setMixins(int i, com.google.crypto.tink.shaded.protobuf.Mixin mixin) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).setMixins(i, mixin);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Api.Builder setMixins(int i, com.google.crypto.tink.shaded.protobuf.Mixin.Builder builder) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).setMixins(i, builder.build());
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Api.Builder addMixins(com.google.crypto.tink.shaded.protobuf.Mixin mixin) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).addMixins(mixin);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Api.Builder addMixins(int i, com.google.crypto.tink.shaded.protobuf.Mixin mixin) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).addMixins(i, mixin);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Api.Builder addMixins(com.google.crypto.tink.shaded.protobuf.Mixin.Builder builder) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).addMixins(builder.build());
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Api.Builder addMixins(int i, com.google.crypto.tink.shaded.protobuf.Mixin.Builder builder) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).addMixins(i, builder.build());
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Api.Builder addAllMixins(java.lang.Iterable<? extends com.google.crypto.tink.shaded.protobuf.Mixin> iterable) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).addAllMixins(iterable);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Api.Builder clearMixins() {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).clearMixins();
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Api.Builder removeMixins(int i) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).removeMixins(i);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public final int getSyntaxValue() {
            return ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).getSyntaxValue();
        }

        public final com.google.crypto.tink.shaded.protobuf.Api.Builder setSyntaxValue(int i) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).setSyntaxValue(i);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ApiOrBuilder
        public final com.google.crypto.tink.shaded.protobuf.Syntax getSyntax() {
            return ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).getSyntax();
        }

        public final com.google.crypto.tink.shaded.protobuf.Api.Builder setSyntax(com.google.crypto.tink.shaded.protobuf.Syntax syntax) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).setSyntax(syntax);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Api.Builder clearSyntax() {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Api) this.instance).clearSyntax();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.Api$1, reason: invalid class name */
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
        com.google.crypto.tink.shaded.protobuf.Api.AnonymousClass1 anonymousClass1 = null;
        switch (com.google.crypto.tink.shaded.protobuf.Api.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new com.google.crypto.tink.shaded.protobuf.Api();
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.Api.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004Ȉ\u0005ဉ\u0000\u0006\u001b\u0007\f", new java.lang.Object[]{"bitField0_", "name_", "methods_", com.google.crypto.tink.shaded.protobuf.Method.class, "options_", com.google.crypto.tink.shaded.protobuf.Option.class, "version_", "sourceContext_", "mixins_", com.google.crypto.tink.shaded.protobuf.Mixin.class, "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Api> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.google.crypto.tink.shaded.protobuf.Api.class) {
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
        com.google.crypto.tink.shaded.protobuf.Api api = new com.google.crypto.tink.shaded.protobuf.Api();
        DEFAULT_INSTANCE = api;
        com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.registerDefaultInstance(com.google.crypto.tink.shaded.protobuf.Api.class, api);
    }

    public static com.google.crypto.tink.shaded.protobuf.Api getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Api> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
