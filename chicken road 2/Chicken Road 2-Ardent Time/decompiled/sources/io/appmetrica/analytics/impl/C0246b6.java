package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.b6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0246b6 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0246b6[] f5515f;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f5516a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f5517b;

    /* renamed from: c, reason: collision with root package name */
    public io.appmetrica.analytics.impl.Z5[] f5518c;

    /* renamed from: d, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0246b6 f5519d;

    /* renamed from: e, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0246b6[] f5520e;

    public C0246b6() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0246b6[] b() {
        if (f5515f == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5515f == null) {
                        f5515f = new io.appmetrica.analytics.impl.C0246b6[0];
                    }
                } finally {
                }
            }
        }
        return f5515f;
    }

    public final io.appmetrica.analytics.impl.C0246b6 a() {
        this.f5516a = "";
        this.f5517b = "";
        this.f5518c = io.appmetrica.analytics.impl.Z5.b();
        this.f5519d = null;
        this.f5520e = b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeStringSize = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(1, this.f5516a) + super.computeSerializedSize();
        if (!this.f5517b.equals("")) {
            computeStringSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(2, this.f5517b);
        }
        io.appmetrica.analytics.impl.Z5[] z5Arr = this.f5518c;
        int i2 = 0;
        if (z5Arr != null && z5Arr.length > 0) {
            int i3 = 0;
            while (true) {
                io.appmetrica.analytics.impl.Z5[] z5Arr2 = this.f5518c;
                if (i3 >= z5Arr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.Z5 z5 = z5Arr2[i3];
                if (z5 != null) {
                    computeStringSize = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(3, z5) + computeStringSize;
                }
                i3++;
            }
        }
        io.appmetrica.analytics.impl.C0246b6 c0246b6 = this.f5519d;
        if (c0246b6 != null) {
            computeStringSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(4, c0246b6);
        }
        io.appmetrica.analytics.impl.C0246b6[] c0246b6Arr = this.f5520e;
        if (c0246b6Arr != null && c0246b6Arr.length > 0) {
            while (true) {
                io.appmetrica.analytics.impl.C0246b6[] c0246b6Arr2 = this.f5520e;
                if (i2 >= c0246b6Arr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.C0246b6 c0246b62 = c0246b6Arr2[i2];
                if (c0246b62 != null) {
                    computeStringSize = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(5, c0246b62) + computeStringSize;
                }
                i2++;
            }
        }
        return computeStringSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeString(1, this.f5516a);
        if (!this.f5517b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f5517b);
        }
        io.appmetrica.analytics.impl.Z5[] z5Arr = this.f5518c;
        int i2 = 0;
        if (z5Arr != null && z5Arr.length > 0) {
            int i3 = 0;
            while (true) {
                io.appmetrica.analytics.impl.Z5[] z5Arr2 = this.f5518c;
                if (i3 >= z5Arr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.Z5 z5 = z5Arr2[i3];
                if (z5 != null) {
                    codedOutputByteBufferNano.writeMessage(3, z5);
                }
                i3++;
            }
        }
        io.appmetrica.analytics.impl.C0246b6 c0246b6 = this.f5519d;
        if (c0246b6 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0246b6);
        }
        io.appmetrica.analytics.impl.C0246b6[] c0246b6Arr = this.f5520e;
        if (c0246b6Arr != null && c0246b6Arr.length > 0) {
            while (true) {
                io.appmetrica.analytics.impl.C0246b6[] c0246b6Arr2 = this.f5520e;
                if (i2 >= c0246b6Arr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.C0246b6 c0246b62 = c0246b6Arr2[i2];
                if (c0246b62 != null) {
                    codedOutputByteBufferNano.writeMessage(5, c0246b62);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0246b6 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0246b6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0246b6 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f5516a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f5517b = codedInputByteBufferNano.readString();
            } else if (readTag == 26) {
                int repeatedFieldArrayLength = io.appmetrica.analytics.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                io.appmetrica.analytics.impl.Z5[] z5Arr = this.f5518c;
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
                this.f5518c = z5Arr2;
            } else if (readTag == 34) {
                if (this.f5519d == null) {
                    this.f5519d = new io.appmetrica.analytics.impl.C0246b6();
                }
                codedInputByteBufferNano.readMessage(this.f5519d);
            } else if (readTag != 42) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength2 = io.appmetrica.analytics.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                io.appmetrica.analytics.impl.C0246b6[] c0246b6Arr = this.f5520e;
                int length2 = c0246b6Arr == null ? 0 : c0246b6Arr.length;
                int i3 = repeatedFieldArrayLength2 + length2;
                io.appmetrica.analytics.impl.C0246b6[] c0246b6Arr2 = new io.appmetrica.analytics.impl.C0246b6[i3];
                if (length2 != 0) {
                    java.lang.System.arraycopy(c0246b6Arr, 0, c0246b6Arr2, 0, length2);
                }
                while (length2 < i3 - 1) {
                    io.appmetrica.analytics.impl.C0246b6 c0246b6 = new io.appmetrica.analytics.impl.C0246b6();
                    c0246b6Arr2[length2] = c0246b6;
                    codedInputByteBufferNano.readMessage(c0246b6);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                io.appmetrica.analytics.impl.C0246b6 c0246b62 = new io.appmetrica.analytics.impl.C0246b6();
                c0246b6Arr2[length2] = c0246b62;
                codedInputByteBufferNano.readMessage(c0246b62);
                this.f5520e = c0246b6Arr2;
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0246b6 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0246b6) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0246b6(), bArr);
    }
}
