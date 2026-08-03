package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.e8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0325e8 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0325e8[] f5784e;

    /* renamed from: a, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0558n8 f5785a;

    /* renamed from: b, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0610p8 f5786b;

    /* renamed from: c, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0377g8 f5787c;

    /* renamed from: d, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0532m8 f5788d;

    public C0325e8() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0325e8[] b() {
        if (f5784e == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5784e == null) {
                        f5784e = new io.appmetrica.analytics.impl.C0325e8[0];
                    }
                } finally {
                }
            }
        }
        return f5784e;
    }

    public final io.appmetrica.analytics.impl.C0325e8 a() {
        this.f5785a = null;
        this.f5786b = null;
        this.f5787c = null;
        this.f5788d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        io.appmetrica.analytics.impl.C0558n8 c0558n8 = this.f5785a;
        if (c0558n8 != null) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(1, c0558n8);
        }
        io.appmetrica.analytics.impl.C0610p8 c0610p8 = this.f5786b;
        if (c0610p8 != null) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(2, c0610p8);
        }
        io.appmetrica.analytics.impl.C0377g8 c0377g8 = this.f5787c;
        if (c0377g8 != null) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(3, c0377g8);
        }
        io.appmetrica.analytics.impl.C0532m8 c0532m8 = this.f5788d;
        return c0532m8 != null ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(4, c0532m8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        io.appmetrica.analytics.impl.C0558n8 c0558n8 = this.f5785a;
        if (c0558n8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0558n8);
        }
        io.appmetrica.analytics.impl.C0610p8 c0610p8 = this.f5786b;
        if (c0610p8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0610p8);
        }
        io.appmetrica.analytics.impl.C0377g8 c0377g8 = this.f5787c;
        if (c0377g8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c0377g8);
        }
        io.appmetrica.analytics.impl.C0532m8 c0532m8 = this.f5788d;
        if (c0532m8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0532m8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0325e8 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f5785a == null) {
                    this.f5785a = new io.appmetrica.analytics.impl.C0558n8();
                }
                codedInputByteBufferNano.readMessage(this.f5785a);
            } else if (readTag == 18) {
                if (this.f5786b == null) {
                    this.f5786b = new io.appmetrica.analytics.impl.C0610p8();
                }
                codedInputByteBufferNano.readMessage(this.f5786b);
            } else if (readTag == 26) {
                if (this.f5787c == null) {
                    this.f5787c = new io.appmetrica.analytics.impl.C0377g8();
                }
                codedInputByteBufferNano.readMessage(this.f5787c);
            } else if (readTag != 34) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f5788d == null) {
                    this.f5788d = new io.appmetrica.analytics.impl.C0532m8();
                }
                codedInputByteBufferNano.readMessage(this.f5788d);
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0325e8 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0325e8().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0325e8 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0325e8) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0325e8(), bArr);
    }
}
