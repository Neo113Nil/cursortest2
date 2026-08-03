package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.a9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0223a9 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0223a9[] f5470c;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f5471a;

    /* renamed from: b, reason: collision with root package name */
    public long f5472b;

    public C0223a9() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0223a9[] b() {
        if (f5470c == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5470c == null) {
                        f5470c = new io.appmetrica.analytics.impl.C0223a9[0];
                    }
                } finally {
                }
            }
        }
        return f5470c;
    }

    public final io.appmetrica.analytics.impl.C0223a9 a() {
        this.f5471a = "";
        this.f5472b = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt64Size(2, this.f5472b) + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(1, this.f5471a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeString(1, this.f5471a);
        codedOutputByteBufferNano.writeUInt64(2, this.f5472b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0223a9 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f5471a = codedInputByteBufferNano.readString();
            } else if (readTag != 16) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f5472b = codedInputByteBufferNano.readUInt64();
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0223a9 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0223a9().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0223a9 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0223a9) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0223a9(), bArr);
    }
}
