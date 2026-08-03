package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class S extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.screenshot.impl.S[] f7520c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f7521a;

    /* renamed from: b, reason: collision with root package name */
    public io.appmetrica.analytics.screenshot.impl.Q f7522b;

    public S() {
        a();
    }

    public static io.appmetrica.analytics.screenshot.impl.S[] b() {
        if (f7520c == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7520c == null) {
                        f7520c = new io.appmetrica.analytics.screenshot.impl.S[0];
                    }
                } finally {
                }
            }
        }
        return f7520c;
    }

    public final io.appmetrica.analytics.screenshot.impl.S a() {
        this.f7521a = true;
        this.f7522b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z2 = this.f7521a;
        if (!z2) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBoolSize(1, z2);
        }
        io.appmetrica.analytics.screenshot.impl.Q q2 = this.f7522b;
        return q2 != null ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(2, q2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        boolean z2 = this.f7521a;
        if (!z2) {
            codedOutputByteBufferNano.writeBool(1, z2);
        }
        io.appmetrica.analytics.screenshot.impl.Q q2 = this.f7522b;
        if (q2 != null) {
            codedOutputByteBufferNano.writeMessage(2, q2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.screenshot.impl.S mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f7521a = codedInputByteBufferNano.readBool();
            } else if (readTag != 18) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f7522b == null) {
                    this.f7522b = new io.appmetrica.analytics.screenshot.impl.Q();
                }
                codedInputByteBufferNano.readMessage(this.f7522b);
            }
        }
    }

    public static io.appmetrica.analytics.screenshot.impl.S b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.screenshot.impl.S().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.screenshot.impl.S a(byte[] bArr) {
        return (io.appmetrica.analytics.screenshot.impl.S) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.screenshot.impl.S(), bArr);
    }
}
