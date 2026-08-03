package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Z8 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: j, reason: collision with root package name */
    public static final int f5386j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static final int f5387k = 1;

    /* renamed from: l, reason: collision with root package name */
    public static final int f5388l = 2;

    /* renamed from: m, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.Z8[] f5389m;

    /* renamed from: a, reason: collision with root package name */
    public double f5390a;

    /* renamed from: b, reason: collision with root package name */
    public double f5391b;

    /* renamed from: c, reason: collision with root package name */
    public long f5392c;

    /* renamed from: d, reason: collision with root package name */
    public int f5393d;

    /* renamed from: e, reason: collision with root package name */
    public int f5394e;

    /* renamed from: f, reason: collision with root package name */
    public int f5395f;

    /* renamed from: g, reason: collision with root package name */
    public int f5396g;

    /* renamed from: h, reason: collision with root package name */
    public int f5397h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f5398i;

    public Z8() {
        a();
    }

    public static io.appmetrica.analytics.impl.Z8[] b() {
        if (f5389m == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5389m == null) {
                        f5389m = new io.appmetrica.analytics.impl.Z8[0];
                    }
                } finally {
                }
            }
        }
        return f5389m;
    }

    public final io.appmetrica.analytics.impl.Z8 a() {
        this.f5390a = com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.f5391b = com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.f5392c = 0L;
        this.f5393d = 0;
        this.f5394e = 0;
        this.f5395f = 0;
        this.f5396g = 0;
        this.f5397h = 0;
        this.f5398i = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeDoubleSize = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeDoubleSize(2, this.f5391b) + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeDoubleSize(1, this.f5390a) + super.computeSerializedSize();
        long j2 = this.f5392c;
        if (j2 != 0) {
            computeDoubleSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt64Size(3, j2);
        }
        int i2 = this.f5393d;
        if (i2 != 0) {
            computeDoubleSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt32Size(4, i2);
        }
        int i3 = this.f5394e;
        if (i3 != 0) {
            computeDoubleSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt32Size(5, i3);
        }
        int i4 = this.f5395f;
        if (i4 != 0) {
            computeDoubleSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt32Size(6, i4);
        }
        int i5 = this.f5396g;
        if (i5 != 0) {
            computeDoubleSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(7, i5);
        }
        int i6 = this.f5397h;
        if (i6 != 0) {
            computeDoubleSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(8, i6);
        }
        return !this.f5398i.equals("") ? computeDoubleSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(9, this.f5398i) : computeDoubleSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeDouble(1, this.f5390a);
        codedOutputByteBufferNano.writeDouble(2, this.f5391b);
        long j2 = this.f5392c;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j2);
        }
        int i2 = this.f5393d;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(4, i2);
        }
        int i3 = this.f5394e;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i3);
        }
        int i4 = this.f5395f;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeUInt32(6, i4);
        }
        int i5 = this.f5396g;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeInt32(7, i5);
        }
        int i6 = this.f5397h;
        if (i6 != 0) {
            codedOutputByteBufferNano.writeInt32(8, i6);
        }
        if (!this.f5398i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.f5398i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.Z8 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.Z8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.Z8 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 9) {
                this.f5390a = codedInputByteBufferNano.readDouble();
            } else if (readTag == 17) {
                this.f5391b = codedInputByteBufferNano.readDouble();
            } else if (readTag == 24) {
                this.f5392c = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 32) {
                this.f5393d = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 40) {
                this.f5394e = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 48) {
                this.f5395f = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 56) {
                this.f5396g = codedInputByteBufferNano.readInt32();
            } else if (readTag == 64) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f5397h = readInt32;
                }
            } else if (readTag != 74) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f5398i = codedInputByteBufferNano.readString();
            }
        }
    }

    public static io.appmetrica.analytics.impl.Z8 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.Z8) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.Z8(), bArr);
    }
}
