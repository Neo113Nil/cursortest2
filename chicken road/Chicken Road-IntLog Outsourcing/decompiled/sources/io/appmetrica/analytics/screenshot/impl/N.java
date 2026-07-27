package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class N extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile N[] f9975b;

    /* renamed from: a, reason: collision with root package name */
    public boolean f9976a;

    public N() {
        a();
    }

    public static N[] b() {
        if (f9975b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9975b == null) {
                        f9975b = new N[0];
                    }
                } finally {
                }
            }
        }
        return f9975b;
    }

    public final N a() {
        this.f9976a = true;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z = this.f9976a;
        return !z ? computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(1, z) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        boolean z = this.f9976a;
        if (!z) {
            codedOutputByteBufferNano.writeBool(1, z);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final N mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f9976a = codedInputByteBufferNano.readBool();
            }
        }
    }

    public static N a(byte[] bArr) {
        return (N) MessageNano.mergeFrom(new N(), bArr);
    }

    public static N b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new N().mergeFrom(codedInputByteBufferNano);
    }
}
