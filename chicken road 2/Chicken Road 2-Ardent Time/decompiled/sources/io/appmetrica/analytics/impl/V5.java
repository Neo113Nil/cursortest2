package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class V5 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: k, reason: collision with root package name */
    public static final int f5118k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static final int f5119l = 1;

    /* renamed from: m, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.V5[] f5120m;

    /* renamed from: n, reason: collision with root package name */
    public static byte[] f5121n;

    /* renamed from: o, reason: collision with root package name */
    public static volatile boolean f5122o;

    /* renamed from: a, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0246b6 f5123a;

    /* renamed from: b, reason: collision with root package name */
    public io.appmetrica.analytics.impl.R5 f5124b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f5125c;

    /* renamed from: d, reason: collision with root package name */
    public int f5126d;

    /* renamed from: e, reason: collision with root package name */
    public io.appmetrica.analytics.impl.Z5[] f5127e;

    /* renamed from: f, reason: collision with root package name */
    public int f5128f;

    /* renamed from: g, reason: collision with root package name */
    public io.appmetrica.analytics.impl.U5 f5129g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f5130h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f5131i;

    /* renamed from: j, reason: collision with root package name */
    public io.appmetrica.analytics.impl.T5[] f5132j;

    public V5() {
        if (!f5122o) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!f5122o) {
                        f5121n = io.appmetrica.analytics.protobuf.nano.InternalNano.bytesDefaultValue("JVM");
                        f5122o = true;
                    }
                } finally {
                }
            }
        }
        a();
    }

    public static io.appmetrica.analytics.impl.V5[] b() {
        if (f5120m == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5120m == null) {
                        f5120m = new io.appmetrica.analytics.impl.V5[0];
                    }
                } finally {
                }
            }
        }
        return f5120m;
    }

    public final io.appmetrica.analytics.impl.V5 a() {
        this.f5123a = null;
        this.f5124b = null;
        this.f5125c = "";
        this.f5126d = -1;
        this.f5127e = io.appmetrica.analytics.impl.Z5.b();
        this.f5128f = 0;
        this.f5129g = null;
        this.f5130h = (byte[]) f5121n.clone();
        this.f5131i = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        this.f5132j = io.appmetrica.analytics.impl.T5.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        io.appmetrica.analytics.impl.C0246b6 c0246b6 = this.f5123a;
        if (c0246b6 != null) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(1, c0246b6);
        }
        io.appmetrica.analytics.impl.R5 r5 = this.f5124b;
        if (r5 != null) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(2, r5);
        }
        if (!this.f5125c.equals("")) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(3, this.f5125c);
        }
        int i2 = this.f5126d;
        if (i2 != -1) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(4, i2);
        }
        io.appmetrica.analytics.impl.Z5[] z5Arr = this.f5127e;
        int i3 = 0;
        if (z5Arr != null && z5Arr.length > 0) {
            int i4 = 0;
            while (true) {
                io.appmetrica.analytics.impl.Z5[] z5Arr2 = this.f5127e;
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
        int i5 = this.f5128f;
        if (i5 != 0) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(6, i5);
        }
        io.appmetrica.analytics.impl.U5 u5 = this.f5129g;
        if (u5 != null) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(7, u5);
        }
        if (!java.util.Arrays.equals(this.f5130h, f5121n)) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(8, this.f5130h);
        }
        if (!java.util.Arrays.equals(this.f5131i, io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(9, this.f5131i);
        }
        io.appmetrica.analytics.impl.T5[] t5Arr = this.f5132j;
        if (t5Arr != null && t5Arr.length > 0) {
            while (true) {
                io.appmetrica.analytics.impl.T5[] t5Arr2 = this.f5132j;
                if (i3 >= t5Arr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.T5 t5 = t5Arr2[i3];
                if (t5 != null) {
                    computeSerializedSize = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(10, t5) + computeSerializedSize;
                }
                i3++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        io.appmetrica.analytics.impl.C0246b6 c0246b6 = this.f5123a;
        if (c0246b6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0246b6);
        }
        io.appmetrica.analytics.impl.R5 r5 = this.f5124b;
        if (r5 != null) {
            codedOutputByteBufferNano.writeMessage(2, r5);
        }
        if (!this.f5125c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f5125c);
        }
        int i2 = this.f5126d;
        if (i2 != -1) {
            codedOutputByteBufferNano.writeInt32(4, i2);
        }
        io.appmetrica.analytics.impl.Z5[] z5Arr = this.f5127e;
        int i3 = 0;
        if (z5Arr != null && z5Arr.length > 0) {
            int i4 = 0;
            while (true) {
                io.appmetrica.analytics.impl.Z5[] z5Arr2 = this.f5127e;
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
        int i5 = this.f5128f;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeInt32(6, i5);
        }
        io.appmetrica.analytics.impl.U5 u5 = this.f5129g;
        if (u5 != null) {
            codedOutputByteBufferNano.writeMessage(7, u5);
        }
        if (!java.util.Arrays.equals(this.f5130h, f5121n)) {
            codedOutputByteBufferNano.writeBytes(8, this.f5130h);
        }
        if (!java.util.Arrays.equals(this.f5131i, io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(9, this.f5131i);
        }
        io.appmetrica.analytics.impl.T5[] t5Arr = this.f5132j;
        if (t5Arr != null && t5Arr.length > 0) {
            while (true) {
                io.appmetrica.analytics.impl.T5[] t5Arr2 = this.f5132j;
                if (i3 >= t5Arr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.T5 t5 = t5Arr2[i3];
                if (t5 != null) {
                    codedOutputByteBufferNano.writeMessage(10, t5);
                }
                i3++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.V5 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.V5().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.V5 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 10:
                    if (this.f5123a == null) {
                        this.f5123a = new io.appmetrica.analytics.impl.C0246b6();
                    }
                    codedInputByteBufferNano.readMessage(this.f5123a);
                    break;
                case 18:
                    if (this.f5124b == null) {
                        this.f5124b = new io.appmetrica.analytics.impl.R5();
                    }
                    codedInputByteBufferNano.readMessage(this.f5124b);
                    break;
                case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                    this.f5125c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != -1 && readInt32 != 0 && readInt32 != 1) {
                        break;
                    } else {
                        this.f5126d = readInt32;
                        break;
                    }
                case io.appmetrica.analytics.impl.C0326e9.f5800M /* 42 */:
                    int repeatedFieldArrayLength = io.appmetrica.analytics.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    io.appmetrica.analytics.impl.Z5[] z5Arr = this.f5127e;
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
                    this.f5127e = z5Arr2;
                    break;
                case 48:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != 0 && readInt322 != 1) {
                        break;
                    } else {
                        this.f5128f = readInt322;
                        break;
                    }
                case 58:
                    if (this.f5129g == null) {
                        this.f5129g = new io.appmetrica.analytics.impl.U5();
                    }
                    codedInputByteBufferNano.readMessage(this.f5129g);
                    break;
                case 66:
                    this.f5130h = codedInputByteBufferNano.readBytes();
                    break;
                case 74:
                    this.f5131i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    int repeatedFieldArrayLength2 = io.appmetrica.analytics.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                    io.appmetrica.analytics.impl.T5[] t5Arr = this.f5132j;
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
                    this.f5132j = t5Arr2;
                    break;
                default:
                    if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        return this;
                    }
                    break;
            }
        }
    }

    public static io.appmetrica.analytics.impl.V5 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.V5) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.V5(), bArr);
    }
}
