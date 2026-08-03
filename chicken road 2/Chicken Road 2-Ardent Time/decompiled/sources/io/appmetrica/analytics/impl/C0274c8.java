package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.c8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0274c8 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0274c8[] f5637c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f5638a;

    /* renamed from: b, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0377g8 f5639b;

    public C0274c8() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0274c8[] b() {
        if (f5637c == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5637c == null) {
                        f5637c = new io.appmetrica.analytics.impl.C0274c8[0];
                    }
                } finally {
                }
            }
        }
        return f5637c;
    }

    public final io.appmetrica.analytics.impl.C0274c8 a() {
        this.f5638a = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        this.f5639b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!java.util.Arrays.equals(this.f5638a, io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(1, this.f5638a);
        }
        io.appmetrica.analytics.impl.C0377g8 c0377g8 = this.f5639b;
        return c0377g8 != null ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(2, c0377g8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!java.util.Arrays.equals(this.f5638a, io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f5638a);
        }
        io.appmetrica.analytics.impl.C0377g8 c0377g8 = this.f5639b;
        if (c0377g8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0377g8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0274c8 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f5638a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f5639b == null) {
                    this.f5639b = new io.appmetrica.analytics.impl.C0377g8();
                }
                codedInputByteBufferNano.readMessage(this.f5639b);
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0274c8 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0274c8().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0274c8 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0274c8) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0274c8(), bArr);
    }
}
