package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.fo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0367fo extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static final int f5939e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f5940f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f5941g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final int f5942h = 3;

    /* renamed from: i, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0367fo[] f5943i;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f5944a;

    /* renamed from: b, reason: collision with root package name */
    public int f5945b;

    /* renamed from: c, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0393go f5946c;

    /* renamed from: d, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0419ho f5947d;

    public C0367fo() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0367fo[] b() {
        if (f5943i == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5943i == null) {
                        f5943i = new io.appmetrica.analytics.impl.C0367fo[0];
                    }
                } finally {
                }
            }
        }
        return f5943i;
    }

    public final io.appmetrica.analytics.impl.C0367fo a() {
        this.f5944a = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        this.f5945b = 0;
        this.f5946c = null;
        this.f5947d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeInt32Size = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(2, this.f5945b) + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(1, this.f5944a) + super.computeSerializedSize();
        io.appmetrica.analytics.impl.C0393go c0393go = this.f5946c;
        if (c0393go != null) {
            computeInt32Size += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(3, c0393go);
        }
        io.appmetrica.analytics.impl.C0419ho c0419ho = this.f5947d;
        return c0419ho != null ? computeInt32Size + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(4, c0419ho) : computeInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeBytes(1, this.f5944a);
        codedOutputByteBufferNano.writeInt32(2, this.f5945b);
        io.appmetrica.analytics.impl.C0393go c0393go = this.f5946c;
        if (c0393go != null) {
            codedOutputByteBufferNano.writeMessage(3, c0393go);
        }
        io.appmetrica.analytics.impl.C0419ho c0419ho = this.f5947d;
        if (c0419ho != null) {
            codedOutputByteBufferNano.writeMessage(4, c0419ho);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0367fo mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f5944a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 16) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f5945b = readInt32;
                }
            } else if (readTag == 26) {
                if (this.f5946c == null) {
                    this.f5946c = new io.appmetrica.analytics.impl.C0393go();
                }
                codedInputByteBufferNano.readMessage(this.f5946c);
            } else if (readTag != 34) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f5947d == null) {
                    this.f5947d = new io.appmetrica.analytics.impl.C0419ho();
                }
                codedInputByteBufferNano.readMessage(this.f5947d);
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0367fo b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0367fo().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0367fo a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0367fo) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0367fo(), bArr);
    }
}
