package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Lk extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.Lk[] f4625c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f4626a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f4627b;

    public Lk() {
        a();
    }

    public static io.appmetrica.analytics.impl.Lk[] b() {
        if (f4625c == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f4625c == null) {
                        f4625c = new io.appmetrica.analytics.impl.Lk[0];
                    }
                } finally {
                }
            }
        }
        return f4625c;
    }

    public final io.appmetrica.analytics.impl.Lk a() {
        byte[] bArr = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        this.f4626a = bArr;
        this.f4627b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f4626a;
        byte[] bArr2 = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        if (!java.util.Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(1, this.f4626a);
        }
        return !java.util.Arrays.equals(this.f4627b, bArr2) ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(2, this.f4627b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f4626a;
        byte[] bArr2 = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        if (!java.util.Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f4626a);
        }
        if (!java.util.Arrays.equals(this.f4627b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f4627b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.Lk mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f4626a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f4627b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static io.appmetrica.analytics.impl.Lk b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.Lk().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.Lk a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.Lk) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.Lk(), bArr);
    }
}
