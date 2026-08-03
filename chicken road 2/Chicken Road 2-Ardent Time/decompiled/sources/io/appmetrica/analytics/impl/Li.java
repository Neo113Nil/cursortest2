package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Li extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static final int f4616f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f4617g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f4618h = 2;

    /* renamed from: i, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.Li[] f4619i;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f4620a;

    /* renamed from: b, reason: collision with root package name */
    public long f4621b;

    /* renamed from: c, reason: collision with root package name */
    public int f4622c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f4623d;

    /* renamed from: e, reason: collision with root package name */
    public long f4624e;

    public Li() {
        a();
    }

    public static io.appmetrica.analytics.impl.Li[] b() {
        if (f4619i == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f4619i == null) {
                        f4619i = new io.appmetrica.analytics.impl.Li[0];
                    }
                } finally {
                }
            }
        }
        return f4619i;
    }

    public final io.appmetrica.analytics.impl.Li a() {
        byte[] bArr = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        this.f4620a = bArr;
        this.f4621b = 0L;
        this.f4622c = 0;
        this.f4623d = bArr;
        this.f4624e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f4620a;
        byte[] bArr2 = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        if (!java.util.Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(1, this.f4620a);
        }
        long j2 = this.f4621b;
        if (j2 != 0) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt64Size(2, j2);
        }
        int i2 = this.f4622c;
        if (i2 != 0) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(3, i2);
        }
        if (!java.util.Arrays.equals(this.f4623d, bArr2)) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(4, this.f4623d);
        }
        long j3 = this.f4624e;
        return j3 != 0 ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt64Size(5, j3) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f4620a;
        byte[] bArr2 = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        if (!java.util.Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f4620a);
        }
        long j2 = this.f4621b;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j2);
        }
        int i2 = this.f4622c;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(3, i2);
        }
        if (!java.util.Arrays.equals(this.f4623d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f4623d);
        }
        long j3 = this.f4624e;
        if (j3 != 0) {
            codedOutputByteBufferNano.writeUInt64(5, j3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.Li b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.Li().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.Li mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f4620a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 16) {
                this.f4621b = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 24) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f4622c = readInt32;
                }
            } else if (readTag == 34) {
                this.f4623d = codedInputByteBufferNano.readBytes();
            } else if (readTag != 40) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f4624e = codedInputByteBufferNano.readUInt64();
            }
        }
    }

    public static io.appmetrica.analytics.impl.Li a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.Li) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.Li(), bArr);
    }
}
