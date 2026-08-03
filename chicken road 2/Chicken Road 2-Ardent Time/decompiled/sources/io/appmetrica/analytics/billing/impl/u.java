package io.appmetrica.analytics.billing.impl;

/* loaded from: classes.dex */
public final class u extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.billing.impl.u[] f3486c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f3487a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f3488b;

    public u() {
        a();
    }

    public static io.appmetrica.analytics.billing.impl.u[] b() {
        if (f3486c == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f3486c == null) {
                        f3486c = new io.appmetrica.analytics.billing.impl.u[0];
                    }
                } finally {
                }
            }
        }
        return f3486c;
    }

    public final io.appmetrica.analytics.billing.impl.u a() {
        byte[] bArr = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        this.f3487a = bArr;
        this.f3488b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f3487a;
        byte[] bArr2 = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        if (!java.util.Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(1, this.f3487a);
        }
        return !java.util.Arrays.equals(this.f3488b, bArr2) ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(2, this.f3488b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f3487a;
        byte[] bArr2 = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        if (!java.util.Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f3487a);
        }
        if (!java.util.Arrays.equals(this.f3488b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f3488b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.billing.impl.u mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f3487a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f3488b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static io.appmetrica.analytics.billing.impl.u b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.billing.impl.u().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.billing.impl.u a(byte[] bArr) {
        return (io.appmetrica.analytics.billing.impl.u) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.billing.impl.u(), bArr);
    }
}
