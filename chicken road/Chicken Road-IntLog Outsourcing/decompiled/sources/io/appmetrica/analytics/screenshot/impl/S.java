package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* loaded from: classes.dex */
public final class S extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile S[] f9988c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f9989a;

    /* renamed from: b, reason: collision with root package name */
    public Q f9990b;

    public S() {
        a();
    }

    public static S[] b() {
        if (f9988c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9988c == null) {
                        f9988c = new S[0];
                    }
                } finally {
                }
            }
        }
        return f9988c;
    }

    public final S a() {
        this.f9989a = true;
        this.f9990b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        boolean z = this.f9989a;
        if (!z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z);
        }
        Q q5 = this.f9990b;
        return q5 != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, q5) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        boolean z = this.f9989a;
        if (!z) {
            codedOutputByteBufferNano.writeBool(1, z);
        }
        Q q5 = this.f9990b;
        if (q5 != null) {
            codedOutputByteBufferNano.writeMessage(2, q5);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f9989a = codedInputByteBufferNano.readBool();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f9990b == null) {
                    this.f9990b = new Q();
                }
                codedInputByteBufferNano.readMessage(this.f9990b);
            }
        }
    }

    public static S b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new S().mergeFrom(codedInputByteBufferNano);
    }

    public static S a(byte[] bArr) {
        return (S) MessageNano.mergeFrom(new S(), bArr);
    }
}
