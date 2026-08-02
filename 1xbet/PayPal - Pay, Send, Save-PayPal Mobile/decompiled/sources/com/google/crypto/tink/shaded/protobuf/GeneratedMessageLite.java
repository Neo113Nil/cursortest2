package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes4.dex */
public abstract class GeneratedMessageLite<MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<MessageType, BuilderType>> extends com.google.crypto.tink.shaded.protobuf.AbstractMessageLite<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static java.util.Map<java.lang.Object, com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<?, ?>> defaultInstanceMap = new java.util.concurrent.ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite unknownFields = com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite.getDefaultInstance();

    public interface ExtendableMessageOrBuilder<MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>, BuilderType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableBuilder<MessageType, BuilderType>> extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
        <Type> Type getExtension(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, Type> extensionLite);

        <Type> Type getExtension(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, java.util.List<Type>> extensionLite, int i);

        <Type> int getExtensionCount(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, java.util.List<Type>> extensionLite);

        <Type> boolean hasExtension(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, Type> extensionLite);
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

    protected abstract java.lang.Object dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2);

    boolean isMutable() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    void setMemoizedHashCode(int i) {
        this.memoizedHashCode = i;
    }

    void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    boolean hashCodeIsNotMemoized() {
        return getMemoizedHashCode() == 0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLite
    public final com.google.crypto.tink.shaded.protobuf.Parser<MessageType> getParserForType() {
        return (com.google.crypto.tink.shaded.protobuf.Parser) dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLite
    public final BuilderType newBuilderForType() {
        return (BuilderType) dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER);
    }

    MessageType newMutableInstance() {
        return (MessageType) dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE);
    }

    public java.lang.String toString() {
        return com.google.crypto.tink.shaded.protobuf.MessageLiteToString.toString(this, super.toString());
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
        return com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance().schemaFor((com.google.crypto.tink.shaded.protobuf.Protobuf) this).hashCode(this);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance().schemaFor((com.google.crypto.tink.shaded.protobuf.Protobuf) this).equals(this, (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) obj);
        }
        return false;
    }

    private void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite.getDefaultInstance()) {
            this.unknownFields = com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite.newInstance();
        }
    }

    protected boolean parseUnknownField(int i, com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        if (com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(i) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.mergeFieldFrom(i, codedInputStream);
    }

    protected void mergeVarintField(int i, int i2) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.mergeVarintField(i, i2);
    }

    protected void mergeLengthDelimitedField(int i, com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.mergeLengthDelimitedField(i, byteString);
    }

    protected void makeImmutable() {
        com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance().schemaFor((com.google.crypto.tink.shaded.protobuf.Protobuf) this).makeImmutable(this);
        markImmutable();
    }

    public final <MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<MessageType, BuilderType>> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER);
    }

    public final <MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<MessageType, BuilderType>> BuilderType createBuilder(MessageType messagetype) {
        return (BuilderType) createBuilder().mergeFrom(messagetype);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLite
    public final BuilderType toBuilder() {
        return (BuilderType) ((com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder) dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER)).mergeFrom((com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder) this);
    }

    protected java.lang.Object dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj) {
        return dynamicMethod(methodToInvoke, obj, null);
    }

    protected java.lang.Object dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        return dynamicMethod(methodToInvoke, null, null);
    }

    void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Integer.MAX_VALUE);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite
    int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite
    void setMemoizedSerializedSize(int i) {
        if (i < 0) {
            throw new java.lang.IllegalStateException("serialized size must be non-negative, was ".concat(java.lang.String.valueOf(i)));
        }
        this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLite
    public void writeTo(com.google.crypto.tink.shaded.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
        com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance().schemaFor((com.google.crypto.tink.shaded.protobuf.Protobuf) this).writeTo(this, com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter.forCodedOutput(codedOutputStream));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite
    int getSerializedSize(com.google.crypto.tink.shaded.protobuf.Schema schema) {
        if (isMutable()) {
            int computeSerializedSize = computeSerializedSize(schema);
            if (computeSerializedSize >= 0) {
                return computeSerializedSize;
            }
            throw new java.lang.IllegalStateException("serialized size must be non-negative, was ".concat(java.lang.String.valueOf(computeSerializedSize)));
        }
        if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        }
        int computeSerializedSize2 = computeSerializedSize(schema);
        setMemoizedSerializedSize(computeSerializedSize2);
        return computeSerializedSize2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLite
    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    private int computeSerializedSize(com.google.crypto.tink.shaded.protobuf.Schema<?> schema) {
        if (schema == null) {
            return com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance().schemaFor((com.google.crypto.tink.shaded.protobuf.Protobuf) this).getSerializedSize(this);
        }
        return schema.getSerializedSize(this);
    }

    java.lang.Object buildMessageInfo() throws java.lang.Exception {
        return dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO);
    }

    static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<?, ?>> T getDefaultInstance(java.lang.Class<T> cls) {
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
        T t2 = (T) ((com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) com.google.crypto.tink.shaded.protobuf.UnsafeUtil.allocateInstance(cls)).getDefaultInstanceForType();
        if (t2 == null) {
            throw new java.lang.IllegalStateException();
        }
        defaultInstanceMap.put(cls, t2);
        return t2;
    }

    public static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<?, ?>> void registerDefaultInstance(java.lang.Class<T> cls, T t) {
        t.markImmutable();
        defaultInstanceMap.put(cls, t);
    }

    protected static java.lang.Object newMessageInfo(com.google.crypto.tink.shaded.protobuf.MessageLite messageLite, java.lang.String str, java.lang.Object[] objArr) {
        return new com.google.crypto.tink.shaded.protobuf.RawMessageInfo(messageLite, str, objArr);
    }

    protected final void mergeUnknownFields(com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite unknownFieldSetLite) {
        this.unknownFields = com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite.mutableCopyOf(this.unknownFields, unknownFieldSetLite);
    }

    public static abstract class Builder<MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<MessageType, BuilderType>> extends com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder<MessageType, BuilderType> {
        private final MessageType defaultInstance;
        protected MessageType instance;

        public Builder(MessageType messagetype) {
            this.defaultInstance = messagetype;
            if (messagetype.isMutable()) {
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

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.isInitialized(this.instance, false);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final BuilderType clear() {
            if (this.defaultInstance.isMutable()) {
                throw new java.lang.IllegalArgumentException("Default instance must be immutable.");
            }
            this.instance = newMutableInstance();
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public BuilderType mo10407clone() {
            BuilderType buildertype = (BuilderType) getDefaultInstanceForType().newBuilderForType();
            buildertype.instance = buildPartial();
            return buildertype;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public MessageType buildPartial() {
            if (!this.instance.isMutable()) {
                return this.instance;
            }
            this.instance.makeImmutable();
            return this.instance;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final MessageType build() {
            MessageType buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        public BuilderType internalMergeFrom(MessageType messagetype) {
            return mergeFrom((com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<MessageType, BuilderType>) messagetype);
        }

        public BuilderType mergeFrom(MessageType messagetype) {
            if (getDefaultInstanceForType().equals(messagetype)) {
                return this;
            }
            copyOnWrite();
            mergeFromInstance(this.instance, messagetype);
            return this;
        }

        private static <MessageType> void mergeFromInstance(MessageType messagetype, MessageType messagetype2) {
            com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance().schemaFor((com.google.crypto.tink.shaded.protobuf.Protobuf) messagetype).mergeFrom(messagetype, messagetype2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public MessageType getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] bArr, int i, int i2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            copyOnWrite();
            try {
                com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance().schemaFor((com.google.crypto.tink.shaded.protobuf.Protobuf) this.instance).mergeFrom(this.instance, bArr, i, i + i2, new com.google.crypto.tink.shaded.protobuf.ArrayDecoders.Registers(extensionRegistryLite));
                return this;
            } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException e) {
                throw e;
            } catch (java.io.IOException e2) {
                throw new java.lang.RuntimeException("Reading from byte array should not throw IOException.", e2);
            } catch (java.lang.IndexOutOfBoundsException unused) {
                throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] bArr, int i, int i2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            return mergeFrom(bArr, i, i2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            copyOnWrite();
            try {
                com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance().schemaFor((com.google.crypto.tink.shaded.protobuf.Protobuf) this.instance).mergeFrom(this.instance, com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader.forCodedInput(codedInputStream), extensionRegistryLite);
                return this;
            } catch (java.lang.RuntimeException e) {
                if (e.getCause() instanceof java.io.IOException) {
                    throw ((java.io.IOException) e.getCause());
                }
                throw e;
            }
        }
    }

    public static abstract class ExtendableMessage<MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>, BuilderType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableBuilder<MessageType, BuilderType>> extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> implements com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder<MessageType, BuilderType> {
        protected com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor> extensions = com.google.crypto.tink.shaded.protobuf.FieldSet.emptySet();

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder newBuilderForType() {
            return super.newBuilderForType();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder toBuilder() {
            return super.toBuilder();
        }

        protected final void mergeExtensionFields(MessageType messagetype) {
            if (this.extensions.isImmutable()) {
                this.extensions = this.extensions.m10408clone();
            }
            this.extensions.mergeFrom(messagetype.extensions);
        }

        protected <MessageType extends com.google.crypto.tink.shaded.protobuf.MessageLite> boolean parseUnknownField(MessageType messagetype, com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite, int i) throws java.io.IOException {
            int tagFieldNumber = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(i);
            return parseExtension(codedInputStream, extensionRegistryLite, extensionRegistryLite.findLiteExtensionByNumber(messagetype, tagFieldNumber), i, tagFieldNumber);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x003b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private boolean parseExtension(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite, com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension, int i, int i2) throws java.io.IOException {
            boolean z;
            boolean z2;
            java.lang.Object build;
            com.google.crypto.tink.shaded.protobuf.MessageLite messageLite;
            int tagWireType = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(i);
            if (generatedExtension != null) {
                if (tagWireType == com.google.crypto.tink.shaded.protobuf.FieldSet.getWireFormatForFieldType(generatedExtension.descriptor.getLiteType(), false)) {
                    z2 = false;
                    z = false;
                } else if (generatedExtension.descriptor.isRepeated && generatedExtension.descriptor.type.isPackable() && tagWireType == com.google.crypto.tink.shaded.protobuf.FieldSet.getWireFormatForFieldType(generatedExtension.descriptor.getLiteType(), true)) {
                    z2 = false;
                    z = true;
                }
                if (!z2) {
                    return parseUnknownField(i, codedInputStream);
                }
                ensureExtensionsAreMutable();
                if (z) {
                    int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                    if (generatedExtension.descriptor.getLiteType() == com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.ENUM) {
                        while (codedInputStream.getBytesUntilLimit() > 0) {
                            java.lang.Object findValueByNumber = generatedExtension.descriptor.getEnumType().findValueByNumber(codedInputStream.readEnum());
                            if (findValueByNumber == null) {
                                return true;
                            }
                            this.extensions.addRepeatedField(generatedExtension.descriptor, generatedExtension.singularToFieldSetType(findValueByNumber));
                        }
                    } else {
                        while (codedInputStream.getBytesUntilLimit() > 0) {
                            this.extensions.addRepeatedField(generatedExtension.descriptor, com.google.crypto.tink.shaded.protobuf.FieldSet.readPrimitiveField(codedInputStream, generatedExtension.descriptor.getLiteType(), false));
                        }
                    }
                    codedInputStream.popLimit(pushLimit);
                } else {
                    int i3 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType[generatedExtension.descriptor.getLiteJavaType().ordinal()];
                    if (i3 == 1) {
                        com.google.crypto.tink.shaded.protobuf.MessageLite.Builder builder = (generatedExtension.descriptor.isRepeated() || (messageLite = (com.google.crypto.tink.shaded.protobuf.MessageLite) this.extensions.getField(generatedExtension.descriptor)) == null) ? null : messageLite.toBuilder();
                        if (builder == null) {
                            builder = generatedExtension.getMessageDefaultInstance().newBuilderForType();
                        }
                        if (generatedExtension.descriptor.getLiteType() == com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.GROUP) {
                            codedInputStream.readGroup(generatedExtension.getNumber(), builder, extensionRegistryLite);
                        } else {
                            codedInputStream.readMessage(builder, extensionRegistryLite);
                        }
                        build = builder.build();
                    } else if (i3 == 2) {
                        int readEnum = codedInputStream.readEnum();
                        java.lang.Object findValueByNumber2 = generatedExtension.descriptor.getEnumType().findValueByNumber(readEnum);
                        if (findValueByNumber2 == null) {
                            mergeVarintField(i2, readEnum);
                            return true;
                        }
                        build = findValueByNumber2;
                    } else {
                        build = com.google.crypto.tink.shaded.protobuf.FieldSet.readPrimitiveField(codedInputStream, generatedExtension.descriptor.getLiteType(), false);
                    }
                    if (generatedExtension.descriptor.isRepeated()) {
                        this.extensions.addRepeatedField(generatedExtension.descriptor, generatedExtension.singularToFieldSetType(build));
                    } else {
                        this.extensions.setField(generatedExtension.descriptor, generatedExtension.singularToFieldSetType(build));
                    }
                }
                return true;
            }
            z = false;
            z2 = true;
            if (!z2) {
            }
        }

        protected <MessageType extends com.google.crypto.tink.shaded.protobuf.MessageLite> boolean parseUnknownFieldAsMessageSet(MessageType messagetype, com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite, int i) throws java.io.IOException {
            if (i == com.google.crypto.tink.shaded.protobuf.WireFormat.MESSAGE_SET_ITEM_TAG) {
                mergeMessageSetExtensionFromCodedStream(messagetype, codedInputStream, extensionRegistryLite);
                return true;
            }
            if (com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(i) == 2) {
                return parseUnknownField(messagetype, codedInputStream, extensionRegistryLite, i);
            }
            return codedInputStream.skipField(i);
        }

        private <MessageType extends com.google.crypto.tink.shaded.protobuf.MessageLite> void mergeMessageSetExtensionFromCodedStream(MessageType messagetype, com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            int i = 0;
            com.google.crypto.tink.shaded.protobuf.ByteString byteString = null;
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension = null;
            while (true) {
                int readTag = codedInputStream.readTag();
                if (readTag == 0) {
                    break;
                }
                if (readTag == com.google.crypto.tink.shaded.protobuf.WireFormat.MESSAGE_SET_TYPE_ID_TAG) {
                    i = codedInputStream.readUInt32();
                    if (i != 0) {
                        generatedExtension = extensionRegistryLite.findLiteExtensionByNumber(messagetype, i);
                    }
                } else if (readTag == com.google.crypto.tink.shaded.protobuf.WireFormat.MESSAGE_SET_MESSAGE_TAG) {
                    if (i != 0 && generatedExtension != null) {
                        eagerlyMergeMessageSetExtension(codedInputStream, generatedExtension, extensionRegistryLite, i);
                        byteString = null;
                    } else {
                        byteString = codedInputStream.readBytes();
                    }
                } else if (!codedInputStream.skipField(readTag)) {
                    break;
                }
            }
            codedInputStream.checkLastTagWas(com.google.crypto.tink.shaded.protobuf.WireFormat.MESSAGE_SET_ITEM_END_TAG);
            if (byteString == null || i == 0) {
                return;
            }
            if (generatedExtension != null) {
                mergeMessageSetExtensionFromBytes(byteString, extensionRegistryLite, generatedExtension);
            } else if (byteString != null) {
                mergeLengthDelimitedField(i, byteString);
            }
        }

        private void eagerlyMergeMessageSetExtension(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream, com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite, int i) throws java.io.IOException {
            parseExtension(codedInputStream, extensionRegistryLite, generatedExtension, com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(i, 2), i);
        }

        private void mergeMessageSetExtensionFromBytes(com.google.crypto.tink.shaded.protobuf.ByteString byteString, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite, com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.MessageLite messageLite = (com.google.crypto.tink.shaded.protobuf.MessageLite) this.extensions.getField(generatedExtension.descriptor);
            com.google.crypto.tink.shaded.protobuf.MessageLite.Builder builder = messageLite != null ? messageLite.toBuilder() : null;
            if (builder == null) {
                builder = generatedExtension.getMessageDefaultInstance().newBuilderForType();
            }
            builder.mergeFrom(byteString, extensionRegistryLite);
            ensureExtensionsAreMutable().setField(generatedExtension.descriptor, generatedExtension.singularToFieldSetType(builder.build()));
        }

        com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor> ensureExtensionsAreMutable() {
            if (this.extensions.isImmutable()) {
                this.extensions = this.extensions.m10408clone();
            }
            return this.extensions;
        }

        private void verifyExtensionContainingType(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, ?> generatedExtension) {
            if (generatedExtension.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
                throw new java.lang.IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> boolean hasExtension(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, Type> extensionLite) {
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, ?> checkIsLite = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(checkIsLite);
            return this.extensions.hasField(checkIsLite.descriptor);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> int getExtensionCount(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, java.util.List<Type>> extensionLite) {
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, ?> checkIsLite = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(checkIsLite);
            return this.extensions.getRepeatedFieldCount(checkIsLite.descriptor);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, Type> extensionLite) {
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, ?> checkIsLite = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(checkIsLite);
            java.lang.Object field = this.extensions.getField(checkIsLite.descriptor);
            if (field == null) {
                return checkIsLite.defaultValue;
            }
            return (Type) checkIsLite.fromFieldSetType(field);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, java.util.List<Type>> extensionLite, int i) {
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, ?> checkIsLite = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(checkIsLite);
            return (Type) checkIsLite.singularFromFieldSetType(this.extensions.getRepeatedField(checkIsLite.descriptor, i));
        }

        protected boolean extensionsAreInitialized() {
            return this.extensions.isInitialized();
        }

        /* loaded from: classes9.dex */
        protected class ExtensionWriter {
            private final java.util.Iterator<java.util.Map.Entry<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor, java.lang.Object>> iter;
            private final boolean messageSetWireFormat;
            private java.util.Map.Entry<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor, java.lang.Object> next;

            /* synthetic */ ExtensionWriter(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage extendableMessage, boolean z, com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.AnonymousClass1 anonymousClass1) {
                this(z);
            }

            private ExtensionWriter(boolean z) {
                java.util.Iterator<java.util.Map.Entry<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor, java.lang.Object>> it = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage.this.extensions.iterator();
                this.iter = it;
                if (it.hasNext()) {
                    this.next = it.next();
                }
                this.messageSetWireFormat = z;
            }

            public void writeUntil(int i, com.google.crypto.tink.shaded.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
                while (true) {
                    java.util.Map.Entry<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor, java.lang.Object> entry = this.next;
                    if (entry == null || entry.getKey().getNumber() >= i) {
                        return;
                    }
                    com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor key = this.next.getKey();
                    if (this.messageSetWireFormat && key.getLiteJavaType() == com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.MESSAGE && !key.isRepeated()) {
                        codedOutputStream.writeMessageSetExtension(key.getNumber(), (com.google.crypto.tink.shaded.protobuf.MessageLite) this.next.getValue());
                    } else {
                        com.google.crypto.tink.shaded.protobuf.FieldSet.writeField(key, this.next.getValue(), codedOutputStream);
                    }
                    if (this.iter.hasNext()) {
                        this.next = this.iter.next();
                    } else {
                        this.next = null;
                    }
                }
            }
        }

        protected com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>.ExtensionWriter newExtensionWriter() {
            return new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this, false, null);
        }

        protected com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>.ExtensionWriter newMessageSetExtensionWriter() {
            return new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this, true, null);
        }

        protected int extensionsSerializedSize() {
            return this.extensions.getSerializedSize();
        }

        protected int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.getMessageSetSerializedSize();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$JavaType;

        static {
            int[] iArr = new int[com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$JavaType = iArr;
            try {
                iArr[com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.MESSAGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.ENUM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes9.dex */
    public static abstract class ExtendableBuilder<MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>, BuilderType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableBuilder<MessageType, BuilderType>> extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<MessageType, BuilderType> implements com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder<MessageType, BuilderType> {
        protected ExtendableBuilder(MessageType messagetype) {
            super(messagetype);
        }

        void internalSetExtensionSet(com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor> fieldSet) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).extensions = fieldSet;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder
        protected void copyOnWriteInternal() {
            super.copyOnWriteInternal();
            if (((com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).extensions != com.google.crypto.tink.shaded.protobuf.FieldSet.emptySet()) {
                ((com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).extensions = ((com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).extensions.m10408clone();
            }
        }

        private com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor> ensureExtensionsAreMutable() {
            com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor> fieldSet = ((com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).extensions;
            if (!fieldSet.isImmutable()) {
                return fieldSet;
            }
            com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor> m10408clone = fieldSet.m10408clone();
            ((com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).extensions = m10408clone;
            return m10408clone;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final MessageType buildPartial() {
            if (!((com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).isMutable()) {
                return (MessageType) this.instance;
            }
            ((com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).extensions.makeImmutable();
            return (MessageType) super.buildPartial();
        }

        private void verifyExtensionContainingType(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, ?> generatedExtension) {
            if (generatedExtension.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
                throw new java.lang.IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> boolean hasExtension(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, Type> extensionLite) {
            return ((com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).hasExtension(extensionLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> int getExtensionCount(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, java.util.List<Type>> extensionLite) {
            return ((com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).getExtensionCount(extensionLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, Type> extensionLite) {
            return (Type) ((com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).getExtension(extensionLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, java.util.List<Type>> extensionLite, int i) {
            return (Type) ((com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) this.instance).getExtension(extensionLite, i);
        }

        public final <Type> BuilderType setExtension(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, Type> extensionLite, Type type) {
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, ?> checkIsLite = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(checkIsLite);
            copyOnWrite();
            ensureExtensionsAreMutable().setField(checkIsLite.descriptor, checkIsLite.toFieldSetType(type));
            return this;
        }

        public final <Type> BuilderType setExtension(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, java.util.List<Type>> extensionLite, int i, Type type) {
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, ?> checkIsLite = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(checkIsLite);
            copyOnWrite();
            ensureExtensionsAreMutable().setRepeatedField(checkIsLite.descriptor, i, checkIsLite.singularToFieldSetType(type));
            return this;
        }

        public final <Type> BuilderType addExtension(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, java.util.List<Type>> extensionLite, Type type) {
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, ?> checkIsLite = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(checkIsLite);
            copyOnWrite();
            ensureExtensionsAreMutable().addRepeatedField(checkIsLite.descriptor, checkIsLite.singularToFieldSetType(type));
            return this;
        }

        public final BuilderType clearExtension(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, ?> extensionLite) {
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, ?> checkIsLite = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(checkIsLite);
            copyOnWrite();
            ensureExtensionsAreMutable().clearField(checkIsLite.descriptor);
            return this;
        }
    }

    public static <ContainingType extends com.google.crypto.tink.shaded.protobuf.MessageLite, Type> com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, com.google.crypto.tink.shaded.protobuf.MessageLite messageLite, com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<?> enumLiteMap, int i, com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType fieldType, java.lang.Class cls) {
        return new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension<>(containingtype, type, messageLite, new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor(enumLiteMap, i, fieldType, false, false), cls);
    }

    public static <ContainingType extends com.google.crypto.tink.shaded.protobuf.MessageLite, Type> com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, com.google.crypto.tink.shaded.protobuf.MessageLite messageLite, com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<?> enumLiteMap, int i, com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType fieldType, boolean z, java.lang.Class cls) {
        return new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension<>(containingtype, java.util.Collections.emptyList(), messageLite, new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor(enumLiteMap, i, fieldType, true, z), cls);
    }

    static final class ExtensionDescriptor implements com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor> {
        final com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<?> enumTypeMap;
        final boolean isPacked;
        final boolean isRepeated;
        final int number;
        final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType type;

        ExtensionDescriptor(com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<?> enumLiteMap, int i, com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType fieldType, boolean z, boolean z2) {
            this.enumTypeMap = enumLiteMap;
            this.number = i;
            this.type = fieldType;
            this.isRepeated = z;
            this.isPacked = z2;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite
        public final int getNumber() {
            return this.number;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite
        public final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType getLiteType() {
            return this.type;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite
        public final com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType getLiteJavaType() {
            return this.type.getJavaType();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite
        public final boolean isRepeated() {
            return this.isRepeated;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite
        public final boolean isPacked() {
            return this.isPacked;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite
        public final com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<?> getEnumType() {
            return this.enumTypeMap;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite
        public final com.google.crypto.tink.shaded.protobuf.MessageLite.Builder internalMergeFrom(com.google.crypto.tink.shaded.protobuf.MessageLite.Builder builder, com.google.crypto.tink.shaded.protobuf.MessageLite messageLite) {
            return ((com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder) builder).mergeFrom((com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder) messageLite);
        }

        @Override // java.lang.Comparable
        public final int compareTo(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor extensionDescriptor) {
            return this.number - extensionDescriptor.number;
        }
    }

    static java.lang.reflect.Method getMethodOrDie(java.lang.Class cls, java.lang.String str, java.lang.Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (java.lang.NoSuchMethodException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Generated message class \"");
            sb.append(cls.getName());
            sb.append("\" missing method \"");
            sb.append(str);
            sb.append("\".");
            throw new java.lang.RuntimeException(sb.toString(), e);
        }
    }

    static java.lang.Object invokeOrDie(java.lang.reflect.Method method, java.lang.Object obj, java.lang.Object... objArr) {
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

    public static class GeneratedExtension<ContainingType extends com.google.crypto.tink.shaded.protobuf.MessageLite, Type> extends com.google.crypto.tink.shaded.protobuf.ExtensionLite<ContainingType, Type> {
        final ContainingType containingTypeDefaultInstance;
        final Type defaultValue;
        final com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor descriptor;
        final com.google.crypto.tink.shaded.protobuf.MessageLite messageDefaultInstance;

        GeneratedExtension(ContainingType containingtype, Type type, com.google.crypto.tink.shaded.protobuf.MessageLite messageLite, com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor extensionDescriptor, java.lang.Class cls) {
            if (containingtype == null) {
                throw new java.lang.IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (extensionDescriptor.getLiteType() == com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.MESSAGE && messageLite == null) {
                throw new java.lang.IllegalArgumentException("Null messageDefaultInstance");
            }
            this.containingTypeDefaultInstance = containingtype;
            this.defaultValue = type;
            this.messageDefaultInstance = messageLite;
            this.descriptor = extensionDescriptor;
        }

        public ContainingType getContainingTypeDefaultInstance() {
            return this.containingTypeDefaultInstance;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ExtensionLite
        public int getNumber() {
            return this.descriptor.getNumber();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ExtensionLite
        public com.google.crypto.tink.shaded.protobuf.MessageLite getMessageDefaultInstance() {
            return this.messageDefaultInstance;
        }

        java.lang.Object fromFieldSetType(java.lang.Object obj) {
            if (this.descriptor.isRepeated()) {
                if (this.descriptor.getLiteJavaType() != com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.ENUM) {
                    return obj;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = ((java.util.List) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add(singularFromFieldSetType(it.next()));
                }
                return arrayList;
            }
            return singularFromFieldSetType(obj);
        }

        java.lang.Object singularFromFieldSetType(java.lang.Object obj) {
            return this.descriptor.getLiteJavaType() == com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.ENUM ? this.descriptor.enumTypeMap.findValueByNumber(((java.lang.Integer) obj).intValue()) : obj;
        }

        java.lang.Object toFieldSetType(java.lang.Object obj) {
            if (this.descriptor.isRepeated()) {
                if (this.descriptor.getLiteJavaType() != com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.ENUM) {
                    return obj;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = ((java.util.List) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add(singularToFieldSetType(it.next()));
                }
                return arrayList;
            }
            return singularToFieldSetType(obj);
        }

        java.lang.Object singularToFieldSetType(java.lang.Object obj) {
            return this.descriptor.getLiteJavaType() == com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.ENUM ? java.lang.Integer.valueOf(((com.google.crypto.tink.shaded.protobuf.Internal.EnumLite) obj).getNumber()) : obj;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ExtensionLite
        public com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType getLiteType() {
            return this.descriptor.getLiteType();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ExtensionLite
        public boolean isRepeated() {
            return this.descriptor.isRepeated;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ExtensionLite
        public Type getDefaultValue() {
            return this.defaultValue;
        }
    }

    /* loaded from: classes9.dex */
    protected static final class SerializedForm implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final byte[] asBytes;
        private final java.lang.Class<?> messageClass;
        private final java.lang.String messageClassName;

        public static com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.SerializedForm of(com.google.crypto.tink.shaded.protobuf.MessageLite messageLite) {
            return new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.SerializedForm(messageLite);
        }

        SerializedForm(com.google.crypto.tink.shaded.protobuf.MessageLite messageLite) {
            this.messageClass = messageLite.getClass();
            this.messageClassName = messageLite.getClass().getName();
            this.asBytes = messageLite.toByteArray();
        }

        protected final java.lang.Object readResolve() throws java.io.ObjectStreamException {
            try {
                java.lang.reflect.Field declaredField = resolveMessageClass().getDeclaredField("DEFAULT_INSTANCE");
                declaredField.setAccessible(true);
                return ((com.google.crypto.tink.shaded.protobuf.MessageLite) declaredField.get(null)).newBuilderForType().mergeFrom(this.asBytes).buildPartial();
            } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException e) {
                throw new java.lang.RuntimeException("Unable to understand proto buffer", e);
            } catch (java.lang.ClassNotFoundException e2) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to find proto buffer class: ");
                sb.append(this.messageClassName);
                throw new java.lang.RuntimeException(sb.toString(), e2);
            } catch (java.lang.IllegalAccessException e3) {
                throw new java.lang.RuntimeException("Unable to call parsePartialFrom", e3);
            } catch (java.lang.NoSuchFieldException e4) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unable to find DEFAULT_INSTANCE in ");
                sb2.append(this.messageClassName);
                throw new java.lang.RuntimeException(sb2.toString(), e4);
            } catch (java.lang.SecurityException e5) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Unable to call DEFAULT_INSTANCE in ");
                sb3.append(this.messageClassName);
                throw new java.lang.RuntimeException(sb3.toString(), e5);
            }
        }

        private java.lang.Class<?> resolveMessageClass() throws java.lang.ClassNotFoundException {
            java.lang.Class<?> cls = this.messageClass;
            return cls != null ? cls : java.lang.Class.forName(this.messageClassName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>, BuilderType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableBuilder<MessageType, BuilderType>, T> com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, T> checkIsLite(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, T> extensionLite) {
        if (!extensionLite.isLite()) {
            throw new java.lang.IllegalArgumentException("Expected a lite extension.");
        }
        return (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension) extensionLite;
    }

    protected static final <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> boolean isInitialized(T t, boolean z) {
        byte byteValue = ((java.lang.Byte) t.dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean isInitialized = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance().schemaFor((com.google.crypto.tink.shaded.protobuf.Protobuf) t).isInitialized(t);
        if (z) {
            t.dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED, isInitialized ? t : null);
        }
        return isInitialized;
    }

    protected static com.google.crypto.tink.shaded.protobuf.Internal.IntList emptyIntList() {
        return com.google.crypto.tink.shaded.protobuf.IntArrayList.emptyList();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.crypto.tink.shaded.protobuf.Internal$IntList] */
    protected static com.google.crypto.tink.shaded.protobuf.Internal.IntList mutableCopy(com.google.crypto.tink.shaded.protobuf.Internal.IntList intList) {
        int size = intList.size();
        return intList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    protected static com.google.crypto.tink.shaded.protobuf.Internal.LongList emptyLongList() {
        return com.google.crypto.tink.shaded.protobuf.LongArrayList.emptyList();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.crypto.tink.shaded.protobuf.Internal$LongList] */
    protected static com.google.crypto.tink.shaded.protobuf.Internal.LongList mutableCopy(com.google.crypto.tink.shaded.protobuf.Internal.LongList longList) {
        int size = longList.size();
        return longList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    protected static com.google.crypto.tink.shaded.protobuf.Internal.FloatList emptyFloatList() {
        return com.google.crypto.tink.shaded.protobuf.FloatArrayList.emptyList();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.crypto.tink.shaded.protobuf.Internal$FloatList] */
    protected static com.google.crypto.tink.shaded.protobuf.Internal.FloatList mutableCopy(com.google.crypto.tink.shaded.protobuf.Internal.FloatList floatList) {
        int size = floatList.size();
        return floatList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    protected static com.google.crypto.tink.shaded.protobuf.Internal.DoubleList emptyDoubleList() {
        return com.google.crypto.tink.shaded.protobuf.DoubleArrayList.emptyList();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.crypto.tink.shaded.protobuf.Internal$DoubleList] */
    protected static com.google.crypto.tink.shaded.protobuf.Internal.DoubleList mutableCopy(com.google.crypto.tink.shaded.protobuf.Internal.DoubleList doubleList) {
        int size = doubleList.size();
        return doubleList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    protected static com.google.crypto.tink.shaded.protobuf.Internal.BooleanList emptyBooleanList() {
        return com.google.crypto.tink.shaded.protobuf.BooleanArrayList.emptyList();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.crypto.tink.shaded.protobuf.Internal$BooleanList] */
    protected static com.google.crypto.tink.shaded.protobuf.Internal.BooleanList mutableCopy(com.google.crypto.tink.shaded.protobuf.Internal.BooleanList booleanList) {
        int size = booleanList.size();
        return booleanList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    protected static <E> com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<E> emptyProtobufList() {
        return com.google.crypto.tink.shaded.protobuf.ProtobufArrayList.emptyList();
    }

    public static <E> com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<E> mutableCopy(com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<E> protobufList) {
        int size = protobufList.size();
        return protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    public static class DefaultInstanceBasedParser<T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> extends com.google.crypto.tink.shaded.protobuf.AbstractParser<T> {
        private final T defaultInstance;

        public DefaultInstanceBasedParser(T t) {
            this.defaultInstance = t;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Parser
        public T parsePartialFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            return (T) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parsePartialFrom(this.defaultInstance, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractParser, com.google.crypto.tink.shaded.protobuf.Parser
        public T parsePartialFrom(byte[] bArr, int i, int i2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            return (T) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parsePartialFrom(this.defaultInstance, bArr, i, i2, extensionRegistryLite);
        }
    }

    static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        T t2 = (T) t.newMutableInstance();
        try {
            com.google.crypto.tink.shaded.protobuf.Schema schemaFor = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance().schemaFor((com.google.crypto.tink.shaded.protobuf.Protobuf) t2);
            schemaFor.mergeFrom(t2, com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader.forCodedInput(codedInputStream), extensionRegistryLite);
            schemaFor.makeImmutable(t2);
            return t2;
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException e) {
            e = e;
            if (e.getThrownFromInputStream()) {
                e = new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException((java.io.IOException) e);
            }
            throw e.setUnfinishedMessage(t2);
        } catch (com.google.crypto.tink.shaded.protobuf.UninitializedMessageException e2) {
            throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(t2);
        } catch (java.io.IOException e3) {
            if (e3.getCause() instanceof com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException) {
                throw ((com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException) e3.getCause());
            }
            throw new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException(e3).setUnfinishedMessage(t2);
        } catch (java.lang.RuntimeException e4) {
            if (e4.getCause() instanceof com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException) {
                throw ((com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException) e4.getCause());
            }
            throw e4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, byte[] bArr, int i, int i2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        if (i2 == 0) {
            return t;
        }
        T t2 = (T) t.newMutableInstance();
        try {
            com.google.crypto.tink.shaded.protobuf.Schema schemaFor = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance().schemaFor((com.google.crypto.tink.shaded.protobuf.Protobuf) t2);
            schemaFor.mergeFrom(t2, bArr, i, i + i2, new com.google.crypto.tink.shaded.protobuf.ArrayDecoders.Registers(extensionRegistryLite));
            schemaFor.makeImmutable(t2);
            return t2;
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException e) {
            e = e;
            if (e.getThrownFromInputStream()) {
                e = new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException((java.io.IOException) e);
            }
            throw e.setUnfinishedMessage(t2);
        } catch (com.google.crypto.tink.shaded.protobuf.UninitializedMessageException e2) {
            throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(t2);
        } catch (java.io.IOException e3) {
            if (e3.getCause() instanceof com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException) {
                throw ((com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException) e3.getCause());
            }
            throw new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException(e3).setUnfinishedMessage(t2);
        } catch (java.lang.IndexOutOfBoundsException unused) {
            throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage().setUnfinishedMessage(t2);
        }
    }

    protected static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (T) parsePartialFrom(t, codedInputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
    }

    private static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T checkMessageInitialized(T t) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        if (t == null || t.isInitialized()) {
            return t;
        }
        throw t.newUninitializedMessageException().asInvalidProtocolBufferException().setUnfinishedMessage(t);
    }

    public static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, java.nio.ByteBuffer byteBuffer, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parseFrom(t, com.google.crypto.tink.shaded.protobuf.CodedInputStream.newInstance(byteBuffer), extensionRegistryLite));
    }

    public static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, java.nio.ByteBuffer byteBuffer) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (T) parseFrom(t, byteBuffer, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
    }

    public static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parseFrom(t, byteString, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()));
    }

    public static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, com.google.crypto.tink.shaded.protobuf.ByteString byteString, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, byteString, extensionRegistryLite));
    }

    private static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, com.google.crypto.tink.shaded.protobuf.ByteString byteString, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        com.google.crypto.tink.shaded.protobuf.CodedInputStream newCodedInput = byteString.newCodedInput();
        T t2 = (T) parsePartialFrom(t, newCodedInput, extensionRegistryLite);
        try {
            newCodedInput.checkLastTagWas(0);
            return t2;
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(t2);
        }
    }

    public static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()));
    }

    public static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, extensionRegistryLite));
    }

    public static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, java.io.InputStream inputStream) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, com.google.crypto.tink.shaded.protobuf.CodedInputStream.newInstance(inputStream), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()));
    }

    public static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, com.google.crypto.tink.shaded.protobuf.CodedInputStream.newInstance(inputStream), extensionRegistryLite));
    }

    public static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (T) parseFrom(t, codedInputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
    }

    public static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T t, com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, codedInputStream, extensionRegistryLite));
    }

    public static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, java.io.InputStream inputStream) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()));
    }

    public static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, extensionRegistryLite));
    }

    private static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parsePartialDelimitedFrom(T t, java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            com.google.crypto.tink.shaded.protobuf.CodedInputStream newInstance = com.google.crypto.tink.shaded.protobuf.CodedInputStream.newInstance(new com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder.LimitedInputStream(inputStream, com.google.crypto.tink.shaded.protobuf.CodedInputStream.readRawVarint32(read, inputStream)));
            T t2 = (T) parsePartialFrom(t, newInstance, extensionRegistryLite);
            try {
                newInstance.checkLastTagWas(0);
                return t2;
            } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(t2);
            }
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException e2) {
            if (e2.getThrownFromInputStream()) {
                throw new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException((java.io.IOException) e2);
            }
            throw e2;
        } catch (java.io.IOException e3) {
            throw new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException(e3);
        }
    }
}
