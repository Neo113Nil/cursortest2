package com.yandex.varioqub.config.impl;

/* loaded from: classes.dex */
public final class s extends com.yandex.varioqub.protobuf.nano.MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile com.yandex.varioqub.config.impl.s[] f2722d;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f2723a;

    /* renamed from: b, reason: collision with root package name */
    public long f2724b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2725c;

    public s() {
        a();
    }

    public final void a() {
        this.f2723a = "";
        this.f2724b = 0L;
        this.f2725c = false;
        this.cachedSize = -1;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f2723a.equals("")) {
            computeSerializedSize += com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(1, this.f2723a);
        }
        long j2 = this.f2724b;
        if (j2 != 0) {
            computeSerializedSize += com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano.computeInt64Size(2, j2);
        }
        boolean z2 = this.f2725c;
        return z2 ? computeSerializedSize + com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano.computeBoolSize(3, z2) : computeSerializedSize;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final com.yandex.varioqub.protobuf.nano.MessageNano mergeFrom(com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f2723a = codedInputByteBufferNano.readString();
            } else if (readTag == 16) {
                this.f2724b = codedInputByteBufferNano.readInt64();
            } else if (readTag == 24) {
                this.f2725c = codedInputByteBufferNano.readBool();
            } else if (!com.yandex.varioqub.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final void writeTo(com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f2723a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f2723a);
        }
        long j2 = this.f2724b;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeInt64(2, j2);
        }
        boolean z2 = this.f2725c;
        if (z2) {
            codedOutputByteBufferNano.writeBool(3, z2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
