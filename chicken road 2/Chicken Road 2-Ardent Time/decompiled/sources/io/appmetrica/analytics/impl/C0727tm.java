package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.tm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0727tm extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0727tm[] f6864c;

    /* renamed from: a, reason: collision with root package name */
    public long f6865a;

    /* renamed from: b, reason: collision with root package name */
    public long f6866b;

    public C0727tm() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0727tm[] b() {
        if (f6864c == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6864c == null) {
                        f6864c = new io.appmetrica.analytics.impl.C0727tm[0];
                    }
                } finally {
                }
            }
        }
        return f6864c;
    }

    public final io.appmetrica.analytics.impl.C0727tm a() {
        this.f6865a = 86400L;
        this.f6866b = 432000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt64Size(2, this.f6866b) + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt64Size(1, this.f6865a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeInt64(1, this.f6865a);
        codedOutputByteBufferNano.writeInt64(2, this.f6866b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0727tm mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f6865a = codedInputByteBufferNano.readInt64();
            } else if (readTag != 16) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f6866b = codedInputByteBufferNano.readInt64();
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0727tm b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0727tm().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0727tm a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0727tm) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0727tm(), bArr);
    }
}
