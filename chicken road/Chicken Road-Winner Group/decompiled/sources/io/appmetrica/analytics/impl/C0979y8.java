package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.y8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0979y8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0979y8[] f8634c;

    /* renamed from: a, reason: collision with root package name */
    public C0850t8 f8635a;

    /* renamed from: b, reason: collision with root package name */
    public C0902v8 f8636b;

    public C0979y8() {
        a();
    }

    public static C0979y8[] b() {
        if (f8634c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8634c == null) {
                        f8634c = new C0979y8[0];
                    }
                } finally {
                }
            }
        }
        return f8634c;
    }

    public final C0979y8 a() {
        this.f8635a = null;
        this.f8636b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0850t8 c0850t8 = this.f8635a;
        if (c0850t8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0850t8);
        }
        C0902v8 c0902v8 = this.f8636b;
        return c0902v8 != null ? CodedOutputByteBufferNano.computeMessageSize(2, c0902v8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0850t8 c0850t8 = this.f8635a;
        if (c0850t8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0850t8);
        }
        C0902v8 c0902v8 = this.f8636b;
        if (c0902v8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0902v8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0979y8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f8635a == null) {
                    this.f8635a = new C0850t8();
                }
                codedInputByteBufferNano.readMessage(this.f8635a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f8636b == null) {
                    this.f8636b = new C0902v8();
                }
                codedInputByteBufferNano.readMessage(this.f8636b);
            }
        }
        return this;
    }

    public static C0979y8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0979y8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0979y8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0979y8) MessageNano.mergeFrom(new C0979y8(), bArr);
    }
}
