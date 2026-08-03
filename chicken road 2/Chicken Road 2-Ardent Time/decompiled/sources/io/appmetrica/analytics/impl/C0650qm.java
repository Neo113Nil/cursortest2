package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.qm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0650qm extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0650qm[] f6699b;

    /* renamed from: a, reason: collision with root package name */
    public long f6700a;

    public C0650qm() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0650qm[] b() {
        if (f6699b == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6699b == null) {
                        f6699b = new io.appmetrica.analytics.impl.C0650qm[0];
                    }
                } finally {
                }
            }
        }
        return f6699b;
    }

    public final io.appmetrica.analytics.impl.C0650qm a() {
        this.f6700a = 864000000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j2 = this.f6700a;
        return j2 != 864000000 ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt64Size(1, j2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        long j2 = this.f6700a;
        if (j2 != 864000000) {
            codedOutputByteBufferNano.writeInt64(1, j2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0650qm mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
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
                this.f6700a = codedInputByteBufferNano.readInt64();
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0650qm a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0650qm) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0650qm(), bArr);
    }

    public static io.appmetrica.analytics.impl.C0650qm b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0650qm().mergeFrom(codedInputByteBufferNano);
    }
}
