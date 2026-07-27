package com.yandex.varioqub.config.impl;

import com.yandex.varioqub.config.model.ConfigValue;
import com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.InternalNano;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import com.yandex.varioqub.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class o extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile o[] f5432c;

    /* renamed from: a, reason: collision with root package name */
    public String f5433a;

    /* renamed from: b, reason: collision with root package name */
    public double f5434b;

    public o() {
        a();
    }

    public static o[] b() {
        if (f5432c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5432c == null) {
                        f5432c = new o[0];
                    }
                } finally {
                }
            }
        }
        return f5432c;
    }

    public final void a() {
        this.f5433a = "";
        this.f5434b = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.cachedSize = -1;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f5433a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f5433a);
        }
        return Double.doubleToLongBits(this.f5434b) != Double.doubleToLongBits(ConfigValue.DOUBLE_DEFAULT_VALUE) ? computeSerializedSize + CodedOutputByteBufferNano.computeDoubleSize(2, this.f5434b) : computeSerializedSize;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f5433a = codedInputByteBufferNano.readString();
            } else if (readTag == 17) {
                this.f5434b = codedInputByteBufferNano.readDouble();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f5433a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f5433a);
        }
        if (Double.doubleToLongBits(this.f5434b) != Double.doubleToLongBits(ConfigValue.DOUBLE_DEFAULT_VALUE)) {
            codedOutputByteBufferNano.writeDouble(2, this.f5434b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
