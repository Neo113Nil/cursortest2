package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.b6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0532b6 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0532b6[] f7912c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f7913a;

    /* renamed from: b, reason: collision with root package name */
    public C0635f6 f7914b;

    public C0532b6() {
        a();
    }

    public static C0532b6[] b() {
        if (f7912c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7912c == null) {
                        f7912c = new C0532b6[0];
                    }
                } finally {
                }
            }
        }
        return f7912c;
    }

    public final C0532b6 a() {
        this.f7913a = WireFormatNano.EMPTY_BYTES;
        this.f7914b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f7913a, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f7913a);
        }
        C0635f6 c0635f6 = this.f7914b;
        return c0635f6 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c0635f6) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!Arrays.equals(this.f7913a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f7913a);
        }
        C0635f6 c0635f6 = this.f7914b;
        if (c0635f6 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0635f6);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0532b6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f7913a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f7914b == null) {
                    this.f7914b = new C0635f6();
                }
                codedInputByteBufferNano.readMessage(this.f7914b);
            }
        }
    }

    public static C0532b6 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0532b6().mergeFrom(codedInputByteBufferNano);
    }

    public static C0532b6 a(byte[] bArr) {
        return (C0532b6) MessageNano.mergeFrom(new C0532b6(), bArr);
    }
}
