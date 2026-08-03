package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Y8 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.Y8[] f5330c;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f5331a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f5332b;

    public Y8() {
        a();
    }

    public static io.appmetrica.analytics.impl.Y8[] b() {
        if (f5330c == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5330c == null) {
                        f5330c = new io.appmetrica.analytics.impl.Y8[0];
                    }
                } finally {
                }
            }
        }
        return f5330c;
    }

    public final io.appmetrica.analytics.impl.Y8 a() {
        this.f5331a = "";
        this.f5332b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(2, this.f5332b) + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(1, this.f5331a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeString(1, this.f5331a);
        codedOutputByteBufferNano.writeString(2, this.f5332b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.Y8 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f5331a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f5332b = codedInputByteBufferNano.readString();
            }
        }
    }

    public static io.appmetrica.analytics.impl.Y8 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.Y8().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.Y8 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.Y8) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.Y8(), bArr);
    }
}
