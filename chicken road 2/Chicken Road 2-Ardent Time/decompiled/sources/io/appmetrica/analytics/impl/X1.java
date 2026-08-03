package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class X1 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.X1[] f5251d;

    /* renamed from: a, reason: collision with root package name */
    public io.appmetrica.analytics.impl.W1[] f5252a;

    /* renamed from: b, reason: collision with root package name */
    public io.appmetrica.analytics.impl.V1 f5253b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String[] f5254c;

    public X1() {
        a();
    }

    public static io.appmetrica.analytics.impl.X1[] b() {
        if (f5251d == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5251d == null) {
                        f5251d = new io.appmetrica.analytics.impl.X1[0];
                    }
                } finally {
                }
            }
        }
        return f5251d;
    }

    public final io.appmetrica.analytics.impl.X1 a() {
        this.f5252a = io.appmetrica.analytics.impl.W1.b();
        this.f5253b = null;
        this.f5254c = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        io.appmetrica.analytics.impl.W1[] w1Arr = this.f5252a;
        int i2 = 0;
        if (w1Arr != null && w1Arr.length > 0) {
            int i3 = 0;
            while (true) {
                io.appmetrica.analytics.impl.W1[] w1Arr2 = this.f5252a;
                if (i3 >= w1Arr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.W1 w12 = w1Arr2[i3];
                if (w12 != null) {
                    computeSerializedSize = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(1, w12) + computeSerializedSize;
                }
                i3++;
            }
        }
        io.appmetrica.analytics.impl.V1 v12 = this.f5253b;
        if (v12 != null) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(2, v12);
        }
        java.lang.String[] strArr = this.f5254c;
        if (strArr == null || strArr.length <= 0) {
            return computeSerializedSize;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            java.lang.String[] strArr2 = this.f5254c;
            if (i2 >= strArr2.length) {
                return computeSerializedSize + i4 + i5;
            }
            java.lang.String str = strArr2[i2];
            if (str != null) {
                i5++;
                i4 = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSizeNoTag(str) + i4;
            }
            i2++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        io.appmetrica.analytics.impl.W1[] w1Arr = this.f5252a;
        int i2 = 0;
        if (w1Arr != null && w1Arr.length > 0) {
            int i3 = 0;
            while (true) {
                io.appmetrica.analytics.impl.W1[] w1Arr2 = this.f5252a;
                if (i3 >= w1Arr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.W1 w12 = w1Arr2[i3];
                if (w12 != null) {
                    codedOutputByteBufferNano.writeMessage(1, w12);
                }
                i3++;
            }
        }
        io.appmetrica.analytics.impl.V1 v12 = this.f5253b;
        if (v12 != null) {
            codedOutputByteBufferNano.writeMessage(2, v12);
        }
        java.lang.String[] strArr = this.f5254c;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                java.lang.String[] strArr2 = this.f5254c;
                if (i2 >= strArr2.length) {
                    break;
                }
                java.lang.String str = strArr2[i2];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.X1 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                int repeatedFieldArrayLength = io.appmetrica.analytics.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                io.appmetrica.analytics.impl.W1[] w1Arr = this.f5252a;
                int length = w1Arr == null ? 0 : w1Arr.length;
                int i2 = repeatedFieldArrayLength + length;
                io.appmetrica.analytics.impl.W1[] w1Arr2 = new io.appmetrica.analytics.impl.W1[i2];
                if (length != 0) {
                    java.lang.System.arraycopy(w1Arr, 0, w1Arr2, 0, length);
                }
                while (length < i2 - 1) {
                    io.appmetrica.analytics.impl.W1 w12 = new io.appmetrica.analytics.impl.W1();
                    w1Arr2[length] = w12;
                    codedInputByteBufferNano.readMessage(w12);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                io.appmetrica.analytics.impl.W1 w13 = new io.appmetrica.analytics.impl.W1();
                w1Arr2[length] = w13;
                codedInputByteBufferNano.readMessage(w13);
                this.f5252a = w1Arr2;
            } else if (readTag == 18) {
                if (this.f5253b == null) {
                    this.f5253b = new io.appmetrica.analytics.impl.V1();
                }
                codedInputByteBufferNano.readMessage(this.f5253b);
            } else if (readTag != 26) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength2 = io.appmetrica.analytics.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                java.lang.String[] strArr = this.f5254c;
                int length2 = strArr == null ? 0 : strArr.length;
                int i3 = repeatedFieldArrayLength2 + length2;
                java.lang.String[] strArr2 = new java.lang.String[i3];
                if (length2 != 0) {
                    java.lang.System.arraycopy(strArr, 0, strArr2, 0, length2);
                }
                while (length2 < i3 - 1) {
                    strArr2[length2] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                strArr2[length2] = codedInputByteBufferNano.readString();
                this.f5254c = strArr2;
            }
        }
    }

    public static io.appmetrica.analytics.impl.X1 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.X1().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.X1 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.X1) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.X1(), bArr);
    }
}
