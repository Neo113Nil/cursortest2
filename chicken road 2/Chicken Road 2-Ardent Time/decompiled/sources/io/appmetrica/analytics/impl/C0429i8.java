package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.i8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0429i8 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0429i8[] f6085c;

    /* renamed from: a, reason: collision with root package name */
    public int f6086a;

    /* renamed from: b, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0325e8 f6087b;

    public C0429i8() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0429i8[] b() {
        if (f6085c == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6085c == null) {
                        f6085c = new io.appmetrica.analytics.impl.C0429i8[0];
                    }
                } finally {
                }
            }
        }
        return f6085c;
    }

    public final io.appmetrica.analytics.impl.C0429i8 a() {
        this.f6086a = 0;
        this.f6087b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f6086a;
        if (i2 != 0) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt32Size(1, i2);
        }
        io.appmetrica.analytics.impl.C0325e8 c0325e8 = this.f6087b;
        return c0325e8 != null ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(2, c0325e8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i2 = this.f6086a;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i2);
        }
        io.appmetrica.analytics.impl.C0325e8 c0325e8 = this.f6087b;
        if (c0325e8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0325e8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0429i8 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f6086a = codedInputByteBufferNano.readUInt32();
            } else if (readTag != 18) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f6087b == null) {
                    this.f6087b = new io.appmetrica.analytics.impl.C0325e8();
                }
                codedInputByteBufferNano.readMessage(this.f6087b);
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0429i8 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0429i8().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0429i8 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0429i8) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0429i8(), bArr);
    }
}
