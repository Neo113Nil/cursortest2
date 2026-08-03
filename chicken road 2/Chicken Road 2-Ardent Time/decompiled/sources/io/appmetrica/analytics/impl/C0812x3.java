package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.x3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0812x3 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f7075c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f7076d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f7077e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f7078f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0812x3[] f7079g;

    /* renamed from: a, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0734u3 f7080a;

    /* renamed from: b, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0734u3[] f7081b;

    public C0812x3() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0812x3[] b() {
        if (f7079g == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7079g == null) {
                        f7079g = new io.appmetrica.analytics.impl.C0812x3[0];
                    }
                } finally {
                }
            }
        }
        return f7079g;
    }

    public final io.appmetrica.analytics.impl.C0812x3 a() {
        this.f7080a = null;
        this.f7081b = io.appmetrica.analytics.impl.C0734u3.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        io.appmetrica.analytics.impl.C0734u3 c0734u3 = this.f7080a;
        if (c0734u3 != null) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(1, c0734u3);
        }
        io.appmetrica.analytics.impl.C0734u3[] c0734u3Arr = this.f7081b;
        if (c0734u3Arr != null && c0734u3Arr.length > 0) {
            int i2 = 0;
            while (true) {
                io.appmetrica.analytics.impl.C0734u3[] c0734u3Arr2 = this.f7081b;
                if (i2 >= c0734u3Arr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.C0734u3 c0734u32 = c0734u3Arr2[i2];
                if (c0734u32 != null) {
                    computeSerializedSize = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(2, c0734u32) + computeSerializedSize;
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        io.appmetrica.analytics.impl.C0734u3 c0734u3 = this.f7080a;
        if (c0734u3 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0734u3);
        }
        io.appmetrica.analytics.impl.C0734u3[] c0734u3Arr = this.f7081b;
        if (c0734u3Arr != null && c0734u3Arr.length > 0) {
            int i2 = 0;
            while (true) {
                io.appmetrica.analytics.impl.C0734u3[] c0734u3Arr2 = this.f7081b;
                if (i2 >= c0734u3Arr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.C0734u3 c0734u32 = c0734u3Arr2[i2];
                if (c0734u32 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c0734u32);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0812x3 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f7080a == null) {
                    this.f7080a = new io.appmetrica.analytics.impl.C0734u3();
                }
                codedInputByteBufferNano.readMessage(this.f7080a);
            } else if (readTag != 18) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = io.appmetrica.analytics.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                io.appmetrica.analytics.impl.C0734u3[] c0734u3Arr = this.f7081b;
                int length = c0734u3Arr == null ? 0 : c0734u3Arr.length;
                int i2 = repeatedFieldArrayLength + length;
                io.appmetrica.analytics.impl.C0734u3[] c0734u3Arr2 = new io.appmetrica.analytics.impl.C0734u3[i2];
                if (length != 0) {
                    java.lang.System.arraycopy(c0734u3Arr, 0, c0734u3Arr2, 0, length);
                }
                while (length < i2 - 1) {
                    io.appmetrica.analytics.impl.C0734u3 c0734u3 = new io.appmetrica.analytics.impl.C0734u3();
                    c0734u3Arr2[length] = c0734u3;
                    codedInputByteBufferNano.readMessage(c0734u3);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                io.appmetrica.analytics.impl.C0734u3 c0734u32 = new io.appmetrica.analytics.impl.C0734u3();
                c0734u3Arr2[length] = c0734u32;
                codedInputByteBufferNano.readMessage(c0734u32);
                this.f7081b = c0734u3Arr2;
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0812x3 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0812x3().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0812x3 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0812x3) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0812x3(), bArr);
    }
}
