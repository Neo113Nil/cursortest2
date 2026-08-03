package com.yandex.varioqub.config.impl;

/* loaded from: classes.dex */
public final class n extends com.yandex.varioqub.protobuf.nano.MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile com.yandex.varioqub.config.impl.n[] f2695c;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f2696a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f2697b;

    public n() {
        a();
    }

    public final void a() {
        this.f2696a = "";
        this.f2697b = "";
        this.cachedSize = -1;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f2696a.equals("")) {
            computeSerializedSize += com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(1, this.f2696a);
        }
        return !this.f2697b.equals("") ? computeSerializedSize + com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(2, this.f2697b) : computeSerializedSize;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final com.yandex.varioqub.protobuf.nano.MessageNano mergeFrom(com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f2696a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f2697b = codedInputByteBufferNano.readString();
            } else if (!com.yandex.varioqub.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final void writeTo(com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f2696a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f2696a);
        }
        if (!this.f2697b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f2697b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
