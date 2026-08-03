package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.p8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0610p8 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0610p8[] f6638d;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f6639a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f6640b;

    /* renamed from: c, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0636q8 f6641c;

    public C0610p8() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0610p8[] b() {
        if (f6638d == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6638d == null) {
                        f6638d = new io.appmetrica.analytics.impl.C0610p8[0];
                    }
                } finally {
                }
            }
        }
        return f6638d;
    }

    public final io.appmetrica.analytics.impl.C0610p8 a() {
        byte[] bArr = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        this.f6639a = bArr;
        this.f6640b = bArr;
        this.f6641c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f6639a;
        byte[] bArr2 = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        if (!java.util.Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(1, this.f6639a);
        }
        if (!java.util.Arrays.equals(this.f6640b, bArr2)) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(2, this.f6640b);
        }
        io.appmetrica.analytics.impl.C0636q8 c0636q8 = this.f6641c;
        return c0636q8 != null ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(3, c0636q8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f6639a;
        byte[] bArr2 = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        if (!java.util.Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f6639a);
        }
        if (!java.util.Arrays.equals(this.f6640b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f6640b);
        }
        io.appmetrica.analytics.impl.C0636q8 c0636q8 = this.f6641c;
        if (c0636q8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c0636q8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0610p8 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f6639a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                this.f6640b = codedInputByteBufferNano.readBytes();
            } else if (readTag != 26) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f6641c == null) {
                    this.f6641c = new io.appmetrica.analytics.impl.C0636q8();
                }
                codedInputByteBufferNano.readMessage(this.f6641c);
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0610p8 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0610p8().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0610p8 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0610p8) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0610p8(), bArr);
    }
}
