package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.c9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0275c9 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0275c9[] f5640c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f5641a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f5642b;

    public C0275c9() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0275c9[] b() {
        if (f5640c == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5640c == null) {
                        f5640c = new io.appmetrica.analytics.impl.C0275c9[0];
                    }
                } finally {
                }
            }
        }
        return f5640c;
    }

    public final io.appmetrica.analytics.impl.C0275c9 a() {
        byte[] bArr = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        this.f5641a = bArr;
        this.f5642b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f5641a;
        byte[] bArr2 = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        if (!java.util.Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(1, this.f5641a);
        }
        return !java.util.Arrays.equals(this.f5642b, bArr2) ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(2, this.f5642b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f5641a;
        byte[] bArr2 = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        if (!java.util.Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f5641a);
        }
        if (!java.util.Arrays.equals(this.f5642b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f5642b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0275c9 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f5641a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f5642b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0275c9 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0275c9().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0275c9 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0275c9) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0275c9(), bArr);
    }
}
