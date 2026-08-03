package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.w3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0786w3 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0786w3[] f6997b;

    /* renamed from: a, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0760v3[] f6998a;

    public C0786w3() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0786w3[] b() {
        if (f6997b == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6997b == null) {
                        f6997b = new io.appmetrica.analytics.impl.C0786w3[0];
                    }
                } finally {
                }
            }
        }
        return f6997b;
    }

    public final io.appmetrica.analytics.impl.C0786w3 a() {
        this.f6998a = io.appmetrica.analytics.impl.C0760v3.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        io.appmetrica.analytics.impl.C0760v3[] c0760v3Arr = this.f6998a;
        if (c0760v3Arr != null && c0760v3Arr.length > 0) {
            int i2 = 0;
            while (true) {
                io.appmetrica.analytics.impl.C0760v3[] c0760v3Arr2 = this.f6998a;
                if (i2 >= c0760v3Arr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.C0760v3 c0760v3 = c0760v3Arr2[i2];
                if (c0760v3 != null) {
                    computeSerializedSize = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(1, c0760v3) + computeSerializedSize;
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        io.appmetrica.analytics.impl.C0760v3[] c0760v3Arr = this.f6998a;
        if (c0760v3Arr != null && c0760v3Arr.length > 0) {
            int i2 = 0;
            while (true) {
                io.appmetrica.analytics.impl.C0760v3[] c0760v3Arr2 = this.f6998a;
                if (i2 >= c0760v3Arr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.C0760v3 c0760v3 = c0760v3Arr2[i2];
                if (c0760v3 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c0760v3);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0786w3 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
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
                io.appmetrica.analytics.impl.C0760v3[] c0760v3Arr = this.f6998a;
                int length = c0760v3Arr == null ? 0 : c0760v3Arr.length;
                int i2 = repeatedFieldArrayLength + length;
                io.appmetrica.analytics.impl.C0760v3[] c0760v3Arr2 = new io.appmetrica.analytics.impl.C0760v3[i2];
                if (length != 0) {
                    java.lang.System.arraycopy(c0760v3Arr, 0, c0760v3Arr2, 0, length);
                }
                while (length < i2 - 1) {
                    io.appmetrica.analytics.impl.C0760v3 c0760v3 = new io.appmetrica.analytics.impl.C0760v3();
                    c0760v3Arr2[length] = c0760v3;
                    codedInputByteBufferNano.readMessage(c0760v3);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                io.appmetrica.analytics.impl.C0760v3 c0760v32 = new io.appmetrica.analytics.impl.C0760v3();
                c0760v3Arr2[length] = c0760v32;
                codedInputByteBufferNano.readMessage(c0760v32);
                this.f6998a = c0760v3Arr2;
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0786w3 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0786w3().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0786w3 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0786w3) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0786w3(), bArr);
    }
}
