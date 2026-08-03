package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.r8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0661r8 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0661r8[] f6724c;

    /* renamed from: a, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0558n8 f6725a;

    /* renamed from: b, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0636q8 f6726b;

    public C0661r8() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0661r8[] b() {
        if (f6724c == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6724c == null) {
                        f6724c = new io.appmetrica.analytics.impl.C0661r8[0];
                    }
                } finally {
                }
            }
        }
        return f6724c;
    }

    public final io.appmetrica.analytics.impl.C0661r8 a() {
        this.f6725a = null;
        this.f6726b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        io.appmetrica.analytics.impl.C0558n8 c0558n8 = this.f6725a;
        if (c0558n8 != null) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(1, c0558n8);
        }
        io.appmetrica.analytics.impl.C0636q8 c0636q8 = this.f6726b;
        return c0636q8 != null ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(2, c0636q8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        io.appmetrica.analytics.impl.C0558n8 c0558n8 = this.f6725a;
        if (c0558n8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0558n8);
        }
        io.appmetrica.analytics.impl.C0636q8 c0636q8 = this.f6726b;
        if (c0636q8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0636q8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0661r8 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f6725a == null) {
                    this.f6725a = new io.appmetrica.analytics.impl.C0558n8();
                }
                codedInputByteBufferNano.readMessage(this.f6725a);
            } else if (readTag != 18) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f6726b == null) {
                    this.f6726b = new io.appmetrica.analytics.impl.C0636q8();
                }
                codedInputByteBufferNano.readMessage(this.f6726b);
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0661r8 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0661r8().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0661r8 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0661r8) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0661r8(), bArr);
    }
}
