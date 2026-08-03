package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.o7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0583o7 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0583o7[] f6571d;

    /* renamed from: a, reason: collision with root package name */
    public long f6572a;

    /* renamed from: b, reason: collision with root package name */
    public long f6573b;

    /* renamed from: c, reason: collision with root package name */
    public int f6574c;

    public C0583o7() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0583o7[] b() {
        if (f6571d == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6571d == null) {
                        f6571d = new io.appmetrica.analytics.impl.C0583o7[0];
                    }
                } finally {
                }
            }
        }
        return f6571d;
    }

    public final io.appmetrica.analytics.impl.C0583o7 a() {
        this.f6572a = -1L;
        this.f6573b = -1L;
        this.f6574c = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j2 = this.f6572a;
        if (j2 != -1) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt64Size(1, j2);
        }
        long j3 = this.f6573b;
        if (j3 != -1) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt64Size(2, j3);
        }
        int i2 = this.f6574c;
        return i2 != -1 ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(3, i2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        long j2 = this.f6572a;
        if (j2 != -1) {
            codedOutputByteBufferNano.writeInt64(1, j2);
        }
        long j3 = this.f6573b;
        if (j3 != -1) {
            codedOutputByteBufferNano.writeInt64(2, j3);
        }
        int i2 = this.f6574c;
        if (i2 != -1) {
            codedOutputByteBufferNano.writeInt32(3, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0583o7 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f6572a = codedInputByteBufferNano.readInt64();
            } else if (readTag == 16) {
                this.f6573b = codedInputByteBufferNano.readInt64();
            } else if (readTag != 24) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == -1 || readInt32 == 0 || readInt32 == 1) {
                    this.f6574c = readInt32;
                }
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0583o7 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0583o7().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0583o7 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0583o7) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0583o7(), bArr);
    }
}
