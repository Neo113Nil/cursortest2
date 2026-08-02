package com.google.protobuf;

@com.google.protobuf.CheckReturnValue
/* loaded from: classes9.dex */
final class ExtensionSchemaLite extends com.google.protobuf.ExtensionSchema<com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor> {
    ExtensionSchemaLite() {
    }

    @Override // com.google.protobuf.ExtensionSchema
    final boolean hasExtensions(com.google.protobuf.MessageLite messageLite) {
        return messageLite instanceof com.google.protobuf.GeneratedMessageLite.ExtendableMessage;
    }

    @Override // com.google.protobuf.ExtensionSchema
    final com.google.protobuf.FieldSet<com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor> getExtensions(java.lang.Object obj) {
        return ((com.google.protobuf.GeneratedMessageLite.ExtendableMessage) obj).extensions;
    }

    @Override // com.google.protobuf.ExtensionSchema
    final void setExtensions(java.lang.Object obj, com.google.protobuf.FieldSet<com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor> fieldSet) {
        ((com.google.protobuf.GeneratedMessageLite.ExtendableMessage) obj).extensions = fieldSet;
    }

    @Override // com.google.protobuf.ExtensionSchema
    final com.google.protobuf.FieldSet<com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor> getMutableExtensions(java.lang.Object obj) {
        return ((com.google.protobuf.GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable();
    }

    @Override // com.google.protobuf.ExtensionSchema
    final void makeImmutable(java.lang.Object obj) {
        getExtensions(obj).makeImmutable();
    }

    @Override // com.google.protobuf.ExtensionSchema
    final <UT, UB> UB parseExtension(java.lang.Object obj, com.google.protobuf.Reader reader, java.lang.Object obj2, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite, com.google.protobuf.FieldSet<com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor> fieldSet, UB ub, com.google.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema) throws java.io.IOException {
        java.lang.Object valueOf;
        java.lang.Object field;
        java.util.ArrayList arrayList;
        com.google.protobuf.GeneratedMessageLite.GeneratedExtension generatedExtension = (com.google.protobuf.GeneratedMessageLite.GeneratedExtension) obj2;
        int number = generatedExtension.getNumber();
        if (generatedExtension.descriptor.isRepeated() && generatedExtension.descriptor.isPacked()) {
            switch (com.google.protobuf.ExtensionSchemaLite.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    arrayList = new java.util.ArrayList();
                    reader.readDoubleList(arrayList);
                    break;
                case 2:
                    arrayList = new java.util.ArrayList();
                    reader.readFloatList(arrayList);
                    break;
                case 3:
                    arrayList = new java.util.ArrayList();
                    reader.readInt64List(arrayList);
                    break;
                case 4:
                    arrayList = new java.util.ArrayList();
                    reader.readUInt64List(arrayList);
                    break;
                case 5:
                    arrayList = new java.util.ArrayList();
                    reader.readInt32List(arrayList);
                    break;
                case 6:
                    arrayList = new java.util.ArrayList();
                    reader.readFixed64List(arrayList);
                    break;
                case 7:
                    arrayList = new java.util.ArrayList();
                    reader.readFixed32List(arrayList);
                    break;
                case 8:
                    arrayList = new java.util.ArrayList();
                    reader.readBoolList(arrayList);
                    break;
                case 9:
                    arrayList = new java.util.ArrayList();
                    reader.readUInt32List(arrayList);
                    break;
                case 10:
                    arrayList = new java.util.ArrayList();
                    reader.readSFixed32List(arrayList);
                    break;
                case 11:
                    arrayList = new java.util.ArrayList();
                    reader.readSFixed64List(arrayList);
                    break;
                case 12:
                    arrayList = new java.util.ArrayList();
                    reader.readSInt32List(arrayList);
                    break;
                case 13:
                    arrayList = new java.util.ArrayList();
                    reader.readSInt64List(arrayList);
                    break;
                case 14:
                    arrayList = new java.util.ArrayList();
                    reader.readEnumList(arrayList);
                    ub = (UB) com.google.protobuf.SchemaUtil.filterUnknownEnumList(obj, number, arrayList, generatedExtension.descriptor.getEnumType(), ub, unknownFieldSchema);
                    break;
                default:
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Type cannot be packed: ");
                    sb.append(generatedExtension.descriptor.getLiteType());
                    throw new java.lang.IllegalStateException(sb.toString());
            }
            fieldSet.setField(generatedExtension.descriptor, arrayList);
            return ub;
        }
        if (generatedExtension.getLiteType() == com.google.protobuf.WireFormat.FieldType.ENUM) {
            int readInt32 = reader.readInt32();
            if (generatedExtension.descriptor.getEnumType().findValueByNumber(readInt32) == null) {
                return (UB) com.google.protobuf.SchemaUtil.storeUnknownEnum(obj, number, readInt32, ub, unknownFieldSchema);
            }
            valueOf = java.lang.Integer.valueOf(readInt32);
        } else {
            switch (com.google.protobuf.ExtensionSchemaLite.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    valueOf = java.lang.Double.valueOf(reader.readDouble());
                    break;
                case 2:
                    valueOf = java.lang.Float.valueOf(reader.readFloat());
                    break;
                case 3:
                    valueOf = java.lang.Long.valueOf(reader.readInt64());
                    break;
                case 4:
                    valueOf = java.lang.Long.valueOf(reader.readUInt64());
                    break;
                case 5:
                    valueOf = java.lang.Integer.valueOf(reader.readInt32());
                    break;
                case 6:
                    valueOf = java.lang.Long.valueOf(reader.readFixed64());
                    break;
                case 7:
                    valueOf = java.lang.Integer.valueOf(reader.readFixed32());
                    break;
                case 8:
                    valueOf = java.lang.Boolean.valueOf(reader.readBool());
                    break;
                case 9:
                    valueOf = java.lang.Integer.valueOf(reader.readUInt32());
                    break;
                case 10:
                    valueOf = java.lang.Integer.valueOf(reader.readSFixed32());
                    break;
                case 11:
                    valueOf = java.lang.Long.valueOf(reader.readSFixed64());
                    break;
                case 12:
                    valueOf = java.lang.Integer.valueOf(reader.readSInt32());
                    break;
                case 13:
                    valueOf = java.lang.Long.valueOf(reader.readSInt64());
                    break;
                case 14:
                    throw new java.lang.IllegalStateException("Shouldn't reach here.");
                case 15:
                    valueOf = reader.readBytes();
                    break;
                case 16:
                    valueOf = reader.readString();
                    break;
                case 17:
                    if (!generatedExtension.isRepeated()) {
                        java.lang.Object field2 = fieldSet.getField(generatedExtension.descriptor);
                        if (field2 instanceof com.google.protobuf.GeneratedMessageLite) {
                            com.google.protobuf.Schema schemaFor = com.google.protobuf.Protobuf.getInstance().schemaFor((com.google.protobuf.Protobuf) field2);
                            if (!((com.google.protobuf.GeneratedMessageLite) field2).isMutable()) {
                                java.lang.Object newInstance = schemaFor.newInstance();
                                schemaFor.mergeFrom(newInstance, field2);
                                fieldSet.setField(generatedExtension.descriptor, newInstance);
                                field2 = newInstance;
                            }
                            reader.mergeGroupField(field2, schemaFor, extensionRegistryLite);
                            return ub;
                        }
                    }
                    valueOf = reader.readGroup(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite);
                    break;
                case 18:
                    if (!generatedExtension.isRepeated()) {
                        java.lang.Object field3 = fieldSet.getField(generatedExtension.descriptor);
                        if (field3 instanceof com.google.protobuf.GeneratedMessageLite) {
                            com.google.protobuf.Schema schemaFor2 = com.google.protobuf.Protobuf.getInstance().schemaFor((com.google.protobuf.Protobuf) field3);
                            if (!((com.google.protobuf.GeneratedMessageLite) field3).isMutable()) {
                                java.lang.Object newInstance2 = schemaFor2.newInstance();
                                schemaFor2.mergeFrom(newInstance2, field3);
                                fieldSet.setField(generatedExtension.descriptor, newInstance2);
                                field3 = newInstance2;
                            }
                            reader.mergeMessageField(field3, schemaFor2, extensionRegistryLite);
                            return ub;
                        }
                    }
                    valueOf = reader.readMessage(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite);
                    break;
                default:
                    valueOf = null;
                    break;
            }
        }
        if (generatedExtension.isRepeated()) {
            fieldSet.addRepeatedField(generatedExtension.descriptor, valueOf);
            return ub;
        }
        int i = com.google.protobuf.ExtensionSchemaLite.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()];
        if ((i == 17 || i == 18) && (field = fieldSet.getField(generatedExtension.descriptor)) != null) {
            valueOf = com.google.protobuf.Internal.mergeMessage(field, valueOf);
        }
        fieldSet.setField(generatedExtension.descriptor, valueOf);
        return ub;
    }

    /* renamed from: com.google.protobuf.ExtensionSchemaLite$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[com.google.protobuf.WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[com.google.protobuf.WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.UINT32.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.SFIXED64.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.protobuf.WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
        }
    }

    @Override // com.google.protobuf.ExtensionSchema
    final int extensionNumber(java.util.Map.Entry<?, ?> entry) {
        return ((com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor) entry.getKey()).getNumber();
    }

    @Override // com.google.protobuf.ExtensionSchema
    final void serializeExtension(com.google.protobuf.Writer writer, java.util.Map.Entry<?, ?> entry) throws java.io.IOException {
        com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor extensionDescriptor = (com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor) entry.getKey();
        if (extensionDescriptor.isRepeated()) {
            switch (com.google.protobuf.ExtensionSchemaLite.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[extensionDescriptor.getLiteType().ordinal()]) {
                case 1:
                    com.google.protobuf.SchemaUtil.writeDoubleList(extensionDescriptor.getNumber(), (java.util.List) entry.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 2:
                    com.google.protobuf.SchemaUtil.writeFloatList(extensionDescriptor.getNumber(), (java.util.List) entry.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 3:
                    com.google.protobuf.SchemaUtil.writeInt64List(extensionDescriptor.getNumber(), (java.util.List) entry.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 4:
                    com.google.protobuf.SchemaUtil.writeUInt64List(extensionDescriptor.getNumber(), (java.util.List) entry.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 5:
                    com.google.protobuf.SchemaUtil.writeInt32List(extensionDescriptor.getNumber(), (java.util.List) entry.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 6:
                    com.google.protobuf.SchemaUtil.writeFixed64List(extensionDescriptor.getNumber(), (java.util.List) entry.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 7:
                    com.google.protobuf.SchemaUtil.writeFixed32List(extensionDescriptor.getNumber(), (java.util.List) entry.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 8:
                    com.google.protobuf.SchemaUtil.writeBoolList(extensionDescriptor.getNumber(), (java.util.List) entry.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 9:
                    com.google.protobuf.SchemaUtil.writeUInt32List(extensionDescriptor.getNumber(), (java.util.List) entry.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 10:
                    com.google.protobuf.SchemaUtil.writeSFixed32List(extensionDescriptor.getNumber(), (java.util.List) entry.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 11:
                    com.google.protobuf.SchemaUtil.writeSFixed64List(extensionDescriptor.getNumber(), (java.util.List) entry.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 12:
                    com.google.protobuf.SchemaUtil.writeSInt32List(extensionDescriptor.getNumber(), (java.util.List) entry.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 13:
                    com.google.protobuf.SchemaUtil.writeSInt64List(extensionDescriptor.getNumber(), (java.util.List) entry.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 14:
                    com.google.protobuf.SchemaUtil.writeInt32List(extensionDescriptor.getNumber(), (java.util.List) entry.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 15:
                    com.google.protobuf.SchemaUtil.writeBytesList(extensionDescriptor.getNumber(), (java.util.List) entry.getValue(), writer);
                    break;
                case 16:
                    com.google.protobuf.SchemaUtil.writeStringList(extensionDescriptor.getNumber(), (java.util.List) entry.getValue(), writer);
                    break;
                case 17:
                    java.util.List list = (java.util.List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        com.google.protobuf.SchemaUtil.writeGroupList(extensionDescriptor.getNumber(), (java.util.List) entry.getValue(), writer, com.google.protobuf.Protobuf.getInstance().schemaFor((java.lang.Class) list.get(0).getClass()));
                        break;
                    }
                    break;
                case 18:
                    java.util.List list2 = (java.util.List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        com.google.protobuf.SchemaUtil.writeMessageList(extensionDescriptor.getNumber(), (java.util.List) entry.getValue(), writer, com.google.protobuf.Protobuf.getInstance().schemaFor((java.lang.Class) list2.get(0).getClass()));
                        break;
                    }
                    break;
            }
        }
        switch (com.google.protobuf.ExtensionSchemaLite.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[extensionDescriptor.getLiteType().ordinal()]) {
            case 1:
                writer.writeDouble(extensionDescriptor.getNumber(), ((java.lang.Double) entry.getValue()).doubleValue());
                break;
            case 2:
                writer.writeFloat(extensionDescriptor.getNumber(), ((java.lang.Float) entry.getValue()).floatValue());
                break;
            case 3:
                writer.writeInt64(extensionDescriptor.getNumber(), ((java.lang.Long) entry.getValue()).longValue());
                break;
            case 4:
                writer.writeUInt64(extensionDescriptor.getNumber(), ((java.lang.Long) entry.getValue()).longValue());
                break;
            case 5:
                writer.writeInt32(extensionDescriptor.getNumber(), ((java.lang.Integer) entry.getValue()).intValue());
                break;
            case 6:
                writer.writeFixed64(extensionDescriptor.getNumber(), ((java.lang.Long) entry.getValue()).longValue());
                break;
            case 7:
                writer.writeFixed32(extensionDescriptor.getNumber(), ((java.lang.Integer) entry.getValue()).intValue());
                break;
            case 8:
                writer.writeBool(extensionDescriptor.getNumber(), ((java.lang.Boolean) entry.getValue()).booleanValue());
                break;
            case 9:
                writer.writeUInt32(extensionDescriptor.getNumber(), ((java.lang.Integer) entry.getValue()).intValue());
                break;
            case 10:
                writer.writeSFixed32(extensionDescriptor.getNumber(), ((java.lang.Integer) entry.getValue()).intValue());
                break;
            case 11:
                writer.writeSFixed64(extensionDescriptor.getNumber(), ((java.lang.Long) entry.getValue()).longValue());
                break;
            case 12:
                writer.writeSInt32(extensionDescriptor.getNumber(), ((java.lang.Integer) entry.getValue()).intValue());
                break;
            case 13:
                writer.writeSInt64(extensionDescriptor.getNumber(), ((java.lang.Long) entry.getValue()).longValue());
                break;
            case 14:
                writer.writeInt32(extensionDescriptor.getNumber(), ((java.lang.Integer) entry.getValue()).intValue());
                break;
            case 15:
                writer.writeBytes(extensionDescriptor.getNumber(), (com.google.protobuf.ByteString) entry.getValue());
                break;
            case 16:
                writer.writeString(extensionDescriptor.getNumber(), (java.lang.String) entry.getValue());
                break;
            case 17:
                writer.writeGroup(extensionDescriptor.getNumber(), entry.getValue(), com.google.protobuf.Protobuf.getInstance().schemaFor((java.lang.Class) entry.getValue().getClass()));
                break;
            case 18:
                writer.writeMessage(extensionDescriptor.getNumber(), entry.getValue(), com.google.protobuf.Protobuf.getInstance().schemaFor((java.lang.Class) entry.getValue().getClass()));
                break;
        }
    }

    @Override // com.google.protobuf.ExtensionSchema
    final java.lang.Object findExtensionByNumber(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite, com.google.protobuf.MessageLite messageLite, int i) {
        return extensionRegistryLite.findLiteExtensionByNumber(messageLite, i);
    }

    @Override // com.google.protobuf.ExtensionSchema
    final void parseLengthPrefixedMessageSetItem(com.google.protobuf.Reader reader, java.lang.Object obj, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite, com.google.protobuf.FieldSet<com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor> fieldSet) throws java.io.IOException {
        com.google.protobuf.GeneratedMessageLite.GeneratedExtension generatedExtension = (com.google.protobuf.GeneratedMessageLite.GeneratedExtension) obj;
        fieldSet.setField(generatedExtension.descriptor, reader.readMessage(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite));
    }

    @Override // com.google.protobuf.ExtensionSchema
    final void parseMessageSetItem(com.google.protobuf.ByteString byteString, java.lang.Object obj, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite, com.google.protobuf.FieldSet<com.google.protobuf.GeneratedMessageLite.ExtensionDescriptor> fieldSet) throws java.io.IOException {
        com.google.protobuf.GeneratedMessageLite.GeneratedExtension generatedExtension = (com.google.protobuf.GeneratedMessageLite.GeneratedExtension) obj;
        com.google.protobuf.MessageLite.Builder newBuilderForType = generatedExtension.getMessageDefaultInstance().newBuilderForType();
        com.google.protobuf.CodedInputStream newCodedInput = byteString.newCodedInput();
        newBuilderForType.mergeFrom(newCodedInput, extensionRegistryLite);
        fieldSet.setField(generatedExtension.descriptor, newBuilderForType.buildPartial());
        newCodedInput.checkLastTagWas(0);
    }
}
