package io.appmetrica.analytics.billing.impl;

/* loaded from: classes.dex */
public final class y extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static final int f3506f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f3507g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f3508h = 2;

    /* renamed from: i, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.billing.impl.y[] f3509i;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f3510a;

    /* renamed from: b, reason: collision with root package name */
    public long f3511b;

    /* renamed from: c, reason: collision with root package name */
    public int f3512c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f3513d;

    /* renamed from: e, reason: collision with root package name */
    public long f3514e;

    public y() {
        a();
    }

    public static io.appmetrica.analytics.billing.impl.y[] b() {
        if (f3509i == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f3509i == null) {
                        f3509i = new io.appmetrica.analytics.billing.impl.y[0];
                    }
                } finally {
                }
            }
        }
        return f3509i;
    }

    public final io.appmetrica.analytics.billing.impl.y a() {
        byte[] bArr = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        this.f3510a = bArr;
        this.f3511b = 0L;
        this.f3512c = 0;
        this.f3513d = bArr;
        this.f3514e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f3510a;
        byte[] bArr2 = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        if (!java.util.Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(1, this.f3510a);
        }
        long j2 = this.f3511b;
        if (j2 != 0) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt64Size(2, j2);
        }
        int i2 = this.f3512c;
        if (i2 != 0) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(3, i2);
        }
        if (!java.util.Arrays.equals(this.f3513d, bArr2)) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(4, this.f3513d);
        }
        long j3 = this.f3514e;
        return j3 != 0 ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt64Size(5, j3) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f3510a;
        byte[] bArr2 = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        if (!java.util.Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f3510a);
        }
        long j2 = this.f3511b;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j2);
        }
        int i2 = this.f3512c;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(3, i2);
        }
        if (!java.util.Arrays.equals(this.f3513d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f3513d);
        }
        long j3 = this.f3514e;
        if (j3 != 0) {
            codedOutputByteBufferNano.writeUInt64(5, j3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static io.appmetrica.analytics.billing.impl.y b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.billing.impl.y().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.billing.impl.y mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f3510a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 16) {
                this.f3511b = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 24) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f3512c = readInt32;
                }
            } else if (readTag == 34) {
                this.f3513d = codedInputByteBufferNano.readBytes();
            } else if (readTag != 40) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f3514e = codedInputByteBufferNano.readUInt64();
            }
        }
    }

    public static io.appmetrica.analytics.billing.impl.y a(byte[] bArr) {
        return (io.appmetrica.analytics.billing.impl.y) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.billing.impl.y(), bArr);
    }
}
