package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.h8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0403h8 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0403h8[] f6036f;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f6037a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f6038b;

    /* renamed from: c, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0506l8 f6039c;

    /* renamed from: d, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0429i8[] f6040d;

    /* renamed from: e, reason: collision with root package name */
    public int f6041e;

    public C0403h8() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0403h8[] b() {
        if (f6036f == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6036f == null) {
                        f6036f = new io.appmetrica.analytics.impl.C0403h8[0];
                    }
                } finally {
                }
            }
        }
        return f6036f;
    }

    public final io.appmetrica.analytics.impl.C0403h8 a() {
        byte[] bArr = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        this.f6037a = bArr;
        this.f6038b = bArr;
        this.f6039c = null;
        this.f6040d = io.appmetrica.analytics.impl.C0429i8.b();
        this.f6041e = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f6037a;
        byte[] bArr2 = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        if (!java.util.Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(1, this.f6037a);
        }
        if (!java.util.Arrays.equals(this.f6038b, bArr2)) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(2, this.f6038b);
        }
        io.appmetrica.analytics.impl.C0506l8 c0506l8 = this.f6039c;
        if (c0506l8 != null) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(3, c0506l8);
        }
        io.appmetrica.analytics.impl.C0429i8[] c0429i8Arr = this.f6040d;
        if (c0429i8Arr != null && c0429i8Arr.length > 0) {
            int i2 = 0;
            while (true) {
                io.appmetrica.analytics.impl.C0429i8[] c0429i8Arr2 = this.f6040d;
                if (i2 >= c0429i8Arr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.C0429i8 c0429i8 = c0429i8Arr2[i2];
                if (c0429i8 != null) {
                    computeSerializedSize = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(4, c0429i8) + computeSerializedSize;
                }
                i2++;
            }
        }
        int i3 = this.f6041e;
        return i3 != 0 ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt32Size(5, i3) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f6037a;
        byte[] bArr2 = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        if (!java.util.Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f6037a);
        }
        if (!java.util.Arrays.equals(this.f6038b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f6038b);
        }
        io.appmetrica.analytics.impl.C0506l8 c0506l8 = this.f6039c;
        if (c0506l8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c0506l8);
        }
        io.appmetrica.analytics.impl.C0429i8[] c0429i8Arr = this.f6040d;
        if (c0429i8Arr != null && c0429i8Arr.length > 0) {
            int i2 = 0;
            while (true) {
                io.appmetrica.analytics.impl.C0429i8[] c0429i8Arr2 = this.f6040d;
                if (i2 >= c0429i8Arr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.C0429i8 c0429i8 = c0429i8Arr2[i2];
                if (c0429i8 != null) {
                    codedOutputByteBufferNano.writeMessage(4, c0429i8);
                }
                i2++;
            }
        }
        int i3 = this.f6041e;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0403h8 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0403h8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0403h8 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f6037a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                this.f6038b = codedInputByteBufferNano.readBytes();
            } else if (readTag == 26) {
                if (this.f6039c == null) {
                    this.f6039c = new io.appmetrica.analytics.impl.C0506l8();
                }
                codedInputByteBufferNano.readMessage(this.f6039c);
            } else if (readTag == 34) {
                int repeatedFieldArrayLength = io.appmetrica.analytics.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                io.appmetrica.analytics.impl.C0429i8[] c0429i8Arr = this.f6040d;
                int length = c0429i8Arr == null ? 0 : c0429i8Arr.length;
                int i2 = repeatedFieldArrayLength + length;
                io.appmetrica.analytics.impl.C0429i8[] c0429i8Arr2 = new io.appmetrica.analytics.impl.C0429i8[i2];
                if (length != 0) {
                    java.lang.System.arraycopy(c0429i8Arr, 0, c0429i8Arr2, 0, length);
                }
                while (length < i2 - 1) {
                    io.appmetrica.analytics.impl.C0429i8 c0429i8 = new io.appmetrica.analytics.impl.C0429i8();
                    c0429i8Arr2[length] = c0429i8;
                    codedInputByteBufferNano.readMessage(c0429i8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                io.appmetrica.analytics.impl.C0429i8 c0429i82 = new io.appmetrica.analytics.impl.C0429i8();
                c0429i8Arr2[length] = c0429i82;
                codedInputByteBufferNano.readMessage(c0429i82);
                this.f6040d = c0429i8Arr2;
            } else if (readTag != 40) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f6041e = codedInputByteBufferNano.readUInt32();
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0403h8 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0403h8) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0403h8(), bArr);
    }
}
