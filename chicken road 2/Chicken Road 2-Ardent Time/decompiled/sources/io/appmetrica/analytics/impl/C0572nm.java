package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.nm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0572nm extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0572nm[] f6544b;

    /* renamed from: a, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0546mm[] f6545a;

    public C0572nm() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0572nm[] b() {
        if (f6544b == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6544b == null) {
                        f6544b = new io.appmetrica.analytics.impl.C0572nm[0];
                    }
                } finally {
                }
            }
        }
        return f6544b;
    }

    public final io.appmetrica.analytics.impl.C0572nm a() {
        this.f6545a = io.appmetrica.analytics.impl.C0546mm.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        io.appmetrica.analytics.impl.C0546mm[] c0546mmArr = this.f6545a;
        if (c0546mmArr != null && c0546mmArr.length > 0) {
            int i2 = 0;
            while (true) {
                io.appmetrica.analytics.impl.C0546mm[] c0546mmArr2 = this.f6545a;
                if (i2 >= c0546mmArr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.C0546mm c0546mm = c0546mmArr2[i2];
                if (c0546mm != null) {
                    computeSerializedSize = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(1, c0546mm) + computeSerializedSize;
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        io.appmetrica.analytics.impl.C0546mm[] c0546mmArr = this.f6545a;
        if (c0546mmArr != null && c0546mmArr.length > 0) {
            int i2 = 0;
            while (true) {
                io.appmetrica.analytics.impl.C0546mm[] c0546mmArr2 = this.f6545a;
                if (i2 >= c0546mmArr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.C0546mm c0546mm = c0546mmArr2[i2];
                if (c0546mm != null) {
                    codedOutputByteBufferNano.writeMessage(1, c0546mm);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0572nm mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
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
                io.appmetrica.analytics.impl.C0546mm[] c0546mmArr = this.f6545a;
                int length = c0546mmArr == null ? 0 : c0546mmArr.length;
                int i2 = repeatedFieldArrayLength + length;
                io.appmetrica.analytics.impl.C0546mm[] c0546mmArr2 = new io.appmetrica.analytics.impl.C0546mm[i2];
                if (length != 0) {
                    java.lang.System.arraycopy(c0546mmArr, 0, c0546mmArr2, 0, length);
                }
                while (length < i2 - 1) {
                    io.appmetrica.analytics.impl.C0546mm c0546mm = new io.appmetrica.analytics.impl.C0546mm();
                    c0546mmArr2[length] = c0546mm;
                    codedInputByteBufferNano.readMessage(c0546mm);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                io.appmetrica.analytics.impl.C0546mm c0546mm2 = new io.appmetrica.analytics.impl.C0546mm();
                c0546mmArr2[length] = c0546mm2;
                codedInputByteBufferNano.readMessage(c0546mm2);
                this.f6545a = c0546mmArr2;
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0572nm b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0572nm().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0572nm a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0572nm) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0572nm(), bArr);
    }
}
