package io.appmetrica.analytics.protobuf.nano;

/* loaded from: classes.dex */
public class Extension<M extends io.appmetrica.analytics.protobuf.nano.ExtendableMessageNano<M>, T> {
    public static final int TYPE_BOOL = 8;
    public static final int TYPE_BYTES = 12;
    public static final int TYPE_DOUBLE = 1;
    public static final int TYPE_ENUM = 14;
    public static final int TYPE_FIXED32 = 7;
    public static final int TYPE_FIXED64 = 6;
    public static final int TYPE_FLOAT = 2;
    public static final int TYPE_GROUP = 10;
    public static final int TYPE_INT32 = 5;
    public static final int TYPE_INT64 = 3;
    public static final int TYPE_MESSAGE = 11;
    public static final int TYPE_SFIXED32 = 15;
    public static final int TYPE_SFIXED64 = 16;
    public static final int TYPE_SINT32 = 17;
    public static final int TYPE_SINT64 = 18;
    public static final int TYPE_STRING = 9;
    public static final int TYPE_UINT32 = 13;
    public static final int TYPE_UINT64 = 4;
    protected final java.lang.Class<T> clazz;
    protected final boolean repeated;
    public final int tag;
    protected final int type;

    public static class PrimitiveExtension<M extends io.appmetrica.analytics.protobuf.nano.ExtendableMessageNano<M>, T> extends io.appmetrica.analytics.protobuf.nano.Extension<M, T> {
        private final int nonPackedTag;
        private final int packedTag;

        public PrimitiveExtension(int i2, java.lang.Class<T> cls, int i3, boolean z2, int i4, int i5) {
            super(i2, cls, i3, z2);
            this.nonPackedTag = i4;
            this.packedTag = i5;
        }

        private int computePackedDataSize(java.lang.Object obj) {
            int i2;
            int length = java.lang.reflect.Array.getLength(obj);
            int i3 = 0;
            switch (this.type) {
                case 1:
                case 6:
                case 16:
                    return length * 8;
                case 2:
                case 7:
                case 15:
                    return length * 4;
                case 3:
                    i2 = 0;
                    while (i3 < length) {
                        i2 += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt64SizeNoTag(java.lang.reflect.Array.getLong(obj, i3));
                        i3++;
                    }
                    break;
                case 4:
                    i2 = 0;
                    while (i3 < length) {
                        i2 += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt64SizeNoTag(java.lang.reflect.Array.getLong(obj, i3));
                        i3++;
                    }
                    break;
                case 5:
                    i2 = 0;
                    while (i3 < length) {
                        i2 += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32SizeNoTag(java.lang.reflect.Array.getInt(obj, i3));
                        i3++;
                    }
                    break;
                case 8:
                    return length;
                case 9:
                case 10:
                case 11:
                case 12:
                default:
                    throw new java.lang.IllegalArgumentException("Unexpected non-packable type " + this.type);
                case 13:
                    i2 = 0;
                    while (i3 < length) {
                        i2 += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt32SizeNoTag(java.lang.reflect.Array.getInt(obj, i3));
                        i3++;
                    }
                    break;
                case 14:
                    i2 = 0;
                    while (i3 < length) {
                        i2 += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeEnumSizeNoTag(java.lang.reflect.Array.getInt(obj, i3));
                        i3++;
                    }
                    break;
                case 17:
                    i2 = 0;
                    while (i3 < length) {
                        i2 += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeSInt32SizeNoTag(java.lang.reflect.Array.getInt(obj, i3));
                        i3++;
                    }
                    break;
                case 18:
                    i2 = 0;
                    while (i3 < length) {
                        i2 += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeSInt64SizeNoTag(java.lang.reflect.Array.getLong(obj, i3));
                        i3++;
                    }
                    break;
            }
            return i2;
        }

        @Override // io.appmetrica.analytics.protobuf.nano.Extension
        public int computeRepeatedSerializedSize(java.lang.Object obj) {
            int i2 = this.tag;
            if (i2 == this.nonPackedTag) {
                return super.computeRepeatedSerializedSize(obj);
            }
            if (i2 == this.packedTag) {
                int computePackedDataSize = computePackedDataSize(obj);
                return io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeRawVarint32Size(this.tag) + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeRawVarint32Size(computePackedDataSize) + computePackedDataSize;
            }
            throw new java.lang.IllegalArgumentException("Unexpected repeated extension tag " + this.tag + ", unequal to both non-packed variant " + this.nonPackedTag + " and packed variant " + this.packedTag);
        }

        @Override // io.appmetrica.analytics.protobuf.nano.Extension
        public final int computeSingularSerializedSize(java.lang.Object obj) {
            int tagFieldNumber = io.appmetrica.analytics.protobuf.nano.WireFormatNano.getTagFieldNumber(this.tag);
            switch (this.type) {
                case 1:
                    return io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeDoubleSize(tagFieldNumber, ((java.lang.Double) obj).doubleValue());
                case 2:
                    return io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeFloatSize(tagFieldNumber, ((java.lang.Float) obj).floatValue());
                case 3:
                    return io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt64Size(tagFieldNumber, ((java.lang.Long) obj).longValue());
                case 4:
                    return io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt64Size(tagFieldNumber, ((java.lang.Long) obj).longValue());
                case 5:
                    return io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(tagFieldNumber, ((java.lang.Integer) obj).intValue());
                case 6:
                    return io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeFixed64Size(tagFieldNumber, ((java.lang.Long) obj).longValue());
                case 7:
                    return io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeFixed32Size(tagFieldNumber, ((java.lang.Integer) obj).intValue());
                case 8:
                    return io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBoolSize(tagFieldNumber, ((java.lang.Boolean) obj).booleanValue());
                case 9:
                    return io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(tagFieldNumber, (java.lang.String) obj);
                case 10:
                case 11:
                default:
                    throw new java.lang.IllegalArgumentException("Unknown type " + this.type);
                case 12:
                    return io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(tagFieldNumber, (byte[]) obj);
                case 13:
                    return io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt32Size(tagFieldNumber, ((java.lang.Integer) obj).intValue());
                case 14:
                    return io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeEnumSize(tagFieldNumber, ((java.lang.Integer) obj).intValue());
                case 15:
                    return io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeSFixed32Size(tagFieldNumber, ((java.lang.Integer) obj).intValue());
                case 16:
                    return io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeSFixed64Size(tagFieldNumber, ((java.lang.Long) obj).longValue());
                case 17:
                    return io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeSInt32Size(tagFieldNumber, ((java.lang.Integer) obj).intValue());
                case 18:
                    return io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeSInt64Size(tagFieldNumber, ((java.lang.Long) obj).longValue());
            }
        }

        @Override // io.appmetrica.analytics.protobuf.nano.Extension
        public java.lang.Object readData(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
            try {
                return codedInputByteBufferNano.readPrimitiveField(this.type);
            } catch (java.io.IOException e2) {
                throw new java.lang.IllegalArgumentException("Error reading extension field", e2);
            }
        }

        @Override // io.appmetrica.analytics.protobuf.nano.Extension
        public void readDataInto(io.appmetrica.analytics.protobuf.nano.UnknownFieldData unknownFieldData, java.util.List<java.lang.Object> list) {
            if (unknownFieldData.tag == this.nonPackedTag) {
                list.add(readData(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano.newInstance(unknownFieldData.bytes)));
                return;
            }
            io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano newInstance = io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano.newInstance(unknownFieldData.bytes);
            try {
                newInstance.pushLimit(newInstance.readRawVarint32());
                while (!newInstance.isAtEnd()) {
                    list.add(readData(newInstance));
                }
            } catch (java.io.IOException e2) {
                throw new java.lang.IllegalArgumentException("Error reading extension field", e2);
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // io.appmetrica.analytics.protobuf.nano.Extension
        public void writeRepeatedData(java.lang.Object obj, io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
            int i2 = this.tag;
            if (i2 == this.nonPackedTag) {
                super.writeRepeatedData(obj, codedOutputByteBufferNano);
                return;
            }
            if (i2 != this.packedTag) {
                throw new java.lang.IllegalArgumentException("Unexpected repeated extension tag " + this.tag + ", unequal to both non-packed variant " + this.nonPackedTag + " and packed variant " + this.packedTag);
            }
            int length = java.lang.reflect.Array.getLength(obj);
            int computePackedDataSize = computePackedDataSize(obj);
            try {
                codedOutputByteBufferNano.writeRawVarint32(this.tag);
                codedOutputByteBufferNano.writeRawVarint32(computePackedDataSize);
                int i3 = 0;
                switch (this.type) {
                    case 1:
                        while (i3 < length) {
                            codedOutputByteBufferNano.writeDoubleNoTag(java.lang.reflect.Array.getDouble(obj, i3));
                            i3++;
                        }
                        return;
                    case 2:
                        while (i3 < length) {
                            codedOutputByteBufferNano.writeFloatNoTag(java.lang.reflect.Array.getFloat(obj, i3));
                            i3++;
                        }
                        return;
                    case 3:
                        while (i3 < length) {
                            codedOutputByteBufferNano.writeInt64NoTag(java.lang.reflect.Array.getLong(obj, i3));
                            i3++;
                        }
                        return;
                    case 4:
                        while (i3 < length) {
                            codedOutputByteBufferNano.writeUInt64NoTag(java.lang.reflect.Array.getLong(obj, i3));
                            i3++;
                        }
                        return;
                    case 5:
                        while (i3 < length) {
                            codedOutputByteBufferNano.writeInt32NoTag(java.lang.reflect.Array.getInt(obj, i3));
                            i3++;
                        }
                        return;
                    case 6:
                        while (i3 < length) {
                            codedOutputByteBufferNano.writeFixed64NoTag(java.lang.reflect.Array.getLong(obj, i3));
                            i3++;
                        }
                        return;
                    case 7:
                        while (i3 < length) {
                            codedOutputByteBufferNano.writeFixed32NoTag(java.lang.reflect.Array.getInt(obj, i3));
                            i3++;
                        }
                        return;
                    case 8:
                        while (i3 < length) {
                            codedOutputByteBufferNano.writeBoolNoTag(java.lang.reflect.Array.getBoolean(obj, i3));
                            i3++;
                        }
                        return;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    default:
                        throw new java.lang.IllegalArgumentException("Unpackable type " + this.type);
                    case 13:
                        while (i3 < length) {
                            codedOutputByteBufferNano.writeUInt32NoTag(java.lang.reflect.Array.getInt(obj, i3));
                            i3++;
                        }
                        return;
                    case 14:
                        while (i3 < length) {
                            codedOutputByteBufferNano.writeEnumNoTag(java.lang.reflect.Array.getInt(obj, i3));
                            i3++;
                        }
                        return;
                    case 15:
                        while (i3 < length) {
                            codedOutputByteBufferNano.writeSFixed32NoTag(java.lang.reflect.Array.getInt(obj, i3));
                            i3++;
                        }
                        return;
                    case 16:
                        while (i3 < length) {
                            codedOutputByteBufferNano.writeSFixed64NoTag(java.lang.reflect.Array.getLong(obj, i3));
                            i3++;
                        }
                        return;
                    case 17:
                        while (i3 < length) {
                            codedOutputByteBufferNano.writeSInt32NoTag(java.lang.reflect.Array.getInt(obj, i3));
                            i3++;
                        }
                        return;
                    case 18:
                        while (i3 < length) {
                            codedOutputByteBufferNano.writeSInt64NoTag(java.lang.reflect.Array.getLong(obj, i3));
                            i3++;
                        }
                        return;
                }
            } catch (java.io.IOException e2) {
                throw new java.lang.IllegalStateException(e2);
            }
        }

        @Override // io.appmetrica.analytics.protobuf.nano.Extension
        public final void writeSingularData(java.lang.Object obj, io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
            try {
                codedOutputByteBufferNano.writeRawVarint32(this.tag);
                switch (this.type) {
                    case 1:
                        codedOutputByteBufferNano.writeDoubleNoTag(((java.lang.Double) obj).doubleValue());
                        return;
                    case 2:
                        codedOutputByteBufferNano.writeFloatNoTag(((java.lang.Float) obj).floatValue());
                        return;
                    case 3:
                        codedOutputByteBufferNano.writeInt64NoTag(((java.lang.Long) obj).longValue());
                        return;
                    case 4:
                        codedOutputByteBufferNano.writeUInt64NoTag(((java.lang.Long) obj).longValue());
                        return;
                    case 5:
                        codedOutputByteBufferNano.writeInt32NoTag(((java.lang.Integer) obj).intValue());
                        return;
                    case 6:
                        codedOutputByteBufferNano.writeFixed64NoTag(((java.lang.Long) obj).longValue());
                        return;
                    case 7:
                        codedOutputByteBufferNano.writeFixed32NoTag(((java.lang.Integer) obj).intValue());
                        return;
                    case 8:
                        codedOutputByteBufferNano.writeBoolNoTag(((java.lang.Boolean) obj).booleanValue());
                        return;
                    case 9:
                        codedOutputByteBufferNano.writeStringNoTag((java.lang.String) obj);
                        return;
                    case 10:
                    case 11:
                    default:
                        throw new java.lang.IllegalArgumentException("Unknown type " + this.type);
                    case 12:
                        codedOutputByteBufferNano.writeBytesNoTag((byte[]) obj);
                        return;
                    case 13:
                        codedOutputByteBufferNano.writeUInt32NoTag(((java.lang.Integer) obj).intValue());
                        return;
                    case 14:
                        codedOutputByteBufferNano.writeEnumNoTag(((java.lang.Integer) obj).intValue());
                        return;
                    case 15:
                        codedOutputByteBufferNano.writeSFixed32NoTag(((java.lang.Integer) obj).intValue());
                        return;
                    case 16:
                        codedOutputByteBufferNano.writeSFixed64NoTag(((java.lang.Long) obj).longValue());
                        return;
                    case 17:
                        codedOutputByteBufferNano.writeSInt32NoTag(((java.lang.Integer) obj).intValue());
                        return;
                    case 18:
                        codedOutputByteBufferNano.writeSInt64NoTag(((java.lang.Long) obj).longValue());
                        return;
                }
            } catch (java.io.IOException e2) {
                throw new java.lang.IllegalStateException(e2);
            }
        }
    }

    @java.lang.Deprecated
    public static <M extends io.appmetrica.analytics.protobuf.nano.ExtendableMessageNano<M>, T extends io.appmetrica.analytics.protobuf.nano.MessageNano> io.appmetrica.analytics.protobuf.nano.Extension<M, T> createMessageTyped(int i2, java.lang.Class<T> cls, int i3) {
        return new io.appmetrica.analytics.protobuf.nano.Extension<>(i2, cls, i3, false);
    }

    public static <M extends io.appmetrica.analytics.protobuf.nano.ExtendableMessageNano<M>, T> io.appmetrica.analytics.protobuf.nano.Extension<M, T> createPrimitiveTyped(int i2, java.lang.Class<T> cls, long j2) {
        return new io.appmetrica.analytics.protobuf.nano.Extension.PrimitiveExtension(i2, cls, (int) j2, false, 0, 0);
    }

    public static <M extends io.appmetrica.analytics.protobuf.nano.ExtendableMessageNano<M>, T extends io.appmetrica.analytics.protobuf.nano.MessageNano> io.appmetrica.analytics.protobuf.nano.Extension<M, T[]> createRepeatedMessageTyped(int i2, java.lang.Class<T[]> cls, long j2) {
        return new io.appmetrica.analytics.protobuf.nano.Extension<>(i2, cls, (int) j2, true);
    }

    public static <M extends io.appmetrica.analytics.protobuf.nano.ExtendableMessageNano<M>, T> io.appmetrica.analytics.protobuf.nano.Extension<M, T> createRepeatedPrimitiveTyped(int i2, java.lang.Class<T> cls, long j2, long j3, long j4) {
        return new io.appmetrica.analytics.protobuf.nano.Extension.PrimitiveExtension(i2, cls, (int) j2, true, (int) j3, (int) j4);
    }

    private T getRepeatedValueFrom(java.util.List<io.appmetrica.analytics.protobuf.nano.UnknownFieldData> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            io.appmetrica.analytics.protobuf.nano.UnknownFieldData unknownFieldData = list.get(i2);
            if (unknownFieldData.bytes.length != 0) {
                readDataInto(unknownFieldData, arrayList);
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }
        java.lang.Class<T> cls = this.clazz;
        T cast = cls.cast(java.lang.reflect.Array.newInstance(cls.getComponentType(), size));
        for (int i3 = 0; i3 < size; i3++) {
            java.lang.reflect.Array.set(cast, i3, arrayList.get(i3));
        }
        return cast;
    }

    private T getSingularValueFrom(java.util.List<io.appmetrica.analytics.protobuf.nano.UnknownFieldData> list) {
        if (list.isEmpty()) {
            return null;
        }
        return this.clazz.cast(readData(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano.newInstance(list.get(list.size() - 1).bytes)));
    }

    public int computeRepeatedSerializedSize(java.lang.Object obj) {
        int length = java.lang.reflect.Array.getLength(obj);
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (java.lang.reflect.Array.get(obj, i3) != null) {
                i2 = computeSingularSerializedSize(java.lang.reflect.Array.get(obj, i3)) + i2;
            }
        }
        return i2;
    }

    public int computeSerializedSize(java.lang.Object obj) {
        return this.repeated ? computeRepeatedSerializedSize(obj) : computeSingularSerializedSize(obj);
    }

    public int computeSingularSerializedSize(java.lang.Object obj) {
        int tagFieldNumber = io.appmetrica.analytics.protobuf.nano.WireFormatNano.getTagFieldNumber(this.tag);
        int i2 = this.type;
        if (i2 == 10) {
            return io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeGroupSize(tagFieldNumber, (io.appmetrica.analytics.protobuf.nano.MessageNano) obj);
        }
        if (i2 == 11) {
            return io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(tagFieldNumber, (io.appmetrica.analytics.protobuf.nano.MessageNano) obj);
        }
        throw new java.lang.IllegalArgumentException("Unknown type " + this.type);
    }

    public final T getValueFrom(java.util.List<io.appmetrica.analytics.protobuf.nano.UnknownFieldData> list) {
        if (list == null) {
            return null;
        }
        return this.repeated ? getRepeatedValueFrom(list) : getSingularValueFrom(list);
    }

    public java.lang.Object readData(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        java.lang.Class componentType = this.repeated ? this.clazz.getComponentType() : this.clazz;
        try {
            int i2 = this.type;
            if (i2 == 10) {
                io.appmetrica.analytics.protobuf.nano.MessageNano messageNano = (io.appmetrica.analytics.protobuf.nano.MessageNano) componentType.newInstance();
                codedInputByteBufferNano.readGroup(messageNano, io.appmetrica.analytics.protobuf.nano.WireFormatNano.getTagFieldNumber(this.tag));
                return messageNano;
            }
            if (i2 == 11) {
                io.appmetrica.analytics.protobuf.nano.MessageNano messageNano2 = (io.appmetrica.analytics.protobuf.nano.MessageNano) componentType.newInstance();
                codedInputByteBufferNano.readMessage(messageNano2);
                return messageNano2;
            }
            throw new java.lang.IllegalArgumentException("Unknown type " + this.type);
        } catch (java.io.IOException e2) {
            throw new java.lang.IllegalArgumentException("Error reading extension field", e2);
        } catch (java.lang.IllegalAccessException e3) {
            throw new java.lang.IllegalArgumentException("Error creating instance of class " + componentType, e3);
        } catch (java.lang.InstantiationException e4) {
            throw new java.lang.IllegalArgumentException("Error creating instance of class " + componentType, e4);
        }
    }

    public void readDataInto(io.appmetrica.analytics.protobuf.nano.UnknownFieldData unknownFieldData, java.util.List<java.lang.Object> list) {
        list.add(readData(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano.newInstance(unknownFieldData.bytes)));
    }

    public void writeRepeatedData(java.lang.Object obj, io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int length = java.lang.reflect.Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            java.lang.Object obj2 = java.lang.reflect.Array.get(obj, i2);
            if (obj2 != null) {
                writeSingularData(obj2, codedOutputByteBufferNano);
            }
        }
    }

    public void writeSingularData(java.lang.Object obj, io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        try {
            codedOutputByteBufferNano.writeRawVarint32(this.tag);
            int i2 = this.type;
            if (i2 == 10) {
                int tagFieldNumber = io.appmetrica.analytics.protobuf.nano.WireFormatNano.getTagFieldNumber(this.tag);
                codedOutputByteBufferNano.writeGroupNoTag((io.appmetrica.analytics.protobuf.nano.MessageNano) obj);
                codedOutputByteBufferNano.writeTag(tagFieldNumber, 4);
            } else if (i2 == 11) {
                codedOutputByteBufferNano.writeMessageNoTag((io.appmetrica.analytics.protobuf.nano.MessageNano) obj);
            } else {
                throw new java.lang.IllegalArgumentException("Unknown type " + this.type);
            }
        } catch (java.io.IOException e2) {
            throw new java.lang.IllegalStateException(e2);
        }
    }

    public void writeTo(java.lang.Object obj, io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.repeated) {
            writeRepeatedData(obj, codedOutputByteBufferNano);
        } else {
            writeSingularData(obj, codedOutputByteBufferNano);
        }
    }

    private Extension(int i2, java.lang.Class<T> cls, int i3, boolean z2) {
        this.type = i2;
        this.clazz = cls;
        this.tag = i3;
        this.repeated = z2;
    }

    public static <M extends io.appmetrica.analytics.protobuf.nano.ExtendableMessageNano<M>, T extends io.appmetrica.analytics.protobuf.nano.MessageNano> io.appmetrica.analytics.protobuf.nano.Extension<M, T> createMessageTyped(int i2, java.lang.Class<T> cls, long j2) {
        return new io.appmetrica.analytics.protobuf.nano.Extension<>(i2, cls, (int) j2, false);
    }
}
