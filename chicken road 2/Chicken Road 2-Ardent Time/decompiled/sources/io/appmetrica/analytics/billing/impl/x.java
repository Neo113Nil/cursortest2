package io.appmetrica.analytics.billing.impl;

/* loaded from: classes.dex */
public final class x extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.billing.impl.x[] f3502d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3503a;

    /* renamed from: b, reason: collision with root package name */
    public io.appmetrica.analytics.billing.impl.w f3504b;

    /* renamed from: c, reason: collision with root package name */
    public io.appmetrica.analytics.billing.impl.v f3505c;

    public x() {
        a();
    }

    public static io.appmetrica.analytics.billing.impl.x[] b() {
        if (f3502d == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f3502d == null) {
                        f3502d = new io.appmetrica.analytics.billing.impl.x[0];
                    }
                } finally {
                }
            }
        }
        return f3502d;
    }

    public final io.appmetrica.analytics.billing.impl.x a() {
        this.f3503a = false;
        this.f3504b = null;
        this.f3505c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z2 = this.f3503a;
        if (z2) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBoolSize(1, z2);
        }
        io.appmetrica.analytics.billing.impl.w wVar = this.f3504b;
        if (wVar != null) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(2, wVar);
        }
        io.appmetrica.analytics.billing.impl.v vVar = this.f3505c;
        return vVar != null ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(3, vVar) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        boolean z2 = this.f3503a;
        if (z2) {
            codedOutputByteBufferNano.writeBool(1, z2);
        }
        io.appmetrica.analytics.billing.impl.w wVar = this.f3504b;
        if (wVar != null) {
            codedOutputByteBufferNano.writeMessage(2, wVar);
        }
        io.appmetrica.analytics.billing.impl.v vVar = this.f3505c;
        if (vVar != null) {
            codedOutputByteBufferNano.writeMessage(3, vVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.billing.impl.x mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f3503a = codedInputByteBufferNano.readBool();
            } else if (readTag == 18) {
                if (this.f3504b == null) {
                    this.f3504b = new io.appmetrica.analytics.billing.impl.w();
                }
                codedInputByteBufferNano.readMessage(this.f3504b);
            } else if (readTag != 26) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f3505c == null) {
                    this.f3505c = new io.appmetrica.analytics.billing.impl.v();
                }
                codedInputByteBufferNano.readMessage(this.f3505c);
            }
        }
    }

    public static io.appmetrica.analytics.billing.impl.x b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.billing.impl.x().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.billing.impl.x a(byte[] bArr) {
        return (io.appmetrica.analytics.billing.impl.x) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.billing.impl.x(), bArr);
    }
}
