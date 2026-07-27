package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class C3 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C3[] f6616c;

    /* renamed from: a, reason: collision with root package name */
    public E3 f6617a;

    /* renamed from: b, reason: collision with root package name */
    public int f6618b;

    public C3() {
        a();
    }

    public static C3[] b() {
        if (f6616c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6616c == null) {
                        f6616c = new C3[0];
                    }
                } finally {
                }
            }
        }
        return f6616c;
    }

    public final C3 a() {
        this.f6617a = null;
        this.f6618b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        E3 e3 = this.f6617a;
        if (e3 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, e3);
        }
        int i2 = this.f6618b;
        return i2 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i2) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        E3 e3 = this.f6617a;
        if (e3 != null) {
            codedOutputByteBufferNano.writeMessage(1, e3);
        }
        int i2 = this.f6618b;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f6617a == null) {
                    this.f6617a = new E3();
                }
                codedInputByteBufferNano.readMessage(this.f6617a);
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f6618b = readInt32;
                }
            }
        }
    }

    public static C3 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C3().mergeFrom(codedInputByteBufferNano);
    }

    public static C3 a(byte[] bArr) {
        return (C3) MessageNano.mergeFrom(new C3(), bArr);
    }
}
