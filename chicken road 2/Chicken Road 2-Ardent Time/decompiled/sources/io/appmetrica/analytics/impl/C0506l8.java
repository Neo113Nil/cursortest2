package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.l8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0506l8 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0506l8[] f6347c;

    /* renamed from: a, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0480k8[] f6348a;

    /* renamed from: b, reason: collision with root package name */
    public int f6349b;

    public C0506l8() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0506l8[] b() {
        if (f6347c == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6347c == null) {
                        f6347c = new io.appmetrica.analytics.impl.C0506l8[0];
                    }
                } finally {
                }
            }
        }
        return f6347c;
    }

    public final io.appmetrica.analytics.impl.C0506l8 a() {
        this.f6348a = io.appmetrica.analytics.impl.C0480k8.b();
        this.f6349b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        io.appmetrica.analytics.impl.C0480k8[] c0480k8Arr = this.f6348a;
        if (c0480k8Arr != null && c0480k8Arr.length > 0) {
            int i2 = 0;
            while (true) {
                io.appmetrica.analytics.impl.C0480k8[] c0480k8Arr2 = this.f6348a;
                if (i2 >= c0480k8Arr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.C0480k8 c0480k8 = c0480k8Arr2[i2];
                if (c0480k8 != null) {
                    computeSerializedSize = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(1, c0480k8) + computeSerializedSize;
                }
                i2++;
            }
        }
        int i3 = this.f6349b;
        return i3 != 0 ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeUInt32Size(2, i3) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        io.appmetrica.analytics.impl.C0480k8[] c0480k8Arr = this.f6348a;
        if (c0480k8Arr != null && c0480k8Arr.length > 0) {
            int i2 = 0;
            while (true) {
                io.appmetrica.analytics.impl.C0480k8[] c0480k8Arr2 = this.f6348a;
                if (i2 >= c0480k8Arr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.C0480k8 c0480k8 = c0480k8Arr2[i2];
                if (c0480k8 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c0480k8);
                }
                i2++;
            }
        }
        int i3 = this.f6349b;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeUInt32(2, i3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0506l8 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                int repeatedFieldArrayLength = io.appmetrica.analytics.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                io.appmetrica.analytics.impl.C0480k8[] c0480k8Arr = this.f6348a;
                int length = c0480k8Arr == null ? 0 : c0480k8Arr.length;
                int i2 = repeatedFieldArrayLength + length;
                io.appmetrica.analytics.impl.C0480k8[] c0480k8Arr2 = new io.appmetrica.analytics.impl.C0480k8[i2];
                if (length != 0) {
                    java.lang.System.arraycopy(c0480k8Arr, 0, c0480k8Arr2, 0, length);
                }
                while (length < i2 - 1) {
                    io.appmetrica.analytics.impl.C0480k8 c0480k8 = new io.appmetrica.analytics.impl.C0480k8();
                    c0480k8Arr2[length] = c0480k8;
                    codedInputByteBufferNano.readMessage(c0480k8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                io.appmetrica.analytics.impl.C0480k8 c0480k82 = new io.appmetrica.analytics.impl.C0480k8();
                c0480k8Arr2[length] = c0480k82;
                codedInputByteBufferNano.readMessage(c0480k82);
                this.f6348a = c0480k8Arr2;
            } else if (readTag != 16) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f6349b = codedInputByteBufferNano.readUInt32();
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0506l8 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0506l8().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0506l8 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0506l8) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0506l8(), bArr);
    }
}
