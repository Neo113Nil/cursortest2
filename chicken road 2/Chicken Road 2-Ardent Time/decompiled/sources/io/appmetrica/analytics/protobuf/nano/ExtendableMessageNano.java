package io.appmetrica.analytics.protobuf.nano;

/* loaded from: classes.dex */
public abstract class ExtendableMessageNano<M extends io.appmetrica.analytics.protobuf.nano.ExtendableMessageNano<M>> extends io.appmetrica.analytics.protobuf.nano.MessageNano {
    protected io.appmetrica.analytics.protobuf.nano.FieldArray unknownFieldData;

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
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

    public final <T> T getExtension(io.appmetrica.analytics.protobuf.nano.Extension<M, T> extension) {
        io.appmetrica.analytics.protobuf.nano.FieldData fieldData;
        io.appmetrica.analytics.protobuf.nano.FieldArray fieldArray = this.unknownFieldData;
        if (fieldArray == null || (fieldData = fieldArray.get(io.appmetrica.analytics.protobuf.nano.WireFormatNano.getTagFieldNumber(extension.tag))) == null) {
            return null;
        }
        return (T) fieldData.getValue(extension);
    }

    public final boolean hasExtension(io.appmetrica.analytics.protobuf.nano.Extension<M, ?> extension) {
        io.appmetrica.analytics.protobuf.nano.FieldArray fieldArray = this.unknownFieldData;
        return (fieldArray == null || fieldArray.get(io.appmetrica.analytics.protobuf.nano.WireFormatNano.getTagFieldNumber(extension.tag)) == null) ? false : true;
    }

    public final <T> M setExtension(io.appmetrica.analytics.protobuf.nano.Extension<M, T> extension, T t) {
        int tagFieldNumber = io.appmetrica.analytics.protobuf.nano.WireFormatNano.getTagFieldNumber(extension.tag);
        io.appmetrica.analytics.protobuf.nano.FieldData fieldData = null;
        if (t == null) {
            io.appmetrica.analytics.protobuf.nano.FieldArray fieldArray = this.unknownFieldData;
            if (fieldArray != null) {
                fieldArray.remove(tagFieldNumber);
                if (this.unknownFieldData.isEmpty()) {
                    this.unknownFieldData = null;
                }
            }
        } else {
            io.appmetrica.analytics.protobuf.nano.FieldArray fieldArray2 = this.unknownFieldData;
            if (fieldArray2 == null) {
                this.unknownFieldData = new io.appmetrica.analytics.protobuf.nano.FieldArray();
            } else {
                fieldData = fieldArray2.get(tagFieldNumber);
            }
            if (fieldData == null) {
                this.unknownFieldData.put(tagFieldNumber, new io.appmetrica.analytics.protobuf.nano.FieldData(extension, t));
            } else {
                fieldData.setValue(extension, t);
            }
        }
        return this;
    }

    public final boolean storeUnknownField(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano, int i2) {
        io.appmetrica.analytics.protobuf.nano.FieldData fieldData;
        int position = codedInputByteBufferNano.getPosition();
        if (!codedInputByteBufferNano.skipField(i2)) {
            return false;
        }
        int tagFieldNumber = io.appmetrica.analytics.protobuf.nano.WireFormatNano.getTagFieldNumber(i2);
        io.appmetrica.analytics.protobuf.nano.UnknownFieldData unknownFieldData = new io.appmetrica.analytics.protobuf.nano.UnknownFieldData(i2, codedInputByteBufferNano.getData(position, codedInputByteBufferNano.getPosition() - position));
        io.appmetrica.analytics.protobuf.nano.FieldArray fieldArray = this.unknownFieldData;
        if (fieldArray == null) {
            this.unknownFieldData = new io.appmetrica.analytics.protobuf.nano.FieldArray();
            fieldData = null;
        } else {
            fieldData = fieldArray.get(tagFieldNumber);
        }
        if (fieldData == null) {
            fieldData = new io.appmetrica.analytics.protobuf.nano.FieldData();
            this.unknownFieldData.put(tagFieldNumber, fieldData);
        }
        fieldData.addUnknownField(unknownFieldData);
        return true;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.unknownFieldData == null) {
            return;
        }
        for (int i2 = 0; i2 < this.unknownFieldData.size(); i2++) {
            this.unknownFieldData.dataAt(i2).writeTo(codedOutputByteBufferNano);
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: clone */
    public M mo3clone() {
        M m2 = (M) super.mo3clone();
        io.appmetrica.analytics.protobuf.nano.InternalNano.cloneUnknownFieldData(this, m2);
        return m2;
    }
}
