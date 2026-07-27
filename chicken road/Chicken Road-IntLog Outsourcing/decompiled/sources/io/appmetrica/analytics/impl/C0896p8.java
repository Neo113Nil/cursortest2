package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.p8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0896p8 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0896p8[] f8994b;

    /* renamed from: a, reason: collision with root package name */
    public C0844n8 f8995a;

    public C0896p8() {
        a();
    }

    public static C0896p8[] b() {
        if (f8994b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8994b == null) {
                        f8994b = new C0896p8[0];
                    }
                } finally {
                }
            }
        }
        return f8994b;
    }

    public final C0896p8 a() {
        this.f8995a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0844n8 c0844n8 = this.f8995a;
        return c0844n8 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(1, c0844n8) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        C0844n8 c0844n8 = this.f8995a;
        if (c0844n8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0844n8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0896p8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f8995a == null) {
                    this.f8995a = new C0844n8();
                }
                codedInputByteBufferNano.readMessage(this.f8995a);
            }
        }
    }

    public static C0896p8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0896p8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0896p8 a(byte[] bArr) {
        return (C0896p8) MessageNano.mergeFrom(new C0896p8(), bArr);
    }
}
