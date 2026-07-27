package com.yandex.varioqub.config.impl;

import com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import com.yandex.varioqub.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class s extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile s[] f5456d;

    /* renamed from: a, reason: collision with root package name */
    public String f5457a;

    /* renamed from: b, reason: collision with root package name */
    public long f5458b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5459c;

    public s() {
        a();
    }

    public final void a() {
        this.f5457a = "";
        this.f5458b = 0L;
        this.f5459c = false;
        this.cachedSize = -1;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f5457a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f5457a);
        }
        long j2 = this.f5458b;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(2, j2);
        }
        boolean z = this.f5459c;
        return z ? computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(3, z) : computeSerializedSize;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f5457a = codedInputByteBufferNano.readString();
            } else if (readTag == 16) {
                this.f5458b = codedInputByteBufferNano.readInt64();
            } else if (readTag == 24) {
                this.f5459c = codedInputByteBufferNano.readBool();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f5457a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f5457a);
        }
        long j2 = this.f5458b;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeInt64(2, j2);
        }
        boolean z = this.f5459c;
        if (z) {
            codedOutputByteBufferNano.writeBool(3, z);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
