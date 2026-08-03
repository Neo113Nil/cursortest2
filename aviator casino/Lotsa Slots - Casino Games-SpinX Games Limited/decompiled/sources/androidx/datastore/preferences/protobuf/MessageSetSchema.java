package androidx.datastore.preferences.protobuf;

@androidx.datastore.preferences.protobuf.CheckReturnValue
/* loaded from: classes2.dex */
final class MessageSetSchema<T> implements androidx.datastore.preferences.protobuf.Schema<T> {
    private final androidx.datastore.preferences.protobuf.MessageLite defaultInstance;
    private final androidx.datastore.preferences.protobuf.ExtensionSchema<?> extensionSchema;
    private final boolean hasExtensions;
    private final androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema;

    private MessageSetSchema(androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema, androidx.datastore.preferences.protobuf.ExtensionSchema<?> extensionSchema, androidx.datastore.preferences.protobuf.MessageLite defaultInstance) {
        this.unknownFieldSchema = unknownFieldSchema;
        this.hasExtensions = extensionSchema.hasExtensions(defaultInstance);
        this.extensionSchema = extensionSchema;
        this.defaultInstance = defaultInstance;
    }

    static <T> androidx.datastore.preferences.protobuf.MessageSetSchema<T> newSchema(androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema, androidx.datastore.preferences.protobuf.ExtensionSchema<?> extensionSchema, androidx.datastore.preferences.protobuf.MessageLite defaultInstance) {
        return new androidx.datastore.preferences.protobuf.MessageSetSchema<>(unknownFieldSchema, extensionSchema, defaultInstance);
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public T newInstance() {
        androidx.datastore.preferences.protobuf.MessageLite messageLite = this.defaultInstance;
        if (messageLite instanceof androidx.datastore.preferences.protobuf.GeneratedMessageLite) {
            return (T) ((androidx.datastore.preferences.protobuf.GeneratedMessageLite) messageLite).newMutableInstance();
        }
        return (T) messageLite.newBuilderForType().buildPartial();
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public boolean equals(T message, T other) {
        if (!this.unknownFieldSchema.getFromMessage(message).equals(this.unknownFieldSchema.getFromMessage(other))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(message).equals(this.extensionSchema.getExtensions(other));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public int hashCode(T message) {
        int hashCode = this.unknownFieldSchema.getFromMessage(message).hashCode();
        return this.hasExtensions ? (hashCode * 53) + this.extensionSchema.getExtensions(message).hashCode() : hashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void mergeFrom(T message, T other) {
        androidx.datastore.preferences.protobuf.SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, message, other);
        if (this.hasExtensions) {
            androidx.datastore.preferences.protobuf.SchemaUtil.mergeExtensions(this.extensionSchema, message, other);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void writeTo(T message, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        java.util.Iterator<java.util.Map.Entry<?, java.lang.Object>> it = this.extensionSchema.getExtensions(message).iterator();
        while (it.hasNext()) {
            java.util.Map.Entry<?, java.lang.Object> next = it.next();
            androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite fieldDescriptorLite = (androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite) next.getKey();
            if (fieldDescriptorLite.getLiteJavaType() != androidx.datastore.preferences.protobuf.WireFormat.JavaType.MESSAGE || fieldDescriptorLite.isRepeated() || fieldDescriptorLite.isPacked()) {
                throw new java.lang.IllegalStateException("Found invalid MessageSet item.");
            }
            if (next instanceof androidx.datastore.preferences.protobuf.LazyField.LazyEntry) {
                writer.writeMessageSetItem(fieldDescriptorLite.getNumber(), ((androidx.datastore.preferences.protobuf.LazyField.LazyEntry) next).getField().toByteString());
            } else {
                writer.writeMessageSetItem(fieldDescriptorLite.getNumber(), next.getValue());
            }
        }
        writeUnknownFieldsHelper(this.unknownFieldSchema, message, writer);
    }

    private <UT, UB> void writeUnknownFieldsHelper(androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema, T message, androidx.datastore.preferences.protobuf.Writer writer) throws java.io.IOException {
        unknownFieldSchema.writeAsMessageSetTo(unknownFieldSchema.getFromMessage(message), writer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cb A[EDGE_INSN: B:24:0x00cb->B:25:0x00cb BREAK  A[LOOP:1: B:10:0x006d->B:18:0x006d], SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mergeFrom(T message, byte[] data, int position, int limit, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        androidx.datastore.preferences.protobuf.GeneratedMessageLite generatedMessageLite = (androidx.datastore.preferences.protobuf.GeneratedMessageLite) message;
        androidx.datastore.preferences.protobuf.UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite == androidx.datastore.preferences.protobuf.UnknownFieldSetLite.getDefaultInstance()) {
            unknownFieldSetLite = androidx.datastore.preferences.protobuf.UnknownFieldSetLite.newInstance();
            generatedMessageLite.unknownFields = unknownFieldSetLite;
        }
        androidx.datastore.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor> ensureExtensionsAreMutable = ((androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage) message).ensureExtensionsAreMutable();
        androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension generatedExtension = null;
        while (position < limit) {
            int decodeVarint32 = androidx.datastore.preferences.protobuf.ArrayDecoders.decodeVarint32(data, position, registers);
            int i = registers.int1;
            if (i == androidx.datastore.preferences.protobuf.WireFormat.MESSAGE_SET_ITEM_TAG) {
                int i2 = 0;
                androidx.datastore.preferences.protobuf.ByteString byteString = null;
                while (decodeVarint32 < limit) {
                    decodeVarint32 = androidx.datastore.preferences.protobuf.ArrayDecoders.decodeVarint32(data, decodeVarint32, registers);
                    int i3 = registers.int1;
                    int tagFieldNumber = androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(i3);
                    int tagWireType = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(i3);
                    if (tagFieldNumber != 2) {
                        if (tagFieldNumber == 3) {
                            if (generatedExtension != null) {
                                decodeVarint32 = androidx.datastore.preferences.protobuf.ArrayDecoders.decodeMessageField(androidx.datastore.preferences.protobuf.Protobuf.getInstance().schemaFor((java.lang.Class) generatedExtension.getMessageDefaultInstance().getClass()), data, decodeVarint32, limit, registers);
                                ensureExtensionsAreMutable.setField(generatedExtension.descriptor, registers.object1);
                            } else if (tagWireType == 2) {
                                decodeVarint32 = androidx.datastore.preferences.protobuf.ArrayDecoders.decodeBytes(data, decodeVarint32, registers);
                                byteString = (androidx.datastore.preferences.protobuf.ByteString) registers.object1;
                            }
                        }
                        if (i3 != androidx.datastore.preferences.protobuf.WireFormat.MESSAGE_SET_ITEM_END_TAG) {
                            break;
                        } else {
                            decodeVarint32 = androidx.datastore.preferences.protobuf.ArrayDecoders.skipField(i3, data, decodeVarint32, limit, registers);
                        }
                    } else if (tagWireType == 0) {
                        decodeVarint32 = androidx.datastore.preferences.protobuf.ArrayDecoders.decodeVarint32(data, decodeVarint32, registers);
                        i2 = registers.int1;
                        generatedExtension = (androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension) this.extensionSchema.findExtensionByNumber(registers.extensionRegistry, this.defaultInstance, i2);
                    } else if (i3 != androidx.datastore.preferences.protobuf.WireFormat.MESSAGE_SET_ITEM_END_TAG) {
                    }
                }
                if (byteString != null) {
                    unknownFieldSetLite.storeField(androidx.datastore.preferences.protobuf.WireFormat.makeTag(i2, 2), byteString);
                }
                position = decodeVarint32;
            } else if (androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(i) == 2) {
                androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension generatedExtension2 = (androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension) this.extensionSchema.findExtensionByNumber(registers.extensionRegistry, this.defaultInstance, androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(i));
                if (generatedExtension2 != null) {
                    position = androidx.datastore.preferences.protobuf.ArrayDecoders.decodeMessageField(androidx.datastore.preferences.protobuf.Protobuf.getInstance().schemaFor((java.lang.Class) generatedExtension2.getMessageDefaultInstance().getClass()), data, decodeVarint32, limit, registers);
                    ensureExtensionsAreMutable.setField(generatedExtension2.descriptor, registers.object1);
                } else {
                    position = androidx.datastore.preferences.protobuf.ArrayDecoders.decodeUnknownField(i, data, decodeVarint32, limit, unknownFieldSetLite, registers);
                }
                generatedExtension = generatedExtension2;
            } else {
                position = androidx.datastore.preferences.protobuf.ArrayDecoders.skipField(i, data, decodeVarint32, limit, registers);
            }
        }
        if (position != limit) {
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.parseFailure();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void mergeFrom(T message, androidx.datastore.preferences.protobuf.Reader reader, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, message, reader, extensionRegistry);
    }

    private <UT, UB, ET extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema, androidx.datastore.preferences.protobuf.ExtensionSchema<ET> extensionSchema, T message, androidx.datastore.preferences.protobuf.Reader reader, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        UB builderFromMessage = unknownFieldSchema.getBuilderFromMessage(message);
        androidx.datastore.preferences.protobuf.FieldSet<ET> mutableExtensions = extensionSchema.getMutableExtensions(message);
        do {
            try {
                if (reader.getFieldNumber() == Integer.MAX_VALUE) {
                    return;
                }
            } finally {
                unknownFieldSchema.setBuilderToMessage(message, builderFromMessage);
            }
        } while (parseMessageSetItemOrUnknownField(reader, extensionRegistry, extensionSchema, mutableExtensions, unknownFieldSchema, builderFromMessage));
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void makeImmutable(T message) {
        this.unknownFieldSchema.makeImmutable(message);
        this.extensionSchema.makeImmutable(message);
    }

    private <UT, UB, ET extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<ET>> boolean parseMessageSetItemOrUnknownField(androidx.datastore.preferences.protobuf.Reader reader, androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry, androidx.datastore.preferences.protobuf.ExtensionSchema<ET> extensionSchema, androidx.datastore.preferences.protobuf.FieldSet<ET> extensions, androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema, UB unknownFields) throws java.io.IOException {
        int tag = reader.getTag();
        int i = 0;
        if (tag != androidx.datastore.preferences.protobuf.WireFormat.MESSAGE_SET_ITEM_TAG) {
            if (androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(tag) == 2) {
                java.lang.Object findExtensionByNumber = extensionSchema.findExtensionByNumber(extensionRegistry, this.defaultInstance, androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(tag));
                if (findExtensionByNumber != null) {
                    extensionSchema.parseLengthPrefixedMessageSetItem(reader, findExtensionByNumber, extensionRegistry, extensions);
                    return true;
                }
                return unknownFieldSchema.mergeOneFieldFrom(unknownFields, reader, 0);
            }
            return reader.skipField();
        }
        java.lang.Object obj = null;
        androidx.datastore.preferences.protobuf.ByteString byteString = null;
        while (reader.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = reader.getTag();
            if (tag2 == androidx.datastore.preferences.protobuf.WireFormat.MESSAGE_SET_TYPE_ID_TAG) {
                i = reader.readUInt32();
                obj = extensionSchema.findExtensionByNumber(extensionRegistry, this.defaultInstance, i);
            } else if (tag2 == androidx.datastore.preferences.protobuf.WireFormat.MESSAGE_SET_MESSAGE_TAG) {
                if (obj != null) {
                    extensionSchema.parseLengthPrefixedMessageSetItem(reader, obj, extensionRegistry, extensions);
                } else {
                    byteString = reader.readBytes();
                }
            } else if (!reader.skipField()) {
                break;
            }
        }
        if (reader.getTag() != androidx.datastore.preferences.protobuf.WireFormat.MESSAGE_SET_ITEM_END_TAG) {
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidEndTag();
        }
        if (byteString != null) {
            if (obj != null) {
                extensionSchema.parseMessageSetItem(byteString, obj, extensionRegistry, extensions);
            } else {
                unknownFieldSchema.addLengthDelimited(unknownFields, i, byteString);
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final boolean isInitialized(T message) {
        return this.extensionSchema.getExtensions(message).isInitialized();
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public int getSerializedSize(T message) {
        int unknownFieldsSerializedSize = getUnknownFieldsSerializedSize(this.unknownFieldSchema, message);
        return this.hasExtensions ? unknownFieldsSerializedSize + this.extensionSchema.getExtensions(message).getMessageSetSerializedSize() : unknownFieldsSerializedSize;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, UB> schema, T message) {
        return schema.getSerializedSizeAsMessageSet(schema.getFromMessage(message));
    }
}
