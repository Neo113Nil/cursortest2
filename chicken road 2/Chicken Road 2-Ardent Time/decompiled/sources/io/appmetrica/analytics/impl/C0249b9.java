package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.b9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0249b9 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: n, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0249b9[] f5523n;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f5524a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f5525b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f5526c;

    /* renamed from: d, reason: collision with root package name */
    public int f5527d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f5528e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f5529f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5530g;

    /* renamed from: h, reason: collision with root package name */
    public int f5531h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f5532i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f5533j;

    /* renamed from: k, reason: collision with root package name */
    public int f5534k;

    /* renamed from: l, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0223a9[] f5535l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f5536m;

    public C0249b9() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0249b9[] b() {
        if (f5523n == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5523n == null) {
                        f5523n = new io.appmetrica.analytics.impl.C0249b9[0];
                    }
                } finally {
                }
            }
        }
        return f5523n;
    }

    public final io.appmetrica.analytics.impl.C0249b9 a() {
        this.f5524a = "";
        this.f5525b = "";
        this.f5526c = "";
        this.f5527d = 0;
        this.f5528e = "";
        this.f5529f = "";
        this.f5530g = false;
        this.f5531h = 0;
        this.f5532i = "";
        this.f5533j = "";
        this.f5534k = 0;
        this.f5535l = io.appmetrica.analytics.impl.C0223a9.b();
        this.f5536m = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f5524a.equals("")) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(1, this.f5524a);
        }
        if (!this.f5525b.equals("")) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(2, this.f5525b);
        }
        if (!this.f5526c.equals("")) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(4, this.f5526c);
        }
        int i2 = this.f5527d;
        if (i2 != 0) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt32Size(5, i2);
        }
        if (!this.f5528e.equals("")) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(10, this.f5528e);
        }
        if (!this.f5529f.equals("")) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(15, this.f5529f);
        }
        boolean z2 = this.f5530g;
        if (z2) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBoolSize(17, z2);
        }
        int i3 = this.f5531h;
        if (i3 != 0) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt32Size(18, i3);
        }
        if (!this.f5532i.equals("")) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(19, this.f5532i);
        }
        if (!this.f5533j.equals("")) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(21, this.f5533j);
        }
        int i4 = this.f5534k;
        if (i4 != 0) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt32Size(22, i4);
        }
        io.appmetrica.analytics.impl.C0223a9[] c0223a9Arr = this.f5535l;
        if (c0223a9Arr != null && c0223a9Arr.length > 0) {
            int i5 = 0;
            while (true) {
                io.appmetrica.analytics.impl.C0223a9[] c0223a9Arr2 = this.f5535l;
                if (i5 >= c0223a9Arr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.C0223a9 c0223a9 = c0223a9Arr2[i5];
                if (c0223a9 != null) {
                    computeSerializedSize = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(23, c0223a9) + computeSerializedSize;
                }
                i5++;
            }
        }
        return !this.f5536m.equals("") ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(24, this.f5536m) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f5524a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f5524a);
        }
        if (!this.f5525b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f5525b);
        }
        if (!this.f5526c.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f5526c);
        }
        int i2 = this.f5527d;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i2);
        }
        if (!this.f5528e.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f5528e);
        }
        if (!this.f5529f.equals("")) {
            codedOutputByteBufferNano.writeString(15, this.f5529f);
        }
        boolean z2 = this.f5530g;
        if (z2) {
            codedOutputByteBufferNano.writeBool(17, z2);
        }
        int i3 = this.f5531h;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeUInt32(18, i3);
        }
        if (!this.f5532i.equals("")) {
            codedOutputByteBufferNano.writeString(19, this.f5532i);
        }
        if (!this.f5533j.equals("")) {
            codedOutputByteBufferNano.writeString(21, this.f5533j);
        }
        int i4 = this.f5534k;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeUInt32(22, i4);
        }
        io.appmetrica.analytics.impl.C0223a9[] c0223a9Arr = this.f5535l;
        if (c0223a9Arr != null && c0223a9Arr.length > 0) {
            int i5 = 0;
            while (true) {
                io.appmetrica.analytics.impl.C0223a9[] c0223a9Arr2 = this.f5535l;
                if (i5 >= c0223a9Arr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.C0223a9 c0223a9 = c0223a9Arr2[i5];
                if (c0223a9 != null) {
                    codedOutputByteBufferNano.writeMessage(23, c0223a9);
                }
                i5++;
            }
        }
        if (!this.f5536m.equals("")) {
            codedOutputByteBufferNano.writeString(24, this.f5536m);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0249b9 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0249b9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0249b9 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 10:
                    this.f5524a = codedInputByteBufferNano.readString();
                    break;
                case 18:
                    this.f5525b = codedInputByteBufferNano.readString();
                    break;
                case 34:
                    this.f5526c = codedInputByteBufferNano.readString();
                    break;
                case io.appmetrica.analytics.impl.C0326e9.f5799L /* 40 */:
                    this.f5527d = codedInputByteBufferNano.readUInt32();
                    break;
                case 82:
                    this.f5528e = codedInputByteBufferNano.readString();
                    break;
                case 122:
                    this.f5529f = codedInputByteBufferNano.readString();
                    break;
                case 136:
                    this.f5530g = codedInputByteBufferNano.readBool();
                    break;
                case 144:
                    this.f5531h = codedInputByteBufferNano.readUInt32();
                    break;
                case 154:
                    this.f5532i = codedInputByteBufferNano.readString();
                    break;
                case 170:
                    this.f5533j = codedInputByteBufferNano.readString();
                    break;
                case 176:
                    this.f5534k = codedInputByteBufferNano.readUInt32();
                    break;
                case 186:
                    int repeatedFieldArrayLength = io.appmetrica.analytics.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 186);
                    io.appmetrica.analytics.impl.C0223a9[] c0223a9Arr = this.f5535l;
                    int length = c0223a9Arr == null ? 0 : c0223a9Arr.length;
                    int i2 = repeatedFieldArrayLength + length;
                    io.appmetrica.analytics.impl.C0223a9[] c0223a9Arr2 = new io.appmetrica.analytics.impl.C0223a9[i2];
                    if (length != 0) {
                        java.lang.System.arraycopy(c0223a9Arr, 0, c0223a9Arr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        io.appmetrica.analytics.impl.C0223a9 c0223a9 = new io.appmetrica.analytics.impl.C0223a9();
                        c0223a9Arr2[length] = c0223a9;
                        codedInputByteBufferNano.readMessage(c0223a9);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    io.appmetrica.analytics.impl.C0223a9 c0223a92 = new io.appmetrica.analytics.impl.C0223a9();
                    c0223a9Arr2[length] = c0223a92;
                    codedInputByteBufferNano.readMessage(c0223a92);
                    this.f5535l = c0223a9Arr2;
                    break;
                case 194:
                    this.f5536m = codedInputByteBufferNano.readString();
                    break;
                default:
                    if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        return this;
                    }
                    break;
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0249b9 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0249b9) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0249b9(), bArr);
    }
}
