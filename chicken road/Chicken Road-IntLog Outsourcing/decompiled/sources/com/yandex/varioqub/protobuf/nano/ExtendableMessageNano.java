package com.yandex.varioqub.protobuf.nano;

import com.yandex.varioqub.protobuf.nano.ExtendableMessageNano;

/* loaded from: classes.dex */
public abstract class ExtendableMessageNano<M extends ExtendableMessageNano<M>> extends MessageNano {
    protected FieldArray unknownFieldData;

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

    public final <T> T getExtension(Extension<M, T> extension) {
        FieldData fieldData;
        FieldArray fieldArray = this.unknownFieldData;
        if (fieldArray == null || (fieldData = fieldArray.get(WireFormatNano.getTagFieldNumber(extension.tag))) == null) {
            return null;
        }
        return (T) fieldData.getValue(extension);
    }

    public final boolean hasExtension(Extension<M, ?> extension) {
        FieldArray fieldArray = this.unknownFieldData;
        return (fieldArray == null || fieldArray.get(WireFormatNano.getTagFieldNumber(extension.tag)) == null) ? false : true;
    }

    public final <T> M setExtension(Extension<M, T> extension, T t5) {
        int tagFieldNumber = WireFormatNano.getTagFieldNumber(extension.tag);
        FieldData fieldData = null;
        if (t5 == null) {
            FieldArray fieldArray = this.unknownFieldData;
            if (fieldArray != null) {
                fieldArray.remove(tagFieldNumber);
                if (this.unknownFieldData.isEmpty()) {
                    this.unknownFieldData = null;
                }
            }
        } else {
            FieldArray fieldArray2 = this.unknownFieldData;
            if (fieldArray2 == null) {
                this.unknownFieldData = new FieldArray();
            } else {
                fieldData = fieldArray2.get(tagFieldNumber);
            }
            if (fieldData == null) {
                this.unknownFieldData.put(tagFieldNumber, new FieldData(extension, t5));
            } else {
                fieldData.setValue(extension, t5);
            }
        }
        return this;
    }

    public final boolean storeUnknownField(CodedInputByteBufferNano codedInputByteBufferNano, int i2) {
        FieldData fieldData;
        int position = codedInputByteBufferNano.getPosition();
        if (!codedInputByteBufferNano.skipField(i2)) {
            return false;
        }
        int tagFieldNumber = WireFormatNano.getTagFieldNumber(i2);
        UnknownFieldData unknownFieldData = new UnknownFieldData(i2, codedInputByteBufferNano.getData(position, codedInputByteBufferNano.getPosition() - position));
        FieldArray fieldArray = this.unknownFieldData;
        if (fieldArray == null) {
            this.unknownFieldData = new FieldArray();
            fieldData = null;
        } else {
            fieldData = fieldArray.get(tagFieldNumber);
        }
        if (fieldData == null) {
            fieldData = new FieldData();
            this.unknownFieldData.put(tagFieldNumber, fieldData);
        }
        fieldData.addUnknownField(unknownFieldData);
        return true;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.unknownFieldData == null) {
            return;
        }
        for (int i2 = 0; i2 < this.unknownFieldData.size(); i2++) {
            this.unknownFieldData.dataAt(i2).writeTo(codedOutputByteBufferNano);
        }
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    /* renamed from: clone */
    public M mo43clone() {
        M m6 = (M) super.mo43clone();
        InternalNano.cloneUnknownFieldData(this, m6);
        return m6;
    }
}
