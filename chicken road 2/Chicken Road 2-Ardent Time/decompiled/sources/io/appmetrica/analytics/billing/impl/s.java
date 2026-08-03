package io.appmetrica.analytics.billing.impl;

/* loaded from: classes.dex */
public final class s extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.billing.impl.s[] f3480c;

    /* renamed from: a, reason: collision with root package name */
    public int f3481a;

    /* renamed from: b, reason: collision with root package name */
    public int f3482b;

    public s() {
        a();
    }

    public static io.appmetrica.analytics.billing.impl.s[] b() {
        if (f3480c == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f3480c == null) {
                        f3480c = new io.appmetrica.analytics.billing.impl.s[0];
                    }
                } finally {
                }
            }
        }
        return f3480c;
    }

    public final io.appmetrica.analytics.billing.impl.s a() {
        this.f3481a = 86400;
        this.f3482b = 86400;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f3481a;
        if (i2 != 86400) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(1, i2);
        }
        int i3 = this.f3482b;
        return i3 != 86400 ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(2, i3) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i2 = this.f3481a;
        if (i2 != 86400) {
            codedOutputByteBufferNano.writeInt32(1, i2);
        }
        int i3 = this.f3482b;
        if (i3 != 86400) {
            codedOutputByteBufferNano.writeInt32(2, i3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.billing.impl.s mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f3481a = codedInputByteBufferNano.readInt32();
            } else if (readTag != 16) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f3482b = codedInputByteBufferNano.readInt32();
            }
        }
    }

    public static io.appmetrica.analytics.billing.impl.s b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.billing.impl.s().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.billing.impl.s a(byte[] bArr) {
        return (io.appmetrica.analytics.billing.impl.s) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.billing.impl.s(), bArr);
    }
}
