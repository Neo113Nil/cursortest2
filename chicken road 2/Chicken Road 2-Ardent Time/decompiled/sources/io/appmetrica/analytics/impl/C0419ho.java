package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ho, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0419ho extends io.appmetrica.analytics.protobuf.nano.MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile io.appmetrica.analytics.impl.C0419ho[] f6062e;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f6063a;

    /* renamed from: b, reason: collision with root package name */
    public double f6064b;

    /* renamed from: c, reason: collision with root package name */
    public double f6065c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6066d;

    public C0419ho() {
        a();
    }

    public static io.appmetrica.analytics.impl.C0419ho[] b() {
        if (f6062e == null) {
            synchronized (io.appmetrica.analytics.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6062e == null) {
                        f6062e = new io.appmetrica.analytics.impl.C0419ho[0];
                    }
                } finally {
                }
            }
        }
        return f6062e;
    }

    public final io.appmetrica.analytics.impl.C0419ho a() {
        this.f6063a = io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES;
        this.f6064b = com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.f6065c = com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.f6066d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!java.util.Arrays.equals(this.f6063a, io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBytesSize(1, this.f6063a);
        }
        if (java.lang.Double.doubleToLongBits(this.f6064b) != java.lang.Double.doubleToLongBits(com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE)) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeDoubleSize(2, this.f6064b);
        }
        if (java.lang.Double.doubleToLongBits(this.f6065c) != java.lang.Double.doubleToLongBits(com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE)) {
            computeSerializedSize += io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeDoubleSize(3, this.f6065c);
        }
        boolean z2 = this.f6066d;
        return z2 ? computeSerializedSize + io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano.computeBoolSize(4, z2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!java.util.Arrays.equals(this.f6063a, io.appmetrica.analytics.protobuf.nano.WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f6063a);
        }
        if (java.lang.Double.doubleToLongBits(this.f6064b) != java.lang.Double.doubleToLongBits(com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE)) {
            codedOutputByteBufferNano.writeDouble(2, this.f6064b);
        }
        if (java.lang.Double.doubleToLongBits(this.f6065c) != java.lang.Double.doubleToLongBits(com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE)) {
            codedOutputByteBufferNano.writeDouble(3, this.f6065c);
        }
        boolean z2 = this.f6066d;
        if (z2) {
            codedOutputByteBufferNano.writeBool(4, z2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0419ho mergeFrom(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f6063a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 17) {
                this.f6064b = codedInputByteBufferNano.readDouble();
            } else if (readTag == 25) {
                this.f6065c = codedInputByteBufferNano.readDouble();
            } else if (readTag != 32) {
                if (!io.appmetrica.analytics.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f6066d = codedInputByteBufferNano.readBool();
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0419ho b(io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        return new io.appmetrica.analytics.impl.C0419ho().mergeFrom(codedInputByteBufferNano);
    }

    public static io.appmetrica.analytics.impl.C0419ho a(byte[] bArr) {
        return (io.appmetrica.analytics.impl.C0419ho) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0419ho(), bArr);
    }
}
