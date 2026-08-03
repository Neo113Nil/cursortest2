package io.appmetrica.analytics.idsync.impl;

/* loaded from: classes.dex */
public final class l extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.idsync.impl.l[] f3945c;

    /* renamed from: a, reason: collision with root package name */
    public long f3946a;

    /* renamed from: b, reason: collision with root package name */
    public io.appmetrica.analytics.idsync.impl.k[] f3947b;

    public l() {
        a();
    }

    public static io.appmetrica.analytics.idsync.impl.l[] b() {
        if (f3945c == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f3945c == null) {
                        f3945c = new io.appmetrica.analytics.idsync.impl.l[0];
                    }
                } finally {
                }
            }
        }
        return f3945c;
    }

    public final io.appmetrica.analytics.idsync.impl.l a() {
        this.f3946a = 10000L;
        this.f3947b = io.appmetrica.analytics.idsync.impl.k.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j2 = this.f3946a;
        if (j2 != 10000) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt64Size(1, j2);
        }
        io.appmetrica.analytics.idsync.impl.k[] kVarArr = this.f3947b;
        if (kVarArr != null && kVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                io.appmetrica.analytics.idsync.impl.k[] kVarArr2 = this.f3947b;
                if (i2 >= kVarArr2.length) {
                    break;
                }
                io.appmetrica.analytics.idsync.impl.k kVar = kVarArr2[i2];
                if (kVar != null) {
                    computeSerializedSize = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(2, kVar) + computeSerializedSize;
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        long j2 = this.f3946a;
        if (j2 != 10000) {
            codedOutputByteBufferNano.writeUInt64(1, j2);
        }
        io.appmetrica.analytics.idsync.impl.k[] kVarArr = this.f3947b;
        if (kVarArr != null && kVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                io.appmetrica.analytics.idsync.impl.k[] kVarArr2 = this.f3947b;
                if (i2 >= kVarArr2.length) {
                    break;
                }
                io.appmetrica.analytics.idsync.impl.k kVar = kVarArr2[i2];
                if (kVar != null) {
                    codedOutputByteBufferNano.writeMessage(2, kVar);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.idsync.impl.l mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f3946a = codedInputByteBufferNano.readUInt64();
            } else if (readTag != 18) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = io.appmetrica.analytics.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                io.appmetrica.analytics.idsync.impl.k[] kVarArr = this.f3947b;
                int length = kVarArr == null ? 0 : kVarArr.length;
                int i2 = repeatedFieldArrayLength + length;
                io.appmetrica.analytics.idsync.impl.k[] kVarArr2 = new io.appmetrica.analytics.idsync.impl.k[i2];
                if (length != 0) {
                    java.lang.System.arraycopy(kVarArr, 0, kVarArr2, 0, length);
                }
                while (length < i2 - 1) {
                    io.appmetrica.analytics.idsync.impl.k kVar = new io.appmetrica.analytics.idsync.impl.k();
                    kVarArr2[length] = kVar;
                    codedInputByteBufferNano.readMessage(kVar);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                io.appmetrica.analytics.idsync.impl.k kVar2 = new io.appmetrica.analytics.idsync.impl.k();
                kVarArr2[length] = kVar2;
                codedInputByteBufferNano.readMessage(kVar2);
                this.f3947b = kVarArr2;
            }
        }
    }

    public static io.appmetrica.analytics.idsync.impl.l b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.idsync.impl.l().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.idsync.impl.l a(byte[] bArr) {
        return (io.appmetrica.analytics.idsync.impl.l) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.idsync.impl.l(), bArr);
    }
}
