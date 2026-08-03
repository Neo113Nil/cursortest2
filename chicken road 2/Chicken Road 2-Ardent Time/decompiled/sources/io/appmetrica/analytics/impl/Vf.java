package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Vf extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static final int f5163e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f5164f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f5165g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.Vf[] f5166h;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f5167a;

    /* renamed from: b, reason: collision with root package name */
    public long f5168b;

    /* renamed from: c, reason: collision with root package name */
    public long f5169c;

    /* renamed from: d, reason: collision with root package name */
    public int f5170d;

    public Vf() {
        a();
    }

    public static io.appmetrica.analytics.impl.Vf[] b() {
        if (f5166h == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5166h == null) {
                        f5166h = new io.appmetrica.analytics.impl.Vf[0];
                    }
                } finally {
                }
            }
        }
        return f5166h;
    }

    public final io.appmetrica.analytics.impl.Vf a() {
        this.f5167a = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        this.f5168b = 0L;
        this.f5169c = 0L;
        this.f5170d = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeBytesSize = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(1, this.f5167a) + super.computeSerializedSize();
        long j2 = this.f5168b;
        if (j2 != 0) {
            computeBytesSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt64Size(2, j2);
        }
        long j3 = this.f5169c;
        if (j3 != 0) {
            computeBytesSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt64Size(3, j3);
        }
        int i2 = this.f5170d;
        return i2 != 0 ? computeBytesSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(4, i2) : computeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeBytes(1, this.f5167a);
        long j2 = this.f5168b;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j2);
        }
        long j3 = this.f5169c;
        if (j3 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j3);
        }
        int i2 = this.f5170d;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(4, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.Vf mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f5167a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 16) {
                this.f5168b = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 24) {
                this.f5169c = codedInputByteBufferNano.readUInt64();
            } else if (readTag != 32) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f5170d = readInt32;
                }
            }
        }
    }

    public static io.appmetrica.analytics.impl.Vf b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.Vf().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.Vf a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.Vf) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.Vf(), bArr);
    }
}
