package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class R5 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.R5[] f4892d;

    /* renamed from: a, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0220a6 f4893a;

    /* renamed from: b, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0220a6[] f4894b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f4895c;

    public R5() {
        a();
    }

    public static io.appmetrica.analytics.impl.R5[] b() {
        if (f4892d == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f4892d == null) {
                        f4892d = new io.appmetrica.analytics.impl.R5[0];
                    }
                } finally {
                }
            }
        }
        return f4892d;
    }

    public final io.appmetrica.analytics.impl.R5 a() {
        this.f4893a = null;
        this.f4894b = io.appmetrica.analytics.impl.C0220a6.b();
        this.f4895c = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        io.appmetrica.analytics.impl.C0220a6 c0220a6 = this.f4893a;
        if (c0220a6 != null) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(1, c0220a6);
        }
        io.appmetrica.analytics.impl.C0220a6[] c0220a6Arr = this.f4894b;
        if (c0220a6Arr != null && c0220a6Arr.length > 0) {
            int i2 = 0;
            while (true) {
                io.appmetrica.analytics.impl.C0220a6[] c0220a6Arr2 = this.f4894b;
                if (i2 >= c0220a6Arr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.C0220a6 c0220a62 = c0220a6Arr2[i2];
                if (c0220a62 != null) {
                    computeSerializedSize = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(2, c0220a62) + computeSerializedSize;
                }
                i2++;
            }
        }
        return !this.f4895c.equals("") ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(3, this.f4895c) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        io.appmetrica.analytics.impl.C0220a6 c0220a6 = this.f4893a;
        if (c0220a6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0220a6);
        }
        io.appmetrica.analytics.impl.C0220a6[] c0220a6Arr = this.f4894b;
        if (c0220a6Arr != null && c0220a6Arr.length > 0) {
            int i2 = 0;
            while (true) {
                io.appmetrica.analytics.impl.C0220a6[] c0220a6Arr2 = this.f4894b;
                if (i2 >= c0220a6Arr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.C0220a6 c0220a62 = c0220a6Arr2[i2];
                if (c0220a62 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c0220a62);
                }
                i2++;
            }
        }
        if (!this.f4895c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f4895c);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.R5 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f4893a == null) {
                    this.f4893a = new io.appmetrica.analytics.impl.C0220a6();
                }
                codedInputByteBufferNano.readMessage(this.f4893a);
            } else if (readTag == 18) {
                int repeatedFieldArrayLength = io.appmetrica.analytics.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                io.appmetrica.analytics.impl.C0220a6[] c0220a6Arr = this.f4894b;
                int length = c0220a6Arr == null ? 0 : c0220a6Arr.length;
                int i2 = repeatedFieldArrayLength + length;
                io.appmetrica.analytics.impl.C0220a6[] c0220a6Arr2 = new io.appmetrica.analytics.impl.C0220a6[i2];
                if (length != 0) {
                    java.lang.System.arraycopy(c0220a6Arr, 0, c0220a6Arr2, 0, length);
                }
                while (length < i2 - 1) {
                    io.appmetrica.analytics.impl.C0220a6 c0220a6 = new io.appmetrica.analytics.impl.C0220a6();
                    c0220a6Arr2[length] = c0220a6;
                    codedInputByteBufferNano.readMessage(c0220a6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                io.appmetrica.analytics.impl.C0220a6 c0220a62 = new io.appmetrica.analytics.impl.C0220a6();
                c0220a6Arr2[length] = c0220a62;
                codedInputByteBufferNano.readMessage(c0220a62);
                this.f4894b = c0220a6Arr2;
            } else if (readTag != 26) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f4895c = codedInputByteBufferNano.readString();
            }
        }
    }

    public static io.appmetrica.analytics.impl.R5 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.R5().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.R5 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.R5) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.R5(), bArr);
    }
}
