package com.yandex.varioqub.protobuf.nano;

/* loaded from: classes.dex */
final class UnknownFieldData {
    final byte[] bytes;
    final int tag;

    public UnknownFieldData(int i2, byte[] bArr) {
        this.tag = i2;
        this.bytes = bArr;
    }

    public int computeSerializedSize() {
        return com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano.computeRawVarint32Size(this.tag) + this.bytes.length;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.yandex.varioqub.protobuf.nano.UnknownFieldData)) {
            return false;
        }
        com.yandex.varioqub.protobuf.nano.UnknownFieldData unknownFieldData = (com.yandex.varioqub.protobuf.nano.UnknownFieldData) obj;
        return this.tag == unknownFieldData.tag && java.util.Arrays.equals(this.bytes, unknownFieldData.bytes);
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(this.bytes) + ((this.tag + 527) * 31);
    }

    public void writeTo(com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeRawVarint32(this.tag);
        codedOutputByteBufferNano.writeRawBytes(this.bytes);
    }
}
