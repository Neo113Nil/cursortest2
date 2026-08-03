package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.om, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0598om extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0598om[] f6603b;

    /* renamed from: a, reason: collision with root package name */
    public long f6604a;

    public C0598om() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0598om[] b() {
        if (f6603b == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6603b == null) {
                        f6603b = new io.appmetrica.analytics.impl.C0598om[0];
                    }
                } finally {
                }
            }
        }
        return f6603b;
    }

    public final io.appmetrica.analytics.impl.C0598om a() {
        this.f6604a = 10000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j2 = this.f6604a;
        return j2 != 10000 ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt64Size(1, j2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        long j2 = this.f6604a;
        if (j2 != 10000) {
            codedOutputByteBufferNano.writeInt64(1, j2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0598om mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 8) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f6604a = codedInputByteBufferNano.readInt64();
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0598om a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0598om) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0598om(), bArr);
    }

    public static io.appmetrica.analytics.impl.C0598om b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0598om().mergeFrom(codedInputByteBufferNano);
    }
}
