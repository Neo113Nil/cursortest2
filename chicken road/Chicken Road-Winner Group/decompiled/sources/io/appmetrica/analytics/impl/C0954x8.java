package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.x8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0954x8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0954x8[] f8610c;

    /* renamed from: a, reason: collision with root package name */
    public C0850t8 f8611a;

    /* renamed from: b, reason: collision with root package name */
    public C0928w8 f8612b;

    public C0954x8() {
        a();
    }

    public static C0954x8[] b() {
        if (f8610c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8610c == null) {
                        f8610c = new C0954x8[0];
                    }
                } finally {
                }
            }
        }
        return f8610c;
    }

    public final C0954x8 a() {
        this.f8611a = null;
        this.f8612b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0850t8 c0850t8 = this.f8611a;
        if (c0850t8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0850t8);
        }
        C0928w8 c0928w8 = this.f8612b;
        return c0928w8 != null ? CodedOutputByteBufferNano.computeMessageSize(2, c0928w8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0850t8 c0850t8 = this.f8611a;
        if (c0850t8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0850t8);
        }
        C0928w8 c0928w8 = this.f8612b;
        if (c0928w8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0928w8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0954x8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f8611a == null) {
                    this.f8611a = new C0850t8();
                }
                codedInputByteBufferNano.readMessage(this.f8611a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f8612b == null) {
                    this.f8612b = new C0928w8();
                }
                codedInputByteBufferNano.readMessage(this.f8612b);
            }
        }
        return this;
    }

    public static C0954x8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0954x8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0954x8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0954x8) MessageNano.mergeFrom(new C0954x8(), bArr);
    }
}
