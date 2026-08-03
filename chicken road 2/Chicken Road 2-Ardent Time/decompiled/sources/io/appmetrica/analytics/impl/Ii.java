package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Ii extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.Ii[] f4458e;

    /* renamed from: a, reason: collision with root package name */
    public long f4459a;

    /* renamed from: b, reason: collision with root package name */
    public io.appmetrica.analytics.impl.Ji f4460b;

    /* renamed from: c, reason: collision with root package name */
    public int f4461c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f4462d;

    public Ii() {
        a();
    }

    public static io.appmetrica.analytics.impl.Ii[] b() {
        if (f4458e == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f4458e == null) {
                        f4458e = new io.appmetrica.analytics.impl.Ii[0];
                    }
                } finally {
                }
            }
        }
        return f4458e;
    }

    public final io.appmetrica.analytics.impl.Ii a() {
        this.f4459a = 0L;
        this.f4460b = null;
        this.f4461c = 0;
        this.f4462d = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j2 = this.f4459a;
        if (j2 != 0) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt64Size(1, j2);
        }
        io.appmetrica.analytics.impl.Ji ji = this.f4460b;
        if (ji != null) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(2, ji);
        }
        int i2 = this.f4461c;
        if (i2 != 0) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt32Size(3, i2);
        }
        return !java.util.Arrays.equals(this.f4462d, io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(4, this.f4462d) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        long j2 = this.f4459a;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeInt64(1, j2);
        }
        io.appmetrica.analytics.impl.Ji ji = this.f4460b;
        if (ji != null) {
            codedOutputByteBufferNano.writeMessage(2, ji);
        }
        int i2 = this.f4461c;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(3, i2);
        }
        if (!java.util.Arrays.equals(this.f4462d, io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(4, this.f4462d);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.Ii mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f4459a = codedInputByteBufferNano.readInt64();
            } else if (readTag == 18) {
                if (this.f4460b == null) {
                    this.f4460b = new io.appmetrica.analytics.impl.Ji();
                }
                codedInputByteBufferNano.readMessage(this.f4460b);
            } else if (readTag == 24) {
                this.f4461c = codedInputByteBufferNano.readUInt32();
            } else if (readTag != 34) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f4462d = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static io.appmetrica.analytics.impl.Ii b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.Ii().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.Ii a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.Ii) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.Ii(), bArr);
    }
}
