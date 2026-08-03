package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class W1 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.W1[] f5183c;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f5184a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5185b;

    public W1() {
        a();
    }

    public static io.appmetrica.analytics.impl.W1[] b() {
        if (f5183c == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5183c == null) {
                        f5183c = new io.appmetrica.analytics.impl.W1[0];
                    }
                } finally {
                }
            }
        }
        return f5183c;
    }

    public final io.appmetrica.analytics.impl.W1 a() {
        this.f5184a = "";
        this.f5185b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBoolSize(2, this.f5185b) + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(1, this.f5184a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeString(1, this.f5184a);
        codedOutputByteBufferNano.writeBool(2, this.f5185b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.W1 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f5184a = codedInputByteBufferNano.readString();
            } else if (readTag != 16) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f5185b = codedInputByteBufferNano.readBool();
            }
        }
    }

    public static io.appmetrica.analytics.impl.W1 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.W1().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.W1 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.W1) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.W1(), bArr);
    }
}
