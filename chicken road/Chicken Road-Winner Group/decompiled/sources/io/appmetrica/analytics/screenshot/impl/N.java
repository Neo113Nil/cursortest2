package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* loaded from: classes.dex */
public final class N extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile N[] f8994b;

    /* renamed from: a, reason: collision with root package name */
    public boolean f8995a;

    public N() {
        a();
    }

    public static N[] b() {
        if (f8994b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8994b == null) {
                        f8994b = new N[0];
                    }
                } finally {
                }
            }
        }
        return f8994b;
    }

    public final N a() {
        this.f8995a = true;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z3 = this.f8995a;
        return !z3 ? CodedOutputByteBufferNano.computeBoolSize(1, z3) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z3 = this.f8995a;
        if (!z3) {
            codedOutputByteBufferNano.writeBool(1, z3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final N mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f8995a = codedInputByteBufferNano.readBool();
            }
        }
        return this;
    }

    public static N a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (N) MessageNano.mergeFrom(new N(), bArr);
    }

    public static N b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new N().mergeFrom(codedInputByteBufferNano);
    }
}
