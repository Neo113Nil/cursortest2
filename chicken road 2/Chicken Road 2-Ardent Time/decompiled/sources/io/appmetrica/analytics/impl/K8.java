package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class K8 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.K8[] f4537c;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f4538a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f4539b;

    public K8() {
        a();
    }

    public static io.appmetrica.analytics.impl.K8[] b() {
        if (f4537c == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f4537c == null) {
                        f4537c = new io.appmetrica.analytics.impl.K8[0];
                    }
                } finally {
                }
            }
        }
        return f4537c;
    }

    public final io.appmetrica.analytics.impl.K8 a() {
        this.f4538a = "";
        this.f4539b = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f4538a.equals("")) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(1, this.f4538a);
        }
        return !java.util.Arrays.equals(this.f4539b, io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(2, this.f4539b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f4538a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f4538a);
        }
        if (!java.util.Arrays.equals(this.f4539b, io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f4539b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.K8 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f4538a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f4539b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static io.appmetrica.analytics.impl.K8 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.K8().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.K8 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.K8) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.K8(), bArr);
    }
}
