package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.u3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0734u3 extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0734u3[] f6872c;

    /* renamed from: a, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0786w3 f6873a;

    /* renamed from: b, reason: collision with root package name */
    public int f6874b;

    public C0734u3() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0734u3[] b() {
        if (f6872c == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6872c == null) {
                        f6872c = new io.appmetrica.analytics.impl.C0734u3[0];
                    }
                } finally {
                }
            }
        }
        return f6872c;
    }

    public final io.appmetrica.analytics.impl.C0734u3 a() {
        this.f6873a = null;
        this.f6874b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        io.appmetrica.analytics.impl.C0786w3 c0786w3 = this.f6873a;
        if (c0786w3 != null) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeMessageSize(1, c0786w3);
        }
        int i2 = this.f6874b;
        return i2 != 0 ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeInt32Size(2, i2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        io.appmetrica.analytics.impl.C0786w3 c0786w3 = this.f6873a;
        if (c0786w3 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0786w3);
        }
        int i2 = this.f6874b;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0734u3 mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f6873a == null) {
                    this.f6873a = new io.appmetrica.analytics.impl.C0786w3();
                }
                codedInputByteBufferNano.readMessage(this.f6873a);
            } else if (readTag != 16) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f6874b = readInt32;
                }
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0734u3 b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0734u3().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0734u3 a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0734u3) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0734u3(), bArr);
    }
}
