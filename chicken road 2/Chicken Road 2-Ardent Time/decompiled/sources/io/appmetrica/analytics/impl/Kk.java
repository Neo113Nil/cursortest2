package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Kk extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.Kk[] f4555b;

    /* renamed from: a, reason: collision with root package name */
    public io.appmetrica.analytics.impl.Lk[] f4556a;

    public Kk() {
        a();
    }

    public static io.appmetrica.analytics.impl.Kk[] b() {
        if (f4555b == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f4555b == null) {
                        f4555b = new io.appmetrica.analytics.impl.Kk[0];
                    }
                } finally {
                }
            }
        }
        return f4555b;
    }

    public final io.appmetrica.analytics.impl.Kk a() {
        this.f4556a = io.appmetrica.analytics.impl.Lk.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        io.appmetrica.analytics.impl.Lk[] lkArr = this.f4556a;
        if (lkArr != null && lkArr.length > 0) {
            int i2 = 0;
            while (true) {
                io.appmetrica.analytics.impl.Lk[] lkArr2 = this.f4556a;
                if (i2 >= lkArr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.Lk lk = lkArr2[i2];
                if (lk != null) {
                    computeSerializedSize = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(1, lk) + computeSerializedSize;
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        io.appmetrica.analytics.impl.Lk[] lkArr = this.f4556a;
        if (lkArr != null && lkArr.length > 0) {
            int i2 = 0;
            while (true) {
                io.appmetrica.analytics.impl.Lk[] lkArr2 = this.f4556a;
                if (i2 >= lkArr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.Lk lk = lkArr2[i2];
                if (lk != null) {
                    codedOutputByteBufferNano.writeMessage(1, lk);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.Kk mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 10) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = io.appmetrica.analytics.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                io.appmetrica.analytics.impl.Lk[] lkArr = this.f4556a;
                int length = lkArr == null ? 0 : lkArr.length;
                int i2 = repeatedFieldArrayLength + length;
                io.appmetrica.analytics.impl.Lk[] lkArr2 = new io.appmetrica.analytics.impl.Lk[i2];
                if (length != 0) {
                    java.lang.System.arraycopy(lkArr, 0, lkArr2, 0, length);
                }
                while (length < i2 - 1) {
                    io.appmetrica.analytics.impl.Lk lk = new io.appmetrica.analytics.impl.Lk();
                    lkArr2[length] = lk;
                    codedInputByteBufferNano.readMessage(lk);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                io.appmetrica.analytics.impl.Lk lk2 = new io.appmetrica.analytics.impl.Lk();
                lkArr2[length] = lk2;
                codedInputByteBufferNano.readMessage(lk2);
                this.f4556a = lkArr2;
            }
        }
    }

    public static io.appmetrica.analytics.impl.Kk b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.Kk().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.Kk a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.Kk) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.Kk(), bArr);
    }
}
