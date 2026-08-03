package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class S5 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.S5[] f4949d;

    /* renamed from: a, reason: collision with root package name */
    public io.appmetrica.analytics.impl.R5 f4950a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f4951b;

    /* renamed from: c, reason: collision with root package name */
    public int f4952c;

    public S5() {
        a();
    }

    public static io.appmetrica.analytics.impl.S5[] b() {
        if (f4949d == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f4949d == null) {
                        f4949d = new io.appmetrica.analytics.impl.S5[0];
                    }
                } finally {
                }
            }
        }
        return f4949d;
    }

    public final io.appmetrica.analytics.impl.S5 a() {
        this.f4950a = null;
        this.f4951b = "";
        this.f4952c = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        io.appmetrica.analytics.impl.R5 r5 = this.f4950a;
        if (r5 != null) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(1, r5);
        }
        if (!this.f4951b.equals("")) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(2, this.f4951b);
        }
        int i2 = this.f4952c;
        return i2 != -1 ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(3, i2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        io.appmetrica.analytics.impl.R5 r5 = this.f4950a;
        if (r5 != null) {
            codedOutputByteBufferNano.writeMessage(1, r5);
        }
        if (!this.f4951b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f4951b);
        }
        int i2 = this.f4952c;
        if (i2 != -1) {
            codedOutputByteBufferNano.writeInt32(3, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.S5 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f4950a == null) {
                    this.f4950a = new io.appmetrica.analytics.impl.R5();
                }
                codedInputByteBufferNano.readMessage(this.f4950a);
            } else if (readTag == 18) {
                this.f4951b = codedInputByteBufferNano.readString();
            } else if (readTag != 24) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == -1 || readInt32 == 0 || readInt32 == 1) {
                    this.f4952c = readInt32;
                }
            }
        }
    }

    public static io.appmetrica.analytics.impl.S5 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.S5().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.S5 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.S5) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.S5(), bArr);
    }
}
