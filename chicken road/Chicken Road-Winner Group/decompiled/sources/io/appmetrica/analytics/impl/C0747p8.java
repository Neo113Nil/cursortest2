package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.p8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0747p8 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0747p8[] f8058b;

    /* renamed from: a, reason: collision with root package name */
    public C0695n8 f8059a;

    public C0747p8() {
        a();
    }

    public static C0747p8[] b() {
        if (f8058b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8058b == null) {
                        f8058b = new C0747p8[0];
                    }
                } finally {
                }
            }
        }
        return f8058b;
    }

    public final C0747p8 a() {
        this.f8059a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0695n8 c0695n8 = this.f8059a;
        return c0695n8 != null ? CodedOutputByteBufferNano.computeMessageSize(1, c0695n8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0695n8 c0695n8 = this.f8059a;
        if (c0695n8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0695n8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0747p8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f8059a == null) {
                    this.f8059a = new C0695n8();
                }
                codedInputByteBufferNano.readMessage(this.f8059a);
            }
        }
        return this;
    }

    public static C0747p8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0747p8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0747p8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0747p8) MessageNano.mergeFrom(new C0747p8(), bArr);
    }
}
