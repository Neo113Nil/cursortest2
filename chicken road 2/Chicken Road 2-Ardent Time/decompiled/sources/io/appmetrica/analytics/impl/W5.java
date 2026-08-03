package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class W5 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.W5[] f5189b;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f5190a;

    public W5() {
        a();
    }

    public static io.appmetrica.analytics.impl.W5[] b() {
        if (f5189b == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5189b == null) {
                        f5189b = new io.appmetrica.analytics.impl.W5[0];
                    }
                } finally {
                }
            }
        }
        return f5189b;
    }

    public final io.appmetrica.analytics.impl.W5 a() {
        this.f5190a = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(1, this.f5190a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeString(1, this.f5190a);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.W5 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 10) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f5190a = codedInputByteBufferNano.readString();
            }
        }
    }

    public static io.appmetrica.analytics.impl.W5 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.W5) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.W5(), bArr);
    }

    public static io.appmetrica.analytics.impl.W5 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.W5().mergeFrom(codedInputByteBufferNano);
    }
}
