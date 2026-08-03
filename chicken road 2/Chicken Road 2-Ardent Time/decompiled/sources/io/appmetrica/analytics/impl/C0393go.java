package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.go, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0393go extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0393go[] f6014c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f6015a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6016b;

    public C0393go() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0393go[] b() {
        if (f6014c == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6014c == null) {
                        f6014c = new io.appmetrica.analytics.impl.C0393go[0];
                    }
                } finally {
                }
            }
        }
        return f6014c;
    }

    public final io.appmetrica.analytics.impl.C0393go a() {
        this.f6015a = false;
        this.f6016b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z2 = this.f6015a;
        if (z2) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBoolSize(1, z2);
        }
        boolean z3 = this.f6016b;
        return z3 ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBoolSize(2, z3) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        boolean z2 = this.f6015a;
        if (z2) {
            codedOutputByteBufferNano.writeBool(1, z2);
        }
        boolean z3 = this.f6016b;
        if (z3) {
            codedOutputByteBufferNano.writeBool(2, z3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0393go mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f6015a = codedInputByteBufferNano.readBool();
            } else if (readTag != 16) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f6016b = codedInputByteBufferNano.readBool();
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0393go b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0393go().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0393go a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0393go) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0393go(), bArr);
    }
}
