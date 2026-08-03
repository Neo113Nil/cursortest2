package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.t8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0713t8 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0713t8[] f6847b;

    /* renamed from: a, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0636q8 f6848a;

    public C0713t8() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0713t8[] b() {
        if (f6847b == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6847b == null) {
                        f6847b = new io.appmetrica.analytics.impl.C0713t8[0];
                    }
                } finally {
                }
            }
        }
        return f6847b;
    }

    public final io.appmetrica.analytics.impl.C0713t8 a() {
        this.f6848a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        io.appmetrica.analytics.impl.C0636q8 c0636q8 = this.f6848a;
        return c0636q8 != null ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(1, c0636q8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        io.appmetrica.analytics.impl.C0636q8 c0636q8 = this.f6848a;
        if (c0636q8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0636q8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0713t8 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 10) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f6848a == null) {
                    this.f6848a = new io.appmetrica.analytics.impl.C0636q8();
                }
                codedInputByteBufferNano.readMessage(this.f6848a);
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0713t8 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0713t8().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0713t8 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0713t8) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0713t8(), bArr);
    }
}
