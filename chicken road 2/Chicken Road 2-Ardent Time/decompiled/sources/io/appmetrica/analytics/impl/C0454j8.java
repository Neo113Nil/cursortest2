package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.j8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0454j8 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0454j8[] f6164b;

    /* renamed from: a, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0403h8 f6165a;

    public C0454j8() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0454j8[] b() {
        if (f6164b == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6164b == null) {
                        f6164b = new io.appmetrica.analytics.impl.C0454j8[0];
                    }
                } finally {
                }
            }
        }
        return f6164b;
    }

    public final io.appmetrica.analytics.impl.C0454j8 a() {
        this.f6165a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        io.appmetrica.analytics.impl.C0403h8 c0403h8 = this.f6165a;
        return c0403h8 != null ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(1, c0403h8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        io.appmetrica.analytics.impl.C0403h8 c0403h8 = this.f6165a;
        if (c0403h8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0403h8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0454j8 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
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
                if (this.f6165a == null) {
                    this.f6165a = new io.appmetrica.analytics.impl.C0403h8();
                }
                codedInputByteBufferNano.readMessage(this.f6165a);
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0454j8 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0454j8().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0454j8 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0454j8) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0454j8(), bArr);
    }
}
