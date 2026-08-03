package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.og, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0592og extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static final int f6588e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f6589f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f6590g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0592og[] f6591h;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f6592a;

    /* renamed from: b, reason: collision with root package name */
    public long f6593b;

    /* renamed from: c, reason: collision with root package name */
    public long f6594c;

    /* renamed from: d, reason: collision with root package name */
    public int f6595d;

    public C0592og() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0592og[] b() {
        if (f6591h == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6591h == null) {
                        f6591h = new io.appmetrica.analytics.impl.C0592og[0];
                    }
                } finally {
                }
            }
        }
        return f6591h;
    }

    public final io.appmetrica.analytics.impl.C0592og a() {
        this.f6592a = "";
        this.f6593b = 0L;
        this.f6594c = 0L;
        this.f6595d = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f6592a.equals("")) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(1, this.f6592a);
        }
        long j2 = this.f6593b;
        if (j2 != 0) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt64Size(2, j2);
        }
        long j3 = this.f6594c;
        if (j3 != 0) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt64Size(3, j3);
        }
        int i2 = this.f6595d;
        return i2 != 0 ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(4, i2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f6592a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f6592a);
        }
        long j2 = this.f6593b;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j2);
        }
        long j3 = this.f6594c;
        if (j3 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j3);
        }
        int i2 = this.f6595d;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(4, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0592og mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f6592a = codedInputByteBufferNano.readString();
            } else if (readTag == 16) {
                this.f6593b = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 24) {
                this.f6594c = codedInputByteBufferNano.readUInt64();
            } else if (readTag != 32) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f6595d = readInt32;
                }
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0592og b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0592og().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0592og a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0592og) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0592og(), bArr);
    }
}
