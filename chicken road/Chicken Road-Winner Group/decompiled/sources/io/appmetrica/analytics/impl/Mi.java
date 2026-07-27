package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Mi extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile Mi[] f6296c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f6297a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f6298b;

    public Mi() {
        a();
    }

    public static Mi[] b() {
        if (f6296c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6296c == null) {
                        f6296c = new Mi[0];
                    }
                } finally {
                }
            }
        }
        return f6296c;
    }

    public final Mi a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f6297a = bArr;
        this.f6298b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f6297a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f6297a);
        }
        return !Arrays.equals(this.f6298b, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f6298b) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f6297a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f6297a);
        }
        if (!Arrays.equals(this.f6298b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f6298b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Mi mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f6297a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f6298b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static Mi b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Mi().mergeFrom(codedInputByteBufferNano);
    }

    public static Mi a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Mi) MessageNano.mergeFrom(new Mi(), bArr);
    }
}
