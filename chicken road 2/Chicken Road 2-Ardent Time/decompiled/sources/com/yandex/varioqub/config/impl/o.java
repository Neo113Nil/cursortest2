package com.yandex.varioqub.config.impl;

/* loaded from: classes.dex */
public final class o extends com.yandex.varioqub.protobuf.nano.MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile com.yandex.varioqub.config.impl.o[] f2698c;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f2699a;

    /* renamed from: b, reason: collision with root package name */
    public double f2700b;

    public o() {
        a();
    }

    public static com.yandex.varioqub.config.impl.o[] b() {
        if (f2698c == null) {
            synchronized (com.yandex.varioqub.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f2698c == null) {
                        f2698c = new com.yandex.varioqub.config.impl.o[0];
                    }
                } finally {
                }
            }
        }
        return f2698c;
    }

    public final void a() {
        this.f2699a = "";
        this.f2700b = com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.cachedSize = -1;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f2699a.equals("")) {
            computeSerializedSize += com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano.computeStringSize(1, this.f2699a);
        }
        return java.lang.Double.doubleToLongBits(this.f2700b) != java.lang.Double.doubleToLongBits(com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE) ? computeSerializedSize + com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano.computeDoubleSize(2, this.f2700b) : computeSerializedSize;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final com.yandex.varioqub.protobuf.nano.MessageNano mergeFrom(com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f2699a = codedInputByteBufferNano.readString();
            } else if (readTag == 17) {
                this.f2700b = codedInputByteBufferNano.readDouble();
            } else if (!com.yandex.varioqub.protobuf.nano.WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final void writeTo(com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f2699a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f2699a);
        }
        if (java.lang.Double.doubleToLongBits(this.f2700b) != java.lang.Double.doubleToLongBits(com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE)) {
            codedOutputByteBufferNano.writeDouble(2, this.f2700b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
