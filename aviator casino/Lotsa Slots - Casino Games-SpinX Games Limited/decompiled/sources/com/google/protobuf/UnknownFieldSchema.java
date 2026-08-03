package com.google.protobuf;

@com.google.protobuf.CheckReturnValue
/* loaded from: classes4.dex */
abstract class UnknownFieldSchema<T, B> {
    static final int DEFAULT_RECURSION_LIMIT = 100;
    private static volatile int recursionLimit = 100;

    abstract void addFixed32(B fields, int number, int value);

    abstract void addFixed64(B fields, int number, long value);

    abstract void addGroup(B fields, int number, T subFieldSet);

    abstract void addLengthDelimited(B fields, int number, com.google.protobuf.ByteString value);

    abstract void addVarint(B fields, int number, long value);

    abstract B getBuilderFromMessage(java.lang.Object message);

    abstract T getFromMessage(java.lang.Object message);

    abstract int getSerializedSize(T unknowns);

    abstract int getSerializedSizeAsMessageSet(T message);

    abstract void makeImmutable(java.lang.Object message);

    abstract T merge(T destination, T source);

    abstract B newBuilder();

    abstract void setBuilderToMessage(java.lang.Object message, B builder);

    abstract void setToMessage(java.lang.Object message, T fields);

    abstract boolean shouldDiscardUnknownFields(com.google.protobuf.Reader reader);

    abstract T toImmutable(B fields);

    abstract void writeAsMessageSetTo(T unknownFields, com.google.protobuf.Writer writer) throws java.io.IOException;

    abstract void writeTo(T unknownFields, com.google.protobuf.Writer writer) throws java.io.IOException;

    UnknownFieldSchema() {
    }

    final boolean mergeOneFieldFrom(B unknownFields, com.google.protobuf.Reader reader, int currentDepth) throws java.io.IOException {
        int tag = reader.getTag();
        int tagFieldNumber = com.google.protobuf.WireFormat.getTagFieldNumber(tag);
        int tagWireType = com.google.protobuf.WireFormat.getTagWireType(tag);
        if (tagWireType == 0) {
            addVarint(unknownFields, tagFieldNumber, reader.readInt64());
            return true;
        }
        if (tagWireType == 1) {
            addFixed64(unknownFields, tagFieldNumber, reader.readFixed64());
            return true;
        }
        if (tagWireType == 2) {
            addLengthDelimited(unknownFields, tagFieldNumber, reader.readBytes());
            return true;
        }
        if (tagWireType != 3) {
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                addFixed32(unknownFields, tagFieldNumber, reader.readFixed32());
                return true;
            }
            throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
        }
        B newBuilder = newBuilder();
        int makeTag = com.google.protobuf.WireFormat.makeTag(tagFieldNumber, 4);
        int i = currentDepth + 1;
        if (i >= recursionLimit) {
            throw com.google.protobuf.InvalidProtocolBufferException.recursionLimitExceeded();
        }
        mergeFrom(newBuilder, reader, i);
        if (makeTag != reader.getTag()) {
            throw com.google.protobuf.InvalidProtocolBufferException.invalidEndTag();
        }
        addGroup(unknownFields, tagFieldNumber, toImmutable(newBuilder));
        return true;
    }

    private final void mergeFrom(B unknownFields, com.google.protobuf.Reader reader, int currentDepth) throws java.io.IOException {
        while (reader.getFieldNumber() != Integer.MAX_VALUE && mergeOneFieldFrom(unknownFields, reader, currentDepth)) {
        }
    }

    public void setRecursionLimit(int limit) {
        recursionLimit = limit;
    }
}
