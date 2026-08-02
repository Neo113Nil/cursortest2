package androidx.content.preferences.protobuf;

/* loaded from: classes3.dex */
public abstract class GeneratedMessageLite<MessageType extends androidx.content.preferences.protobuf.GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<MessageType, BuilderType>> extends androidx.content.preferences.protobuf.AbstractMessageLite<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static java.util.Map<java.lang.Object, androidx.content.preferences.protobuf.GeneratedMessageLite<?, ?>> defaultInstanceMap = new java.util.concurrent.ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected androidx.content.preferences.protobuf.UnknownFieldSetLite unknownFields = androidx.content.preferences.protobuf.UnknownFieldSetLite.getDefaultInstance();

    public interface ExtendableMessageOrBuilder<MessageType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>, BuilderType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableBuilder<MessageType, BuilderType>> extends androidx.content.preferences.protobuf.MessageLiteOrBuilder {
        <Type> Type getExtension(androidx.content.preferences.protobuf.ExtensionLite<MessageType, Type> extensionLite);

        <Type> Type getExtension(androidx.content.preferences.protobuf.ExtensionLite<MessageType, java.util.List<Type>> extensionLite, int i);

        <Type> int getExtensionCount(androidx.content.preferences.protobuf.ExtensionLite<MessageType, java.util.List<Type>> extensionLite);

        <Type> boolean hasExtension(androidx.content.preferences.protobuf.ExtensionLite<MessageType, Type> extensionLite);
    }

    public enum MethodToInvoke {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    protected abstract java.lang.Object dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2);

    boolean getOutputStallDurationlomOqCM() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    void getOutputStallDuration() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    int getOutputFormats() {
        return this.memoizedHashCode;
    }

    void getHighResolutionOutputSizeshNQ4ISI(int i) {
        this.memoizedHashCode = i;
    }

    void getInputSizeshNQ4ISI() {
        this.memoizedHashCode = 0;
    }

    boolean getOutputSizeshNQ4ISI() {
        return getOutputFormats() == 0;
    }

    @Override // androidx.content.preferences.protobuf.MessageLite
    public final androidx.content.preferences.protobuf.Parser<MessageType> getParserForType() {
        return (androidx.content.preferences.protobuf.Parser) dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER);
    }

    @Override // androidx.content.preferences.protobuf.MessageLiteOrBuilder
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    @Override // androidx.content.preferences.protobuf.MessageLite
    public final BuilderType newBuilderForType() {
        return (BuilderType) dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER);
    }

    MessageType getOutputSizes() {
        return (MessageType) dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE);
    }

    public java.lang.String toString() {
        return androidx.content.preferences.protobuf.MessageLiteToString.getHighSpeedVideoFpsRanges(this, super.toString());
    }

    public int hashCode() {
        if (getOutputStallDurationlomOqCM()) {
            return getInputFormats();
        }
        if (getOutputSizeshNQ4ISI()) {
            getHighResolutionOutputSizeshNQ4ISI(getInputFormats());
        }
        return getOutputFormats();
    }

    int getInputFormats() {
        return androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRangesFor().getHighResolutionOutputSizeshNQ4ISI(getClass()).getHighSpeedVideoFpsRangesFor(this);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRangesFor().getHighResolutionOutputSizeshNQ4ISI(getClass()).getHighSpeedVideoFpsRangesFor(this, (androidx.content.preferences.protobuf.GeneratedMessageLite) obj);
        }
        return false;
    }

    private void getHighSpeedVideoSizes() {
        if (this.unknownFields == androidx.content.preferences.protobuf.UnknownFieldSetLite.getDefaultInstance()) {
            this.unknownFields = androidx.content.preferences.protobuf.UnknownFieldSetLite.getHighSpeedVideoSizes();
        }
    }

    protected boolean parseUnknownField(int i, androidx.content.preferences.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(i) == 4) {
            return false;
        }
        getHighSpeedVideoSizes();
        return this.unknownFields.getHighSpeedVideoFpsRangesFor(i, codedInputStream);
    }

    protected void mergeVarintField(int i, int i2) {
        getHighSpeedVideoSizes();
        androidx.content.preferences.protobuf.UnknownFieldSetLite unknownFieldSetLite = this.unknownFields;
        if (!unknownFieldSetLite.getHighSpeedVideoFpsRanges) {
            throw new java.lang.UnsupportedOperationException();
        }
        if (i == 0) {
            throw new java.lang.IllegalArgumentException("Zero is not a valid field number.");
        }
        unknownFieldSetLite.getHighSpeedVideoSizes(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 0), java.lang.Long.valueOf(i2));
    }

    protected void mergeLengthDelimitedField(int i, androidx.content.preferences.protobuf.ByteString byteString) {
        getHighSpeedVideoSizes();
        androidx.content.preferences.protobuf.UnknownFieldSetLite unknownFieldSetLite = this.unknownFields;
        if (!unknownFieldSetLite.getHighSpeedVideoFpsRanges) {
            throw new java.lang.UnsupportedOperationException();
        }
        if (i == 0) {
            throw new java.lang.IllegalArgumentException("Zero is not a valid field number.");
        }
        unknownFieldSetLite.getHighSpeedVideoSizes(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 2), byteString);
    }

    protected void makeImmutable() {
        androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRangesFor().getHighResolutionOutputSizeshNQ4ISI(getClass()).getHighSpeedVideoFpsRanges(this);
        getOutputStallDuration();
    }

    public final <MessageType extends androidx.content.preferences.protobuf.GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<MessageType, BuilderType>> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER);
    }

    public final <MessageType extends androidx.content.preferences.protobuf.GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<MessageType, BuilderType>> BuilderType createBuilder(MessageType messagetype) {
        return (BuilderType) createBuilder().mergeFrom(messagetype);
    }

    @Override // androidx.content.preferences.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    @Override // androidx.content.preferences.protobuf.MessageLite
    public final BuilderType toBuilder() {
        return (BuilderType) ((androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder) dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER)).mergeFrom((androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder) this);
    }

    protected java.lang.Object dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj) {
        return dynamicMethod(methodToInvoke, obj, null);
    }

    protected java.lang.Object dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        return dynamicMethod(methodToInvoke, null, null);
    }

    void getHighSpeedVideoSizesFor() {
        getHighSpeedVideoFpsRanges(Integer.MAX_VALUE);
    }

    @Override // androidx.content.preferences.protobuf.AbstractMessageLite
    int getHighSpeedVideoFpsRangesFor() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // androidx.content.preferences.protobuf.AbstractMessageLite
    void getHighSpeedVideoFpsRanges(int i) {
        if (i < 0) {
            throw new java.lang.IllegalStateException("serialized size must be non-negative, was ".concat(java.lang.String.valueOf(i)));
        }
        this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    @Override // androidx.content.preferences.protobuf.MessageLite
    public void writeTo(androidx.content.preferences.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
        androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRangesFor().getHighResolutionOutputSizeshNQ4ISI(getClass()).getHighResolutionOutputSizeshNQ4ISI(this, androidx.content.preferences.protobuf.CodedOutputStreamWriter.getHighSpeedVideoFpsRangesFor(codedOutputStream));
    }

    @Override // androidx.content.preferences.protobuf.AbstractMessageLite
    int getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.Schema schema) {
        if (getOutputStallDurationlomOqCM()) {
            int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap((androidx.content.preferences.protobuf.Schema<?>) schema);
            if (Camera2StreamConfigurationMap >= 0) {
                return Camera2StreamConfigurationMap;
            }
            throw new java.lang.IllegalStateException("serialized size must be non-negative, was ".concat(java.lang.String.valueOf(Camera2StreamConfigurationMap)));
        }
        if (getHighSpeedVideoFpsRangesFor() != Integer.MAX_VALUE) {
            return getHighSpeedVideoFpsRangesFor();
        }
        int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap((androidx.content.preferences.protobuf.Schema<?>) schema);
        getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap2);
        return Camera2StreamConfigurationMap2;
    }

    @Override // androidx.content.preferences.protobuf.MessageLite
    public int getSerializedSize() {
        return getHighResolutionOutputSizeshNQ4ISI((androidx.content.preferences.protobuf.Schema) null);
    }

    private int Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.Schema<?> schema) {
        if (schema == null) {
            return androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRangesFor().getHighResolutionOutputSizeshNQ4ISI(getClass()).getHighSpeedVideoSizes(this);
        }
        return schema.getHighSpeedVideoSizes(this);
    }

    java.lang.Object getOutputMinFrameDuration() throws java.lang.Exception {
        return dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO);
    }

    static <T extends androidx.content.preferences.protobuf.GeneratedMessageLite<?, ?>> T Camera2StreamConfigurationMap(java.lang.Class<T> cls) {
        T t = (T) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                java.lang.Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) defaultInstanceMap.get(cls);
            } catch (java.lang.ClassNotFoundException e) {
                throw new java.lang.IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t != null) {
            return t;
        }
        T t2 = (T) ((androidx.content.preferences.protobuf.GeneratedMessageLite) androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(cls)).getDefaultInstanceForType();
        if (t2 == null) {
            throw new java.lang.IllegalStateException();
        }
        defaultInstanceMap.put(cls, t2);
        return t2;
    }

    public static <T extends androidx.content.preferences.protobuf.GeneratedMessageLite<?, ?>> void registerDefaultInstance(java.lang.Class<T> cls, T t) {
        t.getOutputStallDuration();
        defaultInstanceMap.put(cls, t);
    }

    protected static java.lang.Object newMessageInfo(androidx.content.preferences.protobuf.MessageLite messageLite, java.lang.String str, java.lang.Object[] objArr) {
        return new androidx.content.preferences.protobuf.RawMessageInfo(messageLite, str, objArr);
    }

    protected final void mergeUnknownFields(androidx.content.preferences.protobuf.UnknownFieldSetLite unknownFieldSetLite) {
        this.unknownFields = androidx.content.preferences.protobuf.UnknownFieldSetLite.getHighSpeedVideoSizes(this.unknownFields, unknownFieldSetLite);
    }

    public static abstract class Builder<MessageType extends androidx.content.preferences.protobuf.GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<MessageType, BuilderType>> extends androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder<MessageType, BuilderType> {
        private final MessageType getHighResolutionOutputSizeshNQ4ISI;
        protected MessageType instance;

        public Builder(MessageType messagetype) {
            this.getHighResolutionOutputSizeshNQ4ISI = messagetype;
            if (messagetype.getOutputStallDurationlomOqCM()) {
                throw new java.lang.IllegalArgumentException("Default instance must be immutable.");
            }
            this.instance = getHighSpeedVideoFpsRangesFor();
        }

        private MessageType getHighSpeedVideoFpsRangesFor() {
            return (MessageType) this.getHighResolutionOutputSizeshNQ4ISI.getOutputSizes();
        }

        protected final void copyOnWrite() {
            if (this.instance.getOutputStallDurationlomOqCM()) {
                return;
            }
            copyOnWriteInternal();
        }

        protected void copyOnWriteInternal() {
            MessageType highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
            getHighSpeedVideoFpsRanges(highSpeedVideoFpsRangesFor, this.instance);
            this.instance = highSpeedVideoFpsRangesFor;
        }

        @Override // androidx.content.preferences.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return androidx.content.preferences.protobuf.GeneratedMessageLite.isInitialized(this.instance, false);
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public final BuilderType clear() {
            if (this.getHighResolutionOutputSizeshNQ4ISI.getOutputStallDurationlomOqCM()) {
                throw new java.lang.IllegalArgumentException("Default instance must be immutable.");
            }
            this.instance = getHighSpeedVideoFpsRangesFor();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder
        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public BuilderType mo9148clone() {
            BuilderType buildertype = (BuilderType) getDefaultInstanceForType().newBuilderForType();
            buildertype.instance = buildPartial();
            return buildertype;
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public MessageType buildPartial() {
            if (!this.instance.getOutputStallDurationlomOqCM()) {
                return this.instance;
            }
            this.instance.makeImmutable();
            return this.instance;
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public final MessageType build() {
            MessageType buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder
        public BuilderType internalMergeFrom(MessageType messagetype) {
            return mergeFrom((androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<MessageType, BuilderType>) messagetype);
        }

        public BuilderType mergeFrom(MessageType messagetype) {
            if (getDefaultInstanceForType().equals(messagetype)) {
                return this;
            }
            copyOnWrite();
            getHighSpeedVideoFpsRanges(this.instance, messagetype);
            return this;
        }

        private static <MessageType> void getHighSpeedVideoFpsRanges(MessageType messagetype, MessageType messagetype2) {
            androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRangesFor().getHighResolutionOutputSizeshNQ4ISI(messagetype.getClass()).Camera2StreamConfigurationMap(messagetype, messagetype2);
        }

        @Override // androidx.content.preferences.protobuf.MessageLiteOrBuilder
        public MessageType getDefaultInstanceForType() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder, androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] bArr, int i, int i2, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            copyOnWrite();
            try {
                androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRangesFor().getHighResolutionOutputSizeshNQ4ISI(this.instance.getClass()).getHighSpeedVideoFpsRangesFor(this.instance, bArr, i, i + i2, new androidx.datastore.preferences.protobuf.ArrayDecoders.Registers(extensionRegistryLite));
                return this;
            } catch (androidx.content.preferences.protobuf.InvalidProtocolBufferException e) {
                throw e;
            } catch (java.io.IOException e2) {
                throw new java.lang.RuntimeException("Reading from byte array should not throw IOException.", e2);
            } catch (java.lang.IndexOutOfBoundsException unused) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder, androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] bArr, int i, int i2) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            return mergeFrom(bArr, i, i2, androidx.content.preferences.protobuf.ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder, androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            copyOnWrite();
            try {
                androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRangesFor().getHighResolutionOutputSizeshNQ4ISI(this.instance.getClass()).Camera2StreamConfigurationMap(this.instance, androidx.content.preferences.protobuf.CodedInputStreamReader.getHighSpeedVideoFpsRanges(codedInputStream), extensionRegistryLite);
                return this;
            } catch (java.lang.RuntimeException e) {
                if (e.getCause() instanceof java.io.IOException) {
                    throw ((java.io.IOException) e.getCause());
                }
                throw e;
            }
        }
    }

    public static abstract class ExtendableMessage<MessageType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>, BuilderType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableBuilder<MessageType, BuilderType>> extends androidx.content.preferences.protobuf.GeneratedMessageLite<MessageType, BuilderType> implements androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder<MessageType, BuilderType> {
        protected androidx.content.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor> extensions = androidx.content.preferences.protobuf.FieldSet.getHighSpeedVideoFpsRangesFor();

        @Override // androidx.content.preferences.protobuf.GeneratedMessageLite, androidx.content.preferences.protobuf.MessageLiteOrBuilder
        public /* bridge */ /* synthetic */ androidx.content.preferences.protobuf.MessageLite getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // androidx.content.preferences.protobuf.GeneratedMessageLite, androidx.content.preferences.protobuf.MessageLite
        public /* bridge */ /* synthetic */ androidx.datastore.preferences.protobuf.MessageLite.Builder newBuilderForType() {
            return super.newBuilderForType();
        }

        @Override // androidx.content.preferences.protobuf.GeneratedMessageLite, androidx.content.preferences.protobuf.MessageLite
        public /* bridge */ /* synthetic */ androidx.datastore.preferences.protobuf.MessageLite.Builder toBuilder() {
            return super.toBuilder();
        }

        protected final void mergeExtensionFields(MessageType messagetype) {
            if (this.extensions.getHighSpeedVideoFpsRanges) {
                this.extensions = this.extensions.clone();
            }
            this.extensions.Camera2StreamConfigurationMap(messagetype.extensions);
        }

        protected <MessageType extends androidx.content.preferences.protobuf.MessageLite> boolean parseUnknownField(MessageType messagetype, androidx.content.preferences.protobuf.CodedInputStream codedInputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite, int i) throws java.io.IOException {
            int tagFieldNumber = androidx.content.preferences.protobuf.WireFormat.getTagFieldNumber(i);
            return getHighResolutionOutputSizeshNQ4ISI(codedInputStream, extensionRegistryLite, extensionRegistryLite.findLiteExtensionByNumber(messagetype, tagFieldNumber), i, tagFieldNumber);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x010f  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0121  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0129  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x003b  */
        /* JADX WARN: Type inference failed for: r8v30, types: [androidx.datastore.preferences.protobuf.Internal$EnumLite] */
        /* JADX WARN: Type inference failed for: r8v33, types: [java.lang.Integer] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private boolean getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.CodedInputStream codedInputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite, androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension, int i, int i2) throws java.io.IOException {
            boolean z;
            boolean z2;
            androidx.datastore.preferences.protobuf.MessageLite.Builder builder;
            java.lang.Object build;
            int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(i);
            if (generatedExtension != null) {
                if (tagWireType == androidx.content.preferences.protobuf.FieldSet.getHighResolutionOutputSizeshNQ4ISI(generatedExtension.Camera2StreamConfigurationMap.getLiteType(), false)) {
                    z2 = false;
                    z = false;
                } else if (generatedExtension.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges && generatedExtension.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI.isPackable() && tagWireType == androidx.content.preferences.protobuf.FieldSet.getHighResolutionOutputSizeshNQ4ISI(generatedExtension.Camera2StreamConfigurationMap.getLiteType(), true)) {
                    z2 = false;
                    z = true;
                }
                if (!z2) {
                    return parseUnknownField(i, codedInputStream);
                }
                if (this.extensions.getHighSpeedVideoFpsRanges) {
                    this.extensions = this.extensions.clone();
                }
                if (z) {
                    int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                    if (generatedExtension.Camera2StreamConfigurationMap.getLiteType() == androidx.datastore.preferences.protobuf.WireFormat.FieldType.ENUM) {
                        while (codedInputStream.getBytesUntilLimit() > 0) {
                            java.lang.Object findValueByNumber = generatedExtension.Camera2StreamConfigurationMap.getEnumType().findValueByNumber(codedInputStream.readEnum());
                            if (findValueByNumber == 0) {
                                return true;
                            }
                            androidx.content.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor> fieldSet = this.extensions;
                            androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor extensionDescriptor = generatedExtension.Camera2StreamConfigurationMap;
                            if (generatedExtension.Camera2StreamConfigurationMap.getLiteJavaType() == androidx.datastore.preferences.protobuf.WireFormat.JavaType.ENUM) {
                                findValueByNumber = java.lang.Integer.valueOf(findValueByNumber.getNumber());
                            }
                            fieldSet.getHighResolutionOutputSizeshNQ4ISI((androidx.content.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor>) extensionDescriptor, findValueByNumber);
                        }
                    } else {
                        while (codedInputStream.getBytesUntilLimit() > 0) {
                            this.extensions.getHighResolutionOutputSizeshNQ4ISI((androidx.content.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor>) generatedExtension.Camera2StreamConfigurationMap, androidx.content.preferences.protobuf.FieldSet.getHighSpeedVideoFpsRangesFor(codedInputStream, generatedExtension.Camera2StreamConfigurationMap.getLiteType(), false));
                        }
                    }
                    codedInputStream.popLimit(pushLimit);
                } else {
                    int i3 = androidx.content.preferences.protobuf.GeneratedMessageLite.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[generatedExtension.Camera2StreamConfigurationMap.getLiteJavaType().ordinal()];
                    if (i3 == 1) {
                        if (!generatedExtension.Camera2StreamConfigurationMap.isRepeated()) {
                            java.lang.Object obj = this.extensions.getHighSpeedVideoFpsRangesFor.get(generatedExtension.Camera2StreamConfigurationMap);
                            if (obj instanceof androidx.content.preferences.protobuf.LazyField) {
                                obj = ((androidx.content.preferences.protobuf.LazyField) obj).getValue();
                            }
                            androidx.content.preferences.protobuf.MessageLite messageLite = (androidx.content.preferences.protobuf.MessageLite) obj;
                            if (messageLite != null) {
                                builder = messageLite.toBuilder();
                                if (builder == null) {
                                    builder = generatedExtension.getMessageDefaultInstance().newBuilderForType();
                                }
                                if (generatedExtension.Camera2StreamConfigurationMap.getLiteType() != androidx.datastore.preferences.protobuf.WireFormat.FieldType.GROUP) {
                                    codedInputStream.readGroup(generatedExtension.getNumber(), builder, extensionRegistryLite);
                                } else {
                                    codedInputStream.readMessage(builder, extensionRegistryLite);
                                }
                                build = builder.build();
                            }
                        }
                        builder = null;
                        if (builder == null) {
                        }
                        if (generatedExtension.Camera2StreamConfigurationMap.getLiteType() != androidx.datastore.preferences.protobuf.WireFormat.FieldType.GROUP) {
                        }
                        build = builder.build();
                    } else if (i3 == 2) {
                        int readEnum = codedInputStream.readEnum();
                        java.lang.Object findValueByNumber2 = generatedExtension.Camera2StreamConfigurationMap.getEnumType().findValueByNumber(readEnum);
                        if (findValueByNumber2 == null) {
                            mergeVarintField(i2, readEnum);
                            return true;
                        }
                        build = findValueByNumber2;
                    } else {
                        build = androidx.content.preferences.protobuf.FieldSet.getHighSpeedVideoFpsRangesFor(codedInputStream, generatedExtension.Camera2StreamConfigurationMap.getLiteType(), false);
                    }
                    if (generatedExtension.Camera2StreamConfigurationMap.isRepeated()) {
                        androidx.content.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor> fieldSet2 = this.extensions;
                        androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor extensionDescriptor2 = generatedExtension.Camera2StreamConfigurationMap;
                        if (generatedExtension.Camera2StreamConfigurationMap.getLiteJavaType() == androidx.datastore.preferences.protobuf.WireFormat.JavaType.ENUM) {
                            build = java.lang.Integer.valueOf(((androidx.datastore.preferences.protobuf.Internal.EnumLite) build).getNumber());
                        }
                        fieldSet2.getHighResolutionOutputSizeshNQ4ISI((androidx.content.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor>) extensionDescriptor2, build);
                    } else {
                        androidx.content.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor> fieldSet3 = this.extensions;
                        androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor extensionDescriptor3 = generatedExtension.Camera2StreamConfigurationMap;
                        if (generatedExtension.Camera2StreamConfigurationMap.getLiteJavaType() == androidx.datastore.preferences.protobuf.WireFormat.JavaType.ENUM) {
                            build = java.lang.Integer.valueOf(((androidx.datastore.preferences.protobuf.Internal.EnumLite) build).getNumber());
                        }
                        fieldSet3.getHighSpeedVideoSizes(extensionDescriptor3, build);
                    }
                }
                return true;
            }
            z = false;
            z2 = true;
            if (!z2) {
            }
        }

        protected <MessageType extends androidx.content.preferences.protobuf.MessageLite> boolean parseUnknownFieldAsMessageSet(MessageType messagetype, androidx.content.preferences.protobuf.CodedInputStream codedInputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite, int i) throws java.io.IOException {
            if (i != androidx.content.preferences.protobuf.WireFormat.getHighResolutionOutputSizeshNQ4ISI) {
                if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(i) == 2) {
                    return parseUnknownField(messagetype, codedInputStream, extensionRegistryLite, i);
                }
                return codedInputStream.skipField(i);
            }
            int i2 = 0;
            androidx.content.preferences.protobuf.ByteString byteString = null;
            androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension = null;
            while (true) {
                int readTag = codedInputStream.readTag();
                if (readTag == 0) {
                    break;
                }
                if (readTag == androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap) {
                    i2 = codedInputStream.readUInt32();
                    if (i2 != 0) {
                        generatedExtension = extensionRegistryLite.findLiteExtensionByNumber(messagetype, i2);
                    }
                } else if (readTag == androidx.content.preferences.protobuf.WireFormat.getHighSpeedVideoFpsRanges) {
                    if (i2 == 0 || generatedExtension == null) {
                        byteString = codedInputStream.readBytes();
                    } else {
                        getHighResolutionOutputSizeshNQ4ISI(codedInputStream, extensionRegistryLite, generatedExtension, androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i2, 2), i2);
                        byteString = null;
                    }
                } else if (!codedInputStream.skipField(readTag)) {
                    break;
                }
            }
            codedInputStream.checkLastTagWas(androidx.content.preferences.protobuf.WireFormat.getHighSpeedVideoFpsRangesFor);
            if (byteString == null || i2 == 0) {
                return true;
            }
            if (generatedExtension == null) {
                if (byteString == null) {
                    return true;
                }
                mergeLengthDelimitedField(i2, byteString);
                return true;
            }
            java.lang.Object obj = this.extensions.getHighSpeedVideoFpsRangesFor.get(generatedExtension.Camera2StreamConfigurationMap);
            if (obj instanceof androidx.content.preferences.protobuf.LazyField) {
                obj = ((androidx.content.preferences.protobuf.LazyField) obj).getValue();
            }
            androidx.content.preferences.protobuf.MessageLite messageLite = (androidx.content.preferences.protobuf.MessageLite) obj;
            androidx.datastore.preferences.protobuf.MessageLite.Builder builder = messageLite != null ? messageLite.toBuilder() : null;
            if (builder == null) {
                builder = generatedExtension.getMessageDefaultInstance().newBuilderForType();
            }
            builder.mergeFrom(byteString, extensionRegistryLite);
            java.lang.Object build = builder.build();
            if (this.extensions.getHighSpeedVideoFpsRanges) {
                this.extensions = this.extensions.clone();
            }
            androidx.content.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor> fieldSet = this.extensions;
            androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor extensionDescriptor = generatedExtension.Camera2StreamConfigurationMap;
            if (generatedExtension.Camera2StreamConfigurationMap.getLiteJavaType() == androidx.datastore.preferences.protobuf.WireFormat.JavaType.ENUM) {
                build = java.lang.Integer.valueOf(((androidx.datastore.preferences.protobuf.Internal.EnumLite) build).getNumber());
            }
            fieldSet.getHighSpeedVideoSizes(extensionDescriptor, build);
            return true;
        }

        final androidx.content.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor> getOutputMinFrameDurationlomOqCM() {
            if (this.extensions.getHighSpeedVideoFpsRanges) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> boolean hasExtension(androidx.content.preferences.protobuf.ExtensionLite<MessageType, Type> extensionLite) {
            androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension highSpeedVideoSizes = androidx.content.preferences.protobuf.GeneratedMessageLite.getHighSpeedVideoSizes(extensionLite);
            if (highSpeedVideoSizes.getContainingTypeDefaultInstance() == getDefaultInstanceForType()) {
                androidx.content.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor> fieldSet = this.extensions;
                androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor extensionDescriptor = highSpeedVideoSizes.Camera2StreamConfigurationMap;
                if (extensionDescriptor.isRepeated()) {
                    throw new java.lang.IllegalArgumentException("hasField() can only be called on non-repeated fields.");
                }
                return fieldSet.getHighSpeedVideoFpsRangesFor.get(extensionDescriptor) != null;
            }
            throw new java.lang.IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> int getExtensionCount(androidx.content.preferences.protobuf.ExtensionLite<MessageType, java.util.List<Type>> extensionLite) {
            androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension highSpeedVideoSizes = androidx.content.preferences.protobuf.GeneratedMessageLite.getHighSpeedVideoSizes(extensionLite);
            if (highSpeedVideoSizes.getContainingTypeDefaultInstance() == getDefaultInstanceForType()) {
                androidx.content.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor> fieldSet = this.extensions;
                androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor extensionDescriptor = highSpeedVideoSizes.Camera2StreamConfigurationMap;
                if (!extensionDescriptor.isRepeated()) {
                    throw new java.lang.IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
                }
                java.lang.Object obj = fieldSet.getHighSpeedVideoFpsRangesFor.get(extensionDescriptor);
                if (obj instanceof androidx.content.preferences.protobuf.LazyField) {
                    obj = ((androidx.content.preferences.protobuf.LazyField) obj).getValue();
                }
                if (obj == null) {
                    return 0;
                }
                return ((java.util.List) obj).size();
            }
            throw new java.lang.IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }

        /* JADX WARN: Type inference failed for: r1v7, types: [Type, java.util.ArrayList, java.util.List] */
        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(androidx.content.preferences.protobuf.ExtensionLite<MessageType, Type> extensionLite) {
            androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension highSpeedVideoSizes = androidx.content.preferences.protobuf.GeneratedMessageLite.getHighSpeedVideoSizes(extensionLite);
            if (highSpeedVideoSizes.getContainingTypeDefaultInstance() == getDefaultInstanceForType()) {
                androidx.content.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor> fieldSet = this.extensions;
                java.lang.Object obj = (Type) fieldSet.getHighSpeedVideoFpsRangesFor.get(highSpeedVideoSizes.Camera2StreamConfigurationMap);
                if (obj instanceof androidx.content.preferences.protobuf.LazyField) {
                    obj = (Type) ((androidx.content.preferences.protobuf.LazyField) obj).getValue();
                }
                if (obj == null) {
                    return highSpeedVideoSizes.getHighSpeedVideoFpsRangesFor;
                }
                if (highSpeedVideoSizes.Camera2StreamConfigurationMap.isRepeated()) {
                    if (highSpeedVideoSizes.Camera2StreamConfigurationMap.getLiteJavaType() != androidx.datastore.preferences.protobuf.WireFormat.JavaType.ENUM) {
                        return (Type) obj;
                    }
                    ?? r1 = (Type) new java.util.ArrayList();
                    java.util.Iterator it = ((java.util.List) obj).iterator();
                    while (it.hasNext()) {
                        r1.add(highSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(it.next()));
                    }
                    return r1;
                }
                return (Type) highSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(obj);
            }
            throw new java.lang.IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(androidx.content.preferences.protobuf.ExtensionLite<MessageType, java.util.List<Type>> extensionLite, int i) {
            androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension highSpeedVideoSizes = androidx.content.preferences.protobuf.GeneratedMessageLite.getHighSpeedVideoSizes(extensionLite);
            if (highSpeedVideoSizes.getContainingTypeDefaultInstance() == getDefaultInstanceForType()) {
                androidx.content.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor> fieldSet = this.extensions;
                androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor extensionDescriptor = highSpeedVideoSizes.Camera2StreamConfigurationMap;
                if (!extensionDescriptor.isRepeated()) {
                    throw new java.lang.IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
                }
                java.lang.Object obj = fieldSet.getHighSpeedVideoFpsRangesFor.get(extensionDescriptor);
                if (obj instanceof androidx.content.preferences.protobuf.LazyField) {
                    obj = ((androidx.content.preferences.protobuf.LazyField) obj).getValue();
                }
                if (obj != null) {
                    return (Type) highSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(((java.util.List) obj).get(i));
                }
                throw new java.lang.IndexOutOfBoundsException();
            }
            throw new java.lang.IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }

        protected boolean extensionsAreInitialized() {
            return this.extensions.Camera2StreamConfigurationMap();
        }

        /* loaded from: classes7.dex */
        protected class ExtensionWriter {
            private java.util.Map.Entry<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor, java.lang.Object> Camera2StreamConfigurationMap;
            private final java.util.Iterator<java.util.Map.Entry<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor, java.lang.Object>> getHighSpeedVideoFpsRangesFor;
            private final boolean getHighSpeedVideoSizes;

            /* synthetic */ ExtensionWriter(androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage extendableMessage, boolean z, byte b) {
                this(z);
            }

            private ExtensionWriter(boolean z) {
                java.util.Iterator<java.util.Map.Entry<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor, java.lang.Object>> inputSizeshNQ4ISI = androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage.this.extensions.getInputSizeshNQ4ISI();
                this.getHighSpeedVideoFpsRangesFor = inputSizeshNQ4ISI;
                if (inputSizeshNQ4ISI.hasNext()) {
                    this.Camera2StreamConfigurationMap = inputSizeshNQ4ISI.next();
                }
                this.getHighSpeedVideoSizes = z;
            }

            public void writeUntil(int i, androidx.content.preferences.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
                while (true) {
                    java.util.Map.Entry<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor, java.lang.Object> entry = this.Camera2StreamConfigurationMap;
                    if (entry == null || entry.getKey().getNumber() >= i) {
                        return;
                    }
                    androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor key = this.Camera2StreamConfigurationMap.getKey();
                    if (this.getHighSpeedVideoSizes && key.getLiteJavaType() == androidx.datastore.preferences.protobuf.WireFormat.JavaType.MESSAGE && !key.isRepeated()) {
                        codedOutputStream.writeMessageSetExtension(key.getNumber(), (androidx.content.preferences.protobuf.MessageLite) this.Camera2StreamConfigurationMap.getValue());
                    } else {
                        androidx.content.preferences.protobuf.FieldSet.getHighSpeedVideoFpsRanges(key, this.Camera2StreamConfigurationMap.getValue(), codedOutputStream);
                    }
                    if (this.getHighSpeedVideoFpsRangesFor.hasNext()) {
                        this.Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor.next();
                    } else {
                        this.Camera2StreamConfigurationMap = null;
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        protected androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>.ExtensionWriter newExtensionWriter() {
            return new androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this, false, 0 == true ? 1 : 0);
        }

        protected androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>.ExtensionWriter newMessageSetExtensionWriter() {
            return new androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this, true, (byte) 0);
        }

        protected int extensionsSerializedSize() {
            return this.extensions.getHighSpeedVideoFpsRanges();
        }

        protected int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.getHighResolutionOutputSizeshNQ4ISI();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.GeneratedMessageLite$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;

        static {
            int[] iArr = new int[androidx.datastore.preferences.protobuf.WireFormat.JavaType.values().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr;
            try {
                iArr[androidx.datastore.preferences.protobuf.WireFormat.JavaType.MESSAGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.datastore.preferences.protobuf.WireFormat.JavaType.ENUM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes7.dex */
    public static abstract class ExtendableBuilder<MessageType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>, BuilderType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableBuilder<MessageType, BuilderType>> extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<MessageType, BuilderType> implements androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder<MessageType, BuilderType> {
        protected ExtendableBuilder(MessageType messagetype) {
            super(messagetype);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder
        protected void copyOnWriteInternal() {
            super.copyOnWriteInternal();
            if (((androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).extensions != androidx.content.preferences.protobuf.FieldSet.getHighSpeedVideoFpsRangesFor()) {
                ((androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).extensions = ((androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).extensions.clone();
            }
        }

        private androidx.content.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor> getHighSpeedVideoFpsRangesFor() {
            androidx.content.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor> fieldSet = ((androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).extensions;
            if (!fieldSet.getHighSpeedVideoFpsRanges) {
                return fieldSet;
            }
            androidx.content.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor> clone = fieldSet.clone();
            ((androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).extensions = clone;
            return clone;
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder, androidx.datastore.preferences.protobuf.MessageLite.Builder
        public final MessageType buildPartial() {
            if (!((androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).getOutputStallDurationlomOqCM()) {
                return (MessageType) this.instance;
            }
            ((androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).extensions.getOutputFormats();
            return (MessageType) super.buildPartial();
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> boolean hasExtension(androidx.content.preferences.protobuf.ExtensionLite<MessageType, Type> extensionLite) {
            return ((androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).hasExtension(extensionLite);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> int getExtensionCount(androidx.content.preferences.protobuf.ExtensionLite<MessageType, java.util.List<Type>> extensionLite) {
            return ((androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).getExtensionCount(extensionLite);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(androidx.content.preferences.protobuf.ExtensionLite<MessageType, Type> extensionLite) {
            return (Type) ((androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).getExtension(extensionLite);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(androidx.content.preferences.protobuf.ExtensionLite<MessageType, java.util.List<Type>> extensionLite, int i) {
            return (Type) ((androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).getExtension(extensionLite, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList, java.util.List] */
        public final <Type> BuilderType setExtension(androidx.content.preferences.protobuf.ExtensionLite<MessageType, Type> extensionLite, Type type) {
            androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension highSpeedVideoSizes = androidx.content.preferences.protobuf.GeneratedMessageLite.getHighSpeedVideoSizes(extensionLite);
            if (highSpeedVideoSizes.getContainingTypeDefaultInstance() == getDefaultInstanceForType()) {
                copyOnWrite();
                androidx.content.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
                androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor extensionDescriptor = highSpeedVideoSizes.Camera2StreamConfigurationMap;
                if (highSpeedVideoSizes.Camera2StreamConfigurationMap.isRepeated()) {
                    if (highSpeedVideoSizes.Camera2StreamConfigurationMap.getLiteJavaType() == androidx.datastore.preferences.protobuf.WireFormat.JavaType.ENUM) {
                        Type arrayList = new java.util.ArrayList();
                        for (java.lang.Object obj : (java.util.List) type) {
                            if (highSpeedVideoSizes.Camera2StreamConfigurationMap.getLiteJavaType() == androidx.datastore.preferences.protobuf.WireFormat.JavaType.ENUM) {
                                obj = java.lang.Integer.valueOf(((androidx.datastore.preferences.protobuf.Internal.EnumLite) obj).getNumber());
                            }
                            arrayList.add(obj);
                        }
                        type = arrayList;
                    }
                } else if (highSpeedVideoSizes.Camera2StreamConfigurationMap.getLiteJavaType() == androidx.datastore.preferences.protobuf.WireFormat.JavaType.ENUM) {
                    type = (Type) java.lang.Integer.valueOf(((androidx.datastore.preferences.protobuf.Internal.EnumLite) type).getNumber());
                }
                highSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(extensionDescriptor, type);
                return this;
            }
            throw new java.lang.IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }

        public final <Type> BuilderType setExtension(androidx.content.preferences.protobuf.ExtensionLite<MessageType, java.util.List<Type>> extensionLite, int i, Type type) {
            androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension highSpeedVideoSizes = androidx.content.preferences.protobuf.GeneratedMessageLite.getHighSpeedVideoSizes(extensionLite);
            if (highSpeedVideoSizes.getContainingTypeDefaultInstance() == getDefaultInstanceForType()) {
                copyOnWrite();
                androidx.content.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
                androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor extensionDescriptor = highSpeedVideoSizes.Camera2StreamConfigurationMap;
                if (highSpeedVideoSizes.Camera2StreamConfigurationMap.getLiteJavaType() == androidx.datastore.preferences.protobuf.WireFormat.JavaType.ENUM) {
                    type = (Type) java.lang.Integer.valueOf(((androidx.datastore.preferences.protobuf.Internal.EnumLite) type).getNumber());
                }
                if (!extensionDescriptor.isRepeated()) {
                    throw new java.lang.IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
                }
                java.lang.Object obj = highSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor.get(extensionDescriptor);
                if (obj instanceof androidx.content.preferences.protobuf.LazyField) {
                    obj = ((androidx.content.preferences.protobuf.LazyField) obj).getValue();
                }
                if (obj == null) {
                    throw new java.lang.IndexOutOfBoundsException();
                }
                androidx.content.preferences.protobuf.FieldSet.Camera2StreamConfigurationMap(extensionDescriptor, type);
                ((java.util.List) obj).set(i, type);
                return this;
            }
            throw new java.lang.IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }

        public final <Type> BuilderType addExtension(androidx.content.preferences.protobuf.ExtensionLite<MessageType, java.util.List<Type>> extensionLite, Type type) {
            androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension highSpeedVideoSizes = androidx.content.preferences.protobuf.GeneratedMessageLite.getHighSpeedVideoSizes(extensionLite);
            if (highSpeedVideoSizes.getContainingTypeDefaultInstance() == getDefaultInstanceForType()) {
                copyOnWrite();
                androidx.content.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
                androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor extensionDescriptor = highSpeedVideoSizes.Camera2StreamConfigurationMap;
                if (highSpeedVideoSizes.Camera2StreamConfigurationMap.getLiteJavaType() == androidx.datastore.preferences.protobuf.WireFormat.JavaType.ENUM) {
                    type = (Type) java.lang.Integer.valueOf(((androidx.datastore.preferences.protobuf.Internal.EnumLite) type).getNumber());
                }
                highSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI((androidx.content.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor>) extensionDescriptor, type);
                return this;
            }
            throw new java.lang.IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }

        public final BuilderType clearExtension(androidx.content.preferences.protobuf.ExtensionLite<MessageType, ?> extensionLite) {
            androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension highSpeedVideoSizes = androidx.content.preferences.protobuf.GeneratedMessageLite.getHighSpeedVideoSizes(extensionLite);
            if (highSpeedVideoSizes.getContainingTypeDefaultInstance() == getDefaultInstanceForType()) {
                copyOnWrite();
                androidx.content.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
                highSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor.remove(highSpeedVideoSizes.Camera2StreamConfigurationMap);
                if (highSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor.isEmpty()) {
                    highSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI = false;
                }
                return this;
            }
            throw new java.lang.IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    public static <ContainingType extends androidx.content.preferences.protobuf.MessageLite, Type> androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, androidx.content.preferences.protobuf.MessageLite messageLite, androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<?> enumLiteMap, int i, androidx.datastore.preferences.protobuf.WireFormat.FieldType fieldType, java.lang.Class cls) {
        return new androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension<>(containingtype, type, messageLite, new androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor(enumLiteMap, i, fieldType, false, false));
    }

    public static <ContainingType extends androidx.content.preferences.protobuf.MessageLite, Type> androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, androidx.content.preferences.protobuf.MessageLite messageLite, androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<?> enumLiteMap, int i, androidx.datastore.preferences.protobuf.WireFormat.FieldType fieldType, boolean z, java.lang.Class cls) {
        return new androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension<>(containingtype, java.util.Collections.emptyList(), messageLite, new androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor(enumLiteMap, i, fieldType, true, z));
    }

    static final class ExtensionDescriptor implements androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor> {
        final int Camera2StreamConfigurationMap;
        final androidx.datastore.preferences.protobuf.WireFormat.FieldType getHighResolutionOutputSizeshNQ4ISI;
        final boolean getHighSpeedVideoFpsRanges;
        final androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<?> getHighSpeedVideoFpsRangesFor;
        final boolean getHighSpeedVideoSizes;

        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
            return this.Camera2StreamConfigurationMap - ((androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor) obj).Camera2StreamConfigurationMap;
        }

        ExtensionDescriptor(androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<?> enumLiteMap, int i, androidx.datastore.preferences.protobuf.WireFormat.FieldType fieldType, boolean z, boolean z2) {
            this.getHighSpeedVideoFpsRangesFor = enumLiteMap;
            this.Camera2StreamConfigurationMap = i;
            this.getHighResolutionOutputSizeshNQ4ISI = fieldType;
            this.getHighSpeedVideoFpsRanges = z;
            this.getHighSpeedVideoSizes = z2;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public final int getNumber() {
            return this.Camera2StreamConfigurationMap;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public final androidx.datastore.preferences.protobuf.WireFormat.FieldType getLiteType() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public final androidx.datastore.preferences.protobuf.WireFormat.JavaType getLiteJavaType() {
            return this.getHighResolutionOutputSizeshNQ4ISI.getJavaType();
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public final boolean isRepeated() {
            return this.getHighSpeedVideoFpsRanges;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public final boolean isPacked() {
            return this.getHighSpeedVideoSizes;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public final androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<?> getEnumType() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public final androidx.datastore.preferences.protobuf.MessageLite.Builder internalMergeFrom(androidx.datastore.preferences.protobuf.MessageLite.Builder builder, androidx.content.preferences.protobuf.MessageLite messageLite) {
            return ((androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder) builder).mergeFrom((androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder) messageLite);
        }
    }

    static java.lang.Object getHighSpeedVideoFpsRanges(java.lang.reflect.Method method, java.lang.Object obj, java.lang.Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            java.lang.Throwable cause = e2.getCause();
            if (cause instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) cause);
            }
            if (cause instanceof java.lang.Error) {
                throw ((java.lang.Error) cause);
            }
            throw new java.lang.RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static class GeneratedExtension<ContainingType extends androidx.content.preferences.protobuf.MessageLite, Type> extends androidx.content.preferences.protobuf.ExtensionLite<ContainingType, Type> {
        final androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor Camera2StreamConfigurationMap;
        final ContainingType getHighResolutionOutputSizeshNQ4ISI;
        final androidx.content.preferences.protobuf.MessageLite getHighSpeedVideoFpsRanges;
        final Type getHighSpeedVideoFpsRangesFor;

        GeneratedExtension(ContainingType containingtype, Type type, androidx.content.preferences.protobuf.MessageLite messageLite, androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor extensionDescriptor) {
            if (containingtype == null) {
                throw new java.lang.IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (extensionDescriptor.getLiteType() == androidx.datastore.preferences.protobuf.WireFormat.FieldType.MESSAGE && messageLite == null) {
                throw new java.lang.IllegalArgumentException("Null messageDefaultInstance");
            }
            this.getHighResolutionOutputSizeshNQ4ISI = containingtype;
            this.getHighSpeedVideoFpsRangesFor = type;
            this.getHighSpeedVideoFpsRanges = messageLite;
            this.Camera2StreamConfigurationMap = extensionDescriptor;
        }

        public ContainingType getContainingTypeDefaultInstance() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // androidx.content.preferences.protobuf.ExtensionLite
        public int getNumber() {
            return this.Camera2StreamConfigurationMap.getNumber();
        }

        @Override // androidx.content.preferences.protobuf.ExtensionLite
        public androidx.content.preferences.protobuf.MessageLite getMessageDefaultInstance() {
            return this.getHighSpeedVideoFpsRanges;
        }

        final java.lang.Object getHighSpeedVideoFpsRangesFor(java.lang.Object obj) {
            return this.Camera2StreamConfigurationMap.getLiteJavaType() == androidx.datastore.preferences.protobuf.WireFormat.JavaType.ENUM ? this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor.findValueByNumber(((java.lang.Integer) obj).intValue()) : obj;
        }

        @Override // androidx.content.preferences.protobuf.ExtensionLite
        public androidx.datastore.preferences.protobuf.WireFormat.FieldType getLiteType() {
            return this.Camera2StreamConfigurationMap.getLiteType();
        }

        @Override // androidx.content.preferences.protobuf.ExtensionLite
        public boolean isRepeated() {
            return this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
        }

        @Override // androidx.content.preferences.protobuf.ExtensionLite
        public Type getDefaultValue() {
            return this.getHighSpeedVideoFpsRangesFor;
        }
    }

    /* loaded from: classes7.dex */
    protected static final class SerializedForm implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.lang.String Camera2StreamConfigurationMap;
        private final byte[] getHighSpeedVideoFpsRanges;
        private final java.lang.Class<?> getHighSpeedVideoSizes;

        public static androidx.datastore.preferences.protobuf.GeneratedMessageLite.SerializedForm of(androidx.content.preferences.protobuf.MessageLite messageLite) {
            return new androidx.datastore.preferences.protobuf.GeneratedMessageLite.SerializedForm(messageLite);
        }

        private SerializedForm(androidx.content.preferences.protobuf.MessageLite messageLite) {
            this.getHighSpeedVideoSizes = messageLite.getClass();
            this.Camera2StreamConfigurationMap = messageLite.getClass().getName();
            this.getHighSpeedVideoFpsRanges = messageLite.toByteArray();
        }

        protected final java.lang.Object readResolve() throws java.io.ObjectStreamException {
            try {
                java.lang.Class<?> cls = this.getHighSpeedVideoSizes;
                if (cls == null) {
                    cls = java.lang.Class.forName(this.Camera2StreamConfigurationMap);
                }
                java.lang.reflect.Field declaredField = cls.getDeclaredField("DEFAULT_INSTANCE");
                declaredField.setAccessible(true);
                return ((androidx.content.preferences.protobuf.MessageLite) declaredField.get(null)).newBuilderForType().mergeFrom(this.getHighSpeedVideoFpsRanges).buildPartial();
            } catch (androidx.content.preferences.protobuf.InvalidProtocolBufferException e) {
                throw new java.lang.RuntimeException("Unable to understand proto buffer", e);
            } catch (java.lang.ClassNotFoundException e2) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to find proto buffer class: ");
                sb.append(this.Camera2StreamConfigurationMap);
                throw new java.lang.RuntimeException(sb.toString(), e2);
            } catch (java.lang.IllegalAccessException e3) {
                throw new java.lang.RuntimeException("Unable to call parsePartialFrom", e3);
            } catch (java.lang.NoSuchFieldException e4) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unable to find DEFAULT_INSTANCE in ");
                sb2.append(this.Camera2StreamConfigurationMap);
                throw new java.lang.RuntimeException(sb2.toString(), e4);
            } catch (java.lang.SecurityException e5) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Unable to call DEFAULT_INSTANCE in ");
                sb3.append(this.Camera2StreamConfigurationMap);
                throw new java.lang.RuntimeException(sb3.toString(), e5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>, BuilderType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableBuilder<MessageType, BuilderType>, T> androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, T> getHighSpeedVideoSizes(androidx.content.preferences.protobuf.ExtensionLite<MessageType, T> extensionLite) {
        return (androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension) extensionLite;
    }

    protected static final <T extends androidx.content.preferences.protobuf.GeneratedMessageLite<T, ?>> boolean isInitialized(T t, boolean z) {
        byte byteValue = ((java.lang.Byte) t.dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRangesFor().getHighResolutionOutputSizeshNQ4ISI(t.getClass()).Camera2StreamConfigurationMap(t);
        if (z) {
            t.dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED, Camera2StreamConfigurationMap ? t : null);
        }
        return Camera2StreamConfigurationMap;
    }

    protected static androidx.datastore.preferences.protobuf.Internal.IntList emptyIntList() {
        return androidx.content.preferences.protobuf.IntArrayList.getHighSpeedVideoFpsRangesFor();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.datastore.preferences.protobuf.Internal$IntList] */
    protected static androidx.datastore.preferences.protobuf.Internal.IntList mutableCopy(androidx.datastore.preferences.protobuf.Internal.IntList intList) {
        int size = intList.size();
        return intList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    protected static androidx.datastore.preferences.protobuf.Internal.LongList emptyLongList() {
        return androidx.content.preferences.protobuf.LongArrayList.getHighSpeedVideoFpsRanges();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.datastore.preferences.protobuf.Internal$LongList] */
    protected static androidx.datastore.preferences.protobuf.Internal.LongList mutableCopy(androidx.datastore.preferences.protobuf.Internal.LongList longList) {
        int size = longList.size();
        return longList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    protected static androidx.datastore.preferences.protobuf.Internal.FloatList emptyFloatList() {
        return androidx.content.preferences.protobuf.FloatArrayList.getHighSpeedVideoFpsRanges();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.datastore.preferences.protobuf.Internal$FloatList] */
    protected static androidx.datastore.preferences.protobuf.Internal.FloatList mutableCopy(androidx.datastore.preferences.protobuf.Internal.FloatList floatList) {
        int size = floatList.size();
        return floatList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    protected static androidx.datastore.preferences.protobuf.Internal.DoubleList emptyDoubleList() {
        return androidx.content.preferences.protobuf.DoubleArrayList.Camera2StreamConfigurationMap();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.datastore.preferences.protobuf.Internal$DoubleList] */
    protected static androidx.datastore.preferences.protobuf.Internal.DoubleList mutableCopy(androidx.datastore.preferences.protobuf.Internal.DoubleList doubleList) {
        int size = doubleList.size();
        return doubleList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    protected static androidx.datastore.preferences.protobuf.Internal.BooleanList emptyBooleanList() {
        return androidx.content.preferences.protobuf.BooleanArrayList.getHighSpeedVideoFpsRanges();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.datastore.preferences.protobuf.Internal$BooleanList] */
    protected static androidx.datastore.preferences.protobuf.Internal.BooleanList mutableCopy(androidx.datastore.preferences.protobuf.Internal.BooleanList booleanList) {
        int size = booleanList.size();
        return booleanList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    public static <E> androidx.datastore.preferences.protobuf.Internal.ProtobufList<E> emptyProtobufList() {
        return androidx.content.preferences.protobuf.ProtobufArrayList.Camera2StreamConfigurationMap();
    }

    public static <E> androidx.datastore.preferences.protobuf.Internal.ProtobufList<E> mutableCopy(androidx.datastore.preferences.protobuf.Internal.ProtobufList<E> protobufList) {
        int size = protobufList.size();
        return protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    public static class DefaultInstanceBasedParser<T extends androidx.content.preferences.protobuf.GeneratedMessageLite<T, ?>> extends androidx.content.preferences.protobuf.AbstractParser<T> {
        private final T getHighSpeedVideoFpsRanges;

        public DefaultInstanceBasedParser(T t) {
            this.getHighSpeedVideoFpsRanges = t;
        }

        @Override // androidx.content.preferences.protobuf.Parser
        public T parsePartialFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            return (T) androidx.content.preferences.protobuf.GeneratedMessageLite.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges, codedInputStream, extensionRegistryLite);
        }

        @Override // androidx.content.preferences.protobuf.AbstractParser, androidx.content.preferences.protobuf.Parser
        public T parsePartialFrom(byte[] bArr, int i, int i2, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            return (T) androidx.content.preferences.protobuf.GeneratedMessageLite.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges, bArr, i, i2, extensionRegistryLite);
        }
    }

    static <T extends androidx.content.preferences.protobuf.GeneratedMessageLite<T, ?>> T getHighSpeedVideoFpsRangesFor(T t, androidx.content.preferences.protobuf.CodedInputStream codedInputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        T t2 = (T) t.getOutputSizes();
        try {
            androidx.content.preferences.protobuf.Schema highResolutionOutputSizeshNQ4ISI = androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRangesFor().getHighResolutionOutputSizeshNQ4ISI(t2.getClass());
            highResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(t2, androidx.content.preferences.protobuf.CodedInputStreamReader.getHighSpeedVideoFpsRanges(codedInputStream), extensionRegistryLite);
            highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(t2);
            return t2;
        } catch (androidx.content.preferences.protobuf.InvalidProtocolBufferException e) {
            e = e;
            if (e.getHighSpeedVideoFpsRangesFor) {
                e = new androidx.content.preferences.protobuf.InvalidProtocolBufferException((java.io.IOException) e);
            }
            throw e.setUnfinishedMessage(t2);
        } catch (androidx.content.preferences.protobuf.UninitializedMessageException e2) {
            throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(t2);
        } catch (java.io.IOException e3) {
            if (e3.getCause() instanceof androidx.content.preferences.protobuf.InvalidProtocolBufferException) {
                throw ((androidx.content.preferences.protobuf.InvalidProtocolBufferException) e3.getCause());
            }
            throw new androidx.content.preferences.protobuf.InvalidProtocolBufferException(e3).setUnfinishedMessage(t2);
        } catch (java.lang.RuntimeException e4) {
            if (e4.getCause() instanceof androidx.content.preferences.protobuf.InvalidProtocolBufferException) {
                throw ((androidx.content.preferences.protobuf.InvalidProtocolBufferException) e4.getCause());
            }
            throw e4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends androidx.content.preferences.protobuf.GeneratedMessageLite<T, ?>> T getHighSpeedVideoFpsRanges(T t, byte[] bArr, int i, int i2, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        if (i2 == 0) {
            return t;
        }
        T t2 = (T) t.getOutputSizes();
        try {
            androidx.content.preferences.protobuf.Schema highResolutionOutputSizeshNQ4ISI = androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRangesFor().getHighResolutionOutputSizeshNQ4ISI(t2.getClass());
            highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(t2, bArr, i, i + i2, new androidx.datastore.preferences.protobuf.ArrayDecoders.Registers(extensionRegistryLite));
            highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(t2);
            return t2;
        } catch (androidx.content.preferences.protobuf.InvalidProtocolBufferException e) {
            e = e;
            if (e.getHighSpeedVideoFpsRangesFor) {
                e = new androidx.content.preferences.protobuf.InvalidProtocolBufferException((java.io.IOException) e);
            }
            throw e.setUnfinishedMessage(t2);
        } catch (androidx.content.preferences.protobuf.UninitializedMessageException e2) {
            throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(t2);
        } catch (java.io.IOException e3) {
            if (e3.getCause() instanceof androidx.content.preferences.protobuf.InvalidProtocolBufferException) {
                throw ((androidx.content.preferences.protobuf.InvalidProtocolBufferException) e3.getCause());
            }
            throw new androidx.content.preferences.protobuf.InvalidProtocolBufferException(e3).setUnfinishedMessage(t2);
        } catch (java.lang.IndexOutOfBoundsException unused) {
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI().setUnfinishedMessage(t2);
        }
    }

    protected static <T extends androidx.content.preferences.protobuf.GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, androidx.content.preferences.protobuf.CodedInputStream codedInputStream) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (T) getHighSpeedVideoFpsRangesFor(t, codedInputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite.getEmptyRegistry());
    }

    private static <T extends androidx.content.preferences.protobuf.GeneratedMessageLite<T, ?>> T getHighSpeedVideoFpsRangesFor(T t) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        if (t == null || t.isInitialized()) {
            return t;
        }
        throw t.getHighResolutionOutputSizeshNQ4ISI().asInvalidProtocolBufferException().setUnfinishedMessage(t);
    }

    public static <T extends androidx.content.preferences.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, java.nio.ByteBuffer byteBuffer, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (T) getHighSpeedVideoFpsRangesFor(parseFrom(t, androidx.content.preferences.protobuf.CodedInputStream.newInstance(byteBuffer), extensionRegistryLite));
    }

    public static <T extends androidx.content.preferences.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, java.nio.ByteBuffer byteBuffer) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (T) parseFrom(t, byteBuffer, androidx.content.preferences.protobuf.ExtensionRegistryLite.getEmptyRegistry());
    }

    public static <T extends androidx.content.preferences.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, androidx.content.preferences.protobuf.ByteString byteString) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (T) getHighSpeedVideoFpsRangesFor(parseFrom(t, byteString, androidx.content.preferences.protobuf.ExtensionRegistryLite.getEmptyRegistry()));
    }

    public static <T extends androidx.content.preferences.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, androidx.content.preferences.protobuf.ByteString byteString, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (T) getHighSpeedVideoFpsRangesFor(getHighSpeedVideoSizes(t, byteString, extensionRegistryLite));
    }

    private static <T extends androidx.content.preferences.protobuf.GeneratedMessageLite<T, ?>> T getHighSpeedVideoSizes(T t, androidx.content.preferences.protobuf.ByteString byteString, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        androidx.content.preferences.protobuf.CodedInputStream newCodedInput = byteString.newCodedInput();
        T t2 = (T) getHighSpeedVideoFpsRangesFor(t, newCodedInput, extensionRegistryLite);
        try {
            newCodedInput.checkLastTagWas(0);
            return t2;
        } catch (androidx.content.preferences.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(t2);
        }
    }

    public static <T extends androidx.content.preferences.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (T) getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRanges(t, bArr, 0, bArr.length, androidx.content.preferences.protobuf.ExtensionRegistryLite.getEmptyRegistry()));
    }

    public static <T extends androidx.content.preferences.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (T) getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRanges(t, bArr, 0, bArr.length, extensionRegistryLite));
    }

    public static <T extends androidx.content.preferences.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, java.io.InputStream inputStream) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (T) getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRangesFor(t, androidx.content.preferences.protobuf.CodedInputStream.newInstance(inputStream), androidx.content.preferences.protobuf.ExtensionRegistryLite.getEmptyRegistry()));
    }

    public static <T extends androidx.content.preferences.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (T) getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRangesFor(t, androidx.content.preferences.protobuf.CodedInputStream.newInstance(inputStream), extensionRegistryLite));
    }

    public static <T extends androidx.content.preferences.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, androidx.content.preferences.protobuf.CodedInputStream codedInputStream) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (T) parseFrom(t, codedInputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite.getEmptyRegistry());
    }

    public static <T extends androidx.content.preferences.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, androidx.content.preferences.protobuf.CodedInputStream codedInputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (T) getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRangesFor(t, codedInputStream, extensionRegistryLite));
    }

    public static <T extends androidx.content.preferences.protobuf.GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, java.io.InputStream inputStream) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (T) getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRanges(t, inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite.getEmptyRegistry()));
    }

    public static <T extends androidx.content.preferences.protobuf.GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (T) getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRanges(t, inputStream, extensionRegistryLite));
    }

    private static <T extends androidx.content.preferences.protobuf.GeneratedMessageLite<T, ?>> T getHighSpeedVideoFpsRanges(T t, java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            androidx.content.preferences.protobuf.CodedInputStream newInstance = androidx.content.preferences.protobuf.CodedInputStream.newInstance(new androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder.LimitedInputStream(inputStream, androidx.content.preferences.protobuf.CodedInputStream.readRawVarint32(read, inputStream)));
            T t2 = (T) getHighSpeedVideoFpsRangesFor(t, newInstance, extensionRegistryLite);
            try {
                newInstance.checkLastTagWas(0);
                return t2;
            } catch (androidx.content.preferences.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(t2);
            }
        } catch (androidx.content.preferences.protobuf.InvalidProtocolBufferException e2) {
            if (e2.getHighSpeedVideoFpsRangesFor) {
                throw new androidx.content.preferences.protobuf.InvalidProtocolBufferException((java.io.IOException) e2);
            }
            throw e2;
        } catch (java.io.IOException e3) {
            throw new androidx.content.preferences.protobuf.InvalidProtocolBufferException(e3);
        }
    }
}
