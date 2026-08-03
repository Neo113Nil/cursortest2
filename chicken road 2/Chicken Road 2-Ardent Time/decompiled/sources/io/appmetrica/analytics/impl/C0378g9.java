package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.g9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0378g9 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static final int f5967d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f5968e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f5969f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f5970g = 3;

    /* renamed from: h, reason: collision with root package name */
    public static final int f5971h = 4;

    /* renamed from: i, reason: collision with root package name */
    public static final int f5972i = 5;

    /* renamed from: j, reason: collision with root package name */
    public static final int f5973j = 6;

    /* renamed from: k, reason: collision with root package name */
    public static final int f5974k = 7;

    /* renamed from: l, reason: collision with root package name */
    public static final int f5975l = 8;

    /* renamed from: m, reason: collision with root package name */
    public static final int f5976m = 9;

    /* renamed from: n, reason: collision with root package name */
    public static final int f5977n = 10;

    /* renamed from: o, reason: collision with root package name */
    public static final int f5978o = 11;

    /* renamed from: p, reason: collision with root package name */
    public static final int f5979p = 12;

    /* renamed from: q, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0378g9[] f5980q;

    /* renamed from: a, reason: collision with root package name */
    public long f5981a;

    /* renamed from: b, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0352f9 f5982b;

    /* renamed from: c, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0326e9[] f5983c;

    public C0378g9() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0378g9[] b() {
        if (f5980q == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5980q == null) {
                        f5980q = new io.appmetrica.analytics.impl.C0378g9[0];
                    }
                } finally {
                }
            }
        }
        return f5980q;
    }

    public final io.appmetrica.analytics.impl.C0378g9 a() {
        this.f5981a = 0L;
        this.f5982b = null;
        this.f5983c = io.appmetrica.analytics.impl.C0326e9.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeUInt64Size = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt64Size(1, this.f5981a) + super.computeSerializedSize();
        io.appmetrica.analytics.impl.C0352f9 c0352f9 = this.f5982b;
        if (c0352f9 != null) {
            computeUInt64Size += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(2, c0352f9);
        }
        io.appmetrica.analytics.impl.C0326e9[] c0326e9Arr = this.f5983c;
        if (c0326e9Arr != null && c0326e9Arr.length > 0) {
            int i2 = 0;
            while (true) {
                io.appmetrica.analytics.impl.C0326e9[] c0326e9Arr2 = this.f5983c;
                if (i2 >= c0326e9Arr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.C0326e9 c0326e9 = c0326e9Arr2[i2];
                if (c0326e9 != null) {
                    computeUInt64Size = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(3, c0326e9) + computeUInt64Size;
                }
                i2++;
            }
        }
        return computeUInt64Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeUInt64(1, this.f5981a);
        io.appmetrica.analytics.impl.C0352f9 c0352f9 = this.f5982b;
        if (c0352f9 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0352f9);
        }
        io.appmetrica.analytics.impl.C0326e9[] c0326e9Arr = this.f5983c;
        if (c0326e9Arr != null && c0326e9Arr.length > 0) {
            int i2 = 0;
            while (true) {
                io.appmetrica.analytics.impl.C0326e9[] c0326e9Arr2 = this.f5983c;
                if (i2 >= c0326e9Arr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.C0326e9 c0326e9 = c0326e9Arr2[i2];
                if (c0326e9 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c0326e9);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0378g9 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f5981a = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 18) {
                if (this.f5982b == null) {
                    this.f5982b = new io.appmetrica.analytics.impl.C0352f9();
                }
                codedInputByteBufferNano.readMessage(this.f5982b);
            } else if (readTag != 26) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = io.appmetrica.analytics.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                io.appmetrica.analytics.impl.C0326e9[] c0326e9Arr = this.f5983c;
                int length = c0326e9Arr == null ? 0 : c0326e9Arr.length;
                int i2 = repeatedFieldArrayLength + length;
                io.appmetrica.analytics.impl.C0326e9[] c0326e9Arr2 = new io.appmetrica.analytics.impl.C0326e9[i2];
                if (length != 0) {
                    java.lang.System.arraycopy(c0326e9Arr, 0, c0326e9Arr2, 0, length);
                }
                while (length < i2 - 1) {
                    io.appmetrica.analytics.impl.C0326e9 c0326e9 = new io.appmetrica.analytics.impl.C0326e9();
                    c0326e9Arr2[length] = c0326e9;
                    codedInputByteBufferNano.readMessage(c0326e9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                io.appmetrica.analytics.impl.C0326e9 c0326e92 = new io.appmetrica.analytics.impl.C0326e9();
                c0326e9Arr2[length] = c0326e92;
                codedInputByteBufferNano.readMessage(c0326e92);
                this.f5983c = c0326e9Arr2;
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0378g9 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0378g9().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0378g9 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0378g9) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0378g9(), bArr);
    }
}
