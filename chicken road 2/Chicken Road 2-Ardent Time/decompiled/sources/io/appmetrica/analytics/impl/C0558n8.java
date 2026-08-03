package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.n8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0558n8 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: h, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0558n8[] f6474h;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f6475a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f6476b;

    /* renamed from: c, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0351f8 f6477c;

    /* renamed from: d, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0506l8 f6478d;

    /* renamed from: e, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0532m8 f6479e;

    /* renamed from: f, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0532m8 f6480f;

    /* renamed from: g, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0584o8[] f6481g;

    public C0558n8() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0558n8[] b() {
        if (f6474h == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6474h == null) {
                        f6474h = new io.appmetrica.analytics.impl.C0558n8[0];
                    }
                } finally {
                }
            }
        }
        return f6474h;
    }

    public final io.appmetrica.analytics.impl.C0558n8 a() {
        byte[] bArr = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        this.f6475a = bArr;
        this.f6476b = bArr;
        this.f6477c = null;
        this.f6478d = null;
        this.f6479e = null;
        this.f6480f = null;
        this.f6481g = io.appmetrica.analytics.impl.C0584o8.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f6475a;
        byte[] bArr2 = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        if (!java.util.Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(1, this.f6475a);
        }
        if (!java.util.Arrays.equals(this.f6476b, bArr2)) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(2, this.f6476b);
        }
        io.appmetrica.analytics.impl.C0351f8 c0351f8 = this.f6477c;
        if (c0351f8 != null) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(3, c0351f8);
        }
        io.appmetrica.analytics.impl.C0506l8 c0506l8 = this.f6478d;
        if (c0506l8 != null) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(4, c0506l8);
        }
        io.appmetrica.analytics.impl.C0532m8 c0532m8 = this.f6479e;
        if (c0532m8 != null) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(5, c0532m8);
        }
        io.appmetrica.analytics.impl.C0532m8 c0532m82 = this.f6480f;
        if (c0532m82 != null) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(6, c0532m82);
        }
        io.appmetrica.analytics.impl.C0584o8[] c0584o8Arr = this.f6481g;
        if (c0584o8Arr != null && c0584o8Arr.length > 0) {
            int i2 = 0;
            while (true) {
                io.appmetrica.analytics.impl.C0584o8[] c0584o8Arr2 = this.f6481g;
                if (i2 >= c0584o8Arr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.C0584o8 c0584o8 = c0584o8Arr2[i2];
                if (c0584o8 != null) {
                    computeSerializedSize = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(7, c0584o8) + computeSerializedSize;
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f6475a;
        byte[] bArr2 = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        if (!java.util.Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f6475a);
        }
        if (!java.util.Arrays.equals(this.f6476b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f6476b);
        }
        io.appmetrica.analytics.impl.C0351f8 c0351f8 = this.f6477c;
        if (c0351f8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c0351f8);
        }
        io.appmetrica.analytics.impl.C0506l8 c0506l8 = this.f6478d;
        if (c0506l8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0506l8);
        }
        io.appmetrica.analytics.impl.C0532m8 c0532m8 = this.f6479e;
        if (c0532m8 != null) {
            codedOutputByteBufferNano.writeMessage(5, c0532m8);
        }
        io.appmetrica.analytics.impl.C0532m8 c0532m82 = this.f6480f;
        if (c0532m82 != null) {
            codedOutputByteBufferNano.writeMessage(6, c0532m82);
        }
        io.appmetrica.analytics.impl.C0584o8[] c0584o8Arr = this.f6481g;
        if (c0584o8Arr != null && c0584o8Arr.length > 0) {
            int i2 = 0;
            while (true) {
                io.appmetrica.analytics.impl.C0584o8[] c0584o8Arr2 = this.f6481g;
                if (i2 >= c0584o8Arr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.C0584o8 c0584o8 = c0584o8Arr2[i2];
                if (c0584o8 != null) {
                    codedOutputByteBufferNano.writeMessage(7, c0584o8);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0558n8 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0558n8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0558n8 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f6475a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                this.f6476b = codedInputByteBufferNano.readBytes();
            } else if (readTag == 26) {
                if (this.f6477c == null) {
                    this.f6477c = new io.appmetrica.analytics.impl.C0351f8();
                }
                codedInputByteBufferNano.readMessage(this.f6477c);
            } else if (readTag == 34) {
                if (this.f6478d == null) {
                    this.f6478d = new io.appmetrica.analytics.impl.C0506l8();
                }
                codedInputByteBufferNano.readMessage(this.f6478d);
            } else if (readTag == 42) {
                if (this.f6479e == null) {
                    this.f6479e = new io.appmetrica.analytics.impl.C0532m8();
                }
                codedInputByteBufferNano.readMessage(this.f6479e);
            } else if (readTag == 50) {
                if (this.f6480f == null) {
                    this.f6480f = new io.appmetrica.analytics.impl.C0532m8();
                }
                codedInputByteBufferNano.readMessage(this.f6480f);
            } else if (readTag != 58) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = io.appmetrica.analytics.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                io.appmetrica.analytics.impl.C0584o8[] c0584o8Arr = this.f6481g;
                int length = c0584o8Arr == null ? 0 : c0584o8Arr.length;
                int i2 = repeatedFieldArrayLength + length;
                io.appmetrica.analytics.impl.C0584o8[] c0584o8Arr2 = new io.appmetrica.analytics.impl.C0584o8[i2];
                if (length != 0) {
                    java.lang.System.arraycopy(c0584o8Arr, 0, c0584o8Arr2, 0, length);
                }
                while (length < i2 - 1) {
                    io.appmetrica.analytics.impl.C0584o8 c0584o8 = new io.appmetrica.analytics.impl.C0584o8();
                    c0584o8Arr2[length] = c0584o8;
                    codedInputByteBufferNano.readMessage(c0584o8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                io.appmetrica.analytics.impl.C0584o8 c0584o82 = new io.appmetrica.analytics.impl.C0584o8();
                c0584o8Arr2[length] = c0584o82;
                codedInputByteBufferNano.readMessage(c0584o82);
                this.f6481g = c0584o8Arr2;
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0558n8 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0558n8) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0558n8(), bArr);
    }
}
