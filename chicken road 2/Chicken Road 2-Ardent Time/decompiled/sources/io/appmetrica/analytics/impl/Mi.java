package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Mi extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: l, reason: collision with root package name */
    public static final int f4676l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f4677m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f4678n = 2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f4679o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f4680p = 2;

    /* renamed from: q, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.Mi[] f4681q;

    /* renamed from: a, reason: collision with root package name */
    public int f4682a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f4683b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f4684c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f4685d;

    /* renamed from: e, reason: collision with root package name */
    public io.appmetrica.analytics.impl.Hi f4686e;

    /* renamed from: f, reason: collision with root package name */
    public long f4687f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4688g;

    /* renamed from: h, reason: collision with root package name */
    public int f4689h;

    /* renamed from: i, reason: collision with root package name */
    public int f4690i;

    /* renamed from: j, reason: collision with root package name */
    public io.appmetrica.analytics.impl.Li f4691j;

    /* renamed from: k, reason: collision with root package name */
    public io.appmetrica.analytics.impl.Ki f4692k;

    public Mi() {
        a();
    }

    public static io.appmetrica.analytics.impl.Mi[] b() {
        if (f4681q == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f4681q == null) {
                        f4681q = new io.appmetrica.analytics.impl.Mi[0];
                    }
                } finally {
                }
            }
        }
        return f4681q;
    }

    public final io.appmetrica.analytics.impl.Mi a() {
        this.f4682a = 1;
        byte[] bArr = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        this.f4683b = bArr;
        this.f4684c = bArr;
        this.f4685d = bArr;
        this.f4686e = null;
        this.f4687f = 0L;
        this.f4688g = false;
        this.f4689h = 0;
        this.f4690i = 1;
        this.f4691j = null;
        this.f4692k = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f4682a;
        if (i2 != 1) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt32Size(1, i2);
        }
        int computeBytesSize = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(3, this.f4683b) + computeSerializedSize;
        byte[] bArr = this.f4684c;
        byte[] bArr2 = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        if (!java.util.Arrays.equals(bArr, bArr2)) {
            computeBytesSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(4, this.f4684c);
        }
        if (!java.util.Arrays.equals(this.f4685d, bArr2)) {
            computeBytesSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(5, this.f4685d);
        }
        io.appmetrica.analytics.impl.Hi hi = this.f4686e;
        if (hi != null) {
            computeBytesSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(6, hi);
        }
        long j2 = this.f4687f;
        if (j2 != 0) {
            computeBytesSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt64Size(7, j2);
        }
        boolean z2 = this.f4688g;
        if (z2) {
            computeBytesSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBoolSize(8, z2);
        }
        int i3 = this.f4689h;
        if (i3 != 0) {
            computeBytesSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(9, i3);
        }
        int i4 = this.f4690i;
        if (i4 != 1) {
            computeBytesSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(10, i4);
        }
        io.appmetrica.analytics.impl.Li li = this.f4691j;
        if (li != null) {
            computeBytesSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(11, li);
        }
        io.appmetrica.analytics.impl.Ki ki = this.f4692k;
        return ki != null ? computeBytesSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(12, ki) : computeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i2 = this.f4682a;
        if (i2 != 1) {
            codedOutputByteBufferNano.writeUInt32(1, i2);
        }
        codedOutputByteBufferNano.writeBytes(3, this.f4683b);
        byte[] bArr = this.f4684c;
        byte[] bArr2 = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        if (!java.util.Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f4684c);
        }
        if (!java.util.Arrays.equals(this.f4685d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f4685d);
        }
        io.appmetrica.analytics.impl.Hi hi = this.f4686e;
        if (hi != null) {
            codedOutputByteBufferNano.writeMessage(6, hi);
        }
        long j2 = this.f4687f;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeInt64(7, j2);
        }
        boolean z2 = this.f4688g;
        if (z2) {
            codedOutputByteBufferNano.writeBool(8, z2);
        }
        int i3 = this.f4689h;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeInt32(9, i3);
        }
        int i4 = this.f4690i;
        if (i4 != 1) {
            codedOutputByteBufferNano.writeInt32(10, i4);
        }
        io.appmetrica.analytics.impl.Li li = this.f4691j;
        if (li != null) {
            codedOutputByteBufferNano.writeMessage(11, li);
        }
        io.appmetrica.analytics.impl.Ki ki = this.f4692k;
        if (ki != null) {
            codedOutputByteBufferNano.writeMessage(12, ki);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.Mi b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.Mi().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.Mi mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 8:
                    this.f4682a = codedInputByteBufferNano.readUInt32();
                    break;
                case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                    this.f4683b = codedInputByteBufferNano.readBytes();
                    break;
                case 34:
                    this.f4684c = codedInputByteBufferNano.readBytes();
                    break;
                case io.appmetrica.analytics.impl.C0326e9.f5800M /* 42 */:
                    this.f4685d = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f4686e == null) {
                        this.f4686e = new io.appmetrica.analytics.impl.Hi();
                    }
                    codedInputByteBufferNano.readMessage(this.f4686e);
                    break;
                case 56:
                    this.f4687f = codedInputByteBufferNano.readInt64();
                    break;
                case 64:
                    this.f4688g = codedInputByteBufferNano.readBool();
                    break;
                case 72:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != 0 && readInt32 != 1 && readInt32 != 2) {
                        break;
                    } else {
                        this.f4689h = readInt32;
                        break;
                    }
                case 80:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != 1 && readInt322 != 2) {
                        break;
                    } else {
                        this.f4690i = readInt322;
                        break;
                    }
                case io.appmetrica.analytics.AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    if (this.f4691j == null) {
                        this.f4691j = new io.appmetrica.analytics.impl.Li();
                    }
                    codedInputByteBufferNano.readMessage(this.f4691j);
                    break;
                case 98:
                    if (this.f4692k == null) {
                        this.f4692k = new io.appmetrica.analytics.impl.Ki();
                    }
                    codedInputByteBufferNano.readMessage(this.f4692k);
                    break;
                default:
                    if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        return this;
                    }
                    break;
            }
        }
    }

    public static io.appmetrica.analytics.impl.Mi a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.Mi) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.Mi(), bArr);
    }
}
