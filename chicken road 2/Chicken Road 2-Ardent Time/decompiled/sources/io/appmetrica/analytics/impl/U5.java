package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class U5 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.U5[] f5056c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f5057a;

    /* renamed from: b, reason: collision with root package name */
    public io.appmetrica.analytics.impl.Y5 f5058b;

    public U5() {
        a();
    }

    public static io.appmetrica.analytics.impl.U5[] b() {
        if (f5056c == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5056c == null) {
                        f5056c = new io.appmetrica.analytics.impl.U5[0];
                    }
                } finally {
                }
            }
        }
        return f5056c;
    }

    public final io.appmetrica.analytics.impl.U5 a() {
        this.f5057a = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        this.f5058b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!java.util.Arrays.equals(this.f5057a, io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(1, this.f5057a);
        }
        io.appmetrica.analytics.impl.Y5 y5 = this.f5058b;
        return y5 != null ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(2, y5) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!java.util.Arrays.equals(this.f5057a, io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f5057a);
        }
        io.appmetrica.analytics.impl.Y5 y5 = this.f5058b;
        if (y5 != null) {
            codedOutputByteBufferNano.writeMessage(2, y5);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.U5 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f5057a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f5058b == null) {
                    this.f5058b = new io.appmetrica.analytics.impl.Y5();
                }
                codedInputByteBufferNano.readMessage(this.f5058b);
            }
        }
    }

    public static io.appmetrica.analytics.impl.U5 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.U5().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.U5 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.U5) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.U5(), bArr);
    }
}
