package androidx.content.preferences.protobuf;

/* loaded from: classes7.dex */
public final class Api extends androidx.content.preferences.protobuf.GeneratedMessageLite<androidx.content.preferences.protobuf.Api, androidx.datastore.preferences.protobuf.Api.Builder> implements androidx.content.preferences.protobuf.ApiOrBuilder {
    private static final androidx.content.preferences.protobuf.Api DEFAULT_INSTANCE;
    public static final int METHODS_FIELD_NUMBER = 2;
    public static final int MIXINS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile androidx.content.preferences.protobuf.Parser<androidx.content.preferences.protobuf.Api> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    public static final int VERSION_FIELD_NUMBER = 4;
    private int bitField0_;
    private androidx.content.preferences.protobuf.SourceContext sourceContext_;
    private int syntax_;
    private java.lang.String name_ = "";
    private androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Method> methods_ = emptyProtobufList();
    private androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Option> options_ = emptyProtobufList();
    private java.lang.String version_ = "";
    private androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Mixin> mixins_ = emptyProtobufList();

    private Api() {
    }

    @Override // androidx.content.preferences.protobuf.ApiOrBuilder
    public final java.lang.String getName() {
        return this.name_;
    }

    @Override // androidx.content.preferences.protobuf.ApiOrBuilder
    public final androidx.content.preferences.protobuf.ByteString getNameBytes() {
        return androidx.content.preferences.protobuf.ByteString.copyFromUtf8(this.name_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getHighSpeedVideoSizes(java.lang.String str) {
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getOutputMinFrameDurationlomOqCM() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getHighSpeedVideoSizes(androidx.content.preferences.protobuf.ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    @Override // androidx.content.preferences.protobuf.ApiOrBuilder
    public final java.util.List<androidx.content.preferences.protobuf.Method> getMethodsList() {
        return this.methods_;
    }

    public final java.util.List<? extends androidx.content.preferences.protobuf.MethodOrBuilder> getMethodsOrBuilderList() {
        return this.methods_;
    }

    @Override // androidx.content.preferences.protobuf.ApiOrBuilder
    public final int getMethodsCount() {
        return this.methods_.size();
    }

    @Override // androidx.content.preferences.protobuf.ApiOrBuilder
    public final androidx.content.preferences.protobuf.Method getMethods(int i) {
        return this.methods_.get(i);
    }

    public final androidx.content.preferences.protobuf.MethodOrBuilder getMethodsOrBuilder(int i) {
        return this.methods_.get(i);
    }

    private void ArtificialStackFrames() {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Method> protobufList = this.methods_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.methods_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getHighSpeedVideoFpsRanges(int i, androidx.content.preferences.protobuf.Method method) {
        ArtificialStackFrames();
        this.methods_.set(i, method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.Method method) {
        ArtificialStackFrames();
        this.methods_.add(method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getHighSpeedVideoSizes(int i, androidx.content.preferences.protobuf.Method method) {
        ArtificialStackFrames();
        this.methods_.add(i, method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Camera2StreamConfigurationMap(java.lang.Iterable<? extends androidx.content.preferences.protobuf.Method> iterable) {
        ArtificialStackFrames();
        androidx.content.preferences.protobuf.AbstractMessageLite.addAll(iterable, this.methods_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getHighSpeedVideoSizes() {
        this.methods_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Camera2StreamConfigurationMap(int i) {
        ArtificialStackFrames();
        this.methods_.remove(i);
    }

    @Override // androidx.content.preferences.protobuf.ApiOrBuilder
    public final java.util.List<androidx.content.preferences.protobuf.Option> getOptionsList() {
        return this.options_;
    }

    public final java.util.List<? extends androidx.content.preferences.protobuf.OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // androidx.content.preferences.protobuf.ApiOrBuilder
    public final int getOptionsCount() {
        return this.options_.size();
    }

    @Override // androidx.content.preferences.protobuf.ApiOrBuilder
    public final androidx.content.preferences.protobuf.Option getOptions(int i) {
        return this.options_.get(i);
    }

    public final androidx.content.preferences.protobuf.OptionOrBuilder getOptionsOrBuilder(int i) {
        return this.options_.get(i);
    }

    private void accessartificialFrame() {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Option> protobufList = this.options_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.options_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getHighSpeedVideoFpsRangesFor(int i, androidx.content.preferences.protobuf.Option option) {
        accessartificialFrame();
        this.options_.set(i, option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.Option option) {
        accessartificialFrame();
        this.options_.add(option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getHighSpeedVideoSizes(int i, androidx.content.preferences.protobuf.Option option) {
        accessartificialFrame();
        this.options_.add(i, option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getHighSpeedVideoFpsRangesFor(java.lang.Iterable<? extends androidx.content.preferences.protobuf.Option> iterable) {
        accessartificialFrame();
        androidx.content.preferences.protobuf.AbstractMessageLite.addAll(iterable, this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void isOutputSupportedForhNQ4ISI() {
        this.options_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getHighSpeedVideoFpsRangesFor(int i) {
        accessartificialFrame();
        this.options_.remove(i);
    }

    @Override // androidx.content.preferences.protobuf.ApiOrBuilder
    public final java.lang.String getVersion() {
        return this.version_;
    }

    @Override // androidx.content.preferences.protobuf.ApiOrBuilder
    public final androidx.content.preferences.protobuf.ByteString getVersionBytes() {
        return androidx.content.preferences.protobuf.ByteString.copyFromUtf8(this.version_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Camera2StreamConfigurationMap(java.lang.String str) {
        this.version_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unwrapAs() {
        this.version_ = getDefaultInstance().getVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getHighSpeedVideoFpsRangesFor(androidx.content.preferences.protobuf.ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.version_ = byteString.toStringUtf8();
    }

    @Override // androidx.content.preferences.protobuf.ApiOrBuilder
    public final boolean hasSourceContext() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.content.preferences.protobuf.ApiOrBuilder
    public final androidx.content.preferences.protobuf.SourceContext getSourceContext() {
        androidx.content.preferences.protobuf.SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? androidx.content.preferences.protobuf.SourceContext.getDefaultInstance() : sourceContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.SourceContext sourceContext) {
        this.sourceContext_ = sourceContext;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getHighSpeedVideoFpsRangesFor(androidx.content.preferences.protobuf.SourceContext sourceContext) {
        androidx.content.preferences.protobuf.SourceContext sourceContext2 = this.sourceContext_;
        if (sourceContext2 != null && sourceContext2 != androidx.content.preferences.protobuf.SourceContext.getDefaultInstance()) {
            this.sourceContext_ = androidx.content.preferences.protobuf.SourceContext.newBuilder(this.sourceContext_).mergeFrom((androidx.datastore.preferences.protobuf.SourceContext.Builder) sourceContext).buildPartial();
        } else {
            this.sourceContext_ = sourceContext;
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void isOutputSupportedFor() {
        this.sourceContext_ = null;
        this.bitField0_ &= -2;
    }

    @Override // androidx.content.preferences.protobuf.ApiOrBuilder
    public final java.util.List<androidx.content.preferences.protobuf.Mixin> getMixinsList() {
        return this.mixins_;
    }

    public final java.util.List<? extends androidx.content.preferences.protobuf.MixinOrBuilder> getMixinsOrBuilderList() {
        return this.mixins_;
    }

    @Override // androidx.content.preferences.protobuf.ApiOrBuilder
    public final int getMixinsCount() {
        return this.mixins_.size();
    }

    @Override // androidx.content.preferences.protobuf.ApiOrBuilder
    public final androidx.content.preferences.protobuf.Mixin getMixins(int i) {
        return this.mixins_.get(i);
    }

    public final androidx.content.preferences.protobuf.MixinOrBuilder getMixinsOrBuilder(int i) {
        return this.mixins_.get(i);
    }

    private void coroutineCreation() {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Mixin> protobufList = this.mixins_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.mixins_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getHighSpeedVideoSizes(int i, androidx.content.preferences.protobuf.Mixin mixin) {
        coroutineCreation();
        this.mixins_.set(i, mixin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.Mixin mixin) {
        coroutineCreation();
        this.mixins_.add(mixin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Camera2StreamConfigurationMap(int i, androidx.content.preferences.protobuf.Mixin mixin) {
        coroutineCreation();
        this.mixins_.add(i, mixin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getHighResolutionOutputSizeshNQ4ISI(java.lang.Iterable<? extends androidx.content.preferences.protobuf.Mixin> iterable) {
        coroutineCreation();
        androidx.content.preferences.protobuf.AbstractMessageLite.addAll(iterable, this.mixins_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getHighSpeedVideoFpsRanges() {
        this.mixins_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getHighSpeedVideoSizes(int i) {
        coroutineCreation();
        this.mixins_.remove(i);
    }

    @Override // androidx.content.preferences.protobuf.ApiOrBuilder
    public final int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // androidx.content.preferences.protobuf.ApiOrBuilder
    public final androidx.content.preferences.protobuf.Syntax getSyntax() {
        androidx.content.preferences.protobuf.Syntax forNumber = androidx.content.preferences.protobuf.Syntax.forNumber(this.syntax_);
        return forNumber == null ? androidx.content.preferences.protobuf.Syntax.UNRECOGNIZED : forNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getOutputMinFrameDuration(int i) {
        this.syntax_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.Syntax syntax) {
        this.syntax_ = syntax.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getValidOutputFormatsForInputhNQ4ISI() {
        this.syntax_ = 0;
    }

    public static androidx.content.preferences.protobuf.Api parseFrom(java.nio.ByteBuffer byteBuffer) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Api) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static androidx.content.preferences.protobuf.Api parseFrom(java.nio.ByteBuffer byteBuffer, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Api) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Api parseFrom(androidx.content.preferences.protobuf.ByteString byteString) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Api) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static androidx.content.preferences.protobuf.Api parseFrom(androidx.content.preferences.protobuf.ByteString byteString, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Api) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Api parseFrom(byte[] bArr) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Api) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static androidx.content.preferences.protobuf.Api parseFrom(byte[] bArr, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Api) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Api parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Api) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static androidx.content.preferences.protobuf.Api parseFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Api) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Api parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Api) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static androidx.content.preferences.protobuf.Api parseDelimitedFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Api) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Api parseFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Api) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static androidx.content.preferences.protobuf.Api parseFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Api) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static androidx.datastore.preferences.protobuf.Api.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static androidx.datastore.preferences.protobuf.Api.Builder newBuilder(androidx.content.preferences.protobuf.Api api) {
        return DEFAULT_INSTANCE.createBuilder(api);
    }

    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<androidx.content.preferences.protobuf.Api, androidx.datastore.preferences.protobuf.Api.Builder> implements androidx.content.preferences.protobuf.ApiOrBuilder {
        /* synthetic */ Builder(androidx.content.preferences.protobuf.Api.AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(androidx.content.preferences.protobuf.Api.DEFAULT_INSTANCE);
        }

        @Override // androidx.content.preferences.protobuf.ApiOrBuilder
        public final java.lang.String getName() {
            return ((androidx.content.preferences.protobuf.Api) this.instance).getName();
        }

        @Override // androidx.content.preferences.protobuf.ApiOrBuilder
        public final androidx.content.preferences.protobuf.ByteString getNameBytes() {
            return ((androidx.content.preferences.protobuf.Api) this.instance).getNameBytes();
        }

        public final androidx.datastore.preferences.protobuf.Api.Builder setName(java.lang.String str) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Api) this.instance).getHighSpeedVideoSizes(str);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Api.Builder clearName() {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Api) this.instance).getOutputMinFrameDurationlomOqCM();
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Api.Builder setNameBytes(androidx.content.preferences.protobuf.ByteString byteString) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Api) this.instance).getHighSpeedVideoSizes(byteString);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.ApiOrBuilder
        public final java.util.List<androidx.content.preferences.protobuf.Method> getMethodsList() {
            return java.util.Collections.unmodifiableList(((androidx.content.preferences.protobuf.Api) this.instance).getMethodsList());
        }

        @Override // androidx.content.preferences.protobuf.ApiOrBuilder
        public final int getMethodsCount() {
            return ((androidx.content.preferences.protobuf.Api) this.instance).getMethodsCount();
        }

        @Override // androidx.content.preferences.protobuf.ApiOrBuilder
        public final androidx.content.preferences.protobuf.Method getMethods(int i) {
            return ((androidx.content.preferences.protobuf.Api) this.instance).getMethods(i);
        }

        public final androidx.datastore.preferences.protobuf.Api.Builder setMethods(int i, androidx.content.preferences.protobuf.Method method) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Api) this.instance).getHighSpeedVideoFpsRanges(i, method);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Api.Builder setMethods(int i, androidx.datastore.preferences.protobuf.Method.Builder builder) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Api) this.instance).getHighSpeedVideoFpsRanges(i, builder.build());
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Api.Builder addMethods(androidx.content.preferences.protobuf.Method method) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Api) this.instance).Camera2StreamConfigurationMap(method);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Api.Builder addMethods(int i, androidx.content.preferences.protobuf.Method method) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Api) this.instance).getHighSpeedVideoSizes(i, method);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Api.Builder addMethods(androidx.datastore.preferences.protobuf.Method.Builder builder) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Api) this.instance).Camera2StreamConfigurationMap(builder.build());
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Api.Builder addMethods(int i, androidx.datastore.preferences.protobuf.Method.Builder builder) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Api) this.instance).getHighSpeedVideoSizes(i, builder.build());
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Api.Builder addAllMethods(java.lang.Iterable<? extends androidx.content.preferences.protobuf.Method> iterable) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Api) this.instance).Camera2StreamConfigurationMap(iterable);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Api.Builder clearMethods() {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Api) this.instance).getHighSpeedVideoSizes();
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Api.Builder removeMethods(int i) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Api) this.instance).Camera2StreamConfigurationMap(i);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.ApiOrBuilder
        public final java.util.List<androidx.content.preferences.protobuf.Option> getOptionsList() {
            return java.util.Collections.unmodifiableList(((androidx.content.preferences.protobuf.Api) this.instance).getOptionsList());
        }

        @Override // androidx.content.preferences.protobuf.ApiOrBuilder
        public final int getOptionsCount() {
            return ((androidx.content.preferences.protobuf.Api) this.instance).getOptionsCount();
        }

        @Override // androidx.content.preferences.protobuf.ApiOrBuilder
        public final androidx.content.preferences.protobuf.Option getOptions(int i) {
            return ((androidx.content.preferences.protobuf.Api) this.instance).getOptions(i);
        }

        public final androidx.datastore.preferences.protobuf.Api.Builder setOptions(int i, androidx.content.preferences.protobuf.Option option) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Api) this.instance).getHighSpeedVideoFpsRangesFor(i, option);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Api.Builder setOptions(int i, androidx.datastore.preferences.protobuf.Option.Builder builder) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Api) this.instance).getHighSpeedVideoFpsRangesFor(i, builder.build());
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Api.Builder addOptions(androidx.content.preferences.protobuf.Option option) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Api) this.instance).getHighSpeedVideoFpsRanges(option);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Api.Builder addOptions(int i, androidx.content.preferences.protobuf.Option option) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Api) this.instance).getHighSpeedVideoSizes(i, option);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Api.Builder addOptions(androidx.datastore.preferences.protobuf.Option.Builder builder) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Api) this.instance).getHighSpeedVideoFpsRanges(builder.build());
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Api.Builder addOptions(int i, androidx.datastore.preferences.protobuf.Option.Builder builder) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Api) this.instance).getHighSpeedVideoSizes(i, builder.build());
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Api.Builder addAllOptions(java.lang.Iterable<? extends androidx.content.preferences.protobuf.Option> iterable) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Api) this.instance).getHighSpeedVideoFpsRangesFor(iterable);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Api.Builder clearOptions() {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Api) this.instance).isOutputSupportedForhNQ4ISI();
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Api.Builder removeOptions(int i) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Api) this.instance).getHighSpeedVideoFpsRangesFor(i);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.ApiOrBuilder
        public final java.lang.String getVersion() {
            return ((androidx.content.preferences.protobuf.Api) this.instance).getVersion();
        }

        @Override // androidx.content.preferences.protobuf.ApiOrBuilder
        public final androidx.content.preferences.protobuf.ByteString getVersionBytes() {
            return ((androidx.content.preferences.protobuf.Api) this.instance).getVersionBytes();
        }

        public final androidx.datastore.preferences.protobuf.Api.Builder setVersion(java.lang.String str) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Api) this.instance).Camera2StreamConfigurationMap(str);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Api.Builder clearVersion() {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Api) this.instance).unwrapAs();
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Api.Builder setVersionBytes(androidx.content.preferences.protobuf.ByteString byteString) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Api) this.instance).getHighSpeedVideoFpsRangesFor(byteString);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.ApiOrBuilder
        public final boolean hasSourceContext() {
            return ((androidx.content.preferences.protobuf.Api) this.instance).hasSourceContext();
        }

        @Override // androidx.content.preferences.protobuf.ApiOrBuilder
        public final androidx.content.preferences.protobuf.SourceContext getSourceContext() {
            return ((androidx.content.preferences.protobuf.Api) this.instance).getSourceContext();
        }

        public final androidx.datastore.preferences.protobuf.Api.Builder setSourceContext(androidx.content.preferences.protobuf.SourceContext sourceContext) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Api) this.instance).Camera2StreamConfigurationMap(sourceContext);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Api.Builder setSourceContext(androidx.datastore.preferences.protobuf.SourceContext.Builder builder) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Api) this.instance).Camera2StreamConfigurationMap(builder.build());
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Api.Builder mergeSourceContext(androidx.content.preferences.protobuf.SourceContext sourceContext) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Api) this.instance).getHighSpeedVideoFpsRangesFor(sourceContext);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Api.Builder clearSourceContext() {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Api) this.instance).isOutputSupportedFor();
            return this;
        }

        @Override // androidx.content.preferences.protobuf.ApiOrBuilder
        public final java.util.List<androidx.content.preferences.protobuf.Mixin> getMixinsList() {
            return java.util.Collections.unmodifiableList(((androidx.content.preferences.protobuf.Api) this.instance).getMixinsList());
        }

        @Override // androidx.content.preferences.protobuf.ApiOrBuilder
        public final int getMixinsCount() {
            return ((androidx.content.preferences.protobuf.Api) this.instance).getMixinsCount();
        }

        @Override // androidx.content.preferences.protobuf.ApiOrBuilder
        public final androidx.content.preferences.protobuf.Mixin getMixins(int i) {
            return ((androidx.content.preferences.protobuf.Api) this.instance).getMixins(i);
        }

        public final androidx.datastore.preferences.protobuf.Api.Builder setMixins(int i, androidx.content.preferences.protobuf.Mixin mixin) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Api) this.instance).getHighSpeedVideoSizes(i, mixin);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Api.Builder setMixins(int i, androidx.datastore.preferences.protobuf.Mixin.Builder builder) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Api) this.instance).getHighSpeedVideoSizes(i, builder.build());
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Api.Builder addMixins(androidx.content.preferences.protobuf.Mixin mixin) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Api) this.instance).getHighSpeedVideoFpsRanges(mixin);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Api.Builder addMixins(int i, androidx.content.preferences.protobuf.Mixin mixin) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Api) this.instance).Camera2StreamConfigurationMap(i, mixin);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Api.Builder addMixins(androidx.datastore.preferences.protobuf.Mixin.Builder builder) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Api) this.instance).getHighSpeedVideoFpsRanges(builder.build());
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Api.Builder addMixins(int i, androidx.datastore.preferences.protobuf.Mixin.Builder builder) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Api) this.instance).Camera2StreamConfigurationMap(i, builder.build());
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Api.Builder addAllMixins(java.lang.Iterable<? extends androidx.content.preferences.protobuf.Mixin> iterable) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Api) this.instance).getHighResolutionOutputSizeshNQ4ISI(iterable);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Api.Builder clearMixins() {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Api) this.instance).getHighSpeedVideoFpsRanges();
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Api.Builder removeMixins(int i) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Api) this.instance).getHighSpeedVideoSizes(i);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.ApiOrBuilder
        public final int getSyntaxValue() {
            return ((androidx.content.preferences.protobuf.Api) this.instance).getSyntaxValue();
        }

        public final androidx.datastore.preferences.protobuf.Api.Builder setSyntaxValue(int i) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Api) this.instance).getOutputMinFrameDuration(i);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.ApiOrBuilder
        public final androidx.content.preferences.protobuf.Syntax getSyntax() {
            return ((androidx.content.preferences.protobuf.Api) this.instance).getSyntax();
        }

        public final androidx.datastore.preferences.protobuf.Api.Builder setSyntax(androidx.content.preferences.protobuf.Syntax syntax) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Api) this.instance).getHighSpeedVideoFpsRanges(syntax);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Api.Builder clearSyntax() {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Api) this.instance).getValidOutputFormatsForInputhNQ4ISI();
            return this;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.Api$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;

        static {
            int[] iArr = new int[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.values().length];
            getHighSpeedVideoFpsRanges = iArr;
            try {
                iArr[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    @Override // androidx.content.preferences.protobuf.GeneratedMessageLite
    protected final java.lang.Object dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        androidx.content.preferences.protobuf.Parser parser;
        androidx.content.preferences.protobuf.Api.AnonymousClass1 anonymousClass1 = null;
        switch (androidx.content.preferences.protobuf.Api.AnonymousClass1.getHighSpeedVideoFpsRanges[methodToInvoke.ordinal()]) {
            case 1:
                return new androidx.content.preferences.protobuf.Api();
            case 2:
                return new androidx.datastore.preferences.protobuf.Api.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004Ȉ\u0005ဉ\u0000\u0006\u001b\u0007\f", new java.lang.Object[]{"bitField0_", "name_", "methods_", androidx.content.preferences.protobuf.Method.class, "options_", androidx.content.preferences.protobuf.Option.class, "version_", "sourceContext_", "mixins_", androidx.content.preferences.protobuf.Mixin.class, "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                androidx.content.preferences.protobuf.Parser<androidx.content.preferences.protobuf.Api> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (androidx.content.preferences.protobuf.Api.class) {
                    parser = PARSER;
                    if (parser == null) {
                        parser = new androidx.datastore.preferences.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
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
        androidx.content.preferences.protobuf.Api api = new androidx.content.preferences.protobuf.Api();
        DEFAULT_INSTANCE = api;
        androidx.content.preferences.protobuf.GeneratedMessageLite.registerDefaultInstance(androidx.content.preferences.protobuf.Api.class, api);
    }

    public static androidx.content.preferences.protobuf.Api getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static androidx.content.preferences.protobuf.Parser<androidx.content.preferences.protobuf.Api> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
