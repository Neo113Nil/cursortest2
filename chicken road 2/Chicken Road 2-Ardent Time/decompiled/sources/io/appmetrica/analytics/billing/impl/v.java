package io.appmetrica.analytics.billing.impl;

/* loaded from: classes.dex */
public final class v extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.billing.impl.v[] f3489e;

    /* renamed from: a, reason: collision with root package name */
    public long f3490a;

    /* renamed from: b, reason: collision with root package name */
    public io.appmetrica.analytics.billing.impl.w f3491b;

    /* renamed from: c, reason: collision with root package name */
    public int f3492c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f3493d;

    public v() {
        a();
    }

    public static io.appmetrica.analytics.billing.impl.v[] b() {
        if (f3489e == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f3489e == null) {
                        f3489e = new io.appmetrica.analytics.billing.impl.v[0];
                    }
                } finally {
                }
            }
        }
        return f3489e;
    }

    public final io.appmetrica.analytics.billing.impl.v a() {
        this.f3490a = 0L;
        this.f3491b = null;
        this.f3492c = 0;
        this.f3493d = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j2 = this.f3490a;
        if (j2 != 0) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt64Size(1, j2);
        }
        io.appmetrica.analytics.billing.impl.w wVar = this.f3491b;
        if (wVar != null) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(2, wVar);
        }
        int i2 = this.f3492c;
        if (i2 != 0) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt32Size(3, i2);
        }
        return !java.util.Arrays.equals(this.f3493d, io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(4, this.f3493d) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        long j2 = this.f3490a;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeInt64(1, j2);
        }
        io.appmetrica.analytics.billing.impl.w wVar = this.f3491b;
        if (wVar != null) {
            codedOutputByteBufferNano.writeMessage(2, wVar);
        }
        int i2 = this.f3492c;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(3, i2);
        }
        if (!java.util.Arrays.equals(this.f3493d, io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(4, this.f3493d);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.billing.impl.v mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f3490a = codedInputByteBufferNano.readInt64();
            } else if (readTag == 18) {
                if (this.f3491b == null) {
                    this.f3491b = new io.appmetrica.analytics.billing.impl.w();
                }
                codedInputByteBufferNano.readMessage(this.f3491b);
            } else if (readTag == 24) {
                this.f3492c = codedInputByteBufferNano.readUInt32();
            } else if (readTag != 34) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f3493d = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static io.appmetrica.analytics.billing.impl.v b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.billing.impl.v().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.billing.impl.v a(byte[] bArr) {
        return (io.appmetrica.analytics.billing.impl.v) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.billing.impl.v(), bArr);
    }
}
