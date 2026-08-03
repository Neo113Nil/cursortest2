package com.google.protobuf;

@com.google.protobuf.CheckReturnValue
/* loaded from: classes4.dex */
class UnknownFieldSetLiteSchema extends com.google.protobuf.UnknownFieldSchema<com.google.protobuf.UnknownFieldSetLite, com.google.protobuf.UnknownFieldSetLite> {
    @Override // com.google.protobuf.UnknownFieldSchema
    boolean shouldDiscardUnknownFields(com.google.protobuf.Reader reader) {
        return false;
    }

    UnknownFieldSetLiteSchema() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.protobuf.UnknownFieldSchema
    public com.google.protobuf.UnknownFieldSetLite newBuilder() {
        return com.google.protobuf.UnknownFieldSetLite.newInstance();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.UnknownFieldSchema
    public void addVarint(com.google.protobuf.UnknownFieldSetLite fields, int number, long value) {
        fields.storeField(com.google.protobuf.WireFormat.makeTag(number, 0), java.lang.Long.valueOf(value));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.UnknownFieldSchema
    public void addFixed32(com.google.protobuf.UnknownFieldSetLite fields, int number, int value) {
        fields.storeField(com.google.protobuf.WireFormat.makeTag(number, 5), java.lang.Integer.valueOf(value));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.UnknownFieldSchema
    public void addFixed64(com.google.protobuf.UnknownFieldSetLite fields, int number, long value) {
        fields.storeField(com.google.protobuf.WireFormat.makeTag(number, 1), java.lang.Long.valueOf(value));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.UnknownFieldSchema
    public void addLengthDelimited(com.google.protobuf.UnknownFieldSetLite fields, int number, com.google.protobuf.ByteString value) {
        fields.storeField(com.google.protobuf.WireFormat.makeTag(number, 2), value);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.UnknownFieldSchema
    public void addGroup(com.google.protobuf.UnknownFieldSetLite fields, int number, com.google.protobuf.UnknownFieldSetLite subFieldSet) {
        fields.storeField(com.google.protobuf.WireFormat.makeTag(number, 3), subFieldSet);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.UnknownFieldSchema
    public com.google.protobuf.UnknownFieldSetLite toImmutable(com.google.protobuf.UnknownFieldSetLite fields) {
        fields.makeImmutable();
        return fields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.UnknownFieldSchema
    public void setToMessage(java.lang.Object message, com.google.protobuf.UnknownFieldSetLite fields) {
        ((com.google.protobuf.GeneratedMessageLite) message).unknownFields = fields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.protobuf.UnknownFieldSchema
    public com.google.protobuf.UnknownFieldSetLite getFromMessage(java.lang.Object message) {
        return ((com.google.protobuf.GeneratedMessageLite) message).unknownFields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.protobuf.UnknownFieldSchema
    public com.google.protobuf.UnknownFieldSetLite getBuilderFromMessage(java.lang.Object message) {
        com.google.protobuf.UnknownFieldSetLite fromMessage = getFromMessage(message);
        if (fromMessage != com.google.protobuf.UnknownFieldSetLite.getDefaultInstance()) {
            return fromMessage;
        }
        com.google.protobuf.UnknownFieldSetLite newInstance = com.google.protobuf.UnknownFieldSetLite.newInstance();
        setToMessage(message, newInstance);
        return newInstance;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.UnknownFieldSchema
    public void setBuilderToMessage(java.lang.Object message, com.google.protobuf.UnknownFieldSetLite fields) {
        setToMessage(message, fields);
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    void makeImmutable(java.lang.Object message) {
        getFromMessage(message).makeImmutable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.UnknownFieldSchema
    public void writeTo(com.google.protobuf.UnknownFieldSetLite fields, com.google.protobuf.Writer writer) throws java.io.IOException {
        fields.writeTo(writer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.UnknownFieldSchema
    public void writeAsMessageSetTo(com.google.protobuf.UnknownFieldSetLite fields, com.google.protobuf.Writer writer) throws java.io.IOException {
        fields.writeAsMessageSetTo(writer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.UnknownFieldSchema
    public com.google.protobuf.UnknownFieldSetLite merge(com.google.protobuf.UnknownFieldSetLite target, com.google.protobuf.UnknownFieldSetLite source) {
        if (com.google.protobuf.UnknownFieldSetLite.getDefaultInstance().equals(source)) {
            return target;
        }
        if (com.google.protobuf.UnknownFieldSetLite.getDefaultInstance().equals(target)) {
            return com.google.protobuf.UnknownFieldSetLite.mutableCopyOf(target, source);
        }
        return target.mergeFrom(source);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.UnknownFieldSchema
    public int getSerializedSize(com.google.protobuf.UnknownFieldSetLite unknowns) {
        return unknowns.getSerializedSize();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.UnknownFieldSchema
    public int getSerializedSizeAsMessageSet(com.google.protobuf.UnknownFieldSetLite unknowns) {
        return unknowns.getSerializedSizeAsMessageSet();
    }
}
