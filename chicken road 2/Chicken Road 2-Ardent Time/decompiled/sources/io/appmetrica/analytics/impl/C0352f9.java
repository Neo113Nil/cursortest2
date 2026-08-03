package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.f9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0352f9 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static final int f5877d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f5878e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f5879f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0352f9[] f5880g;

    /* renamed from: a, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0430i9 f5881a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f5882b;

    /* renamed from: c, reason: collision with root package name */
    public int f5883c;

    public C0352f9() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0352f9[] b() {
        if (f5880g == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5880g == null) {
                        f5880g = new io.appmetrica.analytics.impl.C0352f9[0];
                    }
                } finally {
                }
            }
        }
        return f5880g;
    }

    public final io.appmetrica.analytics.impl.C0352f9 a() {
        this.f5881a = null;
        this.f5882b = "";
        this.f5883c = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        io.appmetrica.analytics.impl.C0430i9 c0430i9 = this.f5881a;
        if (c0430i9 != null) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(1, c0430i9);
        }
        int computeStringSize = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(2, this.f5882b) + computeSerializedSize;
        int i2 = this.f5883c;
        return i2 != 0 ? computeStringSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(5, i2) : computeStringSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        io.appmetrica.analytics.impl.C0430i9 c0430i9 = this.f5881a;
        if (c0430i9 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0430i9);
        }
        codedOutputByteBufferNano.writeString(2, this.f5882b);
        int i2 = this.f5883c;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(5, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0352f9 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f5881a == null) {
                    this.f5881a = new io.appmetrica.analytics.impl.C0430i9();
                }
                codedInputByteBufferNano.readMessage(this.f5881a);
            } else if (readTag == 18) {
                this.f5882b = codedInputByteBufferNano.readString();
            } else if (readTag != 40) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f5883c = readInt32;
                }
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0352f9 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0352f9().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0352f9 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0352f9) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0352f9(), bArr);
    }
}
