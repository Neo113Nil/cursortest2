package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.io, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0444io extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0444io[] f6141b;

    /* renamed from: a, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0367fo[] f6142a;

    public C0444io() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0444io[] b() {
        if (f6141b == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6141b == null) {
                        f6141b = new io.appmetrica.analytics.impl.C0444io[0];
                    }
                } finally {
                }
            }
        }
        return f6141b;
    }

    public final io.appmetrica.analytics.impl.C0444io a() {
        this.f6142a = io.appmetrica.analytics.impl.C0367fo.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        io.appmetrica.analytics.impl.C0367fo[] c0367foArr = this.f6142a;
        if (c0367foArr != null && c0367foArr.length > 0) {
            int i2 = 0;
            while (true) {
                io.appmetrica.analytics.impl.C0367fo[] c0367foArr2 = this.f6142a;
                if (i2 >= c0367foArr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.C0367fo c0367fo = c0367foArr2[i2];
                if (c0367fo != null) {
                    computeSerializedSize = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(1, c0367fo) + computeSerializedSize;
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        io.appmetrica.analytics.impl.C0367fo[] c0367foArr = this.f6142a;
        if (c0367foArr != null && c0367foArr.length > 0) {
            int i2 = 0;
            while (true) {
                io.appmetrica.analytics.impl.C0367fo[] c0367foArr2 = this.f6142a;
                if (i2 >= c0367foArr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.C0367fo c0367fo = c0367foArr2[i2];
                if (c0367fo != null) {
                    codedOutputByteBufferNano.writeMessage(1, c0367fo);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0444io mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
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
                io.appmetrica.analytics.impl.C0367fo[] c0367foArr = this.f6142a;
                int length = c0367foArr == null ? 0 : c0367foArr.length;
                int i2 = repeatedFieldArrayLength + length;
                io.appmetrica.analytics.impl.C0367fo[] c0367foArr2 = new io.appmetrica.analytics.impl.C0367fo[i2];
                if (length != 0) {
                    java.lang.System.arraycopy(c0367foArr, 0, c0367foArr2, 0, length);
                }
                while (length < i2 - 1) {
                    io.appmetrica.analytics.impl.C0367fo c0367fo = new io.appmetrica.analytics.impl.C0367fo();
                    c0367foArr2[length] = c0367fo;
                    codedInputByteBufferNano.readMessage(c0367fo);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                io.appmetrica.analytics.impl.C0367fo c0367fo2 = new io.appmetrica.analytics.impl.C0367fo();
                c0367foArr2[length] = c0367fo2;
                codedInputByteBufferNano.readMessage(c0367fo2);
                this.f6142a = c0367foArr2;
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0444io b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0444io().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0444io a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0444io) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0444io(), bArr);
    }
}
