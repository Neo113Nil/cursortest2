package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.mf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0539mf extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0539mf[] f6424d;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f6425a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f6426b;

    /* renamed from: c, reason: collision with root package name */
    public int f6427c;

    public C0539mf() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0539mf[] b() {
        if (f6424d == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6424d == null) {
                        f6424d = new io.appmetrica.analytics.impl.C0539mf[0];
                    }
                } finally {
                }
            }
        }
        return f6424d;
    }

    public final io.appmetrica.analytics.impl.C0539mf a() {
        this.f6425a = "";
        this.f6426b = "";
        this.f6427c = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f6425a.equals("")) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(1, this.f6425a);
        }
        if (!this.f6426b.equals("")) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(2, this.f6426b);
        }
        return io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(3, this.f6427c) + computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f6425a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f6425a);
        }
        if (!this.f6426b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f6426b);
        }
        codedOutputByteBufferNano.writeInt32(3, this.f6427c);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0539mf mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f6425a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f6426b = codedInputByteBufferNano.readString();
            } else if (readTag != 24) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f6427c = readInt32;
                }
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0539mf b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0539mf().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0539mf a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0539mf) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0539mf(), bArr);
    }
}
