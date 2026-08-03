package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.um, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0753um extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0753um[] f6933b;

    /* renamed from: a, reason: collision with root package name */
    public int f6934a;

    public C0753um() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0753um[] b() {
        if (f6933b == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6933b == null) {
                        f6933b = new io.appmetrica.analytics.impl.C0753um[0];
                    }
                } finally {
                }
            }
        }
        return f6933b;
    }

    public final io.appmetrica.analytics.impl.C0753um a() {
        this.f6934a = 86400;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f6934a;
        return i2 != 86400 ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt32Size(1, i2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i2 = this.f6934a;
        if (i2 != 86400) {
            codedOutputByteBufferNano.writeUInt32(1, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0753um mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
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
                this.f6934a = codedInputByteBufferNano.readUInt32();
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0753um a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0753um) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0753um(), bArr);
    }

    public static io.appmetrica.analytics.impl.C0753um b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0753um().mergeFrom(codedInputByteBufferNano);
    }
}
