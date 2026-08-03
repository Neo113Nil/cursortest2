package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.vm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0779vm extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0779vm[] f6984b;

    /* renamed from: a, reason: collision with root package name */
    public long f6985a;

    public C0779vm() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0779vm[] b() {
        if (f6984b == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6984b == null) {
                        f6984b = new io.appmetrica.analytics.impl.C0779vm[0];
                    }
                } finally {
                }
            }
        }
        return f6984b;
    }

    public final io.appmetrica.analytics.impl.C0779vm a() {
        this.f6985a = 18000000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt64Size(1, this.f6985a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeInt64(1, this.f6985a);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0779vm mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 8) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f6985a = codedInputByteBufferNano.readInt64();
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0779vm a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0779vm) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0779vm(), bArr);
    }

    public static io.appmetrica.analytics.impl.C0779vm b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0779vm().mergeFrom(codedInputByteBufferNano);
    }
}
