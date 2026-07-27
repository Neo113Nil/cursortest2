package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.b6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0383b6 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0383b6[] f7028c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f7029a;

    /* renamed from: b, reason: collision with root package name */
    public C0486f6 f7030b;

    public C0383b6() {
        a();
    }

    public static C0383b6[] b() {
        if (f7028c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7028c == null) {
                        f7028c = new C0383b6[0];
                    }
                } finally {
                }
            }
        }
        return f7028c;
    }

    public final C0383b6 a() {
        this.f7029a = WireFormatNano.EMPTY_BYTES;
        this.f7030b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f7029a, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f7029a);
        }
        C0486f6 c0486f6 = this.f7030b;
        return c0486f6 != null ? CodedOutputByteBufferNano.computeMessageSize(2, c0486f6) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f7029a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f7029a);
        }
        C0486f6 c0486f6 = this.f7030b;
        if (c0486f6 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0486f6);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0383b6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f7029a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f7030b == null) {
                    this.f7030b = new C0486f6();
                }
                codedInputByteBufferNano.readMessage(this.f7030b);
            }
        }
        return this;
    }

    public static C0383b6 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0383b6().mergeFrom(codedInputByteBufferNano);
    }

    public static C0383b6 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0383b6) MessageNano.mergeFrom(new C0383b6(), bArr);
    }
}
