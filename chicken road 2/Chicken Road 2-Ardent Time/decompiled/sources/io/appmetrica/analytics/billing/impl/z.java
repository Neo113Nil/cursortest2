package io.appmetrica.analytics.billing.impl;

/* loaded from: classes.dex */
public final class z extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: l, reason: collision with root package name */
    public static final int f3515l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f3516m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f3517n = 2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f3518o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f3519p = 2;

    /* renamed from: q, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.billing.impl.z[] f3520q;

    /* renamed from: a, reason: collision with root package name */
    public int f3521a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f3522b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f3523c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f3524d;

    /* renamed from: e, reason: collision with root package name */
    public io.appmetrica.analytics.billing.impl.u f3525e;

    /* renamed from: f, reason: collision with root package name */
    public long f3526f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3527g;

    /* renamed from: h, reason: collision with root package name */
    public int f3528h;

    /* renamed from: i, reason: collision with root package name */
    public int f3529i;

    /* renamed from: j, reason: collision with root package name */
    public io.appmetrica.analytics.billing.impl.y f3530j;

    /* renamed from: k, reason: collision with root package name */
    public io.appmetrica.analytics.billing.impl.x f3531k;

    public z() {
        a();
    }

    public static io.appmetrica.analytics.billing.impl.z[] b() {
        if (f3520q == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f3520q == null) {
                        f3520q = new io.appmetrica.analytics.billing.impl.z[0];
                    }
                } finally {
                }
            }
        }
        return f3520q;
    }

    public final io.appmetrica.analytics.billing.impl.z a() {
        this.f3521a = 1;
        byte[] bArr = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        this.f3522b = bArr;
        this.f3523c = bArr;
        this.f3524d = bArr;
        this.f3525e = null;
        this.f3526f = 0L;
        this.f3527g = false;
        this.f3528h = 0;
        this.f3529i = 1;
        this.f3530j = null;
        this.f3531k = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f3521a;
        if (i2 != 1) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt32Size(1, i2);
        }
        int computeBytesSize = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(3, this.f3522b) + computeSerializedSize;
        byte[] bArr = this.f3523c;
        byte[] bArr2 = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        if (!java.util.Arrays.equals(bArr, bArr2)) {
            computeBytesSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(4, this.f3523c);
        }
        if (!java.util.Arrays.equals(this.f3524d, bArr2)) {
            computeBytesSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(5, this.f3524d);
        }
        io.appmetrica.analytics.billing.impl.u uVar = this.f3525e;
        if (uVar != null) {
            computeBytesSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(6, uVar);
        }
        long j2 = this.f3526f;
        if (j2 != 0) {
            computeBytesSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt64Size(7, j2);
        }
        boolean z2 = this.f3527g;
        if (z2) {
            computeBytesSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBoolSize(8, z2);
        }
        int i3 = this.f3528h;
        if (i3 != 0) {
            computeBytesSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(9, i3);
        }
        int i4 = this.f3529i;
        if (i4 != 1) {
            computeBytesSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(10, i4);
        }
        io.appmetrica.analytics.billing.impl.y yVar = this.f3530j;
        if (yVar != null) {
            computeBytesSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(11, yVar);
        }
        io.appmetrica.analytics.billing.impl.x xVar = this.f3531k;
        return xVar != null ? computeBytesSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(12, xVar) : computeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i2 = this.f3521a;
        if (i2 != 1) {
            codedOutputByteBufferNano.writeUInt32(1, i2);
        }
        codedOutputByteBufferNano.writeBytes(3, this.f3522b);
        byte[] bArr = this.f3523c;
        byte[] bArr2 = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        if (!java.util.Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f3523c);
        }
        if (!java.util.Arrays.equals(this.f3524d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f3524d);
        }
        io.appmetrica.analytics.billing.impl.u uVar = this.f3525e;
        if (uVar != null) {
            codedOutputByteBufferNano.writeMessage(6, uVar);
        }
        long j2 = this.f3526f;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeInt64(7, j2);
        }
        boolean z2 = this.f3527g;
        if (z2) {
            codedOutputByteBufferNano.writeBool(8, z2);
        }
        int i3 = this.f3528h;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeInt32(9, i3);
        }
        int i4 = this.f3529i;
        if (i4 != 1) {
            codedOutputByteBufferNano.writeInt32(10, i4);
        }
        io.appmetrica.analytics.billing.impl.y yVar = this.f3530j;
        if (yVar != null) {
            codedOutputByteBufferNano.writeMessage(11, yVar);
        }
        io.appmetrica.analytics.billing.impl.x xVar = this.f3531k;
        if (xVar != null) {
            codedOutputByteBufferNano.writeMessage(12, xVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static io.appmetrica.analytics.billing.impl.z b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.billing.impl.z().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.billing.impl.z mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 8:
                    this.f3521a = codedInputByteBufferNano.readUInt32();
                    break;
                case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                    this.f3522b = codedInputByteBufferNano.readBytes();
                    break;
                case 34:
                    this.f3523c = codedInputByteBufferNano.readBytes();
                    break;
                case io.appmetrica.analytics.impl.C0326e9.f5800M /* 42 */:
                    this.f3524d = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f3525e == null) {
                        this.f3525e = new io.appmetrica.analytics.billing.impl.u();
                    }
                    codedInputByteBufferNano.readMessage(this.f3525e);
                    break;
                case 56:
                    this.f3526f = codedInputByteBufferNano.readInt64();
                    break;
                case 64:
                    this.f3527g = codedInputByteBufferNano.readBool();
                    break;
                case 72:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != 0 && readInt32 != 1 && readInt32 != 2) {
                        break;
                    } else {
                        this.f3528h = readInt32;
                        break;
                    }
                case 80:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != 1 && readInt322 != 2) {
                        break;
                    } else {
                        this.f3529i = readInt322;
                        break;
                    }
                case io.appmetrica.analytics.AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    if (this.f3530j == null) {
                        this.f3530j = new io.appmetrica.analytics.billing.impl.y();
                    }
                    codedInputByteBufferNano.readMessage(this.f3530j);
                    break;
                case 98:
                    if (this.f3531k == null) {
                        this.f3531k = new io.appmetrica.analytics.billing.impl.x();
                    }
                    codedInputByteBufferNano.readMessage(this.f3531k);
                    break;
                default:
                    if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        return this;
                    }
                    break;
            }
        }
    }

    public static io.appmetrica.analytics.billing.impl.z a(byte[] bArr) {
        return (io.appmetrica.analytics.billing.impl.z) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.billing.impl.z(), bArr);
    }
}
