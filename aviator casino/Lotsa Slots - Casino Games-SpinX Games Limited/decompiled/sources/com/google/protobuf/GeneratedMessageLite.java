package com.google.protobuf;

/* loaded from: classes4.dex */
public abstract class GeneratedMessageLite<MessageType extends com.google.protobuf.GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends com.google.protobuf.GeneratedMessageLite.Builder<MessageType, BuilderType>> extends com.google.protobuf.AbstractMessageLite<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static java.util.Map<java.lang.Object, com.google.protobuf.GeneratedMessageLite<?, ?>> defaultInstanceMap = new java.util.concurrent.ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected com.google.protobuf.UnknownFieldSetLite unknownFields = com.google.protobuf.UnknownFieldSetLite.getDefaultInstance();

    public interface ExtendableMessageOrBuilder<MessageType extends com.google.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>, BuilderType extends com.google.protobuf.GeneratedMessageLite.ExtendableBuilder<MessageType, BuilderType>> extends com.google.protobuf.MessageLiteOrBuilder {
        <Type> Type getExtension(com.google.protobuf.ExtensionLite<MessageType, Type> extension);

        <Type> Type getExtension(com.google.protobuf.ExtensionLite<MessageType, java.util.List<Type>> extension, int index);

        <Type> int getExtensionCount(com.google.protobuf.ExtensionLite<MessageType, java.util.List<Type>> extension);

        <Type> boolean hasExtension(com.google.protobuf.ExtensionLite<MessageType, Type> extension);
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

    protected abstract java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke method, java.lang.Object arg0, java.lang.Object arg1);

    boolean isMutable() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    void setMemoizedHashCode(int value) {
        this.memoizedHashCode = value;
    }

    void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    boolean hashCodeIsNotMemoized() {
        return getMemoizedHashCode() == 0;
    }

    @Override // com.google.protobuf.MessageLite
    public final com.google.protobuf.Parser<MessageType> getParserForType() {
        return (com.google.protobuf.Parser) dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    @Override // com.google.protobuf.MessageLite
    public final BuilderType newBuilderForType() {
        return (BuilderType) dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER);
    }

    MessageType newMutableInstance() {
        return (MessageType) dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE);
    }

    public java.lang.String toString() {
        return com.google.protobuf.MessageLiteToString.toString(this, super.toString());
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            setMemoizedHashCode(computeHashCode());
        }
        return getMemoizedHashCode();
    }

    int computeHashCode() {
        return com.google.protobuf.Protobuf.getInstance().schemaFor((com.google.protobuf.Protobuf) this).hashCode(this);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && getClass() == other.getClass()) {
            return com.google.protobuf.Protobuf.getInstance().schemaFor((com.google.protobuf.Protobuf) this).equals(this, (com.google.protobuf.GeneratedMessageLite) other);
        }
        return false;
    }

    private void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == com.google.protobuf.UnknownFieldSetLite.getDefaultInstance()) {
            this.unknownFields = com.google.protobuf.UnknownFieldSetLite.newInstance();
        }
    }

    protected boolean parseUnknownField(int tag, com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        if (com.google.protobuf.WireFormat.getTagWireType(tag) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.mergeFieldFrom(tag, input);
    }

    protected void mergeVarintField(int tag, int value) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.mergeVarintField(tag, value);
    }

    protected void mergeLengthDelimitedField(int fieldNumber, com.google.protobuf.ByteString value) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.mergeLengthDelimitedField(fieldNumber, value);
    }

    protected void makeImmutable() {
        com.google.protobuf.Protobuf.getInstance().schemaFor((com.google.protobuf.Protobuf) this).makeImmutable(this);
        markImmutable();
    }

    protected final <MessageType extends com.google.protobuf.GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends com.google.protobuf.GeneratedMessageLite.Builder<MessageType, BuilderType>> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER);
    }

    protected final <MessageType extends com.google.protobuf.GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends com.google.protobuf.GeneratedMessageLite.Builder<MessageType, BuilderType>> BuilderType createBuilder(MessageType messagetype) {
        return (BuilderType) createBuilder().mergeFrom(messagetype);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        return isInitialized(this, java.lang.Boolean.TRUE.booleanValue());
    }

    @Override // com.google.protobuf.MessageLite
    public final BuilderType toBuilder() {
        return (BuilderType) ((com.google.protobuf.GeneratedMessageLite.Builder) dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER)).mergeFrom((com.google.protobuf.GeneratedMessageLite.Builder) this);
    }

    protected java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke method, java.lang.Object arg0) {
        return dynamicMethod(method, arg0, null);
    }

    protected java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke method) {
        return dynamicMethod(method, null, null);
    }

    void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Integer.MAX_VALUE);
    }

    @Override // com.google.protobuf.AbstractMessageLite
    int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // com.google.protobuf.AbstractMessageLite
    void setMemoizedSerializedSize(int size) {
        if (size < 0) {
            throw new java.lang.IllegalStateException("serialized size must be non-negative, was " + size);
        }
        this.memoizedSerializedSize = (size & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
        com.google.protobuf.Protobuf.getInstance().schemaFor((com.google.protobuf.Protobuf) this).writeTo(this, com.google.protobuf.CodedOutputStreamWriter.forCodedOutput(output));
    }

    @Override // com.google.protobuf.AbstractMessageLite
    int getSerializedSize(com.google.protobuf.Schema schema) {
        if (isMutable()) {
            int computeSerializedSize = computeSerializedSize(schema);
            if (computeSerializedSize >= 0) {
                return computeSerializedSize;
            }
            throw new java.lang.IllegalStateException("serialized size must be non-negative, was " + computeSerializedSize);
        }
        if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        }
        int computeSerializedSize2 = computeSerializedSize(schema);
        setMemoizedSerializedSize(computeSerializedSize2);
        return computeSerializedSize2;
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    private int computeSerializedSize(com.google.protobuf.Schema<?> nullableSchema) {
        if (nullableSchema == null) {
            return com.google.protobuf.Protobuf.getInstance().schemaFor((com.google.protobuf.Protobuf) this).getSerializedSize(this);
        }
        return nullableSchema.getSerializedSize(this);
    }

    java.lang.Object buildMessageInfo() throws java.lang.Exception {
        return dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO);
    }

    static <T extends com.google.protobuf.GeneratedMessageLite<?, ?>> T getDefaultInstance(java.lang.Class<T> cls) {
        com.google.protobuf.GeneratedMessageLite<?, ?> generatedMessageLite = defaultInstanceMap.get(cls);
        if (generatedMessageLite == null) {
            try {
                java.lang.Class.forName(cls.getName(), true, cls.getClassLoader());
                generatedMessageLite = defaultInstanceMap.get(cls);
            } catch (java.lang.ClassNotFoundException e) {
                throw new java.lang.IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (generatedMessageLite == null) {
            generatedMessageLite = (T) ((com.google.protobuf.GeneratedMessageLite) com.google.protobuf.UnsafeUtil.allocateInstance(cls)).getDefaultInstanceForType();
            if (generatedMessageLite == null) {
                throw new java.lang.IllegalStateException();
            }
            defaultInstanceMap.put(cls, generatedMessageLite);
        }
        return (T) generatedMessageLite;
    }

    protected static <T extends com.google.protobuf.GeneratedMessageLite<?, ?>> void registerDefaultInstance(java.lang.Class<T> clazz, T defaultInstance) {
        defaultInstance.markImmutable();
        defaultInstanceMap.put(clazz, defaultInstance);
    }

    protected static java.lang.Object newMessageInfo(com.google.protobuf.MessageLite defaultInstance, java.lang.String info, java.lang.Object[] objects) {
        return new com.google.protobuf.RawMessageInfo(defaultInstance, info, objects);
    }

    protected final void mergeUnknownFields(com.google.protobuf.UnknownFieldSetLite unknownFields) {
        this.unknownFields = com.google.protobuf.UnknownFieldSetLite.mutableCopyOf(this.unknownFields, unknownFields);
    }

    public static abstract class Builder<MessageType extends com.google.protobuf.GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends com.google.protobuf.GeneratedMessageLite.Builder<MessageType, BuilderType>> extends com.google.protobuf.AbstractMessageLite.Builder<MessageType, BuilderType> {
        private final MessageType defaultInstance;
        protected MessageType instance;

        protected Builder(MessageType defaultInstance) {
            this.defaultInstance = defaultInstance;
            if (defaultInstance.isMutable()) {
                throw new java.lang.IllegalArgumentException("Default instance must be immutable.");
            }
            this.instance = newMutableInstance();
        }

        private MessageType newMutableInstance() {
            return (MessageType) this.defaultInstance.newMutableInstance();
        }

        protected final void copyOnWrite() {
            if (this.instance.isMutable()) {
                return;
            }
            copyOnWriteInternal();
        }

        protected void copyOnWriteInternal() {
            MessageType newMutableInstance = newMutableInstance();
            mergeFromInstance(newMutableInstance, this.instance);
            this.instance = newMutableInstance;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return com.google.protobuf.GeneratedMessageLite.isInitialized(this.instance, false);
        }

        @Override // com.google.protobuf.MessageLite.Builder
        public final BuilderType clear() {
            if (this.defaultInstance.isMutable()) {
                throw new java.lang.IllegalArgumentException("Default instance must be immutable.");
            }
            this.instance = newMutableInstance();
            return this;
        }

        @Override // com.google.protobuf.AbstractMessageLite.Builder
        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public BuilderType mo5595clone() {
            BuilderType buildertype = (BuilderType) getDefaultInstanceForType().newBuilderForType();
            buildertype.instance = buildPartial();
            return buildertype;
        }

        @Override // com.google.protobuf.MessageLite.Builder
        public MessageType buildPartial() {
            if (!this.instance.isMutable()) {
                return this.instance;
            }
            this.instance.makeImmutable();
            return this.instance;
        }

        @Override // com.google.protobuf.MessageLite.Builder
        public final MessageType build() {
            MessageType buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractMessageLite.Builder
        public BuilderType internalMergeFrom(MessageType message) {
            return mergeFrom((com.google.protobuf.GeneratedMessageLite.Builder<MessageType, BuilderType>) message);
        }

        public BuilderType mergeFrom(MessageType message) {
            if (getDefaultInstanceForType().equals(message)) {
                return this;
            }
            copyOnWrite();
            mergeFromInstance(this.instance, message);
            return this;
        }

        private static <MessageType> void mergeFromInstance(MessageType dest, MessageType src) {
            com.google.protobuf.Protobuf.getInstance().schemaFor((com.google.protobuf.Protobuf) dest).mergeFrom(dest, src);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder
        public MessageType getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        @Override // com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] input, int offset, int length, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            copyOnWrite();
            try {
                com.google.protobuf.Protobuf.getInstance().schemaFor((com.google.protobuf.Protobuf) this.instance).mergeFrom(this.instance, input, offset, offset + length, new com.google.protobuf.ArrayDecoders.Registers(extensionRegistry));
                return this;
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e;
            } catch (java.io.IOException e2) {
                throw new java.lang.RuntimeException("Reading from byte array should not throw IOException.", e2);
            } catch (java.lang.IndexOutOfBoundsException unused) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
        }

        @Override // com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] input, int offset, int length) throws com.google.protobuf.InvalidProtocolBufferException {
            return mergeFrom(input, offset, length, com.google.protobuf.ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            copyOnWrite();
            try {
                com.google.protobuf.Protobuf.getInstance().schemaFor((com.google.protobuf.Protobuf) this.instance).mergeFrom(this.instance, com.google.protobuf.CodedInputStreamReader.forCodedInput(input), extensionRegistry);
                return this;
            } catch (java.lang.RuntimeException e) {
                if (e.getCause() instanceof java.io.IOException) {
                    throw ((java.io.IOException) e.getCause());
                }
                throw e;
            }
        }
    }

    public static abstract class ExtendableMessage<MessageType extends com.google.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>, BuilderType extends com.google.protobuf.GeneratedMessageLite.ExtendableBuilder<MessageType, BuilderType>> extends com.google.protobuf.GeneratedMessageLite<MessageType, BuilderType> implements com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder<MessageType, BuilderType> {
        protected com.google.protobuf.FieldSet<com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor> extensions = com.google.protobuf.FieldSet.emptySet();

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.MessageLiteOrBuilder
        public /* bridge */ /* synthetic */ com.google.protobuf.MessageLite getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.MessageLite
        public /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder newBuilderForType() {
            return super.newBuilderForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.MessageLite
        public /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder toBuilder() {
            return super.toBuilder();
        }

        protected final void mergeExtensionFields(final MessageType other) {
            if (this.extensions.isImmutable()) {
                this.extensions = this.extensions.m5607clone();
            }
            this.extensions.mergeFrom(other.extensions);
        }

        protected <MessageType extends com.google.protobuf.MessageLite> boolean parseUnknownField(MessageType defaultInstance, com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry, int tag) throws java.io.IOException {
            int tagFieldNumber = com.google.protobuf.WireFormat.getTagFieldNumber(tag);
            return parseExtension(input, extensionRegistry, extensionRegistry.findLiteExtensionByNumber(defaultInstance, tagFieldNumber), tag, tagFieldNumber);
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private boolean parseExtension(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry, com.google.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?> extension, int tag, int fieldNumber) throws java.io.IOException {
            boolean z;
            boolean z2;
            java.lang.Object build;
            com.google.protobuf.MessageLite messageLite;
            int tagWireType = com.google.protobuf.WireFormat.getTagWireType(tag);
            if (extension != null) {
                if (tagWireType == com.google.protobuf.FieldSet.getWireFormatForFieldType(extension.descriptor.getLiteType(), false)) {
                    z = false;
                    z2 = false;
                    if (z) {
                        return parseUnknownField(tag, input);
                    }
                    ensureExtensionsAreMutable();
                    if (z2) {
                        int pushLimit = input.pushLimit(input.readRawVarint32());
                        if (extension.descriptor.getLiteType() == com.google.protobuf.WireFormat.FieldType.ENUM) {
                            while (input.getBytesUntilLimit() > 0) {
                                java.lang.Object findValueByNumber = extension.descriptor.getEnumType().findValueByNumber(input.readEnum());
                                if (findValueByNumber == null) {
                                    return true;
                                }
                                this.extensions.addRepeatedField(extension.descriptor, extension.singularToFieldSetType(findValueByNumber));
                            }
                        } else {
                            while (input.getBytesUntilLimit() > 0) {
                                this.extensions.addRepeatedField(extension.descriptor, com.google.protobuf.FieldSet.readPrimitiveField(input, extension.descriptor.getLiteType(), false));
                            }
                        }
                        input.popLimit(pushLimit);
                    } else {
                        int i = com.google.protobuf.GeneratedMessageLite.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType[extension.descriptor.getLiteJavaType().ordinal()];
                        if (i == 1) {
                            com.google.protobuf.MessageLite.Builder builder = (extension.descriptor.isRepeated() || (messageLite = (com.google.protobuf.MessageLite) this.extensions.getField(extension.descriptor)) == null) ? null : messageLite.toBuilder();
                            if (builder == null) {
                                builder = extension.getMessageDefaultInstance().newBuilderForType();
                            }
                            if (extension.descriptor.getLiteType() == com.google.protobuf.WireFormat.FieldType.GROUP) {
                                input.readGroup(extension.getNumber(), builder, extensionRegistry);
                            } else {
                                input.readMessage(builder, extensionRegistry);
                            }
                            build = builder.build();
                        } else if (i == 2) {
                            int readEnum = input.readEnum();
                            java.lang.Object findValueByNumber2 = extension.descriptor.getEnumType().findValueByNumber(readEnum);
                            if (findValueByNumber2 == null) {
                                mergeVarintField(fieldNumber, readEnum);
                                return true;
                            }
                            build = findValueByNumber2;
                        } else {
                            build = com.google.protobuf.FieldSet.readPrimitiveField(input, extension.descriptor.getLiteType(), false);
                        }
                        if (extension.descriptor.isRepeated()) {
                            this.extensions.addRepeatedField(extension.descriptor, extension.singularToFieldSetType(build));
                        } else {
                            this.extensions.setField(extension.descriptor, extension.singularToFieldSetType(build));
                        }
                    }
                    return true;
                }
                if (extension.descriptor.isRepeated && extension.descriptor.type.isPackable() && tagWireType == com.google.protobuf.FieldSet.getWireFormatForFieldType(extension.descriptor.getLiteType(), true)) {
                    z = false;
                    z2 = true;
                    if (z) {
                    }
                }
            }
            z = true;
            z2 = false;
            if (z) {
            }
        }

        protected <MessageType extends com.google.protobuf.MessageLite> boolean parseUnknownFieldAsMessageSet(MessageType defaultInstance, com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry, int tag) throws java.io.IOException {
            if (tag == com.google.protobuf.WireFormat.MESSAGE_SET_ITEM_TAG) {
                mergeMessageSetExtensionFromCodedStream(defaultInstance, input, extensionRegistry);
                return true;
            }
            if (com.google.protobuf.WireFormat.getTagWireType(tag) == 2) {
                return parseUnknownField(defaultInstance, input, extensionRegistry, tag);
            }
            return input.skipField(tag);
        }

        private <MessageType extends com.google.protobuf.MessageLite> void mergeMessageSetExtensionFromCodedStream(MessageType defaultInstance, com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            int i = 0;
            com.google.protobuf.ByteString byteString = null;
            com.google.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension = null;
            while (true) {
                int readTag = input.readTag();
                if (readTag == 0) {
                    break;
                }
                if (readTag == com.google.protobuf.WireFormat.MESSAGE_SET_TYPE_ID_TAG) {
                    i = input.readUInt32();
                    if (i != 0) {
                        generatedExtension = extensionRegistry.findLiteExtensionByNumber(defaultInstance, i);
                    }
                } else if (readTag == com.google.protobuf.WireFormat.MESSAGE_SET_MESSAGE_TAG) {
                    if (i != 0 && generatedExtension != null) {
                        eagerlyMergeMessageSetExtension(input, generatedExtension, extensionRegistry, i);
                        byteString = null;
                    } else {
                        byteString = input.readBytes();
                    }
                } else if (!input.skipField(readTag)) {
                    break;
                }
            }
            input.checkLastTagWas(com.google.protobuf.WireFormat.MESSAGE_SET_ITEM_END_TAG);
            if (byteString == null || i == 0) {
                return;
            }
            if (generatedExtension != null) {
                mergeMessageSetExtensionFromBytes(byteString, extensionRegistry, generatedExtension);
            } else if (byteString != null) {
                mergeLengthDelimitedField(i, byteString);
            }
        }

        private void eagerlyMergeMessageSetExtension(com.google.protobuf.CodedInputStream input, com.google.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?> extension, com.google.protobuf.ExtensionRegistryLite extensionRegistry, int typeId) throws java.io.IOException {
            parseExtension(input, extensionRegistry, extension, com.google.protobuf.WireFormat.makeTag(typeId, 2), typeId);
        }

        private void mergeMessageSetExtensionFromBytes(com.google.protobuf.ByteString rawBytes, com.google.protobuf.ExtensionRegistryLite extensionRegistry, com.google.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?> extension) throws java.io.IOException {
            com.google.protobuf.MessageLite messageLite = (com.google.protobuf.MessageLite) this.extensions.getField(extension.descriptor);
            com.google.protobuf.MessageLite.Builder builder = messageLite != null ? messageLite.toBuilder() : null;
            if (builder == null) {
                builder = extension.getMessageDefaultInstance().newBuilderForType();
            }
            builder.mergeFrom(rawBytes, extensionRegistry);
            ensureExtensionsAreMutable().setField(extension.descriptor, extension.singularToFieldSetType(builder.build()));
        }

        com.google.protobuf.FieldSet<com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor> ensureExtensionsAreMutable() {
            if (this.extensions.isImmutable()) {
                this.extensions = this.extensions.m5607clone();
            }
            return this.extensions;
        }

        private void verifyExtensionContainingType(final com.google.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, ?> extension) {
            if (extension.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
                throw new java.lang.IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> boolean hasExtension(final com.google.protobuf.ExtensionLite<MessageType, Type> extension) {
            com.google.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, ?> checkIsLite = com.google.protobuf.GeneratedMessageLite.checkIsLite(extension);
            verifyExtensionContainingType(checkIsLite);
            return this.extensions.hasField(checkIsLite.descriptor);
        }

        @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> int getExtensionCount(final com.google.protobuf.ExtensionLite<MessageType, java.util.List<Type>> extension) {
            com.google.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, ?> checkIsLite = com.google.protobuf.GeneratedMessageLite.checkIsLite(extension);
            verifyExtensionContainingType(checkIsLite);
            return this.extensions.getRepeatedFieldCount(checkIsLite.descriptor);
        }

        @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(com.google.protobuf.ExtensionLite<MessageType, Type> extensionLite) {
            com.google.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, ?> checkIsLite = com.google.protobuf.GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(checkIsLite);
            java.lang.Object field = this.extensions.getField(checkIsLite.descriptor);
            if (field == null) {
                return checkIsLite.defaultValue;
            }
            return (Type) checkIsLite.fromFieldSetType(field);
        }

        @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(com.google.protobuf.ExtensionLite<MessageType, java.util.List<Type>> extensionLite, int i) {
            com.google.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, ?> checkIsLite = com.google.protobuf.GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(checkIsLite);
            return (Type) checkIsLite.singularFromFieldSetType(this.extensions.getRepeatedField(checkIsLite.descriptor, i));
        }

        protected boolean extensionsAreInitialized() {
            return this.extensions.isInitialized();
        }

        protected class ExtensionWriter {
            private final java.util.Iterator<java.util.Map.Entry<com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor, java.lang.Object>> iter;
            private final boolean messageSetWireFormat;
            private java.util.Map.Entry<com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor, java.lang.Object> next;

            /* synthetic */ ExtensionWriter(com.google.protobuf.GeneratedMessageLite.ExtendableMessage extendableMessage, boolean z, com.google.protobuf.GeneratedMessageLite.AnonymousClass1 anonymousClass1) {
                this(z);
            }

            private ExtensionWriter(boolean messageSetWireFormat) {
                java.util.Iterator<java.util.Map.Entry<com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor, java.lang.Object>> it = com.google.protobuf.GeneratedMessageLite.ExtendableMessage.this.extensions.iterator();
                this.iter = it;
                if (it.hasNext()) {
                    this.next = it.next();
                }
                this.messageSetWireFormat = messageSetWireFormat;
            }

            public void writeUntil(final int end, final com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
                while (true) {
                    java.util.Map.Entry<com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor, java.lang.Object> entry = this.next;
                    if (entry == null || entry.getKey().getNumber() >= end) {
                        return;
                    }
                    com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor key = this.next.getKey();
                    if (this.messageSetWireFormat && key.getLiteJavaType() == com.google.protobuf.WireFormat.JavaType.MESSAGE && !key.isRepeated()) {
                        output.writeMessageSetExtension(key.getNumber(), (com.google.protobuf.MessageLite) this.next.getValue());
                    } else {
                        com.google.protobuf.FieldSet.writeField(key, this.next.getValue(), output);
                    }
                    if (this.iter.hasNext()) {
                        this.next = this.iter.next();
                    } else {
                        this.next = null;
                    }
                }
            }
        }

        protected com.google.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>.ExtensionWriter newExtensionWriter() {
            return new com.google.protobuf.GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this, false, null);
        }

        protected com.google.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>.ExtensionWriter newMessageSetExtensionWriter() {
            return new com.google.protobuf.GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this, true, null);
        }

        protected int extensionsSerializedSize() {
            return this.extensions.getSerializedSize();
        }

        protected int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.getMessageSetSerializedSize();
        }
    }

    /* renamed from: com.google.protobuf.GeneratedMessageLite$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$JavaType;

        static {
            int[] iArr = new int[com.google.protobuf.WireFormat.JavaType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$JavaType = iArr;
            try {
                iArr[com.google.protobuf.WireFormat.JavaType.MESSAGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[com.google.protobuf.WireFormat.JavaType.ENUM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class ExtendableBuilder<MessageType extends com.google.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>, BuilderType extends com.google.protobuf.GeneratedMessageLite.ExtendableBuilder<MessageType, BuilderType>> extends com.google.protobuf.GeneratedMessageLite.Builder<MessageType, BuilderType> implements com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder<MessageType, BuilderType> {
        protected ExtendableBuilder(MessageType defaultInstance) {
            super(defaultInstance);
        }

        void internalSetExtensionSet(com.google.protobuf.FieldSet<com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor> extensions) {
            copyOnWrite();
            ((com.google.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).extensions = extensions;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.Builder
        protected void copyOnWriteInternal() {
            super.copyOnWriteInternal();
            if (((com.google.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).extensions != com.google.protobuf.FieldSet.emptySet()) {
                ((com.google.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).extensions = ((com.google.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).extensions.m5607clone();
            }
        }

        private com.google.protobuf.FieldSet<com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor> ensureExtensionsAreMutable() {
            com.google.protobuf.FieldSet<com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor> fieldSet = ((com.google.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).extensions;
            if (!fieldSet.isImmutable()) {
                return fieldSet;
            }
            com.google.protobuf.FieldSet<com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor> m5607clone = fieldSet.m5607clone();
            ((com.google.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).extensions = m5607clone;
            return m5607clone;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.Builder, com.google.protobuf.MessageLite.Builder
        public final MessageType buildPartial() {
            if (!((com.google.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).isMutable()) {
                return (MessageType) this.instance;
            }
            ((com.google.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).extensions.makeImmutable();
            return (MessageType) super.buildPartial();
        }

        private void verifyExtensionContainingType(final com.google.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, ?> extension) {
            if (extension.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
                throw new java.lang.IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> boolean hasExtension(final com.google.protobuf.ExtensionLite<MessageType, Type> extension) {
            return ((com.google.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).hasExtension(extension);
        }

        @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> int getExtensionCount(final com.google.protobuf.ExtensionLite<MessageType, java.util.List<Type>> extension) {
            return ((com.google.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).getExtensionCount(extension);
        }

        @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(com.google.protobuf.ExtensionLite<MessageType, Type> extensionLite) {
            return (Type) ((com.google.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).getExtension(extensionLite);
        }

        @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(com.google.protobuf.ExtensionLite<MessageType, java.util.List<Type>> extensionLite, int i) {
            return (Type) ((com.google.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).getExtension(extensionLite, i);
        }

        public final <Type> BuilderType setExtension(final com.google.protobuf.ExtensionLite<MessageType, Type> extension, final Type value) {
            com.google.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, ?> checkIsLite = com.google.protobuf.GeneratedMessageLite.checkIsLite(extension);
            verifyExtensionContainingType(checkIsLite);
            copyOnWrite();
            ensureExtensionsAreMutable().setField(checkIsLite.descriptor, checkIsLite.toFieldSetType(value));
            return this;
        }

        public final <Type> BuilderType setExtension(final com.google.protobuf.ExtensionLite<MessageType, java.util.List<Type>> extension, final int index, final Type value) {
            com.google.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, ?> checkIsLite = com.google.protobuf.GeneratedMessageLite.checkIsLite(extension);
            verifyExtensionContainingType(checkIsLite);
            copyOnWrite();
            ensureExtensionsAreMutable().setRepeatedField(checkIsLite.descriptor, index, checkIsLite.singularToFieldSetType(value));
            return this;
        }

        public final <Type> BuilderType addExtension(final com.google.protobuf.ExtensionLite<MessageType, java.util.List<Type>> extension, final Type value) {
            com.google.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, ?> checkIsLite = com.google.protobuf.GeneratedMessageLite.checkIsLite(extension);
            verifyExtensionContainingType(checkIsLite);
            copyOnWrite();
            ensureExtensionsAreMutable().addRepeatedField(checkIsLite.descriptor, checkIsLite.singularToFieldSetType(value));
            return this;
        }

        public final BuilderType clearExtension(final com.google.protobuf.ExtensionLite<MessageType, ?> extension) {
            com.google.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, ?> checkIsLite = com.google.protobuf.GeneratedMessageLite.checkIsLite(extension);
            verifyExtensionContainingType(checkIsLite);
            copyOnWrite();
            ensureExtensionsAreMutable().clearField(checkIsLite.descriptor);
            return this;
        }
    }

    public static <ContainingType extends com.google.protobuf.MessageLite, Type> com.google.protobuf.GeneratedMessageLite.GeneratedExtension<ContainingType, Type> newSingularGeneratedExtension(final ContainingType containingTypeDefaultInstance, final Type defaultValue, final com.google.protobuf.MessageLite messageDefaultInstance, final com.google.protobuf.Internal.EnumLiteMap<?> enumTypeMap, final int number, final com.google.protobuf.WireFormat.FieldType type, final java.lang.Class singularType) {
        return new com.google.protobuf.GeneratedMessageLite.GeneratedExtension<>(containingTypeDefaultInstance, defaultValue, messageDefaultInstance, new com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor(enumTypeMap, number, type, false, false), singularType);
    }

    public static <ContainingType extends com.google.protobuf.MessageLite, Type> com.google.protobuf.GeneratedMessageLite.GeneratedExtension<ContainingType, Type> newRepeatedGeneratedExtension(final ContainingType containingTypeDefaultInstance, final com.google.protobuf.MessageLite messageDefaultInstance, final com.google.protobuf.Internal.EnumLiteMap<?> enumTypeMap, final int number, final com.google.protobuf.WireFormat.FieldType type, final boolean isPacked, final java.lang.Class singularType) {
        return new com.google.protobuf.GeneratedMessageLite.GeneratedExtension<>(containingTypeDefaultInstance, java.util.Collections.emptyList(), messageDefaultInstance, new com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor(enumTypeMap, number, type, true, isPacked), singularType);
    }

    static final class ExtensionDescriptor implements com.google.protobuf.FieldSet.FieldDescriptorLite<com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor> {
        final com.google.protobuf.Internal.EnumLiteMap<?> enumTypeMap;
        final boolean isPacked;
        final boolean isRepeated;
        final int number;
        final com.google.protobuf.WireFormat.FieldType type;

        ExtensionDescriptor(final com.google.protobuf.Internal.EnumLiteMap<?> enumTypeMap, final int number, final com.google.protobuf.WireFormat.FieldType type, final boolean isRepeated, final boolean isPacked) {
            this.enumTypeMap = enumTypeMap;
            this.number = number;
            this.type = type;
            this.isRepeated = isRepeated;
            this.isPacked = isPacked;
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public int getNumber() {
            return this.number;
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public com.google.protobuf.WireFormat.FieldType getLiteType() {
            return this.type;
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public com.google.protobuf.WireFormat.JavaType getLiteJavaType() {
            return this.type.getJavaType();
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public boolean isRepeated() {
            return this.isRepeated;
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public boolean isPacked() {
            return this.isPacked;
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public com.google.protobuf.Internal.EnumLiteMap<?> getEnumType() {
            return this.enumTypeMap;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public com.google.protobuf.MessageLite.Builder internalMergeFrom(com.google.protobuf.MessageLite.Builder to, com.google.protobuf.MessageLite from) {
            return ((com.google.protobuf.GeneratedMessageLite.Builder) to).mergeFrom((com.google.protobuf.GeneratedMessageLite.Builder) from);
        }

        @Override // java.lang.Comparable
        public int compareTo(com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor other) {
            return this.number - other.number;
        }
    }

    static java.lang.reflect.Method getMethodOrDie(java.lang.Class clazz, java.lang.String name, java.lang.Class... params) {
        try {
            return clazz.getMethod(name, params);
        } catch (java.lang.NoSuchMethodException e) {
            throw new java.lang.RuntimeException("Generated message class \"" + clazz.getName() + "\" missing method \"" + name + "\".", e);
        }
    }

    static java.lang.Object invokeOrDie(java.lang.reflect.Method method, java.lang.Object object, java.lang.Object... params) {
        try {
            return method.invoke(object, params);
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

    public static class GeneratedExtension<ContainingType extends com.google.protobuf.MessageLite, Type> extends com.google.protobuf.ExtensionLite<ContainingType, Type> {
        final ContainingType containingTypeDefaultInstance;
        final Type defaultValue;
        final com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor descriptor;
        final com.google.protobuf.MessageLite messageDefaultInstance;

        GeneratedExtension(final ContainingType containingTypeDefaultInstance, final Type defaultValue, final com.google.protobuf.MessageLite messageDefaultInstance, final com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor descriptor, final java.lang.Class singularType) {
            if (containingTypeDefaultInstance == null) {
                throw new java.lang.IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (descriptor.getLiteType() == com.google.protobuf.WireFormat.FieldType.MESSAGE && messageDefaultInstance == null) {
                throw new java.lang.IllegalArgumentException("Null messageDefaultInstance");
            }
            this.containingTypeDefaultInstance = containingTypeDefaultInstance;
            this.defaultValue = defaultValue;
            this.messageDefaultInstance = messageDefaultInstance;
            this.descriptor = descriptor;
        }

        public ContainingType getContainingTypeDefaultInstance() {
            return this.containingTypeDefaultInstance;
        }

        @Override // com.google.protobuf.ExtensionLite
        public int getNumber() {
            return this.descriptor.getNumber();
        }

        @Override // com.google.protobuf.ExtensionLite
        public com.google.protobuf.MessageLite getMessageDefaultInstance() {
            return this.messageDefaultInstance;
        }

        java.lang.Object fromFieldSetType(java.lang.Object value) {
            if (this.descriptor.isRepeated()) {
                if (this.descriptor.getLiteJavaType() != com.google.protobuf.WireFormat.JavaType.ENUM) {
                    return value;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = ((java.util.List) value).iterator();
                while (it.hasNext()) {
                    arrayList.add(singularFromFieldSetType(it.next()));
                }
                return arrayList;
            }
            return singularFromFieldSetType(value);
        }

        java.lang.Object singularFromFieldSetType(java.lang.Object value) {
            return this.descriptor.getLiteJavaType() == com.google.protobuf.WireFormat.JavaType.ENUM ? this.descriptor.enumTypeMap.findValueByNumber(((java.lang.Integer) value).intValue()) : value;
        }

        java.lang.Object toFieldSetType(java.lang.Object value) {
            if (this.descriptor.isRepeated()) {
                if (this.descriptor.getLiteJavaType() != com.google.protobuf.WireFormat.JavaType.ENUM) {
                    return value;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = ((java.util.List) value).iterator();
                while (it.hasNext()) {
                    arrayList.add(singularToFieldSetType(it.next()));
                }
                return arrayList;
            }
            return singularToFieldSetType(value);
        }

        java.lang.Object singularToFieldSetType(java.lang.Object value) {
            return this.descriptor.getLiteJavaType() == com.google.protobuf.WireFormat.JavaType.ENUM ? java.lang.Integer.valueOf(((com.google.protobuf.Internal.EnumLite) value).getNumber()) : value;
        }

        @Override // com.google.protobuf.ExtensionLite
        public com.google.protobuf.WireFormat.FieldType getLiteType() {
            return this.descriptor.getLiteType();
        }

        @Override // com.google.protobuf.ExtensionLite
        public boolean isRepeated() {
            return this.descriptor.isRepeated;
        }

        @Override // com.google.protobuf.ExtensionLite
        public Type getDefaultValue() {
            return this.defaultValue;
        }
    }

    protected static final class SerializedForm implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final byte[] asBytes;
        private final java.lang.Class<?> messageClass;
        private final java.lang.String messageClassName;

        public static com.google.protobuf.GeneratedMessageLite.SerializedForm of(com.google.protobuf.MessageLite message) {
            return new com.google.protobuf.GeneratedMessageLite.SerializedForm(message);
        }

        SerializedForm(com.google.protobuf.MessageLite regularForm) {
            this.messageClass = regularForm.getClass();
            this.messageClassName = regularForm.getClass().getName();
            this.asBytes = regularForm.toByteArray();
        }

        protected java.lang.Object readResolve() throws java.io.ObjectStreamException {
            try {
                java.lang.reflect.Field declaredField = resolveMessageClass().getDeclaredField("DEFAULT_INSTANCE");
                declaredField.setAccessible(true);
                return ((com.google.protobuf.MessageLite) declaredField.get(null)).newBuilderForType().mergeFrom(this.asBytes).buildPartial();
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw new java.lang.RuntimeException("Unable to understand proto buffer", e);
            } catch (java.lang.ClassNotFoundException e2) {
                throw new java.lang.RuntimeException("Unable to find proto buffer class: " + this.messageClassName, e2);
            } catch (java.lang.IllegalAccessException e3) {
                throw new java.lang.RuntimeException("Unable to call parsePartialFrom", e3);
            } catch (java.lang.NoSuchFieldException unused) {
                return readResolveFallback();
            } catch (java.lang.SecurityException e4) {
                throw new java.lang.RuntimeException("Unable to call DEFAULT_INSTANCE in " + this.messageClassName, e4);
            }
        }

        @java.lang.Deprecated
        private java.lang.Object readResolveFallback() throws java.io.ObjectStreamException {
            try {
                java.lang.reflect.Field declaredField = resolveMessageClass().getDeclaredField("defaultInstance");
                declaredField.setAccessible(true);
                return ((com.google.protobuf.MessageLite) declaredField.get(null)).newBuilderForType().mergeFrom(this.asBytes).buildPartial();
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw new java.lang.RuntimeException("Unable to understand proto buffer", e);
            } catch (java.lang.ClassNotFoundException e2) {
                throw new java.lang.RuntimeException("Unable to find proto buffer class: " + this.messageClassName, e2);
            } catch (java.lang.IllegalAccessException e3) {
                throw new java.lang.RuntimeException("Unable to call parsePartialFrom", e3);
            } catch (java.lang.NoSuchFieldException e4) {
                throw new java.lang.RuntimeException("Unable to find defaultInstance in " + this.messageClassName, e4);
            } catch (java.lang.SecurityException e5) {
                throw new java.lang.RuntimeException("Unable to call defaultInstance in " + this.messageClassName, e5);
            }
        }

        private java.lang.Class<?> resolveMessageClass() throws java.lang.ClassNotFoundException {
            java.lang.Class<?> cls = this.messageClass;
            return cls != null ? cls : java.lang.Class.forName(this.messageClassName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends com.google.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>, BuilderType extends com.google.protobuf.GeneratedMessageLite.ExtendableBuilder<MessageType, BuilderType>, T> com.google.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, T> checkIsLite(com.google.protobuf.ExtensionLite<MessageType, T> extension) {
        if (!extension.isLite()) {
            throw new java.lang.IllegalArgumentException("Expected a lite extension.");
        }
        return (com.google.protobuf.GeneratedMessageLite.GeneratedExtension) extension;
    }

    protected static final <T extends com.google.protobuf.GeneratedMessageLite<T, ?>> boolean isInitialized(T message, boolean shouldMemoize) {
        byte byteValue = ((java.lang.Byte) message.dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean isInitialized = com.google.protobuf.Protobuf.getInstance().schemaFor((com.google.protobuf.Protobuf) message).isInitialized(message);
        if (shouldMemoize) {
            message.dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED, isInitialized ? message : null);
        }
        return isInitialized;
    }

    protected static com.google.protobuf.Internal.IntList emptyIntList() {
        return com.google.protobuf.IntArrayList.emptyList();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.Internal$IntList] */
    protected static com.google.protobuf.Internal.IntList mutableCopy(com.google.protobuf.Internal.IntList list) {
        int size = list.size();
        return list.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    protected static com.google.protobuf.Internal.LongList emptyLongList() {
        return com.google.protobuf.LongArrayList.emptyList();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.Internal$LongList] */
    protected static com.google.protobuf.Internal.LongList mutableCopy(com.google.protobuf.Internal.LongList list) {
        int size = list.size();
        return list.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    protected static com.google.protobuf.Internal.FloatList emptyFloatList() {
        return com.google.protobuf.FloatArrayList.emptyList();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.Internal$FloatList] */
    protected static com.google.protobuf.Internal.FloatList mutableCopy(com.google.protobuf.Internal.FloatList list) {
        int size = list.size();
        return list.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    protected static com.google.protobuf.Internal.DoubleList emptyDoubleList() {
        return com.google.protobuf.DoubleArrayList.emptyList();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.Internal$DoubleList] */
    protected static com.google.protobuf.Internal.DoubleList mutableCopy(com.google.protobuf.Internal.DoubleList list) {
        int size = list.size();
        return list.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    protected static com.google.protobuf.Internal.BooleanList emptyBooleanList() {
        return com.google.protobuf.BooleanArrayList.emptyList();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.Internal$BooleanList] */
    protected static com.google.protobuf.Internal.BooleanList mutableCopy(com.google.protobuf.Internal.BooleanList list) {
        int size = list.size();
        return list.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    protected static <E> com.google.protobuf.Internal.ProtobufList<E> emptyProtobufList() {
        return com.google.protobuf.ProtobufArrayList.emptyList();
    }

    protected static <E> com.google.protobuf.Internal.ProtobufList<E> mutableCopy(com.google.protobuf.Internal.ProtobufList<E> list) {
        int size = list.size();
        return list.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static class DefaultInstanceBasedParser<T extends com.google.protobuf.GeneratedMessageLite<T, ?>> extends com.google.protobuf.AbstractParser<T> {
        private final T defaultInstance;

        public DefaultInstanceBasedParser(T defaultInstance) {
            this.defaultInstance = defaultInstance;
        }

        @Override // com.google.protobuf.Parser
        public T parsePartialFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (T) com.google.protobuf.GeneratedMessageLite.parsePartialFrom(this.defaultInstance, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
        public T parsePartialFrom(byte[] bArr, int i, int i2, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (T) com.google.protobuf.GeneratedMessageLite.parsePartialFrom(this.defaultInstance, bArr, i, i2, extensionRegistryLite);
        }
    }

    static <T extends com.google.protobuf.GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        T t2 = (T) t.newMutableInstance();
        try {
            com.google.protobuf.Schema schemaFor = com.google.protobuf.Protobuf.getInstance().schemaFor((com.google.protobuf.Protobuf) t2);
            schemaFor.mergeFrom(t2, com.google.protobuf.CodedInputStreamReader.forCodedInput(codedInputStream), extensionRegistryLite);
            schemaFor.makeImmutable(t2);
            return t2;
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            e = e;
            if (e.getThrownFromInputStream()) {
                e = new com.google.protobuf.InvalidProtocolBufferException((java.io.IOException) e);
            }
            throw e.setUnfinishedMessage(t2);
        } catch (com.google.protobuf.UninitializedMessageException e2) {
            throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(t2);
        } catch (java.io.IOException e3) {
            if (e3.getCause() instanceof com.google.protobuf.InvalidProtocolBufferException) {
                throw ((com.google.protobuf.InvalidProtocolBufferException) e3.getCause());
            }
            throw new com.google.protobuf.InvalidProtocolBufferException(e3).setUnfinishedMessage(t2);
        } catch (java.lang.RuntimeException e4) {
            if (e4.getCause() instanceof com.google.protobuf.InvalidProtocolBufferException) {
                throw ((com.google.protobuf.InvalidProtocolBufferException) e4.getCause());
            }
            throw e4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends com.google.protobuf.GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, byte[] bArr, int i, int i2, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        T t2 = (T) t.newMutableInstance();
        try {
            com.google.protobuf.Schema schemaFor = com.google.protobuf.Protobuf.getInstance().schemaFor((com.google.protobuf.Protobuf) t2);
            schemaFor.mergeFrom(t2, bArr, i, i + i2, new com.google.protobuf.ArrayDecoders.Registers(extensionRegistryLite));
            schemaFor.makeImmutable(t2);
            return t2;
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            e = e;
            if (e.getThrownFromInputStream()) {
                e = new com.google.protobuf.InvalidProtocolBufferException((java.io.IOException) e);
            }
            throw e.setUnfinishedMessage(t2);
        } catch (com.google.protobuf.UninitializedMessageException e2) {
            throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(t2);
        } catch (java.io.IOException e3) {
            if (e3.getCause() instanceof com.google.protobuf.InvalidProtocolBufferException) {
                throw ((com.google.protobuf.InvalidProtocolBufferException) e3.getCause());
            }
            throw new com.google.protobuf.InvalidProtocolBufferException(e3).setUnfinishedMessage(t2);
        } catch (java.lang.IndexOutOfBoundsException unused) {
            throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage().setUnfinishedMessage(t2);
        }
    }

    protected static <T extends com.google.protobuf.GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, com.google.protobuf.CodedInputStream codedInputStream) throws com.google.protobuf.InvalidProtocolBufferException {
        return (T) parsePartialFrom(t, codedInputStream, com.google.protobuf.ExtensionRegistryLite.getEmptyRegistry());
    }

    private static <T extends com.google.protobuf.GeneratedMessageLite<T, ?>> T checkMessageInitialized(T message) throws com.google.protobuf.InvalidProtocolBufferException {
        if (message == null || message.isInitialized()) {
            return message;
        }
        throw message.newUninitializedMessageException().asInvalidProtocolBufferException().setUnfinishedMessage(message);
    }

    protected static <T extends com.google.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parseFrom(t, com.google.protobuf.CodedInputStream.newInstance(byteBuffer), extensionRegistryLite));
    }

    protected static <T extends com.google.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
        return (T) parseFrom(t, byteBuffer, com.google.protobuf.ExtensionRegistryLite.getEmptyRegistry());
    }

    protected static <T extends com.google.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parseFrom(t, byteString, com.google.protobuf.ExtensionRegistryLite.getEmptyRegistry()));
    }

    protected static <T extends com.google.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, byteString, extensionRegistryLite));
    }

    private static <T extends com.google.protobuf.GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        com.google.protobuf.CodedInputStream newCodedInput = byteString.newCodedInput();
        T t2 = (T) parsePartialFrom(t, newCodedInput, extensionRegistryLite);
        try {
            newCodedInput.checkLastTagWas(0);
            return t2;
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(t2);
        }
    }

    protected static <T extends com.google.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, com.google.protobuf.ExtensionRegistryLite.getEmptyRegistry()));
    }

    protected static <T extends com.google.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, extensionRegistryLite));
    }

    protected static <T extends com.google.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, java.io.InputStream inputStream) throws com.google.protobuf.InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, com.google.protobuf.CodedInputStream.newInstance(inputStream), com.google.protobuf.ExtensionRegistryLite.getEmptyRegistry()));
    }

    protected static <T extends com.google.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, com.google.protobuf.CodedInputStream.newInstance(inputStream), extensionRegistryLite));
    }

    protected static <T extends com.google.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, com.google.protobuf.CodedInputStream codedInputStream) throws com.google.protobuf.InvalidProtocolBufferException {
        return (T) parseFrom(t, codedInputStream, com.google.protobuf.ExtensionRegistryLite.getEmptyRegistry());
    }

    protected static <T extends com.google.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, codedInputStream, extensionRegistryLite));
    }

    protected static <T extends com.google.protobuf.GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, java.io.InputStream inputStream) throws com.google.protobuf.InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, com.google.protobuf.ExtensionRegistryLite.getEmptyRegistry()));
    }

    protected static <T extends com.google.protobuf.GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, extensionRegistryLite));
    }

    private static <T extends com.google.protobuf.GeneratedMessageLite<T, ?>> T parsePartialDelimitedFrom(T t, java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            com.google.protobuf.CodedInputStream newInstance = com.google.protobuf.CodedInputStream.newInstance(new com.google.protobuf.AbstractMessageLite.Builder.LimitedInputStream(inputStream, com.google.protobuf.CodedInputStream.readRawVarint32(read, inputStream)));
            T t2 = (T) parsePartialFrom(t, newInstance, extensionRegistryLite);
            try {
                newInstance.checkLastTagWas(0);
                return t2;
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(t2);
            }
        } catch (com.google.protobuf.InvalidProtocolBufferException e2) {
            if (e2.getThrownFromInputStream()) {
                throw new com.google.protobuf.InvalidProtocolBufferException((java.io.IOException) e2);
            }
            throw e2;
        } catch (java.io.IOException e3) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e3);
        }
    }
}
