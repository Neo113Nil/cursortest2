package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class A9 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static final int f4035c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f4036d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f4037e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f4038f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final int f4039g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static final int f4040h = 5;

    /* renamed from: i, reason: collision with root package name */
    public static final int f4041i = 6;

    /* renamed from: j, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.A9[] f4042j;

    /* renamed from: a, reason: collision with root package name */
    public int f4043a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f4044b;

    public A9() {
        a();
    }

    public static io.appmetrica.analytics.impl.A9[] b() {
        if (f4042j == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f4042j == null) {
                        f4042j = new io.appmetrica.analytics.impl.A9[0];
                    }
                } finally {
                }
            }
        }
        return f4042j;
    }

    public final io.appmetrica.analytics.impl.A9 a() {
        this.f4043a = 0;
        this.f4044b = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.f4043a;
        if (i2 != 0) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(1, i2);
        }
        return !java.util.Arrays.equals(this.f4044b, io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(2, this.f4044b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i2 = this.f4043a;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(1, i2);
        }
        if (!java.util.Arrays.equals(this.f4044b, io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f4044b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.A9 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                switch (readInt32) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        this.f4043a = readInt32;
                        break;
                }
            } else if (readTag != 18) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f4044b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static io.appmetrica.analytics.impl.A9 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.A9().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.A9 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.A9) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.A9(), bArr);
    }
}
