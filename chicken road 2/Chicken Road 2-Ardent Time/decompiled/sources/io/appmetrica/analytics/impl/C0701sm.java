package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.sm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0701sm extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0701sm[] f6824c;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f6825a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f6826b;

    public C0701sm() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0701sm[] b() {
        if (f6824c == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6824c == null) {
                        f6824c = new io.appmetrica.analytics.impl.C0701sm[0];
                    }
                } finally {
                }
            }
        }
        return f6824c;
    }

    public final io.appmetrica.analytics.impl.C0701sm a() {
        this.f6825a = "";
        this.f6826b = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f6825a.equals("")) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(1, this.f6825a);
        }
        return !java.util.Arrays.equals(this.f6826b, io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(2, this.f6826b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f6825a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f6825a);
        }
        if (!java.util.Arrays.equals(this.f6826b, io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f6826b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0701sm mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f6825a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f6826b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0701sm b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0701sm().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0701sm a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0701sm) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0701sm(), bArr);
    }
}
