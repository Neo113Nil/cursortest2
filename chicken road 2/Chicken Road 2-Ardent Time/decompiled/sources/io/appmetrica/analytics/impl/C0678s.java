package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0678s extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: l, reason: collision with root package name */
    public static final int f6763l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f6764m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f6765n = 2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f6766o = 3;

    /* renamed from: p, reason: collision with root package name */
    public static final int f6767p = 4;

    /* renamed from: q, reason: collision with root package name */
    public static final int f6768q = 5;

    /* renamed from: r, reason: collision with root package name */
    public static final int f6769r = 6;

    /* renamed from: s, reason: collision with root package name */
    public static final int f6770s = 7;
    public static volatile io.appmetrica.analytics.impl.C0678s[] t;

    /* renamed from: u, reason: collision with root package name */
    public static byte[] f6771u;

    /* renamed from: v, reason: collision with root package name */
    public static volatile boolean f6772v;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f6773a;

    /* renamed from: b, reason: collision with root package name */
    public io.appmetrica.analytics.impl.r f6774b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f6775c;

    /* renamed from: d, reason: collision with root package name */
    public int f6776d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f6777e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f6778f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f6779g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f6780h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f6781i;

    /* renamed from: j, reason: collision with root package name */
    public byte[] f6782j;

    /* renamed from: k, reason: collision with root package name */
    public byte[] f6783k;

    public C0678s() {
        if (!f6772v) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!f6772v) {
                        f6771u = io.appmetrica.analytics.protobuf.nano.InternalNano.bytesDefaultValue("manual");
                        f6772v = true;
                    }
                } finally {
                }
            }
        }
        a();
    }

    public static io.appmetrica.analytics.impl.C0678s[] b() {
        if (t == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (t == null) {
                        t = new io.appmetrica.analytics.impl.C0678s[0];
                    }
                } finally {
                }
            }
        }
        return t;
    }

    public final io.appmetrica.analytics.impl.C0678s a() {
        this.f6773a = (byte[]) f6771u.clone();
        this.f6774b = null;
        byte[] bArr = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        this.f6775c = bArr;
        this.f6776d = 0;
        this.f6777e = bArr;
        this.f6778f = bArr;
        this.f6779g = bArr;
        this.f6780h = bArr;
        this.f6781i = bArr;
        this.f6782j = bArr;
        this.f6783k = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!java.util.Arrays.equals(this.f6773a, f6771u)) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(1, this.f6773a);
        }
        io.appmetrica.analytics.impl.r rVar = this.f6774b;
        if (rVar != null) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(2, rVar);
        }
        byte[] bArr = this.f6775c;
        byte[] bArr2 = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        if (!java.util.Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(3, this.f6775c);
        }
        int i2 = this.f6776d;
        if (i2 != 0) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(4, i2);
        }
        if (!java.util.Arrays.equals(this.f6777e, bArr2)) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(5, this.f6777e);
        }
        if (!java.util.Arrays.equals(this.f6778f, bArr2)) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(6, this.f6778f);
        }
        if (!java.util.Arrays.equals(this.f6779g, bArr2)) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(7, this.f6779g);
        }
        if (!java.util.Arrays.equals(this.f6780h, bArr2)) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(8, this.f6780h);
        }
        if (!java.util.Arrays.equals(this.f6781i, bArr2)) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(9, this.f6781i);
        }
        if (!java.util.Arrays.equals(this.f6782j, bArr2)) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(10, this.f6782j);
        }
        return !java.util.Arrays.equals(this.f6783k, bArr2) ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(11, this.f6783k) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!java.util.Arrays.equals(this.f6773a, f6771u)) {
            codedOutputByteBufferNano.writeBytes(1, this.f6773a);
        }
        io.appmetrica.analytics.impl.r rVar = this.f6774b;
        if (rVar != null) {
            codedOutputByteBufferNano.writeMessage(2, rVar);
        }
        byte[] bArr = this.f6775c;
        byte[] bArr2 = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        if (!java.util.Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f6775c);
        }
        int i2 = this.f6776d;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(4, i2);
        }
        if (!java.util.Arrays.equals(this.f6777e, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f6777e);
        }
        if (!java.util.Arrays.equals(this.f6778f, bArr2)) {
            codedOutputByteBufferNano.writeBytes(6, this.f6778f);
        }
        if (!java.util.Arrays.equals(this.f6779g, bArr2)) {
            codedOutputByteBufferNano.writeBytes(7, this.f6779g);
        }
        if (!java.util.Arrays.equals(this.f6780h, bArr2)) {
            codedOutputByteBufferNano.writeBytes(8, this.f6780h);
        }
        if (!java.util.Arrays.equals(this.f6781i, bArr2)) {
            codedOutputByteBufferNano.writeBytes(9, this.f6781i);
        }
        if (!java.util.Arrays.equals(this.f6782j, bArr2)) {
            codedOutputByteBufferNano.writeBytes(10, this.f6782j);
        }
        if (!java.util.Arrays.equals(this.f6783k, bArr2)) {
            codedOutputByteBufferNano.writeBytes(11, this.f6783k);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0678s b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0678s().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0678s mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 10:
                    this.f6773a = codedInputByteBufferNano.readBytes();
                    break;
                case 18:
                    if (this.f6774b == null) {
                        this.f6774b = new io.appmetrica.analytics.impl.r();
                    }
                    codedInputByteBufferNano.readMessage(this.f6774b);
                    break;
                case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                    this.f6775c = codedInputByteBufferNano.readBytes();
                    break;
                case 32:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    switch (readInt32) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.f6776d = readInt32;
                            break;
                    }
                case io.appmetrica.analytics.impl.C0326e9.f5800M /* 42 */:
                    this.f6777e = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    this.f6778f = codedInputByteBufferNano.readBytes();
                    break;
                case 58:
                    this.f6779g = codedInputByteBufferNano.readBytes();
                    break;
                case 66:
                    this.f6780h = codedInputByteBufferNano.readBytes();
                    break;
                case 74:
                    this.f6781i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    this.f6782j = codedInputByteBufferNano.readBytes();
                    break;
                case io.appmetrica.analytics.AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    this.f6783k = codedInputByteBufferNano.readBytes();
                    break;
                default:
                    if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        return this;
                    }
                    break;
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0678s a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0678s) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0678s(), bArr);
    }
}
