package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class Q extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.screenshot.impl.Q[] f7516d;

    /* renamed from: a, reason: collision with root package name */
    public io.appmetrica.analytics.screenshot.impl.N f7517a;

    /* renamed from: b, reason: collision with root package name */
    public io.appmetrica.analytics.screenshot.impl.P f7518b;

    /* renamed from: c, reason: collision with root package name */
    public io.appmetrica.analytics.screenshot.impl.O f7519c;

    public Q() {
        a();
    }

    public static io.appmetrica.analytics.screenshot.impl.Q[] b() {
        if (f7516d == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7516d == null) {
                        f7516d = new io.appmetrica.analytics.screenshot.impl.Q[0];
                    }
                } finally {
                }
            }
        }
        return f7516d;
    }

    public final io.appmetrica.analytics.screenshot.impl.Q a() {
        this.f7517a = null;
        this.f7518b = null;
        this.f7519c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        io.appmetrica.analytics.screenshot.impl.N n2 = this.f7517a;
        if (n2 != null) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(1, n2);
        }
        io.appmetrica.analytics.screenshot.impl.P p2 = this.f7518b;
        if (p2 != null) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(2, p2);
        }
        io.appmetrica.analytics.screenshot.impl.O o2 = this.f7519c;
        return o2 != null ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(3, o2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        io.appmetrica.analytics.screenshot.impl.N n2 = this.f7517a;
        if (n2 != null) {
            codedOutputByteBufferNano.writeMessage(1, n2);
        }
        io.appmetrica.analytics.screenshot.impl.P p2 = this.f7518b;
        if (p2 != null) {
            codedOutputByteBufferNano.writeMessage(2, p2);
        }
        io.appmetrica.analytics.screenshot.impl.O o2 = this.f7519c;
        if (o2 != null) {
            codedOutputByteBufferNano.writeMessage(3, o2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.screenshot.impl.Q mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f7517a == null) {
                    this.f7517a = new io.appmetrica.analytics.screenshot.impl.N();
                }
                codedInputByteBufferNano.readMessage(this.f7517a);
            } else if (readTag == 18) {
                if (this.f7518b == null) {
                    this.f7518b = new io.appmetrica.analytics.screenshot.impl.P();
                }
                codedInputByteBufferNano.readMessage(this.f7518b);
            } else if (readTag != 26) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f7519c == null) {
                    this.f7519c = new io.appmetrica.analytics.screenshot.impl.O();
                }
                codedInputByteBufferNano.readMessage(this.f7519c);
            }
        }
    }

    public static io.appmetrica.analytics.screenshot.impl.Q b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.screenshot.impl.Q().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.screenshot.impl.Q a(byte[] bArr) {
        return (io.appmetrica.analytics.screenshot.impl.Q) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.screenshot.impl.Q(), bArr);
    }
}
