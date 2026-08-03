package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Ki extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.Ki[] f4549d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f4550a;

    /* renamed from: b, reason: collision with root package name */
    public io.appmetrica.analytics.impl.Ji f4551b;

    /* renamed from: c, reason: collision with root package name */
    public io.appmetrica.analytics.impl.Ii f4552c;

    public Ki() {
        a();
    }

    public static io.appmetrica.analytics.impl.Ki[] b() {
        if (f4549d == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f4549d == null) {
                        f4549d = new io.appmetrica.analytics.impl.Ki[0];
                    }
                } finally {
                }
            }
        }
        return f4549d;
    }

    public final io.appmetrica.analytics.impl.Ki a() {
        this.f4550a = false;
        this.f4551b = null;
        this.f4552c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z2 = this.f4550a;
        if (z2) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBoolSize(1, z2);
        }
        io.appmetrica.analytics.impl.Ji ji = this.f4551b;
        if (ji != null) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(2, ji);
        }
        io.appmetrica.analytics.impl.Ii ii = this.f4552c;
        return ii != null ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(3, ii) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        boolean z2 = this.f4550a;
        if (z2) {
            codedOutputByteBufferNano.writeBool(1, z2);
        }
        io.appmetrica.analytics.impl.Ji ji = this.f4551b;
        if (ji != null) {
            codedOutputByteBufferNano.writeMessage(2, ji);
        }
        io.appmetrica.analytics.impl.Ii ii = this.f4552c;
        if (ii != null) {
            codedOutputByteBufferNano.writeMessage(3, ii);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.Ki mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f4550a = codedInputByteBufferNano.readBool();
            } else if (readTag == 18) {
                if (this.f4551b == null) {
                    this.f4551b = new io.appmetrica.analytics.impl.Ji();
                }
                codedInputByteBufferNano.readMessage(this.f4551b);
            } else if (readTag != 26) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f4552c == null) {
                    this.f4552c = new io.appmetrica.analytics.impl.Ii();
                }
                codedInputByteBufferNano.readMessage(this.f4552c);
            }
        }
    }

    public static io.appmetrica.analytics.impl.Ki b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.Ki().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.Ki a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.Ki) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.Ki(), bArr);
    }
}
