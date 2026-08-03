package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Y5 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.Y5[] f5324c;

    /* renamed from: a, reason: collision with root package name */
    public int f5325a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f5326b;

    public Y5() {
        a();
    }

    public static io.appmetrica.analytics.impl.Y5[] b() {
        if (f5324c == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5324c == null) {
                        f5324c = new io.appmetrica.analytics.impl.Y5[0];
                    }
                } finally {
                }
            }
        }
        return f5324c;
    }

    public final io.appmetrica.analytics.impl.Y5 a() {
        this.f5325a = 0;
        this.f5326b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f5325a;
        if (i2 != 0) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(1, i2);
        }
        return !this.f5326b.equals("") ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(2, this.f5326b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i2 = this.f5325a;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i2);
        }
        if (!this.f5326b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f5326b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.Y5 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 3) {
                    this.f5325a = readInt32;
                }
            } else if (readTag != 18) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f5326b = codedInputByteBufferNano.readString();
            }
        }
    }

    public static io.appmetrica.analytics.impl.Y5 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.Y5().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.Y5 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.Y5) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.Y5(), bArr);
    }
}
