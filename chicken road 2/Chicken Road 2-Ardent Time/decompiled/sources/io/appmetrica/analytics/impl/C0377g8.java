package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.g8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0377g8 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0377g8[] f5964c;

    /* renamed from: a, reason: collision with root package name */
    public long f5965a;

    /* renamed from: b, reason: collision with root package name */
    public int f5966b;

    public C0377g8() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0377g8[] b() {
        if (f5964c == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5964c == null) {
                        f5964c = new io.appmetrica.analytics.impl.C0377g8[0];
                    }
                } finally {
                }
            }
        }
        return f5964c;
    }

    public final io.appmetrica.analytics.impl.C0377g8 a() {
        this.f5965a = 0L;
        this.f5966b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j2 = this.f5965a;
        if (j2 != 0) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt64Size(1, j2);
        }
        int i2 = this.f5966b;
        return i2 != 0 ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(2, i2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        long j2 = this.f5965a;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeInt64(1, j2);
        }
        int i2 = this.f5966b;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0377g8 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f5965a = codedInputByteBufferNano.readInt64();
            } else if (readTag != 16) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f5966b = codedInputByteBufferNano.readInt32();
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0377g8 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0377g8().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0377g8 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0377g8) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0377g8(), bArr);
    }
}
