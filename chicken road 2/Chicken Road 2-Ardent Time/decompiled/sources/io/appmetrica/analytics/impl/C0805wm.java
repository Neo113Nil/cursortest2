package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.wm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0805wm extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: D, reason: collision with root package name */
    public static final int f7033D = -1;

    /* renamed from: E, reason: collision with root package name */
    public static final int f7034E = 0;

    /* renamed from: F, reason: collision with root package name */
    public static final int f7035F = 1;
    public static volatile io.appmetrica.analytics.impl.C0805wm[] G;

    /* renamed from: A, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0753um f7036A;

    /* renamed from: B, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0701sm[] f7037B;

    /* renamed from: C, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0650qm f7038C;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f7039a;

    /* renamed from: b, reason: collision with root package name */
    public long f7040b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String[] f7041c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f7042d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f7043e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String[] f7044f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String[] f7045g;

    /* renamed from: h, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0624pm[] f7046h;

    /* renamed from: i, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0675rm f7047i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f7048j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f7049k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f7050l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7051m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f7052n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String[] f7053o;

    /* renamed from: p, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0779vm f7054p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7055q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f7056r;

    /* renamed from: s, reason: collision with root package name */
    public long f7057s;
    public long t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7058u;

    /* renamed from: v, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0727tm f7059v;

    /* renamed from: w, reason: collision with root package name */
    public int f7060w;

    /* renamed from: x, reason: collision with root package name */
    public int f7061x;

    /* renamed from: y, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0598om f7062y;

    /* renamed from: z, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0572nm f7063z;

    public C0805wm() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0805wm[] b() {
        if (G == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (G == null) {
                        G = new io.appmetrica.analytics.impl.C0805wm[0];
                    }
                } finally {
                }
            }
        }
        return G;
    }

    public final io.appmetrica.analytics.impl.C0805wm a() {
        this.f7039a = "";
        this.f7040b = 0L;
        java.lang.String[] strArr = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_STRING_ARRAY;
        this.f7041c = strArr;
        this.f7042d = "";
        this.f7043e = "";
        this.f7044f = strArr;
        this.f7045g = strArr;
        this.f7046h = io.appmetrica.analytics.impl.C0624pm.b();
        this.f7047i = null;
        this.f7048j = "";
        this.f7049k = "";
        this.f7050l = "";
        this.f7051m = false;
        this.f7052n = "";
        this.f7053o = strArr;
        this.f7054p = null;
        this.f7055q = false;
        this.f7056r = "";
        this.f7057s = 0L;
        this.t = 0L;
        this.f7058u = false;
        this.f7059v = null;
        this.f7060w = 600;
        this.f7061x = 1;
        this.f7062y = null;
        this.f7063z = null;
        this.f7036A = null;
        this.f7037B = io.appmetrica.analytics.impl.C0701sm.b();
        this.f7038C = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f7039a.equals("")) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(1, this.f7039a);
        }
        int computeInt64Size = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt64Size(2, this.f7040b) + computeSerializedSize;
        java.lang.String[] strArr = this.f7041c;
        int i2 = 0;
        if (strArr != null && strArr.length > 0) {
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                java.lang.String[] strArr2 = this.f7041c;
                if (i3 >= strArr2.length) {
                    break;
                }
                java.lang.String str = strArr2[i3];
                if (str != null) {
                    i5++;
                    i4 += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i3++;
            }
            computeInt64Size = computeInt64Size + i4 + i5;
        }
        if (!this.f7042d.equals("")) {
            computeInt64Size += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(4, this.f7042d);
        }
        if (!this.f7043e.equals("")) {
            computeInt64Size += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(5, this.f7043e);
        }
        java.lang.String[] strArr3 = this.f7044f;
        if (strArr3 != null && strArr3.length > 0) {
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                java.lang.String[] strArr4 = this.f7044f;
                if (i6 >= strArr4.length) {
                    break;
                }
                java.lang.String str2 = strArr4[i6];
                if (str2 != null) {
                    i8++;
                    i7 += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSizeNoTag(str2);
                }
                i6++;
            }
            computeInt64Size = computeInt64Size + i7 + i8;
        }
        java.lang.String[] strArr5 = this.f7045g;
        if (strArr5 != null && strArr5.length > 0) {
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                java.lang.String[] strArr6 = this.f7045g;
                if (i9 >= strArr6.length) {
                    break;
                }
                java.lang.String str3 = strArr6[i9];
                if (str3 != null) {
                    i11++;
                    i10 += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSizeNoTag(str3);
                }
                i9++;
            }
            computeInt64Size = computeInt64Size + i10 + i11;
        }
        io.appmetrica.analytics.impl.C0624pm[] c0624pmArr = this.f7046h;
        if (c0624pmArr != null && c0624pmArr.length > 0) {
            int i12 = 0;
            while (true) {
                io.appmetrica.analytics.impl.C0624pm[] c0624pmArr2 = this.f7046h;
                if (i12 >= c0624pmArr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.C0624pm c0624pm = c0624pmArr2[i12];
                if (c0624pm != null) {
                    computeInt64Size = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(8, c0624pm) + computeInt64Size;
                }
                i12++;
            }
        }
        io.appmetrica.analytics.impl.C0675rm c0675rm = this.f7047i;
        if (c0675rm != null) {
            computeInt64Size += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(9, c0675rm);
        }
        if (!this.f7048j.equals("")) {
            computeInt64Size += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(10, this.f7048j);
        }
        if (!this.f7049k.equals("")) {
            computeInt64Size += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(11, this.f7049k);
        }
        if (!this.f7050l.equals("")) {
            computeInt64Size += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(12, this.f7050l);
        }
        int computeBoolSize = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBoolSize(13, this.f7051m) + computeInt64Size;
        if (!this.f7052n.equals("")) {
            computeBoolSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(14, this.f7052n);
        }
        java.lang.String[] strArr7 = this.f7053o;
        if (strArr7 != null && strArr7.length > 0) {
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (true) {
                java.lang.String[] strArr8 = this.f7053o;
                if (i13 >= strArr8.length) {
                    break;
                }
                java.lang.String str4 = strArr8[i13];
                if (str4 != null) {
                    i15++;
                    i14 += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSizeNoTag(str4);
                }
                i13++;
            }
            computeBoolSize = computeBoolSize + i14 + i15;
        }
        io.appmetrica.analytics.impl.C0779vm c0779vm = this.f7054p;
        if (c0779vm != null) {
            computeBoolSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(16, c0779vm);
        }
        boolean z2 = this.f7055q;
        if (z2) {
            computeBoolSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBoolSize(17, z2);
        }
        if (!this.f7056r.equals("")) {
            computeBoolSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(20, this.f7056r);
        }
        int computeInt64Size2 = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt64Size(22, this.t) + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt64Size(21, this.f7057s) + computeBoolSize;
        boolean z3 = this.f7058u;
        if (z3) {
            computeInt64Size2 += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBoolSize(23, z3);
        }
        io.appmetrica.analytics.impl.C0727tm c0727tm = this.f7059v;
        if (c0727tm != null) {
            computeInt64Size2 += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(24, c0727tm);
        }
        int computeInt32Size = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(26, this.f7061x) + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(25, this.f7060w) + computeInt64Size2;
        io.appmetrica.analytics.impl.C0598om c0598om = this.f7062y;
        if (c0598om != null) {
            computeInt32Size += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(27, c0598om);
        }
        io.appmetrica.analytics.impl.C0572nm c0572nm = this.f7063z;
        if (c0572nm != null) {
            computeInt32Size += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(29, c0572nm);
        }
        io.appmetrica.analytics.impl.C0753um c0753um = this.f7036A;
        if (c0753um != null) {
            computeInt32Size += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(30, c0753um);
        }
        io.appmetrica.analytics.impl.C0701sm[] c0701smArr = this.f7037B;
        if (c0701smArr != null && c0701smArr.length > 0) {
            while (true) {
                io.appmetrica.analytics.impl.C0701sm[] c0701smArr2 = this.f7037B;
                if (i2 >= c0701smArr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.C0701sm c0701sm = c0701smArr2[i2];
                if (c0701sm != null) {
                    computeInt32Size = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(31, c0701sm) + computeInt32Size;
                }
                i2++;
            }
        }
        io.appmetrica.analytics.impl.C0650qm c0650qm = this.f7038C;
        return c0650qm != null ? computeInt32Size + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(32, c0650qm) : computeInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f7039a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f7039a);
        }
        codedOutputByteBufferNano.writeInt64(2, this.f7040b);
        java.lang.String[] strArr = this.f7041c;
        int i2 = 0;
        if (strArr != null && strArr.length > 0) {
            int i3 = 0;
            while (true) {
                java.lang.String[] strArr2 = this.f7041c;
                if (i3 >= strArr2.length) {
                    break;
                }
                java.lang.String str = strArr2[i3];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i3++;
            }
        }
        if (!this.f7042d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f7042d);
        }
        if (!this.f7043e.equals("")) {
            codedOutputByteBufferNano.writeString(5, this.f7043e);
        }
        java.lang.String[] strArr3 = this.f7044f;
        if (strArr3 != null && strArr3.length > 0) {
            int i4 = 0;
            while (true) {
                java.lang.String[] strArr4 = this.f7044f;
                if (i4 >= strArr4.length) {
                    break;
                }
                java.lang.String str2 = strArr4[i4];
                if (str2 != null) {
                    codedOutputByteBufferNano.writeString(6, str2);
                }
                i4++;
            }
        }
        java.lang.String[] strArr5 = this.f7045g;
        if (strArr5 != null && strArr5.length > 0) {
            int i5 = 0;
            while (true) {
                java.lang.String[] strArr6 = this.f7045g;
                if (i5 >= strArr6.length) {
                    break;
                }
                java.lang.String str3 = strArr6[i5];
                if (str3 != null) {
                    codedOutputByteBufferNano.writeString(7, str3);
                }
                i5++;
            }
        }
        io.appmetrica.analytics.impl.C0624pm[] c0624pmArr = this.f7046h;
        if (c0624pmArr != null && c0624pmArr.length > 0) {
            int i6 = 0;
            while (true) {
                io.appmetrica.analytics.impl.C0624pm[] c0624pmArr2 = this.f7046h;
                if (i6 >= c0624pmArr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.C0624pm c0624pm = c0624pmArr2[i6];
                if (c0624pm != null) {
                    codedOutputByteBufferNano.writeMessage(8, c0624pm);
                }
                i6++;
            }
        }
        io.appmetrica.analytics.impl.C0675rm c0675rm = this.f7047i;
        if (c0675rm != null) {
            codedOutputByteBufferNano.writeMessage(9, c0675rm);
        }
        if (!this.f7048j.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f7048j);
        }
        if (!this.f7049k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.f7049k);
        }
        if (!this.f7050l.equals("")) {
            codedOutputByteBufferNano.writeString(12, this.f7050l);
        }
        codedOutputByteBufferNano.writeBool(13, this.f7051m);
        if (!this.f7052n.equals("")) {
            codedOutputByteBufferNano.writeString(14, this.f7052n);
        }
        java.lang.String[] strArr7 = this.f7053o;
        if (strArr7 != null && strArr7.length > 0) {
            int i7 = 0;
            while (true) {
                java.lang.String[] strArr8 = this.f7053o;
                if (i7 >= strArr8.length) {
                    break;
                }
                java.lang.String str4 = strArr8[i7];
                if (str4 != null) {
                    codedOutputByteBufferNano.writeString(15, str4);
                }
                i7++;
            }
        }
        io.appmetrica.analytics.impl.C0779vm c0779vm = this.f7054p;
        if (c0779vm != null) {
            codedOutputByteBufferNano.writeMessage(16, c0779vm);
        }
        boolean z2 = this.f7055q;
        if (z2) {
            codedOutputByteBufferNano.writeBool(17, z2);
        }
        if (!this.f7056r.equals("")) {
            codedOutputByteBufferNano.writeString(20, this.f7056r);
        }
        codedOutputByteBufferNano.writeInt64(21, this.f7057s);
        codedOutputByteBufferNano.writeInt64(22, this.t);
        boolean z3 = this.f7058u;
        if (z3) {
            codedOutputByteBufferNano.writeBool(23, z3);
        }
        io.appmetrica.analytics.impl.C0727tm c0727tm = this.f7059v;
        if (c0727tm != null) {
            codedOutputByteBufferNano.writeMessage(24, c0727tm);
        }
        codedOutputByteBufferNano.writeInt32(25, this.f7060w);
        codedOutputByteBufferNano.writeInt32(26, this.f7061x);
        io.appmetrica.analytics.impl.C0598om c0598om = this.f7062y;
        if (c0598om != null) {
            codedOutputByteBufferNano.writeMessage(27, c0598om);
        }
        io.appmetrica.analytics.impl.C0572nm c0572nm = this.f7063z;
        if (c0572nm != null) {
            codedOutputByteBufferNano.writeMessage(29, c0572nm);
        }
        io.appmetrica.analytics.impl.C0753um c0753um = this.f7036A;
        if (c0753um != null) {
            codedOutputByteBufferNano.writeMessage(30, c0753um);
        }
        io.appmetrica.analytics.impl.C0701sm[] c0701smArr = this.f7037B;
        if (c0701smArr != null && c0701smArr.length > 0) {
            while (true) {
                io.appmetrica.analytics.impl.C0701sm[] c0701smArr2 = this.f7037B;
                if (i2 >= c0701smArr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.C0701sm c0701sm = c0701smArr2[i2];
                if (c0701sm != null) {
                    codedOutputByteBufferNano.writeMessage(31, c0701sm);
                }
                i2++;
            }
        }
        io.appmetrica.analytics.impl.C0650qm c0650qm = this.f7038C;
        if (c0650qm != null) {
            codedOutputByteBufferNano.writeMessage(32, c0650qm);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0805wm b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0805wm().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0805wm mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 10:
                    this.f7039a = codedInputByteBufferNano.readString();
                    break;
                case 16:
                    this.f7040b = codedInputByteBufferNano.readInt64();
                    break;
                case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                    int repeatedFieldArrayLength = io.appmetrica.analytics.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                    java.lang.String[] strArr = this.f7041c;
                    int length = strArr == null ? 0 : strArr.length;
                    int i2 = repeatedFieldArrayLength + length;
                    java.lang.String[] strArr2 = new java.lang.String[i2];
                    if (length != 0) {
                        java.lang.System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        strArr2[length] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    strArr2[length] = codedInputByteBufferNano.readString();
                    this.f7041c = strArr2;
                    break;
                case 34:
                    this.f7042d = codedInputByteBufferNano.readString();
                    break;
                case io.appmetrica.analytics.impl.C0326e9.f5800M /* 42 */:
                    this.f7043e = codedInputByteBufferNano.readString();
                    break;
                case 50:
                    int repeatedFieldArrayLength2 = io.appmetrica.analytics.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                    java.lang.String[] strArr3 = this.f7044f;
                    int length2 = strArr3 == null ? 0 : strArr3.length;
                    int i3 = repeatedFieldArrayLength2 + length2;
                    java.lang.String[] strArr4 = new java.lang.String[i3];
                    if (length2 != 0) {
                        java.lang.System.arraycopy(strArr3, 0, strArr4, 0, length2);
                    }
                    while (length2 < i3 - 1) {
                        strArr4[length2] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    strArr4[length2] = codedInputByteBufferNano.readString();
                    this.f7044f = strArr4;
                    break;
                case 58:
                    int repeatedFieldArrayLength3 = io.appmetrica.analytics.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                    java.lang.String[] strArr5 = this.f7045g;
                    int length3 = strArr5 == null ? 0 : strArr5.length;
                    int i4 = repeatedFieldArrayLength3 + length3;
                    java.lang.String[] strArr6 = new java.lang.String[i4];
                    if (length3 != 0) {
                        java.lang.System.arraycopy(strArr5, 0, strArr6, 0, length3);
                    }
                    while (length3 < i4 - 1) {
                        strArr6[length3] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length3++;
                    }
                    strArr6[length3] = codedInputByteBufferNano.readString();
                    this.f7045g = strArr6;
                    break;
                case 66:
                    int repeatedFieldArrayLength4 = io.appmetrica.analytics.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 66);
                    io.appmetrica.analytics.impl.C0624pm[] c0624pmArr = this.f7046h;
                    int length4 = c0624pmArr == null ? 0 : c0624pmArr.length;
                    int i5 = repeatedFieldArrayLength4 + length4;
                    io.appmetrica.analytics.impl.C0624pm[] c0624pmArr2 = new io.appmetrica.analytics.impl.C0624pm[i5];
                    if (length4 != 0) {
                        java.lang.System.arraycopy(c0624pmArr, 0, c0624pmArr2, 0, length4);
                    }
                    while (length4 < i5 - 1) {
                        io.appmetrica.analytics.impl.C0624pm c0624pm = new io.appmetrica.analytics.impl.C0624pm();
                        c0624pmArr2[length4] = c0624pm;
                        codedInputByteBufferNano.readMessage(c0624pm);
                        codedInputByteBufferNano.readTag();
                        length4++;
                    }
                    io.appmetrica.analytics.impl.C0624pm c0624pm2 = new io.appmetrica.analytics.impl.C0624pm();
                    c0624pmArr2[length4] = c0624pm2;
                    codedInputByteBufferNano.readMessage(c0624pm2);
                    this.f7046h = c0624pmArr2;
                    break;
                case 74:
                    if (this.f7047i == null) {
                        this.f7047i = new io.appmetrica.analytics.impl.C0675rm();
                    }
                    codedInputByteBufferNano.readMessage(this.f7047i);
                    break;
                case 82:
                    this.f7048j = codedInputByteBufferNano.readString();
                    break;
                case io.appmetrica.analytics.AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    this.f7049k = codedInputByteBufferNano.readString();
                    break;
                case 98:
                    this.f7050l = codedInputByteBufferNano.readString();
                    break;
                case 104:
                    this.f7051m = codedInputByteBufferNano.readBool();
                    break;
                case 114:
                    this.f7052n = codedInputByteBufferNano.readString();
                    break;
                case 122:
                    int repeatedFieldArrayLength5 = io.appmetrica.analytics.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 122);
                    java.lang.String[] strArr7 = this.f7053o;
                    int length5 = strArr7 == null ? 0 : strArr7.length;
                    int i6 = repeatedFieldArrayLength5 + length5;
                    java.lang.String[] strArr8 = new java.lang.String[i6];
                    if (length5 != 0) {
                        java.lang.System.arraycopy(strArr7, 0, strArr8, 0, length5);
                    }
                    while (length5 < i6 - 1) {
                        strArr8[length5] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length5++;
                    }
                    strArr8[length5] = codedInputByteBufferNano.readString();
                    this.f7053o = strArr8;
                    break;
                case 130:
                    if (this.f7054p == null) {
                        this.f7054p = new io.appmetrica.analytics.impl.C0779vm();
                    }
                    codedInputByteBufferNano.readMessage(this.f7054p);
                    break;
                case 136:
                    this.f7055q = codedInputByteBufferNano.readBool();
                    break;
                case 162:
                    this.f7056r = codedInputByteBufferNano.readString();
                    break;
                case 168:
                    this.f7057s = codedInputByteBufferNano.readInt64();
                    break;
                case 176:
                    this.t = codedInputByteBufferNano.readInt64();
                    break;
                case 184:
                    this.f7058u = codedInputByteBufferNano.readBool();
                    break;
                case 194:
                    if (this.f7059v == null) {
                        this.f7059v = new io.appmetrica.analytics.impl.C0727tm();
                    }
                    codedInputByteBufferNano.readMessage(this.f7059v);
                    break;
                case 200:
                    this.f7060w = codedInputByteBufferNano.readInt32();
                    break;
                case 208:
                    this.f7061x = codedInputByteBufferNano.readInt32();
                    break;
                case 218:
                    if (this.f7062y == null) {
                        this.f7062y = new io.appmetrica.analytics.impl.C0598om();
                    }
                    codedInputByteBufferNano.readMessage(this.f7062y);
                    break;
                case 234:
                    if (this.f7063z == null) {
                        this.f7063z = new io.appmetrica.analytics.impl.C0572nm();
                    }
                    codedInputByteBufferNano.readMessage(this.f7063z);
                    break;
                case 242:
                    if (this.f7036A == null) {
                        this.f7036A = new io.appmetrica.analytics.impl.C0753um();
                    }
                    codedInputByteBufferNano.readMessage(this.f7036A);
                    break;
                case 250:
                    int repeatedFieldArrayLength6 = io.appmetrica.analytics.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 250);
                    io.appmetrica.analytics.impl.C0701sm[] c0701smArr = this.f7037B;
                    int length6 = c0701smArr == null ? 0 : c0701smArr.length;
                    int i7 = repeatedFieldArrayLength6 + length6;
                    io.appmetrica.analytics.impl.C0701sm[] c0701smArr2 = new io.appmetrica.analytics.impl.C0701sm[i7];
                    if (length6 != 0) {
                        java.lang.System.arraycopy(c0701smArr, 0, c0701smArr2, 0, length6);
                    }
                    while (length6 < i7 - 1) {
                        io.appmetrica.analytics.impl.C0701sm c0701sm = new io.appmetrica.analytics.impl.C0701sm();
                        c0701smArr2[length6] = c0701sm;
                        codedInputByteBufferNano.readMessage(c0701sm);
                        codedInputByteBufferNano.readTag();
                        length6++;
                    }
                    io.appmetrica.analytics.impl.C0701sm c0701sm2 = new io.appmetrica.analytics.impl.C0701sm();
                    c0701smArr2[length6] = c0701sm2;
                    codedInputByteBufferNano.readMessage(c0701sm2);
                    this.f7037B = c0701smArr2;
                    break;
                case 258:
                    if (this.f7038C == null) {
                        this.f7038C = new io.appmetrica.analytics.impl.C0650qm();
                    }
                    codedInputByteBufferNano.readMessage(this.f7038C);
                    break;
                default:
                    if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        return this;
                    }
                    break;
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0805wm a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0805wm) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0805wm(), bArr);
    }
}
