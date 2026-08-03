package com.google.protobuf;

@com.google.protobuf.CheckReturnValue
/* loaded from: classes4.dex */
final class MessageSetSchema<T> implements com.google.protobuf.Schema<T> {
    private final com.google.protobuf.MessageLite defaultInstance;
    private final com.google.protobuf.ExtensionSchema<?> extensionSchema;
    private final boolean hasExtensions;
    private final com.google.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema;

    private MessageSetSchema(com.google.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema, com.google.protobuf.ExtensionSchema<?> extensionSchema, com.google.protobuf.MessageLite defaultInstance) {
        this.unknownFieldSchema = unknownFieldSchema;
        this.hasExtensions = extensionSchema.hasExtensions(defaultInstance);
        this.extensionSchema = extensionSchema;
        this.defaultInstance = defaultInstance;
    }

    static <T> com.google.protobuf.MessageSetSchema<T> newSchema(com.google.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema, com.google.protobuf.ExtensionSchema<?> extensionSchema, com.google.protobuf.MessageLite defaultInstance) {
        return new com.google.protobuf.MessageSetSchema<>(unknownFieldSchema, extensionSchema, defaultInstance);
    }

    @Override // com.google.protobuf.Schema
    public T newInstance() {
        com.google.protobuf.MessageLite messageLite = this.defaultInstance;
        if (messageLite instanceof com.google.protobuf.GeneratedMessageLite) {
            return (T) ((com.google.protobuf.GeneratedMessageLite) messageLite).newMutableInstance();
        }
        return (T) messageLite.newBuilderForType().buildPartial();
    }

    @Override // com.google.protobuf.Schema
    public boolean equals(T message, T other) {
        if (!this.unknownFieldSchema.getFromMessage(message).equals(this.unknownFieldSchema.getFromMessage(other))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(message).equals(this.extensionSchema.getExtensions(other));
        }
        return true;
    }

    @Override // com.google.protobuf.Schema
    public int hashCode(T message) {
        int hashCode = this.unknownFieldSchema.getFromMessage(message).hashCode();
        return this.hasExtensions ? (hashCode * 53) + this.extensionSchema.getExtensions(message).hashCode() : hashCode;
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T message, T other) {
        com.google.protobuf.SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, message, other);
        if (this.hasExtensions) {
            com.google.protobuf.SchemaUtil.mergeExtensions(this.extensionSchema, message, other);
        }
    }

    @Override // com.google.protobuf.Schema
    public void writeTo(T message, com.google.protobuf.Writer writer) throws java.io.IOException {
        java.util.Iterator<java.util.Map.Entry<?, java.lang.Object>> it = this.extensionSchema.getExtensions(message).iterator();
        while (it.hasNext()) {
            java.util.Map.Entry<?, java.lang.Object> next = it.next();
            com.google.protobuf.FieldSet.FieldDescriptorLite fieldDescriptorLite = (com.google.protobuf.FieldSet.FieldDescriptorLite) next.getKey();
            if (fieldDescriptorLite.getLiteJavaType() != com.google.protobuf.WireFormat.JavaType.MESSAGE || fieldDescriptorLite.isRepeated() || fieldDescriptorLite.isPacked()) {
                throw new java.lang.IllegalStateException("Found invalid MessageSet item.");
            }
            if (next instanceof com.google.protobuf.LazyField.LazyEntry) {
                writer.writeMessageSetItem(fieldDescriptorLite.getNumber(), ((com.google.protobuf.LazyField.LazyEntry) next).getField().toByteString());
            } else {
                writer.writeMessageSetItem(fieldDescriptorLite.getNumber(), next.getValue());
            }
        }
        writeUnknownFieldsHelper(this.unknownFieldSchema, message, writer);
    }

    private <UT, UB> void writeUnknownFieldsHelper(com.google.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema, T message, com.google.protobuf.Writer writer) throws java.io.IOException {
        unknownFieldSchema.writeAsMessageSetTo(unknownFieldSchema.getFromMessage(message), writer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cb A[EDGE_INSN: B:24:0x00cb->B:25:0x00cb BREAK  A[LOOP:1: B:10:0x006d->B:18:0x006d], SYNTHETIC] */
    @Override // com.google.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mergeFrom(T message, byte[] data, int position, int limit, com.google.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        com.google.protobuf.GeneratedMessageLite generatedMessageLite = (com.google.protobuf.GeneratedMessageLite) message;
        com.google.protobuf.UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite == com.google.protobuf.UnknownFieldSetLite.getDefaultInstance()) {
            unknownFieldSetLite = com.google.protobuf.UnknownFieldSetLite.newInstance();
            generatedMessageLite.unknownFields = unknownFieldSetLite;
        }
        com.google.protobuf.FieldSet<com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor> ensureExtensionsAreMutable = ((com.google.protobuf.GeneratedMessageLite.ExtendableMessage) message).ensureExtensionsAreMutable();
        com.google.protobuf.GeneratedMessageLite.GeneratedExtension generatedExtension = null;
        while (position < limit) {
            int decodeVarint32 = com.google.protobuf.ArrayDecoders.decodeVarint32(data, position, registers);
            int i = registers.int1;
            if (i == com.google.protobuf.WireFormat.MESSAGE_SET_ITEM_TAG) {
                int i2 = 0;
                com.google.protobuf.ByteString byteString = null;
                while (decodeVarint32 < limit) {
                    decodeVarint32 = com.google.protobuf.ArrayDecoders.decodeVarint32(data, decodeVarint32, registers);
                    int i3 = registers.int1;
                    int tagFieldNumber = com.google.protobuf.WireFormat.getTagFieldNumber(i3);
                    int tagWireType = com.google.protobuf.WireFormat.getTagWireType(i3);
                    if (tagFieldNumber != 2) {
                        if (tagFieldNumber == 3) {
                            if (generatedExtension != null) {
                                decodeVarint32 = com.google.protobuf.ArrayDecoders.decodeMessageField(com.google.protobuf.Protobuf.getInstance().schemaFor((java.lang.Class) generatedExtension.getMessageDefaultInstance().getClass()), data, decodeVarint32, limit, registers);
                                ensureExtensionsAreMutable.setField(generatedExtension.descriptor, registers.object1);
                            } else if (tagWireType == 2) {
                                decodeVarint32 = com.google.protobuf.ArrayDecoders.decodeBytes(data, decodeVarint32, registers);
                                byteString = (com.google.protobuf.ByteString) registers.object1;
                            }
                        }
                        if (i3 != com.google.protobuf.WireFormat.MESSAGE_SET_ITEM_END_TAG) {
                            break;
                        } else {
                            decodeVarint32 = com.google.protobuf.ArrayDecoders.skipField(i3, data, decodeVarint32, limit, registers);
                        }
                    } else if (tagWireType == 0) {
                        decodeVarint32 = com.google.protobuf.ArrayDecoders.decodeVarint32(data, decodeVarint32, registers);
                        i2 = registers.int1;
                        generatedExtension = (com.google.protobuf.GeneratedMessageLite.GeneratedExtension) this.extensionSchema.findExtensionByNumber(registers.extensionRegistry, this.defaultInstance, i2);
                    } else if (i3 != com.google.protobuf.WireFormat.MESSAGE_SET_ITEM_END_TAG) {
                    }
                }
                if (byteString != null) {
                    unknownFieldSetLite.storeField(com.google.protobuf.WireFormat.makeTag(i2, 2), byteString);
                }
                position = decodeVarint32;
            } else if (com.google.protobuf.WireFormat.getTagWireType(i) == 2) {
                com.google.protobuf.GeneratedMessageLite.GeneratedExtension generatedExtension2 = (com.google.protobuf.GeneratedMessageLite.GeneratedExtension) this.extensionSchema.findExtensionByNumber(registers.extensionRegistry, this.defaultInstance, com.google.protobuf.WireFormat.getTagFieldNumber(i));
                if (generatedExtension2 != null) {
                    position = com.google.protobuf.ArrayDecoders.decodeMessageField(com.google.protobuf.Protobuf.getInstance().schemaFor((java.lang.Class) generatedExtension2.getMessageDefaultInstance().getClass()), data, decodeVarint32, limit, registers);
                    ensureExtensionsAreMutable.setField(generatedExtension2.descriptor, registers.object1);
                } else {
                    position = com.google.protobuf.ArrayDecoders.decodeUnknownField(i, data, decodeVarint32, limit, unknownFieldSetLite, registers);
                }
                generatedExtension = generatedExtension2;
            } else {
                position = com.google.protobuf.ArrayDecoders.skipField(i, data, decodeVarint32, limit, registers);
            }
        }
        if (position != limit) {
            throw com.google.protobuf.InvalidProtocolBufferException.parseFailure();
        }
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T message, com.google.protobuf.Reader reader, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, message, reader, extensionRegistry);
    }

    private <UT, UB, ET extends com.google.protobuf.FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(com.google.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema, com.google.protobuf.ExtensionSchema<ET> extensionSchema, T message, com.google.protobuf.Reader reader, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        UB builderFromMessage = unknownFieldSchema.getBuilderFromMessage(message);
        com.google.protobuf.FieldSet<ET> mutableExtensions = extensionSchema.getMutableExtensions(message);
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

    @Override // com.google.protobuf.Schema
    public void makeImmutable(T message) {
        this.unknownFieldSchema.makeImmutable(message);
        this.extensionSchema.makeImmutable(message);
    }

    private <UT, UB, ET extends com.google.protobuf.FieldSet.FieldDescriptorLite<ET>> boolean parseMessageSetItemOrUnknownField(com.google.protobuf.Reader reader, com.google.protobuf.ExtensionRegistryLite extensionRegistry, com.google.protobuf.ExtensionSchema<ET> extensionSchema, com.google.protobuf.FieldSet<ET> extensions, com.google.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema, UB unknownFields) throws java.io.IOException {
        int tag = reader.getTag();
        int i = 0;
        if (tag != com.google.protobuf.WireFormat.MESSAGE_SET_ITEM_TAG) {
            if (com.google.protobuf.WireFormat.getTagWireType(tag) == 2) {
                java.lang.Object findExtensionByNumber = extensionSchema.findExtensionByNumber(extensionRegistry, this.defaultInstance, com.google.protobuf.WireFormat.getTagFieldNumber(tag));
                if (findExtensionByNumber != null) {
                    extensionSchema.parseLengthPrefixedMessageSetItem(reader, findExtensionByNumber, extensionRegistry, extensions);
                    return true;
                }
                return unknownFieldSchema.mergeOneFieldFrom(unknownFields, reader, 0);
            }
            return reader.skipField();
        }
        java.lang.Object obj = null;
        com.google.protobuf.ByteString byteString = null;
        while (reader.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = reader.getTag();
            if (tag2 == com.google.protobuf.WireFormat.MESSAGE_SET_TYPE_ID_TAG) {
                i = reader.readUInt32();
                obj = extensionSchema.findExtensionByNumber(extensionRegistry, this.defaultInstance, i);
            } else if (tag2 == com.google.protobuf.WireFormat.MESSAGE_SET_MESSAGE_TAG) {
                if (obj != null) {
                    extensionSchema.parseLengthPrefixedMessageSetItem(reader, obj, extensionRegistry, extensions);
                } else {
                    byteString = reader.readBytes();
                }
            } else if (!reader.skipField()) {
                break;
            }
        }
        if (reader.getTag() != com.google.protobuf.WireFormat.MESSAGE_SET_ITEM_END_TAG) {
            throw com.google.protobuf.InvalidProtocolBufferException.invalidEndTag();
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

    @Override // com.google.protobuf.Schema
    public final boolean isInitialized(T message) {
        return this.extensionSchema.getExtensions(message).isInitialized();
    }

    @Override // com.google.protobuf.Schema
    public int getSerializedSize(T message) {
        int unknownFieldsSerializedSize = getUnknownFieldsSerializedSize(this.unknownFieldSchema, message);
        return this.hasExtensions ? unknownFieldsSerializedSize + this.extensionSchema.getExtensions(message).getMessageSetSerializedSize() : unknownFieldsSerializedSize;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(com.google.protobuf.UnknownFieldSchema<UT, UB> schema, T message) {
        return schema.getSerializedSizeAsMessageSet(schema.getFromMessage(message));
    }
}
