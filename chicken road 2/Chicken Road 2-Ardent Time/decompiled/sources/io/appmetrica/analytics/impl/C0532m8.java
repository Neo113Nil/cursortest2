package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.m8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0532m8 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0532m8[] f6412c;

    /* renamed from: a, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0274c8 f6413a;

    /* renamed from: b, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0274c8[] f6414b;

    public C0532m8() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0532m8[] b() {
        if (f6412c == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6412c == null) {
                        f6412c = new io.appmetrica.analytics.impl.C0532m8[0];
                    }
                } finally {
                }
            }
        }
        return f6412c;
    }

    public final io.appmetrica.analytics.impl.C0532m8 a() {
        this.f6413a = null;
        this.f6414b = io.appmetrica.analytics.impl.C0274c8.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        io.appmetrica.analytics.impl.C0274c8 c0274c8 = this.f6413a;
        if (c0274c8 != null) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(1, c0274c8);
        }
        io.appmetrica.analytics.impl.C0274c8[] c0274c8Arr = this.f6414b;
        if (c0274c8Arr != null && c0274c8Arr.length > 0) {
            int i2 = 0;
            while (true) {
                io.appmetrica.analytics.impl.C0274c8[] c0274c8Arr2 = this.f6414b;
                if (i2 >= c0274c8Arr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.C0274c8 c0274c82 = c0274c8Arr2[i2];
                if (c0274c82 != null) {
                    computeSerializedSize = io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(2, c0274c82) + computeSerializedSize;
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        io.appmetrica.analytics.impl.C0274c8 c0274c8 = this.f6413a;
        if (c0274c8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0274c8);
        }
        io.appmetrica.analytics.impl.C0274c8[] c0274c8Arr = this.f6414b;
        if (c0274c8Arr != null && c0274c8Arr.length > 0) {
            int i2 = 0;
            while (true) {
                io.appmetrica.analytics.impl.C0274c8[] c0274c8Arr2 = this.f6414b;
                if (i2 >= c0274c8Arr2.length) {
                    break;
                }
                io.appmetrica.analytics.impl.C0274c8 c0274c82 = c0274c8Arr2[i2];
                if (c0274c82 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c0274c82);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0532m8 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f6413a == null) {
                    this.f6413a = new io.appmetrica.analytics.impl.C0274c8();
                }
                codedInputByteBufferNano.readMessage(this.f6413a);
            } else if (readTag != 18) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = io.appmetrica.analytics.protobuf.nano.WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                io.appmetrica.analytics.impl.C0274c8[] c0274c8Arr = this.f6414b;
                int length = c0274c8Arr == null ? 0 : c0274c8Arr.length;
                int i2 = repeatedFieldArrayLength + length;
                io.appmetrica.analytics.impl.C0274c8[] c0274c8Arr2 = new io.appmetrica.analytics.impl.C0274c8[i2];
                if (length != 0) {
                    java.lang.System.arraycopy(c0274c8Arr, 0, c0274c8Arr2, 0, length);
                }
                while (length < i2 - 1) {
                    io.appmetrica.analytics.impl.C0274c8 c0274c8 = new io.appmetrica.analytics.impl.C0274c8();
                    c0274c8Arr2[length] = c0274c8;
                    codedInputByteBufferNano.readMessage(c0274c8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                io.appmetrica.analytics.impl.C0274c8 c0274c82 = new io.appmetrica.analytics.impl.C0274c8();
                c0274c8Arr2[length] = c0274c82;
                codedInputByteBufferNano.readMessage(c0274c82);
                this.f6414b = c0274c8Arr2;
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0532m8 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0532m8().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0532m8 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0532m8) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0532m8(), bArr);
    }
}
