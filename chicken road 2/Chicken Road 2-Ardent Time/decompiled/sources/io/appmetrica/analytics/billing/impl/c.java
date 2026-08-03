package io.appmetrica.analytics.billing.impl;

/* loaded from: classes.dex */
public final class c extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.billing.impl.c[] f3452f;

    /* renamed from: a, reason: collision with root package name */
    public int f3453a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f3454b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f3455c;

    /* renamed from: d, reason: collision with root package name */
    public long f3456d;

    /* renamed from: e, reason: collision with root package name */
    public long f3457e;

    public c() {
        a();
    }

    public static io.appmetrica.analytics.billing.impl.c[] b() {
        if (f3452f == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f3452f == null) {
                        f3452f = new io.appmetrica.analytics.billing.impl.c[0];
                    }
                } finally {
                }
            }
        }
        return f3452f;
    }

    public final io.appmetrica.analytics.billing.impl.c a() {
        this.f3453a = 1;
        this.f3454b = "";
        this.f3455c = "";
        this.f3456d = 0L;
        this.f3457e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt64Size(5, this.f3457e) + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt64Size(4, this.f3456d) + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(3, this.f3455c) + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(2, this.f3454b) + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(1, this.f3453a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeInt32(1, this.f3453a);
        codedOutputByteBufferNano.writeString(2, this.f3454b);
        codedOutputByteBufferNano.writeString(3, this.f3455c);
        codedOutputByteBufferNano.writeUInt64(4, this.f3456d);
        codedOutputByteBufferNano.writeUInt64(5, this.f3457e);
        super.writeTo(codedOutputByteBufferNano);
    }

    public static io.appmetrica.analytics.billing.impl.c b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.billing.impl.c().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.billing.impl.c mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f3453a = readInt32;
                }
            } else if (readTag == 18) {
                this.f3454b = codedInputByteBufferNano.readString();
            } else if (readTag == 26) {
                this.f3455c = codedInputByteBufferNano.readString();
            } else if (readTag == 32) {
                this.f3456d = codedInputByteBufferNano.readUInt64();
            } else if (readTag != 40) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f3457e = codedInputByteBufferNano.readUInt64();
            }
        }
    }

    public static io.appmetrica.analytics.billing.impl.c a(byte[] bArr) {
        return (io.appmetrica.analytics.billing.impl.c) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.billing.impl.c(), bArr);
    }
}
