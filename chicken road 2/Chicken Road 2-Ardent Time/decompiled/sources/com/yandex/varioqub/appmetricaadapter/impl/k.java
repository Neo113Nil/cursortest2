package com.yandex.varioqub.appmetricaadapter.impl;

/* loaded from: classes.dex */
public final class k extends com.yandex.varioqub.protobuf.nano.MessageNano {

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f2633o = "";

    /* renamed from: p, reason: collision with root package name */
    public long[] f2634p = com.yandex.varioqub.protobuf.nano.WireFormatNano.EMPTY_LONG_ARRAY;

    public k() {
        this.cachedSize = -1;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f2633o.equals("")) {
            computeSerializedSize += com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(1, this.f2633o);
        }
        long[] jArr = this.f2634p;
        if (jArr == null || jArr.length <= 0) {
            return computeSerializedSize;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            long[] jArr2 = this.f2634p;
            if (i2 >= jArr2.length) {
                return computeSerializedSize + i3 + jArr2.length;
            }
            i3 += com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano.computeInt64SizeNoTag(jArr2[i2]);
            i2++;
        }
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final com.yandex.varioqub.protobuf.nano.MessageNano mergeFrom(com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f2633o = codedInputByteBufferNano.readString();
            } else if (readTag == 16) {
                int repeatedFieldArrayLength = com.yandex.varioqub.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 16);
                long[] jArr = this.f2634p;
                int length = jArr == null ? 0 : jArr.length;
                int i2 = repeatedFieldArrayLength + length;
                long[] jArr2 = new long[i2];
                if (length != 0) {
                    java.lang.System.arraycopy(jArr, 0, jArr2, 0, length);
                }
                while (length < i2 - 1) {
                    jArr2[length] = codedInputByteBufferNano.readInt64();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                jArr2[length] = codedInputByteBufferNano.readInt64();
                this.f2634p = jArr2;
            } else if (readTag == 18) {
                int pushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                int position = codedInputByteBufferNano.getPosition();
                int i3 = 0;
                while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                    codedInputByteBufferNano.readInt64();
                    i3++;
                }
                codedInputByteBufferNano.rewindToPosition(position);
                long[] jArr3 = this.f2634p;
                int length2 = jArr3 == null ? 0 : jArr3.length;
                int i4 = i3 + length2;
                long[] jArr4 = new long[i4];
                if (length2 != 0) {
                    java.lang.System.arraycopy(jArr3, 0, jArr4, 0, length2);
                }
                while (length2 < i4) {
                    jArr4[length2] = codedInputByteBufferNano.readInt64();
                    length2++;
                }
                this.f2634p = jArr4;
                codedInputByteBufferNano.popLimit(pushLimit);
            } else if (!com.yandex.varioqub.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final void writeTo(com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f2633o.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f2633o);
        }
        long[] jArr = this.f2634p;
        if (jArr != null && jArr.length > 0) {
            int i2 = 0;
            while (true) {
                long[] jArr2 = this.f2634p;
                if (i2 >= jArr2.length) {
                    break;
                }
                codedOutputByteBufferNano.writeInt64(2, jArr2[i2]);
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
