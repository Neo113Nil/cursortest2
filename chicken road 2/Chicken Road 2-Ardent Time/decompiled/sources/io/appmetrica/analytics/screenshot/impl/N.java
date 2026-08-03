package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class N extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.screenshot.impl.N[] f7507b;

    /* renamed from: a, reason: collision with root package name */
    public boolean f7508a;

    public N() {
        a();
    }

    public static io.appmetrica.analytics.screenshot.impl.N[] b() {
        if (f7507b == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7507b == null) {
                        f7507b = new io.appmetrica.analytics.screenshot.impl.N[0];
                    }
                } finally {
                }
            }
        }
        return f7507b;
    }

    public final io.appmetrica.analytics.screenshot.impl.N a() {
        this.f7508a = true;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z2 = this.f7508a;
        return !z2 ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBoolSize(1, z2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        boolean z2 = this.f7508a;
        if (!z2) {
            codedOutputByteBufferNano.writeBool(1, z2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.screenshot.impl.N mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
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
                this.f7508a = codedInputByteBufferNano.readBool();
            }
        }
    }

    public static io.appmetrica.analytics.screenshot.impl.N a(byte[] bArr) {
        return (io.appmetrica.analytics.screenshot.impl.N) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.screenshot.impl.N(), bArr);
    }

    public static io.appmetrica.analytics.screenshot.impl.N b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.screenshot.impl.N().mergeFrom(codedInputByteBufferNano);
    }
}
