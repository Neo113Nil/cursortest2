package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.m7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0531m7 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: s, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0531m7[] f6393s;

    /* renamed from: a, reason: collision with root package name */
    public int f6394a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f6395b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f6396c;

    /* renamed from: d, reason: collision with root package name */
    public long f6397d;

    /* renamed from: e, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0557n7 f6398e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f6399f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f6400g;

    /* renamed from: h, reason: collision with root package name */
    public long f6401h;

    /* renamed from: i, reason: collision with root package name */
    public int f6402i;

    /* renamed from: j, reason: collision with root package name */
    public int f6403j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f6404k;

    /* renamed from: l, reason: collision with root package name */
    public int f6405l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f6406m;

    /* renamed from: n, reason: collision with root package name */
    public int f6407n;

    /* renamed from: o, reason: collision with root package name */
    public int f6408o;

    /* renamed from: p, reason: collision with root package name */
    public int f6409p;

    /* renamed from: q, reason: collision with root package name */
    public int f6410q;

    /* renamed from: r, reason: collision with root package name */
    public byte[] f6411r;

    public C0531m7() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0531m7[] b() {
        if (f6393s == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6393s == null) {
                        f6393s = new io.appmetrica.analytics.impl.C0531m7[0];
                    }
                } finally {
                }
            }
        }
        return f6393s;
    }

    public final io.appmetrica.analytics.impl.C0531m7 a() {
        this.f6394a = -1;
        this.f6395b = "";
        this.f6396c = "";
        this.f6397d = -1L;
        this.f6398e = null;
        this.f6399f = "";
        this.f6400g = "";
        this.f6401h = -1L;
        this.f6402i = -1;
        this.f6403j = -1;
        this.f6404k = "";
        this.f6405l = -1;
        this.f6406m = "";
        this.f6407n = -1;
        this.f6408o = -1;
        this.f6409p = -1;
        this.f6410q = -1;
        this.f6411r = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f6394a;
        if (i2 != -1) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(1, i2);
        }
        if (!this.f6395b.equals("")) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(2, this.f6395b);
        }
        if (!this.f6396c.equals("")) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(3, this.f6396c);
        }
        long j2 = this.f6397d;
        if (j2 != -1) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt64Size(4, j2);
        }
        io.appmetrica.analytics.impl.C0557n7 c0557n7 = this.f6398e;
        if (c0557n7 != null) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(5, c0557n7);
        }
        if (!this.f6399f.equals("")) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(6, this.f6399f);
        }
        if (!this.f6400g.equals("")) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(7, this.f6400g);
        }
        long j3 = this.f6401h;
        if (j3 != -1) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt64Size(8, j3);
        }
        int i3 = this.f6402i;
        if (i3 != -1) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(9, i3);
        }
        int i4 = this.f6403j;
        if (i4 != -1) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(10, i4);
        }
        if (!this.f6404k.equals("")) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(11, this.f6404k);
        }
        int i5 = this.f6405l;
        if (i5 != -1) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(12, i5);
        }
        if (!this.f6406m.equals("")) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(13, this.f6406m);
        }
        int i6 = this.f6407n;
        if (i6 != -1) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(14, i6);
        }
        int i7 = this.f6408o;
        if (i7 != -1) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(15, i7);
        }
        int i8 = this.f6409p;
        if (i8 != -1) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(16, i8);
        }
        int i9 = this.f6410q;
        if (i9 != -1) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(17, i9);
        }
        return !java.util.Arrays.equals(this.f6411r, io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(18, this.f6411r) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i2 = this.f6394a;
        if (i2 != -1) {
            codedOutputByteBufferNano.writeInt32(1, i2);
        }
        if (!this.f6395b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f6395b);
        }
        if (!this.f6396c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f6396c);
        }
        long j2 = this.f6397d;
        if (j2 != -1) {
            codedOutputByteBufferNano.writeInt64(4, j2);
        }
        io.appmetrica.analytics.impl.C0557n7 c0557n7 = this.f6398e;
        if (c0557n7 != null) {
            codedOutputByteBufferNano.writeMessage(5, c0557n7);
        }
        if (!this.f6399f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f6399f);
        }
        if (!this.f6400g.equals("")) {
            codedOutputByteBufferNano.writeString(7, this.f6400g);
        }
        long j3 = this.f6401h;
        if (j3 != -1) {
            codedOutputByteBufferNano.writeInt64(8, j3);
        }
        int i3 = this.f6402i;
        if (i3 != -1) {
            codedOutputByteBufferNano.writeInt32(9, i3);
        }
        int i4 = this.f6403j;
        if (i4 != -1) {
            codedOutputByteBufferNano.writeInt32(10, i4);
        }
        if (!this.f6404k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.f6404k);
        }
        int i5 = this.f6405l;
        if (i5 != -1) {
            codedOutputByteBufferNano.writeInt32(12, i5);
        }
        if (!this.f6406m.equals("")) {
            codedOutputByteBufferNano.writeString(13, this.f6406m);
        }
        int i6 = this.f6407n;
        if (i6 != -1) {
            codedOutputByteBufferNano.writeInt32(14, i6);
        }
        int i7 = this.f6408o;
        if (i7 != -1) {
            codedOutputByteBufferNano.writeInt32(15, i7);
        }
        int i8 = this.f6409p;
        if (i8 != -1) {
            codedOutputByteBufferNano.writeInt32(16, i8);
        }
        int i9 = this.f6410q;
        if (i9 != -1) {
            codedOutputByteBufferNano.writeInt32(17, i9);
        }
        if (!java.util.Arrays.equals(this.f6411r, io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(18, this.f6411r);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0531m7 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0531m7().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0531m7 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 8:
                    this.f6394a = codedInputByteBufferNano.readInt32();
                    break;
                case 18:
                    this.f6395b = codedInputByteBufferNano.readString();
                    break;
                case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                    this.f6396c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    this.f6397d = codedInputByteBufferNano.readInt64();
                    break;
                case io.appmetrica.analytics.impl.C0326e9.f5800M /* 42 */:
                    if (this.f6398e == null) {
                        this.f6398e = new io.appmetrica.analytics.impl.C0557n7();
                    }
                    codedInputByteBufferNano.readMessage(this.f6398e);
                    break;
                case 50:
                    this.f6399f = codedInputByteBufferNano.readString();
                    break;
                case 58:
                    this.f6400g = codedInputByteBufferNano.readString();
                    break;
                case 64:
                    this.f6401h = codedInputByteBufferNano.readInt64();
                    break;
                case 72:
                    this.f6402i = codedInputByteBufferNano.readInt32();
                    break;
                case 80:
                    this.f6403j = codedInputByteBufferNano.readInt32();
                    break;
                case io.appmetrica.analytics.AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    this.f6404k = codedInputByteBufferNano.readString();
                    break;
                case 96:
                    this.f6405l = codedInputByteBufferNano.readInt32();
                    break;
                case 106:
                    this.f6406m = codedInputByteBufferNano.readString();
                    break;
                case 112:
                    this.f6407n = codedInputByteBufferNano.readInt32();
                    break;
                case 120:
                    this.f6408o = codedInputByteBufferNano.readInt32();
                    break;
                case 128:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != -1 && readInt32 != 0 && readInt32 != 1) {
                        break;
                    } else {
                        this.f6409p = readInt32;
                        break;
                    }
                case 136:
                    this.f6410q = codedInputByteBufferNano.readInt32();
                    break;
                case 146:
                    this.f6411r = codedInputByteBufferNano.readBytes();
                    break;
                default:
                    if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        return this;
                    }
                    break;
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0531m7 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0531m7) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0531m7(), bArr);
    }
}
