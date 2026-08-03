package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class r extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.r[] f6703c;

    /* renamed from: a, reason: collision with root package name */
    public long f6704a;

    /* renamed from: b, reason: collision with root package name */
    public int f6705b;

    public r() {
        a();
    }

    public static io.appmetrica.analytics.impl.r[] b() {
        if (f6703c == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6703c == null) {
                        f6703c = new io.appmetrica.analytics.impl.r[0];
                    }
                } finally {
                }
            }
        }
        return f6703c;
    }

    public final io.appmetrica.analytics.impl.r a() {
        this.f6704a = 0L;
        this.f6705b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j2 = this.f6704a;
        if (j2 != 0) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt64Size(1, j2);
        }
        int i2 = this.f6705b;
        return i2 != 0 ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(2, i2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        long j2 = this.f6704a;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeInt64(1, j2);
        }
        int i2 = this.f6705b;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.r mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f6704a = codedInputByteBufferNano.readInt64();
            } else if (readTag != 16) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f6705b = codedInputByteBufferNano.readInt32();
            }
        }
    }

    public static io.appmetrica.analytics.impl.r b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.r().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.r a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.r) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.r(), bArr);
    }
}
