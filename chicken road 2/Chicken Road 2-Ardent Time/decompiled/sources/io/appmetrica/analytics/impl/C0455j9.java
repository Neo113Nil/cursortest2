package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.j9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0455j9 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: g, reason: collision with root package name */
    public static final int f6166g = -1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f6167h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final int f6168i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0455j9[] f6169j;

    /* renamed from: a, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0378g9[] f6170a;

    /* renamed from: b, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0249b9 f6171b;

    /* renamed from: c, reason: collision with root package name */
    public io.appmetrica.analytics.impl.Y8[] f6172c;

    /* renamed from: d, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0404h9[] f6173d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String[] f6174e;

    /* renamed from: f, reason: collision with root package name */
    public byte[][] f6175f;

    public C0455j9() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0455j9[] b() {
        if (f6169j == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6169j == null) {
                        f6169j = new io.appmetrica.analytics.impl.C0455j9[0];
                    }
                } finally {
                }
            }
        }
        return f6169j;
    }

    public final io.appmetrica.analytics.impl.C0455j9 a() {
        this.f6170a = io.appmetrica.analytics.impl.C0378g9.b();
        this.f6171b = null;
        this.f6172c = io.appmetrica.analytics.impl.Y8.b();
        this.f6173d = io.appmetrica.analytics.impl.C0404h9.b();
        this.f6174e = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_STRING_ARRAY;
        this.f6175f = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        io.appmetrica.analytics.impl.C0378g9[] c0378g9Arr = this.f6170a;
        int i2 = 0;
        if (c0378g9Arr != null && c0378g9Arr.length > 0) {
            int i3 = 0;
            while (true) {
                io.appmetrica.analytics.impl.C0378g9[] c0378g9Arr2 = this.f6170a;
                if (i3 >= c0378g9Arr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.C0378g9 c0378g9 = c0378g9Arr2[i3];
                if (c0378g9 != null) {
                    computeSerializedSize = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(3, c0378g9) + computeSerializedSize;
                }
                i3++;
            }
        }
        io.appmetrica.analytics.impl.C0249b9 c0249b9 = this.f6171b;
        if (c0249b9 != null) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(4, c0249b9);
        }
        io.appmetrica.analytics.impl.Y8[] y8Arr = this.f6172c;
        if (y8Arr != null && y8Arr.length > 0) {
            int i4 = 0;
            while (true) {
                io.appmetrica.analytics.impl.Y8[] y8Arr2 = this.f6172c;
                if (i4 >= y8Arr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.Y8 y8 = y8Arr2[i4];
                if (y8 != null) {
                    computeSerializedSize = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(7, y8) + computeSerializedSize;
                }
                i4++;
            }
        }
        io.appmetrica.analytics.impl.C0404h9[] c0404h9Arr = this.f6173d;
        if (c0404h9Arr != null && c0404h9Arr.length > 0) {
            int i5 = 0;
            while (true) {
                io.appmetrica.analytics.impl.C0404h9[] c0404h9Arr2 = this.f6173d;
                if (i5 >= c0404h9Arr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.C0404h9 c0404h9 = c0404h9Arr2[i5];
                if (c0404h9 != null) {
                    computeSerializedSize = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(10, c0404h9) + computeSerializedSize;
                }
                i5++;
            }
        }
        java.lang.String[] strArr = this.f6174e;
        if (strArr != null && strArr.length > 0) {
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                java.lang.String[] strArr2 = this.f6174e;
                if (i6 >= strArr2.length) {
                    break;
                }
                java.lang.String str = strArr2[i6];
                if (str != null) {
                    i8++;
                    i7 += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i6++;
            }
            computeSerializedSize = computeSerializedSize + i7 + i8;
        }
        byte[][] bArr = this.f6175f;
        if (bArr == null || bArr.length <= 0) {
            return computeSerializedSize;
        }
        int i9 = 0;
        int i10 = 0;
        while (true) {
            byte[][] bArr2 = this.f6175f;
            if (i2 >= bArr2.length) {
                return computeSerializedSize + i9 + i10;
            }
            byte[] bArr3 = bArr2[i2];
            if (bArr3 != null) {
                i10++;
                i9 = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSizeNoTag(bArr3) + i9;
            }
            i2++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        io.appmetrica.analytics.impl.C0378g9[] c0378g9Arr = this.f6170a;
        int i2 = 0;
        if (c0378g9Arr != null && c0378g9Arr.length > 0) {
            int i3 = 0;
            while (true) {
                io.appmetrica.analytics.impl.C0378g9[] c0378g9Arr2 = this.f6170a;
                if (i3 >= c0378g9Arr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.C0378g9 c0378g9 = c0378g9Arr2[i3];
                if (c0378g9 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c0378g9);
                }
                i3++;
            }
        }
        io.appmetrica.analytics.impl.C0249b9 c0249b9 = this.f6171b;
        if (c0249b9 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0249b9);
        }
        io.appmetrica.analytics.impl.Y8[] y8Arr = this.f6172c;
        if (y8Arr != null && y8Arr.length > 0) {
            int i4 = 0;
            while (true) {
                io.appmetrica.analytics.impl.Y8[] y8Arr2 = this.f6172c;
                if (i4 >= y8Arr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.Y8 y8 = y8Arr2[i4];
                if (y8 != null) {
                    codedOutputByteBufferNano.writeMessage(7, y8);
                }
                i4++;
            }
        }
        io.appmetrica.analytics.impl.C0404h9[] c0404h9Arr = this.f6173d;
        if (c0404h9Arr != null && c0404h9Arr.length > 0) {
            int i5 = 0;
            while (true) {
                io.appmetrica.analytics.impl.C0404h9[] c0404h9Arr2 = this.f6173d;
                if (i5 >= c0404h9Arr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.C0404h9 c0404h9 = c0404h9Arr2[i5];
                if (c0404h9 != null) {
                    codedOutputByteBufferNano.writeMessage(10, c0404h9);
                }
                i5++;
            }
        }
        java.lang.String[] strArr = this.f6174e;
        if (strArr != null && strArr.length > 0) {
            int i6 = 0;
            while (true) {
                java.lang.String[] strArr2 = this.f6174e;
                if (i6 >= strArr2.length) {
                    break;
                }
                java.lang.String str = strArr2[i6];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(11, str);
                }
                i6++;
            }
        }
        byte[][] bArr = this.f6175f;
        if (bArr != null && bArr.length > 0) {
            while (true) {
                byte[][] bArr2 = this.f6175f;
                if (i2 >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i2];
                if (bArr3 != null) {
                    codedOutputByteBufferNano.writeBytes(12, bArr3);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0455j9 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0455j9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0455j9 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 26) {
                int repeatedFieldArrayLength = io.appmetrica.analytics.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                io.appmetrica.analytics.impl.C0378g9[] c0378g9Arr = this.f6170a;
                int length = c0378g9Arr == null ? 0 : c0378g9Arr.length;
                int i2 = repeatedFieldArrayLength + length;
                io.appmetrica.analytics.impl.C0378g9[] c0378g9Arr2 = new io.appmetrica.analytics.impl.C0378g9[i2];
                if (length != 0) {
                    java.lang.System.arraycopy(c0378g9Arr, 0, c0378g9Arr2, 0, length);
                }
                while (length < i2 - 1) {
                    io.appmetrica.analytics.impl.C0378g9 c0378g9 = new io.appmetrica.analytics.impl.C0378g9();
                    c0378g9Arr2[length] = c0378g9;
                    codedInputByteBufferNano.readMessage(c0378g9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                io.appmetrica.analytics.impl.C0378g9 c0378g92 = new io.appmetrica.analytics.impl.C0378g9();
                c0378g9Arr2[length] = c0378g92;
                codedInputByteBufferNano.readMessage(c0378g92);
                this.f6170a = c0378g9Arr2;
            } else if (readTag == 34) {
                if (this.f6171b == null) {
                    this.f6171b = new io.appmetrica.analytics.impl.C0249b9();
                }
                codedInputByteBufferNano.readMessage(this.f6171b);
            } else if (readTag == 58) {
                int repeatedFieldArrayLength2 = io.appmetrica.analytics.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                io.appmetrica.analytics.impl.Y8[] y8Arr = this.f6172c;
                int length2 = y8Arr == null ? 0 : y8Arr.length;
                int i3 = repeatedFieldArrayLength2 + length2;
                io.appmetrica.analytics.impl.Y8[] y8Arr2 = new io.appmetrica.analytics.impl.Y8[i3];
                if (length2 != 0) {
                    java.lang.System.arraycopy(y8Arr, 0, y8Arr2, 0, length2);
                }
                while (length2 < i3 - 1) {
                    io.appmetrica.analytics.impl.Y8 y8 = new io.appmetrica.analytics.impl.Y8();
                    y8Arr2[length2] = y8;
                    codedInputByteBufferNano.readMessage(y8);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                io.appmetrica.analytics.impl.Y8 y82 = new io.appmetrica.analytics.impl.Y8();
                y8Arr2[length2] = y82;
                codedInputByteBufferNano.readMessage(y82);
                this.f6172c = y8Arr2;
            } else if (readTag == 82) {
                int repeatedFieldArrayLength3 = io.appmetrica.analytics.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                io.appmetrica.analytics.impl.C0404h9[] c0404h9Arr = this.f6173d;
                int length3 = c0404h9Arr == null ? 0 : c0404h9Arr.length;
                int i4 = repeatedFieldArrayLength3 + length3;
                io.appmetrica.analytics.impl.C0404h9[] c0404h9Arr2 = new io.appmetrica.analytics.impl.C0404h9[i4];
                if (length3 != 0) {
                    java.lang.System.arraycopy(c0404h9Arr, 0, c0404h9Arr2, 0, length3);
                }
                while (length3 < i4 - 1) {
                    io.appmetrica.analytics.impl.C0404h9 c0404h9 = new io.appmetrica.analytics.impl.C0404h9();
                    c0404h9Arr2[length3] = c0404h9;
                    codedInputByteBufferNano.readMessage(c0404h9);
                    codedInputByteBufferNano.readTag();
                    length3++;
                }
                io.appmetrica.analytics.impl.C0404h9 c0404h92 = new io.appmetrica.analytics.impl.C0404h9();
                c0404h9Arr2[length3] = c0404h92;
                codedInputByteBufferNano.readMessage(c0404h92);
                this.f6173d = c0404h9Arr2;
            } else if (readTag == 90) {
                int repeatedFieldArrayLength4 = io.appmetrica.analytics.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                java.lang.String[] strArr = this.f6174e;
                int length4 = strArr == null ? 0 : strArr.length;
                int i5 = repeatedFieldArrayLength4 + length4;
                java.lang.String[] strArr2 = new java.lang.String[i5];
                if (length4 != 0) {
                    java.lang.System.arraycopy(strArr, 0, strArr2, 0, length4);
                }
                while (length4 < i5 - 1) {
                    strArr2[length4] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length4++;
                }
                strArr2[length4] = codedInputByteBufferNano.readString();
                this.f6174e = strArr2;
            } else if (readTag != 98) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength5 = io.appmetrica.analytics.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 98);
                byte[][] bArr = this.f6175f;
                int length5 = bArr == null ? 0 : bArr.length;
                int i6 = repeatedFieldArrayLength5 + length5;
                byte[][] bArr2 = new byte[i6][];
                if (length5 != 0) {
                    java.lang.System.arraycopy(bArr, 0, bArr2, 0, length5);
                }
                while (length5 < i6 - 1) {
                    bArr2[length5] = codedInputByteBufferNano.readBytes();
                    codedInputByteBufferNano.readTag();
                    length5++;
                }
                bArr2[length5] = codedInputByteBufferNano.readBytes();
                this.f6175f = bArr2;
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0455j9 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0455j9) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0455j9(), bArr);
    }
}
