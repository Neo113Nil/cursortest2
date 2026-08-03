package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class V1 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f5101c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f5102d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f5103e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f5104f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final int f5105g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static final int f5106h = 5;

    /* renamed from: i, reason: collision with root package name */
    public static final int f5107i = 6;

    /* renamed from: j, reason: collision with root package name */
    public static final int f5108j = -1;

    /* renamed from: k, reason: collision with root package name */
    public static final int f5109k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static final int f5110l = 1;

    /* renamed from: m, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.V1[] f5111m;

    /* renamed from: a, reason: collision with root package name */
    public int f5112a;

    /* renamed from: b, reason: collision with root package name */
    public int f5113b;

    public V1() {
        a();
    }

    public static io.appmetrica.analytics.impl.V1[] b() {
        if (f5111m == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5111m == null) {
                        f5111m = new io.appmetrica.analytics.impl.V1[0];
                    }
                } finally {
                }
            }
        }
        return f5111m;
    }

    public final io.appmetrica.analytics.impl.V1 a() {
        this.f5112a = 0;
        this.f5113b = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(3, this.f5113b) + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(2, this.f5112a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeInt32(2, this.f5112a);
        codedOutputByteBufferNano.writeInt32(3, this.f5113b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.V1 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 16) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                switch (readInt32) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        this.f5112a = readInt32;
                        break;
                }
            } else if (readTag != 24) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt322 = codedInputByteBufferNano.readInt32();
                if (readInt322 == -1 || readInt322 == 0 || readInt322 == 1) {
                    this.f5113b = readInt322;
                }
            }
        }
    }

    public static io.appmetrica.analytics.impl.V1 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.V1().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.V1 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.V1) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.V1(), bArr);
    }
}
