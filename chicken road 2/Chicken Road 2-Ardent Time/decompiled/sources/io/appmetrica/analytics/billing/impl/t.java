package io.appmetrica.analytics.billing.impl;

/* loaded from: classes.dex */
public final class t extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.billing.impl.t[] f3483c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3484a;

    /* renamed from: b, reason: collision with root package name */
    public io.appmetrica.analytics.billing.impl.s f3485b;

    public t() {
        a();
    }

    public static io.appmetrica.analytics.billing.impl.t[] b() {
        if (f3483c == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f3483c == null) {
                        f3483c = new io.appmetrica.analytics.billing.impl.t[0];
                    }
                } finally {
                }
            }
        }
        return f3483c;
    }

    public final io.appmetrica.analytics.billing.impl.t a() {
        this.f3484a = true;
        this.f3485b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z2 = this.f3484a;
        if (!z2) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBoolSize(1, z2);
        }
        io.appmetrica.analytics.billing.impl.s sVar = this.f3485b;
        return sVar != null ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(2, sVar) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        boolean z2 = this.f3484a;
        if (!z2) {
            codedOutputByteBufferNano.writeBool(1, z2);
        }
        io.appmetrica.analytics.billing.impl.s sVar = this.f3485b;
        if (sVar != null) {
            codedOutputByteBufferNano.writeMessage(2, sVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.billing.impl.t mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f3484a = codedInputByteBufferNano.readBool();
            } else if (readTag != 18) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f3485b == null) {
                    this.f3485b = new io.appmetrica.analytics.billing.impl.s();
                }
                codedInputByteBufferNano.readMessage(this.f3485b);
            }
        }
    }

    public static io.appmetrica.analytics.billing.impl.t b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.billing.impl.t().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.billing.impl.t a(byte[] bArr) {
        return (io.appmetrica.analytics.billing.impl.t) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.billing.impl.t(), bArr);
    }
}
