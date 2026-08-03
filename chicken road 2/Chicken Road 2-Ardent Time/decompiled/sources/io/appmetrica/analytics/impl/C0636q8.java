package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.q8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0636q8 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0636q8[] f6678e;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f6679a;

    /* renamed from: b, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0351f8 f6680b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f6681c;

    /* renamed from: d, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0506l8 f6682d;

    public C0636q8() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0636q8[] b() {
        if (f6678e == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6678e == null) {
                        f6678e = new io.appmetrica.analytics.impl.C0636q8[0];
                    }
                } finally {
                }
            }
        }
        return f6678e;
    }

    public final io.appmetrica.analytics.impl.C0636q8 a() {
        byte[] bArr = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        this.f6679a = bArr;
        this.f6680b = null;
        this.f6681c = bArr;
        this.f6682d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f6679a;
        byte[] bArr2 = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        if (!java.util.Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(1, this.f6679a);
        }
        io.appmetrica.analytics.impl.C0351f8 c0351f8 = this.f6680b;
        if (c0351f8 != null) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(2, c0351f8);
        }
        if (!java.util.Arrays.equals(this.f6681c, bArr2)) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(3, this.f6681c);
        }
        io.appmetrica.analytics.impl.C0506l8 c0506l8 = this.f6682d;
        return c0506l8 != null ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(4, c0506l8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f6679a;
        byte[] bArr2 = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        if (!java.util.Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f6679a);
        }
        io.appmetrica.analytics.impl.C0351f8 c0351f8 = this.f6680b;
        if (c0351f8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0351f8);
        }
        if (!java.util.Arrays.equals(this.f6681c, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f6681c);
        }
        io.appmetrica.analytics.impl.C0506l8 c0506l8 = this.f6682d;
        if (c0506l8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0506l8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0636q8 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f6679a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                if (this.f6680b == null) {
                    this.f6680b = new io.appmetrica.analytics.impl.C0351f8();
                }
                codedInputByteBufferNano.readMessage(this.f6680b);
            } else if (readTag == 26) {
                this.f6681c = codedInputByteBufferNano.readBytes();
            } else if (readTag != 34) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f6682d == null) {
                    this.f6682d = new io.appmetrica.analytics.impl.C0506l8();
                }
                codedInputByteBufferNano.readMessage(this.f6682d);
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0636q8 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0636q8().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0636q8 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0636q8) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0636q8(), bArr);
    }
}
