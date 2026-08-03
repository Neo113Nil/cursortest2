package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class X5 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: l, reason: collision with root package name */
    public static final int f5276l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f5277m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.X5[] f5278n;

    /* renamed from: o, reason: collision with root package name */
    public static byte[] f5279o;

    /* renamed from: p, reason: collision with root package name */
    public static volatile boolean f5280p;

    /* renamed from: a, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0246b6 f5281a;

    /* renamed from: b, reason: collision with root package name */
    public io.appmetrica.analytics.impl.R5 f5282b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f5283c;

    /* renamed from: d, reason: collision with root package name */
    public int f5284d;

    /* renamed from: e, reason: collision with root package name */
    public io.appmetrica.analytics.impl.Z5[] f5285e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f5286f;

    /* renamed from: g, reason: collision with root package name */
    public int f5287g;

    /* renamed from: h, reason: collision with root package name */
    public io.appmetrica.analytics.impl.W5 f5288h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f5289i;

    /* renamed from: j, reason: collision with root package name */
    public byte[] f5290j;

    /* renamed from: k, reason: collision with root package name */
    public io.appmetrica.analytics.impl.T5[] f5291k;

    public X5() {
        if (!f5280p) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!f5280p) {
                        f5279o = io.appmetrica.analytics.protobuf.nano.InternalNano.bytesDefaultValue("JVM");
                        f5280p = true;
                    }
                } finally {
                }
            }
        }
        a();
    }

    public static io.appmetrica.analytics.impl.X5[] b() {
        if (f5278n == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5278n == null) {
                        f5278n = new io.appmetrica.analytics.impl.X5[0];
                    }
                } finally {
                }
            }
        }
        return f5278n;
    }

    public final io.appmetrica.analytics.impl.X5 a() {
        this.f5281a = null;
        this.f5282b = null;
        this.f5283c = "";
        this.f5284d = -1;
        this.f5285e = io.appmetrica.analytics.impl.Z5.b();
        this.f5286f = "";
        this.f5287g = 0;
        this.f5288h = null;
        this.f5289i = (byte[]) f5279o.clone();
        this.f5290j = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        this.f5291k = io.appmetrica.analytics.impl.T5.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        io.appmetrica.analytics.impl.C0246b6 c0246b6 = this.f5281a;
        if (c0246b6 != null) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(1, c0246b6);
        }
        io.appmetrica.analytics.impl.R5 r5 = this.f5282b;
        if (r5 != null) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(2, r5);
        }
        if (!this.f5283c.equals("")) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(3, this.f5283c);
        }
        int i2 = this.f5284d;
        if (i2 != -1) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(4, i2);
        }
        io.appmetrica.analytics.impl.Z5[] z5Arr = this.f5285e;
        int i3 = 0;
        if (z5Arr != null && z5Arr.length > 0) {
            int i4 = 0;
            while (true) {
                io.appmetrica.analytics.impl.Z5[] z5Arr2 = this.f5285e;
                if (i4 >= z5Arr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.Z5 z5 = z5Arr2[i4];
                if (z5 != null) {
                    computeSerializedSize = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(5, z5) + computeSerializedSize;
                }
                i4++;
            }
        }
        if (!this.f5286f.equals("")) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(6, this.f5286f);
        }
        int i5 = this.f5287g;
        if (i5 != 0) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(7, i5);
        }
        io.appmetrica.analytics.impl.W5 w5 = this.f5288h;
        if (w5 != null) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(8, w5);
        }
        if (!java.util.Arrays.equals(this.f5289i, f5279o)) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(9, this.f5289i);
        }
        if (!java.util.Arrays.equals(this.f5290j, io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(10, this.f5290j);
        }
        io.appmetrica.analytics.impl.T5[] t5Arr = this.f5291k;
        if (t5Arr != null && t5Arr.length > 0) {
            while (true) {
                io.appmetrica.analytics.impl.T5[] t5Arr2 = this.f5291k;
                if (i3 >= t5Arr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.T5 t5 = t5Arr2[i3];
                if (t5 != null) {
                    computeSerializedSize = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(11, t5) + computeSerializedSize;
                }
                i3++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        io.appmetrica.analytics.impl.C0246b6 c0246b6 = this.f5281a;
        if (c0246b6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0246b6);
        }
        io.appmetrica.analytics.impl.R5 r5 = this.f5282b;
        if (r5 != null) {
            codedOutputByteBufferNano.writeMessage(2, r5);
        }
        if (!this.f5283c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f5283c);
        }
        int i2 = this.f5284d;
        if (i2 != -1) {
            codedOutputByteBufferNano.writeInt32(4, i2);
        }
        io.appmetrica.analytics.impl.Z5[] z5Arr = this.f5285e;
        int i3 = 0;
        if (z5Arr != null && z5Arr.length > 0) {
            int i4 = 0;
            while (true) {
                io.appmetrica.analytics.impl.Z5[] z5Arr2 = this.f5285e;
                if (i4 >= z5Arr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.Z5 z5 = z5Arr2[i4];
                if (z5 != null) {
                    codedOutputByteBufferNano.writeMessage(5, z5);
                }
                i4++;
            }
        }
        if (!this.f5286f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f5286f);
        }
        int i5 = this.f5287g;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeInt32(7, i5);
        }
        io.appmetrica.analytics.impl.W5 w5 = this.f5288h;
        if (w5 != null) {
            codedOutputByteBufferNano.writeMessage(8, w5);
        }
        if (!java.util.Arrays.equals(this.f5289i, f5279o)) {
            codedOutputByteBufferNano.writeBytes(9, this.f5289i);
        }
        if (!java.util.Arrays.equals(this.f5290j, io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(10, this.f5290j);
        }
        io.appmetrica.analytics.impl.T5[] t5Arr = this.f5291k;
        if (t5Arr != null && t5Arr.length > 0) {
            while (true) {
                io.appmetrica.analytics.impl.T5[] t5Arr2 = this.f5291k;
                if (i3 >= t5Arr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.T5 t5 = t5Arr2[i3];
                if (t5 != null) {
                    codedOutputByteBufferNano.writeMessage(11, t5);
                }
                i3++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.X5 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.X5().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.X5 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 10:
                    if (this.f5281a == null) {
                        this.f5281a = new io.appmetrica.analytics.impl.C0246b6();
                    }
                    codedInputByteBufferNano.readMessage(this.f5281a);
                    break;
                case 18:
                    if (this.f5282b == null) {
                        this.f5282b = new io.appmetrica.analytics.impl.R5();
                    }
                    codedInputByteBufferNano.readMessage(this.f5282b);
                    break;
                case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                    this.f5283c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != -1 && readInt32 != 0 && readInt32 != 1) {
                        break;
                    } else {
                        this.f5284d = readInt32;
                        break;
                    }
                case io.appmetrica.analytics.impl.C0326e9.f5800M /* 42 */:
                    int repeatedFieldArrayLength = io.appmetrica.analytics.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    io.appmetrica.analytics.impl.Z5[] z5Arr = this.f5285e;
                    int length = z5Arr == null ? 0 : z5Arr.length;
                    int i2 = repeatedFieldArrayLength + length;
                    io.appmetrica.analytics.impl.Z5[] z5Arr2 = new io.appmetrica.analytics.impl.Z5[i2];
                    if (length != 0) {
                        java.lang.System.arraycopy(z5Arr, 0, z5Arr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        io.appmetrica.analytics.impl.Z5 z5 = new io.appmetrica.analytics.impl.Z5();
                        z5Arr2[length] = z5;
                        codedInputByteBufferNano.readMessage(z5);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    io.appmetrica.analytics.impl.Z5 z52 = new io.appmetrica.analytics.impl.Z5();
                    z5Arr2[length] = z52;
                    codedInputByteBufferNano.readMessage(z52);
                    this.f5285e = z5Arr2;
                    break;
                case 50:
                    this.f5286f = codedInputByteBufferNano.readString();
                    break;
                case 56:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != 0 && readInt322 != 1) {
                        break;
                    } else {
                        this.f5287g = readInt322;
                        break;
                    }
                case 66:
                    if (this.f5288h == null) {
                        this.f5288h = new io.appmetrica.analytics.impl.W5();
                    }
                    codedInputByteBufferNano.readMessage(this.f5288h);
                    break;
                case 74:
                    this.f5289i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    this.f5290j = codedInputByteBufferNano.readBytes();
                    break;
                case io.appmetrica.analytics.AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    int repeatedFieldArrayLength2 = io.appmetrica.analytics.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                    io.appmetrica.analytics.impl.T5[] t5Arr = this.f5291k;
                    int length2 = t5Arr == null ? 0 : t5Arr.length;
                    int i3 = repeatedFieldArrayLength2 + length2;
                    io.appmetrica.analytics.impl.T5[] t5Arr2 = new io.appmetrica.analytics.impl.T5[i3];
                    if (length2 != 0) {
                        java.lang.System.arraycopy(t5Arr, 0, t5Arr2, 0, length2);
                    }
                    while (length2 < i3 - 1) {
                        io.appmetrica.analytics.impl.T5 t5 = new io.appmetrica.analytics.impl.T5();
                        t5Arr2[length2] = t5;
                        codedInputByteBufferNano.readMessage(t5);
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    io.appmetrica.analytics.impl.T5 t52 = new io.appmetrica.analytics.impl.T5();
                    t5Arr2[length2] = t52;
                    codedInputByteBufferNano.readMessage(t52);
                    this.f5291k = t5Arr2;
                    break;
                default:
                    if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        return this;
                    }
                    break;
            }
        }
    }

    public static io.appmetrica.analytics.impl.X5 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.X5) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.X5(), bArr);
    }
}
