package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.d8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0300d8 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0300d8[] f5715b;

    /* renamed from: a, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0325e8 f5716a;

    public C0300d8() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0300d8[] b() {
        if (f5715b == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5715b == null) {
                        f5715b = new io.appmetrica.analytics.impl.C0300d8[0];
                    }
                } finally {
                }
            }
        }
        return f5715b;
    }

    public final io.appmetrica.analytics.impl.C0300d8 a() {
        this.f5716a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        io.appmetrica.analytics.impl.C0325e8 c0325e8 = this.f5716a;
        return c0325e8 != null ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(1, c0325e8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        io.appmetrica.analytics.impl.C0325e8 c0325e8 = this.f5716a;
        if (c0325e8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0325e8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0300d8 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
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
                if (this.f5716a == null) {
                    this.f5716a = new io.appmetrica.analytics.impl.C0325e8();
                }
                codedInputByteBufferNano.readMessage(this.f5716a);
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0300d8 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0300d8().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0300d8 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0300d8) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0300d8(), bArr);
    }
}
