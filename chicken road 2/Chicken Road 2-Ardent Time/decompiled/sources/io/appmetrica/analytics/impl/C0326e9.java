package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.e9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0326e9 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: A, reason: collision with root package name */
    public static final int f5789A = 17;

    /* renamed from: B, reason: collision with root package name */
    public static final int f5790B = 18;

    /* renamed from: C, reason: collision with root package name */
    public static final int f5791C = 19;

    /* renamed from: D, reason: collision with root package name */
    public static final int f5792D = 20;

    /* renamed from: E, reason: collision with root package name */
    public static final int f5793E = 21;

    /* renamed from: F, reason: collision with root package name */
    public static final int f5794F = 25;
    public static final int G = 26;

    /* renamed from: H, reason: collision with root package name */
    public static final int f5795H = 27;

    /* renamed from: I, reason: collision with root package name */
    public static final int f5796I = 29;

    /* renamed from: J, reason: collision with root package name */
    public static final int f5797J = 35;

    /* renamed from: K, reason: collision with root package name */
    public static final int f5798K = 38;

    /* renamed from: L, reason: collision with root package name */
    public static final int f5799L = 40;

    /* renamed from: M, reason: collision with root package name */
    public static final int f5800M = 42;

    /* renamed from: N, reason: collision with root package name */
    public static final int f5801N = 0;

    /* renamed from: O, reason: collision with root package name */
    public static final int f5802O = 1;

    /* renamed from: P, reason: collision with root package name */
    public static final int f5803P = 2;

    /* renamed from: Q, reason: collision with root package name */
    public static final int f5804Q = 0;

    /* renamed from: R, reason: collision with root package name */
    public static final int f5805R = 1;

    /* renamed from: S, reason: collision with root package name */
    public static final int f5806S = 2;

    /* renamed from: T, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0326e9[] f5807T = null;
    public static final int t = 1;

    /* renamed from: u, reason: collision with root package name */
    public static final int f5808u = 2;

    /* renamed from: v, reason: collision with root package name */
    public static final int f5809v = 4;

    /* renamed from: w, reason: collision with root package name */
    public static final int f5810w = 5;

    /* renamed from: x, reason: collision with root package name */
    public static final int f5811x = 7;

    /* renamed from: y, reason: collision with root package name */
    public static final int f5812y = 13;

    /* renamed from: z, reason: collision with root package name */
    public static final int f5813z = 16;

    /* renamed from: a, reason: collision with root package name */
    public long f5814a;

    /* renamed from: b, reason: collision with root package name */
    public long f5815b;

    /* renamed from: c, reason: collision with root package name */
    public int f5816c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f5817d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f5818e;

    /* renamed from: f, reason: collision with root package name */
    public io.appmetrica.analytics.impl.Z8 f5819f;

    /* renamed from: g, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0301d9 f5820g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f5821h;

    /* renamed from: i, reason: collision with root package name */
    public int f5822i;

    /* renamed from: j, reason: collision with root package name */
    public int f5823j;

    /* renamed from: k, reason: collision with root package name */
    public int f5824k;

    /* renamed from: l, reason: collision with root package name */
    public byte[] f5825l;

    /* renamed from: m, reason: collision with root package name */
    public int f5826m;

    /* renamed from: n, reason: collision with root package name */
    public long f5827n;

    /* renamed from: o, reason: collision with root package name */
    public long f5828o;

    /* renamed from: p, reason: collision with root package name */
    public int f5829p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f5830q;

    /* renamed from: r, reason: collision with root package name */
    public long f5831r;

    /* renamed from: s, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0275c9[] f5832s;

    public C0326e9() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0326e9[] b() {
        if (f5807T == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5807T == null) {
                        f5807T = new io.appmetrica.analytics.impl.C0326e9[0];
                    }
                } finally {
                }
            }
        }
        return f5807T;
    }

    public final io.appmetrica.analytics.impl.C0326e9 a() {
        this.f5814a = 0L;
        this.f5815b = 0L;
        this.f5816c = 0;
        this.f5817d = "";
        byte[] bArr = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        this.f5818e = bArr;
        this.f5819f = null;
        this.f5820g = null;
        this.f5821h = "";
        this.f5822i = 0;
        this.f5823j = 0;
        this.f5824k = -1;
        this.f5825l = bArr;
        this.f5826m = -1;
        this.f5827n = 0L;
        this.f5828o = 0L;
        this.f5829p = 0;
        this.f5830q = false;
        this.f5831r = 1L;
        this.f5832s = io.appmetrica.analytics.impl.C0275c9.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeUInt32Size = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt32Size(3, this.f5816c) + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt64Size(2, this.f5815b) + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt64Size(1, this.f5814a) + super.computeSerializedSize();
        if (!this.f5817d.equals("")) {
            computeUInt32Size += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(4, this.f5817d);
        }
        byte[] bArr = this.f5818e;
        byte[] bArr2 = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        if (!java.util.Arrays.equals(bArr, bArr2)) {
            computeUInt32Size += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(5, this.f5818e);
        }
        io.appmetrica.analytics.impl.Z8 z8 = this.f5819f;
        if (z8 != null) {
            computeUInt32Size += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(6, z8);
        }
        io.appmetrica.analytics.impl.C0301d9 c0301d9 = this.f5820g;
        if (c0301d9 != null) {
            computeUInt32Size += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(7, c0301d9);
        }
        if (!this.f5821h.equals("")) {
            computeUInt32Size += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(8, this.f5821h);
        }
        int i2 = this.f5822i;
        if (i2 != 0) {
            computeUInt32Size += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt32Size(10, i2);
        }
        int i3 = this.f5823j;
        if (i3 != 0) {
            computeUInt32Size += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(12, i3);
        }
        int i4 = this.f5824k;
        if (i4 != -1) {
            computeUInt32Size += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(13, i4);
        }
        if (!java.util.Arrays.equals(this.f5825l, bArr2)) {
            computeUInt32Size += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(14, this.f5825l);
        }
        int i5 = this.f5826m;
        if (i5 != -1) {
            computeUInt32Size += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(15, i5);
        }
        long j2 = this.f5827n;
        if (j2 != 0) {
            computeUInt32Size += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt64Size(16, j2);
        }
        long j3 = this.f5828o;
        if (j3 != 0) {
            computeUInt32Size += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt64Size(17, j3);
        }
        int i6 = this.f5829p;
        if (i6 != 0) {
            computeUInt32Size += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(22, i6);
        }
        boolean z2 = this.f5830q;
        if (z2) {
            computeUInt32Size += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBoolSize(23, z2);
        }
        long j4 = this.f5831r;
        if (j4 != 1) {
            computeUInt32Size += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt64Size(24, j4);
        }
        io.appmetrica.analytics.impl.C0275c9[] c0275c9Arr = this.f5832s;
        if (c0275c9Arr != null && c0275c9Arr.length > 0) {
            int i7 = 0;
            while (true) {
                io.appmetrica.analytics.impl.C0275c9[] c0275c9Arr2 = this.f5832s;
                if (i7 >= c0275c9Arr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.C0275c9 c0275c9 = c0275c9Arr2[i7];
                if (c0275c9 != null) {
                    computeUInt32Size = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(25, c0275c9) + computeUInt32Size;
                }
                i7++;
            }
        }
        return computeUInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeUInt64(1, this.f5814a);
        codedOutputByteBufferNano.writeUInt64(2, this.f5815b);
        codedOutputByteBufferNano.writeUInt32(3, this.f5816c);
        if (!this.f5817d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f5817d);
        }
        byte[] bArr = this.f5818e;
        byte[] bArr2 = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        if (!java.util.Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f5818e);
        }
        io.appmetrica.analytics.impl.Z8 z8 = this.f5819f;
        if (z8 != null) {
            codedOutputByteBufferNano.writeMessage(6, z8);
        }
        io.appmetrica.analytics.impl.C0301d9 c0301d9 = this.f5820g;
        if (c0301d9 != null) {
            codedOutputByteBufferNano.writeMessage(7, c0301d9);
        }
        if (!this.f5821h.equals("")) {
            codedOutputByteBufferNano.writeString(8, this.f5821h);
        }
        int i2 = this.f5822i;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(10, i2);
        }
        int i3 = this.f5823j;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeInt32(12, i3);
        }
        int i4 = this.f5824k;
        if (i4 != -1) {
            codedOutputByteBufferNano.writeInt32(13, i4);
        }
        if (!java.util.Arrays.equals(this.f5825l, bArr2)) {
            codedOutputByteBufferNano.writeBytes(14, this.f5825l);
        }
        int i5 = this.f5826m;
        if (i5 != -1) {
            codedOutputByteBufferNano.writeInt32(15, i5);
        }
        long j2 = this.f5827n;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeUInt64(16, j2);
        }
        long j3 = this.f5828o;
        if (j3 != 0) {
            codedOutputByteBufferNano.writeUInt64(17, j3);
        }
        int i6 = this.f5829p;
        if (i6 != 0) {
            codedOutputByteBufferNano.writeInt32(22, i6);
        }
        boolean z2 = this.f5830q;
        if (z2) {
            codedOutputByteBufferNano.writeBool(23, z2);
        }
        long j4 = this.f5831r;
        if (j4 != 1) {
            codedOutputByteBufferNano.writeUInt64(24, j4);
        }
        io.appmetrica.analytics.impl.C0275c9[] c0275c9Arr = this.f5832s;
        if (c0275c9Arr != null && c0275c9Arr.length > 0) {
            int i7 = 0;
            while (true) {
                io.appmetrica.analytics.impl.C0275c9[] c0275c9Arr2 = this.f5832s;
                if (i7 >= c0275c9Arr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.C0275c9 c0275c9 = c0275c9Arr2[i7];
                if (c0275c9 != null) {
                    codedOutputByteBufferNano.writeMessage(25, c0275c9);
                }
                i7++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0326e9 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0326e9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0326e9 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 8:
                    this.f5814a = codedInputByteBufferNano.readUInt64();
                    break;
                case 16:
                    this.f5815b = codedInputByteBufferNano.readUInt64();
                    break;
                case 24:
                    this.f5816c = codedInputByteBufferNano.readUInt32();
                    break;
                case 34:
                    this.f5817d = codedInputByteBufferNano.readString();
                    break;
                case f5800M /* 42 */:
                    this.f5818e = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f5819f == null) {
                        this.f5819f = new io.appmetrica.analytics.impl.Z8();
                    }
                    codedInputByteBufferNano.readMessage(this.f5819f);
                    break;
                case 58:
                    if (this.f5820g == null) {
                        this.f5820g = new io.appmetrica.analytics.impl.C0301d9();
                    }
                    codedInputByteBufferNano.readMessage(this.f5820g);
                    break;
                case 66:
                    this.f5821h = codedInputByteBufferNano.readString();
                    break;
                case 80:
                    this.f5822i = codedInputByteBufferNano.readUInt32();
                    break;
                case 96:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != 0 && readInt32 != 1 && readInt32 != 2) {
                        break;
                    } else {
                        this.f5823j = readInt32;
                        break;
                    }
                case 104:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != -1 && readInt322 != 0 && readInt322 != 1) {
                        break;
                    } else {
                        this.f5824k = readInt322;
                        break;
                    }
                case 114:
                    this.f5825l = codedInputByteBufferNano.readBytes();
                    break;
                case 120:
                    int readInt323 = codedInputByteBufferNano.readInt32();
                    if (readInt323 != -1 && readInt323 != 0 && readInt323 != 1) {
                        break;
                    } else {
                        this.f5826m = readInt323;
                        break;
                    }
                case 128:
                    this.f5827n = codedInputByteBufferNano.readUInt64();
                    break;
                case 136:
                    this.f5828o = codedInputByteBufferNano.readUInt64();
                    break;
                case 176:
                    int readInt324 = codedInputByteBufferNano.readInt32();
                    if (readInt324 != 0 && readInt324 != 1 && readInt324 != 2) {
                        break;
                    } else {
                        this.f5829p = readInt324;
                        break;
                    }
                case 184:
                    this.f5830q = codedInputByteBufferNano.readBool();
                    break;
                case 192:
                    this.f5831r = codedInputByteBufferNano.readUInt64();
                    break;
                case 202:
                    int repeatedFieldArrayLength = io.appmetrica.analytics.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 202);
                    io.appmetrica.analytics.impl.C0275c9[] c0275c9Arr = this.f5832s;
                    int length = c0275c9Arr == null ? 0 : c0275c9Arr.length;
                    int i2 = repeatedFieldArrayLength + length;
                    io.appmetrica.analytics.impl.C0275c9[] c0275c9Arr2 = new io.appmetrica.analytics.impl.C0275c9[i2];
                    if (length != 0) {
                        java.lang.System.arraycopy(c0275c9Arr, 0, c0275c9Arr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        io.appmetrica.analytics.impl.C0275c9 c0275c9 = new io.appmetrica.analytics.impl.C0275c9();
                        c0275c9Arr2[length] = c0275c9;
                        codedInputByteBufferNano.readMessage(c0275c9);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    io.appmetrica.analytics.impl.C0275c9 c0275c92 = new io.appmetrica.analytics.impl.C0275c9();
                    c0275c9Arr2[length] = c0275c92;
                    codedInputByteBufferNano.readMessage(c0275c92);
                    this.f5832s = c0275c9Arr2;
                    break;
                default:
                    if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        return this;
                    }
                    break;
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0326e9 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0326e9) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0326e9(), bArr);
    }
}
