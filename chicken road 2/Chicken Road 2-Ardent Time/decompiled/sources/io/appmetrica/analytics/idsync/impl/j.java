package io.appmetrica.analytics.idsync.impl;

/* loaded from: classes.dex */
public final class j extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.idsync.impl.j[] f3933b;

    /* renamed from: a, reason: collision with root package name */
    public int f3934a;

    public j() {
        a();
    }

    public static io.appmetrica.analytics.idsync.impl.j[] b() {
        if (f3933b == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f3933b == null) {
                        f3933b = new io.appmetrica.analytics.idsync.impl.j[0];
                    }
                } finally {
                }
            }
        }
        return f3933b;
    }

    public final io.appmetrica.analytics.idsync.impl.j a() {
        this.f3934a = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f3934a;
        return i2 != 0 ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(1, i2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i2 = this.f3934a;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.idsync.impl.j mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
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
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1) {
                    this.f3934a = readInt32;
                }
            }
        }
    }

    public static io.appmetrica.analytics.idsync.impl.j a(byte[] bArr) {
        return (io.appmetrica.analytics.idsync.impl.j) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.idsync.impl.j(), bArr);
    }

    public static io.appmetrica.analytics.idsync.impl.j b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.idsync.impl.j().mergeFrom(codedInputByteBufferNano);
    }
}
