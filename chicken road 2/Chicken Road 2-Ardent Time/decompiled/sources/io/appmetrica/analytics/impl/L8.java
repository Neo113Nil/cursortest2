package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class L8 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.L8[] f4598b;

    /* renamed from: a, reason: collision with root package name */
    public io.appmetrica.analytics.impl.K8[] f4599a;

    public L8() {
        a();
    }

    public static io.appmetrica.analytics.impl.L8[] b() {
        if (f4598b == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f4598b == null) {
                        f4598b = new io.appmetrica.analytics.impl.L8[0];
                    }
                } finally {
                }
            }
        }
        return f4598b;
    }

    public final io.appmetrica.analytics.impl.L8 a() {
        this.f4599a = io.appmetrica.analytics.impl.K8.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        io.appmetrica.analytics.impl.K8[] k8Arr = this.f4599a;
        if (k8Arr != null && k8Arr.length > 0) {
            int i2 = 0;
            while (true) {
                io.appmetrica.analytics.impl.K8[] k8Arr2 = this.f4599a;
                if (i2 >= k8Arr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.K8 k8 = k8Arr2[i2];
                if (k8 != null) {
                    computeSerializedSize = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(1, k8) + computeSerializedSize;
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        io.appmetrica.analytics.impl.K8[] k8Arr = this.f4599a;
        if (k8Arr != null && k8Arr.length > 0) {
            int i2 = 0;
            while (true) {
                io.appmetrica.analytics.impl.K8[] k8Arr2 = this.f4599a;
                if (i2 >= k8Arr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.K8 k8 = k8Arr2[i2];
                if (k8 != null) {
                    codedOutputByteBufferNano.writeMessage(1, k8);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.L8 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
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
                io.appmetrica.analytics.impl.K8[] k8Arr = this.f4599a;
                int length = k8Arr == null ? 0 : k8Arr.length;
                int i2 = repeatedFieldArrayLength + length;
                io.appmetrica.analytics.impl.K8[] k8Arr2 = new io.appmetrica.analytics.impl.K8[i2];
                if (length != 0) {
                    java.lang.System.arraycopy(k8Arr, 0, k8Arr2, 0, length);
                }
                while (length < i2 - 1) {
                    io.appmetrica.analytics.impl.K8 k8 = new io.appmetrica.analytics.impl.K8();
                    k8Arr2[length] = k8;
                    codedInputByteBufferNano.readMessage(k8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                io.appmetrica.analytics.impl.K8 k82 = new io.appmetrica.analytics.impl.K8();
                k8Arr2[length] = k82;
                codedInputByteBufferNano.readMessage(k82);
                this.f4599a = k8Arr2;
            }
        }
    }

    public static io.appmetrica.analytics.impl.L8 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.L8().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.L8 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.L8) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.L8(), bArr);
    }
}
