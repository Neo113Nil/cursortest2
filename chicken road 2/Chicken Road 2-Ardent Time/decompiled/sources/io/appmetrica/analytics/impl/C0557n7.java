package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.n7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0557n7 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: k, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0557n7[] f6463k;

    /* renamed from: a, reason: collision with root package name */
    public int f6464a;

    /* renamed from: b, reason: collision with root package name */
    public double f6465b;

    /* renamed from: c, reason: collision with root package name */
    public double f6466c;

    /* renamed from: d, reason: collision with root package name */
    public int f6467d;

    /* renamed from: e, reason: collision with root package name */
    public int f6468e;

    /* renamed from: f, reason: collision with root package name */
    public int f6469f;

    /* renamed from: g, reason: collision with root package name */
    public int f6470g;

    /* renamed from: h, reason: collision with root package name */
    public long f6471h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f6472i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f6473j;

    public C0557n7() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0557n7[] b() {
        if (f6463k == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6463k == null) {
                        f6463k = new io.appmetrica.analytics.impl.C0557n7[0];
                    }
                } finally {
                }
            }
        }
        return f6463k;
    }

    public final io.appmetrica.analytics.impl.C0557n7 a() {
        this.f6464a = -1;
        this.f6465b = -1.0d;
        this.f6466c = -1.0d;
        this.f6467d = -1;
        this.f6468e = -1;
        this.f6469f = -1;
        this.f6470g = -1;
        this.f6471h = -1L;
        this.f6472i = "";
        this.f6473j = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f6464a;
        if (i2 != -1) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(1, i2);
        }
        if (java.lang.Double.doubleToLongBits(this.f6465b) != java.lang.Double.doubleToLongBits(-1.0d)) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeDoubleSize(2, this.f6465b);
        }
        if (java.lang.Double.doubleToLongBits(this.f6466c) != java.lang.Double.doubleToLongBits(-1.0d)) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeDoubleSize(3, this.f6466c);
        }
        int i3 = this.f6467d;
        if (i3 != -1) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(4, i3);
        }
        int i4 = this.f6468e;
        if (i4 != -1) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(5, i4);
        }
        int i5 = this.f6469f;
        if (i5 != -1) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(6, i5);
        }
        int i6 = this.f6470g;
        if (i6 != -1) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(7, i6);
        }
        long j2 = this.f6471h;
        if (j2 != -1) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt64Size(8, j2);
        }
        if (!this.f6472i.equals("")) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(9, this.f6472i);
        }
        return !this.f6473j.equals("") ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(10, this.f6473j) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i2 = this.f6464a;
        if (i2 != -1) {
            codedOutputByteBufferNano.writeInt32(1, i2);
        }
        if (java.lang.Double.doubleToLongBits(this.f6465b) != java.lang.Double.doubleToLongBits(-1.0d)) {
            codedOutputByteBufferNano.writeDouble(2, this.f6465b);
        }
        if (java.lang.Double.doubleToLongBits(this.f6466c) != java.lang.Double.doubleToLongBits(-1.0d)) {
            codedOutputByteBufferNano.writeDouble(3, this.f6466c);
        }
        int i3 = this.f6467d;
        if (i3 != -1) {
            codedOutputByteBufferNano.writeInt32(4, i3);
        }
        int i4 = this.f6468e;
        if (i4 != -1) {
            codedOutputByteBufferNano.writeInt32(5, i4);
        }
        int i5 = this.f6469f;
        if (i5 != -1) {
            codedOutputByteBufferNano.writeInt32(6, i5);
        }
        int i6 = this.f6470g;
        if (i6 != -1) {
            codedOutputByteBufferNano.writeInt32(7, i6);
        }
        long j2 = this.f6471h;
        if (j2 != -1) {
            codedOutputByteBufferNano.writeInt64(8, j2);
        }
        if (!this.f6472i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.f6472i);
        }
        if (!this.f6473j.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f6473j);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0557n7 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0557n7().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0557n7 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 8:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != -1 && readInt32 != 0 && readInt32 != 1) {
                        break;
                    } else {
                        this.f6464a = readInt32;
                        break;
                    }
                case 17:
                    this.f6465b = codedInputByteBufferNano.readDouble();
                    break;
                case io.appmetrica.analytics.impl.C0326e9.f5794F /* 25 */:
                    this.f6466c = codedInputByteBufferNano.readDouble();
                    break;
                case 32:
                    this.f6467d = codedInputByteBufferNano.readInt32();
                    break;
                case io.appmetrica.analytics.impl.C0326e9.f5799L /* 40 */:
                    this.f6468e = codedInputByteBufferNano.readInt32();
                    break;
                case 48:
                    this.f6469f = codedInputByteBufferNano.readInt32();
                    break;
                case 56:
                    this.f6470g = codedInputByteBufferNano.readInt32();
                    break;
                case 64:
                    this.f6471h = codedInputByteBufferNano.readInt64();
                    break;
                case 74:
                    this.f6472i = codedInputByteBufferNano.readString();
                    break;
                case 82:
                    this.f6473j = codedInputByteBufferNano.readString();
                    break;
                default:
                    if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        return this;
                    }
                    break;
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0557n7 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0557n7) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0557n7(), bArr);
    }
}
