package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class Z5 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile Z5[] f7771d;

    /* renamed from: a, reason: collision with root package name */
    public Y5 f7772a;

    /* renamed from: b, reason: collision with root package name */
    public String f7773b;

    /* renamed from: c, reason: collision with root package name */
    public int f7774c;

    public Z5() {
        a();
    }

    public static Z5[] b() {
        if (f7771d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7771d == null) {
                        f7771d = new Z5[0];
                    }
                } finally {
                }
            }
        }
        return f7771d;
    }

    public final Z5 a() {
        this.f7772a = null;
        this.f7773b = "";
        this.f7774c = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Y5 y5 = this.f7772a;
        if (y5 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, y5);
        }
        if (!this.f7773b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f7773b);
        }
        int i2 = this.f7774c;
        return i2 != -1 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(3, i2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        Y5 y5 = this.f7772a;
        if (y5 != null) {
            codedOutputByteBufferNano.writeMessage(1, y5);
        }
        if (!this.f7773b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f7773b);
        }
        int i2 = this.f7774c;
        if (i2 != -1) {
            codedOutputByteBufferNano.writeInt32(3, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Z5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f7772a == null) {
                    this.f7772a = new Y5();
                }
                codedInputByteBufferNano.readMessage(this.f7772a);
            } else if (readTag == 18) {
                this.f7773b = codedInputByteBufferNano.readString();
            } else if (readTag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == -1 || readInt32 == 0 || readInt32 == 1) {
                    this.f7774c = readInt32;
                }
            }
        }
    }

    public static Z5 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new Z5().mergeFrom(codedInputByteBufferNano);
    }

    public static Z5 a(byte[] bArr) {
        return (Z5) MessageNano.mergeFrom(new Z5(), bArr);
    }
}
