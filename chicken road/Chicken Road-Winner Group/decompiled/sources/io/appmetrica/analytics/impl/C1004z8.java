package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.z8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1004z8 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C1004z8[] f8663b;

    /* renamed from: a, reason: collision with root package name */
    public C0928w8 f8664a;

    public C1004z8() {
        a();
    }

    public static C1004z8[] b() {
        if (f8663b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8663b == null) {
                        f8663b = new C1004z8[0];
                    }
                } finally {
                }
            }
        }
        return f8663b;
    }

    public final C1004z8 a() {
        this.f8664a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0928w8 c0928w8 = this.f8664a;
        return c0928w8 != null ? CodedOutputByteBufferNano.computeMessageSize(1, c0928w8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0928w8 c0928w8 = this.f8664a;
        if (c0928w8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0928w8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1004z8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                if (this.f8664a == null) {
                    this.f8664a = new C0928w8();
                }
                codedInputByteBufferNano.readMessage(this.f8664a);
            }
        }
        return this;
    }

    public static C1004z8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C1004z8().mergeFrom(codedInputByteBufferNano);
    }

    public static C1004z8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C1004z8) MessageNano.mergeFrom(new C1004z8(), bArr);
    }
}
