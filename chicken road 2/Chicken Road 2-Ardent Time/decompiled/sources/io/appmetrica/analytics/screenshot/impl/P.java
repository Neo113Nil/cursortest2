package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class P extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.screenshot.impl.P[] f7513c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f7514a;

    /* renamed from: b, reason: collision with root package name */
    public long f7515b;

    public P() {
        a();
    }

    public static io.appmetrica.analytics.screenshot.impl.P[] b() {
        if (f7513c == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7513c == null) {
                        f7513c = new io.appmetrica.analytics.screenshot.impl.P[0];
                    }
                } finally {
                }
            }
        }
        return f7513c;
    }

    public final io.appmetrica.analytics.screenshot.impl.P a() {
        this.f7514a = true;
        this.f7515b = 1L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z2 = this.f7514a;
        if (!z2) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBoolSize(1, z2);
        }
        long j2 = this.f7515b;
        return j2 != 1 ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt64Size(2, j2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        boolean z2 = this.f7514a;
        if (!z2) {
            codedOutputByteBufferNano.writeBool(1, z2);
        }
        long j2 = this.f7515b;
        if (j2 != 1) {
            codedOutputByteBufferNano.writeInt64(2, j2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.screenshot.impl.P mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f7514a = codedInputByteBufferNano.readBool();
            } else if (readTag != 16) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f7515b = codedInputByteBufferNano.readInt64();
            }
        }
    }

    public static io.appmetrica.analytics.screenshot.impl.P b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.screenshot.impl.P().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.screenshot.impl.P a(byte[] bArr) {
        return (io.appmetrica.analytics.screenshot.impl.P) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.screenshot.impl.P(), bArr);
    }
}
