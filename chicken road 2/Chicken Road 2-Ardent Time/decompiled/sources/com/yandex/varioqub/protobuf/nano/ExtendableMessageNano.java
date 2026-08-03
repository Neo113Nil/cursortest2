package com.yandex.varioqub.protobuf.nano;

/* loaded from: classes.dex */
public abstract class ExtendableMessageNano<M extends com.yandex.varioqub.protobuf.nano.ExtendableMessageNano<M>> extends com.yandex.varioqub.protobuf.nano.MessageNano {
    protected com.yandex.varioqub.protobuf.nano.FieldArray unknownFieldData;

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public int computeSerializedSize() {
        if (this.unknownFieldData == null) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.unknownFieldData.size(); i3++) {
            i2 += this.unknownFieldData.dataAt(i3).computeSerializedSize();
        }
        return i2;
    }

    public final <T> T getExtension(com.yandex.varioqub.protobuf.nano.Extension<M, T> extension) {
        com.yandex.varioqub.protobuf.nano.FieldData fieldData;
        com.yandex.varioqub.protobuf.nano.FieldArray fieldArray = this.unknownFieldData;
        if (fieldArray == null || (fieldData = fieldArray.get(com.yandex.varioqub.protobuf.nano.WireFormatNano.getTagFieldNumber(extension.tag))) == null) {
            return null;
        }
        return (T) fieldData.getValue(extension);
    }

    public final boolean hasExtension(com.yandex.varioqub.protobuf.nano.Extension<M, ?> extension) {
        com.yandex.varioqub.protobuf.nano.FieldArray fieldArray = this.unknownFieldData;
        return (fieldArray == null || fieldArray.get(com.yandex.varioqub.protobuf.nano.WireFormatNano.getTagFieldNumber(extension.tag)) == null) ? false : true;
    }

    public final <T> M setExtension(com.yandex.varioqub.protobuf.nano.Extension<M, T> extension, T t) {
        int tagFieldNumber = com.yandex.varioqub.protobuf.nano.WireFormatNano.getTagFieldNumber(extension.tag);
        com.yandex.varioqub.protobuf.nano.FieldData fieldData = null;
        if (t == null) {
            com.yandex.varioqub.protobuf.nano.FieldArray fieldArray = this.unknownFieldData;
            if (fieldArray != null) {
                fieldArray.remove(tagFieldNumber);
                if (this.unknownFieldData.isEmpty()) {
                    this.unknownFieldData = null;
                }
            }
        } else {
            com.yandex.varioqub.protobuf.nano.FieldArray fieldArray2 = this.unknownFieldData;
            if (fieldArray2 == null) {
                this.unknownFieldData = new com.yandex.varioqub.protobuf.nano.FieldArray();
            } else {
                fieldData = fieldArray2.get(tagFieldNumber);
            }
            if (fieldData == null) {
                this.unknownFieldData.put(tagFieldNumber, new com.yandex.varioqub.protobuf.nano.FieldData(extension, t));
            } else {
                fieldData.setValue(extension, t);
            }
        }
        return this;
    }

    public final boolean storeUnknownField(com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano, int i2) {
        com.yandex.varioqub.protobuf.nano.FieldData fieldData;
        int position = codedInputByteBufferNano.getPosition();
        if (!codedInputByteBufferNano.skipField(i2)) {
            return false;
        }
        int tagFieldNumber = com.yandex.varioqub.protobuf.nano.WireFormatNano.getTagFieldNumber(i2);
        com.yandex.varioqub.protobuf.nano.UnknownFieldData unknownFieldData = new com.yandex.varioqub.protobuf.nano.UnknownFieldData(i2, codedInputByteBufferNano.getData(position, codedInputByteBufferNano.getPosition() - position));
        com.yandex.varioqub.protobuf.nano.FieldArray fieldArray = this.unknownFieldData;
        if (fieldArray == null) {
            this.unknownFieldData = new com.yandex.varioqub.protobuf.nano.FieldArray();
            fieldData = null;
        } else {
            fieldData = fieldArray.get(tagFieldNumber);
        }
        if (fieldData == null) {
            fieldData = new com.yandex.varioqub.protobuf.nano.FieldData();
            this.unknownFieldData.put(tagFieldNumber, fieldData);
        }
        fieldData.addUnknownField(unknownFieldData);
        return true;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public void writeTo(com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.unknownFieldData == null) {
            return;
        }
        for (int i2 = 0; i2 < this.unknownFieldData.size(); i2++) {
            this.unknownFieldData.dataAt(i2).writeTo(codedOutputByteBufferNano);
        }
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    /* renamed from: clone */
    public M mo0clone() {
        M m2 = (M) super.mo0clone();
        com.yandex.varioqub.protobuf.nano.InternalNano.cloneUnknownFieldData(this, m2);
        return m2;
    }
}
