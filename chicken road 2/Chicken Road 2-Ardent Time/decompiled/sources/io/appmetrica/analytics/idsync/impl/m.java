package io.appmetrica.analytics.idsync.impl;

/* loaded from: classes.dex */
public final class m extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f3948c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f3949d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.idsync.impl.m[] f3950e;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3951a;

    /* renamed from: b, reason: collision with root package name */
    public io.appmetrica.analytics.idsync.impl.l f3952b;

    public m() {
        a();
    }

    public static io.appmetrica.analytics.idsync.impl.m[] b() {
        if (f3950e == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f3950e == null) {
                        f3950e = new io.appmetrica.analytics.idsync.impl.m[0];
                    }
                } finally {
                }
            }
        }
        return f3950e;
    }

    public final io.appmetrica.analytics.idsync.impl.m a() {
        this.f3951a = false;
        this.f3952b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z2 = this.f3951a;
        if (z2) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBoolSize(1, z2);
        }
        io.appmetrica.analytics.idsync.impl.l lVar = this.f3952b;
        return lVar != null ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(2, lVar) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        boolean z2 = this.f3951a;
        if (z2) {
            codedOutputByteBufferNano.writeBool(1, z2);
        }
        io.appmetrica.analytics.idsync.impl.l lVar = this.f3952b;
        if (lVar != null) {
            codedOutputByteBufferNano.writeMessage(2, lVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.idsync.impl.m mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f3951a = codedInputByteBufferNano.readBool();
            } else if (readTag != 18) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f3952b == null) {
                    this.f3952b = new io.appmetrica.analytics.idsync.impl.l();
                }
                codedInputByteBufferNano.readMessage(this.f3952b);
            }
        }
    }

    public static io.appmetrica.analytics.idsync.impl.m b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.idsync.impl.m().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.idsync.impl.m a(byte[] bArr) {
        return (io.appmetrica.analytics.idsync.impl.m) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.idsync.impl.m(), bArr);
    }
}
