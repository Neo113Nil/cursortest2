package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.x8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1103x8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C1103x8[] f9569c;

    /* renamed from: a, reason: collision with root package name */
    public C0999t8 f9570a;

    /* renamed from: b, reason: collision with root package name */
    public C1077w8 f9571b;

    public C1103x8() {
        a();
    }

    public static C1103x8[] b() {
        if (f9569c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9569c == null) {
                        f9569c = new C1103x8[0];
                    }
                } finally {
                }
            }
        }
        return f9569c;
    }

    public final C1103x8 a() {
        this.f9570a = null;
        this.f9571b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0999t8 c0999t8 = this.f9570a;
        if (c0999t8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0999t8);
        }
        C1077w8 c1077w8 = this.f9571b;
        return c1077w8 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c1077w8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C0999t8 c0999t8 = this.f9570a;
        if (c0999t8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0999t8);
        }
        C1077w8 c1077w8 = this.f9571b;
        if (c1077w8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c1077w8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1103x8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f9570a == null) {
                    this.f9570a = new C0999t8();
                }
                codedInputByteBufferNano.readMessage(this.f9570a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f9571b == null) {
                    this.f9571b = new C1077w8();
                }
                codedInputByteBufferNano.readMessage(this.f9571b);
            }
        }
    }

    public static C1103x8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1103x8().mergeFrom(codedInputByteBufferNano);
    }

    public static C1103x8 a(byte[] bArr) {
        return (C1103x8) MessageNano.mergeFrom(new C1103x8(), bArr);
    }
}
