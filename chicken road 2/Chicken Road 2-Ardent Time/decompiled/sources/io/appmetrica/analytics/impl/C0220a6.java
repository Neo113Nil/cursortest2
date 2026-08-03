package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.a6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0220a6 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: g, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0220a6[] f5461g;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f5462a;

    /* renamed from: b, reason: collision with root package name */
    public int f5463b;

    /* renamed from: c, reason: collision with root package name */
    public long f5464c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f5465d;

    /* renamed from: e, reason: collision with root package name */
    public int f5466e;

    /* renamed from: f, reason: collision with root package name */
    public io.appmetrica.analytics.impl.Z5[] f5467f;

    public C0220a6() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0220a6[] b() {
        if (f5461g == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5461g == null) {
                        f5461g = new io.appmetrica.analytics.impl.C0220a6[0];
                    }
                } finally {
                }
            }
        }
        return f5461g;
    }

    public final io.appmetrica.analytics.impl.C0220a6 a() {
        this.f5462a = "";
        this.f5463b = 0;
        this.f5464c = 0L;
        this.f5465d = "";
        this.f5466e = 0;
        this.f5467f = io.appmetrica.analytics.impl.Z5.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSInt64Size = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeSInt64Size(3, this.f5464c) + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeSInt32Size(2, this.f5463b) + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(1, this.f5462a) + super.computeSerializedSize();
        if (!this.f5465d.equals("")) {
            computeSInt64Size += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(4, this.f5465d);
        }
        int i2 = this.f5466e;
        if (i2 != 0) {
            computeSInt64Size += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt32Size(5, i2);
        }
        io.appmetrica.analytics.impl.Z5[] z5Arr = this.f5467f;
        if (z5Arr != null && z5Arr.length > 0) {
            int i3 = 0;
            while (true) {
                io.appmetrica.analytics.impl.Z5[] z5Arr2 = this.f5467f;
                if (i3 >= z5Arr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.Z5 z5 = z5Arr2[i3];
                if (z5 != null) {
                    computeSInt64Size = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(6, z5) + computeSInt64Size;
                }
                i3++;
            }
        }
        return computeSInt64Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeString(1, this.f5462a);
        codedOutputByteBufferNano.writeSInt32(2, this.f5463b);
        codedOutputByteBufferNano.writeSInt64(3, this.f5464c);
        if (!this.f5465d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f5465d);
        }
        int i2 = this.f5466e;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i2);
        }
        io.appmetrica.analytics.impl.Z5[] z5Arr = this.f5467f;
        if (z5Arr != null && z5Arr.length > 0) {
            int i3 = 0;
            while (true) {
                io.appmetrica.analytics.impl.Z5[] z5Arr2 = this.f5467f;
                if (i3 >= z5Arr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.Z5 z5 = z5Arr2[i3];
                if (z5 != null) {
                    codedOutputByteBufferNano.writeMessage(6, z5);
                }
                i3++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0220a6 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0220a6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0220a6 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f5462a = codedInputByteBufferNano.readString();
            } else if (readTag == 16) {
                this.f5463b = codedInputByteBufferNano.readSInt32();
            } else if (readTag == 24) {
                this.f5464c = codedInputByteBufferNano.readSInt64();
            } else if (readTag == 34) {
                this.f5465d = codedInputByteBufferNano.readString();
            } else if (readTag == 40) {
                this.f5466e = codedInputByteBufferNano.readUInt32();
            } else if (readTag != 50) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = io.appmetrica.analytics.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                io.appmetrica.analytics.impl.Z5[] z5Arr = this.f5467f;
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
                this.f5467f = z5Arr2;
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0220a6 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0220a6) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0220a6(), bArr);
    }
}
